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
package com.tencentcloudapi.ms.v20180408.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AppInfo extends AbstractModel {

    /**
    * app的url，必须保证不用权限校验就可以下载
    */
    @SerializedName("AppUrl")
    @Expose
    private String AppUrl;

    /**
    * app的md5，需要正确传递
    */
    @SerializedName("AppMd5")
    @Expose
    private String AppMd5;

    /**
    * app的大小
    */
    @SerializedName("AppSize")
    @Expose
    private Long AppSize;

    /**
    * app的文件名
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * app的包名，需要正确的传递此字段
    */
    @SerializedName("AppPkgName")
    @Expose
    private String AppPkgName;

    /**
    * app的版本号
    */
    @SerializedName("AppVersion")
    @Expose
    private String AppVersion;

    /**
    * app的图标url
    */
    @SerializedName("AppIconUrl")
    @Expose
    private String AppIconUrl;

    /**
    * app的名称
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
     * Get app的url，必须保证不用权限校验就可以下载 
     * @return AppUrl app的url，必须保证不用权限校验就可以下载
     */
    public String getAppUrl() {
        return this.AppUrl;
    }

    /**
     * Set app的url，必须保证不用权限校验就可以下载
     * @param AppUrl app的url，必须保证不用权限校验就可以下载
     */
    public void setAppUrl(String AppUrl) {
        this.AppUrl = AppUrl;
    }

    /**
     * Get app的md5，需要正确传递 
     * @return AppMd5 app的md5，需要正确传递
     */
    public String getAppMd5() {
        return this.AppMd5;
    }

    /**
     * Set app的md5，需要正确传递
     * @param AppMd5 app的md5，需要正确传递
     */
    public void setAppMd5(String AppMd5) {
        this.AppMd5 = AppMd5;
    }

    /**
     * Get app的大小 
     * @return AppSize app的大小
     */
    public Long getAppSize() {
        return this.AppSize;
    }

    /**
     * Set app的大小
     * @param AppSize app的大小
     */
    public void setAppSize(Long AppSize) {
        this.AppSize = AppSize;
    }

    /**
     * Get app的文件名 
     * @return FileName app的文件名
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set app的文件名
     * @param FileName app的文件名
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get app的包名，需要正确的传递此字段 
     * @return AppPkgName app的包名，需要正确的传递此字段
     */
    public String getAppPkgName() {
        return this.AppPkgName;
    }

    /**
     * Set app的包名，需要正确的传递此字段
     * @param AppPkgName app的包名，需要正确的传递此字段
     */
    public void setAppPkgName(String AppPkgName) {
        this.AppPkgName = AppPkgName;
    }

    /**
     * Get app的版本号 
     * @return AppVersion app的版本号
     */
    public String getAppVersion() {
        return this.AppVersion;
    }

    /**
     * Set app的版本号
     * @param AppVersion app的版本号
     */
    public void setAppVersion(String AppVersion) {
        this.AppVersion = AppVersion;
    }

    /**
     * Get app的图标url 
     * @return AppIconUrl app的图标url
     */
    public String getAppIconUrl() {
        return this.AppIconUrl;
    }

    /**
     * Set app的图标url
     * @param AppIconUrl app的图标url
     */
    public void setAppIconUrl(String AppIconUrl) {
        this.AppIconUrl = AppIconUrl;
    }

    /**
     * Get app的名称 
     * @return AppName app的名称
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * Set app的名称
     * @param AppName app的名称
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    public AppInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AppInfo(AppInfo source) {
        if (source.AppUrl != null) {
            this.AppUrl = new String(source.AppUrl);
        }
        if (source.AppMd5 != null) {
            this.AppMd5 = new String(source.AppMd5);
        }
        if (source.AppSize != null) {
            this.AppSize = new Long(source.AppSize);
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.AppPkgName != null) {
            this.AppPkgName = new String(source.AppPkgName);
        }
        if (source.AppVersion != null) {
            this.AppVersion = new String(source.AppVersion);
        }
        if (source.AppIconUrl != null) {
            this.AppIconUrl = new String(source.AppIconUrl);
        }
        if (source.AppName != null) {
            this.AppName = new String(source.AppName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppUrl", this.AppUrl);
        this.setParamSimple(map, prefix + "AppMd5", this.AppMd5);
        this.setParamSimple(map, prefix + "AppSize", this.AppSize);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "AppPkgName", this.AppPkgName);
        this.setParamSimple(map, prefix + "AppVersion", this.AppVersion);
        this.setParamSimple(map, prefix + "AppIconUrl", this.AppIconUrl);
        this.setParamSimple(map, prefix + "AppName", this.AppName);

    }
}

