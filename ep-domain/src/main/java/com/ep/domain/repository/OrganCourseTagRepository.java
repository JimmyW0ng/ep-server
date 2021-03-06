package com.ep.domain.repository;

import com.ep.domain.constant.BizConstant;
import com.ep.domain.pojo.bo.OrganCourseTagBo;
import com.ep.domain.pojo.po.EpOrganCourseTagPo;
import com.ep.domain.repository.domain.tables.records.EpOrganCourseTagRecord;
import com.google.common.collect.Lists;
import org.jooq.DSLContext;
import org.jooq.Field;
import org.jooq.impl.DSL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

import static com.ep.domain.repository.domain.Tables.EP_CONSTANT_TAG;
import static com.ep.domain.repository.domain.Tables.EP_ORGAN_COURSE_TAG;


/**
 * @Description: 课程标签表Repository
 * @Author: CC.F
 * @Date: 16:28 2018/2/12
 */
@Repository
public class OrganCourseTagRepository extends AbstractCRUDRepository<EpOrganCourseTagRecord, Long, EpOrganCourseTagPo> {

    @Autowired
    public OrganCourseTagRepository(DSLContext dslContext) {
        super(dslContext, EP_ORGAN_COURSE_TAG, EP_ORGAN_COURSE_TAG.ID, EpOrganCourseTagPo.class);
    }

    /**
     * 根据课程id获取课程标签
     *
     * @param courseId
     * @return
     */
    public List<OrganCourseTagBo> findBosByCourseId(Long courseId) {
        List<Field<?>> fieldList = Lists.newArrayList(EP_ORGAN_COURSE_TAG.fields());
        fieldList.add(EP_CONSTANT_TAG.TAG_NAME);
        fieldList.add(EP_CONSTANT_TAG.OGN_FLAG);
        return dslContext.select(fieldList).from(EP_ORGAN_COURSE_TAG)
                .innerJoin(EP_CONSTANT_TAG)
                .on(EP_ORGAN_COURSE_TAG.TAG_ID.eq(EP_CONSTANT_TAG.ID))
                .and(EP_CONSTANT_TAG.DEL_FLAG.eq(false))
                .where(EP_ORGAN_COURSE_TAG.COURSE_ID.eq(courseId))
                .and(EP_ORGAN_COURSE_TAG.DEL_FLAG.eq(false))
                .fetchInto(OrganCourseTagBo.class);
    }

    /**
     * 根据课程id获取课程标签Po
     *
     * @param courseId
     * @return
     */
    public List<EpOrganCourseTagPo> findPosByCourseId(Long courseId) {
        return dslContext.selectFrom(EP_ORGAN_COURSE_TAG)
                .where(EP_ORGAN_COURSE_TAG.COURSE_ID.eq(courseId))
                .and(EP_ORGAN_COURSE_TAG.DEL_FLAG.eq(false))
                .fetchInto(EpOrganCourseTagPo.class);
    }

    public void deleteByTagIdsAndCourseId(List<Long> tagId, Long courseId) {
        dslContext.update(EP_ORGAN_COURSE_TAG)
                .set(EP_ORGAN_COURSE_TAG.DEL_FLAG, true)
                .where(EP_ORGAN_COURSE_TAG.TAG_ID.in(tagId))
                .and(EP_ORGAN_COURSE_TAG.COURSE_ID.eq(courseId))
                .execute();
    }

    /**
     * 根据课程courseId批量物理删除
     *
     * @param courseId
     */
    public void deletePhysicByCourseId(Long courseId) {
        dslContext.delete(EP_ORGAN_COURSE_TAG)
                .where(EP_ORGAN_COURSE_TAG.COURSE_ID.eq(courseId))
                .execute();
    }

    /**
     * 查询是否有未设置的标签id
     *
     * @param courseId
     * @param tagIds
     * @return
     */
    public boolean existOtherTag(Long courseId, Set<Long> tagIds) {
        int count = dslContext.select(DSL.count(EP_CONSTANT_TAG.ID))
                .from(EP_CONSTANT_TAG)
                .leftJoin(EP_ORGAN_COURSE_TAG)
                .on(EP_CONSTANT_TAG.ID.eq(EP_ORGAN_COURSE_TAG.TAG_ID))
                .and(EP_ORGAN_COURSE_TAG.COURSE_ID.eq(courseId))
                .where(EP_CONSTANT_TAG.ID.in(tagIds))
                .and(EP_ORGAN_COURSE_TAG.ID.isNull())
                .and(EP_CONSTANT_TAG.DEL_FLAG.eq(false))
                .fetchOneInto(Integer.class);
        return count > BizConstant.DB_NUM_ZERO;
    }

    /**
     * 根据课程id逻辑删除
     *
     * @param courseId
     */
    public void deleteLogicByCourseId(Long courseId) {
        dslContext.update(EP_ORGAN_COURSE_TAG)
                .set(EP_ORGAN_COURSE_TAG.DEL_FLAG, true)
                .where(EP_ORGAN_COURSE_TAG.COURSE_ID.eq(courseId))
                .and(EP_ORGAN_COURSE_TAG.DEL_FLAG.eq(false))
                .execute();
    }

    /**
     * 标签是否正在被使用
     *
     * @param constantTagId
     * @return
     */
    public boolean constantTagIsUesd(Long constantTagId) {
        return dslContext.selectCount().from(EP_ORGAN_COURSE_TAG)
                .where(EP_ORGAN_COURSE_TAG.TAG_ID.eq(constantTagId))
                .and(EP_ORGAN_COURSE_TAG.DEL_FLAG.eq(false))
                .fetchOneInto(Long.class) > BizConstant.DB_NUM_ZERO;
    }
}
