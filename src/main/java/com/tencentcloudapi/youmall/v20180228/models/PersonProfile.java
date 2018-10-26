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

public class PersonProfile  extends AbstractModel{

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
    private Integer Gender;

    /**
    * 年龄
    */
    @SerializedName("Age")
    @Expose
    private Integer Age;

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
    private Integer ArrivedCount;

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
     * 获取客人编码
     * @return PersonId 客人编码
     */
    public String getPersonId() {
        return this.PersonId;
    }

    /**
     * 设置客人编码
     * @param PersonId 客人编码
     */
    public void setPersonId(String PersonId) {
        this.PersonId = PersonId;
    }

    /**
     * 获取性别
     * @return Gender 性别
     */
    public Integer getGender() {
        return this.Gender;
    }

    /**
     * 设置性别
     * @param Gender 性别
     */
    public void setGender(Integer Gender) {
        this.Gender = Gender;
    }

    /**
     * 获取年龄
     * @return Age 年龄
     */
    public Integer getAge() {
        return this.Age;
    }

    /**
     * 设置年龄
     * @param Age 年龄
     */
    public void setAge(Integer Age) {
        this.Age = Age;
    }

    /**
     * 获取首次到场时间
     * @return FirstArrivedTime 首次到场时间
     */
    public String getFirstArrivedTime() {
        return this.FirstArrivedTime;
    }

    /**
     * 设置首次到场时间
     * @param FirstArrivedTime 首次到场时间
     */
    public void setFirstArrivedTime(String FirstArrivedTime) {
        this.FirstArrivedTime = FirstArrivedTime;
    }

    /**
     * 获取来访次数
     * @return ArrivedCount 来访次数
     */
    public Integer getArrivedCount() {
        return this.ArrivedCount;
    }

    /**
     * 设置来访次数
     * @param ArrivedCount 来访次数
     */
    public void setArrivedCount(Integer ArrivedCount) {
        this.ArrivedCount = ArrivedCount;
    }

    /**
     * 获取客户图片
     * @return PicUrl 客户图片
     */
    public String getPicUrl() {
        return this.PicUrl;
    }

    /**
     * 设置客户图片
     * @param PicUrl 客户图片
     */
    public void setPicUrl(String PicUrl) {
        this.PicUrl = PicUrl;
    }

    /**
     * 获取置信度
     * @return Similarity 置信度
     */
    public Float getSimilarity() {
        return this.Similarity;
    }

    /**
     * 设置置信度
     * @param Similarity 置信度
     */
    public void setSimilarity(Float Similarity) {
        this.Similarity = Similarity;
    }

    /**
     * 内部实现，用户禁止调用
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

