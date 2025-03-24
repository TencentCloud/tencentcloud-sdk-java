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
package com.tencentcloudapi.chc.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateCommonServiceWorkOrderRequest extends AbstractModel {

    /**
    * 设备及位置信息列表
    */
    @SerializedName("DevicePositionSet")
    @Expose
    private DevicePosition [] DevicePositionSet;

    /**
    * 服务级别，只支持传入 1、2、3，分别对应 L1、L2、L3
    */
    @SerializedName("ServiceLevel")
    @Expose
    private Long ServiceLevel;

    /**
    * 操作预授权
    */
    @SerializedName("PreAuthorization")
    @Expose
    private Boolean PreAuthorization;

    /**
    * 业务联系人
    */
    @SerializedName("ContactName")
    @Expose
    private String ContactName;

    /**
    * 联系人电话
    */
    @SerializedName("ContactPhone")
    @Expose
    private String ContactPhone;

    /**
    * 设备类型 server 服务器，netDevice 网络设备	
    */
    @SerializedName("DeviceType")
    @Expose
    private String DeviceType;

    /**
    * 操作说明
    */
    @SerializedName("Instructions")
    @Expose
    private String Instructions;

    /**
     * Get 设备及位置信息列表 
     * @return DevicePositionSet 设备及位置信息列表
     */
    public DevicePosition [] getDevicePositionSet() {
        return this.DevicePositionSet;
    }

    /**
     * Set 设备及位置信息列表
     * @param DevicePositionSet 设备及位置信息列表
     */
    public void setDevicePositionSet(DevicePosition [] DevicePositionSet) {
        this.DevicePositionSet = DevicePositionSet;
    }

    /**
     * Get 服务级别，只支持传入 1、2、3，分别对应 L1、L2、L3 
     * @return ServiceLevel 服务级别，只支持传入 1、2、3，分别对应 L1、L2、L3
     */
    public Long getServiceLevel() {
        return this.ServiceLevel;
    }

    /**
     * Set 服务级别，只支持传入 1、2、3，分别对应 L1、L2、L3
     * @param ServiceLevel 服务级别，只支持传入 1、2、3，分别对应 L1、L2、L3
     */
    public void setServiceLevel(Long ServiceLevel) {
        this.ServiceLevel = ServiceLevel;
    }

    /**
     * Get 操作预授权 
     * @return PreAuthorization 操作预授权
     */
    public Boolean getPreAuthorization() {
        return this.PreAuthorization;
    }

    /**
     * Set 操作预授权
     * @param PreAuthorization 操作预授权
     */
    public void setPreAuthorization(Boolean PreAuthorization) {
        this.PreAuthorization = PreAuthorization;
    }

    /**
     * Get 业务联系人 
     * @return ContactName 业务联系人
     */
    public String getContactName() {
        return this.ContactName;
    }

    /**
     * Set 业务联系人
     * @param ContactName 业务联系人
     */
    public void setContactName(String ContactName) {
        this.ContactName = ContactName;
    }

    /**
     * Get 联系人电话 
     * @return ContactPhone 联系人电话
     */
    public String getContactPhone() {
        return this.ContactPhone;
    }

    /**
     * Set 联系人电话
     * @param ContactPhone 联系人电话
     */
    public void setContactPhone(String ContactPhone) {
        this.ContactPhone = ContactPhone;
    }

    /**
     * Get 设备类型 server 服务器，netDevice 网络设备	 
     * @return DeviceType 设备类型 server 服务器，netDevice 网络设备	
     */
    public String getDeviceType() {
        return this.DeviceType;
    }

    /**
     * Set 设备类型 server 服务器，netDevice 网络设备	
     * @param DeviceType 设备类型 server 服务器，netDevice 网络设备	
     */
    public void setDeviceType(String DeviceType) {
        this.DeviceType = DeviceType;
    }

    /**
     * Get 操作说明 
     * @return Instructions 操作说明
     */
    public String getInstructions() {
        return this.Instructions;
    }

    /**
     * Set 操作说明
     * @param Instructions 操作说明
     */
    public void setInstructions(String Instructions) {
        this.Instructions = Instructions;
    }

    public CreateCommonServiceWorkOrderRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCommonServiceWorkOrderRequest(CreateCommonServiceWorkOrderRequest source) {
        if (source.DevicePositionSet != null) {
            this.DevicePositionSet = new DevicePosition[source.DevicePositionSet.length];
            for (int i = 0; i < source.DevicePositionSet.length; i++) {
                this.DevicePositionSet[i] = new DevicePosition(source.DevicePositionSet[i]);
            }
        }
        if (source.ServiceLevel != null) {
            this.ServiceLevel = new Long(source.ServiceLevel);
        }
        if (source.PreAuthorization != null) {
            this.PreAuthorization = new Boolean(source.PreAuthorization);
        }
        if (source.ContactName != null) {
            this.ContactName = new String(source.ContactName);
        }
        if (source.ContactPhone != null) {
            this.ContactPhone = new String(source.ContactPhone);
        }
        if (source.DeviceType != null) {
            this.DeviceType = new String(source.DeviceType);
        }
        if (source.Instructions != null) {
            this.Instructions = new String(source.Instructions);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "DevicePositionSet.", this.DevicePositionSet);
        this.setParamSimple(map, prefix + "ServiceLevel", this.ServiceLevel);
        this.setParamSimple(map, prefix + "PreAuthorization", this.PreAuthorization);
        this.setParamSimple(map, prefix + "ContactName", this.ContactName);
        this.setParamSimple(map, prefix + "ContactPhone", this.ContactPhone);
        this.setParamSimple(map, prefix + "DeviceType", this.DeviceType);
        this.setParamSimple(map, prefix + "Instructions", this.Instructions);

    }
}

