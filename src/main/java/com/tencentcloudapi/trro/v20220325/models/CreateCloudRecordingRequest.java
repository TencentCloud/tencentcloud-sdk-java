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
package com.tencentcloudapi.trro.v20220325.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateCloudRecordingRequest extends AbstractModel {

    /**
    * 项目id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 设备id
    */
    @SerializedName("DeviceId")
    @Expose
    private String DeviceId;

    /**
    * 视频流号
    */
    @SerializedName("VideoStreamId")
    @Expose
    private Long VideoStreamId;

    /**
    * 腾讯云对象存储COS以及第三方云存储的账号信息
    */
    @SerializedName("CloudStorage")
    @Expose
    private CloudStorage CloudStorage;

    /**
    * 如果是aac或者mp4文件格式，超过长度限制后，系统会自动拆分视频文件。单位：分钟。默认为1440min（24h），取值范围为1-1440。【单文件限制最大为2G，满足文件大小 >2G 或录制时长度 > 24h任意一个条件，文件都会自动切分】 Hls 格式录制此参数不生效。
    */
    @SerializedName("MaxMediaFileDuration")
    @Expose
    private Long MaxMediaFileDuration;

    /**
    * 输出文件的格式（存储至COS等第三方存储时有效）。0：输出文件为hls格式。1：输出文件格式为hls+mp4。2：输出文件格式为hls+aac 。3：(默认)输出文件格式为mp4。4：输出文件格式为aac。
    */
    @SerializedName("OutputFormat")
    @Expose
    private Long OutputFormat;

    /**
    * 房间内持续没有主播的状态超过MaxIdleTime的时长，自动停止录制，单位：秒。默认值为 30 秒，该值需大于等于 5秒，且小于等于 86400秒(24小时)。 示例值：30
    */
    @SerializedName("MaxIdleTime")
    @Expose
    private Long MaxIdleTime;

    /**
     * Get 项目id 
     * @return ProjectId 项目id
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目id
     * @param ProjectId 项目id
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 设备id 
     * @return DeviceId 设备id
     */
    public String getDeviceId() {
        return this.DeviceId;
    }

    /**
     * Set 设备id
     * @param DeviceId 设备id
     */
    public void setDeviceId(String DeviceId) {
        this.DeviceId = DeviceId;
    }

    /**
     * Get 视频流号 
     * @return VideoStreamId 视频流号
     */
    public Long getVideoStreamId() {
        return this.VideoStreamId;
    }

    /**
     * Set 视频流号
     * @param VideoStreamId 视频流号
     */
    public void setVideoStreamId(Long VideoStreamId) {
        this.VideoStreamId = VideoStreamId;
    }

    /**
     * Get 腾讯云对象存储COS以及第三方云存储的账号信息 
     * @return CloudStorage 腾讯云对象存储COS以及第三方云存储的账号信息
     */
    public CloudStorage getCloudStorage() {
        return this.CloudStorage;
    }

    /**
     * Set 腾讯云对象存储COS以及第三方云存储的账号信息
     * @param CloudStorage 腾讯云对象存储COS以及第三方云存储的账号信息
     */
    public void setCloudStorage(CloudStorage CloudStorage) {
        this.CloudStorage = CloudStorage;
    }

    /**
     * Get 如果是aac或者mp4文件格式，超过长度限制后，系统会自动拆分视频文件。单位：分钟。默认为1440min（24h），取值范围为1-1440。【单文件限制最大为2G，满足文件大小 >2G 或录制时长度 > 24h任意一个条件，文件都会自动切分】 Hls 格式录制此参数不生效。 
     * @return MaxMediaFileDuration 如果是aac或者mp4文件格式，超过长度限制后，系统会自动拆分视频文件。单位：分钟。默认为1440min（24h），取值范围为1-1440。【单文件限制最大为2G，满足文件大小 >2G 或录制时长度 > 24h任意一个条件，文件都会自动切分】 Hls 格式录制此参数不生效。
     */
    public Long getMaxMediaFileDuration() {
        return this.MaxMediaFileDuration;
    }

    /**
     * Set 如果是aac或者mp4文件格式，超过长度限制后，系统会自动拆分视频文件。单位：分钟。默认为1440min（24h），取值范围为1-1440。【单文件限制最大为2G，满足文件大小 >2G 或录制时长度 > 24h任意一个条件，文件都会自动切分】 Hls 格式录制此参数不生效。
     * @param MaxMediaFileDuration 如果是aac或者mp4文件格式，超过长度限制后，系统会自动拆分视频文件。单位：分钟。默认为1440min（24h），取值范围为1-1440。【单文件限制最大为2G，满足文件大小 >2G 或录制时长度 > 24h任意一个条件，文件都会自动切分】 Hls 格式录制此参数不生效。
     */
    public void setMaxMediaFileDuration(Long MaxMediaFileDuration) {
        this.MaxMediaFileDuration = MaxMediaFileDuration;
    }

    /**
     * Get 输出文件的格式（存储至COS等第三方存储时有效）。0：输出文件为hls格式。1：输出文件格式为hls+mp4。2：输出文件格式为hls+aac 。3：(默认)输出文件格式为mp4。4：输出文件格式为aac。 
     * @return OutputFormat 输出文件的格式（存储至COS等第三方存储时有效）。0：输出文件为hls格式。1：输出文件格式为hls+mp4。2：输出文件格式为hls+aac 。3：(默认)输出文件格式为mp4。4：输出文件格式为aac。
     */
    public Long getOutputFormat() {
        return this.OutputFormat;
    }

    /**
     * Set 输出文件的格式（存储至COS等第三方存储时有效）。0：输出文件为hls格式。1：输出文件格式为hls+mp4。2：输出文件格式为hls+aac 。3：(默认)输出文件格式为mp4。4：输出文件格式为aac。
     * @param OutputFormat 输出文件的格式（存储至COS等第三方存储时有效）。0：输出文件为hls格式。1：输出文件格式为hls+mp4。2：输出文件格式为hls+aac 。3：(默认)输出文件格式为mp4。4：输出文件格式为aac。
     */
    public void setOutputFormat(Long OutputFormat) {
        this.OutputFormat = OutputFormat;
    }

    /**
     * Get 房间内持续没有主播的状态超过MaxIdleTime的时长，自动停止录制，单位：秒。默认值为 30 秒，该值需大于等于 5秒，且小于等于 86400秒(24小时)。 示例值：30 
     * @return MaxIdleTime 房间内持续没有主播的状态超过MaxIdleTime的时长，自动停止录制，单位：秒。默认值为 30 秒，该值需大于等于 5秒，且小于等于 86400秒(24小时)。 示例值：30
     */
    public Long getMaxIdleTime() {
        return this.MaxIdleTime;
    }

    /**
     * Set 房间内持续没有主播的状态超过MaxIdleTime的时长，自动停止录制，单位：秒。默认值为 30 秒，该值需大于等于 5秒，且小于等于 86400秒(24小时)。 示例值：30
     * @param MaxIdleTime 房间内持续没有主播的状态超过MaxIdleTime的时长，自动停止录制，单位：秒。默认值为 30 秒，该值需大于等于 5秒，且小于等于 86400秒(24小时)。 示例值：30
     */
    public void setMaxIdleTime(Long MaxIdleTime) {
        this.MaxIdleTime = MaxIdleTime;
    }

    public CreateCloudRecordingRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCloudRecordingRequest(CreateCloudRecordingRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.DeviceId != null) {
            this.DeviceId = new String(source.DeviceId);
        }
        if (source.VideoStreamId != null) {
            this.VideoStreamId = new Long(source.VideoStreamId);
        }
        if (source.CloudStorage != null) {
            this.CloudStorage = new CloudStorage(source.CloudStorage);
        }
        if (source.MaxMediaFileDuration != null) {
            this.MaxMediaFileDuration = new Long(source.MaxMediaFileDuration);
        }
        if (source.OutputFormat != null) {
            this.OutputFormat = new Long(source.OutputFormat);
        }
        if (source.MaxIdleTime != null) {
            this.MaxIdleTime = new Long(source.MaxIdleTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "DeviceId", this.DeviceId);
        this.setParamSimple(map, prefix + "VideoStreamId", this.VideoStreamId);
        this.setParamObj(map, prefix + "CloudStorage.", this.CloudStorage);
        this.setParamSimple(map, prefix + "MaxMediaFileDuration", this.MaxMediaFileDuration);
        this.setParamSimple(map, prefix + "OutputFormat", this.OutputFormat);
        this.setParamSimple(map, prefix + "MaxIdleTime", this.MaxIdleTime);

    }
}

