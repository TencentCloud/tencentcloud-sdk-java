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

public class BeautyEffectItemConfig extends AbstractModel {

    /**
    * 类型名称。取值如下：

<li>Whiten：美白</li>
<li>Smooth：磨皮</li>
<li>BeautyThinFace：瘦脸</li>
<li>NatureFace：自然脸型</li>
<li>VFace：V脸</li>
<li>EnlargeEye：大眼</li>
<li>EyeLighten：亮眼</li>
<li>RemoveEyeBags：祛眼袋</li>
<li>ThinNose：瘦鼻</li>
<li>RemoveLawLine：祛法令纹</li>
<li>ToothWhiten：牙齿美白</li>


    */
    @SerializedName("Type")
    @Expose
    private String Type;

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
    * 效果强度，值范围：[0, 100]。
    */
    @SerializedName("Value")
    @Expose
    private Long Value;

    /**
     * Get 类型名称。取值如下：

<li>Whiten：美白</li>
<li>Smooth：磨皮</li>
<li>BeautyThinFace：瘦脸</li>
<li>NatureFace：自然脸型</li>
<li>VFace：V脸</li>
<li>EnlargeEye：大眼</li>
<li>EyeLighten：亮眼</li>
<li>RemoveEyeBags：祛眼袋</li>
<li>ThinNose：瘦鼻</li>
<li>RemoveLawLine：祛法令纹</li>
<li>ToothWhiten：牙齿美白</li>

 
     * @return Type 类型名称。取值如下：

<li>Whiten：美白</li>
<li>Smooth：磨皮</li>
<li>BeautyThinFace：瘦脸</li>
<li>NatureFace：自然脸型</li>
<li>VFace：V脸</li>
<li>EnlargeEye：大眼</li>
<li>EyeLighten：亮眼</li>
<li>RemoveEyeBags：祛眼袋</li>
<li>ThinNose：瘦鼻</li>
<li>RemoveLawLine：祛法令纹</li>
<li>ToothWhiten：牙齿美白</li>


     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 类型名称。取值如下：

<li>Whiten：美白</li>
<li>Smooth：磨皮</li>
<li>BeautyThinFace：瘦脸</li>
<li>NatureFace：自然脸型</li>
<li>VFace：V脸</li>
<li>EnlargeEye：大眼</li>
<li>EyeLighten：亮眼</li>
<li>RemoveEyeBags：祛眼袋</li>
<li>ThinNose：瘦鼻</li>
<li>RemoveLawLine：祛法令纹</li>
<li>ToothWhiten：牙齿美白</li>


     * @param Type 类型名称。取值如下：

<li>Whiten：美白</li>
<li>Smooth：磨皮</li>
<li>BeautyThinFace：瘦脸</li>
<li>NatureFace：自然脸型</li>
<li>VFace：V脸</li>
<li>EnlargeEye：大眼</li>
<li>EyeLighten：亮眼</li>
<li>RemoveEyeBags：祛眼袋</li>
<li>ThinNose：瘦鼻</li>
<li>RemoveLawLine：祛法令纹</li>
<li>ToothWhiten：牙齿美白</li>


     */
    public void setType(String Type) {
        this.Type = Type;
    }

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
     * Get 效果强度，值范围：[0, 100]。 
     * @return Value 效果强度，值范围：[0, 100]。
     */
    public Long getValue() {
        return this.Value;
    }

    /**
     * Set 效果强度，值范围：[0, 100]。
     * @param Value 效果强度，值范围：[0, 100]。
     */
    public void setValue(Long Value) {
        this.Value = Value;
    }

    public BeautyEffectItemConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BeautyEffectItemConfig(BeautyEffectItemConfig source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.Value != null) {
            this.Value = new Long(source.Value);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "Value", this.Value);

    }
}

