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
package com.tencentcloudapi.organization.v20210331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OrganizationServiceAssignMember extends AbstractModel {

    /**
    * 集团服务ID。
    */
    @SerializedName("ServiceId")
    @Expose
    private Long ServiceId;

    /**
    * 集团服务产品名称。
    */
    @SerializedName("ProductName")
    @Expose
    private String ProductName;

    /**
    * 委派管理员Uin。
    */
    @SerializedName("MemberUin")
    @Expose
    private Long MemberUin;

    /**
    * 委派管理员名称。
    */
    @SerializedName("MemberName")
    @Expose
    private String MemberName;

    /**
    * 启用状态 。取值：0-服务无启用状态  1-已启用  2-未启用
    */
    @SerializedName("UsageStatus")
    @Expose
    private Long UsageStatus;

    /**
    * 委派时间。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 委派管理员管理范围。取值: 1-全部成员  2-部分成员
    */
    @SerializedName("ManagementScope")
    @Expose
    private Long ManagementScope;

    /**
    * 管理的成员Uin列表。ManagementScope值为2时该参数有效
    */
    @SerializedName("ManagementScopeMembers")
    @Expose
    private MemberMainInfo [] ManagementScopeMembers;

    /**
    * 管理的部门ID列表。ManagementScope值为2时该参数有效
    */
    @SerializedName("ManagementScopeNodes")
    @Expose
    private NodeMainInfo [] ManagementScopeNodes;

    /**
     * Get 集团服务ID。 
     * @return ServiceId 集团服务ID。
     */
    public Long getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set 集团服务ID。
     * @param ServiceId 集团服务ID。
     */
    public void setServiceId(Long ServiceId) {
        this.ServiceId = ServiceId;
    }

    /**
     * Get 集团服务产品名称。 
     * @return ProductName 集团服务产品名称。
     */
    public String getProductName() {
        return this.ProductName;
    }

    /**
     * Set 集团服务产品名称。
     * @param ProductName 集团服务产品名称。
     */
    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    /**
     * Get 委派管理员Uin。 
     * @return MemberUin 委派管理员Uin。
     */
    public Long getMemberUin() {
        return this.MemberUin;
    }

    /**
     * Set 委派管理员Uin。
     * @param MemberUin 委派管理员Uin。
     */
    public void setMemberUin(Long MemberUin) {
        this.MemberUin = MemberUin;
    }

    /**
     * Get 委派管理员名称。 
     * @return MemberName 委派管理员名称。
     */
    public String getMemberName() {
        return this.MemberName;
    }

    /**
     * Set 委派管理员名称。
     * @param MemberName 委派管理员名称。
     */
    public void setMemberName(String MemberName) {
        this.MemberName = MemberName;
    }

    /**
     * Get 启用状态 。取值：0-服务无启用状态  1-已启用  2-未启用 
     * @return UsageStatus 启用状态 。取值：0-服务无启用状态  1-已启用  2-未启用
     */
    public Long getUsageStatus() {
        return this.UsageStatus;
    }

    /**
     * Set 启用状态 。取值：0-服务无启用状态  1-已启用  2-未启用
     * @param UsageStatus 启用状态 。取值：0-服务无启用状态  1-已启用  2-未启用
     */
    public void setUsageStatus(Long UsageStatus) {
        this.UsageStatus = UsageStatus;
    }

    /**
     * Get 委派时间。 
     * @return CreateTime 委派时间。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 委派时间。
     * @param CreateTime 委派时间。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 委派管理员管理范围。取值: 1-全部成员  2-部分成员 
     * @return ManagementScope 委派管理员管理范围。取值: 1-全部成员  2-部分成员
     */
    public Long getManagementScope() {
        return this.ManagementScope;
    }

    /**
     * Set 委派管理员管理范围。取值: 1-全部成员  2-部分成员
     * @param ManagementScope 委派管理员管理范围。取值: 1-全部成员  2-部分成员
     */
    public void setManagementScope(Long ManagementScope) {
        this.ManagementScope = ManagementScope;
    }

    /**
     * Get 管理的成员Uin列表。ManagementScope值为2时该参数有效 
     * @return ManagementScopeMembers 管理的成员Uin列表。ManagementScope值为2时该参数有效
     */
    public MemberMainInfo [] getManagementScopeMembers() {
        return this.ManagementScopeMembers;
    }

    /**
     * Set 管理的成员Uin列表。ManagementScope值为2时该参数有效
     * @param ManagementScopeMembers 管理的成员Uin列表。ManagementScope值为2时该参数有效
     */
    public void setManagementScopeMembers(MemberMainInfo [] ManagementScopeMembers) {
        this.ManagementScopeMembers = ManagementScopeMembers;
    }

    /**
     * Get 管理的部门ID列表。ManagementScope值为2时该参数有效 
     * @return ManagementScopeNodes 管理的部门ID列表。ManagementScope值为2时该参数有效
     */
    public NodeMainInfo [] getManagementScopeNodes() {
        return this.ManagementScopeNodes;
    }

    /**
     * Set 管理的部门ID列表。ManagementScope值为2时该参数有效
     * @param ManagementScopeNodes 管理的部门ID列表。ManagementScope值为2时该参数有效
     */
    public void setManagementScopeNodes(NodeMainInfo [] ManagementScopeNodes) {
        this.ManagementScopeNodes = ManagementScopeNodes;
    }

    public OrganizationServiceAssignMember() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OrganizationServiceAssignMember(OrganizationServiceAssignMember source) {
        if (source.ServiceId != null) {
            this.ServiceId = new Long(source.ServiceId);
        }
        if (source.ProductName != null) {
            this.ProductName = new String(source.ProductName);
        }
        if (source.MemberUin != null) {
            this.MemberUin = new Long(source.MemberUin);
        }
        if (source.MemberName != null) {
            this.MemberName = new String(source.MemberName);
        }
        if (source.UsageStatus != null) {
            this.UsageStatus = new Long(source.UsageStatus);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ManagementScope != null) {
            this.ManagementScope = new Long(source.ManagementScope);
        }
        if (source.ManagementScopeMembers != null) {
            this.ManagementScopeMembers = new MemberMainInfo[source.ManagementScopeMembers.length];
            for (int i = 0; i < source.ManagementScopeMembers.length; i++) {
                this.ManagementScopeMembers[i] = new MemberMainInfo(source.ManagementScopeMembers[i]);
            }
        }
        if (source.ManagementScopeNodes != null) {
            this.ManagementScopeNodes = new NodeMainInfo[source.ManagementScopeNodes.length];
            for (int i = 0; i < source.ManagementScopeNodes.length; i++) {
                this.ManagementScopeNodes[i] = new NodeMainInfo(source.ManagementScopeNodes[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamSimple(map, prefix + "ProductName", this.ProductName);
        this.setParamSimple(map, prefix + "MemberUin", this.MemberUin);
        this.setParamSimple(map, prefix + "MemberName", this.MemberName);
        this.setParamSimple(map, prefix + "UsageStatus", this.UsageStatus);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ManagementScope", this.ManagementScope);
        this.setParamArrayObj(map, prefix + "ManagementScopeMembers.", this.ManagementScopeMembers);
        this.setParamArrayObj(map, prefix + "ManagementScopeNodes.", this.ManagementScopeNodes);

    }
}

