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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeHTTPServiceCachePurgeTaskRequest extends AbstractModel {

    /**
    * <p>环境ID</p>
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

    /**
    * <p>HTTPService域名</p>
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * <p>缓存类型</p><p>枚举值：</p><ul><li>EO： EO缓存</li><li>CDN： CDN缓存</li></ul><p>默认值：EO</p>
    */
    @SerializedName("CacheType")
    @Expose
    private String CacheType;

    /**
    * <p>任务id，PurgeHTTPServiceCache返回的TaskId，可选</p>
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * <p>按刷新类型过滤</p><p>枚举值：</p><ul><li>PURGE_URL： URL 刷新</li><li>PURGE_PREFIX： 目录刷新</li><li>PURGE_HOST： Hostname 刷新</li></ul>
    */
    @SerializedName("PurgeType")
    @Expose
    private String PurgeType;

    /**
    * <p>查询开始时间，TaskId为空时，默认开始时间是7天前</p><p>参数格式：格式 YYYY-MM-DDTHH:mm:ss±HH:mmZ，时区为 UTC+0</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>查询结束时间，TaskId为空时，默认结束时间是当前</p><p>参数格式：格式 YYYY-MM-DDTHH:mm:ss±HH:mmZ，时区为 UTC+0</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>分页偏移量。默认 0</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>分页限制。默认20，最大值1000</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get <p>环境ID</p> 
     * @return EnvId <p>环境ID</p>
     */
    public String getEnvId() {
        return this.EnvId;
    }

    /**
     * Set <p>环境ID</p>
     * @param EnvId <p>环境ID</p>
     */
    public void setEnvId(String EnvId) {
        this.EnvId = EnvId;
    }

    /**
     * Get <p>HTTPService域名</p> 
     * @return Domain <p>HTTPService域名</p>
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set <p>HTTPService域名</p>
     * @param Domain <p>HTTPService域名</p>
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get <p>缓存类型</p><p>枚举值：</p><ul><li>EO： EO缓存</li><li>CDN： CDN缓存</li></ul><p>默认值：EO</p> 
     * @return CacheType <p>缓存类型</p><p>枚举值：</p><ul><li>EO： EO缓存</li><li>CDN： CDN缓存</li></ul><p>默认值：EO</p>
     */
    public String getCacheType() {
        return this.CacheType;
    }

    /**
     * Set <p>缓存类型</p><p>枚举值：</p><ul><li>EO： EO缓存</li><li>CDN： CDN缓存</li></ul><p>默认值：EO</p>
     * @param CacheType <p>缓存类型</p><p>枚举值：</p><ul><li>EO： EO缓存</li><li>CDN： CDN缓存</li></ul><p>默认值：EO</p>
     */
    public void setCacheType(String CacheType) {
        this.CacheType = CacheType;
    }

    /**
     * Get <p>任务id，PurgeHTTPServiceCache返回的TaskId，可选</p> 
     * @return TaskId <p>任务id，PurgeHTTPServiceCache返回的TaskId，可选</p>
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>任务id，PurgeHTTPServiceCache返回的TaskId，可选</p>
     * @param TaskId <p>任务id，PurgeHTTPServiceCache返回的TaskId，可选</p>
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get <p>按刷新类型过滤</p><p>枚举值：</p><ul><li>PURGE_URL： URL 刷新</li><li>PURGE_PREFIX： 目录刷新</li><li>PURGE_HOST： Hostname 刷新</li></ul> 
     * @return PurgeType <p>按刷新类型过滤</p><p>枚举值：</p><ul><li>PURGE_URL： URL 刷新</li><li>PURGE_PREFIX： 目录刷新</li><li>PURGE_HOST： Hostname 刷新</li></ul>
     */
    public String getPurgeType() {
        return this.PurgeType;
    }

    /**
     * Set <p>按刷新类型过滤</p><p>枚举值：</p><ul><li>PURGE_URL： URL 刷新</li><li>PURGE_PREFIX： 目录刷新</li><li>PURGE_HOST： Hostname 刷新</li></ul>
     * @param PurgeType <p>按刷新类型过滤</p><p>枚举值：</p><ul><li>PURGE_URL： URL 刷新</li><li>PURGE_PREFIX： 目录刷新</li><li>PURGE_HOST： Hostname 刷新</li></ul>
     */
    public void setPurgeType(String PurgeType) {
        this.PurgeType = PurgeType;
    }

    /**
     * Get <p>查询开始时间，TaskId为空时，默认开始时间是7天前</p><p>参数格式：格式 YYYY-MM-DDTHH:mm:ss±HH:mmZ，时区为 UTC+0</p> 
     * @return StartTime <p>查询开始时间，TaskId为空时，默认开始时间是7天前</p><p>参数格式：格式 YYYY-MM-DDTHH:mm:ss±HH:mmZ，时区为 UTC+0</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>查询开始时间，TaskId为空时，默认开始时间是7天前</p><p>参数格式：格式 YYYY-MM-DDTHH:mm:ss±HH:mmZ，时区为 UTC+0</p>
     * @param StartTime <p>查询开始时间，TaskId为空时，默认开始时间是7天前</p><p>参数格式：格式 YYYY-MM-DDTHH:mm:ss±HH:mmZ，时区为 UTC+0</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>查询结束时间，TaskId为空时，默认结束时间是当前</p><p>参数格式：格式 YYYY-MM-DDTHH:mm:ss±HH:mmZ，时区为 UTC+0</p> 
     * @return EndTime <p>查询结束时间，TaskId为空时，默认结束时间是当前</p><p>参数格式：格式 YYYY-MM-DDTHH:mm:ss±HH:mmZ，时区为 UTC+0</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>查询结束时间，TaskId为空时，默认结束时间是当前</p><p>参数格式：格式 YYYY-MM-DDTHH:mm:ss±HH:mmZ，时区为 UTC+0</p>
     * @param EndTime <p>查询结束时间，TaskId为空时，默认结束时间是当前</p><p>参数格式：格式 YYYY-MM-DDTHH:mm:ss±HH:mmZ，时区为 UTC+0</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>分页偏移量。默认 0</p> 
     * @return Offset <p>分页偏移量。默认 0</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>分页偏移量。默认 0</p>
     * @param Offset <p>分页偏移量。默认 0</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>分页限制。默认20，最大值1000</p> 
     * @return Limit <p>分页限制。默认20，最大值1000</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>分页限制。默认20，最大值1000</p>
     * @param Limit <p>分页限制。默认20，最大值1000</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeHTTPServiceCachePurgeTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeHTTPServiceCachePurgeTaskRequest(DescribeHTTPServiceCachePurgeTaskRequest source) {
        if (source.EnvId != null) {
            this.EnvId = new String(source.EnvId);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.CacheType != null) {
            this.CacheType = new String(source.CacheType);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.PurgeType != null) {
            this.PurgeType = new String(source.PurgeType);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvId", this.EnvId);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "CacheType", this.CacheType);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "PurgeType", this.PurgeType);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

