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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SubUserInfo extends AbstractModel {

    /**
    * <p>主键ID，无业务意义仅作为唯一键</p>
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * <p>子账号Appid</p>
    */
    @SerializedName("AppID")
    @Expose
    private String AppID;

    /**
    * <p>子账号UIn</p>
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * <p>子账号名称</p>
    */
    @SerializedName("NickName")
    @Expose
    private String NickName;

    /**
    * <p>主账号Appid</p>
    */
    @SerializedName("OwnerAppID")
    @Expose
    private String OwnerAppID;

    /**
    * <p>主账号Uin</p>
    */
    @SerializedName("OwnerUin")
    @Expose
    private String OwnerUin;

    /**
    * <p>主账号名称</p>
    */
    @SerializedName("OwnerNickName")
    @Expose
    private String OwnerNickName;

    /**
    * <p>所属主账号memberId信息</p>
    */
    @SerializedName("OwnerMemberID")
    @Expose
    private String OwnerMemberID;

    /**
    * <p>账户类型，0为腾讯云账户，1为AWS账户</p>
    */
    @SerializedName("CloudType")
    @Expose
    private Long CloudType;

    /**
    * <p>可访问服务数量</p>
    */
    @SerializedName("ServiceCount")
    @Expose
    private Long ServiceCount;

    /**
    * <p>可访问接口数量</p>
    */
    @SerializedName("InterfaceCount")
    @Expose
    private Long InterfaceCount;

    /**
    * <p>可访问资源数量</p>
    */
    @SerializedName("AssetCount")
    @Expose
    private Long AssetCount;

    /**
    * <p>访问/行为日志数量</p>
    */
    @SerializedName("LogCount")
    @Expose
    private Long LogCount;

    /**
    * <p>权限配置风险</p>
    */
    @SerializedName("ConfigRiskCount")
    @Expose
    private Long ConfigRiskCount;

    /**
    * <p>危险行为告警</p>
    */
    @SerializedName("ActionRiskCount")
    @Expose
    private Long ActionRiskCount;

    /**
    * <p>是否接入操作审计日志</p>
    */
    @SerializedName("IsAccessCloudAudit")
    @Expose
    private Boolean IsAccessCloudAudit;

    /**
    * <p>是否配置风险的安全体检</p>
    */
    @SerializedName("IsAccessCheck")
    @Expose
    private Boolean IsAccessCheck;

    /**
    * <p>是否配置用户行为管理策略</p>
    */
    @SerializedName("IsAccessUeba")
    @Expose
    private Boolean IsAccessUeba;

    /**
    * <p>创建时间（Unix时间戳）</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
     * Get <p>主键ID，无业务意义仅作为唯一键</p> 
     * @return ID <p>主键ID，无业务意义仅作为唯一键</p>
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set <p>主键ID，无业务意义仅作为唯一键</p>
     * @param ID <p>主键ID，无业务意义仅作为唯一键</p>
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get <p>子账号Appid</p> 
     * @return AppID <p>子账号Appid</p>
     */
    public String getAppID() {
        return this.AppID;
    }

    /**
     * Set <p>子账号Appid</p>
     * @param AppID <p>子账号Appid</p>
     */
    public void setAppID(String AppID) {
        this.AppID = AppID;
    }

    /**
     * Get <p>子账号UIn</p> 
     * @return Uin <p>子账号UIn</p>
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set <p>子账号UIn</p>
     * @param Uin <p>子账号UIn</p>
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get <p>子账号名称</p> 
     * @return NickName <p>子账号名称</p>
     */
    public String getNickName() {
        return this.NickName;
    }

    /**
     * Set <p>子账号名称</p>
     * @param NickName <p>子账号名称</p>
     */
    public void setNickName(String NickName) {
        this.NickName = NickName;
    }

    /**
     * Get <p>主账号Appid</p> 
     * @return OwnerAppID <p>主账号Appid</p>
     */
    public String getOwnerAppID() {
        return this.OwnerAppID;
    }

    /**
     * Set <p>主账号Appid</p>
     * @param OwnerAppID <p>主账号Appid</p>
     */
    public void setOwnerAppID(String OwnerAppID) {
        this.OwnerAppID = OwnerAppID;
    }

    /**
     * Get <p>主账号Uin</p> 
     * @return OwnerUin <p>主账号Uin</p>
     */
    public String getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set <p>主账号Uin</p>
     * @param OwnerUin <p>主账号Uin</p>
     */
    public void setOwnerUin(String OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get <p>主账号名称</p> 
     * @return OwnerNickName <p>主账号名称</p>
     */
    public String getOwnerNickName() {
        return this.OwnerNickName;
    }

    /**
     * Set <p>主账号名称</p>
     * @param OwnerNickName <p>主账号名称</p>
     */
    public void setOwnerNickName(String OwnerNickName) {
        this.OwnerNickName = OwnerNickName;
    }

    /**
     * Get <p>所属主账号memberId信息</p> 
     * @return OwnerMemberID <p>所属主账号memberId信息</p>
     */
    public String getOwnerMemberID() {
        return this.OwnerMemberID;
    }

    /**
     * Set <p>所属主账号memberId信息</p>
     * @param OwnerMemberID <p>所属主账号memberId信息</p>
     */
    public void setOwnerMemberID(String OwnerMemberID) {
        this.OwnerMemberID = OwnerMemberID;
    }

    /**
     * Get <p>账户类型，0为腾讯云账户，1为AWS账户</p> 
     * @return CloudType <p>账户类型，0为腾讯云账户，1为AWS账户</p>
     */
    public Long getCloudType() {
        return this.CloudType;
    }

    /**
     * Set <p>账户类型，0为腾讯云账户，1为AWS账户</p>
     * @param CloudType <p>账户类型，0为腾讯云账户，1为AWS账户</p>
     */
    public void setCloudType(Long CloudType) {
        this.CloudType = CloudType;
    }

    /**
     * Get <p>可访问服务数量</p> 
     * @return ServiceCount <p>可访问服务数量</p>
     */
    public Long getServiceCount() {
        return this.ServiceCount;
    }

    /**
     * Set <p>可访问服务数量</p>
     * @param ServiceCount <p>可访问服务数量</p>
     */
    public void setServiceCount(Long ServiceCount) {
        this.ServiceCount = ServiceCount;
    }

    /**
     * Get <p>可访问接口数量</p> 
     * @return InterfaceCount <p>可访问接口数量</p>
     */
    public Long getInterfaceCount() {
        return this.InterfaceCount;
    }

    /**
     * Set <p>可访问接口数量</p>
     * @param InterfaceCount <p>可访问接口数量</p>
     */
    public void setInterfaceCount(Long InterfaceCount) {
        this.InterfaceCount = InterfaceCount;
    }

    /**
     * Get <p>可访问资源数量</p> 
     * @return AssetCount <p>可访问资源数量</p>
     */
    public Long getAssetCount() {
        return this.AssetCount;
    }

    /**
     * Set <p>可访问资源数量</p>
     * @param AssetCount <p>可访问资源数量</p>
     */
    public void setAssetCount(Long AssetCount) {
        this.AssetCount = AssetCount;
    }

    /**
     * Get <p>访问/行为日志数量</p> 
     * @return LogCount <p>访问/行为日志数量</p>
     */
    public Long getLogCount() {
        return this.LogCount;
    }

    /**
     * Set <p>访问/行为日志数量</p>
     * @param LogCount <p>访问/行为日志数量</p>
     */
    public void setLogCount(Long LogCount) {
        this.LogCount = LogCount;
    }

    /**
     * Get <p>权限配置风险</p> 
     * @return ConfigRiskCount <p>权限配置风险</p>
     */
    public Long getConfigRiskCount() {
        return this.ConfigRiskCount;
    }

    /**
     * Set <p>权限配置风险</p>
     * @param ConfigRiskCount <p>权限配置风险</p>
     */
    public void setConfigRiskCount(Long ConfigRiskCount) {
        this.ConfigRiskCount = ConfigRiskCount;
    }

    /**
     * Get <p>危险行为告警</p> 
     * @return ActionRiskCount <p>危险行为告警</p>
     */
    public Long getActionRiskCount() {
        return this.ActionRiskCount;
    }

    /**
     * Set <p>危险行为告警</p>
     * @param ActionRiskCount <p>危险行为告警</p>
     */
    public void setActionRiskCount(Long ActionRiskCount) {
        this.ActionRiskCount = ActionRiskCount;
    }

    /**
     * Get <p>是否接入操作审计日志</p> 
     * @return IsAccessCloudAudit <p>是否接入操作审计日志</p>
     */
    public Boolean getIsAccessCloudAudit() {
        return this.IsAccessCloudAudit;
    }

    /**
     * Set <p>是否接入操作审计日志</p>
     * @param IsAccessCloudAudit <p>是否接入操作审计日志</p>
     */
    public void setIsAccessCloudAudit(Boolean IsAccessCloudAudit) {
        this.IsAccessCloudAudit = IsAccessCloudAudit;
    }

    /**
     * Get <p>是否配置风险的安全体检</p> 
     * @return IsAccessCheck <p>是否配置风险的安全体检</p>
     */
    public Boolean getIsAccessCheck() {
        return this.IsAccessCheck;
    }

    /**
     * Set <p>是否配置风险的安全体检</p>
     * @param IsAccessCheck <p>是否配置风险的安全体检</p>
     */
    public void setIsAccessCheck(Boolean IsAccessCheck) {
        this.IsAccessCheck = IsAccessCheck;
    }

    /**
     * Get <p>是否配置用户行为管理策略</p> 
     * @return IsAccessUeba <p>是否配置用户行为管理策略</p>
     */
    public Boolean getIsAccessUeba() {
        return this.IsAccessUeba;
    }

    /**
     * Set <p>是否配置用户行为管理策略</p>
     * @param IsAccessUeba <p>是否配置用户行为管理策略</p>
     */
    public void setIsAccessUeba(Boolean IsAccessUeba) {
        this.IsAccessUeba = IsAccessUeba;
    }

    /**
     * Get <p>创建时间（Unix时间戳）</p> 
     * @return CreateTime <p>创建时间（Unix时间戳）</p>
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间（Unix时间戳）</p>
     * @param CreateTime <p>创建时间（Unix时间戳）</p>
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
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
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
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
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);

    }
}

