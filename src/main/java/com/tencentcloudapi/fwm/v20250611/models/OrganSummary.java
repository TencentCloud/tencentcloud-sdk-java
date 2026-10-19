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
    * <p>集团名称</p>
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * <p>管理员账号信息</p>
    */
    @SerializedName("AdminInfo")
    @Expose
    private MemberInfo AdminInfo;

    /**
    * <p>管理员/委派管理员数量</p>
    */
    @SerializedName("AdminCount")
    @Expose
    private Long AdminCount;

    /**
    * <p>已接入成员数</p>
    */
    @SerializedName("JoinedMemberCount")
    @Expose
    private Long JoinedMemberCount;

    /**
    * <p>接入成员上限（-1表示无上限）</p>
    */
    @SerializedName("MemberLimit")
    @Expose
    private Long MemberLimit;

    /**
    * <p>接入成员上限显示</p>
    */
    @SerializedName("MemberLimitDisplay")
    @Expose
    private String MemberLimitDisplay;

    /**
    * <p>规格共享者数量</p>
    */
    @SerializedName("CfwSharerCount")
    @Expose
    private Long CfwSharerCount;

    /**
    * <p>规格使用者数量</p>
    */
    @SerializedName("CfwUserCount")
    @Expose
    private Long CfwUserCount;

    /**
    * <p>部门名称列表</p>
    */
    @SerializedName("Departments")
    @Expose
    private String [] Departments;

    /**
    * <p>纳管账号数</p>
    */
    @SerializedName("ManagedMemberCount")
    @Expose
    private Long ManagedMemberCount;

    /**
    * <p>纳管产品数</p>
    */
    @SerializedName("ManagedProductCount")
    @Expose
    private Long ManagedProductCount;

    /**
    * <p>纳管账号数</p>
    */
    @SerializedName("CfwManageCount")
    @Expose
    private Long CfwManageCount;

    /**
    * <p>规格共享总配额</p>
    */
    @SerializedName("FwmShareUserQuota")
    @Expose
    private Long FwmShareUserQuota;

    /**
     * Get <p>集团名称</p> 
     * @return GroupName <p>集团名称</p>
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set <p>集团名称</p>
     * @param GroupName <p>集团名称</p>
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get <p>管理员账号信息</p> 
     * @return AdminInfo <p>管理员账号信息</p>
     */
    public MemberInfo getAdminInfo() {
        return this.AdminInfo;
    }

    /**
     * Set <p>管理员账号信息</p>
     * @param AdminInfo <p>管理员账号信息</p>
     */
    public void setAdminInfo(MemberInfo AdminInfo) {
        this.AdminInfo = AdminInfo;
    }

    /**
     * Get <p>管理员/委派管理员数量</p> 
     * @return AdminCount <p>管理员/委派管理员数量</p>
     */
    public Long getAdminCount() {
        return this.AdminCount;
    }

    /**
     * Set <p>管理员/委派管理员数量</p>
     * @param AdminCount <p>管理员/委派管理员数量</p>
     */
    public void setAdminCount(Long AdminCount) {
        this.AdminCount = AdminCount;
    }

    /**
     * Get <p>已接入成员数</p> 
     * @return JoinedMemberCount <p>已接入成员数</p>
     */
    public Long getJoinedMemberCount() {
        return this.JoinedMemberCount;
    }

    /**
     * Set <p>已接入成员数</p>
     * @param JoinedMemberCount <p>已接入成员数</p>
     */
    public void setJoinedMemberCount(Long JoinedMemberCount) {
        this.JoinedMemberCount = JoinedMemberCount;
    }

    /**
     * Get <p>接入成员上限（-1表示无上限）</p> 
     * @return MemberLimit <p>接入成员上限（-1表示无上限）</p>
     */
    public Long getMemberLimit() {
        return this.MemberLimit;
    }

    /**
     * Set <p>接入成员上限（-1表示无上限）</p>
     * @param MemberLimit <p>接入成员上限（-1表示无上限）</p>
     */
    public void setMemberLimit(Long MemberLimit) {
        this.MemberLimit = MemberLimit;
    }

    /**
     * Get <p>接入成员上限显示</p> 
     * @return MemberLimitDisplay <p>接入成员上限显示</p>
     */
    public String getMemberLimitDisplay() {
        return this.MemberLimitDisplay;
    }

    /**
     * Set <p>接入成员上限显示</p>
     * @param MemberLimitDisplay <p>接入成员上限显示</p>
     */
    public void setMemberLimitDisplay(String MemberLimitDisplay) {
        this.MemberLimitDisplay = MemberLimitDisplay;
    }

    /**
     * Get <p>规格共享者数量</p> 
     * @return CfwSharerCount <p>规格共享者数量</p>
     */
    public Long getCfwSharerCount() {
        return this.CfwSharerCount;
    }

    /**
     * Set <p>规格共享者数量</p>
     * @param CfwSharerCount <p>规格共享者数量</p>
     */
    public void setCfwSharerCount(Long CfwSharerCount) {
        this.CfwSharerCount = CfwSharerCount;
    }

    /**
     * Get <p>规格使用者数量</p> 
     * @return CfwUserCount <p>规格使用者数量</p>
     */
    public Long getCfwUserCount() {
        return this.CfwUserCount;
    }

    /**
     * Set <p>规格使用者数量</p>
     * @param CfwUserCount <p>规格使用者数量</p>
     */
    public void setCfwUserCount(Long CfwUserCount) {
        this.CfwUserCount = CfwUserCount;
    }

    /**
     * Get <p>部门名称列表</p> 
     * @return Departments <p>部门名称列表</p>
     */
    public String [] getDepartments() {
        return this.Departments;
    }

    /**
     * Set <p>部门名称列表</p>
     * @param Departments <p>部门名称列表</p>
     */
    public void setDepartments(String [] Departments) {
        this.Departments = Departments;
    }

    /**
     * Get <p>纳管账号数</p> 
     * @return ManagedMemberCount <p>纳管账号数</p>
     */
    public Long getManagedMemberCount() {
        return this.ManagedMemberCount;
    }

    /**
     * Set <p>纳管账号数</p>
     * @param ManagedMemberCount <p>纳管账号数</p>
     */
    public void setManagedMemberCount(Long ManagedMemberCount) {
        this.ManagedMemberCount = ManagedMemberCount;
    }

    /**
     * Get <p>纳管产品数</p> 
     * @return ManagedProductCount <p>纳管产品数</p>
     */
    public Long getManagedProductCount() {
        return this.ManagedProductCount;
    }

    /**
     * Set <p>纳管产品数</p>
     * @param ManagedProductCount <p>纳管产品数</p>
     */
    public void setManagedProductCount(Long ManagedProductCount) {
        this.ManagedProductCount = ManagedProductCount;
    }

    /**
     * Get <p>纳管账号数</p> 
     * @return CfwManageCount <p>纳管账号数</p>
     */
    public Long getCfwManageCount() {
        return this.CfwManageCount;
    }

    /**
     * Set <p>纳管账号数</p>
     * @param CfwManageCount <p>纳管账号数</p>
     */
    public void setCfwManageCount(Long CfwManageCount) {
        this.CfwManageCount = CfwManageCount;
    }

    /**
     * Get <p>规格共享总配额</p> 
     * @return FwmShareUserQuota <p>规格共享总配额</p>
     */
    public Long getFwmShareUserQuota() {
        return this.FwmShareUserQuota;
    }

    /**
     * Set <p>规格共享总配额</p>
     * @param FwmShareUserQuota <p>规格共享总配额</p>
     */
    public void setFwmShareUserQuota(Long FwmShareUserQuota) {
        this.FwmShareUserQuota = FwmShareUserQuota;
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
        if (source.FwmShareUserQuota != null) {
            this.FwmShareUserQuota = new Long(source.FwmShareUserQuota);
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
        this.setParamSimple(map, prefix + "FwmShareUserQuota", this.FwmShareUserQuota);

    }
}

