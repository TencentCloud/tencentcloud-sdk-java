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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCLSLogListV3Request extends AbstractModel {

    /**
    * <p>开始时间</p>
    */
    @SerializedName("From")
    @Expose
    private Long From;

    /**
    * <p>结束时间</p>
    */
    @SerializedName("To")
    @Expose
    private Long To;

    /**
    * <p>查询条件</p>
    */
    @SerializedName("Query")
    @Expose
    private String Query;

    /**
    * <p>语法</p>
    */
    @SerializedName("SyntaxRule")
    @Expose
    private Long SyntaxRule;

    /**
    * <p>主题</p>
    */
    @SerializedName("Topics")
    @Expose
    private LogContextInfo [] Topics;

    /**
    * <p>集团账号的成员id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>排序</p>
    */
    @SerializedName("Sort")
    @Expose
    private String Sort;

    /**
    * <p>limit</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>offset</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>采样</p>
    */
    @SerializedName("SamplingRate")
    @Expose
    private Float SamplingRate;

    /**
    * <p>是否高亮</p>
    */
    @SerializedName("HighLight")
    @Expose
    private Boolean HighLight;

    /**
    * <p>是否采用新分析</p>
    */
    @SerializedName("UseNewAnalysis")
    @Expose
    private Boolean UseNewAnalysis;

    /**
    * <p>查询优化</p>
    */
    @SerializedName("QueryOptimize")
    @Expose
    private Long QueryOptimize;

    /**
    * <p>主题id</p>
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * <p>上下文信息</p>
    */
    @SerializedName("Context")
    @Expose
    private String Context;

    /**
    * <p>查询类型</p>
    */
    @SerializedName("SubQueryTypes")
    @Expose
    private String [] SubQueryTypes;

    /**
     * Get <p>开始时间</p> 
     * @return From <p>开始时间</p>
     */
    public Long getFrom() {
        return this.From;
    }

    /**
     * Set <p>开始时间</p>
     * @param From <p>开始时间</p>
     */
    public void setFrom(Long From) {
        this.From = From;
    }

    /**
     * Get <p>结束时间</p> 
     * @return To <p>结束时间</p>
     */
    public Long getTo() {
        return this.To;
    }

    /**
     * Set <p>结束时间</p>
     * @param To <p>结束时间</p>
     */
    public void setTo(Long To) {
        this.To = To;
    }

    /**
     * Get <p>查询条件</p> 
     * @return Query <p>查询条件</p>
     */
    public String getQuery() {
        return this.Query;
    }

    /**
     * Set <p>查询条件</p>
     * @param Query <p>查询条件</p>
     */
    public void setQuery(String Query) {
        this.Query = Query;
    }

    /**
     * Get <p>语法</p> 
     * @return SyntaxRule <p>语法</p>
     */
    public Long getSyntaxRule() {
        return this.SyntaxRule;
    }

    /**
     * Set <p>语法</p>
     * @param SyntaxRule <p>语法</p>
     */
    public void setSyntaxRule(Long SyntaxRule) {
        this.SyntaxRule = SyntaxRule;
    }

    /**
     * Get <p>主题</p> 
     * @return Topics <p>主题</p>
     */
    public LogContextInfo [] getTopics() {
        return this.Topics;
    }

    /**
     * Set <p>主题</p>
     * @param Topics <p>主题</p>
     */
    public void setTopics(LogContextInfo [] Topics) {
        this.Topics = Topics;
    }

    /**
     * Get <p>集团账号的成员id</p> 
     * @return MemberId <p>集团账号的成员id</p>
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set <p>集团账号的成员id</p>
     * @param MemberId <p>集团账号的成员id</p>
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get <p>排序</p> 
     * @return Sort <p>排序</p>
     */
    public String getSort() {
        return this.Sort;
    }

    /**
     * Set <p>排序</p>
     * @param Sort <p>排序</p>
     */
    public void setSort(String Sort) {
        this.Sort = Sort;
    }

    /**
     * Get <p>limit</p> 
     * @return Limit <p>limit</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>limit</p>
     * @param Limit <p>limit</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>offset</p> 
     * @return Offset <p>offset</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>offset</p>
     * @param Offset <p>offset</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>采样</p> 
     * @return SamplingRate <p>采样</p>
     */
    public Float getSamplingRate() {
        return this.SamplingRate;
    }

    /**
     * Set <p>采样</p>
     * @param SamplingRate <p>采样</p>
     */
    public void setSamplingRate(Float SamplingRate) {
        this.SamplingRate = SamplingRate;
    }

    /**
     * Get <p>是否高亮</p> 
     * @return HighLight <p>是否高亮</p>
     */
    public Boolean getHighLight() {
        return this.HighLight;
    }

    /**
     * Set <p>是否高亮</p>
     * @param HighLight <p>是否高亮</p>
     */
    public void setHighLight(Boolean HighLight) {
        this.HighLight = HighLight;
    }

    /**
     * Get <p>是否采用新分析</p> 
     * @return UseNewAnalysis <p>是否采用新分析</p>
     */
    public Boolean getUseNewAnalysis() {
        return this.UseNewAnalysis;
    }

    /**
     * Set <p>是否采用新分析</p>
     * @param UseNewAnalysis <p>是否采用新分析</p>
     */
    public void setUseNewAnalysis(Boolean UseNewAnalysis) {
        this.UseNewAnalysis = UseNewAnalysis;
    }

    /**
     * Get <p>查询优化</p> 
     * @return QueryOptimize <p>查询优化</p>
     */
    public Long getQueryOptimize() {
        return this.QueryOptimize;
    }

    /**
     * Set <p>查询优化</p>
     * @param QueryOptimize <p>查询优化</p>
     */
    public void setQueryOptimize(Long QueryOptimize) {
        this.QueryOptimize = QueryOptimize;
    }

    /**
     * Get <p>主题id</p> 
     * @return TopicId <p>主题id</p>
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set <p>主题id</p>
     * @param TopicId <p>主题id</p>
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get <p>上下文信息</p> 
     * @return Context <p>上下文信息</p>
     */
    public String getContext() {
        return this.Context;
    }

    /**
     * Set <p>上下文信息</p>
     * @param Context <p>上下文信息</p>
     */
    public void setContext(String Context) {
        this.Context = Context;
    }

    /**
     * Get <p>查询类型</p> 
     * @return SubQueryTypes <p>查询类型</p>
     */
    public String [] getSubQueryTypes() {
        return this.SubQueryTypes;
    }

    /**
     * Set <p>查询类型</p>
     * @param SubQueryTypes <p>查询类型</p>
     */
    public void setSubQueryTypes(String [] SubQueryTypes) {
        this.SubQueryTypes = SubQueryTypes;
    }

    public DescribeCLSLogListV3Request() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCLSLogListV3Request(DescribeCLSLogListV3Request source) {
        if (source.From != null) {
            this.From = new Long(source.From);
        }
        if (source.To != null) {
            this.To = new Long(source.To);
        }
        if (source.Query != null) {
            this.Query = new String(source.Query);
        }
        if (source.SyntaxRule != null) {
            this.SyntaxRule = new Long(source.SyntaxRule);
        }
        if (source.Topics != null) {
            this.Topics = new LogContextInfo[source.Topics.length];
            for (int i = 0; i < source.Topics.length; i++) {
                this.Topics[i] = new LogContextInfo(source.Topics[i]);
            }
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.Sort != null) {
            this.Sort = new String(source.Sort);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.SamplingRate != null) {
            this.SamplingRate = new Float(source.SamplingRate);
        }
        if (source.HighLight != null) {
            this.HighLight = new Boolean(source.HighLight);
        }
        if (source.UseNewAnalysis != null) {
            this.UseNewAnalysis = new Boolean(source.UseNewAnalysis);
        }
        if (source.QueryOptimize != null) {
            this.QueryOptimize = new Long(source.QueryOptimize);
        }
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.Context != null) {
            this.Context = new String(source.Context);
        }
        if (source.SubQueryTypes != null) {
            this.SubQueryTypes = new String[source.SubQueryTypes.length];
            for (int i = 0; i < source.SubQueryTypes.length; i++) {
                this.SubQueryTypes[i] = new String(source.SubQueryTypes[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "From", this.From);
        this.setParamSimple(map, prefix + "To", this.To);
        this.setParamSimple(map, prefix + "Query", this.Query);
        this.setParamSimple(map, prefix + "SyntaxRule", this.SyntaxRule);
        this.setParamArrayObj(map, prefix + "Topics.", this.Topics);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamSimple(map, prefix + "Sort", this.Sort);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "SamplingRate", this.SamplingRate);
        this.setParamSimple(map, prefix + "HighLight", this.HighLight);
        this.setParamSimple(map, prefix + "UseNewAnalysis", this.UseNewAnalysis);
        this.setParamSimple(map, prefix + "QueryOptimize", this.QueryOptimize);
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "Context", this.Context);
        this.setParamArraySimple(map, prefix + "SubQueryTypes.", this.SubQueryTypes);

    }
}

