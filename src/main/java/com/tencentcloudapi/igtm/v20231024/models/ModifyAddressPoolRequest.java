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

public class ModifyAddressPoolRequest extends AbstractModel {

    /**
    * <p>地址池id</p>
    */
    @SerializedName("PoolId")
    @Expose
    private Long PoolId;

    /**
    * <p>地址池名称，不允许重复</p>
    */
    @SerializedName("PoolName")
    @Expose
    private String PoolName;

    /**
    * <p>流量策略: WEIGHT负载均衡，ALL解析全部</p>
    */
    @SerializedName("TrafficStrategy")
    @Expose
    private String TrafficStrategy;

    /**
    * <p>监控器id，当监控器已关联策略时，此字段必传</p>
    */
    @SerializedName("MonitorId")
    @Expose
    private Long MonitorId;

    /**
    * <p>地址列表，全量更新逻辑，对于存量不需要修改的地址信息也需要带上(其中参数里的AddressId需传入正确的值)，否则会被删除。</p>
    */
    @SerializedName("AddressSet")
    @Expose
    private Address [] AddressSet;

    /**
    * <p>是否保留资源</p><p>枚举值：</p><ul><li>false： 全量操作，会有删除逻辑</li><li>true： 不会删除原有资源</li></ul>
    */
    @SerializedName("KeepResource")
    @Expose
    private Boolean KeepResource;

    /**
     * Get <p>地址池id</p> 
     * @return PoolId <p>地址池id</p>
     */
    public Long getPoolId() {
        return this.PoolId;
    }

    /**
     * Set <p>地址池id</p>
     * @param PoolId <p>地址池id</p>
     */
    public void setPoolId(Long PoolId) {
        this.PoolId = PoolId;
    }

    /**
     * Get <p>地址池名称，不允许重复</p> 
     * @return PoolName <p>地址池名称，不允许重复</p>
     */
    public String getPoolName() {
        return this.PoolName;
    }

    /**
     * Set <p>地址池名称，不允许重复</p>
     * @param PoolName <p>地址池名称，不允许重复</p>
     */
    public void setPoolName(String PoolName) {
        this.PoolName = PoolName;
    }

    /**
     * Get <p>流量策略: WEIGHT负载均衡，ALL解析全部</p> 
     * @return TrafficStrategy <p>流量策略: WEIGHT负载均衡，ALL解析全部</p>
     */
    public String getTrafficStrategy() {
        return this.TrafficStrategy;
    }

    /**
     * Set <p>流量策略: WEIGHT负载均衡，ALL解析全部</p>
     * @param TrafficStrategy <p>流量策略: WEIGHT负载均衡，ALL解析全部</p>
     */
    public void setTrafficStrategy(String TrafficStrategy) {
        this.TrafficStrategy = TrafficStrategy;
    }

    /**
     * Get <p>监控器id，当监控器已关联策略时，此字段必传</p> 
     * @return MonitorId <p>监控器id，当监控器已关联策略时，此字段必传</p>
     */
    public Long getMonitorId() {
        return this.MonitorId;
    }

    /**
     * Set <p>监控器id，当监控器已关联策略时，此字段必传</p>
     * @param MonitorId <p>监控器id，当监控器已关联策略时，此字段必传</p>
     */
    public void setMonitorId(Long MonitorId) {
        this.MonitorId = MonitorId;
    }

    /**
     * Get <p>地址列表，全量更新逻辑，对于存量不需要修改的地址信息也需要带上(其中参数里的AddressId需传入正确的值)，否则会被删除。</p> 
     * @return AddressSet <p>地址列表，全量更新逻辑，对于存量不需要修改的地址信息也需要带上(其中参数里的AddressId需传入正确的值)，否则会被删除。</p>
     */
    public Address [] getAddressSet() {
        return this.AddressSet;
    }

    /**
     * Set <p>地址列表，全量更新逻辑，对于存量不需要修改的地址信息也需要带上(其中参数里的AddressId需传入正确的值)，否则会被删除。</p>
     * @param AddressSet <p>地址列表，全量更新逻辑，对于存量不需要修改的地址信息也需要带上(其中参数里的AddressId需传入正确的值)，否则会被删除。</p>
     */
    public void setAddressSet(Address [] AddressSet) {
        this.AddressSet = AddressSet;
    }

    /**
     * Get <p>是否保留资源</p><p>枚举值：</p><ul><li>false： 全量操作，会有删除逻辑</li><li>true： 不会删除原有资源</li></ul> 
     * @return KeepResource <p>是否保留资源</p><p>枚举值：</p><ul><li>false： 全量操作，会有删除逻辑</li><li>true： 不会删除原有资源</li></ul>
     */
    public Boolean getKeepResource() {
        return this.KeepResource;
    }

    /**
     * Set <p>是否保留资源</p><p>枚举值：</p><ul><li>false： 全量操作，会有删除逻辑</li><li>true： 不会删除原有资源</li></ul>
     * @param KeepResource <p>是否保留资源</p><p>枚举值：</p><ul><li>false： 全量操作，会有删除逻辑</li><li>true： 不会删除原有资源</li></ul>
     */
    public void setKeepResource(Boolean KeepResource) {
        this.KeepResource = KeepResource;
    }

    public ModifyAddressPoolRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAddressPoolRequest(ModifyAddressPoolRequest source) {
        if (source.PoolId != null) {
            this.PoolId = new Long(source.PoolId);
        }
        if (source.PoolName != null) {
            this.PoolName = new String(source.PoolName);
        }
        if (source.TrafficStrategy != null) {
            this.TrafficStrategy = new String(source.TrafficStrategy);
        }
        if (source.MonitorId != null) {
            this.MonitorId = new Long(source.MonitorId);
        }
        if (source.AddressSet != null) {
            this.AddressSet = new Address[source.AddressSet.length];
            for (int i = 0; i < source.AddressSet.length; i++) {
                this.AddressSet[i] = new Address(source.AddressSet[i]);
            }
        }
        if (source.KeepResource != null) {
            this.KeepResource = new Boolean(source.KeepResource);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PoolId", this.PoolId);
        this.setParamSimple(map, prefix + "PoolName", this.PoolName);
        this.setParamSimple(map, prefix + "TrafficStrategy", this.TrafficStrategy);
        this.setParamSimple(map, prefix + "MonitorId", this.MonitorId);
        this.setParamArrayObj(map, prefix + "AddressSet.", this.AddressSet);
        this.setParamSimple(map, prefix + "KeepResource", this.KeepResource);

    }
}

