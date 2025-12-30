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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ContractSummaryInfo extends AbstractModel {

    /**
    * 字段 key
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * 字段值
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * 主体信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Identity")
    @Expose
    private Identity Identity;

    /**
     * Get 字段 key 
     * @return Key 字段 key
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set 字段 key
     * @param Key 字段 key
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get 字段值 
     * @return Value 字段值
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set 字段值
     * @param Value 字段值
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get 主体信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Identity 主体信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Identity getIdentity() {
        return this.Identity;
    }

    /**
     * Set 主体信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Identity 主体信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIdentity(Identity Identity) {
        this.Identity = Identity;
    }

    public ContractSummaryInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ContractSummaryInfo(ContractSummaryInfo source) {
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.Identity != null) {
            this.Identity = new Identity(source.Identity);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamObj(map, prefix + "Identity.", this.Identity);

    }
}

