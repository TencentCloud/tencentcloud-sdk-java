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

public class Fp2NdItem extends AbstractModel{

    /**
    * 手术编码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Code")
    @Expose
    private BaseItem Code;

    /**
    * 手术名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private BaseItem Name;

    /**
    * 手术开始时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StartTime")
    @Expose
    private BaseItem StartTime;

    /**
    * 手术结束时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndTime")
    @Expose
    private BaseItem EndTime;

    /**
    * 手术等级
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Level")
    @Expose
    private BaseItem Level;

    /**
    * 手术类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private BaseItem Type;

    /**
    * 醉愈合方式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IncisionHealingGrade")
    @Expose
    private BaseItem IncisionHealingGrade;

    /**
    * 麻醉方法
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AnesthesiaMethod")
    @Expose
    private BaseItem AnesthesiaMethod;

    /**
     * Get 手术编码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Code 手术编码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BaseItem getCode() {
        return this.Code;
    }

    /**
     * Set 手术编码
注意：此字段可能返回 null，表示取不到有效值。
     * @param Code 手术编码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCode(BaseItem Code) {
        this.Code = Code;
    }

    /**
     * Get 手术名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 手术名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BaseItem getName() {
        return this.Name;
    }

    /**
     * Set 手术名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 手术名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(BaseItem Name) {
        this.Name = Name;
    }

    /**
     * Get 手术开始时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StartTime 手术开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BaseItem getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 手术开始时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param StartTime 手术开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStartTime(BaseItem StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 手术结束时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndTime 手术结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BaseItem getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 手术结束时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndTime 手术结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndTime(BaseItem EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 手术等级
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Level 手术等级
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BaseItem getLevel() {
        return this.Level;
    }

    /**
     * Set 手术等级
注意：此字段可能返回 null，表示取不到有效值。
     * @param Level 手术等级
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLevel(BaseItem Level) {
        this.Level = Level;
    }

    /**
     * Get 手术类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type 手术类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BaseItem getType() {
        return this.Type;
    }

    /**
     * Set 手术类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type 手术类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(BaseItem Type) {
        this.Type = Type;
    }

    /**
     * Get 醉愈合方式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IncisionHealingGrade 醉愈合方式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BaseItem getIncisionHealingGrade() {
        return this.IncisionHealingGrade;
    }

    /**
     * Set 醉愈合方式
注意：此字段可能返回 null，表示取不到有效值。
     * @param IncisionHealingGrade 醉愈合方式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIncisionHealingGrade(BaseItem IncisionHealingGrade) {
        this.IncisionHealingGrade = IncisionHealingGrade;
    }

    /**
     * Get 麻醉方法
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AnesthesiaMethod 麻醉方法
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BaseItem getAnesthesiaMethod() {
        return this.AnesthesiaMethod;
    }

    /**
     * Set 麻醉方法
注意：此字段可能返回 null，表示取不到有效值。
     * @param AnesthesiaMethod 麻醉方法
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAnesthesiaMethod(BaseItem AnesthesiaMethod) {
        this.AnesthesiaMethod = AnesthesiaMethod;
    }

    public Fp2NdItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Fp2NdItem(Fp2NdItem source) {
        if (source.Code != null) {
            this.Code = new BaseItem(source.Code);
        }
        if (source.Name != null) {
            this.Name = new BaseItem(source.Name);
        }
        if (source.StartTime != null) {
            this.StartTime = new BaseItem(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new BaseItem(source.EndTime);
        }
        if (source.Level != null) {
            this.Level = new BaseItem(source.Level);
        }
        if (source.Type != null) {
            this.Type = new BaseItem(source.Type);
        }
        if (source.IncisionHealingGrade != null) {
            this.IncisionHealingGrade = new BaseItem(source.IncisionHealingGrade);
        }
        if (source.AnesthesiaMethod != null) {
            this.AnesthesiaMethod = new BaseItem(source.AnesthesiaMethod);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Code.", this.Code);
        this.setParamObj(map, prefix + "Name.", this.Name);
        this.setParamObj(map, prefix + "StartTime.", this.StartTime);
        this.setParamObj(map, prefix + "EndTime.", this.EndTime);
        this.setParamObj(map, prefix + "Level.", this.Level);
        this.setParamObj(map, prefix + "Type.", this.Type);
        this.setParamObj(map, prefix + "IncisionHealingGrade.", this.IncisionHealingGrade);
        this.setParamObj(map, prefix + "AnesthesiaMethod.", this.AnesthesiaMethod);

    }
}

