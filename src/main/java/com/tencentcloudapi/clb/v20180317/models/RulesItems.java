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

public class RulesItems extends AbstractModel{

    /**
    * 规则id
    */
    @SerializedName("LocationId")
    @Expose
    private String LocationId;

    /**
    * 域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * uri
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 绑定的后端对象
    */
    @SerializedName("Targets")
    @Expose
    private LbRsTargets [] Targets;

    /**
     * Get 规则id 
     * @return LocationId 规则id
     */
    public String getLocationId() {
        return this.LocationId;
    }

    /**
     * Set 规则id
     * @param LocationId 规则id
     */
    public void setLocationId(String LocationId) {
        this.LocationId = LocationId;
    }

    /**
     * Get 域名 
     * @return Domain 域名
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 域名
     * @param Domain 域名
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get uri 
     * @return Url uri
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set uri
     * @param Url uri
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 绑定的后端对象 
     * @return Targets 绑定的后端对象
     */
    public LbRsTargets [] getTargets() {
        return this.Targets;
    }

    /**
     * Set 绑定的后端对象
     * @param Targets 绑定的后端对象
     */
    public void setTargets(LbRsTargets [] Targets) {
        this.Targets = Targets;
    }

    public RulesItems() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RulesItems(RulesItems source) {
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
            this.Targets = new LbRsTargets[source.Targets.length];
            for (int i = 0; i < source.Targets.length; i++) {
                this.Targets[i] = new LbRsTargets(source.Targets[i]);
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

    }
}

