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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StrToStrMap extends AbstractModel{

    /**
    * k
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("K")
    @Expose
    private String K;

    /**
    * v
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("V")
    @Expose
    private String V;

    /**
     * Get k
注意：此字段可能返回 null，表示取不到有效值。 
     * @return K k
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getK() {
        return this.K;
    }

    /**
     * Set k
注意：此字段可能返回 null，表示取不到有效值。
     * @param K k
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setK(String K) {
        this.K = K;
    }

    /**
     * Get v
注意：此字段可能返回 null，表示取不到有效值。 
     * @return V v
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getV() {
        return this.V;
    }

    /**
     * Set v
注意：此字段可能返回 null，表示取不到有效值。
     * @param V v
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setV(String V) {
        this.V = V;
    }

    public StrToStrMap() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StrToStrMap(StrToStrMap source) {
        if (source.K != null) {
            this.K = new String(source.K);
        }
        if (source.V != null) {
            this.V = new String(source.V);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "K", this.K);
        this.setParamSimple(map, prefix + "V", this.V);

    }
}

