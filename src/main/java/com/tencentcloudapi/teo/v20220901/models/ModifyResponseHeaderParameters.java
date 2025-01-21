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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyResponseHeaderParameters extends AbstractModel {

    /**
    * HTTP 回源头部规则列表。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HeaderActions")
    @Expose
    private HeaderAction [] HeaderActions;

    /**
     * Get HTTP 回源头部规则列表。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HeaderActions HTTP 回源头部规则列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public HeaderAction [] getHeaderActions() {
        return this.HeaderActions;
    }

    /**
     * Set HTTP 回源头部规则列表。
注意：此字段可能返回 null，表示取不到有效值。
     * @param HeaderActions HTTP 回源头部规则列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHeaderActions(HeaderAction [] HeaderActions) {
        this.HeaderActions = HeaderActions;
    }

    public ModifyResponseHeaderParameters() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyResponseHeaderParameters(ModifyResponseHeaderParameters source) {
        if (source.HeaderActions != null) {
            this.HeaderActions = new HeaderAction[source.HeaderActions.length];
            for (int i = 0; i < source.HeaderActions.length; i++) {
                this.HeaderActions[i] = new HeaderAction(source.HeaderActions[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "HeaderActions.", this.HeaderActions);

    }
}

