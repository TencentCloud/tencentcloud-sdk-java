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
package com.tencentcloudapi.cmq.v20190304.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateTopicRequest extends AbstractModel{

    /**
    * TopicName
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * MaxMsgSize
    */
    @SerializedName("MaxMsgSize")
    @Expose
    private Long MaxMsgSize;

    /**
    * FilterType
    */
    @SerializedName("FilterType")
    @Expose
    private Long FilterType;

    /**
    * MsgRetentionSeconds
    */
    @SerializedName("MsgRetentionSeconds")
    @Expose
    private Long MsgRetentionSeconds;

    /**
    * 是否开启消息轨迹标识，true表示开启，false表示不开启，不填表示不开启。
    */
    @SerializedName("Trace")
    @Expose
    private Boolean Trace;

    /**
     * Get TopicName 
     * @return TopicName TopicName
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set TopicName
     * @param TopicName TopicName
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get MaxMsgSize 
     * @return MaxMsgSize MaxMsgSize
     */
    public Long getMaxMsgSize() {
        return this.MaxMsgSize;
    }

    /**
     * Set MaxMsgSize
     * @param MaxMsgSize MaxMsgSize
     */
    public void setMaxMsgSize(Long MaxMsgSize) {
        this.MaxMsgSize = MaxMsgSize;
    }

    /**
     * Get FilterType 
     * @return FilterType FilterType
     */
    public Long getFilterType() {
        return this.FilterType;
    }

    /**
     * Set FilterType
     * @param FilterType FilterType
     */
    public void setFilterType(Long FilterType) {
        this.FilterType = FilterType;
    }

    /**
     * Get MsgRetentionSeconds 
     * @return MsgRetentionSeconds MsgRetentionSeconds
     */
    public Long getMsgRetentionSeconds() {
        return this.MsgRetentionSeconds;
    }

    /**
     * Set MsgRetentionSeconds
     * @param MsgRetentionSeconds MsgRetentionSeconds
     */
    public void setMsgRetentionSeconds(Long MsgRetentionSeconds) {
        this.MsgRetentionSeconds = MsgRetentionSeconds;
    }

    /**
     * Get 是否开启消息轨迹标识，true表示开启，false表示不开启，不填表示不开启。 
     * @return Trace 是否开启消息轨迹标识，true表示开启，false表示不开启，不填表示不开启。
     */
    public Boolean getTrace() {
        return this.Trace;
    }

    /**
     * Set 是否开启消息轨迹标识，true表示开启，false表示不开启，不填表示不开启。
     * @param Trace 是否开启消息轨迹标识，true表示开启，false表示不开启，不填表示不开启。
     */
    public void setTrace(Boolean Trace) {
        this.Trace = Trace;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamSimple(map, prefix + "MaxMsgSize", this.MaxMsgSize);
        this.setParamSimple(map, prefix + "FilterType", this.FilterType);
        this.setParamSimple(map, prefix + "MsgRetentionSeconds", this.MsgRetentionSeconds);
        this.setParamSimple(map, prefix + "Trace", this.Trace);

    }
}

