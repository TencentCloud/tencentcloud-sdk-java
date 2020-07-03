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

public class CreateFacePictureRequest extends AbstractModel{

    /**
    * 集团ID
    */
    @SerializedName("CompanyId")
    @Expose
    private String CompanyId;

    /**
    * 人物类型（0表示普通顾客，1 白名单，2 表示黑名单，101表示集团白名单，102表示集团黑名单）
    */
    @SerializedName("PersonType")
    @Expose
    private Long PersonType;

    /**
    * 图片BASE编码
    */
    @SerializedName("Picture")
    @Expose
    private String Picture;

    /**
    * 图片名称
    */
    @SerializedName("PictureName")
    @Expose
    private String PictureName;

    /**
    * 店铺ID，如果不填表示操作集团身份库
    */
    @SerializedName("ShopId")
    @Expose
    private Long ShopId;

    /**
    * 是否强制更新：为ture时会为用户创建一个新的指定PersonType的身份;目前这个参数已废弃，可不传
    */
    @SerializedName("IsForceUpload")
    @Expose
    private Boolean IsForceUpload;

    /**
     * Get 集团ID 
     * @return CompanyId 集团ID
     */
    public String getCompanyId() {
        return this.CompanyId;
    }

    /**
     * Set 集团ID
     * @param CompanyId 集团ID
     */
    public void setCompanyId(String CompanyId) {
        this.CompanyId = CompanyId;
    }

    /**
     * Get 人物类型（0表示普通顾客，1 白名单，2 表示黑名单，101表示集团白名单，102表示集团黑名单） 
     * @return PersonType 人物类型（0表示普通顾客，1 白名单，2 表示黑名单，101表示集团白名单，102表示集团黑名单）
     */
    public Long getPersonType() {
        return this.PersonType;
    }

    /**
     * Set 人物类型（0表示普通顾客，1 白名单，2 表示黑名单，101表示集团白名单，102表示集团黑名单）
     * @param PersonType 人物类型（0表示普通顾客，1 白名单，2 表示黑名单，101表示集团白名单，102表示集团黑名单）
     */
    public void setPersonType(Long PersonType) {
        this.PersonType = PersonType;
    }

    /**
     * Get 图片BASE编码 
     * @return Picture 图片BASE编码
     */
    public String getPicture() {
        return this.Picture;
    }

    /**
     * Set 图片BASE编码
     * @param Picture 图片BASE编码
     */
    public void setPicture(String Picture) {
        this.Picture = Picture;
    }

    /**
     * Get 图片名称 
     * @return PictureName 图片名称
     */
    public String getPictureName() {
        return this.PictureName;
    }

    /**
     * Set 图片名称
     * @param PictureName 图片名称
     */
    public void setPictureName(String PictureName) {
        this.PictureName = PictureName;
    }

    /**
     * Get 店铺ID，如果不填表示操作集团身份库 
     * @return ShopId 店铺ID，如果不填表示操作集团身份库
     */
    public Long getShopId() {
        return this.ShopId;
    }

    /**
     * Set 店铺ID，如果不填表示操作集团身份库
     * @param ShopId 店铺ID，如果不填表示操作集团身份库
     */
    public void setShopId(Long ShopId) {
        this.ShopId = ShopId;
    }

    /**
     * Get 是否强制更新：为ture时会为用户创建一个新的指定PersonType的身份;目前这个参数已废弃，可不传 
     * @return IsForceUpload 是否强制更新：为ture时会为用户创建一个新的指定PersonType的身份;目前这个参数已废弃，可不传
     */
    public Boolean getIsForceUpload() {
        return this.IsForceUpload;
    }

    /**
     * Set 是否强制更新：为ture时会为用户创建一个新的指定PersonType的身份;目前这个参数已废弃，可不传
     * @param IsForceUpload 是否强制更新：为ture时会为用户创建一个新的指定PersonType的身份;目前这个参数已废弃，可不传
     */
    public void setIsForceUpload(Boolean IsForceUpload) {
        this.IsForceUpload = IsForceUpload;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CompanyId", this.CompanyId);
        this.setParamSimple(map, prefix + "PersonType", this.PersonType);
        this.setParamSimple(map, prefix + "Picture", this.Picture);
        this.setParamSimple(map, prefix + "PictureName", this.PictureName);
        this.setParamSimple(map, prefix + "ShopId", this.ShopId);
        this.setParamSimple(map, prefix + "IsForceUpload", this.IsForceUpload);

    }
}

