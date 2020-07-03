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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RegistryStatus extends AbstractModel{

    /**
    * 实例的Id
    */
    @SerializedName("RegistryId")
    @Expose
    private String RegistryId;

    /**
    * 实例的状态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 附加状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Conditions")
    @Expose
    private RegistryCondition [] Conditions;

    /**
     * Get 实例的Id 
     * @return RegistryId 实例的Id
     */
    public String getRegistryId() {
        return this.RegistryId;
    }

    /**
     * Set 实例的Id
     * @param RegistryId 实例的Id
     */
    public void setRegistryId(String RegistryId) {
        this.RegistryId = RegistryId;
    }

    /**
     * Get 实例的状态 
     * @return Status 实例的状态
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 实例的状态
     * @param Status 实例的状态
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 附加状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Conditions 附加状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RegistryCondition [] getConditions() {
        return this.Conditions;
    }

    /**
     * Set 附加状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param Conditions 附加状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConditions(RegistryCondition [] Conditions) {
        this.Conditions = Conditions;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RegistryId", this.RegistryId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArrayObj(map, prefix + "Conditions.", this.Conditions);

    }
}

