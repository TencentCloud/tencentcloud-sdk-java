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
    * 转自适应码流模板 ID。
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * 水印列表，支持多张图片或文字水印，最大可支持 10 张。
    */
    @SerializedName("WatermarkSet")
    @Expose
    private WatermarkInput [] WatermarkSet;

    /**
    * 转自适应码流后文件的目标存储，不填则继承上层的 OutputStorage 值。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OutputStorage")
    @Expose
    private TaskOutputStorage OutputStorage;

    /**
    * 转自适应码流后，manifest 文件的输出路径，可以为相对路径或者绝对路径。
若需定义输出路径，路径需以`.{format}`结尾。变量名请参考 [文件名变量说明](https://cloud.tencent.com/document/product/862/37039)。
相对路径示例：
<li>文件名_{变量名}.{format}</li>
<li>文件名.{format}</li>
绝对路径示例：
<li>/自定义路径/文件名_{变量名}.{format}</li>
如果不填，则默认为相对路径：{inputName}_adaptiveDynamicStreaming_{definition}.{format}。
    */
    @SerializedName("OutputObjectPath")
    @Expose
    private String OutputObjectPath;

    /**
    * 转自适应码流后，子流文件的输出路径，只能为相对路径。如果不填，则默认为相对路径：`{inputName}_adaptiveDynamicStreaming_{definition}_{subStreamNumber}.{format}`。
    */
    @SerializedName("SubStreamObjectName")
    @Expose
    private String SubStreamObjectName;

    /**
    * 转自适应码流（仅 HLS）后，分片文件的输出路径，只能为相对路径。如果不填，则默认为相对路径：`{inputName}_adaptiveDynamicStreaming_{definition}_{subStreamNumber}_{segmentNumber}.{format}`。
    */
    @SerializedName("SegmentObjectName")
    @Expose
    private String SegmentObjectName;

    /**
    * 外挂字幕功能，指定要插入的字幕文件。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AddOnSubtitles")
    @Expose
    private AddOnSubtitle [] AddOnSubtitles;

    /**
    * Drm信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DrmInfo")
    @Expose
    private DrmInfo DrmInfo;

    /**
    * 自适应转码模板类型：
Common：音视频类型
PureAudio：纯音频类型
    */
    @SerializedName("DefinitionType")
    @Expose
    private String DefinitionType;

    /**
    * 硬字幕（压制字幕）功能，指定字幕来源、字体大小、位置等字幕参数。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubtitleTemplate")
    @Expose
    private SubtitleTemplate SubtitleTemplate;

    /**
    * 转码参数扩展字段
    */
    @SerializedName("StdExtInfo")
    @Expose
    private String StdExtInfo;

    /**
     * Get 转自适应码流模板 ID。 
     * @return Definition 转自适应码流模板 ID。
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set 转自适应码流模板 ID。
     * @param Definition 转自适应码流模板 ID。
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get 水印列表，支持多张图片或文字水印，最大可支持 10 张。 
     * @return WatermarkSet 水印列表，支持多张图片或文字水印，最大可支持 10 张。
     */
    public WatermarkInput [] getWatermarkSet() {
        return this.WatermarkSet;
    }

    /**
     * Set 水印列表，支持多张图片或文字水印，最大可支持 10 张。
     * @param WatermarkSet 水印列表，支持多张图片或文字水印，最大可支持 10 张。
     */
    public void setWatermarkSet(WatermarkInput [] WatermarkSet) {
        this.WatermarkSet = WatermarkSet;
    }

    /**
     * Get 转自适应码流后文件的目标存储，不填则继承上层的 OutputStorage 值。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OutputStorage 转自适应码流后文件的目标存储，不填则继承上层的 OutputStorage 值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TaskOutputStorage getOutputStorage() {
        return this.OutputStorage;
    }

    /**
     * Set 转自适应码流后文件的目标存储，不填则继承上层的 OutputStorage 值。
注意：此字段可能返回 null，表示取不到有效值。
     * @param OutputStorage 转自适应码流后文件的目标存储，不填则继承上层的 OutputStorage 值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOutputStorage(TaskOutputStorage OutputStorage) {
        this.OutputStorage = OutputStorage;
    }

    /**
     * Get 转自适应码流后，manifest 文件的输出路径，可以为相对路径或者绝对路径。
若需定义输出路径，路径需以`.{format}`结尾。变量名请参考 [文件名变量说明](https://cloud.tencent.com/document/product/862/37039)。
相对路径示例：
<li>文件名_{变量名}.{format}</li>
<li>文件名.{format}</li>
绝对路径示例：
<li>/自定义路径/文件名_{变量名}.{format}</li>
如果不填，则默认为相对路径：{inputName}_adaptiveDynamicStreaming_{definition}.{format}。 
     * @return OutputObjectPath 转自适应码流后，manifest 文件的输出路径，可以为相对路径或者绝对路径。
若需定义输出路径，路径需以`.{format}`结尾。变量名请参考 [文件名变量说明](https://cloud.tencent.com/document/product/862/37039)。
相对路径示例：
<li>文件名_{变量名}.{format}</li>
<li>文件名.{format}</li>
绝对路径示例：
<li>/自定义路径/文件名_{变量名}.{format}</li>
如果不填，则默认为相对路径：{inputName}_adaptiveDynamicStreaming_{definition}.{format}。
     */
    public String getOutputObjectPath() {
        return this.OutputObjectPath;
    }

    /**
     * Set 转自适应码流后，manifest 文件的输出路径，可以为相对路径或者绝对路径。
若需定义输出路径，路径需以`.{format}`结尾。变量名请参考 [文件名变量说明](https://cloud.tencent.com/document/product/862/37039)。
相对路径示例：
<li>文件名_{变量名}.{format}</li>
<li>文件名.{format}</li>
绝对路径示例：
<li>/自定义路径/文件名_{变量名}.{format}</li>
如果不填，则默认为相对路径：{inputName}_adaptiveDynamicStreaming_{definition}.{format}。
     * @param OutputObjectPath 转自适应码流后，manifest 文件的输出路径，可以为相对路径或者绝对路径。
若需定义输出路径，路径需以`.{format}`结尾。变量名请参考 [文件名变量说明](https://cloud.tencent.com/document/product/862/37039)。
相对路径示例：
<li>文件名_{变量名}.{format}</li>
<li>文件名.{format}</li>
绝对路径示例：
<li>/自定义路径/文件名_{变量名}.{format}</li>
如果不填，则默认为相对路径：{inputName}_adaptiveDynamicStreaming_{definition}.{format}。
     */
    public void setOutputObjectPath(String OutputObjectPath) {
        this.OutputObjectPath = OutputObjectPath;
    }

    /**
     * Get 转自适应码流后，子流文件的输出路径，只能为相对路径。如果不填，则默认为相对路径：`{inputName}_adaptiveDynamicStreaming_{definition}_{subStreamNumber}.{format}`。 
     * @return SubStreamObjectName 转自适应码流后，子流文件的输出路径，只能为相对路径。如果不填，则默认为相对路径：`{inputName}_adaptiveDynamicStreaming_{definition}_{subStreamNumber}.{format}`。
     */
    public String getSubStreamObjectName() {
        return this.SubStreamObjectName;
    }

    /**
     * Set 转自适应码流后，子流文件的输出路径，只能为相对路径。如果不填，则默认为相对路径：`{inputName}_adaptiveDynamicStreaming_{definition}_{subStreamNumber}.{format}`。
     * @param SubStreamObjectName 转自适应码流后，子流文件的输出路径，只能为相对路径。如果不填，则默认为相对路径：`{inputName}_adaptiveDynamicStreaming_{definition}_{subStreamNumber}.{format}`。
     */
    public void setSubStreamObjectName(String SubStreamObjectName) {
        this.SubStreamObjectName = SubStreamObjectName;
    }

    /**
     * Get 转自适应码流（仅 HLS）后，分片文件的输出路径，只能为相对路径。如果不填，则默认为相对路径：`{inputName}_adaptiveDynamicStreaming_{definition}_{subStreamNumber}_{segmentNumber}.{format}`。 
     * @return SegmentObjectName 转自适应码流（仅 HLS）后，分片文件的输出路径，只能为相对路径。如果不填，则默认为相对路径：`{inputName}_adaptiveDynamicStreaming_{definition}_{subStreamNumber}_{segmentNumber}.{format}`。
     */
    public String getSegmentObjectName() {
        return this.SegmentObjectName;
    }

    /**
     * Set 转自适应码流（仅 HLS）后，分片文件的输出路径，只能为相对路径。如果不填，则默认为相对路径：`{inputName}_adaptiveDynamicStreaming_{definition}_{subStreamNumber}_{segmentNumber}.{format}`。
     * @param SegmentObjectName 转自适应码流（仅 HLS）后，分片文件的输出路径，只能为相对路径。如果不填，则默认为相对路径：`{inputName}_adaptiveDynamicStreaming_{definition}_{subStreamNumber}_{segmentNumber}.{format}`。
     */
    public void setSegmentObjectName(String SegmentObjectName) {
        this.SegmentObjectName = SegmentObjectName;
    }

    /**
     * Get 外挂字幕功能，指定要插入的字幕文件。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AddOnSubtitles 外挂字幕功能，指定要插入的字幕文件。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AddOnSubtitle [] getAddOnSubtitles() {
        return this.AddOnSubtitles;
    }

    /**
     * Set 外挂字幕功能，指定要插入的字幕文件。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AddOnSubtitles 外挂字幕功能，指定要插入的字幕文件。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAddOnSubtitles(AddOnSubtitle [] AddOnSubtitles) {
        this.AddOnSubtitles = AddOnSubtitles;
    }

    /**
     * Get Drm信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DrmInfo Drm信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DrmInfo getDrmInfo() {
        return this.DrmInfo;
    }

    /**
     * Set Drm信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param DrmInfo Drm信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDrmInfo(DrmInfo DrmInfo) {
        this.DrmInfo = DrmInfo;
    }

    /**
     * Get 自适应转码模板类型：
Common：音视频类型
PureAudio：纯音频类型 
     * @return DefinitionType 自适应转码模板类型：
Common：音视频类型
PureAudio：纯音频类型
     */
    public String getDefinitionType() {
        return this.DefinitionType;
    }

    /**
     * Set 自适应转码模板类型：
Common：音视频类型
PureAudio：纯音频类型
     * @param DefinitionType 自适应转码模板类型：
Common：音视频类型
PureAudio：纯音频类型
     */
    public void setDefinitionType(String DefinitionType) {
        this.DefinitionType = DefinitionType;
    }

    /**
     * Get 硬字幕（压制字幕）功能，指定字幕来源、字体大小、位置等字幕参数。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubtitleTemplate 硬字幕（压制字幕）功能，指定字幕来源、字体大小、位置等字幕参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SubtitleTemplate getSubtitleTemplate() {
        return this.SubtitleTemplate;
    }

    /**
     * Set 硬字幕（压制字幕）功能，指定字幕来源、字体大小、位置等字幕参数。
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubtitleTemplate 硬字幕（压制字幕）功能，指定字幕来源、字体大小、位置等字幕参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubtitleTemplate(SubtitleTemplate SubtitleTemplate) {
        this.SubtitleTemplate = SubtitleTemplate;
    }

    /**
     * Get 转码参数扩展字段 
     * @return StdExtInfo 转码参数扩展字段
     */
    public String getStdExtInfo() {
        return this.StdExtInfo;
    }

    /**
     * Set 转码参数扩展字段
     * @param StdExtInfo 转码参数扩展字段
     */
    public void setStdExtInfo(String StdExtInfo) {
        this.StdExtInfo = StdExtInfo;
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamArrayObj(map, prefix + "WatermarkSet.", this.WatermarkSet);
        this.setParamObj(map, prefix + "OutputStorage.", this.OutputStorage);
        this.setParamSimple(map, prefix + "OutputObjectPath", this.OutputObjectPath);
        this.setParamSimple(map, prefix + "SubStreamObjectName", this.SubStreamObjectName);
        this.setParamSimple(map, prefix + "SegmentObjectName", this.SegmentObjectName);
        this.setParamArrayObj(map, prefix + "AddOnSubtitles.", this.AddOnSubtitles);
        this.setParamObj(map, prefix + "DrmInfo.", this.DrmInfo);
        this.setParamSimple(map, prefix + "DefinitionType", this.DefinitionType);
        this.setParamObj(map, prefix + "SubtitleTemplate.", this.SubtitleTemplate);
        this.setParamSimple(map, prefix + "StdExtInfo", this.StdExtInfo);

    }
}

