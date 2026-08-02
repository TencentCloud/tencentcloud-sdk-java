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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MPSSubtitleLayoutConfig extends AbstractModel {

    /**
    * <p>字幕排列配置开关，0关闭，1开启，默认0</p>
    */
    @SerializedName("SubtitleLayoutConfigSwitch")
    @Expose
    private Long SubtitleLayoutConfigSwitch;

    /**
    * <p>行间距。正整数。 - 代表像素值时， [0, 1000]。 - 代表百分数时，[0, 100]。不填默认0。</p>
    */
    @SerializedName("LineSpacing")
    @Expose
    private Long LineSpacing;

    /**
    * <p>LineSpacing单位，0 像素，1百分比，默认为0，像素</p>
    */
    @SerializedName("LineSpacingUnit")
    @Expose
    private Long LineSpacingUnit;

    /**
    * <p>对齐方式，取值：top: 顶部对齐，字幕顶部按位置固定，底部随行数变化。bottom: 底部对齐，字幕底部按位置固定，顶部随行数变化。不填默认底部对齐。</p>
    */
    @SerializedName("Alignment")
    @Expose
    private String Alignment;

    /**
     * Get <p>字幕排列配置开关，0关闭，1开启，默认0</p> 
     * @return SubtitleLayoutConfigSwitch <p>字幕排列配置开关，0关闭，1开启，默认0</p>
     */
    public Long getSubtitleLayoutConfigSwitch() {
        return this.SubtitleLayoutConfigSwitch;
    }

    /**
     * Set <p>字幕排列配置开关，0关闭，1开启，默认0</p>
     * @param SubtitleLayoutConfigSwitch <p>字幕排列配置开关，0关闭，1开启，默认0</p>
     */
    public void setSubtitleLayoutConfigSwitch(Long SubtitleLayoutConfigSwitch) {
        this.SubtitleLayoutConfigSwitch = SubtitleLayoutConfigSwitch;
    }

    /**
     * Get <p>行间距。正整数。 - 代表像素值时， [0, 1000]。 - 代表百分数时，[0, 100]。不填默认0。</p> 
     * @return LineSpacing <p>行间距。正整数。 - 代表像素值时， [0, 1000]。 - 代表百分数时，[0, 100]。不填默认0。</p>
     */
    public Long getLineSpacing() {
        return this.LineSpacing;
    }

    /**
     * Set <p>行间距。正整数。 - 代表像素值时， [0, 1000]。 - 代表百分数时，[0, 100]。不填默认0。</p>
     * @param LineSpacing <p>行间距。正整数。 - 代表像素值时， [0, 1000]。 - 代表百分数时，[0, 100]。不填默认0。</p>
     */
    public void setLineSpacing(Long LineSpacing) {
        this.LineSpacing = LineSpacing;
    }

    /**
     * Get <p>LineSpacing单位，0 像素，1百分比，默认为0，像素</p> 
     * @return LineSpacingUnit <p>LineSpacing单位，0 像素，1百分比，默认为0，像素</p>
     */
    public Long getLineSpacingUnit() {
        return this.LineSpacingUnit;
    }

    /**
     * Set <p>LineSpacing单位，0 像素，1百分比，默认为0，像素</p>
     * @param LineSpacingUnit <p>LineSpacing单位，0 像素，1百分比，默认为0，像素</p>
     */
    public void setLineSpacingUnit(Long LineSpacingUnit) {
        this.LineSpacingUnit = LineSpacingUnit;
    }

    /**
     * Get <p>对齐方式，取值：top: 顶部对齐，字幕顶部按位置固定，底部随行数变化。bottom: 底部对齐，字幕底部按位置固定，顶部随行数变化。不填默认底部对齐。</p> 
     * @return Alignment <p>对齐方式，取值：top: 顶部对齐，字幕顶部按位置固定，底部随行数变化。bottom: 底部对齐，字幕底部按位置固定，顶部随行数变化。不填默认底部对齐。</p>
     */
    public String getAlignment() {
        return this.Alignment;
    }

    /**
     * Set <p>对齐方式，取值：top: 顶部对齐，字幕顶部按位置固定，底部随行数变化。bottom: 底部对齐，字幕底部按位置固定，顶部随行数变化。不填默认底部对齐。</p>
     * @param Alignment <p>对齐方式，取值：top: 顶部对齐，字幕顶部按位置固定，底部随行数变化。bottom: 底部对齐，字幕底部按位置固定，顶部随行数变化。不填默认底部对齐。</p>
     */
    public void setAlignment(String Alignment) {
        this.Alignment = Alignment;
    }

    public MPSSubtitleLayoutConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MPSSubtitleLayoutConfig(MPSSubtitleLayoutConfig source) {
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

