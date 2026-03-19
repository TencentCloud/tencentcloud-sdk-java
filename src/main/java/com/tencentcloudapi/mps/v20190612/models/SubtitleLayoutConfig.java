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

public class SubtitleLayoutConfig extends AbstractModel {

    /**
    * 字幕排列配置开关，0关闭，1开启，默认0
    */
    @SerializedName("SubtitleLayoutConfigSwitch")
    @Expose
    private Long SubtitleLayoutConfigSwitch;

    /**
    * 行间距。正整数。
- 代表像素值时， [0, 1000]。
- 代表百分数时，[0, 100]。不填默认0。

    */
    @SerializedName("LineSpacing")
    @Expose
    private Long LineSpacing;

    /**
    * LineSpacing单位，0 像素，1百分比，默认为0，像素

    */
    @SerializedName("LineSpacingUnit")
    @Expose
    private Long LineSpacingUnit;

    /**
    * 对齐方式，取值：top: 顶部对齐，字幕顶部按位置固定，底部随行数变化。bottom: 底部对齐，字幕底部按位置固定，顶部随行数变化。不填默认底部对齐。

    */
    @SerializedName("Alignment")
    @Expose
    private String Alignment;

    /**
     * Get 字幕排列配置开关，0关闭，1开启，默认0 
     * @return SubtitleLayoutConfigSwitch 字幕排列配置开关，0关闭，1开启，默认0
     */
    public Long getSubtitleLayoutConfigSwitch() {
        return this.SubtitleLayoutConfigSwitch;
    }

    /**
     * Set 字幕排列配置开关，0关闭，1开启，默认0
     * @param SubtitleLayoutConfigSwitch 字幕排列配置开关，0关闭，1开启，默认0
     */
    public void setSubtitleLayoutConfigSwitch(Long SubtitleLayoutConfigSwitch) {
        this.SubtitleLayoutConfigSwitch = SubtitleLayoutConfigSwitch;
    }

    /**
     * Get 行间距。正整数。
- 代表像素值时， [0, 1000]。
- 代表百分数时，[0, 100]。不填默认0。
 
     * @return LineSpacing 行间距。正整数。
- 代表像素值时， [0, 1000]。
- 代表百分数时，[0, 100]。不填默认0。

     */
    public Long getLineSpacing() {
        return this.LineSpacing;
    }

    /**
     * Set 行间距。正整数。
- 代表像素值时， [0, 1000]。
- 代表百分数时，[0, 100]。不填默认0。

     * @param LineSpacing 行间距。正整数。
- 代表像素值时， [0, 1000]。
- 代表百分数时，[0, 100]。不填默认0。

     */
    public void setLineSpacing(Long LineSpacing) {
        this.LineSpacing = LineSpacing;
    }

    /**
     * Get LineSpacing单位，0 像素，1百分比，默认为0，像素
 
     * @return LineSpacingUnit LineSpacing单位，0 像素，1百分比，默认为0，像素

     */
    public Long getLineSpacingUnit() {
        return this.LineSpacingUnit;
    }

    /**
     * Set LineSpacing单位，0 像素，1百分比，默认为0，像素

     * @param LineSpacingUnit LineSpacing单位，0 像素，1百分比，默认为0，像素

     */
    public void setLineSpacingUnit(Long LineSpacingUnit) {
        this.LineSpacingUnit = LineSpacingUnit;
    }

    /**
     * Get 对齐方式，取值：top: 顶部对齐，字幕顶部按位置固定，底部随行数变化。bottom: 底部对齐，字幕底部按位置固定，顶部随行数变化。不填默认底部对齐。
 
     * @return Alignment 对齐方式，取值：top: 顶部对齐，字幕顶部按位置固定，底部随行数变化。bottom: 底部对齐，字幕底部按位置固定，顶部随行数变化。不填默认底部对齐。

     */
    public String getAlignment() {
        return this.Alignment;
    }

    /**
     * Set 对齐方式，取值：top: 顶部对齐，字幕顶部按位置固定，底部随行数变化。bottom: 底部对齐，字幕底部按位置固定，顶部随行数变化。不填默认底部对齐。

     * @param Alignment 对齐方式，取值：top: 顶部对齐，字幕顶部按位置固定，底部随行数变化。bottom: 底部对齐，字幕底部按位置固定，顶部随行数变化。不填默认底部对齐。

     */
    public void setAlignment(String Alignment) {
        this.Alignment = Alignment;
    }

    public SubtitleLayoutConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubtitleLayoutConfig(SubtitleLayoutConfig source) {
        if (source.SubtitleLayoutConfigSwitch != null) {
            this.SubtitleLayoutConfigSwitch = new Long(source.SubtitleLayoutConfigSwitch);
        }
        if (source.LineSpacing != null) {
            this.LineSpacing = new Long(source.LineSpacing);
        }
        if (source.LineSpacingUnit != null) {
            this.LineSpacingUnit = new Long(source.LineSpacingUnit);
        }
        if (source.Alignment != null) {
            this.Alignment = new String(source.Alignment);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubtitleLayoutConfigSwitch", this.SubtitleLayoutConfigSwitch);
        this.setParamSimple(map, prefix + "LineSpacing", this.LineSpacing);
        this.setParamSimple(map, prefix + "LineSpacingUnit", this.LineSpacingUnit);
        this.setParamSimple(map, prefix + "Alignment", this.Alignment);

    }
}

