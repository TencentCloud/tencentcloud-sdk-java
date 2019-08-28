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

public class AdaptiveDynamicStreamingTaskInput  extends AbstractModel{

    /**
    * 转自适应码流模板 ID。
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * 水印列表，支持多张图片或文字水印，最大可支持 10 张。
注意：此字段可能返回 null，表示取不到有效值。
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
    * 转自适应码流后，manifest 文件的输出路径，可以为相对路径或者绝对路径。如果不填，则默认为相对路径：`{inputName}_adaptiveDynamicStreaming_{definition}.{format}`。
    */
    @SerializedName("OutputObjectPath")
    @Expose
    private String OutputObjectPath;

    /**
    * 转自适应码流（HLS）后，二级 index 文件的输出路径，只能为相对路径。如果不填，则默认为相对路径：`{inputName}_adaptiveDynamicStreaming_{definition}_{trackType}_{trackDefinition}.{format}`。
    */
    @SerializedName("SubStreamManifestObjectName")
    @Expose
    private String SubStreamManifestObjectName;

    /**
    * 转自适应码流后，分片文件的输出路径，只能为相对路径。如果不填，则默认为相对路径：`{inputName}_adaptiveDynamicStreaming_{definition}_{trackType}_{trackDefinition}_{number}.{format}`。
    */
    @SerializedName("SegmentObjectName")
    @Expose
    private String SegmentObjectName;

    /**
    * 转自适应码流后输出路径中的`{number}`变量的规则。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ObjectNumberFormat")
    @Expose
    private NumberFormat ObjectNumberFormat;

    /**
     * 获取转自适应码流模板 ID。
     * @return Definition 转自适应码流模板 ID。
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * 设置转自适应码流模板 ID。
     * @param Definition 转自适应码流模板 ID。
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * 获取水印列表，支持多张图片或文字水印，最大可支持 10 张。
注意：此字段可能返回 null，表示取不到有效值。
     * @return WatermarkSet 水印列表，支持多张图片或文字水印，最大可支持 10 张。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public WatermarkInput [] getWatermarkSet() {
        return this.WatermarkSet;
    }

    /**
     * 设置水印列表，支持多张图片或文字水印，最大可支持 10 张。
注意：此字段可能返回 null，表示取不到有效值。
     * @param WatermarkSet 水印列表，支持多张图片或文字水印，最大可支持 10 张。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWatermarkSet(WatermarkInput [] WatermarkSet) {
        this.WatermarkSet = WatermarkSet;
    }

    /**
     * 获取转自适应码流后文件的目标存储，不填则继承上层的 OutputStorage 值。
注意：此字段可能返回 null，表示取不到有效值。
     * @return OutputStorage 转自适应码流后文件的目标存储，不填则继承上层的 OutputStorage 值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TaskOutputStorage getOutputStorage() {
        return this.OutputStorage;
    }

    /**
     * 设置转自适应码流后文件的目标存储，不填则继承上层的 OutputStorage 值。
注意：此字段可能返回 null，表示取不到有效值。
     * @param OutputStorage 转自适应码流后文件的目标存储，不填则继承上层的 OutputStorage 值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOutputStorage(TaskOutputStorage OutputStorage) {
        this.OutputStorage = OutputStorage;
    }

    /**
     * 获取转自适应码流后，manifest 文件的输出路径，可以为相对路径或者绝对路径。如果不填，则默认为相对路径：`{inputName}_adaptiveDynamicStreaming_{definition}.{format}`。
     * @return OutputObjectPath 转自适应码流后，manifest 文件的输出路径，可以为相对路径或者绝对路径。如果不填，则默认为相对路径：`{inputName}_adaptiveDynamicStreaming_{definition}.{format}`。
     */
    public String getOutputObjectPath() {
        return this.OutputObjectPath;
    }

    /**
     * 设置转自适应码流后，manifest 文件的输出路径，可以为相对路径或者绝对路径。如果不填，则默认为相对路径：`{inputName}_adaptiveDynamicStreaming_{definition}.{format}`。
     * @param OutputObjectPath 转自适应码流后，manifest 文件的输出路径，可以为相对路径或者绝对路径。如果不填，则默认为相对路径：`{inputName}_adaptiveDynamicStreaming_{definition}.{format}`。
     */
    public void setOutputObjectPath(String OutputObjectPath) {
        this.OutputObjectPath = OutputObjectPath;
    }

    /**
     * 获取转自适应码流（HLS）后，二级 index 文件的输出路径，只能为相对路径。如果不填，则默认为相对路径：`{inputName}_adaptiveDynamicStreaming_{definition}_{trackType}_{trackDefinition}.{format}`。
     * @return SubStreamManifestObjectName 转自适应码流（HLS）后，二级 index 文件的输出路径，只能为相对路径。如果不填，则默认为相对路径：`{inputName}_adaptiveDynamicStreaming_{definition}_{trackType}_{trackDefinition}.{format}`。
     */
    public String getSubStreamManifestObjectName() {
        return this.SubStreamManifestObjectName;
    }

    /**
     * 设置转自适应码流（HLS）后，二级 index 文件的输出路径，只能为相对路径。如果不填，则默认为相对路径：`{inputName}_adaptiveDynamicStreaming_{definition}_{trackType}_{trackDefinition}.{format}`。
     * @param SubStreamManifestObjectName 转自适应码流（HLS）后，二级 index 文件的输出路径，只能为相对路径。如果不填，则默认为相对路径：`{inputName}_adaptiveDynamicStreaming_{definition}_{trackType}_{trackDefinition}.{format}`。
     */
    public void setSubStreamManifestObjectName(String SubStreamManifestObjectName) {
        this.SubStreamManifestObjectName = SubStreamManifestObjectName;
    }

    /**
     * 获取转自适应码流后，分片文件的输出路径，只能为相对路径。如果不填，则默认为相对路径：`{inputName}_adaptiveDynamicStreaming_{definition}_{trackType}_{trackDefinition}_{number}.{format}`。
     * @return SegmentObjectName 转自适应码流后，分片文件的输出路径，只能为相对路径。如果不填，则默认为相对路径：`{inputName}_adaptiveDynamicStreaming_{definition}_{trackType}_{trackDefinition}_{number}.{format}`。
     */
    public String getSegmentObjectName() {
        return this.SegmentObjectName;
    }

    /**
     * 设置转自适应码流后，分片文件的输出路径，只能为相对路径。如果不填，则默认为相对路径：`{inputName}_adaptiveDynamicStreaming_{definition}_{trackType}_{trackDefinition}_{number}.{format}`。
     * @param SegmentObjectName 转自适应码流后，分片文件的输出路径，只能为相对路径。如果不填，则默认为相对路径：`{inputName}_adaptiveDynamicStreaming_{definition}_{trackType}_{trackDefinition}_{number}.{format}`。
     */
    public void setSegmentObjectName(String SegmentObjectName) {
        this.SegmentObjectName = SegmentObjectName;
    }

    /**
     * 获取转自适应码流后输出路径中的`{number}`变量的规则。
注意：此字段可能返回 null，表示取不到有效值。
     * @return ObjectNumberFormat 转自适应码流后输出路径中的`{number}`变量的规则。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public NumberFormat getObjectNumberFormat() {
        return this.ObjectNumberFormat;
    }

    /**
     * 设置转自适应码流后输出路径中的`{number}`变量的规则。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ObjectNumberFormat 转自适应码流后输出路径中的`{number}`变量的规则。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setObjectNumberFormat(NumberFormat ObjectNumberFormat) {
        this.ObjectNumberFormat = ObjectNumberFormat;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamArrayObj(map, prefix + "WatermarkSet.", this.WatermarkSet);
        this.setParamObj(map, prefix + "OutputStorage.", this.OutputStorage);
        this.setParamSimple(map, prefix + "OutputObjectPath", this.OutputObjectPath);
        this.setParamSimple(map, prefix + "SubStreamManifestObjectName", this.SubStreamManifestObjectName);
        this.setParamSimple(map, prefix + "SegmentObjectName", this.SegmentObjectName);
        this.setParamObj(map, prefix + "ObjectNumberFormat.", this.ObjectNumberFormat);

    }
}

