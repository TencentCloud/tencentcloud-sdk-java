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

public class Internet extends AbstractModel{

    /**
    * 实例的内网相关信息列表。顺序为主网卡在前，辅助网卡按绑定先后顺序排列。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PrivateIPAddressSet")
    @Expose
    private PrivateIPAddressInfo [] PrivateIPAddressSet;

    /**
    * 实例的公网相关信息列表。顺序为主网卡在前，辅助网卡按绑定先后顺序排列。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PublicIPAddressSet")
    @Expose
    private PublicIPAddressInfo [] PublicIPAddressSet;

    /**
    * 实例网络相关信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceNetworkInfoSet")
    @Expose
    private InstanceNetworkInfo [] InstanceNetworkInfoSet;

    /**
     * Get 实例的内网相关信息列表。顺序为主网卡在前，辅助网卡按绑定先后顺序排列。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PrivateIPAddressSet 实例的内网相关信息列表。顺序为主网卡在前，辅助网卡按绑定先后顺序排列。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PrivateIPAddressInfo [] getPrivateIPAddressSet() {
        return this.PrivateIPAddressSet;
    }

    /**
     * Set 实例的内网相关信息列表。顺序为主网卡在前，辅助网卡按绑定先后顺序排列。
注意：此字段可能返回 null，表示取不到有效值。
     * @param PrivateIPAddressSet 实例的内网相关信息列表。顺序为主网卡在前，辅助网卡按绑定先后顺序排列。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPrivateIPAddressSet(PrivateIPAddressInfo [] PrivateIPAddressSet) {
        this.PrivateIPAddressSet = PrivateIPAddressSet;
    }

    /**
     * Get 实例的公网相关信息列表。顺序为主网卡在前，辅助网卡按绑定先后顺序排列。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PublicIPAddressSet 实例的公网相关信息列表。顺序为主网卡在前，辅助网卡按绑定先后顺序排列。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PublicIPAddressInfo [] getPublicIPAddressSet() {
        return this.PublicIPAddressSet;
    }

    /**
     * Set 实例的公网相关信息列表。顺序为主网卡在前，辅助网卡按绑定先后顺序排列。
注意：此字段可能返回 null，表示取不到有效值。
     * @param PublicIPAddressSet 实例的公网相关信息列表。顺序为主网卡在前，辅助网卡按绑定先后顺序排列。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPublicIPAddressSet(PublicIPAddressInfo [] PublicIPAddressSet) {
        this.PublicIPAddressSet = PublicIPAddressSet;
    }

    /**
     * Get 实例网络相关信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceNetworkInfoSet 实例网络相关信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public InstanceNetworkInfo [] getInstanceNetworkInfoSet() {
        return this.InstanceNetworkInfoSet;
    }

    /**
     * Set 实例网络相关信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceNetworkInfoSet 实例网络相关信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceNetworkInfoSet(InstanceNetworkInfo [] InstanceNetworkInfoSet) {
        this.InstanceNetworkInfoSet = InstanceNetworkInfoSet;
    }

    public Internet() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Internet(Internet source) {
        if (source.PrivateIPAddressSet != null) {
            this.PrivateIPAddressSet = new PrivateIPAddressInfo[source.PrivateIPAddressSet.length];
            for (int i = 0; i < source.PrivateIPAddressSet.length; i++) {
                this.PrivateIPAddressSet[i] = new PrivateIPAddressInfo(source.PrivateIPAddressSet[i]);
            }
        }
        if (source.PublicIPAddressSet != null) {
            this.PublicIPAddressSet = new PublicIPAddressInfo[source.PublicIPAddressSet.length];
            for (int i = 0; i < source.PublicIPAddressSet.length; i++) {
                this.PublicIPAddressSet[i] = new PublicIPAddressInfo(source.PublicIPAddressSet[i]);
            }
        }
        if (source.InstanceNetworkInfoSet != null) {
            this.InstanceNetworkInfoSet = new InstanceNetworkInfo[source.InstanceNetworkInfoSet.length];
            for (int i = 0; i < source.InstanceNetworkInfoSet.length; i++) {
                this.InstanceNetworkInfoSet[i] = new InstanceNetworkInfo(source.InstanceNetworkInfoSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "PrivateIPAddressSet.", this.PrivateIPAddressSet);
        this.setParamArrayObj(map, prefix + "PublicIPAddressSet.", this.PublicIPAddressSet);
        this.setParamArrayObj(map, prefix + "InstanceNetworkInfoSet.", this.InstanceNetworkInfoSet);

    }
}

