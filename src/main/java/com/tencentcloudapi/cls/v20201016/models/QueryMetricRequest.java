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

public class QueryMetricRequest extends AbstractModel {

    /**
    * 查询语句，使用PromQL语法	
- 参考 [语法规则](https://cloud.tencent.com/document/product/614/90334) 文档
    */
    @SerializedName("Query")
    @Expose
    private String Query;

    /**
    * 指标主题ID
- 通过[获取日志主题列表](https://cloud.tencent.com/document/product/614/56454)获取日志主题Id。
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * 查询时间，秒级Unix时间戳。为空时代表当前时间戳。

    */
    @SerializedName("Time")
    @Expose
    private Long Time;

    /**
     * Get 查询语句，使用PromQL语法	
- 参考 [语法规则](https://cloud.tencent.com/document/product/614/90334) 文档 
     * @return Query 查询语句，使用PromQL语法	
- 参考 [语法规则](https://cloud.tencent.com/document/product/614/90334) 文档
     */
    public String getQuery() {
        return this.Query;
    }

    /**
     * Set 查询语句，使用PromQL语法	
- 参考 [语法规则](https://cloud.tencent.com/document/product/614/90334) 文档
     * @param Query 查询语句，使用PromQL语法	
- 参考 [语法规则](https://cloud.tencent.com/document/product/614/90334) 文档
     */
    public void setQuery(String Query) {
        this.Query = Query;
    }

    /**
     * Get 指标主题ID
- 通过[获取日志主题列表](https://cloud.tencent.com/document/product/614/56454)获取日志主题Id。 
     * @return TopicId 指标主题ID
- 通过[获取日志主题列表](https://cloud.tencent.com/document/product/614/56454)获取日志主题Id。
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set 指标主题ID
- 通过[获取日志主题列表](https://cloud.tencent.com/document/product/614/56454)获取日志主题Id。
     * @param TopicId 指标主题ID
- 通过[获取日志主题列表](https://cloud.tencent.com/document/product/614/56454)获取日志主题Id。
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get 查询时间，秒级Unix时间戳。为空时代表当前时间戳。
 
     * @return Time 查询时间，秒级Unix时间戳。为空时代表当前时间戳。

     */
    public Long getTime() {
        return this.Time;
    }

    /**
     * Set 查询时间，秒级Unix时间戳。为空时代表当前时间戳。

     * @param Time 查询时间，秒级Unix时间戳。为空时代表当前时间戳。

     */
    public void setTime(Long Time) {
        this.Time = Time;
    }

    public QueryMetricRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryMetricRequest(QueryMetricRequest source) {
        if (source.Query != null) {
            this.Query = new String(source.Query);
        }
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.Time != null) {
            this.Time = new Long(source.Time);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Query", this.Query);
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "Time", this.Time);

    }
}

