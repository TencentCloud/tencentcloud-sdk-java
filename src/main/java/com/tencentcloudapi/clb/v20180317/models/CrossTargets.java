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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CrossTargets extends AbstractModel{

    /**
    * 本地私有网络ID，即负载均衡的VpcId。
    */
    @SerializedName("LocalVpcId")
    @Expose
    private String LocalVpcId;

    /**
    * 子机或网卡所属的私有网络ID。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 子机或网卡的IP地址
    */
    @SerializedName("IP")
    @Expose
    private String IP;

    /**
    * 子机或网卡所属的私有网络名称。
    */
    @SerializedName("VpcName")
    @Expose
    private String VpcName;

    /**
    * 子机的网卡ID。
    */
    @SerializedName("EniId")
    @Expose
    private String EniId;

    /**
    * 子机实例ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 子机实例名称。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 子机或者网卡所属的地域。
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
     * Get 本地私有网络ID，即负载均衡的VpcId。 
     * @return LocalVpcId 本地私有网络ID，即负载均衡的VpcId。
     */
    public String getLocalVpcId() {
        return this.LocalVpcId;
    }

    /**
     * Set 本地私有网络ID，即负载均衡的VpcId。
     * @param LocalVpcId 本地私有网络ID，即负载均衡的VpcId。
     */
    public void setLocalVpcId(String LocalVpcId) {
        this.LocalVpcId = LocalVpcId;
    }

    /**
     * Get 子机或网卡所属的私有网络ID。 
     * @return VpcId 子机或网卡所属的私有网络ID。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 子机或网卡所属的私有网络ID。
     * @param VpcId 子机或网卡所属的私有网络ID。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 子机或网卡的IP地址 
     * @return IP 子机或网卡的IP地址
     */
    public String getIP() {
        return this.IP;
    }

    /**
     * Set 子机或网卡的IP地址
     * @param IP 子机或网卡的IP地址
     */
    public void setIP(String IP) {
        this.IP = IP;
    }

    /**
     * Get 子机或网卡所属的私有网络名称。 
     * @return VpcName 子机或网卡所属的私有网络名称。
     */
    public String getVpcName() {
        return this.VpcName;
    }

    /**
     * Set 子机或网卡所属的私有网络名称。
     * @param VpcName 子机或网卡所属的私有网络名称。
     */
    public void setVpcName(String VpcName) {
        this.VpcName = VpcName;
    }

    /**
     * Get 子机的网卡ID。 
     * @return EniId 子机的网卡ID。
     */
    public String getEniId() {
        return this.EniId;
    }

    /**
     * Set 子机的网卡ID。
     * @param EniId 子机的网卡ID。
     */
    public void setEniId(String EniId) {
        this.EniId = EniId;
    }

    /**
     * Get 子机实例ID。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceId 子机实例ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 子机实例ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceId 子机实例ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 子机实例名称。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceName 子机实例名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 子机实例名称。
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceName 子机实例名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 子机或者网卡所属的地域。 
     * @return Region 子机或者网卡所属的地域。
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 子机或者网卡所属的地域。
     * @param Region 子机或者网卡所属的地域。
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    public CrossTargets() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CrossTargets(CrossTargets source) {
        if (source.LocalVpcId != null) {
            this.LocalVpcId = new String(source.LocalVpcId);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.IP != null) {
            this.IP = new String(source.IP);
        }
        if (source.VpcName != null) {
            this.VpcName = new String(source.VpcName);
        }
        if (source.EniId != null) {
            this.EniId = new String(source.EniId);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LocalVpcId", this.LocalVpcId);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "IP", this.IP);
        this.setParamSimple(map, prefix + "VpcName", this.VpcName);
        this.setParamSimple(map, prefix + "EniId", this.EniId);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "Region", this.Region);

    }
}

