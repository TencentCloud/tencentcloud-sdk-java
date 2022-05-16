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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateFirstLinkSessionRequest extends AbstractModel{

    /**
    * 模版ID
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
    * 终端网络信息
    */
    @SerializedName("SrcAddressInfo")
    @Expose
    private SrcAddressInfo SrcAddressInfo;

    /**
    * 加速目标网络信息
    */
    @SerializedName("DestAddressInfo")
    @Expose
    private DestAddressInfo DestAddressInfo;

    /**
    * 终端设备信息
    */
    @SerializedName("DeviceInfo")
    @Expose
    private DeviceInfo DeviceInfo;

    /**
    * 接口扩展参数，如果是电信用户，需要填充CTCC Token字段
    */
    @SerializedName("Capacity")
    @Expose
    private Capacity Capacity;

    /**
     * Get 模版ID 
     * @return TemplateId 模版ID
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set 模版ID
     * @param TemplateId 模版ID
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get 终端网络信息 
     * @return SrcAddressInfo 终端网络信息
     */
    public SrcAddressInfo getSrcAddressInfo() {
        return this.SrcAddressInfo;
    }

    /**
     * Set 终端网络信息
     * @param SrcAddressInfo 终端网络信息
     */
    public void setSrcAddressInfo(SrcAddressInfo SrcAddressInfo) {
        this.SrcAddressInfo = SrcAddressInfo;
    }

    /**
     * Get 加速目标网络信息 
     * @return DestAddressInfo 加速目标网络信息
     */
    public DestAddressInfo getDestAddressInfo() {
        return this.DestAddressInfo;
    }

    /**
     * Set 加速目标网络信息
     * @param DestAddressInfo 加速目标网络信息
     */
    public void setDestAddressInfo(DestAddressInfo DestAddressInfo) {
        this.DestAddressInfo = DestAddressInfo;
    }

    /**
     * Get 终端设备信息 
     * @return DeviceInfo 终端设备信息
     */
    public DeviceInfo getDeviceInfo() {
        return this.DeviceInfo;
    }

    /**
     * Set 终端设备信息
     * @param DeviceInfo 终端设备信息
     */
    public void setDeviceInfo(DeviceInfo DeviceInfo) {
        this.DeviceInfo = DeviceInfo;
    }

    /**
     * Get 接口扩展参数，如果是电信用户，需要填充CTCC Token字段 
     * @return Capacity 接口扩展参数，如果是电信用户，需要填充CTCC Token字段
     */
    public Capacity getCapacity() {
        return this.Capacity;
    }

    /**
     * Set 接口扩展参数，如果是电信用户，需要填充CTCC Token字段
     * @param Capacity 接口扩展参数，如果是电信用户，需要填充CTCC Token字段
     */
    public void setCapacity(Capacity Capacity) {
        this.Capacity = Capacity;
    }

    public CreateFirstLinkSessionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateFirstLinkSessionRequest(CreateFirstLinkSessionRequest source) {
        if (source.TemplateId != null) {
            this.TemplateId = new String(source.TemplateId);
        }
        if (source.SrcAddressInfo != null) {
            this.SrcAddressInfo = new SrcAddressInfo(source.SrcAddressInfo);
        }
        if (source.DestAddressInfo != null) {
            this.DestAddressInfo = new DestAddressInfo(source.DestAddressInfo);
        }
        if (source.DeviceInfo != null) {
            this.DeviceInfo = new DeviceInfo(source.DeviceInfo);
        }
        if (source.Capacity != null) {
            this.Capacity = new Capacity(source.Capacity);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamObj(map, prefix + "SrcAddressInfo.", this.SrcAddressInfo);
        this.setParamObj(map, prefix + "DestAddressInfo.", this.DestAddressInfo);
        this.setParamObj(map, prefix + "DeviceInfo.", this.DeviceInfo);
        this.setParamObj(map, prefix + "Capacity.", this.Capacity);

    }
}

