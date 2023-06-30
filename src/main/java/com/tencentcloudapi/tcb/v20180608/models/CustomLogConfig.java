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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CustomLogConfig extends AbstractModel{

    /**
    * 是否需要请求体
    */
    @SerializedName("NeedReqBodyLog")
    @Expose
    private Boolean NeedReqBodyLog;

    /**
    * 是否需要请求头
    */
    @SerializedName("NeedReqHeaderLog")
    @Expose
    private Boolean NeedReqHeaderLog;

    /**
    * 是否需要回包体
    */
    @SerializedName("NeedRspBodyLog")
    @Expose
    private Boolean NeedRspBodyLog;

    /**
    * 是否需要回包头部信息
    */
    @SerializedName("NeedRspHeaderLog")
    @Expose
    private Boolean NeedRspHeaderLog;

    /**
    * cls set信息
    */
    @SerializedName("LogSetId")
    @Expose
    private String LogSetId;

    /**
    * cls topicId
    */
    @SerializedName("LogTopicId")
    @Expose
    private String LogTopicId;

    /**
     * Get 是否需要请求体 
     * @return NeedReqBodyLog 是否需要请求体
     */
    public Boolean getNeedReqBodyLog() {
        return this.NeedReqBodyLog;
    }

    /**
     * Set 是否需要请求体
     * @param NeedReqBodyLog 是否需要请求体
     */
    public void setNeedReqBodyLog(Boolean NeedReqBodyLog) {
        this.NeedReqBodyLog = NeedReqBodyLog;
    }

    /**
     * Get 是否需要请求头 
     * @return NeedReqHeaderLog 是否需要请求头
     */
    public Boolean getNeedReqHeaderLog() {
        return this.NeedReqHeaderLog;
    }

    /**
     * Set 是否需要请求头
     * @param NeedReqHeaderLog 是否需要请求头
     */
    public void setNeedReqHeaderLog(Boolean NeedReqHeaderLog) {
        this.NeedReqHeaderLog = NeedReqHeaderLog;
    }

    /**
     * Get 是否需要回包体 
     * @return NeedRspBodyLog 是否需要回包体
     */
    public Boolean getNeedRspBodyLog() {
        return this.NeedRspBodyLog;
    }

    /**
     * Set 是否需要回包体
     * @param NeedRspBodyLog 是否需要回包体
     */
    public void setNeedRspBodyLog(Boolean NeedRspBodyLog) {
        this.NeedRspBodyLog = NeedRspBodyLog;
    }

    /**
     * Get 是否需要回包头部信息 
     * @return NeedRspHeaderLog 是否需要回包头部信息
     */
    public Boolean getNeedRspHeaderLog() {
        return this.NeedRspHeaderLog;
    }

    /**
     * Set 是否需要回包头部信息
     * @param NeedRspHeaderLog 是否需要回包头部信息
     */
    public void setNeedRspHeaderLog(Boolean NeedRspHeaderLog) {
        this.NeedRspHeaderLog = NeedRspHeaderLog;
    }

    /**
     * Get cls set信息 
     * @return LogSetId cls set信息
     */
    public String getLogSetId() {
        return this.LogSetId;
    }

    /**
     * Set cls set信息
     * @param LogSetId cls set信息
     */
    public void setLogSetId(String LogSetId) {
        this.LogSetId = LogSetId;
    }

    /**
     * Get cls topicId 
     * @return LogTopicId cls topicId
     */
    public String getLogTopicId() {
        return this.LogTopicId;
    }

    /**
     * Set cls topicId
     * @param LogTopicId cls topicId
     */
    public void setLogTopicId(String LogTopicId) {
        this.LogTopicId = LogTopicId;
    }

    public CustomLogConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CustomLogConfig(CustomLogConfig source) {
        if (source.NeedReqBodyLog != null) {
            this.NeedReqBodyLog = new Boolean(source.NeedReqBodyLog);
        }
        if (source.NeedReqHeaderLog != null) {
            this.NeedReqHeaderLog = new Boolean(source.NeedReqHeaderLog);
        }
        if (source.NeedRspBodyLog != null) {
            this.NeedRspBodyLog = new Boolean(source.NeedRspBodyLog);
        }
        if (source.NeedRspHeaderLog != null) {
            this.NeedRspHeaderLog = new Boolean(source.NeedRspHeaderLog);
        }
        if (source.LogSetId != null) {
            this.LogSetId = new String(source.LogSetId);
        }
        if (source.LogTopicId != null) {
            this.LogTopicId = new String(source.LogTopicId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NeedReqBodyLog", this.NeedReqBodyLog);
        this.setParamSimple(map, prefix + "NeedReqHeaderLog", this.NeedReqHeaderLog);
        this.setParamSimple(map, prefix + "NeedRspBodyLog", this.NeedRspBodyLog);
        this.setParamSimple(map, prefix + "NeedRspHeaderLog", this.NeedRspHeaderLog);
        this.setParamSimple(map, prefix + "LogSetId", this.LogSetId);
        this.setParamSimple(map, prefix + "LogTopicId", this.LogTopicId);

    }
}

