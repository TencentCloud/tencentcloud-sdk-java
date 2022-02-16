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
package com.tencentcloudapi.ivld.v20210903.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CustomPersonInfo extends AbstractModel{

    /**
    * 自定义人物Id
    */
    @SerializedName("PersonId")
    @Expose
    private String PersonId;

    /**
    * 自定义人物姓名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 自定义人物简介信息
    */
    @SerializedName("BasicInfo")
    @Expose
    private String BasicInfo;

    /**
    * 一级自定义人物类型
    */
    @SerializedName("L1Category")
    @Expose
    private String L1Category;

    /**
    * 二级自定义人物类型
    */
    @SerializedName("L2Category")
    @Expose
    private String L2Category;

    /**
    * 自定义人物图片信息
    */
    @SerializedName("ImageInfoSet")
    @Expose
    private PersonImageInfo [] ImageInfoSet;

    /**
    * 自定义人物创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
     * Get 自定义人物Id 
     * @return PersonId 自定义人物Id
     */
    public String getPersonId() {
        return this.PersonId;
    }

    /**
     * Set 自定义人物Id
     * @param PersonId 自定义人物Id
     */
    public void setPersonId(String PersonId) {
        this.PersonId = PersonId;
    }

    /**
     * Get 自定义人物姓名 
     * @return Name 自定义人物姓名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 自定义人物姓名
     * @param Name 自定义人物姓名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 自定义人物简介信息 
     * @return BasicInfo 自定义人物简介信息
     */
    public String getBasicInfo() {
        return this.BasicInfo;
    }

    /**
     * Set 自定义人物简介信息
     * @param BasicInfo 自定义人物简介信息
     */
    public void setBasicInfo(String BasicInfo) {
        this.BasicInfo = BasicInfo;
    }

    /**
     * Get 一级自定义人物类型 
     * @return L1Category 一级自定义人物类型
     */
    public String getL1Category() {
        return this.L1Category;
    }

    /**
     * Set 一级自定义人物类型
     * @param L1Category 一级自定义人物类型
     */
    public void setL1Category(String L1Category) {
        this.L1Category = L1Category;
    }

    /**
     * Get 二级自定义人物类型 
     * @return L2Category 二级自定义人物类型
     */
    public String getL2Category() {
        return this.L2Category;
    }

    /**
     * Set 二级自定义人物类型
     * @param L2Category 二级自定义人物类型
     */
    public void setL2Category(String L2Category) {
        this.L2Category = L2Category;
    }

    /**
     * Get 自定义人物图片信息 
     * @return ImageInfoSet 自定义人物图片信息
     */
    public PersonImageInfo [] getImageInfoSet() {
        return this.ImageInfoSet;
    }

    /**
     * Set 自定义人物图片信息
     * @param ImageInfoSet 自定义人物图片信息
     */
    public void setImageInfoSet(PersonImageInfo [] ImageInfoSet) {
        this.ImageInfoSet = ImageInfoSet;
    }

    /**
     * Get 自定义人物创建时间 
     * @return CreateTime 自定义人物创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 自定义人物创建时间
     * @param CreateTime 自定义人物创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    public CustomPersonInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CustomPersonInfo(CustomPersonInfo source) {
        if (source.PersonId != null) {
            this.PersonId = new String(source.PersonId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.BasicInfo != null) {
            this.BasicInfo = new String(source.BasicInfo);
        }
        if (source.L1Category != null) {
            this.L1Category = new String(source.L1Category);
        }
        if (source.L2Category != null) {
            this.L2Category = new String(source.L2Category);
        }
        if (source.ImageInfoSet != null) {
            this.ImageInfoSet = new PersonImageInfo[source.ImageInfoSet.length];
            for (int i = 0; i < source.ImageInfoSet.length; i++) {
                this.ImageInfoSet[i] = new PersonImageInfo(source.ImageInfoSet[i]);
            }
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PersonId", this.PersonId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "BasicInfo", this.BasicInfo);
        this.setParamSimple(map, prefix + "L1Category", this.L1Category);
        this.setParamSimple(map, prefix + "L2Category", this.L2Category);
        this.setParamArrayObj(map, prefix + "ImageInfoSet.", this.ImageInfoSet);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);

    }
}

