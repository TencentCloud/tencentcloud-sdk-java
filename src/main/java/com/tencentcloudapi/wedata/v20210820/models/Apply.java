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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Apply extends AbstractModel {

    /**
    * <p>申请人id</p>
    */
    @SerializedName("ApplicantId")
    @Expose
    private String ApplicantId;

    /**
    * <p>申请人名称</p>
    */
    @SerializedName("ApplicantName")
    @Expose
    private String ApplicantName;

    /**
    * <p>审批备注</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * <p>审批分类key</p>
    */
    @SerializedName("ApproveClassification")
    @Expose
    private String ApproveClassification;

    /**
    * <p>审批单id</p>
    */
    @SerializedName("ApproveId")
    @Expose
    private String ApproveId;

    /**
    * <p>审批类型key</p>
    */
    @SerializedName("ApproveType")
    @Expose
    private String ApproveType;

    /**
    * <p>申请原因</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Reason")
    @Expose
    private String Reason;

    /**
    * <p>创建时间</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>审批时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApproveTime")
    @Expose
    private String ApproveTime;

    /**
    * <p>审批分类名称</p>
    */
    @SerializedName("ApproveClassificationName")
    @Expose
    private String ApproveClassificationName;

    /**
    * <p>状态</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>审批类型名称</p>
    */
    @SerializedName("ApproveTypeName")
    @Expose
    private String ApproveTypeName;

    /**
    * <p>审批异常或者失败信息</p>
    */
    @SerializedName("ErrorMessage")
    @Expose
    private String ErrorMessage;

    /**
    * <p>申请名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApplyName")
    @Expose
    private String ApplyName;

    /**
    * <p>审批人id</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApproverId")
    @Expose
    private String ApproverId;

    /**
    * <p>审批人名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApproverName")
    @Expose
    private String ApproverName;

    /**
    * <p>审批所属项目</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApproveProjectName")
    @Expose
    private String ApproveProjectName;

    /**
    * <p>审批id</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApplyId")
    @Expose
    private String ApplyId;

    /**
    * <p>扩展字段</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Metadata")
    @Expose
    private String Metadata;

    /**
    * <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTimestamp")
    @Expose
    private Long CreateTimestamp;

    /**
    * <p>审批时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApproveTimestamp")
    @Expose
    private Long ApproveTimestamp;

    /**
    * <p>审批扩展码</p>
    */
    @SerializedName("ApproveCode")
    @Expose
    private String ApproveCode;

    /**
     * Get <p>申请人id</p> 
     * @return ApplicantId <p>申请人id</p>
     */
    public String getApplicantId() {
        return this.ApplicantId;
    }

    /**
     * Set <p>申请人id</p>
     * @param ApplicantId <p>申请人id</p>
     */
    public void setApplicantId(String ApplicantId) {
        this.ApplicantId = ApplicantId;
    }

    /**
     * Get <p>申请人名称</p> 
     * @return ApplicantName <p>申请人名称</p>
     */
    public String getApplicantName() {
        return this.ApplicantName;
    }

    /**
     * Set <p>申请人名称</p>
     * @param ApplicantName <p>申请人名称</p>
     */
    public void setApplicantName(String ApplicantName) {
        this.ApplicantName = ApplicantName;
    }

    /**
     * Get <p>审批备注</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Remark <p>审批备注</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set <p>审批备注</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Remark <p>审批备注</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get <p>审批分类key</p> 
     * @return ApproveClassification <p>审批分类key</p>
     */
    public String getApproveClassification() {
        return this.ApproveClassification;
    }

    /**
     * Set <p>审批分类key</p>
     * @param ApproveClassification <p>审批分类key</p>
     */
    public void setApproveClassification(String ApproveClassification) {
        this.ApproveClassification = ApproveClassification;
    }

    /**
     * Get <p>审批单id</p> 
     * @return ApproveId <p>审批单id</p>
     */
    public String getApproveId() {
        return this.ApproveId;
    }

    /**
     * Set <p>审批单id</p>
     * @param ApproveId <p>审批单id</p>
     */
    public void setApproveId(String ApproveId) {
        this.ApproveId = ApproveId;
    }

    /**
     * Get <p>审批类型key</p> 
     * @return ApproveType <p>审批类型key</p>
     */
    public String getApproveType() {
        return this.ApproveType;
    }

    /**
     * Set <p>审批类型key</p>
     * @param ApproveType <p>审批类型key</p>
     */
    public void setApproveType(String ApproveType) {
        this.ApproveType = ApproveType;
    }

    /**
     * Get <p>申请原因</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Reason <p>申请原因</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getReason() {
        return this.Reason;
    }

    /**
     * Set <p>申请原因</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Reason <p>申请原因</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReason(String Reason) {
        this.Reason = Reason;
    }

    /**
     * Get <p>创建时间</p> 
     * @return CreateTime <p>创建时间</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间</p>
     * @param CreateTime <p>创建时间</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>审批时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApproveTime <p>审批时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApproveTime() {
        return this.ApproveTime;
    }

    /**
     * Set <p>审批时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApproveTime <p>审批时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApproveTime(String ApproveTime) {
        this.ApproveTime = ApproveTime;
    }

    /**
     * Get <p>审批分类名称</p> 
     * @return ApproveClassificationName <p>审批分类名称</p>
     */
    public String getApproveClassificationName() {
        return this.ApproveClassificationName;
    }

    /**
     * Set <p>审批分类名称</p>
     * @param ApproveClassificationName <p>审批分类名称</p>
     */
    public void setApproveClassificationName(String ApproveClassificationName) {
        this.ApproveClassificationName = ApproveClassificationName;
    }

    /**
     * Get <p>状态</p> 
     * @return Status <p>状态</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>状态</p>
     * @param Status <p>状态</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>审批类型名称</p> 
     * @return ApproveTypeName <p>审批类型名称</p>
     */
    public String getApproveTypeName() {
        return this.ApproveTypeName;
    }

    /**
     * Set <p>审批类型名称</p>
     * @param ApproveTypeName <p>审批类型名称</p>
     */
    public void setApproveTypeName(String ApproveTypeName) {
        this.ApproveTypeName = ApproveTypeName;
    }

    /**
     * Get <p>审批异常或者失败信息</p> 
     * @return ErrorMessage <p>审批异常或者失败信息</p>
     */
    public String getErrorMessage() {
        return this.ErrorMessage;
    }

    /**
     * Set <p>审批异常或者失败信息</p>
     * @param ErrorMessage <p>审批异常或者失败信息</p>
     */
    public void setErrorMessage(String ErrorMessage) {
        this.ErrorMessage = ErrorMessage;
    }

    /**
     * Get <p>申请名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApplyName <p>申请名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApplyName() {
        return this.ApplyName;
    }

    /**
     * Set <p>申请名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApplyName <p>申请名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApplyName(String ApplyName) {
        this.ApplyName = ApplyName;
    }

    /**
     * Get <p>审批人id</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApproverId <p>审批人id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApproverId() {
        return this.ApproverId;
    }

    /**
     * Set <p>审批人id</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApproverId <p>审批人id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApproverId(String ApproverId) {
        this.ApproverId = ApproverId;
    }

    /**
     * Get <p>审批人名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApproverName <p>审批人名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApproverName() {
        return this.ApproverName;
    }

    /**
     * Set <p>审批人名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApproverName <p>审批人名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApproverName(String ApproverName) {
        this.ApproverName = ApproverName;
    }

    /**
     * Get <p>审批所属项目</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApproveProjectName <p>审批所属项目</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApproveProjectName() {
        return this.ApproveProjectName;
    }

    /**
     * Set <p>审批所属项目</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApproveProjectName <p>审批所属项目</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApproveProjectName(String ApproveProjectName) {
        this.ApproveProjectName = ApproveProjectName;
    }

    /**
     * Get <p>审批id</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApplyId <p>审批id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApplyId() {
        return this.ApplyId;
    }

    /**
     * Set <p>审批id</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApplyId <p>审批id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApplyId(String ApplyId) {
        this.ApplyId = ApplyId;
    }

    /**
     * Get <p>扩展字段</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Metadata <p>扩展字段</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMetadata() {
        return this.Metadata;
    }

    /**
     * Set <p>扩展字段</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Metadata <p>扩展字段</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMetadata(String Metadata) {
        this.Metadata = Metadata;
    }

    /**
     * Get <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTimestamp <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCreateTimestamp() {
        return this.CreateTimestamp;
    }

    /**
     * Set <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTimestamp <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTimestamp(Long CreateTimestamp) {
        this.CreateTimestamp = CreateTimestamp;
    }

    /**
     * Get <p>审批时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApproveTimestamp <p>审批时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getApproveTimestamp() {
        return this.ApproveTimestamp;
    }

    /**
     * Set <p>审批时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApproveTimestamp <p>审批时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApproveTimestamp(Long ApproveTimestamp) {
        this.ApproveTimestamp = ApproveTimestamp;
    }

    /**
     * Get <p>审批扩展码</p> 
     * @return ApproveCode <p>审批扩展码</p>
     */
    public String getApproveCode() {
        return this.ApproveCode;
    }

    /**
     * Set <p>审批扩展码</p>
     * @param ApproveCode <p>审批扩展码</p>
     */
    public void setApproveCode(String ApproveCode) {
        this.ApproveCode = ApproveCode;
    }

    public Apply() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Apply(Apply source) {
        if (source.ApplicantId != null) {
            this.ApplicantId = new String(source.ApplicantId);
        }
        if (source.ApplicantName != null) {
            this.ApplicantName = new String(source.ApplicantName);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.ApproveClassification != null) {
            this.ApproveClassification = new String(source.ApproveClassification);
        }
        if (source.ApproveId != null) {
            this.ApproveId = new String(source.ApproveId);
        }
        if (source.ApproveType != null) {
            this.ApproveType = new String(source.ApproveType);
        }
        if (source.Reason != null) {
            this.Reason = new String(source.Reason);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ApproveTime != null) {
            this.ApproveTime = new String(source.ApproveTime);
        }
        if (source.ApproveClassificationName != null) {
            this.ApproveClassificationName = new String(source.ApproveClassificationName);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ApproveTypeName != null) {
            this.ApproveTypeName = new String(source.ApproveTypeName);
        }
        if (source.ErrorMessage != null) {
            this.ErrorMessage = new String(source.ErrorMessage);
        }
        if (source.ApplyName != null) {
            this.ApplyName = new String(source.ApplyName);
        }
        if (source.ApproverId != null) {
            this.ApproverId = new String(source.ApproverId);
        }
        if (source.ApproverName != null) {
            this.ApproverName = new String(source.ApproverName);
        }
        if (source.ApproveProjectName != null) {
            this.ApproveProjectName = new String(source.ApproveProjectName);
        }
        if (source.ApplyId != null) {
            this.ApplyId = new String(source.ApplyId);
        }
        if (source.Metadata != null) {
            this.Metadata = new String(source.Metadata);
        }
        if (source.CreateTimestamp != null) {
            this.CreateTimestamp = new Long(source.CreateTimestamp);
        }
        if (source.ApproveTimestamp != null) {
            this.ApproveTimestamp = new Long(source.ApproveTimestamp);
        }
        if (source.ApproveCode != null) {
            this.ApproveCode = new String(source.ApproveCode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApplicantId", this.ApplicantId);
        this.setParamSimple(map, prefix + "ApplicantName", this.ApplicantName);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "ApproveClassification", this.ApproveClassification);
        this.setParamSimple(map, prefix + "ApproveId", this.ApproveId);
        this.setParamSimple(map, prefix + "ApproveType", this.ApproveType);
        this.setParamSimple(map, prefix + "Reason", this.Reason);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ApproveTime", this.ApproveTime);
        this.setParamSimple(map, prefix + "ApproveClassificationName", this.ApproveClassificationName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ApproveTypeName", this.ApproveTypeName);
        this.setParamSimple(map, prefix + "ErrorMessage", this.ErrorMessage);
        this.setParamSimple(map, prefix + "ApplyName", this.ApplyName);
        this.setParamSimple(map, prefix + "ApproverId", this.ApproverId);
        this.setParamSimple(map, prefix + "ApproverName", this.ApproverName);
        this.setParamSimple(map, prefix + "ApproveProjectName", this.ApproveProjectName);
        this.setParamSimple(map, prefix + "ApplyId", this.ApplyId);
        this.setParamSimple(map, prefix + "Metadata", this.Metadata);
        this.setParamSimple(map, prefix + "CreateTimestamp", this.CreateTimestamp);
        this.setParamSimple(map, prefix + "ApproveTimestamp", this.ApproveTimestamp);
        this.setParamSimple(map, prefix + "ApproveCode", this.ApproveCode);

    }
}

