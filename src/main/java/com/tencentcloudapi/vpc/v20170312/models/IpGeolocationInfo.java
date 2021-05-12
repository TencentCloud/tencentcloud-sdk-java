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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IpGeolocationInfo extends AbstractModel{

    /**
    * 国家信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Country")
    @Expose
    private String Country;

    /**
    * 省、州、郡一级行政区域信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Province")
    @Expose
    private String Province;

    /**
    * 市一级行政区域信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("City")
    @Expose
    private String City;

    /**
    * 市内区域信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 接入运营商信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Isp")
    @Expose
    private String Isp;

    /**
    * 骨干运营商名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AsName")
    @Expose
    private String AsName;

    /**
    * 骨干运营商AS号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AsId")
    @Expose
    private String AsId;

    /**
    * 注释信息。目前的填充值为移动接入用户的APN值，如无APN属性则为空
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * IP地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AddressIp")
    @Expose
    private String AddressIp;

    /**
     * Get 国家信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Country 国家信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCountry() {
        return this.Country;
    }

    /**
     * Set 国家信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Country 国家信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCountry(String Country) {
        this.Country = Country;
    }

    /**
     * Get 省、州、郡一级行政区域信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Province 省、州、郡一级行政区域信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProvince() {
        return this.Province;
    }

    /**
     * Set 省、州、郡一级行政区域信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Province 省、州、郡一级行政区域信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProvince(String Province) {
        this.Province = Province;
    }

    /**
     * Get 市一级行政区域信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return City 市一级行政区域信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCity() {
        return this.City;
    }

    /**
     * Set 市一级行政区域信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param City 市一级行政区域信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCity(String City) {
        this.City = City;
    }

    /**
     * Get 市内区域信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Region 市内区域信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 市内区域信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Region 市内区域信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 接入运营商信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Isp 接入运营商信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIsp() {
        return this.Isp;
    }

    /**
     * Set 接入运营商信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Isp 接入运营商信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsp(String Isp) {
        this.Isp = Isp;
    }

    /**
     * Get 骨干运营商名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AsName 骨干运营商名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAsName() {
        return this.AsName;
    }

    /**
     * Set 骨干运营商名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param AsName 骨干运营商名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAsName(String AsName) {
        this.AsName = AsName;
    }

    /**
     * Get 骨干运营商AS号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AsId 骨干运营商AS号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAsId() {
        return this.AsId;
    }

    /**
     * Set 骨干运营商AS号
注意：此字段可能返回 null，表示取不到有效值。
     * @param AsId 骨干运营商AS号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAsId(String AsId) {
        this.AsId = AsId;
    }

    /**
     * Get 注释信息。目前的填充值为移动接入用户的APN值，如无APN属性则为空
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Comment 注释信息。目前的填充值为移动接入用户的APN值，如无APN属性则为空
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set 注释信息。目前的填充值为移动接入用户的APN值，如无APN属性则为空
注意：此字段可能返回 null，表示取不到有效值。
     * @param Comment 注释信息。目前的填充值为移动接入用户的APN值，如无APN属性则为空
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get IP地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AddressIp IP地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAddressIp() {
        return this.AddressIp;
    }

    /**
     * Set IP地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param AddressIp IP地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAddressIp(String AddressIp) {
        this.AddressIp = AddressIp;
    }

    public IpGeolocationInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IpGeolocationInfo(IpGeolocationInfo source) {
        if (source.Country != null) {
            this.Country = new String(source.Country);
        }
        if (source.Province != null) {
            this.Province = new String(source.Province);
        }
        if (source.City != null) {
            this.City = new String(source.City);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Isp != null) {
            this.Isp = new String(source.Isp);
        }
        if (source.AsName != null) {
            this.AsName = new String(source.AsName);
        }
        if (source.AsId != null) {
            this.AsId = new String(source.AsId);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
        if (source.AddressIp != null) {
            this.AddressIp = new String(source.AddressIp);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Country", this.Country);
        this.setParamSimple(map, prefix + "Province", this.Province);
        this.setParamSimple(map, prefix + "City", this.City);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Isp", this.Isp);
        this.setParamSimple(map, prefix + "AsName", this.AsName);
        this.setParamSimple(map, prefix + "AsId", this.AsId);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamSimple(map, prefix + "AddressIp", this.AddressIp);

    }
}

