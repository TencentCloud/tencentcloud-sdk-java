/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.apm.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ServiceRelation extends AbstractModel {

    /**
    * 应用名
    */
    @SerializedName("ServiceName")
    @Expose
    private String ServiceName;

    /**
    * 上游应用集合
    */
    @SerializedName("UpstreamServices")
    @Expose
    private String [] UpstreamServices;

    /**
    * 下游应用集合
    */
    @SerializedName("DownstreamServices")
    @Expose
    private String [] DownstreamServices;

    /**
     * Get 应用名 
     * @return ServiceName 应用名
     */
    public String getServiceName() {
        return this.ServiceName;
    }

    /**
     * Set 应用名
     * @param ServiceName 应用名
     */
    public void setServiceName(String ServiceName) {
        this.ServiceName = ServiceName;
    }

    /**
     * Get 上游应用集合 
     * @return UpstreamServices 上游应用集合
     */
    public String [] getUpstreamServices() {
        return this.UpstreamServices;
    }

    /**
     * Set 上游应用集合
     * @param UpstreamServices 上游应用集合
     */
    public void setUpstreamServices(String [] UpstreamServices) {
        this.UpstreamServices = UpstreamServices;
    }

    /**
     * Get 下游应用集合 
     * @return DownstreamServices 下游应用集合
     */
    public String [] getDownstreamServices() {
        return this.DownstreamServices;
    }

    /**
     * Set 下游应用集合
     * @param DownstreamServices 下游应用集合
     */
    public void setDownstreamServices(String [] DownstreamServices) {
        this.DownstreamServices = DownstreamServices;
    }

    public ServiceRelation() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ServiceRelation(ServiceRelation source) {
        if (source.ServiceName != null) {
            this.ServiceName = new String(source.ServiceName);
        }
        if (source.UpstreamServices != null) {
            this.UpstreamServices = new String[source.UpstreamServices.length];
            for (int i = 0; i < source.UpstreamServices.length; i++) {
                this.UpstreamServices[i] = new String(source.UpstreamServices[i]);
            }
        }
        if (source.DownstreamServices != null) {
            this.DownstreamServices = new String[source.DownstreamServices.length];
            for (int i = 0; i < source.DownstreamServices.length; i++) {
                this.DownstreamServices[i] = new String(source.DownstreamServices[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceName", this.ServiceName);
        this.setParamArraySimple(map, prefix + "UpstreamServices.", this.UpstreamServices);
        this.setParamArraySimple(map, prefix + "DownstreamServices.", this.DownstreamServices);

    }
}

