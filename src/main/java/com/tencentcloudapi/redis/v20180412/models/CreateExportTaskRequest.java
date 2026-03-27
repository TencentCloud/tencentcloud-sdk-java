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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateExportTaskRequest extends AbstractModel {

    /**
    * <p>指定实例 ID。例如：crs-xjhsdj****。请登录<a href="https://console.cloud.tencent.com/redis">Redis控制台</a>在实例列表复制实例 ID。</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>日志类型。</p><p>枚举值：</p><ul><li>auditLog： 审计日志。</li></ul>
    */
    @SerializedName("LogType")
    @Expose
    private String LogType;

    /**
    * <p>日志检索的起始时间。</p><p>参数格式：YYYY-MM-DD HH:mm:ss，例如 2026-03-06 00:00:00。返回结果中仅包含该时间点及之后的日志。</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>日志检索的结束时间。</p><p>参数格式：YYYY-MM-DD HH:mm:ss，例如 2026-03-06 23:59:59。返回结果中仅包含该时间点及之前的日志。</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>设置日志筛选字段，过滤并下载符合条件的日志。</p>
    */
    @SerializedName("LogFilter")
    @Expose
    private LogFilter [] LogFilter;

    /**
    * <p>自定义下载的日志字段，多个字段以逗号分隔，例如 &quot;timestamp,operation,user&quot;。指定后仅下载所选字段的数据。不传该参数时，默认下载所有字段。</p>
    */
    @SerializedName("ColumnFilter")
    @Expose
    private String [] ColumnFilter;

    /**
     * Get <p>指定实例 ID。例如：crs-xjhsdj****。请登录<a href="https://console.cloud.tencent.com/redis">Redis控制台</a>在实例列表复制实例 ID。</p> 
     * @return InstanceId <p>指定实例 ID。例如：crs-xjhsdj****。请登录<a href="https://console.cloud.tencent.com/redis">Redis控制台</a>在实例列表复制实例 ID。</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>指定实例 ID。例如：crs-xjhsdj****。请登录<a href="https://console.cloud.tencent.com/redis">Redis控制台</a>在实例列表复制实例 ID。</p>
     * @param InstanceId <p>指定实例 ID。例如：crs-xjhsdj****。请登录<a href="https://console.cloud.tencent.com/redis">Redis控制台</a>在实例列表复制实例 ID。</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>日志类型。</p><p>枚举值：</p><ul><li>auditLog： 审计日志。</li></ul> 
     * @return LogType <p>日志类型。</p><p>枚举值：</p><ul><li>auditLog： 审计日志。</li></ul>
     */
    public String getLogType() {
        return this.LogType;
    }

    /**
     * Set <p>日志类型。</p><p>枚举值：</p><ul><li>auditLog： 审计日志。</li></ul>
     * @param LogType <p>日志类型。</p><p>枚举值：</p><ul><li>auditLog： 审计日志。</li></ul>
     */
    public void setLogType(String LogType) {
        this.LogType = LogType;
    }

    /**
     * Get <p>日志检索的起始时间。</p><p>参数格式：YYYY-MM-DD HH:mm:ss，例如 2026-03-06 00:00:00。返回结果中仅包含该时间点及之后的日志。</p> 
     * @return StartTime <p>日志检索的起始时间。</p><p>参数格式：YYYY-MM-DD HH:mm:ss，例如 2026-03-06 00:00:00。返回结果中仅包含该时间点及之后的日志。</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>日志检索的起始时间。</p><p>参数格式：YYYY-MM-DD HH:mm:ss，例如 2026-03-06 00:00:00。返回结果中仅包含该时间点及之后的日志。</p>
     * @param StartTime <p>日志检索的起始时间。</p><p>参数格式：YYYY-MM-DD HH:mm:ss，例如 2026-03-06 00:00:00。返回结果中仅包含该时间点及之后的日志。</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>日志检索的结束时间。</p><p>参数格式：YYYY-MM-DD HH:mm:ss，例如 2026-03-06 23:59:59。返回结果中仅包含该时间点及之前的日志。</p> 
     * @return EndTime <p>日志检索的结束时间。</p><p>参数格式：YYYY-MM-DD HH:mm:ss，例如 2026-03-06 23:59:59。返回结果中仅包含该时间点及之前的日志。</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>日志检索的结束时间。</p><p>参数格式：YYYY-MM-DD HH:mm:ss，例如 2026-03-06 23:59:59。返回结果中仅包含该时间点及之前的日志。</p>
     * @param EndTime <p>日志检索的结束时间。</p><p>参数格式：YYYY-MM-DD HH:mm:ss，例如 2026-03-06 23:59:59。返回结果中仅包含该时间点及之前的日志。</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>设置日志筛选字段，过滤并下载符合条件的日志。</p> 
     * @return LogFilter <p>设置日志筛选字段，过滤并下载符合条件的日志。</p>
     */
    public LogFilter [] getLogFilter() {
        return this.LogFilter;
    }

    /**
     * Set <p>设置日志筛选字段，过滤并下载符合条件的日志。</p>
     * @param LogFilter <p>设置日志筛选字段，过滤并下载符合条件的日志。</p>
     */
    public void setLogFilter(LogFilter [] LogFilter) {
        this.LogFilter = LogFilter;
    }

    /**
     * Get <p>自定义下载的日志字段，多个字段以逗号分隔，例如 &quot;timestamp,operation,user&quot;。指定后仅下载所选字段的数据。不传该参数时，默认下载所有字段。</p> 
     * @return ColumnFilter <p>自定义下载的日志字段，多个字段以逗号分隔，例如 &quot;timestamp,operation,user&quot;。指定后仅下载所选字段的数据。不传该参数时，默认下载所有字段。</p>
     */
    public String [] getColumnFilter() {
        return this.ColumnFilter;
    }

    /**
     * Set <p>自定义下载的日志字段，多个字段以逗号分隔，例如 &quot;timestamp,operation,user&quot;。指定后仅下载所选字段的数据。不传该参数时，默认下载所有字段。</p>
     * @param ColumnFilter <p>自定义下载的日志字段，多个字段以逗号分隔，例如 &quot;timestamp,operation,user&quot;。指定后仅下载所选字段的数据。不传该参数时，默认下载所有字段。</p>
     */
    public void setColumnFilter(String [] ColumnFilter) {
        this.ColumnFilter = ColumnFilter;
    }

    public CreateExportTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateExportTaskRequest(CreateExportTaskRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.LogType != null) {
            this.LogType = new String(source.LogType);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.LogFilter != null) {
            this.LogFilter = new LogFilter[source.LogFilter.length];
            for (int i = 0; i < source.LogFilter.length; i++) {
                this.LogFilter[i] = new LogFilter(source.LogFilter[i]);
            }
        }
        if (source.ColumnFilter != null) {
            this.ColumnFilter = new String[source.ColumnFilter.length];
            for (int i = 0; i < source.ColumnFilter.length; i++) {
                this.ColumnFilter[i] = new String(source.ColumnFilter[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "LogType", this.LogType);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArrayObj(map, prefix + "LogFilter.", this.LogFilter);
        this.setParamArraySimple(map, prefix + "ColumnFilter.", this.ColumnFilter);

    }
}

