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
package com.tencentcloudapi.ssl.v20191205.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ManagerInfo extends AbstractModel{

    /**
    * 状态: audit: 审核中 ok: 审核通过 invalid: 失效 expiring: 即将过期 expired: 已过期
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 管理人姓名
    */
    @SerializedName("ManagerFirstName")
    @Expose
    private String ManagerFirstName;

    /**
    * 管理人姓名
    */
    @SerializedName("ManagerLastName")
    @Expose
    private String ManagerLastName;

    /**
    * 管理人职位
    */
    @SerializedName("ManagerPosition")
    @Expose
    private String ManagerPosition;

    /**
    * 管理人电话
    */
    @SerializedName("ManagerPhone")
    @Expose
    private String ManagerPhone;

    /**
    * 管理人邮箱
    */
    @SerializedName("ManagerMail")
    @Expose
    private String ManagerMail;

    /**
    * 管理人所属部门
    */
    @SerializedName("ManagerDepartment")
    @Expose
    private String ManagerDepartment;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 管理人域名数量
    */
    @SerializedName("DomainCount")
    @Expose
    private Long DomainCount;

    /**
    * 管理人证书数量
    */
    @SerializedName("CertCount")
    @Expose
    private Long CertCount;

    /**
    * 管理人ID
    */
    @SerializedName("ManagerId")
    @Expose
    private Long ManagerId;

    /**
    * 审核有效到期时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * 最近一次提交审核时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubmitAuditTime")
    @Expose
    private String SubmitAuditTime;

    /**
    * 审核通过时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VerifyTime")
    @Expose
    private String VerifyTime;

    /**
    * 具体审核状态信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StatusInfo")
    @Expose
    private ManagerStatusInfo [] StatusInfo;

    /**
     * Get 状态: audit: 审核中 ok: 审核通过 invalid: 失效 expiring: 即将过期 expired: 已过期 
     * @return Status 状态: audit: 审核中 ok: 审核通过 invalid: 失效 expiring: 即将过期 expired: 已过期
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 状态: audit: 审核中 ok: 审核通过 invalid: 失效 expiring: 即将过期 expired: 已过期
     * @param Status 状态: audit: 审核中 ok: 审核通过 invalid: 失效 expiring: 即将过期 expired: 已过期
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 管理人姓名 
     * @return ManagerFirstName 管理人姓名
     */
    public String getManagerFirstName() {
        return this.ManagerFirstName;
    }

    /**
     * Set 管理人姓名
     * @param ManagerFirstName 管理人姓名
     */
    public void setManagerFirstName(String ManagerFirstName) {
        this.ManagerFirstName = ManagerFirstName;
    }

    /**
     * Get 管理人姓名 
     * @return ManagerLastName 管理人姓名
     */
    public String getManagerLastName() {
        return this.ManagerLastName;
    }

    /**
     * Set 管理人姓名
     * @param ManagerLastName 管理人姓名
     */
    public void setManagerLastName(String ManagerLastName) {
        this.ManagerLastName = ManagerLastName;
    }

    /**
     * Get 管理人职位 
     * @return ManagerPosition 管理人职位
     */
    public String getManagerPosition() {
        return this.ManagerPosition;
    }

    /**
     * Set 管理人职位
     * @param ManagerPosition 管理人职位
     */
    public void setManagerPosition(String ManagerPosition) {
        this.ManagerPosition = ManagerPosition;
    }

    /**
     * Get 管理人电话 
     * @return ManagerPhone 管理人电话
     */
    public String getManagerPhone() {
        return this.ManagerPhone;
    }

    /**
     * Set 管理人电话
     * @param ManagerPhone 管理人电话
     */
    public void setManagerPhone(String ManagerPhone) {
        this.ManagerPhone = ManagerPhone;
    }

    /**
     * Get 管理人邮箱 
     * @return ManagerMail 管理人邮箱
     */
    public String getManagerMail() {
        return this.ManagerMail;
    }

    /**
     * Set 管理人邮箱
     * @param ManagerMail 管理人邮箱
     */
    public void setManagerMail(String ManagerMail) {
        this.ManagerMail = ManagerMail;
    }

    /**
     * Get 管理人所属部门 
     * @return ManagerDepartment 管理人所属部门
     */
    public String getManagerDepartment() {
        return this.ManagerDepartment;
    }

    /**
     * Set 管理人所属部门
     * @param ManagerDepartment 管理人所属部门
     */
    public void setManagerDepartment(String ManagerDepartment) {
        this.ManagerDepartment = ManagerDepartment;
    }

    /**
     * Get 创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 管理人域名数量 
     * @return DomainCount 管理人域名数量
     */
    public Long getDomainCount() {
        return this.DomainCount;
    }

    /**
     * Set 管理人域名数量
     * @param DomainCount 管理人域名数量
     */
    public void setDomainCount(Long DomainCount) {
        this.DomainCount = DomainCount;
    }

    /**
     * Get 管理人证书数量 
     * @return CertCount 管理人证书数量
     */
    public Long getCertCount() {
        return this.CertCount;
    }

    /**
     * Set 管理人证书数量
     * @param CertCount 管理人证书数量
     */
    public void setCertCount(Long CertCount) {
        this.CertCount = CertCount;
    }

    /**
     * Get 管理人ID 
     * @return ManagerId 管理人ID
     */
    public Long getManagerId() {
        return this.ManagerId;
    }

    /**
     * Set 管理人ID
     * @param ManagerId 管理人ID
     */
    public void setManagerId(Long ManagerId) {
        this.ManagerId = ManagerId;
    }

    /**
     * Get 审核有效到期时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExpireTime 审核有效到期时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 审核有效到期时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExpireTime 审核有效到期时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get 最近一次提交审核时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubmitAuditTime 最近一次提交审核时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubmitAuditTime() {
        return this.SubmitAuditTime;
    }

    /**
     * Set 最近一次提交审核时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubmitAuditTime 最近一次提交审核时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubmitAuditTime(String SubmitAuditTime) {
        this.SubmitAuditTime = SubmitAuditTime;
    }

    /**
     * Get 审核通过时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VerifyTime 审核通过时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVerifyTime() {
        return this.VerifyTime;
    }

    /**
     * Set 审核通过时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param VerifyTime 审核通过时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVerifyTime(String VerifyTime) {
        this.VerifyTime = VerifyTime;
    }

    /**
     * Get 具体审核状态信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StatusInfo 具体审核状态信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ManagerStatusInfo [] getStatusInfo() {
        return this.StatusInfo;
    }

    /**
     * Set 具体审核状态信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param StatusInfo 具体审核状态信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatusInfo(ManagerStatusInfo [] StatusInfo) {
        this.StatusInfo = StatusInfo;
    }

    public ManagerInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ManagerInfo(ManagerInfo source) {
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ManagerFirstName != null) {
            this.ManagerFirstName = new String(source.ManagerFirstName);
        }
        if (source.ManagerLastName != null) {
            this.ManagerLastName = new String(source.ManagerLastName);
        }
        if (source.ManagerPosition != null) {
            this.ManagerPosition = new String(source.ManagerPosition);
        }
        if (source.ManagerPhone != null) {
            this.ManagerPhone = new String(source.ManagerPhone);
        }
        if (source.ManagerMail != null) {
            this.ManagerMail = new String(source.ManagerMail);
        }
        if (source.ManagerDepartment != null) {
            this.ManagerDepartment = new String(source.ManagerDepartment);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.DomainCount != null) {
            this.DomainCount = new Long(source.DomainCount);
        }
        if (source.CertCount != null) {
            this.CertCount = new Long(source.CertCount);
        }
        if (source.ManagerId != null) {
            this.ManagerId = new Long(source.ManagerId);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.SubmitAuditTime != null) {
            this.SubmitAuditTime = new String(source.SubmitAuditTime);
        }
        if (source.VerifyTime != null) {
            this.VerifyTime = new String(source.VerifyTime);
        }
        if (source.StatusInfo != null) {
            this.StatusInfo = new ManagerStatusInfo[source.StatusInfo.length];
            for (int i = 0; i < source.StatusInfo.length; i++) {
                this.StatusInfo[i] = new ManagerStatusInfo(source.StatusInfo[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ManagerFirstName", this.ManagerFirstName);
        this.setParamSimple(map, prefix + "ManagerLastName", this.ManagerLastName);
        this.setParamSimple(map, prefix + "ManagerPosition", this.ManagerPosition);
        this.setParamSimple(map, prefix + "ManagerPhone", this.ManagerPhone);
        this.setParamSimple(map, prefix + "ManagerMail", this.ManagerMail);
        this.setParamSimple(map, prefix + "ManagerDepartment", this.ManagerDepartment);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "DomainCount", this.DomainCount);
        this.setParamSimple(map, prefix + "CertCount", this.CertCount);
        this.setParamSimple(map, prefix + "ManagerId", this.ManagerId);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "SubmitAuditTime", this.SubmitAuditTime);
        this.setParamSimple(map, prefix + "VerifyTime", this.VerifyTime);
        this.setParamArrayObj(map, prefix + "StatusInfo.", this.StatusInfo);

    }
}

