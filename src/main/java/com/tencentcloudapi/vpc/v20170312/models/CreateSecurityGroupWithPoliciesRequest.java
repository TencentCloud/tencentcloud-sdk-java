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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateSecurityGroupWithPoliciesRequest extends AbstractModel {

    /**
    * <p>安全组名称，可任意命名，但不得超过60个字符。</p>
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * <p>安全组备注，最多100个字符。</p>
    */
    @SerializedName("GroupDescription")
    @Expose
    private String GroupDescription;

    /**
    * <p>项目ID，默认0。可在<a href="https://console.cloud.tencent.com/project">控制台项目管理页面</a>查询到。</p>
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * <p>安全组规则集合。</p>
    */
    @SerializedName("SecurityGroupPolicySet")
    @Expose
    private SecurityGroupPolicySet SecurityGroupPolicySet;

    /**
    * <p>指定绑定的标签列表，例如：[{&quot;Key&quot;: &quot;city&quot;, &quot;Value&quot;: &quot;shanghai&quot;}]。</p>
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
     * Get <p>安全组名称，可任意命名，但不得超过60个字符。</p> 
     * @return GroupName <p>安全组名称，可任意命名，但不得超过60个字符。</p>
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set <p>安全组名称，可任意命名，但不得超过60个字符。</p>
     * @param GroupName <p>安全组名称，可任意命名，但不得超过60个字符。</p>
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get <p>安全组备注，最多100个字符。</p> 
     * @return GroupDescription <p>安全组备注，最多100个字符。</p>
     */
    public String getGroupDescription() {
        return this.GroupDescription;
    }

    /**
     * Set <p>安全组备注，最多100个字符。</p>
     * @param GroupDescription <p>安全组备注，最多100个字符。</p>
     */
    public void setGroupDescription(String GroupDescription) {
        this.GroupDescription = GroupDescription;
    }

    /**
     * Get <p>项目ID，默认0。可在<a href="https://console.cloud.tencent.com/project">控制台项目管理页面</a>查询到。</p> 
     * @return ProjectId <p>项目ID，默认0。可在<a href="https://console.cloud.tencent.com/project">控制台项目管理页面</a>查询到。</p>
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set <p>项目ID，默认0。可在<a href="https://console.cloud.tencent.com/project">控制台项目管理页面</a>查询到。</p>
     * @param ProjectId <p>项目ID，默认0。可在<a href="https://console.cloud.tencent.com/project">控制台项目管理页面</a>查询到。</p>
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get <p>安全组规则集合。</p> 
     * @return SecurityGroupPolicySet <p>安全组规则集合。</p>
     */
    public SecurityGroupPolicySet getSecurityGroupPolicySet() {
        return this.SecurityGroupPolicySet;
    }

    /**
     * Set <p>安全组规则集合。</p>
     * @param SecurityGroupPolicySet <p>安全组规则集合。</p>
     */
    public void setSecurityGroupPolicySet(SecurityGroupPolicySet SecurityGroupPolicySet) {
        this.SecurityGroupPolicySet = SecurityGroupPolicySet;
    }

    /**
     * Get <p>指定绑定的标签列表，例如：[{&quot;Key&quot;: &quot;city&quot;, &quot;Value&quot;: &quot;shanghai&quot;}]。</p> 
     * @return Tags <p>指定绑定的标签列表，例如：[{&quot;Key&quot;: &quot;city&quot;, &quot;Value&quot;: &quot;shanghai&quot;}]。</p>
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>指定绑定的标签列表，例如：[{&quot;Key&quot;: &quot;city&quot;, &quot;Value&quot;: &quot;shanghai&quot;}]。</p>
     * @param Tags <p>指定绑定的标签列表，例如：[{&quot;Key&quot;: &quot;city&quot;, &quot;Value&quot;: &quot;shanghai&quot;}]。</p>
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    public CreateSecurityGroupWithPoliciesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateSecurityGroupWithPoliciesRequest(CreateSecurityGroupWithPoliciesRequest source) {
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.GroupDescription != null) {
            this.GroupDescription = new String(source.GroupDescription);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.SecurityGroupPolicySet != null) {
            this.SecurityGroupPolicySet = new SecurityGroupPolicySet(source.SecurityGroupPolicySet);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "GroupDescription", this.GroupDescription);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamObj(map, prefix + "SecurityGroupPolicySet.", this.SecurityGroupPolicySet);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

