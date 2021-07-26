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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TranscodeTaskInput extends AbstractModel{

    /**
    * 视频转码模板 ID。
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * 视频转码自定义参数，当 Definition 填 0 时有效。
该参数用于高度定制场景，建议您优先使用 Definition 指定转码参数。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RawParameter")
    @Expose
    private RawTranscodeParameter RawParameter;

    /**
    * 视频转码自定义参数，当 Definition 不填 0 时有效。
当填写了该结构中的部分转码参数时，将使用填写的参数覆盖转码模板中的参数。
该参数用于高度定制场景，建议您仅使用 Definition 指定转码参数。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OverrideParameter")
    @Expose
    private OverrideTranscodeParameter OverrideParameter;

    /**
    * 水印列表，支持多张图片或文字水印，最大可支持 10 张。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WatermarkSet")
    @Expose
    private WatermarkInput [] WatermarkSet;

    /**
    * 马赛克列表，最大可支持 10 张。
    */
    @SerializedName("MosaicSet")
    @Expose
    private MosaicInput [] MosaicSet;

    /**
    * 转码后的视频的起始时间偏移，单位：秒。
<li>不填或填0，表示转码后的视频从原始视频的起始位置开始；</li>
<li>当数值大于0时（假设为 n），表示转码后的视频从原始视频的第 n 秒位置开始；</li>
<li>当数值小于0时（假设为 -n），表示转码后的视频从原始视频结束 n 秒前的位置开始。</li>
    */
    @SerializedName("StartTimeOffset")
    @Expose
    private Float StartTimeOffset;

    /**
    * 转码后视频的终止时间偏移，单位：秒。
<li>不填或填0，表示转码后的视频持续到原始视频的末尾终止；</li>
<li>当数值大于0时（假设为 n），表示转码后的视频持续到原始视频第 n 秒时终止；</li>
<li>当数值小于0时（假设为 -n），表示转码后的视频持续到原始视频结束 n 秒前终止。</li>
    */
    @SerializedName("EndTimeOffset")
    @Expose
    private Float EndTimeOffset;

    /**
    * 转码后文件的目标存储，不填则继承上层的 OutputStorage 值。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OutputStorage")
    @Expose
    private TaskOutputStorage OutputStorage;

    /**
    * 转码后主文件的输出路径，可以为相对路径或者绝对路径。如果不填，则默认为相对路径：`{inputName}_transcode_{definition}.{format}`。
    */
    @SerializedName("OutputObjectPath")
    @Expose
    private String OutputObjectPath;

    /**
    * 转码后分片文件的输出路径（转码 HLS 时 ts 的路径），只能为相对路径。如果不填，则默认为：`{inputName}_transcode_{definition}_{number}.{format}`。
    */
    @SerializedName("SegmentObjectName")
    @Expose
    private String SegmentObjectName;

    /**
    * 转码后输出路径中的`{number}`变量的规则。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ObjectNumberFormat")
    @Expose
    private NumberFormat ObjectNumberFormat;

    /**
    * 片头片尾参数。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HeadTailParameter")
    @Expose
    private HeadTailParameter HeadTailParameter;

    /**
     * Get 视频转码模板 ID。 
     * @return Definition 视频转码模板 ID。
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set 视频转码模板 ID。
     * @param Definition 视频转码模板 ID。
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get 视频转码自定义参数，当 Definition 填 0 时有效。
该参数用于高度定制场景，建议您优先使用 Definition 指定转码参数。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RawParameter 视频转码自定义参数，当 Definition 填 0 时有效。
该参数用于高度定制场景，建议您优先使用 Definition 指定转码参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RawTranscodeParameter getRawParameter() {
        return this.RawParameter;
    }

    /**
     * Set 视频转码自定义参数，当 Definition 填 0 时有效。
该参数用于高度定制场景，建议您优先使用 Definition 指定转码参数。
注意：此字段可能返回 null，表示取不到有效值。
     * @param RawParameter 视频转码自定义参数，当 Definition 填 0 时有效。
该参数用于高度定制场景，建议您优先使用 Definition 指定转码参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRawParameter(RawTranscodeParameter RawParameter) {
        this.RawParameter = RawParameter;
    }

    /**
     * Get 视频转码自定义参数，当 Definition 不填 0 时有效。
当填写了该结构中的部分转码参数时，将使用填写的参数覆盖转码模板中的参数。
该参数用于高度定制场景，建议您仅使用 Definition 指定转码参数。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OverrideParameter 视频转码自定义参数，当 Definition 不填 0 时有效。
当填写了该结构中的部分转码参数时，将使用填写的参数覆盖转码模板中的参数。
该参数用于高度定制场景，建议您仅使用 Definition 指定转码参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public OverrideTranscodeParameter getOverrideParameter() {
        return this.OverrideParameter;
    }

    /**
     * Set 视频转码自定义参数，当 Definition 不填 0 时有效。
当填写了该结构中的部分转码参数时，将使用填写的参数覆盖转码模板中的参数。
该参数用于高度定制场景，建议您仅使用 Definition 指定转码参数。
注意：此字段可能返回 null，表示取不到有效值。
     * @param OverrideParameter 视频转码自定义参数，当 Definition 不填 0 时有效。
当填写了该结构中的部分转码参数时，将使用填写的参数覆盖转码模板中的参数。
该参数用于高度定制场景，建议您仅使用 Definition 指定转码参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOverrideParameter(OverrideTranscodeParameter OverrideParameter) {
        this.OverrideParameter = OverrideParameter;
    }

    /**
     * Get 水印列表，支持多张图片或文字水印，最大可支持 10 张。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WatermarkSet 水印列表，支持多张图片或文字水印，最大可支持 10 张。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public WatermarkInput [] getWatermarkSet() {
        return this.WatermarkSet;
    }

    /**
     * Set 水印列表，支持多张图片或文字水印，最大可支持 10 张。
注意：此字段可能返回 null，表示取不到有效值。
     * @param WatermarkSet 水印列表，支持多张图片或文字水印，最大可支持 10 张。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWatermarkSet(WatermarkInput [] WatermarkSet) {
        this.WatermarkSet = WatermarkSet;
    }

    /**
     * Get 马赛克列表，最大可支持 10 张。 
     * @return MosaicSet 马赛克列表，最大可支持 10 张。
     */
    public MosaicInput [] getMosaicSet() {
        return this.MosaicSet;
    }

    /**
     * Set 马赛克列表，最大可支持 10 张。
     * @param MosaicSet 马赛克列表，最大可支持 10 张。
     */
    public void setMosaicSet(MosaicInput [] MosaicSet) {
        this.MosaicSet = MosaicSet;
    }

    /**
     * Get 转码后的视频的起始时间偏移，单位：秒。
<li>不填或填0，表示转码后的视频从原始视频的起始位置开始；</li>
<li>当数值大于0时（假设为 n），表示转码后的视频从原始视频的第 n 秒位置开始；</li>
<li>当数值小于0时（假设为 -n），表示转码后的视频从原始视频结束 n 秒前的位置开始。</li> 
     * @return StartTimeOffset 转码后的视频的起始时间偏移，单位：秒。
<li>不填或填0，表示转码后的视频从原始视频的起始位置开始；</li>
<li>当数值大于0时（假设为 n），表示转码后的视频从原始视频的第 n 秒位置开始；</li>
<li>当数值小于0时（假设为 -n），表示转码后的视频从原始视频结束 n 秒前的位置开始。</li>
     */
    public Float getStartTimeOffset() {
        return this.StartTimeOffset;
    }

    /**
     * Set 转码后的视频的起始时间偏移，单位：秒。
<li>不填或填0，表示转码后的视频从原始视频的起始位置开始；</li>
<li>当数值大于0时（假设为 n），表示转码后的视频从原始视频的第 n 秒位置开始；</li>
<li>当数值小于0时（假设为 -n），表示转码后的视频从原始视频结束 n 秒前的位置开始。</li>
     * @param StartTimeOffset 转码后的视频的起始时间偏移，单位：秒。
<li>不填或填0，表示转码后的视频从原始视频的起始位置开始；</li>
<li>当数值大于0时（假设为 n），表示转码后的视频从原始视频的第 n 秒位置开始；</li>
<li>当数值小于0时（假设为 -n），表示转码后的视频从原始视频结束 n 秒前的位置开始。</li>
     */
    public void setStartTimeOffset(Float StartTimeOffset) {
        this.StartTimeOffset = StartTimeOffset;
    }

    /**
     * Get 转码后视频的终止时间偏移，单位：秒。
<li>不填或填0，表示转码后的视频持续到原始视频的末尾终止；</li>
<li>当数值大于0时（假设为 n），表示转码后的视频持续到原始视频第 n 秒时终止；</li>
<li>当数值小于0时（假设为 -n），表示转码后的视频持续到原始视频结束 n 秒前终止。</li> 
     * @return EndTimeOffset 转码后视频的终止时间偏移，单位：秒。
<li>不填或填0，表示转码后的视频持续到原始视频的末尾终止；</li>
<li>当数值大于0时（假设为 n），表示转码后的视频持续到原始视频第 n 秒时终止；</li>
<li>当数值小于0时（假设为 -n），表示转码后的视频持续到原始视频结束 n 秒前终止。</li>
     */
    public Float getEndTimeOffset() {
        return this.EndTimeOffset;
    }

    /**
     * Set 转码后视频的终止时间偏移，单位：秒。
<li>不填或填0，表示转码后的视频持续到原始视频的末尾终止；</li>
<li>当数值大于0时（假设为 n），表示转码后的视频持续到原始视频第 n 秒时终止；</li>
<li>当数值小于0时（假设为 -n），表示转码后的视频持续到原始视频结束 n 秒前终止。</li>
     * @param EndTimeOffset 转码后视频的终止时间偏移，单位：秒。
<li>不填或填0，表示转码后的视频持续到原始视频的末尾终止；</li>
<li>当数值大于0时（假设为 n），表示转码后的视频持续到原始视频第 n 秒时终止；</li>
<li>当数值小于0时（假设为 -n），表示转码后的视频持续到原始视频结束 n 秒前终止。</li>
     */
    public void setEndTimeOffset(Float EndTimeOffset) {
        this.EndTimeOffset = EndTimeOffset;
    }

    /**
     * Get 转码后文件的目标存储，不填则继承上层的 OutputStorage 值。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OutputStorage 转码后文件的目标存储，不填则继承上层的 OutputStorage 值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TaskOutputStorage getOutputStorage() {
        return this.OutputStorage;
    }

    /**
     * Set 转码后文件的目标存储，不填则继承上层的 OutputStorage 值。
注意：此字段可能返回 null，表示取不到有效值。
     * @param OutputStorage 转码后文件的目标存储，不填则继承上层的 OutputStorage 值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOutputStorage(TaskOutputStorage OutputStorage) {
        this.OutputStorage = OutputStorage;
    }

    /**
     * Get 转码后主文件的输出路径，可以为相对路径或者绝对路径。如果不填，则默认为相对路径：`{inputName}_transcode_{definition}.{format}`。 
     * @return OutputObjectPath 转码后主文件的输出路径，可以为相对路径或者绝对路径。如果不填，则默认为相对路径：`{inputName}_transcode_{definition}.{format}`。
     */
    public String getOutputObjectPath() {
        return this.OutputObjectPath;
    }

    /**
     * Set 转码后主文件的输出路径，可以为相对路径或者绝对路径。如果不填，则默认为相对路径：`{inputName}_transcode_{definition}.{format}`。
     * @param OutputObjectPath 转码后主文件的输出路径，可以为相对路径或者绝对路径。如果不填，则默认为相对路径：`{inputName}_transcode_{definition}.{format}`。
     */
    public void setOutputObjectPath(String OutputObjectPath) {
        this.OutputObjectPath = OutputObjectPath;
    }

    /**
     * Get 转码后分片文件的输出路径（转码 HLS 时 ts 的路径），只能为相对路径。如果不填，则默认为：`{inputName}_transcode_{definition}_{number}.{format}`。 
     * @return SegmentObjectName 转码后分片文件的输出路径（转码 HLS 时 ts 的路径），只能为相对路径。如果不填，则默认为：`{inputName}_transcode_{definition}_{number}.{format}`。
     */
    public String getSegmentObjectName() {
        return this.SegmentObjectName;
    }

    /**
     * Set 转码后分片文件的输出路径（转码 HLS 时 ts 的路径），只能为相对路径。如果不填，则默认为：`{inputName}_transcode_{definition}_{number}.{format}`。
     * @param SegmentObjectName 转码后分片文件的输出路径（转码 HLS 时 ts 的路径），只能为相对路径。如果不填，则默认为：`{inputName}_transcode_{definition}_{number}.{format}`。
     */
    public void setSegmentObjectName(String SegmentObjectName) {
        this.SegmentObjectName = SegmentObjectName;
    }

    /**
     * Get 转码后输出路径中的`{number}`变量的规则。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ObjectNumberFormat 转码后输出路径中的`{number}`变量的规则。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public NumberFormat getObjectNumberFormat() {
        return this.ObjectNumberFormat;
    }

    /**
     * Set 转码后输出路径中的`{number}`变量的规则。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ObjectNumberFormat 转码后输出路径中的`{number}`变量的规则。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setObjectNumberFormat(NumberFormat ObjectNumberFormat) {
        this.ObjectNumberFormat = ObjectNumberFormat;
    }

    /**
     * Get 片头片尾参数。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HeadTailParameter 片头片尾参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public HeadTailParameter getHeadTailParameter() {
        return this.HeadTailParameter;
    }

    /**
     * Set 片头片尾参数。
注意：此字段可能返回 null，表示取不到有效值。
     * @param HeadTailParameter 片头片尾参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHeadTailParameter(HeadTailParameter HeadTailParameter) {
        this.HeadTailParameter = HeadTailParameter;
    }

    public TranscodeTaskInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TranscodeTaskInput(TranscodeTaskInput source) {
        if (source.Definition != null) {
            this.Definition = new Long(source.Definition);
        }
        if (source.RawParameter != null) {
            this.RawParameter = new RawTranscodeParameter(source.RawParameter);
        }
        if (source.OverrideParameter != null) {
            this.OverrideParameter = new OverrideTranscodeParameter(source.OverrideParameter);
        }
        if (source.WatermarkSet != null) {
            this.WatermarkSet = new WatermarkInput[source.WatermarkSet.length];
            for (int i = 0; i < source.WatermarkSet.length; i++) {
                this.WatermarkSet[i] = new WatermarkInput(source.WatermarkSet[i]);
            }
        }
        if (source.MosaicSet != null) {
            this.MosaicSet = new MosaicInput[source.MosaicSet.length];
            for (int i = 0; i < source.MosaicSet.length; i++) {
                this.MosaicSet[i] = new MosaicInput(source.MosaicSet[i]);
            }
        }
        if (source.StartTimeOffset != null) {
            this.StartTimeOffset = new Float(source.StartTimeOffset);
        }
        if (source.EndTimeOffset != null) {
            this.EndTimeOffset = new Float(source.EndTimeOffset);
        }
        if (source.OutputStorage != null) {
            this.OutputStorage = new TaskOutputStorage(source.OutputStorage);
        }
        if (source.OutputObjectPath != null) {
            this.OutputObjectPath = new String(source.OutputObjectPath);
        }
        if (source.SegmentObjectName != null) {
            this.SegmentObjectName = new String(source.SegmentObjectName);
        }
        if (source.ObjectNumberFormat != null) {
            this.ObjectNumberFormat = new NumberFormat(source.ObjectNumberFormat);
        }
        if (source.HeadTailParameter != null) {
            this.HeadTailParameter = new HeadTailParameter(source.HeadTailParameter);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamObj(map, prefix + "RawParameter.", this.RawParameter);
        this.setParamObj(map, prefix + "OverrideParameter.", this.OverrideParameter);
        this.setParamArrayObj(map, prefix + "WatermarkSet.", this.WatermarkSet);
        this.setParamArrayObj(map, prefix + "MosaicSet.", this.MosaicSet);
        this.setParamSimple(map, prefix + "StartTimeOffset", this.StartTimeOffset);
        this.setParamSimple(map, prefix + "EndTimeOffset", this.EndTimeOffset);
        this.setParamObj(map, prefix + "OutputStorage.", this.OutputStorage);
        this.setParamSimple(map, prefix + "OutputObjectPath", this.OutputObjectPath);
        this.setParamSimple(map, prefix + "SegmentObjectName", this.SegmentObjectName);
        this.setParamObj(map, prefix + "ObjectNumberFormat.", this.ObjectNumberFormat);
        this.setParamObj(map, prefix + "HeadTailParameter.", this.HeadTailParameter);

    }
}

