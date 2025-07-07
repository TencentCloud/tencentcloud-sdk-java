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
package com.tencentcloudapi.controlcenter.v20230110.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AccountFactoryItem extends AbstractModel {

    /**
    * 账号工厂基线项唯一标识，只能包含英文字母、数字和@、,._[]-:()（）【】+=，。，长度2-128个字符。
    */
    @SerializedName("Identifier")
    @Expose
    private String Identifier;

    /**
    * 基线项名称，功能项名字唯一，仅支持英文字母、数宇、汉字、符号@、＆_[]-的组合，1-25个中文或英文字符。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 基线项英文名称，基线项名字唯一，仅支持英文字母、数字、空格、符号@、＆_[]-的组合，1-64个英文字符。
    */
    @SerializedName("NameEn")
    @Expose
    private String NameEn;

    /**
    * 基线项权重，数值小权重越高，取值范围大于等于0。
    */
    @SerializedName("Weight")
    @Expose
    private Long Weight;

    /**
    * 基线项是否必填，1必填，0非必填
    */
    @SerializedName("Required")
    @Expose
    private Long Required;

    /**
    * 基线项依赖项，N的取值范围与该基线项依赖的其它基线项个数有关。
    */
    @SerializedName("DependsOn")
    @Expose
    private DependsOnItem [] DependsOn;

    /**
    * 基线描述，长度为2~256个英文或中文字符，默认值为空。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 基线项英文描述，长度为2~1024个英文字符，默认值为空。
    */
    @SerializedName("DescriptionEn")
    @Expose
    private String DescriptionEn;

    /**
    * 基线分类，长度为2~32个英文或中文字符，不能为空。
    */
    @SerializedName("Classify")
    @Expose
    private String Classify;

    /**
    * 基线英文分类，长度为2~64个英文字符，不能为空。
    */
    @SerializedName("ClassifyEn")
    @Expose
    private String ClassifyEn;

    /**
     * Get 账号工厂基线项唯一标识，只能包含英文字母、数字和@、,._[]-:()（）【】+=，。，长度2-128个字符。 
     * @return Identifier 账号工厂基线项唯一标识，只能包含英文字母、数字和@、,._[]-:()（）【】+=，。，长度2-128个字符。
     */
    public String getIdentifier() {
        return this.Identifier;
    }

    /**
     * Set 账号工厂基线项唯一标识，只能包含英文字母、数字和@、,._[]-:()（）【】+=，。，长度2-128个字符。
     * @param Identifier 账号工厂基线项唯一标识，只能包含英文字母、数字和@、,._[]-:()（）【】+=，。，长度2-128个字符。
     */
    public void setIdentifier(String Identifier) {
        this.Identifier = Identifier;
    }

    /**
     * Get 基线项名称，功能项名字唯一，仅支持英文字母、数宇、汉字、符号@、＆_[]-的组合，1-25个中文或英文字符。 
     * @return Name 基线项名称，功能项名字唯一，仅支持英文字母、数宇、汉字、符号@、＆_[]-的组合，1-25个中文或英文字符。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 基线项名称，功能项名字唯一，仅支持英文字母、数宇、汉字、符号@、＆_[]-的组合，1-25个中文或英文字符。
     * @param Name 基线项名称，功能项名字唯一，仅支持英文字母、数宇、汉字、符号@、＆_[]-的组合，1-25个中文或英文字符。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 基线项英文名称，基线项名字唯一，仅支持英文字母、数字、空格、符号@、＆_[]-的组合，1-64个英文字符。 
     * @return NameEn 基线项英文名称，基线项名字唯一，仅支持英文字母、数字、空格、符号@、＆_[]-的组合，1-64个英文字符。
     */
    public String getNameEn() {
        return this.NameEn;
    }

    /**
     * Set 基线项英文名称，基线项名字唯一，仅支持英文字母、数字、空格、符号@、＆_[]-的组合，1-64个英文字符。
     * @param NameEn 基线项英文名称，基线项名字唯一，仅支持英文字母、数字、空格、符号@、＆_[]-的组合，1-64个英文字符。
     */
    public void setNameEn(String NameEn) {
        this.NameEn = NameEn;
    }

    /**
     * Get 基线项权重，数值小权重越高，取值范围大于等于0。 
     * @return Weight 基线项权重，数值小权重越高，取值范围大于等于0。
     */
    public Long getWeight() {
        return this.Weight;
    }

    /**
     * Set 基线项权重，数值小权重越高，取值范围大于等于0。
     * @param Weight 基线项权重，数值小权重越高，取值范围大于等于0。
     */
    public void setWeight(Long Weight) {
        this.Weight = Weight;
    }

    /**
     * Get 基线项是否必填，1必填，0非必填 
     * @return Required 基线项是否必填，1必填，0非必填
     */
    public Long getRequired() {
        return this.Required;
    }

    /**
     * Set 基线项是否必填，1必填，0非必填
     * @param Required 基线项是否必填，1必填，0非必填
     */
    public void setRequired(Long Required) {
        this.Required = Required;
    }

    /**
     * Get 基线项依赖项，N的取值范围与该基线项依赖的其它基线项个数有关。 
     * @return DependsOn 基线项依赖项，N的取值范围与该基线项依赖的其它基线项个数有关。
     */
    public DependsOnItem [] getDependsOn() {
        return this.DependsOn;
    }

    /**
     * Set 基线项依赖项，N的取值范围与该基线项依赖的其它基线项个数有关。
     * @param DependsOn 基线项依赖项，N的取值范围与该基线项依赖的其它基线项个数有关。
     */
    public void setDependsOn(DependsOnItem [] DependsOn) {
        this.DependsOn = DependsOn;
    }

    /**
     * Get 基线描述，长度为2~256个英文或中文字符，默认值为空。 
     * @return Description 基线描述，长度为2~256个英文或中文字符，默认值为空。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 基线描述，长度为2~256个英文或中文字符，默认值为空。
     * @param Description 基线描述，长度为2~256个英文或中文字符，默认值为空。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 基线项英文描述，长度为2~1024个英文字符，默认值为空。 
     * @return DescriptionEn 基线项英文描述，长度为2~1024个英文字符，默认值为空。
     */
    public String getDescriptionEn() {
        return this.DescriptionEn;
    }

    /**
     * Set 基线项英文描述，长度为2~1024个英文字符，默认值为空。
     * @param DescriptionEn 基线项英文描述，长度为2~1024个英文字符，默认值为空。
     */
    public void setDescriptionEn(String DescriptionEn) {
        this.DescriptionEn = DescriptionEn;
    }

    /**
     * Get 基线分类，长度为2~32个英文或中文字符，不能为空。 
     * @return Classify 基线分类，长度为2~32个英文或中文字符，不能为空。
     */
    public String getClassify() {
        return this.Classify;
    }

    /**
     * Set 基线分类，长度为2~32个英文或中文字符，不能为空。
     * @param Classify 基线分类，长度为2~32个英文或中文字符，不能为空。
     */
    public void setClassify(String Classify) {
        this.Classify = Classify;
    }

    /**
     * Get 基线英文分类，长度为2~64个英文字符，不能为空。 
     * @return ClassifyEn 基线英文分类，长度为2~64个英文字符，不能为空。
     */
    public String getClassifyEn() {
        return this.ClassifyEn;
    }

    /**
     * Set 基线英文分类，长度为2~64个英文字符，不能为空。
     * @param ClassifyEn 基线英文分类，长度为2~64个英文字符，不能为空。
     */
    public void setClassifyEn(String ClassifyEn) {
        this.ClassifyEn = ClassifyEn;
    }

    public AccountFactoryItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AccountFactoryItem(AccountFactoryItem source) {
        if (source.Identifier != null) {
            this.Identifier = new String(source.Identifier);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.NameEn != null) {
            this.NameEn = new String(source.NameEn);
        }
        if (source.Weight != null) {
            this.Weight = new Long(source.Weight);
        }
        if (source.Required != null) {
            this.Required = new Long(source.Required);
        }
        if (source.DependsOn != null) {
            this.DependsOn = new DependsOnItem[source.DependsOn.length];
            for (int i = 0; i < source.DependsOn.length; i++) {
                this.DependsOn[i] = new DependsOnItem(source.DependsOn[i]);
            }
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.DescriptionEn != null) {
            this.DescriptionEn = new String(source.DescriptionEn);
        }
        if (source.Classify != null) {
            this.Classify = new String(source.Classify);
        }
        if (source.ClassifyEn != null) {
            this.ClassifyEn = new String(source.ClassifyEn);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Identifier", this.Identifier);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "NameEn", this.NameEn);
        this.setParamSimple(map, prefix + "Weight", this.Weight);
        this.setParamSimple(map, prefix + "Required", this.Required);
        this.setParamArrayObj(map, prefix + "DependsOn.", this.DependsOn);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "DescriptionEn", this.DescriptionEn);
        this.setParamSimple(map, prefix + "Classify", this.Classify);
        this.setParamSimple(map, prefix + "ClassifyEn", this.ClassifyEn);

    }
}

