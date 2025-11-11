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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VideoTemplateInfoForUpdate extends AbstractModel {

    /**
    * 视频流的编码格式，可选值：
<li>h264：H.264 编码</li>
<li>h265：H.265 编码</li>
<li>h266：H.266 编码</li>
<li>av1：AOMedia Video 1 编码</li>
<li>vp8：VP8 编码</li>
<li>vp9：VP9 编码</li>
<li>mpeg2：MPEG2 编码</li>
<li>dnxhd：DNxHD 编码</li>
<li>mv-hevc：MV-HEVC 编码</li>

注意：av1 编码容器目前只支持 mp4 ，webm，mkv。
注意：H.266 编码容器目前只支持 mp4 ，hls，ts，mov。
注意：VP8、VP9编码容器目前只支持webm，mkv。
注意：MPEG2、dnxhd 编码容器目前只支持mxf。
注意：MV-HEVC编码容器目前只支持mp4，hls，mov。其中hls格式只支持mp4分片格式。且要求输入源为全景视频（带多视角）。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Codec")
    @Expose
    private String Codec;

    /**
    * 视频帧率，取值范围：
当FpsDenominator的值为空时，范围：[0, 120]，单位：Hz；
当FpsDenominator的值不为空时，Fps/FpsDenominator的范围：[0,120]
当取值为 0，表示帧率和原始视频保持一致。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Fps")
    @Expose
    private Long Fps;

    /**
    * 视频流的码率，取值范围：0 和 [128, 100000]，单位：kbps。
当取值为 0，表示视频码率和原始视频保持一致。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Bitrate")
    @Expose
    private Long Bitrate;

    /**
    * 分辨率自适应，可选值：
<li>open：开启，此时，Width 代表视频的长边，Height 表示视频的短边；</li>
<li>close：关闭，此时，Width 代表视频的宽度，Height 表示视频的高度。</li>
注意：自适应模式时，Width不能小于Height。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResolutionAdaptive")
    @Expose
    private String ResolutionAdaptive;

    /**
    * 视频流宽度（或长边）的最大值，取值范围：0 和 [128, 4096]，单位：px。
<li>当 Width、Height 均为 0，则分辨率同源；</li>
<li>当 Width 为 0，Height 非 0，则 Width 按比例缩放；</li>
<li>当 Width 非 0，Height 为 0，则 Height 按比例缩放；</li>
<li>当 Width、Height 均非 0，则分辨率按用户指定。</li>
注意：Codec为MV-HEVC时可以支持到7680
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * 视频流高度（或短边）的最大值，取值范围：0 和 [128, 4096]，单位：px。
注意：Codec为MV-HEVC时可以支持到7680
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * 关键帧 I 帧之间的间隔，允许按帧或秒自定义GOP长度，取值范围：0 和 [1, 100000]。
当填 0 时，系统将自动设置 gop 长度。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Gop")
    @Expose
    private Long Gop;

    /**
    * Gop数值单位，可选值： 
frame：表示帧 
second：表示秒
默认值：frame
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GopUnit")
    @Expose
    private String GopUnit;

    /**
    * 填充方式，当视频流配置宽高参数与原始视频的宽高比不一致时，对转码的处理方式，即为“填充”。可选填充方式：
 <li> stretch：拉伸，对每一帧进行拉伸，填满整个画面，可能导致转码后的视频被“压扁“或者“拉长“；</li>
<li>black：留黑，保持视频宽高比不变，边缘剩余部分使用黑色填充。</li>
<li>white：留白，保持视频宽高比不变，边缘剩余部分使用白色填充。</li>
<li>gauss：高斯模糊，保持视频宽高比不变，边缘剩余部分使用高斯模糊填充。</li>
<li>smarttailor：智能剪裁：智能选取视频画面，来保证画面比例裁剪。</li>
默认值：black 。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FillType")
    @Expose
    private String FillType;

    /**
    * 视频的恒定码率控制因子，取值范围为[0, 51]，不填表示“自动”。如果没有特殊需求，建议不指定该参数。
当Mode参数设置为VBR时，如果同时配置了Vcrf值，MPS将在VBR模式下处理视频，同时考虑Vcrf和Bitrate参数的设置，以平衡视频质量、码率、转码效率和文件大小。
当Mode参数设置为CRF，Bitrate设置将失效，编码将根据Vcrf值进行。
当Mode参数选择ABR或CBR时，无需配置Vcrf值。
注意：需要修改为自动时，填100

注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Vcrf")
    @Expose
    private Long Vcrf;

    /**
    * 内容自适应编码。可选值：
<li>0：不开启</li>
<li>1：开启</li>
默认值: 0.   当开启该参数时，将会自适应生成多个不同分辨率，不同码率的码流， 其中VideoTemplate的宽和高为多个码流中的最大分辨率，VideoTemplate中的码率为多个码流中的最高码率， VideoTemplate中的vcrf为多个码流中的最高质量。 当不设置分辨率、码率和vcrf时， ContentAdaptStream 参数生成的最高分辨率为视频源的分辨率，视频质量为接近vmaf95分。 若要开启该参数或了解计费细节, 请联系您的腾讯云商务。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ContentAdaptStream")
    @Expose
    private Long ContentAdaptStream;

    /**
    * 分片平均时长，取值范围：（0-10]，单位：秒
默认值：10
注意：只在封装格式HLS时使用
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HlsTime")
    @Expose
    private Long HlsTime;

    /**
    * hls 分片类型，可选值：
<li>0：HLS+TS 切片</li>
<li>2：HLS+TS byte range</li>
<li>7：HLS+MP4 切片</li>
<li>5：HLS+MP4 byte range</li>
默认值：0
注意：该字段用于普通/极速高清转码设置，对自适应码流不生效，如需给自适应码流配置分片类型，可以使用外层字段
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SegmentType")
    @Expose
    private Long SegmentType;

    /**
    * 帧率分母部分
注意：值必须大于0
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FpsDenominator")
    @Expose
    private Long FpsDenominator;

    /**
    * 3D视频拼接方式，仅mv-hevc，3D视频生效，可选值：
<li>side_by_side：原视频内容左右排列布局</li>
<li>top_bottom：原视频内容上下排列布局</li>
计费将按照切分后的分辨率尺寸上报用量及计费；
默认值:side_by_side
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Stereo3dType")
    @Expose
    private String Stereo3dType;

    /**
    * Profile，适用于不同场景。 
baseline: 只支持I/P帧，并只支持无交错的场景，适用于视频通话、手机视频等场景。 
main: 主流Profile，提供I帧、P帧、B帧，并支持无交错模式和交错模式。主要用在主流的音视频消费产品如视频播放器、流媒体传输设备上。 
high: 最高编码等级，在Main Profile上添加了8X8的预测，并支持自定义量化。广泛应用在蓝光存储、高清电视等场景。
default：随原视频自动填充

仅编码标准选择h264时出现该配置，默认为：default
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VideoProfile")
    @Expose
    private String VideoProfile;

    /**
    * 编码器级别，默认为自动（""）
若编码标准选择H264: 支持以下选项：""，1 , 1.1 , 1.2 , 1.3 , 2 , 2.1 , 2.2 , 3 , 3.1 , 3.2 , 4 , 4.1 , 4.2 , 5 , 5.1 
若编码标准选择H265: 支持以下选项：""，1 , 2 , 2.1 , 3 , 3.1 , 4 , 4.1 , 5 , 5.1 , 5.2 , 6 , 6.1 , 6.2 , 8.5
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VideoLevel")
    @Expose
    private String VideoLevel;

    /**
    * 最大连续B帧数，默认选自动，支持 0 - 16和-1
注意：
-1表示修改为自动值	
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Bframes")
    @Expose
    private Long Bframes;

    /**
    * 码率控制模式：可选值： 
VBR（Variable Bit Rate）：动态比特率，根据视频画面的复杂度动态调整输出的码率，使得画面质量更高，适用于存储场景和对画面质量要求较高的应用。 
ABR（Average Bit Rate）：平均比特率，尽量保持输出视频的平均码率稳定，但允许短期内的码率波动，适用于需要在保持一定画质的情况下尽量减少整体码率的场景。 
CBR（Constant Bit Rate）：恒定比特率，指视频编码时输出的码率保持恒定不变，不考虑画面复杂度的变化，适用于对网络带宽要求较为严格的场景，如直播等。 
VCRF（Constant Rate Factor）：恒定质量因子，通过设定一个质量因子来控制视频质量，实现视频的恒定质量编码，码率会根据内容的复杂度自动调整，适用于希望保持一定画质的场景。 
默认选择 VBR
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * 显示高宽比，可选值：[1:1，2:1，default]
默认值：default
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Sar")
    @Expose
    private String Sar;

    /**
    * 自适应I帧决策，开启后，媒体处理将自动识别视频中不同场景之间的过渡点（通常是视觉上显著不同的帧，比如从一个镜头切换到另一个镜头），在这些点自适应插入关键帧（I帧），从而提高视频的随机访问性和编码效率。可选值： 
0：关闭自适应I帧决策 
1：使用自适应I帧决策 
默认值：0	
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NoScenecut")
    @Expose
    private Long NoScenecut;

    /**
    * 比特位：支持8/10，默认为8	
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BitDepth")
    @Expose
    private Long BitDepth;

    /**
    * 保持原始时间戳：可选值： 
0：表示关闭 
1：表示打开 
默认是关闭	
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RawPts")
    @Expose
    private Long RawPts;

    /**
    * 按比例压缩码率，开启后，将根据比例来调整输出视频的码率。填写压缩率后，系统会根据视频源码率自动计算目标输出码率。压缩率范围0-100，可选值：[0-100]和-1 
注意：-1表示修改为自动	
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Compress")
    @Expose
    private Long Compress;

    /**
    * 启动时分片时长
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SegmentSpecificInfo")
    @Expose
    private SegmentSpecificInfo SegmentSpecificInfo;

    /**
    * 模板是否开启场景化 
0：不开启 
1：开启 
默认值：0	
注意：只有此字段值为1时，SceneType和CompressType字段的值才会生效
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScenarioBased")
    @Expose
    private Long ScenarioBased;

    /**
    * 视频场景化，可选值： 
normal：通用转码场景：通用转码压缩场景 pgc：PGC高清影视：压缩时会注重影视剧的观看体验，根据影视剧特性进行ROI编码，同时保留高质量的视频内容和音频。 
materials_video：高清素材：素材资源类场景，对画质要求极高，较多透明画面内容，在压缩的同时接近视觉无损。 
ugc：UGC内容：适用于广泛的UGC/短视频场景，针对短视频的特性优化编码码率， 画质提升，提升业务QOS/QOE指标。 
e-commerce_video：秀场/电商类：压缩时会强调细节清晰度和ROI区域提升，尤其注重保持人脸区域的画质。 
educational_video：教育类：压缩时会强调文字和图像的清晰度和可读性，以便学生更好地理解内容，确保讲解内容清晰传达。
默认值：normal
注意：要使用此值ScenarioBased的值必须为1，否则此值不生效
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SceneType")
    @Expose
    private String SceneType;

    /**
    * 转码策略，可选值： 
ultra_compress：极致压缩：相比标准压缩，该策略能在保证一定画质的基础上最大限度压缩码率，极大节约带宽和存储成本。 
standard_compress：综合最优：平衡压缩率与画质，在保证主观画质没有明显降低的情况下尽可能压缩文件。该策略仅收取音视频极速高清转码费用。 
high_compress：码率优先：优先保证降低文件体积大小，可能有一定画质损失。该策略仅收取音视频极速高清转码费用。 
low_compress：画质优先：优先保证画质，压缩出来的文件体积可能相对较大。该策略仅收取音视频极速高清转码费用。 
默认值：standard_compress 
注：若需要在电视上观看视频，不建议使用ultra_compress策略。ultra_compress策略计费标准为极速高清转码 + 音视频增强-去毛刺。
注意：要使用此值ScenarioBased的值必须为1，否则此值不生效
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CompressType")
    @Expose
    private String CompressType;

    /**
     * Get 视频流的编码格式，可选值：
<li>h264：H.264 编码</li>
<li>h265：H.265 编码</li>
<li>h266：H.266 编码</li>
<li>av1：AOMedia Video 1 编码</li>
<li>vp8：VP8 编码</li>
<li>vp9：VP9 编码</li>
<li>mpeg2：MPEG2 编码</li>
<li>dnxhd：DNxHD 编码</li>
<li>mv-hevc：MV-HEVC 编码</li>

注意：av1 编码容器目前只支持 mp4 ，webm，mkv。
注意：H.266 编码容器目前只支持 mp4 ，hls，ts，mov。
注意：VP8、VP9编码容器目前只支持webm，mkv。
注意：MPEG2、dnxhd 编码容器目前只支持mxf。
注意：MV-HEVC编码容器目前只支持mp4，hls，mov。其中hls格式只支持mp4分片格式。且要求输入源为全景视频（带多视角）。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Codec 视频流的编码格式，可选值：
<li>h264：H.264 编码</li>
<li>h265：H.265 编码</li>
<li>h266：H.266 编码</li>
<li>av1：AOMedia Video 1 编码</li>
<li>vp8：VP8 编码</li>
<li>vp9：VP9 编码</li>
<li>mpeg2：MPEG2 编码</li>
<li>dnxhd：DNxHD 编码</li>
<li>mv-hevc：MV-HEVC 编码</li>

注意：av1 编码容器目前只支持 mp4 ，webm，mkv。
注意：H.266 编码容器目前只支持 mp4 ，hls，ts，mov。
注意：VP8、VP9编码容器目前只支持webm，mkv。
注意：MPEG2、dnxhd 编码容器目前只支持mxf。
注意：MV-HEVC编码容器目前只支持mp4，hls，mov。其中hls格式只支持mp4分片格式。且要求输入源为全景视频（带多视角）。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCodec() {
        return this.Codec;
    }

    /**
     * Set 视频流的编码格式，可选值：
<li>h264：H.264 编码</li>
<li>h265：H.265 编码</li>
<li>h266：H.266 编码</li>
<li>av1：AOMedia Video 1 编码</li>
<li>vp8：VP8 编码</li>
<li>vp9：VP9 编码</li>
<li>mpeg2：MPEG2 编码</li>
<li>dnxhd：DNxHD 编码</li>
<li>mv-hevc：MV-HEVC 编码</li>

注意：av1 编码容器目前只支持 mp4 ，webm，mkv。
注意：H.266 编码容器目前只支持 mp4 ，hls，ts，mov。
注意：VP8、VP9编码容器目前只支持webm，mkv。
注意：MPEG2、dnxhd 编码容器目前只支持mxf。
注意：MV-HEVC编码容器目前只支持mp4，hls，mov。其中hls格式只支持mp4分片格式。且要求输入源为全景视频（带多视角）。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Codec 视频流的编码格式，可选值：
<li>h264：H.264 编码</li>
<li>h265：H.265 编码</li>
<li>h266：H.266 编码</li>
<li>av1：AOMedia Video 1 编码</li>
<li>vp8：VP8 编码</li>
<li>vp9：VP9 编码</li>
<li>mpeg2：MPEG2 编码</li>
<li>dnxhd：DNxHD 编码</li>
<li>mv-hevc：MV-HEVC 编码</li>

注意：av1 编码容器目前只支持 mp4 ，webm，mkv。
注意：H.266 编码容器目前只支持 mp4 ，hls，ts，mov。
注意：VP8、VP9编码容器目前只支持webm，mkv。
注意：MPEG2、dnxhd 编码容器目前只支持mxf。
注意：MV-HEVC编码容器目前只支持mp4，hls，mov。其中hls格式只支持mp4分片格式。且要求输入源为全景视频（带多视角）。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCodec(String Codec) {
        this.Codec = Codec;
    }

    /**
     * Get 视频帧率，取值范围：
当FpsDenominator的值为空时，范围：[0, 120]，单位：Hz；
当FpsDenominator的值不为空时，Fps/FpsDenominator的范围：[0,120]
当取值为 0，表示帧率和原始视频保持一致。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Fps 视频帧率，取值范围：
当FpsDenominator的值为空时，范围：[0, 120]，单位：Hz；
当FpsDenominator的值不为空时，Fps/FpsDenominator的范围：[0,120]
当取值为 0，表示帧率和原始视频保持一致。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFps() {
        return this.Fps;
    }

    /**
     * Set 视频帧率，取值范围：
当FpsDenominator的值为空时，范围：[0, 120]，单位：Hz；
当FpsDenominator的值不为空时，Fps/FpsDenominator的范围：[0,120]
当取值为 0，表示帧率和原始视频保持一致。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Fps 视频帧率，取值范围：
当FpsDenominator的值为空时，范围：[0, 120]，单位：Hz；
当FpsDenominator的值不为空时，Fps/FpsDenominator的范围：[0,120]
当取值为 0，表示帧率和原始视频保持一致。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFps(Long Fps) {
        this.Fps = Fps;
    }

    /**
     * Get 视频流的码率，取值范围：0 和 [128, 100000]，单位：kbps。
当取值为 0，表示视频码率和原始视频保持一致。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Bitrate 视频流的码率，取值范围：0 和 [128, 100000]，单位：kbps。
当取值为 0，表示视频码率和原始视频保持一致。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getBitrate() {
        return this.Bitrate;
    }

    /**
     * Set 视频流的码率，取值范围：0 和 [128, 100000]，单位：kbps。
当取值为 0，表示视频码率和原始视频保持一致。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Bitrate 视频流的码率，取值范围：0 和 [128, 100000]，单位：kbps。
当取值为 0，表示视频码率和原始视频保持一致。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBitrate(Long Bitrate) {
        this.Bitrate = Bitrate;
    }

    /**
     * Get 分辨率自适应，可选值：
<li>open：开启，此时，Width 代表视频的长边，Height 表示视频的短边；</li>
<li>close：关闭，此时，Width 代表视频的宽度，Height 表示视频的高度。</li>
注意：自适应模式时，Width不能小于Height。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResolutionAdaptive 分辨率自适应，可选值：
<li>open：开启，此时，Width 代表视频的长边，Height 表示视频的短边；</li>
<li>close：关闭，此时，Width 代表视频的宽度，Height 表示视频的高度。</li>
注意：自适应模式时，Width不能小于Height。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResolutionAdaptive() {
        return this.ResolutionAdaptive;
    }

    /**
     * Set 分辨率自适应，可选值：
<li>open：开启，此时，Width 代表视频的长边，Height 表示视频的短边；</li>
<li>close：关闭，此时，Width 代表视频的宽度，Height 表示视频的高度。</li>
注意：自适应模式时，Width不能小于Height。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResolutionAdaptive 分辨率自适应，可选值：
<li>open：开启，此时，Width 代表视频的长边，Height 表示视频的短边；</li>
<li>close：关闭，此时，Width 代表视频的宽度，Height 表示视频的高度。</li>
注意：自适应模式时，Width不能小于Height。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResolutionAdaptive(String ResolutionAdaptive) {
        this.ResolutionAdaptive = ResolutionAdaptive;
    }

    /**
     * Get 视频流宽度（或长边）的最大值，取值范围：0 和 [128, 4096]，单位：px。
<li>当 Width、Height 均为 0，则分辨率同源；</li>
<li>当 Width 为 0，Height 非 0，则 Width 按比例缩放；</li>
<li>当 Width 非 0，Height 为 0，则 Height 按比例缩放；</li>
<li>当 Width、Height 均非 0，则分辨率按用户指定。</li>
注意：Codec为MV-HEVC时可以支持到7680
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Width 视频流宽度（或长边）的最大值，取值范围：0 和 [128, 4096]，单位：px。
<li>当 Width、Height 均为 0，则分辨率同源；</li>
<li>当 Width 为 0，Height 非 0，则 Width 按比例缩放；</li>
<li>当 Width 非 0，Height 为 0，则 Height 按比例缩放；</li>
<li>当 Width、Height 均非 0，则分辨率按用户指定。</li>
注意：Codec为MV-HEVC时可以支持到7680
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set 视频流宽度（或长边）的最大值，取值范围：0 和 [128, 4096]，单位：px。
<li>当 Width、Height 均为 0，则分辨率同源；</li>
<li>当 Width 为 0，Height 非 0，则 Width 按比例缩放；</li>
<li>当 Width 非 0，Height 为 0，则 Height 按比例缩放；</li>
<li>当 Width、Height 均非 0，则分辨率按用户指定。</li>
注意：Codec为MV-HEVC时可以支持到7680
注意：此字段可能返回 null，表示取不到有效值。
     * @param Width 视频流宽度（或长边）的最大值，取值范围：0 和 [128, 4096]，单位：px。
<li>当 Width、Height 均为 0，则分辨率同源；</li>
<li>当 Width 为 0，Height 非 0，则 Width 按比例缩放；</li>
<li>当 Width 非 0，Height 为 0，则 Height 按比例缩放；</li>
<li>当 Width、Height 均非 0，则分辨率按用户指定。</li>
注意：Codec为MV-HEVC时可以支持到7680
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get 视频流高度（或短边）的最大值，取值范围：0 和 [128, 4096]，单位：px。
注意：Codec为MV-HEVC时可以支持到7680
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Height 视频流高度（或短边）的最大值，取值范围：0 和 [128, 4096]，单位：px。
注意：Codec为MV-HEVC时可以支持到7680
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set 视频流高度（或短边）的最大值，取值范围：0 和 [128, 4096]，单位：px。
注意：Codec为MV-HEVC时可以支持到7680
注意：此字段可能返回 null，表示取不到有效值。
     * @param Height 视频流高度（或短边）的最大值，取值范围：0 和 [128, 4096]，单位：px。
注意：Codec为MV-HEVC时可以支持到7680
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get 关键帧 I 帧之间的间隔，允许按帧或秒自定义GOP长度，取值范围：0 和 [1, 100000]。
当填 0 时，系统将自动设置 gop 长度。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Gop 关键帧 I 帧之间的间隔，允许按帧或秒自定义GOP长度，取值范围：0 和 [1, 100000]。
当填 0 时，系统将自动设置 gop 长度。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getGop() {
        return this.Gop;
    }

    /**
     * Set 关键帧 I 帧之间的间隔，允许按帧或秒自定义GOP长度，取值范围：0 和 [1, 100000]。
当填 0 时，系统将自动设置 gop 长度。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Gop 关键帧 I 帧之间的间隔，允许按帧或秒自定义GOP长度，取值范围：0 和 [1, 100000]。
当填 0 时，系统将自动设置 gop 长度。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGop(Long Gop) {
        this.Gop = Gop;
    }

    /**
     * Get Gop数值单位，可选值： 
frame：表示帧 
second：表示秒
默认值：frame
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GopUnit Gop数值单位，可选值： 
frame：表示帧 
second：表示秒
默认值：frame
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGopUnit() {
        return this.GopUnit;
    }

    /**
     * Set Gop数值单位，可选值： 
frame：表示帧 
second：表示秒
默认值：frame
注意：此字段可能返回 null，表示取不到有效值。
     * @param GopUnit Gop数值单位，可选值： 
frame：表示帧 
second：表示秒
默认值：frame
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGopUnit(String GopUnit) {
        this.GopUnit = GopUnit;
    }

    /**
     * Get 填充方式，当视频流配置宽高参数与原始视频的宽高比不一致时，对转码的处理方式，即为“填充”。可选填充方式：
 <li> stretch：拉伸，对每一帧进行拉伸，填满整个画面，可能导致转码后的视频被“压扁“或者“拉长“；</li>
<li>black：留黑，保持视频宽高比不变，边缘剩余部分使用黑色填充。</li>
<li>white：留白，保持视频宽高比不变，边缘剩余部分使用白色填充。</li>
<li>gauss：高斯模糊，保持视频宽高比不变，边缘剩余部分使用高斯模糊填充。</li>
<li>smarttailor：智能剪裁：智能选取视频画面，来保证画面比例裁剪。</li>
默认值：black 。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FillType 填充方式，当视频流配置宽高参数与原始视频的宽高比不一致时，对转码的处理方式，即为“填充”。可选填充方式：
 <li> stretch：拉伸，对每一帧进行拉伸，填满整个画面，可能导致转码后的视频被“压扁“或者“拉长“；</li>
<li>black：留黑，保持视频宽高比不变，边缘剩余部分使用黑色填充。</li>
<li>white：留白，保持视频宽高比不变，边缘剩余部分使用白色填充。</li>
<li>gauss：高斯模糊，保持视频宽高比不变，边缘剩余部分使用高斯模糊填充。</li>
<li>smarttailor：智能剪裁：智能选取视频画面，来保证画面比例裁剪。</li>
默认值：black 。
注意：此字段可能返回 null，表示取不到有效值。
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
<li>smarttailor：智能剪裁：智能选取视频画面，来保证画面比例裁剪。</li>
默认值：black 。
注意：此字段可能返回 null，表示取不到有效值。
     * @param FillType 填充方式，当视频流配置宽高参数与原始视频的宽高比不一致时，对转码的处理方式，即为“填充”。可选填充方式：
 <li> stretch：拉伸，对每一帧进行拉伸，填满整个画面，可能导致转码后的视频被“压扁“或者“拉长“；</li>
<li>black：留黑，保持视频宽高比不变，边缘剩余部分使用黑色填充。</li>
<li>white：留白，保持视频宽高比不变，边缘剩余部分使用白色填充。</li>
<li>gauss：高斯模糊，保持视频宽高比不变，边缘剩余部分使用高斯模糊填充。</li>
<li>smarttailor：智能剪裁：智能选取视频画面，来保证画面比例裁剪。</li>
默认值：black 。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFillType(String FillType) {
        this.FillType = FillType;
    }

    /**
     * Get 视频的恒定码率控制因子，取值范围为[0, 51]，不填表示“自动”。如果没有特殊需求，建议不指定该参数。
当Mode参数设置为VBR时，如果同时配置了Vcrf值，MPS将在VBR模式下处理视频，同时考虑Vcrf和Bitrate参数的设置，以平衡视频质量、码率、转码效率和文件大小。
当Mode参数设置为CRF，Bitrate设置将失效，编码将根据Vcrf值进行。
当Mode参数选择ABR或CBR时，无需配置Vcrf值。
注意：需要修改为自动时，填100

注意：此字段可能返回 null，表示取不到有效值。 
     * @return Vcrf 视频的恒定码率控制因子，取值范围为[0, 51]，不填表示“自动”。如果没有特殊需求，建议不指定该参数。
当Mode参数设置为VBR时，如果同时配置了Vcrf值，MPS将在VBR模式下处理视频，同时考虑Vcrf和Bitrate参数的设置，以平衡视频质量、码率、转码效率和文件大小。
当Mode参数设置为CRF，Bitrate设置将失效，编码将根据Vcrf值进行。
当Mode参数选择ABR或CBR时，无需配置Vcrf值。
注意：需要修改为自动时，填100

注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getVcrf() {
        return this.Vcrf;
    }

    /**
     * Set 视频的恒定码率控制因子，取值范围为[0, 51]，不填表示“自动”。如果没有特殊需求，建议不指定该参数。
当Mode参数设置为VBR时，如果同时配置了Vcrf值，MPS将在VBR模式下处理视频，同时考虑Vcrf和Bitrate参数的设置，以平衡视频质量、码率、转码效率和文件大小。
当Mode参数设置为CRF，Bitrate设置将失效，编码将根据Vcrf值进行。
当Mode参数选择ABR或CBR时，无需配置Vcrf值。
注意：需要修改为自动时，填100

注意：此字段可能返回 null，表示取不到有效值。
     * @param Vcrf 视频的恒定码率控制因子，取值范围为[0, 51]，不填表示“自动”。如果没有特殊需求，建议不指定该参数。
当Mode参数设置为VBR时，如果同时配置了Vcrf值，MPS将在VBR模式下处理视频，同时考虑Vcrf和Bitrate参数的设置，以平衡视频质量、码率、转码效率和文件大小。
当Mode参数设置为CRF，Bitrate设置将失效，编码将根据Vcrf值进行。
当Mode参数选择ABR或CBR时，无需配置Vcrf值。
注意：需要修改为自动时，填100

注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVcrf(Long Vcrf) {
        this.Vcrf = Vcrf;
    }

    /**
     * Get 内容自适应编码。可选值：
<li>0：不开启</li>
<li>1：开启</li>
默认值: 0.   当开启该参数时，将会自适应生成多个不同分辨率，不同码率的码流， 其中VideoTemplate的宽和高为多个码流中的最大分辨率，VideoTemplate中的码率为多个码流中的最高码率， VideoTemplate中的vcrf为多个码流中的最高质量。 当不设置分辨率、码率和vcrf时， ContentAdaptStream 参数生成的最高分辨率为视频源的分辨率，视频质量为接近vmaf95分。 若要开启该参数或了解计费细节, 请联系您的腾讯云商务。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ContentAdaptStream 内容自适应编码。可选值：
<li>0：不开启</li>
<li>1：开启</li>
默认值: 0.   当开启该参数时，将会自适应生成多个不同分辨率，不同码率的码流， 其中VideoTemplate的宽和高为多个码流中的最大分辨率，VideoTemplate中的码率为多个码流中的最高码率， VideoTemplate中的vcrf为多个码流中的最高质量。 当不设置分辨率、码率和vcrf时， ContentAdaptStream 参数生成的最高分辨率为视频源的分辨率，视频质量为接近vmaf95分。 若要开启该参数或了解计费细节, 请联系您的腾讯云商务。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getContentAdaptStream() {
        return this.ContentAdaptStream;
    }

    /**
     * Set 内容自适应编码。可选值：
<li>0：不开启</li>
<li>1：开启</li>
默认值: 0.   当开启该参数时，将会自适应生成多个不同分辨率，不同码率的码流， 其中VideoTemplate的宽和高为多个码流中的最大分辨率，VideoTemplate中的码率为多个码流中的最高码率， VideoTemplate中的vcrf为多个码流中的最高质量。 当不设置分辨率、码率和vcrf时， ContentAdaptStream 参数生成的最高分辨率为视频源的分辨率，视频质量为接近vmaf95分。 若要开启该参数或了解计费细节, 请联系您的腾讯云商务。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ContentAdaptStream 内容自适应编码。可选值：
<li>0：不开启</li>
<li>1：开启</li>
默认值: 0.   当开启该参数时，将会自适应生成多个不同分辨率，不同码率的码流， 其中VideoTemplate的宽和高为多个码流中的最大分辨率，VideoTemplate中的码率为多个码流中的最高码率， VideoTemplate中的vcrf为多个码流中的最高质量。 当不设置分辨率、码率和vcrf时， ContentAdaptStream 参数生成的最高分辨率为视频源的分辨率，视频质量为接近vmaf95分。 若要开启该参数或了解计费细节, 请联系您的腾讯云商务。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContentAdaptStream(Long ContentAdaptStream) {
        this.ContentAdaptStream = ContentAdaptStream;
    }

    /**
     * Get 分片平均时长，取值范围：（0-10]，单位：秒
默认值：10
注意：只在封装格式HLS时使用
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HlsTime 分片平均时长，取值范围：（0-10]，单位：秒
默认值：10
注意：只在封装格式HLS时使用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getHlsTime() {
        return this.HlsTime;
    }

    /**
     * Set 分片平均时长，取值范围：（0-10]，单位：秒
默认值：10
注意：只在封装格式HLS时使用
注意：此字段可能返回 null，表示取不到有效值。
     * @param HlsTime 分片平均时长，取值范围：（0-10]，单位：秒
默认值：10
注意：只在封装格式HLS时使用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHlsTime(Long HlsTime) {
        this.HlsTime = HlsTime;
    }

    /**
     * Get hls 分片类型，可选值：
<li>0：HLS+TS 切片</li>
<li>2：HLS+TS byte range</li>
<li>7：HLS+MP4 切片</li>
<li>5：HLS+MP4 byte range</li>
默认值：0
注意：该字段用于普通/极速高清转码设置，对自适应码流不生效，如需给自适应码流配置分片类型，可以使用外层字段
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SegmentType hls 分片类型，可选值：
<li>0：HLS+TS 切片</li>
<li>2：HLS+TS byte range</li>
<li>7：HLS+MP4 切片</li>
<li>5：HLS+MP4 byte range</li>
默认值：0
注意：该字段用于普通/极速高清转码设置，对自适应码流不生效，如需给自适应码流配置分片类型，可以使用外层字段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSegmentType() {
        return this.SegmentType;
    }

    /**
     * Set hls 分片类型，可选值：
<li>0：HLS+TS 切片</li>
<li>2：HLS+TS byte range</li>
<li>7：HLS+MP4 切片</li>
<li>5：HLS+MP4 byte range</li>
默认值：0
注意：该字段用于普通/极速高清转码设置，对自适应码流不生效，如需给自适应码流配置分片类型，可以使用外层字段
注意：此字段可能返回 null，表示取不到有效值。
     * @param SegmentType hls 分片类型，可选值：
<li>0：HLS+TS 切片</li>
<li>2：HLS+TS byte range</li>
<li>7：HLS+MP4 切片</li>
<li>5：HLS+MP4 byte range</li>
默认值：0
注意：该字段用于普通/极速高清转码设置，对自适应码流不生效，如需给自适应码流配置分片类型，可以使用外层字段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSegmentType(Long SegmentType) {
        this.SegmentType = SegmentType;
    }

    /**
     * Get 帧率分母部分
注意：值必须大于0
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FpsDenominator 帧率分母部分
注意：值必须大于0
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFpsDenominator() {
        return this.FpsDenominator;
    }

    /**
     * Set 帧率分母部分
注意：值必须大于0
注意：此字段可能返回 null，表示取不到有效值。
     * @param FpsDenominator 帧率分母部分
注意：值必须大于0
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFpsDenominator(Long FpsDenominator) {
        this.FpsDenominator = FpsDenominator;
    }

    /**
     * Get 3D视频拼接方式，仅mv-hevc，3D视频生效，可选值：
<li>side_by_side：原视频内容左右排列布局</li>
<li>top_bottom：原视频内容上下排列布局</li>
计费将按照切分后的分辨率尺寸上报用量及计费；
默认值:side_by_side
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Stereo3dType 3D视频拼接方式，仅mv-hevc，3D视频生效，可选值：
<li>side_by_side：原视频内容左右排列布局</li>
<li>top_bottom：原视频内容上下排列布局</li>
计费将按照切分后的分辨率尺寸上报用量及计费；
默认值:side_by_side
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStereo3dType() {
        return this.Stereo3dType;
    }

    /**
     * Set 3D视频拼接方式，仅mv-hevc，3D视频生效，可选值：
<li>side_by_side：原视频内容左右排列布局</li>
<li>top_bottom：原视频内容上下排列布局</li>
计费将按照切分后的分辨率尺寸上报用量及计费；
默认值:side_by_side
注意：此字段可能返回 null，表示取不到有效值。
     * @param Stereo3dType 3D视频拼接方式，仅mv-hevc，3D视频生效，可选值：
<li>side_by_side：原视频内容左右排列布局</li>
<li>top_bottom：原视频内容上下排列布局</li>
计费将按照切分后的分辨率尺寸上报用量及计费；
默认值:side_by_side
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStereo3dType(String Stereo3dType) {
        this.Stereo3dType = Stereo3dType;
    }

    /**
     * Get Profile，适用于不同场景。 
baseline: 只支持I/P帧，并只支持无交错的场景，适用于视频通话、手机视频等场景。 
main: 主流Profile，提供I帧、P帧、B帧，并支持无交错模式和交错模式。主要用在主流的音视频消费产品如视频播放器、流媒体传输设备上。 
high: 最高编码等级，在Main Profile上添加了8X8的预测，并支持自定义量化。广泛应用在蓝光存储、高清电视等场景。
default：随原视频自动填充

仅编码标准选择h264时出现该配置，默认为：default
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VideoProfile Profile，适用于不同场景。 
baseline: 只支持I/P帧，并只支持无交错的场景，适用于视频通话、手机视频等场景。 
main: 主流Profile，提供I帧、P帧、B帧，并支持无交错模式和交错模式。主要用在主流的音视频消费产品如视频播放器、流媒体传输设备上。 
high: 最高编码等级，在Main Profile上添加了8X8的预测，并支持自定义量化。广泛应用在蓝光存储、高清电视等场景。
default：随原视频自动填充

仅编码标准选择h264时出现该配置，默认为：default
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVideoProfile() {
        return this.VideoProfile;
    }

    /**
     * Set Profile，适用于不同场景。 
baseline: 只支持I/P帧，并只支持无交错的场景，适用于视频通话、手机视频等场景。 
main: 主流Profile，提供I帧、P帧、B帧，并支持无交错模式和交错模式。主要用在主流的音视频消费产品如视频播放器、流媒体传输设备上。 
high: 最高编码等级，在Main Profile上添加了8X8的预测，并支持自定义量化。广泛应用在蓝光存储、高清电视等场景。
default：随原视频自动填充

仅编码标准选择h264时出现该配置，默认为：default
注意：此字段可能返回 null，表示取不到有效值。
     * @param VideoProfile Profile，适用于不同场景。 
baseline: 只支持I/P帧，并只支持无交错的场景，适用于视频通话、手机视频等场景。 
main: 主流Profile，提供I帧、P帧、B帧，并支持无交错模式和交错模式。主要用在主流的音视频消费产品如视频播放器、流媒体传输设备上。 
high: 最高编码等级，在Main Profile上添加了8X8的预测，并支持自定义量化。广泛应用在蓝光存储、高清电视等场景。
default：随原视频自动填充

仅编码标准选择h264时出现该配置，默认为：default
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVideoProfile(String VideoProfile) {
        this.VideoProfile = VideoProfile;
    }

    /**
     * Get 编码器级别，默认为自动（""）
若编码标准选择H264: 支持以下选项：""，1 , 1.1 , 1.2 , 1.3 , 2 , 2.1 , 2.2 , 3 , 3.1 , 3.2 , 4 , 4.1 , 4.2 , 5 , 5.1 
若编码标准选择H265: 支持以下选项：""，1 , 2 , 2.1 , 3 , 3.1 , 4 , 4.1 , 5 , 5.1 , 5.2 , 6 , 6.1 , 6.2 , 8.5
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VideoLevel 编码器级别，默认为自动（""）
若编码标准选择H264: 支持以下选项：""，1 , 1.1 , 1.2 , 1.3 , 2 , 2.1 , 2.2 , 3 , 3.1 , 3.2 , 4 , 4.1 , 4.2 , 5 , 5.1 
若编码标准选择H265: 支持以下选项：""，1 , 2 , 2.1 , 3 , 3.1 , 4 , 4.1 , 5 , 5.1 , 5.2 , 6 , 6.1 , 6.2 , 8.5
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVideoLevel() {
        return this.VideoLevel;
    }

    /**
     * Set 编码器级别，默认为自动（""）
若编码标准选择H264: 支持以下选项：""，1 , 1.1 , 1.2 , 1.3 , 2 , 2.1 , 2.2 , 3 , 3.1 , 3.2 , 4 , 4.1 , 4.2 , 5 , 5.1 
若编码标准选择H265: 支持以下选项：""，1 , 2 , 2.1 , 3 , 3.1 , 4 , 4.1 , 5 , 5.1 , 5.2 , 6 , 6.1 , 6.2 , 8.5
注意：此字段可能返回 null，表示取不到有效值。
     * @param VideoLevel 编码器级别，默认为自动（""）
若编码标准选择H264: 支持以下选项：""，1 , 1.1 , 1.2 , 1.3 , 2 , 2.1 , 2.2 , 3 , 3.1 , 3.2 , 4 , 4.1 , 4.2 , 5 , 5.1 
若编码标准选择H265: 支持以下选项：""，1 , 2 , 2.1 , 3 , 3.1 , 4 , 4.1 , 5 , 5.1 , 5.2 , 6 , 6.1 , 6.2 , 8.5
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVideoLevel(String VideoLevel) {
        this.VideoLevel = VideoLevel;
    }

    /**
     * Get 最大连续B帧数，默认选自动，支持 0 - 16和-1
注意：
-1表示修改为自动值	
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Bframes 最大连续B帧数，默认选自动，支持 0 - 16和-1
注意：
-1表示修改为自动值	
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getBframes() {
        return this.Bframes;
    }

    /**
     * Set 最大连续B帧数，默认选自动，支持 0 - 16和-1
注意：
-1表示修改为自动值	
注意：此字段可能返回 null，表示取不到有效值。
     * @param Bframes 最大连续B帧数，默认选自动，支持 0 - 16和-1
注意：
-1表示修改为自动值	
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBframes(Long Bframes) {
        this.Bframes = Bframes;
    }

    /**
     * Get 码率控制模式：可选值： 
VBR（Variable Bit Rate）：动态比特率，根据视频画面的复杂度动态调整输出的码率，使得画面质量更高，适用于存储场景和对画面质量要求较高的应用。 
ABR（Average Bit Rate）：平均比特率，尽量保持输出视频的平均码率稳定，但允许短期内的码率波动，适用于需要在保持一定画质的情况下尽量减少整体码率的场景。 
CBR（Constant Bit Rate）：恒定比特率，指视频编码时输出的码率保持恒定不变，不考虑画面复杂度的变化，适用于对网络带宽要求较为严格的场景，如直播等。 
VCRF（Constant Rate Factor）：恒定质量因子，通过设定一个质量因子来控制视频质量，实现视频的恒定质量编码，码率会根据内容的复杂度自动调整，适用于希望保持一定画质的场景。 
默认选择 VBR
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Mode 码率控制模式：可选值： 
VBR（Variable Bit Rate）：动态比特率，根据视频画面的复杂度动态调整输出的码率，使得画面质量更高，适用于存储场景和对画面质量要求较高的应用。 
ABR（Average Bit Rate）：平均比特率，尽量保持输出视频的平均码率稳定，但允许短期内的码率波动，适用于需要在保持一定画质的情况下尽量减少整体码率的场景。 
CBR（Constant Bit Rate）：恒定比特率，指视频编码时输出的码率保持恒定不变，不考虑画面复杂度的变化，适用于对网络带宽要求较为严格的场景，如直播等。 
VCRF（Constant Rate Factor）：恒定质量因子，通过设定一个质量因子来控制视频质量，实现视频的恒定质量编码，码率会根据内容的复杂度自动调整，适用于希望保持一定画质的场景。 
默认选择 VBR
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set 码率控制模式：可选值： 
VBR（Variable Bit Rate）：动态比特率，根据视频画面的复杂度动态调整输出的码率，使得画面质量更高，适用于存储场景和对画面质量要求较高的应用。 
ABR（Average Bit Rate）：平均比特率，尽量保持输出视频的平均码率稳定，但允许短期内的码率波动，适用于需要在保持一定画质的情况下尽量减少整体码率的场景。 
CBR（Constant Bit Rate）：恒定比特率，指视频编码时输出的码率保持恒定不变，不考虑画面复杂度的变化，适用于对网络带宽要求较为严格的场景，如直播等。 
VCRF（Constant Rate Factor）：恒定质量因子，通过设定一个质量因子来控制视频质量，实现视频的恒定质量编码，码率会根据内容的复杂度自动调整，适用于希望保持一定画质的场景。 
默认选择 VBR
注意：此字段可能返回 null，表示取不到有效值。
     * @param Mode 码率控制模式：可选值： 
VBR（Variable Bit Rate）：动态比特率，根据视频画面的复杂度动态调整输出的码率，使得画面质量更高，适用于存储场景和对画面质量要求较高的应用。 
ABR（Average Bit Rate）：平均比特率，尽量保持输出视频的平均码率稳定，但允许短期内的码率波动，适用于需要在保持一定画质的情况下尽量减少整体码率的场景。 
CBR（Constant Bit Rate）：恒定比特率，指视频编码时输出的码率保持恒定不变，不考虑画面复杂度的变化，适用于对网络带宽要求较为严格的场景，如直播等。 
VCRF（Constant Rate Factor）：恒定质量因子，通过设定一个质量因子来控制视频质量，实现视频的恒定质量编码，码率会根据内容的复杂度自动调整，适用于希望保持一定画质的场景。 
默认选择 VBR
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get 显示高宽比，可选值：[1:1，2:1，default]
默认值：default
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Sar 显示高宽比，可选值：[1:1，2:1，default]
默认值：default
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSar() {
        return this.Sar;
    }

    /**
     * Set 显示高宽比，可选值：[1:1，2:1，default]
默认值：default
注意：此字段可能返回 null，表示取不到有效值。
     * @param Sar 显示高宽比，可选值：[1:1，2:1，default]
默认值：default
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSar(String Sar) {
        this.Sar = Sar;
    }

    /**
     * Get 自适应I帧决策，开启后，媒体处理将自动识别视频中不同场景之间的过渡点（通常是视觉上显著不同的帧，比如从一个镜头切换到另一个镜头），在这些点自适应插入关键帧（I帧），从而提高视频的随机访问性和编码效率。可选值： 
0：关闭自适应I帧决策 
1：使用自适应I帧决策 
默认值：0	
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NoScenecut 自适应I帧决策，开启后，媒体处理将自动识别视频中不同场景之间的过渡点（通常是视觉上显著不同的帧，比如从一个镜头切换到另一个镜头），在这些点自适应插入关键帧（I帧），从而提高视频的随机访问性和编码效率。可选值： 
0：关闭自适应I帧决策 
1：使用自适应I帧决策 
默认值：0	
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getNoScenecut() {
        return this.NoScenecut;
    }

    /**
     * Set 自适应I帧决策，开启后，媒体处理将自动识别视频中不同场景之间的过渡点（通常是视觉上显著不同的帧，比如从一个镜头切换到另一个镜头），在这些点自适应插入关键帧（I帧），从而提高视频的随机访问性和编码效率。可选值： 
0：关闭自适应I帧决策 
1：使用自适应I帧决策 
默认值：0	
注意：此字段可能返回 null，表示取不到有效值。
     * @param NoScenecut 自适应I帧决策，开启后，媒体处理将自动识别视频中不同场景之间的过渡点（通常是视觉上显著不同的帧，比如从一个镜头切换到另一个镜头），在这些点自适应插入关键帧（I帧），从而提高视频的随机访问性和编码效率。可选值： 
0：关闭自适应I帧决策 
1：使用自适应I帧决策 
默认值：0	
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNoScenecut(Long NoScenecut) {
        this.NoScenecut = NoScenecut;
    }

    /**
     * Get 比特位：支持8/10，默认为8	
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BitDepth 比特位：支持8/10，默认为8	
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getBitDepth() {
        return this.BitDepth;
    }

    /**
     * Set 比特位：支持8/10，默认为8	
注意：此字段可能返回 null，表示取不到有效值。
     * @param BitDepth 比特位：支持8/10，默认为8	
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBitDepth(Long BitDepth) {
        this.BitDepth = BitDepth;
    }

    /**
     * Get 保持原始时间戳：可选值： 
0：表示关闭 
1：表示打开 
默认是关闭	
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RawPts 保持原始时间戳：可选值： 
0：表示关闭 
1：表示打开 
默认是关闭	
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRawPts() {
        return this.RawPts;
    }

    /**
     * Set 保持原始时间戳：可选值： 
0：表示关闭 
1：表示打开 
默认是关闭	
注意：此字段可能返回 null，表示取不到有效值。
     * @param RawPts 保持原始时间戳：可选值： 
0：表示关闭 
1：表示打开 
默认是关闭	
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRawPts(Long RawPts) {
        this.RawPts = RawPts;
    }

    /**
     * Get 按比例压缩码率，开启后，将根据比例来调整输出视频的码率。填写压缩率后，系统会根据视频源码率自动计算目标输出码率。压缩率范围0-100，可选值：[0-100]和-1 
注意：-1表示修改为自动	
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Compress 按比例压缩码率，开启后，将根据比例来调整输出视频的码率。填写压缩率后，系统会根据视频源码率自动计算目标输出码率。压缩率范围0-100，可选值：[0-100]和-1 
注意：-1表示修改为自动	
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCompress() {
        return this.Compress;
    }

    /**
     * Set 按比例压缩码率，开启后，将根据比例来调整输出视频的码率。填写压缩率后，系统会根据视频源码率自动计算目标输出码率。压缩率范围0-100，可选值：[0-100]和-1 
注意：-1表示修改为自动	
注意：此字段可能返回 null，表示取不到有效值。
     * @param Compress 按比例压缩码率，开启后，将根据比例来调整输出视频的码率。填写压缩率后，系统会根据视频源码率自动计算目标输出码率。压缩率范围0-100，可选值：[0-100]和-1 
注意：-1表示修改为自动	
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCompress(Long Compress) {
        this.Compress = Compress;
    }

    /**
     * Get 启动时分片时长
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SegmentSpecificInfo 启动时分片时长
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SegmentSpecificInfo getSegmentSpecificInfo() {
        return this.SegmentSpecificInfo;
    }

    /**
     * Set 启动时分片时长
注意：此字段可能返回 null，表示取不到有效值。
     * @param SegmentSpecificInfo 启动时分片时长
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSegmentSpecificInfo(SegmentSpecificInfo SegmentSpecificInfo) {
        this.SegmentSpecificInfo = SegmentSpecificInfo;
    }

    /**
     * Get 模板是否开启场景化 
0：不开启 
1：开启 
默认值：0	
注意：只有此字段值为1时，SceneType和CompressType字段的值才会生效
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScenarioBased 模板是否开启场景化 
0：不开启 
1：开启 
默认值：0	
注意：只有此字段值为1时，SceneType和CompressType字段的值才会生效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getScenarioBased() {
        return this.ScenarioBased;
    }

    /**
     * Set 模板是否开启场景化 
0：不开启 
1：开启 
默认值：0	
注意：只有此字段值为1时，SceneType和CompressType字段的值才会生效
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScenarioBased 模板是否开启场景化 
0：不开启 
1：开启 
默认值：0	
注意：只有此字段值为1时，SceneType和CompressType字段的值才会生效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScenarioBased(Long ScenarioBased) {
        this.ScenarioBased = ScenarioBased;
    }

    /**
     * Get 视频场景化，可选值： 
normal：通用转码场景：通用转码压缩场景 pgc：PGC高清影视：压缩时会注重影视剧的观看体验，根据影视剧特性进行ROI编码，同时保留高质量的视频内容和音频。 
materials_video：高清素材：素材资源类场景，对画质要求极高，较多透明画面内容，在压缩的同时接近视觉无损。 
ugc：UGC内容：适用于广泛的UGC/短视频场景，针对短视频的特性优化编码码率， 画质提升，提升业务QOS/QOE指标。 
e-commerce_video：秀场/电商类：压缩时会强调细节清晰度和ROI区域提升，尤其注重保持人脸区域的画质。 
educational_video：教育类：压缩时会强调文字和图像的清晰度和可读性，以便学生更好地理解内容，确保讲解内容清晰传达。
默认值：normal
注意：要使用此值ScenarioBased的值必须为1，否则此值不生效
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SceneType 视频场景化，可选值： 
normal：通用转码场景：通用转码压缩场景 pgc：PGC高清影视：压缩时会注重影视剧的观看体验，根据影视剧特性进行ROI编码，同时保留高质量的视频内容和音频。 
materials_video：高清素材：素材资源类场景，对画质要求极高，较多透明画面内容，在压缩的同时接近视觉无损。 
ugc：UGC内容：适用于广泛的UGC/短视频场景，针对短视频的特性优化编码码率， 画质提升，提升业务QOS/QOE指标。 
e-commerce_video：秀场/电商类：压缩时会强调细节清晰度和ROI区域提升，尤其注重保持人脸区域的画质。 
educational_video：教育类：压缩时会强调文字和图像的清晰度和可读性，以便学生更好地理解内容，确保讲解内容清晰传达。
默认值：normal
注意：要使用此值ScenarioBased的值必须为1，否则此值不生效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSceneType() {
        return this.SceneType;
    }

    /**
     * Set 视频场景化，可选值： 
normal：通用转码场景：通用转码压缩场景 pgc：PGC高清影视：压缩时会注重影视剧的观看体验，根据影视剧特性进行ROI编码，同时保留高质量的视频内容和音频。 
materials_video：高清素材：素材资源类场景，对画质要求极高，较多透明画面内容，在压缩的同时接近视觉无损。 
ugc：UGC内容：适用于广泛的UGC/短视频场景，针对短视频的特性优化编码码率， 画质提升，提升业务QOS/QOE指标。 
e-commerce_video：秀场/电商类：压缩时会强调细节清晰度和ROI区域提升，尤其注重保持人脸区域的画质。 
educational_video：教育类：压缩时会强调文字和图像的清晰度和可读性，以便学生更好地理解内容，确保讲解内容清晰传达。
默认值：normal
注意：要使用此值ScenarioBased的值必须为1，否则此值不生效
注意：此字段可能返回 null，表示取不到有效值。
     * @param SceneType 视频场景化，可选值： 
normal：通用转码场景：通用转码压缩场景 pgc：PGC高清影视：压缩时会注重影视剧的观看体验，根据影视剧特性进行ROI编码，同时保留高质量的视频内容和音频。 
materials_video：高清素材：素材资源类场景，对画质要求极高，较多透明画面内容，在压缩的同时接近视觉无损。 
ugc：UGC内容：适用于广泛的UGC/短视频场景，针对短视频的特性优化编码码率， 画质提升，提升业务QOS/QOE指标。 
e-commerce_video：秀场/电商类：压缩时会强调细节清晰度和ROI区域提升，尤其注重保持人脸区域的画质。 
educational_video：教育类：压缩时会强调文字和图像的清晰度和可读性，以便学生更好地理解内容，确保讲解内容清晰传达。
默认值：normal
注意：要使用此值ScenarioBased的值必须为1，否则此值不生效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSceneType(String SceneType) {
        this.SceneType = SceneType;
    }

    /**
     * Get 转码策略，可选值： 
ultra_compress：极致压缩：相比标准压缩，该策略能在保证一定画质的基础上最大限度压缩码率，极大节约带宽和存储成本。 
standard_compress：综合最优：平衡压缩率与画质，在保证主观画质没有明显降低的情况下尽可能压缩文件。该策略仅收取音视频极速高清转码费用。 
high_compress：码率优先：优先保证降低文件体积大小，可能有一定画质损失。该策略仅收取音视频极速高清转码费用。 
low_compress：画质优先：优先保证画质，压缩出来的文件体积可能相对较大。该策略仅收取音视频极速高清转码费用。 
默认值：standard_compress 
注：若需要在电视上观看视频，不建议使用ultra_compress策略。ultra_compress策略计费标准为极速高清转码 + 音视频增强-去毛刺。
注意：要使用此值ScenarioBased的值必须为1，否则此值不生效
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CompressType 转码策略，可选值： 
ultra_compress：极致压缩：相比标准压缩，该策略能在保证一定画质的基础上最大限度压缩码率，极大节约带宽和存储成本。 
standard_compress：综合最优：平衡压缩率与画质，在保证主观画质没有明显降低的情况下尽可能压缩文件。该策略仅收取音视频极速高清转码费用。 
high_compress：码率优先：优先保证降低文件体积大小，可能有一定画质损失。该策略仅收取音视频极速高清转码费用。 
low_compress：画质优先：优先保证画质，压缩出来的文件体积可能相对较大。该策略仅收取音视频极速高清转码费用。 
默认值：standard_compress 
注：若需要在电视上观看视频，不建议使用ultra_compress策略。ultra_compress策略计费标准为极速高清转码 + 音视频增强-去毛刺。
注意：要使用此值ScenarioBased的值必须为1，否则此值不生效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCompressType() {
        return this.CompressType;
    }

    /**
     * Set 转码策略，可选值： 
ultra_compress：极致压缩：相比标准压缩，该策略能在保证一定画质的基础上最大限度压缩码率，极大节约带宽和存储成本。 
standard_compress：综合最优：平衡压缩率与画质，在保证主观画质没有明显降低的情况下尽可能压缩文件。该策略仅收取音视频极速高清转码费用。 
high_compress：码率优先：优先保证降低文件体积大小，可能有一定画质损失。该策略仅收取音视频极速高清转码费用。 
low_compress：画质优先：优先保证画质，压缩出来的文件体积可能相对较大。该策略仅收取音视频极速高清转码费用。 
默认值：standard_compress 
注：若需要在电视上观看视频，不建议使用ultra_compress策略。ultra_compress策略计费标准为极速高清转码 + 音视频增强-去毛刺。
注意：要使用此值ScenarioBased的值必须为1，否则此值不生效
注意：此字段可能返回 null，表示取不到有效值。
     * @param CompressType 转码策略，可选值： 
ultra_compress：极致压缩：相比标准压缩，该策略能在保证一定画质的基础上最大限度压缩码率，极大节约带宽和存储成本。 
standard_compress：综合最优：平衡压缩率与画质，在保证主观画质没有明显降低的情况下尽可能压缩文件。该策略仅收取音视频极速高清转码费用。 
high_compress：码率优先：优先保证降低文件体积大小，可能有一定画质损失。该策略仅收取音视频极速高清转码费用。 
low_compress：画质优先：优先保证画质，压缩出来的文件体积可能相对较大。该策略仅收取音视频极速高清转码费用。 
默认值：standard_compress 
注：若需要在电视上观看视频，不建议使用ultra_compress策略。ultra_compress策略计费标准为极速高清转码 + 音视频增强-去毛刺。
注意：要使用此值ScenarioBased的值必须为1，否则此值不生效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCompressType(String CompressType) {
        this.CompressType = CompressType;
    }

    public VideoTemplateInfoForUpdate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VideoTemplateInfoForUpdate(VideoTemplateInfoForUpdate source) {
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
        if (source.Gop != null) {
            this.Gop = new Long(source.Gop);
        }
        if (source.GopUnit != null) {
            this.GopUnit = new String(source.GopUnit);
        }
        if (source.FillType != null) {
            this.FillType = new String(source.FillType);
        }
        if (source.Vcrf != null) {
            this.Vcrf = new Long(source.Vcrf);
        }
        if (source.ContentAdaptStream != null) {
            this.ContentAdaptStream = new Long(source.ContentAdaptStream);
        }
        if (source.HlsTime != null) {
            this.HlsTime = new Long(source.HlsTime);
        }
        if (source.SegmentType != null) {
            this.SegmentType = new Long(source.SegmentType);
        }
        if (source.FpsDenominator != null) {
            this.FpsDenominator = new Long(source.FpsDenominator);
        }
        if (source.Stereo3dType != null) {
            this.Stereo3dType = new String(source.Stereo3dType);
        }
        if (source.VideoProfile != null) {
            this.VideoProfile = new String(source.VideoProfile);
        }
        if (source.VideoLevel != null) {
            this.VideoLevel = new String(source.VideoLevel);
        }
        if (source.Bframes != null) {
            this.Bframes = new Long(source.Bframes);
        }
        if (source.Mode != null) {
            this.Mode = new String(source.Mode);
        }
        if (source.Sar != null) {
            this.Sar = new String(source.Sar);
        }
        if (source.NoScenecut != null) {
            this.NoScenecut = new Long(source.NoScenecut);
        }
        if (source.BitDepth != null) {
            this.BitDepth = new Long(source.BitDepth);
        }
        if (source.RawPts != null) {
            this.RawPts = new Long(source.RawPts);
        }
        if (source.Compress != null) {
            this.Compress = new Long(source.Compress);
        }
        if (source.SegmentSpecificInfo != null) {
            this.SegmentSpecificInfo = new SegmentSpecificInfo(source.SegmentSpecificInfo);
        }
        if (source.ScenarioBased != null) {
            this.ScenarioBased = new Long(source.ScenarioBased);
        }
        if (source.SceneType != null) {
            this.SceneType = new String(source.SceneType);
        }
        if (source.CompressType != null) {
            this.CompressType = new String(source.CompressType);
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
        this.setParamSimple(map, prefix + "Gop", this.Gop);
        this.setParamSimple(map, prefix + "GopUnit", this.GopUnit);
        this.setParamSimple(map, prefix + "FillType", this.FillType);
        this.setParamSimple(map, prefix + "Vcrf", this.Vcrf);
        this.setParamSimple(map, prefix + "ContentAdaptStream", this.ContentAdaptStream);
        this.setParamSimple(map, prefix + "HlsTime", this.HlsTime);
        this.setParamSimple(map, prefix + "SegmentType", this.SegmentType);
        this.setParamSimple(map, prefix + "FpsDenominator", this.FpsDenominator);
        this.setParamSimple(map, prefix + "Stereo3dType", this.Stereo3dType);
        this.setParamSimple(map, prefix + "VideoProfile", this.VideoProfile);
        this.setParamSimple(map, prefix + "VideoLevel", this.VideoLevel);
        this.setParamSimple(map, prefix + "Bframes", this.Bframes);
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "Sar", this.Sar);
        this.setParamSimple(map, prefix + "NoScenecut", this.NoScenecut);
        this.setParamSimple(map, prefix + "BitDepth", this.BitDepth);
        this.setParamSimple(map, prefix + "RawPts", this.RawPts);
        this.setParamSimple(map, prefix + "Compress", this.Compress);
        this.setParamObj(map, prefix + "SegmentSpecificInfo.", this.SegmentSpecificInfo);
        this.setParamSimple(map, prefix + "ScenarioBased", this.ScenarioBased);
        this.setParamSimple(map, prefix + "SceneType", this.SceneType);
        this.setParamSimple(map, prefix + "CompressType", this.CompressType);

    }
}

