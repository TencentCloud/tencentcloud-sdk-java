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

public class ImageMarshal extends AbstractModel{

    /**
    * 售卖组合唯一标识
    */
    @SerializedName("MarshalId")
    @Expose
    private Long MarshalId;

    /**
    * 图片高度
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * 图片宽度
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * 图片大小
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
    * 图片格式
    */
    @SerializedName("Format")
    @Expose
    private String Format;

    /**
    * 图片价格(单位:分)
    */
    @SerializedName("Price")
    @Expose
    private Long Price;

    /**
    * 授权范围
    */
    @SerializedName("LicenseScope")
    @Expose
    private String LicenseScope;

    /**
    * 是否支持VIP购买
    */
    @SerializedName("IsVip")
    @Expose
    private Boolean IsVip;

    /**
    * 授权范围id
    */
    @SerializedName("LicenseScopeId")
    @Expose
    private Long LicenseScopeId;

    /**
    * 尺寸
    */
    @SerializedName("DimensionsName")
    @Expose
    private String DimensionsName;

    /**
    * 尺寸id
    */
    @SerializedName("DimensionsNameId")
    @Expose
    private Long DimensionsNameId;

    /**
     * Get 售卖组合唯一标识 
     * @return MarshalId 售卖组合唯一标识
     */
    public Long getMarshalId() {
        return this.MarshalId;
    }

    /**
     * Set 售卖组合唯一标识
     * @param MarshalId 售卖组合唯一标识
     */
    public void setMarshalId(Long MarshalId) {
        this.MarshalId = MarshalId;
    }

    /**
     * Get 图片高度 
     * @return Height 图片高度
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set 图片高度
     * @param Height 图片高度
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get 图片宽度 
     * @return Width 图片宽度
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set 图片宽度
     * @param Width 图片宽度
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get 图片大小 
     * @return Size 图片大小
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set 图片大小
     * @param Size 图片大小
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    /**
     * Get 图片格式 
     * @return Format 图片格式
     */
    public String getFormat() {
        return this.Format;
    }

    /**
     * Set 图片格式
     * @param Format 图片格式
     */
    public void setFormat(String Format) {
        this.Format = Format;
    }

    /**
     * Get 图片价格(单位:分) 
     * @return Price 图片价格(单位:分)
     */
    public Long getPrice() {
        return this.Price;
    }

    /**
     * Set 图片价格(单位:分)
     * @param Price 图片价格(单位:分)
     */
    public void setPrice(Long Price) {
        this.Price = Price;
    }

    /**
     * Get 授权范围 
     * @return LicenseScope 授权范围
     */
    public String getLicenseScope() {
        return this.LicenseScope;
    }

    /**
     * Set 授权范围
     * @param LicenseScope 授权范围
     */
    public void setLicenseScope(String LicenseScope) {
        this.LicenseScope = LicenseScope;
    }

    /**
     * Get 是否支持VIP购买 
     * @return IsVip 是否支持VIP购买
     */
    public Boolean getIsVip() {
        return this.IsVip;
    }

    /**
     * Set 是否支持VIP购买
     * @param IsVip 是否支持VIP购买
     */
    public void setIsVip(Boolean IsVip) {
        this.IsVip = IsVip;
    }

    /**
     * Get 授权范围id 
     * @return LicenseScopeId 授权范围id
     */
    public Long getLicenseScopeId() {
        return this.LicenseScopeId;
    }

    /**
     * Set 授权范围id
     * @param LicenseScopeId 授权范围id
     */
    public void setLicenseScopeId(Long LicenseScopeId) {
        this.LicenseScopeId = LicenseScopeId;
    }

    /**
     * Get 尺寸 
     * @return DimensionsName 尺寸
     */
    public String getDimensionsName() {
        return this.DimensionsName;
    }

    /**
     * Set 尺寸
     * @param DimensionsName 尺寸
     */
    public void setDimensionsName(String DimensionsName) {
        this.DimensionsName = DimensionsName;
    }

    /**
     * Get 尺寸id 
     * @return DimensionsNameId 尺寸id
     */
    public Long getDimensionsNameId() {
        return this.DimensionsNameId;
    }

    /**
     * Set 尺寸id
     * @param DimensionsNameId 尺寸id
     */
    public void setDimensionsNameId(Long DimensionsNameId) {
        this.DimensionsNameId = DimensionsNameId;
    }

    public ImageMarshal() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageMarshal(ImageMarshal source) {
        if (source.MarshalId != null) {
            this.MarshalId = new Long(source.MarshalId);
        }
        if (source.Height != null) {
            this.Height = new Long(source.Height);
        }
        if (source.Width != null) {
            this.Width = new Long(source.Width);
        }
        if (source.Size != null) {
            this.Size = new Long(source.Size);
        }
        if (source.Format != null) {
            this.Format = new String(source.Format);
        }
        if (source.Price != null) {
            this.Price = new Long(source.Price);
        }
        if (source.LicenseScope != null) {
            this.LicenseScope = new String(source.LicenseScope);
        }
        if (source.IsVip != null) {
            this.IsVip = new Boolean(source.IsVip);
        }
        if (source.LicenseScopeId != null) {
            this.LicenseScopeId = new Long(source.LicenseScopeId);
        }
        if (source.DimensionsName != null) {
            this.DimensionsName = new String(source.DimensionsName);
        }
        if (source.DimensionsNameId != null) {
            this.DimensionsNameId = new Long(source.DimensionsNameId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MarshalId", this.MarshalId);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "Format", this.Format);
        this.setParamSimple(map, prefix + "Price", this.Price);
        this.setParamSimple(map, prefix + "LicenseScope", this.LicenseScope);
        this.setParamSimple(map, prefix + "IsVip", this.IsVip);
        this.setParamSimple(map, prefix + "LicenseScopeId", this.LicenseScopeId);
        this.setParamSimple(map, prefix + "DimensionsName", this.DimensionsName);
        this.setParamSimple(map, prefix + "DimensionsNameId", this.DimensionsNameId);

    }
}

