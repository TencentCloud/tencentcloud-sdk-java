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

public class SecurityGroupLimitSet extends AbstractModel{

    /**
    * 每个项目每个地域可创建安全组数
    */
    @SerializedName("SecurityGroupLimit")
    @Expose
    private Long SecurityGroupLimit;

    /**
    * 安全组下的最大规则数
    */
    @SerializedName("SecurityGroupPolicyLimit")
    @Expose
    private Long SecurityGroupPolicyLimit;

    /**
    * 安全组下嵌套安全组规则数
    */
    @SerializedName("ReferedSecurityGroupLimit")
    @Expose
    private Long ReferedSecurityGroupLimit;

    /**
    * 单安全组关联实例数
    */
    @SerializedName("SecurityGroupInstanceLimit")
    @Expose
    private Long SecurityGroupInstanceLimit;

    /**
    * 实例关联安全组数
    */
    @SerializedName("InstanceSecurityGroupLimit")
    @Expose
    private Long InstanceSecurityGroupLimit;

    /**
     * Get 每个项目每个地域可创建安全组数 
     * @return SecurityGroupLimit 每个项目每个地域可创建安全组数
     */
    public Long getSecurityGroupLimit() {
        return this.SecurityGroupLimit;
    }

    /**
     * Set 每个项目每个地域可创建安全组数
     * @param SecurityGroupLimit 每个项目每个地域可创建安全组数
     */
    public void setSecurityGroupLimit(Long SecurityGroupLimit) {
        this.SecurityGroupLimit = SecurityGroupLimit;
    }

    /**
     * Get 安全组下的最大规则数 
     * @return SecurityGroupPolicyLimit 安全组下的最大规则数
     */
    public Long getSecurityGroupPolicyLimit() {
        return this.SecurityGroupPolicyLimit;
    }

    /**
     * Set 安全组下的最大规则数
     * @param SecurityGroupPolicyLimit 安全组下的最大规则数
     */
    public void setSecurityGroupPolicyLimit(Long SecurityGroupPolicyLimit) {
        this.SecurityGroupPolicyLimit = SecurityGroupPolicyLimit;
    }

    /**
     * Get 安全组下嵌套安全组规则数 
     * @return ReferedSecurityGroupLimit 安全组下嵌套安全组规则数
     */
    public Long getReferedSecurityGroupLimit() {
        return this.ReferedSecurityGroupLimit;
    }

    /**
     * Set 安全组下嵌套安全组规则数
     * @param ReferedSecurityGroupLimit 安全组下嵌套安全组规则数
     */
    public void setReferedSecurityGroupLimit(Long ReferedSecurityGroupLimit) {
        this.ReferedSecurityGroupLimit = ReferedSecurityGroupLimit;
    }

    /**
     * Get 单安全组关联实例数 
     * @return SecurityGroupInstanceLimit 单安全组关联实例数
     */
    public Long getSecurityGroupInstanceLimit() {
        return this.SecurityGroupInstanceLimit;
    }

    /**
     * Set 单安全组关联实例数
     * @param SecurityGroupInstanceLimit 单安全组关联实例数
     */
    public void setSecurityGroupInstanceLimit(Long SecurityGroupInstanceLimit) {
        this.SecurityGroupInstanceLimit = SecurityGroupInstanceLimit;
    }

    /**
     * Get 实例关联安全组数 
     * @return InstanceSecurityGroupLimit 实例关联安全组数
     */
    public Long getInstanceSecurityGroupLimit() {
        return this.InstanceSecurityGroupLimit;
    }

    /**
     * Set 实例关联安全组数
     * @param InstanceSecurityGroupLimit 实例关联安全组数
     */
    public void setInstanceSecurityGroupLimit(Long InstanceSecurityGroupLimit) {
        this.InstanceSecurityGroupLimit = InstanceSecurityGroupLimit;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SecurityGroupLimit", this.SecurityGroupLimit);
        this.setParamSimple(map, prefix + "SecurityGroupPolicyLimit", this.SecurityGroupPolicyLimit);
        this.setParamSimple(map, prefix + "ReferedSecurityGroupLimit", this.ReferedSecurityGroupLimit);
        this.setParamSimple(map, prefix + "SecurityGroupInstanceLimit", this.SecurityGroupInstanceLimit);
        this.setParamSimple(map, prefix + "InstanceSecurityGroupLimit", this.InstanceSecurityGroupLimit);

    }
}

