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
package com.tencentcloudapi.cdc.v20201214.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifySiteInfoRequest extends AbstractModel{

    /**
    * 机房ID
    */
    @SerializedName("SiteId")
    @Expose
    private String SiteId;

    /**
    * 站点名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 站点描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 注意事项
    */
    @SerializedName("Note")
    @Expose
    private String Note;

    /**
    * 站点所在国家
    */
    @SerializedName("Country")
    @Expose
    private String Country;

    /**
    * 站点所在省份
    */
    @SerializedName("Province")
    @Expose
    private String Province;

    /**
    * 站点所在城市
    */
    @SerializedName("City")
    @Expose
    private String City;

    /**
    * 站点所在地区的邮编
    */
    @SerializedName("PostalCode")
    @Expose
    private String PostalCode;

    /**
    * 站点所在地区的详细地址信息
    */
    @SerializedName("AddressLine")
    @Expose
    private String AddressLine;

    /**
     * Get 机房ID 
     * @return SiteId 机房ID
     */
    public String getSiteId() {
        return this.SiteId;
    }

    /**
     * Set 机房ID
     * @param SiteId 机房ID
     */
    public void setSiteId(String SiteId) {
        this.SiteId = SiteId;
    }

    /**
     * Get 站点名称 
     * @return Name 站点名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 站点名称
     * @param Name 站点名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 站点描述 
     * @return Description 站点描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 站点描述
     * @param Description 站点描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 注意事项 
     * @return Note 注意事项
     */
    public String getNote() {
        return this.Note;
    }

    /**
     * Set 注意事项
     * @param Note 注意事项
     */
    public void setNote(String Note) {
        this.Note = Note;
    }

    /**
     * Get 站点所在国家 
     * @return Country 站点所在国家
     */
    public String getCountry() {
        return this.Country;
    }

    /**
     * Set 站点所在国家
     * @param Country 站点所在国家
     */
    public void setCountry(String Country) {
        this.Country = Country;
    }

    /**
     * Get 站点所在省份 
     * @return Province 站点所在省份
     */
    public String getProvince() {
        return this.Province;
    }

    /**
     * Set 站点所在省份
     * @param Province 站点所在省份
     */
    public void setProvince(String Province) {
        this.Province = Province;
    }

    /**
     * Get 站点所在城市 
     * @return City 站点所在城市
     */
    public String getCity() {
        return this.City;
    }

    /**
     * Set 站点所在城市
     * @param City 站点所在城市
     */
    public void setCity(String City) {
        this.City = City;
    }

    /**
     * Get 站点所在地区的邮编 
     * @return PostalCode 站点所在地区的邮编
     */
    public String getPostalCode() {
        return this.PostalCode;
    }

    /**
     * Set 站点所在地区的邮编
     * @param PostalCode 站点所在地区的邮编
     */
    public void setPostalCode(String PostalCode) {
        this.PostalCode = PostalCode;
    }

    /**
     * Get 站点所在地区的详细地址信息 
     * @return AddressLine 站点所在地区的详细地址信息
     */
    public String getAddressLine() {
        return this.AddressLine;
    }

    /**
     * Set 站点所在地区的详细地址信息
     * @param AddressLine 站点所在地区的详细地址信息
     */
    public void setAddressLine(String AddressLine) {
        this.AddressLine = AddressLine;
    }

    public ModifySiteInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifySiteInfoRequest(ModifySiteInfoRequest source) {
        if (source.SiteId != null) {
            this.SiteId = new String(source.SiteId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Note != null) {
            this.Note = new String(source.Note);
        }
        if (source.Country != null) {
            this.Country = new String(source.Country);
        }
        if (source.Province != null) {
            this.Province = new String(source.Province);
        }
        if (source.City != null) {
            this.City = new String(source.City);
        }
        if (source.PostalCode != null) {
            this.PostalCode = new String(source.PostalCode);
        }
        if (source.AddressLine != null) {
            this.AddressLine = new String(source.AddressLine);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SiteId", this.SiteId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Note", this.Note);
        this.setParamSimple(map, prefix + "Country", this.Country);
        this.setParamSimple(map, prefix + "Province", this.Province);
        this.setParamSimple(map, prefix + "City", this.City);
        this.setParamSimple(map, prefix + "PostalCode", this.PostalCode);
        this.setParamSimple(map, prefix + "AddressLine", this.AddressLine);

    }
}

