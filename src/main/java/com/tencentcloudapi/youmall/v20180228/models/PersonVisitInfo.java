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

public class PersonVisitInfo extends AbstractModel{

    /**
    * 用户ID
    */
    @SerializedName("PersonId")
    @Expose
    private Long PersonId;

    /**
    * 用户到访ID
    */
    @SerializedName("VisitId")
    @Expose
    private Long VisitId;

    /**
    * 到访时间：Unix时间戳
    */
    @SerializedName("InTime")
    @Expose
    private Long InTime;

    /**
    * 抓拍到的头像Base64内容，已弃用，返回默认空值
    */
    @SerializedName("CapturedPicture")
    @Expose
    private String CapturedPicture;

    /**
    * 口罩类型：0不戴口罩，1戴口罩
    */
    @SerializedName("MaskType")
    @Expose
    private Long MaskType;

    /**
    * 眼镜类型：0不戴眼镜，1普通眼镜 , 2墨镜
    */
    @SerializedName("GlassType")
    @Expose
    private Long GlassType;

    /**
    * 发型：0 短发,  1长发
    */
    @SerializedName("HairType")
    @Expose
    private Long HairType;

    /**
    * 抓拍到的头像Url，在有效期内可以访问下载
    */
    @SerializedName("CapturedPictureUrl")
    @Expose
    private String CapturedPictureUrl;

    /**
    * 抓拍头像的场景图信息
    */
    @SerializedName("SceneInfo")
    @Expose
    private SceneInfo SceneInfo;

    /**
     * Get 用户ID 
     * @return PersonId 用户ID
     */
    public Long getPersonId() {
        return this.PersonId;
    }

    /**
     * Set 用户ID
     * @param PersonId 用户ID
     */
    public void setPersonId(Long PersonId) {
        this.PersonId = PersonId;
    }

    /**
     * Get 用户到访ID 
     * @return VisitId 用户到访ID
     */
    public Long getVisitId() {
        return this.VisitId;
    }

    /**
     * Set 用户到访ID
     * @param VisitId 用户到访ID
     */
    public void setVisitId(Long VisitId) {
        this.VisitId = VisitId;
    }

    /**
     * Get 到访时间：Unix时间戳 
     * @return InTime 到访时间：Unix时间戳
     */
    public Long getInTime() {
        return this.InTime;
    }

    /**
     * Set 到访时间：Unix时间戳
     * @param InTime 到访时间：Unix时间戳
     */
    public void setInTime(Long InTime) {
        this.InTime = InTime;
    }

    /**
     * Get 抓拍到的头像Base64内容，已弃用，返回默认空值 
     * @return CapturedPicture 抓拍到的头像Base64内容，已弃用，返回默认空值
     */
    public String getCapturedPicture() {
        return this.CapturedPicture;
    }

    /**
     * Set 抓拍到的头像Base64内容，已弃用，返回默认空值
     * @param CapturedPicture 抓拍到的头像Base64内容，已弃用，返回默认空值
     */
    public void setCapturedPicture(String CapturedPicture) {
        this.CapturedPicture = CapturedPicture;
    }

    /**
     * Get 口罩类型：0不戴口罩，1戴口罩 
     * @return MaskType 口罩类型：0不戴口罩，1戴口罩
     */
    public Long getMaskType() {
        return this.MaskType;
    }

    /**
     * Set 口罩类型：0不戴口罩，1戴口罩
     * @param MaskType 口罩类型：0不戴口罩，1戴口罩
     */
    public void setMaskType(Long MaskType) {
        this.MaskType = MaskType;
    }

    /**
     * Get 眼镜类型：0不戴眼镜，1普通眼镜 , 2墨镜 
     * @return GlassType 眼镜类型：0不戴眼镜，1普通眼镜 , 2墨镜
     */
    public Long getGlassType() {
        return this.GlassType;
    }

    /**
     * Set 眼镜类型：0不戴眼镜，1普通眼镜 , 2墨镜
     * @param GlassType 眼镜类型：0不戴眼镜，1普通眼镜 , 2墨镜
     */
    public void setGlassType(Long GlassType) {
        this.GlassType = GlassType;
    }

    /**
     * Get 发型：0 短发,  1长发 
     * @return HairType 发型：0 短发,  1长发
     */
    public Long getHairType() {
        return this.HairType;
    }

    /**
     * Set 发型：0 短发,  1长发
     * @param HairType 发型：0 短发,  1长发
     */
    public void setHairType(Long HairType) {
        this.HairType = HairType;
    }

    /**
     * Get 抓拍到的头像Url，在有效期内可以访问下载 
     * @return CapturedPictureUrl 抓拍到的头像Url，在有效期内可以访问下载
     */
    public String getCapturedPictureUrl() {
        return this.CapturedPictureUrl;
    }

    /**
     * Set 抓拍到的头像Url，在有效期内可以访问下载
     * @param CapturedPictureUrl 抓拍到的头像Url，在有效期内可以访问下载
     */
    public void setCapturedPictureUrl(String CapturedPictureUrl) {
        this.CapturedPictureUrl = CapturedPictureUrl;
    }

    /**
     * Get 抓拍头像的场景图信息 
     * @return SceneInfo 抓拍头像的场景图信息
     */
    public SceneInfo getSceneInfo() {
        return this.SceneInfo;
    }

    /**
     * Set 抓拍头像的场景图信息
     * @param SceneInfo 抓拍头像的场景图信息
     */
    public void setSceneInfo(SceneInfo SceneInfo) {
        this.SceneInfo = SceneInfo;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PersonId", this.PersonId);
        this.setParamSimple(map, prefix + "VisitId", this.VisitId);
        this.setParamSimple(map, prefix + "InTime", this.InTime);
        this.setParamSimple(map, prefix + "CapturedPicture", this.CapturedPicture);
        this.setParamSimple(map, prefix + "MaskType", this.MaskType);
        this.setParamSimple(map, prefix + "GlassType", this.GlassType);
        this.setParamSimple(map, prefix + "HairType", this.HairType);
        this.setParamSimple(map, prefix + "CapturedPictureUrl", this.CapturedPictureUrl);
        this.setParamObj(map, prefix + "SceneInfo.", this.SceneInfo);

    }
}

