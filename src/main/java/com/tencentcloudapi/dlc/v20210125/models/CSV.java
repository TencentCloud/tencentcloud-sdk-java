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

public class CSV extends AbstractModel{

    /**
    * 压缩格式，["Snappy", "Gzip", "None"选一]。
    */
    @SerializedName("CodeCompress")
    @Expose
    private String CodeCompress;

    /**
    * CSV序列化及反序列化数据结构。
    */
    @SerializedName("CSVSerde")
    @Expose
    private CSVSerde CSVSerde;

    /**
    * 标题行，默认为0。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HeadLines")
    @Expose
    private Long HeadLines;

    /**
    * 格式，默认值为CSV
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Format")
    @Expose
    private String Format;

    /**
     * Get 压缩格式，["Snappy", "Gzip", "None"选一]。 
     * @return CodeCompress 压缩格式，["Snappy", "Gzip", "None"选一]。
     */
    public String getCodeCompress() {
        return this.CodeCompress;
    }

    /**
     * Set 压缩格式，["Snappy", "Gzip", "None"选一]。
     * @param CodeCompress 压缩格式，["Snappy", "Gzip", "None"选一]。
     */
    public void setCodeCompress(String CodeCompress) {
        this.CodeCompress = CodeCompress;
    }

    /**
     * Get CSV序列化及反序列化数据结构。 
     * @return CSVSerde CSV序列化及反序列化数据结构。
     */
    public CSVSerde getCSVSerde() {
        return this.CSVSerde;
    }

    /**
     * Set CSV序列化及反序列化数据结构。
     * @param CSVSerde CSV序列化及反序列化数据结构。
     */
    public void setCSVSerde(CSVSerde CSVSerde) {
        this.CSVSerde = CSVSerde;
    }

    /**
     * Get 标题行，默认为0。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HeadLines 标题行，默认为0。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getHeadLines() {
        return this.HeadLines;
    }

    /**
     * Set 标题行，默认为0。
注意：此字段可能返回 null，表示取不到有效值。
     * @param HeadLines 标题行，默认为0。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHeadLines(Long HeadLines) {
        this.HeadLines = HeadLines;
    }

    /**
     * Get 格式，默认值为CSV
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Format 格式，默认值为CSV
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFormat() {
        return this.Format;
    }

    /**
     * Set 格式，默认值为CSV
注意：此字段可能返回 null，表示取不到有效值。
     * @param Format 格式，默认值为CSV
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFormat(String Format) {
        this.Format = Format;
    }

    public CSV() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CSV(CSV source) {
        if (source.CodeCompress != null) {
            this.CodeCompress = new String(source.CodeCompress);
        }
        if (source.CSVSerde != null) {
            this.CSVSerde = new CSVSerde(source.CSVSerde);
        }
        if (source.HeadLines != null) {
            this.HeadLines = new Long(source.HeadLines);
        }
        if (source.Format != null) {
            this.Format = new String(source.Format);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CodeCompress", this.CodeCompress);
        this.setParamObj(map, prefix + "CSVSerde.", this.CSVSerde);
        this.setParamSimple(map, prefix + "HeadLines", this.HeadLines);
        this.setParamSimple(map, prefix + "Format", this.Format);

    }
}

