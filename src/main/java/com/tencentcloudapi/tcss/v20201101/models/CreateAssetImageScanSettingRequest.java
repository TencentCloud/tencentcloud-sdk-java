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

public class CreateAssetImageScanSettingRequest extends AbstractModel{

    /**
    * 开关
    */
    @SerializedName("Enable")
    @Expose
    private Boolean Enable;

    /**
    * 扫描时间
    */
    @SerializedName("ScanTime")
    @Expose
    private String ScanTime;

    /**
    * 扫描周期
    */
    @SerializedName("ScanPeriod")
    @Expose
    private Long ScanPeriod;

    /**
    * 扫描木马
    */
    @SerializedName("ScanVirus")
    @Expose
    private Boolean ScanVirus;

    /**
    * 扫描敏感信息
    */
    @SerializedName("ScanRisk")
    @Expose
    private Boolean ScanRisk;

    /**
    * 扫描漏洞
    */
    @SerializedName("ScanVul")
    @Expose
    private Boolean ScanVul;

    /**
    * 全部镜像
    */
    @SerializedName("All")
    @Expose
    private Boolean All;

    /**
    * 自定义镜像
    */
    @SerializedName("Images")
    @Expose
    private String [] Images;

    /**
     * Get 开关 
     * @return Enable 开关
     */
    public Boolean getEnable() {
        return this.Enable;
    }

    /**
     * Set 开关
     * @param Enable 开关
     */
    public void setEnable(Boolean Enable) {
        this.Enable = Enable;
    }

    /**
     * Get 扫描时间 
     * @return ScanTime 扫描时间
     */
    public String getScanTime() {
        return this.ScanTime;
    }

    /**
     * Set 扫描时间
     * @param ScanTime 扫描时间
     */
    public void setScanTime(String ScanTime) {
        this.ScanTime = ScanTime;
    }

    /**
     * Get 扫描周期 
     * @return ScanPeriod 扫描周期
     */
    public Long getScanPeriod() {
        return this.ScanPeriod;
    }

    /**
     * Set 扫描周期
     * @param ScanPeriod 扫描周期
     */
    public void setScanPeriod(Long ScanPeriod) {
        this.ScanPeriod = ScanPeriod;
    }

    /**
     * Get 扫描木马 
     * @return ScanVirus 扫描木马
     */
    public Boolean getScanVirus() {
        return this.ScanVirus;
    }

    /**
     * Set 扫描木马
     * @param ScanVirus 扫描木马
     */
    public void setScanVirus(Boolean ScanVirus) {
        this.ScanVirus = ScanVirus;
    }

    /**
     * Get 扫描敏感信息 
     * @return ScanRisk 扫描敏感信息
     */
    public Boolean getScanRisk() {
        return this.ScanRisk;
    }

    /**
     * Set 扫描敏感信息
     * @param ScanRisk 扫描敏感信息
     */
    public void setScanRisk(Boolean ScanRisk) {
        this.ScanRisk = ScanRisk;
    }

    /**
     * Get 扫描漏洞 
     * @return ScanVul 扫描漏洞
     */
    public Boolean getScanVul() {
        return this.ScanVul;
    }

    /**
     * Set 扫描漏洞
     * @param ScanVul 扫描漏洞
     */
    public void setScanVul(Boolean ScanVul) {
        this.ScanVul = ScanVul;
    }

    /**
     * Get 全部镜像 
     * @return All 全部镜像
     */
    public Boolean getAll() {
        return this.All;
    }

    /**
     * Set 全部镜像
     * @param All 全部镜像
     */
    public void setAll(Boolean All) {
        this.All = All;
    }

    /**
     * Get 自定义镜像 
     * @return Images 自定义镜像
     */
    public String [] getImages() {
        return this.Images;
    }

    /**
     * Set 自定义镜像
     * @param Images 自定义镜像
     */
    public void setImages(String [] Images) {
        this.Images = Images;
    }

    public CreateAssetImageScanSettingRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAssetImageScanSettingRequest(CreateAssetImageScanSettingRequest source) {
        if (source.Enable != null) {
            this.Enable = new Boolean(source.Enable);
        }
        if (source.ScanTime != null) {
            this.ScanTime = new String(source.ScanTime);
        }
        if (source.ScanPeriod != null) {
            this.ScanPeriod = new Long(source.ScanPeriod);
        }
        if (source.ScanVirus != null) {
            this.ScanVirus = new Boolean(source.ScanVirus);
        }
        if (source.ScanRisk != null) {
            this.ScanRisk = new Boolean(source.ScanRisk);
        }
        if (source.ScanVul != null) {
            this.ScanVul = new Boolean(source.ScanVul);
        }
        if (source.All != null) {
            this.All = new Boolean(source.All);
        }
        if (source.Images != null) {
            this.Images = new String[source.Images.length];
            for (int i = 0; i < source.Images.length; i++) {
                this.Images[i] = new String(source.Images[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "ScanTime", this.ScanTime);
        this.setParamSimple(map, prefix + "ScanPeriod", this.ScanPeriod);
        this.setParamSimple(map, prefix + "ScanVirus", this.ScanVirus);
        this.setParamSimple(map, prefix + "ScanRisk", this.ScanRisk);
        this.setParamSimple(map, prefix + "ScanVul", this.ScanVul);
        this.setParamSimple(map, prefix + "All", this.All);
        this.setParamArraySimple(map, prefix + "Images.", this.Images);

    }
}

