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
package com.tencentcloudapi.dc.v20180410.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateCasInput extends AbstractModel {

    /**
    * 敏捷上云名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 需要接入敏捷上云的IDC的地址
    */
    @SerializedName("IdcAddress")
    @Expose
    private String IdcAddress;

    /**
    * 需要接入敏捷上云的IDC的互联网服务提供商类型
    */
    @SerializedName("IdcType")
    @Expose
    private String IdcType;

    /**
    * 敏捷上云的带宽，单位为MB
    */
    @SerializedName("Bandwidth")
    @Expose
    private Long Bandwidth;

    /**
    * 联系电话
    */
    @SerializedName("Telephone")
    @Expose
    private String Telephone;

    /**
    * 备注信息
    */
    @SerializedName("Remarks")
    @Expose
    private String Remarks;

    /**
    * 接入地域
    */
    @SerializedName("ArRegion")
    @Expose
    private String ArRegion;

    /**
    * IDC侧类型，默认为OTHER。枚举值：CLOUD-云，ISP-运营商，OTHER-第三方
    */
    @SerializedName("IdcPointType")
    @Expose
    private String IdcPointType;

    /**
    * 运营商链路是否有保护
    */
    @SerializedName("BIapLinkProtected")
    @Expose
    private Boolean BIapLinkProtected;

    /**
     * Get 敏捷上云名称 
     * @return Name 敏捷上云名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 敏捷上云名称
     * @param Name 敏捷上云名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 需要接入敏捷上云的IDC的地址 
     * @return IdcAddress 需要接入敏捷上云的IDC的地址
     */
    public String getIdcAddress() {
        return this.IdcAddress;
    }

    /**
     * Set 需要接入敏捷上云的IDC的地址
     * @param IdcAddress 需要接入敏捷上云的IDC的地址
     */
    public void setIdcAddress(String IdcAddress) {
        this.IdcAddress = IdcAddress;
    }

    /**
     * Get 需要接入敏捷上云的IDC的互联网服务提供商类型 
     * @return IdcType 需要接入敏捷上云的IDC的互联网服务提供商类型
     */
    public String getIdcType() {
        return this.IdcType;
    }

    /**
     * Set 需要接入敏捷上云的IDC的互联网服务提供商类型
     * @param IdcType 需要接入敏捷上云的IDC的互联网服务提供商类型
     */
    public void setIdcType(String IdcType) {
        this.IdcType = IdcType;
    }

    /**
     * Get 敏捷上云的带宽，单位为MB 
     * @return Bandwidth 敏捷上云的带宽，单位为MB
     */
    public Long getBandwidth() {
        return this.Bandwidth;
    }

    /**
     * Set 敏捷上云的带宽，单位为MB
     * @param Bandwidth 敏捷上云的带宽，单位为MB
     */
    public void setBandwidth(Long Bandwidth) {
        this.Bandwidth = Bandwidth;
    }

    /**
     * Get 联系电话 
     * @return Telephone 联系电话
     */
    public String getTelephone() {
        return this.Telephone;
    }

    /**
     * Set 联系电话
     * @param Telephone 联系电话
     */
    public void setTelephone(String Telephone) {
        this.Telephone = Telephone;
    }

    /**
     * Get 备注信息 
     * @return Remarks 备注信息
     */
    public String getRemarks() {
        return this.Remarks;
    }

    /**
     * Set 备注信息
     * @param Remarks 备注信息
     */
    public void setRemarks(String Remarks) {
        this.Remarks = Remarks;
    }

    /**
     * Get 接入地域 
     * @return ArRegion 接入地域
     */
    public String getArRegion() {
        return this.ArRegion;
    }

    /**
     * Set 接入地域
     * @param ArRegion 接入地域
     */
    public void setArRegion(String ArRegion) {
        this.ArRegion = ArRegion;
    }

    /**
     * Get IDC侧类型，默认为OTHER。枚举值：CLOUD-云，ISP-运营商，OTHER-第三方 
     * @return IdcPointType IDC侧类型，默认为OTHER。枚举值：CLOUD-云，ISP-运营商，OTHER-第三方
     */
    public String getIdcPointType() {
        return this.IdcPointType;
    }

    /**
     * Set IDC侧类型，默认为OTHER。枚举值：CLOUD-云，ISP-运营商，OTHER-第三方
     * @param IdcPointType IDC侧类型，默认为OTHER。枚举值：CLOUD-云，ISP-运营商，OTHER-第三方
     */
    public void setIdcPointType(String IdcPointType) {
        this.IdcPointType = IdcPointType;
    }

    /**
     * Get 运营商链路是否有保护 
     * @return BIapLinkProtected 运营商链路是否有保护
     */
    public Boolean getBIapLinkProtected() {
        return this.BIapLinkProtected;
    }

    /**
     * Set 运营商链路是否有保护
     * @param BIapLinkProtected 运营商链路是否有保护
     */
    public void setBIapLinkProtected(Boolean BIapLinkProtected) {
        this.BIapLinkProtected = BIapLinkProtected;
    }

    public CreateCasInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCasInput(CreateCasInput source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.IdcAddress != null) {
            this.IdcAddress = new String(source.IdcAddress);
        }
        if (source.IdcType != null) {
            this.IdcType = new String(source.IdcType);
        }
        if (source.Bandwidth != null) {
            this.Bandwidth = new Long(source.Bandwidth);
        }
        if (source.Telephone != null) {
            this.Telephone = new String(source.Telephone);
        }
        if (source.Remarks != null) {
            this.Remarks = new String(source.Remarks);
        }
        if (source.ArRegion != null) {
            this.ArRegion = new String(source.ArRegion);
        }
        if (source.IdcPointType != null) {
            this.IdcPointType = new String(source.IdcPointType);
        }
        if (source.BIapLinkProtected != null) {
            this.BIapLinkProtected = new Boolean(source.BIapLinkProtected);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "IdcAddress", this.IdcAddress);
        this.setParamSimple(map, prefix + "IdcType", this.IdcType);
        this.setParamSimple(map, prefix + "Bandwidth", this.Bandwidth);
        this.setParamSimple(map, prefix + "Telephone", this.Telephone);
        this.setParamSimple(map, prefix + "Remarks", this.Remarks);
        this.setParamSimple(map, prefix + "ArRegion", this.ArRegion);
        this.setParamSimple(map, prefix + "IdcPointType", this.IdcPointType);
        this.setParamSimple(map, prefix + "BIapLinkProtected", this.BIapLinkProtected);

    }
}

