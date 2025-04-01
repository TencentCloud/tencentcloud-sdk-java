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

public class VideoList extends AbstractModel {

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
    * 流id
    */
    @SerializedName("VideoStreamId")
    @Expose
    private Long VideoStreamId;

    /**
    * 子画面在输出时的宽度，单位为像素值，不填默认为0。
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * 子画面在输出时的高度，单位为像素值，不填默认为0。
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

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
     * Get 流id 
     * @return VideoStreamId 流id
     */
    public Long getVideoStreamId() {
        return this.VideoStreamId;
    }

    /**
     * Set 流id
     * @param VideoStreamId 流id
     */
    public void setVideoStreamId(Long VideoStreamId) {
        this.VideoStreamId = VideoStreamId;
    }

    /**
     * Get 子画面在输出时的宽度，单位为像素值，不填默认为0。 
     * @return Width 子画面在输出时的宽度，单位为像素值，不填默认为0。
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set 子画面在输出时的宽度，单位为像素值，不填默认为0。
     * @param Width 子画面在输出时的宽度，单位为像素值，不填默认为0。
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get 子画面在输出时的高度，单位为像素值，不填默认为0。 
     * @return Height 子画面在输出时的高度，单位为像素值，不填默认为0。
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set 子画面在输出时的高度，单位为像素值，不填默认为0。
     * @param Height 子画面在输出时的高度，单位为像素值，不填默认为0。
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    public VideoList() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VideoList(VideoList source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.DeviceId != null) {
            this.DeviceId = new String(source.DeviceId);
        }
        if (source.VideoStreamId != null) {
            this.VideoStreamId = new Long(source.VideoStreamId);
        }
        if (source.Width != null) {
            this.Width = new Long(source.Width);
        }
        if (source.Height != null) {
            this.Height = new Long(source.Height);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "DeviceId", this.DeviceId);
        this.setParamSimple(map, prefix + "VideoStreamId", this.VideoStreamId);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Height", this.Height);

    }
}

