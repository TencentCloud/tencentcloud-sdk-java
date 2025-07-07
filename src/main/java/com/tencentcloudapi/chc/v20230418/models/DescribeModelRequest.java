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

public class DescribeModelRequest extends AbstractModel {

    /**
    * 服务器设备型号
    */
    @SerializedName("DevModel")
    @Expose
    private String DevModel;

    /**
    * 园区ID
    */
    @SerializedName("CampusId")
    @Expose
    private Long CampusId;

    /**
    * 设备类型，服务器传入 server，网络设备传入 netDevice
    */
    @SerializedName("DeviceType")
    @Expose
    private String DeviceType;

    /**
    * 是否只返回已评估的版本
    */
    @SerializedName("Checked")
    @Expose
    private Boolean Checked;

    /**
     * Get 服务器设备型号 
     * @return DevModel 服务器设备型号
     */
    public String getDevModel() {
        return this.DevModel;
    }

    /**
     * Set 服务器设备型号
     * @param DevModel 服务器设备型号
     */
    public void setDevModel(String DevModel) {
        this.DevModel = DevModel;
    }

    /**
     * Get 园区ID 
     * @return CampusId 园区ID
     */
    public Long getCampusId() {
        return this.CampusId;
    }

    /**
     * Set 园区ID
     * @param CampusId 园区ID
     */
    public void setCampusId(Long CampusId) {
        this.CampusId = CampusId;
    }

    /**
     * Get 设备类型，服务器传入 server，网络设备传入 netDevice 
     * @return DeviceType 设备类型，服务器传入 server，网络设备传入 netDevice
     */
    public String getDeviceType() {
        return this.DeviceType;
    }

    /**
     * Set 设备类型，服务器传入 server，网络设备传入 netDevice
     * @param DeviceType 设备类型，服务器传入 server，网络设备传入 netDevice
     */
    public void setDeviceType(String DeviceType) {
        this.DeviceType = DeviceType;
    }

    /**
     * Get 是否只返回已评估的版本 
     * @return Checked 是否只返回已评估的版本
     */
    public Boolean getChecked() {
        return this.Checked;
    }

    /**
     * Set 是否只返回已评估的版本
     * @param Checked 是否只返回已评估的版本
     */
    public void setChecked(Boolean Checked) {
        this.Checked = Checked;
    }

    public DescribeModelRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeModelRequest(DescribeModelRequest source) {
        if (source.DevModel != null) {
            this.DevModel = new String(source.DevModel);
        }
        if (source.CampusId != null) {
            this.CampusId = new Long(source.CampusId);
        }
        if (source.DeviceType != null) {
            this.DeviceType = new String(source.DeviceType);
        }
        if (source.Checked != null) {
            this.Checked = new Boolean(source.Checked);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DevModel", this.DevModel);
        this.setParamSimple(map, prefix + "CampusId", this.CampusId);
        this.setParamSimple(map, prefix + "DeviceType", this.DeviceType);
        this.setParamSimple(map, prefix + "Checked", this.Checked);

    }
}

