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
package com.tencentcloudapi.alb.v20251030.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ZoneMappingInfo extends AbstractModel {

    /**
    * 子网 ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 可用区ID。最多支持添加10个可用区。若当前地域支持2个及以上的可用区，至少需要添加2个可用区。
您可以通过调用[DescribeZones](~~36064~~)接口获取可用区ID对应的可用区的信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 负载均衡 VIP/EIP 信息
    */
    @SerializedName("LoadBalancerAddress")
    @Expose
    private LoadBalancerAddress LoadBalancerAddress;

    /**
    * 可用区状态。取值：
- **Active**：运行中。
- **Stopped**：已停止。
- **Shifted**：已移除。
- **Starting**：启动中。
- **Stopping**：停止中。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get 子网 ID。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubnetId 子网 ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 子网 ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubnetId 子网 ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 可用区ID。最多支持添加10个可用区。若当前地域支持2个及以上的可用区，至少需要添加2个可用区。
您可以通过调用[DescribeZones](~~36064~~)接口获取可用区ID对应的可用区的信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ZoneId 可用区ID。最多支持添加10个可用区。若当前地域支持2个及以上的可用区，至少需要添加2个可用区。
您可以通过调用[DescribeZones](~~36064~~)接口获取可用区ID对应的可用区的信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 可用区ID。最多支持添加10个可用区。若当前地域支持2个及以上的可用区，至少需要添加2个可用区。
您可以通过调用[DescribeZones](~~36064~~)接口获取可用区ID对应的可用区的信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ZoneId 可用区ID。最多支持添加10个可用区。若当前地域支持2个及以上的可用区，至少需要添加2个可用区。
您可以通过调用[DescribeZones](~~36064~~)接口获取可用区ID对应的可用区的信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 负载均衡 VIP/EIP 信息 
     * @return LoadBalancerAddress 负载均衡 VIP/EIP 信息
     */
    public LoadBalancerAddress getLoadBalancerAddress() {
        return this.LoadBalancerAddress;
    }

    /**
     * Set 负载均衡 VIP/EIP 信息
     * @param LoadBalancerAddress 负载均衡 VIP/EIP 信息
     */
    public void setLoadBalancerAddress(LoadBalancerAddress LoadBalancerAddress) {
        this.LoadBalancerAddress = LoadBalancerAddress;
    }

    /**
     * Get 可用区状态。取值：
- **Active**：运行中。
- **Stopped**：已停止。
- **Shifted**：已移除。
- **Starting**：启动中。
- **Stopping**：停止中。 
     * @return Status 可用区状态。取值：
- **Active**：运行中。
- **Stopped**：已停止。
- **Shifted**：已移除。
- **Starting**：启动中。
- **Stopping**：停止中。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 可用区状态。取值：
- **Active**：运行中。
- **Stopped**：已停止。
- **Shifted**：已移除。
- **Starting**：启动中。
- **Stopping**：停止中。
     * @param Status 可用区状态。取值：
- **Active**：运行中。
- **Stopped**：已停止。
- **Shifted**：已移除。
- **Starting**：启动中。
- **Stopping**：停止中。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public ZoneMappingInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ZoneMappingInfo(ZoneMappingInfo source) {
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.LoadBalancerAddress != null) {
            this.LoadBalancerAddress = new LoadBalancerAddress(source.LoadBalancerAddress);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamObj(map, prefix + "LoadBalancerAddress.", this.LoadBalancerAddress);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

