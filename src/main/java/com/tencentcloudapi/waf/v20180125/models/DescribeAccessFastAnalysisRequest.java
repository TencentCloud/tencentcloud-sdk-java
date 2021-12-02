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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAccessFastAnalysisRequest extends AbstractModel{

    /**
    * 客户要查询的日志主题ID，每个客户都有对应的一个主题
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * 要查询的日志的起始时间，Unix时间戳，单位ms
    */
    @SerializedName("From")
    @Expose
    private Long From;

    /**
    * 要查询的日志的结束时间，Unix时间戳，单位ms
    */
    @SerializedName("To")
    @Expose
    private Long To;

    /**
    * 查询语句，语句长度最大为4096，由于本接口是分析接口，如果无过滤条件，必须传 * 表示匹配所有，参考CLS的分析统计语句的文档
    */
    @SerializedName("Query")
    @Expose
    private String Query;

    /**
    * 需要分析统计的字段名
    */
    @SerializedName("FieldName")
    @Expose
    private String FieldName;

    /**
     * Get 客户要查询的日志主题ID，每个客户都有对应的一个主题 
     * @return TopicId 客户要查询的日志主题ID，每个客户都有对应的一个主题
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set 客户要查询的日志主题ID，每个客户都有对应的一个主题
     * @param TopicId 客户要查询的日志主题ID，每个客户都有对应的一个主题
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get 要查询的日志的起始时间，Unix时间戳，单位ms 
     * @return From 要查询的日志的起始时间，Unix时间戳，单位ms
     */
    public Long getFrom() {
        return this.From;
    }

    /**
     * Set 要查询的日志的起始时间，Unix时间戳，单位ms
     * @param From 要查询的日志的起始时间，Unix时间戳，单位ms
     */
    public void setFrom(Long From) {
        this.From = From;
    }

    /**
     * Get 要查询的日志的结束时间，Unix时间戳，单位ms 
     * @return To 要查询的日志的结束时间，Unix时间戳，单位ms
     */
    public Long getTo() {
        return this.To;
    }

    /**
     * Set 要查询的日志的结束时间，Unix时间戳，单位ms
     * @param To 要查询的日志的结束时间，Unix时间戳，单位ms
     */
    public void setTo(Long To) {
        this.To = To;
    }

    /**
     * Get 查询语句，语句长度最大为4096，由于本接口是分析接口，如果无过滤条件，必须传 * 表示匹配所有，参考CLS的分析统计语句的文档 
     * @return Query 查询语句，语句长度最大为4096，由于本接口是分析接口，如果无过滤条件，必须传 * 表示匹配所有，参考CLS的分析统计语句的文档
     */
    public String getQuery() {
        return this.Query;
    }

    /**
     * Set 查询语句，语句长度最大为4096，由于本接口是分析接口，如果无过滤条件，必须传 * 表示匹配所有，参考CLS的分析统计语句的文档
     * @param Query 查询语句，语句长度最大为4096，由于本接口是分析接口，如果无过滤条件，必须传 * 表示匹配所有，参考CLS的分析统计语句的文档
     */
    public void setQuery(String Query) {
        this.Query = Query;
    }

    /**
     * Get 需要分析统计的字段名 
     * @return FieldName 需要分析统计的字段名
     */
    public String getFieldName() {
        return this.FieldName;
    }

    /**
     * Set 需要分析统计的字段名
     * @param FieldName 需要分析统计的字段名
     */
    public void setFieldName(String FieldName) {
        this.FieldName = FieldName;
    }

    public DescribeAccessFastAnalysisRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAccessFastAnalysisRequest(DescribeAccessFastAnalysisRequest source) {
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.From != null) {
            this.From = new Long(source.From);
        }
        if (source.To != null) {
            this.To = new Long(source.To);
        }
        if (source.Query != null) {
            this.Query = new String(source.Query);
        }
        if (source.FieldName != null) {
            this.FieldName = new String(source.FieldName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "From", this.From);
        this.setParamSimple(map, prefix + "To", this.To);
        this.setParamSimple(map, prefix + "Query", this.Query);
        this.setParamSimple(map, prefix + "FieldName", this.FieldName);

    }
}

