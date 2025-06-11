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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VideoTemplateInfo extends AbstractModel {

    /**
    * 视频流的编码格式，可选值：
<li>libx264：H.264 编码；</li>
<li>libx265：H.265 编码；</li>
<li>av1：AOMedia Video 1 编码；</li>
<li>H.266：H.266 编码。</li>
<font color=red>注意：</font>
<li> av1，H.266 编码容器目前只支持 mp4 ；</li>
<li> H.266 目前只支持恒定 CRF 码率控制方式。 </li>
    */
    @SerializedName("Codec")
    @Expose
    private String Codec;

    /**
    * 视频帧率，取值范围：[0, 100]，单位：Hz。
当取值为 0，表示帧率和原始视频保持一致。
    */
    @SerializedName("Fps")
    @Expose
    private Long Fps;

    /**
    * 视频流的码率，取值范围：0 和 [128, 100000]，单位：kbps。
当取值为 0，表示由云点播自动设置码率。
    */
    @SerializedName("Bitrate")
    @Expose
    private Long Bitrate;

    /**
    * 分辨率自适应，可选值：
<li>open：开启，此时，Width 代表视频的长边，Height 表示视频的短边；</li>
<li>close：关闭，此时，Width 代表视频的宽度，Height 表示视频的高度。</li>
默认值：open。
    */
    @SerializedName("ResolutionAdaptive")
    @Expose
    private String ResolutionAdaptive;

    /**
    * 视频流宽度（或长边）的最大值，取值范围：0 和 [128, 8192]，单位：px。
<li>当 Width、Height 均为 0，则分辨率同源；</li>
<li>当 Width 为 0，Height 非 0，则 Width 按比例缩放；</li>
<li>当 Width 非 0，Height 为 0，则 Height 按比例缩放；</li>
<li>当 Width、Height 均非 0，则分辨率按用户指定。</li>
默认值：0。
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * 视频流高度（或短边）的最大值，取值范围：0 和 [128, 8192]，单位：px。
<li>当 Width、Height 均为 0，则分辨率同源；</li>
<li>当 Width 为 0，Height 非 0，则 Width 按比例缩放；</li>
<li>当 Width 非 0，Height 为 0，则 Height 按比例缩放；</li>
<li>当 Width、Height 均非 0，则分辨率按用户指定。</li>
默认值：0。
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * 填充方式，当视频流配置宽高参数与原始视频的宽高比不一致时，对转码的处理方式，即为“填充”。可选填充方式：
<li> stretch：拉伸，对每一帧进行拉伸，填满整个画面，可能导致转码后的视频被“压扁“或者“拉长“；</li>
<li>black：留黑，保持视频宽高比不变，边缘剩余部分使用黑色填充。</li>
<li>white：留白，保持视频宽高比不变，边缘剩余部分使用白色填充。</li>
<li>gauss：高斯模糊，保持视频宽高比不变，边缘剩余部分使用高斯模糊填充。</li>
默认值：black 。
    */
    @SerializedName("FillType")
    @Expose
    private String FillType;

    /**
    * 视频恒定码率控制因子，取值范围为[1, 51]。

<font color=red>注意：</font>
<li>如果指定该参数，将使用 CRF 的码率控制方式做转码（视频码率将不再生效）；</li>
<li>当指定视频流编码格式为 H.266 时，该字段必填，推荐值为 28；</li>
<li>如果没有特殊需求，不建议指定该参数。</li>
    */
    @SerializedName("Vcrf")
    @Expose
    private Long Vcrf;

    /**
    * 关键帧 I 帧之间的间隔，取值范围：0 和 [1, 100000]，单位：帧数。
当填 0 或不填时，系统将自动设置 gop 长度。
    */
    @SerializedName("Gop")
    @Expose
    private Long Gop;

    /**
    * 当原始视频为 HDR（High Dynamic Range）时，转码输出是否依然保持 HDR。取值范围：
<li>ON: 如果原始文件是 HDR，则转码输出保持 HDR；否则转码输出为 SDR （Standard Dynamic Range）。</li>
<li>OFF: 无论原始文件是 HDR 还是 SDR，转码输出均为 SDR。</li>
默认值：OFF。
    */
    @SerializedName("PreserveHDRSwitch")
    @Expose
    private String PreserveHDRSwitch;

    /**
    * 编码标签，仅当视频流的编码格式为 H.265 编码时有效，可选值：
<li>hvc1 表示 hvc1 标签；</li>
<li>hev1 表示 hev1 标签。 </li>
默认值：hvc1。
    */
    @SerializedName("CodecTag")
    @Expose
    private String CodecTag;

    /**
     * Get 视频流的编码格式，可选值：
<li>libx264：H.264 编码；</li>
<li>libx265：H.265 编码；</li>
<li>av1：AOMedia Video 1 编码；</li>
<li>H.266：H.266 编码。</li>
<font color=red>注意：</font>
<li> av1，H.266 编码容器目前只支持 mp4 ；</li>
<li> H.266 目前只支持恒定 CRF 码率控制方式。 </li> 
     * @return Codec 视频流的编码格式，可选值：
<li>libx264：H.264 编码；</li>
<li>libx265：H.265 编码；</li>
<li>av1：AOMedia Video 1 编码；</li>
<li>H.266：H.266 编码。</li>
<font color=red>注意：</font>
<li> av1，H.266 编码容器目前只支持 mp4 ；</li>
<li> H.266 目前只支持恒定 CRF 码率控制方式。 </li>
     */
    public String getCodec() {
        return this.Codec;
    }

    /**
     * Set 视频流的编码格式，可选值：
<li>libx264：H.264 编码；</li>
<li>libx265：H.265 编码；</li>
<li>av1：AOMedia Video 1 编码；</li>
<li>H.266：H.266 编码。</li>
<font color=red>注意：</font>
<li> av1，H.266 编码容器目前只支持 mp4 ；</li>
<li> H.266 目前只支持恒定 CRF 码率控制方式。 </li>
     * @param Codec 视频流的编码格式，可选值：
<li>libx264：H.264 编码；</li>
<li>libx265：H.265 编码；</li>
<li>av1：AOMedia Video 1 编码；</li>
<li>H.266：H.266 编码。</li>
<font color=red>注意：</font>
<li> av1，H.266 编码容器目前只支持 mp4 ；</li>
<li> H.266 目前只支持恒定 CRF 码率控制方式。 </li>
     */
    public void setCodec(String Codec) {
        this.Codec = Codec;
    }

    /**
     * Get 视频帧率，取值范围：[0, 100]，单位：Hz。
当取值为 0，表示帧率和原始视频保持一致。 
     * @return Fps 视频帧率，取值范围：[0, 100]，单位：Hz。
当取值为 0，表示帧率和原始视频保持一致。
     */
    public Long getFps() {
        return this.Fps;
    }

    /**
     * Set 视频帧率，取值范围：[0, 100]，单位：Hz。
当取值为 0，表示帧率和原始视频保持一致。
     * @param Fps 视频帧率，取值范围：[0, 100]，单位：Hz。
当取值为 0，表示帧率和原始视频保持一致。
     */
    public void setFps(Long Fps) {
        this.Fps = Fps;
    }

    /**
     * Get 视频流的码率，取值范围：0 和 [128, 100000]，单位：kbps。
当取值为 0，表示由云点播自动设置码率。 
     * @return Bitrate 视频流的码率，取值范围：0 和 [128, 100000]，单位：kbps。
当取值为 0，表示由云点播自动设置码率。
     */
    public Long getBitrate() {
        return this.Bitrate;
    }

    /**
     * Set 视频流的码率，取值范围：0 和 [128, 100000]，单位：kbps。
当取值为 0，表示由云点播自动设置码率。
     * @param Bitrate 视频流的码率，取值范围：0 和 [128, 100000]，单位：kbps。
当取值为 0，表示由云点播自动设置码率。
     */
    public void setBitrate(Long Bitrate) {
        this.Bitrate = Bitrate;
    }

    /**
     * Get 分辨率自适应，可选值：
<li>open：开启，此时，Width 代表视频的长边，Height 表示视频的短边；</li>
<li>close：关闭，此时，Width 代表视频的宽度，Height 表示视频的高度。</li>
默认值：open。 
     * @return ResolutionAdaptive 分辨率自适应，可选值：
<li>open：开启，此时，Width 代表视频的长边，Height 表示视频的短边；</li>
<li>close：关闭，此时，Width 代表视频的宽度，Height 表示视频的高度。</li>
默认值：open。
     */
    public String getResolutionAdaptive() {
        return this.ResolutionAdaptive;
    }

    /**
     * Set 分辨率自适应，可选值：
<li>open：开启，此时，Width 代表视频的长边，Height 表示视频的短边；</li>
<li>close：关闭，此时，Width 代表视频的宽度，Height 表示视频的高度。</li>
默认值：open。
     * @param ResolutionAdaptive 分辨率自适应，可选值：
<li>open：开启，此时，Width 代表视频的长边，Height 表示视频的短边；</li>
<li>close：关闭，此时，Width 代表视频的宽度，Height 表示视频的高度。</li>
默认值：open。
     */
    public void setResolutionAdaptive(String ResolutionAdaptive) {
        this.ResolutionAdaptive = ResolutionAdaptive;
    }

    /**
     * Get 视频流宽度（或长边）的最大值，取值范围：0 和 [128, 8192]，单位：px。
<li>当 Width、Height 均为 0，则分辨率同源；</li>
<li>当 Width 为 0，Height 非 0，则 Width 按比例缩放；</li>
<li>当 Width 非 0，Height 为 0，则 Height 按比例缩放；</li>
<li>当 Width、Height 均非 0，则分辨率按用户指定。</li>
默认值：0。 
     * @return Width 视频流宽度（或长边）的最大值，取值范围：0 和 [128, 8192]，单位：px。
<li>当 Width、Height 均为 0，则分辨率同源；</li>
<li>当 Width 为 0，Height 非 0，则 Width 按比例缩放；</li>
<li>当 Width 非 0，Height 为 0，则 Height 按比例缩放；</li>
<li>当 Width、Height 均非 0，则分辨率按用户指定。</li>
默认值：0。
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set 视频流宽度（或长边）的最大值，取值范围：0 和 [128, 8192]，单位：px。
<li>当 Width、Height 均为 0，则分辨率同源；</li>
<li>当 Width 为 0，Height 非 0，则 Width 按比例缩放；</li>
<li>当 Width 非 0，Height 为 0，则 Height 按比例缩放；</li>
<li>当 Width、Height 均非 0，则分辨率按用户指定。</li>
默认值：0。
     * @param Width 视频流宽度（或长边）的最大值，取值范围：0 和 [128, 8192]，单位：px。
<li>当 Width、Height 均为 0，则分辨率同源；</li>
<li>当 Width 为 0，Height 非 0，则 Width 按比例缩放；</li>
<li>当 Width 非 0，Height 为 0，则 Height 按比例缩放；</li>
<li>当 Width、Height 均非 0，则分辨率按用户指定。</li>
默认值：0。
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get 视频流高度（或短边）的最大值，取值范围：0 和 [128, 8192]，单位：px。
<li>当 Width、Height 均为 0，则分辨率同源；</li>
<li>当 Width 为 0，Height 非 0，则 Width 按比例缩放；</li>
<li>当 Width 非 0，Height 为 0，则 Height 按比例缩放；</li>
<li>当 Width、Height 均非 0，则分辨率按用户指定。</li>
默认值：0。 
     * @return Height 视频流高度（或短边）的最大值，取值范围：0 和 [128, 8192]，单位：px。
<li>当 Width、Height 均为 0，则分辨率同源；</li>
<li>当 Width 为 0，Height 非 0，则 Width 按比例缩放；</li>
<li>当 Width 非 0，Height 为 0，则 Height 按比例缩放；</li>
<li>当 Width、Height 均非 0，则分辨率按用户指定。</li>
默认值：0。
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set 视频流高度（或短边）的最大值，取值范围：0 和 [128, 8192]，单位：px。
<li>当 Width、Height 均为 0，则分辨率同源；</li>
<li>当 Width 为 0，Height 非 0，则 Width 按比例缩放；</li>
<li>当 Width 非 0，Height 为 0，则 Height 按比例缩放；</li>
<li>当 Width、Height 均非 0，则分辨率按用户指定。</li>
默认值：0。
     * @param Height 视频流高度（或短边）的最大值，取值范围：0 和 [128, 8192]，单位：px。
<li>当 Width、Height 均为 0，则分辨率同源；</li>
<li>当 Width 为 0，Height 非 0，则 Width 按比例缩放；</li>
<li>当 Width 非 0，Height 为 0，则 Height 按比例缩放；</li>
<li>当 Width、Height 均非 0，则分辨率按用户指定。</li>
默认值：0。
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get 填充方式，当视频流配置宽高参数与原始视频的宽高比不一致时，对转码的处理方式，即为“填充”。可选填充方式：
<li> stretch：拉伸，对每一帧进行拉伸，填满整个画面，可能导致转码后的视频被“压扁“或者“拉长“；</li>
<li>black：留黑，保持视频宽高比不变，边缘剩余部分使用黑色填充。</li>
<li>white：留白，保持视频宽高比不变，边缘剩余部分使用白色填充。</li>
<li>gauss：高斯模糊，保持视频宽高比不变，边缘剩余部分使用高斯模糊填充。</li>
默认值：black 。 
     * @return FillType 填充方式，当视频流配置宽高参数与原始视频的宽高比不一致时，对转码的处理方式，即为“填充”。可选填充方式：
<li> stretch：拉伸，对每一帧进行拉伸，填满整个画面，可能导致转码后的视频被“压扁“或者“拉长“；</li>
<li>black：留黑，保持视频宽高比不变，边缘剩余部分使用黑色填充。</li>
<li>white：留白，保持视频宽高比不变，边缘剩余部分使用白色填充。</li>
<li>gauss：高斯模糊，保持视频宽高比不变，边缘剩余部分使用高斯模糊填充。</li>
默认值：black 。
     */
    public String getFillType() {
        return this.FillType;
    }

    /**
     * Set 填充方式，当视频流配置宽高参数与原始视频的宽高比不一致时，对转码的处理方式，即为“填充”。可选填充方式：
<li> stretch：拉伸，对每一帧进行拉伸，填满整个画面，可能导致转码后的视频被“压扁“或者“拉长“；</li>
<li>black：留黑，保持视频宽高比不变，边缘剩余部分使用黑色填充。</li>
<li>white：留白，保持视频宽高比不变，边缘剩余部分使用白色填充。</li>
<li>gauss：高斯模糊，保持视频宽高比不变，边缘剩余部分使用高斯模糊填充。</li>
默认值：black 。
     * @param FillType 填充方式，当视频流配置宽高参数与原始视频的宽高比不一致时，对转码的处理方式，即为“填充”。可选填充方式：
<li> stretch：拉伸，对每一帧进行拉伸，填满整个画面，可能导致转码后的视频被“压扁“或者“拉长“；</li>
<li>black：留黑，保持视频宽高比不变，边缘剩余部分使用黑色填充。</li>
<li>white：留白，保持视频宽高比不变，边缘剩余部分使用白色填充。</li>
<li>gauss：高斯模糊，保持视频宽高比不变，边缘剩余部分使用高斯模糊填充。</li>
默认值：black 。
     */
    public void setFillType(String FillType) {
        this.FillType = FillType;
    }

    /**
     * Get 视频恒定码率控制因子，取值范围为[1, 51]。

<font color=red>注意：</font>
<li>如果指定该参数，将使用 CRF 的码率控制方式做转码（视频码率将不再生效）；</li>
<li>当指定视频流编码格式为 H.266 时，该字段必填，推荐值为 28；</li>
<li>如果没有特殊需求，不建议指定该参数。</li> 
     * @return Vcrf 视频恒定码率控制因子，取值范围为[1, 51]。

<font color=red>注意：</font>
<li>如果指定该参数，将使用 CRF 的码率控制方式做转码（视频码率将不再生效）；</li>
<li>当指定视频流编码格式为 H.266 时，该字段必填，推荐值为 28；</li>
<li>如果没有特殊需求，不建议指定该参数。</li>
     */
    public Long getVcrf() {
        return this.Vcrf;
    }

    /**
     * Set 视频恒定码率控制因子，取值范围为[1, 51]。

<font color=red>注意：</font>
<li>如果指定该参数，将使用 CRF 的码率控制方式做转码（视频码率将不再生效）；</li>
<li>当指定视频流编码格式为 H.266 时，该字段必填，推荐值为 28；</li>
<li>如果没有特殊需求，不建议指定该参数。</li>
     * @param Vcrf 视频恒定码率控制因子，取值范围为[1, 51]。

<font color=red>注意：</font>
<li>如果指定该参数，将使用 CRF 的码率控制方式做转码（视频码率将不再生效）；</li>
<li>当指定视频流编码格式为 H.266 时，该字段必填，推荐值为 28；</li>
<li>如果没有特殊需求，不建议指定该参数。</li>
     */
    public void setVcrf(Long Vcrf) {
        this.Vcrf = Vcrf;
    }

    /**
     * Get 关键帧 I 帧之间的间隔，取值范围：0 和 [1, 100000]，单位：帧数。
当填 0 或不填时，系统将自动设置 gop 长度。 
     * @return Gop 关键帧 I 帧之间的间隔，取值范围：0 和 [1, 100000]，单位：帧数。
当填 0 或不填时，系统将自动设置 gop 长度。
     */
    public Long getGop() {
        return this.Gop;
    }

    /**
     * Set 关键帧 I 帧之间的间隔，取值范围：0 和 [1, 100000]，单位：帧数。
当填 0 或不填时，系统将自动设置 gop 长度。
     * @param Gop 关键帧 I 帧之间的间隔，取值范围：0 和 [1, 100000]，单位：帧数。
当填 0 或不填时，系统将自动设置 gop 长度。
     */
    public void setGop(Long Gop) {
        this.Gop = Gop;
    }

    /**
     * Get 当原始视频为 HDR（High Dynamic Range）时，转码输出是否依然保持 HDR。取值范围：
<li>ON: 如果原始文件是 HDR，则转码输出保持 HDR；否则转码输出为 SDR （Standard Dynamic Range）。</li>
<li>OFF: 无论原始文件是 HDR 还是 SDR，转码输出均为 SDR。</li>
默认值：OFF。 
     * @return PreserveHDRSwitch 当原始视频为 HDR（High Dynamic Range）时，转码输出是否依然保持 HDR。取值范围：
<li>ON: 如果原始文件是 HDR，则转码输出保持 HDR；否则转码输出为 SDR （Standard Dynamic Range）。</li>
<li>OFF: 无论原始文件是 HDR 还是 SDR，转码输出均为 SDR。</li>
默认值：OFF。
     */
    public String getPreserveHDRSwitch() {
        return this.PreserveHDRSwitch;
    }

    /**
     * Set 当原始视频为 HDR（High Dynamic Range）时，转码输出是否依然保持 HDR。取值范围：
<li>ON: 如果原始文件是 HDR，则转码输出保持 HDR；否则转码输出为 SDR （Standard Dynamic Range）。</li>
<li>OFF: 无论原始文件是 HDR 还是 SDR，转码输出均为 SDR。</li>
默认值：OFF。
     * @param PreserveHDRSwitch 当原始视频为 HDR（High Dynamic Range）时，转码输出是否依然保持 HDR。取值范围：
<li>ON: 如果原始文件是 HDR，则转码输出保持 HDR；否则转码输出为 SDR （Standard Dynamic Range）。</li>
<li>OFF: 无论原始文件是 HDR 还是 SDR，转码输出均为 SDR。</li>
默认值：OFF。
     */
    public void setPreserveHDRSwitch(String PreserveHDRSwitch) {
        this.PreserveHDRSwitch = PreserveHDRSwitch;
    }

    /**
     * Get 编码标签，仅当视频流的编码格式为 H.265 编码时有效，可选值：
<li>hvc1 表示 hvc1 标签；</li>
<li>hev1 表示 hev1 标签。 </li>
默认值：hvc1。 
     * @return CodecTag 编码标签，仅当视频流的编码格式为 H.265 编码时有效，可选值：
<li>hvc1 表示 hvc1 标签；</li>
<li>hev1 表示 hev1 标签。 </li>
默认值：hvc1。
     */
    public String getCodecTag() {
        return this.CodecTag;
    }

    /**
     * Set 编码标签，仅当视频流的编码格式为 H.265 编码时有效，可选值：
<li>hvc1 表示 hvc1 标签；</li>
<li>hev1 表示 hev1 标签。 </li>
默认值：hvc1。
     * @param CodecTag 编码标签，仅当视频流的编码格式为 H.265 编码时有效，可选值：
<li>hvc1 表示 hvc1 标签；</li>
<li>hev1 表示 hev1 标签。 </li>
默认值：hvc1。
     */
    public void setCodecTag(String CodecTag) {
        this.CodecTag = CodecTag;
    }

    public VideoTemplateInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VideoTemplateInfo(VideoTemplateInfo source) {
        if (source.Codec != null) {
            this.Codec = new String(source.Codec);
        }
        if (source.Fps != null) {
            this.Fps = new Long(source.Fps);
        }
        if (source.Bitrate != null) {
            this.Bitrate = new Long(source.Bitrate);
        }
        if (source.ResolutionAdaptive != null) {
            this.ResolutionAdaptive = new String(source.ResolutionAdaptive);
        }
        if (source.Width != null) {
            this.Width = new Long(source.Width);
        }
        if (source.Height != null) {
            this.Height = new Long(source.Height);
        }
        if (source.FillType != null) {
            this.FillType = new String(source.FillType);
        }
        if (source.Vcrf != null) {
            this.Vcrf = new Long(source.Vcrf);
        }
        if (source.Gop != null) {
            this.Gop = new Long(source.Gop);
        }
        if (source.PreserveHDRSwitch != null) {
            this.PreserveHDRSwitch = new String(source.PreserveHDRSwitch);
        }
        if (source.CodecTag != null) {
            this.CodecTag = new String(source.CodecTag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Codec", this.Codec);
        this.setParamSimple(map, prefix + "Fps", this.Fps);
        this.setParamSimple(map, prefix + "Bitrate", this.Bitrate);
        this.setParamSimple(map, prefix + "ResolutionAdaptive", this.ResolutionAdaptive);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "FillType", this.FillType);
        this.setParamSimple(map, prefix + "Vcrf", this.Vcrf);
        this.setParamSimple(map, prefix + "Gop", this.Gop);
        this.setParamSimple(map, prefix + "PreserveHDRSwitch", this.PreserveHDRSwitch);
        this.setParamSimple(map, prefix + "CodecTag", this.CodecTag);

    }
}

