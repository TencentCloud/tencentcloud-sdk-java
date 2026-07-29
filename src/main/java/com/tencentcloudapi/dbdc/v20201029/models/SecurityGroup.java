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
package com.tencentcloudapi.dbdc.v20201029.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SecurityGroup extends AbstractModel {

    /**
    * <p>安全组ID</p>
    */
    @SerializedName("SecurityGroupId")
    @Expose
    private String SecurityGroupId;

    /**
    * <p>所属项目 ID</p>
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * <p>安全组创建时间</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>安全组入方向规则列表</p>
    */
    @SerializedName("Inbound")
    @Expose
    private PolicyRule [] Inbound;

    /**
    * <p>安全组出方向规则列表</p>
    */
    @SerializedName("Outbound")
    @Expose
    private PolicyRule [] Outbound;

    /**
    * <p>安全组名称</p>
    */
    @SerializedName("SecurityGroupName")
    @Expose
    private String SecurityGroupName;

    /**
    * <p>安全组备注说明</p>
    */
    @SerializedName("SecurityGroupRemark")
    @Expose
    private String SecurityGroupRemark;

    /**
     * Get <p>安全组ID</p> 
     * @return SecurityGroupId <p>安全组ID</p>
     */
    public String getSecurityGroupId() {
        return this.SecurityGroupId;
    }

    /**
     * Set <p>安全组ID</p>
     * @param SecurityGroupId <p>安全组ID</p>
     */
    public void setSecurityGroupId(String SecurityGroupId) {
        this.SecurityGroupId = SecurityGroupId;
    }

    /**
     * Get <p>所属项目 ID</p> 
     * @return ProjectId <p>所属项目 ID</p>
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set <p>所属项目 ID</p>
     * @param ProjectId <p>所属项目 ID</p>
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get <p>安全组创建时间</p> 
     * @return CreateTime <p>安全组创建时间</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>安全组创建时间</p>
     * @param CreateTime <p>安全组创建时间</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>安全组入方向规则列表</p> 
     * @return Inbound <p>安全组入方向规则列表</p>
     */
    public PolicyRule [] getInbound() {
        return this.Inbound;
    }

    /**
     * Set <p>安全组入方向规则列表</p>
     * @param Inbound <p>安全组入方向规则列表</p>
     */
    public void setInbound(PolicyRule [] Inbound) {
        this.Inbound = Inbound;
    }

    /**
     * Get <p>安全组出方向规则列表</p> 
     * @return Outbound <p>安全组出方向规则列表</p>
     */
    public PolicyRule [] getOutbound() {
        return this.Outbound;
    }

    /**
     * Set <p>安全组出方向规则列表</p>
     * @param Outbound <p>安全组出方向规则列表</p>
     */
    public void setOutbound(PolicyRule [] Outbound) {
        this.Outbound = Outbound;
    }

    /**
     * Get <p>安全组名称</p> 
     * @return SecurityGroupName <p>安全组名称</p>
     */
    public String getSecurityGroupName() {
        return this.SecurityGroupName;
    }

    /**
     * Set <p>安全组名称</p>
     * @param SecurityGroupName <p>安全组名称</p>
     */
    public void setSecurityGroupName(String SecurityGroupName) {
        this.SecurityGroupName = SecurityGroupName;
    }

    /**
     * Get <p>安全组备注说明</p> 
     * @return SecurityGroupRemark <p>安全组备注说明</p>
     */
    public String getSecurityGroupRemark() {
        return this.SecurityGroupRemark;
    }

    /**
     * Set <p>安全组备注说明</p>
     * @param SecurityGroupRemark <p>安全组备注说明</p>
     */
    public void setSecurityGroupRemark(String SecurityGroupRemark) {
        this.SecurityGroupRemark = SecurityGroupRemark;
    }

    public SecurityGroup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SecurityGroup(SecurityGroup source) {
        if (source.SecurityGroupId != null) {
            this.SecurityGroupId = new String(source.SecurityGroupId);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Inbound != null) {
            this.Inbound = new PolicyRule[source.Inbound.length];
            for (int i = 0; i < source.Inbound.length; i++) {
                this.Inbound[i] = new PolicyRule(source.Inbound[i]);
            }
        }
        if (source.Outbound != null) {
            this.Outbound = new PolicyRule[source.Outbound.length];
            for (int i = 0; i < source.Outbound.length; i++) {
                this.Outbound[i] = new PolicyRule(source.Outbound[i]);
            }
        }
        if (source.SecurityGroupName != null) {
            this.SecurityGroupName = new String(source.SecurityGroupName);
        }
        if (source.SecurityGroupRemark != null) {
            this.SecurityGroupRemark = new String(source.SecurityGroupRemark);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SecurityGroupId", this.SecurityGroupId);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamArrayObj(map, prefix + "Inbound.", this.Inbound);
        this.setParamArrayObj(map, prefix + "Outbound.", this.Outbound);
        this.setParamSimple(map, prefix + "SecurityGroupName", this.SecurityGroupName);
        this.setParamSimple(map, prefix + "SecurityGroupRemark", this.SecurityGroupRemark);

    }
}

