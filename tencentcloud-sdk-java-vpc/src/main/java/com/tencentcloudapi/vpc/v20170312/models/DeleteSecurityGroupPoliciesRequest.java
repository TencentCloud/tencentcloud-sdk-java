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

public class DeleteSecurityGroupPoliciesRequest extends AbstractModel{

    /**
    * 安全组实例ID，例如sg-33ocnj9n，可通过DescribeSecurityGroups获取。
    */
    @SerializedName("SecurityGroupId")
    @Expose
    private String SecurityGroupId;

    /**
    * 安全组规则集合。一个请求中只能删除单个方向的一条或多条规则。支持指定索引（PolicyIndex） 匹配删除和安全组规则匹配删除两种方式，一个请求中只能使用一种匹配方式。
    */
    @SerializedName("SecurityGroupPolicySet")
    @Expose
    private SecurityGroupPolicySet SecurityGroupPolicySet;

    /**
     * Get 安全组实例ID，例如sg-33ocnj9n，可通过DescribeSecurityGroups获取。 
     * @return SecurityGroupId 安全组实例ID，例如sg-33ocnj9n，可通过DescribeSecurityGroups获取。
     */
    public String getSecurityGroupId() {
        return this.SecurityGroupId;
    }

    /**
     * Set 安全组实例ID，例如sg-33ocnj9n，可通过DescribeSecurityGroups获取。
     * @param SecurityGroupId 安全组实例ID，例如sg-33ocnj9n，可通过DescribeSecurityGroups获取。
     */
    public void setSecurityGroupId(String SecurityGroupId) {
        this.SecurityGroupId = SecurityGroupId;
    }

    /**
     * Get 安全组规则集合。一个请求中只能删除单个方向的一条或多条规则。支持指定索引（PolicyIndex） 匹配删除和安全组规则匹配删除两种方式，一个请求中只能使用一种匹配方式。 
     * @return SecurityGroupPolicySet 安全组规则集合。一个请求中只能删除单个方向的一条或多条规则。支持指定索引（PolicyIndex） 匹配删除和安全组规则匹配删除两种方式，一个请求中只能使用一种匹配方式。
     */
    public SecurityGroupPolicySet getSecurityGroupPolicySet() {
        return this.SecurityGroupPolicySet;
    }

    /**
     * Set 安全组规则集合。一个请求中只能删除单个方向的一条或多条规则。支持指定索引（PolicyIndex） 匹配删除和安全组规则匹配删除两种方式，一个请求中只能使用一种匹配方式。
     * @param SecurityGroupPolicySet 安全组规则集合。一个请求中只能删除单个方向的一条或多条规则。支持指定索引（PolicyIndex） 匹配删除和安全组规则匹配删除两种方式，一个请求中只能使用一种匹配方式。
     */
    public void setSecurityGroupPolicySet(SecurityGroupPolicySet SecurityGroupPolicySet) {
        this.SecurityGroupPolicySet = SecurityGroupPolicySet;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SecurityGroupId", this.SecurityGroupId);
        this.setParamObj(map, prefix + "SecurityGroupPolicySet.", this.SecurityGroupPolicySet);

    }
}

