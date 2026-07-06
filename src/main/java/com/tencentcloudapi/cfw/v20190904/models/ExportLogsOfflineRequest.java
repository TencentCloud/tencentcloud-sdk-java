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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExportLogsOfflineRequest extends AbstractModel {

    /**
    * <p>日志类型标识</p><p>枚举值：</p><ul><li>cfw_netflow_border： 流量日志-互联网边界</li><li>cfw_netflow_vpc： 流量日志-VPC边界</li><li>cfw_netflow_nat： 流量日志-NAT边界</li><li>cfw_rule_acl： 访问控制-互联网边界</li><li>cfw_rule_vpc_acl： 访问控制-VPC边界</li><li>cfw_rule_nat_acl： 访问控制-NAT边界</li><li>cfw_rule_threatinfo： 入侵防御-入侵防御</li><li>cfw_netflow_nta： 全流量检测与响应-流量分析</li><li>cfw_ndr_subject_risk： 全流量检测与响应-流量风险</li><li>cfw_ndr_ai_audit： 全流量检测与响应-AI流量风险</li><li>operate_log_all： 操作日志</li></ul>
    */
    @SerializedName("Index")
    @Expose
    private String Index;

    /**
    * <p>筛选开始时间</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>筛选结束时间</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>任务名称</p>
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * <p>数据格式</p><p>枚举值：</p><ul><li>.json： JSON格式</li><li>.csv： CSV格式</li></ul>
    */
    @SerializedName("DataFormat")
    @Expose
    private String DataFormat;

    /**
    * <p>压缩方式，.zip、.tar.gz、.tar.zst、.tar.lz4、传空不压缩</p>
    */
    @SerializedName("CompressionFormat")
    @Expose
    private String CompressionFormat;

    /**
    * <p>日志排序，desc时间降序，asc时间升序</p>
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * <p>日志数量，传0按单次上限导出</p>
    */
    @SerializedName("Length")
    @Expose
    private Long Length;

    /**
    * <p>过滤条件组合</p>
    */
    @SerializedName("Filters")
    @Expose
    private CommonFilter [] Filters;

    /**
    * <p>COS存储桶名称</p>
    */
    @SerializedName("BucketName")
    @Expose
    private String BucketName;

    /**
    * <p>COS存储桶地域</p>
    */
    @SerializedName("BucketRegion")
    @Expose
    private String BucketRegion;

    /**
    * <p>文件过期时长，1一天，7七天，-1永久</p>
    */
    @SerializedName("StorageDays")
    @Expose
    private Long StorageDays;

    /**
    * <p>日志分析查询语句，Query和Filters不能同时使用，在一次请求中有且只能选择一个</p>
    */
    @SerializedName("Query")
    @Expose
    private String Query;

    /**
    * <p>导出任务类型，LogAnalysis日志分析导出，LogSearch日志审计导出</p>
    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
     * Get <p>日志类型标识</p><p>枚举值：</p><ul><li>cfw_netflow_border： 流量日志-互联网边界</li><li>cfw_netflow_vpc： 流量日志-VPC边界</li><li>cfw_netflow_nat： 流量日志-NAT边界</li><li>cfw_rule_acl： 访问控制-互联网边界</li><li>cfw_rule_vpc_acl： 访问控制-VPC边界</li><li>cfw_rule_nat_acl： 访问控制-NAT边界</li><li>cfw_rule_threatinfo： 入侵防御-入侵防御</li><li>cfw_netflow_nta： 全流量检测与响应-流量分析</li><li>cfw_ndr_subject_risk： 全流量检测与响应-流量风险</li><li>cfw_ndr_ai_audit： 全流量检测与响应-AI流量风险</li><li>operate_log_all： 操作日志</li></ul> 
     * @return Index <p>日志类型标识</p><p>枚举值：</p><ul><li>cfw_netflow_border： 流量日志-互联网边界</li><li>cfw_netflow_vpc： 流量日志-VPC边界</li><li>cfw_netflow_nat： 流量日志-NAT边界</li><li>cfw_rule_acl： 访问控制-互联网边界</li><li>cfw_rule_vpc_acl： 访问控制-VPC边界</li><li>cfw_rule_nat_acl： 访问控制-NAT边界</li><li>cfw_rule_threatinfo： 入侵防御-入侵防御</li><li>cfw_netflow_nta： 全流量检测与响应-流量分析</li><li>cfw_ndr_subject_risk： 全流量检测与响应-流量风险</li><li>cfw_ndr_ai_audit： 全流量检测与响应-AI流量风险</li><li>operate_log_all： 操作日志</li></ul>
     */
    public String getIndex() {
        return this.Index;
    }

    /**
     * Set <p>日志类型标识</p><p>枚举值：</p><ul><li>cfw_netflow_border： 流量日志-互联网边界</li><li>cfw_netflow_vpc： 流量日志-VPC边界</li><li>cfw_netflow_nat： 流量日志-NAT边界</li><li>cfw_rule_acl： 访问控制-互联网边界</li><li>cfw_rule_vpc_acl： 访问控制-VPC边界</li><li>cfw_rule_nat_acl： 访问控制-NAT边界</li><li>cfw_rule_threatinfo： 入侵防御-入侵防御</li><li>cfw_netflow_nta： 全流量检测与响应-流量分析</li><li>cfw_ndr_subject_risk： 全流量检测与响应-流量风险</li><li>cfw_ndr_ai_audit： 全流量检测与响应-AI流量风险</li><li>operate_log_all： 操作日志</li></ul>
     * @param Index <p>日志类型标识</p><p>枚举值：</p><ul><li>cfw_netflow_border： 流量日志-互联网边界</li><li>cfw_netflow_vpc： 流量日志-VPC边界</li><li>cfw_netflow_nat： 流量日志-NAT边界</li><li>cfw_rule_acl： 访问控制-互联网边界</li><li>cfw_rule_vpc_acl： 访问控制-VPC边界</li><li>cfw_rule_nat_acl： 访问控制-NAT边界</li><li>cfw_rule_threatinfo： 入侵防御-入侵防御</li><li>cfw_netflow_nta： 全流量检测与响应-流量分析</li><li>cfw_ndr_subject_risk： 全流量检测与响应-流量风险</li><li>cfw_ndr_ai_audit： 全流量检测与响应-AI流量风险</li><li>operate_log_all： 操作日志</li></ul>
     */
    public void setIndex(String Index) {
        this.Index = Index;
    }

    /**
     * Get <p>筛选开始时间</p> 
     * @return StartTime <p>筛选开始时间</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>筛选开始时间</p>
     * @param StartTime <p>筛选开始时间</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>筛选结束时间</p> 
     * @return EndTime <p>筛选结束时间</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>筛选结束时间</p>
     * @param EndTime <p>筛选结束时间</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>任务名称</p> 
     * @return TaskName <p>任务名称</p>
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set <p>任务名称</p>
     * @param TaskName <p>任务名称</p>
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get <p>数据格式</p><p>枚举值：</p><ul><li>.json： JSON格式</li><li>.csv： CSV格式</li></ul> 
     * @return DataFormat <p>数据格式</p><p>枚举值：</p><ul><li>.json： JSON格式</li><li>.csv： CSV格式</li></ul>
     */
    public String getDataFormat() {
        return this.DataFormat;
    }

    /**
     * Set <p>数据格式</p><p>枚举值：</p><ul><li>.json： JSON格式</li><li>.csv： CSV格式</li></ul>
     * @param DataFormat <p>数据格式</p><p>枚举值：</p><ul><li>.json： JSON格式</li><li>.csv： CSV格式</li></ul>
     */
    public void setDataFormat(String DataFormat) {
        this.DataFormat = DataFormat;
    }

    /**
     * Get <p>压缩方式，.zip、.tar.gz、.tar.zst、.tar.lz4、传空不压缩</p> 
     * @return CompressionFormat <p>压缩方式，.zip、.tar.gz、.tar.zst、.tar.lz4、传空不压缩</p>
     */
    public String getCompressionFormat() {
        return this.CompressionFormat;
    }

    /**
     * Set <p>压缩方式，.zip、.tar.gz、.tar.zst、.tar.lz4、传空不压缩</p>
     * @param CompressionFormat <p>压缩方式，.zip、.tar.gz、.tar.zst、.tar.lz4、传空不压缩</p>
     */
    public void setCompressionFormat(String CompressionFormat) {
        this.CompressionFormat = CompressionFormat;
    }

    /**
     * Get <p>日志排序，desc时间降序，asc时间升序</p> 
     * @return Order <p>日志排序，desc时间降序，asc时间升序</p>
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set <p>日志排序，desc时间降序，asc时间升序</p>
     * @param Order <p>日志排序，desc时间降序，asc时间升序</p>
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get <p>日志数量，传0按单次上限导出</p> 
     * @return Length <p>日志数量，传0按单次上限导出</p>
     */
    public Long getLength() {
        return this.Length;
    }

    /**
     * Set <p>日志数量，传0按单次上限导出</p>
     * @param Length <p>日志数量，传0按单次上限导出</p>
     */
    public void setLength(Long Length) {
        this.Length = Length;
    }

    /**
     * Get <p>过滤条件组合</p> 
     * @return Filters <p>过滤条件组合</p>
     */
    public CommonFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>过滤条件组合</p>
     * @param Filters <p>过滤条件组合</p>
     */
    public void setFilters(CommonFilter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>COS存储桶名称</p> 
     * @return BucketName <p>COS存储桶名称</p>
     */
    public String getBucketName() {
        return this.BucketName;
    }

    /**
     * Set <p>COS存储桶名称</p>
     * @param BucketName <p>COS存储桶名称</p>
     */
    public void setBucketName(String BucketName) {
        this.BucketName = BucketName;
    }

    /**
     * Get <p>COS存储桶地域</p> 
     * @return BucketRegion <p>COS存储桶地域</p>
     */
    public String getBucketRegion() {
        return this.BucketRegion;
    }

    /**
     * Set <p>COS存储桶地域</p>
     * @param BucketRegion <p>COS存储桶地域</p>
     */
    public void setBucketRegion(String BucketRegion) {
        this.BucketRegion = BucketRegion;
    }

    /**
     * Get <p>文件过期时长，1一天，7七天，-1永久</p> 
     * @return StorageDays <p>文件过期时长，1一天，7七天，-1永久</p>
     */
    public Long getStorageDays() {
        return this.StorageDays;
    }

    /**
     * Set <p>文件过期时长，1一天，7七天，-1永久</p>
     * @param StorageDays <p>文件过期时长，1一天，7七天，-1永久</p>
     */
    public void setStorageDays(Long StorageDays) {
        this.StorageDays = StorageDays;
    }

    /**
     * Get <p>日志分析查询语句，Query和Filters不能同时使用，在一次请求中有且只能选择一个</p> 
     * @return Query <p>日志分析查询语句，Query和Filters不能同时使用，在一次请求中有且只能选择一个</p>
     */
    public String getQuery() {
        return this.Query;
    }

    /**
     * Set <p>日志分析查询语句，Query和Filters不能同时使用，在一次请求中有且只能选择一个</p>
     * @param Query <p>日志分析查询语句，Query和Filters不能同时使用，在一次请求中有且只能选择一个</p>
     */
    public void setQuery(String Query) {
        this.Query = Query;
    }

    /**
     * Get <p>导出任务类型，LogAnalysis日志分析导出，LogSearch日志审计导出</p> 
     * @return TaskType <p>导出任务类型，LogAnalysis日志分析导出，LogSearch日志审计导出</p>
     */
    public String getTaskType() {
        return this.TaskType;
    }

    /**
     * Set <p>导出任务类型，LogAnalysis日志分析导出，LogSearch日志审计导出</p>
     * @param TaskType <p>导出任务类型，LogAnalysis日志分析导出，LogSearch日志审计导出</p>
     */
    public void setTaskType(String TaskType) {
        this.TaskType = TaskType;
    }

    public ExportLogsOfflineRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExportLogsOfflineRequest(ExportLogsOfflineRequest source) {
        if (source.Index != null) {
            this.Index = new String(source.Index);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.DataFormat != null) {
            this.DataFormat = new String(source.DataFormat);
        }
        if (source.CompressionFormat != null) {
            this.CompressionFormat = new String(source.CompressionFormat);
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
        if (source.Length != null) {
            this.Length = new Long(source.Length);
        }
        if (source.Filters != null) {
            this.Filters = new CommonFilter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new CommonFilter(source.Filters[i]);
            }
        }
        if (source.BucketName != null) {
            this.BucketName = new String(source.BucketName);
        }
        if (source.BucketRegion != null) {
            this.BucketRegion = new String(source.BucketRegion);
        }
        if (source.StorageDays != null) {
            this.StorageDays = new Long(source.StorageDays);
        }
        if (source.Query != null) {
            this.Query = new String(source.Query);
        }
        if (source.TaskType != null) {
            this.TaskType = new String(source.TaskType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Index", this.Index);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "DataFormat", this.DataFormat);
        this.setParamSimple(map, prefix + "CompressionFormat", this.CompressionFormat);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "Length", this.Length);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "BucketName", this.BucketName);
        this.setParamSimple(map, prefix + "BucketRegion", this.BucketRegion);
        this.setParamSimple(map, prefix + "StorageDays", this.StorageDays);
        this.setParamSimple(map, prefix + "Query", this.Query);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);

    }
}

