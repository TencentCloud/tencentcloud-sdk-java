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

public class AssetSimpleImageInfo extends AbstractModel{

    /**
    * 镜像ID
    */
    @SerializedName("ImageID")
    @Expose
    private String ImageID;

    /**
    * 镜像名称
    */
    @SerializedName("ImageName")
    @Expose
    private String ImageName;

    /**
    * 关联容器个数
    */
    @SerializedName("ContainerCnt")
    @Expose
    private Long ContainerCnt;

    /**
    * 最后扫描时间
    */
    @SerializedName("ScanTime")
    @Expose
    private String ScanTime;

    /**
    * 镜像大小
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
     * Get 镜像ID 
     * @return ImageID 镜像ID
     */
    public String getImageID() {
        return this.ImageID;
    }

    /**
     * Set 镜像ID
     * @param ImageID 镜像ID
     */
    public void setImageID(String ImageID) {
        this.ImageID = ImageID;
    }

    /**
     * Get 镜像名称 
     * @return ImageName 镜像名称
     */
    public String getImageName() {
        return this.ImageName;
    }

    /**
     * Set 镜像名称
     * @param ImageName 镜像名称
     */
    public void setImageName(String ImageName) {
        this.ImageName = ImageName;
    }

    /**
     * Get 关联容器个数 
     * @return ContainerCnt 关联容器个数
     */
    public Long getContainerCnt() {
        return this.ContainerCnt;
    }

    /**
     * Set 关联容器个数
     * @param ContainerCnt 关联容器个数
     */
    public void setContainerCnt(Long ContainerCnt) {
        this.ContainerCnt = ContainerCnt;
    }

    /**
     * Get 最后扫描时间 
     * @return ScanTime 最后扫描时间
     */
    public String getScanTime() {
        return this.ScanTime;
    }

    /**
     * Set 最后扫描时间
     * @param ScanTime 最后扫描时间
     */
    public void setScanTime(String ScanTime) {
        this.ScanTime = ScanTime;
    }

    /**
     * Get 镜像大小 
     * @return Size 镜像大小
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set 镜像大小
     * @param Size 镜像大小
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    public AssetSimpleImageInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssetSimpleImageInfo(AssetSimpleImageInfo source) {
        if (source.ImageID != null) {
            this.ImageID = new String(source.ImageID);
        }
        if (source.ImageName != null) {
            this.ImageName = new String(source.ImageName);
        }
        if (source.ContainerCnt != null) {
            this.ContainerCnt = new Long(source.ContainerCnt);
        }
        if (source.ScanTime != null) {
            this.ScanTime = new String(source.ScanTime);
        }
        if (source.Size != null) {
            this.Size = new Long(source.Size);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageID", this.ImageID);
        this.setParamSimple(map, prefix + "ImageName", this.ImageName);
        this.setParamSimple(map, prefix + "ContainerCnt", this.ContainerCnt);
        this.setParamSimple(map, prefix + "ScanTime", this.ScanTime);
        this.setParamSimple(map, prefix + "Size", this.Size);

    }
}

