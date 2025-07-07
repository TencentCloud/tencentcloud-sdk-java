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
package com.tencentcloudapi.vcube.v20220410.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyPresetApplicationRequest extends AbstractModel {

    /**
    * 应用Id
    */
    @SerializedName("ApplicationId")
    @Expose
    private Long ApplicationId;

    /**
    * 您的app名称
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
    * ios包名
    */
    @SerializedName("BundleId")
    @Expose
    private String BundleId;

    /**
    * 安卓包名
    */
    @SerializedName("PackageName")
    @Expose
    private String PackageName;

    /**
     * Get 应用Id 
     * @return ApplicationId 应用Id
     */
    public Long getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set 应用Id
     * @param ApplicationId 应用Id
     */
    public void setApplicationId(Long ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * Get 您的app名称 
     * @return AppName 您的app名称
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * Set 您的app名称
     * @param AppName 您的app名称
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    /**
     * Get ios包名 
     * @return BundleId ios包名
     */
    public String getBundleId() {
        return this.BundleId;
    }

    /**
     * Set ios包名
     * @param BundleId ios包名
     */
    public void setBundleId(String BundleId) {
        this.BundleId = BundleId;
    }

    /**
     * Get 安卓包名 
     * @return PackageName 安卓包名
     */
    public String getPackageName() {
        return this.PackageName;
    }

    /**
     * Set 安卓包名
     * @param PackageName 安卓包名
     */
    public void setPackageName(String PackageName) {
        this.PackageName = PackageName;
    }

    public ModifyPresetApplicationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyPresetApplicationRequest(ModifyPresetApplicationRequest source) {
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamSimple(map, prefix + "AppName", this.AppName);
        this.setParamSimple(map, prefix + "BundleId", this.BundleId);
        this.setParamSimple(map, prefix + "PackageName", this.PackageName);

    }
}

