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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceNetworkInfo extends AbstractModel{

    /**
    * 实例内外网ip相关信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AddressInfoSet")
    @Expose
    private AddressInfo [] AddressInfoSet;

    /**
    * 网卡ID。
    */
    @SerializedName("NetworkInterfaceId")
    @Expose
    private String NetworkInterfaceId;

    /**
    * 网卡名称。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NetworkInterfaceName")
    @Expose
    private String NetworkInterfaceName;

    /**
    * 主网卡属性。true为主网卡，false为辅助网卡。
    */
    @SerializedName("Primary")
    @Expose
    private Boolean Primary;

    /**
     * Get 实例内外网ip相关信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AddressInfoSet 实例内外网ip相关信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AddressInfo [] getAddressInfoSet() {
        return this.AddressInfoSet;
    }

    /**
     * Set 实例内外网ip相关信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AddressInfoSet 实例内外网ip相关信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAddressInfoSet(AddressInfo [] AddressInfoSet) {
        this.AddressInfoSet = AddressInfoSet;
    }

    /**
     * Get 网卡ID。 
     * @return NetworkInterfaceId 网卡ID。
     */
    public String getNetworkInterfaceId() {
        return this.NetworkInterfaceId;
    }

    /**
     * Set 网卡ID。
     * @param NetworkInterfaceId 网卡ID。
     */
    public void setNetworkInterfaceId(String NetworkInterfaceId) {
        this.NetworkInterfaceId = NetworkInterfaceId;
    }

    /**
     * Get 网卡名称。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NetworkInterfaceName 网卡名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNetworkInterfaceName() {
        return this.NetworkInterfaceName;
    }

    /**
     * Set 网卡名称。
注意：此字段可能返回 null，表示取不到有效值。
     * @param NetworkInterfaceName 网卡名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNetworkInterfaceName(String NetworkInterfaceName) {
        this.NetworkInterfaceName = NetworkInterfaceName;
    }

    /**
     * Get 主网卡属性。true为主网卡，false为辅助网卡。 
     * @return Primary 主网卡属性。true为主网卡，false为辅助网卡。
     */
    public Boolean getPrimary() {
        return this.Primary;
    }

    /**
     * Set 主网卡属性。true为主网卡，false为辅助网卡。
     * @param Primary 主网卡属性。true为主网卡，false为辅助网卡。
     */
    public void setPrimary(Boolean Primary) {
        this.Primary = Primary;
    }

    public InstanceNetworkInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceNetworkInfo(InstanceNetworkInfo source) {
        if (source.AddressInfoSet != null) {
            this.AddressInfoSet = new AddressInfo[source.AddressInfoSet.length];
            for (int i = 0; i < source.AddressInfoSet.length; i++) {
                this.AddressInfoSet[i] = new AddressInfo(source.AddressInfoSet[i]);
            }
        }
        if (source.NetworkInterfaceId != null) {
            this.NetworkInterfaceId = new String(source.NetworkInterfaceId);
        }
        if (source.NetworkInterfaceName != null) {
            this.NetworkInterfaceName = new String(source.NetworkInterfaceName);
        }
        if (source.Primary != null) {
            this.Primary = new Boolean(source.Primary);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "AddressInfoSet.", this.AddressInfoSet);
        this.setParamSimple(map, prefix + "NetworkInterfaceId", this.NetworkInterfaceId);
        this.setParamSimple(map, prefix + "NetworkInterfaceName", this.NetworkInterfaceName);
        this.setParamSimple(map, prefix + "Primary", this.Primary);

    }
}

