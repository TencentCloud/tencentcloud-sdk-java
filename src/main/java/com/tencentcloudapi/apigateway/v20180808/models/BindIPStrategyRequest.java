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

public class BindIPStrategyRequest extends AbstractModel{

    /**
    * 待绑定的IP策略所属的服务唯一ID。
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
    * 待绑定的IP策略唯一ID。
    */
    @SerializedName("StrategyId")
    @Expose
    private String StrategyId;

    /**
    * IP策略待绑定的环境。
    */
    @SerializedName("EnvironmentName")
    @Expose
    private String EnvironmentName;

    /**
    * IP策略待绑定的API列表。
    */
    @SerializedName("BindApiIds")
    @Expose
    private String [] BindApiIds;

    /**
     * Get 待绑定的IP策略所属的服务唯一ID。 
     * @return ServiceId 待绑定的IP策略所属的服务唯一ID。
     */
    public String getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set 待绑定的IP策略所属的服务唯一ID。
     * @param ServiceId 待绑定的IP策略所属的服务唯一ID。
     */
    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    /**
     * Get 待绑定的IP策略唯一ID。 
     * @return StrategyId 待绑定的IP策略唯一ID。
     */
    public String getStrategyId() {
        return this.StrategyId;
    }

    /**
     * Set 待绑定的IP策略唯一ID。
     * @param StrategyId 待绑定的IP策略唯一ID。
     */
    public void setStrategyId(String StrategyId) {
        this.StrategyId = StrategyId;
    }

    /**
     * Get IP策略待绑定的环境。 
     * @return EnvironmentName IP策略待绑定的环境。
     */
    public String getEnvironmentName() {
        return this.EnvironmentName;
    }

    /**
     * Set IP策略待绑定的环境。
     * @param EnvironmentName IP策略待绑定的环境。
     */
    public void setEnvironmentName(String EnvironmentName) {
        this.EnvironmentName = EnvironmentName;
    }

    /**
     * Get IP策略待绑定的API列表。 
     * @return BindApiIds IP策略待绑定的API列表。
     */
    public String [] getBindApiIds() {
        return this.BindApiIds;
    }

    /**
     * Set IP策略待绑定的API列表。
     * @param BindApiIds IP策略待绑定的API列表。
     */
    public void setBindApiIds(String [] BindApiIds) {
        this.BindApiIds = BindApiIds;
    }

    public BindIPStrategyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BindIPStrategyRequest(BindIPStrategyRequest source) {
        if (source.ServiceId != null) {
            this.ServiceId = new String(source.ServiceId);
        }
        if (source.StrategyId != null) {
            this.StrategyId = new String(source.StrategyId);
        }
        if (source.EnvironmentName != null) {
            this.EnvironmentName = new String(source.EnvironmentName);
        }
        if (source.BindApiIds != null) {
            this.BindApiIds = new String[source.BindApiIds.length];
            for (int i = 0; i < source.BindApiIds.length; i++) {
                this.BindApiIds[i] = new String(source.BindApiIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamSimple(map, prefix + "StrategyId", this.StrategyId);
        this.setParamSimple(map, prefix + "EnvironmentName", this.EnvironmentName);
        this.setParamArraySimple(map, prefix + "BindApiIds.", this.BindApiIds);

    }
}

