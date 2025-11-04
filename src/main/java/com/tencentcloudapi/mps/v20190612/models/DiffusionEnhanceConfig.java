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

public class DiffusionEnhanceConfig extends AbstractModel {

    /**
    * 能力配置开关，可选值：

ON：开启；
OFF：关闭。
默认，OFF。
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * 强度类型，可选值：

weak
normal
strong
默认值：normal。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get 能力配置开关，可选值：

ON：开启；
OFF：关闭。
默认，OFF。 
     * @return Switch 能力配置开关，可选值：

ON：开启；
OFF：关闭。
默认，OFF。
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set 能力配置开关，可选值：

ON：开启；
OFF：关闭。
默认，OFF。
     * @param Switch 能力配置开关，可选值：

ON：开启；
OFF：关闭。
默认，OFF。
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get 强度类型，可选值：

weak
normal
strong
默认值：normal。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type 强度类型，可选值：

weak
normal
strong
默认值：normal。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 强度类型，可选值：

weak
normal
strong
默认值：normal。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type 强度类型，可选值：

weak
normal
strong
默认值：normal。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    public DiffusionEnhanceConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DiffusionEnhanceConfig(DiffusionEnhanceConfig source) {
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

