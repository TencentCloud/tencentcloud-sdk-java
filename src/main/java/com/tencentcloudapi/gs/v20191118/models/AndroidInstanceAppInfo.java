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
package com.tencentcloudapi.gs.v20191118.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AndroidInstanceAppInfo extends AbstractModel {

    /**
    * 应用id
    */
    @SerializedName("AndroidAppId")
    @Expose
    private String AndroidAppId;

    /**
    * 应用名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 应用版本
    */
    @SerializedName("AndroidAppVersion")
    @Expose
    private String AndroidAppVersion;

    /**
    * 应用包名
    */
    @SerializedName("PackageName")
    @Expose
    private String PackageName;

    /**
    * 应用包版本
    */
    @SerializedName("PackageVersion")
    @Expose
    private String PackageVersion;

    /**
    * 应用包标签
    */
    @SerializedName("PackageLabel")
    @Expose
    private String PackageLabel;

    /**
     * Get 应用id 
     * @return AndroidAppId 应用id
     */
    public String getAndroidAppId() {
        return this.AndroidAppId;
    }

    /**
     * Set 应用id
     * @param AndroidAppId 应用id
     */
    public void setAndroidAppId(String AndroidAppId) {
        this.AndroidAppId = AndroidAppId;
    }

    /**
     * Get 应用名称 
     * @return Name 应用名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 应用名称
     * @param Name 应用名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 应用版本 
     * @return AndroidAppVersion 应用版本
     */
    public String getAndroidAppVersion() {
        return this.AndroidAppVersion;
    }

    /**
     * Set 应用版本
     * @param AndroidAppVersion 应用版本
     */
    public void setAndroidAppVersion(String AndroidAppVersion) {
        this.AndroidAppVersion = AndroidAppVersion;
    }

    /**
     * Get 应用包名 
     * @return PackageName 应用包名
     */
    public String getPackageName() {
        return this.PackageName;
    }

    /**
     * Set 应用包名
     * @param PackageName 应用包名
     */
    public void setPackageName(String PackageName) {
        this.PackageName = PackageName;
    }

    /**
     * Get 应用包版本 
     * @return PackageVersion 应用包版本
     */
    public String getPackageVersion() {
        return this.PackageVersion;
    }

    /**
     * Set 应用包版本
     * @param PackageVersion 应用包版本
     */
    public void setPackageVersion(String PackageVersion) {
        this.PackageVersion = PackageVersion;
    }

    /**
     * Get 应用包标签 
     * @return PackageLabel 应用包标签
     */
    public String getPackageLabel() {
        return this.PackageLabel;
    }

    /**
     * Set 应用包标签
     * @param PackageLabel 应用包标签
     */
    public void setPackageLabel(String PackageLabel) {
        this.PackageLabel = PackageLabel;
    }

    public AndroidInstanceAppInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AndroidInstanceAppInfo(AndroidInstanceAppInfo source) {
        if (source.AndroidAppId != null) {
            this.AndroidAppId = new String(source.AndroidAppId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.AndroidAppVersion != null) {
            this.AndroidAppVersion = new String(source.AndroidAppVersion);
        }
        if (source.PackageName != null) {
            this.PackageName = new String(source.PackageName);
        }
        if (source.PackageVersion != null) {
            this.PackageVersion = new String(source.PackageVersion);
        }
        if (source.PackageLabel != null) {
            this.PackageLabel = new String(source.PackageLabel);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AndroidAppId", this.AndroidAppId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "AndroidAppVersion", this.AndroidAppVersion);
        this.setParamSimple(map, prefix + "PackageName", this.PackageName);
        this.setParamSimple(map, prefix + "PackageVersion", this.PackageVersion);
        this.setParamSimple(map, prefix + "PackageLabel", this.PackageLabel);

    }
}

