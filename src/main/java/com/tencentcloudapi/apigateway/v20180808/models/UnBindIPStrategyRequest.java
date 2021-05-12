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

public class UnBindIPStrategyRequest extends AbstractModel{

    /**
    * 待解绑的服务唯一ID。
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
    * 待解绑的IP策略唯一ID。
    */
    @SerializedName("StrategyId")
    @Expose
    private String StrategyId;

    /**
    * 待解绑的环境。
    */
    @SerializedName("EnvironmentName")
    @Expose
    private String EnvironmentName;

    /**
    * 待解绑的 API 列表。
    */
    @SerializedName("UnBindApiIds")
    @Expose
    private String [] UnBindApiIds;

    /**
     * Get 待解绑的服务唯一ID。 
     * @return ServiceId 待解绑的服务唯一ID。
     */
    public String getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set 待解绑的服务唯一ID。
     * @param ServiceId 待解绑的服务唯一ID。
     */
    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    /**
     * Get 待解绑的IP策略唯一ID。 
     * @return StrategyId 待解绑的IP策略唯一ID。
     */
    public String getStrategyId() {
        return this.StrategyId;
    }

    /**
     * Set 待解绑的IP策略唯一ID。
     * @param StrategyId 待解绑的IP策略唯一ID。
     */
    public void setStrategyId(String StrategyId) {
        this.StrategyId = StrategyId;
    }

    /**
     * Get 待解绑的环境。 
     * @return EnvironmentName 待解绑的环境。
     */
    public String getEnvironmentName() {
        return this.EnvironmentName;
    }

    /**
     * Set 待解绑的环境。
     * @param EnvironmentName 待解绑的环境。
     */
    public void setEnvironmentName(String EnvironmentName) {
        this.EnvironmentName = EnvironmentName;
    }

    /**
     * Get 待解绑的 API 列表。 
     * @return UnBindApiIds 待解绑的 API 列表。
     */
    public String [] getUnBindApiIds() {
        return this.UnBindApiIds;
    }

    /**
     * Set 待解绑的 API 列表。
     * @param UnBindApiIds 待解绑的 API 列表。
     */
    public void setUnBindApiIds(String [] UnBindApiIds) {
        this.UnBindApiIds = UnBindApiIds;
    }

    public UnBindIPStrategyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UnBindIPStrategyRequest(UnBindIPStrategyRequest source) {
        if (source.ServiceId != null) {
            this.ServiceId = new String(source.ServiceId);
        }
        if (source.StrategyId != null) {
            this.StrategyId = new String(source.StrategyId);
        }
        if (source.EnvironmentName != null) {
            this.EnvironmentName = new String(source.EnvironmentName);
        }
        if (source.UnBindApiIds != null) {
            this.UnBindApiIds = new String[source.UnBindApiIds.length];
            for (int i = 0; i < source.UnBindApiIds.length; i++) {
                this.UnBindApiIds[i] = new String(source.UnBindApiIds[i]);
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
        this.setParamArraySimple(map, prefix + "UnBindApiIds.", this.UnBindApiIds);

    }
}

