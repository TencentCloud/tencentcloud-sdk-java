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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateLiveAvatarCloneFigureRequest extends AbstractModel {

    /**
    * <p>形象克隆场景类型</p><p>枚举值：</p><ul><li>PHOTO： 图生数字人</li><li>GREEN_SCREEN： 绿幕数字人</li><li>REAL_SHOT： 实景数字人</li></ul>
    */
    @SerializedName("SceneType")
    @Expose
    private String SceneType;

    /**
    * <p>克隆的形象的名字</p>
    */
    @SerializedName("FigureName")
    @Expose
    private String FigureName;

    /**
    * <p>克隆的形象的url</p>
    */
    @SerializedName("MaterialUrl")
    @Expose
    private String MaterialUrl;

    /**
    * <p>克隆的形象的性别</p><p>枚举值：</p><ul><li>MALE： 男</li><li>FEMALE： 女</li><li>UNHNOWN： 不知道</li></ul>
    */
    @SerializedName("Gender")
    @Expose
    private String Gender;

    /**
    * <p>授权pdf</p>
    */
    @SerializedName("IdentityWrittenUrl")
    @Expose
    private String IdentityWrittenUrl;

    /**
    * <p>授权视频</p>
    */
    @SerializedName("IdentityVideoUrl")
    @Expose
    private String IdentityVideoUrl;

    /**
    * <p>图生视频时，动作训练幅度大小</p><p>枚举值：</p><ul><li>0： 只有头部轻微动</li><li>1： 头部跟身体均动</li></ul>
    */
    @SerializedName("PhotoVersion")
    @Expose
    private Long PhotoVersion;

    /**
     * Get <p>形象克隆场景类型</p><p>枚举值：</p><ul><li>PHOTO： 图生数字人</li><li>GREEN_SCREEN： 绿幕数字人</li><li>REAL_SHOT： 实景数字人</li></ul> 
     * @return SceneType <p>形象克隆场景类型</p><p>枚举值：</p><ul><li>PHOTO： 图生数字人</li><li>GREEN_SCREEN： 绿幕数字人</li><li>REAL_SHOT： 实景数字人</li></ul>
     */
    public String getSceneType() {
        return this.SceneType;
    }

    /**
     * Set <p>形象克隆场景类型</p><p>枚举值：</p><ul><li>PHOTO： 图生数字人</li><li>GREEN_SCREEN： 绿幕数字人</li><li>REAL_SHOT： 实景数字人</li></ul>
     * @param SceneType <p>形象克隆场景类型</p><p>枚举值：</p><ul><li>PHOTO： 图生数字人</li><li>GREEN_SCREEN： 绿幕数字人</li><li>REAL_SHOT： 实景数字人</li></ul>
     */
    public void setSceneType(String SceneType) {
        this.SceneType = SceneType;
    }

    /**
     * Get <p>克隆的形象的名字</p> 
     * @return FigureName <p>克隆的形象的名字</p>
     */
    public String getFigureName() {
        return this.FigureName;
    }

    /**
     * Set <p>克隆的形象的名字</p>
     * @param FigureName <p>克隆的形象的名字</p>
     */
    public void setFigureName(String FigureName) {
        this.FigureName = FigureName;
    }

    /**
     * Get <p>克隆的形象的url</p> 
     * @return MaterialUrl <p>克隆的形象的url</p>
     */
    public String getMaterialUrl() {
        return this.MaterialUrl;
    }

    /**
     * Set <p>克隆的形象的url</p>
     * @param MaterialUrl <p>克隆的形象的url</p>
     */
    public void setMaterialUrl(String MaterialUrl) {
        this.MaterialUrl = MaterialUrl;
    }

    /**
     * Get <p>克隆的形象的性别</p><p>枚举值：</p><ul><li>MALE： 男</li><li>FEMALE： 女</li><li>UNHNOWN： 不知道</li></ul> 
     * @return Gender <p>克隆的形象的性别</p><p>枚举值：</p><ul><li>MALE： 男</li><li>FEMALE： 女</li><li>UNHNOWN： 不知道</li></ul>
     */
    public String getGender() {
        return this.Gender;
    }

    /**
     * Set <p>克隆的形象的性别</p><p>枚举值：</p><ul><li>MALE： 男</li><li>FEMALE： 女</li><li>UNHNOWN： 不知道</li></ul>
     * @param Gender <p>克隆的形象的性别</p><p>枚举值：</p><ul><li>MALE： 男</li><li>FEMALE： 女</li><li>UNHNOWN： 不知道</li></ul>
     */
    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    /**
     * Get <p>授权pdf</p> 
     * @return IdentityWrittenUrl <p>授权pdf</p>
     */
    public String getIdentityWrittenUrl() {
        return this.IdentityWrittenUrl;
    }

    /**
     * Set <p>授权pdf</p>
     * @param IdentityWrittenUrl <p>授权pdf</p>
     */
    public void setIdentityWrittenUrl(String IdentityWrittenUrl) {
        this.IdentityWrittenUrl = IdentityWrittenUrl;
    }

    /**
     * Get <p>授权视频</p> 
     * @return IdentityVideoUrl <p>授权视频</p>
     */
    public String getIdentityVideoUrl() {
        return this.IdentityVideoUrl;
    }

    /**
     * Set <p>授权视频</p>
     * @param IdentityVideoUrl <p>授权视频</p>
     */
    public void setIdentityVideoUrl(String IdentityVideoUrl) {
        this.IdentityVideoUrl = IdentityVideoUrl;
    }

    /**
     * Get <p>图生视频时，动作训练幅度大小</p><p>枚举值：</p><ul><li>0： 只有头部轻微动</li><li>1： 头部跟身体均动</li></ul> 
     * @return PhotoVersion <p>图生视频时，动作训练幅度大小</p><p>枚举值：</p><ul><li>0： 只有头部轻微动</li><li>1： 头部跟身体均动</li></ul>
     */
    public Long getPhotoVersion() {
        return this.PhotoVersion;
    }

    /**
     * Set <p>图生视频时，动作训练幅度大小</p><p>枚举值：</p><ul><li>0： 只有头部轻微动</li><li>1： 头部跟身体均动</li></ul>
     * @param PhotoVersion <p>图生视频时，动作训练幅度大小</p><p>枚举值：</p><ul><li>0： 只有头部轻微动</li><li>1： 头部跟身体均动</li></ul>
     */
    public void setPhotoVersion(Long PhotoVersion) {
        this.PhotoVersion = PhotoVersion;
    }

    public CreateLiveAvatarCloneFigureRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateLiveAvatarCloneFigureRequest(CreateLiveAvatarCloneFigureRequest source) {
        if (source.SceneType != null) {
            this.SceneType = new String(source.SceneType);
        }
        if (source.FigureName != null) {
            this.FigureName = new String(source.FigureName);
        }
        if (source.MaterialUrl != null) {
            this.MaterialUrl = new String(source.MaterialUrl);
        }
        if (source.Gender != null) {
            this.Gender = new String(source.Gender);
        }
        if (source.IdentityWrittenUrl != null) {
            this.IdentityWrittenUrl = new String(source.IdentityWrittenUrl);
        }
        if (source.IdentityVideoUrl != null) {
            this.IdentityVideoUrl = new String(source.IdentityVideoUrl);
        }
        if (source.PhotoVersion != null) {
            this.PhotoVersion = new Long(source.PhotoVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SceneType", this.SceneType);
        this.setParamSimple(map, prefix + "FigureName", this.FigureName);
        this.setParamSimple(map, prefix + "MaterialUrl", this.MaterialUrl);
        this.setParamSimple(map, prefix + "Gender", this.Gender);
        this.setParamSimple(map, prefix + "IdentityWrittenUrl", this.IdentityWrittenUrl);
        this.setParamSimple(map, prefix + "IdentityVideoUrl", this.IdentityVideoUrl);
        this.setParamSimple(map, prefix + "PhotoVersion", this.PhotoVersion);

    }
}

