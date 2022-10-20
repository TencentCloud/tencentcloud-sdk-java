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

public class DescribeVirusManualScanEstimateTimeoutRequest extends AbstractModel{

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

    public DescribeVirusManualScanEstimateTimeoutRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVirusManualScanEstimateTimeoutRequest(DescribeVirusManualScanEstimateTimeoutRequest source) {
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ScanRangeType", this.ScanRangeType);
        this.setParamSimple(map, prefix + "ScanRangeAll", this.ScanRangeAll);
        this.setParamArraySimple(map, prefix + "ScanIds.", this.ScanIds);

    }
}

