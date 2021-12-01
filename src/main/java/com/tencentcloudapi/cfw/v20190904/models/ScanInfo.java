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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ScanInfo extends AbstractModel{

    /**
    * 扫描结果信息
    */
    @SerializedName("ScanResultInfo")
    @Expose
    private ScanResultInfo ScanResultInfo;

    /**
    * 扫描状态 0扫描中 1完成  2未勾选自动扫描
    */
    @SerializedName("ScanStatus")
    @Expose
    private Long ScanStatus;

    /**
    * 进度
    */
    @SerializedName("ScanPercent")
    @Expose
    private Float ScanPercent;

    /**
    * 预计完成时间
    */
    @SerializedName("ScanTime")
    @Expose
    private String ScanTime;

    /**
     * Get 扫描结果信息 
     * @return ScanResultInfo 扫描结果信息
     */
    public ScanResultInfo getScanResultInfo() {
        return this.ScanResultInfo;
    }

    /**
     * Set 扫描结果信息
     * @param ScanResultInfo 扫描结果信息
     */
    public void setScanResultInfo(ScanResultInfo ScanResultInfo) {
        this.ScanResultInfo = ScanResultInfo;
    }

    /**
     * Get 扫描状态 0扫描中 1完成  2未勾选自动扫描 
     * @return ScanStatus 扫描状态 0扫描中 1完成  2未勾选自动扫描
     */
    public Long getScanStatus() {
        return this.ScanStatus;
    }

    /**
     * Set 扫描状态 0扫描中 1完成  2未勾选自动扫描
     * @param ScanStatus 扫描状态 0扫描中 1完成  2未勾选自动扫描
     */
    public void setScanStatus(Long ScanStatus) {
        this.ScanStatus = ScanStatus;
    }

    /**
     * Get 进度 
     * @return ScanPercent 进度
     */
    public Float getScanPercent() {
        return this.ScanPercent;
    }

    /**
     * Set 进度
     * @param ScanPercent 进度
     */
    public void setScanPercent(Float ScanPercent) {
        this.ScanPercent = ScanPercent;
    }

    /**
     * Get 预计完成时间 
     * @return ScanTime 预计完成时间
     */
    public String getScanTime() {
        return this.ScanTime;
    }

    /**
     * Set 预计完成时间
     * @param ScanTime 预计完成时间
     */
    public void setScanTime(String ScanTime) {
        this.ScanTime = ScanTime;
    }

    public ScanInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScanInfo(ScanInfo source) {
        if (source.ScanResultInfo != null) {
            this.ScanResultInfo = new ScanResultInfo(source.ScanResultInfo);
        }
        if (source.ScanStatus != null) {
            this.ScanStatus = new Long(source.ScanStatus);
        }
        if (source.ScanPercent != null) {
            this.ScanPercent = new Float(source.ScanPercent);
        }
        if (source.ScanTime != null) {
            this.ScanTime = new String(source.ScanTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "ScanResultInfo.", this.ScanResultInfo);
        this.setParamSimple(map, prefix + "ScanStatus", this.ScanStatus);
        this.setParamSimple(map, prefix + "ScanPercent", this.ScanPercent);
        this.setParamSimple(map, prefix + "ScanTime", this.ScanTime);

    }
}

