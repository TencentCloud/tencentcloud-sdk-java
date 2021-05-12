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

public class DescribeManagerDetailResponse extends AbstractModel{

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
    * 管理人邮箱
    */
    @SerializedName("ManagerMail")
    @Expose
    private String ManagerMail;

    /**
    * 联系人姓名
    */
    @SerializedName("ContactFirstName")
    @Expose
    private String ContactFirstName;

    /**
    * 管理人姓名
    */
    @SerializedName("ManagerLastName")
    @Expose
    private String ManagerLastName;

    /**
    * 联系人职位
    */
    @SerializedName("ContactPosition")
    @Expose
    private String ContactPosition;

    /**
    * 管理人职位
    */
    @SerializedName("ManagerPosition")
    @Expose
    private String ManagerPosition;

    /**
    * 核验通过时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VerifyTime")
    @Expose
    private String VerifyTime;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 核验过期时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * 联系人姓名
    */
    @SerializedName("ContactLastName")
    @Expose
    private String ContactLastName;

    /**
    * 管理人电话
    */
    @SerializedName("ManagerPhone")
    @Expose
    private String ManagerPhone;

    /**
    * 联系人电话
    */
    @SerializedName("ContactPhone")
    @Expose
    private String ContactPhone;

    /**
    * 联系人邮箱
    */
    @SerializedName("ContactMail")
    @Expose
    private String ContactMail;

    /**
    * 管理人所属部门
    */
    @SerializedName("ManagerDepartment")
    @Expose
    private String ManagerDepartment;

    /**
    * 管理人所属公司信息
    */
    @SerializedName("CompanyInfo")
    @Expose
    private CompanyInfo CompanyInfo;

    /**
    * 管理人公司ID
    */
    @SerializedName("CompanyId")
    @Expose
    private Long CompanyId;

    /**
    * 管理人ID
    */
    @SerializedName("ManagerId")
    @Expose
    private Long ManagerId;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

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
     * Get 联系人姓名 
     * @return ContactFirstName 联系人姓名
     */
    public String getContactFirstName() {
        return this.ContactFirstName;
    }

    /**
     * Set 联系人姓名
     * @param ContactFirstName 联系人姓名
     */
    public void setContactFirstName(String ContactFirstName) {
        this.ContactFirstName = ContactFirstName;
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
     * Get 联系人职位 
     * @return ContactPosition 联系人职位
     */
    public String getContactPosition() {
        return this.ContactPosition;
    }

    /**
     * Set 联系人职位
     * @param ContactPosition 联系人职位
     */
    public void setContactPosition(String ContactPosition) {
        this.ContactPosition = ContactPosition;
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
     * Get 核验通过时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VerifyTime 核验通过时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVerifyTime() {
        return this.VerifyTime;
    }

    /**
     * Set 核验通过时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param VerifyTime 核验通过时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVerifyTime(String VerifyTime) {
        this.VerifyTime = VerifyTime;
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
     * Get 核验过期时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExpireTime 核验过期时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 核验过期时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExpireTime 核验过期时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get 联系人姓名 
     * @return ContactLastName 联系人姓名
     */
    public String getContactLastName() {
        return this.ContactLastName;
    }

    /**
     * Set 联系人姓名
     * @param ContactLastName 联系人姓名
     */
    public void setContactLastName(String ContactLastName) {
        this.ContactLastName = ContactLastName;
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
     * Get 联系人电话 
     * @return ContactPhone 联系人电话
     */
    public String getContactPhone() {
        return this.ContactPhone;
    }

    /**
     * Set 联系人电话
     * @param ContactPhone 联系人电话
     */
    public void setContactPhone(String ContactPhone) {
        this.ContactPhone = ContactPhone;
    }

    /**
     * Get 联系人邮箱 
     * @return ContactMail 联系人邮箱
     */
    public String getContactMail() {
        return this.ContactMail;
    }

    /**
     * Set 联系人邮箱
     * @param ContactMail 联系人邮箱
     */
    public void setContactMail(String ContactMail) {
        this.ContactMail = ContactMail;
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
     * Get 管理人所属公司信息 
     * @return CompanyInfo 管理人所属公司信息
     */
    public CompanyInfo getCompanyInfo() {
        return this.CompanyInfo;
    }

    /**
     * Set 管理人所属公司信息
     * @param CompanyInfo 管理人所属公司信息
     */
    public void setCompanyInfo(CompanyInfo CompanyInfo) {
        this.CompanyInfo = CompanyInfo;
    }

    /**
     * Get 管理人公司ID 
     * @return CompanyId 管理人公司ID
     */
    public Long getCompanyId() {
        return this.CompanyId;
    }

    /**
     * Set 管理人公司ID
     * @param CompanyId 管理人公司ID
     */
    public void setCompanyId(Long CompanyId) {
        this.CompanyId = CompanyId;
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
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeManagerDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeManagerDetailResponse(DescribeManagerDetailResponse source) {
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ManagerFirstName != null) {
            this.ManagerFirstName = new String(source.ManagerFirstName);
        }
        if (source.ManagerMail != null) {
            this.ManagerMail = new String(source.ManagerMail);
        }
        if (source.ContactFirstName != null) {
            this.ContactFirstName = new String(source.ContactFirstName);
        }
        if (source.ManagerLastName != null) {
            this.ManagerLastName = new String(source.ManagerLastName);
        }
        if (source.ContactPosition != null) {
            this.ContactPosition = new String(source.ContactPosition);
        }
        if (source.ManagerPosition != null) {
            this.ManagerPosition = new String(source.ManagerPosition);
        }
        if (source.VerifyTime != null) {
            this.VerifyTime = new String(source.VerifyTime);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.ContactLastName != null) {
            this.ContactLastName = new String(source.ContactLastName);
        }
        if (source.ManagerPhone != null) {
            this.ManagerPhone = new String(source.ManagerPhone);
        }
        if (source.ContactPhone != null) {
            this.ContactPhone = new String(source.ContactPhone);
        }
        if (source.ContactMail != null) {
            this.ContactMail = new String(source.ContactMail);
        }
        if (source.ManagerDepartment != null) {
            this.ManagerDepartment = new String(source.ManagerDepartment);
        }
        if (source.CompanyInfo != null) {
            this.CompanyInfo = new CompanyInfo(source.CompanyInfo);
        }
        if (source.CompanyId != null) {
            this.CompanyId = new Long(source.CompanyId);
        }
        if (source.ManagerId != null) {
            this.ManagerId = new Long(source.ManagerId);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ManagerFirstName", this.ManagerFirstName);
        this.setParamSimple(map, prefix + "ManagerMail", this.ManagerMail);
        this.setParamSimple(map, prefix + "ContactFirstName", this.ContactFirstName);
        this.setParamSimple(map, prefix + "ManagerLastName", this.ManagerLastName);
        this.setParamSimple(map, prefix + "ContactPosition", this.ContactPosition);
        this.setParamSimple(map, prefix + "ManagerPosition", this.ManagerPosition);
        this.setParamSimple(map, prefix + "VerifyTime", this.VerifyTime);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "ContactLastName", this.ContactLastName);
        this.setParamSimple(map, prefix + "ManagerPhone", this.ManagerPhone);
        this.setParamSimple(map, prefix + "ContactPhone", this.ContactPhone);
        this.setParamSimple(map, prefix + "ContactMail", this.ContactMail);
        this.setParamSimple(map, prefix + "ManagerDepartment", this.ManagerDepartment);
        this.setParamObj(map, prefix + "CompanyInfo.", this.CompanyInfo);
        this.setParamSimple(map, prefix + "CompanyId", this.CompanyId);
        this.setParamSimple(map, prefix + "ManagerId", this.ManagerId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

