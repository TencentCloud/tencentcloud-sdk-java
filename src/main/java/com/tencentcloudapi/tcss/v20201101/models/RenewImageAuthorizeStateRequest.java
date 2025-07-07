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

public class RenewImageAuthorizeStateRequest extends AbstractModel {

    /**
    * 是否全部未授权镜像
    */
    @SerializedName("AllImages")
    @Expose
    private Boolean AllImages;

    /**
    * 镜像ids
    */
    @SerializedName("ImageIds")
    @Expose
    private String [] ImageIds;

    /**
    * 是否授权后自动扫描
    */
    @SerializedName("NeedScan")
    @Expose
    private Boolean NeedScan;

    /**
    * 扫描类型
    */
    @SerializedName("ScanType")
    @Expose
    private String [] ScanType;

    /**
     * Get 是否全部未授权镜像 
     * @return AllImages 是否全部未授权镜像
     */
    public Boolean getAllImages() {
        return this.AllImages;
    }

    /**
     * Set 是否全部未授权镜像
     * @param AllImages 是否全部未授权镜像
     */
    public void setAllImages(Boolean AllImages) {
        this.AllImages = AllImages;
    }

    /**
     * Get 镜像ids 
     * @return ImageIds 镜像ids
     */
    public String [] getImageIds() {
        return this.ImageIds;
    }

    /**
     * Set 镜像ids
     * @param ImageIds 镜像ids
     */
    public void setImageIds(String [] ImageIds) {
        this.ImageIds = ImageIds;
    }

    /**
     * Get 是否授权后自动扫描 
     * @return NeedScan 是否授权后自动扫描
     */
    public Boolean getNeedScan() {
        return this.NeedScan;
    }

    /**
     * Set 是否授权后自动扫描
     * @param NeedScan 是否授权后自动扫描
     */
    public void setNeedScan(Boolean NeedScan) {
        this.NeedScan = NeedScan;
    }

    /**
     * Get 扫描类型 
     * @return ScanType 扫描类型
     */
    public String [] getScanType() {
        return this.ScanType;
    }

    /**
     * Set 扫描类型
     * @param ScanType 扫描类型
     */
    public void setScanType(String [] ScanType) {
        this.ScanType = ScanType;
    }

    public RenewImageAuthorizeStateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RenewImageAuthorizeStateRequest(RenewImageAuthorizeStateRequest source) {
        if (source.AllImages != null) {
            this.AllImages = new Boolean(source.AllImages);
        }
        if (source.ImageIds != null) {
            this.ImageIds = new String[source.ImageIds.length];
            for (int i = 0; i < source.ImageIds.length; i++) {
                this.ImageIds[i] = new String(source.ImageIds[i]);
            }
        }
        if (source.NeedScan != null) {
            this.NeedScan = new Boolean(source.NeedScan);
        }
        if (source.ScanType != null) {
            this.ScanType = new String[source.ScanType.length];
            for (int i = 0; i < source.ScanType.length; i++) {
                this.ScanType[i] = new String(source.ScanType[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AllImages", this.AllImages);
        this.setParamArraySimple(map, prefix + "ImageIds.", this.ImageIds);
        this.setParamSimple(map, prefix + "NeedScan", this.NeedScan);
        this.setParamArraySimple(map, prefix + "ScanType.", this.ScanType);

    }
}

