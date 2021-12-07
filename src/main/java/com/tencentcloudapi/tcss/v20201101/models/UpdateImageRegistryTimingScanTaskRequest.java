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

public class UpdateImageRegistryTimingScanTaskRequest extends AbstractModel{

    /**
    * 定时扫描周期
    */
    @SerializedName("ScanPeriod")
    @Expose
    private Long ScanPeriod;

    /**
    * 定时扫描开关
    */
    @SerializedName("Enable")
    @Expose
    private Boolean Enable;

    /**
    * 定时扫描的时间
    */
    @SerializedName("ScanTime")
    @Expose
    private String ScanTime;

    /**
    * 扫描木马类型数组
    */
    @SerializedName("ScanType")
    @Expose
    private String [] ScanType;

    /**
    * 扫描镜像
    */
    @SerializedName("Images")
    @Expose
    private ImageInfo [] Images;

    /**
    * 是否扫描所有
    */
    @SerializedName("All")
    @Expose
    private Boolean All;

    /**
    * 扫描镜像Id
    */
    @SerializedName("Id")
    @Expose
    private Long [] Id;

    /**
     * Get 定时扫描周期 
     * @return ScanPeriod 定时扫描周期
     */
    public Long getScanPeriod() {
        return this.ScanPeriod;
    }

    /**
     * Set 定时扫描周期
     * @param ScanPeriod 定时扫描周期
     */
    public void setScanPeriod(Long ScanPeriod) {
        this.ScanPeriod = ScanPeriod;
    }

    /**
     * Get 定时扫描开关 
     * @return Enable 定时扫描开关
     */
    public Boolean getEnable() {
        return this.Enable;
    }

    /**
     * Set 定时扫描开关
     * @param Enable 定时扫描开关
     */
    public void setEnable(Boolean Enable) {
        this.Enable = Enable;
    }

    /**
     * Get 定时扫描的时间 
     * @return ScanTime 定时扫描的时间
     */
    public String getScanTime() {
        return this.ScanTime;
    }

    /**
     * Set 定时扫描的时间
     * @param ScanTime 定时扫描的时间
     */
    public void setScanTime(String ScanTime) {
        this.ScanTime = ScanTime;
    }

    /**
     * Get 扫描木马类型数组 
     * @return ScanType 扫描木马类型数组
     */
    public String [] getScanType() {
        return this.ScanType;
    }

    /**
     * Set 扫描木马类型数组
     * @param ScanType 扫描木马类型数组
     */
    public void setScanType(String [] ScanType) {
        this.ScanType = ScanType;
    }

    /**
     * Get 扫描镜像 
     * @return Images 扫描镜像
     */
    public ImageInfo [] getImages() {
        return this.Images;
    }

    /**
     * Set 扫描镜像
     * @param Images 扫描镜像
     */
    public void setImages(ImageInfo [] Images) {
        this.Images = Images;
    }

    /**
     * Get 是否扫描所有 
     * @return All 是否扫描所有
     */
    public Boolean getAll() {
        return this.All;
    }

    /**
     * Set 是否扫描所有
     * @param All 是否扫描所有
     */
    public void setAll(Boolean All) {
        this.All = All;
    }

    /**
     * Get 扫描镜像Id 
     * @return Id 扫描镜像Id
     */
    public Long [] getId() {
        return this.Id;
    }

    /**
     * Set 扫描镜像Id
     * @param Id 扫描镜像Id
     */
    public void setId(Long [] Id) {
        this.Id = Id;
    }

    public UpdateImageRegistryTimingScanTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateImageRegistryTimingScanTaskRequest(UpdateImageRegistryTimingScanTaskRequest source) {
        if (source.ScanPeriod != null) {
            this.ScanPeriod = new Long(source.ScanPeriod);
        }
        if (source.Enable != null) {
            this.Enable = new Boolean(source.Enable);
        }
        if (source.ScanTime != null) {
            this.ScanTime = new String(source.ScanTime);
        }
        if (source.ScanType != null) {
            this.ScanType = new String[source.ScanType.length];
            for (int i = 0; i < source.ScanType.length; i++) {
                this.ScanType[i] = new String(source.ScanType[i]);
            }
        }
        if (source.Images != null) {
            this.Images = new ImageInfo[source.Images.length];
            for (int i = 0; i < source.Images.length; i++) {
                this.Images[i] = new ImageInfo(source.Images[i]);
            }
        }
        if (source.All != null) {
            this.All = new Boolean(source.All);
        }
        if (source.Id != null) {
            this.Id = new Long[source.Id.length];
            for (int i = 0; i < source.Id.length; i++) {
                this.Id[i] = new Long(source.Id[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ScanPeriod", this.ScanPeriod);
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "ScanTime", this.ScanTime);
        this.setParamArraySimple(map, prefix + "ScanType.", this.ScanType);
        this.setParamArrayObj(map, prefix + "Images.", this.Images);
        this.setParamSimple(map, prefix + "All", this.All);
        this.setParamArraySimple(map, prefix + "Id.", this.Id);

    }
}

