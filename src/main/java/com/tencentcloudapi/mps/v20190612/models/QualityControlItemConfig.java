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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QualityControlItemConfig extends AbstractModel {

    /**
    * 质检项名称。质检项取值如下：
<li>LowEvaluation：无参考打分</li>
<li>Mosaic：马赛克检测</li>
<li>CrashScreen：花屏检测</li>
<li>Blur：模糊检测</li>
<li>BlackWhiteEdge：黑白边检测</li>
<li>SolidColorScreen：纯色屏检测</li>
<li>LowLighting：低光照</li>
<li>HighLighting：过曝</li>
<li>NoVoice：静音检测</li>
<li>LowVoice：低音检测</li>
<li>HighVoice：爆音检测</li>
<li>Jitter：抖动检测</li>
<li>Noise：噪点检测</li>
<li>QRCode：二维码检测</li>
<li>BarCode：条形码检测</li>
<li>AppletCode：小程序码检测</li>
<li>VideoResolutionChanged：视频分辨率变化</li>
<li>AudioSampleRateChanged：音频采样率变化</li>
<li>AudioChannelsChanged：音频通道数变化</li>
<li>ParameterSetsChanged：流参数集信息发生变化</li>
<li>DarOrSarInvalid：视频的宽高比异常</li>
<li>TimestampFallback：DTS时间戳回退</li>
<li>DtsJitter：DTS抖动过大</li>
<li>PtsJitter：PTS抖动过大</li>
<li>AACDurationDeviation：AAC帧时间戳间隔不合理</li>
<li>AudioDroppingFrames：音频丢帧</li>
<li>VideoDroppingFrames：视频丢帧</li>
<li>AVTimestampInterleave：音视频交织不合理</li>
<li>PtsLessThanDts：媒体流的 pts 小于 dts</li>
<li>ReceiveFpsJitter：网络接收帧率抖动过大</li>
<li>ReceiveFpsTooSmall：网络接收视频帧率过小</li>
<li>FpsJitter：通过PTS计算得到的流帧率抖动过大</li>
<li>StreamOpenFailed：流打开失败</li>
<li>StreamEnd：流结束</li>
<li>StreamParseFailed：流解析失败</li>
<li>VideoFirstFrameNotIdr：首帧不是IDR帧</li>
<li>StreamNALUError：NALU起始码错误</li>
<li>TsStreamNoAud：mpegts的H26x流缺失 AUD NALU</li>
<li>AudioStreamLack：无音频流</li>
<li>VideoStreamLack：无视频流</li>
<li>LackAudioRecover：缺失音频流恢复</li>
<li>LackVideoRecover：缺失视频流恢复</li>
<li>VideoBitrateOutofRange：视频流码率(kbps)超出范围</li>
<li>AudioBitrateOutofRange：音频流码率(kbps)超出范围</li>
<li>VideoDecodeFailed：视频解码错误</li>
<li>AudioDecodeFailed：音频解码错误</li>
<li>AudioOutOfPhase：双通道音频相位相反</li>
<li>VideoDuplicatedFrame：视频流中存在重复帧</li>
<li>AudioDuplicatedFrame：音频流中存在重复帧</li>
<li>VideoRotation：视频画面旋转</li>
<li>TsMultiPrograms：MPEG2-TS流有多个program</li>
<li>Mp4InvalidCodecFourcc：MP4中codec fourcc不符合Apple HLS要求</li>
<li>HLSBadM3u8Format：无效的m3u8文件</li>
<li>HLSInvalidMasterM3u8：无效的main m3u8文件</li>
<li>HLSInvalidMediaM3u8：无效的media m3u8文件</li>
<li>HLSMasterM3u8Recommended：main m3u8缺少标准推荐的参数</li>
<li>HLSMediaM3u8Recommended：media m3u8缺少标准推荐的参数</li>
<li>HLSMediaM3u8DiscontinuityExist：media m3u8存在EXT-X-DISCONTINUITY</li>
<li>HLSMediaSegmentsStreamNumChange：切片的流数目发生变化</li>
<li>HLSMediaSegmentsPTSJitterDeviation：切片间PTS跳变且没有EXT-X-DISCONTINUITY</li>
<li>HLSMediaSegmentsDTSJitterDeviation：切片间DTS跳变且没有EXT-X-DISCONTINUITY</li>
<li>TimecodeTrackExist：MP4存在tmcd轨道</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 能力配置开关，可选值：
<li>ON：开启；</li>
<li>OFF：关闭。</li>
默认值：ON。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * 采样方式，取值范围：
- Time：根据时间间隔采样。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Sampling")
    @Expose
    private String Sampling;

    /**
    * 采样间隔时间，单位：ms。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IntervalTime")
    @Expose
    private Long IntervalTime;

    /**
    * 异常持续时间，单位：ms。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
    * 检测项对应的阈值，不同检测项对应阈值不同。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Threshold")
    @Expose
    private String Threshold;

    /**
     * Get 质检项名称。质检项取值如下：
<li>LowEvaluation：无参考打分</li>
<li>Mosaic：马赛克检测</li>
<li>CrashScreen：花屏检测</li>
<li>Blur：模糊检测</li>
<li>BlackWhiteEdge：黑白边检测</li>
<li>SolidColorScreen：纯色屏检测</li>
<li>LowLighting：低光照</li>
<li>HighLighting：过曝</li>
<li>NoVoice：静音检测</li>
<li>LowVoice：低音检测</li>
<li>HighVoice：爆音检测</li>
<li>Jitter：抖动检测</li>
<li>Noise：噪点检测</li>
<li>QRCode：二维码检测</li>
<li>BarCode：条形码检测</li>
<li>AppletCode：小程序码检测</li>
<li>VideoResolutionChanged：视频分辨率变化</li>
<li>AudioSampleRateChanged：音频采样率变化</li>
<li>AudioChannelsChanged：音频通道数变化</li>
<li>ParameterSetsChanged：流参数集信息发生变化</li>
<li>DarOrSarInvalid：视频的宽高比异常</li>
<li>TimestampFallback：DTS时间戳回退</li>
<li>DtsJitter：DTS抖动过大</li>
<li>PtsJitter：PTS抖动过大</li>
<li>AACDurationDeviation：AAC帧时间戳间隔不合理</li>
<li>AudioDroppingFrames：音频丢帧</li>
<li>VideoDroppingFrames：视频丢帧</li>
<li>AVTimestampInterleave：音视频交织不合理</li>
<li>PtsLessThanDts：媒体流的 pts 小于 dts</li>
<li>ReceiveFpsJitter：网络接收帧率抖动过大</li>
<li>ReceiveFpsTooSmall：网络接收视频帧率过小</li>
<li>FpsJitter：通过PTS计算得到的流帧率抖动过大</li>
<li>StreamOpenFailed：流打开失败</li>
<li>StreamEnd：流结束</li>
<li>StreamParseFailed：流解析失败</li>
<li>VideoFirstFrameNotIdr：首帧不是IDR帧</li>
<li>StreamNALUError：NALU起始码错误</li>
<li>TsStreamNoAud：mpegts的H26x流缺失 AUD NALU</li>
<li>AudioStreamLack：无音频流</li>
<li>VideoStreamLack：无视频流</li>
<li>LackAudioRecover：缺失音频流恢复</li>
<li>LackVideoRecover：缺失视频流恢复</li>
<li>VideoBitrateOutofRange：视频流码率(kbps)超出范围</li>
<li>AudioBitrateOutofRange：音频流码率(kbps)超出范围</li>
<li>VideoDecodeFailed：视频解码错误</li>
<li>AudioDecodeFailed：音频解码错误</li>
<li>AudioOutOfPhase：双通道音频相位相反</li>
<li>VideoDuplicatedFrame：视频流中存在重复帧</li>
<li>AudioDuplicatedFrame：音频流中存在重复帧</li>
<li>VideoRotation：视频画面旋转</li>
<li>TsMultiPrograms：MPEG2-TS流有多个program</li>
<li>Mp4InvalidCodecFourcc：MP4中codec fourcc不符合Apple HLS要求</li>
<li>HLSBadM3u8Format：无效的m3u8文件</li>
<li>HLSInvalidMasterM3u8：无效的main m3u8文件</li>
<li>HLSInvalidMediaM3u8：无效的media m3u8文件</li>
<li>HLSMasterM3u8Recommended：main m3u8缺少标准推荐的参数</li>
<li>HLSMediaM3u8Recommended：media m3u8缺少标准推荐的参数</li>
<li>HLSMediaM3u8DiscontinuityExist：media m3u8存在EXT-X-DISCONTINUITY</li>
<li>HLSMediaSegmentsStreamNumChange：切片的流数目发生变化</li>
<li>HLSMediaSegmentsPTSJitterDeviation：切片间PTS跳变且没有EXT-X-DISCONTINUITY</li>
<li>HLSMediaSegmentsDTSJitterDeviation：切片间DTS跳变且没有EXT-X-DISCONTINUITY</li>
<li>TimecodeTrackExist：MP4存在tmcd轨道</li> 
     * @return Type 质检项名称。质检项取值如下：
<li>LowEvaluation：无参考打分</li>
<li>Mosaic：马赛克检测</li>
<li>CrashScreen：花屏检测</li>
<li>Blur：模糊检测</li>
<li>BlackWhiteEdge：黑白边检测</li>
<li>SolidColorScreen：纯色屏检测</li>
<li>LowLighting：低光照</li>
<li>HighLighting：过曝</li>
<li>NoVoice：静音检测</li>
<li>LowVoice：低音检测</li>
<li>HighVoice：爆音检测</li>
<li>Jitter：抖动检测</li>
<li>Noise：噪点检测</li>
<li>QRCode：二维码检测</li>
<li>BarCode：条形码检测</li>
<li>AppletCode：小程序码检测</li>
<li>VideoResolutionChanged：视频分辨率变化</li>
<li>AudioSampleRateChanged：音频采样率变化</li>
<li>AudioChannelsChanged：音频通道数变化</li>
<li>ParameterSetsChanged：流参数集信息发生变化</li>
<li>DarOrSarInvalid：视频的宽高比异常</li>
<li>TimestampFallback：DTS时间戳回退</li>
<li>DtsJitter：DTS抖动过大</li>
<li>PtsJitter：PTS抖动过大</li>
<li>AACDurationDeviation：AAC帧时间戳间隔不合理</li>
<li>AudioDroppingFrames：音频丢帧</li>
<li>VideoDroppingFrames：视频丢帧</li>
<li>AVTimestampInterleave：音视频交织不合理</li>
<li>PtsLessThanDts：媒体流的 pts 小于 dts</li>
<li>ReceiveFpsJitter：网络接收帧率抖动过大</li>
<li>ReceiveFpsTooSmall：网络接收视频帧率过小</li>
<li>FpsJitter：通过PTS计算得到的流帧率抖动过大</li>
<li>StreamOpenFailed：流打开失败</li>
<li>StreamEnd：流结束</li>
<li>StreamParseFailed：流解析失败</li>
<li>VideoFirstFrameNotIdr：首帧不是IDR帧</li>
<li>StreamNALUError：NALU起始码错误</li>
<li>TsStreamNoAud：mpegts的H26x流缺失 AUD NALU</li>
<li>AudioStreamLack：无音频流</li>
<li>VideoStreamLack：无视频流</li>
<li>LackAudioRecover：缺失音频流恢复</li>
<li>LackVideoRecover：缺失视频流恢复</li>
<li>VideoBitrateOutofRange：视频流码率(kbps)超出范围</li>
<li>AudioBitrateOutofRange：音频流码率(kbps)超出范围</li>
<li>VideoDecodeFailed：视频解码错误</li>
<li>AudioDecodeFailed：音频解码错误</li>
<li>AudioOutOfPhase：双通道音频相位相反</li>
<li>VideoDuplicatedFrame：视频流中存在重复帧</li>
<li>AudioDuplicatedFrame：音频流中存在重复帧</li>
<li>VideoRotation：视频画面旋转</li>
<li>TsMultiPrograms：MPEG2-TS流有多个program</li>
<li>Mp4InvalidCodecFourcc：MP4中codec fourcc不符合Apple HLS要求</li>
<li>HLSBadM3u8Format：无效的m3u8文件</li>
<li>HLSInvalidMasterM3u8：无效的main m3u8文件</li>
<li>HLSInvalidMediaM3u8：无效的media m3u8文件</li>
<li>HLSMasterM3u8Recommended：main m3u8缺少标准推荐的参数</li>
<li>HLSMediaM3u8Recommended：media m3u8缺少标准推荐的参数</li>
<li>HLSMediaM3u8DiscontinuityExist：media m3u8存在EXT-X-DISCONTINUITY</li>
<li>HLSMediaSegmentsStreamNumChange：切片的流数目发生变化</li>
<li>HLSMediaSegmentsPTSJitterDeviation：切片间PTS跳变且没有EXT-X-DISCONTINUITY</li>
<li>HLSMediaSegmentsDTSJitterDeviation：切片间DTS跳变且没有EXT-X-DISCONTINUITY</li>
<li>TimecodeTrackExist：MP4存在tmcd轨道</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 质检项名称。质检项取值如下：
<li>LowEvaluation：无参考打分</li>
<li>Mosaic：马赛克检测</li>
<li>CrashScreen：花屏检测</li>
<li>Blur：模糊检测</li>
<li>BlackWhiteEdge：黑白边检测</li>
<li>SolidColorScreen：纯色屏检测</li>
<li>LowLighting：低光照</li>
<li>HighLighting：过曝</li>
<li>NoVoice：静音检测</li>
<li>LowVoice：低音检测</li>
<li>HighVoice：爆音检测</li>
<li>Jitter：抖动检测</li>
<li>Noise：噪点检测</li>
<li>QRCode：二维码检测</li>
<li>BarCode：条形码检测</li>
<li>AppletCode：小程序码检测</li>
<li>VideoResolutionChanged：视频分辨率变化</li>
<li>AudioSampleRateChanged：音频采样率变化</li>
<li>AudioChannelsChanged：音频通道数变化</li>
<li>ParameterSetsChanged：流参数集信息发生变化</li>
<li>DarOrSarInvalid：视频的宽高比异常</li>
<li>TimestampFallback：DTS时间戳回退</li>
<li>DtsJitter：DTS抖动过大</li>
<li>PtsJitter：PTS抖动过大</li>
<li>AACDurationDeviation：AAC帧时间戳间隔不合理</li>
<li>AudioDroppingFrames：音频丢帧</li>
<li>VideoDroppingFrames：视频丢帧</li>
<li>AVTimestampInterleave：音视频交织不合理</li>
<li>PtsLessThanDts：媒体流的 pts 小于 dts</li>
<li>ReceiveFpsJitter：网络接收帧率抖动过大</li>
<li>ReceiveFpsTooSmall：网络接收视频帧率过小</li>
<li>FpsJitter：通过PTS计算得到的流帧率抖动过大</li>
<li>StreamOpenFailed：流打开失败</li>
<li>StreamEnd：流结束</li>
<li>StreamParseFailed：流解析失败</li>
<li>VideoFirstFrameNotIdr：首帧不是IDR帧</li>
<li>StreamNALUError：NALU起始码错误</li>
<li>TsStreamNoAud：mpegts的H26x流缺失 AUD NALU</li>
<li>AudioStreamLack：无音频流</li>
<li>VideoStreamLack：无视频流</li>
<li>LackAudioRecover：缺失音频流恢复</li>
<li>LackVideoRecover：缺失视频流恢复</li>
<li>VideoBitrateOutofRange：视频流码率(kbps)超出范围</li>
<li>AudioBitrateOutofRange：音频流码率(kbps)超出范围</li>
<li>VideoDecodeFailed：视频解码错误</li>
<li>AudioDecodeFailed：音频解码错误</li>
<li>AudioOutOfPhase：双通道音频相位相反</li>
<li>VideoDuplicatedFrame：视频流中存在重复帧</li>
<li>AudioDuplicatedFrame：音频流中存在重复帧</li>
<li>VideoRotation：视频画面旋转</li>
<li>TsMultiPrograms：MPEG2-TS流有多个program</li>
<li>Mp4InvalidCodecFourcc：MP4中codec fourcc不符合Apple HLS要求</li>
<li>HLSBadM3u8Format：无效的m3u8文件</li>
<li>HLSInvalidMasterM3u8：无效的main m3u8文件</li>
<li>HLSInvalidMediaM3u8：无效的media m3u8文件</li>
<li>HLSMasterM3u8Recommended：main m3u8缺少标准推荐的参数</li>
<li>HLSMediaM3u8Recommended：media m3u8缺少标准推荐的参数</li>
<li>HLSMediaM3u8DiscontinuityExist：media m3u8存在EXT-X-DISCONTINUITY</li>
<li>HLSMediaSegmentsStreamNumChange：切片的流数目发生变化</li>
<li>HLSMediaSegmentsPTSJitterDeviation：切片间PTS跳变且没有EXT-X-DISCONTINUITY</li>
<li>HLSMediaSegmentsDTSJitterDeviation：切片间DTS跳变且没有EXT-X-DISCONTINUITY</li>
<li>TimecodeTrackExist：MP4存在tmcd轨道</li>
     * @param Type 质检项名称。质检项取值如下：
<li>LowEvaluation：无参考打分</li>
<li>Mosaic：马赛克检测</li>
<li>CrashScreen：花屏检测</li>
<li>Blur：模糊检测</li>
<li>BlackWhiteEdge：黑白边检测</li>
<li>SolidColorScreen：纯色屏检测</li>
<li>LowLighting：低光照</li>
<li>HighLighting：过曝</li>
<li>NoVoice：静音检测</li>
<li>LowVoice：低音检测</li>
<li>HighVoice：爆音检测</li>
<li>Jitter：抖动检测</li>
<li>Noise：噪点检测</li>
<li>QRCode：二维码检测</li>
<li>BarCode：条形码检测</li>
<li>AppletCode：小程序码检测</li>
<li>VideoResolutionChanged：视频分辨率变化</li>
<li>AudioSampleRateChanged：音频采样率变化</li>
<li>AudioChannelsChanged：音频通道数变化</li>
<li>ParameterSetsChanged：流参数集信息发生变化</li>
<li>DarOrSarInvalid：视频的宽高比异常</li>
<li>TimestampFallback：DTS时间戳回退</li>
<li>DtsJitter：DTS抖动过大</li>
<li>PtsJitter：PTS抖动过大</li>
<li>AACDurationDeviation：AAC帧时间戳间隔不合理</li>
<li>AudioDroppingFrames：音频丢帧</li>
<li>VideoDroppingFrames：视频丢帧</li>
<li>AVTimestampInterleave：音视频交织不合理</li>
<li>PtsLessThanDts：媒体流的 pts 小于 dts</li>
<li>ReceiveFpsJitter：网络接收帧率抖动过大</li>
<li>ReceiveFpsTooSmall：网络接收视频帧率过小</li>
<li>FpsJitter：通过PTS计算得到的流帧率抖动过大</li>
<li>StreamOpenFailed：流打开失败</li>
<li>StreamEnd：流结束</li>
<li>StreamParseFailed：流解析失败</li>
<li>VideoFirstFrameNotIdr：首帧不是IDR帧</li>
<li>StreamNALUError：NALU起始码错误</li>
<li>TsStreamNoAud：mpegts的H26x流缺失 AUD NALU</li>
<li>AudioStreamLack：无音频流</li>
<li>VideoStreamLack：无视频流</li>
<li>LackAudioRecover：缺失音频流恢复</li>
<li>LackVideoRecover：缺失视频流恢复</li>
<li>VideoBitrateOutofRange：视频流码率(kbps)超出范围</li>
<li>AudioBitrateOutofRange：音频流码率(kbps)超出范围</li>
<li>VideoDecodeFailed：视频解码错误</li>
<li>AudioDecodeFailed：音频解码错误</li>
<li>AudioOutOfPhase：双通道音频相位相反</li>
<li>VideoDuplicatedFrame：视频流中存在重复帧</li>
<li>AudioDuplicatedFrame：音频流中存在重复帧</li>
<li>VideoRotation：视频画面旋转</li>
<li>TsMultiPrograms：MPEG2-TS流有多个program</li>
<li>Mp4InvalidCodecFourcc：MP4中codec fourcc不符合Apple HLS要求</li>
<li>HLSBadM3u8Format：无效的m3u8文件</li>
<li>HLSInvalidMasterM3u8：无效的main m3u8文件</li>
<li>HLSInvalidMediaM3u8：无效的media m3u8文件</li>
<li>HLSMasterM3u8Recommended：main m3u8缺少标准推荐的参数</li>
<li>HLSMediaM3u8Recommended：media m3u8缺少标准推荐的参数</li>
<li>HLSMediaM3u8DiscontinuityExist：media m3u8存在EXT-X-DISCONTINUITY</li>
<li>HLSMediaSegmentsStreamNumChange：切片的流数目发生变化</li>
<li>HLSMediaSegmentsPTSJitterDeviation：切片间PTS跳变且没有EXT-X-DISCONTINUITY</li>
<li>HLSMediaSegmentsDTSJitterDeviation：切片间DTS跳变且没有EXT-X-DISCONTINUITY</li>
<li>TimecodeTrackExist：MP4存在tmcd轨道</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 能力配置开关，可选值：
<li>ON：开启；</li>
<li>OFF：关闭。</li>
默认值：ON。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Switch 能力配置开关，可选值：
<li>ON：开启；</li>
<li>OFF：关闭。</li>
默认值：ON。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set 能力配置开关，可选值：
<li>ON：开启；</li>
<li>OFF：关闭。</li>
默认值：ON。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Switch 能力配置开关，可选值：
<li>ON：开启；</li>
<li>OFF：关闭。</li>
默认值：ON。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get 采样方式，取值范围：
- Time：根据时间间隔采样。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Sampling 采样方式，取值范围：
- Time：根据时间间隔采样。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSampling() {
        return this.Sampling;
    }

    /**
     * Set 采样方式，取值范围：
- Time：根据时间间隔采样。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Sampling 采样方式，取值范围：
- Time：根据时间间隔采样。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSampling(String Sampling) {
        this.Sampling = Sampling;
    }

    /**
     * Get 采样间隔时间，单位：ms。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IntervalTime 采样间隔时间，单位：ms。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIntervalTime() {
        return this.IntervalTime;
    }

    /**
     * Set 采样间隔时间，单位：ms。
注意：此字段可能返回 null，表示取不到有效值。
     * @param IntervalTime 采样间隔时间，单位：ms。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIntervalTime(Long IntervalTime) {
        this.IntervalTime = IntervalTime;
    }

    /**
     * Get 异常持续时间，单位：ms。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Duration 异常持续时间，单位：ms。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set 异常持续时间，单位：ms。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Duration 异常持续时间，单位：ms。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    /**
     * Get 检测项对应的阈值，不同检测项对应阈值不同。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Threshold 检测项对应的阈值，不同检测项对应阈值不同。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getThreshold() {
        return this.Threshold;
    }

    /**
     * Set 检测项对应的阈值，不同检测项对应阈值不同。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Threshold 检测项对应的阈值，不同检测项对应阈值不同。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setThreshold(String Threshold) {
        this.Threshold = Threshold;
    }

    public QualityControlItemConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QualityControlItemConfig(QualityControlItemConfig source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.Sampling != null) {
            this.Sampling = new String(source.Sampling);
        }
        if (source.IntervalTime != null) {
            this.IntervalTime = new Long(source.IntervalTime);
        }
        if (source.Duration != null) {
            this.Duration = new Long(source.Duration);
        }
        if (source.Threshold != null) {
            this.Threshold = new String(source.Threshold);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "Sampling", this.Sampling);
        this.setParamSimple(map, prefix + "IntervalTime", this.IntervalTime);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "Threshold", this.Threshold);

    }
}

