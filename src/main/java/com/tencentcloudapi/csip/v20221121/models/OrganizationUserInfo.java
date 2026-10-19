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
    * <p>成员账号Uin</p>
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * <p>成员账号名称</p>
    */
    @SerializedName("NickName")
    @Expose
    private String NickName;

    /**
    * <p>部门节点名称，账号所属部门</p>
    */
    @SerializedName("NodeName")
    @Expose
    private String NodeName;

    /**
    * <p>资产数量</p>
    */
    @SerializedName("AssetCount")
    @Expose
    private Long AssetCount;

    /**
    * <p>风险数量</p>
    */
    @SerializedName("RiskCount")
    @Expose
    private Long RiskCount;

    /**
    * <p>攻击数量</p>
    */
    @SerializedName("AttackCount")
    @Expose
    private Long AttackCount;

    /**
    * <p>Member/Admin/;成员或者管理员</p>
    */
    @SerializedName("Role")
    @Expose
    private String Role;

    /**
    * <p>成员账号id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String MemberId;

    /**
    * <p>成员账号Appid</p>
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * <p>账号加入方式,create/invite</p>
    */
    @SerializedName("JoinType")
    @Expose
    private String JoinType;

    /**
    * <p>空则未开启，否则不同字符串对应不同版本，common为通用，不区分版本</p>
    */
    @SerializedName("CFWProtect")
    @Expose
    private String CFWProtect;

    /**
    * <p>空则未开启，否则不同字符串对应不同版本，common为通用，不区分版本</p>
    */
    @SerializedName("WAFProtect")
    @Expose
    private String WAFProtect;

    /**
    * <p>空则未开启，否则不同字符串对应不同版本，common为通用，不区分版本</p>
    */
    @SerializedName("CWPProtect")
    @Expose
    private String CWPProtect;

    /**
    * <p>1启用，0未启用</p>
    */
    @SerializedName("Enable")
    @Expose
    private Long Enable;

    /**
    * <p>&quot;Free&quot;       //免费版  &quot;Advanced&quot;   //高级版 &quot;Enterprise&quot; //企业版 &quot;Ultimate&quot;   //旗舰版</p>
    */
    @SerializedName("CSIPProtect")
    @Expose
    private String CSIPProtect;

    /**
    * <p>1为配额消耗者</p>
    */
    @SerializedName("QuotaConsumer")
    @Expose
    private Long QuotaConsumer;

    /**
    * <p>账户类型，0为腾讯云账户，1为AWS账户</p>
    */
    @SerializedName("CloudType")
    @Expose
    private Long CloudType;

    /**
    * <p>0为缺省值，1为10分钟，2为1小时，3为24小时</p>
    */
    @SerializedName("SyncFrequency")
    @Expose
    private Long SyncFrequency;

    /**
    * <p>多云账户是否过期</p>
    */
    @SerializedName("IsExpired")
    @Expose
    private Boolean IsExpired;

    /**
    * <p>多云账户 权限列表</p>
    */
    @SerializedName("PermissionList")
    @Expose
    private String [] PermissionList;

    /**
    * <p>账户权限类型</p><p>枚举值：</p><ul><li>1： 认证类型-Root账号AKSK</li><li>2： 认证类型-子账号AKSK</li><li>3： 认证类型-角色</li></ul>
    */
    @SerializedName("AuthType")
    @Expose
    private Long AuthType;

    /**
    * <p>0 腾讯云集团账户<br>1 腾讯云接入账户<br>2 非腾讯云</p>
    */
    @SerializedName("TcMemberType")
    @Expose
    private Long TcMemberType;

    /**
    * <p>子账号数量</p>
    */
    @SerializedName("SubUserCount")
    @Expose
    private Long SubUserCount;

    /**
    * <p>加入方式详细信息</p>
    */
    @SerializedName("JoinTypeInfo")
    @Expose
    private String JoinTypeInfo;

    /**
    * <p>被共享模块列表</p><p>枚举值：</p><ul><li>AKSK： 云API异常监测</li><li>SDL： 日志分析</li><li>CSPM： 云安全态势管理</li><li>CWP： 主机安全</li><li>COS_AUDIT： COS审计</li><li>IMAGE_SCAN： 容器镜像扫描</li><li>SKILL_SCAN： Skill安全检测</li><li>SKILL_SCAN_POST： Skill安全检测(后付费)</li><li>DSPM： 数据安全态势管理</li></ul><p>默认值：[]</p>
    */
    @SerializedName("SharedModules")
    @Expose
    private String [] SharedModules;

    /**
    * <p>安全分</p>
    */
    @SerializedName("SecurityScore")
    @Expose
    private Long SecurityScore;

    /**
     * Get <p>成员账号Uin</p> 
     * @return Uin <p>成员账号Uin</p>
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set <p>成员账号Uin</p>
     * @param Uin <p>成员账号Uin</p>
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get <p>成员账号名称</p> 
     * @return NickName <p>成员账号名称</p>
     */
    public String getNickName() {
        return this.NickName;
    }

    /**
     * Set <p>成员账号名称</p>
     * @param NickName <p>成员账号名称</p>
     */
    public void setNickName(String NickName) {
        this.NickName = NickName;
    }

    /**
     * Get <p>部门节点名称，账号所属部门</p> 
     * @return NodeName <p>部门节点名称，账号所属部门</p>
     */
    public String getNodeName() {
        return this.NodeName;
    }

    /**
     * Set <p>部门节点名称，账号所属部门</p>
     * @param NodeName <p>部门节点名称，账号所属部门</p>
     */
    public void setNodeName(String NodeName) {
        this.NodeName = NodeName;
    }

    /**
     * Get <p>资产数量</p> 
     * @return AssetCount <p>资产数量</p>
     */
    public Long getAssetCount() {
        return this.AssetCount;
    }

    /**
     * Set <p>资产数量</p>
     * @param AssetCount <p>资产数量</p>
     */
    public void setAssetCount(Long AssetCount) {
        this.AssetCount = AssetCount;
    }

    /**
     * Get <p>风险数量</p> 
     * @return RiskCount <p>风险数量</p>
     */
    public Long getRiskCount() {
        return this.RiskCount;
    }

    /**
     * Set <p>风险数量</p>
     * @param RiskCount <p>风险数量</p>
     */
    public void setRiskCount(Long RiskCount) {
        this.RiskCount = RiskCount;
    }

    /**
     * Get <p>攻击数量</p> 
     * @return AttackCount <p>攻击数量</p>
     */
    public Long getAttackCount() {
        return this.AttackCount;
    }

    /**
     * Set <p>攻击数量</p>
     * @param AttackCount <p>攻击数量</p>
     */
    public void setAttackCount(Long AttackCount) {
        this.AttackCount = AttackCount;
    }

    /**
     * Get <p>Member/Admin/;成员或者管理员</p> 
     * @return Role <p>Member/Admin/;成员或者管理员</p>
     */
    public String getRole() {
        return this.Role;
    }

    /**
     * Set <p>Member/Admin/;成员或者管理员</p>
     * @param Role <p>Member/Admin/;成员或者管理员</p>
     */
    public void setRole(String Role) {
        this.Role = Role;
    }

    /**
     * Get <p>成员账号id</p> 
     * @return MemberId <p>成员账号id</p>
     */
    public String getMemberId() {
        return this.MemberId;
    }

    /**
     * Set <p>成员账号id</p>
     * @param MemberId <p>成员账号id</p>
     */
    public void setMemberId(String MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get <p>成员账号Appid</p> 
     * @return AppId <p>成员账号Appid</p>
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>成员账号Appid</p>
     * @param AppId <p>成员账号Appid</p>
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>账号加入方式,create/invite</p> 
     * @return JoinType <p>账号加入方式,create/invite</p>
     */
    public String getJoinType() {
        return this.JoinType;
    }

    /**
     * Set <p>账号加入方式,create/invite</p>
     * @param JoinType <p>账号加入方式,create/invite</p>
     */
    public void setJoinType(String JoinType) {
        this.JoinType = JoinType;
    }

    /**
     * Get <p>空则未开启，否则不同字符串对应不同版本，common为通用，不区分版本</p> 
     * @return CFWProtect <p>空则未开启，否则不同字符串对应不同版本，common为通用，不区分版本</p>
     */
    public String getCFWProtect() {
        return this.CFWProtect;
    }

    /**
     * Set <p>空则未开启，否则不同字符串对应不同版本，common为通用，不区分版本</p>
     * @param CFWProtect <p>空则未开启，否则不同字符串对应不同版本，common为通用，不区分版本</p>
     */
    public void setCFWProtect(String CFWProtect) {
        this.CFWProtect = CFWProtect;
    }

    /**
     * Get <p>空则未开启，否则不同字符串对应不同版本，common为通用，不区分版本</p> 
     * @return WAFProtect <p>空则未开启，否则不同字符串对应不同版本，common为通用，不区分版本</p>
     */
    public String getWAFProtect() {
        return this.WAFProtect;
    }

    /**
     * Set <p>空则未开启，否则不同字符串对应不同版本，common为通用，不区分版本</p>
     * @param WAFProtect <p>空则未开启，否则不同字符串对应不同版本，common为通用，不区分版本</p>
     */
    public void setWAFProtect(String WAFProtect) {
        this.WAFProtect = WAFProtect;
    }

    /**
     * Get <p>空则未开启，否则不同字符串对应不同版本，common为通用，不区分版本</p> 
     * @return CWPProtect <p>空则未开启，否则不同字符串对应不同版本，common为通用，不区分版本</p>
     */
    public String getCWPProtect() {
        return this.CWPProtect;
    }

    /**
     * Set <p>空则未开启，否则不同字符串对应不同版本，common为通用，不区分版本</p>
     * @param CWPProtect <p>空则未开启，否则不同字符串对应不同版本，common为通用，不区分版本</p>
     */
    public void setCWPProtect(String CWPProtect) {
        this.CWPProtect = CWPProtect;
    }

    /**
     * Get <p>1启用，0未启用</p> 
     * @return Enable <p>1启用，0未启用</p>
     */
    public Long getEnable() {
        return this.Enable;
    }

    /**
     * Set <p>1启用，0未启用</p>
     * @param Enable <p>1启用，0未启用</p>
     */
    public void setEnable(Long Enable) {
        this.Enable = Enable;
    }

    /**
     * Get <p>&quot;Free&quot;       //免费版  &quot;Advanced&quot;   //高级版 &quot;Enterprise&quot; //企业版 &quot;Ultimate&quot;   //旗舰版</p> 
     * @return CSIPProtect <p>&quot;Free&quot;       //免费版  &quot;Advanced&quot;   //高级版 &quot;Enterprise&quot; //企业版 &quot;Ultimate&quot;   //旗舰版</p>
     */
    public String getCSIPProtect() {
        return this.CSIPProtect;
    }

    /**
     * Set <p>&quot;Free&quot;       //免费版  &quot;Advanced&quot;   //高级版 &quot;Enterprise&quot; //企业版 &quot;Ultimate&quot;   //旗舰版</p>
     * @param CSIPProtect <p>&quot;Free&quot;       //免费版  &quot;Advanced&quot;   //高级版 &quot;Enterprise&quot; //企业版 &quot;Ultimate&quot;   //旗舰版</p>
     */
    public void setCSIPProtect(String CSIPProtect) {
        this.CSIPProtect = CSIPProtect;
    }

    /**
     * Get <p>1为配额消耗者</p> 
     * @return QuotaConsumer <p>1为配额消耗者</p>
     */
    public Long getQuotaConsumer() {
        return this.QuotaConsumer;
    }

    /**
     * Set <p>1为配额消耗者</p>
     * @param QuotaConsumer <p>1为配额消耗者</p>
     */
    public void setQuotaConsumer(Long QuotaConsumer) {
        this.QuotaConsumer = QuotaConsumer;
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
     * Get <p>0为缺省值，1为10分钟，2为1小时，3为24小时</p> 
     * @return SyncFrequency <p>0为缺省值，1为10分钟，2为1小时，3为24小时</p>
     */
    public Long getSyncFrequency() {
        return this.SyncFrequency;
    }

    /**
     * Set <p>0为缺省值，1为10分钟，2为1小时，3为24小时</p>
     * @param SyncFrequency <p>0为缺省值，1为10分钟，2为1小时，3为24小时</p>
     */
    public void setSyncFrequency(Long SyncFrequency) {
        this.SyncFrequency = SyncFrequency;
    }

    /**
     * Get <p>多云账户是否过期</p> 
     * @return IsExpired <p>多云账户是否过期</p>
     */
    public Boolean getIsExpired() {
        return this.IsExpired;
    }

    /**
     * Set <p>多云账户是否过期</p>
     * @param IsExpired <p>多云账户是否过期</p>
     */
    public void setIsExpired(Boolean IsExpired) {
        this.IsExpired = IsExpired;
    }

    /**
     * Get <p>多云账户 权限列表</p> 
     * @return PermissionList <p>多云账户 权限列表</p>
     */
    public String [] getPermissionList() {
        return this.PermissionList;
    }

    /**
     * Set <p>多云账户 权限列表</p>
     * @param PermissionList <p>多云账户 权限列表</p>
     */
    public void setPermissionList(String [] PermissionList) {
        this.PermissionList = PermissionList;
    }

    /**
     * Get <p>账户权限类型</p><p>枚举值：</p><ul><li>1： 认证类型-Root账号AKSK</li><li>2： 认证类型-子账号AKSK</li><li>3： 认证类型-角色</li></ul> 
     * @return AuthType <p>账户权限类型</p><p>枚举值：</p><ul><li>1： 认证类型-Root账号AKSK</li><li>2： 认证类型-子账号AKSK</li><li>3： 认证类型-角色</li></ul>
     */
    public Long getAuthType() {
        return this.AuthType;
    }

    /**
     * Set <p>账户权限类型</p><p>枚举值：</p><ul><li>1： 认证类型-Root账号AKSK</li><li>2： 认证类型-子账号AKSK</li><li>3： 认证类型-角色</li></ul>
     * @param AuthType <p>账户权限类型</p><p>枚举值：</p><ul><li>1： 认证类型-Root账号AKSK</li><li>2： 认证类型-子账号AKSK</li><li>3： 认证类型-角色</li></ul>
     */
    public void setAuthType(Long AuthType) {
        this.AuthType = AuthType;
    }

    /**
     * Get <p>0 腾讯云集团账户<br>1 腾讯云接入账户<br>2 非腾讯云</p> 
     * @return TcMemberType <p>0 腾讯云集团账户<br>1 腾讯云接入账户<br>2 非腾讯云</p>
     */
    public Long getTcMemberType() {
        return this.TcMemberType;
    }

    /**
     * Set <p>0 腾讯云集团账户<br>1 腾讯云接入账户<br>2 非腾讯云</p>
     * @param TcMemberType <p>0 腾讯云集团账户<br>1 腾讯云接入账户<br>2 非腾讯云</p>
     */
    public void setTcMemberType(Long TcMemberType) {
        this.TcMemberType = TcMemberType;
    }

    /**
     * Get <p>子账号数量</p> 
     * @return SubUserCount <p>子账号数量</p>
     */
    public Long getSubUserCount() {
        return this.SubUserCount;
    }

    /**
     * Set <p>子账号数量</p>
     * @param SubUserCount <p>子账号数量</p>
     */
    public void setSubUserCount(Long SubUserCount) {
        this.SubUserCount = SubUserCount;
    }

    /**
     * Get <p>加入方式详细信息</p> 
     * @return JoinTypeInfo <p>加入方式详细信息</p>
     */
    public String getJoinTypeInfo() {
        return this.JoinTypeInfo;
    }

    /**
     * Set <p>加入方式详细信息</p>
     * @param JoinTypeInfo <p>加入方式详细信息</p>
     */
    public void setJoinTypeInfo(String JoinTypeInfo) {
        this.JoinTypeInfo = JoinTypeInfo;
    }

    /**
     * Get <p>被共享模块列表</p><p>枚举值：</p><ul><li>AKSK： 云API异常监测</li><li>SDL： 日志分析</li><li>CSPM： 云安全态势管理</li><li>CWP： 主机安全</li><li>COS_AUDIT： COS审计</li><li>IMAGE_SCAN： 容器镜像扫描</li><li>SKILL_SCAN： Skill安全检测</li><li>SKILL_SCAN_POST： Skill安全检测(后付费)</li><li>DSPM： 数据安全态势管理</li></ul><p>默认值：[]</p> 
     * @return SharedModules <p>被共享模块列表</p><p>枚举值：</p><ul><li>AKSK： 云API异常监测</li><li>SDL： 日志分析</li><li>CSPM： 云安全态势管理</li><li>CWP： 主机安全</li><li>COS_AUDIT： COS审计</li><li>IMAGE_SCAN： 容器镜像扫描</li><li>SKILL_SCAN： Skill安全检测</li><li>SKILL_SCAN_POST： Skill安全检测(后付费)</li><li>DSPM： 数据安全态势管理</li></ul><p>默认值：[]</p>
     */
    public String [] getSharedModules() {
        return this.SharedModules;
    }

    /**
     * Set <p>被共享模块列表</p><p>枚举值：</p><ul><li>AKSK： 云API异常监测</li><li>SDL： 日志分析</li><li>CSPM： 云安全态势管理</li><li>CWP： 主机安全</li><li>COS_AUDIT： COS审计</li><li>IMAGE_SCAN： 容器镜像扫描</li><li>SKILL_SCAN： Skill安全检测</li><li>SKILL_SCAN_POST： Skill安全检测(后付费)</li><li>DSPM： 数据安全态势管理</li></ul><p>默认值：[]</p>
     * @param SharedModules <p>被共享模块列表</p><p>枚举值：</p><ul><li>AKSK： 云API异常监测</li><li>SDL： 日志分析</li><li>CSPM： 云安全态势管理</li><li>CWP： 主机安全</li><li>COS_AUDIT： COS审计</li><li>IMAGE_SCAN： 容器镜像扫描</li><li>SKILL_SCAN： Skill安全检测</li><li>SKILL_SCAN_POST： Skill安全检测(后付费)</li><li>DSPM： 数据安全态势管理</li></ul><p>默认值：[]</p>
     */
    public void setSharedModules(String [] SharedModules) {
        this.SharedModules = SharedModules;
    }

    /**
     * Get <p>安全分</p> 
     * @return SecurityScore <p>安全分</p>
     */
    public Long getSecurityScore() {
        return this.SecurityScore;
    }

    /**
     * Set <p>安全分</p>
     * @param SecurityScore <p>安全分</p>
     */
    public void setSecurityScore(Long SecurityScore) {
        this.SecurityScore = SecurityScore;
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
        if (source.SharedModules != null) {
            this.SharedModules = new String[source.SharedModules.length];
            for (int i = 0; i < source.SharedModules.length; i++) {
                this.SharedModules[i] = new String(source.SharedModules[i]);
            }
        }
        if (source.SecurityScore != null) {
            this.SecurityScore = new Long(source.SecurityScore);
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
        this.setParamArraySimple(map, prefix + "SharedModules.", this.SharedModules);
        this.setParamSimple(map, prefix + "SecurityScore", this.SecurityScore);

    }
}

