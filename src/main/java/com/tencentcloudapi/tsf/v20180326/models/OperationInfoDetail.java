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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OperationInfoDetail extends AbstractModel{

    /**
    * 不显示的原因
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DisabledReason")
    @Expose
    private String DisabledReason;

    /**
    * 该按钮是否可点击
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
    * 是否显示该按钮
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Supported")
    @Expose
    private Boolean Supported;

    /**
     * Get 不显示的原因
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DisabledReason 不显示的原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDisabledReason() {
        return this.DisabledReason;
    }

    /**
     * Set 不显示的原因
注意：此字段可能返回 null，表示取不到有效值。
     * @param DisabledReason 不显示的原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDisabledReason(String DisabledReason) {
        this.DisabledReason = DisabledReason;
    }

    /**
     * Get 该按钮是否可点击
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Enabled 该按钮是否可点击
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set 该按钮是否可点击
注意：此字段可能返回 null，表示取不到有效值。
     * @param Enabled 该按钮是否可点击
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get 是否显示该按钮
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Supported 是否显示该按钮
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getSupported() {
        return this.Supported;
    }

    /**
     * Set 是否显示该按钮
注意：此字段可能返回 null，表示取不到有效值。
     * @param Supported 是否显示该按钮
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSupported(Boolean Supported) {
        this.Supported = Supported;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DisabledReason", this.DisabledReason);
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamSimple(map, prefix + "Supported", this.Supported);

    }
}

