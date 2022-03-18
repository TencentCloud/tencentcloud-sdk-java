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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CLSNotice extends AbstractModel{

    /**
    * 地域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 日志集Id
    */
    @SerializedName("LogSetId")
    @Expose
    private String LogSetId;

    /**
    * 主题Id
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * 启停状态，可不传，默认启用。0=停用，1=启用
    */
    @SerializedName("Enable")
    @Expose
    private Long Enable;

    /**
     * Get 地域 
     * @return Region 地域
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 地域
     * @param Region 地域
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 日志集Id 
     * @return LogSetId 日志集Id
     */
    public String getLogSetId() {
        return this.LogSetId;
    }

    /**
     * Set 日志集Id
     * @param LogSetId 日志集Id
     */
    public void setLogSetId(String LogSetId) {
        this.LogSetId = LogSetId;
    }

    /**
     * Get 主题Id 
     * @return TopicId 主题Id
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set 主题Id
     * @param TopicId 主题Id
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get 启停状态，可不传，默认启用。0=停用，1=启用 
     * @return Enable 启停状态，可不传，默认启用。0=停用，1=启用
     */
    public Long getEnable() {
        return this.Enable;
    }

    /**
     * Set 启停状态，可不传，默认启用。0=停用，1=启用
     * @param Enable 启停状态，可不传，默认启用。0=停用，1=启用
     */
    public void setEnable(Long Enable) {
        this.Enable = Enable;
    }

    public CLSNotice() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CLSNotice(CLSNotice source) {
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.LogSetId != null) {
            this.LogSetId = new String(source.LogSetId);
        }
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.Enable != null) {
            this.Enable = new Long(source.Enable);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "LogSetId", this.LogSetId);
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "Enable", this.Enable);

    }
}

