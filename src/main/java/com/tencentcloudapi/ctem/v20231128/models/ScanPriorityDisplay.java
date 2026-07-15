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
package com.tencentcloudapi.ctem.v20231128.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ScanPriorityDisplay extends AbstractModel {

    /**
    * <p>只对新增资产进行漏洞扫描</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OnlyScanNewAsset")
    @Expose
    private Boolean OnlyScanNewAsset;

    /**
    * <p>启用的优先级规则(有序):new_asset,high_risk_port,admin_panel,high_risk_fingerprint</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PriorityRules")
    @Expose
    private String [] PriorityRules;

    /**
     * Get <p>只对新增资产进行漏洞扫描</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OnlyScanNewAsset <p>只对新增资产进行漏洞扫描</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getOnlyScanNewAsset() {
        return this.OnlyScanNewAsset;
    }

    /**
     * Set <p>只对新增资产进行漏洞扫描</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param OnlyScanNewAsset <p>只对新增资产进行漏洞扫描</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOnlyScanNewAsset(Boolean OnlyScanNewAsset) {
        this.OnlyScanNewAsset = OnlyScanNewAsset;
    }

    /**
     * Get <p>启用的优先级规则(有序):new_asset,high_risk_port,admin_panel,high_risk_fingerprint</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PriorityRules <p>启用的优先级规则(有序):new_asset,high_risk_port,admin_panel,high_risk_fingerprint</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getPriorityRules() {
        return this.PriorityRules;
    }

    /**
     * Set <p>启用的优先级规则(有序):new_asset,high_risk_port,admin_panel,high_risk_fingerprint</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param PriorityRules <p>启用的优先级规则(有序):new_asset,high_risk_port,admin_panel,high_risk_fingerprint</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPriorityRules(String [] PriorityRules) {
        this.PriorityRules = PriorityRules;
    }

    public ScanPriorityDisplay() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScanPriorityDisplay(ScanPriorityDisplay source) {
        if (source.OnlyScanNewAsset != null) {
            this.OnlyScanNewAsset = new Boolean(source.OnlyScanNewAsset);
        }
        if (source.PriorityRules != null) {
            this.PriorityRules = new String[source.PriorityRules.length];
            for (int i = 0; i < source.PriorityRules.length; i++) {
                this.PriorityRules[i] = new String(source.PriorityRules[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OnlyScanNewAsset", this.OnlyScanNewAsset);
        this.setParamArraySimple(map, prefix + "PriorityRules.", this.PriorityRules);

    }
}

