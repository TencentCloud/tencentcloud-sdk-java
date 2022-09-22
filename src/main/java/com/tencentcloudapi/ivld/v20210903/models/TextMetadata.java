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
package com.tencentcloudapi.ivld.v20210903.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TextMetadata extends AbstractModel{

    /**
    * 媒资文本文件大小，单位为字节
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileSize")
    @Expose
    private Long FileSize;

    /**
    * 媒资文本文件MD5
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MD5")
    @Expose
    private String MD5;

    /**
    * 媒资文本文件字符数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Length")
    @Expose
    private Long Length;

    /**
    * 媒资文本文件格式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Format")
    @Expose
    private String Format;

    /**
     * Get 媒资文本文件大小，单位为字节
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FileSize 媒资文本文件大小，单位为字节
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFileSize() {
        return this.FileSize;
    }

    /**
     * Set 媒资文本文件大小，单位为字节
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileSize 媒资文本文件大小，单位为字节
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileSize(Long FileSize) {
        this.FileSize = FileSize;
    }

    /**
     * Get 媒资文本文件MD5
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MD5 媒资文本文件MD5
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMD5() {
        return this.MD5;
    }

    /**
     * Set 媒资文本文件MD5
注意：此字段可能返回 null，表示取不到有效值。
     * @param MD5 媒资文本文件MD5
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMD5(String MD5) {
        this.MD5 = MD5;
    }

    /**
     * Get 媒资文本文件字符数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Length 媒资文本文件字符数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLength() {
        return this.Length;
    }

    /**
     * Set 媒资文本文件字符数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Length 媒资文本文件字符数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLength(Long Length) {
        this.Length = Length;
    }

    /**
     * Get 媒资文本文件格式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Format 媒资文本文件格式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFormat() {
        return this.Format;
    }

    /**
     * Set 媒资文本文件格式
注意：此字段可能返回 null，表示取不到有效值。
     * @param Format 媒资文本文件格式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFormat(String Format) {
        this.Format = Format;
    }

    public TextMetadata() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TextMetadata(TextMetadata source) {
        if (source.FileSize != null) {
            this.FileSize = new Long(source.FileSize);
        }
        if (source.MD5 != null) {
            this.MD5 = new String(source.MD5);
        }
        if (source.Length != null) {
            this.Length = new Long(source.Length);
        }
        if (source.Format != null) {
            this.Format = new String(source.Format);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileSize", this.FileSize);
        this.setParamSimple(map, prefix + "MD5", this.MD5);
        this.setParamSimple(map, prefix + "Length", this.Length);
        this.setParamSimple(map, prefix + "Format", this.Format);

    }
}

