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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QueryRangeMetricRequest extends AbstractModel {

    /**
    * 指标主题ID
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * 查询语句，使用PromQL语法
    */
    @SerializedName("Query")
    @Expose
    private String Query;

    /**
    * 查询起始时间，秒级Unix时间戳
    */
    @SerializedName("Start")
    @Expose
    private Long Start;

    /**
    * 查询结束时间，秒级Unix时间戳
    */
    @SerializedName("End")
    @Expose
    private Long End;

    /**
    * 查询时间间隔，单位秒
    */
    @SerializedName("Step")
    @Expose
    private Long Step;

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
     * Get 查询起始时间，秒级Unix时间戳 
     * @return Start 查询起始时间，秒级Unix时间戳
     */
    public Long getStart() {
        return this.Start;
    }

    /**
     * Set 查询起始时间，秒级Unix时间戳
     * @param Start 查询起始时间，秒级Unix时间戳
     */
    public void setStart(Long Start) {
        this.Start = Start;
    }

    /**
     * Get 查询结束时间，秒级Unix时间戳 
     * @return End 查询结束时间，秒级Unix时间戳
     */
    public Long getEnd() {
        return this.End;
    }

    /**
     * Set 查询结束时间，秒级Unix时间戳
     * @param End 查询结束时间，秒级Unix时间戳
     */
    public void setEnd(Long End) {
        this.End = End;
    }

    /**
     * Get 查询时间间隔，单位秒 
     * @return Step 查询时间间隔，单位秒
     */
    public Long getStep() {
        return this.Step;
    }

    /**
     * Set 查询时间间隔，单位秒
     * @param Step 查询时间间隔，单位秒
     */
    public void setStep(Long Step) {
        this.Step = Step;
    }

    public QueryRangeMetricRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryRangeMetricRequest(QueryRangeMetricRequest source) {
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.Query != null) {
            this.Query = new String(source.Query);
        }
        if (source.Start != null) {
            this.Start = new Long(source.Start);
        }
        if (source.End != null) {
            this.End = new Long(source.End);
        }
        if (source.Step != null) {
            this.Step = new Long(source.Step);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "Query", this.Query);
        this.setParamSimple(map, prefix + "Start", this.Start);
        this.setParamSimple(map, prefix + "End", this.End);
        this.setParamSimple(map, prefix + "Step", this.Step);

    }
}

