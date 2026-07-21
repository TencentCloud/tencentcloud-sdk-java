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
package com.tencentcloudapi.rce.v20260130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Decision extends AbstractModel {

    /**
    * <p>决策结果</p><ul><li>pass：通过</li><li>review：复审</li><li>reject：拒绝</li></ul>
    */
    @SerializedName("DecisionResult")
    @Expose
    private String DecisionResult;

    /**
     * Get <p>决策结果</p><ul><li>pass：通过</li><li>review：复审</li><li>reject：拒绝</li></ul> 
     * @return DecisionResult <p>决策结果</p><ul><li>pass：通过</li><li>review：复审</li><li>reject：拒绝</li></ul>
     */
    public String getDecisionResult() {
        return this.DecisionResult;
    }

    /**
     * Set <p>决策结果</p><ul><li>pass：通过</li><li>review：复审</li><li>reject：拒绝</li></ul>
     * @param DecisionResult <p>决策结果</p><ul><li>pass：通过</li><li>review：复审</li><li>reject：拒绝</li></ul>
     */
    public void setDecisionResult(String DecisionResult) {
        this.DecisionResult = DecisionResult;
    }

    public Decision() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Decision(Decision source) {
        if (source.DecisionResult != null) {
            this.DecisionResult = new String(source.DecisionResult);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DecisionResult", this.DecisionResult);

    }
}

