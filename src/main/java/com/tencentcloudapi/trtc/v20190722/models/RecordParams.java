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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RecordParams extends AbstractModel {

    /**
    * 录制模式：
1：单流录制，分别录制房间的订阅UserId的音频和视频，将录制文件上传至云存储；
2：合流录制，将房间内订阅UserId的音视频混录成一个音视频文件，将录制文件上传至云存储；
    */
    @SerializedName("RecordMode")
    @Expose
    private Long RecordMode;

    /**
    * 房间内持续没有主播的状态超过MaxIdleTime的时长，自动停止录制，单位：秒。默认值为 30 秒，该值需大于等于 5秒，且小于等于 86400秒(24小时)。
    */
    @SerializedName("MaxIdleTime")
    @Expose
    private Long MaxIdleTime;

    /**
    * 录制的媒体流类型：
0：录制音频+视频流（默认）;
1：仅录制音频流；
2：仅录制视频流，
    */
    @SerializedName("StreamType")
    @Expose
    private Long StreamType;

    /**
    * 指定订阅流白名单或者黑名单。
    */
    @SerializedName("SubscribeStreamUserIds")
    @Expose
    private SubscribeStreamUserIds SubscribeStreamUserIds;

    /**
    * 输出文件的格式（存储至COS等第三方存储时有效）。0：(默认)输出文件为hls格式。1：输出文件格式为hls+mp4。2：输出文件格式为hls+aac 。3：输出文件格式为mp4。4：输出文件格式为aac。

存储到云点播VOD时此参数无效，存储到VOD时请通过TencentVod（https://cloud.tencent.com/document/api/647/44055#TencentVod）内的MediaType设置。
    */
    @SerializedName("OutputFormat")
    @Expose
    private Long OutputFormat;

    /**
    * 单流录制模式下，用户的音视频是否合并，0：单流音视频不合并（默认）。1：单流音视频合并成一个ts。合流录制此参数无需设置，默认音视频合并。
    */
    @SerializedName("AvMerge")
    @Expose
    private Long AvMerge;

    /**
    * 如果是aac或者mp4文件格式，超过长度限制后，系统会自动拆分视频文件。单位：分钟。默认为1440min（24h），取值范围为1-1440。【单文件限制最大为2G，满足文件大小 >2G 或录制时长度 > 24h任意一个条件，文件都会自动切分】
Hls 格式录制此参数不生效。
    */
    @SerializedName("MaxMediaFileDuration")
    @Expose
    private Long MaxMediaFileDuration;

    /**
    * 指定录制主辅流，0：主流+辅流（默认）；1:主流；2:辅流。
    */
    @SerializedName("MediaId")
    @Expose
    private Long MediaId;

    /**
    * 上行视频停止时，录制的补帧类型，0：补最后一帧 1：补黑帧
    */
    @SerializedName("FillType")
    @Expose
    private Long FillType;

    /**
    * 控制录制任务是否订阅混流回推机器人，1是订阅，0是不订阅，默认是0。如果是混流录制任务，建议用订阅白名单控制订阅用户，防止同时订阅混流回推机器人和上行主播，以避免混音效果。
    */
    @SerializedName("SubscribeAbility")
    @Expose
    private Long SubscribeAbility;

    /**
     * Get 录制模式：
1：单流录制，分别录制房间的订阅UserId的音频和视频，将录制文件上传至云存储；
2：合流录制，将房间内订阅UserId的音视频混录成一个音视频文件，将录制文件上传至云存储； 
     * @return RecordMode 录制模式：
1：单流录制，分别录制房间的订阅UserId的音频和视频，将录制文件上传至云存储；
2：合流录制，将房间内订阅UserId的音视频混录成一个音视频文件，将录制文件上传至云存储；
     */
    public Long getRecordMode() {
        return this.RecordMode;
    }

    /**
     * Set 录制模式：
1：单流录制，分别录制房间的订阅UserId的音频和视频，将录制文件上传至云存储；
2：合流录制，将房间内订阅UserId的音视频混录成一个音视频文件，将录制文件上传至云存储；
     * @param RecordMode 录制模式：
1：单流录制，分别录制房间的订阅UserId的音频和视频，将录制文件上传至云存储；
2：合流录制，将房间内订阅UserId的音视频混录成一个音视频文件，将录制文件上传至云存储；
     */
    public void setRecordMode(Long RecordMode) {
        this.RecordMode = RecordMode;
    }

    /**
     * Get 房间内持续没有主播的状态超过MaxIdleTime的时长，自动停止录制，单位：秒。默认值为 30 秒，该值需大于等于 5秒，且小于等于 86400秒(24小时)。 
     * @return MaxIdleTime 房间内持续没有主播的状态超过MaxIdleTime的时长，自动停止录制，单位：秒。默认值为 30 秒，该值需大于等于 5秒，且小于等于 86400秒(24小时)。
     */
    public Long getMaxIdleTime() {
        return this.MaxIdleTime;
    }

    /**
     * Set 房间内持续没有主播的状态超过MaxIdleTime的时长，自动停止录制，单位：秒。默认值为 30 秒，该值需大于等于 5秒，且小于等于 86400秒(24小时)。
     * @param MaxIdleTime 房间内持续没有主播的状态超过MaxIdleTime的时长，自动停止录制，单位：秒。默认值为 30 秒，该值需大于等于 5秒，且小于等于 86400秒(24小时)。
     */
    public void setMaxIdleTime(Long MaxIdleTime) {
        this.MaxIdleTime = MaxIdleTime;
    }

    /**
     * Get 录制的媒体流类型：
0：录制音频+视频流（默认）;
1：仅录制音频流；
2：仅录制视频流， 
     * @return StreamType 录制的媒体流类型：
0：录制音频+视频流（默认）;
1：仅录制音频流；
2：仅录制视频流，
     */
    public Long getStreamType() {
        return this.StreamType;
    }

    /**
     * Set 录制的媒体流类型：
0：录制音频+视频流（默认）;
1：仅录制音频流；
2：仅录制视频流，
     * @param StreamType 录制的媒体流类型：
0：录制音频+视频流（默认）;
1：仅录制音频流；
2：仅录制视频流，
     */
    public void setStreamType(Long StreamType) {
        this.StreamType = StreamType;
    }

    /**
     * Get 指定订阅流白名单或者黑名单。 
     * @return SubscribeStreamUserIds 指定订阅流白名单或者黑名单。
     */
    public SubscribeStreamUserIds getSubscribeStreamUserIds() {
        return this.SubscribeStreamUserIds;
    }

    /**
     * Set 指定订阅流白名单或者黑名单。
     * @param SubscribeStreamUserIds 指定订阅流白名单或者黑名单。
     */
    public void setSubscribeStreamUserIds(SubscribeStreamUserIds SubscribeStreamUserIds) {
        this.SubscribeStreamUserIds = SubscribeStreamUserIds;
    }

    /**
     * Get 输出文件的格式（存储至COS等第三方存储时有效）。0：(默认)输出文件为hls格式。1：输出文件格式为hls+mp4。2：输出文件格式为hls+aac 。3：输出文件格式为mp4。4：输出文件格式为aac。

存储到云点播VOD时此参数无效，存储到VOD时请通过TencentVod（https://cloud.tencent.com/document/api/647/44055#TencentVod）内的MediaType设置。 
     * @return OutputFormat 输出文件的格式（存储至COS等第三方存储时有效）。0：(默认)输出文件为hls格式。1：输出文件格式为hls+mp4。2：输出文件格式为hls+aac 。3：输出文件格式为mp4。4：输出文件格式为aac。

存储到云点播VOD时此参数无效，存储到VOD时请通过TencentVod（https://cloud.tencent.com/document/api/647/44055#TencentVod）内的MediaType设置。
     */
    public Long getOutputFormat() {
        return this.OutputFormat;
    }

    /**
     * Set 输出文件的格式（存储至COS等第三方存储时有效）。0：(默认)输出文件为hls格式。1：输出文件格式为hls+mp4。2：输出文件格式为hls+aac 。3：输出文件格式为mp4。4：输出文件格式为aac。

存储到云点播VOD时此参数无效，存储到VOD时请通过TencentVod（https://cloud.tencent.com/document/api/647/44055#TencentVod）内的MediaType设置。
     * @param OutputFormat 输出文件的格式（存储至COS等第三方存储时有效）。0：(默认)输出文件为hls格式。1：输出文件格式为hls+mp4。2：输出文件格式为hls+aac 。3：输出文件格式为mp4。4：输出文件格式为aac。

存储到云点播VOD时此参数无效，存储到VOD时请通过TencentVod（https://cloud.tencent.com/document/api/647/44055#TencentVod）内的MediaType设置。
     */
    public void setOutputFormat(Long OutputFormat) {
        this.OutputFormat = OutputFormat;
    }

    /**
     * Get 单流录制模式下，用户的音视频是否合并，0：单流音视频不合并（默认）。1：单流音视频合并成一个ts。合流录制此参数无需设置，默认音视频合并。 
     * @return AvMerge 单流录制模式下，用户的音视频是否合并，0：单流音视频不合并（默认）。1：单流音视频合并成一个ts。合流录制此参数无需设置，默认音视频合并。
     */
    public Long getAvMerge() {
        return this.AvMerge;
    }

    /**
     * Set 单流录制模式下，用户的音视频是否合并，0：单流音视频不合并（默认）。1：单流音视频合并成一个ts。合流录制此参数无需设置，默认音视频合并。
     * @param AvMerge 单流录制模式下，用户的音视频是否合并，0：单流音视频不合并（默认）。1：单流音视频合并成一个ts。合流录制此参数无需设置，默认音视频合并。
     */
    public void setAvMerge(Long AvMerge) {
        this.AvMerge = AvMerge;
    }

    /**
     * Get 如果是aac或者mp4文件格式，超过长度限制后，系统会自动拆分视频文件。单位：分钟。默认为1440min（24h），取值范围为1-1440。【单文件限制最大为2G，满足文件大小 >2G 或录制时长度 > 24h任意一个条件，文件都会自动切分】
Hls 格式录制此参数不生效。 
     * @return MaxMediaFileDuration 如果是aac或者mp4文件格式，超过长度限制后，系统会自动拆分视频文件。单位：分钟。默认为1440min（24h），取值范围为1-1440。【单文件限制最大为2G，满足文件大小 >2G 或录制时长度 > 24h任意一个条件，文件都会自动切分】
Hls 格式录制此参数不生效。
     */
    public Long getMaxMediaFileDuration() {
        return this.MaxMediaFileDuration;
    }

    /**
     * Set 如果是aac或者mp4文件格式，超过长度限制后，系统会自动拆分视频文件。单位：分钟。默认为1440min（24h），取值范围为1-1440。【单文件限制最大为2G，满足文件大小 >2G 或录制时长度 > 24h任意一个条件，文件都会自动切分】
Hls 格式录制此参数不生效。
     * @param MaxMediaFileDuration 如果是aac或者mp4文件格式，超过长度限制后，系统会自动拆分视频文件。单位：分钟。默认为1440min（24h），取值范围为1-1440。【单文件限制最大为2G，满足文件大小 >2G 或录制时长度 > 24h任意一个条件，文件都会自动切分】
Hls 格式录制此参数不生效。
     */
    public void setMaxMediaFileDuration(Long MaxMediaFileDuration) {
        this.MaxMediaFileDuration = MaxMediaFileDuration;
    }

    /**
     * Get 指定录制主辅流，0：主流+辅流（默认）；1:主流；2:辅流。 
     * @return MediaId 指定录制主辅流，0：主流+辅流（默认）；1:主流；2:辅流。
     */
    public Long getMediaId() {
        return this.MediaId;
    }

    /**
     * Set 指定录制主辅流，0：主流+辅流（默认）；1:主流；2:辅流。
     * @param MediaId 指定录制主辅流，0：主流+辅流（默认）；1:主流；2:辅流。
     */
    public void setMediaId(Long MediaId) {
        this.MediaId = MediaId;
    }

    /**
     * Get 上行视频停止时，录制的补帧类型，0：补最后一帧 1：补黑帧 
     * @return FillType 上行视频停止时，录制的补帧类型，0：补最后一帧 1：补黑帧
     */
    public Long getFillType() {
        return this.FillType;
    }

    /**
     * Set 上行视频停止时，录制的补帧类型，0：补最后一帧 1：补黑帧
     * @param FillType 上行视频停止时，录制的补帧类型，0：补最后一帧 1：补黑帧
     */
    public void setFillType(Long FillType) {
        this.FillType = FillType;
    }

    /**
     * Get 控制录制任务是否订阅混流回推机器人，1是订阅，0是不订阅，默认是0。如果是混流录制任务，建议用订阅白名单控制订阅用户，防止同时订阅混流回推机器人和上行主播，以避免混音效果。 
     * @return SubscribeAbility 控制录制任务是否订阅混流回推机器人，1是订阅，0是不订阅，默认是0。如果是混流录制任务，建议用订阅白名单控制订阅用户，防止同时订阅混流回推机器人和上行主播，以避免混音效果。
     */
    public Long getSubscribeAbility() {
        return this.SubscribeAbility;
    }

    /**
     * Set 控制录制任务是否订阅混流回推机器人，1是订阅，0是不订阅，默认是0。如果是混流录制任务，建议用订阅白名单控制订阅用户，防止同时订阅混流回推机器人和上行主播，以避免混音效果。
     * @param SubscribeAbility 控制录制任务是否订阅混流回推机器人，1是订阅，0是不订阅，默认是0。如果是混流录制任务，建议用订阅白名单控制订阅用户，防止同时订阅混流回推机器人和上行主播，以避免混音效果。
     */
    public void setSubscribeAbility(Long SubscribeAbility) {
        this.SubscribeAbility = SubscribeAbility;
    }

    public RecordParams() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RecordParams(RecordParams source) {
        if (source.RecordMode != null) {
            this.RecordMode = new Long(source.RecordMode);
        }
        if (source.MaxIdleTime != null) {
            this.MaxIdleTime = new Long(source.MaxIdleTime);
        }
        if (source.StreamType != null) {
            this.StreamType = new Long(source.StreamType);
        }
        if (source.SubscribeStreamUserIds != null) {
            this.SubscribeStreamUserIds = new SubscribeStreamUserIds(source.SubscribeStreamUserIds);
        }
        if (source.OutputFormat != null) {
            this.OutputFormat = new Long(source.OutputFormat);
        }
        if (source.AvMerge != null) {
            this.AvMerge = new Long(source.AvMerge);
        }
        if (source.MaxMediaFileDuration != null) {
            this.MaxMediaFileDuration = new Long(source.MaxMediaFileDuration);
        }
        if (source.MediaId != null) {
            this.MediaId = new Long(source.MediaId);
        }
        if (source.FillType != null) {
            this.FillType = new Long(source.FillType);
        }
        if (source.SubscribeAbility != null) {
            this.SubscribeAbility = new Long(source.SubscribeAbility);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RecordMode", this.RecordMode);
        this.setParamSimple(map, prefix + "MaxIdleTime", this.MaxIdleTime);
        this.setParamSimple(map, prefix + "StreamType", this.StreamType);
        this.setParamObj(map, prefix + "SubscribeStreamUserIds.", this.SubscribeStreamUserIds);
        this.setParamSimple(map, prefix + "OutputFormat", this.OutputFormat);
        this.setParamSimple(map, prefix + "AvMerge", this.AvMerge);
        this.setParamSimple(map, prefix + "MaxMediaFileDuration", this.MaxMediaFileDuration);
        this.setParamSimple(map, prefix + "MediaId", this.MediaId);
        this.setParamSimple(map, prefix + "FillType", this.FillType);
        this.setParamSimple(map, prefix + "SubscribeAbility", this.SubscribeAbility);

    }
}

