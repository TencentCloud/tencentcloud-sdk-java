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

public class AssociateBudgetRequest extends AbstractModel {

    /**
    * <p>Budget ID。</p>
    */
    @SerializedName("BudgetId")
    @Expose
    private String BudgetId;

    /**
    * <p>要关联的资源列表。</p><p>仅支持企业型模型路由实例和企业型实例下的Key。同一请求内不允许重复资源；资源已关联其他Budget时将替换为新的Budget。</p>
    */
    @SerializedName("Resources")
    @Expose
    private BudgetResource [] Resources;

    /**
     * Get <p>Budget ID。</p> 
     * @return BudgetId <p>Budget ID。</p>
     */
    public String getBudgetId() {
        return this.BudgetId;
    }

    /**
     * Set <p>Budget ID。</p>
     * @param BudgetId <p>Budget ID。</p>
     */
    public void setBudgetId(String BudgetId) {
        this.BudgetId = BudgetId;
    }

    /**
     * Get <p>要关联的资源列表。</p><p>仅支持企业型模型路由实例和企业型实例下的Key。同一请求内不允许重复资源；资源已关联其他Budget时将替换为新的Budget。</p> 
     * @return Resources <p>要关联的资源列表。</p><p>仅支持企业型模型路由实例和企业型实例下的Key。同一请求内不允许重复资源；资源已关联其他Budget时将替换为新的Budget。</p>
     */
    public BudgetResource [] getResources() {
        return this.Resources;
    }

    /**
     * Set <p>要关联的资源列表。</p><p>仅支持企业型模型路由实例和企业型实例下的Key。同一请求内不允许重复资源；资源已关联其他Budget时将替换为新的Budget。</p>
     * @param Resources <p>要关联的资源列表。</p><p>仅支持企业型模型路由实例和企业型实例下的Key。同一请求内不允许重复资源；资源已关联其他Budget时将替换为新的Budget。</p>
     */
    public void setResources(BudgetResource [] Resources) {
        this.Resources = Resources;
    }

    public AssociateBudgetRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssociateBudgetRequest(AssociateBudgetRequest source) {
        if (source.BudgetId != null) {
            this.BudgetId = new String(source.BudgetId);
        }
        if (source.Resources != null) {
            this.Resources = new BudgetResource[source.Resources.length];
            for (int i = 0; i < source.Resources.length; i++) {
                this.Resources[i] = new BudgetResource(source.Resources[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BudgetId", this.BudgetId);
        this.setParamArrayObj(map, prefix + "Resources.", this.Resources);

    }
}

