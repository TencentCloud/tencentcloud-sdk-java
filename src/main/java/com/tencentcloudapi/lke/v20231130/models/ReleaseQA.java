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

public class ReleaseQA extends AbstractModel {

    /**
    * 问题
    */
    @SerializedName("Question")
    @Expose
    private String Question;

    /**
    * 更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 状态
    */
    @SerializedName("Action")
    @Expose
    private Long Action;

    /**
    * 状态描述
    */
    @SerializedName("ActionDesc")
    @Expose
    private String ActionDesc;

    /**
    * 来源1:文档生成，2：批量导入，3：手动添加
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
    * 文件名字
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
    * 失败原因
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * 发布状态
    */
    @SerializedName("ReleaseStatus")
    @Expose
    private Long ReleaseStatus;

    /**
    * QAID
    */
    @SerializedName("QaBizId")
    @Expose
    private String QaBizId;

    /**
    * 文档业务ID
    */
    @SerializedName("DocBizId")
    @Expose
    private String DocBizId;

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
     * @return Action 状态
     */
    public Long getAction() {
        return this.Action;
    }

    /**
     * Set 状态
     * @param Action 状态
     */
    public void setAction(Long Action) {
        this.Action = Action;
    }

    /**
     * Get 状态描述 
     * @return ActionDesc 状态描述
     */
    public String getActionDesc() {
        return this.ActionDesc;
    }

    /**
     * Set 状态描述
     * @param ActionDesc 状态描述
     */
    public void setActionDesc(String ActionDesc) {
        this.ActionDesc = ActionDesc;
    }

    /**
     * Get 来源1:文档生成，2：批量导入，3：手动添加 
     * @return Source 来源1:文档生成，2：批量导入，3：手动添加
     */
    public Long getSource() {
        return this.Source;
    }

    /**
     * Set 来源1:文档生成，2：批量导入，3：手动添加
     * @param Source 来源1:文档生成，2：批量导入，3：手动添加
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
     * Get 文件名字 
     * @return FileName 文件名字
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set 文件名字
     * @param FileName 文件名字
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
     * Get 失败原因 
     * @return Message 失败原因
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set 失败原因
     * @param Message 失败原因
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get 发布状态 
     * @return ReleaseStatus 发布状态
     */
    public Long getReleaseStatus() {
        return this.ReleaseStatus;
    }

    /**
     * Set 发布状态
     * @param ReleaseStatus 发布状态
     */
    public void setReleaseStatus(Long ReleaseStatus) {
        this.ReleaseStatus = ReleaseStatus;
    }

    /**
     * Get QAID 
     * @return QaBizId QAID
     */
    public String getQaBizId() {
        return this.QaBizId;
    }

    /**
     * Set QAID
     * @param QaBizId QAID
     */
    public void setQaBizId(String QaBizId) {
        this.QaBizId = QaBizId;
    }

    /**
     * Get 文档业务ID 
     * @return DocBizId 文档业务ID
     */
    public String getDocBizId() {
        return this.DocBizId;
    }

    /**
     * Set 文档业务ID
     * @param DocBizId 文档业务ID
     */
    public void setDocBizId(String DocBizId) {
        this.DocBizId = DocBizId;
    }

    public ReleaseQA() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReleaseQA(ReleaseQA source) {
        if (source.Question != null) {
            this.Question = new String(source.Question);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.Action != null) {
            this.Action = new Long(source.Action);
        }
        if (source.ActionDesc != null) {
            this.ActionDesc = new String(source.ActionDesc);
        }
        if (source.Source != null) {
            this.Source = new Long(source.Source);
        }
        if (source.SourceDesc != null) {
            this.SourceDesc = new String(source.SourceDesc);
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.FileType != null) {
            this.FileType = new String(source.FileType);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.ReleaseStatus != null) {
            this.ReleaseStatus = new Long(source.ReleaseStatus);
        }
        if (source.QaBizId != null) {
            this.QaBizId = new String(source.QaBizId);
        }
        if (source.DocBizId != null) {
            this.DocBizId = new String(source.DocBizId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Question", this.Question);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "ActionDesc", this.ActionDesc);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "SourceDesc", this.SourceDesc);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "FileType", this.FileType);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "ReleaseStatus", this.ReleaseStatus);
        this.setParamSimple(map, prefix + "QaBizId", this.QaBizId);
        this.setParamSimple(map, prefix + "DocBizId", this.DocBizId);

    }
}

