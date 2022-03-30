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
package com.tencentcloudapi.ame.v20190916.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ApplicationLicenseInput extends AbstractModel{

    /**
    * 应用名称，注：后面三个字段AndroidPackageName、IOSBundleId、PcIdentifier，三者选填一个
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
    * app的安卓包名
    */
    @SerializedName("AndroidPackageName")
    @Expose
    private String AndroidPackageName;

    /**
    * app的IOS的BundleId名
    */
    @SerializedName("IOSBundleId")
    @Expose
    private String IOSBundleId;

    /**
    * PC标识名
    */
    @SerializedName("PcIdentifier")
    @Expose
    private String PcIdentifier;

    /**
     * Get 应用名称，注：后面三个字段AndroidPackageName、IOSBundleId、PcIdentifier，三者选填一个 
     * @return AppName 应用名称，注：后面三个字段AndroidPackageName、IOSBundleId、PcIdentifier，三者选填一个
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * Set 应用名称，注：后面三个字段AndroidPackageName、IOSBundleId、PcIdentifier，三者选填一个
     * @param AppName 应用名称，注：后面三个字段AndroidPackageName、IOSBundleId、PcIdentifier，三者选填一个
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    /**
     * Get app的安卓包名 
     * @return AndroidPackageName app的安卓包名
     */
    public String getAndroidPackageName() {
        return this.AndroidPackageName;
    }

    /**
     * Set app的安卓包名
     * @param AndroidPackageName app的安卓包名
     */
    public void setAndroidPackageName(String AndroidPackageName) {
        this.AndroidPackageName = AndroidPackageName;
    }

    /**
     * Get app的IOS的BundleId名 
     * @return IOSBundleId app的IOS的BundleId名
     */
    public String getIOSBundleId() {
        return this.IOSBundleId;
    }

    /**
     * Set app的IOS的BundleId名
     * @param IOSBundleId app的IOS的BundleId名
     */
    public void setIOSBundleId(String IOSBundleId) {
        this.IOSBundleId = IOSBundleId;
    }

    /**
     * Get PC标识名 
     * @return PcIdentifier PC标识名
     */
    public String getPcIdentifier() {
        return this.PcIdentifier;
    }

    /**
     * Set PC标识名
     * @param PcIdentifier PC标识名
     */
    public void setPcIdentifier(String PcIdentifier) {
        this.PcIdentifier = PcIdentifier;
    }

    public ApplicationLicenseInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApplicationLicenseInput(ApplicationLicenseInput source) {
        if (source.AppName != null) {
            this.AppName = new String(source.AppName);
        }
        if (source.AndroidPackageName != null) {
            this.AndroidPackageName = new String(source.AndroidPackageName);
        }
        if (source.IOSBundleId != null) {
            this.IOSBundleId = new String(source.IOSBundleId);
        }
        if (source.PcIdentifier != null) {
            this.PcIdentifier = new String(source.PcIdentifier);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppName", this.AppName);
        this.setParamSimple(map, prefix + "AndroidPackageName", this.AndroidPackageName);
        this.setParamSimple(map, prefix + "IOSBundleId", this.IOSBundleId);
        this.setParamSimple(map, prefix + "PcIdentifier", this.PcIdentifier);

    }
}

