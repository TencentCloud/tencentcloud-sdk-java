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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateExportRequest extends AbstractModel {

    /**
    * 日志主题ID，可以通过DescribeTopics接口获取,访问日志主题ID和攻击日志主题ID方式不同，注意DescribeTopics接口使用方法
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * 日志导出数量,  最大值5000万
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * 日志导出检索语句，不支持<a href="https://cloud.tencent.com/document/product/614/44061" target="_blank">[SQL语句]</a>
    */
    @SerializedName("Query")
    @Expose
    private String Query;

    /**
    * 日志导出起始时间，毫秒时间戳
    */
    @SerializedName("From")
    @Expose
    private Long From;

    /**
    * 日志导出结束时间，毫秒时间戳
    */
    @SerializedName("To")
    @Expose
    private Long To;

    /**
    * 日志导出时间排序。desc，asc，默认为desc
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * 日志导出数据格式。json，csv，默认为json
    */
    @SerializedName("Format")
    @Expose
    private String Format;

    /**
    * 语法规则,  默认值为0。
0：Lucene语法，1：CQL语法。
    */
    @SerializedName("SyntaxRule")
    @Expose
    private Long SyntaxRule;

    /**
    * 导出字段
    */
    @SerializedName("DerivedFields")
    @Expose
    private String [] DerivedFields;

    /**
     * Get 日志主题ID，可以通过DescribeTopics接口获取,访问日志主题ID和攻击日志主题ID方式不同，注意DescribeTopics接口使用方法 
     * @return TopicId 日志主题ID，可以通过DescribeTopics接口获取,访问日志主题ID和攻击日志主题ID方式不同，注意DescribeTopics接口使用方法
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set 日志主题ID，可以通过DescribeTopics接口获取,访问日志主题ID和攻击日志主题ID方式不同，注意DescribeTopics接口使用方法
     * @param TopicId 日志主题ID，可以通过DescribeTopics接口获取,访问日志主题ID和攻击日志主题ID方式不同，注意DescribeTopics接口使用方法
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get 日志导出数量,  最大值5000万 
     * @return Count 日志导出数量,  最大值5000万
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 日志导出数量,  最大值5000万
     * @param Count 日志导出数量,  最大值5000万
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get 日志导出检索语句，不支持<a href="https://cloud.tencent.com/document/product/614/44061" target="_blank">[SQL语句]</a> 
     * @return Query 日志导出检索语句，不支持<a href="https://cloud.tencent.com/document/product/614/44061" target="_blank">[SQL语句]</a>
     */
    public String getQuery() {
        return this.Query;
    }

    /**
     * Set 日志导出检索语句，不支持<a href="https://cloud.tencent.com/document/product/614/44061" target="_blank">[SQL语句]</a>
     * @param Query 日志导出检索语句，不支持<a href="https://cloud.tencent.com/document/product/614/44061" target="_blank">[SQL语句]</a>
     */
    public void setQuery(String Query) {
        this.Query = Query;
    }

    /**
     * Get 日志导出起始时间，毫秒时间戳 
     * @return From 日志导出起始时间，毫秒时间戳
     */
    public Long getFrom() {
        return this.From;
    }

    /**
     * Set 日志导出起始时间，毫秒时间戳
     * @param From 日志导出起始时间，毫秒时间戳
     */
    public void setFrom(Long From) {
        this.From = From;
    }

    /**
     * Get 日志导出结束时间，毫秒时间戳 
     * @return To 日志导出结束时间，毫秒时间戳
     */
    public Long getTo() {
        return this.To;
    }

    /**
     * Set 日志导出结束时间，毫秒时间戳
     * @param To 日志导出结束时间，毫秒时间戳
     */
    public void setTo(Long To) {
        this.To = To;
    }

    /**
     * Get 日志导出时间排序。desc，asc，默认为desc 
     * @return Order 日志导出时间排序。desc，asc，默认为desc
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set 日志导出时间排序。desc，asc，默认为desc
     * @param Order 日志导出时间排序。desc，asc，默认为desc
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get 日志导出数据格式。json，csv，默认为json 
     * @return Format 日志导出数据格式。json，csv，默认为json
     */
    public String getFormat() {
        return this.Format;
    }

    /**
     * Set 日志导出数据格式。json，csv，默认为json
     * @param Format 日志导出数据格式。json，csv，默认为json
     */
    public void setFormat(String Format) {
        this.Format = Format;
    }

    /**
     * Get 语法规则,  默认值为0。
0：Lucene语法，1：CQL语法。 
     * @return SyntaxRule 语法规则,  默认值为0。
0：Lucene语法，1：CQL语法。
     */
    public Long getSyntaxRule() {
        return this.SyntaxRule;
    }

    /**
     * Set 语法规则,  默认值为0。
0：Lucene语法，1：CQL语法。
     * @param SyntaxRule 语法规则,  默认值为0。
0：Lucene语法，1：CQL语法。
     */
    public void setSyntaxRule(Long SyntaxRule) {
        this.SyntaxRule = SyntaxRule;
    }

    /**
     * Get 导出字段 
     * @return DerivedFields 导出字段
     */
    public String [] getDerivedFields() {
        return this.DerivedFields;
    }

    /**
     * Set 导出字段
     * @param DerivedFields 导出字段
     */
    public void setDerivedFields(String [] DerivedFields) {
        this.DerivedFields = DerivedFields;
    }

    public CreateExportRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateExportRequest(CreateExportRequest source) {
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.Query != null) {
            this.Query = new String(source.Query);
        }
        if (source.From != null) {
            this.From = new Long(source.From);
        }
        if (source.To != null) {
            this.To = new Long(source.To);
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
        if (source.Format != null) {
            this.Format = new String(source.Format);
        }
        if (source.SyntaxRule != null) {
            this.SyntaxRule = new Long(source.SyntaxRule);
        }
        if (source.DerivedFields != null) {
            this.DerivedFields = new String[source.DerivedFields.length];
            for (int i = 0; i < source.DerivedFields.length; i++) {
                this.DerivedFields[i] = new String(source.DerivedFields[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "Query", this.Query);
        this.setParamSimple(map, prefix + "From", this.From);
        this.setParamSimple(map, prefix + "To", this.To);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "Format", this.Format);
        this.setParamSimple(map, prefix + "SyntaxRule", this.SyntaxRule);
        this.setParamArraySimple(map, prefix + "DerivedFields.", this.DerivedFields);

    }
}

