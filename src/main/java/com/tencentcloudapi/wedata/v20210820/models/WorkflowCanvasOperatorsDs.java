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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WorkflowCanvasOperatorsDs extends AbstractModel {

    /**
    * 操作人ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OperatorId")
    @Expose
    private Long OperatorId;

    /**
    * 操作人名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OperatorName")
    @Expose
    private String OperatorName;

    /**
     * Get 操作人ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OperatorId 操作人ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getOperatorId() {
        return this.OperatorId;
    }

    /**
     * Set 操作人ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param OperatorId 操作人ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOperatorId(Long OperatorId) {
        this.OperatorId = OperatorId;
    }

    /**
     * Get 操作人名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OperatorName 操作人名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOperatorName() {
        return this.OperatorName;
    }

    /**
     * Set 操作人名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param OperatorName 操作人名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOperatorName(String OperatorName) {
        this.OperatorName = OperatorName;
    }

    public WorkflowCanvasOperatorsDs() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WorkflowCanvasOperatorsDs(WorkflowCanvasOperatorsDs source) {
        if (source.OperatorId != null) {
            this.OperatorId = new Long(source.OperatorId);
        }
        if (source.OperatorName != null) {
            this.OperatorName = new String(source.OperatorName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OperatorId", this.OperatorId);
        this.setParamSimple(map, prefix + "OperatorName", this.OperatorName);

    }
}

