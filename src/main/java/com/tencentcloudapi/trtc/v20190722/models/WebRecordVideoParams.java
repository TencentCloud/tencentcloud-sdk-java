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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WebRecordVideoParams extends AbstractModel {

    /**
    * 录制画面宽度，默认为1280，取值范围[0, 1920]
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * 录制画面高度，默认为720，取值范围[0, 1080]
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * 指定输出格式，可选hls,mp4。存储到云点播VOD时此参数无效，存储到VOD时请通过TencentVod（https://cloud.tencent.com/document/api/647/44055#TencentVod）内的MediaType设置。

    */
    @SerializedName("Format")
    @Expose
    private String Format;

    /**
    * 如果是aac或者mp4文件格式，超过长度限制后，系统会自动拆分视频文件。单位：分钟。默认为1440min（24h），取值范围为1-1440。【单文件限制最大为2G，满足文件大小 >2G 或录制时长度 > 24h任意一个条件，文件都会自动切分】
Hls 格式录制此参数不生效。
示例值：1440
    */
    @SerializedName("MaxMediaFileDuration")
    @Expose
    private Long MaxMediaFileDuration;

    /**
     * Get 录制画面宽度，默认为1280，取值范围[0, 1920] 
     * @return Width 录制画面宽度，默认为1280，取值范围[0, 1920]
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set 录制画面宽度，默认为1280，取值范围[0, 1920]
     * @param Width 录制画面宽度，默认为1280，取值范围[0, 1920]
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get 录制画面高度，默认为720，取值范围[0, 1080] 
     * @return Height 录制画面高度，默认为720，取值范围[0, 1080]
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set 录制画面高度，默认为720，取值范围[0, 1080]
     * @param Height 录制画面高度，默认为720，取值范围[0, 1080]
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get 指定输出格式，可选hls,mp4。存储到云点播VOD时此参数无效，存储到VOD时请通过TencentVod（https://cloud.tencent.com/document/api/647/44055#TencentVod）内的MediaType设置。
 
     * @return Format 指定输出格式，可选hls,mp4。存储到云点播VOD时此参数无效，存储到VOD时请通过TencentVod（https://cloud.tencent.com/document/api/647/44055#TencentVod）内的MediaType设置。

     */
    public String getFormat() {
        return this.Format;
    }

    /**
     * Set 指定输出格式，可选hls,mp4。存储到云点播VOD时此参数无效，存储到VOD时请通过TencentVod（https://cloud.tencent.com/document/api/647/44055#TencentVod）内的MediaType设置。

     * @param Format 指定输出格式，可选hls,mp4。存储到云点播VOD时此参数无效，存储到VOD时请通过TencentVod（https://cloud.tencent.com/document/api/647/44055#TencentVod）内的MediaType设置。

     */
    public void setFormat(String Format) {
        this.Format = Format;
    }

    /**
     * Get 如果是aac或者mp4文件格式，超过长度限制后，系统会自动拆分视频文件。单位：分钟。默认为1440min（24h），取值范围为1-1440。【单文件限制最大为2G，满足文件大小 >2G 或录制时长度 > 24h任意一个条件，文件都会自动切分】
Hls 格式录制此参数不生效。
示例值：1440 
     * @return MaxMediaFileDuration 如果是aac或者mp4文件格式，超过长度限制后，系统会自动拆分视频文件。单位：分钟。默认为1440min（24h），取值范围为1-1440。【单文件限制最大为2G，满足文件大小 >2G 或录制时长度 > 24h任意一个条件，文件都会自动切分】
Hls 格式录制此参数不生效。
示例值：1440
     */
    public Long getMaxMediaFileDuration() {
        return this.MaxMediaFileDuration;
    }

    /**
     * Set 如果是aac或者mp4文件格式，超过长度限制后，系统会自动拆分视频文件。单位：分钟。默认为1440min（24h），取值范围为1-1440。【单文件限制最大为2G，满足文件大小 >2G 或录制时长度 > 24h任意一个条件，文件都会自动切分】
Hls 格式录制此参数不生效。
示例值：1440
     * @param MaxMediaFileDuration 如果是aac或者mp4文件格式，超过长度限制后，系统会自动拆分视频文件。单位：分钟。默认为1440min（24h），取值范围为1-1440。【单文件限制最大为2G，满足文件大小 >2G 或录制时长度 > 24h任意一个条件，文件都会自动切分】
Hls 格式录制此参数不生效。
示例值：1440
     */
    public void setMaxMediaFileDuration(Long MaxMediaFileDuration) {
        this.MaxMediaFileDuration = MaxMediaFileDuration;
    }

    public WebRecordVideoParams() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WebRecordVideoParams(WebRecordVideoParams source) {
        if (source.Width != null) {
            this.Width = new Long(source.Width);
        }
        if (source.Height != null) {
            this.Height = new Long(source.Height);
        }
        if (source.Format != null) {
            this.Format = new String(source.Format);
        }
        if (source.MaxMediaFileDuration != null) {
            this.MaxMediaFileDuration = new Long(source.MaxMediaFileDuration);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "Format", this.Format);
        this.setParamSimple(map, prefix + "MaxMediaFileDuration", this.MaxMediaFileDuration);

    }
}

