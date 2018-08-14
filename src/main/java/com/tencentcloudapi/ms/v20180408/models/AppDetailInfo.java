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
package com.tencentcloudapi.ms.v20180408.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AppDetailInfo  extends AbstractModel{

    /**
    * app的名称
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
    * app的包名
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
    * app的大小
    */
    @SerializedName("AppSize")
    @Expose
    private Integer AppSize;

    /**
    * app的md5
    */
    @SerializedName("AppMd5")
    @Expose
    private String AppMd5;

    /**
    * app的图标url
    */
    @SerializedName("AppIconUrl")
    @Expose
    private String AppIconUrl;

    /**
    * app的文件名称
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
     * 获取app的名称
     * @return AppName app的名称
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * 设置app的名称
     * @param AppName app的名称
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    /**
     * 获取app的包名
     * @return AppPkgName app的包名
     */
    public String getAppPkgName() {
        return this.AppPkgName;
    }

    /**
     * 设置app的包名
     * @param AppPkgName app的包名
     */
    public void setAppPkgName(String AppPkgName) {
        this.AppPkgName = AppPkgName;
    }

    /**
     * 获取app的版本号
     * @return AppVersion app的版本号
     */
    public String getAppVersion() {
        return this.AppVersion;
    }

    /**
     * 设置app的版本号
     * @param AppVersion app的版本号
     */
    public void setAppVersion(String AppVersion) {
        this.AppVersion = AppVersion;
    }

    /**
     * 获取app的大小
     * @return AppSize app的大小
     */
    public Integer getAppSize() {
        return this.AppSize;
    }

    /**
     * 设置app的大小
     * @param AppSize app的大小
     */
    public void setAppSize(Integer AppSize) {
        this.AppSize = AppSize;
    }

    /**
     * 获取app的md5
     * @return AppMd5 app的md5
     */
    public String getAppMd5() {
        return this.AppMd5;
    }

    /**
     * 设置app的md5
     * @param AppMd5 app的md5
     */
    public void setAppMd5(String AppMd5) {
        this.AppMd5 = AppMd5;
    }

    /**
     * 获取app的图标url
     * @return AppIconUrl app的图标url
     */
    public String getAppIconUrl() {
        return this.AppIconUrl;
    }

    /**
     * 设置app的图标url
     * @param AppIconUrl app的图标url
     */
    public void setAppIconUrl(String AppIconUrl) {
        this.AppIconUrl = AppIconUrl;
    }

    /**
     * 获取app的文件名称
     * @return FileName app的文件名称
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * 设置app的文件名称
     * @param FileName app的文件名称
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppName", this.AppName);
        this.setParamSimple(map, prefix + "AppPkgName", this.AppPkgName);
        this.setParamSimple(map, prefix + "AppVersion", this.AppVersion);
        this.setParamSimple(map, prefix + "AppSize", this.AppSize);
        this.setParamSimple(map, prefix + "AppMd5", this.AppMd5);
        this.setParamSimple(map, prefix + "AppIconUrl", this.AppIconUrl);
        this.setParamSimple(map, prefix + "FileName", this.FileName);

    }
}

