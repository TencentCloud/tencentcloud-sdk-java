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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLogsRequest extends AbstractModel {

    /**
    * 服务类型，TRAIN为任务式建模, NOTEBOOK为Notebook, INFER为在线服务, BATCH为批量预测
枚举值：
- TRAIN
- NOTEBOOK
- INFER
- BATCH
    */
    @SerializedName("Service")
    @Expose
    private String Service;

    /**
    * 日志查询开始时间（RFC3339格式的时间字符串），默认值为当前时间的前一个小时
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 日志查询结束时间（RFC3339格式的时间字符串），默认值为当前时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 日志查询条数，默认值100，最大值100
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 服务ID，和Service参数对应，不同Service的服务ID获取方式不同，具体如下：
- Service类型为TRAIN：
  调用[DescribeTrainingTask接口](/document/product/851/75089)查询训练任务详情，ServiceId为接口返回值中Response.TrainingTaskDetail.LatestInstanceId
- Service类型为NOTEBOOK：
  调用[DescribeNotebook接口](/document/product/851/95662)查询Notebook详情，ServiceId为接口返回值中Response.NotebookDetail.PodName
- Service类型为INFER：
  调用[DescribeModelServiceGroup接口](/document/product/851/82285)查询服务组详情，ServiceId为接口返回值中Response.ServiceGroup.Services.ServiceId
- Service类型为BATCH：
  调用[DescribeBatchTask接口](/document/product/851/80180)查询跑批任务详情，ServiceId为接口返回值中Response.BatchTaskDetail.LatestInstanceId
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
    * Pod的名称，即需要查询服务对应的Pod，和Service参数对应，不同Service的PodName获取方式不同，具体如下：
- Service类型为TRAIN：
  调用[DescribeTrainingTaskPods接口](/document/product/851/75088)查询训练任务pod列表，PodName为接口返回值中Response.PodNames
- Service类型为NOTEBOOK：
  调用[DescribeNotebook接口](/document/product/851/95662)查询Notebook详情，PodName为接口返回值中Response.NotebookDetail.PodName
- Service类型为INFER：
  调用[DescribeModelService接口](/document/product/851/82287)查询单个服务详情，PodName为接口返回值中Response.Service.ServiceInfo.PodInfos
- Service类型为BATCH：
  调用[DescribeBatchTask接口](/document/product/851/80180)查询跑批任务详情，PodName为接口返回值中Response.BatchTaskDetail. PodList
注：支持结尾通配符*
    */
    @SerializedName("PodName")
    @Expose
    private String PodName;

    /**
    * 排序方向（可选值为ASC, DESC ），默认为DESC
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * 按哪个字段排序（可选值为Timestamp），默认值为Timestamp
    */
    @SerializedName("OrderField")
    @Expose
    private String OrderField;

    /**
    * 日志查询上下文，查询下一页的时候需要回传这个字段，该字段来自本接口的返回
    */
    @SerializedName("Context")
    @Expose
    private String Context;

    /**
    * 过滤条件
注意: 
1. Filter.Name：目前只支持Key（也就是按关键字过滤日志）
2. Filter.Values：表示过滤日志的关键字；Values为多个的时候表示同时满足
3. Filter. Negative和Filter. Fuzzy没有使用
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get 服务类型，TRAIN为任务式建模, NOTEBOOK为Notebook, INFER为在线服务, BATCH为批量预测
枚举值：
- TRAIN
- NOTEBOOK
- INFER
- BATCH 
     * @return Service 服务类型，TRAIN为任务式建模, NOTEBOOK为Notebook, INFER为在线服务, BATCH为批量预测
枚举值：
- TRAIN
- NOTEBOOK
- INFER
- BATCH
     */
    public String getService() {
        return this.Service;
    }

    /**
     * Set 服务类型，TRAIN为任务式建模, NOTEBOOK为Notebook, INFER为在线服务, BATCH为批量预测
枚举值：
- TRAIN
- NOTEBOOK
- INFER
- BATCH
     * @param Service 服务类型，TRAIN为任务式建模, NOTEBOOK为Notebook, INFER为在线服务, BATCH为批量预测
枚举值：
- TRAIN
- NOTEBOOK
- INFER
- BATCH
     */
    public void setService(String Service) {
        this.Service = Service;
    }

    /**
     * Get 日志查询开始时间（RFC3339格式的时间字符串），默认值为当前时间的前一个小时 
     * @return StartTime 日志查询开始时间（RFC3339格式的时间字符串），默认值为当前时间的前一个小时
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 日志查询开始时间（RFC3339格式的时间字符串），默认值为当前时间的前一个小时
     * @param StartTime 日志查询开始时间（RFC3339格式的时间字符串），默认值为当前时间的前一个小时
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 日志查询结束时间（RFC3339格式的时间字符串），默认值为当前时间 
     * @return EndTime 日志查询结束时间（RFC3339格式的时间字符串），默认值为当前时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 日志查询结束时间（RFC3339格式的时间字符串），默认值为当前时间
     * @param EndTime 日志查询结束时间（RFC3339格式的时间字符串），默认值为当前时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 日志查询条数，默认值100，最大值100 
     * @return Limit 日志查询条数，默认值100，最大值100
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 日志查询条数，默认值100，最大值100
     * @param Limit 日志查询条数，默认值100，最大值100
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 服务ID，和Service参数对应，不同Service的服务ID获取方式不同，具体如下：
- Service类型为TRAIN：
  调用[DescribeTrainingTask接口](/document/product/851/75089)查询训练任务详情，ServiceId为接口返回值中Response.TrainingTaskDetail.LatestInstanceId
- Service类型为NOTEBOOK：
  调用[DescribeNotebook接口](/document/product/851/95662)查询Notebook详情，ServiceId为接口返回值中Response.NotebookDetail.PodName
- Service类型为INFER：
  调用[DescribeModelServiceGroup接口](/document/product/851/82285)查询服务组详情，ServiceId为接口返回值中Response.ServiceGroup.Services.ServiceId
- Service类型为BATCH：
  调用[DescribeBatchTask接口](/document/product/851/80180)查询跑批任务详情，ServiceId为接口返回值中Response.BatchTaskDetail.LatestInstanceId 
     * @return ServiceId 服务ID，和Service参数对应，不同Service的服务ID获取方式不同，具体如下：
- Service类型为TRAIN：
  调用[DescribeTrainingTask接口](/document/product/851/75089)查询训练任务详情，ServiceId为接口返回值中Response.TrainingTaskDetail.LatestInstanceId
- Service类型为NOTEBOOK：
  调用[DescribeNotebook接口](/document/product/851/95662)查询Notebook详情，ServiceId为接口返回值中Response.NotebookDetail.PodName
- Service类型为INFER：
  调用[DescribeModelServiceGroup接口](/document/product/851/82285)查询服务组详情，ServiceId为接口返回值中Response.ServiceGroup.Services.ServiceId
- Service类型为BATCH：
  调用[DescribeBatchTask接口](/document/product/851/80180)查询跑批任务详情，ServiceId为接口返回值中Response.BatchTaskDetail.LatestInstanceId
     */
    public String getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set 服务ID，和Service参数对应，不同Service的服务ID获取方式不同，具体如下：
- Service类型为TRAIN：
  调用[DescribeTrainingTask接口](/document/product/851/75089)查询训练任务详情，ServiceId为接口返回值中Response.TrainingTaskDetail.LatestInstanceId
- Service类型为NOTEBOOK：
  调用[DescribeNotebook接口](/document/product/851/95662)查询Notebook详情，ServiceId为接口返回值中Response.NotebookDetail.PodName
- Service类型为INFER：
  调用[DescribeModelServiceGroup接口](/document/product/851/82285)查询服务组详情，ServiceId为接口返回值中Response.ServiceGroup.Services.ServiceId
- Service类型为BATCH：
  调用[DescribeBatchTask接口](/document/product/851/80180)查询跑批任务详情，ServiceId为接口返回值中Response.BatchTaskDetail.LatestInstanceId
     * @param ServiceId 服务ID，和Service参数对应，不同Service的服务ID获取方式不同，具体如下：
- Service类型为TRAIN：
  调用[DescribeTrainingTask接口](/document/product/851/75089)查询训练任务详情，ServiceId为接口返回值中Response.TrainingTaskDetail.LatestInstanceId
- Service类型为NOTEBOOK：
  调用[DescribeNotebook接口](/document/product/851/95662)查询Notebook详情，ServiceId为接口返回值中Response.NotebookDetail.PodName
- Service类型为INFER：
  调用[DescribeModelServiceGroup接口](/document/product/851/82285)查询服务组详情，ServiceId为接口返回值中Response.ServiceGroup.Services.ServiceId
- Service类型为BATCH：
  调用[DescribeBatchTask接口](/document/product/851/80180)查询跑批任务详情，ServiceId为接口返回值中Response.BatchTaskDetail.LatestInstanceId
     */
    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    /**
     * Get Pod的名称，即需要查询服务对应的Pod，和Service参数对应，不同Service的PodName获取方式不同，具体如下：
- Service类型为TRAIN：
  调用[DescribeTrainingTaskPods接口](/document/product/851/75088)查询训练任务pod列表，PodName为接口返回值中Response.PodNames
- Service类型为NOTEBOOK：
  调用[DescribeNotebook接口](/document/product/851/95662)查询Notebook详情，PodName为接口返回值中Response.NotebookDetail.PodName
- Service类型为INFER：
  调用[DescribeModelService接口](/document/product/851/82287)查询单个服务详情，PodName为接口返回值中Response.Service.ServiceInfo.PodInfos
- Service类型为BATCH：
  调用[DescribeBatchTask接口](/document/product/851/80180)查询跑批任务详情，PodName为接口返回值中Response.BatchTaskDetail. PodList
注：支持结尾通配符* 
     * @return PodName Pod的名称，即需要查询服务对应的Pod，和Service参数对应，不同Service的PodName获取方式不同，具体如下：
- Service类型为TRAIN：
  调用[DescribeTrainingTaskPods接口](/document/product/851/75088)查询训练任务pod列表，PodName为接口返回值中Response.PodNames
- Service类型为NOTEBOOK：
  调用[DescribeNotebook接口](/document/product/851/95662)查询Notebook详情，PodName为接口返回值中Response.NotebookDetail.PodName
- Service类型为INFER：
  调用[DescribeModelService接口](/document/product/851/82287)查询单个服务详情，PodName为接口返回值中Response.Service.ServiceInfo.PodInfos
- Service类型为BATCH：
  调用[DescribeBatchTask接口](/document/product/851/80180)查询跑批任务详情，PodName为接口返回值中Response.BatchTaskDetail. PodList
注：支持结尾通配符*
     */
    public String getPodName() {
        return this.PodName;
    }

    /**
     * Set Pod的名称，即需要查询服务对应的Pod，和Service参数对应，不同Service的PodName获取方式不同，具体如下：
- Service类型为TRAIN：
  调用[DescribeTrainingTaskPods接口](/document/product/851/75088)查询训练任务pod列表，PodName为接口返回值中Response.PodNames
- Service类型为NOTEBOOK：
  调用[DescribeNotebook接口](/document/product/851/95662)查询Notebook详情，PodName为接口返回值中Response.NotebookDetail.PodName
- Service类型为INFER：
  调用[DescribeModelService接口](/document/product/851/82287)查询单个服务详情，PodName为接口返回值中Response.Service.ServiceInfo.PodInfos
- Service类型为BATCH：
  调用[DescribeBatchTask接口](/document/product/851/80180)查询跑批任务详情，PodName为接口返回值中Response.BatchTaskDetail. PodList
注：支持结尾通配符*
     * @param PodName Pod的名称，即需要查询服务对应的Pod，和Service参数对应，不同Service的PodName获取方式不同，具体如下：
- Service类型为TRAIN：
  调用[DescribeTrainingTaskPods接口](/document/product/851/75088)查询训练任务pod列表，PodName为接口返回值中Response.PodNames
- Service类型为NOTEBOOK：
  调用[DescribeNotebook接口](/document/product/851/95662)查询Notebook详情，PodName为接口返回值中Response.NotebookDetail.PodName
- Service类型为INFER：
  调用[DescribeModelService接口](/document/product/851/82287)查询单个服务详情，PodName为接口返回值中Response.Service.ServiceInfo.PodInfos
- Service类型为BATCH：
  调用[DescribeBatchTask接口](/document/product/851/80180)查询跑批任务详情，PodName为接口返回值中Response.BatchTaskDetail. PodList
注：支持结尾通配符*
     */
    public void setPodName(String PodName) {
        this.PodName = PodName;
    }

    /**
     * Get 排序方向（可选值为ASC, DESC ），默认为DESC 
     * @return Order 排序方向（可选值为ASC, DESC ），默认为DESC
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set 排序方向（可选值为ASC, DESC ），默认为DESC
     * @param Order 排序方向（可选值为ASC, DESC ），默认为DESC
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get 按哪个字段排序（可选值为Timestamp），默认值为Timestamp 
     * @return OrderField 按哪个字段排序（可选值为Timestamp），默认值为Timestamp
     */
    public String getOrderField() {
        return this.OrderField;
    }

    /**
     * Set 按哪个字段排序（可选值为Timestamp），默认值为Timestamp
     * @param OrderField 按哪个字段排序（可选值为Timestamp），默认值为Timestamp
     */
    public void setOrderField(String OrderField) {
        this.OrderField = OrderField;
    }

    /**
     * Get 日志查询上下文，查询下一页的时候需要回传这个字段，该字段来自本接口的返回 
     * @return Context 日志查询上下文，查询下一页的时候需要回传这个字段，该字段来自本接口的返回
     */
    public String getContext() {
        return this.Context;
    }

    /**
     * Set 日志查询上下文，查询下一页的时候需要回传这个字段，该字段来自本接口的返回
     * @param Context 日志查询上下文，查询下一页的时候需要回传这个字段，该字段来自本接口的返回
     */
    public void setContext(String Context) {
        this.Context = Context;
    }

    /**
     * Get 过滤条件
注意: 
1. Filter.Name：目前只支持Key（也就是按关键字过滤日志）
2. Filter.Values：表示过滤日志的关键字；Values为多个的时候表示同时满足
3. Filter. Negative和Filter. Fuzzy没有使用 
     * @return Filters 过滤条件
注意: 
1. Filter.Name：目前只支持Key（也就是按关键字过滤日志）
2. Filter.Values：表示过滤日志的关键字；Values为多个的时候表示同时满足
3. Filter. Negative和Filter. Fuzzy没有使用
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件
注意: 
1. Filter.Name：目前只支持Key（也就是按关键字过滤日志）
2. Filter.Values：表示过滤日志的关键字；Values为多个的时候表示同时满足
3. Filter. Negative和Filter. Fuzzy没有使用
     * @param Filters 过滤条件
注意: 
1. Filter.Name：目前只支持Key（也就是按关键字过滤日志）
2. Filter.Values：表示过滤日志的关键字；Values为多个的时候表示同时满足
3. Filter. Negative和Filter. Fuzzy没有使用
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
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

    }
}

