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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BlindWatermarkEmbedInfo extends AbstractModel {

    /**
    * <p>盲水印文字，经过URL安全的Base64编码的数据。Base64解码之后，少于12Byte将会填充0x00到12Byte，超过12Byte将会截断为12Byte。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EmbedText")
    @Expose
    private String EmbedText;

    /**
     * Get <p>盲水印文字，经过URL安全的Base64编码的数据。Base64解码之后，少于12Byte将会填充0x00到12Byte，超过12Byte将会截断为12Byte。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EmbedText <p>盲水印文字，经过URL安全的Base64编码的数据。Base64解码之后，少于12Byte将会填充0x00到12Byte，超过12Byte将会截断为12Byte。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEmbedText() {
        return this.EmbedText;
    }

    /**
     * Set <p>盲水印文字，经过URL安全的Base64编码的数据。Base64解码之后，少于12Byte将会填充0x00到12Byte，超过12Byte将会截断为12Byte。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param EmbedText <p>盲水印文字，经过URL安全的Base64编码的数据。Base64解码之后，少于12Byte将会填充0x00到12Byte，超过12Byte将会截断为12Byte。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEmbedText(String EmbedText) {
        this.EmbedText = EmbedText;
    }

    public BlindWatermarkEmbedInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BlindWatermarkEmbedInfo(BlindWatermarkEmbedInfo source) {
        if (source.EmbedText != null) {
            this.EmbedText = new String(source.EmbedText);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EmbedText", this.EmbedText);

    }
}

