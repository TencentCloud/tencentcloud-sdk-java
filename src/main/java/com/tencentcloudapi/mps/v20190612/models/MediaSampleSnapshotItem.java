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

public class MediaSampleSnapshotItem extends AbstractModel {

    /**
    * <p>采样截图规格 ID，参见<a href="https://cloud.tencent.com/document/product/266/33480#.E9.87.87.E6.A0.B7.E6.88.AA.E5.9B.BE.E6.A8.A1.E6.9D.BF">采样截图参数模板</a>。</p>
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * <p>采样方式，取值范围：</p><li>Percent：根据百分比间隔采样。</li><li>Time：根据时间间隔采样。</li>
    */
    @SerializedName("SampleType")
    @Expose
    private String SampleType;

    /**
    * <p>采样间隔</p><li>当 SampleType 为 Percent 时，该值表示多少百分比一张图。</li><li>当 SampleType 为 Time 时，该值表示多少时间间隔一张图，单位秒， 第一张图均为视频首帧。</li>
    */
    @SerializedName("Interval")
    @Expose
    private Long Interval;

    /**
    * <p>截图后文件的存储位置。</p>
    */
    @SerializedName("Storage")
    @Expose
    private TaskOutputStorage Storage;

    /**
    * <p>生成的截图 path 列表。</p>
    */
    @SerializedName("ImagePathSet")
    @Expose
    private String [] ImagePathSet;

    /**
    * <p>截图如果被打上了水印，被打水印的模板 ID 列表。</p>
    */
    @SerializedName("WaterMarkDefinition")
    @Expose
    private Long [] WaterMarkDefinition;

    /**
     * Get <p>采样截图规格 ID，参见<a href="https://cloud.tencent.com/document/product/266/33480#.E9.87.87.E6.A0.B7.E6.88.AA.E5.9B.BE.E6.A8.A1.E6.9D.BF">采样截图参数模板</a>。</p> 
     * @return Definition <p>采样截图规格 ID，参见<a href="https://cloud.tencent.com/document/product/266/33480#.E9.87.87.E6.A0.B7.E6.88.AA.E5.9B.BE.E6.A8.A1.E6.9D.BF">采样截图参数模板</a>。</p>
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set <p>采样截图规格 ID，参见<a href="https://cloud.tencent.com/document/product/266/33480#.E9.87.87.E6.A0.B7.E6.88.AA.E5.9B.BE.E6.A8.A1.E6.9D.BF">采样截图参数模板</a>。</p>
     * @param Definition <p>采样截图规格 ID，参见<a href="https://cloud.tencent.com/document/product/266/33480#.E9.87.87.E6.A0.B7.E6.88.AA.E5.9B.BE.E6.A8.A1.E6.9D.BF">采样截图参数模板</a>。</p>
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get <p>采样方式，取值范围：</p><li>Percent：根据百分比间隔采样。</li><li>Time：根据时间间隔采样。</li> 
     * @return SampleType <p>采样方式，取值范围：</p><li>Percent：根据百分比间隔采样。</li><li>Time：根据时间间隔采样。</li>
     */
    public String getSampleType() {
        return this.SampleType;
    }

    /**
     * Set <p>采样方式，取值范围：</p><li>Percent：根据百分比间隔采样。</li><li>Time：根据时间间隔采样。</li>
     * @param SampleType <p>采样方式，取值范围：</p><li>Percent：根据百分比间隔采样。</li><li>Time：根据时间间隔采样。</li>
     */
    public void setSampleType(String SampleType) {
        this.SampleType = SampleType;
    }

    /**
     * Get <p>采样间隔</p><li>当 SampleType 为 Percent 时，该值表示多少百分比一张图。</li><li>当 SampleType 为 Time 时，该值表示多少时间间隔一张图，单位秒， 第一张图均为视频首帧。</li> 
     * @return Interval <p>采样间隔</p><li>当 SampleType 为 Percent 时，该值表示多少百分比一张图。</li><li>当 SampleType 为 Time 时，该值表示多少时间间隔一张图，单位秒， 第一张图均为视频首帧。</li>
     */
    public Long getInterval() {
        return this.Interval;
    }

    /**
     * Set <p>采样间隔</p><li>当 SampleType 为 Percent 时，该值表示多少百分比一张图。</li><li>当 SampleType 为 Time 时，该值表示多少时间间隔一张图，单位秒， 第一张图均为视频首帧。</li>
     * @param Interval <p>采样间隔</p><li>当 SampleType 为 Percent 时，该值表示多少百分比一张图。</li><li>当 SampleType 为 Time 时，该值表示多少时间间隔一张图，单位秒， 第一张图均为视频首帧。</li>
     */
    public void setInterval(Long Interval) {
        this.Interval = Interval;
    }

    /**
     * Get <p>截图后文件的存储位置。</p> 
     * @return Storage <p>截图后文件的存储位置。</p>
     */
    public TaskOutputStorage getStorage() {
        return this.Storage;
    }

    /**
     * Set <p>截图后文件的存储位置。</p>
     * @param Storage <p>截图后文件的存储位置。</p>
     */
    public void setStorage(TaskOutputStorage Storage) {
        this.Storage = Storage;
    }

    /**
     * Get <p>生成的截图 path 列表。</p> 
     * @return ImagePathSet <p>生成的截图 path 列表。</p>
     */
    public String [] getImagePathSet() {
        return this.ImagePathSet;
    }

    /**
     * Set <p>生成的截图 path 列表。</p>
     * @param ImagePathSet <p>生成的截图 path 列表。</p>
     */
    public void setImagePathSet(String [] ImagePathSet) {
        this.ImagePathSet = ImagePathSet;
    }

    /**
     * Get <p>截图如果被打上了水印，被打水印的模板 ID 列表。</p> 
     * @return WaterMarkDefinition <p>截图如果被打上了水印，被打水印的模板 ID 列表。</p>
     */
    public Long [] getWaterMarkDefinition() {
        return this.WaterMarkDefinition;
    }

    /**
     * Set <p>截图如果被打上了水印，被打水印的模板 ID 列表。</p>
     * @param WaterMarkDefinition <p>截图如果被打上了水印，被打水印的模板 ID 列表。</p>
     */
    public void setWaterMarkDefinition(Long [] WaterMarkDefinition) {
        this.WaterMarkDefinition = WaterMarkDefinition;
    }

    public MediaSampleSnapshotItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MediaSampleSnapshotItem(MediaSampleSnapshotItem source) {
        if (source.Definition != null) {
            this.Definition = new Long(source.Definition);
        }
        if (source.SampleType != null) {
            this.SampleType = new String(source.SampleType);
        }
        if (source.Interval != null) {
            this.Interval = new Long(source.Interval);
        }
        if (source.Storage != null) {
            this.Storage = new TaskOutputStorage(source.Storage);
        }
        if (source.ImagePathSet != null) {
            this.ImagePathSet = new String[source.ImagePathSet.length];
            for (int i = 0; i < source.ImagePathSet.length; i++) {
                this.ImagePathSet[i] = new String(source.ImagePathSet[i]);
            }
        }
        if (source.WaterMarkDefinition != null) {
            this.WaterMarkDefinition = new Long[source.WaterMarkDefinition.length];
            for (int i = 0; i < source.WaterMarkDefinition.length; i++) {
                this.WaterMarkDefinition[i] = new Long(source.WaterMarkDefinition[i]);
            }
        }
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

