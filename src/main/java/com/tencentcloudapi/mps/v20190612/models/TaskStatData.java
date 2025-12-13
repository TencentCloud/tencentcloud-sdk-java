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

public class TaskStatData extends AbstractModel {

    /**
    * 任务类型。
<li>Transcode: 转码</li>
<li>Enhance: 增强</li>
<li>AIAnalysis: 智能分析</li>
<li>AIRecognition: 智能识别</li>
<li>AIReview: 内容审核</li>
<li>Snapshot: 截图</li>
<li>AnimatedGraphics: 转动图</li>
<li>ImageProcess: 图片处理</li>
    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
    * 任务数统计数据概览。
<li>Transcode：用量单位为秒</li>
<li>Enhance：用量单位为秒</li>
<li>AIAnalysis：用量单位为秒</li>
<li>AIRecognition：用量单位为秒</li>
<li>AIReview：用量单位为秒</li>
<li>Snapshot：用量单位为张</li>
<li>AnimatedGraphics: 用量单位为秒</li>
<li>ImageProcess: 用量单位为张</li>
    */
    @SerializedName("Summary")
    @Expose
    private TaskStatDataItem [] Summary;

    /**
    * 不同规格任务统计数据详情。

1、转码规格：
<li>Audio：纯音频</li>
<li>Remuxing：转封装</li>
<li>其他转码规格：{TYPE}.{CODEC}.{SPECIFICATION}</li>  其中 TYPE 取值
    Standard：普通转码
    TESHD-10：视频极速高清
    TESHD-20：音频极速高清
    TESHD-30：音视频极速高清
    TESHD-30-SDK：音视频极速高清SDK按时长计费
    TESHD-30-SDKCores：音视频极速高清SDK按核心数计费
    Edit：视频编辑
  其中 CODEC 取值
    H264：H.264 编码
    H265：H.265 编码
    AV1：AV1 编码
    MV-HEVC：MV-HEVC 编码
  其中 SPECIFICATION 取值
    SD：标清
    HD：高清
    FHD：全高清
    2K：2K
    4K：4K
例如 TESHD-10.H265.HD 表示 H.265 编码方式高清极速高清转码

2、增强规格：视频增强格式：{TYPE}.{CODEC}.{SPECIFICATION}.{FPS}，其中 CODEC 和 SPECIFICATION 同转码，FPS在原子类型时才存在；音频增强格式：{TYPE}。
增强TYPE 取值：
<li>Enhance：通用增强类型，可能是任意一种原子增强类型</li>
<li>原子增强类型</li>  视频原子增强类型取值：
    Sdr2hdr：SDR2HDR
    SuperResolution：超分
    InsertFrame：插帧
    ComprehensiveEnhancement：综合增强
    NoiseReduction：视频降噪
    ColorEnhancement：色彩增强
    RemoveScratches：去划痕
    Deburr：去毛刺
    DetailEnhancement：细节增强
    LightEnhancement：低光照增强
    FaceEnhancement：人脸增强
  音频原子增强类型取值：
    AudioNoiseReduction
    VolumeBalance
    AudioBeautify
    AudioSeparation

3、截图规格：
<li>ImageSprite：雪碧图</li>
<li>SampleSnapshot：采样截图</li>
<li>SnapshotByTime：时间点截图</li>
4、图片处理规格：{TYPE}.{CODEC}.{SPECIFICATION}
<li> ImageCompression：图片编码</li>
<li> ImageSuperResolution：图片超分</li>
<li> EnhanceImageColor：图片色彩增强</li>
5、智能分析规格：
<li>AIAnalysis：分析大类</li>
<li>VideoTag：视频标签</li>
<li>VideoClassification：视频分类</li>
<li>SmartCover：智能封面</li>
<li>FrameLabel：帧标签</li>
<li>VideoSplit：视频拆条</li>
<li>Highlights：精彩集锦</li>
<li>OpeningAndEnding：片头片尾</li>
6、智能识别规格：
<li>AIRecognition：识别大类</li>
<li>FaceRecognition：人脸识别</li>
<li>TextRecognition：文字识别</li>
<li>ObjectRecognition：物体识别</li>
<li>VoiceRecognition：语音识别</li>
<li>VoiceTranslation：语音翻译</li>
7、内容审核、转动图无细分规格。
    */
    @SerializedName("Details")
    @Expose
    private SpecificationDataItem [] Details;

    /**
     * Get 任务类型。
<li>Transcode: 转码</li>
<li>Enhance: 增强</li>
<li>AIAnalysis: 智能分析</li>
<li>AIRecognition: 智能识别</li>
<li>AIReview: 内容审核</li>
<li>Snapshot: 截图</li>
<li>AnimatedGraphics: 转动图</li>
<li>ImageProcess: 图片处理</li> 
     * @return TaskType 任务类型。
<li>Transcode: 转码</li>
<li>Enhance: 增强</li>
<li>AIAnalysis: 智能分析</li>
<li>AIRecognition: 智能识别</li>
<li>AIReview: 内容审核</li>
<li>Snapshot: 截图</li>
<li>AnimatedGraphics: 转动图</li>
<li>ImageProcess: 图片处理</li>
     */
    public String getTaskType() {
        return this.TaskType;
    }

    /**
     * Set 任务类型。
<li>Transcode: 转码</li>
<li>Enhance: 增强</li>
<li>AIAnalysis: 智能分析</li>
<li>AIRecognition: 智能识别</li>
<li>AIReview: 内容审核</li>
<li>Snapshot: 截图</li>
<li>AnimatedGraphics: 转动图</li>
<li>ImageProcess: 图片处理</li>
     * @param TaskType 任务类型。
<li>Transcode: 转码</li>
<li>Enhance: 增强</li>
<li>AIAnalysis: 智能分析</li>
<li>AIRecognition: 智能识别</li>
<li>AIReview: 内容审核</li>
<li>Snapshot: 截图</li>
<li>AnimatedGraphics: 转动图</li>
<li>ImageProcess: 图片处理</li>
     */
    public void setTaskType(String TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get 任务数统计数据概览。
<li>Transcode：用量单位为秒</li>
<li>Enhance：用量单位为秒</li>
<li>AIAnalysis：用量单位为秒</li>
<li>AIRecognition：用量单位为秒</li>
<li>AIReview：用量单位为秒</li>
<li>Snapshot：用量单位为张</li>
<li>AnimatedGraphics: 用量单位为秒</li>
<li>ImageProcess: 用量单位为张</li> 
     * @return Summary 任务数统计数据概览。
<li>Transcode：用量单位为秒</li>
<li>Enhance：用量单位为秒</li>
<li>AIAnalysis：用量单位为秒</li>
<li>AIRecognition：用量单位为秒</li>
<li>AIReview：用量单位为秒</li>
<li>Snapshot：用量单位为张</li>
<li>AnimatedGraphics: 用量单位为秒</li>
<li>ImageProcess: 用量单位为张</li>
     */
    public TaskStatDataItem [] getSummary() {
        return this.Summary;
    }

    /**
     * Set 任务数统计数据概览。
<li>Transcode：用量单位为秒</li>
<li>Enhance：用量单位为秒</li>
<li>AIAnalysis：用量单位为秒</li>
<li>AIRecognition：用量单位为秒</li>
<li>AIReview：用量单位为秒</li>
<li>Snapshot：用量单位为张</li>
<li>AnimatedGraphics: 用量单位为秒</li>
<li>ImageProcess: 用量单位为张</li>
     * @param Summary 任务数统计数据概览。
<li>Transcode：用量单位为秒</li>
<li>Enhance：用量单位为秒</li>
<li>AIAnalysis：用量单位为秒</li>
<li>AIRecognition：用量单位为秒</li>
<li>AIReview：用量单位为秒</li>
<li>Snapshot：用量单位为张</li>
<li>AnimatedGraphics: 用量单位为秒</li>
<li>ImageProcess: 用量单位为张</li>
     */
    public void setSummary(TaskStatDataItem [] Summary) {
        this.Summary = Summary;
    }

    /**
     * Get 不同规格任务统计数据详情。

1、转码规格：
<li>Audio：纯音频</li>
<li>Remuxing：转封装</li>
<li>其他转码规格：{TYPE}.{CODEC}.{SPECIFICATION}</li>  其中 TYPE 取值
    Standard：普通转码
    TESHD-10：视频极速高清
    TESHD-20：音频极速高清
    TESHD-30：音视频极速高清
    TESHD-30-SDK：音视频极速高清SDK按时长计费
    TESHD-30-SDKCores：音视频极速高清SDK按核心数计费
    Edit：视频编辑
  其中 CODEC 取值
    H264：H.264 编码
    H265：H.265 编码
    AV1：AV1 编码
    MV-HEVC：MV-HEVC 编码
  其中 SPECIFICATION 取值
    SD：标清
    HD：高清
    FHD：全高清
    2K：2K
    4K：4K
例如 TESHD-10.H265.HD 表示 H.265 编码方式高清极速高清转码

2、增强规格：视频增强格式：{TYPE}.{CODEC}.{SPECIFICATION}.{FPS}，其中 CODEC 和 SPECIFICATION 同转码，FPS在原子类型时才存在；音频增强格式：{TYPE}。
增强TYPE 取值：
<li>Enhance：通用增强类型，可能是任意一种原子增强类型</li>
<li>原子增强类型</li>  视频原子增强类型取值：
    Sdr2hdr：SDR2HDR
    SuperResolution：超分
    InsertFrame：插帧
    ComprehensiveEnhancement：综合增强
    NoiseReduction：视频降噪
    ColorEnhancement：色彩增强
    RemoveScratches：去划痕
    Deburr：去毛刺
    DetailEnhancement：细节增强
    LightEnhancement：低光照增强
    FaceEnhancement：人脸增强
  音频原子增强类型取值：
    AudioNoiseReduction
    VolumeBalance
    AudioBeautify
    AudioSeparation

3、截图规格：
<li>ImageSprite：雪碧图</li>
<li>SampleSnapshot：采样截图</li>
<li>SnapshotByTime：时间点截图</li>
4、图片处理规格：{TYPE}.{CODEC}.{SPECIFICATION}
<li> ImageCompression：图片编码</li>
<li> ImageSuperResolution：图片超分</li>
<li> EnhanceImageColor：图片色彩增强</li>
5、智能分析规格：
<li>AIAnalysis：分析大类</li>
<li>VideoTag：视频标签</li>
<li>VideoClassification：视频分类</li>
<li>SmartCover：智能封面</li>
<li>FrameLabel：帧标签</li>
<li>VideoSplit：视频拆条</li>
<li>Highlights：精彩集锦</li>
<li>OpeningAndEnding：片头片尾</li>
6、智能识别规格：
<li>AIRecognition：识别大类</li>
<li>FaceRecognition：人脸识别</li>
<li>TextRecognition：文字识别</li>
<li>ObjectRecognition：物体识别</li>
<li>VoiceRecognition：语音识别</li>
<li>VoiceTranslation：语音翻译</li>
7、内容审核、转动图无细分规格。 
     * @return Details 不同规格任务统计数据详情。

1、转码规格：
<li>Audio：纯音频</li>
<li>Remuxing：转封装</li>
<li>其他转码规格：{TYPE}.{CODEC}.{SPECIFICATION}</li>  其中 TYPE 取值
    Standard：普通转码
    TESHD-10：视频极速高清
    TESHD-20：音频极速高清
    TESHD-30：音视频极速高清
    TESHD-30-SDK：音视频极速高清SDK按时长计费
    TESHD-30-SDKCores：音视频极速高清SDK按核心数计费
    Edit：视频编辑
  其中 CODEC 取值
    H264：H.264 编码
    H265：H.265 编码
    AV1：AV1 编码
    MV-HEVC：MV-HEVC 编码
  其中 SPECIFICATION 取值
    SD：标清
    HD：高清
    FHD：全高清
    2K：2K
    4K：4K
例如 TESHD-10.H265.HD 表示 H.265 编码方式高清极速高清转码

2、增强规格：视频增强格式：{TYPE}.{CODEC}.{SPECIFICATION}.{FPS}，其中 CODEC 和 SPECIFICATION 同转码，FPS在原子类型时才存在；音频增强格式：{TYPE}。
增强TYPE 取值：
<li>Enhance：通用增强类型，可能是任意一种原子增强类型</li>
<li>原子增强类型</li>  视频原子增强类型取值：
    Sdr2hdr：SDR2HDR
    SuperResolution：超分
    InsertFrame：插帧
    ComprehensiveEnhancement：综合增强
    NoiseReduction：视频降噪
    ColorEnhancement：色彩增强
    RemoveScratches：去划痕
    Deburr：去毛刺
    DetailEnhancement：细节增强
    LightEnhancement：低光照增强
    FaceEnhancement：人脸增强
  音频原子增强类型取值：
    AudioNoiseReduction
    VolumeBalance
    AudioBeautify
    AudioSeparation

3、截图规格：
<li>ImageSprite：雪碧图</li>
<li>SampleSnapshot：采样截图</li>
<li>SnapshotByTime：时间点截图</li>
4、图片处理规格：{TYPE}.{CODEC}.{SPECIFICATION}
<li> ImageCompression：图片编码</li>
<li> ImageSuperResolution：图片超分</li>
<li> EnhanceImageColor：图片色彩增强</li>
5、智能分析规格：
<li>AIAnalysis：分析大类</li>
<li>VideoTag：视频标签</li>
<li>VideoClassification：视频分类</li>
<li>SmartCover：智能封面</li>
<li>FrameLabel：帧标签</li>
<li>VideoSplit：视频拆条</li>
<li>Highlights：精彩集锦</li>
<li>OpeningAndEnding：片头片尾</li>
6、智能识别规格：
<li>AIRecognition：识别大类</li>
<li>FaceRecognition：人脸识别</li>
<li>TextRecognition：文字识别</li>
<li>ObjectRecognition：物体识别</li>
<li>VoiceRecognition：语音识别</li>
<li>VoiceTranslation：语音翻译</li>
7、内容审核、转动图无细分规格。
     */
    public SpecificationDataItem [] getDetails() {
        return this.Details;
    }

    /**
     * Set 不同规格任务统计数据详情。

1、转码规格：
<li>Audio：纯音频</li>
<li>Remuxing：转封装</li>
<li>其他转码规格：{TYPE}.{CODEC}.{SPECIFICATION}</li>  其中 TYPE 取值
    Standard：普通转码
    TESHD-10：视频极速高清
    TESHD-20：音频极速高清
    TESHD-30：音视频极速高清
    TESHD-30-SDK：音视频极速高清SDK按时长计费
    TESHD-30-SDKCores：音视频极速高清SDK按核心数计费
    Edit：视频编辑
  其中 CODEC 取值
    H264：H.264 编码
    H265：H.265 编码
    AV1：AV1 编码
    MV-HEVC：MV-HEVC 编码
  其中 SPECIFICATION 取值
    SD：标清
    HD：高清
    FHD：全高清
    2K：2K
    4K：4K
例如 TESHD-10.H265.HD 表示 H.265 编码方式高清极速高清转码

2、增强规格：视频增强格式：{TYPE}.{CODEC}.{SPECIFICATION}.{FPS}，其中 CODEC 和 SPECIFICATION 同转码，FPS在原子类型时才存在；音频增强格式：{TYPE}。
增强TYPE 取值：
<li>Enhance：通用增强类型，可能是任意一种原子增强类型</li>
<li>原子增强类型</li>  视频原子增强类型取值：
    Sdr2hdr：SDR2HDR
    SuperResolution：超分
    InsertFrame：插帧
    ComprehensiveEnhancement：综合增强
    NoiseReduction：视频降噪
    ColorEnhancement：色彩增强
    RemoveScratches：去划痕
    Deburr：去毛刺
    DetailEnhancement：细节增强
    LightEnhancement：低光照增强
    FaceEnhancement：人脸增强
  音频原子增强类型取值：
    AudioNoiseReduction
    VolumeBalance
    AudioBeautify
    AudioSeparation

3、截图规格：
<li>ImageSprite：雪碧图</li>
<li>SampleSnapshot：采样截图</li>
<li>SnapshotByTime：时间点截图</li>
4、图片处理规格：{TYPE}.{CODEC}.{SPECIFICATION}
<li> ImageCompression：图片编码</li>
<li> ImageSuperResolution：图片超分</li>
<li> EnhanceImageColor：图片色彩增强</li>
5、智能分析规格：
<li>AIAnalysis：分析大类</li>
<li>VideoTag：视频标签</li>
<li>VideoClassification：视频分类</li>
<li>SmartCover：智能封面</li>
<li>FrameLabel：帧标签</li>
<li>VideoSplit：视频拆条</li>
<li>Highlights：精彩集锦</li>
<li>OpeningAndEnding：片头片尾</li>
6、智能识别规格：
<li>AIRecognition：识别大类</li>
<li>FaceRecognition：人脸识别</li>
<li>TextRecognition：文字识别</li>
<li>ObjectRecognition：物体识别</li>
<li>VoiceRecognition：语音识别</li>
<li>VoiceTranslation：语音翻译</li>
7、内容审核、转动图无细分规格。
     * @param Details 不同规格任务统计数据详情。

1、转码规格：
<li>Audio：纯音频</li>
<li>Remuxing：转封装</li>
<li>其他转码规格：{TYPE}.{CODEC}.{SPECIFICATION}</li>  其中 TYPE 取值
    Standard：普通转码
    TESHD-10：视频极速高清
    TESHD-20：音频极速高清
    TESHD-30：音视频极速高清
    TESHD-30-SDK：音视频极速高清SDK按时长计费
    TESHD-30-SDKCores：音视频极速高清SDK按核心数计费
    Edit：视频编辑
  其中 CODEC 取值
    H264：H.264 编码
    H265：H.265 编码
    AV1：AV1 编码
    MV-HEVC：MV-HEVC 编码
  其中 SPECIFICATION 取值
    SD：标清
    HD：高清
    FHD：全高清
    2K：2K
    4K：4K
例如 TESHD-10.H265.HD 表示 H.265 编码方式高清极速高清转码

2、增强规格：视频增强格式：{TYPE}.{CODEC}.{SPECIFICATION}.{FPS}，其中 CODEC 和 SPECIFICATION 同转码，FPS在原子类型时才存在；音频增强格式：{TYPE}。
增强TYPE 取值：
<li>Enhance：通用增强类型，可能是任意一种原子增强类型</li>
<li>原子增强类型</li>  视频原子增强类型取值：
    Sdr2hdr：SDR2HDR
    SuperResolution：超分
    InsertFrame：插帧
    ComprehensiveEnhancement：综合增强
    NoiseReduction：视频降噪
    ColorEnhancement：色彩增强
    RemoveScratches：去划痕
    Deburr：去毛刺
    DetailEnhancement：细节增强
    LightEnhancement：低光照增强
    FaceEnhancement：人脸增强
  音频原子增强类型取值：
    AudioNoiseReduction
    VolumeBalance
    AudioBeautify
    AudioSeparation

3、截图规格：
<li>ImageSprite：雪碧图</li>
<li>SampleSnapshot：采样截图</li>
<li>SnapshotByTime：时间点截图</li>
4、图片处理规格：{TYPE}.{CODEC}.{SPECIFICATION}
<li> ImageCompression：图片编码</li>
<li> ImageSuperResolution：图片超分</li>
<li> EnhanceImageColor：图片色彩增强</li>
5、智能分析规格：
<li>AIAnalysis：分析大类</li>
<li>VideoTag：视频标签</li>
<li>VideoClassification：视频分类</li>
<li>SmartCover：智能封面</li>
<li>FrameLabel：帧标签</li>
<li>VideoSplit：视频拆条</li>
<li>Highlights：精彩集锦</li>
<li>OpeningAndEnding：片头片尾</li>
6、智能识别规格：
<li>AIRecognition：识别大类</li>
<li>FaceRecognition：人脸识别</li>
<li>TextRecognition：文字识别</li>
<li>ObjectRecognition：物体识别</li>
<li>VoiceRecognition：语音识别</li>
<li>VoiceTranslation：语音翻译</li>
7、内容审核、转动图无细分规格。
     */
    public void setDetails(SpecificationDataItem [] Details) {
        this.Details = Details;
    }

    public TaskStatData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskStatData(TaskStatData source) {
        if (source.TaskType != null) {
            this.TaskType = new String(source.TaskType);
        }
        if (source.Summary != null) {
            this.Summary = new TaskStatDataItem[source.Summary.length];
            for (int i = 0; i < source.Summary.length; i++) {
                this.Summary[i] = new TaskStatDataItem(source.Summary[i]);
            }
        }
        if (source.Details != null) {
            this.Details = new SpecificationDataItem[source.Details.length];
            for (int i = 0; i < source.Details.length; i++) {
                this.Details[i] = new SpecificationDataItem(source.Details[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamArrayObj(map, prefix + "Summary.", this.Summary);
        this.setParamArrayObj(map, prefix + "Details.", this.Details);

    }
}

