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
package com.tencentcloudapi.makers.v20261113.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Regions extends AbstractModel {

    /**
    * <p>中国大陆地域</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Mainland")
    @Expose
    private String [] Mainland;

    /**
    * <p>海外地域</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Overseas")
    @Expose
    private String [] Overseas;

    /**
     * Get <p>中国大陆地域</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Mainland <p>中国大陆地域</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getMainland() {
        return this.Mainland;
    }

    /**
     * Set <p>中国大陆地域</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Mainland <p>中国大陆地域</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMainland(String [] Mainland) {
        this.Mainland = Mainland;
    }

    /**
     * Get <p>海外地域</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Overseas <p>海外地域</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getOverseas() {
        return this.Overseas;
    }

    /**
     * Set <p>海外地域</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Overseas <p>海外地域</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOverseas(String [] Overseas) {
        this.Overseas = Overseas;
    }

    public Regions() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Regions(Regions source) {
        if (source.Mainland != null) {
            this.Mainland = new String[source.Mainland.length];
            for (int i = 0; i < source.Mainland.length; i++) {
                this.Mainland[i] = new String(source.Mainland[i]);
            }
        }
        if (source.Overseas != null) {
            this.Overseas = new String[source.Overseas.length];
            for (int i = 0; i < source.Overseas.length; i++) {
                this.Overseas[i] = new String(source.Overseas[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Mainland.", this.Mainland);
        this.setParamArraySimple(map, prefix + "Overseas.", this.Overseas);

    }
}

