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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ContentInfo extends AbstractModel{

    /**
    * 内容格式，支持json、csv
    */
    @SerializedName("Format")
    @Expose
    private String Format;

    /**
    * csv格式内容描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Csv")
    @Expose
    private CsvInfo Csv;

    /**
    * json格式内容描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Json")
    @Expose
    private JsonInfo Json;

    /**
    * parquet格式内容描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Parquet")
    @Expose
    private ParquetInfo Parquet;

    /**
     * Get 内容格式，支持json、csv 
     * @return Format 内容格式，支持json、csv
     */
    public String getFormat() {
        return this.Format;
    }

    /**
     * Set 内容格式，支持json、csv
     * @param Format 内容格式，支持json、csv
     */
    public void setFormat(String Format) {
        this.Format = Format;
    }

    /**
     * Get csv格式内容描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Csv csv格式内容描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CsvInfo getCsv() {
        return this.Csv;
    }

    /**
     * Set csv格式内容描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Csv csv格式内容描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCsv(CsvInfo Csv) {
        this.Csv = Csv;
    }

    /**
     * Get json格式内容描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Json json格式内容描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public JsonInfo getJson() {
        return this.Json;
    }

    /**
     * Set json格式内容描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Json json格式内容描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setJson(JsonInfo Json) {
        this.Json = Json;
    }

    /**
     * Get parquet格式内容描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Parquet parquet格式内容描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ParquetInfo getParquet() {
        return this.Parquet;
    }

    /**
     * Set parquet格式内容描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Parquet parquet格式内容描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParquet(ParquetInfo Parquet) {
        this.Parquet = Parquet;
    }

    public ContentInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ContentInfo(ContentInfo source) {
        if (source.Format != null) {
            this.Format = new String(source.Format);
        }
        if (source.Csv != null) {
            this.Csv = new CsvInfo(source.Csv);
        }
        if (source.Json != null) {
            this.Json = new JsonInfo(source.Json);
        }
        if (source.Parquet != null) {
            this.Parquet = new ParquetInfo(source.Parquet);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Format", this.Format);
        this.setParamObj(map, prefix + "Csv.", this.Csv);
        this.setParamObj(map, prefix + "Json.", this.Json);
        this.setParamObj(map, prefix + "Parquet.", this.Parquet);

    }
}

