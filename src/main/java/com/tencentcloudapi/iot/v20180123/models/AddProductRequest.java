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
package com.tencentcloudapi.iot.v20180123.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AddProductRequest extends AbstractModel{

    /**
    * 产品名称，同一区域产品名称需唯一，支持中文、英文字母、中划线和下划线，长度不超过31个字符，中文占两个字符
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 产品描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 数据模版
    */
    @SerializedName("DataTemplate")
    @Expose
    private DataTemplate [] DataTemplate;

    /**
    * 产品版本（native表示基础版，template表示高级版，默认值为template）
    */
    @SerializedName("DataProtocol")
    @Expose
    private String DataProtocol;

    /**
    * 设备认证方式（1：动态令牌，2：签名直连鉴权）
    */
    @SerializedName("AuthType")
    @Expose
    private Long AuthType;

    /**
    * 通信方式（other/wifi/cellular/nb-iot）
    */
    @SerializedName("CommProtocol")
    @Expose
    private String CommProtocol;

    /**
    * 产品的设备类型（device: 直连设备；sub_device：子设备；gateway：网关设备）
    */
    @SerializedName("DeviceType")
    @Expose
    private String DeviceType;

    /**
     * Get 产品名称，同一区域产品名称需唯一，支持中文、英文字母、中划线和下划线，长度不超过31个字符，中文占两个字符 
     * @return Name 产品名称，同一区域产品名称需唯一，支持中文、英文字母、中划线和下划线，长度不超过31个字符，中文占两个字符
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 产品名称，同一区域产品名称需唯一，支持中文、英文字母、中划线和下划线，长度不超过31个字符，中文占两个字符
     * @param Name 产品名称，同一区域产品名称需唯一，支持中文、英文字母、中划线和下划线，长度不超过31个字符，中文占两个字符
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 产品描述 
     * @return Description 产品描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 产品描述
     * @param Description 产品描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 数据模版 
     * @return DataTemplate 数据模版
     */
    public DataTemplate [] getDataTemplate() {
        return this.DataTemplate;
    }

    /**
     * Set 数据模版
     * @param DataTemplate 数据模版
     */
    public void setDataTemplate(DataTemplate [] DataTemplate) {
        this.DataTemplate = DataTemplate;
    }

    /**
     * Get 产品版本（native表示基础版，template表示高级版，默认值为template） 
     * @return DataProtocol 产品版本（native表示基础版，template表示高级版，默认值为template）
     */
    public String getDataProtocol() {
        return this.DataProtocol;
    }

    /**
     * Set 产品版本（native表示基础版，template表示高级版，默认值为template）
     * @param DataProtocol 产品版本（native表示基础版，template表示高级版，默认值为template）
     */
    public void setDataProtocol(String DataProtocol) {
        this.DataProtocol = DataProtocol;
    }

    /**
     * Get 设备认证方式（1：动态令牌，2：签名直连鉴权） 
     * @return AuthType 设备认证方式（1：动态令牌，2：签名直连鉴权）
     */
    public Long getAuthType() {
        return this.AuthType;
    }

    /**
     * Set 设备认证方式（1：动态令牌，2：签名直连鉴权）
     * @param AuthType 设备认证方式（1：动态令牌，2：签名直连鉴权）
     */
    public void setAuthType(Long AuthType) {
        this.AuthType = AuthType;
    }

    /**
     * Get 通信方式（other/wifi/cellular/nb-iot） 
     * @return CommProtocol 通信方式（other/wifi/cellular/nb-iot）
     */
    public String getCommProtocol() {
        return this.CommProtocol;
    }

    /**
     * Set 通信方式（other/wifi/cellular/nb-iot）
     * @param CommProtocol 通信方式（other/wifi/cellular/nb-iot）
     */
    public void setCommProtocol(String CommProtocol) {
        this.CommProtocol = CommProtocol;
    }

    /**
     * Get 产品的设备类型（device: 直连设备；sub_device：子设备；gateway：网关设备） 
     * @return DeviceType 产品的设备类型（device: 直连设备；sub_device：子设备；gateway：网关设备）
     */
    public String getDeviceType() {
        return this.DeviceType;
    }

    /**
     * Set 产品的设备类型（device: 直连设备；sub_device：子设备；gateway：网关设备）
     * @param DeviceType 产品的设备类型（device: 直连设备；sub_device：子设备；gateway：网关设备）
     */
    public void setDeviceType(String DeviceType) {
        this.DeviceType = DeviceType;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArrayObj(map, prefix + "DataTemplate.", this.DataTemplate);
        this.setParamSimple(map, prefix + "DataProtocol", this.DataProtocol);
        this.setParamSimple(map, prefix + "AuthType", this.AuthType);
        this.setParamSimple(map, prefix + "CommProtocol", this.CommProtocol);
        this.setParamSimple(map, prefix + "DeviceType", this.DeviceType);

    }
}

