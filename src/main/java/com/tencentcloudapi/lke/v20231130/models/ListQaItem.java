/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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

public class ListQaItem extends AbstractModel {

    /**
    * 问答ID
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
    * 来源
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
    * 状态
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
    * 文档ID
    */
    @SerializedName("DocBizId")
    @Expose
    private String DocBizId;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 是否允许编辑
    */
    @SerializedName("IsAllowEdit")
    @Expose
    private Boolean IsAllowEdit;

    /**
    * 是否允许删除
    */
    @SerializedName("IsAllowDelete")
    @Expose
    private Boolean IsAllowDelete;

    /**
    * 是否允许校验
    */
    @SerializedName("IsAllowAccept")
    @Expose
    private Boolean IsAllowAccept;

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
    * 问答字符数
    */
    @SerializedName("QaCharSize")
    @Expose
    private String QaCharSize;

    /**
     * Get 问答ID 
     * @return QaBizId 问答ID
     */
    public String getQaBizId() {
        return this.QaBizId;
    }

    /**
     * Set 问答ID
     * @param QaBizId 问答ID
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
     * Get 来源 
     * @return Source 来源
     */
    public Long getSource() {
        return this.Source;
    }

    /**
     * Set 来源
     * @param Source 来源
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
     * Get 状态 
     * @return Status 状态
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 状态
     * @param Status 状态
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
     * Get 文档ID 
     * @return DocBizId 文档ID
     */
    public String getDocBizId() {
        return this.DocBizId;
    }

    /**
     * Set 文档ID
     * @param DocBizId 文档ID
     */
    public void setDocBizId(String DocBizId) {
        this.DocBizId = DocBizId;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
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
     * Get 问答字符数 
     * @return QaCharSize 问答字符数
     */
    public String getQaCharSize() {
        return this.QaCharSize;
    }

    /**
     * Set 问答字符数
     * @param QaCharSize 问答字符数
     */
    public void setQaCharSize(String QaCharSize) {
        this.QaCharSize = QaCharSize;
    }

    public ListQaItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListQaItem(ListQaItem source) {
        if (source.QaBizId != null) {
            this.QaBizId = new String(source.QaBizId);
        }
        if (source.Question != null) {
            this.Question = new String(source.Question);
        }
        if (source.Answer != null) {
            this.Answer = new String(source.Answer);
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
        if (source.DocBizId != null) {
            this.DocBizId = new String(source.DocBizId);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.IsAllowEdit != null) {
            this.IsAllowEdit = new Boolean(source.IsAllowEdit);
        }
        if (source.IsAllowDelete != null) {
            this.IsAllowDelete = new Boolean(source.IsAllowDelete);
        }
        if (source.IsAllowAccept != null) {
            this.IsAllowAccept = new Boolean(source.IsAllowAccept);
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.FileType != null) {
            this.FileType = new String(source.FileType);
        }
        if (source.QaCharSize != null) {
            this.QaCharSize = new String(source.QaCharSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "QaBizId", this.QaBizId);
        this.setParamSimple(map, prefix + "Question", this.Question);
        this.setParamSimple(map, prefix + "Answer", this.Answer);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "SourceDesc", this.SourceDesc);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StatusDesc", this.StatusDesc);
        this.setParamSimple(map, prefix + "DocBizId", this.DocBizId);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "IsAllowEdit", this.IsAllowEdit);
        this.setParamSimple(map, prefix + "IsAllowDelete", this.IsAllowDelete);
        this.setParamSimple(map, prefix + "IsAllowAccept", this.IsAllowAccept);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "FileType", this.FileType);
        this.setParamSimple(map, prefix + "QaCharSize", this.QaCharSize);

    }
}

