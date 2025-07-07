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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateVirusScanTaskRequest extends AbstractModel {

    /**
    * 是否扫描所有路径
    */
    @SerializedName("ScanPathAll")
    @Expose
    private Boolean ScanPathAll;

    /**
    * 扫描范围0容器1主机节点
    */
    @SerializedName("ScanRangeType")
    @Expose
    private Long ScanRangeType;

    /**
    * true 全选，false 自选
    */
    @SerializedName("ScanRangeAll")
    @Expose
    private Boolean ScanRangeAll;

    /**
    * 超时时长，单位小时
    */
    @SerializedName("Timeout")
    @Expose
    private Long Timeout;

    /**
    * 当ScanPathAll为false生效 0扫描以下路径 1、扫描除以下路径
    */
    @SerializedName("ScanPathType")
    @Expose
    private Long ScanPathType;

    /**
    * 自选扫描范围的容器id或者主机id 根据ScanRangeType决定
    */
    @SerializedName("ScanIds")
    @Expose
    private String [] ScanIds;

    /**
    * 自选排除或扫描的地址
    */
    @SerializedName("ScanPath")
    @Expose
    private String [] ScanPath;

    /**
    * 扫描路径模式：
SCAN_PATH_ALL：全部路径
SCAN_PATH_DEFAULT：默认路径
SCAN_PATH_USER_DEFINE：用户自定义路径

    */
    @SerializedName("ScanPathMode")
    @Expose
    private String ScanPathMode;

    /**
     * Get 是否扫描所有路径 
     * @return ScanPathAll 是否扫描所有路径
     */
    public Boolean getScanPathAll() {
        return this.ScanPathAll;
    }

    /**
     * Set 是否扫描所有路径
     * @param ScanPathAll 是否扫描所有路径
     */
    public void setScanPathAll(Boolean ScanPathAll) {
        this.ScanPathAll = ScanPathAll;
    }

    /**
     * Get 扫描范围0容器1主机节点 
     * @return ScanRangeType 扫描范围0容器1主机节点
     */
    public Long getScanRangeType() {
        return this.ScanRangeType;
    }

    /**
     * Set 扫描范围0容器1主机节点
     * @param ScanRangeType 扫描范围0容器1主机节点
     */
    public void setScanRangeType(Long ScanRangeType) {
        this.ScanRangeType = ScanRangeType;
    }

    /**
     * Get true 全选，false 自选 
     * @return ScanRangeAll true 全选，false 自选
     */
    public Boolean getScanRangeAll() {
        return this.ScanRangeAll;
    }

    /**
     * Set true 全选，false 自选
     * @param ScanRangeAll true 全选，false 自选
     */
    public void setScanRangeAll(Boolean ScanRangeAll) {
        this.ScanRangeAll = ScanRangeAll;
    }

    /**
     * Get 超时时长，单位小时 
     * @return Timeout 超时时长，单位小时
     */
    public Long getTimeout() {
        return this.Timeout;
    }

    /**
     * Set 超时时长，单位小时
     * @param Timeout 超时时长，单位小时
     */
    public void setTimeout(Long Timeout) {
        this.Timeout = Timeout;
    }

    /**
     * Get 当ScanPathAll为false生效 0扫描以下路径 1、扫描除以下路径 
     * @return ScanPathType 当ScanPathAll为false生效 0扫描以下路径 1、扫描除以下路径
     */
    public Long getScanPathType() {
        return this.ScanPathType;
    }

    /**
     * Set 当ScanPathAll为false生效 0扫描以下路径 1、扫描除以下路径
     * @param ScanPathType 当ScanPathAll为false生效 0扫描以下路径 1、扫描除以下路径
     */
    public void setScanPathType(Long ScanPathType) {
        this.ScanPathType = ScanPathType;
    }

    /**
     * Get 自选扫描范围的容器id或者主机id 根据ScanRangeType决定 
     * @return ScanIds 自选扫描范围的容器id或者主机id 根据ScanRangeType决定
     */
    public String [] getScanIds() {
        return this.ScanIds;
    }

    /**
     * Set 自选扫描范围的容器id或者主机id 根据ScanRangeType决定
     * @param ScanIds 自选扫描范围的容器id或者主机id 根据ScanRangeType决定
     */
    public void setScanIds(String [] ScanIds) {
        this.ScanIds = ScanIds;
    }

    /**
     * Get 自选排除或扫描的地址 
     * @return ScanPath 自选排除或扫描的地址
     */
    public String [] getScanPath() {
        return this.ScanPath;
    }

    /**
     * Set 自选排除或扫描的地址
     * @param ScanPath 自选排除或扫描的地址
     */
    public void setScanPath(String [] ScanPath) {
        this.ScanPath = ScanPath;
    }

    /**
     * Get 扫描路径模式：
SCAN_PATH_ALL：全部路径
SCAN_PATH_DEFAULT：默认路径
SCAN_PATH_USER_DEFINE：用户自定义路径
 
     * @return ScanPathMode 扫描路径模式：
SCAN_PATH_ALL：全部路径
SCAN_PATH_DEFAULT：默认路径
SCAN_PATH_USER_DEFINE：用户自定义路径

     */
    public String getScanPathMode() {
        return this.ScanPathMode;
    }

    /**
     * Set 扫描路径模式：
SCAN_PATH_ALL：全部路径
SCAN_PATH_DEFAULT：默认路径
SCAN_PATH_USER_DEFINE：用户自定义路径

     * @param ScanPathMode 扫描路径模式：
SCAN_PATH_ALL：全部路径
SCAN_PATH_DEFAULT：默认路径
SCAN_PATH_USER_DEFINE：用户自定义路径

     */
    public void setScanPathMode(String ScanPathMode) {
        this.ScanPathMode = ScanPathMode;
    }

    public CreateVirusScanTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateVirusScanTaskRequest(CreateVirusScanTaskRequest source) {
        if (source.ScanPathAll != null) {
            this.ScanPathAll = new Boolean(source.ScanPathAll);
        }
        if (source.ScanRangeType != null) {
            this.ScanRangeType = new Long(source.ScanRangeType);
        }
        if (source.ScanRangeAll != null) {
            this.ScanRangeAll = new Boolean(source.ScanRangeAll);
        }
        if (source.Timeout != null) {
            this.Timeout = new Long(source.Timeout);
        }
        if (source.ScanPathType != null) {
            this.ScanPathType = new Long(source.ScanPathType);
        }
        if (source.ScanIds != null) {
            this.ScanIds = new String[source.ScanIds.length];
            for (int i = 0; i < source.ScanIds.length; i++) {
                this.ScanIds[i] = new String(source.ScanIds[i]);
            }
        }
        if (source.ScanPath != null) {
            this.ScanPath = new String[source.ScanPath.length];
            for (int i = 0; i < source.ScanPath.length; i++) {
                this.ScanPath[i] = new String(source.ScanPath[i]);
            }
        }
        if (source.ScanPathMode != null) {
            this.ScanPathMode = new String(source.ScanPathMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ScanPathAll", this.ScanPathAll);
        this.setParamSimple(map, prefix + "ScanRangeType", this.ScanRangeType);
        this.setParamSimple(map, prefix + "ScanRangeAll", this.ScanRangeAll);
        this.setParamSimple(map, prefix + "Timeout", this.Timeout);
        this.setParamSimple(map, prefix + "ScanPathType", this.ScanPathType);
        this.setParamArraySimple(map, prefix + "ScanIds.", this.ScanIds);
        this.setParamArraySimple(map, prefix + "ScanPath.", this.ScanPath);
        this.setParamSimple(map, prefix + "ScanPathMode", this.ScanPathMode);

    }
}

