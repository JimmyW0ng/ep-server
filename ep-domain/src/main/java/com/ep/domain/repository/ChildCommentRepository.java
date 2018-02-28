package com.ep.domain.repository;

import com.ep.domain.constant.BizConstant;
import com.ep.domain.pojo.bo.MemberChildCommentBo;
import com.ep.domain.pojo.bo.OrderBo;
import com.ep.domain.pojo.po.EpMemberChildCommentPo;
import com.ep.domain.repository.domain.tables.records.EpMemberChildCommentRecord;
import com.google.common.collect.Lists;
import org.jooq.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

import static com.ep.domain.repository.domain.Tables.*;
import static com.ep.domain.repository.domain.Tables.EP_ORGAN_CLASS;
import static com.ep.domain.repository.domain.tables.EpMemberChildComment.EP_MEMBER_CHILD_COMMENT;

/**
 * @Author:FeiCongcong
 * @Date:2018/2/27/027 16:04
 */
@Repository
public class ChildCommentRepository extends AbstractCRUDRepository<EpMemberChildCommentRecord, Long, EpMemberChildCommentPo> {

    @Autowired
    public ChildCommentRepository(DSLContext dslContext) {
        super(dslContext, EP_MEMBER_CHILD_COMMENT, EP_MEMBER_CHILD_COMMENT.ID, EpMemberChildCommentPo.class);
    }

    /**
     * 商户后台获取分页
     * @param pageable
     * @param condition
     * @return
     */
    public Page<MemberChildCommentBo> findbyPageAndCondition(Pageable pageable, Collection<? extends Condition> condition){
        long totalCount = dslContext.selectCount()
                .from(EP_MEMBER_CHILD_COMMENT)
                .leftJoin(EP_MEMBER_CHILD).on(EP_MEMBER_CHILD.ID.eq(EP_MEMBER_CHILD_COMMENT.CHILD_ID))
                .leftJoin(EP_ORGAN_COURSE).on(EP_ORGAN_COURSE.ID.eq(EP_MEMBER_CHILD_COMMENT.COURSE_ID))
                .leftJoin(EP_ORGAN_CLASS).on(EP_ORGAN_CLASS.ID.eq(EP_MEMBER_CHILD_COMMENT.CLASS_ID))
                .where(condition).fetchOne(0, Long.class);
        if (totalCount == BizConstant.DB_NUM_ZERO) {
            return new PageImpl<>(Lists.newArrayList(), pageable, totalCount);
        }
        List<Field<?>> fieldList = Lists.newArrayList(EP_MEMBER_CHILD_COMMENT.fields());
        fieldList.add(EP_MEMBER_CHILD.CHILD_TRUE_NAME);
        fieldList.add(EP_ORGAN_COURSE.COURSE_NAME);
        fieldList.add(EP_ORGAN_CLASS.CLASS_NAME);

        SelectConditionStep<Record> record = dslContext.select(fieldList)
                .from(EP_MEMBER_CHILD_COMMENT)
                .leftJoin(EP_MEMBER_CHILD).on(EP_MEMBER_CHILD.ID.eq(EP_MEMBER_CHILD_COMMENT.CHILD_ID))
                .leftJoin(EP_ORGAN_COURSE).on(EP_ORGAN_COURSE.ID.eq(EP_MEMBER_CHILD_COMMENT.COURSE_ID))
                .leftJoin(EP_ORGAN_CLASS).on(EP_ORGAN_CLASS.ID.eq(EP_MEMBER_CHILD_COMMENT.CLASS_ID))
                .where(condition);

        List<MemberChildCommentBo> list = record.orderBy(EP_ORGAN_COURSE.ID.desc(),EP_ORGAN_CLASS.ID.desc())
                .limit(pageable.getPageSize())
                .offset(pageable.getOffset())
                .fetchInto(MemberChildCommentBo.class);
        PageImpl<MemberChildCommentBo> pPage = new PageImpl<MemberChildCommentBo>(list, pageable, totalCount);
        return pPage;
    }
}