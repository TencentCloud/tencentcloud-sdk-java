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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TranscodePlayInfo2017 extends AbstractModel{

    /**
    * 播放地址。
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 转码规格 ID，参见[转码参数模板](https://cloud.tencent.com/document/product/266/33476)。
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * 视频流码率平均值与音频流码率平均值之和， 单位：bps。
    */
    @SerializedName("Bitrate")
    @Expose
    private Long Bitrate;

    /**
    * 视频流高度的最大值，单位：px。
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * 视频流宽度的最大值，单位：px。
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
     * Get 播放地址。 
     * @return Url 播放地址。
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 播放地址。
     * @param Url 播放地址。
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 转码规格 ID，参见[转码参数模板](https://cloud.tencent.com/document/product/266/33476)。 
     * @return Definition 转码规格 ID，参见[转码参数模板](https://cloud.tencent.com/document/product/266/33476)。
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set 转码规格 ID，参见[转码参数模板](https://cloud.tencent.com/document/product/266/33476)。
     * @param Definition 转码规格 ID，参见[转码参数模板](https://cloud.tencent.com/document/product/266/33476)。
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get 视频流码率平均值与音频流码率平均值之和， 单位：bps。 
     * @return Bitrate 视频流码率平均值与音频流码率平均值之和， 单位：bps。
     */
    public Long getBitrate() {
        return this.Bitrate;
    }

    /**
     * Set 视频流码率平均值与音频流码率平均值之和， 单位：bps。
     * @param Bitrate 视频流码率平均值与音频流码率平均值之和， 单位：bps。
     */
    public void setBitrate(Long Bitrate) {
        this.Bitrate = Bitrate;
    }

    /**
     * Get 视频流高度的最大值，单位：px。 
     * @return Height 视频流高度的最大值，单位：px。
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set 视频流高度的最大值，单位：px。
     * @param Height 视频流高度的最大值，单位：px。
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get 视频流宽度的最大值，单位：px。 
     * @return Width 视频流宽度的最大值，单位：px。
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set 视频流宽度的最大值，单位：px。
     * @param Width 视频流宽度的最大值，单位：px。
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamSimple(map, prefix + "Bitrate", this.Bitrate);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "Width", this.Width);

    }
}

