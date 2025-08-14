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

public class SearchStdoutLogRequest extends AbstractModel {

    /**
    * 机器实例ID， 和 部署组 ID 二者必选其一，不能同时为空
可通过调用[DescribeClusterInstances](https://cloud.tencent.com/document/product/649/36048)查询已导入的实例列表或登录[控制台](https://console.cloud.tencent.com/tsf/resource?rid=1&tab=instance)进行查询。实例ID例如：ins-6decplwk



    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 单页请求配置数量，取值范围[1, 500]，默认值为100
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 检索关键词
    */
    @SerializedName("SearchWords")
    @Expose
    private String [] SearchWords;

    /**
    * 查询起始时间，格式yyyy-MM-dd HH:mm:ss
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 部署组ID，和 InstanceId 二者必选其一，不能同时为空
可通过调用[DescribeContainerGroups](https://cloud.tencent.com/document/product/649/36068)或[DescribeGroups](https://cloud.tencent.com/document/product/649/36065)查询已创建的部署组列表或登录[控制台](https://console.cloud.tencent.com/tsf/app-detail?rid=1&id=application-yo7kp9dv&tab=publish&subTab=group)进行查看
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 查询结束时间，格式yyyy-MM-dd HH:mm:ss
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 请求偏移量，取值范围大于等于0，默认值为
0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 排序规则，time：按时间排序，score：按检索值排序，默认值"time"
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * 排序方式，取值 asc：升序 或 desc：降序，默认值desc
    */
    @SerializedName("OrderType")
    @Expose
    private String OrderType;

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
     * Get 机器实例ID， 和 部署组 ID 二者必选其一，不能同时为空
可通过调用[DescribeClusterInstances](https://cloud.tencent.com/document/product/649/36048)查询已导入的实例列表或登录[控制台](https://console.cloud.tencent.com/tsf/resource?rid=1&tab=instance)进行查询。实例ID例如：ins-6decplwk


 
     * @return InstanceId 机器实例ID， 和 部署组 ID 二者必选其一，不能同时为空
可通过调用[DescribeClusterInstances](https://cloud.tencent.com/document/product/649/36048)查询已导入的实例列表或登录[控制台](https://console.cloud.tencent.com/tsf/resource?rid=1&tab=instance)进行查询。实例ID例如：ins-6decplwk



     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 机器实例ID， 和 部署组 ID 二者必选其一，不能同时为空
可通过调用[DescribeClusterInstances](https://cloud.tencent.com/document/product/649/36048)查询已导入的实例列表或登录[控制台](https://console.cloud.tencent.com/tsf/resource?rid=1&tab=instance)进行查询。实例ID例如：ins-6decplwk



     * @param InstanceId 机器实例ID， 和 部署组 ID 二者必选其一，不能同时为空
可通过调用[DescribeClusterInstances](https://cloud.tencent.com/document/product/649/36048)查询已导入的实例列表或登录[控制台](https://console.cloud.tencent.com/tsf/resource?rid=1&tab=instance)进行查询。实例ID例如：ins-6decplwk



     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 单页请求配置数量，取值范围[1, 500]，默认值为100 
     * @return Limit 单页请求配置数量，取值范围[1, 500]，默认值为100
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 单页请求配置数量，取值范围[1, 500]，默认值为100
     * @param Limit 单页请求配置数量，取值范围[1, 500]，默认值为100
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
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
     * Get 查询起始时间，格式yyyy-MM-dd HH:mm:ss 
     * @return StartTime 查询起始时间，格式yyyy-MM-dd HH:mm:ss
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 查询起始时间，格式yyyy-MM-dd HH:mm:ss
     * @param StartTime 查询起始时间，格式yyyy-MM-dd HH:mm:ss
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 部署组ID，和 InstanceId 二者必选其一，不能同时为空
可通过调用[DescribeContainerGroups](https://cloud.tencent.com/document/product/649/36068)或[DescribeGroups](https://cloud.tencent.com/document/product/649/36065)查询已创建的部署组列表或登录[控制台](https://console.cloud.tencent.com/tsf/app-detail?rid=1&id=application-yo7kp9dv&tab=publish&subTab=group)进行查看 
     * @return GroupId 部署组ID，和 InstanceId 二者必选其一，不能同时为空
可通过调用[DescribeContainerGroups](https://cloud.tencent.com/document/product/649/36068)或[DescribeGroups](https://cloud.tencent.com/document/product/649/36065)查询已创建的部署组列表或登录[控制台](https://console.cloud.tencent.com/tsf/app-detail?rid=1&id=application-yo7kp9dv&tab=publish&subTab=group)进行查看
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 部署组ID，和 InstanceId 二者必选其一，不能同时为空
可通过调用[DescribeContainerGroups](https://cloud.tencent.com/document/product/649/36068)或[DescribeGroups](https://cloud.tencent.com/document/product/649/36065)查询已创建的部署组列表或登录[控制台](https://console.cloud.tencent.com/tsf/app-detail?rid=1&id=application-yo7kp9dv&tab=publish&subTab=group)进行查看
     * @param GroupId 部署组ID，和 InstanceId 二者必选其一，不能同时为空
可通过调用[DescribeContainerGroups](https://cloud.tencent.com/document/product/649/36068)或[DescribeGroups](https://cloud.tencent.com/document/product/649/36065)查询已创建的部署组列表或登录[控制台](https://console.cloud.tencent.com/tsf/app-detail?rid=1&id=application-yo7kp9dv&tab=publish&subTab=group)进行查看
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 查询结束时间，格式yyyy-MM-dd HH:mm:ss 
     * @return EndTime 查询结束时间，格式yyyy-MM-dd HH:mm:ss
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 查询结束时间，格式yyyy-MM-dd HH:mm:ss
     * @param EndTime 查询结束时间，格式yyyy-MM-dd HH:mm:ss
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 请求偏移量，取值范围大于等于0，默认值为
0 
     * @return Offset 请求偏移量，取值范围大于等于0，默认值为
0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 请求偏移量，取值范围大于等于0，默认值为
0
     * @param Offset 请求偏移量，取值范围大于等于0，默认值为
0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 排序规则，time：按时间排序，score：按检索值排序，默认值"time" 
     * @return OrderBy 排序规则，time：按时间排序，score：按检索值排序，默认值"time"
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set 排序规则，time：按时间排序，score：按检索值排序，默认值"time"
     * @param OrderBy 排序规则，time：按时间排序，score：按检索值排序，默认值"time"
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get 排序方式，取值 asc：升序 或 desc：降序，默认值desc 
     * @return OrderType 排序方式，取值 asc：升序 或 desc：降序，默认值desc
     */
    public String getOrderType() {
        return this.OrderType;
    }

    /**
     * Set 排序方式，取值 asc：升序 或 desc：降序，默认值desc
     * @param OrderType 排序方式，取值 asc：升序 或 desc：降序，默认值desc
     */
    public void setOrderType(String OrderType) {
        this.OrderType = OrderType;
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

    public SearchStdoutLogRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SearchStdoutLogRequest(SearchStdoutLogRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.SearchWords != null) {
            this.SearchWords = new String[source.SearchWords.length];
            for (int i = 0; i < source.SearchWords.length; i++) {
                this.SearchWords[i] = new String(source.SearchWords[i]);
            }
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.OrderBy != null) {
            this.OrderBy = new String(source.OrderBy);
        }
        if (source.OrderType != null) {
            this.OrderType = new String(source.OrderType);
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
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArraySimple(map, prefix + "SearchWords.", this.SearchWords);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "OrderType", this.OrderType);
        this.setParamSimple(map, prefix + "SearchWordType", this.SearchWordType);
        this.setParamSimple(map, prefix + "BatchType", this.BatchType);
        this.setParamSimple(map, prefix + "ScrollId", this.ScrollId);
        this.setParamArraySimple(map, prefix + "SearchAfter.", this.SearchAfter);

    }
}

