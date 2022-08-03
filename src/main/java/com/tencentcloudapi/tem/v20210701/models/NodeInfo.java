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
package com.tencentcloudapi.tem.v20210701.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NodeInfo extends AbstractModel{

    /**
    * node名字
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * node可用区
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * node子网ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 可用IP数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AvailableIpCount")
    @Expose
    private String AvailableIpCount;

    /**
    * cidr块
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Cidr")
    @Expose
    private String Cidr;

    /**
     * Get node名字 
     * @return Name node名字
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set node名字
     * @param Name node名字
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get node可用区
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Zone node可用区
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set node可用区
注意：此字段可能返回 null，表示取不到有效值。
     * @param Zone node可用区
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get node子网ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubnetId node子网ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set node子网ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubnetId node子网ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 可用IP数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AvailableIpCount 可用IP数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAvailableIpCount() {
        return this.AvailableIpCount;
    }

    /**
     * Set 可用IP数
注意：此字段可能返回 null，表示取不到有效值。
     * @param AvailableIpCount 可用IP数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAvailableIpCount(String AvailableIpCount) {
        this.AvailableIpCount = AvailableIpCount;
    }

    /**
     * Get cidr块
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Cidr cidr块
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCidr() {
        return this.Cidr;
    }

    /**
     * Set cidr块
注意：此字段可能返回 null，表示取不到有效值。
     * @param Cidr cidr块
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCidr(String Cidr) {
        this.Cidr = Cidr;
    }

    public NodeInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NodeInfo(NodeInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.AvailableIpCount != null) {
            this.AvailableIpCount = new String(source.AvailableIpCount);
        }
        if (source.Cidr != null) {
            this.Cidr = new String(source.Cidr);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "AvailableIpCount", this.AvailableIpCount);
        this.setParamSimple(map, prefix + "Cidr", this.Cidr);

    }
}

