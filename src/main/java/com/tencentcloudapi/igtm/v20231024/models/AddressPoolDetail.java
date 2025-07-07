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

public class AddressPoolDetail extends AbstractModel {

    /**
    * 地址池 id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PoolId")
    @Expose
    private Long PoolId;

    /**
    * 地址池名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PoolName")
    @Expose
    private String PoolName;

    /**
    * 地址池地址类型：IPV4、IPV6、DOMAIN
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AddrType")
    @Expose
    private String AddrType;

    /**
    * 流量策略: WEIGHT负载均衡，ALL解析全部
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TrafficStrategy")
    @Expose
    private String TrafficStrategy;

    /**
    * 监控器id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MonitorId")
    @Expose
    private Long MonitorId;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreatedOn")
    @Expose
    private String CreatedOn;

    /**
    * 更新时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdatedOn")
    @Expose
    private String UpdatedOn;

    /**
     * Get 地址池 id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PoolId 地址池 id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPoolId() {
        return this.PoolId;
    }

    /**
     * Set 地址池 id
注意：此字段可能返回 null，表示取不到有效值。
     * @param PoolId 地址池 id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPoolId(Long PoolId) {
        this.PoolId = PoolId;
    }

    /**
     * Get 地址池名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PoolName 地址池名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPoolName() {
        return this.PoolName;
    }

    /**
     * Set 地址池名
注意：此字段可能返回 null，表示取不到有效值。
     * @param PoolName 地址池名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPoolName(String PoolName) {
        this.PoolName = PoolName;
    }

    /**
     * Get 地址池地址类型：IPV4、IPV6、DOMAIN
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AddrType 地址池地址类型：IPV4、IPV6、DOMAIN
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAddrType() {
        return this.AddrType;
    }

    /**
     * Set 地址池地址类型：IPV4、IPV6、DOMAIN
注意：此字段可能返回 null，表示取不到有效值。
     * @param AddrType 地址池地址类型：IPV4、IPV6、DOMAIN
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAddrType(String AddrType) {
        this.AddrType = AddrType;
    }

    /**
     * Get 流量策略: WEIGHT负载均衡，ALL解析全部
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TrafficStrategy 流量策略: WEIGHT负载均衡，ALL解析全部
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTrafficStrategy() {
        return this.TrafficStrategy;
    }

    /**
     * Set 流量策略: WEIGHT负载均衡，ALL解析全部
注意：此字段可能返回 null，表示取不到有效值。
     * @param TrafficStrategy 流量策略: WEIGHT负载均衡，ALL解析全部
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTrafficStrategy(String TrafficStrategy) {
        this.TrafficStrategy = TrafficStrategy;
    }

    /**
     * Get 监控器id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MonitorId 监控器id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMonitorId() {
        return this.MonitorId;
    }

    /**
     * Set 监控器id
注意：此字段可能返回 null，表示取不到有效值。
     * @param MonitorId 监控器id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMonitorId(Long MonitorId) {
        this.MonitorId = MonitorId;
    }

    /**
     * Get 创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreatedOn 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreatedOn() {
        return this.CreatedOn;
    }

    /**
     * Set 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreatedOn 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreatedOn(String CreatedOn) {
        this.CreatedOn = CreatedOn;
    }

    /**
     * Get 更新时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdatedOn 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdatedOn() {
        return this.UpdatedOn;
    }

    /**
     * Set 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdatedOn 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdatedOn(String UpdatedOn) {
        this.UpdatedOn = UpdatedOn;
    }

    public AddressPoolDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddressPoolDetail(AddressPoolDetail source) {
        if (source.PoolId != null) {
            this.PoolId = new Long(source.PoolId);
        }
        if (source.PoolName != null) {
            this.PoolName = new String(source.PoolName);
        }
        if (source.AddrType != null) {
            this.AddrType = new String(source.AddrType);
        }
        if (source.TrafficStrategy != null) {
            this.TrafficStrategy = new String(source.TrafficStrategy);
        }
        if (source.MonitorId != null) {
            this.MonitorId = new Long(source.MonitorId);
        }
        if (source.CreatedOn != null) {
            this.CreatedOn = new String(source.CreatedOn);
        }
        if (source.UpdatedOn != null) {
            this.UpdatedOn = new String(source.UpdatedOn);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PoolId", this.PoolId);
        this.setParamSimple(map, prefix + "PoolName", this.PoolName);
        this.setParamSimple(map, prefix + "AddrType", this.AddrType);
        this.setParamSimple(map, prefix + "TrafficStrategy", this.TrafficStrategy);
        this.setParamSimple(map, prefix + "MonitorId", this.MonitorId);
        this.setParamSimple(map, prefix + "CreatedOn", this.CreatedOn);
        this.setParamSimple(map, prefix + "UpdatedOn", this.UpdatedOn);

    }
}

