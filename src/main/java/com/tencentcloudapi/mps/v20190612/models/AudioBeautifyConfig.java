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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AudioBeautifyConfig extends AbstractModel{

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
    * 类型，可多选，可选值：
<li>declick：杂音去除</li>
<li>deesser：齿音压制</li>
默认值：declick。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Types")
    @Expose
    private String [] Types;

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
     * Get 类型，可多选，可选值：
<li>declick：杂音去除</li>
<li>deesser：齿音压制</li>
默认值：declick。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Types 类型，可多选，可选值：
<li>declick：杂音去除</li>
<li>deesser：齿音压制</li>
默认值：declick。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getTypes() {
        return this.Types;
    }

    /**
     * Set 类型，可多选，可选值：
<li>declick：杂音去除</li>
<li>deesser：齿音压制</li>
默认值：declick。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Types 类型，可多选，可选值：
<li>declick：杂音去除</li>
<li>deesser：齿音压制</li>
默认值：declick。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTypes(String [] Types) {
        this.Types = Types;
    }

    public AudioBeautifyConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AudioBeautifyConfig(AudioBeautifyConfig source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.Types != null) {
            this.Types = new String[source.Types.length];
            for (int i = 0; i < source.Types.length; i++) {
                this.Types[i] = new String(source.Types[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamArraySimple(map, prefix + "Types.", this.Types);

    }
}

