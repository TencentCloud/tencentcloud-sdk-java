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
    * 外网访问相关的扩展参数，格式为json
    */
    @SerializedName("ExtraParam")
    @Expose
    private String ExtraParam;

    /**
    * 新内外网功能，需要传递安全组
    */
    @SerializedName("SecurityGroup")
    @Expose
    private String SecurityGroup;

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
     * Get 外网访问相关的扩展参数，格式为json 
     * @return ExtraParam 外网访问相关的扩展参数，格式为json
     */
    public String getExtraParam() {
        return this.ExtraParam;
    }

    /**
     * Set 外网访问相关的扩展参数，格式为json
     * @param ExtraParam 外网访问相关的扩展参数，格式为json
     */
    public void setExtraParam(String ExtraParam) {
        this.ExtraParam = ExtraParam;
    }

    /**
     * Get 新内外网功能，需要传递安全组 
     * @return SecurityGroup 新内外网功能，需要传递安全组
     */
    public String getSecurityGroup() {
        return this.SecurityGroup;
    }

    /**
     * Set 新内外网功能，需要传递安全组
     * @param SecurityGroup 新内外网功能，需要传递安全组
     */
    public void setSecurityGroup(String SecurityGroup) {
        this.SecurityGroup = SecurityGroup;
    }

    public ClusterPublicLB() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClusterPublicLB(ClusterPublicLB source) {
        if (source.Enabled != null) {
            this.Enabled = new Boolean(source.Enabled);
        }
        if (source.AllowFromCidrs != null) {
            this.AllowFromCidrs = new String[source.AllowFromCidrs.length];
            for (int i = 0; i < source.AllowFromCidrs.length; i++) {
                this.AllowFromCidrs[i] = new String(source.AllowFromCidrs[i]);
            }
        }
        if (source.SecurityPolicies != null) {
            this.SecurityPolicies = new String[source.SecurityPolicies.length];
            for (int i = 0; i < source.SecurityPolicies.length; i++) {
                this.SecurityPolicies[i] = new String(source.SecurityPolicies[i]);
            }
        }
        if (source.ExtraParam != null) {
            this.ExtraParam = new String(source.ExtraParam);
        }
        if (source.SecurityGroup != null) {
            this.SecurityGroup = new String(source.SecurityGroup);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamArraySimple(map, prefix + "AllowFromCidrs.", this.AllowFromCidrs);
        this.setParamArraySimple(map, prefix + "SecurityPolicies.", this.SecurityPolicies);
        this.setParamSimple(map, prefix + "ExtraParam", this.ExtraParam);
        this.setParamSimple(map, prefix + "SecurityGroup", this.SecurityGroup);

    }
}

