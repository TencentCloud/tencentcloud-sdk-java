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

public class OrganizationInfo extends AbstractModel {

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
    * Member/Admin/DelegatedAdmin/EntityAdmin; 成员/管理员/委派管理员/主体管理员
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
    * 账号加入方式,create/invite
    */
    @SerializedName("JoinType")
    @Expose
    private String JoinType;

    /**
    * 集团名称
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * 管理员账号名称
    */
    @SerializedName("AdminName")
    @Expose
    private String AdminName;

    /**
    * 管理员Uin
    */
    @SerializedName("AdminUin")
    @Expose
    private String AdminUin;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 部门数
    */
    @SerializedName("NodeCount")
    @Expose
    private Long NodeCount;

    /**
    * 成员数
    */
    @SerializedName("MemberCount")
    @Expose
    private Long MemberCount;

    /**
    * 子账号数
    */
    @SerializedName("SubAccountCount")
    @Expose
    private Long SubAccountCount;

    /**
    * 异常子账号数量
    */
    @SerializedName("AbnormalSubUserCount")
    @Expose
    private Long AbnormalSubUserCount;

    /**
    * 集团关系策略权限
    */
    @SerializedName("GroupPermission")
    @Expose
    private String [] GroupPermission;

    /**
    * 成员关系策略权限
    */
    @SerializedName("MemberPermission")
    @Expose
    private String [] MemberPermission;

    /**
    * 集团付费模式；0/自付费，1/代付费
    */
    @SerializedName("GroupPayMode")
    @Expose
    private Long GroupPayMode;

    /**
    * 个人付费模式；0/自付费，1/代付费
    */
    @SerializedName("MemberPayMode")
    @Expose
    private Long MemberPayMode;

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
    * 所有部门的集合数组
    */
    @SerializedName("Departments")
    @Expose
    private String [] Departments;

    /**
    * 成员创建时间
    */
    @SerializedName("MemberCreateTime")
    @Expose
    private String MemberCreateTime;

    /**
    * Advanced/Enterprise/Ultimate 
    */
    @SerializedName("CSIPProtect")
    @Expose
    private String CSIPProtect;

    /**
    * 1表示配额消耗方
    */
    @SerializedName("QuotaConsumer")
    @Expose
    private Long QuotaConsumer;

    /**
    * 管理员/委派管理员 已开启数量
    */
    @SerializedName("EnableAdminCount")
    @Expose
    private Long EnableAdminCount;

    /**
    * 账户多云信息统计，数组形式，具体参考CloudCountDesc描述
    */
    @SerializedName("CloudCountDesc")
    @Expose
    private CloudCountDesc [] CloudCountDesc;

    /**
    * 管理员/委派管理员 总数量
    */
    @SerializedName("AdminCount")
    @Expose
    private Long AdminCount;

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
     * Get Member/Admin/DelegatedAdmin/EntityAdmin; 成员/管理员/委派管理员/主体管理员 
     * @return Role Member/Admin/DelegatedAdmin/EntityAdmin; 成员/管理员/委派管理员/主体管理员
     */
    public String getRole() {
        return this.Role;
    }

    /**
     * Set Member/Admin/DelegatedAdmin/EntityAdmin; 成员/管理员/委派管理员/主体管理员
     * @param Role Member/Admin/DelegatedAdmin/EntityAdmin; 成员/管理员/委派管理员/主体管理员
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
     * Get 集团名称 
     * @return GroupName 集团名称
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set 集团名称
     * @param GroupName 集团名称
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get 管理员账号名称 
     * @return AdminName 管理员账号名称
     */
    public String getAdminName() {
        return this.AdminName;
    }

    /**
     * Set 管理员账号名称
     * @param AdminName 管理员账号名称
     */
    public void setAdminName(String AdminName) {
        this.AdminName = AdminName;
    }

    /**
     * Get 管理员Uin 
     * @return AdminUin 管理员Uin
     */
    public String getAdminUin() {
        return this.AdminUin;
    }

    /**
     * Set 管理员Uin
     * @param AdminUin 管理员Uin
     */
    public void setAdminUin(String AdminUin) {
        this.AdminUin = AdminUin;
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
     * Get 部门数 
     * @return NodeCount 部门数
     */
    public Long getNodeCount() {
        return this.NodeCount;
    }

    /**
     * Set 部门数
     * @param NodeCount 部门数
     */
    public void setNodeCount(Long NodeCount) {
        this.NodeCount = NodeCount;
    }

    /**
     * Get 成员数 
     * @return MemberCount 成员数
     */
    public Long getMemberCount() {
        return this.MemberCount;
    }

    /**
     * Set 成员数
     * @param MemberCount 成员数
     */
    public void setMemberCount(Long MemberCount) {
        this.MemberCount = MemberCount;
    }

    /**
     * Get 子账号数 
     * @return SubAccountCount 子账号数
     */
    public Long getSubAccountCount() {
        return this.SubAccountCount;
    }

    /**
     * Set 子账号数
     * @param SubAccountCount 子账号数
     */
    public void setSubAccountCount(Long SubAccountCount) {
        this.SubAccountCount = SubAccountCount;
    }

    /**
     * Get 异常子账号数量 
     * @return AbnormalSubUserCount 异常子账号数量
     */
    public Long getAbnormalSubUserCount() {
        return this.AbnormalSubUserCount;
    }

    /**
     * Set 异常子账号数量
     * @param AbnormalSubUserCount 异常子账号数量
     */
    public void setAbnormalSubUserCount(Long AbnormalSubUserCount) {
        this.AbnormalSubUserCount = AbnormalSubUserCount;
    }

    /**
     * Get 集团关系策略权限 
     * @return GroupPermission 集团关系策略权限
     */
    public String [] getGroupPermission() {
        return this.GroupPermission;
    }

    /**
     * Set 集团关系策略权限
     * @param GroupPermission 集团关系策略权限
     */
    public void setGroupPermission(String [] GroupPermission) {
        this.GroupPermission = GroupPermission;
    }

    /**
     * Get 成员关系策略权限 
     * @return MemberPermission 成员关系策略权限
     */
    public String [] getMemberPermission() {
        return this.MemberPermission;
    }

    /**
     * Set 成员关系策略权限
     * @param MemberPermission 成员关系策略权限
     */
    public void setMemberPermission(String [] MemberPermission) {
        this.MemberPermission = MemberPermission;
    }

    /**
     * Get 集团付费模式；0/自付费，1/代付费 
     * @return GroupPayMode 集团付费模式；0/自付费，1/代付费
     */
    public Long getGroupPayMode() {
        return this.GroupPayMode;
    }

    /**
     * Set 集团付费模式；0/自付费，1/代付费
     * @param GroupPayMode 集团付费模式；0/自付费，1/代付费
     */
    public void setGroupPayMode(Long GroupPayMode) {
        this.GroupPayMode = GroupPayMode;
    }

    /**
     * Get 个人付费模式；0/自付费，1/代付费 
     * @return MemberPayMode 个人付费模式；0/自付费，1/代付费
     */
    public Long getMemberPayMode() {
        return this.MemberPayMode;
    }

    /**
     * Set 个人付费模式；0/自付费，1/代付费
     * @param MemberPayMode 个人付费模式；0/自付费，1/代付费
     */
    public void setMemberPayMode(Long MemberPayMode) {
        this.MemberPayMode = MemberPayMode;
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
     * Get 所有部门的集合数组 
     * @return Departments 所有部门的集合数组
     */
    public String [] getDepartments() {
        return this.Departments;
    }

    /**
     * Set 所有部门的集合数组
     * @param Departments 所有部门的集合数组
     */
    public void setDepartments(String [] Departments) {
        this.Departments = Departments;
    }

    /**
     * Get 成员创建时间 
     * @return MemberCreateTime 成员创建时间
     */
    public String getMemberCreateTime() {
        return this.MemberCreateTime;
    }

    /**
     * Set 成员创建时间
     * @param MemberCreateTime 成员创建时间
     */
    public void setMemberCreateTime(String MemberCreateTime) {
        this.MemberCreateTime = MemberCreateTime;
    }

    /**
     * Get Advanced/Enterprise/Ultimate  
     * @return CSIPProtect Advanced/Enterprise/Ultimate 
     */
    public String getCSIPProtect() {
        return this.CSIPProtect;
    }

    /**
     * Set Advanced/Enterprise/Ultimate 
     * @param CSIPProtect Advanced/Enterprise/Ultimate 
     */
    public void setCSIPProtect(String CSIPProtect) {
        this.CSIPProtect = CSIPProtect;
    }

    /**
     * Get 1表示配额消耗方 
     * @return QuotaConsumer 1表示配额消耗方
     */
    public Long getQuotaConsumer() {
        return this.QuotaConsumer;
    }

    /**
     * Set 1表示配额消耗方
     * @param QuotaConsumer 1表示配额消耗方
     */
    public void setQuotaConsumer(Long QuotaConsumer) {
        this.QuotaConsumer = QuotaConsumer;
    }

    /**
     * Get 管理员/委派管理员 已开启数量 
     * @return EnableAdminCount 管理员/委派管理员 已开启数量
     */
    public Long getEnableAdminCount() {
        return this.EnableAdminCount;
    }

    /**
     * Set 管理员/委派管理员 已开启数量
     * @param EnableAdminCount 管理员/委派管理员 已开启数量
     */
    public void setEnableAdminCount(Long EnableAdminCount) {
        this.EnableAdminCount = EnableAdminCount;
    }

    /**
     * Get 账户多云信息统计，数组形式，具体参考CloudCountDesc描述 
     * @return CloudCountDesc 账户多云信息统计，数组形式，具体参考CloudCountDesc描述
     */
    public CloudCountDesc [] getCloudCountDesc() {
        return this.CloudCountDesc;
    }

    /**
     * Set 账户多云信息统计，数组形式，具体参考CloudCountDesc描述
     * @param CloudCountDesc 账户多云信息统计，数组形式，具体参考CloudCountDesc描述
     */
    public void setCloudCountDesc(CloudCountDesc [] CloudCountDesc) {
        this.CloudCountDesc = CloudCountDesc;
    }

    /**
     * Get 管理员/委派管理员 总数量 
     * @return AdminCount 管理员/委派管理员 总数量
     */
    public Long getAdminCount() {
        return this.AdminCount;
    }

    /**
     * Set 管理员/委派管理员 总数量
     * @param AdminCount 管理员/委派管理员 总数量
     */
    public void setAdminCount(Long AdminCount) {
        this.AdminCount = AdminCount;
    }

    public OrganizationInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OrganizationInfo(OrganizationInfo source) {
        if (source.NickName != null) {
            this.NickName = new String(source.NickName);
        }
        if (source.NodeName != null) {
            this.NodeName = new String(source.NodeName);
        }
        if (source.Role != null) {
            this.Role = new String(source.Role);
        }
        if (source.MemberId != null) {
            this.MemberId = new String(source.MemberId);
        }
        if (source.JoinType != null) {
            this.JoinType = new String(source.JoinType);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.AdminName != null) {
            this.AdminName = new String(source.AdminName);
        }
        if (source.AdminUin != null) {
            this.AdminUin = new String(source.AdminUin);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.NodeCount != null) {
            this.NodeCount = new Long(source.NodeCount);
        }
        if (source.MemberCount != null) {
            this.MemberCount = new Long(source.MemberCount);
        }
        if (source.SubAccountCount != null) {
            this.SubAccountCount = new Long(source.SubAccountCount);
        }
        if (source.AbnormalSubUserCount != null) {
            this.AbnormalSubUserCount = new Long(source.AbnormalSubUserCount);
        }
        if (source.GroupPermission != null) {
            this.GroupPermission = new String[source.GroupPermission.length];
            for (int i = 0; i < source.GroupPermission.length; i++) {
                this.GroupPermission[i] = new String(source.GroupPermission[i]);
            }
        }
        if (source.MemberPermission != null) {
            this.MemberPermission = new String[source.MemberPermission.length];
            for (int i = 0; i < source.MemberPermission.length; i++) {
                this.MemberPermission[i] = new String(source.MemberPermission[i]);
            }
        }
        if (source.GroupPayMode != null) {
            this.GroupPayMode = new Long(source.GroupPayMode);
        }
        if (source.MemberPayMode != null) {
            this.MemberPayMode = new Long(source.MemberPayMode);
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
        if (source.Departments != null) {
            this.Departments = new String[source.Departments.length];
            for (int i = 0; i < source.Departments.length; i++) {
                this.Departments[i] = new String(source.Departments[i]);
            }
        }
        if (source.MemberCreateTime != null) {
            this.MemberCreateTime = new String(source.MemberCreateTime);
        }
        if (source.CSIPProtect != null) {
            this.CSIPProtect = new String(source.CSIPProtect);
        }
        if (source.QuotaConsumer != null) {
            this.QuotaConsumer = new Long(source.QuotaConsumer);
        }
        if (source.EnableAdminCount != null) {
            this.EnableAdminCount = new Long(source.EnableAdminCount);
        }
        if (source.CloudCountDesc != null) {
            this.CloudCountDesc = new CloudCountDesc[source.CloudCountDesc.length];
            for (int i = 0; i < source.CloudCountDesc.length; i++) {
                this.CloudCountDesc[i] = new CloudCountDesc(source.CloudCountDesc[i]);
            }
        }
        if (source.AdminCount != null) {
            this.AdminCount = new Long(source.AdminCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NickName", this.NickName);
        this.setParamSimple(map, prefix + "NodeName", this.NodeName);
        this.setParamSimple(map, prefix + "Role", this.Role);
        this.setParamSimple(map, prefix + "MemberId", this.MemberId);
        this.setParamSimple(map, prefix + "JoinType", this.JoinType);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "AdminName", this.AdminName);
        this.setParamSimple(map, prefix + "AdminUin", this.AdminUin);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "NodeCount", this.NodeCount);
        this.setParamSimple(map, prefix + "MemberCount", this.MemberCount);
        this.setParamSimple(map, prefix + "SubAccountCount", this.SubAccountCount);
        this.setParamSimple(map, prefix + "AbnormalSubUserCount", this.AbnormalSubUserCount);
        this.setParamArraySimple(map, prefix + "GroupPermission.", this.GroupPermission);
        this.setParamArraySimple(map, prefix + "MemberPermission.", this.MemberPermission);
        this.setParamSimple(map, prefix + "GroupPayMode", this.GroupPayMode);
        this.setParamSimple(map, prefix + "MemberPayMode", this.MemberPayMode);
        this.setParamSimple(map, prefix + "CFWProtect", this.CFWProtect);
        this.setParamSimple(map, prefix + "WAFProtect", this.WAFProtect);
        this.setParamSimple(map, prefix + "CWPProtect", this.CWPProtect);
        this.setParamArraySimple(map, prefix + "Departments.", this.Departments);
        this.setParamSimple(map, prefix + "MemberCreateTime", this.MemberCreateTime);
        this.setParamSimple(map, prefix + "CSIPProtect", this.CSIPProtect);
        this.setParamSimple(map, prefix + "QuotaConsumer", this.QuotaConsumer);
        this.setParamSimple(map, prefix + "EnableAdminCount", this.EnableAdminCount);
        this.setParamArrayObj(map, prefix + "CloudCountDesc.", this.CloudCountDesc);
        this.setParamSimple(map, prefix + "AdminCount", this.AdminCount);

    }
}

