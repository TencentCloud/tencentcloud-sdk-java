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

public class AddressInfo extends AbstractModel{

    /**
    * 实例的外网ip相关信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PublicIPAddressInfo")
    @Expose
    private PublicIPAddressInfo PublicIPAddressInfo;

    /**
    * 实例的内网ip相关信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PrivateIPAddressInfo")
    @Expose
    private PrivateIPAddressInfo PrivateIPAddressInfo;

    /**
     * Get 实例的外网ip相关信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PublicIPAddressInfo 实例的外网ip相关信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PublicIPAddressInfo getPublicIPAddressInfo() {
        return this.PublicIPAddressInfo;
    }

    /**
     * Set 实例的外网ip相关信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param PublicIPAddressInfo 实例的外网ip相关信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPublicIPAddressInfo(PublicIPAddressInfo PublicIPAddressInfo) {
        this.PublicIPAddressInfo = PublicIPAddressInfo;
    }

    /**
     * Get 实例的内网ip相关信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PrivateIPAddressInfo 实例的内网ip相关信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PrivateIPAddressInfo getPrivateIPAddressInfo() {
        return this.PrivateIPAddressInfo;
    }

    /**
     * Set 实例的内网ip相关信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param PrivateIPAddressInfo 实例的内网ip相关信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPrivateIPAddressInfo(PrivateIPAddressInfo PrivateIPAddressInfo) {
        this.PrivateIPAddressInfo = PrivateIPAddressInfo;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "PublicIPAddressInfo.", this.PublicIPAddressInfo);
        this.setParamObj(map, prefix + "PrivateIPAddressInfo.", this.PrivateIPAddressInfo);

    }
}

