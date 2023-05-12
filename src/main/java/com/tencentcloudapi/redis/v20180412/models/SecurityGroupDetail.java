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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SecurityGroupDetail extends AbstractModel{

    /**
    * 项目ID。
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * 创建安全组的时间。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

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
    * 安全组标记。
    */
    @SerializedName("SecurityGroupRemark")
    @Expose
    private String SecurityGroupRemark;

    /**
    * 安全组入站规则，即控制访问数据库的来源。
    */
    @SerializedName("InboundRule")
    @Expose
    private SecurityGroupsInboundAndOutbound [] InboundRule;

    /**
    * 安全组出站规则。
    */
    @SerializedName("OutboundRule")
    @Expose
    private SecurityGroupsInboundAndOutbound [] OutboundRule;

    /**
     * Get 项目ID。 
     * @return ProjectId 项目ID。
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目ID。
     * @param ProjectId 项目ID。
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 创建安全组的时间。 
     * @return CreateTime 创建安全组的时间。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建安全组的时间。
     * @param CreateTime 创建安全组的时间。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
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
     * Get 安全组标记。 
     * @return SecurityGroupRemark 安全组标记。
     */
    public String getSecurityGroupRemark() {
        return this.SecurityGroupRemark;
    }

    /**
     * Set 安全组标记。
     * @param SecurityGroupRemark 安全组标记。
     */
    public void setSecurityGroupRemark(String SecurityGroupRemark) {
        this.SecurityGroupRemark = SecurityGroupRemark;
    }

    /**
     * Get 安全组入站规则，即控制访问数据库的来源。 
     * @return InboundRule 安全组入站规则，即控制访问数据库的来源。
     */
    public SecurityGroupsInboundAndOutbound [] getInboundRule() {
        return this.InboundRule;
    }

    /**
     * Set 安全组入站规则，即控制访问数据库的来源。
     * @param InboundRule 安全组入站规则，即控制访问数据库的来源。
     */
    public void setInboundRule(SecurityGroupsInboundAndOutbound [] InboundRule) {
        this.InboundRule = InboundRule;
    }

    /**
     * Get 安全组出站规则。 
     * @return OutboundRule 安全组出站规则。
     */
    public SecurityGroupsInboundAndOutbound [] getOutboundRule() {
        return this.OutboundRule;
    }

    /**
     * Set 安全组出站规则。
     * @param OutboundRule 安全组出站规则。
     */
    public void setOutboundRule(SecurityGroupsInboundAndOutbound [] OutboundRule) {
        this.OutboundRule = OutboundRule;
    }

    public SecurityGroupDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SecurityGroupDetail(SecurityGroupDetail source) {
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
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
        if (source.InboundRule != null) {
            this.InboundRule = new SecurityGroupsInboundAndOutbound[source.InboundRule.length];
            for (int i = 0; i < source.InboundRule.length; i++) {
                this.InboundRule[i] = new SecurityGroupsInboundAndOutbound(source.InboundRule[i]);
            }
        }
        if (source.OutboundRule != null) {
            this.OutboundRule = new SecurityGroupsInboundAndOutbound[source.OutboundRule.length];
            for (int i = 0; i < source.OutboundRule.length; i++) {
                this.OutboundRule[i] = new SecurityGroupsInboundAndOutbound(source.OutboundRule[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "SecurityGroupId", this.SecurityGroupId);
        this.setParamSimple(map, prefix + "SecurityGroupName", this.SecurityGroupName);
        this.setParamSimple(map, prefix + "SecurityGroupRemark", this.SecurityGroupRemark);
        this.setParamArrayObj(map, prefix + "InboundRule.", this.InboundRule);
        this.setParamArrayObj(map, prefix + "OutboundRule.", this.OutboundRule);

    }
}

