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
package com.tencentcloudapi.billing.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AnalyseActionTypeDetail extends AbstractModel {

    /**
    * 交易类型code
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ActionType")
    @Expose
    private String ActionType;

    /**
    * 交易类型Name
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ActionTypeName")
    @Expose
    private String ActionTypeName;

    /**
     * Get 交易类型code
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ActionType 交易类型code
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getActionType() {
        return this.ActionType;
    }

    /**
     * Set 交易类型code
注意：此字段可能返回 null，表示取不到有效值。
     * @param ActionType 交易类型code
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setActionType(String ActionType) {
        this.ActionType = ActionType;
    }

    /**
     * Get 交易类型Name
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ActionTypeName 交易类型Name
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getActionTypeName() {
        return this.ActionTypeName;
    }

    /**
     * Set 交易类型Name
注意：此字段可能返回 null，表示取不到有效值。
     * @param ActionTypeName 交易类型Name
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setActionTypeName(String ActionTypeName) {
        this.ActionTypeName = ActionTypeName;
    }

    public AnalyseActionTypeDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AnalyseActionTypeDetail(AnalyseActionTypeDetail source) {
        if (source.ActionType != null) {
            this.ActionType = new String(source.ActionType);
        }
        if (source.ActionTypeName != null) {
            this.ActionTypeName = new String(source.ActionTypeName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ActionType", this.ActionType);
        this.setParamSimple(map, prefix + "ActionTypeName", this.ActionTypeName);

    }
}

