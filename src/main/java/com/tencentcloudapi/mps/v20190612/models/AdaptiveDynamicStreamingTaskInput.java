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

public class AdaptiveDynamicStreamingTaskInput extends AbstractModel {

    /**
    * <p>转自适应码流模板 ID。</p>
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * <p>水印列表，支持多张图片或文字水印，最大可支持 10 张。</p>
    */
    @SerializedName("WatermarkSet")
    @Expose
    private WatermarkInput [] WatermarkSet;

    /**
    * <p>数字水印参数</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BlindWatermark")
    @Expose
    private BlindWatermarkInput BlindWatermark;

    /**
    * <p>转自适应码流后文件的目标存储，不填则继承上层的 OutputStorage 值。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OutputStorage")
    @Expose
    private TaskOutputStorage OutputStorage;

    /**
    * <p>转自适应码流后，manifest 文件的输出路径，可以为相对路径或者绝对路径。<br>若需定义输出路径，路径需以<code>.{format}</code>结尾。变量名请参考 <a href="https://cloud.tencent.com/document/product/862/37039">文件名变量说明</a>。<br>相对路径示例：</p><li>文件名_{变量名}.{format}</li><li>文件名.{format}</li>绝对路径示例：<li>/自定义路径/文件名_{变量名}.{format}</li>如果不填，则默认为相对路径：{inputName}_adaptiveDynamicStreaming_{definition}.{format}。
    */
    @SerializedName("OutputObjectPath")
    @Expose
    private String OutputObjectPath;

    /**
    * <p>转自适应码流后，子流文件的输出路径，只能为相对路径。如果不填，则默认为相对路径：<code>{inputName}_adaptiveDynamicStreaming_{definition}_{subStreamNumber}.{format}</code>。</p>
    */
    @SerializedName("SubStreamObjectName")
    @Expose
    private String SubStreamObjectName;

    /**
    * <p>转自适应码流（仅 HLS）后，分片文件的输出路径，只能为相对路径。如果不填，则默认为相对路径：<code>{inputName}_adaptiveDynamicStreaming_{definition}_{subStreamNumber}_{segmentNumber}.{format}</code>。</p>
    */
    @SerializedName("SegmentObjectName")
    @Expose
    private String SegmentObjectName;

    /**
    * <p>外挂字幕功能，指定要插入的字幕文件。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AddOnSubtitles")
    @Expose
    private AddOnSubtitle [] AddOnSubtitles;

    /**
    * <p>Drm信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DrmInfo")
    @Expose
    private DrmInfo DrmInfo;

    /**
    * <p>自适应转码模板类型：<br>Common：音视频类型<br>PureAudio：纯音频类型</p>
    */
    @SerializedName("DefinitionType")
    @Expose
    private String DefinitionType;

    /**
    * <p>硬字幕（压制字幕）功能，指定字幕来源、字体大小、位置等字幕参数。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubtitleTemplate")
    @Expose
    private SubtitleTemplate SubtitleTemplate;

    /**
    * <p>转码参数扩展字段</p>
    */
    @SerializedName("StdExtInfo")
    @Expose
    private String StdExtInfo;

    /**
    * <p>指定pts时间的帧设为关键帧，并切片。单位毫秒（允许相对偏差&lt;=1ms）。当同时指定gop和切片时长时，会共同作用。注意需开启RawPts，保持帧率随源，并确保传入的pts时间在源中是有对应帧的。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("KeyPTSList")
    @Expose
    private Long [] KeyPTSList;

    /**
    * <p>外挂音频功能，指定要插入的音频文件。</p>
    */
    @SerializedName("AddOnAudios")
    @Expose
    private AddOnAudio [] AddOnAudios;

    /**
    * <p>非空时直接替换模板的 StreamInfos 字段，字段格式与创建自适应模板时的 StreamInfos 完全一致</p>
    */
    @SerializedName("StdExtStreamInfos")
    @Expose
    private AdaptiveStreamTemplate [] StdExtStreamInfos;

    /**
     * Get <p>转自适应码流模板 ID。</p> 
     * @return Definition <p>转自适应码流模板 ID。</p>
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set <p>转自适应码流模板 ID。</p>
     * @param Definition <p>转自适应码流模板 ID。</p>
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get <p>水印列表，支持多张图片或文字水印，最大可支持 10 张。</p> 
     * @return WatermarkSet <p>水印列表，支持多张图片或文字水印，最大可支持 10 张。</p>
     */
    public WatermarkInput [] getWatermarkSet() {
        return this.WatermarkSet;
    }

    /**
     * Set <p>水印列表，支持多张图片或文字水印，最大可支持 10 张。</p>
     * @param WatermarkSet <p>水印列表，支持多张图片或文字水印，最大可支持 10 张。</p>
     */
    public void setWatermarkSet(WatermarkInput [] WatermarkSet) {
        this.WatermarkSet = WatermarkSet;
    }

    /**
     * Get <p>数字水印参数</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BlindWatermark <p>数字水印参数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BlindWatermarkInput getBlindWatermark() {
        return this.BlindWatermark;
    }

    /**
     * Set <p>数字水印参数</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BlindWatermark <p>数字水印参数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBlindWatermark(BlindWatermarkInput BlindWatermark) {
        this.BlindWatermark = BlindWatermark;
    }

    /**
     * Get <p>转自适应码流后文件的目标存储，不填则继承上层的 OutputStorage 值。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OutputStorage <p>转自适应码流后文件的目标存储，不填则继承上层的 OutputStorage 值。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TaskOutputStorage getOutputStorage() {
        return this.OutputStorage;
    }

    /**
     * Set <p>转自适应码流后文件的目标存储，不填则继承上层的 OutputStorage 值。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param OutputStorage <p>转自适应码流后文件的目标存储，不填则继承上层的 OutputStorage 值。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOutputStorage(TaskOutputStorage OutputStorage) {
        this.OutputStorage = OutputStorage;
    }

    /**
     * Get <p>转自适应码流后，manifest 文件的输出路径，可以为相对路径或者绝对路径。<br>若需定义输出路径，路径需以<code>.{format}</code>结尾。变量名请参考 <a href="https://cloud.tencent.com/document/product/862/37039">文件名变量说明</a>。<br>相对路径示例：</p><li>文件名_{变量名}.{format}</li><li>文件名.{format}</li>绝对路径示例：<li>/自定义路径/文件名_{变量名}.{format}</li>如果不填，则默认为相对路径：{inputName}_adaptiveDynamicStreaming_{definition}.{format}。 
     * @return OutputObjectPath <p>转自适应码流后，manifest 文件的输出路径，可以为相对路径或者绝对路径。<br>若需定义输出路径，路径需以<code>.{format}</code>结尾。变量名请参考 <a href="https://cloud.tencent.com/document/product/862/37039">文件名变量说明</a>。<br>相对路径示例：</p><li>文件名_{变量名}.{format}</li><li>文件名.{format}</li>绝对路径示例：<li>/自定义路径/文件名_{变量名}.{format}</li>如果不填，则默认为相对路径：{inputName}_adaptiveDynamicStreaming_{definition}.{format}。
     */
    public String getOutputObjectPath() {
        return this.OutputObjectPath;
    }

    /**
     * Set <p>转自适应码流后，manifest 文件的输出路径，可以为相对路径或者绝对路径。<br>若需定义输出路径，路径需以<code>.{format}</code>结尾。变量名请参考 <a href="https://cloud.tencent.com/document/product/862/37039">文件名变量说明</a>。<br>相对路径示例：</p><li>文件名_{变量名}.{format}</li><li>文件名.{format}</li>绝对路径示例：<li>/自定义路径/文件名_{变量名}.{format}</li>如果不填，则默认为相对路径：{inputName}_adaptiveDynamicStreaming_{definition}.{format}。
     * @param OutputObjectPath <p>转自适应码流后，manifest 文件的输出路径，可以为相对路径或者绝对路径。<br>若需定义输出路径，路径需以<code>.{format}</code>结尾。变量名请参考 <a href="https://cloud.tencent.com/document/product/862/37039">文件名变量说明</a>。<br>相对路径示例：</p><li>文件名_{变量名}.{format}</li><li>文件名.{format}</li>绝对路径示例：<li>/自定义路径/文件名_{变量名}.{format}</li>如果不填，则默认为相对路径：{inputName}_adaptiveDynamicStreaming_{definition}.{format}。
     */
    public void setOutputObjectPath(String OutputObjectPath) {
        this.OutputObjectPath = OutputObjectPath;
    }

    /**
     * Get <p>转自适应码流后，子流文件的输出路径，只能为相对路径。如果不填，则默认为相对路径：<code>{inputName}_adaptiveDynamicStreaming_{definition}_{subStreamNumber}.{format}</code>。</p> 
     * @return SubStreamObjectName <p>转自适应码流后，子流文件的输出路径，只能为相对路径。如果不填，则默认为相对路径：<code>{inputName}_adaptiveDynamicStreaming_{definition}_{subStreamNumber}.{format}</code>。</p>
     */
    public String getSubStreamObjectName() {
        return this.SubStreamObjectName;
    }

    /**
     * Set <p>转自适应码流后，子流文件的输出路径，只能为相对路径。如果不填，则默认为相对路径：<code>{inputName}_adaptiveDynamicStreaming_{definition}_{subStreamNumber}.{format}</code>。</p>
     * @param SubStreamObjectName <p>转自适应码流后，子流文件的输出路径，只能为相对路径。如果不填，则默认为相对路径：<code>{inputName}_adaptiveDynamicStreaming_{definition}_{subStreamNumber}.{format}</code>。</p>
     */
    public void setSubStreamObjectName(String SubStreamObjectName) {
        this.SubStreamObjectName = SubStreamObjectName;
    }

    /**
     * Get <p>转自适应码流（仅 HLS）后，分片文件的输出路径，只能为相对路径。如果不填，则默认为相对路径：<code>{inputName}_adaptiveDynamicStreaming_{definition}_{subStreamNumber}_{segmentNumber}.{format}</code>。</p> 
     * @return SegmentObjectName <p>转自适应码流（仅 HLS）后，分片文件的输出路径，只能为相对路径。如果不填，则默认为相对路径：<code>{inputName}_adaptiveDynamicStreaming_{definition}_{subStreamNumber}_{segmentNumber}.{format}</code>。</p>
     */
    public String getSegmentObjectName() {
        return this.SegmentObjectName;
    }

    /**
     * Set <p>转自适应码流（仅 HLS）后，分片文件的输出路径，只能为相对路径。如果不填，则默认为相对路径：<code>{inputName}_adaptiveDynamicStreaming_{definition}_{subStreamNumber}_{segmentNumber}.{format}</code>。</p>
     * @param SegmentObjectName <p>转自适应码流（仅 HLS）后，分片文件的输出路径，只能为相对路径。如果不填，则默认为相对路径：<code>{inputName}_adaptiveDynamicStreaming_{definition}_{subStreamNumber}_{segmentNumber}.{format}</code>。</p>
     */
    public void setSegmentObjectName(String SegmentObjectName) {
        this.SegmentObjectName = SegmentObjectName;
    }

    /**
     * Get <p>外挂字幕功能，指定要插入的字幕文件。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AddOnSubtitles <p>外挂字幕功能，指定要插入的字幕文件。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AddOnSubtitle [] getAddOnSubtitles() {
        return this.AddOnSubtitles;
    }

    /**
     * Set <p>外挂字幕功能，指定要插入的字幕文件。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AddOnSubtitles <p>外挂字幕功能，指定要插入的字幕文件。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAddOnSubtitles(AddOnSubtitle [] AddOnSubtitles) {
        this.AddOnSubtitles = AddOnSubtitles;
    }

    /**
     * Get <p>Drm信息。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DrmInfo <p>Drm信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DrmInfo getDrmInfo() {
        return this.DrmInfo;
    }

    /**
     * Set <p>Drm信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DrmInfo <p>Drm信息。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDrmInfo(DrmInfo DrmInfo) {
        this.DrmInfo = DrmInfo;
    }

    /**
     * Get <p>自适应转码模板类型：<br>Common：音视频类型<br>PureAudio：纯音频类型</p> 
     * @return DefinitionType <p>自适应转码模板类型：<br>Common：音视频类型<br>PureAudio：纯音频类型</p>
     */
    public String getDefinitionType() {
        return this.DefinitionType;
    }

    /**
     * Set <p>自适应转码模板类型：<br>Common：音视频类型<br>PureAudio：纯音频类型</p>
     * @param DefinitionType <p>自适应转码模板类型：<br>Common：音视频类型<br>PureAudio：纯音频类型</p>
     */
    public void setDefinitionType(String DefinitionType) {
        this.DefinitionType = DefinitionType;
    }

    /**
     * Get <p>硬字幕（压制字幕）功能，指定字幕来源、字体大小、位置等字幕参数。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubtitleTemplate <p>硬字幕（压制字幕）功能，指定字幕来源、字体大小、位置等字幕参数。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SubtitleTemplate getSubtitleTemplate() {
        return this.SubtitleTemplate;
    }

    /**
     * Set <p>硬字幕（压制字幕）功能，指定字幕来源、字体大小、位置等字幕参数。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubtitleTemplate <p>硬字幕（压制字幕）功能，指定字幕来源、字体大小、位置等字幕参数。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubtitleTemplate(SubtitleTemplate SubtitleTemplate) {
        this.SubtitleTemplate = SubtitleTemplate;
    }

    /**
     * Get <p>转码参数扩展字段</p> 
     * @return StdExtInfo <p>转码参数扩展字段</p>
     */
    public String getStdExtInfo() {
        return this.StdExtInfo;
    }

    /**
     * Set <p>转码参数扩展字段</p>
     * @param StdExtInfo <p>转码参数扩展字段</p>
     */
    public void setStdExtInfo(String StdExtInfo) {
        this.StdExtInfo = StdExtInfo;
    }

    /**
     * Get <p>指定pts时间的帧设为关键帧，并切片。单位毫秒（允许相对偏差&lt;=1ms）。当同时指定gop和切片时长时，会共同作用。注意需开启RawPts，保持帧率随源，并确保传入的pts时间在源中是有对应帧的。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return KeyPTSList <p>指定pts时间的帧设为关键帧，并切片。单位毫秒（允许相对偏差&lt;=1ms）。当同时指定gop和切片时长时，会共同作用。注意需开启RawPts，保持帧率随源，并确保传入的pts时间在源中是有对应帧的。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long [] getKeyPTSList() {
        return this.KeyPTSList;
    }

    /**
     * Set <p>指定pts时间的帧设为关键帧，并切片。单位毫秒（允许相对偏差&lt;=1ms）。当同时指定gop和切片时长时，会共同作用。注意需开启RawPts，保持帧率随源，并确保传入的pts时间在源中是有对应帧的。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param KeyPTSList <p>指定pts时间的帧设为关键帧，并切片。单位毫秒（允许相对偏差&lt;=1ms）。当同时指定gop和切片时长时，会共同作用。注意需开启RawPts，保持帧率随源，并确保传入的pts时间在源中是有对应帧的。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKeyPTSList(Long [] KeyPTSList) {
        this.KeyPTSList = KeyPTSList;
    }

    /**
     * Get <p>外挂音频功能，指定要插入的音频文件。</p> 
     * @return AddOnAudios <p>外挂音频功能，指定要插入的音频文件。</p>
     */
    public AddOnAudio [] getAddOnAudios() {
        return this.AddOnAudios;
    }

    /**
     * Set <p>外挂音频功能，指定要插入的音频文件。</p>
     * @param AddOnAudios <p>外挂音频功能，指定要插入的音频文件。</p>
     */
    public void setAddOnAudios(AddOnAudio [] AddOnAudios) {
        this.AddOnAudios = AddOnAudios;
    }

    /**
     * Get <p>非空时直接替换模板的 StreamInfos 字段，字段格式与创建自适应模板时的 StreamInfos 完全一致</p> 
     * @return StdExtStreamInfos <p>非空时直接替换模板的 StreamInfos 字段，字段格式与创建自适应模板时的 StreamInfos 完全一致</p>
     */
    public AdaptiveStreamTemplate [] getStdExtStreamInfos() {
        return this.StdExtStreamInfos;
    }

    /**
     * Set <p>非空时直接替换模板的 StreamInfos 字段，字段格式与创建自适应模板时的 StreamInfos 完全一致</p>
     * @param StdExtStreamInfos <p>非空时直接替换模板的 StreamInfos 字段，字段格式与创建自适应模板时的 StreamInfos 完全一致</p>
     */
    public void setStdExtStreamInfos(AdaptiveStreamTemplate [] StdExtStreamInfos) {
        this.StdExtStreamInfos = StdExtStreamInfos;
    }

    public AdaptiveDynamicStreamingTaskInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AdaptiveDynamicStreamingTaskInput(AdaptiveDynamicStreamingTaskInput source) {
        if (source.Definition != null) {
            this.Definition = new Long(source.Definition);
        }
        if (source.WatermarkSet != null) {
            this.WatermarkSet = new WatermarkInput[source.WatermarkSet.length];
            for (int i = 0; i < source.WatermarkSet.length; i++) {
                this.WatermarkSet[i] = new WatermarkInput(source.WatermarkSet[i]);
            }
        }
        if (source.BlindWatermark != null) {
            this.BlindWatermark = new BlindWatermarkInput(source.BlindWatermark);
        }
        if (source.OutputStorage != null) {
            this.OutputStorage = new TaskOutputStorage(source.OutputStorage);
        }
        if (source.OutputObjectPath != null) {
            this.OutputObjectPath = new String(source.OutputObjectPath);
        }
        if (source.SubStreamObjectName != null) {
            this.SubStreamObjectName = new String(source.SubStreamObjectName);
        }
        if (source.SegmentObjectName != null) {
            this.SegmentObjectName = new String(source.SegmentObjectName);
        }
        if (source.AddOnSubtitles != null) {
            this.AddOnSubtitles = new AddOnSubtitle[source.AddOnSubtitles.length];
            for (int i = 0; i < source.AddOnSubtitles.length; i++) {
                this.AddOnSubtitles[i] = new AddOnSubtitle(source.AddOnSubtitles[i]);
            }
        }
        if (source.DrmInfo != null) {
            this.DrmInfo = new DrmInfo(source.DrmInfo);
        }
        if (source.DefinitionType != null) {
            this.DefinitionType = new String(source.DefinitionType);
        }
        if (source.SubtitleTemplate != null) {
            this.SubtitleTemplate = new SubtitleTemplate(source.SubtitleTemplate);
        }
        if (source.StdExtInfo != null) {
            this.StdExtInfo = new String(source.StdExtInfo);
        }
        if (source.KeyPTSList != null) {
            this.KeyPTSList = new Long[source.KeyPTSList.length];
            for (int i = 0; i < source.KeyPTSList.length; i++) {
                this.KeyPTSList[i] = new Long(source.KeyPTSList[i]);
            }
        }
        if (source.AddOnAudios != null) {
            this.AddOnAudios = new AddOnAudio[source.AddOnAudios.length];
            for (int i = 0; i < source.AddOnAudios.length; i++) {
                this.AddOnAudios[i] = new AddOnAudio(source.AddOnAudios[i]);
            }
        }
        if (source.StdExtStreamInfos != null) {
            this.StdExtStreamInfos = new AdaptiveStreamTemplate[source.StdExtStreamInfos.length];
            for (int i = 0; i < source.StdExtStreamInfos.length; i++) {
                this.StdExtStreamInfos[i] = new AdaptiveStreamTemplate(source.StdExtStreamInfos[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamArrayObj(map, prefix + "WatermarkSet.", this.WatermarkSet);
        this.setParamObj(map, prefix + "BlindWatermark.", this.BlindWatermark);
        this.setParamObj(map, prefix + "OutputStorage.", this.OutputStorage);
        this.setParamSimple(map, prefix + "OutputObjectPath", this.OutputObjectPath);
        this.setParamSimple(map, prefix + "SubStreamObjectName", this.SubStreamObjectName);
        this.setParamSimple(map, prefix + "SegmentObjectName", this.SegmentObjectName);
        this.setParamArrayObj(map, prefix + "AddOnSubtitles.", this.AddOnSubtitles);
        this.setParamObj(map, prefix + "DrmInfo.", this.DrmInfo);
        this.setParamSimple(map, prefix + "DefinitionType", this.DefinitionType);
        this.setParamObj(map, prefix + "SubtitleTemplate.", this.SubtitleTemplate);
        this.setParamSimple(map, prefix + "StdExtInfo", this.StdExtInfo);
        this.setParamArraySimple(map, prefix + "KeyPTSList.", this.KeyPTSList);
        this.setParamArrayObj(map, prefix + "AddOnAudios.", this.AddOnAudios);
        this.setParamArrayObj(map, prefix + "StdExtStreamInfos.", this.StdExtStreamInfos);

    }
}

