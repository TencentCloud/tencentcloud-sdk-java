/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.databuddy.v20260715.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AsyncActionRsp extends AbstractModel {

    /**
    * 多个操作项的结果列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ActionResults")
    @Expose
    private RunActionBrief [] ActionResults;

    /**
     * Get 多个操作项的结果列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ActionResults 多个操作项的结果列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RunActionBrief [] getActionResults() {
        return this.ActionResults;
    }

    /**
     * Set 多个操作项的结果列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param ActionResults 多个操作项的结果列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setActionResults(RunActionBrief [] ActionResults) {
        this.ActionResults = ActionResults;
    }

    public AsyncActionRsp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AsyncActionRsp(AsyncActionRsp source) {
        if (source.ActionResults != null) {
            this.ActionResults = new RunActionBrief[source.ActionResults.length];
            for (int i = 0; i < source.ActionResults.length; i++) {
                this.ActionResults[i] = new RunActionBrief(source.ActionResults[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "ActionResults.", this.ActionResults);

    }
}

