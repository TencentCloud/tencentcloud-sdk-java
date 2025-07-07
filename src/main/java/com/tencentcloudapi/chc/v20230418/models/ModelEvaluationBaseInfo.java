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
package com.tencentcloudapi.chc.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModelEvaluationBaseInfo extends AbstractModel {

    /**
    * 客户名称
    */
    @SerializedName("CustomerName")
    @Expose
    private String CustomerName;

    /**
    * server 服务器  netDevice 网络设备
    */
    @SerializedName("DeviceType")
    @Expose
    private String DeviceType;

    /**
    * 园区名称
    */
    @SerializedName("CampusName")
    @Expose
    private String CampusName;

    /**
    * 备注
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
     * Get 客户名称 
     * @return CustomerName 客户名称
     */
    public String getCustomerName() {
        return this.CustomerName;
    }

    /**
     * Set 客户名称
     * @param CustomerName 客户名称
     */
    public void setCustomerName(String CustomerName) {
        this.CustomerName = CustomerName;
    }

    /**
     * Get server 服务器  netDevice 网络设备 
     * @return DeviceType server 服务器  netDevice 网络设备
     */
    public String getDeviceType() {
        return this.DeviceType;
    }

    /**
     * Set server 服务器  netDevice 网络设备
     * @param DeviceType server 服务器  netDevice 网络设备
     */
    public void setDeviceType(String DeviceType) {
        this.DeviceType = DeviceType;
    }

    /**
     * Get 园区名称 
     * @return CampusName 园区名称
     */
    public String getCampusName() {
        return this.CampusName;
    }

    /**
     * Set 园区名称
     * @param CampusName 园区名称
     */
    public void setCampusName(String CampusName) {
        this.CampusName = CampusName;
    }

    /**
     * Get 备注 
     * @return Remark 备注
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备注
     * @param Remark 备注
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    public ModelEvaluationBaseInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModelEvaluationBaseInfo(ModelEvaluationBaseInfo source) {
        if (source.CustomerName != null) {
            this.CustomerName = new String(source.CustomerName);
        }
        if (source.DeviceType != null) {
            this.DeviceType = new String(source.DeviceType);
        }
        if (source.CampusName != null) {
            this.CampusName = new String(source.CampusName);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CustomerName", this.CustomerName);
        this.setParamSimple(map, prefix + "DeviceType", this.DeviceType);
        this.setParamSimple(map, prefix + "CampusName", this.CampusName);
        this.setParamSimple(map, prefix + "Remark", this.Remark);

    }
}

