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

public class MainAddressPool extends AbstractModel {

    /**
    * <p>集合中的地址池id与权重，数组</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AddressPools")
    @Expose
    private MainPoolWeight [] AddressPools;

    /**
    * <p>地址池集合id</p>
    */
    @SerializedName("MainAddressPoolId")
    @Expose
    private Long MainAddressPoolId;

    /**
    * <p>切换阈值，不能大于主力集合内地址总数</p>
    */
    @SerializedName("MinSurviveNum")
    @Expose
    private Long MinSurviveNum;

    /**
    * <p>切换策略:ALL解析所有地址；WEIGHT：负载均衡。当为ALL时，解析地址的权重值为1；当为WEIGHT时；权重为地址池权重*地址权重</p>
    */
    @SerializedName("TrafficStrategy")
    @Expose
    private String TrafficStrategy;

    /**
     * Get <p>集合中的地址池id与权重，数组</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AddressPools <p>集合中的地址池id与权重，数组</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MainPoolWeight [] getAddressPools() {
        return this.AddressPools;
    }

    /**
     * Set <p>集合中的地址池id与权重，数组</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AddressPools <p>集合中的地址池id与权重，数组</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAddressPools(MainPoolWeight [] AddressPools) {
        this.AddressPools = AddressPools;
    }

    /**
     * Get <p>地址池集合id</p> 
     * @return MainAddressPoolId <p>地址池集合id</p>
     */
    public Long getMainAddressPoolId() {
        return this.MainAddressPoolId;
    }

    /**
     * Set <p>地址池集合id</p>
     * @param MainAddressPoolId <p>地址池集合id</p>
     */
    public void setMainAddressPoolId(Long MainAddressPoolId) {
        this.MainAddressPoolId = MainAddressPoolId;
    }

    /**
     * Get <p>切换阈值，不能大于主力集合内地址总数</p> 
     * @return MinSurviveNum <p>切换阈值，不能大于主力集合内地址总数</p>
     */
    public Long getMinSurviveNum() {
        return this.MinSurviveNum;
    }

    /**
     * Set <p>切换阈值，不能大于主力集合内地址总数</p>
     * @param MinSurviveNum <p>切换阈值，不能大于主力集合内地址总数</p>
     */
    public void setMinSurviveNum(Long MinSurviveNum) {
        this.MinSurviveNum = MinSurviveNum;
    }

    /**
     * Get <p>切换策略:ALL解析所有地址；WEIGHT：负载均衡。当为ALL时，解析地址的权重值为1；当为WEIGHT时；权重为地址池权重*地址权重</p> 
     * @return TrafficStrategy <p>切换策略:ALL解析所有地址；WEIGHT：负载均衡。当为ALL时，解析地址的权重值为1；当为WEIGHT时；权重为地址池权重*地址权重</p>
     */
    public String getTrafficStrategy() {
        return this.TrafficStrategy;
    }

    /**
     * Set <p>切换策略:ALL解析所有地址；WEIGHT：负载均衡。当为ALL时，解析地址的权重值为1；当为WEIGHT时；权重为地址池权重*地址权重</p>
     * @param TrafficStrategy <p>切换策略:ALL解析所有地址；WEIGHT：负载均衡。当为ALL时，解析地址的权重值为1；当为WEIGHT时；权重为地址池权重*地址权重</p>
     */
    public void setTrafficStrategy(String TrafficStrategy) {
        this.TrafficStrategy = TrafficStrategy;
    }

    public MainAddressPool() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MainAddressPool(MainAddressPool source) {
        if (source.AddressPools != null) {
            this.AddressPools = new MainPoolWeight[source.AddressPools.length];
            for (int i = 0; i < source.AddressPools.length; i++) {
                this.AddressPools[i] = new MainPoolWeight(source.AddressPools[i]);
            }
        }
        if (source.MainAddressPoolId != null) {
            this.MainAddressPoolId = new Long(source.MainAddressPoolId);
        }
        if (source.MinSurviveNum != null) {
            this.MinSurviveNum = new Long(source.MinSurviveNum);
        }
        if (source.TrafficStrategy != null) {
            this.TrafficStrategy = new String(source.TrafficStrategy);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "AddressPools.", this.AddressPools);
        this.setParamSimple(map, prefix + "MainAddressPoolId", this.MainAddressPoolId);
        this.setParamSimple(map, prefix + "MinSurviveNum", this.MinSurviveNum);
        this.setParamSimple(map, prefix + "TrafficStrategy", this.TrafficStrategy);

    }
}

