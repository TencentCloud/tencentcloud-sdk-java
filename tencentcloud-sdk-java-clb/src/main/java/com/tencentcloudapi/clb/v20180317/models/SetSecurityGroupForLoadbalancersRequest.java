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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SetSecurityGroupForLoadbalancersRequest extends AbstractModel{

    /**
    * 安全组ID，如 sg-12345678
    */
    @SerializedName("SecurityGroup")
    @Expose
    private String SecurityGroup;

    /**
    * ADD 绑定安全组；
DEL 解绑安全组
    */
    @SerializedName("OperationType")
    @Expose
    private String OperationType;

    /**
    * 负载均衡实例ID数组
    */
    @SerializedName("LoadBalancerIds")
    @Expose
    private String [] LoadBalancerIds;

    /**
     * Get 安全组ID，如 sg-12345678 
     * @return SecurityGroup 安全组ID，如 sg-12345678
     */
    public String getSecurityGroup() {
        return this.SecurityGroup;
    }

    /**
     * Set 安全组ID，如 sg-12345678
     * @param SecurityGroup 安全组ID，如 sg-12345678
     */
    public void setSecurityGroup(String SecurityGroup) {
        this.SecurityGroup = SecurityGroup;
    }

    /**
     * Get ADD 绑定安全组；
DEL 解绑安全组 
     * @return OperationType ADD 绑定安全组；
DEL 解绑安全组
     */
    public String getOperationType() {
        return this.OperationType;
    }

    /**
     * Set ADD 绑定安全组；
DEL 解绑安全组
     * @param OperationType ADD 绑定安全组；
DEL 解绑安全组
     */
    public void setOperationType(String OperationType) {
        this.OperationType = OperationType;
    }

    /**
     * Get 负载均衡实例ID数组 
     * @return LoadBalancerIds 负载均衡实例ID数组
     */
    public String [] getLoadBalancerIds() {
        return this.LoadBalancerIds;
    }

    /**
     * Set 负载均衡实例ID数组
     * @param LoadBalancerIds 负载均衡实例ID数组
     */
    public void setLoadBalancerIds(String [] LoadBalancerIds) {
        this.LoadBalancerIds = LoadBalancerIds;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SecurityGroup", this.SecurityGroup);
        this.setParamSimple(map, prefix + "OperationType", this.OperationType);
        this.setParamArraySimple(map, prefix + "LoadBalancerIds.", this.LoadBalancerIds);

    }
}

