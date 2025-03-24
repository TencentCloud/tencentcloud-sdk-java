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
package com.tencentcloudapi.hai.v20230812.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NetworkStatus extends AbstractModel {

    /**
    * HAI 的实例 ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 公网 IP 地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AddressIp")
    @Expose
    private String AddressIp;

    /**
    * 出带宽上限，单位Mbps
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Bandwidth")
    @Expose
    private Long Bandwidth;

    /**
    * 流量包总量，单位GB
    */
    @SerializedName("TotalTrafficAmount")
    @Expose
    private Float TotalTrafficAmount;

    /**
    * 流量包剩余量，单位GB
    */
    @SerializedName("RemainingTrafficAmount")
    @Expose
    private Float RemainingTrafficAmount;

    /**
     * Get HAI 的实例 ID 
     * @return InstanceId HAI 的实例 ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set HAI 的实例 ID
     * @param InstanceId HAI 的实例 ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 公网 IP 地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AddressIp 公网 IP 地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAddressIp() {
        return this.AddressIp;
    }

    /**
     * Set 公网 IP 地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param AddressIp 公网 IP 地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAddressIp(String AddressIp) {
        this.AddressIp = AddressIp;
    }

    /**
     * Get 出带宽上限，单位Mbps
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Bandwidth 出带宽上限，单位Mbps
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getBandwidth() {
        return this.Bandwidth;
    }

    /**
     * Set 出带宽上限，单位Mbps
注意：此字段可能返回 null，表示取不到有效值。
     * @param Bandwidth 出带宽上限，单位Mbps
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBandwidth(Long Bandwidth) {
        this.Bandwidth = Bandwidth;
    }

    /**
     * Get 流量包总量，单位GB 
     * @return TotalTrafficAmount 流量包总量，单位GB
     */
    public Float getTotalTrafficAmount() {
        return this.TotalTrafficAmount;
    }

    /**
     * Set 流量包总量，单位GB
     * @param TotalTrafficAmount 流量包总量，单位GB
     */
    public void setTotalTrafficAmount(Float TotalTrafficAmount) {
        this.TotalTrafficAmount = TotalTrafficAmount;
    }

    /**
     * Get 流量包剩余量，单位GB 
     * @return RemainingTrafficAmount 流量包剩余量，单位GB
     */
    public Float getRemainingTrafficAmount() {
        return this.RemainingTrafficAmount;
    }

    /**
     * Set 流量包剩余量，单位GB
     * @param RemainingTrafficAmount 流量包剩余量，单位GB
     */
    public void setRemainingTrafficAmount(Float RemainingTrafficAmount) {
        this.RemainingTrafficAmount = RemainingTrafficAmount;
    }

    public NetworkStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NetworkStatus(NetworkStatus source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.AddressIp != null) {
            this.AddressIp = new String(source.AddressIp);
        }
        if (source.Bandwidth != null) {
            this.Bandwidth = new Long(source.Bandwidth);
        }
        if (source.TotalTrafficAmount != null) {
            this.TotalTrafficAmount = new Float(source.TotalTrafficAmount);
        }
        if (source.RemainingTrafficAmount != null) {
            this.RemainingTrafficAmount = new Float(source.RemainingTrafficAmount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "AddressIp", this.AddressIp);
        this.setParamSimple(map, prefix + "Bandwidth", this.Bandwidth);
        this.setParamSimple(map, prefix + "TotalTrafficAmount", this.TotalTrafficAmount);
        this.setParamSimple(map, prefix + "RemainingTrafficAmount", this.RemainingTrafficAmount);

    }
}

