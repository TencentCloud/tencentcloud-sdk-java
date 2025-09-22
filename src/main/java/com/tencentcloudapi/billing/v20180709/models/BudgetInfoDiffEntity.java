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

public class BudgetInfoDiffEntity extends AbstractModel {

    /**
    * 变更属性
    */
    @SerializedName("Property")
    @Expose
    private String Property;

    /**
    * 变更前内容
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Before")
    @Expose
    private String Before;

    /**
    * 变更后内容
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("After")
    @Expose
    private String After;

    /**
     * Get 变更属性 
     * @return Property 变更属性
     */
    public String getProperty() {
        return this.Property;
    }

    /**
     * Set 变更属性
     * @param Property 变更属性
     */
    public void setProperty(String Property) {
        this.Property = Property;
    }

    /**
     * Get 变更前内容
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Before 变更前内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBefore() {
        return this.Before;
    }

    /**
     * Set 变更前内容
注意：此字段可能返回 null，表示取不到有效值。
     * @param Before 变更前内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBefore(String Before) {
        this.Before = Before;
    }

    /**
     * Get 变更后内容
注意：此字段可能返回 null，表示取不到有效值。 
     * @return After 变更后内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAfter() {
        return this.After;
    }

    /**
     * Set 变更后内容
注意：此字段可能返回 null，表示取不到有效值。
     * @param After 变更后内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAfter(String After) {
        this.After = After;
    }

    public BudgetInfoDiffEntity() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BudgetInfoDiffEntity(BudgetInfoDiffEntity source) {
        if (source.Property != null) {
            this.Property = new String(source.Property);
        }
        if (source.Before != null) {
            this.Before = new String(source.Before);
        }
        if (source.After != null) {
            this.After = new String(source.After);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Property", this.Property);
        this.setParamSimple(map, prefix + "Before", this.Before);
        this.setParamSimple(map, prefix + "After", this.After);

    }
}

