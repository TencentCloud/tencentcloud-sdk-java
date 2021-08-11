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

public class CreateAsyncContextTaskRequest extends AbstractModel{

    /**
    * 日志主题ID
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * 日志时间，单位ms
    */
    @SerializedName("Time")
    @Expose
    private Long Time;

    /**
    * 日志包序号
    */
    @SerializedName("PkgId")
    @Expose
    private String PkgId;

    /**
    * 日志包内一条日志的序号
    */
    @SerializedName("PkgLogId")
    @Expose
    private String PkgLogId;

    /**
    * 日志集ID
    */
    @SerializedName("LogsetId")
    @Expose
    private String LogsetId;

    /**
    * 异步检索任务ID
    */
    @SerializedName("AsyncSearchTaskId")
    @Expose
    private String AsyncSearchTaskId;

    /**
     * Get 日志主题ID 
     * @return TopicId 日志主题ID
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set 日志主题ID
     * @param TopicId 日志主题ID
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get 日志时间，单位ms 
     * @return Time 日志时间，单位ms
     */
    public Long getTime() {
        return this.Time;
    }

    /**
     * Set 日志时间，单位ms
     * @param Time 日志时间，单位ms
     */
    public void setTime(Long Time) {
        this.Time = Time;
    }

    /**
     * Get 日志包序号 
     * @return PkgId 日志包序号
     */
    public String getPkgId() {
        return this.PkgId;
    }

    /**
     * Set 日志包序号
     * @param PkgId 日志包序号
     */
    public void setPkgId(String PkgId) {
        this.PkgId = PkgId;
    }

    /**
     * Get 日志包内一条日志的序号 
     * @return PkgLogId 日志包内一条日志的序号
     */
    public String getPkgLogId() {
        return this.PkgLogId;
    }

    /**
     * Set 日志包内一条日志的序号
     * @param PkgLogId 日志包内一条日志的序号
     */
    public void setPkgLogId(String PkgLogId) {
        this.PkgLogId = PkgLogId;
    }

    /**
     * Get 日志集ID 
     * @return LogsetId 日志集ID
     */
    public String getLogsetId() {
        return this.LogsetId;
    }

    /**
     * Set 日志集ID
     * @param LogsetId 日志集ID
     */
    public void setLogsetId(String LogsetId) {
        this.LogsetId = LogsetId;
    }

    /**
     * Get 异步检索任务ID 
     * @return AsyncSearchTaskId 异步检索任务ID
     */
    public String getAsyncSearchTaskId() {
        return this.AsyncSearchTaskId;
    }

    /**
     * Set 异步检索任务ID
     * @param AsyncSearchTaskId 异步检索任务ID
     */
    public void setAsyncSearchTaskId(String AsyncSearchTaskId) {
        this.AsyncSearchTaskId = AsyncSearchTaskId;
    }

    public CreateAsyncContextTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAsyncContextTaskRequest(CreateAsyncContextTaskRequest source) {
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.Time != null) {
            this.Time = new Long(source.Time);
        }
        if (source.PkgId != null) {
            this.PkgId = new String(source.PkgId);
        }
        if (source.PkgLogId != null) {
            this.PkgLogId = new String(source.PkgLogId);
        }
        if (source.LogsetId != null) {
            this.LogsetId = new String(source.LogsetId);
        }
        if (source.AsyncSearchTaskId != null) {
            this.AsyncSearchTaskId = new String(source.AsyncSearchTaskId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamSimple(map, prefix + "PkgId", this.PkgId);
        this.setParamSimple(map, prefix + "PkgLogId", this.PkgLogId);
        this.setParamSimple(map, prefix + "LogsetId", this.LogsetId);
        this.setParamSimple(map, prefix + "AsyncSearchTaskId", this.AsyncSearchTaskId);

    }
}

