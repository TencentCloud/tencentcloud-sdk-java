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

public class Hsts extends AbstractModel{

    /**
    * 是否开启，on或off。
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * MaxAge数值。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxAge")
    @Expose
    private Long MaxAge;

    /**
    * 是否包含子域名，on或off。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IncludeSubDomains")
    @Expose
    private String IncludeSubDomains;

    /**
     * Get 是否开启，on或off。 
     * @return Switch 是否开启，on或off。
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set 是否开启，on或off。
     * @param Switch 是否开启，on或off。
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get MaxAge数值。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxAge MaxAge数值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMaxAge() {
        return this.MaxAge;
    }

    /**
     * Set MaxAge数值。
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxAge MaxAge数值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaxAge(Long MaxAge) {
        this.MaxAge = MaxAge;
    }

    /**
     * Get 是否包含子域名，on或off。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IncludeSubDomains 是否包含子域名，on或off。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIncludeSubDomains() {
        return this.IncludeSubDomains;
    }

    /**
     * Set 是否包含子域名，on或off。
注意：此字段可能返回 null，表示取不到有效值。
     * @param IncludeSubDomains 是否包含子域名，on或off。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIncludeSubDomains(String IncludeSubDomains) {
        this.IncludeSubDomains = IncludeSubDomains;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "MaxAge", this.MaxAge);
        this.setParamSimple(map, prefix + "IncludeSubDomains", this.IncludeSubDomains);

    }
}

