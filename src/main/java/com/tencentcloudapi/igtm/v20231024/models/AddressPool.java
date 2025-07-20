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

public class AddressPool extends AbstractModel {

    /**
    * 地址池 id
    */
    @SerializedName("PoolId")
    @Expose
    private Long PoolId;

    /**
    * 地址池名
    */
    @SerializedName("PoolName")
    @Expose
    private String PoolName;

    /**
    * 地址池地址类型：IPV4、IPV6、DOMAIN
    */
    @SerializedName("AddrType")
    @Expose
    private String AddrType;

    /**
    * 流量策略: WEIGHT负载均衡，ALL解析全部
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
    * OK正常，DOWN故障，WARN风险，UNKNOWN未知
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 地址数
    */
    @SerializedName("AddressNum")
    @Expose
    private Long AddressNum;

    /**
    * 探点数
    */
    @SerializedName("MonitorGroupNum")
    @Expose
    private Long MonitorGroupNum;

    /**
    * 探测任务数
    */
    @SerializedName("MonitorTaskNum")
    @Expose
    private Long MonitorTaskNum;

    /**
    * 实例相关信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceInfo")
    @Expose
    private InstanceInfo [] InstanceInfo;

    /**
    * 地址池地址信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AddressSet")
    @Expose
    private Address [] AddressSet;

    /**
    * 创建时间
    */
    @SerializedName("CreatedOn")
    @Expose
    private String CreatedOn;

    /**
    * 更新时间
    */
    @SerializedName("UpdatedOn")
    @Expose
    private String UpdatedOn;

    /**
     * Get 地址池 id 
     * @return PoolId 地址池 id
     */
    public Long getPoolId() {
        return this.PoolId;
    }

    /**
     * Set 地址池 id
     * @param PoolId 地址池 id
     */
    public void setPoolId(Long PoolId) {
        this.PoolId = PoolId;
    }

    /**
     * Get 地址池名 
     * @return PoolName 地址池名
     */
    public String getPoolName() {
        return this.PoolName;
    }

    /**
     * Set 地址池名
     * @param PoolName 地址池名
     */
    public void setPoolName(String PoolName) {
        this.PoolName = PoolName;
    }

    /**
     * Get 地址池地址类型：IPV4、IPV6、DOMAIN 
     * @return AddrType 地址池地址类型：IPV4、IPV6、DOMAIN
     */
    public String getAddrType() {
        return this.AddrType;
    }

    /**
     * Set 地址池地址类型：IPV4、IPV6、DOMAIN
     * @param AddrType 地址池地址类型：IPV4、IPV6、DOMAIN
     */
    public void setAddrType(String AddrType) {
        this.AddrType = AddrType;
    }

    /**
     * Get 流量策略: WEIGHT负载均衡，ALL解析全部 
     * @return TrafficStrategy 流量策略: WEIGHT负载均衡，ALL解析全部
     */
    public String getTrafficStrategy() {
        return this.TrafficStrategy;
    }

    /**
     * Set 流量策略: WEIGHT负载均衡，ALL解析全部
     * @param TrafficStrategy 流量策略: WEIGHT负载均衡，ALL解析全部
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
     * Get OK正常，DOWN故障，WARN风险，UNKNOWN未知 
     * @return Status OK正常，DOWN故障，WARN风险，UNKNOWN未知
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set OK正常，DOWN故障，WARN风险，UNKNOWN未知
     * @param Status OK正常，DOWN故障，WARN风险，UNKNOWN未知
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 地址数 
     * @return AddressNum 地址数
     */
    public Long getAddressNum() {
        return this.AddressNum;
    }

    /**
     * Set 地址数
     * @param AddressNum 地址数
     */
    public void setAddressNum(Long AddressNum) {
        this.AddressNum = AddressNum;
    }

    /**
     * Get 探点数 
     * @return MonitorGroupNum 探点数
     */
    public Long getMonitorGroupNum() {
        return this.MonitorGroupNum;
    }

    /**
     * Set 探点数
     * @param MonitorGroupNum 探点数
     */
    public void setMonitorGroupNum(Long MonitorGroupNum) {
        this.MonitorGroupNum = MonitorGroupNum;
    }

    /**
     * Get 探测任务数 
     * @return MonitorTaskNum 探测任务数
     */
    public Long getMonitorTaskNum() {
        return this.MonitorTaskNum;
    }

    /**
     * Set 探测任务数
     * @param MonitorTaskNum 探测任务数
     */
    public void setMonitorTaskNum(Long MonitorTaskNum) {
        this.MonitorTaskNum = MonitorTaskNum;
    }

    /**
     * Get 实例相关信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceInfo 实例相关信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public InstanceInfo [] getInstanceInfo() {
        return this.InstanceInfo;
    }

    /**
     * Set 实例相关信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceInfo 实例相关信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceInfo(InstanceInfo [] InstanceInfo) {
        this.InstanceInfo = InstanceInfo;
    }

    /**
     * Get 地址池地址信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AddressSet 地址池地址信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Address [] getAddressSet() {
        return this.AddressSet;
    }

    /**
     * Set 地址池地址信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param AddressSet 地址池地址信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAddressSet(Address [] AddressSet) {
        this.AddressSet = AddressSet;
    }

    /**
     * Get 创建时间 
     * @return CreatedOn 创建时间
     */
    public String getCreatedOn() {
        return this.CreatedOn;
    }

    /**
     * Set 创建时间
     * @param CreatedOn 创建时间
     */
    public void setCreatedOn(String CreatedOn) {
        this.CreatedOn = CreatedOn;
    }

    /**
     * Get 更新时间 
     * @return UpdatedOn 更新时间
     */
    public String getUpdatedOn() {
        return this.UpdatedOn;
    }

    /**
     * Set 更新时间
     * @param UpdatedOn 更新时间
     */
    public void setUpdatedOn(String UpdatedOn) {
        this.UpdatedOn = UpdatedOn;
    }

    public AddressPool() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddressPool(AddressPool source) {
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
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.AddressNum != null) {
            this.AddressNum = new Long(source.AddressNum);
        }
        if (source.MonitorGroupNum != null) {
            this.MonitorGroupNum = new Long(source.MonitorGroupNum);
        }
        if (source.MonitorTaskNum != null) {
            this.MonitorTaskNum = new Long(source.MonitorTaskNum);
        }
        if (source.InstanceInfo != null) {
            this.InstanceInfo = new InstanceInfo[source.InstanceInfo.length];
            for (int i = 0; i < source.InstanceInfo.length; i++) {
                this.InstanceInfo[i] = new InstanceInfo(source.InstanceInfo[i]);
            }
        }
        if (source.AddressSet != null) {
            this.AddressSet = new Address[source.AddressSet.length];
            for (int i = 0; i < source.AddressSet.length; i++) {
                this.AddressSet[i] = new Address(source.AddressSet[i]);
            }
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
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "AddressNum", this.AddressNum);
        this.setParamSimple(map, prefix + "MonitorGroupNum", this.MonitorGroupNum);
        this.setParamSimple(map, prefix + "MonitorTaskNum", this.MonitorTaskNum);
        this.setParamArrayObj(map, prefix + "InstanceInfo.", this.InstanceInfo);
        this.setParamArrayObj(map, prefix + "AddressSet.", this.AddressSet);
        this.setParamSimple(map, prefix + "CreatedOn", this.CreatedOn);
        this.setParamSimple(map, prefix + "UpdatedOn", this.UpdatedOn);

    }
}

