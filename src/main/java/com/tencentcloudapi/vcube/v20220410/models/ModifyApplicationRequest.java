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
package com.tencentcloudapi.vcube.v20220410.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyApplicationRequest extends AbstractModel {

    /**
    * 应用ID
    */
    @SerializedName("ApplicationId")
    @Expose
    private Long ApplicationId;

    /**
    * 应用名
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
    * 应用ID
    */
    @SerializedName("BundleId")
    @Expose
    private String BundleId;

    /**
    * 包名
    */
    @SerializedName("PackageName")
    @Expose
    private String PackageName;

    /**
    * Windows 进程名
    */
    @SerializedName("WinProcessName")
    @Expose
    private String WinProcessName;

    /**
    * Mac 进程名
    */
    @SerializedName("MacBundleId")
    @Expose
    private String MacBundleId;

    /**
    * 要追加的web域名列表
    */
    @SerializedName("DomainList")
    @Expose
    private String [] DomainList;

    /**
     * Get 应用ID 
     * @return ApplicationId 应用ID
     */
    public Long getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set 应用ID
     * @param ApplicationId 应用ID
     */
    public void setApplicationId(Long ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * Get 应用名 
     * @return AppName 应用名
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * Set 应用名
     * @param AppName 应用名
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    /**
     * Get 应用ID 
     * @return BundleId 应用ID
     */
    public String getBundleId() {
        return this.BundleId;
    }

    /**
     * Set 应用ID
     * @param BundleId 应用ID
     */
    public void setBundleId(String BundleId) {
        this.BundleId = BundleId;
    }

    /**
     * Get 包名 
     * @return PackageName 包名
     */
    public String getPackageName() {
        return this.PackageName;
    }

    /**
     * Set 包名
     * @param PackageName 包名
     */
    public void setPackageName(String PackageName) {
        this.PackageName = PackageName;
    }

    /**
     * Get Windows 进程名 
     * @return WinProcessName Windows 进程名
     */
    public String getWinProcessName() {
        return this.WinProcessName;
    }

    /**
     * Set Windows 进程名
     * @param WinProcessName Windows 进程名
     */
    public void setWinProcessName(String WinProcessName) {
        this.WinProcessName = WinProcessName;
    }

    /**
     * Get Mac 进程名 
     * @return MacBundleId Mac 进程名
     */
    public String getMacBundleId() {
        return this.MacBundleId;
    }

    /**
     * Set Mac 进程名
     * @param MacBundleId Mac 进程名
     */
    public void setMacBundleId(String MacBundleId) {
        this.MacBundleId = MacBundleId;
    }

    /**
     * Get 要追加的web域名列表 
     * @return DomainList 要追加的web域名列表
     */
    public String [] getDomainList() {
        return this.DomainList;
    }

    /**
     * Set 要追加的web域名列表
     * @param DomainList 要追加的web域名列表
     */
    public void setDomainList(String [] DomainList) {
        this.DomainList = DomainList;
    }

    public ModifyApplicationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyApplicationRequest(ModifyApplicationRequest source) {
        if (source.ApplicationId != null) {
            this.ApplicationId = new Long(source.ApplicationId);
        }
        if (source.AppName != null) {
            this.AppName = new String(source.AppName);
        }
        if (source.BundleId != null) {
            this.BundleId = new String(source.BundleId);
        }
        if (source.PackageName != null) {
            this.PackageName = new String(source.PackageName);
        }
        if (source.WinProcessName != null) {
            this.WinProcessName = new String(source.WinProcessName);
        }
        if (source.MacBundleId != null) {
            this.MacBundleId = new String(source.MacBundleId);
        }
        if (source.DomainList != null) {
            this.DomainList = new String[source.DomainList.length];
            for (int i = 0; i < source.DomainList.length; i++) {
                this.DomainList[i] = new String(source.DomainList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamSimple(map, prefix + "AppName", this.AppName);
        this.setParamSimple(map, prefix + "BundleId", this.BundleId);
        this.setParamSimple(map, prefix + "PackageName", this.PackageName);
        this.setParamSimple(map, prefix + "WinProcessName", this.WinProcessName);
        this.setParamSimple(map, prefix + "MacBundleId", this.MacBundleId);
        this.setParamArraySimple(map, prefix + "DomainList.", this.DomainList);

    }
}

