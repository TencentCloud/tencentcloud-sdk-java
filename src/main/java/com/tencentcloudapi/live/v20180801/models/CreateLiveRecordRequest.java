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

public class CreateLiveRecordRequest  extends AbstractModel{

    /**
    * 流名称。
    */
    @SerializedName("StreamName")
    @Expose
    private String StreamName;

    /**
    * 直播流所属应用名称。
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
    * 您的加速域名。
    */
    @SerializedName("DomainName")
    @Expose
    private String DomainName;

    /**
    * 任务起始时间，录制视频为精彩视频时，忽略此字段。如 2017-01-01 10:10:01
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束时间，录制视频为精彩视频时，忽略此字段。如 2017-01-01 10:10:01
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 录制类型。其值为“video”,“audio”，不区分大小写，默认为“video”。
    */
    @SerializedName("RecordType")
    @Expose
    private String RecordType;

    /**
    * 录制文件格式。其值为“flv”,“hls”,”mp4”,“aac”,”mp3”，不区分大小写，默认为“flv”。
    */
    @SerializedName("FileFormat")
    @Expose
    private String FileFormat;

    /**
    * 精彩视频标志。0：普通视频【默认】；1：精彩视频。
    */
    @SerializedName("Highlight")
    @Expose
    private Integer Highlight;

    /**
    * A+B=C混流标志。0：非A+B=C混流录制【默认】；1：标示为A+B=C混流录制。
    */
    @SerializedName("MixStream")
    @Expose
    private Integer MixStream;

    /**
    * 录制流参数，当前支持以下参数： 
interval 录制分片时长，单位 秒，0 - 7200
storage_time 录制文件存储时长，单位 秒
eg. interval=3600&storage_time=7200
注：参数需要url encode。
    */
    @SerializedName("StreamParam")
    @Expose
    private String StreamParam;

    /**
     * 获取流名称。
     * @return StreamName 流名称。
     */
    public String getStreamName() {
        return this.StreamName;
    }

    /**
     * 设置流名称。
     * @param StreamName 流名称。
     */
    public void setStreamName(String StreamName) {
        this.StreamName = StreamName;
    }

    /**
     * 获取直播流所属应用名称。
     * @return AppName 直播流所属应用名称。
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * 设置直播流所属应用名称。
     * @param AppName 直播流所属应用名称。
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    /**
     * 获取您的加速域名。
     * @return DomainName 您的加速域名。
     */
    public String getDomainName() {
        return this.DomainName;
    }

    /**
     * 设置您的加速域名。
     * @param DomainName 您的加速域名。
     */
    public void setDomainName(String DomainName) {
        this.DomainName = DomainName;
    }

    /**
     * 获取任务起始时间，录制视频为精彩视频时，忽略此字段。如 2017-01-01 10:10:01
     * @return StartTime 任务起始时间，录制视频为精彩视频时，忽略此字段。如 2017-01-01 10:10:01
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * 设置任务起始时间，录制视频为精彩视频时，忽略此字段。如 2017-01-01 10:10:01
     * @param StartTime 任务起始时间，录制视频为精彩视频时，忽略此字段。如 2017-01-01 10:10:01
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * 获取结束时间，录制视频为精彩视频时，忽略此字段。如 2017-01-01 10:10:01
     * @return EndTime 结束时间，录制视频为精彩视频时，忽略此字段。如 2017-01-01 10:10:01
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * 设置结束时间，录制视频为精彩视频时，忽略此字段。如 2017-01-01 10:10:01
     * @param EndTime 结束时间，录制视频为精彩视频时，忽略此字段。如 2017-01-01 10:10:01
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * 获取录制类型。其值为“video”,“audio”，不区分大小写，默认为“video”。
     * @return RecordType 录制类型。其值为“video”,“audio”，不区分大小写，默认为“video”。
     */
    public String getRecordType() {
        return this.RecordType;
    }

    /**
     * 设置录制类型。其值为“video”,“audio”，不区分大小写，默认为“video”。
     * @param RecordType 录制类型。其值为“video”,“audio”，不区分大小写，默认为“video”。
     */
    public void setRecordType(String RecordType) {
        this.RecordType = RecordType;
    }

    /**
     * 获取录制文件格式。其值为“flv”,“hls”,”mp4”,“aac”,”mp3”，不区分大小写，默认为“flv”。
     * @return FileFormat 录制文件格式。其值为“flv”,“hls”,”mp4”,“aac”,”mp3”，不区分大小写，默认为“flv”。
     */
    public String getFileFormat() {
        return this.FileFormat;
    }

    /**
     * 设置录制文件格式。其值为“flv”,“hls”,”mp4”,“aac”,”mp3”，不区分大小写，默认为“flv”。
     * @param FileFormat 录制文件格式。其值为“flv”,“hls”,”mp4”,“aac”,”mp3”，不区分大小写，默认为“flv”。
     */
    public void setFileFormat(String FileFormat) {
        this.FileFormat = FileFormat;
    }

    /**
     * 获取精彩视频标志。0：普通视频【默认】；1：精彩视频。
     * @return Highlight 精彩视频标志。0：普通视频【默认】；1：精彩视频。
     */
    public Integer getHighlight() {
        return this.Highlight;
    }

    /**
     * 设置精彩视频标志。0：普通视频【默认】；1：精彩视频。
     * @param Highlight 精彩视频标志。0：普通视频【默认】；1：精彩视频。
     */
    public void setHighlight(Integer Highlight) {
        this.Highlight = Highlight;
    }

    /**
     * 获取A+B=C混流标志。0：非A+B=C混流录制【默认】；1：标示为A+B=C混流录制。
     * @return MixStream A+B=C混流标志。0：非A+B=C混流录制【默认】；1：标示为A+B=C混流录制。
     */
    public Integer getMixStream() {
        return this.MixStream;
    }

    /**
     * 设置A+B=C混流标志。0：非A+B=C混流录制【默认】；1：标示为A+B=C混流录制。
     * @param MixStream A+B=C混流标志。0：非A+B=C混流录制【默认】；1：标示为A+B=C混流录制。
     */
    public void setMixStream(Integer MixStream) {
        this.MixStream = MixStream;
    }

    /**
     * 获取录制流参数，当前支持以下参数： 
interval 录制分片时长，单位 秒，0 - 7200
storage_time 录制文件存储时长，单位 秒
eg. interval=3600&storage_time=7200
注：参数需要url encode。
     * @return StreamParam 录制流参数，当前支持以下参数： 
interval 录制分片时长，单位 秒，0 - 7200
storage_time 录制文件存储时长，单位 秒
eg. interval=3600&storage_time=7200
注：参数需要url encode。
     */
    public String getStreamParam() {
        return this.StreamParam;
    }

    /**
     * 设置录制流参数，当前支持以下参数： 
interval 录制分片时长，单位 秒，0 - 7200
storage_time 录制文件存储时长，单位 秒
eg. interval=3600&storage_time=7200
注：参数需要url encode。
     * @param StreamParam 录制流参数，当前支持以下参数： 
interval 录制分片时长，单位 秒，0 - 7200
storage_time 录制文件存储时长，单位 秒
eg. interval=3600&storage_time=7200
注：参数需要url encode。
     */
    public void setStreamParam(String StreamParam) {
        this.StreamParam = StreamParam;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StreamName", this.StreamName);
        this.setParamSimple(map, prefix + "AppName", this.AppName);
        this.setParamSimple(map, prefix + "DomainName", this.DomainName);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "RecordType", this.RecordType);
        this.setParamSimple(map, prefix + "FileFormat", this.FileFormat);
        this.setParamSimple(map, prefix + "Highlight", this.Highlight);
        this.setParamSimple(map, prefix + "MixStream", this.MixStream);
        this.setParamSimple(map, prefix + "StreamParam", this.StreamParam);

    }
}

