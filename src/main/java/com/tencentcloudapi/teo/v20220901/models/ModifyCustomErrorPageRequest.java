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

public class ModifyCustomErrorPageRequest extends AbstractModel {

    /**
    * 自定义错误页面 ID。
    */
    @SerializedName("PageId")
    @Expose
    private String PageId;

    /**
    * 站点 ID。
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 自定义错误页名称，名称为2 - 60个字符。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 自定义错误页描述，描述内容不超过60个字符。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 自定义错误页面类型，取值有：<li>text/html。 </li><li>application/json。</li><li>plain/text。</li><li>text/xml。</li>
    */
    @SerializedName("ContentType")
    @Expose
    private String ContentType;

    /**
    * 自定义错误页面内容。内容不超过 2KB。
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
     * Get 自定义错误页面 ID。 
     * @return PageId 自定义错误页面 ID。
     */
    public String getPageId() {
        return this.PageId;
    }

    /**
     * Set 自定义错误页面 ID。
     * @param PageId 自定义错误页面 ID。
     */
    public void setPageId(String PageId) {
        this.PageId = PageId;
    }

    /**
     * Get 站点 ID。 
     * @return ZoneId 站点 ID。
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 站点 ID。
     * @param ZoneId 站点 ID。
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 自定义错误页名称，名称为2 - 60个字符。 
     * @return Name 自定义错误页名称，名称为2 - 60个字符。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 自定义错误页名称，名称为2 - 60个字符。
     * @param Name 自定义错误页名称，名称为2 - 60个字符。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 自定义错误页描述，描述内容不超过60个字符。 
     * @return Description 自定义错误页描述，描述内容不超过60个字符。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 自定义错误页描述，描述内容不超过60个字符。
     * @param Description 自定义错误页描述，描述内容不超过60个字符。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 自定义错误页面类型，取值有：<li>text/html。 </li><li>application/json。</li><li>plain/text。</li><li>text/xml。</li> 
     * @return ContentType 自定义错误页面类型，取值有：<li>text/html。 </li><li>application/json。</li><li>plain/text。</li><li>text/xml。</li>
     */
    public String getContentType() {
        return this.ContentType;
    }

    /**
     * Set 自定义错误页面类型，取值有：<li>text/html。 </li><li>application/json。</li><li>plain/text。</li><li>text/xml。</li>
     * @param ContentType 自定义错误页面类型，取值有：<li>text/html。 </li><li>application/json。</li><li>plain/text。</li><li>text/xml。</li>
     */
    public void setContentType(String ContentType) {
        this.ContentType = ContentType;
    }

    /**
     * Get 自定义错误页面内容。内容不超过 2KB。 
     * @return Content 自定义错误页面内容。内容不超过 2KB。
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set 自定义错误页面内容。内容不超过 2KB。
     * @param Content 自定义错误页面内容。内容不超过 2KB。
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    public ModifyCustomErrorPageRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyCustomErrorPageRequest(ModifyCustomErrorPageRequest source) {
        if (source.PageId != null) {
            this.PageId = new String(source.PageId);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.ContentType != null) {
            this.ContentType = new String(source.ContentType);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PageId", this.PageId);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "ContentType", this.ContentType);
        this.setParamSimple(map, prefix + "Content", this.Content);

    }
}

