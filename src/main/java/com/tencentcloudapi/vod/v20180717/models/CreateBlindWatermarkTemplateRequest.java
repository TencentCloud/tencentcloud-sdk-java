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

public class CreateBlindWatermarkTemplateRequest extends AbstractModel {

    /**
    * 数字水印类型，可选值：<li>blind-basic：基础版权数字水印；</li><li>blind-nagra：NAGRA水印；</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 数字水印文字内容，长度不超过64个字符，NAGRA水印类型的模板创建后不支持修改文字内容。
    */
    @SerializedName("TextContent")
    @Expose
    private String TextContent;

    /**
    * 点播应用 ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * 数字水印模板名称，支持中文、英文、数字、_、-和. 六种格式，长度限制：64 个字符。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 数字水印模板描述信息，长度限制：256 个字符。
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
     * Get 数字水印类型，可选值：<li>blind-basic：基础版权数字水印；</li><li>blind-nagra：NAGRA水印；</li> 
     * @return Type 数字水印类型，可选值：<li>blind-basic：基础版权数字水印；</li><li>blind-nagra：NAGRA水印；</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 数字水印类型，可选值：<li>blind-basic：基础版权数字水印；</li><li>blind-nagra：NAGRA水印；</li>
     * @param Type 数字水印类型，可选值：<li>blind-basic：基础版权数字水印；</li><li>blind-nagra：NAGRA水印；</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 数字水印文字内容，长度不超过64个字符，NAGRA水印类型的模板创建后不支持修改文字内容。 
     * @return TextContent 数字水印文字内容，长度不超过64个字符，NAGRA水印类型的模板创建后不支持修改文字内容。
     */
    public String getTextContent() {
        return this.TextContent;
    }

    /**
     * Set 数字水印文字内容，长度不超过64个字符，NAGRA水印类型的模板创建后不支持修改文字内容。
     * @param TextContent 数字水印文字内容，长度不超过64个字符，NAGRA水印类型的模板创建后不支持修改文字内容。
     */
    public void setTextContent(String TextContent) {
        this.TextContent = TextContent;
    }

    /**
     * Get 点播应用 ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。 
     * @return SubAppId 点播应用 ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set 点播应用 ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。
     * @param SubAppId 点播应用 ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get 数字水印模板名称，支持中文、英文、数字、_、-和. 六种格式，长度限制：64 个字符。 
     * @return Name 数字水印模板名称，支持中文、英文、数字、_、-和. 六种格式，长度限制：64 个字符。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 数字水印模板名称，支持中文、英文、数字、_、-和. 六种格式，长度限制：64 个字符。
     * @param Name 数字水印模板名称，支持中文、英文、数字、_、-和. 六种格式，长度限制：64 个字符。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 数字水印模板描述信息，长度限制：256 个字符。 
     * @return Comment 数字水印模板描述信息，长度限制：256 个字符。
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set 数字水印模板描述信息，长度限制：256 个字符。
     * @param Comment 数字水印模板描述信息，长度限制：256 个字符。
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    public CreateBlindWatermarkTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateBlindWatermarkTemplateRequest(CreateBlindWatermarkTemplateRequest source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.TextContent != null) {
            this.TextContent = new String(source.TextContent);
        }
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "TextContent", this.TextContent);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Comment", this.Comment);

    }
}

