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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyVirusScanSettingRequest extends AbstractModel{

    /**
    * 是否开启定期扫描
    */
    @SerializedName("EnableScan")
    @Expose
    private Boolean EnableScan;

    /**
    * 检测周期每隔多少天(1|3|7)
    */
    @SerializedName("Cycle")
    @Expose
    private Long Cycle;

    /**
    * 扫描开始时间
    */
    @SerializedName("BeginScanAt")
    @Expose
    private String BeginScanAt;

    /**
    * 扫描全部路径(true:全选,false:自选)
    */
    @SerializedName("ScanPathAll")
    @Expose
    private Boolean ScanPathAll;

    /**
    * 当ScanPathAll为true 生效 0扫描以下路径 1、扫描除以下路径
    */
    @SerializedName("ScanPathType")
    @Expose
    private Long ScanPathType;

    /**
    * 超时时长(5~24h)
    */
    @SerializedName("Timeout")
    @Expose
    private Long Timeout;

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
    * 自选扫描范围的容器id或者主机id 根据ScanRangeType决定
    */
    @SerializedName("ScanIds")
    @Expose
    private String [] ScanIds;

    /**
    * 扫描路径
    */
    @SerializedName("ScanPath")
    @Expose
    private String [] ScanPath;

    /**
     * Get 是否开启定期扫描 
     * @return EnableScan 是否开启定期扫描
     */
    public Boolean getEnableScan() {
        return this.EnableScan;
    }

    /**
     * Set 是否开启定期扫描
     * @param EnableScan 是否开启定期扫描
     */
    public void setEnableScan(Boolean EnableScan) {
        this.EnableScan = EnableScan;
    }

    /**
     * Get 检测周期每隔多少天(1|3|7) 
     * @return Cycle 检测周期每隔多少天(1|3|7)
     */
    public Long getCycle() {
        return this.Cycle;
    }

    /**
     * Set 检测周期每隔多少天(1|3|7)
     * @param Cycle 检测周期每隔多少天(1|3|7)
     */
    public void setCycle(Long Cycle) {
        this.Cycle = Cycle;
    }

    /**
     * Get 扫描开始时间 
     * @return BeginScanAt 扫描开始时间
     */
    public String getBeginScanAt() {
        return this.BeginScanAt;
    }

    /**
     * Set 扫描开始时间
     * @param BeginScanAt 扫描开始时间
     */
    public void setBeginScanAt(String BeginScanAt) {
        this.BeginScanAt = BeginScanAt;
    }

    /**
     * Get 扫描全部路径(true:全选,false:自选) 
     * @return ScanPathAll 扫描全部路径(true:全选,false:自选)
     */
    public Boolean getScanPathAll() {
        return this.ScanPathAll;
    }

    /**
     * Set 扫描全部路径(true:全选,false:自选)
     * @param ScanPathAll 扫描全部路径(true:全选,false:自选)
     */
    public void setScanPathAll(Boolean ScanPathAll) {
        this.ScanPathAll = ScanPathAll;
    }

    /**
     * Get 当ScanPathAll为true 生效 0扫描以下路径 1、扫描除以下路径 
     * @return ScanPathType 当ScanPathAll为true 生效 0扫描以下路径 1、扫描除以下路径
     */
    public Long getScanPathType() {
        return this.ScanPathType;
    }

    /**
     * Set 当ScanPathAll为true 生效 0扫描以下路径 1、扫描除以下路径
     * @param ScanPathType 当ScanPathAll为true 生效 0扫描以下路径 1、扫描除以下路径
     */
    public void setScanPathType(Long ScanPathType) {
        this.ScanPathType = ScanPathType;
    }

    /**
     * Get 超时时长(5~24h) 
     * @return Timeout 超时时长(5~24h)
     */
    public Long getTimeout() {
        return this.Timeout;
    }

    /**
     * Set 超时时长(5~24h)
     * @param Timeout 超时时长(5~24h)
     */
    public void setTimeout(Long Timeout) {
        this.Timeout = Timeout;
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
     * Get 扫描路径 
     * @return ScanPath 扫描路径
     */
    public String [] getScanPath() {
        return this.ScanPath;
    }

    /**
     * Set 扫描路径
     * @param ScanPath 扫描路径
     */
    public void setScanPath(String [] ScanPath) {
        this.ScanPath = ScanPath;
    }

    public ModifyVirusScanSettingRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyVirusScanSettingRequest(ModifyVirusScanSettingRequest source) {
        if (source.EnableScan != null) {
            this.EnableScan = new Boolean(source.EnableScan);
        }
        if (source.Cycle != null) {
            this.Cycle = new Long(source.Cycle);
        }
        if (source.BeginScanAt != null) {
            this.BeginScanAt = new String(source.BeginScanAt);
        }
        if (source.ScanPathAll != null) {
            this.ScanPathAll = new Boolean(source.ScanPathAll);
        }
        if (source.ScanPathType != null) {
            this.ScanPathType = new Long(source.ScanPathType);
        }
        if (source.Timeout != null) {
            this.Timeout = new Long(source.Timeout);
        }
        if (source.ScanRangeType != null) {
            this.ScanRangeType = new Long(source.ScanRangeType);
        }
        if (source.ScanRangeAll != null) {
            this.ScanRangeAll = new Boolean(source.ScanRangeAll);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnableScan", this.EnableScan);
        this.setParamSimple(map, prefix + "Cycle", this.Cycle);
        this.setParamSimple(map, prefix + "BeginScanAt", this.BeginScanAt);
        this.setParamSimple(map, prefix + "ScanPathAll", this.ScanPathAll);
        this.setParamSimple(map, prefix + "ScanPathType", this.ScanPathType);
        this.setParamSimple(map, prefix + "Timeout", this.Timeout);
        this.setParamSimple(map, prefix + "ScanRangeType", this.ScanRangeType);
        this.setParamSimple(map, prefix + "ScanRangeAll", this.ScanRangeAll);
        this.setParamArraySimple(map, prefix + "ScanIds.", this.ScanIds);
        this.setParamArraySimple(map, prefix + "ScanPath.", this.ScanPath);

    }
}

