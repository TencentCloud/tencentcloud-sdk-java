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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ColumnItem extends AbstractModel {

    /**
    * ColumnName1
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ColumnName")
    @Expose
    private String ColumnName;

    /**
    * ColumnName1
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ColumnRef")
    @Expose
    private String ColumnRef;

    /**
     * Get ColumnName1
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ColumnName ColumnName1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getColumnName() {
        return this.ColumnName;
    }

    /**
     * Set ColumnName1
注意：此字段可能返回 null，表示取不到有效值。
     * @param ColumnName ColumnName1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setColumnName(String ColumnName) {
        this.ColumnName = ColumnName;
    }

    /**
     * Get ColumnName1
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ColumnRef ColumnName1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getColumnRef() {
        return this.ColumnRef;
    }

    /**
     * Set ColumnName1
注意：此字段可能返回 null，表示取不到有效值。
     * @param ColumnRef ColumnName1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setColumnRef(String ColumnRef) {
        this.ColumnRef = ColumnRef;
    }

    public ColumnItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ColumnItem(ColumnItem source) {
        if (source.ColumnName != null) {
            this.ColumnName = new String(source.ColumnName);
        }
        if (source.ColumnRef != null) {
            this.ColumnRef = new String(source.ColumnRef);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ColumnName", this.ColumnName);
        this.setParamSimple(map, prefix + "ColumnRef", this.ColumnRef);

    }
}

