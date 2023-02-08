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
package com.tencentcloudapi.keewidb.v20220308.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeProxySlowLogRequest extends AbstractModel{

    /**
    * 实例 ID，如：kee-6ubhgouj
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 开始时间。
    */
    @SerializedName("BeginTime")
    @Expose
    private String BeginTime;

    /**
    * 结束时间。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 慢查询平均执行时间阈值。<ul><li>单位：毫秒。</li><li>取值范围：10、20、30、40、50。</li></ul>
    */
    @SerializedName("MinQueryTime")
    @Expose
    private Long MinQueryTime;

    /**
    * 每个页面大小，即每个页面输出慢日志的数量。取值范围为：10、20、30、40、50，默认为 20。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 页面偏移量，取Limit整数倍，计算公式：offset=limit*(页码-1)。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get 实例 ID，如：kee-6ubhgouj 
     * @return InstanceId 实例 ID，如：kee-6ubhgouj
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例 ID，如：kee-6ubhgouj
     * @param InstanceId 实例 ID，如：kee-6ubhgouj
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 开始时间。 
     * @return BeginTime 开始时间。
     */
    public String getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set 开始时间。
     * @param BeginTime 开始时间。
     */
    public void setBeginTime(String BeginTime) {
        this.BeginTime = BeginTime;
    }

    /**
     * Get 结束时间。 
     * @return EndTime 结束时间。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间。
     * @param EndTime 结束时间。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 慢查询平均执行时间阈值。<ul><li>单位：毫秒。</li><li>取值范围：10、20、30、40、50。</li></ul> 
     * @return MinQueryTime 慢查询平均执行时间阈值。<ul><li>单位：毫秒。</li><li>取值范围：10、20、30、40、50。</li></ul>
     */
    public Long getMinQueryTime() {
        return this.MinQueryTime;
    }

    /**
     * Set 慢查询平均执行时间阈值。<ul><li>单位：毫秒。</li><li>取值范围：10、20、30、40、50。</li></ul>
     * @param MinQueryTime 慢查询平均执行时间阈值。<ul><li>单位：毫秒。</li><li>取值范围：10、20、30、40、50。</li></ul>
     */
    public void setMinQueryTime(Long MinQueryTime) {
        this.MinQueryTime = MinQueryTime;
    }

    /**
     * Get 每个页面大小，即每个页面输出慢日志的数量。取值范围为：10、20、30、40、50，默认为 20。 
     * @return Limit 每个页面大小，即每个页面输出慢日志的数量。取值范围为：10、20、30、40、50，默认为 20。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 每个页面大小，即每个页面输出慢日志的数量。取值范围为：10、20、30、40、50，默认为 20。
     * @param Limit 每个页面大小，即每个页面输出慢日志的数量。取值范围为：10、20、30、40、50，默认为 20。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 页面偏移量，取Limit整数倍，计算公式：offset=limit*(页码-1)。 
     * @return Offset 页面偏移量，取Limit整数倍，计算公式：offset=limit*(页码-1)。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 页面偏移量，取Limit整数倍，计算公式：offset=limit*(页码-1)。
     * @param Offset 页面偏移量，取Limit整数倍，计算公式：offset=limit*(页码-1)。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public DescribeProxySlowLogRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeProxySlowLogRequest(DescribeProxySlowLogRequest source) {
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

    }
}

