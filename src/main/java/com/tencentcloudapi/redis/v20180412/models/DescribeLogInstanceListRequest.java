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

public class DescribeLogInstanceListRequest extends AbstractModel {

    /**
    * <p>日志类型。</p><p>枚举值：</p><ul><li>auditLog： 审计日志。</li></ul>
    */
    @SerializedName("LogType")
    @Expose
    private String LogType;

    /**
    * <p>每页输出的任务列表大小。</p><ul><li>取值范围：[1,100]。</li><li>默认值：20。</li></ul>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>分页偏移量。默认为0。取值为 Limit 整数倍。计算公式：offset=limit*(页码-1)。</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>设置日志筛选字段，过滤并返回符合条件的日志。</p>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * <p>日志子类型。</p><p>枚举值：</p><ul><li>write： 写日志。</li><li>read： 读日志。</li><li>all： 读写日志。</li></ul>
    */
    @SerializedName("LogSubType")
    @Expose
    private String LogSubType;

    /**
    * <p>日志开关。不传查询所有日志实例。</p><ul><li>on：开启。</li><li>off：关闭。</li></ul>
    */
    @SerializedName("LogSwitch")
    @Expose
    private String LogSwitch;

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
     * Get <p>每页输出的任务列表大小。</p><ul><li>取值范围：[1,100]。</li><li>默认值：20。</li></ul> 
     * @return Limit <p>每页输出的任务列表大小。</p><ul><li>取值范围：[1,100]。</li><li>默认值：20。</li></ul>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>每页输出的任务列表大小。</p><ul><li>取值范围：[1,100]。</li><li>默认值：20。</li></ul>
     * @param Limit <p>每页输出的任务列表大小。</p><ul><li>取值范围：[1,100]。</li><li>默认值：20。</li></ul>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>分页偏移量。默认为0。取值为 Limit 整数倍。计算公式：offset=limit*(页码-1)。</p> 
     * @return Offset <p>分页偏移量。默认为0。取值为 Limit 整数倍。计算公式：offset=limit*(页码-1)。</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>分页偏移量。默认为0。取值为 Limit 整数倍。计算公式：offset=limit*(页码-1)。</p>
     * @param Offset <p>分页偏移量。默认为0。取值为 Limit 整数倍。计算公式：offset=limit*(页码-1)。</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>设置日志筛选字段，过滤并返回符合条件的日志。</p> 
     * @return Filters <p>设置日志筛选字段，过滤并返回符合条件的日志。</p>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>设置日志筛选字段，过滤并返回符合条件的日志。</p>
     * @param Filters <p>设置日志筛选字段，过滤并返回符合条件的日志。</p>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>日志子类型。</p><p>枚举值：</p><ul><li>write： 写日志。</li><li>read： 读日志。</li><li>all： 读写日志。</li></ul> 
     * @return LogSubType <p>日志子类型。</p><p>枚举值：</p><ul><li>write： 写日志。</li><li>read： 读日志。</li><li>all： 读写日志。</li></ul>
     */
    public String getLogSubType() {
        return this.LogSubType;
    }

    /**
     * Set <p>日志子类型。</p><p>枚举值：</p><ul><li>write： 写日志。</li><li>read： 读日志。</li><li>all： 读写日志。</li></ul>
     * @param LogSubType <p>日志子类型。</p><p>枚举值：</p><ul><li>write： 写日志。</li><li>read： 读日志。</li><li>all： 读写日志。</li></ul>
     */
    public void setLogSubType(String LogSubType) {
        this.LogSubType = LogSubType;
    }

    /**
     * Get <p>日志开关。不传查询所有日志实例。</p><ul><li>on：开启。</li><li>off：关闭。</li></ul> 
     * @return LogSwitch <p>日志开关。不传查询所有日志实例。</p><ul><li>on：开启。</li><li>off：关闭。</li></ul>
     */
    public String getLogSwitch() {
        return this.LogSwitch;
    }

    /**
     * Set <p>日志开关。不传查询所有日志实例。</p><ul><li>on：开启。</li><li>off：关闭。</li></ul>
     * @param LogSwitch <p>日志开关。不传查询所有日志实例。</p><ul><li>on：开启。</li><li>off：关闭。</li></ul>
     */
    public void setLogSwitch(String LogSwitch) {
        this.LogSwitch = LogSwitch;
    }

    public DescribeLogInstanceListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLogInstanceListRequest(DescribeLogInstanceListRequest source) {
        if (source.LogType != null) {
            this.LogType = new String(source.LogType);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.LogSubType != null) {
            this.LogSubType = new String(source.LogSubType);
        }
        if (source.LogSwitch != null) {
            this.LogSwitch = new String(source.LogSwitch);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LogType", this.LogType);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "LogSubType", this.LogSubType);
        this.setParamSimple(map, prefix + "LogSwitch", this.LogSwitch);

    }
}

