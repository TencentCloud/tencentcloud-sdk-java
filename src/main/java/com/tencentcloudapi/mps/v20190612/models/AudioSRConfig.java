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

public class AudioSRConfig extends AbstractModel {

    /**
    * <p>能力配置开关</p><p>枚举值：</p><ul><li>ON： 开启</li><li>OFF： 关闭</li></ul><p>默认值：OFF</p>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * <p>音频超分类型</p><p>枚举值：</p><ul><li>premium_hd： 臻品高清版</li><li>premium_master： 臻品母带版</li></ul><p>默认值：premium_hd</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>目标采样率</p><p>枚举值：</p><ul><li>44100： 44.1kHz</li><li>48000： 48kHz</li><li>64000： 64kHz</li><li>88200： 88.2kHz</li><li>96000： 96kHz</li><li>192000： 192kHz</li></ul><p>默认值：48000</p><p>其中 192kHz 仅臻品母带版才可以使用</p>
    */
    @SerializedName("Value")
    @Expose
    private Long Value;

    /**
     * Get <p>能力配置开关</p><p>枚举值：</p><ul><li>ON： 开启</li><li>OFF： 关闭</li></ul><p>默认值：OFF</p> 
     * @return Switch <p>能力配置开关</p><p>枚举值：</p><ul><li>ON： 开启</li><li>OFF： 关闭</li></ul><p>默认值：OFF</p>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set <p>能力配置开关</p><p>枚举值：</p><ul><li>ON： 开启</li><li>OFF： 关闭</li></ul><p>默认值：OFF</p>
     * @param Switch <p>能力配置开关</p><p>枚举值：</p><ul><li>ON： 开启</li><li>OFF： 关闭</li></ul><p>默认值：OFF</p>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get <p>音频超分类型</p><p>枚举值：</p><ul><li>premium_hd： 臻品高清版</li><li>premium_master： 臻品母带版</li></ul><p>默认值：premium_hd</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type <p>音频超分类型</p><p>枚举值：</p><ul><li>premium_hd： 臻品高清版</li><li>premium_master： 臻品母带版</li></ul><p>默认值：premium_hd</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>音频超分类型</p><p>枚举值：</p><ul><li>premium_hd： 臻品高清版</li><li>premium_master： 臻品母带版</li></ul><p>默认值：premium_hd</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type <p>音频超分类型</p><p>枚举值：</p><ul><li>premium_hd： 臻品高清版</li><li>premium_master： 臻品母带版</li></ul><p>默认值：premium_hd</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>目标采样率</p><p>枚举值：</p><ul><li>44100： 44.1kHz</li><li>48000： 48kHz</li><li>64000： 64kHz</li><li>88200： 88.2kHz</li><li>96000： 96kHz</li><li>192000： 192kHz</li></ul><p>默认值：48000</p><p>其中 192kHz 仅臻品母带版才可以使用</p> 
     * @return Value <p>目标采样率</p><p>枚举值：</p><ul><li>44100： 44.1kHz</li><li>48000： 48kHz</li><li>64000： 64kHz</li><li>88200： 88.2kHz</li><li>96000： 96kHz</li><li>192000： 192kHz</li></ul><p>默认值：48000</p><p>其中 192kHz 仅臻品母带版才可以使用</p>
     */
    public Long getValue() {
        return this.Value;
    }

    /**
     * Set <p>目标采样率</p><p>枚举值：</p><ul><li>44100： 44.1kHz</li><li>48000： 48kHz</li><li>64000： 64kHz</li><li>88200： 88.2kHz</li><li>96000： 96kHz</li><li>192000： 192kHz</li></ul><p>默认值：48000</p><p>其中 192kHz 仅臻品母带版才可以使用</p>
     * @param Value <p>目标采样率</p><p>枚举值：</p><ul><li>44100： 44.1kHz</li><li>48000： 48kHz</li><li>64000： 64kHz</li><li>88200： 88.2kHz</li><li>96000： 96kHz</li><li>192000： 192kHz</li></ul><p>默认值：48000</p><p>其中 192kHz 仅臻品母带版才可以使用</p>
     */
    public void setValue(Long Value) {
        this.Value = Value;
    }

    public AudioSRConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AudioSRConfig(AudioSRConfig source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Value != null) {
            this.Value = new Long(source.Value);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Value", this.Value);

    }
}

