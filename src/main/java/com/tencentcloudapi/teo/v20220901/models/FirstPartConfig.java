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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FirstPartConfig extends AbstractModel{

    /**
    * 开关，取值有：
<li>on：开启；</li>
<li>off：关闭。</li>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * 首段包的统计时长，单位是秒，即期望首段包的统计时长是多少，默认5秒。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StatTime")
    @Expose
    private Long StatTime;

    /**
     * Get 开关，取值有：
<li>on：开启；</li>
<li>off：关闭。</li>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Switch 开关，取值有：
<li>on：开启；</li>
<li>off：关闭。</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set 开关，取值有：
<li>on：开启；</li>
<li>off：关闭。</li>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Switch 开关，取值有：
<li>on：开启；</li>
<li>off：关闭。</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get 首段包的统计时长，单位是秒，即期望首段包的统计时长是多少，默认5秒。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StatTime 首段包的统计时长，单位是秒，即期望首段包的统计时长是多少，默认5秒。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatTime() {
        return this.StatTime;
    }

    /**
     * Set 首段包的统计时长，单位是秒，即期望首段包的统计时长是多少，默认5秒。
注意：此字段可能返回 null，表示取不到有效值。
     * @param StatTime 首段包的统计时长，单位是秒，即期望首段包的统计时长是多少，默认5秒。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatTime(Long StatTime) {
        this.StatTime = StatTime;
    }

    public FirstPartConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FirstPartConfig(FirstPartConfig source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.StatTime != null) {
            this.StatTime = new Long(source.StatTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "StatTime", this.StatTime);

    }
}

