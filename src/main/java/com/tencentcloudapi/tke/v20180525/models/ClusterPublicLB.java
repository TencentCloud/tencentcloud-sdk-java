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

public class ClusterPublicLB extends AbstractModel{

    /**
    * 是否开启公网访问LB
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
    * 允许访问的来源CIDR列表
    */
    @SerializedName("AllowFromCidrs")
    @Expose
    private String [] AllowFromCidrs;

    /**
    * 安全策略放通单个IP或CIDR(例如: "192.168.1.0/24",默认为拒绝所有)
    */
    @SerializedName("SecurityPolicies")
    @Expose
    private String [] SecurityPolicies;

    /**
     * Get 是否开启公网访问LB 
     * @return Enabled 是否开启公网访问LB
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set 是否开启公网访问LB
     * @param Enabled 是否开启公网访问LB
     */
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get 允许访问的来源CIDR列表 
     * @return AllowFromCidrs 允许访问的来源CIDR列表
     */
    public String [] getAllowFromCidrs() {
        return this.AllowFromCidrs;
    }

    /**
     * Set 允许访问的来源CIDR列表
     * @param AllowFromCidrs 允许访问的来源CIDR列表
     */
    public void setAllowFromCidrs(String [] AllowFromCidrs) {
        this.AllowFromCidrs = AllowFromCidrs;
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
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamArraySimple(map, prefix + "AllowFromCidrs.", this.AllowFromCidrs);
        this.setParamArraySimple(map, prefix + "SecurityPolicies.", this.SecurityPolicies);

    }
}

