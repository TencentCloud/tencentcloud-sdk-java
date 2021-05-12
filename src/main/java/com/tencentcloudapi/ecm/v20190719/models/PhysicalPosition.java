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

public class PhysicalPosition extends AbstractModel{

    /**
    * 机位
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PosId")
    @Expose
    private String PosId;

    /**
    * 机架
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RackId")
    @Expose
    private String RackId;

    /**
    * 交换机
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SwitchId")
    @Expose
    private String SwitchId;

    /**
     * Get 机位
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PosId 机位
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPosId() {
        return this.PosId;
    }

    /**
     * Set 机位
注意：此字段可能返回 null，表示取不到有效值。
     * @param PosId 机位
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPosId(String PosId) {
        this.PosId = PosId;
    }

    /**
     * Get 机架
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RackId 机架
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRackId() {
        return this.RackId;
    }

    /**
     * Set 机架
注意：此字段可能返回 null，表示取不到有效值。
     * @param RackId 机架
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRackId(String RackId) {
        this.RackId = RackId;
    }

    /**
     * Get 交换机
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SwitchId 交换机
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSwitchId() {
        return this.SwitchId;
    }

    /**
     * Set 交换机
注意：此字段可能返回 null，表示取不到有效值。
     * @param SwitchId 交换机
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSwitchId(String SwitchId) {
        this.SwitchId = SwitchId;
    }

    public PhysicalPosition() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PhysicalPosition(PhysicalPosition source) {
        if (source.PosId != null) {
            this.PosId = new String(source.PosId);
        }
        if (source.RackId != null) {
            this.RackId = new String(source.RackId);
        }
        if (source.SwitchId != null) {
            this.SwitchId = new String(source.SwitchId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PosId", this.PosId);
        this.setParamSimple(map, prefix + "RackId", this.RackId);
        this.setParamSimple(map, prefix + "SwitchId", this.SwitchId);

    }
}

