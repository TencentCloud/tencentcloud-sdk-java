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
package com.tencentcloudapi.ioa.v20220601.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RulePayload extends AbstractModel {

    /**
    * 条件组
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Groups")
    @Expose
    private RulePayloadItem [] Groups;

    /**
    * 条件关系 or/and
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RelateOption")
    @Expose
    private String RelateOption;

    /**
     * Get 条件组
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Groups 条件组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RulePayloadItem [] getGroups() {
        return this.Groups;
    }

    /**
     * Set 条件组
注意：此字段可能返回 null，表示取不到有效值。
     * @param Groups 条件组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGroups(RulePayloadItem [] Groups) {
        this.Groups = Groups;
    }

    /**
     * Get 条件关系 or/and
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RelateOption 条件关系 or/and
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRelateOption() {
        return this.RelateOption;
    }

    /**
     * Set 条件关系 or/and
注意：此字段可能返回 null，表示取不到有效值。
     * @param RelateOption 条件关系 or/and
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRelateOption(String RelateOption) {
        this.RelateOption = RelateOption;
    }

    public RulePayload() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RulePayload(RulePayload source) {
        if (source.Groups != null) {
            this.Groups = new RulePayloadItem[source.Groups.length];
            for (int i = 0; i < source.Groups.length; i++) {
                this.Groups[i] = new RulePayloadItem(source.Groups[i]);
            }
        }
        if (source.RelateOption != null) {
            this.RelateOption = new String(source.RelateOption);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Groups.", this.Groups);
        this.setParamSimple(map, prefix + "RelateOption", this.RelateOption);

    }
}

