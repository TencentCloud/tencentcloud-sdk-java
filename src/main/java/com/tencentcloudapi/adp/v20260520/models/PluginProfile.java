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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PluginProfile extends AbstractModel {

    /**
    * 插件作者
    */
    @SerializedName("Author")
    @Expose
    private String Author;

    /**
    * 插件描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 插件图标url
    */
    @SerializedName("IconUrl")
    @Expose
    private String IconUrl;

    /**
    * 插件名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>插件产品分类</p><p>枚举值：</p><ul><li>0：普通插件</li><li>1：连接器类插件</li></ul>
    */
    @SerializedName("PluginClass")
    @Expose
    private Long PluginClass;

    /**
    * <p>插件类型</p><p>枚举值：</p><ul><li>0：API接口</li><li>1：代码</li><li>2：MCP</li><li>3：应用</li></ul>
    */
    @SerializedName("PluginKind")
    @Expose
    private Long PluginKind;

    /**
    * <p>插件来源</p><p>枚举值：</p><ul><li>0：自定义插件</li><li>1：官方插件</li><li>2：第三方插件</li></ul>
    */
    @SerializedName("PluginSource")
    @Expose
    private Long PluginSource;

    /**
     * Get 插件作者 
     * @return Author 插件作者
     */
    public String getAuthor() {
        return this.Author;
    }

    /**
     * Set 插件作者
     * @param Author 插件作者
     */
    public void setAuthor(String Author) {
        this.Author = Author;
    }

    /**
     * Get 插件描述 
     * @return Description 插件描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 插件描述
     * @param Description 插件描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 插件图标url 
     * @return IconUrl 插件图标url
     */
    public String getIconUrl() {
        return this.IconUrl;
    }

    /**
     * Set 插件图标url
     * @param IconUrl 插件图标url
     */
    public void setIconUrl(String IconUrl) {
        this.IconUrl = IconUrl;
    }

    /**
     * Get 插件名称 
     * @return Name 插件名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 插件名称
     * @param Name 插件名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>插件产品分类</p><p>枚举值：</p><ul><li>0：普通插件</li><li>1：连接器类插件</li></ul> 
     * @return PluginClass <p>插件产品分类</p><p>枚举值：</p><ul><li>0：普通插件</li><li>1：连接器类插件</li></ul>
     */
    public Long getPluginClass() {
        return this.PluginClass;
    }

    /**
     * Set <p>插件产品分类</p><p>枚举值：</p><ul><li>0：普通插件</li><li>1：连接器类插件</li></ul>
     * @param PluginClass <p>插件产品分类</p><p>枚举值：</p><ul><li>0：普通插件</li><li>1：连接器类插件</li></ul>
     */
    public void setPluginClass(Long PluginClass) {
        this.PluginClass = PluginClass;
    }

    /**
     * Get <p>插件类型</p><p>枚举值：</p><ul><li>0：API接口</li><li>1：代码</li><li>2：MCP</li><li>3：应用</li></ul> 
     * @return PluginKind <p>插件类型</p><p>枚举值：</p><ul><li>0：API接口</li><li>1：代码</li><li>2：MCP</li><li>3：应用</li></ul>
     */
    public Long getPluginKind() {
        return this.PluginKind;
    }

    /**
     * Set <p>插件类型</p><p>枚举值：</p><ul><li>0：API接口</li><li>1：代码</li><li>2：MCP</li><li>3：应用</li></ul>
     * @param PluginKind <p>插件类型</p><p>枚举值：</p><ul><li>0：API接口</li><li>1：代码</li><li>2：MCP</li><li>3：应用</li></ul>
     */
    public void setPluginKind(Long PluginKind) {
        this.PluginKind = PluginKind;
    }

    /**
     * Get <p>插件来源</p><p>枚举值：</p><ul><li>0：自定义插件</li><li>1：官方插件</li><li>2：第三方插件</li></ul> 
     * @return PluginSource <p>插件来源</p><p>枚举值：</p><ul><li>0：自定义插件</li><li>1：官方插件</li><li>2：第三方插件</li></ul>
     */
    public Long getPluginSource() {
        return this.PluginSource;
    }

    /**
     * Set <p>插件来源</p><p>枚举值：</p><ul><li>0：自定义插件</li><li>1：官方插件</li><li>2：第三方插件</li></ul>
     * @param PluginSource <p>插件来源</p><p>枚举值：</p><ul><li>0：自定义插件</li><li>1：官方插件</li><li>2：第三方插件</li></ul>
     */
    public void setPluginSource(Long PluginSource) {
        this.PluginSource = PluginSource;
    }

    public PluginProfile() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PluginProfile(PluginProfile source) {
        if (source.Author != null) {
            this.Author = new String(source.Author);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.IconUrl != null) {
            this.IconUrl = new String(source.IconUrl);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.PluginClass != null) {
            this.PluginClass = new Long(source.PluginClass);
        }
        if (source.PluginKind != null) {
            this.PluginKind = new Long(source.PluginKind);
        }
        if (source.PluginSource != null) {
            this.PluginSource = new Long(source.PluginSource);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Author", this.Author);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "IconUrl", this.IconUrl);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "PluginClass", this.PluginClass);
        this.setParamSimple(map, prefix + "PluginKind", this.PluginKind);
        this.setParamSimple(map, prefix + "PluginSource", this.PluginSource);

    }
}

