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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QueryMetricRequest extends AbstractModel{

    /**
    * 查询语句，使用PromQL语法	
    */
    @SerializedName("Query")
    @Expose
    private String Query;

    /**
    * 指标主题ID
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * 查询时间，秒级Unix时间戳	
    */
    @SerializedName("Time")
    @Expose
    private Long Time;

    /**
     * Get 查询语句，使用PromQL语法	 
     * @return Query 查询语句，使用PromQL语法	
     */
    public String getQuery() {
        return this.Query;
    }

    /**
     * Set 查询语句，使用PromQL语法	
     * @param Query 查询语句，使用PromQL语法	
     */
    public void setQuery(String Query) {
        this.Query = Query;
    }

    /**
     * Get 指标主题ID 
     * @return TopicId 指标主题ID
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set 指标主题ID
     * @param TopicId 指标主题ID
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get 查询时间，秒级Unix时间戳	 
     * @return Time 查询时间，秒级Unix时间戳	
     */
    public Long getTime() {
        return this.Time;
    }

    /**
     * Set 查询时间，秒级Unix时间戳	
     * @param Time 查询时间，秒级Unix时间戳	
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

