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
    * 旧的安全组规则集合对象，可选，日志记录用。
    */
    @SerializedName("OriginalSecurityGroupPolicySet")
    @Expose
    private SecurityGroupPolicySet OriginalSecurityGroupPolicySet;

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
     * Get 旧的安全组规则集合对象，可选，日志记录用。 
     * @return OriginalSecurityGroupPolicySet 旧的安全组规则集合对象，可选，日志记录用。
     */
    public SecurityGroupPolicySet getOriginalSecurityGroupPolicySet() {
        return this.OriginalSecurityGroupPolicySet;
    }

    /**
     * Set 旧的安全组规则集合对象，可选，日志记录用。
     * @param OriginalSecurityGroupPolicySet 旧的安全组规则集合对象，可选，日志记录用。
     */
    public void setOriginalSecurityGroupPolicySet(SecurityGroupPolicySet OriginalSecurityGroupPolicySet) {
        this.OriginalSecurityGroupPolicySet = OriginalSecurityGroupPolicySet;
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SecurityGroupId", this.SecurityGroupId);
        this.setParamObj(map, prefix + "SecurityGroupPolicySet.", this.SecurityGroupPolicySet);
        this.setParamObj(map, prefix + "OriginalSecurityGroupPolicySet.", this.OriginalSecurityGroupPolicySet);

    }
}

