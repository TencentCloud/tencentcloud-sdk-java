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

public class DataFormat extends AbstractModel{

    /**
    * 文本格式，TextFile。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TextFile")
    @Expose
    private TextFile TextFile;

    /**
    * 文本格式，CSV。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CSV")
    @Expose
    private CSV CSV;

    /**
    * 文本格式，Json。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Json")
    @Expose
    private Other Json;

    /**
    * Parquet格式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Parquet")
    @Expose
    private Other Parquet;

    /**
    * ORC格式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ORC")
    @Expose
    private Other ORC;

    /**
    * AVRO格式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AVRO")
    @Expose
    private Other AVRO;

    /**
     * Get 文本格式，TextFile。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TextFile 文本格式，TextFile。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TextFile getTextFile() {
        return this.TextFile;
    }

    /**
     * Set 文本格式，TextFile。
注意：此字段可能返回 null，表示取不到有效值。
     * @param TextFile 文本格式，TextFile。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTextFile(TextFile TextFile) {
        this.TextFile = TextFile;
    }

    /**
     * Get 文本格式，CSV。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CSV 文本格式，CSV。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CSV getCSV() {
        return this.CSV;
    }

    /**
     * Set 文本格式，CSV。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CSV 文本格式，CSV。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCSV(CSV CSV) {
        this.CSV = CSV;
    }

    /**
     * Get 文本格式，Json。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Json 文本格式，Json。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Other getJson() {
        return this.Json;
    }

    /**
     * Set 文本格式，Json。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Json 文本格式，Json。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setJson(Other Json) {
        this.Json = Json;
    }

    /**
     * Get Parquet格式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Parquet Parquet格式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Other getParquet() {
        return this.Parquet;
    }

    /**
     * Set Parquet格式
注意：此字段可能返回 null，表示取不到有效值。
     * @param Parquet Parquet格式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParquet(Other Parquet) {
        this.Parquet = Parquet;
    }

    /**
     * Get ORC格式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ORC ORC格式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Other getORC() {
        return this.ORC;
    }

    /**
     * Set ORC格式
注意：此字段可能返回 null，表示取不到有效值。
     * @param ORC ORC格式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setORC(Other ORC) {
        this.ORC = ORC;
    }

    /**
     * Get AVRO格式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AVRO AVRO格式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Other getAVRO() {
        return this.AVRO;
    }

    /**
     * Set AVRO格式
注意：此字段可能返回 null，表示取不到有效值。
     * @param AVRO AVRO格式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAVRO(Other AVRO) {
        this.AVRO = AVRO;
    }

    public DataFormat() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DataFormat(DataFormat source) {
        if (source.TextFile != null) {
            this.TextFile = new TextFile(source.TextFile);
        }
        if (source.CSV != null) {
            this.CSV = new CSV(source.CSV);
        }
        if (source.Json != null) {
            this.Json = new Other(source.Json);
        }
        if (source.Parquet != null) {
            this.Parquet = new Other(source.Parquet);
        }
        if (source.ORC != null) {
            this.ORC = new Other(source.ORC);
        }
        if (source.AVRO != null) {
            this.AVRO = new Other(source.AVRO);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "TextFile.", this.TextFile);
        this.setParamObj(map, prefix + "CSV.", this.CSV);
        this.setParamObj(map, prefix + "Json.", this.Json);
        this.setParamObj(map, prefix + "Parquet.", this.Parquet);
        this.setParamObj(map, prefix + "ORC.", this.ORC);
        this.setParamObj(map, prefix + "AVRO.", this.AVRO);

    }
}

