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

public class DescribeVcubeApplicationAndXMagicListRequest extends AbstractModel {

    /**
    * 查询对应业务方的license，直播:live 点播：vod
    */
    @SerializedName("BizType")
    @Expose
    private String BizType;

    /**
    * 应用类型测试：test，正式：formal
    */
    @SerializedName("AppType")
    @Expose
    private String AppType;

    /**
    * 应用名称，模糊查询
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
    * Ios包名，模糊查询
    */
    @SerializedName("BundleId")
    @Expose
    private String BundleId;

    /**
    * Android 包名，模糊查询
    */
    @SerializedName("PackageName")
    @Expose
    private String PackageName;

    /**
    * 平台信息，pc 或者 mobile
    */
    @SerializedName("Platform")
    @Expose
    private String Platform;

    /**
    * Mac 进程名
    */
    @SerializedName("MacBundleId")
    @Expose
    private String MacBundleId;

    /**
    * Windows 进程名
    */
    @SerializedName("WinProcessName")
    @Expose
    private String WinProcessName;

    /**
     * Get 查询对应业务方的license，直播:live 点播：vod 
     * @return BizType 查询对应业务方的license，直播:live 点播：vod
     */
    public String getBizType() {
        return this.BizType;
    }

    /**
     * Set 查询对应业务方的license，直播:live 点播：vod
     * @param BizType 查询对应业务方的license，直播:live 点播：vod
     */
    public void setBizType(String BizType) {
        this.BizType = BizType;
    }

    /**
     * Get 应用类型测试：test，正式：formal 
     * @return AppType 应用类型测试：test，正式：formal
     */
    public String getAppType() {
        return this.AppType;
    }

    /**
     * Set 应用类型测试：test，正式：formal
     * @param AppType 应用类型测试：test，正式：formal
     */
    public void setAppType(String AppType) {
        this.AppType = AppType;
    }

    /**
     * Get 应用名称，模糊查询 
     * @return AppName 应用名称，模糊查询
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * Set 应用名称，模糊查询
     * @param AppName 应用名称，模糊查询
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    /**
     * Get Ios包名，模糊查询 
     * @return BundleId Ios包名，模糊查询
     */
    public String getBundleId() {
        return this.BundleId;
    }

    /**
     * Set Ios包名，模糊查询
     * @param BundleId Ios包名，模糊查询
     */
    public void setBundleId(String BundleId) {
        this.BundleId = BundleId;
    }

    /**
     * Get Android 包名，模糊查询 
     * @return PackageName Android 包名，模糊查询
     */
    public String getPackageName() {
        return this.PackageName;
    }

    /**
     * Set Android 包名，模糊查询
     * @param PackageName Android 包名，模糊查询
     */
    public void setPackageName(String PackageName) {
        this.PackageName = PackageName;
    }

    /**
     * Get 平台信息，pc 或者 mobile 
     * @return Platform 平台信息，pc 或者 mobile
     */
    public String getPlatform() {
        return this.Platform;
    }

    /**
     * Set 平台信息，pc 或者 mobile
     * @param Platform 平台信息，pc 或者 mobile
     */
    public void setPlatform(String Platform) {
        this.Platform = Platform;
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

    public DescribeVcubeApplicationAndXMagicListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVcubeApplicationAndXMagicListRequest(DescribeVcubeApplicationAndXMagicListRequest source) {
        if (source.BizType != null) {
            this.BizType = new String(source.BizType);
        }
        if (source.AppType != null) {
            this.AppType = new String(source.AppType);
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
        if (source.Platform != null) {
            this.Platform = new String(source.Platform);
        }
        if (source.MacBundleId != null) {
            this.MacBundleId = new String(source.MacBundleId);
        }
        if (source.WinProcessName != null) {
            this.WinProcessName = new String(source.WinProcessName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BizType", this.BizType);
        this.setParamSimple(map, prefix + "AppType", this.AppType);
        this.setParamSimple(map, prefix + "AppName", this.AppName);
        this.setParamSimple(map, prefix + "BundleId", this.BundleId);
        this.setParamSimple(map, prefix + "PackageName", this.PackageName);
        this.setParamSimple(map, prefix + "Platform", this.Platform);
        this.setParamSimple(map, prefix + "MacBundleId", this.MacBundleId);
        this.setParamSimple(map, prefix + "WinProcessName", this.WinProcessName);

    }
}

