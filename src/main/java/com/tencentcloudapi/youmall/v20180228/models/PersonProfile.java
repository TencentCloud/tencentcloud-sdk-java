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
package com.tencentcloudapi.youmall.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PersonProfile extends AbstractModel{

    /**
    * 客人编码
    */
    @SerializedName("PersonId")
    @Expose
    private String PersonId;

    /**
    * 性别
    */
    @SerializedName("Gender")
    @Expose
    private Long Gender;

    /**
    * 年龄
    */
    @SerializedName("Age")
    @Expose
    private Long Age;

    /**
    * 首次到场时间
    */
    @SerializedName("FirstArrivedTime")
    @Expose
    private String FirstArrivedTime;

    /**
    * 来访次数
    */
    @SerializedName("ArrivedCount")
    @Expose
    private Long ArrivedCount;

    /**
    * 客户图片
    */
    @SerializedName("PicUrl")
    @Expose
    private String PicUrl;

    /**
    * 置信度
    */
    @SerializedName("Similarity")
    @Expose
    private Float Similarity;

    /**
     * Get 客人编码 
     * @return PersonId 客人编码
     */
    public String getPersonId() {
        return this.PersonId;
    }

    /**
     * Set 客人编码
     * @param PersonId 客人编码
     */
    public void setPersonId(String PersonId) {
        this.PersonId = PersonId;
    }

    /**
     * Get 性别 
     * @return Gender 性别
     */
    public Long getGender() {
        return this.Gender;
    }

    /**
     * Set 性别
     * @param Gender 性别
     */
    public void setGender(Long Gender) {
        this.Gender = Gender;
    }

    /**
     * Get 年龄 
     * @return Age 年龄
     */
    public Long getAge() {
        return this.Age;
    }

    /**
     * Set 年龄
     * @param Age 年龄
     */
    public void setAge(Long Age) {
        this.Age = Age;
    }

    /**
     * Get 首次到场时间 
     * @return FirstArrivedTime 首次到场时间
     */
    public String getFirstArrivedTime() {
        return this.FirstArrivedTime;
    }

    /**
     * Set 首次到场时间
     * @param FirstArrivedTime 首次到场时间
     */
    public void setFirstArrivedTime(String FirstArrivedTime) {
        this.FirstArrivedTime = FirstArrivedTime;
    }

    /**
     * Get 来访次数 
     * @return ArrivedCount 来访次数
     */
    public Long getArrivedCount() {
        return this.ArrivedCount;
    }

    /**
     * Set 来访次数
     * @param ArrivedCount 来访次数
     */
    public void setArrivedCount(Long ArrivedCount) {
        this.ArrivedCount = ArrivedCount;
    }

    /**
     * Get 客户图片 
     * @return PicUrl 客户图片
     */
    public String getPicUrl() {
        return this.PicUrl;
    }

    /**
     * Set 客户图片
     * @param PicUrl 客户图片
     */
    public void setPicUrl(String PicUrl) {
        this.PicUrl = PicUrl;
    }

    /**
     * Get 置信度 
     * @return Similarity 置信度
     */
    public Float getSimilarity() {
        return this.Similarity;
    }

    /**
     * Set 置信度
     * @param Similarity 置信度
     */
    public void setSimilarity(Float Similarity) {
        this.Similarity = Similarity;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PersonId", this.PersonId);
        this.setParamSimple(map, prefix + "Gender", this.Gender);
        this.setParamSimple(map, prefix + "Age", this.Age);
        this.setParamSimple(map, prefix + "FirstArrivedTime", this.FirstArrivedTime);
        this.setParamSimple(map, prefix + "ArrivedCount", this.ArrivedCount);
        this.setParamSimple(map, prefix + "PicUrl", this.PicUrl);
        this.setParamSimple(map, prefix + "Similarity", this.Similarity);

    }
}

