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

public class ReplaceSecurityGroupPoliciesRequest extends AbstractModel {

    /**
    * 安全组实例ID，例如sg-33ocnj9n，可通过<a href="https://cloud.tencent.com/document/product/215/15808">DescribeSecurityGroups</a>获取。
    */
    @SerializedName("SecurityGroupId")
    @Expose
    private String SecurityGroupId;

    /**
    * 安全组规则集合对象。
    */
    @SerializedName("SecurityGroupPolicySet")
    @Expose
    private SecurityGroupPolicySet SecurityGroupPolicySet;

    /**
    * 旧的安全组规则集合对象，当更新优先级时为必选，且修改顺序与SecurityGroupPolicySet参数顺序一一对应，入参长度需要与SecurityGroupPolicySet参数保持一致。
    */
    @SerializedName("OriginalSecurityGroupPolicySet")
    @Expose
    private SecurityGroupPolicySet OriginalSecurityGroupPolicySet;

    /**
    * 更新类型，默认 Policy  Policy：只更新内容  Priority：只更新优先级  Both：内容和优先级都更新
    */
    @SerializedName("UpdateType")
    @Expose
    private String UpdateType;

    /**
     * Get 安全组实例ID，例如sg-33ocnj9n，可通过<a href="https://cloud.tencent.com/document/product/215/15808">DescribeSecurityGroups</a>获取。 
     * @return SecurityGroupId 安全组实例ID，例如sg-33ocnj9n，可通过<a href="https://cloud.tencent.com/document/product/215/15808">DescribeSecurityGroups</a>获取。
     */
    public String getSecurityGroupId() {
        return this.SecurityGroupId;
    }

    /**
     * Set 安全组实例ID，例如sg-33ocnj9n，可通过<a href="https://cloud.tencent.com/document/product/215/15808">DescribeSecurityGroups</a>获取。
     * @param SecurityGroupId 安全组实例ID，例如sg-33ocnj9n，可通过<a href="https://cloud.tencent.com/document/product/215/15808">DescribeSecurityGroups</a>获取。
     */
    public void setSecurityGroupId(String SecurityGroupId) {
        this.SecurityGroupId = SecurityGroupId;
    }

    /**
     * Get 安全组规则集合对象。 
     * @return SecurityGroupPolicySet 安全组规则集合对象。
     */
    public SecurityGroupPolicySet getSecurityGroupPolicySet() {
        return this.SecurityGroupPolicySet;
    }

    /**
     * Set 安全组规则集合对象。
     * @param SecurityGroupPolicySet 安全组规则集合对象。
     */
    public void setSecurityGroupPolicySet(SecurityGroupPolicySet SecurityGroupPolicySet) {
        this.SecurityGroupPolicySet = SecurityGroupPolicySet;
    }

    /**
     * Get 旧的安全组规则集合对象，当更新优先级时为必选，且修改顺序与SecurityGroupPolicySet参数顺序一一对应，入参长度需要与SecurityGroupPolicySet参数保持一致。 
     * @return OriginalSecurityGroupPolicySet 旧的安全组规则集合对象，当更新优先级时为必选，且修改顺序与SecurityGroupPolicySet参数顺序一一对应，入参长度需要与SecurityGroupPolicySet参数保持一致。
     */
    public SecurityGroupPolicySet getOriginalSecurityGroupPolicySet() {
        return this.OriginalSecurityGroupPolicySet;
    }

    /**
     * Set 旧的安全组规则集合对象，当更新优先级时为必选，且修改顺序与SecurityGroupPolicySet参数顺序一一对应，入参长度需要与SecurityGroupPolicySet参数保持一致。
     * @param OriginalSecurityGroupPolicySet 旧的安全组规则集合对象，当更新优先级时为必选，且修改顺序与SecurityGroupPolicySet参数顺序一一对应，入参长度需要与SecurityGroupPolicySet参数保持一致。
     */
    public void setOriginalSecurityGroupPolicySet(SecurityGroupPolicySet OriginalSecurityGroupPolicySet) {
        this.OriginalSecurityGroupPolicySet = OriginalSecurityGroupPolicySet;
    }

    /**
     * Get 更新类型，默认 Policy  Policy：只更新内容  Priority：只更新优先级  Both：内容和优先级都更新 
     * @return UpdateType 更新类型，默认 Policy  Policy：只更新内容  Priority：只更新优先级  Both：内容和优先级都更新
     */
    public String getUpdateType() {
        return this.UpdateType;
    }

    /**
     * Set 更新类型，默认 Policy  Policy：只更新内容  Priority：只更新优先级  Both：内容和优先级都更新
     * @param UpdateType 更新类型，默认 Policy  Policy：只更新内容  Priority：只更新优先级  Both：内容和优先级都更新
     */
    public void setUpdateType(String UpdateType) {
        this.UpdateType = UpdateType;
    }

    public ReplaceSecurityGroupPoliciesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReplaceSecurityGroupPoliciesRequest(ReplaceSecurityGroupPoliciesRequest source) {
        if (source.SecurityGroupId != null) {
            this.SecurityGroupId = new String(source.SecurityGroupId);
        }
        if (source.SecurityGroupPolicySet != null) {
            this.SecurityGroupPolicySet = new SecurityGroupPolicySet(source.SecurityGroupPolicySet);
        }
        if (source.OriginalSecurityGroupPolicySet != null) {
            this.OriginalSecurityGroupPolicySet = new SecurityGroupPolicySet(source.OriginalSecurityGroupPolicySet);
        }
        if (source.UpdateType != null) {
            this.UpdateType = new String(source.UpdateType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SecurityGroupId", this.SecurityGroupId);
        this.setParamObj(map, prefix + "SecurityGroupPolicySet.", this.SecurityGroupPolicySet);
        this.setParamObj(map, prefix + "OriginalSecurityGroupPolicySet.", this.OriginalSecurityGroupPolicySet);
        this.setParamSimple(map, prefix + "UpdateType", this.UpdateType);

    }
}

