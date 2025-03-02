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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GroupOrganization extends AbstractModel {

    /**
    * 成员企业名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 成员企业别名
    */
    @SerializedName("Alias")
    @Expose
    private String Alias;

    /**
    * 成员企业id，为 32 位字符串，可在电子签PC 控制台，企业设置->企业电子签账号 获取
    */
    @SerializedName("OrganizationId")
    @Expose
    private String OrganizationId;

    /**
    * 记录更新时间， unix时间戳，单位秒
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
    * 成员企业加入集团的当前状态
<ul><li> **1**：待授权</li>
<li> **2**：已授权待激活</li>
<li> **3**：拒绝授权</li>
<li> **4**：已解除</li>
<li> **5**：已加入</li>
</ul>

    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 是否为集团主企业
    */
    @SerializedName("IsMainOrganization")
    @Expose
    private Boolean IsMainOrganization;

    /**
    * 企业社会信用代码
    */
    @SerializedName("IdCardNumber")
    @Expose
    private String IdCardNumber;

    /**
    * 企业超管信息
    */
    @SerializedName("AdminInfo")
    @Expose
    private Admin AdminInfo;

    /**
    * 企业许可证Id，此字段暂时不需要关注
    */
    @SerializedName("License")
    @Expose
    private String License;

    /**
    * 企业许可证过期时间，unix时间戳，单位秒
    */
    @SerializedName("LicenseExpireTime")
    @Expose
    private Long LicenseExpireTime;

    /**
    * 成员企业加入集团时间，unix时间戳，单位秒
    */
    @SerializedName("JoinTime")
    @Expose
    private Long JoinTime;

    /**
    * 是否使用自建审批流引擎（即不是企微审批流引擎）
<ul><li> **true**：是</li>
<li> **false**：否</li></ul>
    */
    @SerializedName("FlowEngineEnable")
    @Expose
    private Boolean FlowEngineEnable;

    /**
     * Get 成员企业名 
     * @return Name 成员企业名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 成员企业名
     * @param Name 成员企业名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 成员企业别名 
     * @return Alias 成员企业别名
     */
    public String getAlias() {
        return this.Alias;
    }

    /**
     * Set 成员企业别名
     * @param Alias 成员企业别名
     */
    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    /**
     * Get 成员企业id，为 32 位字符串，可在电子签PC 控制台，企业设置->企业电子签账号 获取 
     * @return OrganizationId 成员企业id，为 32 位字符串，可在电子签PC 控制台，企业设置->企业电子签账号 获取
     */
    public String getOrganizationId() {
        return this.OrganizationId;
    }

    /**
     * Set 成员企业id，为 32 位字符串，可在电子签PC 控制台，企业设置->企业电子签账号 获取
     * @param OrganizationId 成员企业id，为 32 位字符串，可在电子签PC 控制台，企业设置->企业电子签账号 获取
     */
    public void setOrganizationId(String OrganizationId) {
        this.OrganizationId = OrganizationId;
    }

    /**
     * Get 记录更新时间， unix时间戳，单位秒 
     * @return UpdateTime 记录更新时间， unix时间戳，单位秒
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 记录更新时间， unix时间戳，单位秒
     * @param UpdateTime 记录更新时间， unix时间戳，单位秒
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 成员企业加入集团的当前状态
<ul><li> **1**：待授权</li>
<li> **2**：已授权待激活</li>
<li> **3**：拒绝授权</li>
<li> **4**：已解除</li>
<li> **5**：已加入</li>
</ul>
 
     * @return Status 成员企业加入集团的当前状态
<ul><li> **1**：待授权</li>
<li> **2**：已授权待激活</li>
<li> **3**：拒绝授权</li>
<li> **4**：已解除</li>
<li> **5**：已加入</li>
</ul>

     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 成员企业加入集团的当前状态
<ul><li> **1**：待授权</li>
<li> **2**：已授权待激活</li>
<li> **3**：拒绝授权</li>
<li> **4**：已解除</li>
<li> **5**：已加入</li>
</ul>

     * @param Status 成员企业加入集团的当前状态
<ul><li> **1**：待授权</li>
<li> **2**：已授权待激活</li>
<li> **3**：拒绝授权</li>
<li> **4**：已解除</li>
<li> **5**：已加入</li>
</ul>

     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 是否为集团主企业 
     * @return IsMainOrganization 是否为集团主企业
     */
    public Boolean getIsMainOrganization() {
        return this.IsMainOrganization;
    }

    /**
     * Set 是否为集团主企业
     * @param IsMainOrganization 是否为集团主企业
     */
    public void setIsMainOrganization(Boolean IsMainOrganization) {
        this.IsMainOrganization = IsMainOrganization;
    }

    /**
     * Get 企业社会信用代码 
     * @return IdCardNumber 企业社会信用代码
     */
    public String getIdCardNumber() {
        return this.IdCardNumber;
    }

    /**
     * Set 企业社会信用代码
     * @param IdCardNumber 企业社会信用代码
     */
    public void setIdCardNumber(String IdCardNumber) {
        this.IdCardNumber = IdCardNumber;
    }

    /**
     * Get 企业超管信息 
     * @return AdminInfo 企业超管信息
     */
    public Admin getAdminInfo() {
        return this.AdminInfo;
    }

    /**
     * Set 企业超管信息
     * @param AdminInfo 企业超管信息
     */
    public void setAdminInfo(Admin AdminInfo) {
        this.AdminInfo = AdminInfo;
    }

    /**
     * Get 企业许可证Id，此字段暂时不需要关注 
     * @return License 企业许可证Id，此字段暂时不需要关注
     */
    public String getLicense() {
        return this.License;
    }

    /**
     * Set 企业许可证Id，此字段暂时不需要关注
     * @param License 企业许可证Id，此字段暂时不需要关注
     */
    public void setLicense(String License) {
        this.License = License;
    }

    /**
     * Get 企业许可证过期时间，unix时间戳，单位秒 
     * @return LicenseExpireTime 企业许可证过期时间，unix时间戳，单位秒
     */
    public Long getLicenseExpireTime() {
        return this.LicenseExpireTime;
    }

    /**
     * Set 企业许可证过期时间，unix时间戳，单位秒
     * @param LicenseExpireTime 企业许可证过期时间，unix时间戳，单位秒
     */
    public void setLicenseExpireTime(Long LicenseExpireTime) {
        this.LicenseExpireTime = LicenseExpireTime;
    }

    /**
     * Get 成员企业加入集团时间，unix时间戳，单位秒 
     * @return JoinTime 成员企业加入集团时间，unix时间戳，单位秒
     */
    public Long getJoinTime() {
        return this.JoinTime;
    }

    /**
     * Set 成员企业加入集团时间，unix时间戳，单位秒
     * @param JoinTime 成员企业加入集团时间，unix时间戳，单位秒
     */
    public void setJoinTime(Long JoinTime) {
        this.JoinTime = JoinTime;
    }

    /**
     * Get 是否使用自建审批流引擎（即不是企微审批流引擎）
<ul><li> **true**：是</li>
<li> **false**：否</li></ul> 
     * @return FlowEngineEnable 是否使用自建审批流引擎（即不是企微审批流引擎）
<ul><li> **true**：是</li>
<li> **false**：否</li></ul>
     */
    public Boolean getFlowEngineEnable() {
        return this.FlowEngineEnable;
    }

    /**
     * Set 是否使用自建审批流引擎（即不是企微审批流引擎）
<ul><li> **true**：是</li>
<li> **false**：否</li></ul>
     * @param FlowEngineEnable 是否使用自建审批流引擎（即不是企微审批流引擎）
<ul><li> **true**：是</li>
<li> **false**：否</li></ul>
     */
    public void setFlowEngineEnable(Boolean FlowEngineEnable) {
        this.FlowEngineEnable = FlowEngineEnable;
    }

    public GroupOrganization() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GroupOrganization(GroupOrganization source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Alias != null) {
            this.Alias = new String(source.Alias);
        }
        if (source.OrganizationId != null) {
            this.OrganizationId = new String(source.OrganizationId);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.IsMainOrganization != null) {
            this.IsMainOrganization = new Boolean(source.IsMainOrganization);
        }
        if (source.IdCardNumber != null) {
            this.IdCardNumber = new String(source.IdCardNumber);
        }
        if (source.AdminInfo != null) {
            this.AdminInfo = new Admin(source.AdminInfo);
        }
        if (source.License != null) {
            this.License = new String(source.License);
        }
        if (source.LicenseExpireTime != null) {
            this.LicenseExpireTime = new Long(source.LicenseExpireTime);
        }
        if (source.JoinTime != null) {
            this.JoinTime = new Long(source.JoinTime);
        }
        if (source.FlowEngineEnable != null) {
            this.FlowEngineEnable = new Boolean(source.FlowEngineEnable);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Alias", this.Alias);
        this.setParamSimple(map, prefix + "OrganizationId", this.OrganizationId);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "IsMainOrganization", this.IsMainOrganization);
        this.setParamSimple(map, prefix + "IdCardNumber", this.IdCardNumber);
        this.setParamObj(map, prefix + "AdminInfo.", this.AdminInfo);
        this.setParamSimple(map, prefix + "License", this.License);
        this.setParamSimple(map, prefix + "LicenseExpireTime", this.LicenseExpireTime);
        this.setParamSimple(map, prefix + "JoinTime", this.JoinTime);
        this.setParamSimple(map, prefix + "FlowEngineEnable", this.FlowEngineEnable);

    }
}

