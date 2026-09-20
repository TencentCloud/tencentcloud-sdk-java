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
package com.tencentcloudapi.ags.v20250920.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InlineDataInfo extends AbstractModel {

    /**
    * 媒体类型，最大长度 128 字符。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MimeType")
    @Expose
    private String MimeType;

    /**
    * Base64 编码数据，最大长度 8192 字符。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Data")
    @Expose
    private String Data;

    /**
     * Get 媒体类型，最大长度 128 字符。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MimeType 媒体类型，最大长度 128 字符。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMimeType() {
        return this.MimeType;
    }

    /**
     * Set 媒体类型，最大长度 128 字符。
注意：此字段可能返回 null，表示取不到有效值。
     * @param MimeType 媒体类型，最大长度 128 字符。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMimeType(String MimeType) {
        this.MimeType = MimeType;
    }

    /**
     * Get Base64 编码数据，最大长度 8192 字符。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Data Base64 编码数据，最大长度 8192 字符。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getData() {
        return this.Data;
    }

    /**
     * Set Base64 编码数据，最大长度 8192 字符。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Data Base64 编码数据，最大长度 8192 字符。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setData(String Data) {
        this.Data = Data;
    }

    public InlineDataInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InlineDataInfo(InlineDataInfo source) {
        if (source.MimeType != null) {
            this.MimeType = new String(source.MimeType);
        }
        if (source.Data != null) {
            this.Data = new String(source.Data);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MimeType", this.MimeType);
        this.setParamSimple(map, prefix + "Data", this.Data);

    }
}

