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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VideoTemplateInfo extends AbstractModel {

    /**
    * <p>视频流的编码格式，可选值：</p><li>libx264：H.264 编码；</li><li>libx265：H.265 编码；</li><li>av1：AOMedia Video 1 编码；</li><li>H.266：H.266 编码。</li><font color="red">注意：</font><li> av1，H.266 编码容器目前只支持 mp4 ；</li><li> H.266 目前只支持恒定 CRF 码率控制方式。 </li>
    */
    @SerializedName("Codec")
    @Expose
    private String Codec;

    /**
    * <p>视频帧率，取值范围：[0, 100]，单位：Hz。<br>当取值为 0，表示帧率和原始视频保持一致。</p>
    */
    @SerializedName("Fps")
    @Expose
    private Long Fps;

    /**
    * <p>视频流的码率，取值范围：0 和 [128, 100000]，单位：kbps。<br>当取值为 0，表示由云点播自动设置码率。</p>
    */
    @SerializedName("Bitrate")
    @Expose
    private Long Bitrate;

    /**
    * <p>分辨率自适应，可选值：</p><li>open：开启，此时，Width 代表视频的长边，Height 表示视频的短边；</li><li>close：关闭，此时，Width 代表视频的宽度，Height 表示视频的高度。</li>默认值：open。
    */
    @SerializedName("ResolutionAdaptive")
    @Expose
    private String ResolutionAdaptive;

    /**
    * <p>视频流宽度（或长边）的最大值，取值范围：0 和 [128, 8192]，单位：px。</p><li>当 Width、Height 均为 0，则分辨率同源；</li><li>当 Width 为 0，Height 非 0，则 Width 按比例缩放；</li><li>当 Width 非 0，Height 为 0，则 Height 按比例缩放；</li><li>当 Width、Height 均非 0，则分辨率按用户指定。</li>默认值：0。
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * <p>视频流高度（或短边）的最大值，取值范围：0 和 [128, 8192]，单位：px。</p><li>当 Width、Height 均为 0，则分辨率同源；</li><li>当 Width 为 0，Height 非 0，则 Width 按比例缩放；</li><li>当 Width 非 0，Height 为 0，则 Height 按比例缩放；</li><li>当 Width、Height 均非 0，则分辨率按用户指定。</li>默认值：0。
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * <p>填充方式，当视频流配置宽高参数与原始视频的宽高比不一致时，对转码的处理方式，即为“填充”。可选填充方式：</p><li> stretch：拉伸，对每一帧进行拉伸，填满整个画面，可能导致转码后的视频被“压扁“或者“拉长“；</li><li>black：留黑，保持视频宽高比不变，边缘剩余部分使用黑色填充。</li><li>white：留白，保持视频宽高比不变，边缘剩余部分使用白色填充。</li><li>gauss：高斯模糊，保持视频宽高比不变，边缘剩余部分使用高斯模糊填充。</li>默认值：black 。
    */
    @SerializedName("FillType")
    @Expose
    private String FillType;

    /**
    * <p>视频恒定码率控制因子，取值范围为[1, 51]。</p><p><font color="red">注意：</font></p><li>如果指定该参数，将使用 CRF 的码率控制方式做转码（视频码率将不再生效）；</li><li>当指定视频流编码格式为 H.266 时，该字段必填，推荐值为 28；</li><li>如果没有特殊需求，不建议指定该参数。</li>
    */
    @SerializedName("Vcrf")
    @Expose
    private Long Vcrf;

    /**
    * <p>关键帧 I 帧之间的间隔，取值范围：0 和 [1, 100000]，单位：帧数。<br>当填 0 或不填时，系统将自动设置 gop 长度。</p>
    */
    @SerializedName("Gop")
    @Expose
    private Long Gop;

    /**
    * <p>Gop数值单位。</p><p>枚举值：</p><ul><li>frame： 表示帧数。</li><li>second： 表示秒数。</li></ul><p>默认值：frame</p>
    */
    @SerializedName("GopUnit")
    @Expose
    private String GopUnit;

    /**
    * <p>当原始视频为 HDR（High Dynamic Range）时，转码输出是否依然保持 HDR。取值范围：</p><li>ON: 如果原始文件是 HDR，则转码输出保持 HDR；否则转码输出为 SDR （Standard Dynamic Range）。</li><li>OFF: 无论原始文件是 HDR 还是 SDR，转码输出均为 SDR。</li>默认值：OFF。
    */
    @SerializedName("PreserveHDRSwitch")
    @Expose
    private String PreserveHDRSwitch;

    /**
    * <p>编码标签，仅当视频流的编码格式为 H.265 编码时有效，可选值：</p><li>hvc1 表示 hvc1 标签；</li><li>hev1 表示 hev1 标签。 </li>默认值：hvc1。
    */
    @SerializedName("CodecTag")
    @Expose
    private String CodecTag;

    /**
    * <p>码率控制模式。</p><p>枚举值：</p><ul><li>VBR： Variable Bit Rate，动态比特率，根据视频画面的复杂度动态调整输出的码率，使得画面质量更高，适用于存储场景和对画面质量要求较高的应用。</li><li>ABR： Average Bit Rate，平均比特率，尽量保持输出视频的平均码率稳定，但允许短期内的码率波动，适用于需要在保持一定画质的情况下尽量减少整体码率的场景。</li><li>CBR： Constant Bit Rate，恒定比特率，指视频编码时输出的码率保持恒定不变，不考虑画面复杂度的变化，适用于对网络带宽要求较为严格的场景，如直播等。</li><li>VCRF： 恒定质量因子，通过设定一个质量因子来控制视频质量，实现视频的恒定质量编码，码率会根据内容的复杂度自动调整，适用于希望保持一定画质的场景。</li></ul><p>默认值：VBR</p>
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * <p>参考帧之间的B帧数，默认为自动。</p><p>取值范围：[0, 16]</p>
    */
    @SerializedName("Bframes")
    @Expose
    private Long Bframes;

    /**
    * <p>分片平均时长。0或不填表示自动，将根据视频的 GOP 等特征自动选择合适的分片时长。</p><p>取值范围：[0, 10]</p><p>单位：秒</p><p>只支持转码模板，暂不支持自适应码流模板。</p>
    */
    @SerializedName("HlsTime")
    @Expose
    private Long HlsTime;

    /**
     * Get <p>视频流的编码格式，可选值：</p><li>libx264：H.264 编码；</li><li>libx265：H.265 编码；</li><li>av1：AOMedia Video 1 编码；</li><li>H.266：H.266 编码。</li><font color="red">注意：</font><li> av1，H.266 编码容器目前只支持 mp4 ；</li><li> H.266 目前只支持恒定 CRF 码率控制方式。 </li> 
     * @return Codec <p>视频流的编码格式，可选值：</p><li>libx264：H.264 编码；</li><li>libx265：H.265 编码；</li><li>av1：AOMedia Video 1 编码；</li><li>H.266：H.266 编码。</li><font color="red">注意：</font><li> av1，H.266 编码容器目前只支持 mp4 ；</li><li> H.266 目前只支持恒定 CRF 码率控制方式。 </li>
     */
    public String getCodec() {
        return this.Codec;
    }

    /**
     * Set <p>视频流的编码格式，可选值：</p><li>libx264：H.264 编码；</li><li>libx265：H.265 编码；</li><li>av1：AOMedia Video 1 编码；</li><li>H.266：H.266 编码。</li><font color="red">注意：</font><li> av1，H.266 编码容器目前只支持 mp4 ；</li><li> H.266 目前只支持恒定 CRF 码率控制方式。 </li>
     * @param Codec <p>视频流的编码格式，可选值：</p><li>libx264：H.264 编码；</li><li>libx265：H.265 编码；</li><li>av1：AOMedia Video 1 编码；</li><li>H.266：H.266 编码。</li><font color="red">注意：</font><li> av1，H.266 编码容器目前只支持 mp4 ；</li><li> H.266 目前只支持恒定 CRF 码率控制方式。 </li>
     */
    public void setCodec(String Codec) {
        this.Codec = Codec;
    }

    /**
     * Get <p>视频帧率，取值范围：[0, 100]，单位：Hz。<br>当取值为 0，表示帧率和原始视频保持一致。</p> 
     * @return Fps <p>视频帧率，取值范围：[0, 100]，单位：Hz。<br>当取值为 0，表示帧率和原始视频保持一致。</p>
     */
    public Long getFps() {
        return this.Fps;
    }

    /**
     * Set <p>视频帧率，取值范围：[0, 100]，单位：Hz。<br>当取值为 0，表示帧率和原始视频保持一致。</p>
     * @param Fps <p>视频帧率，取值范围：[0, 100]，单位：Hz。<br>当取值为 0，表示帧率和原始视频保持一致。</p>
     */
    public void setFps(Long Fps) {
        this.Fps = Fps;
    }

    /**
     * Get <p>视频流的码率，取值范围：0 和 [128, 100000]，单位：kbps。<br>当取值为 0，表示由云点播自动设置码率。</p> 
     * @return Bitrate <p>视频流的码率，取值范围：0 和 [128, 100000]，单位：kbps。<br>当取值为 0，表示由云点播自动设置码率。</p>
     */
    public Long getBitrate() {
        return this.Bitrate;
    }

    /**
     * Set <p>视频流的码率，取值范围：0 和 [128, 100000]，单位：kbps。<br>当取值为 0，表示由云点播自动设置码率。</p>
     * @param Bitrate <p>视频流的码率，取值范围：0 和 [128, 100000]，单位：kbps。<br>当取值为 0，表示由云点播自动设置码率。</p>
     */
    public void setBitrate(Long Bitrate) {
        this.Bitrate = Bitrate;
    }

    /**
     * Get <p>分辨率自适应，可选值：</p><li>open：开启，此时，Width 代表视频的长边，Height 表示视频的短边；</li><li>close：关闭，此时，Width 代表视频的宽度，Height 表示视频的高度。</li>默认值：open。 
     * @return ResolutionAdaptive <p>分辨率自适应，可选值：</p><li>open：开启，此时，Width 代表视频的长边，Height 表示视频的短边；</li><li>close：关闭，此时，Width 代表视频的宽度，Height 表示视频的高度。</li>默认值：open。
     */
    public String getResolutionAdaptive() {
        return this.ResolutionAdaptive;
    }

    /**
     * Set <p>分辨率自适应，可选值：</p><li>open：开启，此时，Width 代表视频的长边，Height 表示视频的短边；</li><li>close：关闭，此时，Width 代表视频的宽度，Height 表示视频的高度。</li>默认值：open。
     * @param ResolutionAdaptive <p>分辨率自适应，可选值：</p><li>open：开启，此时，Width 代表视频的长边，Height 表示视频的短边；</li><li>close：关闭，此时，Width 代表视频的宽度，Height 表示视频的高度。</li>默认值：open。
     */
    public void setResolutionAdaptive(String ResolutionAdaptive) {
        this.ResolutionAdaptive = ResolutionAdaptive;
    }

    /**
     * Get <p>视频流宽度（或长边）的最大值，取值范围：0 和 [128, 8192]，单位：px。</p><li>当 Width、Height 均为 0，则分辨率同源；</li><li>当 Width 为 0，Height 非 0，则 Width 按比例缩放；</li><li>当 Width 非 0，Height 为 0，则 Height 按比例缩放；</li><li>当 Width、Height 均非 0，则分辨率按用户指定。</li>默认值：0。 
     * @return Width <p>视频流宽度（或长边）的最大值，取值范围：0 和 [128, 8192]，单位：px。</p><li>当 Width、Height 均为 0，则分辨率同源；</li><li>当 Width 为 0，Height 非 0，则 Width 按比例缩放；</li><li>当 Width 非 0，Height 为 0，则 Height 按比例缩放；</li><li>当 Width、Height 均非 0，则分辨率按用户指定。</li>默认值：0。
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set <p>视频流宽度（或长边）的最大值，取值范围：0 和 [128, 8192]，单位：px。</p><li>当 Width、Height 均为 0，则分辨率同源；</li><li>当 Width 为 0，Height 非 0，则 Width 按比例缩放；</li><li>当 Width 非 0，Height 为 0，则 Height 按比例缩放；</li><li>当 Width、Height 均非 0，则分辨率按用户指定。</li>默认值：0。
     * @param Width <p>视频流宽度（或长边）的最大值，取值范围：0 和 [128, 8192]，单位：px。</p><li>当 Width、Height 均为 0，则分辨率同源；</li><li>当 Width 为 0，Height 非 0，则 Width 按比例缩放；</li><li>当 Width 非 0，Height 为 0，则 Height 按比例缩放；</li><li>当 Width、Height 均非 0，则分辨率按用户指定。</li>默认值：0。
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get <p>视频流高度（或短边）的最大值，取值范围：0 和 [128, 8192]，单位：px。</p><li>当 Width、Height 均为 0，则分辨率同源；</li><li>当 Width 为 0，Height 非 0，则 Width 按比例缩放；</li><li>当 Width 非 0，Height 为 0，则 Height 按比例缩放；</li><li>当 Width、Height 均非 0，则分辨率按用户指定。</li>默认值：0。 
     * @return Height <p>视频流高度（或短边）的最大值，取值范围：0 和 [128, 8192]，单位：px。</p><li>当 Width、Height 均为 0，则分辨率同源；</li><li>当 Width 为 0，Height 非 0，则 Width 按比例缩放；</li><li>当 Width 非 0，Height 为 0，则 Height 按比例缩放；</li><li>当 Width、Height 均非 0，则分辨率按用户指定。</li>默认值：0。
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set <p>视频流高度（或短边）的最大值，取值范围：0 和 [128, 8192]，单位：px。</p><li>当 Width、Height 均为 0，则分辨率同源；</li><li>当 Width 为 0，Height 非 0，则 Width 按比例缩放；</li><li>当 Width 非 0，Height 为 0，则 Height 按比例缩放；</li><li>当 Width、Height 均非 0，则分辨率按用户指定。</li>默认值：0。
     * @param Height <p>视频流高度（或短边）的最大值，取值范围：0 和 [128, 8192]，单位：px。</p><li>当 Width、Height 均为 0，则分辨率同源；</li><li>当 Width 为 0，Height 非 0，则 Width 按比例缩放；</li><li>当 Width 非 0，Height 为 0，则 Height 按比例缩放；</li><li>当 Width、Height 均非 0，则分辨率按用户指定。</li>默认值：0。
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get <p>填充方式，当视频流配置宽高参数与原始视频的宽高比不一致时，对转码的处理方式，即为“填充”。可选填充方式：</p><li> stretch：拉伸，对每一帧进行拉伸，填满整个画面，可能导致转码后的视频被“压扁“或者“拉长“；</li><li>black：留黑，保持视频宽高比不变，边缘剩余部分使用黑色填充。</li><li>white：留白，保持视频宽高比不变，边缘剩余部分使用白色填充。</li><li>gauss：高斯模糊，保持视频宽高比不变，边缘剩余部分使用高斯模糊填充。</li>默认值：black 。 
     * @return FillType <p>填充方式，当视频流配置宽高参数与原始视频的宽高比不一致时，对转码的处理方式，即为“填充”。可选填充方式：</p><li> stretch：拉伸，对每一帧进行拉伸，填满整个画面，可能导致转码后的视频被“压扁“或者“拉长“；</li><li>black：留黑，保持视频宽高比不变，边缘剩余部分使用黑色填充。</li><li>white：留白，保持视频宽高比不变，边缘剩余部分使用白色填充。</li><li>gauss：高斯模糊，保持视频宽高比不变，边缘剩余部分使用高斯模糊填充。</li>默认值：black 。
     */
    public String getFillType() {
        return this.FillType;
    }

    /**
     * Set <p>填充方式，当视频流配置宽高参数与原始视频的宽高比不一致时，对转码的处理方式，即为“填充”。可选填充方式：</p><li> stretch：拉伸，对每一帧进行拉伸，填满整个画面，可能导致转码后的视频被“压扁“或者“拉长“；</li><li>black：留黑，保持视频宽高比不变，边缘剩余部分使用黑色填充。</li><li>white：留白，保持视频宽高比不变，边缘剩余部分使用白色填充。</li><li>gauss：高斯模糊，保持视频宽高比不变，边缘剩余部分使用高斯模糊填充。</li>默认值：black 。
     * @param FillType <p>填充方式，当视频流配置宽高参数与原始视频的宽高比不一致时，对转码的处理方式，即为“填充”。可选填充方式：</p><li> stretch：拉伸，对每一帧进行拉伸，填满整个画面，可能导致转码后的视频被“压扁“或者“拉长“；</li><li>black：留黑，保持视频宽高比不变，边缘剩余部分使用黑色填充。</li><li>white：留白，保持视频宽高比不变，边缘剩余部分使用白色填充。</li><li>gauss：高斯模糊，保持视频宽高比不变，边缘剩余部分使用高斯模糊填充。</li>默认值：black 。
     */
    public void setFillType(String FillType) {
        this.FillType = FillType;
    }

    /**
     * Get <p>视频恒定码率控制因子，取值范围为[1, 51]。</p><p><font color="red">注意：</font></p><li>如果指定该参数，将使用 CRF 的码率控制方式做转码（视频码率将不再生效）；</li><li>当指定视频流编码格式为 H.266 时，该字段必填，推荐值为 28；</li><li>如果没有特殊需求，不建议指定该参数。</li> 
     * @return Vcrf <p>视频恒定码率控制因子，取值范围为[1, 51]。</p><p><font color="red">注意：</font></p><li>如果指定该参数，将使用 CRF 的码率控制方式做转码（视频码率将不再生效）；</li><li>当指定视频流编码格式为 H.266 时，该字段必填，推荐值为 28；</li><li>如果没有特殊需求，不建议指定该参数。</li>
     */
    public Long getVcrf() {
        return this.Vcrf;
    }

    /**
     * Set <p>视频恒定码率控制因子，取值范围为[1, 51]。</p><p><font color="red">注意：</font></p><li>如果指定该参数，将使用 CRF 的码率控制方式做转码（视频码率将不再生效）；</li><li>当指定视频流编码格式为 H.266 时，该字段必填，推荐值为 28；</li><li>如果没有特殊需求，不建议指定该参数。</li>
     * @param Vcrf <p>视频恒定码率控制因子，取值范围为[1, 51]。</p><p><font color="red">注意：</font></p><li>如果指定该参数，将使用 CRF 的码率控制方式做转码（视频码率将不再生效）；</li><li>当指定视频流编码格式为 H.266 时，该字段必填，推荐值为 28；</li><li>如果没有特殊需求，不建议指定该参数。</li>
     */
    public void setVcrf(Long Vcrf) {
        this.Vcrf = Vcrf;
    }

    /**
     * Get <p>关键帧 I 帧之间的间隔，取值范围：0 和 [1, 100000]，单位：帧数。<br>当填 0 或不填时，系统将自动设置 gop 长度。</p> 
     * @return Gop <p>关键帧 I 帧之间的间隔，取值范围：0 和 [1, 100000]，单位：帧数。<br>当填 0 或不填时，系统将自动设置 gop 长度。</p>
     */
    public Long getGop() {
        return this.Gop;
    }

    /**
     * Set <p>关键帧 I 帧之间的间隔，取值范围：0 和 [1, 100000]，单位：帧数。<br>当填 0 或不填时，系统将自动设置 gop 长度。</p>
     * @param Gop <p>关键帧 I 帧之间的间隔，取值范围：0 和 [1, 100000]，单位：帧数。<br>当填 0 或不填时，系统将自动设置 gop 长度。</p>
     */
    public void setGop(Long Gop) {
        this.Gop = Gop;
    }

    /**
     * Get <p>Gop数值单位。</p><p>枚举值：</p><ul><li>frame： 表示帧数。</li><li>second： 表示秒数。</li></ul><p>默认值：frame</p> 
     * @return GopUnit <p>Gop数值单位。</p><p>枚举值：</p><ul><li>frame： 表示帧数。</li><li>second： 表示秒数。</li></ul><p>默认值：frame</p>
     */
    public String getGopUnit() {
        return this.GopUnit;
    }

    /**
     * Set <p>Gop数值单位。</p><p>枚举值：</p><ul><li>frame： 表示帧数。</li><li>second： 表示秒数。</li></ul><p>默认值：frame</p>
     * @param GopUnit <p>Gop数值单位。</p><p>枚举值：</p><ul><li>frame： 表示帧数。</li><li>second： 表示秒数。</li></ul><p>默认值：frame</p>
     */
    public void setGopUnit(String GopUnit) {
        this.GopUnit = GopUnit;
    }

    /**
     * Get <p>当原始视频为 HDR（High Dynamic Range）时，转码输出是否依然保持 HDR。取值范围：</p><li>ON: 如果原始文件是 HDR，则转码输出保持 HDR；否则转码输出为 SDR （Standard Dynamic Range）。</li><li>OFF: 无论原始文件是 HDR 还是 SDR，转码输出均为 SDR。</li>默认值：OFF。 
     * @return PreserveHDRSwitch <p>当原始视频为 HDR（High Dynamic Range）时，转码输出是否依然保持 HDR。取值范围：</p><li>ON: 如果原始文件是 HDR，则转码输出保持 HDR；否则转码输出为 SDR （Standard Dynamic Range）。</li><li>OFF: 无论原始文件是 HDR 还是 SDR，转码输出均为 SDR。</li>默认值：OFF。
     */
    public String getPreserveHDRSwitch() {
        return this.PreserveHDRSwitch;
    }

    /**
     * Set <p>当原始视频为 HDR（High Dynamic Range）时，转码输出是否依然保持 HDR。取值范围：</p><li>ON: 如果原始文件是 HDR，则转码输出保持 HDR；否则转码输出为 SDR （Standard Dynamic Range）。</li><li>OFF: 无论原始文件是 HDR 还是 SDR，转码输出均为 SDR。</li>默认值：OFF。
     * @param PreserveHDRSwitch <p>当原始视频为 HDR（High Dynamic Range）时，转码输出是否依然保持 HDR。取值范围：</p><li>ON: 如果原始文件是 HDR，则转码输出保持 HDR；否则转码输出为 SDR （Standard Dynamic Range）。</li><li>OFF: 无论原始文件是 HDR 还是 SDR，转码输出均为 SDR。</li>默认值：OFF。
     */
    public void setPreserveHDRSwitch(String PreserveHDRSwitch) {
        this.PreserveHDRSwitch = PreserveHDRSwitch;
    }

    /**
     * Get <p>编码标签，仅当视频流的编码格式为 H.265 编码时有效，可选值：</p><li>hvc1 表示 hvc1 标签；</li><li>hev1 表示 hev1 标签。 </li>默认值：hvc1。 
     * @return CodecTag <p>编码标签，仅当视频流的编码格式为 H.265 编码时有效，可选值：</p><li>hvc1 表示 hvc1 标签；</li><li>hev1 表示 hev1 标签。 </li>默认值：hvc1。
     */
    public String getCodecTag() {
        return this.CodecTag;
    }

    /**
     * Set <p>编码标签，仅当视频流的编码格式为 H.265 编码时有效，可选值：</p><li>hvc1 表示 hvc1 标签；</li><li>hev1 表示 hev1 标签。 </li>默认值：hvc1。
     * @param CodecTag <p>编码标签，仅当视频流的编码格式为 H.265 编码时有效，可选值：</p><li>hvc1 表示 hvc1 标签；</li><li>hev1 表示 hev1 标签。 </li>默认值：hvc1。
     */
    public void setCodecTag(String CodecTag) {
        this.CodecTag = CodecTag;
    }

    /**
     * Get <p>码率控制模式。</p><p>枚举值：</p><ul><li>VBR： Variable Bit Rate，动态比特率，根据视频画面的复杂度动态调整输出的码率，使得画面质量更高，适用于存储场景和对画面质量要求较高的应用。</li><li>ABR： Average Bit Rate，平均比特率，尽量保持输出视频的平均码率稳定，但允许短期内的码率波动，适用于需要在保持一定画质的情况下尽量减少整体码率的场景。</li><li>CBR： Constant Bit Rate，恒定比特率，指视频编码时输出的码率保持恒定不变，不考虑画面复杂度的变化，适用于对网络带宽要求较为严格的场景，如直播等。</li><li>VCRF： 恒定质量因子，通过设定一个质量因子来控制视频质量，实现视频的恒定质量编码，码率会根据内容的复杂度自动调整，适用于希望保持一定画质的场景。</li></ul><p>默认值：VBR</p> 
     * @return Mode <p>码率控制模式。</p><p>枚举值：</p><ul><li>VBR： Variable Bit Rate，动态比特率，根据视频画面的复杂度动态调整输出的码率，使得画面质量更高，适用于存储场景和对画面质量要求较高的应用。</li><li>ABR： Average Bit Rate，平均比特率，尽量保持输出视频的平均码率稳定，但允许短期内的码率波动，适用于需要在保持一定画质的情况下尽量减少整体码率的场景。</li><li>CBR： Constant Bit Rate，恒定比特率，指视频编码时输出的码率保持恒定不变，不考虑画面复杂度的变化，适用于对网络带宽要求较为严格的场景，如直播等。</li><li>VCRF： 恒定质量因子，通过设定一个质量因子来控制视频质量，实现视频的恒定质量编码，码率会根据内容的复杂度自动调整，适用于希望保持一定画质的场景。</li></ul><p>默认值：VBR</p>
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set <p>码率控制模式。</p><p>枚举值：</p><ul><li>VBR： Variable Bit Rate，动态比特率，根据视频画面的复杂度动态调整输出的码率，使得画面质量更高，适用于存储场景和对画面质量要求较高的应用。</li><li>ABR： Average Bit Rate，平均比特率，尽量保持输出视频的平均码率稳定，但允许短期内的码率波动，适用于需要在保持一定画质的情况下尽量减少整体码率的场景。</li><li>CBR： Constant Bit Rate，恒定比特率，指视频编码时输出的码率保持恒定不变，不考虑画面复杂度的变化，适用于对网络带宽要求较为严格的场景，如直播等。</li><li>VCRF： 恒定质量因子，通过设定一个质量因子来控制视频质量，实现视频的恒定质量编码，码率会根据内容的复杂度自动调整，适用于希望保持一定画质的场景。</li></ul><p>默认值：VBR</p>
     * @param Mode <p>码率控制模式。</p><p>枚举值：</p><ul><li>VBR： Variable Bit Rate，动态比特率，根据视频画面的复杂度动态调整输出的码率，使得画面质量更高，适用于存储场景和对画面质量要求较高的应用。</li><li>ABR： Average Bit Rate，平均比特率，尽量保持输出视频的平均码率稳定，但允许短期内的码率波动，适用于需要在保持一定画质的情况下尽量减少整体码率的场景。</li><li>CBR： Constant Bit Rate，恒定比特率，指视频编码时输出的码率保持恒定不变，不考虑画面复杂度的变化，适用于对网络带宽要求较为严格的场景，如直播等。</li><li>VCRF： 恒定质量因子，通过设定一个质量因子来控制视频质量，实现视频的恒定质量编码，码率会根据内容的复杂度自动调整，适用于希望保持一定画质的场景。</li></ul><p>默认值：VBR</p>
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get <p>参考帧之间的B帧数，默认为自动。</p><p>取值范围：[0, 16]</p> 
     * @return Bframes <p>参考帧之间的B帧数，默认为自动。</p><p>取值范围：[0, 16]</p>
     */
    public Long getBframes() {
        return this.Bframes;
    }

    /**
     * Set <p>参考帧之间的B帧数，默认为自动。</p><p>取值范围：[0, 16]</p>
     * @param Bframes <p>参考帧之间的B帧数，默认为自动。</p><p>取值范围：[0, 16]</p>
     */
    public void setBframes(Long Bframes) {
        this.Bframes = Bframes;
    }

    /**
     * Get <p>分片平均时长。0或不填表示自动，将根据视频的 GOP 等特征自动选择合适的分片时长。</p><p>取值范围：[0, 10]</p><p>单位：秒</p><p>只支持转码模板，暂不支持自适应码流模板。</p> 
     * @return HlsTime <p>分片平均时长。0或不填表示自动，将根据视频的 GOP 等特征自动选择合适的分片时长。</p><p>取值范围：[0, 10]</p><p>单位：秒</p><p>只支持转码模板，暂不支持自适应码流模板。</p>
     */
    public Long getHlsTime() {
        return this.HlsTime;
    }

    /**
     * Set <p>分片平均时长。0或不填表示自动，将根据视频的 GOP 等特征自动选择合适的分片时长。</p><p>取值范围：[0, 10]</p><p>单位：秒</p><p>只支持转码模板，暂不支持自适应码流模板。</p>
     * @param HlsTime <p>分片平均时长。0或不填表示自动，将根据视频的 GOP 等特征自动选择合适的分片时长。</p><p>取值范围：[0, 10]</p><p>单位：秒</p><p>只支持转码模板，暂不支持自适应码流模板。</p>
     */
    public void setHlsTime(Long HlsTime) {
        this.HlsTime = HlsTime;
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
        if (source.GopUnit != null) {
            this.GopUnit = new String(source.GopUnit);
        }
        if (source.PreserveHDRSwitch != null) {
            this.PreserveHDRSwitch = new String(source.PreserveHDRSwitch);
        }
        if (source.CodecTag != null) {
            this.CodecTag = new String(source.CodecTag);
        }
        if (source.Mode != null) {
            this.Mode = new String(source.Mode);
        }
        if (source.Bframes != null) {
            this.Bframes = new Long(source.Bframes);
        }
        if (source.HlsTime != null) {
            this.HlsTime = new Long(source.HlsTime);
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
        this.setParamSimple(map, prefix + "GopUnit", this.GopUnit);
        this.setParamSimple(map, prefix + "PreserveHDRSwitch", this.PreserveHDRSwitch);
        this.setParamSimple(map, prefix + "CodecTag", this.CodecTag);
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "Bframes", this.Bframes);
        this.setParamSimple(map, prefix + "HlsTime", this.HlsTime);

    }
}

