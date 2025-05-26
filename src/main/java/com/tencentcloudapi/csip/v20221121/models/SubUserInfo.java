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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SubUserInfo extends AbstractModel {

    /**
    * 主键ID，无业务意义仅作为唯一键
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * 子账号Appid
    */
    @SerializedName("AppID")
    @Expose
    private String AppID;

    /**
    * 子账号UIn
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * 子账号名称
    */
    @SerializedName("NickName")
    @Expose
    private String NickName;

    /**
    * 主账号Appid
    */
    @SerializedName("OwnerAppID")
    @Expose
    private String OwnerAppID;

    /**
    * 主账号Uin
    */
    @SerializedName("OwnerUin")
    @Expose
    private String OwnerUin;

    /**
    * 主账号名称
    */
    @SerializedName("OwnerNickName")
    @Expose
    private String OwnerNickName;

    /**
    * 所属主账号memberId信息
    */
    @SerializedName("OwnerMemberID")
    @Expose
    private String OwnerMemberID;

    /**
    * 账户类型，0为腾讯云账户，1为AWS账户
    */
    @SerializedName("CloudType")
    @Expose
    private Long CloudType;

    /**
    * 可访问服务数量
    */
    @SerializedName("ServiceCount")
    @Expose
    private Long ServiceCount;

    /**
    * 可访问接口数量
    */
    @SerializedName("InterfaceCount")
    @Expose
    private Long InterfaceCount;

    /**
    * 可访问资源数量
    */
    @SerializedName("AssetCount")
    @Expose
    private Long AssetCount;

    /**
    * 访问/行为日志数量
    */
    @SerializedName("LogCount")
    @Expose
    private Long LogCount;

    /**
    * 权限配置风险
    */
    @SerializedName("ConfigRiskCount")
    @Expose
    private Long ConfigRiskCount;

    /**
    * 危险行为告警
    */
    @SerializedName("ActionRiskCount")
    @Expose
    private Long ActionRiskCount;

    /**
    * 是否接入云审计日志
    */
    @SerializedName("IsAccessCloudAudit")
    @Expose
    private Boolean IsAccessCloudAudit;

    /**
    * 是否配置风险的安全体检
    */
    @SerializedName("IsAccessCheck")
    @Expose
    private Boolean IsAccessCheck;

    /**
    * 是否配置用户行为管理策略
    */
    @SerializedName("IsAccessUeba")
    @Expose
    private Boolean IsAccessUeba;

    /**
     * Get 主键ID，无业务意义仅作为唯一键 
     * @return ID 主键ID，无业务意义仅作为唯一键
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set 主键ID，无业务意义仅作为唯一键
     * @param ID 主键ID，无业务意义仅作为唯一键
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get 子账号Appid 
     * @return AppID 子账号Appid
     */
    public String getAppID() {
        return this.AppID;
    }

    /**
     * Set 子账号Appid
     * @param AppID 子账号Appid
     */
    public void setAppID(String AppID) {
        this.AppID = AppID;
    }

    /**
     * Get 子账号UIn 
     * @return Uin 子账号UIn
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set 子账号UIn
     * @param Uin 子账号UIn
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get 子账号名称 
     * @return NickName 子账号名称
     */
    public String getNickName() {
        return this.NickName;
    }

    /**
     * Set 子账号名称
     * @param NickName 子账号名称
     */
    public void setNickName(String NickName) {
        this.NickName = NickName;
    }

    /**
     * Get 主账号Appid 
     * @return OwnerAppID 主账号Appid
     */
    public String getOwnerAppID() {
        return this.OwnerAppID;
    }

    /**
     * Set 主账号Appid
     * @param OwnerAppID 主账号Appid
     */
    public void setOwnerAppID(String OwnerAppID) {
        this.OwnerAppID = OwnerAppID;
    }

    /**
     * Get 主账号Uin 
     * @return OwnerUin 主账号Uin
     */
    public String getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set 主账号Uin
     * @param OwnerUin 主账号Uin
     */
    public void setOwnerUin(String OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get 主账号名称 
     * @return OwnerNickName 主账号名称
     */
    public String getOwnerNickName() {
        return this.OwnerNickName;
    }

    /**
     * Set 主账号名称
     * @param OwnerNickName 主账号名称
     */
    public void setOwnerNickName(String OwnerNickName) {
        this.OwnerNickName = OwnerNickName;
    }

    /**
     * Get 所属主账号memberId信息 
     * @return OwnerMemberID 所属主账号memberId信息
     */
    public String getOwnerMemberID() {
        return this.OwnerMemberID;
    }

    /**
     * Set 所属主账号memberId信息
     * @param OwnerMemberID 所属主账号memberId信息
     */
    public void setOwnerMemberID(String OwnerMemberID) {
        this.OwnerMemberID = OwnerMemberID;
    }

    /**
     * Get 账户类型，0为腾讯云账户，1为AWS账户 
     * @return CloudType 账户类型，0为腾讯云账户，1为AWS账户
     */
    public Long getCloudType() {
        return this.CloudType;
    }

    /**
     * Set 账户类型，0为腾讯云账户，1为AWS账户
     * @param CloudType 账户类型，0为腾讯云账户，1为AWS账户
     */
    public void setCloudType(Long CloudType) {
        this.CloudType = CloudType;
    }

    /**
     * Get 可访问服务数量 
     * @return ServiceCount 可访问服务数量
     */
    public Long getServiceCount() {
        return this.ServiceCount;
    }

    /**
     * Set 可访问服务数量
     * @param ServiceCount 可访问服务数量
     */
    public void setServiceCount(Long ServiceCount) {
        this.ServiceCount = ServiceCount;
    }

    /**
     * Get 可访问接口数量 
     * @return InterfaceCount 可访问接口数量
     */
    public Long getInterfaceCount() {
        return this.InterfaceCount;
    }

    /**
     * Set 可访问接口数量
     * @param InterfaceCount 可访问接口数量
     */
    public void setInterfaceCount(Long InterfaceCount) {
        this.InterfaceCount = InterfaceCount;
    }

    /**
     * Get 可访问资源数量 
     * @return AssetCount 可访问资源数量
     */
    public Long getAssetCount() {
        return this.AssetCount;
    }

    /**
     * Set 可访问资源数量
     * @param AssetCount 可访问资源数量
     */
    public void setAssetCount(Long AssetCount) {
        this.AssetCount = AssetCount;
    }

    /**
     * Get 访问/行为日志数量 
     * @return LogCount 访问/行为日志数量
     */
    public Long getLogCount() {
        return this.LogCount;
    }

    /**
     * Set 访问/行为日志数量
     * @param LogCount 访问/行为日志数量
     */
    public void setLogCount(Long LogCount) {
        this.LogCount = LogCount;
    }

    /**
     * Get 权限配置风险 
     * @return ConfigRiskCount 权限配置风险
     */
    public Long getConfigRiskCount() {
        return this.ConfigRiskCount;
    }

    /**
     * Set 权限配置风险
     * @param ConfigRiskCount 权限配置风险
     */
    public void setConfigRiskCount(Long ConfigRiskCount) {
        this.ConfigRiskCount = ConfigRiskCount;
    }

    /**
     * Get 危险行为告警 
     * @return ActionRiskCount 危险行为告警
     */
    public Long getActionRiskCount() {
        return this.ActionRiskCount;
    }

    /**
     * Set 危险行为告警
     * @param ActionRiskCount 危险行为告警
     */
    public void setActionRiskCount(Long ActionRiskCount) {
        this.ActionRiskCount = ActionRiskCount;
    }

    /**
     * Get 是否接入云审计日志 
     * @return IsAccessCloudAudit 是否接入云审计日志
     */
    public Boolean getIsAccessCloudAudit() {
        return this.IsAccessCloudAudit;
    }

    /**
     * Set 是否接入云审计日志
     * @param IsAccessCloudAudit 是否接入云审计日志
     */
    public void setIsAccessCloudAudit(Boolean IsAccessCloudAudit) {
        this.IsAccessCloudAudit = IsAccessCloudAudit;
    }

    /**
     * Get 是否配置风险的安全体检 
     * @return IsAccessCheck 是否配置风险的安全体检
     */
    public Boolean getIsAccessCheck() {
        return this.IsAccessCheck;
    }

    /**
     * Set 是否配置风险的安全体检
     * @param IsAccessCheck 是否配置风险的安全体检
     */
    public void setIsAccessCheck(Boolean IsAccessCheck) {
        this.IsAccessCheck = IsAccessCheck;
    }

    /**
     * Get 是否配置用户行为管理策略 
     * @return IsAccessUeba 是否配置用户行为管理策略
     */
    public Boolean getIsAccessUeba() {
        return this.IsAccessUeba;
    }

    /**
     * Set 是否配置用户行为管理策略
     * @param IsAccessUeba 是否配置用户行为管理策略
     */
    public void setIsAccessUeba(Boolean IsAccessUeba) {
        this.IsAccessUeba = IsAccessUeba;
    }

    public SubUserInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubUserInfo(SubUserInfo source) {
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.AppID != null) {
            this.AppID = new String(source.AppID);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.NickName != null) {
            this.NickName = new String(source.NickName);
        }
        if (source.OwnerAppID != null) {
            this.OwnerAppID = new String(source.OwnerAppID);
        }
        if (source.OwnerUin != null) {
            this.OwnerUin = new String(source.OwnerUin);
        }
        if (source.OwnerNickName != null) {
            this.OwnerNickName = new String(source.OwnerNickName);
        }
        if (source.OwnerMemberID != null) {
            this.OwnerMemberID = new String(source.OwnerMemberID);
        }
        if (source.CloudType != null) {
            this.CloudType = new Long(source.CloudType);
        }
        if (source.ServiceCount != null) {
            this.ServiceCount = new Long(source.ServiceCount);
        }
        if (source.InterfaceCount != null) {
            this.InterfaceCount = new Long(source.InterfaceCount);
        }
        if (source.AssetCount != null) {
            this.AssetCount = new Long(source.AssetCount);
        }
        if (source.LogCount != null) {
            this.LogCount = new Long(source.LogCount);
        }
        if (source.ConfigRiskCount != null) {
            this.ConfigRiskCount = new Long(source.ConfigRiskCount);
        }
        if (source.ActionRiskCount != null) {
            this.ActionRiskCount = new Long(source.ActionRiskCount);
        }
        if (source.IsAccessCloudAudit != null) {
            this.IsAccessCloudAudit = new Boolean(source.IsAccessCloudAudit);
        }
        if (source.IsAccessCheck != null) {
            this.IsAccessCheck = new Boolean(source.IsAccessCheck);
        }
        if (source.IsAccessUeba != null) {
            this.IsAccessUeba = new Boolean(source.IsAccessUeba);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "AppID", this.AppID);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "NickName", this.NickName);
        this.setParamSimple(map, prefix + "OwnerAppID", this.OwnerAppID);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamSimple(map, prefix + "OwnerNickName", this.OwnerNickName);
        this.setParamSimple(map, prefix + "OwnerMemberID", this.OwnerMemberID);
        this.setParamSimple(map, prefix + "CloudType", this.CloudType);
        this.setParamSimple(map, prefix + "ServiceCount", this.ServiceCount);
        this.setParamSimple(map, prefix + "InterfaceCount", this.InterfaceCount);
        this.setParamSimple(map, prefix + "AssetCount", this.AssetCount);
        this.setParamSimple(map, prefix + "LogCount", this.LogCount);
        this.setParamSimple(map, prefix + "ConfigRiskCount", this.ConfigRiskCount);
        this.setParamSimple(map, prefix + "ActionRiskCount", this.ActionRiskCount);
        this.setParamSimple(map, prefix + "IsAccessCloudAudit", this.IsAccessCloudAudit);
        this.setParamSimple(map, prefix + "IsAccessCheck", this.IsAccessCheck);
        this.setParamSimple(map, prefix + "IsAccessUeba", this.IsAccessUeba);

    }
}

