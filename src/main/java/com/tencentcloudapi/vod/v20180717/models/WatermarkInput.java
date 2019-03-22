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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WatermarkInput  extends AbstractModel{

    /**
    * 水印模板 ID。
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * 文字内容，长度不超过100个字符。仅当水印类型为文字水印时填写。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TextContent")
    @Expose
    private String TextContent;

    /**
    * SVG 内容。长度不超过 2000000 个字符。仅当水印类型为 SVG 水印时填写。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SvgContent")
    @Expose
    private String SvgContent;

    /**
     * 获取水印模板 ID。
     * @return Definition 水印模板 ID。
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * 设置水印模板 ID。
     * @param Definition 水印模板 ID。
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * 获取文字内容，长度不超过100个字符。仅当水印类型为文字水印时填写。
注意：此字段可能返回 null，表示取不到有效值。
     * @return TextContent 文字内容，长度不超过100个字符。仅当水印类型为文字水印时填写。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTextContent() {
        return this.TextContent;
    }

    /**
     * 设置文字内容，长度不超过100个字符。仅当水印类型为文字水印时填写。
注意：此字段可能返回 null，表示取不到有效值。
     * @param TextContent 文字内容，长度不超过100个字符。仅当水印类型为文字水印时填写。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTextContent(String TextContent) {
        this.TextContent = TextContent;
    }

    /**
     * 获取SVG 内容。长度不超过 2000000 个字符。仅当水印类型为 SVG 水印时填写。
注意：此字段可能返回 null，表示取不到有效值。
     * @return SvgContent SVG 内容。长度不超过 2000000 个字符。仅当水印类型为 SVG 水印时填写。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSvgContent() {
        return this.SvgContent;
    }

    /**
     * 设置SVG 内容。长度不超过 2000000 个字符。仅当水印类型为 SVG 水印时填写。
注意：此字段可能返回 null，表示取不到有效值。
     * @param SvgContent SVG 内容。长度不超过 2000000 个字符。仅当水印类型为 SVG 水印时填写。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSvgContent(String SvgContent) {
        this.SvgContent = SvgContent;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamSimple(map, prefix + "TextContent", this.TextContent);
        this.setParamSimple(map, prefix + "SvgContent", this.SvgContent);

    }
}

