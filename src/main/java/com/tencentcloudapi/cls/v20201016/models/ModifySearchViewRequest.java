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

public class ModifySearchViewRequest extends AbstractModel {

    /**
    * <p>视图ID</p>
    */
    @SerializedName("ViewId")
    @Expose
    private String ViewId;

    /**
    * <p>视图名称</p><p>参数格式：<code>^[a-z0-9][a-z0-9_-]{1,61}[a-z0-9]$</code></p>
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
    * <p>查询视图中包含的主题，最大可包含10个主题</p>
    */
    @SerializedName("Topics")
    @Expose
    private ViewSearchTopic [] Topics;

    /**
    * <p>描述信息</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get <p>视图ID</p> 
     * @return ViewId <p>视图ID</p>
     */
    public String getViewId() {
        return this.ViewId;
    }

    /**
     * Set <p>视图ID</p>
     * @param ViewId <p>视图ID</p>
     */
    public void setViewId(String ViewId) {
        this.ViewId = ViewId;
    }

    /**
     * Get <p>视图名称</p><p>参数格式：<code>^[a-z0-9][a-z0-9_-]{1,61}[a-z0-9]$</code></p> 
     * @return ViewName <p>视图名称</p><p>参数格式：<code>^[a-z0-9][a-z0-9_-]{1,61}[a-z0-9]$</code></p>
     */
    public String getViewName() {
        return this.ViewName;
    }

    /**
     * Set <p>视图名称</p><p>参数格式：<code>^[a-z0-9][a-z0-9_-]{1,61}[a-z0-9]$</code></p>
     * @param ViewName <p>视图名称</p><p>参数格式：<code>^[a-z0-9][a-z0-9_-]{1,61}[a-z0-9]$</code></p>
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
     * Get <p>查询视图中包含的主题，最大可包含10个主题</p> 
     * @return Topics <p>查询视图中包含的主题，最大可包含10个主题</p>
     */
    public ViewSearchTopic [] getTopics() {
        return this.Topics;
    }

    /**
     * Set <p>查询视图中包含的主题，最大可包含10个主题</p>
     * @param Topics <p>查询视图中包含的主题，最大可包含10个主题</p>
     */
    public void setTopics(ViewSearchTopic [] Topics) {
        this.Topics = Topics;
    }

    /**
     * Get <p>描述信息</p> 
     * @return Description <p>描述信息</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>描述信息</p>
     * @param Description <p>描述信息</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public ModifySearchViewRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifySearchViewRequest(ModifySearchViewRequest source) {
        if (source.ViewId != null) {
            this.ViewId = new String(source.ViewId);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ViewId", this.ViewId);
        this.setParamSimple(map, prefix + "ViewName", this.ViewName);
        this.setParamSimple(map, prefix + "ViewType", this.ViewType);
        this.setParamArrayObj(map, prefix + "Topics.", this.Topics);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

