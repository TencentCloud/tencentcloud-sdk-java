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
package com.tencentcloudapi.rce.v20260130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class App extends AbstractModel {

    /**
    * <p>应用程序运行的移动设备的操作系统类型</p>
    */
    @SerializedName("OS")
    @Expose
    private String OS;

    /**
    * <p>应用程序运行的移动设备的操作系统版本</p>
    */
    @SerializedName("OSVersion")
    @Expose
    private String OSVersion;

    /**
    * <p>应用程序运行的移动设备的生产厂商</p>
    */
    @SerializedName("DeviceManufacturer")
    @Expose
    private String DeviceManufacturer;

    /**
    * <p>应用程序运行的移动设备的型号</p>
    */
    @SerializedName("DeviceModel")
    @Expose
    private String DeviceModel;

    /**
    * <p>应用程序运行的移动设备的唯一ID，对于iOS为IFV标识，对于Android为Android ID</p>
    */
    @SerializedName("DeviceId")
    @Expose
    private String DeviceId;

    /**
    * <p>应用程序名称</p>
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
    * <p>应用程序版本</p>
    */
    @SerializedName("AppVersion")
    @Expose
    private String AppVersion;

    /**
    * <p>应用程序提供的语言</p>
    */
    @SerializedName("ClientLanguage")
    @Expose
    private String ClientLanguage;

    /**
     * Get <p>应用程序运行的移动设备的操作系统类型</p> 
     * @return OS <p>应用程序运行的移动设备的操作系统类型</p>
     */
    public String getOS() {
        return this.OS;
    }

    /**
     * Set <p>应用程序运行的移动设备的操作系统类型</p>
     * @param OS <p>应用程序运行的移动设备的操作系统类型</p>
     */
    public void setOS(String OS) {
        this.OS = OS;
    }

    /**
     * Get <p>应用程序运行的移动设备的操作系统版本</p> 
     * @return OSVersion <p>应用程序运行的移动设备的操作系统版本</p>
     */
    public String getOSVersion() {
        return this.OSVersion;
    }

    /**
     * Set <p>应用程序运行的移动设备的操作系统版本</p>
     * @param OSVersion <p>应用程序运行的移动设备的操作系统版本</p>
     */
    public void setOSVersion(String OSVersion) {
        this.OSVersion = OSVersion;
    }

    /**
     * Get <p>应用程序运行的移动设备的生产厂商</p> 
     * @return DeviceManufacturer <p>应用程序运行的移动设备的生产厂商</p>
     */
    public String getDeviceManufacturer() {
        return this.DeviceManufacturer;
    }

    /**
     * Set <p>应用程序运行的移动设备的生产厂商</p>
     * @param DeviceManufacturer <p>应用程序运行的移动设备的生产厂商</p>
     */
    public void setDeviceManufacturer(String DeviceManufacturer) {
        this.DeviceManufacturer = DeviceManufacturer;
    }

    /**
     * Get <p>应用程序运行的移动设备的型号</p> 
     * @return DeviceModel <p>应用程序运行的移动设备的型号</p>
     */
    public String getDeviceModel() {
        return this.DeviceModel;
    }

    /**
     * Set <p>应用程序运行的移动设备的型号</p>
     * @param DeviceModel <p>应用程序运行的移动设备的型号</p>
     */
    public void setDeviceModel(String DeviceModel) {
        this.DeviceModel = DeviceModel;
    }

    /**
     * Get <p>应用程序运行的移动设备的唯一ID，对于iOS为IFV标识，对于Android为Android ID</p> 
     * @return DeviceId <p>应用程序运行的移动设备的唯一ID，对于iOS为IFV标识，对于Android为Android ID</p>
     */
    public String getDeviceId() {
        return this.DeviceId;
    }

    /**
     * Set <p>应用程序运行的移动设备的唯一ID，对于iOS为IFV标识，对于Android为Android ID</p>
     * @param DeviceId <p>应用程序运行的移动设备的唯一ID，对于iOS为IFV标识，对于Android为Android ID</p>
     */
    public void setDeviceId(String DeviceId) {
        this.DeviceId = DeviceId;
    }

    /**
     * Get <p>应用程序名称</p> 
     * @return AppName <p>应用程序名称</p>
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * Set <p>应用程序名称</p>
     * @param AppName <p>应用程序名称</p>
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    /**
     * Get <p>应用程序版本</p> 
     * @return AppVersion <p>应用程序版本</p>
     */
    public String getAppVersion() {
        return this.AppVersion;
    }

    /**
     * Set <p>应用程序版本</p>
     * @param AppVersion <p>应用程序版本</p>
     */
    public void setAppVersion(String AppVersion) {
        this.AppVersion = AppVersion;
    }

    /**
     * Get <p>应用程序提供的语言</p> 
     * @return ClientLanguage <p>应用程序提供的语言</p>
     */
    public String getClientLanguage() {
        return this.ClientLanguage;
    }

    /**
     * Set <p>应用程序提供的语言</p>
     * @param ClientLanguage <p>应用程序提供的语言</p>
     */
    public void setClientLanguage(String ClientLanguage) {
        this.ClientLanguage = ClientLanguage;
    }

    public App() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public App(App source) {
        if (source.OS != null) {
            this.OS = new String(source.OS);
        }
        if (source.OSVersion != null) {
            this.OSVersion = new String(source.OSVersion);
        }
        if (source.DeviceManufacturer != null) {
            this.DeviceManufacturer = new String(source.DeviceManufacturer);
        }
        if (source.DeviceModel != null) {
            this.DeviceModel = new String(source.DeviceModel);
        }
        if (source.DeviceId != null) {
            this.DeviceId = new String(source.DeviceId);
        }
        if (source.AppName != null) {
            this.AppName = new String(source.AppName);
        }
        if (source.AppVersion != null) {
            this.AppVersion = new String(source.AppVersion);
        }
        if (source.ClientLanguage != null) {
            this.ClientLanguage = new String(source.ClientLanguage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OS", this.OS);
        this.setParamSimple(map, prefix + "OSVersion", this.OSVersion);
        this.setParamSimple(map, prefix + "DeviceManufacturer", this.DeviceManufacturer);
        this.setParamSimple(map, prefix + "DeviceModel", this.DeviceModel);
        this.setParamSimple(map, prefix + "DeviceId", this.DeviceId);
        this.setParamSimple(map, prefix + "AppName", this.AppName);
        this.setParamSimple(map, prefix + "AppVersion", this.AppVersion);
        this.setParamSimple(map, prefix + "ClientLanguage", this.ClientLanguage);

    }
}

