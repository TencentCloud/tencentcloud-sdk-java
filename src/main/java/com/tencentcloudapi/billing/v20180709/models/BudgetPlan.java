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
package com.tencentcloudapi.billing.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BudgetPlan extends AbstractModel {

    /**
    * 前端页面日期显示
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DateDesc")
    @Expose
    private String DateDesc;

    /**
    * 预算额度
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Quota")
    @Expose
    private String Quota;

    /**
     * Get 前端页面日期显示
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DateDesc 前端页面日期显示
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDateDesc() {
        return this.DateDesc;
    }

    /**
     * Set 前端页面日期显示
注意：此字段可能返回 null，表示取不到有效值。
     * @param DateDesc 前端页面日期显示
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDateDesc(String DateDesc) {
        this.DateDesc = DateDesc;
    }

    /**
     * Get 预算额度
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Quota 预算额度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getQuota() {
        return this.Quota;
    }

    /**
     * Set 预算额度
注意：此字段可能返回 null，表示取不到有效值。
     * @param Quota 预算额度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQuota(String Quota) {
        this.Quota = Quota;
    }

    public BudgetPlan() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BudgetPlan(BudgetPlan source) {
        if (source.DateDesc != null) {
            this.DateDesc = new String(source.DateDesc);
        }
        if (source.Quota != null) {
            this.Quota = new String(source.Quota);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DateDesc", this.DateDesc);
        this.setParamSimple(map, prefix + "Quota", this.Quota);

    }
}

