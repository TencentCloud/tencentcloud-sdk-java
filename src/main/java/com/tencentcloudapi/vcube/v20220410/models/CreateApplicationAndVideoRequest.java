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

public class CreateApplicationAndVideoRequest extends AbstractModel {

    /**
    * 应用名称
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
    * Ios 包名
    */
    @SerializedName("BundleId")
    @Expose
    private String BundleId;

    /**
    * Android 包名
    */
    @SerializedName("PackageName")
    @Expose
    private String PackageName;

    /**
     * Get 应用名称 
     * @return AppName 应用名称
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * Set 应用名称
     * @param AppName 应用名称
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    /**
     * Get Ios 包名 
     * @return BundleId Ios 包名
     */
    public String getBundleId() {
        return this.BundleId;
    }

    /**
     * Set Ios 包名
     * @param BundleId Ios 包名
     */
    public void setBundleId(String BundleId) {
        this.BundleId = BundleId;
    }

    /**
     * Get Android 包名 
     * @return PackageName Android 包名
     */
    public String getPackageName() {
        return this.PackageName;
    }

    /**
     * Set Android 包名
     * @param PackageName Android 包名
     */
    public void setPackageName(String PackageName) {
        this.PackageName = PackageName;
    }

    public CreateApplicationAndVideoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateApplicationAndVideoRequest(CreateApplicationAndVideoRequest source) {
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
        this.setParamSimple(map, prefix + "AppName", this.AppName);
        this.setParamSimple(map, prefix + "BundleId", this.BundleId);
        this.setParamSimple(map, prefix + "PackageName", this.PackageName);

    }
}

