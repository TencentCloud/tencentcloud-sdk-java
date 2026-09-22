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
package com.tencentcloudapi.workbuddyenterprise.v20260709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class A2ASkillItem extends AbstractModel {

    /**
    * A2A skill ID（加 A2A 前缀与内部 SkillId 概念区分）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("A2ASkillId")
    @Expose
    private String A2ASkillId;

    /**
    * skill 名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * skill 描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get A2A skill ID（加 A2A 前缀与内部 SkillId 概念区分）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return A2ASkillId A2A skill ID（加 A2A 前缀与内部 SkillId 概念区分）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getA2ASkillId() {
        return this.A2ASkillId;
    }

    /**
     * Set A2A skill ID（加 A2A 前缀与内部 SkillId 概念区分）
注意：此字段可能返回 null，表示取不到有效值。
     * @param A2ASkillId A2A skill ID（加 A2A 前缀与内部 SkillId 概念区分）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setA2ASkillId(String A2ASkillId) {
        this.A2ASkillId = A2ASkillId;
    }

    /**
     * Get skill 名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name skill 名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set skill 名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name skill 名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get skill 描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description skill 描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set skill 描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description skill 描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public A2ASkillItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public A2ASkillItem(A2ASkillItem source) {
        if (source.A2ASkillId != null) {
            this.A2ASkillId = new String(source.A2ASkillId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "A2ASkillId", this.A2ASkillId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

