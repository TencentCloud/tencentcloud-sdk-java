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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MySQLNetDetail extends AbstractModel {

    /**
    * 内网地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PrivateNetAddress")
    @Expose
    private String PrivateNetAddress;

    /**
    * 外网地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PubNetAddress")
    @Expose
    private String PubNetAddress;

    /**
    * 网络信息（VPCID/SubnetID）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Net")
    @Expose
    private String Net;

    /**
    * 是否开通公网
    */
    @SerializedName("PubNetAccessEnabled")
    @Expose
    private Boolean PubNetAccessEnabled;

    /**
    * vpc id 
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * vpc name
    */
    @SerializedName("VpcName")
    @Expose
    private String VpcName;

    /**
    * 子网ID
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 子网名
    */
    @SerializedName("SubnetName")
    @Expose
    private String SubnetName;

    /**
     * Get 内网地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PrivateNetAddress 内网地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPrivateNetAddress() {
        return this.PrivateNetAddress;
    }

    /**
     * Set 内网地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param PrivateNetAddress 内网地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPrivateNetAddress(String PrivateNetAddress) {
        this.PrivateNetAddress = PrivateNetAddress;
    }

    /**
     * Get 外网地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PubNetAddress 外网地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPubNetAddress() {
        return this.PubNetAddress;
    }

    /**
     * Set 外网地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param PubNetAddress 外网地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPubNetAddress(String PubNetAddress) {
        this.PubNetAddress = PubNetAddress;
    }

    /**
     * Get 网络信息（VPCID/SubnetID）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Net 网络信息（VPCID/SubnetID）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNet() {
        return this.Net;
    }

    /**
     * Set 网络信息（VPCID/SubnetID）
注意：此字段可能返回 null，表示取不到有效值。
     * @param Net 网络信息（VPCID/SubnetID）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNet(String Net) {
        this.Net = Net;
    }

    /**
     * Get 是否开通公网 
     * @return PubNetAccessEnabled 是否开通公网
     */
    public Boolean getPubNetAccessEnabled() {
        return this.PubNetAccessEnabled;
    }

    /**
     * Set 是否开通公网
     * @param PubNetAccessEnabled 是否开通公网
     */
    public void setPubNetAccessEnabled(Boolean PubNetAccessEnabled) {
        this.PubNetAccessEnabled = PubNetAccessEnabled;
    }

    /**
     * Get vpc id  
     * @return VpcId vpc id 
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set vpc id 
     * @param VpcId vpc id 
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get vpc name 
     * @return VpcName vpc name
     */
    public String getVpcName() {
        return this.VpcName;
    }

    /**
     * Set vpc name
     * @param VpcName vpc name
     */
    public void setVpcName(String VpcName) {
        this.VpcName = VpcName;
    }

    /**
     * Get 子网ID 
     * @return SubnetId 子网ID
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 子网ID
     * @param SubnetId 子网ID
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 子网名 
     * @return SubnetName 子网名
     */
    public String getSubnetName() {
        return this.SubnetName;
    }

    /**
     * Set 子网名
     * @param SubnetName 子网名
     */
    public void setSubnetName(String SubnetName) {
        this.SubnetName = SubnetName;
    }

    public MySQLNetDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MySQLNetDetail(MySQLNetDetail source) {
        if (source.PrivateNetAddress != null) {
            this.PrivateNetAddress = new String(source.PrivateNetAddress);
        }
        if (source.PubNetAddress != null) {
            this.PubNetAddress = new String(source.PubNetAddress);
        }
        if (source.Net != null) {
            this.Net = new String(source.Net);
        }
        if (source.PubNetAccessEnabled != null) {
            this.PubNetAccessEnabled = new Boolean(source.PubNetAccessEnabled);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.VpcName != null) {
            this.VpcName = new String(source.VpcName);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.SubnetName != null) {
            this.SubnetName = new String(source.SubnetName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PrivateNetAddress", this.PrivateNetAddress);
        this.setParamSimple(map, prefix + "PubNetAddress", this.PubNetAddress);
        this.setParamSimple(map, prefix + "Net", this.Net);
        this.setParamSimple(map, prefix + "PubNetAccessEnabled", this.PubNetAccessEnabled);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "VpcName", this.VpcName);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "SubnetName", this.SubnetName);

    }
}

