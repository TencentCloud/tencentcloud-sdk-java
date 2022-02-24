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
package com.tencentcloudapi.eiam.v20210420.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeUserInfoResponse extends AbstractModel{

    /**
    * 用户名。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 用户状态，取值 NORMAL （正常）、FREEZE （已冻结）、LOCKED （已锁定）或 NOT_ENABLED （未启用）。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 昵称。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DisplayName")
    @Expose
    private String DisplayName;

    /**
    * 用户备注。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 用户所属用户组 id 列表。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserGroupIds")
    @Expose
    private String [] UserGroupIds;

    /**
    * 用户 id，长度限制：64个字符。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 用户邮箱。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Email")
    @Expose
    private String Email;

    /**
    * 用户手机号。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Phone")
    @Expose
    private String Phone;

    /**
    * 用户所属的主组织机构唯一ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OrgNodeId")
    @Expose
    private String OrgNodeId;

    /**
    * 数据来源。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DataSource")
    @Expose
    private String DataSource;

    /**
    * 用户过期时间，遵循 ISO 8601 标准。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExpirationTime")
    @Expose
    private String ExpirationTime;

    /**
    * 用户激活时间，遵循 ISO 8601 标准。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ActivationTime")
    @Expose
    private String ActivationTime;

    /**
    * 当前用户的密码是否需要重置，该字段为false表示不需要重置密码。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PwdNeedReset")
    @Expose
    private Boolean PwdNeedReset;

    /**
    * 用户所属的次要组织机构ID列表。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SecondaryOrgNodeIdList")
    @Expose
    private String [] SecondaryOrgNodeIdList;

    /**
    * 是否管理员标志，0为否、1为是。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AdminFlag")
    @Expose
    private Long AdminFlag;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 用户名。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserName 用户名。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set 用户名。
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserName 用户名。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get 用户状态，取值 NORMAL （正常）、FREEZE （已冻结）、LOCKED （已锁定）或 NOT_ENABLED （未启用）。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 用户状态，取值 NORMAL （正常）、FREEZE （已冻结）、LOCKED （已锁定）或 NOT_ENABLED （未启用）。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 用户状态，取值 NORMAL （正常）、FREEZE （已冻结）、LOCKED （已锁定）或 NOT_ENABLED （未启用）。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 用户状态，取值 NORMAL （正常）、FREEZE （已冻结）、LOCKED （已锁定）或 NOT_ENABLED （未启用）。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 昵称。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DisplayName 昵称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDisplayName() {
        return this.DisplayName;
    }

    /**
     * Set 昵称。
注意：此字段可能返回 null，表示取不到有效值。
     * @param DisplayName 昵称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDisplayName(String DisplayName) {
        this.DisplayName = DisplayName;
    }

    /**
     * Get 用户备注。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 用户备注。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 用户备注。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 用户备注。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 用户所属用户组 id 列表。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserGroupIds 用户所属用户组 id 列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getUserGroupIds() {
        return this.UserGroupIds;
    }

    /**
     * Set 用户所属用户组 id 列表。
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserGroupIds 用户所属用户组 id 列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserGroupIds(String [] UserGroupIds) {
        this.UserGroupIds = UserGroupIds;
    }

    /**
     * Get 用户 id，长度限制：64个字符。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserId 用户 id，长度限制：64个字符。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 用户 id，长度限制：64个字符。
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserId 用户 id，长度限制：64个字符。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 用户邮箱。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Email 用户邮箱。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEmail() {
        return this.Email;
    }

    /**
     * Set 用户邮箱。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Email 用户邮箱。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * Get 用户手机号。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Phone 用户手机号。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPhone() {
        return this.Phone;
    }

    /**
     * Set 用户手机号。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Phone 用户手机号。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    /**
     * Get 用户所属的主组织机构唯一ID。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OrgNodeId 用户所属的主组织机构唯一ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOrgNodeId() {
        return this.OrgNodeId;
    }

    /**
     * Set 用户所属的主组织机构唯一ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param OrgNodeId 用户所属的主组织机构唯一ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOrgNodeId(String OrgNodeId) {
        this.OrgNodeId = OrgNodeId;
    }

    /**
     * Get 数据来源。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DataSource 数据来源。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDataSource() {
        return this.DataSource;
    }

    /**
     * Set 数据来源。
注意：此字段可能返回 null，表示取不到有效值。
     * @param DataSource 数据来源。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDataSource(String DataSource) {
        this.DataSource = DataSource;
    }

    /**
     * Get 用户过期时间，遵循 ISO 8601 标准。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExpirationTime 用户过期时间，遵循 ISO 8601 标准。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExpirationTime() {
        return this.ExpirationTime;
    }

    /**
     * Set 用户过期时间，遵循 ISO 8601 标准。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExpirationTime 用户过期时间，遵循 ISO 8601 标准。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExpirationTime(String ExpirationTime) {
        this.ExpirationTime = ExpirationTime;
    }

    /**
     * Get 用户激活时间，遵循 ISO 8601 标准。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ActivationTime 用户激活时间，遵循 ISO 8601 标准。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getActivationTime() {
        return this.ActivationTime;
    }

    /**
     * Set 用户激活时间，遵循 ISO 8601 标准。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ActivationTime 用户激活时间，遵循 ISO 8601 标准。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setActivationTime(String ActivationTime) {
        this.ActivationTime = ActivationTime;
    }

    /**
     * Get 当前用户的密码是否需要重置，该字段为false表示不需要重置密码。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PwdNeedReset 当前用户的密码是否需要重置，该字段为false表示不需要重置密码。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getPwdNeedReset() {
        return this.PwdNeedReset;
    }

    /**
     * Set 当前用户的密码是否需要重置，该字段为false表示不需要重置密码。
注意：此字段可能返回 null，表示取不到有效值。
     * @param PwdNeedReset 当前用户的密码是否需要重置，该字段为false表示不需要重置密码。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPwdNeedReset(Boolean PwdNeedReset) {
        this.PwdNeedReset = PwdNeedReset;
    }

    /**
     * Get 用户所属的次要组织机构ID列表。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SecondaryOrgNodeIdList 用户所属的次要组织机构ID列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getSecondaryOrgNodeIdList() {
        return this.SecondaryOrgNodeIdList;
    }

    /**
     * Set 用户所属的次要组织机构ID列表。
注意：此字段可能返回 null，表示取不到有效值。
     * @param SecondaryOrgNodeIdList 用户所属的次要组织机构ID列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSecondaryOrgNodeIdList(String [] SecondaryOrgNodeIdList) {
        this.SecondaryOrgNodeIdList = SecondaryOrgNodeIdList;
    }

    /**
     * Get 是否管理员标志，0为否、1为是。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AdminFlag 是否管理员标志，0为否、1为是。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAdminFlag() {
        return this.AdminFlag;
    }

    /**
     * Set 是否管理员标志，0为否、1为是。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AdminFlag 是否管理员标志，0为否、1为是。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAdminFlag(Long AdminFlag) {
        this.AdminFlag = AdminFlag;
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

    public DescribeUserInfoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeUserInfoResponse(DescribeUserInfoResponse source) {
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.DisplayName != null) {
            this.DisplayName = new String(source.DisplayName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.UserGroupIds != null) {
            this.UserGroupIds = new String[source.UserGroupIds.length];
            for (int i = 0; i < source.UserGroupIds.length; i++) {
                this.UserGroupIds[i] = new String(source.UserGroupIds[i]);
            }
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.Email != null) {
            this.Email = new String(source.Email);
        }
        if (source.Phone != null) {
            this.Phone = new String(source.Phone);
        }
        if (source.OrgNodeId != null) {
            this.OrgNodeId = new String(source.OrgNodeId);
        }
        if (source.DataSource != null) {
            this.DataSource = new String(source.DataSource);
        }
        if (source.ExpirationTime != null) {
            this.ExpirationTime = new String(source.ExpirationTime);
        }
        if (source.ActivationTime != null) {
            this.ActivationTime = new String(source.ActivationTime);
        }
        if (source.PwdNeedReset != null) {
            this.PwdNeedReset = new Boolean(source.PwdNeedReset);
        }
        if (source.SecondaryOrgNodeIdList != null) {
            this.SecondaryOrgNodeIdList = new String[source.SecondaryOrgNodeIdList.length];
            for (int i = 0; i < source.SecondaryOrgNodeIdList.length; i++) {
                this.SecondaryOrgNodeIdList[i] = new String(source.SecondaryOrgNodeIdList[i]);
            }
        }
        if (source.AdminFlag != null) {
            this.AdminFlag = new Long(source.AdminFlag);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "DisplayName", this.DisplayName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArraySimple(map, prefix + "UserGroupIds.", this.UserGroupIds);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "Email", this.Email);
        this.setParamSimple(map, prefix + "Phone", this.Phone);
        this.setParamSimple(map, prefix + "OrgNodeId", this.OrgNodeId);
        this.setParamSimple(map, prefix + "DataSource", this.DataSource);
        this.setParamSimple(map, prefix + "ExpirationTime", this.ExpirationTime);
        this.setParamSimple(map, prefix + "ActivationTime", this.ActivationTime);
        this.setParamSimple(map, prefix + "PwdNeedReset", this.PwdNeedReset);
        this.setParamArraySimple(map, prefix + "SecondaryOrgNodeIdList.", this.SecondaryOrgNodeIdList);
        this.setParamSimple(map, prefix + "AdminFlag", this.AdminFlag);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

