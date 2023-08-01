/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.oceanus.v20190422.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SlotSharingGroup extends AbstractModel{

    /**
    * SlotSharingGroup的名字
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * SlotSharingGroup的规格
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Spec")
    @Expose
    private SlotSharingGroupSpec Spec;

    /**
    * SlotSharingGroup的描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get SlotSharingGroup的名字
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name SlotSharingGroup的名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set SlotSharingGroup的名字
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name SlotSharingGroup的名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get SlotSharingGroup的规格
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Spec SlotSharingGroup的规格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SlotSharingGroupSpec getSpec() {
        return this.Spec;
    }

    /**
     * Set SlotSharingGroup的规格
注意：此字段可能返回 null，表示取不到有效值。
     * @param Spec SlotSharingGroup的规格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSpec(SlotSharingGroupSpec Spec) {
        this.Spec = Spec;
    }

    /**
     * Get SlotSharingGroup的描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description SlotSharingGroup的描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set SlotSharingGroup的描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description SlotSharingGroup的描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public SlotSharingGroup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SlotSharingGroup(SlotSharingGroup source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Spec != null) {
            this.Spec = new SlotSharingGroupSpec(source.Spec);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamObj(map, prefix + "Spec.", this.Spec);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

