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

public class CreateRecordTaskRequest extends AbstractModel{

    /**
    * 流名称。
    */
    @SerializedName("StreamName")
    @Expose
    private String StreamName;

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
    * 录制任务结束时间，Unix时间戳。设置时间必须大于StartTime，且EndTime - StartTime不能超过24小时。
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * 录制任务开始时间，Unix时间戳。如果不填表示立即启动录制。不超过从当前时间开始6天之内的时间。
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 推流类型，默认0。取值：
0-直播推流。
1-合成流，即 A+B=C 类型混流。
    */
    @SerializedName("StreamType")
    @Expose
    private Long StreamType;

    /**
    * 录制模板ID，CreateLiveRecordTemplate 返回值。如果不填或者传入错误ID，则默认录制HLS格式、永久存储。
    */
    @SerializedName("TemplateId")
    @Expose
    private Long TemplateId;

    /**
    * 扩展字段，暂无定义。默认为空。
    */
    @SerializedName("Extension")
    @Expose
    private String Extension;

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
     * Get 录制任务结束时间，Unix时间戳。设置时间必须大于StartTime，且EndTime - StartTime不能超过24小时。 
     * @return EndTime 录制任务结束时间，Unix时间戳。设置时间必须大于StartTime，且EndTime - StartTime不能超过24小时。
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 录制任务结束时间，Unix时间戳。设置时间必须大于StartTime，且EndTime - StartTime不能超过24小时。
     * @param EndTime 录制任务结束时间，Unix时间戳。设置时间必须大于StartTime，且EndTime - StartTime不能超过24小时。
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 录制任务开始时间，Unix时间戳。如果不填表示立即启动录制。不超过从当前时间开始6天之内的时间。 
     * @return StartTime 录制任务开始时间，Unix时间戳。如果不填表示立即启动录制。不超过从当前时间开始6天之内的时间。
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 录制任务开始时间，Unix时间戳。如果不填表示立即启动录制。不超过从当前时间开始6天之内的时间。
     * @param StartTime 录制任务开始时间，Unix时间戳。如果不填表示立即启动录制。不超过从当前时间开始6天之内的时间。
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 推流类型，默认0。取值：
0-直播推流。
1-合成流，即 A+B=C 类型混流。 
     * @return StreamType 推流类型，默认0。取值：
0-直播推流。
1-合成流，即 A+B=C 类型混流。
     */
    public Long getStreamType() {
        return this.StreamType;
    }

    /**
     * Set 推流类型，默认0。取值：
0-直播推流。
1-合成流，即 A+B=C 类型混流。
     * @param StreamType 推流类型，默认0。取值：
0-直播推流。
1-合成流，即 A+B=C 类型混流。
     */
    public void setStreamType(Long StreamType) {
        this.StreamType = StreamType;
    }

    /**
     * Get 录制模板ID，CreateLiveRecordTemplate 返回值。如果不填或者传入错误ID，则默认录制HLS格式、永久存储。 
     * @return TemplateId 录制模板ID，CreateLiveRecordTemplate 返回值。如果不填或者传入错误ID，则默认录制HLS格式、永久存储。
     */
    public Long getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set 录制模板ID，CreateLiveRecordTemplate 返回值。如果不填或者传入错误ID，则默认录制HLS格式、永久存储。
     * @param TemplateId 录制模板ID，CreateLiveRecordTemplate 返回值。如果不填或者传入错误ID，则默认录制HLS格式、永久存储。
     */
    public void setTemplateId(Long TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get 扩展字段，暂无定义。默认为空。 
     * @return Extension 扩展字段，暂无定义。默认为空。
     */
    public String getExtension() {
        return this.Extension;
    }

    /**
     * Set 扩展字段，暂无定义。默认为空。
     * @param Extension 扩展字段，暂无定义。默认为空。
     */
    public void setExtension(String Extension) {
        this.Extension = Extension;
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

