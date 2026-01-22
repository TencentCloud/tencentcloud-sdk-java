/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeQAResponse extends AbstractModel {

    /**
    * QA业务ID

    */
    @SerializedName("QaBizId")
    @Expose
    private String QaBizId;

    /**
    * 问题

    */
    @SerializedName("Question")
    @Expose
    private String Question;

    /**
    * 答案

    */
    @SerializedName("Answer")
    @Expose
    private String Answer;

    /**
    * 自定义参数
    */
    @SerializedName("CustomParam")
    @Expose
    private String CustomParam;

    /**
    * 来源 1-文档生成问答对  2-批量导入问答对  3-单条手动录入问答对
    */
    @SerializedName("Source")
    @Expose
    private Long Source;

    /**
    * 来源描述

    */
    @SerializedName("SourceDesc")
    @Expose
    private String SourceDesc;

    /**
    * 更新时间

    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 状态 <br>1-未校验  2,4-导入完成  5-发布失败 6-不采纳 7-审核中  8-审核失败  9-审核失败申诉后人工审核中  11-审核失败申诉后人工审核不通过  12-已过期  13-超量失效  14-超量失效恢复 19-学习中  20-学习失败
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 状态描述

    */
    @SerializedName("StatusDesc")
    @Expose
    private String StatusDesc;

    /**
    * 分类ID

    */
    @SerializedName("CateBizId")
    @Expose
    private String CateBizId;

    /**
    * 是否允许校验

    */
    @SerializedName("IsAllowAccept")
    @Expose
    private Boolean IsAllowAccept;

    /**
    * 是否允许删除

    */
    @SerializedName("IsAllowDelete")
    @Expose
    private Boolean IsAllowDelete;

    /**
    * 是否允许编辑

    */
    @SerializedName("IsAllowEdit")
    @Expose
    private Boolean IsAllowEdit;

    /**
    * 文档id

    */
    @SerializedName("DocBizId")
    @Expose
    private String DocBizId;

    /**
    * 文档名称

    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * 文档类型

    */
    @SerializedName("FileType")
    @Expose
    private String FileType;

    /**
    * 分片ID

    */
    @SerializedName("SegmentBizId")
    @Expose
    private String SegmentBizId;

    /**
    * 分片内容
    */
    @SerializedName("PageContent")
    @Expose
    private String PageContent;

    /**
    * 分片高亮内容
    */
    @SerializedName("Highlights")
    @Expose
    private Highlight [] Highlights;

    /**
    * 分片内容

    */
    @SerializedName("OrgData")
    @Expose
    private String OrgData;

    /**
    * 标签适用范围
    */
    @SerializedName("AttrRange")
    @Expose
    private Long AttrRange;

    /**
    * 标签
    */
    @SerializedName("AttrLabels")
    @Expose
    private AttrLabel [] AttrLabels;

    /**
    * 有效开始时间，unix时间戳
    */
    @SerializedName("ExpireStart")
    @Expose
    private String ExpireStart;

    /**
    * 有效结束时间，unix时间戳，0代表永久有效
    */
    @SerializedName("ExpireEnd")
    @Expose
    private String ExpireEnd;

    /**
    * 相似问列表信息
    */
    @SerializedName("SimilarQuestions")
    @Expose
    private SimilarQuestion [] SimilarQuestions;

    /**
    * 问题和答案文本审核状态 1审核失败
    */
    @SerializedName("QaAuditStatus")
    @Expose
    private Long QaAuditStatus;

    /**
    * 答案中的图片审核状态 1审核失败
    */
    @SerializedName("PicAuditStatus")
    @Expose
    private Long PicAuditStatus;

    /**
    * 答案中的视频审核状态 1审核失败
    */
    @SerializedName("VideoAuditStatus")
    @Expose
    private Long VideoAuditStatus;

    /**
    * 问题描述
    */
    @SerializedName("QuestionDesc")
    @Expose
    private String QuestionDesc;

    /**
    * 问答是否停用，false:未停用，true已停用
    */
    @SerializedName("IsDisabled")
    @Expose
    private Boolean IsDisabled;

    /**
    * 从根节点开始的路径分类ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CateBizIdPath")
    @Expose
    private String [] CateBizIdPath;

    /**
    * 从根节点开始的路径分类名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CateNamePath")
    @Expose
    private String [] CateNamePath;

    /**
    * 问答生效域: 1-不生效；2-仅开发域生效；3-仅发布域生效；4-开发域和发布域均生效
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EnableScope")
    @Expose
    private Long EnableScope;

    /**
    * 问答关联的文档生效域:1-不生效；2-仅开发域生效；3-仅发布域生效；4-开发域和发布域均生效.
若问答未关联文档，则该字段值同问答生效域
    */
    @SerializedName("DocEnableScope")
    @Expose
    private Long DocEnableScope;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get QA业务ID
 
     * @return QaBizId QA业务ID

     */
    public String getQaBizId() {
        return this.QaBizId;
    }

    /**
     * Set QA业务ID

     * @param QaBizId QA业务ID

     */
    public void setQaBizId(String QaBizId) {
        this.QaBizId = QaBizId;
    }

    /**
     * Get 问题
 
     * @return Question 问题

     */
    public String getQuestion() {
        return this.Question;
    }

    /**
     * Set 问题

     * @param Question 问题

     */
    public void setQuestion(String Question) {
        this.Question = Question;
    }

    /**
     * Get 答案
 
     * @return Answer 答案

     */
    public String getAnswer() {
        return this.Answer;
    }

    /**
     * Set 答案

     * @param Answer 答案

     */
    public void setAnswer(String Answer) {
        this.Answer = Answer;
    }

    /**
     * Get 自定义参数 
     * @return CustomParam 自定义参数
     */
    public String getCustomParam() {
        return this.CustomParam;
    }

    /**
     * Set 自定义参数
     * @param CustomParam 自定义参数
     */
    public void setCustomParam(String CustomParam) {
        this.CustomParam = CustomParam;
    }

    /**
     * Get 来源 1-文档生成问答对  2-批量导入问答对  3-单条手动录入问答对 
     * @return Source 来源 1-文档生成问答对  2-批量导入问答对  3-单条手动录入问答对
     */
    public Long getSource() {
        return this.Source;
    }

    /**
     * Set 来源 1-文档生成问答对  2-批量导入问答对  3-单条手动录入问答对
     * @param Source 来源 1-文档生成问答对  2-批量导入问答对  3-单条手动录入问答对
     */
    public void setSource(Long Source) {
        this.Source = Source;
    }

    /**
     * Get 来源描述
 
     * @return SourceDesc 来源描述

     */
    public String getSourceDesc() {
        return this.SourceDesc;
    }

    /**
     * Set 来源描述

     * @param SourceDesc 来源描述

     */
    public void setSourceDesc(String SourceDesc) {
        this.SourceDesc = SourceDesc;
    }

    /**
     * Get 更新时间
 
     * @return UpdateTime 更新时间

     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间

     * @param UpdateTime 更新时间

     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 状态 <br>1-未校验  2,4-导入完成  5-发布失败 6-不采纳 7-审核中  8-审核失败  9-审核失败申诉后人工审核中  11-审核失败申诉后人工审核不通过  12-已过期  13-超量失效  14-超量失效恢复 19-学习中  20-学习失败 
     * @return Status 状态 <br>1-未校验  2,4-导入完成  5-发布失败 6-不采纳 7-审核中  8-审核失败  9-审核失败申诉后人工审核中  11-审核失败申诉后人工审核不通过  12-已过期  13-超量失效  14-超量失效恢复 19-学习中  20-学习失败
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 状态 <br>1-未校验  2,4-导入完成  5-发布失败 6-不采纳 7-审核中  8-审核失败  9-审核失败申诉后人工审核中  11-审核失败申诉后人工审核不通过  12-已过期  13-超量失效  14-超量失效恢复 19-学习中  20-学习失败
     * @param Status 状态 <br>1-未校验  2,4-导入完成  5-发布失败 6-不采纳 7-审核中  8-审核失败  9-审核失败申诉后人工审核中  11-审核失败申诉后人工审核不通过  12-已过期  13-超量失效  14-超量失效恢复 19-学习中  20-学习失败
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 状态描述
 
     * @return StatusDesc 状态描述

     */
    public String getStatusDesc() {
        return this.StatusDesc;
    }

    /**
     * Set 状态描述

     * @param StatusDesc 状态描述

     */
    public void setStatusDesc(String StatusDesc) {
        this.StatusDesc = StatusDesc;
    }

    /**
     * Get 分类ID
 
     * @return CateBizId 分类ID

     */
    public String getCateBizId() {
        return this.CateBizId;
    }

    /**
     * Set 分类ID

     * @param CateBizId 分类ID

     */
    public void setCateBizId(String CateBizId) {
        this.CateBizId = CateBizId;
    }

    /**
     * Get 是否允许校验
 
     * @return IsAllowAccept 是否允许校验

     */
    public Boolean getIsAllowAccept() {
        return this.IsAllowAccept;
    }

    /**
     * Set 是否允许校验

     * @param IsAllowAccept 是否允许校验

     */
    public void setIsAllowAccept(Boolean IsAllowAccept) {
        this.IsAllowAccept = IsAllowAccept;
    }

    /**
     * Get 是否允许删除
 
     * @return IsAllowDelete 是否允许删除

     */
    public Boolean getIsAllowDelete() {
        return this.IsAllowDelete;
    }

    /**
     * Set 是否允许删除

     * @param IsAllowDelete 是否允许删除

     */
    public void setIsAllowDelete(Boolean IsAllowDelete) {
        this.IsAllowDelete = IsAllowDelete;
    }

    /**
     * Get 是否允许编辑
 
     * @return IsAllowEdit 是否允许编辑

     */
    public Boolean getIsAllowEdit() {
        return this.IsAllowEdit;
    }

    /**
     * Set 是否允许编辑

     * @param IsAllowEdit 是否允许编辑

     */
    public void setIsAllowEdit(Boolean IsAllowEdit) {
        this.IsAllowEdit = IsAllowEdit;
    }

    /**
     * Get 文档id
 
     * @return DocBizId 文档id

     */
    public String getDocBizId() {
        return this.DocBizId;
    }

    /**
     * Set 文档id

     * @param DocBizId 文档id

     */
    public void setDocBizId(String DocBizId) {
        this.DocBizId = DocBizId;
    }

    /**
     * Get 文档名称
 
     * @return FileName 文档名称

     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set 文档名称

     * @param FileName 文档名称

     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get 文档类型
 
     * @return FileType 文档类型

     */
    public String getFileType() {
        return this.FileType;
    }

    /**
     * Set 文档类型

     * @param FileType 文档类型

     */
    public void setFileType(String FileType) {
        this.FileType = FileType;
    }

    /**
     * Get 分片ID
 
     * @return SegmentBizId 分片ID

     */
    public String getSegmentBizId() {
        return this.SegmentBizId;
    }

    /**
     * Set 分片ID

     * @param SegmentBizId 分片ID

     */
    public void setSegmentBizId(String SegmentBizId) {
        this.SegmentBizId = SegmentBizId;
    }

    /**
     * Get 分片内容 
     * @return PageContent 分片内容
     */
    public String getPageContent() {
        return this.PageContent;
    }

    /**
     * Set 分片内容
     * @param PageContent 分片内容
     */
    public void setPageContent(String PageContent) {
        this.PageContent = PageContent;
    }

    /**
     * Get 分片高亮内容 
     * @return Highlights 分片高亮内容
     */
    public Highlight [] getHighlights() {
        return this.Highlights;
    }

    /**
     * Set 分片高亮内容
     * @param Highlights 分片高亮内容
     */
    public void setHighlights(Highlight [] Highlights) {
        this.Highlights = Highlights;
    }

    /**
     * Get 分片内容
 
     * @return OrgData 分片内容

     */
    public String getOrgData() {
        return this.OrgData;
    }

    /**
     * Set 分片内容

     * @param OrgData 分片内容

     */
    public void setOrgData(String OrgData) {
        this.OrgData = OrgData;
    }

    /**
     * Get 标签适用范围 
     * @return AttrRange 标签适用范围
     */
    public Long getAttrRange() {
        return this.AttrRange;
    }

    /**
     * Set 标签适用范围
     * @param AttrRange 标签适用范围
     */
    public void setAttrRange(Long AttrRange) {
        this.AttrRange = AttrRange;
    }

    /**
     * Get 标签 
     * @return AttrLabels 标签
     */
    public AttrLabel [] getAttrLabels() {
        return this.AttrLabels;
    }

    /**
     * Set 标签
     * @param AttrLabels 标签
     */
    public void setAttrLabels(AttrLabel [] AttrLabels) {
        this.AttrLabels = AttrLabels;
    }

    /**
     * Get 有效开始时间，unix时间戳 
     * @return ExpireStart 有效开始时间，unix时间戳
     */
    public String getExpireStart() {
        return this.ExpireStart;
    }

    /**
     * Set 有效开始时间，unix时间戳
     * @param ExpireStart 有效开始时间，unix时间戳
     */
    public void setExpireStart(String ExpireStart) {
        this.ExpireStart = ExpireStart;
    }

    /**
     * Get 有效结束时间，unix时间戳，0代表永久有效 
     * @return ExpireEnd 有效结束时间，unix时间戳，0代表永久有效
     */
    public String getExpireEnd() {
        return this.ExpireEnd;
    }

    /**
     * Set 有效结束时间，unix时间戳，0代表永久有效
     * @param ExpireEnd 有效结束时间，unix时间戳，0代表永久有效
     */
    public void setExpireEnd(String ExpireEnd) {
        this.ExpireEnd = ExpireEnd;
    }

    /**
     * Get 相似问列表信息 
     * @return SimilarQuestions 相似问列表信息
     */
    public SimilarQuestion [] getSimilarQuestions() {
        return this.SimilarQuestions;
    }

    /**
     * Set 相似问列表信息
     * @param SimilarQuestions 相似问列表信息
     */
    public void setSimilarQuestions(SimilarQuestion [] SimilarQuestions) {
        this.SimilarQuestions = SimilarQuestions;
    }

    /**
     * Get 问题和答案文本审核状态 1审核失败 
     * @return QaAuditStatus 问题和答案文本审核状态 1审核失败
     */
    public Long getQaAuditStatus() {
        return this.QaAuditStatus;
    }

    /**
     * Set 问题和答案文本审核状态 1审核失败
     * @param QaAuditStatus 问题和答案文本审核状态 1审核失败
     */
    public void setQaAuditStatus(Long QaAuditStatus) {
        this.QaAuditStatus = QaAuditStatus;
    }

    /**
     * Get 答案中的图片审核状态 1审核失败 
     * @return PicAuditStatus 答案中的图片审核状态 1审核失败
     */
    public Long getPicAuditStatus() {
        return this.PicAuditStatus;
    }

    /**
     * Set 答案中的图片审核状态 1审核失败
     * @param PicAuditStatus 答案中的图片审核状态 1审核失败
     */
    public void setPicAuditStatus(Long PicAuditStatus) {
        this.PicAuditStatus = PicAuditStatus;
    }

    /**
     * Get 答案中的视频审核状态 1审核失败 
     * @return VideoAuditStatus 答案中的视频审核状态 1审核失败
     */
    public Long getVideoAuditStatus() {
        return this.VideoAuditStatus;
    }

    /**
     * Set 答案中的视频审核状态 1审核失败
     * @param VideoAuditStatus 答案中的视频审核状态 1审核失败
     */
    public void setVideoAuditStatus(Long VideoAuditStatus) {
        this.VideoAuditStatus = VideoAuditStatus;
    }

    /**
     * Get 问题描述 
     * @return QuestionDesc 问题描述
     */
    public String getQuestionDesc() {
        return this.QuestionDesc;
    }

    /**
     * Set 问题描述
     * @param QuestionDesc 问题描述
     */
    public void setQuestionDesc(String QuestionDesc) {
        this.QuestionDesc = QuestionDesc;
    }

    /**
     * Get 问答是否停用，false:未停用，true已停用 
     * @return IsDisabled 问答是否停用，false:未停用，true已停用
     */
    public Boolean getIsDisabled() {
        return this.IsDisabled;
    }

    /**
     * Set 问答是否停用，false:未停用，true已停用
     * @param IsDisabled 问答是否停用，false:未停用，true已停用
     */
    public void setIsDisabled(Boolean IsDisabled) {
        this.IsDisabled = IsDisabled;
    }

    /**
     * Get 从根节点开始的路径分类ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CateBizIdPath 从根节点开始的路径分类ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getCateBizIdPath() {
        return this.CateBizIdPath;
    }

    /**
     * Set 从根节点开始的路径分类ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param CateBizIdPath 从根节点开始的路径分类ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCateBizIdPath(String [] CateBizIdPath) {
        this.CateBizIdPath = CateBizIdPath;
    }

    /**
     * Get 从根节点开始的路径分类名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CateNamePath 从根节点开始的路径分类名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getCateNamePath() {
        return this.CateNamePath;
    }

    /**
     * Set 从根节点开始的路径分类名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param CateNamePath 从根节点开始的路径分类名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCateNamePath(String [] CateNamePath) {
        this.CateNamePath = CateNamePath;
    }

    /**
     * Get 问答生效域: 1-不生效；2-仅开发域生效；3-仅发布域生效；4-开发域和发布域均生效
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EnableScope 问答生效域: 1-不生效；2-仅开发域生效；3-仅发布域生效；4-开发域和发布域均生效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getEnableScope() {
        return this.EnableScope;
    }

    /**
     * Set 问答生效域: 1-不生效；2-仅开发域生效；3-仅发布域生效；4-开发域和发布域均生效
注意：此字段可能返回 null，表示取不到有效值。
     * @param EnableScope 问答生效域: 1-不生效；2-仅开发域生效；3-仅发布域生效；4-开发域和发布域均生效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnableScope(Long EnableScope) {
        this.EnableScope = EnableScope;
    }

    /**
     * Get 问答关联的文档生效域:1-不生效；2-仅开发域生效；3-仅发布域生效；4-开发域和发布域均生效.
若问答未关联文档，则该字段值同问答生效域 
     * @return DocEnableScope 问答关联的文档生效域:1-不生效；2-仅开发域生效；3-仅发布域生效；4-开发域和发布域均生效.
若问答未关联文档，则该字段值同问答生效域
     */
    public Long getDocEnableScope() {
        return this.DocEnableScope;
    }

    /**
     * Set 问答关联的文档生效域:1-不生效；2-仅开发域生效；3-仅发布域生效；4-开发域和发布域均生效.
若问答未关联文档，则该字段值同问答生效域
     * @param DocEnableScope 问答关联的文档生效域:1-不生效；2-仅开发域生效；3-仅发布域生效；4-开发域和发布域均生效.
若问答未关联文档，则该字段值同问答生效域
     */
    public void setDocEnableScope(Long DocEnableScope) {
        this.DocEnableScope = DocEnableScope;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeQAResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeQAResponse(DescribeQAResponse source) {
        if (source.QaBizId != null) {
            this.QaBizId = new String(source.QaBizId);
        }
        if (source.Question != null) {
            this.Question = new String(source.Question);
        }
        if (source.Answer != null) {
            this.Answer = new String(source.Answer);
        }
        if (source.CustomParam != null) {
            this.CustomParam = new String(source.CustomParam);
        }
        if (source.Source != null) {
            this.Source = new Long(source.Source);
        }
        if (source.SourceDesc != null) {
            this.SourceDesc = new String(source.SourceDesc);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.StatusDesc != null) {
            this.StatusDesc = new String(source.StatusDesc);
        }
        if (source.CateBizId != null) {
            this.CateBizId = new String(source.CateBizId);
        }
        if (source.IsAllowAccept != null) {
            this.IsAllowAccept = new Boolean(source.IsAllowAccept);
        }
        if (source.IsAllowDelete != null) {
            this.IsAllowDelete = new Boolean(source.IsAllowDelete);
        }
        if (source.IsAllowEdit != null) {
            this.IsAllowEdit = new Boolean(source.IsAllowEdit);
        }
        if (source.DocBizId != null) {
            this.DocBizId = new String(source.DocBizId);
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.FileType != null) {
            this.FileType = new String(source.FileType);
        }
        if (source.SegmentBizId != null) {
            this.SegmentBizId = new String(source.SegmentBizId);
        }
        if (source.PageContent != null) {
            this.PageContent = new String(source.PageContent);
        }
        if (source.Highlights != null) {
            this.Highlights = new Highlight[source.Highlights.length];
            for (int i = 0; i < source.Highlights.length; i++) {
                this.Highlights[i] = new Highlight(source.Highlights[i]);
            }
        }
        if (source.OrgData != null) {
            this.OrgData = new String(source.OrgData);
        }
        if (source.AttrRange != null) {
            this.AttrRange = new Long(source.AttrRange);
        }
        if (source.AttrLabels != null) {
            this.AttrLabels = new AttrLabel[source.AttrLabels.length];
            for (int i = 0; i < source.AttrLabels.length; i++) {
                this.AttrLabels[i] = new AttrLabel(source.AttrLabels[i]);
            }
        }
        if (source.ExpireStart != null) {
            this.ExpireStart = new String(source.ExpireStart);
        }
        if (source.ExpireEnd != null) {
            this.ExpireEnd = new String(source.ExpireEnd);
        }
        if (source.SimilarQuestions != null) {
            this.SimilarQuestions = new SimilarQuestion[source.SimilarQuestions.length];
            for (int i = 0; i < source.SimilarQuestions.length; i++) {
                this.SimilarQuestions[i] = new SimilarQuestion(source.SimilarQuestions[i]);
            }
        }
        if (source.QaAuditStatus != null) {
            this.QaAuditStatus = new Long(source.QaAuditStatus);
        }
        if (source.PicAuditStatus != null) {
            this.PicAuditStatus = new Long(source.PicAuditStatus);
        }
        if (source.VideoAuditStatus != null) {
            this.VideoAuditStatus = new Long(source.VideoAuditStatus);
        }
        if (source.QuestionDesc != null) {
            this.QuestionDesc = new String(source.QuestionDesc);
        }
        if (source.IsDisabled != null) {
            this.IsDisabled = new Boolean(source.IsDisabled);
        }
        if (source.CateBizIdPath != null) {
            this.CateBizIdPath = new String[source.CateBizIdPath.length];
            for (int i = 0; i < source.CateBizIdPath.length; i++) {
                this.CateBizIdPath[i] = new String(source.CateBizIdPath[i]);
            }
        }
        if (source.CateNamePath != null) {
            this.CateNamePath = new String[source.CateNamePath.length];
            for (int i = 0; i < source.CateNamePath.length; i++) {
                this.CateNamePath[i] = new String(source.CateNamePath[i]);
            }
        }
        if (source.EnableScope != null) {
            this.EnableScope = new Long(source.EnableScope);
        }
        if (source.DocEnableScope != null) {
            this.DocEnableScope = new Long(source.DocEnableScope);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "QaBizId", this.QaBizId);
        this.setParamSimple(map, prefix + "Question", this.Question);
        this.setParamSimple(map, prefix + "Answer", this.Answer);
        this.setParamSimple(map, prefix + "CustomParam", this.CustomParam);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "SourceDesc", this.SourceDesc);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StatusDesc", this.StatusDesc);
        this.setParamSimple(map, prefix + "CateBizId", this.CateBizId);
        this.setParamSimple(map, prefix + "IsAllowAccept", this.IsAllowAccept);
        this.setParamSimple(map, prefix + "IsAllowDelete", this.IsAllowDelete);
        this.setParamSimple(map, prefix + "IsAllowEdit", this.IsAllowEdit);
        this.setParamSimple(map, prefix + "DocBizId", this.DocBizId);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "FileType", this.FileType);
        this.setParamSimple(map, prefix + "SegmentBizId", this.SegmentBizId);
        this.setParamSimple(map, prefix + "PageContent", this.PageContent);
        this.setParamArrayObj(map, prefix + "Highlights.", this.Highlights);
        this.setParamSimple(map, prefix + "OrgData", this.OrgData);
        this.setParamSimple(map, prefix + "AttrRange", this.AttrRange);
        this.setParamArrayObj(map, prefix + "AttrLabels.", this.AttrLabels);
        this.setParamSimple(map, prefix + "ExpireStart", this.ExpireStart);
        this.setParamSimple(map, prefix + "ExpireEnd", this.ExpireEnd);
        this.setParamArrayObj(map, prefix + "SimilarQuestions.", this.SimilarQuestions);
        this.setParamSimple(map, prefix + "QaAuditStatus", this.QaAuditStatus);
        this.setParamSimple(map, prefix + "PicAuditStatus", this.PicAuditStatus);
        this.setParamSimple(map, prefix + "VideoAuditStatus", this.VideoAuditStatus);
        this.setParamSimple(map, prefix + "QuestionDesc", this.QuestionDesc);
        this.setParamSimple(map, prefix + "IsDisabled", this.IsDisabled);
        this.setParamArraySimple(map, prefix + "CateBizIdPath.", this.CateBizIdPath);
        this.setParamArraySimple(map, prefix + "CateNamePath.", this.CateNamePath);
        this.setParamSimple(map, prefix + "EnableScope", this.EnableScope);
        this.setParamSimple(map, prefix + "DocEnableScope", this.DocEnableScope);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

