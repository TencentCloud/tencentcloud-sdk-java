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
package com.tencentcloudapi.igtm.v20231024.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateAddressPoolRequest extends AbstractModel {

    /**
    * 地址池名称，不允许重复
    */
    @SerializedName("PoolName")
    @Expose
    private String PoolName;

    /**
    * 流量策略：WEIGHT负载均衡，ALL解析所有健康地址
    */
    @SerializedName("TrafficStrategy")
    @Expose
    private String TrafficStrategy;

    /**
    * 地址列表
    */
    @SerializedName("AddressSet")
    @Expose
    private Address [] AddressSet;

    /**
    * 监控器id
    */
    @SerializedName("MonitorId")
    @Expose
    private Long MonitorId;

    /**
     * Get 地址池名称，不允许重复 
     * @return PoolName 地址池名称，不允许重复
     */
    public String getPoolName() {
        return this.PoolName;
    }

    /**
     * Set 地址池名称，不允许重复
     * @param PoolName 地址池名称，不允许重复
     */
    public void setPoolName(String PoolName) {
        this.PoolName = PoolName;
    }

    /**
     * Get 流量策略：WEIGHT负载均衡，ALL解析所有健康地址 
     * @return TrafficStrategy 流量策略：WEIGHT负载均衡，ALL解析所有健康地址
     */
    public String getTrafficStrategy() {
        return this.TrafficStrategy;
    }

    /**
     * Set 流量策略：WEIGHT负载均衡，ALL解析所有健康地址
     * @param TrafficStrategy 流量策略：WEIGHT负载均衡，ALL解析所有健康地址
     */
    public void setTrafficStrategy(String TrafficStrategy) {
        this.TrafficStrategy = TrafficStrategy;
    }

    /**
     * Get 地址列表 
     * @return AddressSet 地址列表
     */
    public Address [] getAddressSet() {
        return this.AddressSet;
    }

    /**
     * Set 地址列表
     * @param AddressSet 地址列表
     */
    public void setAddressSet(Address [] AddressSet) {
        this.AddressSet = AddressSet;
    }

    /**
     * Get 监控器id 
     * @return MonitorId 监控器id
     */
    public Long getMonitorId() {
        return this.MonitorId;
    }

    /**
     * Set 监控器id
     * @param MonitorId 监控器id
     */
    public void setMonitorId(Long MonitorId) {
        this.MonitorId = MonitorId;
    }

    public CreateAddressPoolRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAddressPoolRequest(CreateAddressPoolRequest source) {
        if (source.PoolName != null) {
            this.PoolName = new String(source.PoolName);
        }
        if (source.TrafficStrategy != null) {
            this.TrafficStrategy = new String(source.TrafficStrategy);
        }
        if (source.AddressSet != null) {
            this.AddressSet = new Address[source.AddressSet.length];
            for (int i = 0; i < source.AddressSet.length; i++) {
                this.AddressSet[i] = new Address(source.AddressSet[i]);
            }
        }
        if (source.MonitorId != null) {
            this.MonitorId = new Long(source.MonitorId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PoolName", this.PoolName);
        this.setParamSimple(map, prefix + "TrafficStrategy", this.TrafficStrategy);
        this.setParamArrayObj(map, prefix + "AddressSet.", this.AddressSet);
        this.setParamSimple(map, prefix + "MonitorId", this.MonitorId);

    }
}

