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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CustomErrorPage extends AbstractModel {

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
    * 自定义错误页面名称。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 自定义错误页面类型。
    */
    @SerializedName("ContentType")
    @Expose
    private String ContentType;

    /**
    * 自定义错误页面描述。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 自定义错误页面内容。
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * 自定义错误页面引用。
    */
    @SerializedName("References")
    @Expose
    private ErrorPageReference [] References;

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
     * Get 自定义错误页面名称。 
     * @return Name 自定义错误页面名称。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 自定义错误页面名称。
     * @param Name 自定义错误页面名称。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 自定义错误页面类型。 
     * @return ContentType 自定义错误页面类型。
     */
    public String getContentType() {
        return this.ContentType;
    }

    /**
     * Set 自定义错误页面类型。
     * @param ContentType 自定义错误页面类型。
     */
    public void setContentType(String ContentType) {
        this.ContentType = ContentType;
    }

    /**
     * Get 自定义错误页面描述。 
     * @return Description 自定义错误页面描述。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 自定义错误页面描述。
     * @param Description 自定义错误页面描述。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 自定义错误页面内容。 
     * @return Content 自定义错误页面内容。
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set 自定义错误页面内容。
     * @param Content 自定义错误页面内容。
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get 自定义错误页面引用。 
     * @return References 自定义错误页面引用。
     */
    public ErrorPageReference [] getReferences() {
        return this.References;
    }

    /**
     * Set 自定义错误页面引用。
     * @param References 自定义错误页面引用。
     */
    public void setReferences(ErrorPageReference [] References) {
        this.References = References;
    }

    public CustomErrorPage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CustomErrorPage(CustomErrorPage source) {
        if (source.PageId != null) {
            this.PageId = new String(source.PageId);
        }
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
        if (source.References != null) {
            this.References = new ErrorPageReference[source.References.length];
            for (int i = 0; i < source.References.length; i++) {
                this.References[i] = new ErrorPageReference(source.References[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PageId", this.PageId);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ContentType", this.ContentType);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamArrayObj(map, prefix + "References.", this.References);

    }
}

