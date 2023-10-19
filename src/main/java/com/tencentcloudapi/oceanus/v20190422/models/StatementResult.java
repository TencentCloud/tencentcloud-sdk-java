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
package com.tencentcloudapi.oceanus.v20190422.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StatementResult extends AbstractModel {

    /**
    * 返回结果列
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Columns")
    @Expose
    private ResultColumn [] Columns;

    /**
    * 格式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RowFormat")
    @Expose
    private String RowFormat;

    /**
    * 结果值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Data")
    @Expose
    private ResultData [] Data;

    /**
     * Get 返回结果列
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Columns 返回结果列
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ResultColumn [] getColumns() {
        return this.Columns;
    }

    /**
     * Set 返回结果列
注意：此字段可能返回 null，表示取不到有效值。
     * @param Columns 返回结果列
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setColumns(ResultColumn [] Columns) {
        this.Columns = Columns;
    }

    /**
     * Get 格式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RowFormat 格式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRowFormat() {
        return this.RowFormat;
    }

    /**
     * Set 格式
注意：此字段可能返回 null，表示取不到有效值。
     * @param RowFormat 格式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRowFormat(String RowFormat) {
        this.RowFormat = RowFormat;
    }

    /**
     * Get 结果值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Data 结果值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ResultData [] getData() {
        return this.Data;
    }

    /**
     * Set 结果值
注意：此字段可能返回 null，表示取不到有效值。
     * @param Data 结果值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setData(ResultData [] Data) {
        this.Data = Data;
    }

    public StatementResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StatementResult(StatementResult source) {
        if (source.Columns != null) {
            this.Columns = new ResultColumn[source.Columns.length];
            for (int i = 0; i < source.Columns.length; i++) {
                this.Columns[i] = new ResultColumn(source.Columns[i]);
            }
        }
        if (source.RowFormat != null) {
            this.RowFormat = new String(source.RowFormat);
        }
        if (source.Data != null) {
            this.Data = new ResultData[source.Data.length];
            for (int i = 0; i < source.Data.length; i++) {
                this.Data[i] = new ResultData(source.Data[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Columns.", this.Columns);
        this.setParamSimple(map, prefix + "RowFormat", this.RowFormat);
        this.setParamArrayObj(map, prefix + "Data.", this.Data);

    }
}

