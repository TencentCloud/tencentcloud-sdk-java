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
package com.tencentcloudapi.ape.v20200513.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImageInfo extends AbstractModel{

    /**
    * 图片Id
    */
    @SerializedName("ImageId")
    @Expose
    private Long ImageId;

    /**
    * 授权场景Id
    */
    @SerializedName("LicenseScopeId")
    @Expose
    private Long LicenseScopeId;

    /**
    * 尺寸名称Id
    */
    @SerializedName("DimensionsNameId")
    @Expose
    private Long DimensionsNameId;

    /**
    * 平台用户标识
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 平台用户下载图片购买的价格(单位:分)
    */
    @SerializedName("DownloadPrice")
    @Expose
    private Long DownloadPrice;

    /**
    * 下载类型。匹配集合中的任意元素：
<li>Single: 单张购买下载</li>
<li>BasicEnterpriseMember: 企业基础会员下载</li>
<li>AdvancedEnterpriseMember: 企业高级会员下载</li>
<li>DistinguishedEnterpriseMember: 企业尊享会员下载</li>
    */
    @SerializedName("DownloadType")
    @Expose
    private String DownloadType;

    /**
     * Get 图片Id 
     * @return ImageId 图片Id
     */
    public Long getImageId() {
        return this.ImageId;
    }

    /**
     * Set 图片Id
     * @param ImageId 图片Id
     */
    public void setImageId(Long ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * Get 授权场景Id 
     * @return LicenseScopeId 授权场景Id
     */
    public Long getLicenseScopeId() {
        return this.LicenseScopeId;
    }

    /**
     * Set 授权场景Id
     * @param LicenseScopeId 授权场景Id
     */
    public void setLicenseScopeId(Long LicenseScopeId) {
        this.LicenseScopeId = LicenseScopeId;
    }

    /**
     * Get 尺寸名称Id 
     * @return DimensionsNameId 尺寸名称Id
     */
    public Long getDimensionsNameId() {
        return this.DimensionsNameId;
    }

    /**
     * Set 尺寸名称Id
     * @param DimensionsNameId 尺寸名称Id
     */
    public void setDimensionsNameId(Long DimensionsNameId) {
        this.DimensionsNameId = DimensionsNameId;
    }

    /**
     * Get 平台用户标识 
     * @return UserId 平台用户标识
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 平台用户标识
     * @param UserId 平台用户标识
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 平台用户下载图片购买的价格(单位:分) 
     * @return DownloadPrice 平台用户下载图片购买的价格(单位:分)
     */
    public Long getDownloadPrice() {
        return this.DownloadPrice;
    }

    /**
     * Set 平台用户下载图片购买的价格(单位:分)
     * @param DownloadPrice 平台用户下载图片购买的价格(单位:分)
     */
    public void setDownloadPrice(Long DownloadPrice) {
        this.DownloadPrice = DownloadPrice;
    }

    /**
     * Get 下载类型。匹配集合中的任意元素：
<li>Single: 单张购买下载</li>
<li>BasicEnterpriseMember: 企业基础会员下载</li>
<li>AdvancedEnterpriseMember: 企业高级会员下载</li>
<li>DistinguishedEnterpriseMember: 企业尊享会员下载</li> 
     * @return DownloadType 下载类型。匹配集合中的任意元素：
<li>Single: 单张购买下载</li>
<li>BasicEnterpriseMember: 企业基础会员下载</li>
<li>AdvancedEnterpriseMember: 企业高级会员下载</li>
<li>DistinguishedEnterpriseMember: 企业尊享会员下载</li>
     */
    public String getDownloadType() {
        return this.DownloadType;
    }

    /**
     * Set 下载类型。匹配集合中的任意元素：
<li>Single: 单张购买下载</li>
<li>BasicEnterpriseMember: 企业基础会员下载</li>
<li>AdvancedEnterpriseMember: 企业高级会员下载</li>
<li>DistinguishedEnterpriseMember: 企业尊享会员下载</li>
     * @param DownloadType 下载类型。匹配集合中的任意元素：
<li>Single: 单张购买下载</li>
<li>BasicEnterpriseMember: 企业基础会员下载</li>
<li>AdvancedEnterpriseMember: 企业高级会员下载</li>
<li>DistinguishedEnterpriseMember: 企业尊享会员下载</li>
     */
    public void setDownloadType(String DownloadType) {
        this.DownloadType = DownloadType;
    }

    public ImageInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageInfo(ImageInfo source) {
        if (source.ImageId != null) {
            this.ImageId = new Long(source.ImageId);
        }
        if (source.LicenseScopeId != null) {
            this.LicenseScopeId = new Long(source.LicenseScopeId);
        }
        if (source.DimensionsNameId != null) {
            this.DimensionsNameId = new Long(source.DimensionsNameId);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.DownloadPrice != null) {
            this.DownloadPrice = new Long(source.DownloadPrice);
        }
        if (source.DownloadType != null) {
            this.DownloadType = new String(source.DownloadType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);
        this.setParamSimple(map, prefix + "LicenseScopeId", this.LicenseScopeId);
        this.setParamSimple(map, prefix + "DimensionsNameId", this.DimensionsNameId);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "DownloadPrice", this.DownloadPrice);
        this.setParamSimple(map, prefix + "DownloadType", this.DownloadType);

    }
}

