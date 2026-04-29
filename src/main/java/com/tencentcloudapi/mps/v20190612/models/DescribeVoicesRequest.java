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

public class DescribeVoicesRequest extends AbstractModel {

    /**
    * <p>音色ID</p>
    */
    @SerializedName("VoiceId")
    @Expose
    private String VoiceId;

    /**
    * <p>音色类别</p><p>枚举值：</p><ul><li>system： 系统音色</li><li>clone： 克隆音色</li><li>design： 设计音色</li><li>all： 所有音色（默认）</li></ul>
    */
    @SerializedName("VoiceType")
    @Expose
    private String VoiceType;

    /**
    * <p>音色名</p>
    */
    @SerializedName("VoiceName")
    @Expose
    private String VoiceName;

    /**
    * <p>音色描述</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>性别</p><p>枚举值：</p><ul><li>male： 男</li><li>female： 女</li><li>unknown： 未知</li></ul>
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
    * <p>语言</p>
    */
    @SerializedName("Languages")
    @Expose
    private String [] Languages;

    /**
    * <p>标签</p>
    */
    @SerializedName("Labels")
    @Expose
    private String [] Labels;

    /**
    * <p>场景</p>
    */
    @SerializedName("Scenes")
    @Expose
    private String [] Scenes;

    /**
    * <p>扩展参数，json字符串</p><p>其他筛选条件voiceName String 音色名，模糊匹配labels Array of String 标签，匹配包含这些标签的音色</p>
    */
    @SerializedName("ExtParam")
    @Expose
    private String ExtParam;

    /**
     * Get <p>音色ID</p> 
     * @return VoiceId <p>音色ID</p>
     */
    public String getVoiceId() {
        return this.VoiceId;
    }

    /**
     * Set <p>音色ID</p>
     * @param VoiceId <p>音色ID</p>
     */
    public void setVoiceId(String VoiceId) {
        this.VoiceId = VoiceId;
    }

    /**
     * Get <p>音色类别</p><p>枚举值：</p><ul><li>system： 系统音色</li><li>clone： 克隆音色</li><li>design： 设计音色</li><li>all： 所有音色（默认）</li></ul> 
     * @return VoiceType <p>音色类别</p><p>枚举值：</p><ul><li>system： 系统音色</li><li>clone： 克隆音色</li><li>design： 设计音色</li><li>all： 所有音色（默认）</li></ul>
     */
    public String getVoiceType() {
        return this.VoiceType;
    }

    /**
     * Set <p>音色类别</p><p>枚举值：</p><ul><li>system： 系统音色</li><li>clone： 克隆音色</li><li>design： 设计音色</li><li>all： 所有音色（默认）</li></ul>
     * @param VoiceType <p>音色类别</p><p>枚举值：</p><ul><li>system： 系统音色</li><li>clone： 克隆音色</li><li>design： 设计音色</li><li>all： 所有音色（默认）</li></ul>
     */
    public void setVoiceType(String VoiceType) {
        this.VoiceType = VoiceType;
    }

    /**
     * Get <p>音色名</p> 
     * @return VoiceName <p>音色名</p>
     */
    public String getVoiceName() {
        return this.VoiceName;
    }

    /**
     * Set <p>音色名</p>
     * @param VoiceName <p>音色名</p>
     */
    public void setVoiceName(String VoiceName) {
        this.VoiceName = VoiceName;
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
     * Get <p>性别</p><p>枚举值：</p><ul><li>male： 男</li><li>female： 女</li><li>unknown： 未知</li></ul> 
     * @return Gender <p>性别</p><p>枚举值：</p><ul><li>male： 男</li><li>female： 女</li><li>unknown： 未知</li></ul>
     */
    public String getGender() {
        return this.Gender;
    }

    /**
     * Set <p>性别</p><p>枚举值：</p><ul><li>male： 男</li><li>female： 女</li><li>unknown： 未知</li></ul>
     * @param Gender <p>性别</p><p>枚举值：</p><ul><li>male： 男</li><li>female： 女</li><li>unknown： 未知</li></ul>
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
     * Get <p>语言</p> 
     * @return Languages <p>语言</p>
     */
    public String [] getLanguages() {
        return this.Languages;
    }

    /**
     * Set <p>语言</p>
     * @param Languages <p>语言</p>
     */
    public void setLanguages(String [] Languages) {
        this.Languages = Languages;
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
     * Get <p>场景</p> 
     * @return Scenes <p>场景</p>
     */
    public String [] getScenes() {
        return this.Scenes;
    }

    /**
     * Set <p>场景</p>
     * @param Scenes <p>场景</p>
     */
    public void setScenes(String [] Scenes) {
        this.Scenes = Scenes;
    }

    /**
     * Get <p>扩展参数，json字符串</p><p>其他筛选条件voiceName String 音色名，模糊匹配labels Array of String 标签，匹配包含这些标签的音色</p> 
     * @return ExtParam <p>扩展参数，json字符串</p><p>其他筛选条件voiceName String 音色名，模糊匹配labels Array of String 标签，匹配包含这些标签的音色</p>
     */
    public String getExtParam() {
        return this.ExtParam;
    }

    /**
     * Set <p>扩展参数，json字符串</p><p>其他筛选条件voiceName String 音色名，模糊匹配labels Array of String 标签，匹配包含这些标签的音色</p>
     * @param ExtParam <p>扩展参数，json字符串</p><p>其他筛选条件voiceName String 音色名，模糊匹配labels Array of String 标签，匹配包含这些标签的音色</p>
     */
    public void setExtParam(String ExtParam) {
        this.ExtParam = ExtParam;
    }

    public DescribeVoicesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVoicesRequest(DescribeVoicesRequest source) {
        if (source.VoiceId != null) {
            this.VoiceId = new String(source.VoiceId);
        }
        if (source.VoiceType != null) {
            this.VoiceType = new String(source.VoiceType);
        }
        if (source.VoiceName != null) {
            this.VoiceName = new String(source.VoiceName);
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
        if (source.Languages != null) {
            this.Languages = new String[source.Languages.length];
            for (int i = 0; i < source.Languages.length; i++) {
                this.Languages[i] = new String(source.Languages[i]);
            }
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
        if (source.ExtParam != null) {
            this.ExtParam = new String(source.ExtParam);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VoiceId", this.VoiceId);
        this.setParamSimple(map, prefix + "VoiceType", this.VoiceType);
        this.setParamSimple(map, prefix + "VoiceName", this.VoiceName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Gender", this.Gender);
        this.setParamSimple(map, prefix + "Age", this.Age);
        this.setParamArraySimple(map, prefix + "Languages.", this.Languages);
        this.setParamArraySimple(map, prefix + "Labels.", this.Labels);
        this.setParamArraySimple(map, prefix + "Scenes.", this.Scenes);
        this.setParamSimple(map, prefix + "ExtParam", this.ExtParam);

    }
}

