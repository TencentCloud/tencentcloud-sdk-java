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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePolicyConditionListConfigManualContinueTime extends AbstractModel{

    /**
    * 默认持续时间，单位：秒
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Default")
    @Expose
    private Long Default;

    /**
    * 可选持续时间，单位：秒
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Keys")
    @Expose
    private Long [] Keys;

    /**
    * 是否必须
    */
    @SerializedName("Need")
    @Expose
    private Boolean Need;

    /**
     * Get 默认持续时间，单位：秒
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Default 默认持续时间，单位：秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDefault() {
        return this.Default;
    }

    /**
     * Set 默认持续时间，单位：秒
注意：此字段可能返回 null，表示取不到有效值。
     * @param Default 默认持续时间，单位：秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDefault(Long Default) {
        this.Default = Default;
    }

    /**
     * Get 可选持续时间，单位：秒
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Keys 可选持续时间，单位：秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long [] getKeys() {
        return this.Keys;
    }

    /**
     * Set 可选持续时间，单位：秒
注意：此字段可能返回 null，表示取不到有效值。
     * @param Keys 可选持续时间，单位：秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKeys(Long [] Keys) {
        this.Keys = Keys;
    }

    /**
     * Get 是否必须 
     * @return Need 是否必须
     */
    public Boolean getNeed() {
        return this.Need;
    }

    /**
     * Set 是否必须
     * @param Need 是否必须
     */
    public void setNeed(Boolean Need) {
        this.Need = Need;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Default", this.Default);
        this.setParamArraySimple(map, prefix + "Keys.", this.Keys);
        this.setParamSimple(map, prefix + "Need", this.Need);

    }
}

