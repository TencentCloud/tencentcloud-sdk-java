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

public class EipOutConfig extends AbstractModel {

    /**
    * <p>是否固定 EIP</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EipFixed")
    @Expose
    private String EipFixed;

    /**
    * <p>EIP 列表</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Eips")
    @Expose
    private String [] Eips;

    /**
     * Get <p>是否固定 EIP</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EipFixed <p>是否固定 EIP</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEipFixed() {
        return this.EipFixed;
    }

    /**
     * Set <p>是否固定 EIP</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param EipFixed <p>是否固定 EIP</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEipFixed(String EipFixed) {
        this.EipFixed = EipFixed;
    }

    /**
     * Get <p>EIP 列表</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Eips <p>EIP 列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getEips() {
        return this.Eips;
    }

    /**
     * Set <p>EIP 列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Eips <p>EIP 列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEips(String [] Eips) {
        this.Eips = Eips;
    }

    public EipOutConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EipOutConfig(EipOutConfig source) {
        if (source.EipFixed != null) {
            this.EipFixed = new String(source.EipFixed);
        }
        if (source.Eips != null) {
            this.Eips = new String[source.Eips.length];
            for (int i = 0; i < source.Eips.length; i++) {
                this.Eips[i] = new String(source.Eips[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EipFixed", this.EipFixed);
        this.setParamArraySimple(map, prefix + "Eips.", this.Eips);

    }
}

