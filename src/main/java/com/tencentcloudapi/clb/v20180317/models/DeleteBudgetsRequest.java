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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteBudgetsRequest extends AbstractModel {

    /**
    * <p>要删除的Budget ID列表。</p>
    */
    @SerializedName("BudgetIds")
    @Expose
    private String [] BudgetIds;

    /**
     * Get <p>要删除的Budget ID列表。</p> 
     * @return BudgetIds <p>要删除的Budget ID列表。</p>
     */
    public String [] getBudgetIds() {
        return this.BudgetIds;
    }

    /**
     * Set <p>要删除的Budget ID列表。</p>
     * @param BudgetIds <p>要删除的Budget ID列表。</p>
     */
    public void setBudgetIds(String [] BudgetIds) {
        this.BudgetIds = BudgetIds;
    }

    public DeleteBudgetsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteBudgetsRequest(DeleteBudgetsRequest source) {
        if (source.BudgetIds != null) {
            this.BudgetIds = new String[source.BudgetIds.length];
            for (int i = 0; i < source.BudgetIds.length; i++) {
                this.BudgetIds[i] = new String(source.BudgetIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "BudgetIds.", this.BudgetIds);

    }
}

