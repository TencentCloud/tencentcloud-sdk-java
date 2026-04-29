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

public class VoiceProfile extends AbstractModel {

    /**
    * <p>音色名</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>音色描述</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>性别</p><p>枚举值：</p><ul><li>male： 男性</li><li>female： 女性</li><li>unknown： 未知</li></ul>
    */
    @SerializedName("Gender")
    @Expose
    private String Gender;

    /**
    * <p>年龄</p><p>枚举值：</p><ul><li>child： 儿童</li><li>teenager： 少年</li><li>youth： 青年</li><li>middle_aged： 中年</li><li>senior： 老年</li><li>unknown： 未知</li></ul>
    */
    @SerializedName("Age")
    @Expose
    private String Age;

    /**
    * <p>标签</p>
    */
    @SerializedName("Labels")
    @Expose
    private String [] Labels;

    /**
    * <p>使用场景</p>
    */
    @SerializedName("Scenes")
    @Expose
    private String [] Scenes;

    /**
     * Get <p>音色名</p> 
     * @return Name <p>音色名</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>音色名</p>
     * @param Name <p>音色名</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>音色描述</p> 
     * @return Description <p>音色描述</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>音色描述</p>
     * @param Description <p>音色描述</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>性别</p><p>枚举值：</p><ul><li>male： 男性</li><li>female： 女性</li><li>unknown： 未知</li></ul> 
     * @return Gender <p>性别</p><p>枚举值：</p><ul><li>male： 男性</li><li>female： 女性</li><li>unknown： 未知</li></ul>
     */
    public String getGender() {
        return this.Gender;
    }

    /**
     * Set <p>性别</p><p>枚举值：</p><ul><li>male： 男性</li><li>female： 女性</li><li>unknown： 未知</li></ul>
     * @param Gender <p>性别</p><p>枚举值：</p><ul><li>male： 男性</li><li>female： 女性</li><li>unknown： 未知</li></ul>
     */
    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    /**
     * Get <p>年龄</p><p>枚举值：</p><ul><li>child： 儿童</li><li>teenager： 少年</li><li>youth： 青年</li><li>middle_aged： 中年</li><li>senior： 老年</li><li>unknown： 未知</li></ul> 
     * @return Age <p>年龄</p><p>枚举值：</p><ul><li>child： 儿童</li><li>teenager： 少年</li><li>youth： 青年</li><li>middle_aged： 中年</li><li>senior： 老年</li><li>unknown： 未知</li></ul>
     */
    public String getAge() {
        return this.Age;
    }

    /**
     * Set <p>年龄</p><p>枚举值：</p><ul><li>child： 儿童</li><li>teenager： 少年</li><li>youth： 青年</li><li>middle_aged： 中年</li><li>senior： 老年</li><li>unknown： 未知</li></ul>
     * @param Age <p>年龄</p><p>枚举值：</p><ul><li>child： 儿童</li><li>teenager： 少年</li><li>youth： 青年</li><li>middle_aged： 中年</li><li>senior： 老年</li><li>unknown： 未知</li></ul>
     */
    public void setAge(String Age) {
        this.Age = Age;
    }

    /**
     * Get <p>标签</p> 
     * @return Labels <p>标签</p>
     */
    public String [] getLabels() {
        return this.Labels;
    }

    /**
     * Set <p>标签</p>
     * @param Labels <p>标签</p>
     */
    public void setLabels(String [] Labels) {
        this.Labels = Labels;
    }

    /**
     * Get <p>使用场景</p> 
     * @return Scenes <p>使用场景</p>
     */
    public String [] getScenes() {
        return this.Scenes;
    }

    /**
     * Set <p>使用场景</p>
     * @param Scenes <p>使用场景</p>
     */
    public void setScenes(String [] Scenes) {
        this.Scenes = Scenes;
    }

    public VoiceProfile() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VoiceProfile(VoiceProfile source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Gender != null) {
            this.Gender = new String(source.Gender);
        }
        if (source.Age != null) {
            this.Age = new String(source.Age);
        }
        if (source.Labels != null) {
            this.Labels = new String[source.Labels.length];
            for (int i = 0; i < source.Labels.length; i++) {
                this.Labels[i] = new String(source.Labels[i]);
            }
        }
        if (source.Scenes != null) {
            this.Scenes = new String[source.Scenes.length];
            for (int i = 0; i < source.Scenes.length; i++) {
                this.Scenes[i] = new String(source.Scenes[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Gender", this.Gender);
        this.setParamSimple(map, prefix + "Age", this.Age);
        this.setParamArraySimple(map, prefix + "Labels.", this.Labels);
        this.setParamArraySimple(map, prefix + "Scenes.", this.Scenes);

    }
}

