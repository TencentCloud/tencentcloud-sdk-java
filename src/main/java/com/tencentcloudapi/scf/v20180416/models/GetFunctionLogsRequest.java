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
package com.tencentcloudapi.scf.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetFunctionLogsRequest  extends AbstractModel{

    /**
    * 函数的名称
    */
    @SerializedName("FunctionName")
    @Expose
    private String FunctionName;

    /**
    * 数据的偏移量，Offset+Limit不能大于10000
    */
    @SerializedName("Offset")
    @Expose
    private Integer Offset;

    /**
    * 返回数据的长度，Offset+Limit不能大于10000
    */
    @SerializedName("Limit")
    @Expose
    private Integer Limit;

    /**
    * 以升序还是降序的方式对日志进行排序，可选值 desc和 asc
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * 根据某个字段排序日志,支持以下字段：function_name, duration, mem_usage, start_time
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * 日志过滤条件。可用来区分正确和错误日志，filter.retCode=not0 表示只返回错误日志，filter.retCode=is0 表示只返回正确日志，不传，则返回所有日志
    */
    @SerializedName("Filter")
    @Expose
    private LogFilter Filter;

    /**
    * 函数的命名空间
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * 函数的版本
    */
    @SerializedName("Qualifier")
    @Expose
    private String Qualifier;

    /**
    * 执行该函数对应的requestId
    */
    @SerializedName("FunctionRequestId")
    @Expose
    private String FunctionRequestId;

    /**
    * 查询的具体日期，例如：2017-05-16 20:00:00，只能与endtime相差一天之内
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 查询的具体日期，例如：2017-05-16 20:59:59，只能与startTime相差一天之内
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 服务日志相关参数，第一页日志 Offset 为空字符串，后续分页按响应字段里的SearchContext填写
    */
    @SerializedName("SearchContext")
    @Expose
    private LogSearchContext SearchContext;

    /**
     * 获取函数的名称
     * @return FunctionName 函数的名称
     */
    public String getFunctionName() {
        return this.FunctionName;
    }

    /**
     * 设置函数的名称
     * @param FunctionName 函数的名称
     */
    public void setFunctionName(String FunctionName) {
        this.FunctionName = FunctionName;
    }

    /**
     * 获取数据的偏移量，Offset+Limit不能大于10000
     * @return Offset 数据的偏移量，Offset+Limit不能大于10000
     */
    public Integer getOffset() {
        return this.Offset;
    }

    /**
     * 设置数据的偏移量，Offset+Limit不能大于10000
     * @param Offset 数据的偏移量，Offset+Limit不能大于10000
     */
    public void setOffset(Integer Offset) {
        this.Offset = Offset;
    }

    /**
     * 获取返回数据的长度，Offset+Limit不能大于10000
     * @return Limit 返回数据的长度，Offset+Limit不能大于10000
     */
    public Integer getLimit() {
        return this.Limit;
    }

    /**
     * 设置返回数据的长度，Offset+Limit不能大于10000
     * @param Limit 返回数据的长度，Offset+Limit不能大于10000
     */
    public void setLimit(Integer Limit) {
        this.Limit = Limit;
    }

    /**
     * 获取以升序还是降序的方式对日志进行排序，可选值 desc和 asc
     * @return Order 以升序还是降序的方式对日志进行排序，可选值 desc和 asc
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * 设置以升序还是降序的方式对日志进行排序，可选值 desc和 asc
     * @param Order 以升序还是降序的方式对日志进行排序，可选值 desc和 asc
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * 获取根据某个字段排序日志,支持以下字段：function_name, duration, mem_usage, start_time
     * @return OrderBy 根据某个字段排序日志,支持以下字段：function_name, duration, mem_usage, start_time
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * 设置根据某个字段排序日志,支持以下字段：function_name, duration, mem_usage, start_time
     * @param OrderBy 根据某个字段排序日志,支持以下字段：function_name, duration, mem_usage, start_time
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * 获取日志过滤条件。可用来区分正确和错误日志，filter.retCode=not0 表示只返回错误日志，filter.retCode=is0 表示只返回正确日志，不传，则返回所有日志
     * @return Filter 日志过滤条件。可用来区分正确和错误日志，filter.retCode=not0 表示只返回错误日志，filter.retCode=is0 表示只返回正确日志，不传，则返回所有日志
     */
    public LogFilter getFilter() {
        return this.Filter;
    }

    /**
     * 设置日志过滤条件。可用来区分正确和错误日志，filter.retCode=not0 表示只返回错误日志，filter.retCode=is0 表示只返回正确日志，不传，则返回所有日志
     * @param Filter 日志过滤条件。可用来区分正确和错误日志，filter.retCode=not0 表示只返回错误日志，filter.retCode=is0 表示只返回正确日志，不传，则返回所有日志
     */
    public void setFilter(LogFilter Filter) {
        this.Filter = Filter;
    }

    /**
     * 获取函数的命名空间
     * @return Namespace 函数的命名空间
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * 设置函数的命名空间
     * @param Namespace 函数的命名空间
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * 获取函数的版本
     * @return Qualifier 函数的版本
     */
    public String getQualifier() {
        return this.Qualifier;
    }

    /**
     * 设置函数的版本
     * @param Qualifier 函数的版本
     */
    public void setQualifier(String Qualifier) {
        this.Qualifier = Qualifier;
    }

    /**
     * 获取执行该函数对应的requestId
     * @return FunctionRequestId 执行该函数对应的requestId
     */
    public String getFunctionRequestId() {
        return this.FunctionRequestId;
    }

    /**
     * 设置执行该函数对应的requestId
     * @param FunctionRequestId 执行该函数对应的requestId
     */
    public void setFunctionRequestId(String FunctionRequestId) {
        this.FunctionRequestId = FunctionRequestId;
    }

    /**
     * 获取查询的具体日期，例如：2017-05-16 20:00:00，只能与endtime相差一天之内
     * @return StartTime 查询的具体日期，例如：2017-05-16 20:00:00，只能与endtime相差一天之内
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * 设置查询的具体日期，例如：2017-05-16 20:00:00，只能与endtime相差一天之内
     * @param StartTime 查询的具体日期，例如：2017-05-16 20:00:00，只能与endtime相差一天之内
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * 获取查询的具体日期，例如：2017-05-16 20:59:59，只能与startTime相差一天之内
     * @return EndTime 查询的具体日期，例如：2017-05-16 20:59:59，只能与startTime相差一天之内
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * 设置查询的具体日期，例如：2017-05-16 20:59:59，只能与startTime相差一天之内
     * @param EndTime 查询的具体日期，例如：2017-05-16 20:59:59，只能与startTime相差一天之内
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * 获取服务日志相关参数，第一页日志 Offset 为空字符串，后续分页按响应字段里的SearchContext填写
     * @return SearchContext 服务日志相关参数，第一页日志 Offset 为空字符串，后续分页按响应字段里的SearchContext填写
     */
    public LogSearchContext getSearchContext() {
        return this.SearchContext;
    }

    /**
     * 设置服务日志相关参数，第一页日志 Offset 为空字符串，后续分页按响应字段里的SearchContext填写
     * @param SearchContext 服务日志相关参数，第一页日志 Offset 为空字符串，后续分页按响应字段里的SearchContext填写
     */
    public void setSearchContext(LogSearchContext SearchContext) {
        this.SearchContext = SearchContext;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FunctionName", this.FunctionName);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamObj(map, prefix + "Filter.", this.Filter);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "Qualifier", this.Qualifier);
        this.setParamSimple(map, prefix + "FunctionRequestId", this.FunctionRequestId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamObj(map, prefix + "SearchContext.", this.SearchContext);

    }
}

