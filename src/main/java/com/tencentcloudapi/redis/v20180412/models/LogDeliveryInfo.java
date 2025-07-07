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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LogDeliveryInfo extends AbstractModel {

    /**
    * 日志投递开启状态，开启：true，关闭：false
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
    * 日志集ID。
    */
    @SerializedName("LogsetId")
    @Expose
    private String LogsetId;

    /**
    * 日志主题ID。
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * 日志集所在地域
    */
    @SerializedName("LogRegion")
    @Expose
    private String LogRegion;

    /**
     * Get 日志投递开启状态，开启：true，关闭：false 
     * @return Enabled 日志投递开启状态，开启：true，关闭：false
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set 日志投递开启状态，开启：true，关闭：false
     * @param Enabled 日志投递开启状态，开启：true，关闭：false
     */
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get 日志集ID。 
     * @return LogsetId 日志集ID。
     */
    public String getLogsetId() {
        return this.LogsetId;
    }

    /**
     * Set 日志集ID。
     * @param LogsetId 日志集ID。
     */
    public void setLogsetId(String LogsetId) {
        this.LogsetId = LogsetId;
    }

    /**
     * Get 日志主题ID。 
     * @return TopicId 日志主题ID。
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set 日志主题ID。
     * @param TopicId 日志主题ID。
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get 日志集所在地域 
     * @return LogRegion 日志集所在地域
     */
    public String getLogRegion() {
        return this.LogRegion;
    }

    /**
     * Set 日志集所在地域
     * @param LogRegion 日志集所在地域
     */
    public void setLogRegion(String LogRegion) {
        this.LogRegion = LogRegion;
    }

    public LogDeliveryInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LogDeliveryInfo(LogDeliveryInfo source) {
        if (source.Enabled != null) {
            this.Enabled = new Boolean(source.Enabled);
        }
        if (source.LogsetId != null) {
            this.LogsetId = new String(source.LogsetId);
        }
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.LogRegion != null) {
            this.LogRegion = new String(source.LogRegion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamSimple(map, prefix + "LogsetId", this.LogsetId);
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "LogRegion", this.LogRegion);

    }
}

