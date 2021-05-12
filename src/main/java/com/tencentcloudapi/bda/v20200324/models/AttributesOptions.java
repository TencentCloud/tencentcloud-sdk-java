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

public class AttributesOptions extends AbstractModel{

    /**
    * 返回年龄信息
    */
    @SerializedName("Age")
    @Expose
    private Boolean Age;

    /**
    * 返回随身挎包信息
    */
    @SerializedName("Bag")
    @Expose
    private Boolean Bag;

    /**
    * 返回性别信息
    */
    @SerializedName("Gender")
    @Expose
    private Boolean Gender;

    /**
    * 返回朝向信息
    */
    @SerializedName("Orientation")
    @Expose
    private Boolean Orientation;

    /**
    * 返回上装信息
    */
    @SerializedName("UpperBodyCloth")
    @Expose
    private Boolean UpperBodyCloth;

    /**
    * 返回下装信息
    */
    @SerializedName("LowerBodyCloth")
    @Expose
    private Boolean LowerBodyCloth;

    /**
     * Get 返回年龄信息 
     * @return Age 返回年龄信息
     */
    public Boolean getAge() {
        return this.Age;
    }

    /**
     * Set 返回年龄信息
     * @param Age 返回年龄信息
     */
    public void setAge(Boolean Age) {
        this.Age = Age;
    }

    /**
     * Get 返回随身挎包信息 
     * @return Bag 返回随身挎包信息
     */
    public Boolean getBag() {
        return this.Bag;
    }

    /**
     * Set 返回随身挎包信息
     * @param Bag 返回随身挎包信息
     */
    public void setBag(Boolean Bag) {
        this.Bag = Bag;
    }

    /**
     * Get 返回性别信息 
     * @return Gender 返回性别信息
     */
    public Boolean getGender() {
        return this.Gender;
    }

    /**
     * Set 返回性别信息
     * @param Gender 返回性别信息
     */
    public void setGender(Boolean Gender) {
        this.Gender = Gender;
    }

    /**
     * Get 返回朝向信息 
     * @return Orientation 返回朝向信息
     */
    public Boolean getOrientation() {
        return this.Orientation;
    }

    /**
     * Set 返回朝向信息
     * @param Orientation 返回朝向信息
     */
    public void setOrientation(Boolean Orientation) {
        this.Orientation = Orientation;
    }

    /**
     * Get 返回上装信息 
     * @return UpperBodyCloth 返回上装信息
     */
    public Boolean getUpperBodyCloth() {
        return this.UpperBodyCloth;
    }

    /**
     * Set 返回上装信息
     * @param UpperBodyCloth 返回上装信息
     */
    public void setUpperBodyCloth(Boolean UpperBodyCloth) {
        this.UpperBodyCloth = UpperBodyCloth;
    }

    /**
     * Get 返回下装信息 
     * @return LowerBodyCloth 返回下装信息
     */
    public Boolean getLowerBodyCloth() {
        return this.LowerBodyCloth;
    }

    /**
     * Set 返回下装信息
     * @param LowerBodyCloth 返回下装信息
     */
    public void setLowerBodyCloth(Boolean LowerBodyCloth) {
        this.LowerBodyCloth = LowerBodyCloth;
    }

    public AttributesOptions() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AttributesOptions(AttributesOptions source) {
        if (source.Age != null) {
            this.Age = new Boolean(source.Age);
        }
        if (source.Bag != null) {
            this.Bag = new Boolean(source.Bag);
        }
        if (source.Gender != null) {
            this.Gender = new Boolean(source.Gender);
        }
        if (source.Orientation != null) {
            this.Orientation = new Boolean(source.Orientation);
        }
        if (source.UpperBodyCloth != null) {
            this.UpperBodyCloth = new Boolean(source.UpperBodyCloth);
        }
        if (source.LowerBodyCloth != null) {
            this.LowerBodyCloth = new Boolean(source.LowerBodyCloth);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Age", this.Age);
        this.setParamSimple(map, prefix + "Bag", this.Bag);
        this.setParamSimple(map, prefix + "Gender", this.Gender);
        this.setParamSimple(map, prefix + "Orientation", this.Orientation);
        this.setParamSimple(map, prefix + "UpperBodyCloth", this.UpperBodyCloth);
        this.setParamSimple(map, prefix + "LowerBodyCloth", this.LowerBodyCloth);

    }
}

