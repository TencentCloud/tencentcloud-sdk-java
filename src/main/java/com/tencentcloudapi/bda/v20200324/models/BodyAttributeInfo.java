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
package com.tencentcloudapi.bda.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BodyAttributeInfo extends AbstractModel{

    /**
    * 人体年龄信息。 
AttributesType 不含 Age 或检测超过 5 个人体时，此参数仍返回，但不具备参考意义。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Age")
    @Expose
    private Age Age;

    /**
    * 人体是否挎包。 
AttributesType 不含 Bag 或检测超过 5 个人体时，此参数仍返回，但不具备参考意义。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Bag")
    @Expose
    private Bag Bag;

    /**
    * 人体性别信息。 
AttributesType 不含 Gender 或检测超过 5 个人体时，此参数仍返回，但不具备参考意义。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Gender")
    @Expose
    private Gender Gender;

    /**
    * 人体朝向信息。   
AttributesType 不含 UpperBodyCloth 或检测超过 5 个人体时，此参数仍返回，但不具备参考意义。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Orientation")
    @Expose
    private Orientation Orientation;

    /**
    * 人体上衣属性信息。
AttributesType 不含 Orientation 或检测超过 5 个人体时，此参数仍返回，但不具备参考意义。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpperBodyCloth")
    @Expose
    private UpperBodyCloth UpperBodyCloth;

    /**
    * 人体下衣属性信息。  
AttributesType 不含 LowerBodyCloth 或检测超过 5 个人体时，此参数仍返回，但不具备参考意义。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LowerBodyCloth")
    @Expose
    private LowerBodyCloth LowerBodyCloth;

    /**
     * Get 人体年龄信息。 
AttributesType 不含 Age 或检测超过 5 个人体时，此参数仍返回，但不具备参考意义。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Age 人体年龄信息。 
AttributesType 不含 Age 或检测超过 5 个人体时，此参数仍返回，但不具备参考意义。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Age getAge() {
        return this.Age;
    }

    /**
     * Set 人体年龄信息。 
AttributesType 不含 Age 或检测超过 5 个人体时，此参数仍返回，但不具备参考意义。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Age 人体年龄信息。 
AttributesType 不含 Age 或检测超过 5 个人体时，此参数仍返回，但不具备参考意义。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAge(Age Age) {
        this.Age = Age;
    }

    /**
     * Get 人体是否挎包。 
AttributesType 不含 Bag 或检测超过 5 个人体时，此参数仍返回，但不具备参考意义。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Bag 人体是否挎包。 
AttributesType 不含 Bag 或检测超过 5 个人体时，此参数仍返回，但不具备参考意义。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Bag getBag() {
        return this.Bag;
    }

    /**
     * Set 人体是否挎包。 
AttributesType 不含 Bag 或检测超过 5 个人体时，此参数仍返回，但不具备参考意义。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Bag 人体是否挎包。 
AttributesType 不含 Bag 或检测超过 5 个人体时，此参数仍返回，但不具备参考意义。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBag(Bag Bag) {
        this.Bag = Bag;
    }

    /**
     * Get 人体性别信息。 
AttributesType 不含 Gender 或检测超过 5 个人体时，此参数仍返回，但不具备参考意义。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Gender 人体性别信息。 
AttributesType 不含 Gender 或检测超过 5 个人体时，此参数仍返回，但不具备参考意义。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Gender getGender() {
        return this.Gender;
    }

    /**
     * Set 人体性别信息。 
AttributesType 不含 Gender 或检测超过 5 个人体时，此参数仍返回，但不具备参考意义。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Gender 人体性别信息。 
AttributesType 不含 Gender 或检测超过 5 个人体时，此参数仍返回，但不具备参考意义。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGender(Gender Gender) {
        this.Gender = Gender;
    }

    /**
     * Get 人体朝向信息。   
AttributesType 不含 UpperBodyCloth 或检测超过 5 个人体时，此参数仍返回，但不具备参考意义。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Orientation 人体朝向信息。   
AttributesType 不含 UpperBodyCloth 或检测超过 5 个人体时，此参数仍返回，但不具备参考意义。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Orientation getOrientation() {
        return this.Orientation;
    }

    /**
     * Set 人体朝向信息。   
AttributesType 不含 UpperBodyCloth 或检测超过 5 个人体时，此参数仍返回，但不具备参考意义。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Orientation 人体朝向信息。   
AttributesType 不含 UpperBodyCloth 或检测超过 5 个人体时，此参数仍返回，但不具备参考意义。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOrientation(Orientation Orientation) {
        this.Orientation = Orientation;
    }

    /**
     * Get 人体上衣属性信息。
AttributesType 不含 Orientation 或检测超过 5 个人体时，此参数仍返回，但不具备参考意义。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpperBodyCloth 人体上衣属性信息。
AttributesType 不含 Orientation 或检测超过 5 个人体时，此参数仍返回，但不具备参考意义。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public UpperBodyCloth getUpperBodyCloth() {
        return this.UpperBodyCloth;
    }

    /**
     * Set 人体上衣属性信息。
AttributesType 不含 Orientation 或检测超过 5 个人体时，此参数仍返回，但不具备参考意义。
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpperBodyCloth 人体上衣属性信息。
AttributesType 不含 Orientation 或检测超过 5 个人体时，此参数仍返回，但不具备参考意义。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpperBodyCloth(UpperBodyCloth UpperBodyCloth) {
        this.UpperBodyCloth = UpperBodyCloth;
    }

    /**
     * Get 人体下衣属性信息。  
AttributesType 不含 LowerBodyCloth 或检测超过 5 个人体时，此参数仍返回，但不具备参考意义。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LowerBodyCloth 人体下衣属性信息。  
AttributesType 不含 LowerBodyCloth 或检测超过 5 个人体时，此参数仍返回，但不具备参考意义。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public LowerBodyCloth getLowerBodyCloth() {
        return this.LowerBodyCloth;
    }

    /**
     * Set 人体下衣属性信息。  
AttributesType 不含 LowerBodyCloth 或检测超过 5 个人体时，此参数仍返回，但不具备参考意义。
注意：此字段可能返回 null，表示取不到有效值。
     * @param LowerBodyCloth 人体下衣属性信息。  
AttributesType 不含 LowerBodyCloth 或检测超过 5 个人体时，此参数仍返回，但不具备参考意义。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLowerBodyCloth(LowerBodyCloth LowerBodyCloth) {
        this.LowerBodyCloth = LowerBodyCloth;
    }

    public BodyAttributeInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BodyAttributeInfo(BodyAttributeInfo source) {
        if (source.Age != null) {
            this.Age = new Age(source.Age);
        }
        if (source.Bag != null) {
            this.Bag = new Bag(source.Bag);
        }
        if (source.Gender != null) {
            this.Gender = new Gender(source.Gender);
        }
        if (source.Orientation != null) {
            this.Orientation = new Orientation(source.Orientation);
        }
        if (source.UpperBodyCloth != null) {
            this.UpperBodyCloth = new UpperBodyCloth(source.UpperBodyCloth);
        }
        if (source.LowerBodyCloth != null) {
            this.LowerBodyCloth = new LowerBodyCloth(source.LowerBodyCloth);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Age.", this.Age);
        this.setParamObj(map, prefix + "Bag.", this.Bag);
        this.setParamObj(map, prefix + "Gender.", this.Gender);
        this.setParamObj(map, prefix + "Orientation.", this.Orientation);
        this.setParamObj(map, prefix + "UpperBodyCloth.", this.UpperBodyCloth);
        this.setParamObj(map, prefix + "LowerBodyCloth.", this.LowerBodyCloth);

    }
}

