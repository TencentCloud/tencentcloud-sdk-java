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

public class FrameRateWithDenInfo extends AbstractModel {

    /**
    * 插帧帧率配置控制开关，可选值：
<li>ON：开启；</li>
<li>OFF：关闭。</li>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * 帧率分子，取值范围：非负数，除以分母后小于100，单位：Hz。 默认值 0。 注意：对于转码，该参数会覆盖 VideoTemplate 内部的 Fps。
    */
    @SerializedName("FpsNum")
    @Expose
    private Long FpsNum;

    /**
    * 帧率分母，取值范围：大于等于1。 默认值 1。
    */
    @SerializedName("FpsDen")
    @Expose
    private Long FpsDen;

    /**
     * Get 插帧帧率配置控制开关，可选值：
<li>ON：开启；</li>
<li>OFF：关闭。</li> 
     * @return Switch 插帧帧率配置控制开关，可选值：
<li>ON：开启；</li>
<li>OFF：关闭。</li>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set 插帧帧率配置控制开关，可选值：
<li>ON：开启；</li>
<li>OFF：关闭。</li>
     * @param Switch 插帧帧率配置控制开关，可选值：
<li>ON：开启；</li>
<li>OFF：关闭。</li>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get 帧率分子，取值范围：非负数，除以分母后小于100，单位：Hz。 默认值 0。 注意：对于转码，该参数会覆盖 VideoTemplate 内部的 Fps。 
     * @return FpsNum 帧率分子，取值范围：非负数，除以分母后小于100，单位：Hz。 默认值 0。 注意：对于转码，该参数会覆盖 VideoTemplate 内部的 Fps。
     */
    public Long getFpsNum() {
        return this.FpsNum;
    }

    /**
     * Set 帧率分子，取值范围：非负数，除以分母后小于100，单位：Hz。 默认值 0。 注意：对于转码，该参数会覆盖 VideoTemplate 内部的 Fps。
     * @param FpsNum 帧率分子，取值范围：非负数，除以分母后小于100，单位：Hz。 默认值 0。 注意：对于转码，该参数会覆盖 VideoTemplate 内部的 Fps。
     */
    public void setFpsNum(Long FpsNum) {
        this.FpsNum = FpsNum;
    }

    /**
     * Get 帧率分母，取值范围：大于等于1。 默认值 1。 
     * @return FpsDen 帧率分母，取值范围：大于等于1。 默认值 1。
     */
    public Long getFpsDen() {
        return this.FpsDen;
    }

    /**
     * Set 帧率分母，取值范围：大于等于1。 默认值 1。
     * @param FpsDen 帧率分母，取值范围：大于等于1。 默认值 1。
     */
    public void setFpsDen(Long FpsDen) {
        this.FpsDen = FpsDen;
    }

    public FrameRateWithDenInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FrameRateWithDenInfo(FrameRateWithDenInfo source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.FpsNum != null) {
            this.FpsNum = new Long(source.FpsNum);
        }
        if (source.FpsDen != null) {
            this.FpsDen = new Long(source.FpsDen);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "FpsNum", this.FpsNum);
        this.setParamSimple(map, prefix + "FpsDen", this.FpsDen);

    }
}

