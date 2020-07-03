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

public class MediaSampleSnapshotItem extends AbstractModel{

    /**
    * 采样截图规格 ID，参见[采样截图参数模板](https://cloud.tencent.com/document/product/266/33480#.E9.87.87.E6.A0.B7.E6.88.AA.E5.9B.BE.E6.A8.A1.E6.9D.BF)。
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * 采样方式，取值范围：
<li>Percent：根据百分比间隔采样。</li>
<li>Time：根据时间间隔采样。</li>
    */
    @SerializedName("SampleType")
    @Expose
    private String SampleType;

    /**
    * 采样间隔
<li>当 SampleType 为 Percent 时，该值表示多少百分比一张图。</li>
<li>当 SampleType 为 Time 时，该值表示多少时间间隔一张图，单位秒， 第一张图均为视频首帧。</li>
    */
    @SerializedName("Interval")
    @Expose
    private Long Interval;

    /**
    * 截图后文件的存储位置。
    */
    @SerializedName("Storage")
    @Expose
    private TaskOutputStorage Storage;

    /**
    * 生成的截图 path 列表。
    */
    @SerializedName("ImagePathSet")
    @Expose
    private String [] ImagePathSet;

    /**
    * 截图如果被打上了水印，被打水印的模板 ID 列表。
    */
    @SerializedName("WaterMarkDefinition")
    @Expose
    private Long [] WaterMarkDefinition;

    /**
     * Get 采样截图规格 ID，参见[采样截图参数模板](https://cloud.tencent.com/document/product/266/33480#.E9.87.87.E6.A0.B7.E6.88.AA.E5.9B.BE.E6.A8.A1.E6.9D.BF)。 
     * @return Definition 采样截图规格 ID，参见[采样截图参数模板](https://cloud.tencent.com/document/product/266/33480#.E9.87.87.E6.A0.B7.E6.88.AA.E5.9B.BE.E6.A8.A1.E6.9D.BF)。
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set 采样截图规格 ID，参见[采样截图参数模板](https://cloud.tencent.com/document/product/266/33480#.E9.87.87.E6.A0.B7.E6.88.AA.E5.9B.BE.E6.A8.A1.E6.9D.BF)。
     * @param Definition 采样截图规格 ID，参见[采样截图参数模板](https://cloud.tencent.com/document/product/266/33480#.E9.87.87.E6.A0.B7.E6.88.AA.E5.9B.BE.E6.A8.A1.E6.9D.BF)。
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get 采样方式，取值范围：
<li>Percent：根据百分比间隔采样。</li>
<li>Time：根据时间间隔采样。</li> 
     * @return SampleType 采样方式，取值范围：
<li>Percent：根据百分比间隔采样。</li>
<li>Time：根据时间间隔采样。</li>
     */
    public String getSampleType() {
        return this.SampleType;
    }

    /**
     * Set 采样方式，取值范围：
<li>Percent：根据百分比间隔采样。</li>
<li>Time：根据时间间隔采样。</li>
     * @param SampleType 采样方式，取值范围：
<li>Percent：根据百分比间隔采样。</li>
<li>Time：根据时间间隔采样。</li>
     */
    public void setSampleType(String SampleType) {
        this.SampleType = SampleType;
    }

    /**
     * Get 采样间隔
<li>当 SampleType 为 Percent 时，该值表示多少百分比一张图。</li>
<li>当 SampleType 为 Time 时，该值表示多少时间间隔一张图，单位秒， 第一张图均为视频首帧。</li> 
     * @return Interval 采样间隔
<li>当 SampleType 为 Percent 时，该值表示多少百分比一张图。</li>
<li>当 SampleType 为 Time 时，该值表示多少时间间隔一张图，单位秒， 第一张图均为视频首帧。</li>
     */
    public Long getInterval() {
        return this.Interval;
    }

    /**
     * Set 采样间隔
<li>当 SampleType 为 Percent 时，该值表示多少百分比一张图。</li>
<li>当 SampleType 为 Time 时，该值表示多少时间间隔一张图，单位秒， 第一张图均为视频首帧。</li>
     * @param Interval 采样间隔
<li>当 SampleType 为 Percent 时，该值表示多少百分比一张图。</li>
<li>当 SampleType 为 Time 时，该值表示多少时间间隔一张图，单位秒， 第一张图均为视频首帧。</li>
     */
    public void setInterval(Long Interval) {
        this.Interval = Interval;
    }

    /**
     * Get 截图后文件的存储位置。 
     * @return Storage 截图后文件的存储位置。
     */
    public TaskOutputStorage getStorage() {
        return this.Storage;
    }

    /**
     * Set 截图后文件的存储位置。
     * @param Storage 截图后文件的存储位置。
     */
    public void setStorage(TaskOutputStorage Storage) {
        this.Storage = Storage;
    }

    /**
     * Get 生成的截图 path 列表。 
     * @return ImagePathSet 生成的截图 path 列表。
     */
    public String [] getImagePathSet() {
        return this.ImagePathSet;
    }

    /**
     * Set 生成的截图 path 列表。
     * @param ImagePathSet 生成的截图 path 列表。
     */
    public void setImagePathSet(String [] ImagePathSet) {
        this.ImagePathSet = ImagePathSet;
    }

    /**
     * Get 截图如果被打上了水印，被打水印的模板 ID 列表。 
     * @return WaterMarkDefinition 截图如果被打上了水印，被打水印的模板 ID 列表。
     */
    public Long [] getWaterMarkDefinition() {
        return this.WaterMarkDefinition;
    }

    /**
     * Set 截图如果被打上了水印，被打水印的模板 ID 列表。
     * @param WaterMarkDefinition 截图如果被打上了水印，被打水印的模板 ID 列表。
     */
    public void setWaterMarkDefinition(Long [] WaterMarkDefinition) {
        this.WaterMarkDefinition = WaterMarkDefinition;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamSimple(map, prefix + "SampleType", this.SampleType);
        this.setParamSimple(map, prefix + "Interval", this.Interval);
        this.setParamObj(map, prefix + "Storage.", this.Storage);
        this.setParamArraySimple(map, prefix + "ImagePathSet.", this.ImagePathSet);
        this.setParamArraySimple(map, prefix + "WaterMarkDefinition.", this.WaterMarkDefinition);

    }
}

