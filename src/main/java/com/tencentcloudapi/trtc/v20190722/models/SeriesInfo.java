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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SeriesInfo extends AbstractModel{

    /**
    * 数据列
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Columns")
    @Expose
    private String [] Columns;

    /**
    * 数据值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Values")
    @Expose
    private Long [] Values;

    /**
     * Get 数据列
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Columns 数据列
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getColumns() {
        return this.Columns;
    }

    /**
     * Set 数据列
注意：此字段可能返回 null，表示取不到有效值。
     * @param Columns 数据列
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setColumns(String [] Columns) {
        this.Columns = Columns;
    }

    /**
     * Get 数据值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Values 数据值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long [] getValues() {
        return this.Values;
    }

    /**
     * Set 数据值
注意：此字段可能返回 null，表示取不到有效值。
     * @param Values 数据值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setValues(Long [] Values) {
        this.Values = Values;
    }

    public SeriesInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SeriesInfo(SeriesInfo source) {
        if (source.Columns != null) {
            this.Columns = new String[source.Columns.length];
            for (int i = 0; i < source.Columns.length; i++) {
                this.Columns[i] = new String(source.Columns[i]);
            }
        }
        if (source.Values != null) {
            this.Values = new Long[source.Values.length];
            for (int i = 0; i < source.Values.length; i++) {
                this.Values[i] = new Long(source.Values[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Columns.", this.Columns);
        this.setParamArraySimple(map, prefix + "Values.", this.Values);

    }
}

