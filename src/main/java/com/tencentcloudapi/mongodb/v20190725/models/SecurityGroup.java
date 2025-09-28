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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SecurityGroup extends AbstractModel {

    /**
    * 所属项目 ID。
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * 安全组创建时间。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 安全组入站规则。
    */
    @SerializedName("Inbound")
    @Expose
    private SecurityGroupBound [] Inbound;

    /**
    * 安全组出站规则。
    */
    @SerializedName("Outbound")
    @Expose
    private SecurityGroupBound [] Outbound;

    /**
    * 安全组 ID。
    */
    @SerializedName("SecurityGroupId")
    @Expose
    private String SecurityGroupId;

    /**
    * 安全组名称。
    */
    @SerializedName("SecurityGroupName")
    @Expose
    private String SecurityGroupName;

    /**
    * 安全组备注信息。
    */
    @SerializedName("SecurityGroupRemark")
    @Expose
    private String SecurityGroupRemark;

    /**
     * Get 所属项目 ID。 
     * @return ProjectId 所属项目 ID。
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 所属项目 ID。
     * @param ProjectId 所属项目 ID。
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 安全组创建时间。 
     * @return CreateTime 安全组创建时间。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 安全组创建时间。
     * @param CreateTime 安全组创建时间。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 安全组入站规则。 
     * @return Inbound 安全组入站规则。
     */
    public SecurityGroupBound [] getInbound() {
        return this.Inbound;
    }

    /**
     * Set 安全组入站规则。
     * @param Inbound 安全组入站规则。
     */
    public void setInbound(SecurityGroupBound [] Inbound) {
        this.Inbound = Inbound;
    }

    /**
     * Get 安全组出站规则。 
     * @return Outbound 安全组出站规则。
     */
    public SecurityGroupBound [] getOutbound() {
        return this.Outbound;
    }

    /**
     * Set 安全组出站规则。
     * @param Outbound 安全组出站规则。
     */
    public void setOutbound(SecurityGroupBound [] Outbound) {
        this.Outbound = Outbound;
    }

    /**
     * Get 安全组 ID。 
     * @return SecurityGroupId 安全组 ID。
     */
    public String getSecurityGroupId() {
        return this.SecurityGroupId;
    }

    /**
     * Set 安全组 ID。
     * @param SecurityGroupId 安全组 ID。
     */
    public void setSecurityGroupId(String SecurityGroupId) {
        this.SecurityGroupId = SecurityGroupId;
    }

    /**
     * Get 安全组名称。 
     * @return SecurityGroupName 安全组名称。
     */
    public String getSecurityGroupName() {
        return this.SecurityGroupName;
    }

    /**
     * Set 安全组名称。
     * @param SecurityGroupName 安全组名称。
     */
    public void setSecurityGroupName(String SecurityGroupName) {
        this.SecurityGroupName = SecurityGroupName;
    }

    /**
     * Get 安全组备注信息。 
     * @return SecurityGroupRemark 安全组备注信息。
     */
    public String getSecurityGroupRemark() {
        return this.SecurityGroupRemark;
    }

    /**
     * Set 安全组备注信息。
     * @param SecurityGroupRemark 安全组备注信息。
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
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Inbound != null) {
            this.Inbound = new SecurityGroupBound[source.Inbound.length];
            for (int i = 0; i < source.Inbound.length; i++) {
                this.Inbound[i] = new SecurityGroupBound(source.Inbound[i]);
            }
        }
        if (source.Outbound != null) {
            this.Outbound = new SecurityGroupBound[source.Outbound.length];
            for (int i = 0; i < source.Outbound.length; i++) {
                this.Outbound[i] = new SecurityGroupBound(source.Outbound[i]);
            }
        }
        if (source.SecurityGroupId != null) {
            this.SecurityGroupId = new String(source.SecurityGroupId);
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
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamArrayObj(map, prefix + "Inbound.", this.Inbound);
        this.setParamArrayObj(map, prefix + "Outbound.", this.Outbound);
        this.setParamSimple(map, prefix + "SecurityGroupId", this.SecurityGroupId);
        this.setParamSimple(map, prefix + "SecurityGroupName", this.SecurityGroupName);
        this.setParamSimple(map, prefix + "SecurityGroupRemark", this.SecurityGroupRemark);

    }
}

