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
package com.tencentcloudapi.mrs.v20200910.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GeneralExaminationOthers extends AbstractModel{

    /**
    * 面容与表情
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Countenance")
    @Expose
    private KeyValueItem Countenance;

    /**
    * 精神状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MentalStatus")
    @Expose
    private KeyValueItem MentalStatus;

    /**
    * 发育及营养状况
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DevelopmentCondition")
    @Expose
    private KeyValueItem DevelopmentCondition;

    /**
    * 记忆力
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Memory")
    @Expose
    private KeyValueItem Memory;

    /**
    * 臀围
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Hipline")
    @Expose
    private ValueUnitItem Hipline;

    /**
    * 腰臀比
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WaistHipRatio")
    @Expose
    private ValueUnitItem WaistHipRatio;

    /**
    * 生活嗜好
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Addiction")
    @Expose
    private KeyValueItem Addiction;

    /**
    * 生活能力评定
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AbilityOfLifeADL")
    @Expose
    private KeyValueItem AbilityOfLifeADL;

    /**
    * 一般检查其他
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Others")
    @Expose
    private KeyValueItem [] Others;

    /**
    * 胸围
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ChestCircumference")
    @Expose
    private ChestCircumferenceItem ChestCircumference;

    /**
     * Get 面容与表情
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Countenance 面容与表情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public KeyValueItem getCountenance() {
        return this.Countenance;
    }

    /**
     * Set 面容与表情
注意：此字段可能返回 null，表示取不到有效值。
     * @param Countenance 面容与表情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCountenance(KeyValueItem Countenance) {
        this.Countenance = Countenance;
    }

    /**
     * Get 精神状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MentalStatus 精神状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public KeyValueItem getMentalStatus() {
        return this.MentalStatus;
    }

    /**
     * Set 精神状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param MentalStatus 精神状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMentalStatus(KeyValueItem MentalStatus) {
        this.MentalStatus = MentalStatus;
    }

    /**
     * Get 发育及营养状况
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DevelopmentCondition 发育及营养状况
注意：此字段可能返回 null，表示取不到有效值。
     */
    public KeyValueItem getDevelopmentCondition() {
        return this.DevelopmentCondition;
    }

    /**
     * Set 发育及营养状况
注意：此字段可能返回 null，表示取不到有效值。
     * @param DevelopmentCondition 发育及营养状况
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDevelopmentCondition(KeyValueItem DevelopmentCondition) {
        this.DevelopmentCondition = DevelopmentCondition;
    }

    /**
     * Get 记忆力
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Memory 记忆力
注意：此字段可能返回 null，表示取不到有效值。
     */
    public KeyValueItem getMemory() {
        return this.Memory;
    }

    /**
     * Set 记忆力
注意：此字段可能返回 null，表示取不到有效值。
     * @param Memory 记忆力
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMemory(KeyValueItem Memory) {
        this.Memory = Memory;
    }

    /**
     * Get 臀围
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Hipline 臀围
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ValueUnitItem getHipline() {
        return this.Hipline;
    }

    /**
     * Set 臀围
注意：此字段可能返回 null，表示取不到有效值。
     * @param Hipline 臀围
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHipline(ValueUnitItem Hipline) {
        this.Hipline = Hipline;
    }

    /**
     * Get 腰臀比
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WaistHipRatio 腰臀比
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ValueUnitItem getWaistHipRatio() {
        return this.WaistHipRatio;
    }

    /**
     * Set 腰臀比
注意：此字段可能返回 null，表示取不到有效值。
     * @param WaistHipRatio 腰臀比
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWaistHipRatio(ValueUnitItem WaistHipRatio) {
        this.WaistHipRatio = WaistHipRatio;
    }

    /**
     * Get 生活嗜好
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Addiction 生活嗜好
注意：此字段可能返回 null，表示取不到有效值。
     */
    public KeyValueItem getAddiction() {
        return this.Addiction;
    }

    /**
     * Set 生活嗜好
注意：此字段可能返回 null，表示取不到有效值。
     * @param Addiction 生活嗜好
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAddiction(KeyValueItem Addiction) {
        this.Addiction = Addiction;
    }

    /**
     * Get 生活能力评定
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AbilityOfLifeADL 生活能力评定
注意：此字段可能返回 null，表示取不到有效值。
     */
    public KeyValueItem getAbilityOfLifeADL() {
        return this.AbilityOfLifeADL;
    }

    /**
     * Set 生活能力评定
注意：此字段可能返回 null，表示取不到有效值。
     * @param AbilityOfLifeADL 生活能力评定
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAbilityOfLifeADL(KeyValueItem AbilityOfLifeADL) {
        this.AbilityOfLifeADL = AbilityOfLifeADL;
    }

    /**
     * Get 一般检查其他
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Others 一般检查其他
注意：此字段可能返回 null，表示取不到有效值。
     */
    public KeyValueItem [] getOthers() {
        return this.Others;
    }

    /**
     * Set 一般检查其他
注意：此字段可能返回 null，表示取不到有效值。
     * @param Others 一般检查其他
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOthers(KeyValueItem [] Others) {
        this.Others = Others;
    }

    /**
     * Get 胸围
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ChestCircumference 胸围
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ChestCircumferenceItem getChestCircumference() {
        return this.ChestCircumference;
    }

    /**
     * Set 胸围
注意：此字段可能返回 null，表示取不到有效值。
     * @param ChestCircumference 胸围
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setChestCircumference(ChestCircumferenceItem ChestCircumference) {
        this.ChestCircumference = ChestCircumference;
    }

    public GeneralExaminationOthers() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GeneralExaminationOthers(GeneralExaminationOthers source) {
        if (source.Countenance != null) {
            this.Countenance = new KeyValueItem(source.Countenance);
        }
        if (source.MentalStatus != null) {
            this.MentalStatus = new KeyValueItem(source.MentalStatus);
        }
        if (source.DevelopmentCondition != null) {
            this.DevelopmentCondition = new KeyValueItem(source.DevelopmentCondition);
        }
        if (source.Memory != null) {
            this.Memory = new KeyValueItem(source.Memory);
        }
        if (source.Hipline != null) {
            this.Hipline = new ValueUnitItem(source.Hipline);
        }
        if (source.WaistHipRatio != null) {
            this.WaistHipRatio = new ValueUnitItem(source.WaistHipRatio);
        }
        if (source.Addiction != null) {
            this.Addiction = new KeyValueItem(source.Addiction);
        }
        if (source.AbilityOfLifeADL != null) {
            this.AbilityOfLifeADL = new KeyValueItem(source.AbilityOfLifeADL);
        }
        if (source.Others != null) {
            this.Others = new KeyValueItem[source.Others.length];
            for (int i = 0; i < source.Others.length; i++) {
                this.Others[i] = new KeyValueItem(source.Others[i]);
            }
        }
        if (source.ChestCircumference != null) {
            this.ChestCircumference = new ChestCircumferenceItem(source.ChestCircumference);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Countenance.", this.Countenance);
        this.setParamObj(map, prefix + "MentalStatus.", this.MentalStatus);
        this.setParamObj(map, prefix + "DevelopmentCondition.", this.DevelopmentCondition);
        this.setParamObj(map, prefix + "Memory.", this.Memory);
        this.setParamObj(map, prefix + "Hipline.", this.Hipline);
        this.setParamObj(map, prefix + "WaistHipRatio.", this.WaistHipRatio);
        this.setParamObj(map, prefix + "Addiction.", this.Addiction);
        this.setParamObj(map, prefix + "AbilityOfLifeADL.", this.AbilityOfLifeADL);
        this.setParamArrayObj(map, prefix + "Others.", this.Others);
        this.setParamObj(map, prefix + "ChestCircumference.", this.ChestCircumference);

    }
}

