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

public class AdvancedSuperResolutionConfig extends AbstractModel {

    /**
    * 能力配置开关，可选值：
<li>ON：开启；</li>
<li>OFF：关闭。</li>
默认值：ON。
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * 类型，可选值：
<li>standard：通用超分</li>
<li>super：高级超分。</li>
默认值：standard。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 输出图片模式，默认percent。
<li> aspect: 超分至指定宽高的较大矩形。</li>
<li> fixed: 超分至固定宽高，强制缩放。</li>
<li> percent: 超分倍率，可以为小数。</li>
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * 超分倍率，可以为小数。
    */
    @SerializedName("Percent")
    @Expose
    private Float Percent;

    /**
    * 目标图片宽度，不能超过4096。
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * 目标图片高度，不能超过4096。
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
     * Get 能力配置开关，可选值：
<li>ON：开启；</li>
<li>OFF：关闭。</li>
默认值：ON。 
     * @return Switch 能力配置开关，可选值：
<li>ON：开启；</li>
<li>OFF：关闭。</li>
默认值：ON。
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set 能力配置开关，可选值：
<li>ON：开启；</li>
<li>OFF：关闭。</li>
默认值：ON。
     * @param Switch 能力配置开关，可选值：
<li>ON：开启；</li>
<li>OFF：关闭。</li>
默认值：ON。
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get 类型，可选值：
<li>standard：通用超分</li>
<li>super：高级超分。</li>
默认值：standard。 
     * @return Type 类型，可选值：
<li>standard：通用超分</li>
<li>super：高级超分。</li>
默认值：standard。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 类型，可选值：
<li>standard：通用超分</li>
<li>super：高级超分。</li>
默认值：standard。
     * @param Type 类型，可选值：
<li>standard：通用超分</li>
<li>super：高级超分。</li>
默认值：standard。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 输出图片模式，默认percent。
<li> aspect: 超分至指定宽高的较大矩形。</li>
<li> fixed: 超分至固定宽高，强制缩放。</li>
<li> percent: 超分倍率，可以为小数。</li> 
     * @return Mode 输出图片模式，默认percent。
<li> aspect: 超分至指定宽高的较大矩形。</li>
<li> fixed: 超分至固定宽高，强制缩放。</li>
<li> percent: 超分倍率，可以为小数。</li>
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set 输出图片模式，默认percent。
<li> aspect: 超分至指定宽高的较大矩形。</li>
<li> fixed: 超分至固定宽高，强制缩放。</li>
<li> percent: 超分倍率，可以为小数。</li>
     * @param Mode 输出图片模式，默认percent。
<li> aspect: 超分至指定宽高的较大矩形。</li>
<li> fixed: 超分至固定宽高，强制缩放。</li>
<li> percent: 超分倍率，可以为小数。</li>
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get 超分倍率，可以为小数。 
     * @return Percent 超分倍率，可以为小数。
     */
    public Float getPercent() {
        return this.Percent;
    }

    /**
     * Set 超分倍率，可以为小数。
     * @param Percent 超分倍率，可以为小数。
     */
    public void setPercent(Float Percent) {
        this.Percent = Percent;
    }

    /**
     * Get 目标图片宽度，不能超过4096。 
     * @return Width 目标图片宽度，不能超过4096。
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set 目标图片宽度，不能超过4096。
     * @param Width 目标图片宽度，不能超过4096。
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get 目标图片高度，不能超过4096。 
     * @return Height 目标图片高度，不能超过4096。
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set 目标图片高度，不能超过4096。
     * @param Height 目标图片高度，不能超过4096。
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    public AdvancedSuperResolutionConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AdvancedSuperResolutionConfig(AdvancedSuperResolutionConfig source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Mode != null) {
            this.Mode = new String(source.Mode);
        }
        if (source.Percent != null) {
            this.Percent = new Float(source.Percent);
        }
        if (source.Width != null) {
            this.Width = new Long(source.Width);
        }
        if (source.Height != null) {
            this.Height = new Long(source.Height);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "Percent", this.Percent);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Height", this.Height);

    }
}

