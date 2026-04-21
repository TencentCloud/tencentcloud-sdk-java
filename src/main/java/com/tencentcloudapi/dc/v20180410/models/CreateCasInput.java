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
    * <p>敏捷上云名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>需要接入敏捷上云的IDC的地址</p>
    */
    @SerializedName("IdcAddress")
    @Expose
    private String IdcAddress;

    /**
    * <p>需要接入敏捷上云的IDC的互联网服务提供商类型</p>
    */
    @SerializedName("IdcType")
    @Expose
    private String IdcType;

    /**
    * <p>敏捷上云的带宽，单位为MB</p>
    */
    @SerializedName("Bandwidth")
    @Expose
    private Long Bandwidth;

    /**
    * <p>联系电话</p>
    */
    @SerializedName("Telephone")
    @Expose
    private String Telephone;

    /**
    * <p>备注信息</p>
    */
    @SerializedName("Remarks")
    @Expose
    private String Remarks;

    /**
    * <p>接入地域</p>
    */
    @SerializedName("ArRegion")
    @Expose
    private String ArRegion;

    /**
    * <p>IDC侧类型，默认为OTHER。枚举值：CLOUD-云，ISP-运营商，OTHER-第三方</p>
    */
    @SerializedName("IdcPointType")
    @Expose
    private String IdcPointType;

    /**
    * <p>运营商链路是否有保护</p>
    */
    @SerializedName("BIapLinkProtected")
    @Expose
    private Boolean BIapLinkProtected;

    /**
    * <p>服务类型，SHARE-共享型，EXCLUSIVE-独占型</p>
    */
    @SerializedName("ServiceType")
    @Expose
    private String ServiceType;

    /**
     * Get <p>敏捷上云名称</p> 
     * @return Name <p>敏捷上云名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>敏捷上云名称</p>
     * @param Name <p>敏捷上云名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>需要接入敏捷上云的IDC的地址</p> 
     * @return IdcAddress <p>需要接入敏捷上云的IDC的地址</p>
     */
    public String getIdcAddress() {
        return this.IdcAddress;
    }

    /**
     * Set <p>需要接入敏捷上云的IDC的地址</p>
     * @param IdcAddress <p>需要接入敏捷上云的IDC的地址</p>
     */
    public void setIdcAddress(String IdcAddress) {
        this.IdcAddress = IdcAddress;
    }

    /**
     * Get <p>需要接入敏捷上云的IDC的互联网服务提供商类型</p> 
     * @return IdcType <p>需要接入敏捷上云的IDC的互联网服务提供商类型</p>
     */
    public String getIdcType() {
        return this.IdcType;
    }

    /**
     * Set <p>需要接入敏捷上云的IDC的互联网服务提供商类型</p>
     * @param IdcType <p>需要接入敏捷上云的IDC的互联网服务提供商类型</p>
     */
    public void setIdcType(String IdcType) {
        this.IdcType = IdcType;
    }

    /**
     * Get <p>敏捷上云的带宽，单位为MB</p> 
     * @return Bandwidth <p>敏捷上云的带宽，单位为MB</p>
     */
    public Long getBandwidth() {
        return this.Bandwidth;
    }

    /**
     * Set <p>敏捷上云的带宽，单位为MB</p>
     * @param Bandwidth <p>敏捷上云的带宽，单位为MB</p>
     */
    public void setBandwidth(Long Bandwidth) {
        this.Bandwidth = Bandwidth;
    }

    /**
     * Get <p>联系电话</p> 
     * @return Telephone <p>联系电话</p>
     */
    public String getTelephone() {
        return this.Telephone;
    }

    /**
     * Set <p>联系电话</p>
     * @param Telephone <p>联系电话</p>
     */
    public void setTelephone(String Telephone) {
        this.Telephone = Telephone;
    }

    /**
     * Get <p>备注信息</p> 
     * @return Remarks <p>备注信息</p>
     */
    public String getRemarks() {
        return this.Remarks;
    }

    /**
     * Set <p>备注信息</p>
     * @param Remarks <p>备注信息</p>
     */
    public void setRemarks(String Remarks) {
        this.Remarks = Remarks;
    }

    /**
     * Get <p>接入地域</p> 
     * @return ArRegion <p>接入地域</p>
     */
    public String getArRegion() {
        return this.ArRegion;
    }

    /**
     * Set <p>接入地域</p>
     * @param ArRegion <p>接入地域</p>
     */
    public void setArRegion(String ArRegion) {
        this.ArRegion = ArRegion;
    }

    /**
     * Get <p>IDC侧类型，默认为OTHER。枚举值：CLOUD-云，ISP-运营商，OTHER-第三方</p> 
     * @return IdcPointType <p>IDC侧类型，默认为OTHER。枚举值：CLOUD-云，ISP-运营商，OTHER-第三方</p>
     */
    public String getIdcPointType() {
        return this.IdcPointType;
    }

    /**
     * Set <p>IDC侧类型，默认为OTHER。枚举值：CLOUD-云，ISP-运营商，OTHER-第三方</p>
     * @param IdcPointType <p>IDC侧类型，默认为OTHER。枚举值：CLOUD-云，ISP-运营商，OTHER-第三方</p>
     */
    public void setIdcPointType(String IdcPointType) {
        this.IdcPointType = IdcPointType;
    }

    /**
     * Get <p>运营商链路是否有保护</p> 
     * @return BIapLinkProtected <p>运营商链路是否有保护</p>
     */
    public Boolean getBIapLinkProtected() {
        return this.BIapLinkProtected;
    }

    /**
     * Set <p>运营商链路是否有保护</p>
     * @param BIapLinkProtected <p>运营商链路是否有保护</p>
     */
    public void setBIapLinkProtected(Boolean BIapLinkProtected) {
        this.BIapLinkProtected = BIapLinkProtected;
    }

    /**
     * Get <p>服务类型，SHARE-共享型，EXCLUSIVE-独占型</p> 
     * @return ServiceType <p>服务类型，SHARE-共享型，EXCLUSIVE-独占型</p>
     */
    public String getServiceType() {
        return this.ServiceType;
    }

    /**
     * Set <p>服务类型，SHARE-共享型，EXCLUSIVE-独占型</p>
     * @param ServiceType <p>服务类型，SHARE-共享型，EXCLUSIVE-独占型</p>
     */
    public void setServiceType(String ServiceType) {
        this.ServiceType = ServiceType;
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
        if (source.ServiceType != null) {
            this.ServiceType = new String(source.ServiceType);
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
        this.setParamSimple(map, prefix + "ServiceType", this.ServiceType);

    }
}

