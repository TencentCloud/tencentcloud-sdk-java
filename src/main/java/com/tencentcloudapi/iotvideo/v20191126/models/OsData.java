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
package com.tencentcloudapi.iotvideo.v20191126.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OsData extends AbstractModel{

    /**
    * 芯片型号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ChipId")
    @Expose
    private String ChipId;

    /**
    * 芯片厂商
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ChipManufacture")
    @Expose
    private String ChipManufacture;

    /**
     * Get 芯片型号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ChipId 芯片型号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getChipId() {
        return this.ChipId;
    }

    /**
     * Set 芯片型号
注意：此字段可能返回 null，表示取不到有效值。
     * @param ChipId 芯片型号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setChipId(String ChipId) {
        this.ChipId = ChipId;
    }

    /**
     * Get 芯片厂商
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ChipManufacture 芯片厂商
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getChipManufacture() {
        return this.ChipManufacture;
    }

    /**
     * Set 芯片厂商
注意：此字段可能返回 null，表示取不到有效值。
     * @param ChipManufacture 芯片厂商
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setChipManufacture(String ChipManufacture) {
        this.ChipManufacture = ChipManufacture;
    }

    public OsData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OsData(OsData source) {
        if (source.ChipId != null) {
            this.ChipId = new String(source.ChipId);
        }
        if (source.ChipManufacture != null) {
            this.ChipManufacture = new String(source.ChipManufacture);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ChipId", this.ChipId);
        this.setParamSimple(map, prefix + "ChipManufacture", this.ChipManufacture);

    }
}

