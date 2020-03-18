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
package com.tencentcloudapi.ecdn.v20191012.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IpFreqLimit extends AbstractModel{

    /**
    * IP限频配置开关，on或off。
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * 每秒请求数。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Qps")
    @Expose
    private Long Qps;

    /**
     * Get IP限频配置开关，on或off。 
     * @return Switch IP限频配置开关，on或off。
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set IP限频配置开关，on或off。
     * @param Switch IP限频配置开关，on或off。
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get 每秒请求数。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Qps 每秒请求数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getQps() {
        return this.Qps;
    }

    /**
     * Set 每秒请求数。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Qps 每秒请求数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQps(Long Qps) {
        this.Qps = Qps;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "Qps", this.Qps);

    }
}

