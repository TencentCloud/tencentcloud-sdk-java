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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MaxAge extends AbstractModel{

    /**
    * 浏览器缓存配置开关
on：开启
off：关闭
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * MaxAge 规则
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxAgeRules")
    @Expose
    private MaxAgeRule [] MaxAgeRules;

    /**
     * Get 浏览器缓存配置开关
on：开启
off：关闭
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Switch 浏览器缓存配置开关
on：开启
off：关闭
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set 浏览器缓存配置开关
on：开启
off：关闭
注意：此字段可能返回 null，表示取不到有效值。
     * @param Switch 浏览器缓存配置开关
on：开启
off：关闭
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get MaxAge 规则
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxAgeRules MaxAge 规则
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MaxAgeRule [] getMaxAgeRules() {
        return this.MaxAgeRules;
    }

    /**
     * Set MaxAge 规则
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxAgeRules MaxAge 规则
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaxAgeRules(MaxAgeRule [] MaxAgeRules) {
        this.MaxAgeRules = MaxAgeRules;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamArrayObj(map, prefix + "MaxAgeRules.", this.MaxAgeRules);

    }
}

