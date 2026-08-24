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

public class CreateExportRequest extends AbstractModel {

    /**
    * <p>日志主题Id</p><ul><li>通过<a href="https://cloud.tencent.com/document/product/614/56454">获取日志主题列表</a>获取日志主题Id。</li></ul>
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * <p>日志导出数量,  最大值5000万</p>
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * <p>日志导出检索语句，不支持<a href="https://cloud.tencent.com/document/product/614/44061" target="_blank">[SQL语句]</a></p>
    */
    @SerializedName("Query")
    @Expose
    private String Query;

    /**
    * <p>日志导出起始时间，毫秒时间戳</p>
    */
    @SerializedName("From")
    @Expose
    private Long From;

    /**
    * <p>日志导出结束时间，毫秒时间戳</p>
    */
    @SerializedName("To")
    @Expose
    private Long To;

    /**
    * <p>日志导出时间排序。desc，asc，默认为desc</p>
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * <p>日志导出数据格式。json，csv，默认为json</p>
    */
    @SerializedName("Format")
    @Expose
    private String Format;

    /**
    * <p>检索语法规则，默认值为1，推荐使用1 。</p><ul><li>0：Lucene语法</li><li>1：CQL语法（CLS Query Language，日志服务专用检索语法）</li></ul><p>详细说明参见<a href="https://cloud.tencent.com/document/product/614/47044#RetrievesConditionalRules" target="_blank">检索条件语法规则</a>。</p>
    */
    @SerializedName("SyntaxRule")
    @Expose
    private Long SyntaxRule;

    /**
    * <p>导出字段</p>
    */
    @SerializedName("DerivedFields")
    @Expose
    private String [] DerivedFields;

    /**
     * Get <p>日志主题Id</p><ul><li>通过<a href="https://cloud.tencent.com/document/product/614/56454">获取日志主题列表</a>获取日志主题Id。</li></ul> 
     * @return TopicId <p>日志主题Id</p><ul><li>通过<a href="https://cloud.tencent.com/document/product/614/56454">获取日志主题列表</a>获取日志主题Id。</li></ul>
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set <p>日志主题Id</p><ul><li>通过<a href="https://cloud.tencent.com/document/product/614/56454">获取日志主题列表</a>获取日志主题Id。</li></ul>
     * @param TopicId <p>日志主题Id</p><ul><li>通过<a href="https://cloud.tencent.com/document/product/614/56454">获取日志主题列表</a>获取日志主题Id。</li></ul>
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get <p>日志导出数量,  最大值5000万</p> 
     * @return Count <p>日志导出数量,  最大值5000万</p>
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set <p>日志导出数量,  最大值5000万</p>
     * @param Count <p>日志导出数量,  最大值5000万</p>
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get <p>日志导出检索语句，不支持<a href="https://cloud.tencent.com/document/product/614/44061" target="_blank">[SQL语句]</a></p> 
     * @return Query <p>日志导出检索语句，不支持<a href="https://cloud.tencent.com/document/product/614/44061" target="_blank">[SQL语句]</a></p>
     */
    public String getQuery() {
        return this.Query;
    }

    /**
     * Set <p>日志导出检索语句，不支持<a href="https://cloud.tencent.com/document/product/614/44061" target="_blank">[SQL语句]</a></p>
     * @param Query <p>日志导出检索语句，不支持<a href="https://cloud.tencent.com/document/product/614/44061" target="_blank">[SQL语句]</a></p>
     */
    public void setQuery(String Query) {
        this.Query = Query;
    }

    /**
     * Get <p>日志导出起始时间，毫秒时间戳</p> 
     * @return From <p>日志导出起始时间，毫秒时间戳</p>
     */
    public Long getFrom() {
        return this.From;
    }

    /**
     * Set <p>日志导出起始时间，毫秒时间戳</p>
     * @param From <p>日志导出起始时间，毫秒时间戳</p>
     */
    public void setFrom(Long From) {
        this.From = From;
    }

    /**
     * Get <p>日志导出结束时间，毫秒时间戳</p> 
     * @return To <p>日志导出结束时间，毫秒时间戳</p>
     */
    public Long getTo() {
        return this.To;
    }

    /**
     * Set <p>日志导出结束时间，毫秒时间戳</p>
     * @param To <p>日志导出结束时间，毫秒时间戳</p>
     */
    public void setTo(Long To) {
        this.To = To;
    }

    /**
     * Get <p>日志导出时间排序。desc，asc，默认为desc</p> 
     * @return Order <p>日志导出时间排序。desc，asc，默认为desc</p>
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set <p>日志导出时间排序。desc，asc，默认为desc</p>
     * @param Order <p>日志导出时间排序。desc，asc，默认为desc</p>
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get <p>日志导出数据格式。json，csv，默认为json</p> 
     * @return Format <p>日志导出数据格式。json，csv，默认为json</p>
     */
    public String getFormat() {
        return this.Format;
    }

    /**
     * Set <p>日志导出数据格式。json，csv，默认为json</p>
     * @param Format <p>日志导出数据格式。json，csv，默认为json</p>
     */
    public void setFormat(String Format) {
        this.Format = Format;
    }

    /**
     * Get <p>检索语法规则，默认值为1，推荐使用1 。</p><ul><li>0：Lucene语法</li><li>1：CQL语法（CLS Query Language，日志服务专用检索语法）</li></ul><p>详细说明参见<a href="https://cloud.tencent.com/document/product/614/47044#RetrievesConditionalRules" target="_blank">检索条件语法规则</a>。</p> 
     * @return SyntaxRule <p>检索语法规则，默认值为1，推荐使用1 。</p><ul><li>0：Lucene语法</li><li>1：CQL语法（CLS Query Language，日志服务专用检索语法）</li></ul><p>详细说明参见<a href="https://cloud.tencent.com/document/product/614/47044#RetrievesConditionalRules" target="_blank">检索条件语法规则</a>。</p>
     */
    public Long getSyntaxRule() {
        return this.SyntaxRule;
    }

    /**
     * Set <p>检索语法规则，默认值为1，推荐使用1 。</p><ul><li>0：Lucene语法</li><li>1：CQL语法（CLS Query Language，日志服务专用检索语法）</li></ul><p>详细说明参见<a href="https://cloud.tencent.com/document/product/614/47044#RetrievesConditionalRules" target="_blank">检索条件语法规则</a>。</p>
     * @param SyntaxRule <p>检索语法规则，默认值为1，推荐使用1 。</p><ul><li>0：Lucene语法</li><li>1：CQL语法（CLS Query Language，日志服务专用检索语法）</li></ul><p>详细说明参见<a href="https://cloud.tencent.com/document/product/614/47044#RetrievesConditionalRules" target="_blank">检索条件语法规则</a>。</p>
     */
    public void setSyntaxRule(Long SyntaxRule) {
        this.SyntaxRule = SyntaxRule;
    }

    /**
     * Get <p>导出字段</p> 
     * @return DerivedFields <p>导出字段</p>
     */
    public String [] getDerivedFields() {
        return this.DerivedFields;
    }

    /**
     * Set <p>导出字段</p>
     * @param DerivedFields <p>导出字段</p>
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

