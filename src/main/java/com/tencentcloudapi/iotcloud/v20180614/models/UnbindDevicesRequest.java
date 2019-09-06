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
package com.tencentcloudapi.iotcloud.v20180614.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UnbindDevicesRequest  extends AbstractModel{

    /**
    * 网关设备的产品ID
    */
    @SerializedName("GatewayProductId")
    @Expose
    private String GatewayProductId;

    /**
    * 网关设备的设备名
    */
    @SerializedName("GatewayDeviceName")
    @Expose
    private String GatewayDeviceName;

    /**
    * 产品ID
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * 多个设备名
    */
    @SerializedName("DeviceNames")
    @Expose
    private String [] DeviceNames;

    /**
    * 中兴CLAA设备的解绑需要Skey，普通设备不需要
    */
    @SerializedName("Skey")
    @Expose
    private String Skey;

    /**
     * 获取网关设备的产品ID
     * @return GatewayProductId 网关设备的产品ID
     */
    public String getGatewayProductId() {
        return this.GatewayProductId;
    }

    /**
     * 设置网关设备的产品ID
     * @param GatewayProductId 网关设备的产品ID
     */
    public void setGatewayProductId(String GatewayProductId) {
        this.GatewayProductId = GatewayProductId;
    }

    /**
     * 获取网关设备的设备名
     * @return GatewayDeviceName 网关设备的设备名
     */
    public String getGatewayDeviceName() {
        return this.GatewayDeviceName;
    }

    /**
     * 设置网关设备的设备名
     * @param GatewayDeviceName 网关设备的设备名
     */
    public void setGatewayDeviceName(String GatewayDeviceName) {
        this.GatewayDeviceName = GatewayDeviceName;
    }

    /**
     * 获取产品ID
     * @return ProductId 产品ID
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * 设置产品ID
     * @param ProductId 产品ID
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * 获取多个设备名
     * @return DeviceNames 多个设备名
     */
    public String [] getDeviceNames() {
        return this.DeviceNames;
    }

    /**
     * 设置多个设备名
     * @param DeviceNames 多个设备名
     */
    public void setDeviceNames(String [] DeviceNames) {
        this.DeviceNames = DeviceNames;
    }

    /**
     * 获取中兴CLAA设备的解绑需要Skey，普通设备不需要
     * @return Skey 中兴CLAA设备的解绑需要Skey，普通设备不需要
     */
    public String getSkey() {
        return this.Skey;
    }

    /**
     * 设置中兴CLAA设备的解绑需要Skey，普通设备不需要
     * @param Skey 中兴CLAA设备的解绑需要Skey，普通设备不需要
     */
    public void setSkey(String Skey) {
        this.Skey = Skey;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GatewayProductId", this.GatewayProductId);
        this.setParamSimple(map, prefix + "GatewayDeviceName", this.GatewayDeviceName);
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamArraySimple(map, prefix + "DeviceNames.", this.DeviceNames);
        this.setParamSimple(map, prefix + "Skey", this.Skey);

    }
}

