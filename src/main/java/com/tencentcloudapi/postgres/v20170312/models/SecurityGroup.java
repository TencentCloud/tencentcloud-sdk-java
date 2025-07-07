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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SecurityGroup extends AbstractModel {

    /**
    * 项目Id
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 入站规则
    */
    @SerializedName("Inbound")
    @Expose
    private PolicyRule [] Inbound;

    /**
    * 出站规则
    */
    @SerializedName("Outbound")
    @Expose
    private PolicyRule [] Outbound;

    /**
    * 安全组ID
    */
    @SerializedName("SecurityGroupId")
    @Expose
    private String SecurityGroupId;

    /**
    * 安全组名称
    */
    @SerializedName("SecurityGroupName")
    @Expose
    private String SecurityGroupName;

    /**
    * 安全组备注
    */
    @SerializedName("SecurityGroupDescription")
    @Expose
    private String SecurityGroupDescription;

    /**
     * Get 项目Id 
     * @return ProjectId 项目Id
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目Id
     * @param ProjectId 项目Id
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
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
     * Get 入站规则 
     * @return Inbound 入站规则
     */
    public PolicyRule [] getInbound() {
        return this.Inbound;
    }

    /**
     * Set 入站规则
     * @param Inbound 入站规则
     */
    public void setInbound(PolicyRule [] Inbound) {
        this.Inbound = Inbound;
    }

    /**
     * Get 出站规则 
     * @return Outbound 出站规则
     */
    public PolicyRule [] getOutbound() {
        return this.Outbound;
    }

    /**
     * Set 出站规则
     * @param Outbound 出站规则
     */
    public void setOutbound(PolicyRule [] Outbound) {
        this.Outbound = Outbound;
    }

    /**
     * Get 安全组ID 
     * @return SecurityGroupId 安全组ID
     */
    public String getSecurityGroupId() {
        return this.SecurityGroupId;
    }

    /**
     * Set 安全组ID
     * @param SecurityGroupId 安全组ID
     */
    public void setSecurityGroupId(String SecurityGroupId) {
        this.SecurityGroupId = SecurityGroupId;
    }

    /**
     * Get 安全组名称 
     * @return SecurityGroupName 安全组名称
     */
    public String getSecurityGroupName() {
        return this.SecurityGroupName;
    }

    /**
     * Set 安全组名称
     * @param SecurityGroupName 安全组名称
     */
    public void setSecurityGroupName(String SecurityGroupName) {
        this.SecurityGroupName = SecurityGroupName;
    }

    /**
     * Get 安全组备注 
     * @return SecurityGroupDescription 安全组备注
     */
    public String getSecurityGroupDescription() {
        return this.SecurityGroupDescription;
    }

    /**
     * Set 安全组备注
     * @param SecurityGroupDescription 安全组备注
     */
    public void setSecurityGroupDescription(String SecurityGroupDescription) {
        this.SecurityGroupDescription = SecurityGroupDescription;
    }

    public SecurityGroup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SecurityGroup(SecurityGroup source) {
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
        if (source.SecurityGroupId != null) {
            this.SecurityGroupId = new String(source.SecurityGroupId);
        }
        if (source.SecurityGroupName != null) {
            this.SecurityGroupName = new String(source.SecurityGroupName);
        }
        if (source.SecurityGroupDescription != null) {
            this.SecurityGroupDescription = new String(source.SecurityGroupDescription);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamArrayObj(map, prefix + "Inbound.", this.Inbound);
        this.setParamArrayObj(map, prefix + "Outbound.", this.Outbound);
        this.setParamSimple(map, prefix + "SecurityGroupId", this.SecurityGroupId);
        this.setParamSimple(map, prefix + "SecurityGroupName", this.SecurityGroupName);
        this.setParamSimple(map, prefix + "SecurityGroupDescription", this.SecurityGroupDescription);

    }
}

