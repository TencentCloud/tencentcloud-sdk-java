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
package com.tencentcloudapi.youmall.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyPersonFeatureInfoRequest extends AbstractModel {

    /**
    * 集团ID
    */
    @SerializedName("CompanyId")
    @Expose
    private String CompanyId;

    /**
    * 需要修改的顾客id
    */
    @SerializedName("PersonId")
    @Expose
    private Long PersonId;

    /**
    * 图片BASE编码
    */
    @SerializedName("Picture")
    @Expose
    private String Picture;

    /**
    * 图片名称（尽量不要重复）
    */
    @SerializedName("PictureName")
    @Expose
    private String PictureName;

    /**
    * 人物类型，仅能操作黑白名单顾客（1 白名单，2 表示黑名单，101表示集团白名单，102表示集团黑名单）
    */
    @SerializedName("PersonType")
    @Expose
    private Long PersonType;

    /**
    * 店铺ID，如果不填表示操作集团身份库
    */
    @SerializedName("ShopId")
    @Expose
    private Long ShopId;

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
     * Get 需要修改的顾客id 
     * @return PersonId 需要修改的顾客id
     */
    public Long getPersonId() {
        return this.PersonId;
    }

    /**
     * Set 需要修改的顾客id
     * @param PersonId 需要修改的顾客id
     */
    public void setPersonId(Long PersonId) {
        this.PersonId = PersonId;
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
     * Get 图片名称（尽量不要重复） 
     * @return PictureName 图片名称（尽量不要重复）
     */
    public String getPictureName() {
        return this.PictureName;
    }

    /**
     * Set 图片名称（尽量不要重复）
     * @param PictureName 图片名称（尽量不要重复）
     */
    public void setPictureName(String PictureName) {
        this.PictureName = PictureName;
    }

    /**
     * Get 人物类型，仅能操作黑白名单顾客（1 白名单，2 表示黑名单，101表示集团白名单，102表示集团黑名单） 
     * @return PersonType 人物类型，仅能操作黑白名单顾客（1 白名单，2 表示黑名单，101表示集团白名单，102表示集团黑名单）
     */
    public Long getPersonType() {
        return this.PersonType;
    }

    /**
     * Set 人物类型，仅能操作黑白名单顾客（1 白名单，2 表示黑名单，101表示集团白名单，102表示集团黑名单）
     * @param PersonType 人物类型，仅能操作黑白名单顾客（1 白名单，2 表示黑名单，101表示集团白名单，102表示集团黑名单）
     */
    public void setPersonType(Long PersonType) {
        this.PersonType = PersonType;
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

    public ModifyPersonFeatureInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyPersonFeatureInfoRequest(ModifyPersonFeatureInfoRequest source) {
        if (source.CompanyId != null) {
            this.CompanyId = new String(source.CompanyId);
        }
        if (source.PersonId != null) {
            this.PersonId = new Long(source.PersonId);
        }
        if (source.Picture != null) {
            this.Picture = new String(source.Picture);
        }
        if (source.PictureName != null) {
            this.PictureName = new String(source.PictureName);
        }
        if (source.PersonType != null) {
            this.PersonType = new Long(source.PersonType);
        }
        if (source.ShopId != null) {
            this.ShopId = new Long(source.ShopId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CompanyId", this.CompanyId);
        this.setParamSimple(map, prefix + "PersonId", this.PersonId);
        this.setParamSimple(map, prefix + "Picture", this.Picture);
        this.setParamSimple(map, prefix + "PictureName", this.PictureName);
        this.setParamSimple(map, prefix + "PersonType", this.PersonType);
        this.setParamSimple(map, prefix + "ShopId", this.ShopId);

    }
}

