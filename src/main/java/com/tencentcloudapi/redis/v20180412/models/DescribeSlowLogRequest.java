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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSlowLogRequest extends AbstractModel{

    /**
    * 指定实例 ID。例如：crs-xjhsdj****。请登录[Redis控制台](https://console.cloud.tencent.com/redis)在实例列表复制实例 ID。

    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 预查询慢日志的起始时间。
    */
    @SerializedName("BeginTime")
    @Expose
    private String BeginTime;

    /**
    * 预查询慢日志的结束时间。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 慢查询平均执行时间阈值，单位：毫秒。
    */
    @SerializedName("MinQueryTime")
    @Expose
    private Long MinQueryTime;

    /**
    * 每个页面展示的慢查询条数，默认值为20。取值范围：[20,1000]。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 慢查询条数的偏移量，取Limit整数倍。计算公式：offset=limit*(页码-1)。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 节点所属角色。<ul><li>master：主节点。</li><li>slave：从节点。</li></ul>
    */
    @SerializedName("Role")
    @Expose
    private String Role;

    /**
     * Get 指定实例 ID。例如：crs-xjhsdj****。请登录[Redis控制台](https://console.cloud.tencent.com/redis)在实例列表复制实例 ID。
 
     * @return InstanceId 指定实例 ID。例如：crs-xjhsdj****。请登录[Redis控制台](https://console.cloud.tencent.com/redis)在实例列表复制实例 ID。

     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 指定实例 ID。例如：crs-xjhsdj****。请登录[Redis控制台](https://console.cloud.tencent.com/redis)在实例列表复制实例 ID。

     * @param InstanceId 指定实例 ID。例如：crs-xjhsdj****。请登录[Redis控制台](https://console.cloud.tencent.com/redis)在实例列表复制实例 ID。

     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 预查询慢日志的起始时间。 
     * @return BeginTime 预查询慢日志的起始时间。
     */
    public String getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set 预查询慢日志的起始时间。
     * @param BeginTime 预查询慢日志的起始时间。
     */
    public void setBeginTime(String BeginTime) {
        this.BeginTime = BeginTime;
    }

    /**
     * Get 预查询慢日志的结束时间。 
     * @return EndTime 预查询慢日志的结束时间。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 预查询慢日志的结束时间。
     * @param EndTime 预查询慢日志的结束时间。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 慢查询平均执行时间阈值，单位：毫秒。 
     * @return MinQueryTime 慢查询平均执行时间阈值，单位：毫秒。
     */
    public Long getMinQueryTime() {
        return this.MinQueryTime;
    }

    /**
     * Set 慢查询平均执行时间阈值，单位：毫秒。
     * @param MinQueryTime 慢查询平均执行时间阈值，单位：毫秒。
     */
    public void setMinQueryTime(Long MinQueryTime) {
        this.MinQueryTime = MinQueryTime;
    }

    /**
     * Get 每个页面展示的慢查询条数，默认值为20。取值范围：[20,1000]。 
     * @return Limit 每个页面展示的慢查询条数，默认值为20。取值范围：[20,1000]。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 每个页面展示的慢查询条数，默认值为20。取值范围：[20,1000]。
     * @param Limit 每个页面展示的慢查询条数，默认值为20。取值范围：[20,1000]。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 慢查询条数的偏移量，取Limit整数倍。计算公式：offset=limit*(页码-1)。 
     * @return Offset 慢查询条数的偏移量，取Limit整数倍。计算公式：offset=limit*(页码-1)。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 慢查询条数的偏移量，取Limit整数倍。计算公式：offset=limit*(页码-1)。
     * @param Offset 慢查询条数的偏移量，取Limit整数倍。计算公式：offset=limit*(页码-1)。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 节点所属角色。<ul><li>master：主节点。</li><li>slave：从节点。</li></ul> 
     * @return Role 节点所属角色。<ul><li>master：主节点。</li><li>slave：从节点。</li></ul>
     */
    public String getRole() {
        return this.Role;
    }

    /**
     * Set 节点所属角色。<ul><li>master：主节点。</li><li>slave：从节点。</li></ul>
     * @param Role 节点所属角色。<ul><li>master：主节点。</li><li>slave：从节点。</li></ul>
     */
    public void setRole(String Role) {
        this.Role = Role;
    }

    public DescribeSlowLogRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSlowLogRequest(DescribeSlowLogRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.BeginTime != null) {
            this.BeginTime = new String(source.BeginTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.MinQueryTime != null) {
            this.MinQueryTime = new Long(source.MinQueryTime);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Role != null) {
            this.Role = new String(source.Role);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "BeginTime", this.BeginTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "MinQueryTime", this.MinQueryTime);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Role", this.Role);

    }
}

