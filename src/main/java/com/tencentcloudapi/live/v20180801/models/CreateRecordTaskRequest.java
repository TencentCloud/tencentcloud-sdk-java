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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateRecordTaskRequest extends AbstractModel {

    /**
    * <p>流名称。</p>
    */
    @SerializedName("StreamName")
    @Expose
    private String StreamName;

    /**
    * <p>推流域名。</p>
    */
    @SerializedName("DomainName")
    @Expose
    private String DomainName;

    /**
    * <p>推流路径。</p>
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
    * <p>录制任务结束时间，Unix时间戳。设置时间必须大于StartTime及当前时间，且小于当前时间+7天。</p>
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * <p>录制任务开始时间，Unix时间戳。如果不填表示立即启动录制。EndTime - StartTime不能超过24小时。</p>
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * <p>推流类型，默认0。取值：<br>0-直播推流。<br>1-合成流，即 A+B=C 类型混流。</p>
    */
    @SerializedName("StreamType")
    @Expose
    private Long StreamType;

    /**
    * <p>录制模板ID，CreateLiveRecordTemplate 返回值。如果不填或者传入错误ID，则默认录制 HLS 格式、永久存储至 VOD 主应用下。<br>示例值：0。</p>
    */
    @SerializedName("TemplateId")
    @Expose
    private Long TemplateId;

    /**
    * <p>扩展字段，暂无定义。默认为空。</p>
    */
    @SerializedName("Extension")
    @Expose
    private String Extension;

    /**
     * Get <p>流名称。</p> 
     * @return StreamName <p>流名称。</p>
     */
    public String getStreamName() {
        return this.StreamName;
    }

    /**
     * Set <p>流名称。</p>
     * @param StreamName <p>流名称。</p>
     */
    public void setStreamName(String StreamName) {
        this.StreamName = StreamName;
    }

    /**
     * Get <p>推流域名。</p> 
     * @return DomainName <p>推流域名。</p>
     */
    public String getDomainName() {
        return this.DomainName;
    }

    /**
     * Set <p>推流域名。</p>
     * @param DomainName <p>推流域名。</p>
     */
    public void setDomainName(String DomainName) {
        this.DomainName = DomainName;
    }

    /**
     * Get <p>推流路径。</p> 
     * @return AppName <p>推流路径。</p>
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * Set <p>推流路径。</p>
     * @param AppName <p>推流路径。</p>
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    /**
     * Get <p>录制任务结束时间，Unix时间戳。设置时间必须大于StartTime及当前时间，且小于当前时间+7天。</p> 
     * @return EndTime <p>录制任务结束时间，Unix时间戳。设置时间必须大于StartTime及当前时间，且小于当前时间+7天。</p>
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>录制任务结束时间，Unix时间戳。设置时间必须大于StartTime及当前时间，且小于当前时间+7天。</p>
     * @param EndTime <p>录制任务结束时间，Unix时间戳。设置时间必须大于StartTime及当前时间，且小于当前时间+7天。</p>
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>录制任务开始时间，Unix时间戳。如果不填表示立即启动录制。EndTime - StartTime不能超过24小时。</p> 
     * @return StartTime <p>录制任务开始时间，Unix时间戳。如果不填表示立即启动录制。EndTime - StartTime不能超过24小时。</p>
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>录制任务开始时间，Unix时间戳。如果不填表示立即启动录制。EndTime - StartTime不能超过24小时。</p>
     * @param StartTime <p>录制任务开始时间，Unix时间戳。如果不填表示立即启动录制。EndTime - StartTime不能超过24小时。</p>
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>推流类型，默认0。取值：<br>0-直播推流。<br>1-合成流，即 A+B=C 类型混流。</p> 
     * @return StreamType <p>推流类型，默认0。取值：<br>0-直播推流。<br>1-合成流，即 A+B=C 类型混流。</p>
     */
    public Long getStreamType() {
        return this.StreamType;
    }

    /**
     * Set <p>推流类型，默认0。取值：<br>0-直播推流。<br>1-合成流，即 A+B=C 类型混流。</p>
     * @param StreamType <p>推流类型，默认0。取值：<br>0-直播推流。<br>1-合成流，即 A+B=C 类型混流。</p>
     */
    public void setStreamType(Long StreamType) {
        this.StreamType = StreamType;
    }

    /**
     * Get <p>录制模板ID，CreateLiveRecordTemplate 返回值。如果不填或者传入错误ID，则默认录制 HLS 格式、永久存储至 VOD 主应用下。<br>示例值：0。</p> 
     * @return TemplateId <p>录制模板ID，CreateLiveRecordTemplate 返回值。如果不填或者传入错误ID，则默认录制 HLS 格式、永久存储至 VOD 主应用下。<br>示例值：0。</p>
     */
    public Long getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set <p>录制模板ID，CreateLiveRecordTemplate 返回值。如果不填或者传入错误ID，则默认录制 HLS 格式、永久存储至 VOD 主应用下。<br>示例值：0。</p>
     * @param TemplateId <p>录制模板ID，CreateLiveRecordTemplate 返回值。如果不填或者传入错误ID，则默认录制 HLS 格式、永久存储至 VOD 主应用下。<br>示例值：0。</p>
     */
    public void setTemplateId(Long TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get <p>扩展字段，暂无定义。默认为空。</p> 
     * @return Extension <p>扩展字段，暂无定义。默认为空。</p>
     */
    public String getExtension() {
        return this.Extension;
    }

    /**
     * Set <p>扩展字段，暂无定义。默认为空。</p>
     * @param Extension <p>扩展字段，暂无定义。默认为空。</p>
     */
    public void setExtension(String Extension) {
        this.Extension = Extension;
    }

    public CreateRecordTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateRecordTaskRequest(CreateRecordTaskRequest source) {
        if (source.StreamName != null) {
            this.StreamName = new String(source.StreamName);
        }
        if (source.DomainName != null) {
            this.DomainName = new String(source.DomainName);
        }
        if (source.AppName != null) {
            this.AppName = new String(source.AppName);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.StreamType != null) {
            this.StreamType = new Long(source.StreamType);
        }
        if (source.TemplateId != null) {
            this.TemplateId = new Long(source.TemplateId);
        }
        if (source.Extension != null) {
            this.Extension = new String(source.Extension);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StreamName", this.StreamName);
        this.setParamSimple(map, prefix + "DomainName", this.DomainName);
        this.setParamSimple(map, prefix + "AppName", this.AppName);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "StreamType", this.StreamType);
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "Extension", this.Extension);

    }
}

