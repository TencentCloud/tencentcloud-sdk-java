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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BlindWatermarkTemplate extends AbstractModel {

    /**
    * 数字水印模板唯一标识。
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * 数字水印类型，可选值：<li>blind-basic：基础版权数字水印；</li><li>blind-nagra：NAGRA取证水印；</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 数字水印模板名称。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 数字水印模板文本内容，长度不超过64个字符。
    */
    @SerializedName("TextContent")
    @Expose
    private String TextContent;

    /**
    * 数字水印模板描述信息。
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * 数字水印模板创建时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/862/37710#52)。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 数字水印模板最后修改时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/862/37710#52)。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get 数字水印模板唯一标识。 
     * @return Definition 数字水印模板唯一标识。
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set 数字水印模板唯一标识。
     * @param Definition 数字水印模板唯一标识。
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get 数字水印类型，可选值：<li>blind-basic：基础版权数字水印；</li><li>blind-nagra：NAGRA取证水印；</li> 
     * @return Type 数字水印类型，可选值：<li>blind-basic：基础版权数字水印；</li><li>blind-nagra：NAGRA取证水印；</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 数字水印类型，可选值：<li>blind-basic：基础版权数字水印；</li><li>blind-nagra：NAGRA取证水印；</li>
     * @param Type 数字水印类型，可选值：<li>blind-basic：基础版权数字水印；</li><li>blind-nagra：NAGRA取证水印；</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 数字水印模板名称。 
     * @return Name 数字水印模板名称。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 数字水印模板名称。
     * @param Name 数字水印模板名称。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 数字水印模板文本内容，长度不超过64个字符。 
     * @return TextContent 数字水印模板文本内容，长度不超过64个字符。
     */
    public String getTextContent() {
        return this.TextContent;
    }

    /**
     * Set 数字水印模板文本内容，长度不超过64个字符。
     * @param TextContent 数字水印模板文本内容，长度不超过64个字符。
     */
    public void setTextContent(String TextContent) {
        this.TextContent = TextContent;
    }

    /**
     * Get 数字水印模板描述信息。 
     * @return Comment 数字水印模板描述信息。
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set 数字水印模板描述信息。
     * @param Comment 数字水印模板描述信息。
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get 数字水印模板创建时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/862/37710#52)。 
     * @return CreateTime 数字水印模板创建时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/862/37710#52)。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 数字水印模板创建时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/862/37710#52)。
     * @param CreateTime 数字水印模板创建时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/862/37710#52)。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 数字水印模板最后修改时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/862/37710#52)。 
     * @return UpdateTime 数字水印模板最后修改时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/862/37710#52)。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 数字水印模板最后修改时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/862/37710#52)。
     * @param UpdateTime 数字水印模板最后修改时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/862/37710#52)。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public BlindWatermarkTemplate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BlindWatermarkTemplate(BlindWatermarkTemplate source) {
        if (source.Definition != null) {
            this.Definition = new Long(source.Definition);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.TextContent != null) {
            this.TextContent = new String(source.TextContent);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "TextContent", this.TextContent);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

