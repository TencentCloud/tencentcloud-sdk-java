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
package com.tencentcloudapi.fwm.v20250611.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OrganSummary extends AbstractModel {

    /**
    * 集团名称
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * 管理员账号信息
    */
    @SerializedName("AdminInfo")
    @Expose
    private MemberInfo AdminInfo;

    /**
    * 管理员/委派管理员数量
    */
    @SerializedName("AdminCount")
    @Expose
    private Long AdminCount;

    /**
    * 已接入成员数
    */
    @SerializedName("JoinedMemberCount")
    @Expose
    private Long JoinedMemberCount;

    /**
    * 接入成员上限（-1表示无上限）
    */
    @SerializedName("MemberLimit")
    @Expose
    private Long MemberLimit;

    /**
    * 接入成员上限显示
    */
    @SerializedName("MemberLimitDisplay")
    @Expose
    private String MemberLimitDisplay;

    /**
    * 规格共享者数量
    */
    @SerializedName("CfwSharerCount")
    @Expose
    private Long CfwSharerCount;

    /**
    * 规格使用者数量
    */
    @SerializedName("CfwUserCount")
    @Expose
    private Long CfwUserCount;

    /**
    * 部门名称列表
    */
    @SerializedName("Departments")
    @Expose
    private String [] Departments;

    /**
    * 纳管账号数
    */
    @SerializedName("ManagedMemberCount")
    @Expose
    private Long ManagedMemberCount;

    /**
    * 纳管产品数
    */
    @SerializedName("ManagedProductCount")
    @Expose
    private Long ManagedProductCount;

    /**
    * 纳管账号数
    */
    @SerializedName("CfwManageCount")
    @Expose
    private Long CfwManageCount;

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
     * Get 管理员账号信息 
     * @return AdminInfo 管理员账号信息
     */
    public MemberInfo getAdminInfo() {
        return this.AdminInfo;
    }

    /**
     * Set 管理员账号信息
     * @param AdminInfo 管理员账号信息
     */
    public void setAdminInfo(MemberInfo AdminInfo) {
        this.AdminInfo = AdminInfo;
    }

    /**
     * Get 管理员/委派管理员数量 
     * @return AdminCount 管理员/委派管理员数量
     */
    public Long getAdminCount() {
        return this.AdminCount;
    }

    /**
     * Set 管理员/委派管理员数量
     * @param AdminCount 管理员/委派管理员数量
     */
    public void setAdminCount(Long AdminCount) {
        this.AdminCount = AdminCount;
    }

    /**
     * Get 已接入成员数 
     * @return JoinedMemberCount 已接入成员数
     */
    public Long getJoinedMemberCount() {
        return this.JoinedMemberCount;
    }

    /**
     * Set 已接入成员数
     * @param JoinedMemberCount 已接入成员数
     */
    public void setJoinedMemberCount(Long JoinedMemberCount) {
        this.JoinedMemberCount = JoinedMemberCount;
    }

    /**
     * Get 接入成员上限（-1表示无上限） 
     * @return MemberLimit 接入成员上限（-1表示无上限）
     */
    public Long getMemberLimit() {
        return this.MemberLimit;
    }

    /**
     * Set 接入成员上限（-1表示无上限）
     * @param MemberLimit 接入成员上限（-1表示无上限）
     */
    public void setMemberLimit(Long MemberLimit) {
        this.MemberLimit = MemberLimit;
    }

    /**
     * Get 接入成员上限显示 
     * @return MemberLimitDisplay 接入成员上限显示
     */
    public String getMemberLimitDisplay() {
        return this.MemberLimitDisplay;
    }

    /**
     * Set 接入成员上限显示
     * @param MemberLimitDisplay 接入成员上限显示
     */
    public void setMemberLimitDisplay(String MemberLimitDisplay) {
        this.MemberLimitDisplay = MemberLimitDisplay;
    }

    /**
     * Get 规格共享者数量 
     * @return CfwSharerCount 规格共享者数量
     */
    public Long getCfwSharerCount() {
        return this.CfwSharerCount;
    }

    /**
     * Set 规格共享者数量
     * @param CfwSharerCount 规格共享者数量
     */
    public void setCfwSharerCount(Long CfwSharerCount) {
        this.CfwSharerCount = CfwSharerCount;
    }

    /**
     * Get 规格使用者数量 
     * @return CfwUserCount 规格使用者数量
     */
    public Long getCfwUserCount() {
        return this.CfwUserCount;
    }

    /**
     * Set 规格使用者数量
     * @param CfwUserCount 规格使用者数量
     */
    public void setCfwUserCount(Long CfwUserCount) {
        this.CfwUserCount = CfwUserCount;
    }

    /**
     * Get 部门名称列表 
     * @return Departments 部门名称列表
     */
    public String [] getDepartments() {
        return this.Departments;
    }

    /**
     * Set 部门名称列表
     * @param Departments 部门名称列表
     */
    public void setDepartments(String [] Departments) {
        this.Departments = Departments;
    }

    /**
     * Get 纳管账号数 
     * @return ManagedMemberCount 纳管账号数
     */
    public Long getManagedMemberCount() {
        return this.ManagedMemberCount;
    }

    /**
     * Set 纳管账号数
     * @param ManagedMemberCount 纳管账号数
     */
    public void setManagedMemberCount(Long ManagedMemberCount) {
        this.ManagedMemberCount = ManagedMemberCount;
    }

    /**
     * Get 纳管产品数 
     * @return ManagedProductCount 纳管产品数
     */
    public Long getManagedProductCount() {
        return this.ManagedProductCount;
    }

    /**
     * Set 纳管产品数
     * @param ManagedProductCount 纳管产品数
     */
    public void setManagedProductCount(Long ManagedProductCount) {
        this.ManagedProductCount = ManagedProductCount;
    }

    /**
     * Get 纳管账号数 
     * @return CfwManageCount 纳管账号数
     */
    public Long getCfwManageCount() {
        return this.CfwManageCount;
    }

    /**
     * Set 纳管账号数
     * @param CfwManageCount 纳管账号数
     */
    public void setCfwManageCount(Long CfwManageCount) {
        this.CfwManageCount = CfwManageCount;
    }

    public OrganSummary() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OrganSummary(OrganSummary source) {
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.AdminInfo != null) {
            this.AdminInfo = new MemberInfo(source.AdminInfo);
        }
        if (source.AdminCount != null) {
            this.AdminCount = new Long(source.AdminCount);
        }
        if (source.JoinedMemberCount != null) {
            this.JoinedMemberCount = new Long(source.JoinedMemberCount);
        }
        if (source.MemberLimit != null) {
            this.MemberLimit = new Long(source.MemberLimit);
        }
        if (source.MemberLimitDisplay != null) {
            this.MemberLimitDisplay = new String(source.MemberLimitDisplay);
        }
        if (source.CfwSharerCount != null) {
            this.CfwSharerCount = new Long(source.CfwSharerCount);
        }
        if (source.CfwUserCount != null) {
            this.CfwUserCount = new Long(source.CfwUserCount);
        }
        if (source.Departments != null) {
            this.Departments = new String[source.Departments.length];
            for (int i = 0; i < source.Departments.length; i++) {
                this.Departments[i] = new String(source.Departments[i]);
            }
        }
        if (source.ManagedMemberCount != null) {
            this.ManagedMemberCount = new Long(source.ManagedMemberCount);
        }
        if (source.ManagedProductCount != null) {
            this.ManagedProductCount = new Long(source.ManagedProductCount);
        }
        if (source.CfwManageCount != null) {
            this.CfwManageCount = new Long(source.CfwManageCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamObj(map, prefix + "AdminInfo.", this.AdminInfo);
        this.setParamSimple(map, prefix + "AdminCount", this.AdminCount);
        this.setParamSimple(map, prefix + "JoinedMemberCount", this.JoinedMemberCount);
        this.setParamSimple(map, prefix + "MemberLimit", this.MemberLimit);
        this.setParamSimple(map, prefix + "MemberLimitDisplay", this.MemberLimitDisplay);
        this.setParamSimple(map, prefix + "CfwSharerCount", this.CfwSharerCount);
        this.setParamSimple(map, prefix + "CfwUserCount", this.CfwUserCount);
        this.setParamArraySimple(map, prefix + "Departments.", this.Departments);
        this.setParamSimple(map, prefix + "ManagedMemberCount", this.ManagedMemberCount);
        this.setParamSimple(map, prefix + "ManagedProductCount", this.ManagedProductCount);
        this.setParamSimple(map, prefix + "CfwManageCount", this.CfwManageCount);

    }
}

