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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CustomModel extends AbstractModel {

    /**
    * <p>性别</p><p>枚举值：</p><ul><li>male： 男性</li><li>female： 女性</li><li>any： 不限</li></ul>
    */
    @SerializedName("Gender")
    @Expose
    private String Gender;

    /**
    * <p>年龄范围</p><p>枚举值：</p><ul><li>teen： 青年</li><li>young_adult： 成年</li><li>middle_aged： 中年</li><li>mature： 成熟</li></ul>
    */
    @SerializedName("Age")
    @Expose
    private String Age;

    /**
    * <p>外貌</p><p>枚举值：</p><ul><li>caucasian： 白人</li><li>asian： 亚裔</li><li>latino： 拉丁裔</li><li>african： 非裔</li><li>middle_eastern： 中东</li></ul>
    */
    @SerializedName("Appearance")
    @Expose
    private String Appearance;

    /**
    * <p>身材</p><p>枚举值：</p><ul><li>slim： 苗条</li><li>standard： 标准</li><li>athletic： 健壮</li><li>chubby： 丰满</li></ul>
    */
    @SerializedName("BodyType")
    @Expose
    private String BodyType;

    /**
     * Get <p>性别</p><p>枚举值：</p><ul><li>male： 男性</li><li>female： 女性</li><li>any： 不限</li></ul> 
     * @return Gender <p>性别</p><p>枚举值：</p><ul><li>male： 男性</li><li>female： 女性</li><li>any： 不限</li></ul>
     */
    public String getGender() {
        return this.Gender;
    }

    /**
     * Set <p>性别</p><p>枚举值：</p><ul><li>male： 男性</li><li>female： 女性</li><li>any： 不限</li></ul>
     * @param Gender <p>性别</p><p>枚举值：</p><ul><li>male： 男性</li><li>female： 女性</li><li>any： 不限</li></ul>
     */
    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    /**
     * Get <p>年龄范围</p><p>枚举值：</p><ul><li>teen： 青年</li><li>young_adult： 成年</li><li>middle_aged： 中年</li><li>mature： 成熟</li></ul> 
     * @return Age <p>年龄范围</p><p>枚举值：</p><ul><li>teen： 青年</li><li>young_adult： 成年</li><li>middle_aged： 中年</li><li>mature： 成熟</li></ul>
     */
    public String getAge() {
        return this.Age;
    }

    /**
     * Set <p>年龄范围</p><p>枚举值：</p><ul><li>teen： 青年</li><li>young_adult： 成年</li><li>middle_aged： 中年</li><li>mature： 成熟</li></ul>
     * @param Age <p>年龄范围</p><p>枚举值：</p><ul><li>teen： 青年</li><li>young_adult： 成年</li><li>middle_aged： 中年</li><li>mature： 成熟</li></ul>
     */
    public void setAge(String Age) {
        this.Age = Age;
    }

    /**
     * Get <p>外貌</p><p>枚举值：</p><ul><li>caucasian： 白人</li><li>asian： 亚裔</li><li>latino： 拉丁裔</li><li>african： 非裔</li><li>middle_eastern： 中东</li></ul> 
     * @return Appearance <p>外貌</p><p>枚举值：</p><ul><li>caucasian： 白人</li><li>asian： 亚裔</li><li>latino： 拉丁裔</li><li>african： 非裔</li><li>middle_eastern： 中东</li></ul>
     */
    public String getAppearance() {
        return this.Appearance;
    }

    /**
     * Set <p>外貌</p><p>枚举值：</p><ul><li>caucasian： 白人</li><li>asian： 亚裔</li><li>latino： 拉丁裔</li><li>african： 非裔</li><li>middle_eastern： 中东</li></ul>
     * @param Appearance <p>外貌</p><p>枚举值：</p><ul><li>caucasian： 白人</li><li>asian： 亚裔</li><li>latino： 拉丁裔</li><li>african： 非裔</li><li>middle_eastern： 中东</li></ul>
     */
    public void setAppearance(String Appearance) {
        this.Appearance = Appearance;
    }

    /**
     * Get <p>身材</p><p>枚举值：</p><ul><li>slim： 苗条</li><li>standard： 标准</li><li>athletic： 健壮</li><li>chubby： 丰满</li></ul> 
     * @return BodyType <p>身材</p><p>枚举值：</p><ul><li>slim： 苗条</li><li>standard： 标准</li><li>athletic： 健壮</li><li>chubby： 丰满</li></ul>
     */
    public String getBodyType() {
        return this.BodyType;
    }

    /**
     * Set <p>身材</p><p>枚举值：</p><ul><li>slim： 苗条</li><li>standard： 标准</li><li>athletic： 健壮</li><li>chubby： 丰满</li></ul>
     * @param BodyType <p>身材</p><p>枚举值：</p><ul><li>slim： 苗条</li><li>standard： 标准</li><li>athletic： 健壮</li><li>chubby： 丰满</li></ul>
     */
    public void setBodyType(String BodyType) {
        this.BodyType = BodyType;
    }

    public CustomModel() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CustomModel(CustomModel source) {
        if (source.Gender != null) {
            this.Gender = new String(source.Gender);
        }
        if (source.Age != null) {
            this.Age = new String(source.Age);
        }
        if (source.Appearance != null) {
            this.Appearance = new String(source.Appearance);
        }
        if (source.BodyType != null) {
            this.BodyType = new String(source.BodyType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Gender", this.Gender);
        this.setParamSimple(map, prefix + "Age", this.Age);
        this.setParamSimple(map, prefix + "Appearance", this.Appearance);
        this.setParamSimple(map, prefix + "BodyType", this.BodyType);

    }
}

