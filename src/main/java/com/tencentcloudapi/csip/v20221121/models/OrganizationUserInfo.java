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

public class OrganizationUserInfo extends AbstractModel {

    /**
    * 成员账号Uin
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * 成员账号名称
    */
    @SerializedName("NickName")
    @Expose
    private String NickName;

    /**
    * 部门节点名称，账号所属部门
    */
    @SerializedName("NodeName")
    @Expose
    private String NodeName;

    /**
    * 资产数量
    */
    @SerializedName("AssetCount")
    @Expose
    private Long AssetCount;

    /**
    * 风险数量
    */
    @SerializedName("RiskCount")
    @Expose
    private Long RiskCount;

    /**
    * 攻击数量
    */
    @SerializedName("AttackCount")
    @Expose
    private Long AttackCount;

    /**
    * Member/Admin/;成员或者管理员
    */
    @SerializedName("Role")
    @Expose
    private String Role;

    /**
    * 成员账号id
    */
    @SerializedName("MemberId")
    @Expose
    private String MemberId;

    /**
    * 成员账号Appid
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * 账号加入方式,create/invite
    */
    @SerializedName("JoinType")
    @Expose
    private String JoinType;

    /**
    * 空则未开启，否则不同字符串对应不同版本，common为通用，不区分版本
    */
    @SerializedName("CFWProtect")
    @Expose
    private String CFWProtect;

    /**
    * 空则未开启，否则不同字符串对应不同版本，common为通用，不区分版本
    */
    @SerializedName("WAFProtect")
    @Expose
    private String WAFProtect;

    /**
    * 空则未开启，否则不同字符串对应不同版本，common为通用，不区分版本
    */
    @SerializedName("CWPProtect")
    @Expose
    private String CWPProtect;

    /**
    * 1启用，0未启用
    */
    @SerializedName("Enable")
    @Expose
    private Long Enable;

    /**
    * "Free"       //免费版  "Advanced"   //高级版 "Enterprise" //企业版 "Ultimate"   //旗舰版
    */
    @SerializedName("CSIPProtect")
    @Expose
    private String CSIPProtect;

    /**
    * 1为配额消耗者
    */
    @SerializedName("QuotaConsumer")
    @Expose
    private Long QuotaConsumer;

    /**
    * 账户类型，0为腾讯云账户，1为AWS账户
    */
    @SerializedName("CloudType")
    @Expose
    private Long CloudType;

    /**
    * 0为缺省值，1为10分钟，2为1小时，3为24小时
    */
    @SerializedName("SyncFrequency")
    @Expose
    private Long SyncFrequency;

    /**
    * 多云账户是否过期
    */
    @SerializedName("IsExpired")
    @Expose
    private Boolean IsExpired;

    /**
    * 多云账户 权限列表
    */
    @SerializedName("PermissionList")
    @Expose
    private String [] PermissionList;

    /**
    * 1
    */
    @SerializedName("AuthType")
    @Expose
    private Long AuthType;

    /**
    * 0 腾讯云集团账户
1 腾讯云接入账户
2 非腾讯云
    */
    @SerializedName("TcMemberType")
    @Expose
    private Long TcMemberType;

    /**
    * 子账号数量
    */
    @SerializedName("SubUserCount")
    @Expose
    private Long SubUserCount;

    /**
    * 加入方式详细信息
    */
    @SerializedName("JoinTypeInfo")
    @Expose
    private String JoinTypeInfo;

    /**
     * Get 成员账号Uin 
     * @return Uin 成员账号Uin
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set 成员账号Uin
     * @param Uin 成员账号Uin
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get 成员账号名称 
     * @return NickName 成员账号名称
     */
    public String getNickName() {
        return this.NickName;
    }

    /**
     * Set 成员账号名称
     * @param NickName 成员账号名称
     */
    public void setNickName(String NickName) {
        this.NickName = NickName;
    }

    /**
     * Get 部门节点名称，账号所属部门 
     * @return NodeName 部门节点名称，账号所属部门
     */
    public String getNodeName() {
        return this.NodeName;
    }

    /**
     * Set 部门节点名称，账号所属部门
     * @param NodeName 部门节点名称，账号所属部门
     */
    public void setNodeName(String NodeName) {
        this.NodeName = NodeName;
    }

    /**
     * Get 资产数量 
     * @return AssetCount 资产数量
     */
    public Long getAssetCount() {
        return this.AssetCount;
    }

    /**
     * Set 资产数量
     * @param AssetCount 资产数量
     */
    public void setAssetCount(Long AssetCount) {
        this.AssetCount = AssetCount;
    }

    /**
     * Get 风险数量 
     * @return RiskCount 风险数量
     */
    public Long getRiskCount() {
        return this.RiskCount;
    }

    /**
     * Set 风险数量
     * @param RiskCount 风险数量
     */
    public void setRiskCount(Long RiskCount) {
        this.RiskCount = RiskCount;
    }

    /**
     * Get 攻击数量 
     * @return AttackCount 攻击数量
     */
    public Long getAttackCount() {
        return this.AttackCount;
    }

    /**
     * Set 攻击数量
     * @param AttackCount 攻击数量
     */
    public void setAttackCount(Long AttackCount) {
        this.AttackCount = AttackCount;
    }

    /**
     * Get Member/Admin/;成员或者管理员 
     * @return Role Member/Admin/;成员或者管理员
     */
    public String getRole() {
        return this.Role;
    }

    /**
     * Set Member/Admin/;成员或者管理员
     * @param Role Member/Admin/;成员或者管理员
     */
    public void setRole(String Role) {
        this.Role = Role;
    }

    /**
     * Get 成员账号id 
     * @return MemberId 成员账号id
     */
    public String getMemberId() {
        return this.MemberId;
    }

    /**
     * Set 成员账号id
     * @param MemberId 成员账号id
     */
    public void setMemberId(String MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get 成员账号Appid 
     * @return AppId 成员账号Appid
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set 成员账号Appid
     * @param AppId 成员账号Appid
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 账号加入方式,create/invite 
     * @return JoinType 账号加入方式,create/invite
     */
    public String getJoinType() {
        return this.JoinType;
    }

    /**
     * Set 账号加入方式,create/invite
     * @param JoinType 账号加入方式,create/invite
     */
    public void setJoinType(String JoinType) {
        this.JoinType = JoinType;
    }

    /**
     * Get 空则未开启，否则不同字符串对应不同版本，common为通用，不区分版本 
     * @return CFWProtect 空则未开启，否则不同字符串对应不同版本，common为通用，不区分版本
     */
    public String getCFWProtect() {
        return this.CFWProtect;
    }

    /**
     * Set 空则未开启，否则不同字符串对应不同版本，common为通用，不区分版本
     * @param CFWProtect 空则未开启，否则不同字符串对应不同版本，common为通用，不区分版本
     */
    public void setCFWProtect(String CFWProtect) {
        this.CFWProtect = CFWProtect;
    }

    /**
     * Get 空则未开启，否则不同字符串对应不同版本，common为通用，不区分版本 
     * @return WAFProtect 空则未开启，否则不同字符串对应不同版本，common为通用，不区分版本
     */
    public String getWAFProtect() {
        return this.WAFProtect;
    }

    /**
     * Set 空则未开启，否则不同字符串对应不同版本，common为通用，不区分版本
     * @param WAFProtect 空则未开启，否则不同字符串对应不同版本，common为通用，不区分版本
     */
    public void setWAFProtect(String WAFProtect) {
        this.WAFProtect = WAFProtect;
    }

    /**
     * Get 空则未开启，否则不同字符串对应不同版本，common为通用，不区分版本 
     * @return CWPProtect 空则未开启，否则不同字符串对应不同版本，common为通用，不区分版本
     */
    public String getCWPProtect() {
        return this.CWPProtect;
    }

    /**
     * Set 空则未开启，否则不同字符串对应不同版本，common为通用，不区分版本
     * @param CWPProtect 空则未开启，否则不同字符串对应不同版本，common为通用，不区分版本
     */
    public void setCWPProtect(String CWPProtect) {
        this.CWPProtect = CWPProtect;
    }

    /**
     * Get 1启用，0未启用 
     * @return Enable 1启用，0未启用
     */
    public Long getEnable() {
        return this.Enable;
    }

    /**
     * Set 1启用，0未启用
     * @param Enable 1启用，0未启用
     */
    public void setEnable(Long Enable) {
        this.Enable = Enable;
    }

    /**
     * Get "Free"       //免费版  "Advanced"   //高级版 "Enterprise" //企业版 "Ultimate"   //旗舰版 
     * @return CSIPProtect "Free"       //免费版  "Advanced"   //高级版 "Enterprise" //企业版 "Ultimate"   //旗舰版
     */
    public String getCSIPProtect() {
        return this.CSIPProtect;
    }

    /**
     * Set "Free"       //免费版  "Advanced"   //高级版 "Enterprise" //企业版 "Ultimate"   //旗舰版
     * @param CSIPProtect "Free"       //免费版  "Advanced"   //高级版 "Enterprise" //企业版 "Ultimate"   //旗舰版
     */
    public void setCSIPProtect(String CSIPProtect) {
        this.CSIPProtect = CSIPProtect;
    }

    /**
     * Get 1为配额消耗者 
     * @return QuotaConsumer 1为配额消耗者
     */
    public Long getQuotaConsumer() {
        return this.QuotaConsumer;
    }

    /**
     * Set 1为配额消耗者
     * @param QuotaConsumer 1为配额消耗者
     */
    public void setQuotaConsumer(Long QuotaConsumer) {
        this.QuotaConsumer = QuotaConsumer;
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
     * Get 0为缺省值，1为10分钟，2为1小时，3为24小时 
     * @return SyncFrequency 0为缺省值，1为10分钟，2为1小时，3为24小时
     */
    public Long getSyncFrequency() {
        return this.SyncFrequency;
    }

    /**
     * Set 0为缺省值，1为10分钟，2为1小时，3为24小时
     * @param SyncFrequency 0为缺省值，1为10分钟，2为1小时，3为24小时
     */
    public void setSyncFrequency(Long SyncFrequency) {
        this.SyncFrequency = SyncFrequency;
    }

    /**
     * Get 多云账户是否过期 
     * @return IsExpired 多云账户是否过期
     */
    public Boolean getIsExpired() {
        return this.IsExpired;
    }

    /**
     * Set 多云账户是否过期
     * @param IsExpired 多云账户是否过期
     */
    public void setIsExpired(Boolean IsExpired) {
        this.IsExpired = IsExpired;
    }

    /**
     * Get 多云账户 权限列表 
     * @return PermissionList 多云账户 权限列表
     */
    public String [] getPermissionList() {
        return this.PermissionList;
    }

    /**
     * Set 多云账户 权限列表
     * @param PermissionList 多云账户 权限列表
     */
    public void setPermissionList(String [] PermissionList) {
        this.PermissionList = PermissionList;
    }

    /**
     * Get 1 
     * @return AuthType 1
     */
    public Long getAuthType() {
        return this.AuthType;
    }

    /**
     * Set 1
     * @param AuthType 1
     */
    public void setAuthType(Long AuthType) {
        this.AuthType = AuthType;
    }

    /**
     * Get 0 腾讯云集团账户
1 腾讯云接入账户
2 非腾讯云 
     * @return TcMemberType 0 腾讯云集团账户
1 腾讯云接入账户
2 非腾讯云
     */
    public Long getTcMemberType() {
        return this.TcMemberType;
    }

    /**
     * Set 0 腾讯云集团账户
1 腾讯云接入账户
2 非腾讯云
     * @param TcMemberType 0 腾讯云集团账户
1 腾讯云接入账户
2 非腾讯云
     */
    public void setTcMemberType(Long TcMemberType) {
        this.TcMemberType = TcMemberType;
    }

    /**
     * Get 子账号数量 
     * @return SubUserCount 子账号数量
     */
    public Long getSubUserCount() {
        return this.SubUserCount;
    }

    /**
     * Set 子账号数量
     * @param SubUserCount 子账号数量
     */
    public void setSubUserCount(Long SubUserCount) {
        this.SubUserCount = SubUserCount;
    }

    /**
     * Get 加入方式详细信息 
     * @return JoinTypeInfo 加入方式详细信息
     */
    public String getJoinTypeInfo() {
        return this.JoinTypeInfo;
    }

    /**
     * Set 加入方式详细信息
     * @param JoinTypeInfo 加入方式详细信息
     */
    public void setJoinTypeInfo(String JoinTypeInfo) {
        this.JoinTypeInfo = JoinTypeInfo;
    }

    public OrganizationUserInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OrganizationUserInfo(OrganizationUserInfo source) {
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.NickName != null) {
            this.NickName = new String(source.NickName);
        }
        if (source.NodeName != null) {
            this.NodeName = new String(source.NodeName);
        }
        if (source.AssetCount != null) {
            this.AssetCount = new Long(source.AssetCount);
        }
        if (source.RiskCount != null) {
            this.RiskCount = new Long(source.RiskCount);
        }
        if (source.AttackCount != null) {
            this.AttackCount = new Long(source.AttackCount);
        }
        if (source.Role != null) {
            this.Role = new String(source.Role);
        }
        if (source.MemberId != null) {
            this.MemberId = new String(source.MemberId);
        }
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.JoinType != null) {
            this.JoinType = new String(source.JoinType);
        }
        if (source.CFWProtect != null) {
            this.CFWProtect = new String(source.CFWProtect);
        }
        if (source.WAFProtect != null) {
            this.WAFProtect = new String(source.WAFProtect);
        }
        if (source.CWPProtect != null) {
            this.CWPProtect = new String(source.CWPProtect);
        }
        if (source.Enable != null) {
            this.Enable = new Long(source.Enable);
        }
        if (source.CSIPProtect != null) {
            this.CSIPProtect = new String(source.CSIPProtect);
        }
        if (source.QuotaConsumer != null) {
            this.QuotaConsumer = new Long(source.QuotaConsumer);
        }
        if (source.CloudType != null) {
            this.CloudType = new Long(source.CloudType);
        }
        if (source.SyncFrequency != null) {
            this.SyncFrequency = new Long(source.SyncFrequency);
        }
        if (source.IsExpired != null) {
            this.IsExpired = new Boolean(source.IsExpired);
        }
        if (source.PermissionList != null) {
            this.PermissionList = new String[source.PermissionList.length];
            for (int i = 0; i < source.PermissionList.length; i++) {
                this.PermissionList[i] = new String(source.PermissionList[i]);
            }
        }
        if (source.AuthType != null) {
            this.AuthType = new Long(source.AuthType);
        }
        if (source.TcMemberType != null) {
            this.TcMemberType = new Long(source.TcMemberType);
        }
        if (source.SubUserCount != null) {
            this.SubUserCount = new Long(source.SubUserCount);
        }
        if (source.JoinTypeInfo != null) {
            this.JoinTypeInfo = new String(source.JoinTypeInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "NickName", this.NickName);
        this.setParamSimple(map, prefix + "NodeName", this.NodeName);
        this.setParamSimple(map, prefix + "AssetCount", this.AssetCount);
        this.setParamSimple(map, prefix + "RiskCount", this.RiskCount);
        this.setParamSimple(map, prefix + "AttackCount", this.AttackCount);
        this.setParamSimple(map, prefix + "Role", this.Role);
        this.setParamSimple(map, prefix + "MemberId", this.MemberId);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "JoinType", this.JoinType);
        this.setParamSimple(map, prefix + "CFWProtect", this.CFWProtect);
        this.setParamSimple(map, prefix + "WAFProtect", this.WAFProtect);
        this.setParamSimple(map, prefix + "CWPProtect", this.CWPProtect);
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "CSIPProtect", this.CSIPProtect);
        this.setParamSimple(map, prefix + "QuotaConsumer", this.QuotaConsumer);
        this.setParamSimple(map, prefix + "CloudType", this.CloudType);
        this.setParamSimple(map, prefix + "SyncFrequency", this.SyncFrequency);
        this.setParamSimple(map, prefix + "IsExpired", this.IsExpired);
        this.setParamArraySimple(map, prefix + "PermissionList.", this.PermissionList);
        this.setParamSimple(map, prefix + "AuthType", this.AuthType);
        this.setParamSimple(map, prefix + "TcMemberType", this.TcMemberType);
        this.setParamSimple(map, prefix + "SubUserCount", this.SubUserCount);
        this.setParamSimple(map, prefix + "JoinTypeInfo", this.JoinTypeInfo);

    }
}

