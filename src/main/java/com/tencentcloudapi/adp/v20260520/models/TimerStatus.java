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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TimerStatus extends AbstractModel {

    /**
    * 失败次数
    */
    @SerializedName("FailedCount")
    @Expose
    private String FailedCount;

    /**
    * 上次触发时间
    */
    @SerializedName("LastFireTime")
    @Expose
    private String LastFireTime;

    /**
    * 最近一次会话ID
    */
    @SerializedName("LastSessionId")
    @Expose
    private String LastSessionId;

    /**
    * 下次触发时间
    */
    @SerializedName("NextFireTime")
    @Expose
    private String NextFireTime;

    /**
    * 
枚举值:
| uint | 描述 |
| --- | --- |
| 0 |  |
| 1 | 启用 |
| 2 | 暂停 |
| 3 | 一次性任务已完成 |
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 成功次数
    */
    @SerializedName("SuccessCount")
    @Expose
    private String SuccessCount;

    /**
    * 未读数量
    */
    @SerializedName("UnreadRunLogCount")
    @Expose
    private String UnreadRunLogCount;

    /**
     * Get 失败次数 
     * @return FailedCount 失败次数
     */
    public String getFailedCount() {
        return this.FailedCount;
    }

    /**
     * Set 失败次数
     * @param FailedCount 失败次数
     */
    public void setFailedCount(String FailedCount) {
        this.FailedCount = FailedCount;
    }

    /**
     * Get 上次触发时间 
     * @return LastFireTime 上次触发时间
     */
    public String getLastFireTime() {
        return this.LastFireTime;
    }

    /**
     * Set 上次触发时间
     * @param LastFireTime 上次触发时间
     */
    public void setLastFireTime(String LastFireTime) {
        this.LastFireTime = LastFireTime;
    }

    /**
     * Get 最近一次会话ID 
     * @return LastSessionId 最近一次会话ID
     */
    public String getLastSessionId() {
        return this.LastSessionId;
    }

    /**
     * Set 最近一次会话ID
     * @param LastSessionId 最近一次会话ID
     */
    public void setLastSessionId(String LastSessionId) {
        this.LastSessionId = LastSessionId;
    }

    /**
     * Get 下次触发时间 
     * @return NextFireTime 下次触发时间
     */
    public String getNextFireTime() {
        return this.NextFireTime;
    }

    /**
     * Set 下次触发时间
     * @param NextFireTime 下次触发时间
     */
    public void setNextFireTime(String NextFireTime) {
        this.NextFireTime = NextFireTime;
    }

    /**
     * Get 
枚举值:
| uint | 描述 |
| --- | --- |
| 0 |  |
| 1 | 启用 |
| 2 | 暂停 |
| 3 | 一次性任务已完成 | 
     * @return Status 
枚举值:
| uint | 描述 |
| --- | --- |
| 0 |  |
| 1 | 启用 |
| 2 | 暂停 |
| 3 | 一次性任务已完成 |
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 
枚举值:
| uint | 描述 |
| --- | --- |
| 0 |  |
| 1 | 启用 |
| 2 | 暂停 |
| 3 | 一次性任务已完成 |
     * @param Status 
枚举值:
| uint | 描述 |
| --- | --- |
| 0 |  |
| 1 | 启用 |
| 2 | 暂停 |
| 3 | 一次性任务已完成 |
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 成功次数 
     * @return SuccessCount 成功次数
     */
    public String getSuccessCount() {
        return this.SuccessCount;
    }

    /**
     * Set 成功次数
     * @param SuccessCount 成功次数
     */
    public void setSuccessCount(String SuccessCount) {
        this.SuccessCount = SuccessCount;
    }

    /**
     * Get 未读数量 
     * @return UnreadRunLogCount 未读数量
     */
    public String getUnreadRunLogCount() {
        return this.UnreadRunLogCount;
    }

    /**
     * Set 未读数量
     * @param UnreadRunLogCount 未读数量
     */
    public void setUnreadRunLogCount(String UnreadRunLogCount) {
        this.UnreadRunLogCount = UnreadRunLogCount;
    }

    public TimerStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TimerStatus(TimerStatus source) {
        if (source.FailedCount != null) {
            this.FailedCount = new String(source.FailedCount);
        }
        if (source.LastFireTime != null) {
            this.LastFireTime = new String(source.LastFireTime);
        }
        if (source.LastSessionId != null) {
            this.LastSessionId = new String(source.LastSessionId);
        }
        if (source.NextFireTime != null) {
            this.NextFireTime = new String(source.NextFireTime);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.SuccessCount != null) {
            this.SuccessCount = new String(source.SuccessCount);
        }
        if (source.UnreadRunLogCount != null) {
            this.UnreadRunLogCount = new String(source.UnreadRunLogCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FailedCount", this.FailedCount);
        this.setParamSimple(map, prefix + "LastFireTime", this.LastFireTime);
        this.setParamSimple(map, prefix + "LastSessionId", this.LastSessionId);
        this.setParamSimple(map, prefix + "NextFireTime", this.NextFireTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "SuccessCount", this.SuccessCount);
        this.setParamSimple(map, prefix + "UnreadRunLogCount", this.UnreadRunLogCount);

    }
}

