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

public class VoiceInfo extends AbstractModel {

    /**
    * <p>音色ID</p>
    */
    @SerializedName("VoiceId")
    @Expose
    private String VoiceId;

    /**
    * <p>音色名</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>音色描述信息</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>音色类别</p><p>枚举值：</p><ul><li>system： 系统音色</li></ul>
    */
    @SerializedName("Category")
    @Expose
    private String Category;

    /**
    * <p>性别</p><p>枚举值：</p><ul><li>male： 男</li><li>famale： 女</li></ul>
    */
    @SerializedName("Gender")
    @Expose
    private String Gender;

    /**
    * <p>支持语种列表</p><p>如：en</p>
    */
    @SerializedName("Languages")
    @Expose
    private String [] Languages;

    /**
    * <p>试听音频URL</p>
    */
    @SerializedName("AudioUrl")
    @Expose
    private String AudioUrl;

    /**
    * <p>标签列表</p><p>如：温柔</p>
    */
    @SerializedName("Labels")
    @Expose
    private String [] Labels;

    /**
    * <p>推荐场景</p><p>如：教育</p>
    */
    @SerializedName("Scenes")
    @Expose
    private String [] Scenes;

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
     * Get <p>音色描述信息</p> 
     * @return Description <p>音色描述信息</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>音色描述信息</p>
     * @param Description <p>音色描述信息</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>音色类别</p><p>枚举值：</p><ul><li>system： 系统音色</li></ul> 
     * @return Category <p>音色类别</p><p>枚举值：</p><ul><li>system： 系统音色</li></ul>
     */
    public String getCategory() {
        return this.Category;
    }

    /**
     * Set <p>音色类别</p><p>枚举值：</p><ul><li>system： 系统音色</li></ul>
     * @param Category <p>音色类别</p><p>枚举值：</p><ul><li>system： 系统音色</li></ul>
     */
    public void setCategory(String Category) {
        this.Category = Category;
    }

    /**
     * Get <p>性别</p><p>枚举值：</p><ul><li>male： 男</li><li>famale： 女</li></ul> 
     * @return Gender <p>性别</p><p>枚举值：</p><ul><li>male： 男</li><li>famale： 女</li></ul>
     */
    public String getGender() {
        return this.Gender;
    }

    /**
     * Set <p>性别</p><p>枚举值：</p><ul><li>male： 男</li><li>famale： 女</li></ul>
     * @param Gender <p>性别</p><p>枚举值：</p><ul><li>male： 男</li><li>famale： 女</li></ul>
     */
    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    /**
     * Get <p>支持语种列表</p><p>如：en</p> 
     * @return Languages <p>支持语种列表</p><p>如：en</p>
     */
    public String [] getLanguages() {
        return this.Languages;
    }

    /**
     * Set <p>支持语种列表</p><p>如：en</p>
     * @param Languages <p>支持语种列表</p><p>如：en</p>
     */
    public void setLanguages(String [] Languages) {
        this.Languages = Languages;
    }

    /**
     * Get <p>试听音频URL</p> 
     * @return AudioUrl <p>试听音频URL</p>
     */
    public String getAudioUrl() {
        return this.AudioUrl;
    }

    /**
     * Set <p>试听音频URL</p>
     * @param AudioUrl <p>试听音频URL</p>
     */
    public void setAudioUrl(String AudioUrl) {
        this.AudioUrl = AudioUrl;
    }

    /**
     * Get <p>标签列表</p><p>如：温柔</p> 
     * @return Labels <p>标签列表</p><p>如：温柔</p>
     */
    public String [] getLabels() {
        return this.Labels;
    }

    /**
     * Set <p>标签列表</p><p>如：温柔</p>
     * @param Labels <p>标签列表</p><p>如：温柔</p>
     */
    public void setLabels(String [] Labels) {
        this.Labels = Labels;
    }

    /**
     * Get <p>推荐场景</p><p>如：教育</p> 
     * @return Scenes <p>推荐场景</p><p>如：教育</p>
     */
    public String [] getScenes() {
        return this.Scenes;
    }

    /**
     * Set <p>推荐场景</p><p>如：教育</p>
     * @param Scenes <p>推荐场景</p><p>如：教育</p>
     */
    public void setScenes(String [] Scenes) {
        this.Scenes = Scenes;
    }

    public VoiceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VoiceInfo(VoiceInfo source) {
        if (source.VoiceId != null) {
            this.VoiceId = new String(source.VoiceId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Category != null) {
            this.Category = new String(source.Category);
        }
        if (source.Gender != null) {
            this.Gender = new String(source.Gender);
        }
        if (source.Languages != null) {
            this.Languages = new String[source.Languages.length];
            for (int i = 0; i < source.Languages.length; i++) {
                this.Languages[i] = new String(source.Languages[i]);
            }
        }
        if (source.AudioUrl != null) {
            this.AudioUrl = new String(source.AudioUrl);
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
        this.setParamSimple(map, prefix + "VoiceId", this.VoiceId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Category", this.Category);
        this.setParamSimple(map, prefix + "Gender", this.Gender);
        this.setParamArraySimple(map, prefix + "Languages.", this.Languages);
        this.setParamSimple(map, prefix + "AudioUrl", this.AudioUrl);
        this.setParamArraySimple(map, prefix + "Labels.", this.Labels);
        this.setParamArraySimple(map, prefix + "Scenes.", this.Scenes);

    }
}

