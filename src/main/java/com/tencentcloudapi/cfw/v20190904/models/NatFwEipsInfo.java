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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NatFwEipsInfo extends AbstractModel{

    /**
    * 弹性公网ip
    */
    @SerializedName("Eip")
    @Expose
    private String Eip;

    /**
    * 所属的Nat网关Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NatGatewayId")
    @Expose
    private String NatGatewayId;

    /**
    * Nat网关名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NatGatewayName")
    @Expose
    private String NatGatewayName;

    /**
     * Get 弹性公网ip 
     * @return Eip 弹性公网ip
     */
    public String getEip() {
        return this.Eip;
    }

    /**
     * Set 弹性公网ip
     * @param Eip 弹性公网ip
     */
    public void setEip(String Eip) {
        this.Eip = Eip;
    }

    /**
     * Get 所属的Nat网关Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NatGatewayId 所属的Nat网关Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNatGatewayId() {
        return this.NatGatewayId;
    }

    /**
     * Set 所属的Nat网关Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param NatGatewayId 所属的Nat网关Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNatGatewayId(String NatGatewayId) {
        this.NatGatewayId = NatGatewayId;
    }

    /**
     * Get Nat网关名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NatGatewayName Nat网关名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNatGatewayName() {
        return this.NatGatewayName;
    }

    /**
     * Set Nat网关名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param NatGatewayName Nat网关名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNatGatewayName(String NatGatewayName) {
        this.NatGatewayName = NatGatewayName;
    }

    public NatFwEipsInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NatFwEipsInfo(NatFwEipsInfo source) {
        if (source.Eip != null) {
            this.Eip = new String(source.Eip);
        }
        if (source.NatGatewayId != null) {
            this.NatGatewayId = new String(source.NatGatewayId);
        }
        if (source.NatGatewayName != null) {
            this.NatGatewayName = new String(source.NatGatewayName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Eip", this.Eip);
        this.setParamSimple(map, prefix + "NatGatewayId", this.NatGatewayId);
        this.setParamSimple(map, prefix + "NatGatewayName", this.NatGatewayName);

    }
}

