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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DMSTableInfo extends AbstractModel{

    /**
    * DMS表信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Table")
    @Expose
    private DMSTable Table;

    /**
    * 基础对象信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Asset")
    @Expose
    private Asset Asset;

    /**
     * Get DMS表信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Table DMS表信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DMSTable getTable() {
        return this.Table;
    }

    /**
     * Set DMS表信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Table DMS表信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTable(DMSTable Table) {
        this.Table = Table;
    }

    /**
     * Get 基础对象信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Asset 基础对象信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Asset getAsset() {
        return this.Asset;
    }

    /**
     * Set 基础对象信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Asset 基础对象信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAsset(Asset Asset) {
        this.Asset = Asset;
    }

    public DMSTableInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DMSTableInfo(DMSTableInfo source) {
        if (source.Table != null) {
            this.Table = new DMSTable(source.Table);
        }
        if (source.Asset != null) {
            this.Asset = new Asset(source.Asset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Table.", this.Table);
        this.setParamObj(map, prefix + "Asset.", this.Asset);

    }
}

