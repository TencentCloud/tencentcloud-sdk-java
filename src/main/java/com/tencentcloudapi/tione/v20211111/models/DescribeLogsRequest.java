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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLogsRequest extends AbstractModel {

    /**
    * <p>服务类型，TRAIN为任务式建模, NOTEBOOK为Notebook, INFER为在线服务, BATCH为批量预测<br>枚举值：</p><ul><li>TRAIN</li><li>NOTEBOOK</li><li>INFER</li><li>BATCH</li></ul>
    */
    @SerializedName("Service")
    @Expose
    private String Service;

    /**
    * <p>日志查询开始时间（RFC3339格式的时间字符串），默认值为当前时间的前一个小时</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>日志查询结束时间（RFC3339格式的时间字符串），默认值为当前时间</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>日志查询条数，默认值100，最大值1000</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>服务ID，和Service参数对应，不同Service的服务ID获取方式不同，具体如下：</p><ul><li>Service类型为TRAIN：<br>调用<a href="/document/product/851/75089">DescribeTrainingTask接口</a>查询训练任务详情，ServiceId为接口返回值中Response.TrainingTaskDetail.LatestInstanceId</li><li>Service类型为NOTEBOOK：<br>调用<a href="/document/product/851/95662">DescribeNotebook接口</a>查询Notebook详情，ServiceId为接口返回值中Response.NotebookDetail.PodName</li><li>Service类型为INFER：<br>调用<a href="/document/product/851/82285">DescribeModelServiceGroup接口</a>查询服务组详情，ServiceId为接口返回值中Response.ServiceGroup.Services.ServiceId</li><li>Service类型为BATCH：<br>调用<a href="/document/product/851/80180">DescribeBatchTask接口</a>查询跑批任务详情，ServiceId为接口返回值中Response.BatchTaskDetail.LatestInstanceId</li></ul>
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
    * <p>Pod的名称，即需要查询服务对应的Pod，和Service参数对应，不同Service的PodName获取方式不同，具体如下：</p><ul><li>Service类型为TRAIN：<br>调用<a href="/document/product/851/75088">DescribeTrainingTaskPods接口</a>查询训练任务pod列表，PodName为接口返回值中Response.PodNames</li><li>Service类型为NOTEBOOK：<br>调用<a href="/document/product/851/95662">DescribeNotebook接口</a>查询Notebook详情，PodName为接口返回值中Response.NotebookDetail.PodName</li><li>Service类型为INFER：<br>调用<a href="/document/product/851/82287">DescribeModelService接口</a>查询单个服务详情，PodName为接口返回值中Response.Service.ServiceInfo.PodInfos</li><li>Service类型为BATCH：<br>调用<a href="/document/product/851/80180">DescribeBatchTask接口</a>查询跑批任务详情，PodName为接口返回值中Response.BatchTaskDetail. PodList<br>注：支持结尾通配符*</li></ul>
    */
    @SerializedName("PodName")
    @Expose
    private String PodName;

    /**
    * <p>排序方向（可选值为ASC, DESC ），默认为DESC</p>
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * <p>按哪个字段排序（可选值为Timestamp），默认值为Timestamp</p>
    */
    @SerializedName("OrderField")
    @Expose
    private String OrderField;

    /**
    * <p>日志查询上下文，查询下一页的时候需要回传这个字段，该字段来自本接口的返回</p>
    */
    @SerializedName("Context")
    @Expose
    private String Context;

    /**
    * <p>过滤条件<br>注意: </p><ol><li>Filter.Name：目前只支持Key（也就是按关键字过滤日志）</li><li>Filter.Values：表示过滤日志的关键字；Values为多个的时候表示同时满足</li><li>Filter. Negative和Filter. Fuzzy没有使用</li></ol>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * <p>使用OFFSET分页查询时，指定返回的数据偏移量，默认为0</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get <p>服务类型，TRAIN为任务式建模, NOTEBOOK为Notebook, INFER为在线服务, BATCH为批量预测<br>枚举值：</p><ul><li>TRAIN</li><li>NOTEBOOK</li><li>INFER</li><li>BATCH</li></ul> 
     * @return Service <p>服务类型，TRAIN为任务式建模, NOTEBOOK为Notebook, INFER为在线服务, BATCH为批量预测<br>枚举值：</p><ul><li>TRAIN</li><li>NOTEBOOK</li><li>INFER</li><li>BATCH</li></ul>
     */
    public String getService() {
        return this.Service;
    }

    /**
     * Set <p>服务类型，TRAIN为任务式建模, NOTEBOOK为Notebook, INFER为在线服务, BATCH为批量预测<br>枚举值：</p><ul><li>TRAIN</li><li>NOTEBOOK</li><li>INFER</li><li>BATCH</li></ul>
     * @param Service <p>服务类型，TRAIN为任务式建模, NOTEBOOK为Notebook, INFER为在线服务, BATCH为批量预测<br>枚举值：</p><ul><li>TRAIN</li><li>NOTEBOOK</li><li>INFER</li><li>BATCH</li></ul>
     */
    public void setService(String Service) {
        this.Service = Service;
    }

    /**
     * Get <p>日志查询开始时间（RFC3339格式的时间字符串），默认值为当前时间的前一个小时</p> 
     * @return StartTime <p>日志查询开始时间（RFC3339格式的时间字符串），默认值为当前时间的前一个小时</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>日志查询开始时间（RFC3339格式的时间字符串），默认值为当前时间的前一个小时</p>
     * @param StartTime <p>日志查询开始时间（RFC3339格式的时间字符串），默认值为当前时间的前一个小时</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>日志查询结束时间（RFC3339格式的时间字符串），默认值为当前时间</p> 
     * @return EndTime <p>日志查询结束时间（RFC3339格式的时间字符串），默认值为当前时间</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>日志查询结束时间（RFC3339格式的时间字符串），默认值为当前时间</p>
     * @param EndTime <p>日志查询结束时间（RFC3339格式的时间字符串），默认值为当前时间</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>日志查询条数，默认值100，最大值1000</p> 
     * @return Limit <p>日志查询条数，默认值100，最大值1000</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>日志查询条数，默认值100，最大值1000</p>
     * @param Limit <p>日志查询条数，默认值100，最大值1000</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>服务ID，和Service参数对应，不同Service的服务ID获取方式不同，具体如下：</p><ul><li>Service类型为TRAIN：<br>调用<a href="/document/product/851/75089">DescribeTrainingTask接口</a>查询训练任务详情，ServiceId为接口返回值中Response.TrainingTaskDetail.LatestInstanceId</li><li>Service类型为NOTEBOOK：<br>调用<a href="/document/product/851/95662">DescribeNotebook接口</a>查询Notebook详情，ServiceId为接口返回值中Response.NotebookDetail.PodName</li><li>Service类型为INFER：<br>调用<a href="/document/product/851/82285">DescribeModelServiceGroup接口</a>查询服务组详情，ServiceId为接口返回值中Response.ServiceGroup.Services.ServiceId</li><li>Service类型为BATCH：<br>调用<a href="/document/product/851/80180">DescribeBatchTask接口</a>查询跑批任务详情，ServiceId为接口返回值中Response.BatchTaskDetail.LatestInstanceId</li></ul> 
     * @return ServiceId <p>服务ID，和Service参数对应，不同Service的服务ID获取方式不同，具体如下：</p><ul><li>Service类型为TRAIN：<br>调用<a href="/document/product/851/75089">DescribeTrainingTask接口</a>查询训练任务详情，ServiceId为接口返回值中Response.TrainingTaskDetail.LatestInstanceId</li><li>Service类型为NOTEBOOK：<br>调用<a href="/document/product/851/95662">DescribeNotebook接口</a>查询Notebook详情，ServiceId为接口返回值中Response.NotebookDetail.PodName</li><li>Service类型为INFER：<br>调用<a href="/document/product/851/82285">DescribeModelServiceGroup接口</a>查询服务组详情，ServiceId为接口返回值中Response.ServiceGroup.Services.ServiceId</li><li>Service类型为BATCH：<br>调用<a href="/document/product/851/80180">DescribeBatchTask接口</a>查询跑批任务详情，ServiceId为接口返回值中Response.BatchTaskDetail.LatestInstanceId</li></ul>
     */
    public String getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set <p>服务ID，和Service参数对应，不同Service的服务ID获取方式不同，具体如下：</p><ul><li>Service类型为TRAIN：<br>调用<a href="/document/product/851/75089">DescribeTrainingTask接口</a>查询训练任务详情，ServiceId为接口返回值中Response.TrainingTaskDetail.LatestInstanceId</li><li>Service类型为NOTEBOOK：<br>调用<a href="/document/product/851/95662">DescribeNotebook接口</a>查询Notebook详情，ServiceId为接口返回值中Response.NotebookDetail.PodName</li><li>Service类型为INFER：<br>调用<a href="/document/product/851/82285">DescribeModelServiceGroup接口</a>查询服务组详情，ServiceId为接口返回值中Response.ServiceGroup.Services.ServiceId</li><li>Service类型为BATCH：<br>调用<a href="/document/product/851/80180">DescribeBatchTask接口</a>查询跑批任务详情，ServiceId为接口返回值中Response.BatchTaskDetail.LatestInstanceId</li></ul>
     * @param ServiceId <p>服务ID，和Service参数对应，不同Service的服务ID获取方式不同，具体如下：</p><ul><li>Service类型为TRAIN：<br>调用<a href="/document/product/851/75089">DescribeTrainingTask接口</a>查询训练任务详情，ServiceId为接口返回值中Response.TrainingTaskDetail.LatestInstanceId</li><li>Service类型为NOTEBOOK：<br>调用<a href="/document/product/851/95662">DescribeNotebook接口</a>查询Notebook详情，ServiceId为接口返回值中Response.NotebookDetail.PodName</li><li>Service类型为INFER：<br>调用<a href="/document/product/851/82285">DescribeModelServiceGroup接口</a>查询服务组详情，ServiceId为接口返回值中Response.ServiceGroup.Services.ServiceId</li><li>Service类型为BATCH：<br>调用<a href="/document/product/851/80180">DescribeBatchTask接口</a>查询跑批任务详情，ServiceId为接口返回值中Response.BatchTaskDetail.LatestInstanceId</li></ul>
     */
    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    /**
     * Get <p>Pod的名称，即需要查询服务对应的Pod，和Service参数对应，不同Service的PodName获取方式不同，具体如下：</p><ul><li>Service类型为TRAIN：<br>调用<a href="/document/product/851/75088">DescribeTrainingTaskPods接口</a>查询训练任务pod列表，PodName为接口返回值中Response.PodNames</li><li>Service类型为NOTEBOOK：<br>调用<a href="/document/product/851/95662">DescribeNotebook接口</a>查询Notebook详情，PodName为接口返回值中Response.NotebookDetail.PodName</li><li>Service类型为INFER：<br>调用<a href="/document/product/851/82287">DescribeModelService接口</a>查询单个服务详情，PodName为接口返回值中Response.Service.ServiceInfo.PodInfos</li><li>Service类型为BATCH：<br>调用<a href="/document/product/851/80180">DescribeBatchTask接口</a>查询跑批任务详情，PodName为接口返回值中Response.BatchTaskDetail. PodList<br>注：支持结尾通配符*</li></ul> 
     * @return PodName <p>Pod的名称，即需要查询服务对应的Pod，和Service参数对应，不同Service的PodName获取方式不同，具体如下：</p><ul><li>Service类型为TRAIN：<br>调用<a href="/document/product/851/75088">DescribeTrainingTaskPods接口</a>查询训练任务pod列表，PodName为接口返回值中Response.PodNames</li><li>Service类型为NOTEBOOK：<br>调用<a href="/document/product/851/95662">DescribeNotebook接口</a>查询Notebook详情，PodName为接口返回值中Response.NotebookDetail.PodName</li><li>Service类型为INFER：<br>调用<a href="/document/product/851/82287">DescribeModelService接口</a>查询单个服务详情，PodName为接口返回值中Response.Service.ServiceInfo.PodInfos</li><li>Service类型为BATCH：<br>调用<a href="/document/product/851/80180">DescribeBatchTask接口</a>查询跑批任务详情，PodName为接口返回值中Response.BatchTaskDetail. PodList<br>注：支持结尾通配符*</li></ul>
     */
    public String getPodName() {
        return this.PodName;
    }

    /**
     * Set <p>Pod的名称，即需要查询服务对应的Pod，和Service参数对应，不同Service的PodName获取方式不同，具体如下：</p><ul><li>Service类型为TRAIN：<br>调用<a href="/document/product/851/75088">DescribeTrainingTaskPods接口</a>查询训练任务pod列表，PodName为接口返回值中Response.PodNames</li><li>Service类型为NOTEBOOK：<br>调用<a href="/document/product/851/95662">DescribeNotebook接口</a>查询Notebook详情，PodName为接口返回值中Response.NotebookDetail.PodName</li><li>Service类型为INFER：<br>调用<a href="/document/product/851/82287">DescribeModelService接口</a>查询单个服务详情，PodName为接口返回值中Response.Service.ServiceInfo.PodInfos</li><li>Service类型为BATCH：<br>调用<a href="/document/product/851/80180">DescribeBatchTask接口</a>查询跑批任务详情，PodName为接口返回值中Response.BatchTaskDetail. PodList<br>注：支持结尾通配符*</li></ul>
     * @param PodName <p>Pod的名称，即需要查询服务对应的Pod，和Service参数对应，不同Service的PodName获取方式不同，具体如下：</p><ul><li>Service类型为TRAIN：<br>调用<a href="/document/product/851/75088">DescribeTrainingTaskPods接口</a>查询训练任务pod列表，PodName为接口返回值中Response.PodNames</li><li>Service类型为NOTEBOOK：<br>调用<a href="/document/product/851/95662">DescribeNotebook接口</a>查询Notebook详情，PodName为接口返回值中Response.NotebookDetail.PodName</li><li>Service类型为INFER：<br>调用<a href="/document/product/851/82287">DescribeModelService接口</a>查询单个服务详情，PodName为接口返回值中Response.Service.ServiceInfo.PodInfos</li><li>Service类型为BATCH：<br>调用<a href="/document/product/851/80180">DescribeBatchTask接口</a>查询跑批任务详情，PodName为接口返回值中Response.BatchTaskDetail. PodList<br>注：支持结尾通配符*</li></ul>
     */
    public void setPodName(String PodName) {
        this.PodName = PodName;
    }

    /**
     * Get <p>排序方向（可选值为ASC, DESC ），默认为DESC</p> 
     * @return Order <p>排序方向（可选值为ASC, DESC ），默认为DESC</p>
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set <p>排序方向（可选值为ASC, DESC ），默认为DESC</p>
     * @param Order <p>排序方向（可选值为ASC, DESC ），默认为DESC</p>
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get <p>按哪个字段排序（可选值为Timestamp），默认值为Timestamp</p> 
     * @return OrderField <p>按哪个字段排序（可选值为Timestamp），默认值为Timestamp</p>
     */
    public String getOrderField() {
        return this.OrderField;
    }

    /**
     * Set <p>按哪个字段排序（可选值为Timestamp），默认值为Timestamp</p>
     * @param OrderField <p>按哪个字段排序（可选值为Timestamp），默认值为Timestamp</p>
     */
    public void setOrderField(String OrderField) {
        this.OrderField = OrderField;
    }

    /**
     * Get <p>日志查询上下文，查询下一页的时候需要回传这个字段，该字段来自本接口的返回</p> 
     * @return Context <p>日志查询上下文，查询下一页的时候需要回传这个字段，该字段来自本接口的返回</p>
     */
    public String getContext() {
        return this.Context;
    }

    /**
     * Set <p>日志查询上下文，查询下一页的时候需要回传这个字段，该字段来自本接口的返回</p>
     * @param Context <p>日志查询上下文，查询下一页的时候需要回传这个字段，该字段来自本接口的返回</p>
     */
    public void setContext(String Context) {
        this.Context = Context;
    }

    /**
     * Get <p>过滤条件<br>注意: </p><ol><li>Filter.Name：目前只支持Key（也就是按关键字过滤日志）</li><li>Filter.Values：表示过滤日志的关键字；Values为多个的时候表示同时满足</li><li>Filter. Negative和Filter. Fuzzy没有使用</li></ol> 
     * @return Filters <p>过滤条件<br>注意: </p><ol><li>Filter.Name：目前只支持Key（也就是按关键字过滤日志）</li><li>Filter.Values：表示过滤日志的关键字；Values为多个的时候表示同时满足</li><li>Filter. Negative和Filter. Fuzzy没有使用</li></ol>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>过滤条件<br>注意: </p><ol><li>Filter.Name：目前只支持Key（也就是按关键字过滤日志）</li><li>Filter.Values：表示过滤日志的关键字；Values为多个的时候表示同时满足</li><li>Filter. Negative和Filter. Fuzzy没有使用</li></ol>
     * @param Filters <p>过滤条件<br>注意: </p><ol><li>Filter.Name：目前只支持Key（也就是按关键字过滤日志）</li><li>Filter.Values：表示过滤日志的关键字；Values为多个的时候表示同时满足</li><li>Filter. Negative和Filter. Fuzzy没有使用</li></ol>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>使用OFFSET分页查询时，指定返回的数据偏移量，默认为0</p> 
     * @return Offset <p>使用OFFSET分页查询时，指定返回的数据偏移量，默认为0</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>使用OFFSET分页查询时，指定返回的数据偏移量，默认为0</p>
     * @param Offset <p>使用OFFSET分页查询时，指定返回的数据偏移量，默认为0</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public DescribeLogsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLogsRequest(DescribeLogsRequest source) {
        if (source.Service != null) {
            this.Service = new String(source.Service);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.ServiceId != null) {
            this.ServiceId = new String(source.ServiceId);
        }
        if (source.PodName != null) {
            this.PodName = new String(source.PodName);
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
        if (source.OrderField != null) {
            this.OrderField = new String(source.OrderField);
        }
        if (source.Context != null) {
            this.Context = new String(source.Context);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Service", this.Service);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamSimple(map, prefix + "PodName", this.PodName);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "OrderField", this.OrderField);
        this.setParamSimple(map, prefix + "Context", this.Context);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

