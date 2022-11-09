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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePurgeTasksRequest extends AbstractModel{

    /**
    * 字段已废弃，请使用Filters中的zone-id。
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 查询起始时间。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 查询结束时间。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 分页查询偏移量，默认为0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 分页查限制数目，默认值：20，最大值：1000。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 过滤条件，Filters.Values的上限为20。详细的过滤条件如下：<li>zone-id<br>   按照【<strong>站点 ID</strong>】进行过滤。zone-id形如：zone-xxx，暂不支持多值<br>   类型：String<br>   必选：否<br>   模糊查询：不支持</li><li>job-id<br>   按照【<strong>任务ID</strong>】进行过滤。job-id形如：1379afjk91u32h，暂不支持多值。<br>   类型：String<br>   必选：否<br>   模糊查询：不支持</li><li>target<br>   按照【<strong>目标资源信息</strong>】进行过滤，target形如：http://www.qq.com/1.txt或者tag1，暂不支持多值<br>   类型：String<br>   必选：否<br>   模糊查询：不支持</li><li>domains<br>   按照【<strong>域名</strong>】进行过滤，domains形如：www.qq.com<br>   类型：String<br>   必选：否<br>   模糊查询：不支持。</li><li>statuses<br>   按照【<strong>任务状态</strong>】进行过滤<br>   必选：否<br>   模糊查询：不支持。<br>   可选项：<br>   processing：处理中<br>   success：成功<br>   failed：失败<br>   timeout：超时</li><li>type<br>   按照【<strong>清除缓存类型</strong>】进行过滤，暂不支持多值。<br>   类型：String<br>   必选：否<br>   模糊查询：不支持<br>   可选项：<br>   purge_url：URL<br>   purge_prefix：前缀<br>   purge_all：全部缓存内容<br>   purge_host：Hostname<br>   purge_cache_tag：CacheTag</li>
    */
    @SerializedName("Filters")
    @Expose
    private AdvancedFilter [] Filters;

    /**
     * Get 字段已废弃，请使用Filters中的zone-id。 
     * @return ZoneId 字段已废弃，请使用Filters中的zone-id。
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 字段已废弃，请使用Filters中的zone-id。
     * @param ZoneId 字段已废弃，请使用Filters中的zone-id。
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 查询起始时间。 
     * @return StartTime 查询起始时间。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 查询起始时间。
     * @param StartTime 查询起始时间。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 查询结束时间。 
     * @return EndTime 查询结束时间。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 查询结束时间。
     * @param EndTime 查询结束时间。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 分页查询偏移量，默认为0。 
     * @return Offset 分页查询偏移量，默认为0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页查询偏移量，默认为0。
     * @param Offset 分页查询偏移量，默认为0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 分页查限制数目，默认值：20，最大值：1000。 
     * @return Limit 分页查限制数目，默认值：20，最大值：1000。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页查限制数目，默认值：20，最大值：1000。
     * @param Limit 分页查限制数目，默认值：20，最大值：1000。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 过滤条件，Filters.Values的上限为20。详细的过滤条件如下：<li>zone-id<br>   按照【<strong>站点 ID</strong>】进行过滤。zone-id形如：zone-xxx，暂不支持多值<br>   类型：String<br>   必选：否<br>   模糊查询：不支持</li><li>job-id<br>   按照【<strong>任务ID</strong>】进行过滤。job-id形如：1379afjk91u32h，暂不支持多值。<br>   类型：String<br>   必选：否<br>   模糊查询：不支持</li><li>target<br>   按照【<strong>目标资源信息</strong>】进行过滤，target形如：http://www.qq.com/1.txt或者tag1，暂不支持多值<br>   类型：String<br>   必选：否<br>   模糊查询：不支持</li><li>domains<br>   按照【<strong>域名</strong>】进行过滤，domains形如：www.qq.com<br>   类型：String<br>   必选：否<br>   模糊查询：不支持。</li><li>statuses<br>   按照【<strong>任务状态</strong>】进行过滤<br>   必选：否<br>   模糊查询：不支持。<br>   可选项：<br>   processing：处理中<br>   success：成功<br>   failed：失败<br>   timeout：超时</li><li>type<br>   按照【<strong>清除缓存类型</strong>】进行过滤，暂不支持多值。<br>   类型：String<br>   必选：否<br>   模糊查询：不支持<br>   可选项：<br>   purge_url：URL<br>   purge_prefix：前缀<br>   purge_all：全部缓存内容<br>   purge_host：Hostname<br>   purge_cache_tag：CacheTag</li> 
     * @return Filters 过滤条件，Filters.Values的上限为20。详细的过滤条件如下：<li>zone-id<br>   按照【<strong>站点 ID</strong>】进行过滤。zone-id形如：zone-xxx，暂不支持多值<br>   类型：String<br>   必选：否<br>   模糊查询：不支持</li><li>job-id<br>   按照【<strong>任务ID</strong>】进行过滤。job-id形如：1379afjk91u32h，暂不支持多值。<br>   类型：String<br>   必选：否<br>   模糊查询：不支持</li><li>target<br>   按照【<strong>目标资源信息</strong>】进行过滤，target形如：http://www.qq.com/1.txt或者tag1，暂不支持多值<br>   类型：String<br>   必选：否<br>   模糊查询：不支持</li><li>domains<br>   按照【<strong>域名</strong>】进行过滤，domains形如：www.qq.com<br>   类型：String<br>   必选：否<br>   模糊查询：不支持。</li><li>statuses<br>   按照【<strong>任务状态</strong>】进行过滤<br>   必选：否<br>   模糊查询：不支持。<br>   可选项：<br>   processing：处理中<br>   success：成功<br>   failed：失败<br>   timeout：超时</li><li>type<br>   按照【<strong>清除缓存类型</strong>】进行过滤，暂不支持多值。<br>   类型：String<br>   必选：否<br>   模糊查询：不支持<br>   可选项：<br>   purge_url：URL<br>   purge_prefix：前缀<br>   purge_all：全部缓存内容<br>   purge_host：Hostname<br>   purge_cache_tag：CacheTag</li>
     */
    public AdvancedFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件，Filters.Values的上限为20。详细的过滤条件如下：<li>zone-id<br>   按照【<strong>站点 ID</strong>】进行过滤。zone-id形如：zone-xxx，暂不支持多值<br>   类型：String<br>   必选：否<br>   模糊查询：不支持</li><li>job-id<br>   按照【<strong>任务ID</strong>】进行过滤。job-id形如：1379afjk91u32h，暂不支持多值。<br>   类型：String<br>   必选：否<br>   模糊查询：不支持</li><li>target<br>   按照【<strong>目标资源信息</strong>】进行过滤，target形如：http://www.qq.com/1.txt或者tag1，暂不支持多值<br>   类型：String<br>   必选：否<br>   模糊查询：不支持</li><li>domains<br>   按照【<strong>域名</strong>】进行过滤，domains形如：www.qq.com<br>   类型：String<br>   必选：否<br>   模糊查询：不支持。</li><li>statuses<br>   按照【<strong>任务状态</strong>】进行过滤<br>   必选：否<br>   模糊查询：不支持。<br>   可选项：<br>   processing：处理中<br>   success：成功<br>   failed：失败<br>   timeout：超时</li><li>type<br>   按照【<strong>清除缓存类型</strong>】进行过滤，暂不支持多值。<br>   类型：String<br>   必选：否<br>   模糊查询：不支持<br>   可选项：<br>   purge_url：URL<br>   purge_prefix：前缀<br>   purge_all：全部缓存内容<br>   purge_host：Hostname<br>   purge_cache_tag：CacheTag</li>
     * @param Filters 过滤条件，Filters.Values的上限为20。详细的过滤条件如下：<li>zone-id<br>   按照【<strong>站点 ID</strong>】进行过滤。zone-id形如：zone-xxx，暂不支持多值<br>   类型：String<br>   必选：否<br>   模糊查询：不支持</li><li>job-id<br>   按照【<strong>任务ID</strong>】进行过滤。job-id形如：1379afjk91u32h，暂不支持多值。<br>   类型：String<br>   必选：否<br>   模糊查询：不支持</li><li>target<br>   按照【<strong>目标资源信息</strong>】进行过滤，target形如：http://www.qq.com/1.txt或者tag1，暂不支持多值<br>   类型：String<br>   必选：否<br>   模糊查询：不支持</li><li>domains<br>   按照【<strong>域名</strong>】进行过滤，domains形如：www.qq.com<br>   类型：String<br>   必选：否<br>   模糊查询：不支持。</li><li>statuses<br>   按照【<strong>任务状态</strong>】进行过滤<br>   必选：否<br>   模糊查询：不支持。<br>   可选项：<br>   processing：处理中<br>   success：成功<br>   failed：失败<br>   timeout：超时</li><li>type<br>   按照【<strong>清除缓存类型</strong>】进行过滤，暂不支持多值。<br>   类型：String<br>   必选：否<br>   模糊查询：不支持<br>   可选项：<br>   purge_url：URL<br>   purge_prefix：前缀<br>   purge_all：全部缓存内容<br>   purge_host：Hostname<br>   purge_cache_tag：CacheTag</li>
     */
    public void setFilters(AdvancedFilter [] Filters) {
        this.Filters = Filters;
    }

    public DescribePurgeTasksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePurgeTasksRequest(DescribePurgeTasksRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
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
        if (source.Filters != null) {
            this.Filters = new AdvancedFilter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new AdvancedFilter(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

