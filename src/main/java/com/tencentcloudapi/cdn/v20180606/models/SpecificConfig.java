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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SpecificConfig extends AbstractModel {

    /**
    * 国内特殊配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Mainland")
    @Expose
    private MainlandConfig Mainland;

    /**
    * 海外特殊配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Overseas")
    @Expose
    private OverseaConfig Overseas;

    /**
     * Get 国内特殊配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Mainland 国内特殊配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MainlandConfig getMainland() {
        return this.Mainland;
    }

    /**
     * Set 国内特殊配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Mainland 国内特殊配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMainland(MainlandConfig Mainland) {
        this.Mainland = Mainland;
    }

    /**
     * Get 海外特殊配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Overseas 海外特殊配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public OverseaConfig getOverseas() {
        return this.Overseas;
    }

    /**
     * Set 海外特殊配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Overseas 海外特殊配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOverseas(OverseaConfig Overseas) {
        this.Overseas = Overseas;
    }

    public SpecificConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SpecificConfig(SpecificConfig source) {
        if (source.Mainland != null) {
            this.Mainland = new MainlandConfig(source.Mainland);
        }
        if (source.Overseas != null) {
            this.Overseas = new OverseaConfig(source.Overseas);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Mainland.", this.Mainland);
        this.setParamObj(map, prefix + "Overseas.", this.Overseas);

    }
}

