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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateSearchViewRequest extends AbstractModel {

    /**
    * <p>日志集id</p><p>标记视图所属该日志集，用于查询日志集下的查询视图配置</p>
    */
    @SerializedName("LogsetId")
    @Expose
    private String LogsetId;

    /**
    * <p>日志集所属地域</p><p>参数格式：ap-guangzhou</p>
    */
    @SerializedName("LogsetRegion")
    @Expose
    private String LogsetRegion;

    /**
    * <p>视图名称</p><p>入参限制：最大支持255字符，不能包含&quot;|&quot;字符。</p>
    */
    @SerializedName("ViewName")
    @Expose
    private String ViewName;

    /**
    * <p>视图类型</p><p>枚举值：</p><ul><li>log： 日志主题</li><li>metric： 指标主题</li></ul><p>Topics字段中配置的主题信息应该与ViewType类型匹配</p>
    */
    @SerializedName("ViewType")
    @Expose
    private String ViewType;

    /**
    * <p>视图主题配置信息</p><p>Topics字段中配置的主题信息应该与ViewType类型匹配</p>
    */
    @SerializedName("Topics")
    @Expose
    private ViewSearchTopic [] Topics;

    /**
    * <p>配置描述信息</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>自定义视图id前缀</p><p>参数格式：<code>^[a-z0-9][a-z0-9_-]{1,61}[a-z0-9]$</code></p><p>配置成功之后ViewId格式: ${ViewIdPrefix}-view</p>
    */
    @SerializedName("ViewIdPrefix")
    @Expose
    private String ViewIdPrefix;

    /**
     * Get <p>日志集id</p><p>标记视图所属该日志集，用于查询日志集下的查询视图配置</p> 
     * @return LogsetId <p>日志集id</p><p>标记视图所属该日志集，用于查询日志集下的查询视图配置</p>
     */
    public String getLogsetId() {
        return this.LogsetId;
    }

    /**
     * Set <p>日志集id</p><p>标记视图所属该日志集，用于查询日志集下的查询视图配置</p>
     * @param LogsetId <p>日志集id</p><p>标记视图所属该日志集，用于查询日志集下的查询视图配置</p>
     */
    public void setLogsetId(String LogsetId) {
        this.LogsetId = LogsetId;
    }

    /**
     * Get <p>日志集所属地域</p><p>参数格式：ap-guangzhou</p> 
     * @return LogsetRegion <p>日志集所属地域</p><p>参数格式：ap-guangzhou</p>
     */
    public String getLogsetRegion() {
        return this.LogsetRegion;
    }

    /**
     * Set <p>日志集所属地域</p><p>参数格式：ap-guangzhou</p>
     * @param LogsetRegion <p>日志集所属地域</p><p>参数格式：ap-guangzhou</p>
     */
    public void setLogsetRegion(String LogsetRegion) {
        this.LogsetRegion = LogsetRegion;
    }

    /**
     * Get <p>视图名称</p><p>入参限制：最大支持255字符，不能包含&quot;|&quot;字符。</p> 
     * @return ViewName <p>视图名称</p><p>入参限制：最大支持255字符，不能包含&quot;|&quot;字符。</p>
     */
    public String getViewName() {
        return this.ViewName;
    }

    /**
     * Set <p>视图名称</p><p>入参限制：最大支持255字符，不能包含&quot;|&quot;字符。</p>
     * @param ViewName <p>视图名称</p><p>入参限制：最大支持255字符，不能包含&quot;|&quot;字符。</p>
     */
    public void setViewName(String ViewName) {
        this.ViewName = ViewName;
    }

    /**
     * Get <p>视图类型</p><p>枚举值：</p><ul><li>log： 日志主题</li><li>metric： 指标主题</li></ul><p>Topics字段中配置的主题信息应该与ViewType类型匹配</p> 
     * @return ViewType <p>视图类型</p><p>枚举值：</p><ul><li>log： 日志主题</li><li>metric： 指标主题</li></ul><p>Topics字段中配置的主题信息应该与ViewType类型匹配</p>
     */
    public String getViewType() {
        return this.ViewType;
    }

    /**
     * Set <p>视图类型</p><p>枚举值：</p><ul><li>log： 日志主题</li><li>metric： 指标主题</li></ul><p>Topics字段中配置的主题信息应该与ViewType类型匹配</p>
     * @param ViewType <p>视图类型</p><p>枚举值：</p><ul><li>log： 日志主题</li><li>metric： 指标主题</li></ul><p>Topics字段中配置的主题信息应该与ViewType类型匹配</p>
     */
    public void setViewType(String ViewType) {
        this.ViewType = ViewType;
    }

    /**
     * Get <p>视图主题配置信息</p><p>Topics字段中配置的主题信息应该与ViewType类型匹配</p> 
     * @return Topics <p>视图主题配置信息</p><p>Topics字段中配置的主题信息应该与ViewType类型匹配</p>
     */
    public ViewSearchTopic [] getTopics() {
        return this.Topics;
    }

    /**
     * Set <p>视图主题配置信息</p><p>Topics字段中配置的主题信息应该与ViewType类型匹配</p>
     * @param Topics <p>视图主题配置信息</p><p>Topics字段中配置的主题信息应该与ViewType类型匹配</p>
     */
    public void setTopics(ViewSearchTopic [] Topics) {
        this.Topics = Topics;
    }

    /**
     * Get <p>配置描述信息</p> 
     * @return Description <p>配置描述信息</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>配置描述信息</p>
     * @param Description <p>配置描述信息</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>自定义视图id前缀</p><p>参数格式：<code>^[a-z0-9][a-z0-9_-]{1,61}[a-z0-9]$</code></p><p>配置成功之后ViewId格式: ${ViewIdPrefix}-view</p> 
     * @return ViewIdPrefix <p>自定义视图id前缀</p><p>参数格式：<code>^[a-z0-9][a-z0-9_-]{1,61}[a-z0-9]$</code></p><p>配置成功之后ViewId格式: ${ViewIdPrefix}-view</p>
     */
    public String getViewIdPrefix() {
        return this.ViewIdPrefix;
    }

    /**
     * Set <p>自定义视图id前缀</p><p>参数格式：<code>^[a-z0-9][a-z0-9_-]{1,61}[a-z0-9]$</code></p><p>配置成功之后ViewId格式: ${ViewIdPrefix}-view</p>
     * @param ViewIdPrefix <p>自定义视图id前缀</p><p>参数格式：<code>^[a-z0-9][a-z0-9_-]{1,61}[a-z0-9]$</code></p><p>配置成功之后ViewId格式: ${ViewIdPrefix}-view</p>
     */
    public void setViewIdPrefix(String ViewIdPrefix) {
        this.ViewIdPrefix = ViewIdPrefix;
    }

    public CreateSearchViewRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateSearchViewRequest(CreateSearchViewRequest source) {
        if (source.LogsetId != null) {
            this.LogsetId = new String(source.LogsetId);
        }
        if (source.LogsetRegion != null) {
            this.LogsetRegion = new String(source.LogsetRegion);
        }
        if (source.ViewName != null) {
            this.ViewName = new String(source.ViewName);
        }
        if (source.ViewType != null) {
            this.ViewType = new String(source.ViewType);
        }
        if (source.Topics != null) {
            this.Topics = new ViewSearchTopic[source.Topics.length];
            for (int i = 0; i < source.Topics.length; i++) {
                this.Topics[i] = new ViewSearchTopic(source.Topics[i]);
            }
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.ViewIdPrefix != null) {
            this.ViewIdPrefix = new String(source.ViewIdPrefix);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LogsetId", this.LogsetId);
        this.setParamSimple(map, prefix + "LogsetRegion", this.LogsetRegion);
        this.setParamSimple(map, prefix + "ViewName", this.ViewName);
        this.setParamSimple(map, prefix + "ViewType", this.ViewType);
        this.setParamArrayObj(map, prefix + "Topics.", this.Topics);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "ViewIdPrefix", this.ViewIdPrefix);

    }
}

