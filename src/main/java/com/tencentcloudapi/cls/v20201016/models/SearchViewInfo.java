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

public class SearchViewInfo extends AbstractModel {

    /**
    * <p>视图ID</p>
    */
    @SerializedName("ViewId")
    @Expose
    private String ViewId;

    /**
    * <p>视图名称</p>
    */
    @SerializedName("ViewName")
    @Expose
    private String ViewName;

    /**
    * <p>视图类型</p><p>枚举值：</p><ul><li>log： 日志主题</li><li>metric： 指标主题</li></ul>
    */
    @SerializedName("ViewType")
    @Expose
    private String ViewType;

    /**
    * <p>日志集id</p><p>视图所属日志集</p>
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
    * <p>视图日志主题信息</p>
    */
    @SerializedName("Topics")
    @Expose
    private ViewSearchTopic [] Topics;

    /**
    * <p>视图描述</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>创建时间</p><p>单位：秒级别时间戳</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * <p>更新时间</p><p>单位：秒级别时间戳</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

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
     * Get <p>视图名称</p> 
     * @return ViewName <p>视图名称</p>
     */
    public String getViewName() {
        return this.ViewName;
    }

    /**
     * Set <p>视图名称</p>
     * @param ViewName <p>视图名称</p>
     */
    public void setViewName(String ViewName) {
        this.ViewName = ViewName;
    }

    /**
     * Get <p>视图类型</p><p>枚举值：</p><ul><li>log： 日志主题</li><li>metric： 指标主题</li></ul> 
     * @return ViewType <p>视图类型</p><p>枚举值：</p><ul><li>log： 日志主题</li><li>metric： 指标主题</li></ul>
     */
    public String getViewType() {
        return this.ViewType;
    }

    /**
     * Set <p>视图类型</p><p>枚举值：</p><ul><li>log： 日志主题</li><li>metric： 指标主题</li></ul>
     * @param ViewType <p>视图类型</p><p>枚举值：</p><ul><li>log： 日志主题</li><li>metric： 指标主题</li></ul>
     */
    public void setViewType(String ViewType) {
        this.ViewType = ViewType;
    }

    /**
     * Get <p>日志集id</p><p>视图所属日志集</p> 
     * @return LogsetId <p>日志集id</p><p>视图所属日志集</p>
     */
    public String getLogsetId() {
        return this.LogsetId;
    }

    /**
     * Set <p>日志集id</p><p>视图所属日志集</p>
     * @param LogsetId <p>日志集id</p><p>视图所属日志集</p>
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
     * Get <p>视图日志主题信息</p> 
     * @return Topics <p>视图日志主题信息</p>
     */
    public ViewSearchTopic [] getTopics() {
        return this.Topics;
    }

    /**
     * Set <p>视图日志主题信息</p>
     * @param Topics <p>视图日志主题信息</p>
     */
    public void setTopics(ViewSearchTopic [] Topics) {
        this.Topics = Topics;
    }

    /**
     * Get <p>视图描述</p> 
     * @return Description <p>视图描述</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>视图描述</p>
     * @param Description <p>视图描述</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>创建时间</p><p>单位：秒级别时间戳</p> 
     * @return CreateTime <p>创建时间</p><p>单位：秒级别时间戳</p>
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间</p><p>单位：秒级别时间戳</p>
     * @param CreateTime <p>创建时间</p><p>单位：秒级别时间戳</p>
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>更新时间</p><p>单位：秒级别时间戳</p> 
     * @return UpdateTime <p>更新时间</p><p>单位：秒级别时间戳</p>
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>更新时间</p><p>单位：秒级别时间戳</p>
     * @param UpdateTime <p>更新时间</p><p>单位：秒级别时间戳</p>
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public SearchViewInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SearchViewInfo(SearchViewInfo source) {
        if (source.ViewId != null) {
            this.ViewId = new String(source.ViewId);
        }
        if (source.ViewName != null) {
            this.ViewName = new String(source.ViewName);
        }
        if (source.ViewType != null) {
            this.ViewType = new String(source.ViewType);
        }
        if (source.LogsetId != null) {
            this.LogsetId = new String(source.LogsetId);
        }
        if (source.LogsetRegion != null) {
            this.LogsetRegion = new String(source.LogsetRegion);
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
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ViewId", this.ViewId);
        this.setParamSimple(map, prefix + "ViewName", this.ViewName);
        this.setParamSimple(map, prefix + "ViewType", this.ViewType);
        this.setParamSimple(map, prefix + "LogsetId", this.LogsetId);
        this.setParamSimple(map, prefix + "LogsetRegion", this.LogsetRegion);
        this.setParamArrayObj(map, prefix + "Topics.", this.Topics);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

