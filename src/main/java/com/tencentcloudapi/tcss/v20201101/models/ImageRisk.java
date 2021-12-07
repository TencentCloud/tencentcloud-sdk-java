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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImageRisk extends AbstractModel{

    /**
    * 高危行为
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Behavior")
    @Expose
    private Long Behavior;

    /**
    * 种类
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 风险等级
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Level")
    @Expose
    private String Level;

    /**
    * 描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Desc")
    @Expose
    private String Desc;

    /**
    * 解决方案
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstructionContent")
    @Expose
    private String InstructionContent;

    /**
     * Get 高危行为
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Behavior 高危行为
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getBehavior() {
        return this.Behavior;
    }

    /**
     * Set 高危行为
注意：此字段可能返回 null，表示取不到有效值。
     * @param Behavior 高危行为
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBehavior(Long Behavior) {
        this.Behavior = Behavior;
    }

    /**
     * Get 种类
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type 种类
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 种类
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type 种类
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 风险等级
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Level 风险等级
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLevel() {
        return this.Level;
    }

    /**
     * Set 风险等级
注意：此字段可能返回 null，表示取不到有效值。
     * @param Level 风险等级
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLevel(String Level) {
        this.Level = Level;
    }

    /**
     * Get 描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Desc 描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDesc() {
        return this.Desc;
    }

    /**
     * Set 描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Desc 描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    /**
     * Get 解决方案
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstructionContent 解决方案
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstructionContent() {
        return this.InstructionContent;
    }

    /**
     * Set 解决方案
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstructionContent 解决方案
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstructionContent(String InstructionContent) {
        this.InstructionContent = InstructionContent;
    }

    public ImageRisk() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageRisk(ImageRisk source) {
        if (source.Behavior != null) {
            this.Behavior = new Long(source.Behavior);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.Level != null) {
            this.Level = new String(source.Level);
        }
        if (source.Desc != null) {
            this.Desc = new String(source.Desc);
        }
        if (source.InstructionContent != null) {
            this.InstructionContent = new String(source.InstructionContent);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Behavior", this.Behavior);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "Desc", this.Desc);
        this.setParamSimple(map, prefix + "InstructionContent", this.InstructionContent);

    }
}

