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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskStatusInfo extends AbstractModel{

    /**
    * 当前使用的源 URL。
    */
    @SerializedName("FileUrl")
    @Expose
    private String FileUrl;

    /**
    * 点播源任务的轮播次数。
    */
    @SerializedName("LoopedTimes")
    @Expose
    private Long LoopedTimes;

    /**
    * 点播源的播放偏移，单位：秒。
    */
    @SerializedName("OffsetTime")
    @Expose
    private Long OffsetTime;

    /**
    * 最新心跳上报时间。UTC时间，例如：
2022-02-11T10:00:00Z。
注意：UTC时间与北京时间相差八小时。
    */
    @SerializedName("ReportTime")
    @Expose
    private String ReportTime;

    /**
    * 实际运行状态：
active - 活跃，
inactive - 不活跃。
    */
    @SerializedName("RunStatus")
    @Expose
    private String RunStatus;

    /**
    * 点播源的文件时长，单位：秒。
    */
    @SerializedName("FileDuration")
    @Expose
    private Long FileDuration;

    /**
    * 下一进度点播文件 URL。
    */
    @SerializedName("NextFileUrl")
    @Expose
    private String NextFileUrl;

    /**
     * Get 当前使用的源 URL。 
     * @return FileUrl 当前使用的源 URL。
     */
    public String getFileUrl() {
        return this.FileUrl;
    }

    /**
     * Set 当前使用的源 URL。
     * @param FileUrl 当前使用的源 URL。
     */
    public void setFileUrl(String FileUrl) {
        this.FileUrl = FileUrl;
    }

    /**
     * Get 点播源任务的轮播次数。 
     * @return LoopedTimes 点播源任务的轮播次数。
     */
    public Long getLoopedTimes() {
        return this.LoopedTimes;
    }

    /**
     * Set 点播源任务的轮播次数。
     * @param LoopedTimes 点播源任务的轮播次数。
     */
    public void setLoopedTimes(Long LoopedTimes) {
        this.LoopedTimes = LoopedTimes;
    }

    /**
     * Get 点播源的播放偏移，单位：秒。 
     * @return OffsetTime 点播源的播放偏移，单位：秒。
     */
    public Long getOffsetTime() {
        return this.OffsetTime;
    }

    /**
     * Set 点播源的播放偏移，单位：秒。
     * @param OffsetTime 点播源的播放偏移，单位：秒。
     */
    public void setOffsetTime(Long OffsetTime) {
        this.OffsetTime = OffsetTime;
    }

    /**
     * Get 最新心跳上报时间。UTC时间，例如：
2022-02-11T10:00:00Z。
注意：UTC时间与北京时间相差八小时。 
     * @return ReportTime 最新心跳上报时间。UTC时间，例如：
2022-02-11T10:00:00Z。
注意：UTC时间与北京时间相差八小时。
     */
    public String getReportTime() {
        return this.ReportTime;
    }

    /**
     * Set 最新心跳上报时间。UTC时间，例如：
2022-02-11T10:00:00Z。
注意：UTC时间与北京时间相差八小时。
     * @param ReportTime 最新心跳上报时间。UTC时间，例如：
2022-02-11T10:00:00Z。
注意：UTC时间与北京时间相差八小时。
     */
    public void setReportTime(String ReportTime) {
        this.ReportTime = ReportTime;
    }

    /**
     * Get 实际运行状态：
active - 活跃，
inactive - 不活跃。 
     * @return RunStatus 实际运行状态：
active - 活跃，
inactive - 不活跃。
     */
    public String getRunStatus() {
        return this.RunStatus;
    }

    /**
     * Set 实际运行状态：
active - 活跃，
inactive - 不活跃。
     * @param RunStatus 实际运行状态：
active - 活跃，
inactive - 不活跃。
     */
    public void setRunStatus(String RunStatus) {
        this.RunStatus = RunStatus;
    }

    /**
     * Get 点播源的文件时长，单位：秒。 
     * @return FileDuration 点播源的文件时长，单位：秒。
     */
    public Long getFileDuration() {
        return this.FileDuration;
    }

    /**
     * Set 点播源的文件时长，单位：秒。
     * @param FileDuration 点播源的文件时长，单位：秒。
     */
    public void setFileDuration(Long FileDuration) {
        this.FileDuration = FileDuration;
    }

    /**
     * Get 下一进度点播文件 URL。 
     * @return NextFileUrl 下一进度点播文件 URL。
     */
    public String getNextFileUrl() {
        return this.NextFileUrl;
    }

    /**
     * Set 下一进度点播文件 URL。
     * @param NextFileUrl 下一进度点播文件 URL。
     */
    public void setNextFileUrl(String NextFileUrl) {
        this.NextFileUrl = NextFileUrl;
    }

    public TaskStatusInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskStatusInfo(TaskStatusInfo source) {
        if (source.FileUrl != null) {
            this.FileUrl = new String(source.FileUrl);
        }
        if (source.LoopedTimes != null) {
            this.LoopedTimes = new Long(source.LoopedTimes);
        }
        if (source.OffsetTime != null) {
            this.OffsetTime = new Long(source.OffsetTime);
        }
        if (source.ReportTime != null) {
            this.ReportTime = new String(source.ReportTime);
        }
        if (source.RunStatus != null) {
            this.RunStatus = new String(source.RunStatus);
        }
        if (source.FileDuration != null) {
            this.FileDuration = new Long(source.FileDuration);
        }
        if (source.NextFileUrl != null) {
            this.NextFileUrl = new String(source.NextFileUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileUrl", this.FileUrl);
        this.setParamSimple(map, prefix + "LoopedTimes", this.LoopedTimes);
        this.setParamSimple(map, prefix + "OffsetTime", this.OffsetTime);
        this.setParamSimple(map, prefix + "ReportTime", this.ReportTime);
        this.setParamSimple(map, prefix + "RunStatus", this.RunStatus);
        this.setParamSimple(map, prefix + "FileDuration", this.FileDuration);
        this.setParamSimple(map, prefix + "NextFileUrl", this.NextFileUrl);

    }
}

