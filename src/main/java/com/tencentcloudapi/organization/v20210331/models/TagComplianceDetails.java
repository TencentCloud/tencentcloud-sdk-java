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
package com.tencentcloudapi.organization.v20210331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TagComplianceDetails extends AbstractModel {

    /**
    * 合规状态。true-合规，false-不合规
    */
    @SerializedName("ComplianceStatus")
    @Expose
    private Boolean ComplianceStatus;

    /**
    * 值不合规的标签键列表。
    */
    @SerializedName("KeysWithNonCompliantValues")
    @Expose
    private String [] KeysWithNonCompliantValues;

    /**
    * 键不合规的标签键列表。
    */
    @SerializedName("NonCompliantKeys")
    @Expose
    private String [] NonCompliantKeys;

    /**
     * Get 合规状态。true-合规，false-不合规 
     * @return ComplianceStatus 合规状态。true-合规，false-不合规
     */
    public Boolean getComplianceStatus() {
        return this.ComplianceStatus;
    }

    /**
     * Set 合规状态。true-合规，false-不合规
     * @param ComplianceStatus 合规状态。true-合规，false-不合规
     */
    public void setComplianceStatus(Boolean ComplianceStatus) {
        this.ComplianceStatus = ComplianceStatus;
    }

    /**
     * Get 值不合规的标签键列表。 
     * @return KeysWithNonCompliantValues 值不合规的标签键列表。
     */
    public String [] getKeysWithNonCompliantValues() {
        return this.KeysWithNonCompliantValues;
    }

    /**
     * Set 值不合规的标签键列表。
     * @param KeysWithNonCompliantValues 值不合规的标签键列表。
     */
    public void setKeysWithNonCompliantValues(String [] KeysWithNonCompliantValues) {
        this.KeysWithNonCompliantValues = KeysWithNonCompliantValues;
    }

    /**
     * Get 键不合规的标签键列表。 
     * @return NonCompliantKeys 键不合规的标签键列表。
     */
    public String [] getNonCompliantKeys() {
        return this.NonCompliantKeys;
    }

    /**
     * Set 键不合规的标签键列表。
     * @param NonCompliantKeys 键不合规的标签键列表。
     */
    public void setNonCompliantKeys(String [] NonCompliantKeys) {
        this.NonCompliantKeys = NonCompliantKeys;
    }

    public TagComplianceDetails() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TagComplianceDetails(TagComplianceDetails source) {
        if (source.ComplianceStatus != null) {
            this.ComplianceStatus = new Boolean(source.ComplianceStatus);
        }
        if (source.KeysWithNonCompliantValues != null) {
            this.KeysWithNonCompliantValues = new String[source.KeysWithNonCompliantValues.length];
            for (int i = 0; i < source.KeysWithNonCompliantValues.length; i++) {
                this.KeysWithNonCompliantValues[i] = new String(source.KeysWithNonCompliantValues[i]);
            }
        }
        if (source.NonCompliantKeys != null) {
            this.NonCompliantKeys = new String[source.NonCompliantKeys.length];
            for (int i = 0; i < source.NonCompliantKeys.length; i++) {
                this.NonCompliantKeys[i] = new String(source.NonCompliantKeys[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ComplianceStatus", this.ComplianceStatus);
        this.setParamArraySimple(map, prefix + "KeysWithNonCompliantValues.", this.KeysWithNonCompliantValues);
        this.setParamArraySimple(map, prefix + "NonCompliantKeys.", this.NonCompliantKeys);

    }
}

