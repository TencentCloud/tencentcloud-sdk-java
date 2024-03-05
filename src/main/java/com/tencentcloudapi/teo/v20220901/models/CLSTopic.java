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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CLSTopic extends AbstractModel {

    /**
    * 腾讯云 CLS 日志集 ID。	
    */
    @SerializedName("LogSetId")
    @Expose
    private String LogSetId;

    /**
    * 腾讯云 CLS 日志主题 ID。
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * 腾讯云 CLS 日志集所在的地域。
    */
    @SerializedName("LogSetRegion")
    @Expose
    private String LogSetRegion;

    /**
     * Get 腾讯云 CLS 日志集 ID。	 
     * @return LogSetId 腾讯云 CLS 日志集 ID。	
     */
    public String getLogSetId() {
        return this.LogSetId;
    }

    /**
     * Set 腾讯云 CLS 日志集 ID。	
     * @param LogSetId 腾讯云 CLS 日志集 ID。	
     */
    public void setLogSetId(String LogSetId) {
        this.LogSetId = LogSetId;
    }

    /**
     * Get 腾讯云 CLS 日志主题 ID。 
     * @return TopicId 腾讯云 CLS 日志主题 ID。
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set 腾讯云 CLS 日志主题 ID。
     * @param TopicId 腾讯云 CLS 日志主题 ID。
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get 腾讯云 CLS 日志集所在的地域。 
     * @return LogSetRegion 腾讯云 CLS 日志集所在的地域。
     */
    public String getLogSetRegion() {
        return this.LogSetRegion;
    }

    /**
     * Set 腾讯云 CLS 日志集所在的地域。
     * @param LogSetRegion 腾讯云 CLS 日志集所在的地域。
     */
    public void setLogSetRegion(String LogSetRegion) {
        this.LogSetRegion = LogSetRegion;
    }

    public CLSTopic() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CLSTopic(CLSTopic source) {
        if (source.LogSetId != null) {
            this.LogSetId = new String(source.LogSetId);
        }
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.LogSetRegion != null) {
            this.LogSetRegion = new String(source.LogSetRegion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LogSetId", this.LogSetId);
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "LogSetRegion", this.LogSetRegion);

    }
}

