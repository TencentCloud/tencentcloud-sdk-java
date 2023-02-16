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

public class ColorEnhanceInfo extends AbstractModel{

    /**
    * 色彩增强控制开关，可选值：
<li>ON：开启综合增强；</li>
<li>OFF：关闭综合增强。</li>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * 色彩增强类型，仅当色彩增强控制开关为 ON 时有效，可选值：
<li>weak：轻色彩增强；</li>
<li>normal：正常色彩增强；</li>
<li>strong：强色彩增强。</li>
默认值：weak。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get 色彩增强控制开关，可选值：
<li>ON：开启综合增强；</li>
<li>OFF：关闭综合增强。</li> 
     * @return Switch 色彩增强控制开关，可选值：
<li>ON：开启综合增强；</li>
<li>OFF：关闭综合增强。</li>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set 色彩增强控制开关，可选值：
<li>ON：开启综合增强；</li>
<li>OFF：关闭综合增强。</li>
     * @param Switch 色彩增强控制开关，可选值：
<li>ON：开启综合增强；</li>
<li>OFF：关闭综合增强。</li>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get 色彩增强类型，仅当色彩增强控制开关为 ON 时有效，可选值：
<li>weak：轻色彩增强；</li>
<li>normal：正常色彩增强；</li>
<li>strong：强色彩增强。</li>
默认值：weak。 
     * @return Type 色彩增强类型，仅当色彩增强控制开关为 ON 时有效，可选值：
<li>weak：轻色彩增强；</li>
<li>normal：正常色彩增强；</li>
<li>strong：强色彩增强。</li>
默认值：weak。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 色彩增强类型，仅当色彩增强控制开关为 ON 时有效，可选值：
<li>weak：轻色彩增强；</li>
<li>normal：正常色彩增强；</li>
<li>strong：强色彩增强。</li>
默认值：weak。
     * @param Type 色彩增强类型，仅当色彩增强控制开关为 ON 时有效，可选值：
<li>weak：轻色彩增强；</li>
<li>normal：正常色彩增强；</li>
<li>strong：强色彩增强。</li>
默认值：weak。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    public ColorEnhanceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ColorEnhanceInfo(ColorEnhanceInfo source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

