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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RuleTargets extends AbstractModel {

    /**
    * 转发规则的 ID
    */
    @SerializedName("LocationId")
    @Expose
    private String LocationId;

    /**
    * 转发规则的域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 转发规则的路径。
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 后端服务的信息
    */
    @SerializedName("Targets")
    @Expose
    private Backend [] Targets;

    /**
    * 后端云函数的信息
    */
    @SerializedName("FunctionTargets")
    @Expose
    private FunctionTarget [] FunctionTargets;

    /**
     * Get 转发规则的 ID 
     * @return LocationId 转发规则的 ID
     */
    public String getLocationId() {
        return this.LocationId;
    }

    /**
     * Set 转发规则的 ID
     * @param LocationId 转发规则的 ID
     */
    public void setLocationId(String LocationId) {
        this.LocationId = LocationId;
    }

    /**
     * Get 转发规则的域名 
     * @return Domain 转发规则的域名
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 转发规则的域名
     * @param Domain 转发规则的域名
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 转发规则的路径。 
     * @return Url 转发规则的路径。
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 转发规则的路径。
     * @param Url 转发规则的路径。
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 后端服务的信息 
     * @return Targets 后端服务的信息
     */
    public Backend [] getTargets() {
        return this.Targets;
    }

    /**
     * Set 后端服务的信息
     * @param Targets 后端服务的信息
     */
    public void setTargets(Backend [] Targets) {
        this.Targets = Targets;
    }

    /**
     * Get 后端云函数的信息 
     * @return FunctionTargets 后端云函数的信息
     */
    public FunctionTarget [] getFunctionTargets() {
        return this.FunctionTargets;
    }

    /**
     * Set 后端云函数的信息
     * @param FunctionTargets 后端云函数的信息
     */
    public void setFunctionTargets(FunctionTarget [] FunctionTargets) {
        this.FunctionTargets = FunctionTargets;
    }

    public RuleTargets() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RuleTargets(RuleTargets source) {
        if (source.LocationId != null) {
            this.LocationId = new String(source.LocationId);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.Targets != null) {
            this.Targets = new Backend[source.Targets.length];
            for (int i = 0; i < source.Targets.length; i++) {
                this.Targets[i] = new Backend(source.Targets[i]);
            }
        }
        if (source.FunctionTargets != null) {
            this.FunctionTargets = new FunctionTarget[source.FunctionTargets.length];
            for (int i = 0; i < source.FunctionTargets.length; i++) {
                this.FunctionTargets[i] = new FunctionTarget(source.FunctionTargets[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LocationId", this.LocationId);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamArrayObj(map, prefix + "Targets.", this.Targets);
        this.setParamArrayObj(map, prefix + "FunctionTargets.", this.FunctionTargets);

    }
}

