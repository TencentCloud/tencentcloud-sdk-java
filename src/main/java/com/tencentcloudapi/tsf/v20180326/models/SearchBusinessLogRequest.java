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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SearchBusinessLogRequest extends AbstractModel {

    /**
    * 日志配置项ID
可通过调用[DescribeBusinessLogConfigs](https://cloud.tencent.com/document/product/649/75777)查询已创建的日志配置项列表或登录[控制台](https://console.cloud.tencent.com/tsf/observable/log?rid=1)进行查看
    */
    @SerializedName("ConfigId")
    @Expose
    private String ConfigId;

    /**
    * 机器实例ID，不传表示全部实例
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * 开始时间，格式yyyy-MM-dd HH:mm:ss
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束时间，格式yyyy-MM-dd HH:mm:ss
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 请求偏移量，取值范围大于等于0，默认值为0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 单页请求配置数量，取值范围[1, 200]，默认值为50
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 排序规则，默认值"time"
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * 排序方式，取值"asc"或"desc"，默认值"desc"
    */
    @SerializedName("OrderType")
    @Expose
    private String OrderType;

    /**
    * 检索关键词
    */
    @SerializedName("SearchWords")
    @Expose
    private String [] SearchWords;

    /**
    * 部署组ID列表，不传表示全部部署组
可通过调用[DescribeContainerGroups](https://cloud.tencent.com/document/product/649/36068)或[DescribeGroups](https://cloud.tencent.com/document/product/649/36065)查询已创建的部署组列表或登录[控制台](https://console.cloud.tencent.com/tsf/app-detail?rid=1&id=application-yo7kp9dv&tab=publish&subTab=group)进行查看
    */
    @SerializedName("GroupIds")
    @Expose
    private String [] GroupIds;

    /**
    * 检索类型，取值 LUCENE：Lucene检索，REGEXP：正则检索，NORMAL：普通检索
    */
    @SerializedName("SearchWordType")
    @Expose
    private String SearchWordType;

    /**
    * 批量请求类型，取值 PAGE：分页查询，SCROLL：滚动查询，SEARCHAFTER：游标查询，默认值PAGE
    */
    @SerializedName("BatchType")
    @Expose
    private String BatchType;

    /**
    * 游标ID
    */
    @SerializedName("ScrollId")
    @Expose
    private String ScrollId;

    /**
    * 查询es使用searchAfter时，游标
    */
    @SerializedName("SearchAfter")
    @Expose
    private String [] SearchAfter;

    /**
     * Get 日志配置项ID
可通过调用[DescribeBusinessLogConfigs](https://cloud.tencent.com/document/product/649/75777)查询已创建的日志配置项列表或登录[控制台](https://console.cloud.tencent.com/tsf/observable/log?rid=1)进行查看 
     * @return ConfigId 日志配置项ID
可通过调用[DescribeBusinessLogConfigs](https://cloud.tencent.com/document/product/649/75777)查询已创建的日志配置项列表或登录[控制台](https://console.cloud.tencent.com/tsf/observable/log?rid=1)进行查看
     */
    public String getConfigId() {
        return this.ConfigId;
    }

    /**
     * Set 日志配置项ID
可通过调用[DescribeBusinessLogConfigs](https://cloud.tencent.com/document/product/649/75777)查询已创建的日志配置项列表或登录[控制台](https://console.cloud.tencent.com/tsf/observable/log?rid=1)进行查看
     * @param ConfigId 日志配置项ID
可通过调用[DescribeBusinessLogConfigs](https://cloud.tencent.com/document/product/649/75777)查询已创建的日志配置项列表或登录[控制台](https://console.cloud.tencent.com/tsf/observable/log?rid=1)进行查看
     */
    public void setConfigId(String ConfigId) {
        this.ConfigId = ConfigId;
    }

    /**
     * Get 机器实例ID，不传表示全部实例 
     * @return InstanceIds 机器实例ID，不传表示全部实例
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set 机器实例ID，不传表示全部实例
     * @param InstanceIds 机器实例ID，不传表示全部实例
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get 开始时间，格式yyyy-MM-dd HH:mm:ss 
     * @return StartTime 开始时间，格式yyyy-MM-dd HH:mm:ss
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间，格式yyyy-MM-dd HH:mm:ss
     * @param StartTime 开始时间，格式yyyy-MM-dd HH:mm:ss
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间，格式yyyy-MM-dd HH:mm:ss 
     * @return EndTime 结束时间，格式yyyy-MM-dd HH:mm:ss
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间，格式yyyy-MM-dd HH:mm:ss
     * @param EndTime 结束时间，格式yyyy-MM-dd HH:mm:ss
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 请求偏移量，取值范围大于等于0，默认值为0 
     * @return Offset 请求偏移量，取值范围大于等于0，默认值为0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 请求偏移量，取值范围大于等于0，默认值为0
     * @param Offset 请求偏移量，取值范围大于等于0，默认值为0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 单页请求配置数量，取值范围[1, 200]，默认值为50 
     * @return Limit 单页请求配置数量，取值范围[1, 200]，默认值为50
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 单页请求配置数量，取值范围[1, 200]，默认值为50
     * @param Limit 单页请求配置数量，取值范围[1, 200]，默认值为50
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 排序规则，默认值"time" 
     * @return OrderBy 排序规则，默认值"time"
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set 排序规则，默认值"time"
     * @param OrderBy 排序规则，默认值"time"
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get 排序方式，取值"asc"或"desc"，默认值"desc" 
     * @return OrderType 排序方式，取值"asc"或"desc"，默认值"desc"
     */
    public String getOrderType() {
        return this.OrderType;
    }

    /**
     * Set 排序方式，取值"asc"或"desc"，默认值"desc"
     * @param OrderType 排序方式，取值"asc"或"desc"，默认值"desc"
     */
    public void setOrderType(String OrderType) {
        this.OrderType = OrderType;
    }

    /**
     * Get 检索关键词 
     * @return SearchWords 检索关键词
     */
    public String [] getSearchWords() {
        return this.SearchWords;
    }

    /**
     * Set 检索关键词
     * @param SearchWords 检索关键词
     */
    public void setSearchWords(String [] SearchWords) {
        this.SearchWords = SearchWords;
    }

    /**
     * Get 部署组ID列表，不传表示全部部署组
可通过调用[DescribeContainerGroups](https://cloud.tencent.com/document/product/649/36068)或[DescribeGroups](https://cloud.tencent.com/document/product/649/36065)查询已创建的部署组列表或登录[控制台](https://console.cloud.tencent.com/tsf/app-detail?rid=1&id=application-yo7kp9dv&tab=publish&subTab=group)进行查看 
     * @return GroupIds 部署组ID列表，不传表示全部部署组
可通过调用[DescribeContainerGroups](https://cloud.tencent.com/document/product/649/36068)或[DescribeGroups](https://cloud.tencent.com/document/product/649/36065)查询已创建的部署组列表或登录[控制台](https://console.cloud.tencent.com/tsf/app-detail?rid=1&id=application-yo7kp9dv&tab=publish&subTab=group)进行查看
     */
    public String [] getGroupIds() {
        return this.GroupIds;
    }

    /**
     * Set 部署组ID列表，不传表示全部部署组
可通过调用[DescribeContainerGroups](https://cloud.tencent.com/document/product/649/36068)或[DescribeGroups](https://cloud.tencent.com/document/product/649/36065)查询已创建的部署组列表或登录[控制台](https://console.cloud.tencent.com/tsf/app-detail?rid=1&id=application-yo7kp9dv&tab=publish&subTab=group)进行查看
     * @param GroupIds 部署组ID列表，不传表示全部部署组
可通过调用[DescribeContainerGroups](https://cloud.tencent.com/document/product/649/36068)或[DescribeGroups](https://cloud.tencent.com/document/product/649/36065)查询已创建的部署组列表或登录[控制台](https://console.cloud.tencent.com/tsf/app-detail?rid=1&id=application-yo7kp9dv&tab=publish&subTab=group)进行查看
     */
    public void setGroupIds(String [] GroupIds) {
        this.GroupIds = GroupIds;
    }

    /**
     * Get 检索类型，取值 LUCENE：Lucene检索，REGEXP：正则检索，NORMAL：普通检索 
     * @return SearchWordType 检索类型，取值 LUCENE：Lucene检索，REGEXP：正则检索，NORMAL：普通检索
     */
    public String getSearchWordType() {
        return this.SearchWordType;
    }

    /**
     * Set 检索类型，取值 LUCENE：Lucene检索，REGEXP：正则检索，NORMAL：普通检索
     * @param SearchWordType 检索类型，取值 LUCENE：Lucene检索，REGEXP：正则检索，NORMAL：普通检索
     */
    public void setSearchWordType(String SearchWordType) {
        this.SearchWordType = SearchWordType;
    }

    /**
     * Get 批量请求类型，取值 PAGE：分页查询，SCROLL：滚动查询，SEARCHAFTER：游标查询，默认值PAGE 
     * @return BatchType 批量请求类型，取值 PAGE：分页查询，SCROLL：滚动查询，SEARCHAFTER：游标查询，默认值PAGE
     */
    public String getBatchType() {
        return this.BatchType;
    }

    /**
     * Set 批量请求类型，取值 PAGE：分页查询，SCROLL：滚动查询，SEARCHAFTER：游标查询，默认值PAGE
     * @param BatchType 批量请求类型，取值 PAGE：分页查询，SCROLL：滚动查询，SEARCHAFTER：游标查询，默认值PAGE
     */
    public void setBatchType(String BatchType) {
        this.BatchType = BatchType;
    }

    /**
     * Get 游标ID 
     * @return ScrollId 游标ID
     */
    public String getScrollId() {
        return this.ScrollId;
    }

    /**
     * Set 游标ID
     * @param ScrollId 游标ID
     */
    public void setScrollId(String ScrollId) {
        this.ScrollId = ScrollId;
    }

    /**
     * Get 查询es使用searchAfter时，游标 
     * @return SearchAfter 查询es使用searchAfter时，游标
     */
    public String [] getSearchAfter() {
        return this.SearchAfter;
    }

    /**
     * Set 查询es使用searchAfter时，游标
     * @param SearchAfter 查询es使用searchAfter时，游标
     */
    public void setSearchAfter(String [] SearchAfter) {
        this.SearchAfter = SearchAfter;
    }

    public SearchBusinessLogRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SearchBusinessLogRequest(SearchBusinessLogRequest source) {
        if (source.ConfigId != null) {
            this.ConfigId = new String(source.ConfigId);
        }
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.OrderBy != null) {
            this.OrderBy = new String(source.OrderBy);
        }
        if (source.OrderType != null) {
            this.OrderType = new String(source.OrderType);
        }
        if (source.SearchWords != null) {
            this.SearchWords = new String[source.SearchWords.length];
            for (int i = 0; i < source.SearchWords.length; i++) {
                this.SearchWords[i] = new String(source.SearchWords[i]);
            }
        }
        if (source.GroupIds != null) {
            this.GroupIds = new String[source.GroupIds.length];
            for (int i = 0; i < source.GroupIds.length; i++) {
                this.GroupIds[i] = new String(source.GroupIds[i]);
            }
        }
        if (source.SearchWordType != null) {
            this.SearchWordType = new String(source.SearchWordType);
        }
        if (source.BatchType != null) {
            this.BatchType = new String(source.BatchType);
        }
        if (source.ScrollId != null) {
            this.ScrollId = new String(source.ScrollId);
        }
        if (source.SearchAfter != null) {
            this.SearchAfter = new String[source.SearchAfter.length];
            for (int i = 0; i < source.SearchAfter.length; i++) {
                this.SearchAfter[i] = new String(source.SearchAfter[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ConfigId", this.ConfigId);
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "OrderType", this.OrderType);
        this.setParamArraySimple(map, prefix + "SearchWords.", this.SearchWords);
        this.setParamArraySimple(map, prefix + "GroupIds.", this.GroupIds);
        this.setParamSimple(map, prefix + "SearchWordType", this.SearchWordType);
        this.setParamSimple(map, prefix + "BatchType", this.BatchType);
        this.setParamSimple(map, prefix + "ScrollId", this.ScrollId);
        this.setParamArraySimple(map, prefix + "SearchAfter.", this.SearchAfter);

    }
}

