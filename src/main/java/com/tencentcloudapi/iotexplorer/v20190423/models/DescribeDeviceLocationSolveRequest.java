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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDeviceLocationSolveRequest extends AbstractModel{

    /**
    * 产品ID
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * 设备名称
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
    * 定位解析类型，wifi或GNSSNavigation
    */
    @SerializedName("LocationType")
    @Expose
    private String LocationType;

    /**
    * LoRaEdge卫星导航电文
    */
    @SerializedName("GNSSNavigation")
    @Expose
    private String GNSSNavigation;

    /**
    * wifi信息
    */
    @SerializedName("WiFiInfo")
    @Expose
    private WifiInfo [] WiFiInfo;

    /**
     * Get 产品ID 
     * @return ProductId 产品ID
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * Set 产品ID
     * @param ProductId 产品ID
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get 设备名称 
     * @return DeviceName 设备名称
     */
    public String getDeviceName() {
        return this.DeviceName;
    }

    /**
     * Set 设备名称
     * @param DeviceName 设备名称
     */
    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }

    /**
     * Get 定位解析类型，wifi或GNSSNavigation 
     * @return LocationType 定位解析类型，wifi或GNSSNavigation
     */
    public String getLocationType() {
        return this.LocationType;
    }

    /**
     * Set 定位解析类型，wifi或GNSSNavigation
     * @param LocationType 定位解析类型，wifi或GNSSNavigation
     */
    public void setLocationType(String LocationType) {
        this.LocationType = LocationType;
    }

    /**
     * Get LoRaEdge卫星导航电文 
     * @return GNSSNavigation LoRaEdge卫星导航电文
     */
    public String getGNSSNavigation() {
        return this.GNSSNavigation;
    }

    /**
     * Set LoRaEdge卫星导航电文
     * @param GNSSNavigation LoRaEdge卫星导航电文
     */
    public void setGNSSNavigation(String GNSSNavigation) {
        this.GNSSNavigation = GNSSNavigation;
    }

    /**
     * Get wifi信息 
     * @return WiFiInfo wifi信息
     */
    public WifiInfo [] getWiFiInfo() {
        return this.WiFiInfo;
    }

    /**
     * Set wifi信息
     * @param WiFiInfo wifi信息
     */
    public void setWiFiInfo(WifiInfo [] WiFiInfo) {
        this.WiFiInfo = WiFiInfo;
    }

    public DescribeDeviceLocationSolveRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDeviceLocationSolveRequest(DescribeDeviceLocationSolveRequest source) {
        if (source.ProductId != null) {
            this.ProductId = new String(source.ProductId);
        }
        if (source.DeviceName != null) {
            this.DeviceName = new String(source.DeviceName);
        }
        if (source.LocationType != null) {
            this.LocationType = new String(source.LocationType);
        }
        if (source.GNSSNavigation != null) {
            this.GNSSNavigation = new String(source.GNSSNavigation);
        }
        if (source.WiFiInfo != null) {
            this.WiFiInfo = new WifiInfo[source.WiFiInfo.length];
            for (int i = 0; i < source.WiFiInfo.length; i++) {
                this.WiFiInfo[i] = new WifiInfo(source.WiFiInfo[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamSimple(map, prefix + "LocationType", this.LocationType);
        this.setParamSimple(map, prefix + "GNSSNavigation", this.GNSSNavigation);
        this.setParamArrayObj(map, prefix + "WiFiInfo.", this.WiFiInfo);

    }
}

