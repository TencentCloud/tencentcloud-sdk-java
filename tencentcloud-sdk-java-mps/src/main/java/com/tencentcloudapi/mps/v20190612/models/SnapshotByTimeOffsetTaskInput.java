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

public class SnapshotByTimeOffsetTaskInput extends AbstractModel{

    /**
    * 指定时间点截图模板 ID。
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * 截图时间点列表，时间点支持 s、% 两种格式：
<li>当字符串以 s 结尾，表示时间点单位为秒，如 3.5s 表示时间点为第3.5秒；</li>
<li>当字符串以 % 结尾，表示时间点为视频时长的百分比大小，如10%表示时间点为视频前第10%的时间。</li>
    */
    @SerializedName("ExtTimeOffsetSet")
    @Expose
    private String [] ExtTimeOffsetSet;

    /**
    * 截图时间点列表，单位为<font color=red>秒</font>。此参数已不再建议使用，建议您使用 ExtTimeOffsetSet 参数。
    */
    @SerializedName("TimeOffsetSet")
    @Expose
    private Float [] TimeOffsetSet;

    /**
    * 水印列表，支持多张图片或文字水印，最大可支持 10 张。
    */
    @SerializedName("WatermarkSet")
    @Expose
    private WatermarkInput [] WatermarkSet;

    /**
    * 时间点截图后文件的目标存储，不填则继承上层的 OutputStorage 值。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OutputStorage")
    @Expose
    private TaskOutputStorage OutputStorage;

    /**
    * 时间点截图后图片文件的输出路径，可以为相对路径或者绝对路径。如果不填，则默认为相对路径：`{inputName}_snapshotByTimeOffset_{definition}_{number}.{format}`。
    */
    @SerializedName("OutputObjectPath")
    @Expose
    private String OutputObjectPath;

    /**
    * 时间点截图后输出路径中的`{number}`变量的规则。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ObjectNumberFormat")
    @Expose
    private NumberFormat ObjectNumberFormat;

    /**
     * Get 指定时间点截图模板 ID。 
     * @return Definition 指定时间点截图模板 ID。
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set 指定时间点截图模板 ID。
     * @param Definition 指定时间点截图模板 ID。
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get 截图时间点列表，时间点支持 s、% 两种格式：
<li>当字符串以 s 结尾，表示时间点单位为秒，如 3.5s 表示时间点为第3.5秒；</li>
<li>当字符串以 % 结尾，表示时间点为视频时长的百分比大小，如10%表示时间点为视频前第10%的时间。</li> 
     * @return ExtTimeOffsetSet 截图时间点列表，时间点支持 s、% 两种格式：
<li>当字符串以 s 结尾，表示时间点单位为秒，如 3.5s 表示时间点为第3.5秒；</li>
<li>当字符串以 % 结尾，表示时间点为视频时长的百分比大小，如10%表示时间点为视频前第10%的时间。</li>
     */
    public String [] getExtTimeOffsetSet() {
        return this.ExtTimeOffsetSet;
    }

    /**
     * Set 截图时间点列表，时间点支持 s、% 两种格式：
<li>当字符串以 s 结尾，表示时间点单位为秒，如 3.5s 表示时间点为第3.5秒；</li>
<li>当字符串以 % 结尾，表示时间点为视频时长的百分比大小，如10%表示时间点为视频前第10%的时间。</li>
     * @param ExtTimeOffsetSet 截图时间点列表，时间点支持 s、% 两种格式：
<li>当字符串以 s 结尾，表示时间点单位为秒，如 3.5s 表示时间点为第3.5秒；</li>
<li>当字符串以 % 结尾，表示时间点为视频时长的百分比大小，如10%表示时间点为视频前第10%的时间。</li>
     */
    public void setExtTimeOffsetSet(String [] ExtTimeOffsetSet) {
        this.ExtTimeOffsetSet = ExtTimeOffsetSet;
    }

    /**
     * Get 截图时间点列表，单位为<font color=red>秒</font>。此参数已不再建议使用，建议您使用 ExtTimeOffsetSet 参数。 
     * @return TimeOffsetSet 截图时间点列表，单位为<font color=red>秒</font>。此参数已不再建议使用，建议您使用 ExtTimeOffsetSet 参数。
     */
    public Float [] getTimeOffsetSet() {
        return this.TimeOffsetSet;
    }

    /**
     * Set 截图时间点列表，单位为<font color=red>秒</font>。此参数已不再建议使用，建议您使用 ExtTimeOffsetSet 参数。
     * @param TimeOffsetSet 截图时间点列表，单位为<font color=red>秒</font>。此参数已不再建议使用，建议您使用 ExtTimeOffsetSet 参数。
     */
    public void setTimeOffsetSet(Float [] TimeOffsetSet) {
        this.TimeOffsetSet = TimeOffsetSet;
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
     * Get 时间点截图后文件的目标存储，不填则继承上层的 OutputStorage 值。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OutputStorage 时间点截图后文件的目标存储，不填则继承上层的 OutputStorage 值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TaskOutputStorage getOutputStorage() {
        return this.OutputStorage;
    }

    /**
     * Set 时间点截图后文件的目标存储，不填则继承上层的 OutputStorage 值。
注意：此字段可能返回 null，表示取不到有效值。
     * @param OutputStorage 时间点截图后文件的目标存储，不填则继承上层的 OutputStorage 值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOutputStorage(TaskOutputStorage OutputStorage) {
        this.OutputStorage = OutputStorage;
    }

    /**
     * Get 时间点截图后图片文件的输出路径，可以为相对路径或者绝对路径。如果不填，则默认为相对路径：`{inputName}_snapshotByTimeOffset_{definition}_{number}.{format}`。 
     * @return OutputObjectPath 时间点截图后图片文件的输出路径，可以为相对路径或者绝对路径。如果不填，则默认为相对路径：`{inputName}_snapshotByTimeOffset_{definition}_{number}.{format}`。
     */
    public String getOutputObjectPath() {
        return this.OutputObjectPath;
    }

    /**
     * Set 时间点截图后图片文件的输出路径，可以为相对路径或者绝对路径。如果不填，则默认为相对路径：`{inputName}_snapshotByTimeOffset_{definition}_{number}.{format}`。
     * @param OutputObjectPath 时间点截图后图片文件的输出路径，可以为相对路径或者绝对路径。如果不填，则默认为相对路径：`{inputName}_snapshotByTimeOffset_{definition}_{number}.{format}`。
     */
    public void setOutputObjectPath(String OutputObjectPath) {
        this.OutputObjectPath = OutputObjectPath;
    }

    /**
     * Get 时间点截图后输出路径中的`{number}`变量的规则。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ObjectNumberFormat 时间点截图后输出路径中的`{number}`变量的规则。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public NumberFormat getObjectNumberFormat() {
        return this.ObjectNumberFormat;
    }

    /**
     * Set 时间点截图后输出路径中的`{number}`变量的规则。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ObjectNumberFormat 时间点截图后输出路径中的`{number}`变量的规则。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setObjectNumberFormat(NumberFormat ObjectNumberFormat) {
        this.ObjectNumberFormat = ObjectNumberFormat;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamArraySimple(map, prefix + "ExtTimeOffsetSet.", this.ExtTimeOffsetSet);
        this.setParamArraySimple(map, prefix + "TimeOffsetSet.", this.TimeOffsetSet);
        this.setParamArrayObj(map, prefix + "WatermarkSet.", this.WatermarkSet);
        this.setParamObj(map, prefix + "OutputStorage.", this.OutputStorage);
        this.setParamSimple(map, prefix + "OutputObjectPath", this.OutputObjectPath);
        this.setParamObj(map, prefix + "ObjectNumberFormat.", this.ObjectNumberFormat);

    }
}

