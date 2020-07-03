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

public class CreateLiveRecordRequest extends AbstractModel{

    /**
    * 流名称。
    */
    @SerializedName("StreamName")
    @Expose
    private String StreamName;

    /**
    * 推流路径，与推流和播放地址中的 AppName保持一致，默认为 live。
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
    * 推流域名。多域名推流必须设置。
    */
    @SerializedName("DomainName")
    @Expose
    private String DomainName;

    /**
    * 录制开始时间。中国标准时间，需要 URLEncode(rfc3986)。如 2017-01-01 10:10:01，编码为：2017-01-01+10%3a10%3a01。
定时录制模式，必须设置该字段；实时视频录制模式，忽略该字段。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 录制结束时间。中国标准时间，需要 URLEncode(rfc3986)。如 2017-01-01 10:30:01，编码为：2017-01-01+10%3a30%3a01。
定时录制模式，必须设置该字段；实时录制模式，为可选字段。如果通过Highlight参数，设置录制为实时视频录制模式，其设置的结束时间不应超过当前时间+30分钟，如果设置的结束时间超过当前时间+30分钟或者小于当前时间或者不设置该参数，则实际结束时间为当前时间+30分钟。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 录制类型。
“video” : 音视频录制【默认】。
“audio” : 纯音频录制。
在定时录制模式或实时视频录制模式下，该参数均有效，不区分大小写。
    */
    @SerializedName("RecordType")
    @Expose
    private String RecordType;

    /**
    * 录制文件格式。其值为：
“flv”【默认】,“hls”,”mp4”,“aac”,”mp3”。
在定时录制模式或实时视频录制模式下，该参数均有效，不区分大小写。
    */
    @SerializedName("FileFormat")
    @Expose
    private String FileFormat;

    /**
    * 开启实时视频录制模式标志。
0：不开启实时视频录制模式，即定时录制模式【默认】。见[示例一](#.E7.A4.BA.E4.BE.8B1-.E5.88.9B.E5.BB.BA.E5.AE.9A.E6.97.B6.E5.BD.95.E5.88.B6.E4.BB.BB.E5.8A.A1)。
1：开启实时视频录制模式。见[示例二](#.E7.A4.BA.E4.BE.8B2-.E5.88.9B.E5.BB.BA.E5.AE.9E.E6.97.B6.E5.BD.95.E5.88.B6.E4.BB.BB.E5.8A.A1)。
    */
    @SerializedName("Highlight")
    @Expose
    private Long Highlight;

    /**
    * 开启 A+B=C混流C流录制标志。
0：不开启 A+B=C混流C流录制【默认】。
1：开启 A+B=C混流C流录制。
在定时录制模式或实时视频录制模式下，该参数均有效。
    */
    @SerializedName("MixStream")
    @Expose
    private Long MixStream;

    /**
    * 录制流参数。当前支持以下参数：
record_interval - 录制分片时长，单位 秒，1800 - 7200。
storage_time - 录制文件存储时长，单位 秒。
eg. record_interval=3600&storage_time=2592000。
注：参数需要url encode。
在定时录制模式或实时视频录制模式下，该参数均有效。
    */
    @SerializedName("StreamParam")
    @Expose
    private String StreamParam;

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
     * Get 推流路径，与推流和播放地址中的 AppName保持一致，默认为 live。 
     * @return AppName 推流路径，与推流和播放地址中的 AppName保持一致，默认为 live。
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * Set 推流路径，与推流和播放地址中的 AppName保持一致，默认为 live。
     * @param AppName 推流路径，与推流和播放地址中的 AppName保持一致，默认为 live。
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    /**
     * Get 推流域名。多域名推流必须设置。 
     * @return DomainName 推流域名。多域名推流必须设置。
     */
    public String getDomainName() {
        return this.DomainName;
    }

    /**
     * Set 推流域名。多域名推流必须设置。
     * @param DomainName 推流域名。多域名推流必须设置。
     */
    public void setDomainName(String DomainName) {
        this.DomainName = DomainName;
    }

    /**
     * Get 录制开始时间。中国标准时间，需要 URLEncode(rfc3986)。如 2017-01-01 10:10:01，编码为：2017-01-01+10%3a10%3a01。
定时录制模式，必须设置该字段；实时视频录制模式，忽略该字段。 
     * @return StartTime 录制开始时间。中国标准时间，需要 URLEncode(rfc3986)。如 2017-01-01 10:10:01，编码为：2017-01-01+10%3a10%3a01。
定时录制模式，必须设置该字段；实时视频录制模式，忽略该字段。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 录制开始时间。中国标准时间，需要 URLEncode(rfc3986)。如 2017-01-01 10:10:01，编码为：2017-01-01+10%3a10%3a01。
定时录制模式，必须设置该字段；实时视频录制模式，忽略该字段。
     * @param StartTime 录制开始时间。中国标准时间，需要 URLEncode(rfc3986)。如 2017-01-01 10:10:01，编码为：2017-01-01+10%3a10%3a01。
定时录制模式，必须设置该字段；实时视频录制模式，忽略该字段。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 录制结束时间。中国标准时间，需要 URLEncode(rfc3986)。如 2017-01-01 10:30:01，编码为：2017-01-01+10%3a30%3a01。
定时录制模式，必须设置该字段；实时录制模式，为可选字段。如果通过Highlight参数，设置录制为实时视频录制模式，其设置的结束时间不应超过当前时间+30分钟，如果设置的结束时间超过当前时间+30分钟或者小于当前时间或者不设置该参数，则实际结束时间为当前时间+30分钟。 
     * @return EndTime 录制结束时间。中国标准时间，需要 URLEncode(rfc3986)。如 2017-01-01 10:30:01，编码为：2017-01-01+10%3a30%3a01。
定时录制模式，必须设置该字段；实时录制模式，为可选字段。如果通过Highlight参数，设置录制为实时视频录制模式，其设置的结束时间不应超过当前时间+30分钟，如果设置的结束时间超过当前时间+30分钟或者小于当前时间或者不设置该参数，则实际结束时间为当前时间+30分钟。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 录制结束时间。中国标准时间，需要 URLEncode(rfc3986)。如 2017-01-01 10:30:01，编码为：2017-01-01+10%3a30%3a01。
定时录制模式，必须设置该字段；实时录制模式，为可选字段。如果通过Highlight参数，设置录制为实时视频录制模式，其设置的结束时间不应超过当前时间+30分钟，如果设置的结束时间超过当前时间+30分钟或者小于当前时间或者不设置该参数，则实际结束时间为当前时间+30分钟。
     * @param EndTime 录制结束时间。中国标准时间，需要 URLEncode(rfc3986)。如 2017-01-01 10:30:01，编码为：2017-01-01+10%3a30%3a01。
定时录制模式，必须设置该字段；实时录制模式，为可选字段。如果通过Highlight参数，设置录制为实时视频录制模式，其设置的结束时间不应超过当前时间+30分钟，如果设置的结束时间超过当前时间+30分钟或者小于当前时间或者不设置该参数，则实际结束时间为当前时间+30分钟。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 录制类型。
“video” : 音视频录制【默认】。
“audio” : 纯音频录制。
在定时录制模式或实时视频录制模式下，该参数均有效，不区分大小写。 
     * @return RecordType 录制类型。
“video” : 音视频录制【默认】。
“audio” : 纯音频录制。
在定时录制模式或实时视频录制模式下，该参数均有效，不区分大小写。
     */
    public String getRecordType() {
        return this.RecordType;
    }

    /**
     * Set 录制类型。
“video” : 音视频录制【默认】。
“audio” : 纯音频录制。
在定时录制模式或实时视频录制模式下，该参数均有效，不区分大小写。
     * @param RecordType 录制类型。
“video” : 音视频录制【默认】。
“audio” : 纯音频录制。
在定时录制模式或实时视频录制模式下，该参数均有效，不区分大小写。
     */
    public void setRecordType(String RecordType) {
        this.RecordType = RecordType;
    }

    /**
     * Get 录制文件格式。其值为：
“flv”【默认】,“hls”,”mp4”,“aac”,”mp3”。
在定时录制模式或实时视频录制模式下，该参数均有效，不区分大小写。 
     * @return FileFormat 录制文件格式。其值为：
“flv”【默认】,“hls”,”mp4”,“aac”,”mp3”。
在定时录制模式或实时视频录制模式下，该参数均有效，不区分大小写。
     */
    public String getFileFormat() {
        return this.FileFormat;
    }

    /**
     * Set 录制文件格式。其值为：
“flv”【默认】,“hls”,”mp4”,“aac”,”mp3”。
在定时录制模式或实时视频录制模式下，该参数均有效，不区分大小写。
     * @param FileFormat 录制文件格式。其值为：
“flv”【默认】,“hls”,”mp4”,“aac”,”mp3”。
在定时录制模式或实时视频录制模式下，该参数均有效，不区分大小写。
     */
    public void setFileFormat(String FileFormat) {
        this.FileFormat = FileFormat;
    }

    /**
     * Get 开启实时视频录制模式标志。
0：不开启实时视频录制模式，即定时录制模式【默认】。见[示例一](#.E7.A4.BA.E4.BE.8B1-.E5.88.9B.E5.BB.BA.E5.AE.9A.E6.97.B6.E5.BD.95.E5.88.B6.E4.BB.BB.E5.8A.A1)。
1：开启实时视频录制模式。见[示例二](#.E7.A4.BA.E4.BE.8B2-.E5.88.9B.E5.BB.BA.E5.AE.9E.E6.97.B6.E5.BD.95.E5.88.B6.E4.BB.BB.E5.8A.A1)。 
     * @return Highlight 开启实时视频录制模式标志。
0：不开启实时视频录制模式，即定时录制模式【默认】。见[示例一](#.E7.A4.BA.E4.BE.8B1-.E5.88.9B.E5.BB.BA.E5.AE.9A.E6.97.B6.E5.BD.95.E5.88.B6.E4.BB.BB.E5.8A.A1)。
1：开启实时视频录制模式。见[示例二](#.E7.A4.BA.E4.BE.8B2-.E5.88.9B.E5.BB.BA.E5.AE.9E.E6.97.B6.E5.BD.95.E5.88.B6.E4.BB.BB.E5.8A.A1)。
     */
    public Long getHighlight() {
        return this.Highlight;
    }

    /**
     * Set 开启实时视频录制模式标志。
0：不开启实时视频录制模式，即定时录制模式【默认】。见[示例一](#.E7.A4.BA.E4.BE.8B1-.E5.88.9B.E5.BB.BA.E5.AE.9A.E6.97.B6.E5.BD.95.E5.88.B6.E4.BB.BB.E5.8A.A1)。
1：开启实时视频录制模式。见[示例二](#.E7.A4.BA.E4.BE.8B2-.E5.88.9B.E5.BB.BA.E5.AE.9E.E6.97.B6.E5.BD.95.E5.88.B6.E4.BB.BB.E5.8A.A1)。
     * @param Highlight 开启实时视频录制模式标志。
0：不开启实时视频录制模式，即定时录制模式【默认】。见[示例一](#.E7.A4.BA.E4.BE.8B1-.E5.88.9B.E5.BB.BA.E5.AE.9A.E6.97.B6.E5.BD.95.E5.88.B6.E4.BB.BB.E5.8A.A1)。
1：开启实时视频录制模式。见[示例二](#.E7.A4.BA.E4.BE.8B2-.E5.88.9B.E5.BB.BA.E5.AE.9E.E6.97.B6.E5.BD.95.E5.88.B6.E4.BB.BB.E5.8A.A1)。
     */
    public void setHighlight(Long Highlight) {
        this.Highlight = Highlight;
    }

    /**
     * Get 开启 A+B=C混流C流录制标志。
0：不开启 A+B=C混流C流录制【默认】。
1：开启 A+B=C混流C流录制。
在定时录制模式或实时视频录制模式下，该参数均有效。 
     * @return MixStream 开启 A+B=C混流C流录制标志。
0：不开启 A+B=C混流C流录制【默认】。
1：开启 A+B=C混流C流录制。
在定时录制模式或实时视频录制模式下，该参数均有效。
     */
    public Long getMixStream() {
        return this.MixStream;
    }

    /**
     * Set 开启 A+B=C混流C流录制标志。
0：不开启 A+B=C混流C流录制【默认】。
1：开启 A+B=C混流C流录制。
在定时录制模式或实时视频录制模式下，该参数均有效。
     * @param MixStream 开启 A+B=C混流C流录制标志。
0：不开启 A+B=C混流C流录制【默认】。
1：开启 A+B=C混流C流录制。
在定时录制模式或实时视频录制模式下，该参数均有效。
     */
    public void setMixStream(Long MixStream) {
        this.MixStream = MixStream;
    }

    /**
     * Get 录制流参数。当前支持以下参数：
record_interval - 录制分片时长，单位 秒，1800 - 7200。
storage_time - 录制文件存储时长，单位 秒。
eg. record_interval=3600&storage_time=2592000。
注：参数需要url encode。
在定时录制模式或实时视频录制模式下，该参数均有效。 
     * @return StreamParam 录制流参数。当前支持以下参数：
record_interval - 录制分片时长，单位 秒，1800 - 7200。
storage_time - 录制文件存储时长，单位 秒。
eg. record_interval=3600&storage_time=2592000。
注：参数需要url encode。
在定时录制模式或实时视频录制模式下，该参数均有效。
     */
    public String getStreamParam() {
        return this.StreamParam;
    }

    /**
     * Set 录制流参数。当前支持以下参数：
record_interval - 录制分片时长，单位 秒，1800 - 7200。
storage_time - 录制文件存储时长，单位 秒。
eg. record_interval=3600&storage_time=2592000。
注：参数需要url encode。
在定时录制模式或实时视频录制模式下，该参数均有效。
     * @param StreamParam 录制流参数。当前支持以下参数：
record_interval - 录制分片时长，单位 秒，1800 - 7200。
storage_time - 录制文件存储时长，单位 秒。
eg. record_interval=3600&storage_time=2592000。
注：参数需要url encode。
在定时录制模式或实时视频录制模式下，该参数均有效。
     */
    public void setStreamParam(String StreamParam) {
        this.StreamParam = StreamParam;
    }

    /**
     * Internal implementation, normal users should not use it.
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

