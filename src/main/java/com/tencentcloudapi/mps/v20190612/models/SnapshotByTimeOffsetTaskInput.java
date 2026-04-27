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

public class SnapshotByTimeOffsetTaskInput extends AbstractModel {

    /**
    * <p>指定时间点截图模板 ID。</p>
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * <p>截图时间点列表，时间点支持 s、% 两种格式：</p><li>当字符串以 s 结尾，表示时间点单位为秒，如 3.5s 表示时间点为第3.5秒；</li><li>当字符串以 % 结尾，表示时间点为视频时长的百分比大小，如10%表示时间点为视频前第10%的时间。</li>
    */
    @SerializedName("ExtTimeOffsetSet")
    @Expose
    private String [] ExtTimeOffsetSet;

    /**
    * <p>截图时间点列表，单位为<font color="red">秒</font>。此参数已不再建议使用，建议您使用 ExtTimeOffsetSet 参数。</p>
    */
    @SerializedName("TimeOffsetSet")
    @Expose
    private Float [] TimeOffsetSet;

    /**
    * <p>水印列表，支持多张图片或文字水印，最大可支持 10 张。</p>
    */
    @SerializedName("WatermarkSet")
    @Expose
    private WatermarkInput [] WatermarkSet;

    /**
    * <p>时间点截图后文件的目标存储，不填则继承上层的 OutputStorage 值。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OutputStorage")
    @Expose
    private TaskOutputStorage OutputStorage;

    /**
    * <p>时间点截图后图片文件的输出路径，可以为相对路径或者绝对路径。<br>若需定义输出路径，路径需以<code>.{format}</code>结尾。变量名请参考 <a href="https://cloud.tencent.com/document/product/862/37039">文件名变量说明</a>。<br>相对路径示例：</p><li>文件名_{变量名}.{format}</li><li>文件名.{format}</li>绝对路径示例：<li>/自定义路径/文件名_{变量名}.{format}</li>如果不填，则默认为相对路径：<code>{inputName}_snapshotByTimeOffset_{definition}_{number}.{format}</code>。
    */
    @SerializedName("OutputObjectPath")
    @Expose
    private String OutputObjectPath;

    /**
    * <p>时间点截图后输出路径中的<code>{number}</code>变量的规则。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ObjectNumberFormat")
    @Expose
    private NumberFormat ObjectNumberFormat;

    /**
    * <p>扩展参数。</p>
    */
    @SerializedName("ExtInfo")
    @Expose
    private String ExtInfo;

    /**
     * Get <p>指定时间点截图模板 ID。</p> 
     * @return Definition <p>指定时间点截图模板 ID。</p>
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set <p>指定时间点截图模板 ID。</p>
     * @param Definition <p>指定时间点截图模板 ID。</p>
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get <p>截图时间点列表，时间点支持 s、% 两种格式：</p><li>当字符串以 s 结尾，表示时间点单位为秒，如 3.5s 表示时间点为第3.5秒；</li><li>当字符串以 % 结尾，表示时间点为视频时长的百分比大小，如10%表示时间点为视频前第10%的时间。</li> 
     * @return ExtTimeOffsetSet <p>截图时间点列表，时间点支持 s、% 两种格式：</p><li>当字符串以 s 结尾，表示时间点单位为秒，如 3.5s 表示时间点为第3.5秒；</li><li>当字符串以 % 结尾，表示时间点为视频时长的百分比大小，如10%表示时间点为视频前第10%的时间。</li>
     */
    public String [] getExtTimeOffsetSet() {
        return this.ExtTimeOffsetSet;
    }

    /**
     * Set <p>截图时间点列表，时间点支持 s、% 两种格式：</p><li>当字符串以 s 结尾，表示时间点单位为秒，如 3.5s 表示时间点为第3.5秒；</li><li>当字符串以 % 结尾，表示时间点为视频时长的百分比大小，如10%表示时间点为视频前第10%的时间。</li>
     * @param ExtTimeOffsetSet <p>截图时间点列表，时间点支持 s、% 两种格式：</p><li>当字符串以 s 结尾，表示时间点单位为秒，如 3.5s 表示时间点为第3.5秒；</li><li>当字符串以 % 结尾，表示时间点为视频时长的百分比大小，如10%表示时间点为视频前第10%的时间。</li>
     */
    public void setExtTimeOffsetSet(String [] ExtTimeOffsetSet) {
        this.ExtTimeOffsetSet = ExtTimeOffsetSet;
    }

    /**
     * Get <p>截图时间点列表，单位为<font color="red">秒</font>。此参数已不再建议使用，建议您使用 ExtTimeOffsetSet 参数。</p> 
     * @return TimeOffsetSet <p>截图时间点列表，单位为<font color="red">秒</font>。此参数已不再建议使用，建议您使用 ExtTimeOffsetSet 参数。</p>
     */
    public Float [] getTimeOffsetSet() {
        return this.TimeOffsetSet;
    }

    /**
     * Set <p>截图时间点列表，单位为<font color="red">秒</font>。此参数已不再建议使用，建议您使用 ExtTimeOffsetSet 参数。</p>
     * @param TimeOffsetSet <p>截图时间点列表，单位为<font color="red">秒</font>。此参数已不再建议使用，建议您使用 ExtTimeOffsetSet 参数。</p>
     */
    public void setTimeOffsetSet(Float [] TimeOffsetSet) {
        this.TimeOffsetSet = TimeOffsetSet;
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
     * Get <p>时间点截图后文件的目标存储，不填则继承上层的 OutputStorage 值。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OutputStorage <p>时间点截图后文件的目标存储，不填则继承上层的 OutputStorage 值。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TaskOutputStorage getOutputStorage() {
        return this.OutputStorage;
    }

    /**
     * Set <p>时间点截图后文件的目标存储，不填则继承上层的 OutputStorage 值。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param OutputStorage <p>时间点截图后文件的目标存储，不填则继承上层的 OutputStorage 值。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOutputStorage(TaskOutputStorage OutputStorage) {
        this.OutputStorage = OutputStorage;
    }

    /**
     * Get <p>时间点截图后图片文件的输出路径，可以为相对路径或者绝对路径。<br>若需定义输出路径，路径需以<code>.{format}</code>结尾。变量名请参考 <a href="https://cloud.tencent.com/document/product/862/37039">文件名变量说明</a>。<br>相对路径示例：</p><li>文件名_{变量名}.{format}</li><li>文件名.{format}</li>绝对路径示例：<li>/自定义路径/文件名_{变量名}.{format}</li>如果不填，则默认为相对路径：<code>{inputName}_snapshotByTimeOffset_{definition}_{number}.{format}</code>。 
     * @return OutputObjectPath <p>时间点截图后图片文件的输出路径，可以为相对路径或者绝对路径。<br>若需定义输出路径，路径需以<code>.{format}</code>结尾。变量名请参考 <a href="https://cloud.tencent.com/document/product/862/37039">文件名变量说明</a>。<br>相对路径示例：</p><li>文件名_{变量名}.{format}</li><li>文件名.{format}</li>绝对路径示例：<li>/自定义路径/文件名_{变量名}.{format}</li>如果不填，则默认为相对路径：<code>{inputName}_snapshotByTimeOffset_{definition}_{number}.{format}</code>。
     */
    public String getOutputObjectPath() {
        return this.OutputObjectPath;
    }

    /**
     * Set <p>时间点截图后图片文件的输出路径，可以为相对路径或者绝对路径。<br>若需定义输出路径，路径需以<code>.{format}</code>结尾。变量名请参考 <a href="https://cloud.tencent.com/document/product/862/37039">文件名变量说明</a>。<br>相对路径示例：</p><li>文件名_{变量名}.{format}</li><li>文件名.{format}</li>绝对路径示例：<li>/自定义路径/文件名_{变量名}.{format}</li>如果不填，则默认为相对路径：<code>{inputName}_snapshotByTimeOffset_{definition}_{number}.{format}</code>。
     * @param OutputObjectPath <p>时间点截图后图片文件的输出路径，可以为相对路径或者绝对路径。<br>若需定义输出路径，路径需以<code>.{format}</code>结尾。变量名请参考 <a href="https://cloud.tencent.com/document/product/862/37039">文件名变量说明</a>。<br>相对路径示例：</p><li>文件名_{变量名}.{format}</li><li>文件名.{format}</li>绝对路径示例：<li>/自定义路径/文件名_{变量名}.{format}</li>如果不填，则默认为相对路径：<code>{inputName}_snapshotByTimeOffset_{definition}_{number}.{format}</code>。
     */
    public void setOutputObjectPath(String OutputObjectPath) {
        this.OutputObjectPath = OutputObjectPath;
    }

    /**
     * Get <p>时间点截图后输出路径中的<code>{number}</code>变量的规则。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ObjectNumberFormat <p>时间点截图后输出路径中的<code>{number}</code>变量的规则。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public NumberFormat getObjectNumberFormat() {
        return this.ObjectNumberFormat;
    }

    /**
     * Set <p>时间点截图后输出路径中的<code>{number}</code>变量的规则。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ObjectNumberFormat <p>时间点截图后输出路径中的<code>{number}</code>变量的规则。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setObjectNumberFormat(NumberFormat ObjectNumberFormat) {
        this.ObjectNumberFormat = ObjectNumberFormat;
    }

    /**
     * Get <p>扩展参数。</p> 
     * @return ExtInfo <p>扩展参数。</p>
     */
    public String getExtInfo() {
        return this.ExtInfo;
    }

    /**
     * Set <p>扩展参数。</p>
     * @param ExtInfo <p>扩展参数。</p>
     */
    public void setExtInfo(String ExtInfo) {
        this.ExtInfo = ExtInfo;
    }

    public SnapshotByTimeOffsetTaskInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SnapshotByTimeOffsetTaskInput(SnapshotByTimeOffsetTaskInput source) {
        if (source.Definition != null) {
            this.Definition = new Long(source.Definition);
        }
        if (source.ExtTimeOffsetSet != null) {
            this.ExtTimeOffsetSet = new String[source.ExtTimeOffsetSet.length];
            for (int i = 0; i < source.ExtTimeOffsetSet.length; i++) {
                this.ExtTimeOffsetSet[i] = new String(source.ExtTimeOffsetSet[i]);
            }
        }
        if (source.TimeOffsetSet != null) {
            this.TimeOffsetSet = new Float[source.TimeOffsetSet.length];
            for (int i = 0; i < source.TimeOffsetSet.length; i++) {
                this.TimeOffsetSet[i] = new Float(source.TimeOffsetSet[i]);
            }
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
        if (source.ObjectNumberFormat != null) {
            this.ObjectNumberFormat = new NumberFormat(source.ObjectNumberFormat);
        }
        if (source.ExtInfo != null) {
            this.ExtInfo = new String(source.ExtInfo);
        }
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
        this.setParamSimple(map, prefix + "ExtInfo", this.ExtInfo);

    }
}

