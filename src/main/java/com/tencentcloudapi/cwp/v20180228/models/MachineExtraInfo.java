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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MachineExtraInfo extends AbstractModel{

    /**
    * 公网IP
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WanIP")
    @Expose
    private String WanIP;

    /**
    * 内网IP
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PrivateIP")
    @Expose
    private String PrivateIP;

    /**
    * 网络类型，1:vpc网络 2:基础网络 3:非腾讯云网络
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NetworkType")
    @Expose
    private Long NetworkType;

    /**
    * 网络名，vpc网络情况下会返回vpc_id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NetworkName")
    @Expose
    private String NetworkName;

    /**
    * 实例ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceID")
    @Expose
    private String InstanceID;

    /**
    * 主机名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HostName")
    @Expose
    private String HostName;

    /**
     * Get 公网IP
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WanIP 公网IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWanIP() {
        return this.WanIP;
    }

    /**
     * Set 公网IP
注意：此字段可能返回 null，表示取不到有效值。
     * @param WanIP 公网IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWanIP(String WanIP) {
        this.WanIP = WanIP;
    }

    /**
     * Get 内网IP
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PrivateIP 内网IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPrivateIP() {
        return this.PrivateIP;
    }

    /**
     * Set 内网IP
注意：此字段可能返回 null，表示取不到有效值。
     * @param PrivateIP 内网IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPrivateIP(String PrivateIP) {
        this.PrivateIP = PrivateIP;
    }

    /**
     * Get 网络类型，1:vpc网络 2:基础网络 3:非腾讯云网络
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NetworkType 网络类型，1:vpc网络 2:基础网络 3:非腾讯云网络
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getNetworkType() {
        return this.NetworkType;
    }

    /**
     * Set 网络类型，1:vpc网络 2:基础网络 3:非腾讯云网络
注意：此字段可能返回 null，表示取不到有效值。
     * @param NetworkType 网络类型，1:vpc网络 2:基础网络 3:非腾讯云网络
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNetworkType(Long NetworkType) {
        this.NetworkType = NetworkType;
    }

    /**
     * Get 网络名，vpc网络情况下会返回vpc_id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NetworkName 网络名，vpc网络情况下会返回vpc_id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNetworkName() {
        return this.NetworkName;
    }

    /**
     * Set 网络名，vpc网络情况下会返回vpc_id
注意：此字段可能返回 null，表示取不到有效值。
     * @param NetworkName 网络名，vpc网络情况下会返回vpc_id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNetworkName(String NetworkName) {
        this.NetworkName = NetworkName;
    }

    /**
     * Get 实例ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceID 实例ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceID() {
        return this.InstanceID;
    }

    /**
     * Set 实例ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceID 实例ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceID(String InstanceID) {
        this.InstanceID = InstanceID;
    }

    /**
     * Get 主机名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HostName 主机名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHostName() {
        return this.HostName;
    }

    /**
     * Set 主机名
注意：此字段可能返回 null，表示取不到有效值。
     * @param HostName 主机名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHostName(String HostName) {
        this.HostName = HostName;
    }

    public MachineExtraInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MachineExtraInfo(MachineExtraInfo source) {
        if (source.WanIP != null) {
            this.WanIP = new String(source.WanIP);
        }
        if (source.PrivateIP != null) {
            this.PrivateIP = new String(source.PrivateIP);
        }
        if (source.NetworkType != null) {
            this.NetworkType = new Long(source.NetworkType);
        }
        if (source.NetworkName != null) {
            this.NetworkName = new String(source.NetworkName);
        }
        if (source.InstanceID != null) {
            this.InstanceID = new String(source.InstanceID);
        }
        if (source.HostName != null) {
            this.HostName = new String(source.HostName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WanIP", this.WanIP);
        this.setParamSimple(map, prefix + "PrivateIP", this.PrivateIP);
        this.setParamSimple(map, prefix + "NetworkType", this.NetworkType);
        this.setParamSimple(map, prefix + "NetworkName", this.NetworkName);
        this.setParamSimple(map, prefix + "InstanceID", this.InstanceID);
        this.setParamSimple(map, prefix + "HostName", this.HostName);

    }
}

