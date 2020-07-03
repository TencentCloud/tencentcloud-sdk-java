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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceOperator extends AbstractModel{

    /**
    * 实例id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 实例禁止的操作
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeniedActions")
    @Expose
    private OperatorAction [] DeniedActions;

    /**
     * Get 实例id 
     * @return InstanceId 实例id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例id
     * @param InstanceId 实例id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 实例禁止的操作
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeniedActions 实例禁止的操作
注意：此字段可能返回 null，表示取不到有效值。
     */
    public OperatorAction [] getDeniedActions() {
        return this.DeniedActions;
    }

    /**
     * Set 实例禁止的操作
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeniedActions 实例禁止的操作
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeniedActions(OperatorAction [] DeniedActions) {
        this.DeniedActions = DeniedActions;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArrayObj(map, prefix + "DeniedActions.", this.DeniedActions);

    }
}

