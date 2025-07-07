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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Ipv6SubnetCidrBlock extends AbstractModel {

    /**
    * 子网实例`ID`。形如：`subnet-pxir56ns`。	
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * `IPv6`子网段。形如：`3402:4e00:20:1001::/64`	
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Ipv6CidrBlock")
    @Expose
    private String Ipv6CidrBlock;

    /**
     * Get 子网实例`ID`。形如：`subnet-pxir56ns`。	
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubnetId 子网实例`ID`。形如：`subnet-pxir56ns`。	
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 子网实例`ID`。形如：`subnet-pxir56ns`。	
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubnetId 子网实例`ID`。形如：`subnet-pxir56ns`。	
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get `IPv6`子网段。形如：`3402:4e00:20:1001::/64`	
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Ipv6CidrBlock `IPv6`子网段。形如：`3402:4e00:20:1001::/64`	
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIpv6CidrBlock() {
        return this.Ipv6CidrBlock;
    }

    /**
     * Set `IPv6`子网段。形如：`3402:4e00:20:1001::/64`	
注意：此字段可能返回 null，表示取不到有效值。
     * @param Ipv6CidrBlock `IPv6`子网段。形如：`3402:4e00:20:1001::/64`	
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIpv6CidrBlock(String Ipv6CidrBlock) {
        this.Ipv6CidrBlock = Ipv6CidrBlock;
    }

    public Ipv6SubnetCidrBlock() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Ipv6SubnetCidrBlock(Ipv6SubnetCidrBlock source) {
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.Ipv6CidrBlock != null) {
            this.Ipv6CidrBlock = new String(source.Ipv6CidrBlock);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "Ipv6CidrBlock", this.Ipv6CidrBlock);

    }
}

