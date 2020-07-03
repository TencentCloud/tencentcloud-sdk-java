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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateSecurityGroupWithPoliciesRequest extends AbstractModel{

    /**
    * 安全组名称，可任意命名，但不得超过60个字符。
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * 安全组备注，最多100个字符。
    */
    @SerializedName("GroupDescription")
    @Expose
    private String GroupDescription;

    /**
    * 项目ID，默认0。可在qcloud控制台项目管理页面查询到。
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 安全组规则集合。
    */
    @SerializedName("SecurityGroupPolicySet")
    @Expose
    private SecurityGroupPolicySet SecurityGroupPolicySet;

    /**
     * Get 安全组名称，可任意命名，但不得超过60个字符。 
     * @return GroupName 安全组名称，可任意命名，但不得超过60个字符。
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set 安全组名称，可任意命名，但不得超过60个字符。
     * @param GroupName 安全组名称，可任意命名，但不得超过60个字符。
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get 安全组备注，最多100个字符。 
     * @return GroupDescription 安全组备注，最多100个字符。
     */
    public String getGroupDescription() {
        return this.GroupDescription;
    }

    /**
     * Set 安全组备注，最多100个字符。
     * @param GroupDescription 安全组备注，最多100个字符。
     */
    public void setGroupDescription(String GroupDescription) {
        this.GroupDescription = GroupDescription;
    }

    /**
     * Get 项目ID，默认0。可在qcloud控制台项目管理页面查询到。 
     * @return ProjectId 项目ID，默认0。可在qcloud控制台项目管理页面查询到。
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目ID，默认0。可在qcloud控制台项目管理页面查询到。
     * @param ProjectId 项目ID，默认0。可在qcloud控制台项目管理页面查询到。
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 安全组规则集合。 
     * @return SecurityGroupPolicySet 安全组规则集合。
     */
    public SecurityGroupPolicySet getSecurityGroupPolicySet() {
        return this.SecurityGroupPolicySet;
    }

    /**
     * Set 安全组规则集合。
     * @param SecurityGroupPolicySet 安全组规则集合。
     */
    public void setSecurityGroupPolicySet(SecurityGroupPolicySet SecurityGroupPolicySet) {
        this.SecurityGroupPolicySet = SecurityGroupPolicySet;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "GroupDescription", this.GroupDescription);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamObj(map, prefix + "SecurityGroupPolicySet.", this.SecurityGroupPolicySet);

    }
}

