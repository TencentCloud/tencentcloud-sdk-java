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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CoverBySnapshotTaskInput extends AbstractModel{

    /**
    * 指定时间点截图模板 ID。
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * 截图方式。包含：
<li>Time：依照时间点截图</li>
<li>Percent：依照百分比截图</li>
    */
    @SerializedName("PositionType")
    @Expose
    private String PositionType;

    /**
    * 截图位置：
<li>对于依照时间点截图，该值表示指定视频第几秒的截图作为封面</li>
<li>对于依照百分比截图，该值表示使用视频百分之多少的截图作为封面</li>
    */
    @SerializedName("PositionValue")
    @Expose
    private Float PositionValue;

    /**
    * 水印列表，支持多张图片或文字水印，最大可支持 10 张。
    */
    @SerializedName("WatermarkSet")
    @Expose
    private WatermarkInput [] WatermarkSet;

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
     * Get 截图方式。包含：
<li>Time：依照时间点截图</li>
<li>Percent：依照百分比截图</li> 
     * @return PositionType 截图方式。包含：
<li>Time：依照时间点截图</li>
<li>Percent：依照百分比截图</li>
     */
    public String getPositionType() {
        return this.PositionType;
    }

    /**
     * Set 截图方式。包含：
<li>Time：依照时间点截图</li>
<li>Percent：依照百分比截图</li>
     * @param PositionType 截图方式。包含：
<li>Time：依照时间点截图</li>
<li>Percent：依照百分比截图</li>
     */
    public void setPositionType(String PositionType) {
        this.PositionType = PositionType;
    }

    /**
     * Get 截图位置：
<li>对于依照时间点截图，该值表示指定视频第几秒的截图作为封面</li>
<li>对于依照百分比截图，该值表示使用视频百分之多少的截图作为封面</li> 
     * @return PositionValue 截图位置：
<li>对于依照时间点截图，该值表示指定视频第几秒的截图作为封面</li>
<li>对于依照百分比截图，该值表示使用视频百分之多少的截图作为封面</li>
     */
    public Float getPositionValue() {
        return this.PositionValue;
    }

    /**
     * Set 截图位置：
<li>对于依照时间点截图，该值表示指定视频第几秒的截图作为封面</li>
<li>对于依照百分比截图，该值表示使用视频百分之多少的截图作为封面</li>
     * @param PositionValue 截图位置：
<li>对于依照时间点截图，该值表示指定视频第几秒的截图作为封面</li>
<li>对于依照百分比截图，该值表示使用视频百分之多少的截图作为封面</li>
     */
    public void setPositionValue(Float PositionValue) {
        this.PositionValue = PositionValue;
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
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamSimple(map, prefix + "PositionType", this.PositionType);
        this.setParamSimple(map, prefix + "PositionValue", this.PositionValue);
        this.setParamArrayObj(map, prefix + "WatermarkSet.", this.WatermarkSet);

    }
}

