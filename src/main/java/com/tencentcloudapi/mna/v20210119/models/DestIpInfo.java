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
package com.tencentcloudapi.mna.v20210119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DestIpInfo extends AbstractModel {

    /**
    * 时间：s
    */
    @SerializedName("Time")
    @Expose
    private String Time;

    /**
    * 网关IP
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GatewayIp")
    @Expose
    private String GatewayIp;

    /**
    * 网关地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GatewaySite")
    @Expose
    private String GatewaySite;

    /**
    * 目标IP数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IpCount")
    @Expose
    private Long IpCount;

    /**
    * 目标IP列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IpList")
    @Expose
    private String [] IpList;

    /**
     * Get 时间：s 
     * @return Time 时间：s
     */
    public String getTime() {
        return this.Time;
    }

    /**
     * Set 时间：s
     * @param Time 时间：s
     */
    public void setTime(String Time) {
        this.Time = Time;
    }

    /**
     * Get 网关IP
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GatewayIp 网关IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGatewayIp() {
        return this.GatewayIp;
    }

    /**
     * Set 网关IP
注意：此字段可能返回 null，表示取不到有效值。
     * @param GatewayIp 网关IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGatewayIp(String GatewayIp) {
        this.GatewayIp = GatewayIp;
    }

    /**
     * Get 网关地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GatewaySite 网关地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGatewaySite() {
        return this.GatewaySite;
    }

    /**
     * Set 网关地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param GatewaySite 网关地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGatewaySite(String GatewaySite) {
        this.GatewaySite = GatewaySite;
    }

    /**
     * Get 目标IP数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IpCount 目标IP数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIpCount() {
        return this.IpCount;
    }

    /**
     * Set 目标IP数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param IpCount 目标IP数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIpCount(Long IpCount) {
        this.IpCount = IpCount;
    }

    /**
     * Get 目标IP列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IpList 目标IP列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getIpList() {
        return this.IpList;
    }

    /**
     * Set 目标IP列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param IpList 目标IP列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIpList(String [] IpList) {
        this.IpList = IpList;
    }

    public DestIpInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DestIpInfo(DestIpInfo source) {
        if (source.Time != null) {
            this.Time = new String(source.Time);
        }
        if (source.GatewayIp != null) {
            this.GatewayIp = new String(source.GatewayIp);
        }
        if (source.GatewaySite != null) {
            this.GatewaySite = new String(source.GatewaySite);
        }
        if (source.IpCount != null) {
            this.IpCount = new Long(source.IpCount);
        }
        if (source.IpList != null) {
            this.IpList = new String[source.IpList.length];
            for (int i = 0; i < source.IpList.length; i++) {
                this.IpList[i] = new String(source.IpList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamSimple(map, prefix + "GatewayIp", this.GatewayIp);
        this.setParamSimple(map, prefix + "GatewaySite", this.GatewaySite);
        this.setParamSimple(map, prefix + "IpCount", this.IpCount);
        this.setParamArraySimple(map, prefix + "IpList.", this.IpList);

    }
}

