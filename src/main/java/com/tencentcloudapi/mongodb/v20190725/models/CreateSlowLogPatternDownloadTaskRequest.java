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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateSlowLogPatternDownloadTaskRequest extends AbstractModel {

    /**
    * <p>实例 ID。请登录 <a href="https://console.cloud.tencent.com/mongodb">MongoDB 控制台</a>在实例列表复制实例 ID。</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>采集慢日志开始时间</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>采集慢日志结束时间</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>慢日志采集阈值</p>
    */
    @SerializedName("ThresholdMs")
    @Expose
    private Long ThresholdMs;

    /**
    * <p>慢日志类型</p>
    */
    @SerializedName("Commands")
    @Expose
    private String [] Commands;

    /**
     * Get <p>实例 ID。请登录 <a href="https://console.cloud.tencent.com/mongodb">MongoDB 控制台</a>在实例列表复制实例 ID。</p> 
     * @return InstanceId <p>实例 ID。请登录 <a href="https://console.cloud.tencent.com/mongodb">MongoDB 控制台</a>在实例列表复制实例 ID。</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例 ID。请登录 <a href="https://console.cloud.tencent.com/mongodb">MongoDB 控制台</a>在实例列表复制实例 ID。</p>
     * @param InstanceId <p>实例 ID。请登录 <a href="https://console.cloud.tencent.com/mongodb">MongoDB 控制台</a>在实例列表复制实例 ID。</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>采集慢日志开始时间</p> 
     * @return StartTime <p>采集慢日志开始时间</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>采集慢日志开始时间</p>
     * @param StartTime <p>采集慢日志开始时间</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>采集慢日志结束时间</p> 
     * @return EndTime <p>采集慢日志结束时间</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>采集慢日志结束时间</p>
     * @param EndTime <p>采集慢日志结束时间</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>慢日志采集阈值</p> 
     * @return ThresholdMs <p>慢日志采集阈值</p>
     */
    public Long getThresholdMs() {
        return this.ThresholdMs;
    }

    /**
     * Set <p>慢日志采集阈值</p>
     * @param ThresholdMs <p>慢日志采集阈值</p>
     */
    public void setThresholdMs(Long ThresholdMs) {
        this.ThresholdMs = ThresholdMs;
    }

    /**
     * Get <p>慢日志类型</p> 
     * @return Commands <p>慢日志类型</p>
     */
    public String [] getCommands() {
        return this.Commands;
    }

    /**
     * Set <p>慢日志类型</p>
     * @param Commands <p>慢日志类型</p>
     */
    public void setCommands(String [] Commands) {
        this.Commands = Commands;
    }

    public CreateSlowLogPatternDownloadTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateSlowLogPatternDownloadTaskRequest(CreateSlowLogPatternDownloadTaskRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.ThresholdMs != null) {
            this.ThresholdMs = new Long(source.ThresholdMs);
        }
        if (source.Commands != null) {
            this.Commands = new String[source.Commands.length];
            for (int i = 0; i < source.Commands.length; i++) {
                this.Commands[i] = new String(source.Commands[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "ThresholdMs", this.ThresholdMs);
        this.setParamArraySimple(map, prefix + "Commands.", this.Commands);

    }
}

