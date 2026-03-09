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

public class GetMetricLabelValuesRequest extends AbstractModel {

    /**
    * <p>时序主题id</p>
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * <p>时序label名称</p>
    */
    @SerializedName("LabelName")
    @Expose
    private String LabelName;

    /**
    * <p>起始时间</p>
    */
    @SerializedName("Start")
    @Expose
    private Long Start;

    /**
    * <p>结束时间</p>
    */
    @SerializedName("End")
    @Expose
    private Long End;

    /**
    * <p>Label匹配规则</p>
    */
    @SerializedName("Match")
    @Expose
    private String [] Match;

    /**
     * Get <p>时序主题id</p> 
     * @return TopicId <p>时序主题id</p>
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set <p>时序主题id</p>
     * @param TopicId <p>时序主题id</p>
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get <p>时序label名称</p> 
     * @return LabelName <p>时序label名称</p>
     */
    public String getLabelName() {
        return this.LabelName;
    }

    /**
     * Set <p>时序label名称</p>
     * @param LabelName <p>时序label名称</p>
     */
    public void setLabelName(String LabelName) {
        this.LabelName = LabelName;
    }

    /**
     * Get <p>起始时间</p> 
     * @return Start <p>起始时间</p>
     */
    public Long getStart() {
        return this.Start;
    }

    /**
     * Set <p>起始时间</p>
     * @param Start <p>起始时间</p>
     */
    public void setStart(Long Start) {
        this.Start = Start;
    }

    /**
     * Get <p>结束时间</p> 
     * @return End <p>结束时间</p>
     */
    public Long getEnd() {
        return this.End;
    }

    /**
     * Set <p>结束时间</p>
     * @param End <p>结束时间</p>
     */
    public void setEnd(Long End) {
        this.End = End;
    }

    /**
     * Get <p>Label匹配规则</p> 
     * @return Match <p>Label匹配规则</p>
     */
    public String [] getMatch() {
        return this.Match;
    }

    /**
     * Set <p>Label匹配规则</p>
     * @param Match <p>Label匹配规则</p>
     */
    public void setMatch(String [] Match) {
        this.Match = Match;
    }

    public GetMetricLabelValuesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetMetricLabelValuesRequest(GetMetricLabelValuesRequest source) {
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.LabelName != null) {
            this.LabelName = new String(source.LabelName);
        }
        if (source.Start != null) {
            this.Start = new Long(source.Start);
        }
        if (source.End != null) {
            this.End = new Long(source.End);
        }
        if (source.Match != null) {
            this.Match = new String[source.Match.length];
            for (int i = 0; i < source.Match.length; i++) {
                this.Match[i] = new String(source.Match[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "LabelName", this.LabelName);
        this.setParamSimple(map, prefix + "Start", this.Start);
        this.setParamSimple(map, prefix + "End", this.End);
        this.setParamArraySimple(map, prefix + "Match.", this.Match);

    }
}

