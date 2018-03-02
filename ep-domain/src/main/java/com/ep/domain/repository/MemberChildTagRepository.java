package com.ep.domain.repository;

import com.ep.domain.constant.BizConstant;
import com.ep.domain.pojo.bo.MemberChildTagBo;
import com.ep.domain.pojo.po.EpMemberChildTagPo;
import com.ep.domain.repository.domain.tables.records.EpMemberChildTagRecord;
import com.google.common.collect.Lists;
import org.jooq.DSLContext;
import org.jooq.Field;
import org.jooq.impl.DSL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.ep.domain.repository.domain.Tables.EP_CONSTANT_TAG;
import static com.ep.domain.repository.domain.Tables.EP_MEMBER_CHILD_TAG;

/**
 * @Description: 孩子标签记录表Repository
 * @Author J.W
 * @Date: 下午 5:17 2018/2/22 0022
 */
@Repository
public class MemberChildTagRepository extends AbstractCRUDRepository<EpMemberChildTagRecord, Long, EpMemberChildTagPo> {

    @Autowired
    public MemberChildTagRepository(DSLContext dslContext) {
        super(dslContext, EP_MEMBER_CHILD_TAG, EP_MEMBER_CHILD_TAG.ID, EpMemberChildTagPo.class);
    }

    /**
     * 根据孩子和获取课时标签
     *
     * @param childId
     * @param classCatalogId
     * @return
     */
    public List<EpMemberChildTagPo> findByChildIdAndClassCatalogId(Long childId, Long classCatalogId) {
        return dslContext.selectFrom(EP_MEMBER_CHILD_TAG)
                .where(EP_MEMBER_CHILD_TAG.CLASS_CATALOG_ID.eq(classCatalogId))
                .and(EP_MEMBER_CHILD_TAG.CHILD_ID.eq(childId))
                .and(EP_MEMBER_CHILD_TAG.DEL_FLAG.eq(false))
                .fetchInto(EpMemberChildTagPo.class);
    }

    /**
     * 根据孩子和判断是否存在课时标签
     *
     * @param childId
     * @param classCatalogId
     * @return
     */
    public boolean existByChildIdAndClassCatalogId(Long childId, Long classCatalogId) {
        int count = dslContext.selectCount().from(EP_MEMBER_CHILD_TAG)
                .where(EP_MEMBER_CHILD_TAG.CLASS_CATALOG_ID.eq(classCatalogId))
                .and(EP_MEMBER_CHILD_TAG.CHILD_ID.eq(childId))
                .and(EP_MEMBER_CHILD_TAG.DEL_FLAG.eq(false))
                .fetchOneInto(Integer.class);
        return count > BizConstant.DB_NUM_ZERO;
    }

    /**
     * 以孩子获取分组获取孩子的标签数
     *
     * @param childId
     * @return
     */
    public List<MemberChildTagBo> findTagsByChildId(Long childId) {
        List<Field<?>> fieldList = Lists.newArrayList(EP_MEMBER_CHILD_TAG.TAG_ID);
        fieldList.add(DSL.count(EP_MEMBER_CHILD_TAG.ID).as("num"));
        fieldList.add(EP_CONSTANT_TAG.TAG_NAME);
        return dslContext.select(fieldList)
                .from(EP_MEMBER_CHILD_TAG)
                .innerJoin(EP_CONSTANT_TAG)
                .on(EP_MEMBER_CHILD_TAG.TAG_ID.eq(EP_CONSTANT_TAG.ID))
                .and(EP_CONSTANT_TAG.DEL_FLAG.eq(false))
                .where(EP_MEMBER_CHILD_TAG.CHILD_ID.eq(childId))
                .and(EP_MEMBER_CHILD_TAG.DEL_FLAG.eq(false))
                .groupBy(EP_MEMBER_CHILD_TAG.TAG_ID)
                .orderBy(DSL.max(EP_MEMBER_CHILD_TAG.CREATE_AT).desc())
                .fetchInto(MemberChildTagBo.class);
    }

    /**
     * 以孩子班次分组获取孩子的标签数
     *
     * @param childId
     * @param classId
     * @return
     */
    public List<MemberChildTagBo> findTagsByChildIdAndClassId(Long childId, Long classId) {
        List<Field<?>> fieldList = Lists.newArrayList(EP_MEMBER_CHILD_TAG.TAG_ID);
        fieldList.add(DSL.count(EP_MEMBER_CHILD_TAG.ID).as("num"));
        fieldList.add(EP_CONSTANT_TAG.TAG_NAME);
        return dslContext.select(fieldList)
                .from(EP_MEMBER_CHILD_TAG)
                .innerJoin(EP_CONSTANT_TAG)
                .on(EP_MEMBER_CHILD_TAG.TAG_ID.eq(EP_CONSTANT_TAG.ID))
                .and(EP_CONSTANT_TAG.DEL_FLAG.eq(false))
                .where(EP_MEMBER_CHILD_TAG.CHILD_ID.eq(childId))
                .and(EP_MEMBER_CHILD_TAG.CLASS_ID.eq(classId))
                .and(EP_MEMBER_CHILD_TAG.DEL_FLAG.eq(false))
                .groupBy(EP_MEMBER_CHILD_TAG.TAG_ID)
                .orderBy(DSL.max(EP_MEMBER_CHILD_TAG.CREATE_AT).desc())
                .fetchInto(MemberChildTagBo.class);
    }

    /**
     * 根据孩子childId和班次目录ClassCatalogId获取孩子的标签
     *
     * @param childId
     * @param classCatalogId
     * @return
     */
    public List<MemberChildTagBo> findBosByChildIdAndClassCatalogId(Long childId, Long classCatalogId) {
        List<Field<?>> fieldList = Lists.newArrayList(EP_MEMBER_CHILD_TAG.TAG_ID);
        fieldList.add(EP_CONSTANT_TAG.ID);
        fieldList.add(EP_CONSTANT_TAG.TAG_NAME);
        return dslContext.select(fieldList)
                .from(EP_MEMBER_CHILD_TAG)
                .innerJoin(EP_CONSTANT_TAG)
                .on(EP_MEMBER_CHILD_TAG.TAG_ID.eq(EP_CONSTANT_TAG.ID))
                .and(EP_CONSTANT_TAG.DEL_FLAG.eq(false))
                .where(EP_MEMBER_CHILD_TAG.CHILD_ID.eq(childId))
                .and(EP_MEMBER_CHILD_TAG.CLASS_CATALOG_ID.eq(classCatalogId))
                .and(EP_MEMBER_CHILD_TAG.DEL_FLAG.eq(false))
                .groupBy(EP_MEMBER_CHILD_TAG.TAG_ID)
                .orderBy(DSL.max(EP_MEMBER_CHILD_TAG.CREATE_AT).desc())
                .fetchInto(MemberChildTagBo.class);
    }

    /**
     * 根据id逻辑删除孩子标签记录
     *
     * @param id
     */
    public void deleteLogicChildTagById(Long id) {
        dslContext.update(EP_MEMBER_CHILD_TAG)
                .set(EP_MEMBER_CHILD_TAG.DEL_FLAG, true)
                .where(EP_MEMBER_CHILD_TAG.ID.eq(id))
                .execute();
    }

    /**
     * 根据孩子childId和课程目录classCatalogId物理删除孩子标签
     * @param childId
     * @param classCatalogId
     */
    public void deletePhysicByChildIdAndClassCatalogId(Long childId, Long classCatalogId) {
        dslContext.delete(EP_MEMBER_CHILD_TAG)
                .where(EP_MEMBER_CHILD_TAG.CHILD_ID.eq(childId))
                .and(EP_MEMBER_CHILD_TAG.CLASS_CATALOG_ID.eq(classCatalogId))
                .execute();
    }
}
