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
    * 申请人id
    */
    @SerializedName("ApplicantId")
    @Expose
    private String ApplicantId;

    /**
    * 申请人名称
    */
    @SerializedName("ApplicantName")
    @Expose
    private String ApplicantName;

    /**
    * 审批备注
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 审批分类key
    */
    @SerializedName("ApproveClassification")
    @Expose
    private String ApproveClassification;

    /**
    * 审批单id
    */
    @SerializedName("ApproveId")
    @Expose
    private String ApproveId;

    /**
    * 审批类型key
    */
    @SerializedName("ApproveType")
    @Expose
    private String ApproveType;

    /**
    * 申请原因
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Reason")
    @Expose
    private String Reason;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 审批时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApproveTime")
    @Expose
    private String ApproveTime;

    /**
    * 审批分类名称
    */
    @SerializedName("ApproveClassificationName")
    @Expose
    private String ApproveClassificationName;

    /**
    * 状态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 审批类型名称
    */
    @SerializedName("ApproveTypeName")
    @Expose
    private String ApproveTypeName;

    /**
    * 审批异常或者失败信息
    */
    @SerializedName("ErrorMessage")
    @Expose
    private String ErrorMessage;

    /**
    * 申请名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApplyName")
    @Expose
    private String ApplyName;

    /**
    * 审批人id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApproverId")
    @Expose
    private String ApproverId;

    /**
    * 审批人名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApproverName")
    @Expose
    private String ApproverName;

    /**
    * 审批所属项目
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApproveProjectName")
    @Expose
    private String ApproveProjectName;

    /**
    * 审批id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApplyId")
    @Expose
    private String ApplyId;

    /**
    * 扩展字段
    */
    @SerializedName("Metadata")
    @Expose
    private String Metadata;

    /**
     * Get 申请人id 
     * @return ApplicantId 申请人id
     */
    public String getApplicantId() {
        return this.ApplicantId;
    }

    /**
     * Set 申请人id
     * @param ApplicantId 申请人id
     */
    public void setApplicantId(String ApplicantId) {
        this.ApplicantId = ApplicantId;
    }

    /**
     * Get 申请人名称 
     * @return ApplicantName 申请人名称
     */
    public String getApplicantName() {
        return this.ApplicantName;
    }

    /**
     * Set 申请人名称
     * @param ApplicantName 申请人名称
     */
    public void setApplicantName(String ApplicantName) {
        this.ApplicantName = ApplicantName;
    }

    /**
     * Get 审批备注
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Remark 审批备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 审批备注
注意：此字段可能返回 null，表示取不到有效值。
     * @param Remark 审批备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 审批分类key 
     * @return ApproveClassification 审批分类key
     */
    public String getApproveClassification() {
        return this.ApproveClassification;
    }

    /**
     * Set 审批分类key
     * @param ApproveClassification 审批分类key
     */
    public void setApproveClassification(String ApproveClassification) {
        this.ApproveClassification = ApproveClassification;
    }

    /**
     * Get 审批单id 
     * @return ApproveId 审批单id
     */
    public String getApproveId() {
        return this.ApproveId;
    }

    /**
     * Set 审批单id
     * @param ApproveId 审批单id
     */
    public void setApproveId(String ApproveId) {
        this.ApproveId = ApproveId;
    }

    /**
     * Get 审批类型key 
     * @return ApproveType 审批类型key
     */
    public String getApproveType() {
        return this.ApproveType;
    }

    /**
     * Set 审批类型key
     * @param ApproveType 审批类型key
     */
    public void setApproveType(String ApproveType) {
        this.ApproveType = ApproveType;
    }

    /**
     * Get 申请原因
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Reason 申请原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getReason() {
        return this.Reason;
    }

    /**
     * Set 申请原因
注意：此字段可能返回 null，表示取不到有效值。
     * @param Reason 申请原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReason(String Reason) {
        this.Reason = Reason;
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
     * Get 审批时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApproveTime 审批时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApproveTime() {
        return this.ApproveTime;
    }

    /**
     * Set 审批时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApproveTime 审批时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApproveTime(String ApproveTime) {
        this.ApproveTime = ApproveTime;
    }

    /**
     * Get 审批分类名称 
     * @return ApproveClassificationName 审批分类名称
     */
    public String getApproveClassificationName() {
        return this.ApproveClassificationName;
    }

    /**
     * Set 审批分类名称
     * @param ApproveClassificationName 审批分类名称
     */
    public void setApproveClassificationName(String ApproveClassificationName) {
        this.ApproveClassificationName = ApproveClassificationName;
    }

    /**
     * Get 状态 
     * @return Status 状态
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 状态
     * @param Status 状态
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 审批类型名称 
     * @return ApproveTypeName 审批类型名称
     */
    public String getApproveTypeName() {
        return this.ApproveTypeName;
    }

    /**
     * Set 审批类型名称
     * @param ApproveTypeName 审批类型名称
     */
    public void setApproveTypeName(String ApproveTypeName) {
        this.ApproveTypeName = ApproveTypeName;
    }

    /**
     * Get 审批异常或者失败信息 
     * @return ErrorMessage 审批异常或者失败信息
     */
    public String getErrorMessage() {
        return this.ErrorMessage;
    }

    /**
     * Set 审批异常或者失败信息
     * @param ErrorMessage 审批异常或者失败信息
     */
    public void setErrorMessage(String ErrorMessage) {
        this.ErrorMessage = ErrorMessage;
    }

    /**
     * Get 申请名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApplyName 申请名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApplyName() {
        return this.ApplyName;
    }

    /**
     * Set 申请名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApplyName 申请名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApplyName(String ApplyName) {
        this.ApplyName = ApplyName;
    }

    /**
     * Get 审批人id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApproverId 审批人id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApproverId() {
        return this.ApproverId;
    }

    /**
     * Set 审批人id
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApproverId 审批人id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApproverId(String ApproverId) {
        this.ApproverId = ApproverId;
    }

    /**
     * Get 审批人名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApproverName 审批人名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApproverName() {
        return this.ApproverName;
    }

    /**
     * Set 审批人名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApproverName 审批人名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApproverName(String ApproverName) {
        this.ApproverName = ApproverName;
    }

    /**
     * Get 审批所属项目
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApproveProjectName 审批所属项目
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApproveProjectName() {
        return this.ApproveProjectName;
    }

    /**
     * Set 审批所属项目
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApproveProjectName 审批所属项目
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApproveProjectName(String ApproveProjectName) {
        this.ApproveProjectName = ApproveProjectName;
    }

    /**
     * Get 审批id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApplyId 审批id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApplyId() {
        return this.ApplyId;
    }

    /**
     * Set 审批id
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApplyId 审批id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApplyId(String ApplyId) {
        this.ApplyId = ApplyId;
    }

    /**
     * Get 扩展字段 
     * @return Metadata 扩展字段
     */
    public String getMetadata() {
        return this.Metadata;
    }

    /**
     * Set 扩展字段
     * @param Metadata 扩展字段
     */
    public void setMetadata(String Metadata) {
        this.Metadata = Metadata;
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

    }
}

