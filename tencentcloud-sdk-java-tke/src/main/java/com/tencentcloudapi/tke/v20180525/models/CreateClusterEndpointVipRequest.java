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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateClusterEndpointVipRequest extends AbstractModel{

    /**
    * 集群ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 安全策略放通单个IP或CIDR(例如: "192.168.1.0/24",默认为拒绝所有)
    */
    @SerializedName("SecurityPolicies")
    @Expose
    private String [] SecurityPolicies;

    /**
     * Get 集群ID 
     * @return ClusterId 集群ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群ID
     * @param ClusterId 集群ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 安全策略放通单个IP或CIDR(例如: "192.168.1.0/24",默认为拒绝所有) 
     * @return SecurityPolicies 安全策略放通单个IP或CIDR(例如: "192.168.1.0/24",默认为拒绝所有)
     */
    public String [] getSecurityPolicies() {
        return this.SecurityPolicies;
    }

    /**
     * Set 安全策略放通单个IP或CIDR(例如: "192.168.1.0/24",默认为拒绝所有)
     * @param SecurityPolicies 安全策略放通单个IP或CIDR(例如: "192.168.1.0/24",默认为拒绝所有)
     */
    public void setSecurityPolicies(String [] SecurityPolicies) {
        this.SecurityPolicies = SecurityPolicies;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamArraySimple(map, prefix + "SecurityPolicies.", this.SecurityPolicies);

    }
}

