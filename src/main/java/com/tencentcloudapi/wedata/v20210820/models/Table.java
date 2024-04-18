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

public class Table extends AbstractModel {

    /**
    * 1
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Column")
    @Expose
    private ColumnItem [] Column;

    /**
    * 1
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Data")
    @Expose
    private ColumnData [] Data;

    /**
     * Get 1
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Column 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ColumnItem [] getColumn() {
        return this.Column;
    }

    /**
     * Set 1
注意：此字段可能返回 null，表示取不到有效值。
     * @param Column 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setColumn(ColumnItem [] Column) {
        this.Column = Column;
    }

    /**
     * Get 1
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Data 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ColumnData [] getData() {
        return this.Data;
    }

    /**
     * Set 1
注意：此字段可能返回 null，表示取不到有效值。
     * @param Data 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setData(ColumnData [] Data) {
        this.Data = Data;
    }

    public Table() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Table(Table source) {
        if (source.Column != null) {
            this.Column = new ColumnItem[source.Column.length];
            for (int i = 0; i < source.Column.length; i++) {
                this.Column[i] = new ColumnItem(source.Column[i]);
            }
        }
        if (source.Data != null) {
            this.Data = new ColumnData[source.Data.length];
            for (int i = 0; i < source.Data.length; i++) {
                this.Data[i] = new ColumnData(source.Data[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Column.", this.Column);
        this.setParamArrayObj(map, prefix + "Data.", this.Data);

    }
}

