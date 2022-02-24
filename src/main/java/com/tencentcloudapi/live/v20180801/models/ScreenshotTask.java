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

public class ScreenshotTask extends AbstractModel{

    /**
    * 截图任务ID。
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 推流域名。
    */
    @SerializedName("DomainName")
    @Expose
    private String DomainName;

    /**
    * 推流路径。
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
    * 流名称。
    */
    @SerializedName("StreamName")
    @Expose
    private String StreamName;

    /**
    * 任务开始时间，Unix时间戳。
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 任务结束时间，Unix时间戳。
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * 截图模板ID。
    */
    @SerializedName("TemplateId")
    @Expose
    private Long TemplateId;

    /**
    * 调用 StopScreenshotTask 停止任务时间，Unix时间戳。值为0表示未曾调用接口停止任务。
    */
    @SerializedName("Stopped")
    @Expose
    private Long Stopped;

    /**
     * Get 截图任务ID。 
     * @return TaskId 截图任务ID。
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 截图任务ID。
     * @param TaskId 截图任务ID。
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 推流域名。 
     * @return DomainName 推流域名。
     */
    public String getDomainName() {
        return this.DomainName;
    }

    /**
     * Set 推流域名。
     * @param DomainName 推流域名。
     */
    public void setDomainName(String DomainName) {
        this.DomainName = DomainName;
    }

    /**
     * Get 推流路径。 
     * @return AppName 推流路径。
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * Set 推流路径。
     * @param AppName 推流路径。
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    /**
     * Get 流名称。 
     * @return StreamName 流名称。
     */
    public String getStreamName() {
        return this.StreamName;
    }

    /**
     * Set 流名称。
     * @param StreamName 流名称。
     */
    public void setStreamName(String StreamName) {
        this.StreamName = StreamName;
    }

    /**
     * Get 任务开始时间，Unix时间戳。 
     * @return StartTime 任务开始时间，Unix时间戳。
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 任务开始时间，Unix时间戳。
     * @param StartTime 任务开始时间，Unix时间戳。
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 任务结束时间，Unix时间戳。 
     * @return EndTime 任务结束时间，Unix时间戳。
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 任务结束时间，Unix时间戳。
     * @param EndTime 任务结束时间，Unix时间戳。
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 截图模板ID。 
     * @return TemplateId 截图模板ID。
     */
    public Long getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set 截图模板ID。
     * @param TemplateId 截图模板ID。
     */
    public void setTemplateId(Long TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get 调用 StopScreenshotTask 停止任务时间，Unix时间戳。值为0表示未曾调用接口停止任务。 
     * @return Stopped 调用 StopScreenshotTask 停止任务时间，Unix时间戳。值为0表示未曾调用接口停止任务。
     */
    public Long getStopped() {
        return this.Stopped;
    }

    /**
     * Set 调用 StopScreenshotTask 停止任务时间，Unix时间戳。值为0表示未曾调用接口停止任务。
     * @param Stopped 调用 StopScreenshotTask 停止任务时间，Unix时间戳。值为0表示未曾调用接口停止任务。
     */
    public void setStopped(Long Stopped) {
        this.Stopped = Stopped;
    }

    public ScreenshotTask() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScreenshotTask(ScreenshotTask source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.DomainName != null) {
            this.DomainName = new String(source.DomainName);
        }
        if (source.AppName != null) {
            this.AppName = new String(source.AppName);
        }
        if (source.StreamName != null) {
            this.StreamName = new String(source.StreamName);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.TemplateId != null) {
            this.TemplateId = new Long(source.TemplateId);
        }
        if (source.Stopped != null) {
            this.Stopped = new Long(source.Stopped);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "DomainName", this.DomainName);
        this.setParamSimple(map, prefix + "AppName", this.AppName);
        this.setParamSimple(map, prefix + "StreamName", this.StreamName);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "Stopped", this.Stopped);

    }
}

