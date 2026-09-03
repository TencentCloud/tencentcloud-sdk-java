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

public class DescribeLogContextRequest extends AbstractModel {

    /**
    * <p>要查询的日志主题Id。</p><ul><li>通过 <a href="https://cloud.tencent.com/document/product/614/56454">获取日志主题列表</a> 获取日志主题Id。</li><li>通过 <a href="https://cloud.tencent.com/document/product/614/56456">创建日志主题</a> 获取日志主题Id。</li></ul>
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * <p>日志时间,  即 <a href="https://cloud.tencent.com/document/product/614/56447">检索分析日志</a> 接口返回信息中Results结构体中的Time，需按照 UTC+8 时区将该毫秒级Unix时间戳转换为 YYYY-mm-dd HH:MM:SS.FFF 格式的字符串。</p>
    */
    @SerializedName("BTime")
    @Expose
    private String BTime;

    /**
    * <p>日志包序号，即 <a href="https://cloud.tencent.com/document/product/614/56447">检索分析日志</a> 接口返回信息中Results结构体中的PkgId。</p>
    */
    @SerializedName("PkgId")
    @Expose
    private String PkgId;

    /**
    * <p>日志包内一条日志的序号，即 <a href="https://cloud.tencent.com/document/product/614/56447">检索分析日志</a> 接口返回信息中Results结构中的PkgLogId。</p>
    */
    @SerializedName("PkgLogId")
    @Expose
    private Long PkgLogId;

    /**
    * <p>前${PrevLogs}条日志，默认值10，最大100。</p>
    */
    @SerializedName("PrevLogs")
    @Expose
    private Long PrevLogs;

    /**
    * <p>后${NextLogs}条日志，默认值10，最大100。</p>
    */
    @SerializedName("NextLogs")
    @Expose
    private Long NextLogs;

    /**
    * <p>检索语句，对日志上下文进行过滤，最大长度为12KB<br>语句由 <a href="https://cloud.tencent.com/document/product/614/47044" target="_blank">[检索条件]</a>构成，不支持SQL语句</p>
    */
    @SerializedName("Query")
    @Expose
    private String Query;

    /**
    * <p>上下文检索的开始时间，单位：毫秒级时间戳<br>注意：</p><ul><li>From为空时，表示上下文检索的开始时间不做限制</li><li>From和To非空时，From &lt; To</li></ul>
    */
    @SerializedName("From")
    @Expose
    private Long From;

    /**
    * <p>上下文检索的结束时间，单位：毫秒级时间戳。<br>注意：</p><ul><li>To为空时，表示上下文检索的结束时间不做限制</li><li>From和To非空时，From &lt; To</li></ul>
    */
    @SerializedName("To")
    @Expose
    private Long To;

    /**
     * Get <p>要查询的日志主题Id。</p><ul><li>通过 <a href="https://cloud.tencent.com/document/product/614/56454">获取日志主题列表</a> 获取日志主题Id。</li><li>通过 <a href="https://cloud.tencent.com/document/product/614/56456">创建日志主题</a> 获取日志主题Id。</li></ul> 
     * @return TopicId <p>要查询的日志主题Id。</p><ul><li>通过 <a href="https://cloud.tencent.com/document/product/614/56454">获取日志主题列表</a> 获取日志主题Id。</li><li>通过 <a href="https://cloud.tencent.com/document/product/614/56456">创建日志主题</a> 获取日志主题Id。</li></ul>
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set <p>要查询的日志主题Id。</p><ul><li>通过 <a href="https://cloud.tencent.com/document/product/614/56454">获取日志主题列表</a> 获取日志主题Id。</li><li>通过 <a href="https://cloud.tencent.com/document/product/614/56456">创建日志主题</a> 获取日志主题Id。</li></ul>
     * @param TopicId <p>要查询的日志主题Id。</p><ul><li>通过 <a href="https://cloud.tencent.com/document/product/614/56454">获取日志主题列表</a> 获取日志主题Id。</li><li>通过 <a href="https://cloud.tencent.com/document/product/614/56456">创建日志主题</a> 获取日志主题Id。</li></ul>
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get <p>日志时间,  即 <a href="https://cloud.tencent.com/document/product/614/56447">检索分析日志</a> 接口返回信息中Results结构体中的Time，需按照 UTC+8 时区将该毫秒级Unix时间戳转换为 YYYY-mm-dd HH:MM:SS.FFF 格式的字符串。</p> 
     * @return BTime <p>日志时间,  即 <a href="https://cloud.tencent.com/document/product/614/56447">检索分析日志</a> 接口返回信息中Results结构体中的Time，需按照 UTC+8 时区将该毫秒级Unix时间戳转换为 YYYY-mm-dd HH:MM:SS.FFF 格式的字符串。</p>
     */
    public String getBTime() {
        return this.BTime;
    }

    /**
     * Set <p>日志时间,  即 <a href="https://cloud.tencent.com/document/product/614/56447">检索分析日志</a> 接口返回信息中Results结构体中的Time，需按照 UTC+8 时区将该毫秒级Unix时间戳转换为 YYYY-mm-dd HH:MM:SS.FFF 格式的字符串。</p>
     * @param BTime <p>日志时间,  即 <a href="https://cloud.tencent.com/document/product/614/56447">检索分析日志</a> 接口返回信息中Results结构体中的Time，需按照 UTC+8 时区将该毫秒级Unix时间戳转换为 YYYY-mm-dd HH:MM:SS.FFF 格式的字符串。</p>
     */
    public void setBTime(String BTime) {
        this.BTime = BTime;
    }

    /**
     * Get <p>日志包序号，即 <a href="https://cloud.tencent.com/document/product/614/56447">检索分析日志</a> 接口返回信息中Results结构体中的PkgId。</p> 
     * @return PkgId <p>日志包序号，即 <a href="https://cloud.tencent.com/document/product/614/56447">检索分析日志</a> 接口返回信息中Results结构体中的PkgId。</p>
     */
    public String getPkgId() {
        return this.PkgId;
    }

    /**
     * Set <p>日志包序号，即 <a href="https://cloud.tencent.com/document/product/614/56447">检索分析日志</a> 接口返回信息中Results结构体中的PkgId。</p>
     * @param PkgId <p>日志包序号，即 <a href="https://cloud.tencent.com/document/product/614/56447">检索分析日志</a> 接口返回信息中Results结构体中的PkgId。</p>
     */
    public void setPkgId(String PkgId) {
        this.PkgId = PkgId;
    }

    /**
     * Get <p>日志包内一条日志的序号，即 <a href="https://cloud.tencent.com/document/product/614/56447">检索分析日志</a> 接口返回信息中Results结构中的PkgLogId。</p> 
     * @return PkgLogId <p>日志包内一条日志的序号，即 <a href="https://cloud.tencent.com/document/product/614/56447">检索分析日志</a> 接口返回信息中Results结构中的PkgLogId。</p>
     */
    public Long getPkgLogId() {
        return this.PkgLogId;
    }

    /**
     * Set <p>日志包内一条日志的序号，即 <a href="https://cloud.tencent.com/document/product/614/56447">检索分析日志</a> 接口返回信息中Results结构中的PkgLogId。</p>
     * @param PkgLogId <p>日志包内一条日志的序号，即 <a href="https://cloud.tencent.com/document/product/614/56447">检索分析日志</a> 接口返回信息中Results结构中的PkgLogId。</p>
     */
    public void setPkgLogId(Long PkgLogId) {
        this.PkgLogId = PkgLogId;
    }

    /**
     * Get <p>前${PrevLogs}条日志，默认值10，最大100。</p> 
     * @return PrevLogs <p>前${PrevLogs}条日志，默认值10，最大100。</p>
     */
    public Long getPrevLogs() {
        return this.PrevLogs;
    }

    /**
     * Set <p>前${PrevLogs}条日志，默认值10，最大100。</p>
     * @param PrevLogs <p>前${PrevLogs}条日志，默认值10，最大100。</p>
     */
    public void setPrevLogs(Long PrevLogs) {
        this.PrevLogs = PrevLogs;
    }

    /**
     * Get <p>后${NextLogs}条日志，默认值10，最大100。</p> 
     * @return NextLogs <p>后${NextLogs}条日志，默认值10，最大100。</p>
     */
    public Long getNextLogs() {
        return this.NextLogs;
    }

    /**
     * Set <p>后${NextLogs}条日志，默认值10，最大100。</p>
     * @param NextLogs <p>后${NextLogs}条日志，默认值10，最大100。</p>
     */
    public void setNextLogs(Long NextLogs) {
        this.NextLogs = NextLogs;
    }

    /**
     * Get <p>检索语句，对日志上下文进行过滤，最大长度为12KB<br>语句由 <a href="https://cloud.tencent.com/document/product/614/47044" target="_blank">[检索条件]</a>构成，不支持SQL语句</p> 
     * @return Query <p>检索语句，对日志上下文进行过滤，最大长度为12KB<br>语句由 <a href="https://cloud.tencent.com/document/product/614/47044" target="_blank">[检索条件]</a>构成，不支持SQL语句</p>
     */
    public String getQuery() {
        return this.Query;
    }

    /**
     * Set <p>检索语句，对日志上下文进行过滤，最大长度为12KB<br>语句由 <a href="https://cloud.tencent.com/document/product/614/47044" target="_blank">[检索条件]</a>构成，不支持SQL语句</p>
     * @param Query <p>检索语句，对日志上下文进行过滤，最大长度为12KB<br>语句由 <a href="https://cloud.tencent.com/document/product/614/47044" target="_blank">[检索条件]</a>构成，不支持SQL语句</p>
     */
    public void setQuery(String Query) {
        this.Query = Query;
    }

    /**
     * Get <p>上下文检索的开始时间，单位：毫秒级时间戳<br>注意：</p><ul><li>From为空时，表示上下文检索的开始时间不做限制</li><li>From和To非空时，From &lt; To</li></ul> 
     * @return From <p>上下文检索的开始时间，单位：毫秒级时间戳<br>注意：</p><ul><li>From为空时，表示上下文检索的开始时间不做限制</li><li>From和To非空时，From &lt; To</li></ul>
     */
    public Long getFrom() {
        return this.From;
    }

    /**
     * Set <p>上下文检索的开始时间，单位：毫秒级时间戳<br>注意：</p><ul><li>From为空时，表示上下文检索的开始时间不做限制</li><li>From和To非空时，From &lt; To</li></ul>
     * @param From <p>上下文检索的开始时间，单位：毫秒级时间戳<br>注意：</p><ul><li>From为空时，表示上下文检索的开始时间不做限制</li><li>From和To非空时，From &lt; To</li></ul>
     */
    public void setFrom(Long From) {
        this.From = From;
    }

    /**
     * Get <p>上下文检索的结束时间，单位：毫秒级时间戳。<br>注意：</p><ul><li>To为空时，表示上下文检索的结束时间不做限制</li><li>From和To非空时，From &lt; To</li></ul> 
     * @return To <p>上下文检索的结束时间，单位：毫秒级时间戳。<br>注意：</p><ul><li>To为空时，表示上下文检索的结束时间不做限制</li><li>From和To非空时，From &lt; To</li></ul>
     */
    public Long getTo() {
        return this.To;
    }

    /**
     * Set <p>上下文检索的结束时间，单位：毫秒级时间戳。<br>注意：</p><ul><li>To为空时，表示上下文检索的结束时间不做限制</li><li>From和To非空时，From &lt; To</li></ul>
     * @param To <p>上下文检索的结束时间，单位：毫秒级时间戳。<br>注意：</p><ul><li>To为空时，表示上下文检索的结束时间不做限制</li><li>From和To非空时，From &lt; To</li></ul>
     */
    public void setTo(Long To) {
        this.To = To;
    }

    public DescribeLogContextRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLogContextRequest(DescribeLogContextRequest source) {
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.BTime != null) {
            this.BTime = new String(source.BTime);
        }
        if (source.PkgId != null) {
            this.PkgId = new String(source.PkgId);
        }
        if (source.PkgLogId != null) {
            this.PkgLogId = new Long(source.PkgLogId);
        }
        if (source.PrevLogs != null) {
            this.PrevLogs = new Long(source.PrevLogs);
        }
        if (source.NextLogs != null) {
            this.NextLogs = new Long(source.NextLogs);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "BTime", this.BTime);
        this.setParamSimple(map, prefix + "PkgId", this.PkgId);
        this.setParamSimple(map, prefix + "PkgLogId", this.PkgLogId);
        this.setParamSimple(map, prefix + "PrevLogs", this.PrevLogs);
        this.setParamSimple(map, prefix + "NextLogs", this.NextLogs);
        this.setParamSimple(map, prefix + "Query", this.Query);
        this.setParamSimple(map, prefix + "From", this.From);
        this.setParamSimple(map, prefix + "To", this.To);

    }
}

