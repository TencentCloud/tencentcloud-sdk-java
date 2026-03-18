/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TextMetadata extends AbstractModel {

    /**
    * <p>媒资文本文件大小，单位为字节</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileSize")
    @Expose
    private Long FileSize;

    /**
    * <p>媒资文本文件MD5</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MD5")
    @Expose
    private String MD5;

    /**
    * <p>媒资文本文件字符数</p><p>单位：字符</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Length")
    @Expose
    private Long Length;

    /**
    * <p>媒资文本文件格式</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Format")
    @Expose
    private String Format;

    /**
    * <p>封装格式短后缀</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ShortFormat")
    @Expose
    private String ShortFormat;

    /**
     * Get <p>媒资文本文件大小，单位为字节</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FileSize <p>媒资文本文件大小，单位为字节</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFileSize() {
        return this.FileSize;
    }

    /**
     * Set <p>媒资文本文件大小，单位为字节</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileSize <p>媒资文本文件大小，单位为字节</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileSize(Long FileSize) {
        this.FileSize = FileSize;
    }

    /**
     * Get <p>媒资文本文件MD5</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MD5 <p>媒资文本文件MD5</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMD5() {
        return this.MD5;
    }

    /**
     * Set <p>媒资文本文件MD5</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param MD5 <p>媒资文本文件MD5</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMD5(String MD5) {
        this.MD5 = MD5;
    }

    /**
     * Get <p>媒资文本文件字符数</p><p>单位：字符</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Length <p>媒资文本文件字符数</p><p>单位：字符</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLength() {
        return this.Length;
    }

    /**
     * Set <p>媒资文本文件字符数</p><p>单位：字符</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Length <p>媒资文本文件字符数</p><p>单位：字符</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLength(Long Length) {
        this.Length = Length;
    }

    /**
     * Get <p>媒资文本文件格式</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Format <p>媒资文本文件格式</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFormat() {
        return this.Format;
    }

    /**
     * Set <p>媒资文本文件格式</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Format <p>媒资文本文件格式</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFormat(String Format) {
        this.Format = Format;
    }

    /**
     * Get <p>封装格式短后缀</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ShortFormat <p>封装格式短后缀</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getShortFormat() {
        return this.ShortFormat;
    }

    /**
     * Set <p>封装格式短后缀</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ShortFormat <p>封装格式短后缀</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setShortFormat(String ShortFormat) {
        this.ShortFormat = ShortFormat;
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
        if (source.ShortFormat != null) {
            this.ShortFormat = new String(source.ShortFormat);
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
        this.setParamSimple(map, prefix + "ShortFormat", this.ShortFormat);

    }
}

