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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AgentStatus extends AbstractModel{

    /**
    * 运行中的数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Running")
    @Expose
    private Long Running;

    /**
    * 异常的数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Abnormal")
    @Expose
    private Long Abnormal;

    /**
    * 操作中的数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InOperation")
    @Expose
    private Long InOperation;

    /**
     * Get 运行中的数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Running 运行中的数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRunning() {
        return this.Running;
    }

    /**
     * Set 运行中的数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param Running 运行中的数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRunning(Long Running) {
        this.Running = Running;
    }

    /**
     * Get 异常的数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Abnormal 异常的数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAbnormal() {
        return this.Abnormal;
    }

    /**
     * Set 异常的数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param Abnormal 异常的数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAbnormal(Long Abnormal) {
        this.Abnormal = Abnormal;
    }

    /**
     * Get 操作中的数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InOperation 操作中的数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getInOperation() {
        return this.InOperation;
    }

    /**
     * Set 操作中的数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param InOperation 操作中的数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInOperation(Long InOperation) {
        this.InOperation = InOperation;
    }

    public AgentStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AgentStatus(AgentStatus source) {
        if (source.Running != null) {
            this.Running = new Long(source.Running);
        }
        if (source.Abnormal != null) {
            this.Abnormal = new Long(source.Abnormal);
        }
        if (source.InOperation != null) {
            this.InOperation = new Long(source.InOperation);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Running", this.Running);
        this.setParamSimple(map, prefix + "Abnormal", this.Abnormal);
        this.setParamSimple(map, prefix + "InOperation", this.InOperation);

    }
}

