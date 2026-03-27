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

public class DescribeExportTasksRequest extends AbstractModel {

    /**
    * <p>日志类型。</p><p>枚举值：</p><ul><li>auditLog： 审计日志。</li></ul>
    */
    @SerializedName("LogType")
    @Expose
    private String LogType;

    /**
    * <p>每页输出的任务列表大小。</p><ul><li>默认值：20。</li><li>取值范围：[1,100]。</li></ul>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>分页偏移量。</p><ul><li>默认值：0。</li><li>取值：Limit 整数倍。计算公式：offset=limit*(页码-1)。</li></ul>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>指定查询的实例 ID。请登录<a href="https://console.cloud.tencent.com/redis">Redis 控制台</a>在实例列表复制实例 ID。</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

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
     * Get <p>每页输出的任务列表大小。</p><ul><li>默认值：20。</li><li>取值范围：[1,100]。</li></ul> 
     * @return Limit <p>每页输出的任务列表大小。</p><ul><li>默认值：20。</li><li>取值范围：[1,100]。</li></ul>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>每页输出的任务列表大小。</p><ul><li>默认值：20。</li><li>取值范围：[1,100]。</li></ul>
     * @param Limit <p>每页输出的任务列表大小。</p><ul><li>默认值：20。</li><li>取值范围：[1,100]。</li></ul>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>分页偏移量。</p><ul><li>默认值：0。</li><li>取值：Limit 整数倍。计算公式：offset=limit*(页码-1)。</li></ul> 
     * @return Offset <p>分页偏移量。</p><ul><li>默认值：0。</li><li>取值：Limit 整数倍。计算公式：offset=limit*(页码-1)。</li></ul>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>分页偏移量。</p><ul><li>默认值：0。</li><li>取值：Limit 整数倍。计算公式：offset=limit*(页码-1)。</li></ul>
     * @param Offset <p>分页偏移量。</p><ul><li>默认值：0。</li><li>取值：Limit 整数倍。计算公式：offset=limit*(页码-1)。</li></ul>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>指定查询的实例 ID。请登录<a href="https://console.cloud.tencent.com/redis">Redis 控制台</a>在实例列表复制实例 ID。</p> 
     * @return InstanceId <p>指定查询的实例 ID。请登录<a href="https://console.cloud.tencent.com/redis">Redis 控制台</a>在实例列表复制实例 ID。</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>指定查询的实例 ID。请登录<a href="https://console.cloud.tencent.com/redis">Redis 控制台</a>在实例列表复制实例 ID。</p>
     * @param InstanceId <p>指定查询的实例 ID。请登录<a href="https://console.cloud.tencent.com/redis">Redis 控制台</a>在实例列表复制实例 ID。</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    public DescribeExportTasksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeExportTasksRequest(DescribeExportTasksRequest source) {
        if (source.LogType != null) {
            this.LogType = new String(source.LogType);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LogType", this.LogType);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);

    }
}

