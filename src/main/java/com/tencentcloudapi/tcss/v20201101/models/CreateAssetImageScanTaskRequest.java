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

public class CreateAssetImageScanTaskRequest extends AbstractModel{

    /**
    * 是否扫描全部镜像
    */
    @SerializedName("All")
    @Expose
    private Boolean All;

    /**
    * 需要扫描的镜像列表
    */
    @SerializedName("Images")
    @Expose
    private String [] Images;

    /**
    * 扫描漏洞
    */
    @SerializedName("ScanVul")
    @Expose
    private Boolean ScanVul;

    /**
    * 扫描木马
    */
    @SerializedName("ScanVirus")
    @Expose
    private Boolean ScanVirus;

    /**
    * 扫描风险
    */
    @SerializedName("ScanRisk")
    @Expose
    private Boolean ScanRisk;

    /**
     * Get 是否扫描全部镜像 
     * @return All 是否扫描全部镜像
     */
    public Boolean getAll() {
        return this.All;
    }

    /**
     * Set 是否扫描全部镜像
     * @param All 是否扫描全部镜像
     */
    public void setAll(Boolean All) {
        this.All = All;
    }

    /**
     * Get 需要扫描的镜像列表 
     * @return Images 需要扫描的镜像列表
     */
    public String [] getImages() {
        return this.Images;
    }

    /**
     * Set 需要扫描的镜像列表
     * @param Images 需要扫描的镜像列表
     */
    public void setImages(String [] Images) {
        this.Images = Images;
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
     * Get 扫描风险 
     * @return ScanRisk 扫描风险
     */
    public Boolean getScanRisk() {
        return this.ScanRisk;
    }

    /**
     * Set 扫描风险
     * @param ScanRisk 扫描风险
     */
    public void setScanRisk(Boolean ScanRisk) {
        this.ScanRisk = ScanRisk;
    }

    public CreateAssetImageScanTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAssetImageScanTaskRequest(CreateAssetImageScanTaskRequest source) {
        if (source.All != null) {
            this.All = new Boolean(source.All);
        }
        if (source.Images != null) {
            this.Images = new String[source.Images.length];
            for (int i = 0; i < source.Images.length; i++) {
                this.Images[i] = new String(source.Images[i]);
            }
        }
        if (source.ScanVul != null) {
            this.ScanVul = new Boolean(source.ScanVul);
        }
        if (source.ScanVirus != null) {
            this.ScanVirus = new Boolean(source.ScanVirus);
        }
        if (source.ScanRisk != null) {
            this.ScanRisk = new Boolean(source.ScanRisk);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "All", this.All);
        this.setParamArraySimple(map, prefix + "Images.", this.Images);
        this.setParamSimple(map, prefix + "ScanVul", this.ScanVul);
        this.setParamSimple(map, prefix + "ScanVirus", this.ScanVirus);
        this.setParamSimple(map, prefix + "ScanRisk", this.ScanRisk);

    }
}

