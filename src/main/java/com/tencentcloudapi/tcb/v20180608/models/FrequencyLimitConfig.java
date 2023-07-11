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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FrequencyLimitConfig extends AbstractModel{

    /**
    * 限额对象 "ConnectionsLimit" 或 "QPSLimit"
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LimitObject")
    @Expose
    private String LimitObject;

    /**
    * 限额配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LimitConfig")
    @Expose
    private String LimitConfig;

    /**
     * Get 限额对象 "ConnectionsLimit" 或 "QPSLimit"
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LimitObject 限额对象 "ConnectionsLimit" 或 "QPSLimit"
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLimitObject() {
        return this.LimitObject;
    }

    /**
     * Set 限额对象 "ConnectionsLimit" 或 "QPSLimit"
注意：此字段可能返回 null，表示取不到有效值。
     * @param LimitObject 限额对象 "ConnectionsLimit" 或 "QPSLimit"
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLimitObject(String LimitObject) {
        this.LimitObject = LimitObject;
    }

    /**
     * Get 限额配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LimitConfig 限额配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLimitConfig() {
        return this.LimitConfig;
    }

    /**
     * Set 限额配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param LimitConfig 限额配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLimitConfig(String LimitConfig) {
        this.LimitConfig = LimitConfig;
    }

    public FrequencyLimitConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FrequencyLimitConfig(FrequencyLimitConfig source) {
        if (source.LimitObject != null) {
            this.LimitObject = new String(source.LimitObject);
        }
        if (source.LimitConfig != null) {
            this.LimitConfig = new String(source.LimitConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LimitObject", this.LimitObject);
        this.setParamSimple(map, prefix + "LimitConfig", this.LimitConfig);

    }
}

