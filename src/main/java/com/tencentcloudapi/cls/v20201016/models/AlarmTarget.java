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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AlarmTarget extends AbstractModel {

    /**
    * 日志主题ID。-通过[获取日志主题列表](https://cloud.tencent.com/document/product/614/56454)获取日志主题ID
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * 查询语句。
    */
    @SerializedName("Query")
    @Expose
    private String Query;

    /**
    * 告警对象序号；从1开始递增。
    */
    @SerializedName("Number")
    @Expose
    private Long Number;

    /**
    * 查询范围起始时间相对于告警执行时间的偏移，单位为分钟，取值为非正，最大值为0，最小值为-1440。
    */
    @SerializedName("StartTimeOffset")
    @Expose
    private Long StartTimeOffset;

    /**
    * 查询范围终止时间相对于告警执行时间的偏移，单位为分钟，取值为非正，须大于StartTimeOffset，最大值为0，最小值为-1440。
    */
    @SerializedName("EndTimeOffset")
    @Expose
    private Long EndTimeOffset;

    /**
    * 日志集ID。通过[获取日志主题列表](https://cloud.tencent.com/document/product/614/56454)获取日志集ID
    */
    @SerializedName("LogsetId")
    @Expose
    private String LogsetId;

    /**
    * 检索语法规则，默认值为0。
0：Lucene语法，1：CQL语法。
详细说明参见<a href="https://cloud.tencent.com/document/product/614/47044#RetrievesConditionalRules" target="_blank">检索条件语法规则</a>
    */
    @SerializedName("SyntaxRule")
    @Expose
    private Long SyntaxRule;

    /**
     * Get 日志主题ID。-通过[获取日志主题列表](https://cloud.tencent.com/document/product/614/56454)获取日志主题ID 
     * @return TopicId 日志主题ID。-通过[获取日志主题列表](https://cloud.tencent.com/document/product/614/56454)获取日志主题ID
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set 日志主题ID。-通过[获取日志主题列表](https://cloud.tencent.com/document/product/614/56454)获取日志主题ID
     * @param TopicId 日志主题ID。-通过[获取日志主题列表](https://cloud.tencent.com/document/product/614/56454)获取日志主题ID
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get 查询语句。 
     * @return Query 查询语句。
     */
    public String getQuery() {
        return this.Query;
    }

    /**
     * Set 查询语句。
     * @param Query 查询语句。
     */
    public void setQuery(String Query) {
        this.Query = Query;
    }

    /**
     * Get 告警对象序号；从1开始递增。 
     * @return Number 告警对象序号；从1开始递增。
     */
    public Long getNumber() {
        return this.Number;
    }

    /**
     * Set 告警对象序号；从1开始递增。
     * @param Number 告警对象序号；从1开始递增。
     */
    public void setNumber(Long Number) {
        this.Number = Number;
    }

    /**
     * Get 查询范围起始时间相对于告警执行时间的偏移，单位为分钟，取值为非正，最大值为0，最小值为-1440。 
     * @return StartTimeOffset 查询范围起始时间相对于告警执行时间的偏移，单位为分钟，取值为非正，最大值为0，最小值为-1440。
     */
    public Long getStartTimeOffset() {
        return this.StartTimeOffset;
    }

    /**
     * Set 查询范围起始时间相对于告警执行时间的偏移，单位为分钟，取值为非正，最大值为0，最小值为-1440。
     * @param StartTimeOffset 查询范围起始时间相对于告警执行时间的偏移，单位为分钟，取值为非正，最大值为0，最小值为-1440。
     */
    public void setStartTimeOffset(Long StartTimeOffset) {
        this.StartTimeOffset = StartTimeOffset;
    }

    /**
     * Get 查询范围终止时间相对于告警执行时间的偏移，单位为分钟，取值为非正，须大于StartTimeOffset，最大值为0，最小值为-1440。 
     * @return EndTimeOffset 查询范围终止时间相对于告警执行时间的偏移，单位为分钟，取值为非正，须大于StartTimeOffset，最大值为0，最小值为-1440。
     */
    public Long getEndTimeOffset() {
        return this.EndTimeOffset;
    }

    /**
     * Set 查询范围终止时间相对于告警执行时间的偏移，单位为分钟，取值为非正，须大于StartTimeOffset，最大值为0，最小值为-1440。
     * @param EndTimeOffset 查询范围终止时间相对于告警执行时间的偏移，单位为分钟，取值为非正，须大于StartTimeOffset，最大值为0，最小值为-1440。
     */
    public void setEndTimeOffset(Long EndTimeOffset) {
        this.EndTimeOffset = EndTimeOffset;
    }

    /**
     * Get 日志集ID。通过[获取日志主题列表](https://cloud.tencent.com/document/product/614/56454)获取日志集ID 
     * @return LogsetId 日志集ID。通过[获取日志主题列表](https://cloud.tencent.com/document/product/614/56454)获取日志集ID
     */
    public String getLogsetId() {
        return this.LogsetId;
    }

    /**
     * Set 日志集ID。通过[获取日志主题列表](https://cloud.tencent.com/document/product/614/56454)获取日志集ID
     * @param LogsetId 日志集ID。通过[获取日志主题列表](https://cloud.tencent.com/document/product/614/56454)获取日志集ID
     */
    public void setLogsetId(String LogsetId) {
        this.LogsetId = LogsetId;
    }

    /**
     * Get 检索语法规则，默认值为0。
0：Lucene语法，1：CQL语法。
详细说明参见<a href="https://cloud.tencent.com/document/product/614/47044#RetrievesConditionalRules" target="_blank">检索条件语法规则</a> 
     * @return SyntaxRule 检索语法规则，默认值为0。
0：Lucene语法，1：CQL语法。
详细说明参见<a href="https://cloud.tencent.com/document/product/614/47044#RetrievesConditionalRules" target="_blank">检索条件语法规则</a>
     */
    public Long getSyntaxRule() {
        return this.SyntaxRule;
    }

    /**
     * Set 检索语法规则，默认值为0。
0：Lucene语法，1：CQL语法。
详细说明参见<a href="https://cloud.tencent.com/document/product/614/47044#RetrievesConditionalRules" target="_blank">检索条件语法规则</a>
     * @param SyntaxRule 检索语法规则，默认值为0。
0：Lucene语法，1：CQL语法。
详细说明参见<a href="https://cloud.tencent.com/document/product/614/47044#RetrievesConditionalRules" target="_blank">检索条件语法规则</a>
     */
    public void setSyntaxRule(Long SyntaxRule) {
        this.SyntaxRule = SyntaxRule;
    }

    public AlarmTarget() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AlarmTarget(AlarmTarget source) {
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.Query != null) {
            this.Query = new String(source.Query);
        }
        if (source.Number != null) {
            this.Number = new Long(source.Number);
        }
        if (source.StartTimeOffset != null) {
            this.StartTimeOffset = new Long(source.StartTimeOffset);
        }
        if (source.EndTimeOffset != null) {
            this.EndTimeOffset = new Long(source.EndTimeOffset);
        }
        if (source.LogsetId != null) {
            this.LogsetId = new String(source.LogsetId);
        }
        if (source.SyntaxRule != null) {
            this.SyntaxRule = new Long(source.SyntaxRule);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "Query", this.Query);
        this.setParamSimple(map, prefix + "Number", this.Number);
        this.setParamSimple(map, prefix + "StartTimeOffset", this.StartTimeOffset);
        this.setParamSimple(map, prefix + "EndTimeOffset", this.EndTimeOffset);
        this.setParamSimple(map, prefix + "LogsetId", this.LogsetId);
        this.setParamSimple(map, prefix + "SyntaxRule", this.SyntaxRule);

    }
}

