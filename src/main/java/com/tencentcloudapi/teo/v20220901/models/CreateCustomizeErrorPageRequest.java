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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateCustomizeErrorPageRequest extends AbstractModel {

    /**
    * <p>站点 ID。</p>
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * <p>自定义响应页面名称，名称为 2-30 个字符。</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>自定义响应页面类型，取值有：</p><ul><li>text/html</li><li>application/json</li><li>plain/text</li><li>text/xml</li><li>text/css</li><li>text/javascript</li><li>application/javascript</li><li>text/markdown</li></ul>
    */
    @SerializedName("ContentType")
    @Expose
    private String ContentType;

    /**
    * <p>自定义响应页面描述，描述不超过 60 个字符。</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>自定义响应页面内容，内容不超过 16KB。</p>
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
     * Get <p>站点 ID。</p> 
     * @return ZoneId <p>站点 ID。</p>
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set <p>站点 ID。</p>
     * @param ZoneId <p>站点 ID。</p>
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get <p>自定义响应页面名称，名称为 2-30 个字符。</p> 
     * @return Name <p>自定义响应页面名称，名称为 2-30 个字符。</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>自定义响应页面名称，名称为 2-30 个字符。</p>
     * @param Name <p>自定义响应页面名称，名称为 2-30 个字符。</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>自定义响应页面类型，取值有：</p><ul><li>text/html</li><li>application/json</li><li>plain/text</li><li>text/xml</li><li>text/css</li><li>text/javascript</li><li>application/javascript</li><li>text/markdown</li></ul> 
     * @return ContentType <p>自定义响应页面类型，取值有：</p><ul><li>text/html</li><li>application/json</li><li>plain/text</li><li>text/xml</li><li>text/css</li><li>text/javascript</li><li>application/javascript</li><li>text/markdown</li></ul>
     */
    public String getContentType() {
        return this.ContentType;
    }

    /**
     * Set <p>自定义响应页面类型，取值有：</p><ul><li>text/html</li><li>application/json</li><li>plain/text</li><li>text/xml</li><li>text/css</li><li>text/javascript</li><li>application/javascript</li><li>text/markdown</li></ul>
     * @param ContentType <p>自定义响应页面类型，取值有：</p><ul><li>text/html</li><li>application/json</li><li>plain/text</li><li>text/xml</li><li>text/css</li><li>text/javascript</li><li>application/javascript</li><li>text/markdown</li></ul>
     */
    public void setContentType(String ContentType) {
        this.ContentType = ContentType;
    }

    /**
     * Get <p>自定义响应页面描述，描述不超过 60 个字符。</p> 
     * @return Description <p>自定义响应页面描述，描述不超过 60 个字符。</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>自定义响应页面描述，描述不超过 60 个字符。</p>
     * @param Description <p>自定义响应页面描述，描述不超过 60 个字符。</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>自定义响应页面内容，内容不超过 16KB。</p> 
     * @return Content <p>自定义响应页面内容，内容不超过 16KB。</p>
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set <p>自定义响应页面内容，内容不超过 16KB。</p>
     * @param Content <p>自定义响应页面内容，内容不超过 16KB。</p>
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    public CreateCustomizeErrorPageRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCustomizeErrorPageRequest(CreateCustomizeErrorPageRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ContentType != null) {
            this.ContentType = new String(source.ContentType);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ContentType", this.ContentType);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Content", this.Content);

    }
}

