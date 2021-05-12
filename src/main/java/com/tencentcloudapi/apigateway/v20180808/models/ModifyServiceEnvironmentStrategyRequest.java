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
package com.tencentcloudapi.apigateway.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyServiceEnvironmentStrategyRequest extends AbstractModel{

    /**
    * 服务的唯一ID。
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
    * 限流值。
    */
    @SerializedName("Strategy")
    @Expose
    private Long Strategy;

    /**
    * 环境列表。
    */
    @SerializedName("EnvironmentNames")
    @Expose
    private String [] EnvironmentNames;

    /**
     * Get 服务的唯一ID。 
     * @return ServiceId 服务的唯一ID。
     */
    public String getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set 服务的唯一ID。
     * @param ServiceId 服务的唯一ID。
     */
    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    /**
     * Get 限流值。 
     * @return Strategy 限流值。
     */
    public Long getStrategy() {
        return this.Strategy;
    }

    /**
     * Set 限流值。
     * @param Strategy 限流值。
     */
    public void setStrategy(Long Strategy) {
        this.Strategy = Strategy;
    }

    /**
     * Get 环境列表。 
     * @return EnvironmentNames 环境列表。
     */
    public String [] getEnvironmentNames() {
        return this.EnvironmentNames;
    }

    /**
     * Set 环境列表。
     * @param EnvironmentNames 环境列表。
     */
    public void setEnvironmentNames(String [] EnvironmentNames) {
        this.EnvironmentNames = EnvironmentNames;
    }

    public ModifyServiceEnvironmentStrategyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyServiceEnvironmentStrategyRequest(ModifyServiceEnvironmentStrategyRequest source) {
        if (source.ServiceId != null) {
            this.ServiceId = new String(source.ServiceId);
        }
        if (source.Strategy != null) {
            this.Strategy = new Long(source.Strategy);
        }
        if (source.EnvironmentNames != null) {
            this.EnvironmentNames = new String[source.EnvironmentNames.length];
            for (int i = 0; i < source.EnvironmentNames.length; i++) {
                this.EnvironmentNames[i] = new String(source.EnvironmentNames[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamSimple(map, prefix + "Strategy", this.Strategy);
        this.setParamArraySimple(map, prefix + "EnvironmentNames.", this.EnvironmentNames);

    }
}

