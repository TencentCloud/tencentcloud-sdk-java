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
package com.tencentcloudapi.dbbrain.v20210527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDeadLockLogsRequest extends AbstractModel {

    /**
    * <p>服务产品类型。取值：sqlserver（云数据库 Sqlserver）。</p>
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
    * <p>实例 ID。SQLServer: mssql-xxxx。</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>查询开始时间，格式 yyyy-MM-dd HH:mm:ss，按 UTC+8 解析；也兼容带偏移的 ISO-8601（如 2026-09-16T00:00:00+08:00）。半开区间左闭。</p><p>参数格式：2026-09-16 00:00:00</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>查询结束时间，格式同 StartTime。EndTime 必须大于 StartTime，且总查询窗口不超过 24 小时。半开区间右开。</p><p>参数格式：2026-09-16 23:59:59</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>分页偏移量，非负整数，默认 0。当 Offset&gt;0 时必须同时传入 ResultVersion，否则报 INVALID_PARAMETER。</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>单页返回死锁事件数量，范围 [1, 100]。默认 20。</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>是否在响应中包含原始死锁图 XML（XmlReport）。默认 false，避免响应体过大。仅在需要绘制完整死锁环时置 true。</p>
    */
    @SerializedName("IncludeXml")
    @Expose
    private Boolean IncludeXml;

    /**
    * <p>结果集版本号，最大 128 字符。首次查询无需传入；翻页时必须透传首次响应中的 ResultVersion，服务端会校验结果集是否发生变化，变化时返回 RESULT_CHANGED 提示重新拉取首页。</p>
    */
    @SerializedName("ResultVersion")
    @Expose
    private String ResultVersion;

    /**
     * Get <p>服务产品类型。取值：sqlserver（云数据库 Sqlserver）。</p> 
     * @return Product <p>服务产品类型。取值：sqlserver（云数据库 Sqlserver）。</p>
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set <p>服务产品类型。取值：sqlserver（云数据库 Sqlserver）。</p>
     * @param Product <p>服务产品类型。取值：sqlserver（云数据库 Sqlserver）。</p>
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    /**
     * Get <p>实例 ID。SQLServer: mssql-xxxx。</p> 
     * @return InstanceId <p>实例 ID。SQLServer: mssql-xxxx。</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例 ID。SQLServer: mssql-xxxx。</p>
     * @param InstanceId <p>实例 ID。SQLServer: mssql-xxxx。</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>查询开始时间，格式 yyyy-MM-dd HH:mm:ss，按 UTC+8 解析；也兼容带偏移的 ISO-8601（如 2026-09-16T00:00:00+08:00）。半开区间左闭。</p><p>参数格式：2026-09-16 00:00:00</p> 
     * @return StartTime <p>查询开始时间，格式 yyyy-MM-dd HH:mm:ss，按 UTC+8 解析；也兼容带偏移的 ISO-8601（如 2026-09-16T00:00:00+08:00）。半开区间左闭。</p><p>参数格式：2026-09-16 00:00:00</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>查询开始时间，格式 yyyy-MM-dd HH:mm:ss，按 UTC+8 解析；也兼容带偏移的 ISO-8601（如 2026-09-16T00:00:00+08:00）。半开区间左闭。</p><p>参数格式：2026-09-16 00:00:00</p>
     * @param StartTime <p>查询开始时间，格式 yyyy-MM-dd HH:mm:ss，按 UTC+8 解析；也兼容带偏移的 ISO-8601（如 2026-09-16T00:00:00+08:00）。半开区间左闭。</p><p>参数格式：2026-09-16 00:00:00</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>查询结束时间，格式同 StartTime。EndTime 必须大于 StartTime，且总查询窗口不超过 24 小时。半开区间右开。</p><p>参数格式：2026-09-16 23:59:59</p> 
     * @return EndTime <p>查询结束时间，格式同 StartTime。EndTime 必须大于 StartTime，且总查询窗口不超过 24 小时。半开区间右开。</p><p>参数格式：2026-09-16 23:59:59</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>查询结束时间，格式同 StartTime。EndTime 必须大于 StartTime，且总查询窗口不超过 24 小时。半开区间右开。</p><p>参数格式：2026-09-16 23:59:59</p>
     * @param EndTime <p>查询结束时间，格式同 StartTime。EndTime 必须大于 StartTime，且总查询窗口不超过 24 小时。半开区间右开。</p><p>参数格式：2026-09-16 23:59:59</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>分页偏移量，非负整数，默认 0。当 Offset&gt;0 时必须同时传入 ResultVersion，否则报 INVALID_PARAMETER。</p> 
     * @return Offset <p>分页偏移量，非负整数，默认 0。当 Offset&gt;0 时必须同时传入 ResultVersion，否则报 INVALID_PARAMETER。</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>分页偏移量，非负整数，默认 0。当 Offset&gt;0 时必须同时传入 ResultVersion，否则报 INVALID_PARAMETER。</p>
     * @param Offset <p>分页偏移量，非负整数，默认 0。当 Offset&gt;0 时必须同时传入 ResultVersion，否则报 INVALID_PARAMETER。</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>单页返回死锁事件数量，范围 [1, 100]。默认 20。</p> 
     * @return Limit <p>单页返回死锁事件数量，范围 [1, 100]。默认 20。</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>单页返回死锁事件数量，范围 [1, 100]。默认 20。</p>
     * @param Limit <p>单页返回死锁事件数量，范围 [1, 100]。默认 20。</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>是否在响应中包含原始死锁图 XML（XmlReport）。默认 false，避免响应体过大。仅在需要绘制完整死锁环时置 true。</p> 
     * @return IncludeXml <p>是否在响应中包含原始死锁图 XML（XmlReport）。默认 false，避免响应体过大。仅在需要绘制完整死锁环时置 true。</p>
     */
    public Boolean getIncludeXml() {
        return this.IncludeXml;
    }

    /**
     * Set <p>是否在响应中包含原始死锁图 XML（XmlReport）。默认 false，避免响应体过大。仅在需要绘制完整死锁环时置 true。</p>
     * @param IncludeXml <p>是否在响应中包含原始死锁图 XML（XmlReport）。默认 false，避免响应体过大。仅在需要绘制完整死锁环时置 true。</p>
     */
    public void setIncludeXml(Boolean IncludeXml) {
        this.IncludeXml = IncludeXml;
    }

    /**
     * Get <p>结果集版本号，最大 128 字符。首次查询无需传入；翻页时必须透传首次响应中的 ResultVersion，服务端会校验结果集是否发生变化，变化时返回 RESULT_CHANGED 提示重新拉取首页。</p> 
     * @return ResultVersion <p>结果集版本号，最大 128 字符。首次查询无需传入；翻页时必须透传首次响应中的 ResultVersion，服务端会校验结果集是否发生变化，变化时返回 RESULT_CHANGED 提示重新拉取首页。</p>
     */
    public String getResultVersion() {
        return this.ResultVersion;
    }

    /**
     * Set <p>结果集版本号，最大 128 字符。首次查询无需传入；翻页时必须透传首次响应中的 ResultVersion，服务端会校验结果集是否发生变化，变化时返回 RESULT_CHANGED 提示重新拉取首页。</p>
     * @param ResultVersion <p>结果集版本号，最大 128 字符。首次查询无需传入；翻页时必须透传首次响应中的 ResultVersion，服务端会校验结果集是否发生变化，变化时返回 RESULT_CHANGED 提示重新拉取首页。</p>
     */
    public void setResultVersion(String ResultVersion) {
        this.ResultVersion = ResultVersion;
    }

    public DescribeDeadLockLogsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDeadLockLogsRequest(DescribeDeadLockLogsRequest source) {
        if (source.Product != null) {
            this.Product = new String(source.Product);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
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
        if (source.IncludeXml != null) {
            this.IncludeXml = new Boolean(source.IncludeXml);
        }
        if (source.ResultVersion != null) {
            this.ResultVersion = new String(source.ResultVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Product", this.Product);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "IncludeXml", this.IncludeXml);
        this.setParamSimple(map, prefix + "ResultVersion", this.ResultVersion);

    }
}

