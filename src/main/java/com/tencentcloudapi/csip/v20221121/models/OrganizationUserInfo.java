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

public class OrganizationUserInfo extends AbstractModel {

    /**
    * 成员账号Uin
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * 成员账号名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NickName")
    @Expose
    private String NickName;

    /**
    * 部门节点名称，账号所属部门
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NodeName")
    @Expose
    private String NodeName;

    /**
    * 资产数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AssetCount")
    @Expose
    private Long AssetCount;

    /**
    * 风险数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RiskCount")
    @Expose
    private Long RiskCount;

    /**
    * 攻击数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AttackCount")
    @Expose
    private Long AttackCount;

    /**
    * Member/Admin/;成员或者管理员
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Role")
    @Expose
    private String Role;

    /**
    * 成员账号id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MemberId")
    @Expose
    private String MemberId;

    /**
    * 成员账号Appid
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * 账号加入方式,create/invite
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("JoinType")
    @Expose
    private String JoinType;

    /**
    * 空则未开启，否则不同字符串对应不同版本，common为通用，不区分版本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CFWProtect")
    @Expose
    private String CFWProtect;

    /**
    * 空则未开启，否则不同字符串对应不同版本，common为通用，不区分版本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WAFProtect")
    @Expose
    private String WAFProtect;

    /**
    * 空则未开启，否则不同字符串对应不同版本，common为通用，不区分版本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CWPProtect")
    @Expose
    private String CWPProtect;

    /**
    * 1启用，0未启用
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Enable")
    @Expose
    private Long Enable;

    /**
    * "Free"       //免费版  "Advanced"   //高级版 "Enterprise" //企业版 "Ultimate"   //旗舰版
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CSIPProtect")
    @Expose
    private String CSIPProtect;

    /**
    * 1为配额消耗者
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("QuotaConsumer")
    @Expose
    private Long QuotaConsumer;

    /**
    * 账户类型，0为腾讯云账户，1为AWS账户
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CloudType")
    @Expose
    private Long CloudType;

    /**
    * 0为缺省值，1为10分钟，2为1小时，3为24小时
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SyncFrequency")
    @Expose
    private Long SyncFrequency;

    /**
    * 多云账户是否过期
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsExpired")
    @Expose
    private Boolean IsExpired;

    /**
    * 多云账户 权限列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PermissionList")
    @Expose
    private String [] PermissionList;

    /**
    * 1
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AuthType")
    @Expose
    private Long AuthType;

    /**
    * 0 腾讯云集团账户
1 腾讯云接入账户
2 非腾讯云
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TcMemberType")
    @Expose
    private Long TcMemberType;

    /**
     * Get 成员账号Uin
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Uin 成员账号Uin
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set 成员账号Uin
注意：此字段可能返回 null，表示取不到有效值。
     * @param Uin 成员账号Uin
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get 成员账号名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NickName 成员账号名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNickName() {
        return this.NickName;
    }

    /**
     * Set 成员账号名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param NickName 成员账号名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNickName(String NickName) {
        this.NickName = NickName;
    }

    /**
     * Get 部门节点名称，账号所属部门
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NodeName 部门节点名称，账号所属部门
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNodeName() {
        return this.NodeName;
    }

    /**
     * Set 部门节点名称，账号所属部门
注意：此字段可能返回 null，表示取不到有效值。
     * @param NodeName 部门节点名称，账号所属部门
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNodeName(String NodeName) {
        this.NodeName = NodeName;
    }

    /**
     * Get 资产数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AssetCount 资产数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAssetCount() {
        return this.AssetCount;
    }

    /**
     * Set 资产数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param AssetCount 资产数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAssetCount(Long AssetCount) {
        this.AssetCount = AssetCount;
    }

    /**
     * Get 风险数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RiskCount 风险数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRiskCount() {
        return this.RiskCount;
    }

    /**
     * Set 风险数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param RiskCount 风险数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRiskCount(Long RiskCount) {
        this.RiskCount = RiskCount;
    }

    /**
     * Get 攻击数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AttackCount 攻击数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAttackCount() {
        return this.AttackCount;
    }

    /**
     * Set 攻击数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param AttackCount 攻击数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAttackCount(Long AttackCount) {
        this.AttackCount = AttackCount;
    }

    /**
     * Get Member/Admin/;成员或者管理员
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Role Member/Admin/;成员或者管理员
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRole() {
        return this.Role;
    }

    /**
     * Set Member/Admin/;成员或者管理员
注意：此字段可能返回 null，表示取不到有效值。
     * @param Role Member/Admin/;成员或者管理员
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRole(String Role) {
        this.Role = Role;
    }

    /**
     * Get 成员账号id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MemberId 成员账号id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMemberId() {
        return this.MemberId;
    }

    /**
     * Set 成员账号id
注意：此字段可能返回 null，表示取不到有效值。
     * @param MemberId 成员账号id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMemberId(String MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get 成员账号Appid
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AppId 成员账号Appid
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set 成员账号Appid
注意：此字段可能返回 null，表示取不到有效值。
     * @param AppId 成员账号Appid
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 账号加入方式,create/invite
注意：此字段可能返回 null，表示取不到有效值。 
     * @return JoinType 账号加入方式,create/invite
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getJoinType() {
        return this.JoinType;
    }

    /**
     * Set 账号加入方式,create/invite
注意：此字段可能返回 null，表示取不到有效值。
     * @param JoinType 账号加入方式,create/invite
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setJoinType(String JoinType) {
        this.JoinType = JoinType;
    }

    /**
     * Get 空则未开启，否则不同字符串对应不同版本，common为通用，不区分版本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CFWProtect 空则未开启，否则不同字符串对应不同版本，common为通用，不区分版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCFWProtect() {
        return this.CFWProtect;
    }

    /**
     * Set 空则未开启，否则不同字符串对应不同版本，common为通用，不区分版本
注意：此字段可能返回 null，表示取不到有效值。
     * @param CFWProtect 空则未开启，否则不同字符串对应不同版本，common为通用，不区分版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCFWProtect(String CFWProtect) {
        this.CFWProtect = CFWProtect;
    }

    /**
     * Get 空则未开启，否则不同字符串对应不同版本，common为通用，不区分版本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WAFProtect 空则未开启，否则不同字符串对应不同版本，common为通用，不区分版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWAFProtect() {
        return this.WAFProtect;
    }

    /**
     * Set 空则未开启，否则不同字符串对应不同版本，common为通用，不区分版本
注意：此字段可能返回 null，表示取不到有效值。
     * @param WAFProtect 空则未开启，否则不同字符串对应不同版本，common为通用，不区分版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWAFProtect(String WAFProtect) {
        this.WAFProtect = WAFProtect;
    }

    /**
     * Get 空则未开启，否则不同字符串对应不同版本，common为通用，不区分版本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CWPProtect 空则未开启，否则不同字符串对应不同版本，common为通用，不区分版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCWPProtect() {
        return this.CWPProtect;
    }

    /**
     * Set 空则未开启，否则不同字符串对应不同版本，common为通用，不区分版本
注意：此字段可能返回 null，表示取不到有效值。
     * @param CWPProtect 空则未开启，否则不同字符串对应不同版本，common为通用，不区分版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCWPProtect(String CWPProtect) {
        this.CWPProtect = CWPProtect;
    }

    /**
     * Get 1启用，0未启用
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Enable 1启用，0未启用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getEnable() {
        return this.Enable;
    }

    /**
     * Set 1启用，0未启用
注意：此字段可能返回 null，表示取不到有效值。
     * @param Enable 1启用，0未启用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnable(Long Enable) {
        this.Enable = Enable;
    }

    /**
     * Get "Free"       //免费版  "Advanced"   //高级版 "Enterprise" //企业版 "Ultimate"   //旗舰版
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CSIPProtect "Free"       //免费版  "Advanced"   //高级版 "Enterprise" //企业版 "Ultimate"   //旗舰版
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCSIPProtect() {
        return this.CSIPProtect;
    }

    /**
     * Set "Free"       //免费版  "Advanced"   //高级版 "Enterprise" //企业版 "Ultimate"   //旗舰版
注意：此字段可能返回 null，表示取不到有效值。
     * @param CSIPProtect "Free"       //免费版  "Advanced"   //高级版 "Enterprise" //企业版 "Ultimate"   //旗舰版
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCSIPProtect(String CSIPProtect) {
        this.CSIPProtect = CSIPProtect;
    }

    /**
     * Get 1为配额消耗者
注意：此字段可能返回 null，表示取不到有效值。 
     * @return QuotaConsumer 1为配额消耗者
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getQuotaConsumer() {
        return this.QuotaConsumer;
    }

    /**
     * Set 1为配额消耗者
注意：此字段可能返回 null，表示取不到有效值。
     * @param QuotaConsumer 1为配额消耗者
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQuotaConsumer(Long QuotaConsumer) {
        this.QuotaConsumer = QuotaConsumer;
    }

    /**
     * Get 账户类型，0为腾讯云账户，1为AWS账户
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CloudType 账户类型，0为腾讯云账户，1为AWS账户
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCloudType() {
        return this.CloudType;
    }

    /**
     * Set 账户类型，0为腾讯云账户，1为AWS账户
注意：此字段可能返回 null，表示取不到有效值。
     * @param CloudType 账户类型，0为腾讯云账户，1为AWS账户
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCloudType(Long CloudType) {
        this.CloudType = CloudType;
    }

    /**
     * Get 0为缺省值，1为10分钟，2为1小时，3为24小时
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SyncFrequency 0为缺省值，1为10分钟，2为1小时，3为24小时
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSyncFrequency() {
        return this.SyncFrequency;
    }

    /**
     * Set 0为缺省值，1为10分钟，2为1小时，3为24小时
注意：此字段可能返回 null，表示取不到有效值。
     * @param SyncFrequency 0为缺省值，1为10分钟，2为1小时，3为24小时
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSyncFrequency(Long SyncFrequency) {
        this.SyncFrequency = SyncFrequency;
    }

    /**
     * Get 多云账户是否过期
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsExpired 多云账户是否过期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsExpired() {
        return this.IsExpired;
    }

    /**
     * Set 多云账户是否过期
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsExpired 多云账户是否过期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsExpired(Boolean IsExpired) {
        this.IsExpired = IsExpired;
    }

    /**
     * Get 多云账户 权限列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PermissionList 多云账户 权限列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getPermissionList() {
        return this.PermissionList;
    }

    /**
     * Set 多云账户 权限列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param PermissionList 多云账户 权限列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPermissionList(String [] PermissionList) {
        this.PermissionList = PermissionList;
    }

    /**
     * Get 1
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AuthType 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAuthType() {
        return this.AuthType;
    }

    /**
     * Set 1
注意：此字段可能返回 null，表示取不到有效值。
     * @param AuthType 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAuthType(Long AuthType) {
        this.AuthType = AuthType;
    }

    /**
     * Get 0 腾讯云集团账户
1 腾讯云接入账户
2 非腾讯云
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TcMemberType 0 腾讯云集团账户
1 腾讯云接入账户
2 非腾讯云
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTcMemberType() {
        return this.TcMemberType;
    }

    /**
     * Set 0 腾讯云集团账户
1 腾讯云接入账户
2 非腾讯云
注意：此字段可能返回 null，表示取不到有效值。
     * @param TcMemberType 0 腾讯云集团账户
1 腾讯云接入账户
2 非腾讯云
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTcMemberType(Long TcMemberType) {
        this.TcMemberType = TcMemberType;
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

    }
}

