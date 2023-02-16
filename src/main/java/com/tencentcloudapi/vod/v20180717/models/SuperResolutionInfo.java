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

public class SuperResolutionInfo extends AbstractModel{

    /**
    * 画面超分控制开关，可选值：
<li>ON：开启画面超分；</li>
<li>OFF：关闭画面超分。</li>
当开启画面超分时，默认2倍超分。
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * 画面超分类型，仅当画面超分控制开关为 ON 时有效，可选值：
<li>lq：针对低清晰度有较多噪声视频的超分；</li>
<li>hq：针对高清晰度视频超分。</li>
默认值：lq。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 超分倍数，可选值：2。
默认值：2。
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
     * Get 画面超分控制开关，可选值：
<li>ON：开启画面超分；</li>
<li>OFF：关闭画面超分。</li>
当开启画面超分时，默认2倍超分。 
     * @return Switch 画面超分控制开关，可选值：
<li>ON：开启画面超分；</li>
<li>OFF：关闭画面超分。</li>
当开启画面超分时，默认2倍超分。
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set 画面超分控制开关，可选值：
<li>ON：开启画面超分；</li>
<li>OFF：关闭画面超分。</li>
当开启画面超分时，默认2倍超分。
     * @param Switch 画面超分控制开关，可选值：
<li>ON：开启画面超分；</li>
<li>OFF：关闭画面超分。</li>
当开启画面超分时，默认2倍超分。
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get 画面超分类型，仅当画面超分控制开关为 ON 时有效，可选值：
<li>lq：针对低清晰度有较多噪声视频的超分；</li>
<li>hq：针对高清晰度视频超分。</li>
默认值：lq。 
     * @return Type 画面超分类型，仅当画面超分控制开关为 ON 时有效，可选值：
<li>lq：针对低清晰度有较多噪声视频的超分；</li>
<li>hq：针对高清晰度视频超分。</li>
默认值：lq。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 画面超分类型，仅当画面超分控制开关为 ON 时有效，可选值：
<li>lq：针对低清晰度有较多噪声视频的超分；</li>
<li>hq：针对高清晰度视频超分。</li>
默认值：lq。
     * @param Type 画面超分类型，仅当画面超分控制开关为 ON 时有效，可选值：
<li>lq：针对低清晰度有较多噪声视频的超分；</li>
<li>hq：针对高清晰度视频超分。</li>
默认值：lq。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 超分倍数，可选值：2。
默认值：2。 
     * @return Size 超分倍数，可选值：2。
默认值：2。
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set 超分倍数，可选值：2。
默认值：2。
     * @param Size 超分倍数，可选值：2。
默认值：2。
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    public SuperResolutionInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SuperResolutionInfo(SuperResolutionInfo source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Size != null) {
            this.Size = new Long(source.Size);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Size", this.Size);

    }
}

