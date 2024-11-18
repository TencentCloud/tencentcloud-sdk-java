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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImageSimpleInfo extends AbstractModel {

    /**
    * 镜像id
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
    * 镜像大小
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
    * 类型
    */
    @SerializedName("ImageType")
    @Expose
    private String ImageType;

    /**
    * 关联容器数
    */
    @SerializedName("ContainerCnt")
    @Expose
    private Long ContainerCnt;

    /**
    * 关联主机数
    */
    @SerializedName("HostCnt")
    @Expose
    private Long HostCnt;

    /**
     * Get 镜像id 
     * @return ImageID 镜像id
     */
    public String getImageID() {
        return this.ImageID;
    }

    /**
     * Set 镜像id
     * @param ImageID 镜像id
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

    /**
     * Get 类型 
     * @return ImageType 类型
     */
    public String getImageType() {
        return this.ImageType;
    }

    /**
     * Set 类型
     * @param ImageType 类型
     */
    public void setImageType(String ImageType) {
        this.ImageType = ImageType;
    }

    /**
     * Get 关联容器数 
     * @return ContainerCnt 关联容器数
     */
    public Long getContainerCnt() {
        return this.ContainerCnt;
    }

    /**
     * Set 关联容器数
     * @param ContainerCnt 关联容器数
     */
    public void setContainerCnt(Long ContainerCnt) {
        this.ContainerCnt = ContainerCnt;
    }

    /**
     * Get 关联主机数 
     * @return HostCnt 关联主机数
     */
    public Long getHostCnt() {
        return this.HostCnt;
    }

    /**
     * Set 关联主机数
     * @param HostCnt 关联主机数
     */
    public void setHostCnt(Long HostCnt) {
        this.HostCnt = HostCnt;
    }

    public ImageSimpleInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageSimpleInfo(ImageSimpleInfo source) {
        if (source.ImageID != null) {
            this.ImageID = new String(source.ImageID);
        }
        if (source.ImageName != null) {
            this.ImageName = new String(source.ImageName);
        }
        if (source.Size != null) {
            this.Size = new Long(source.Size);
        }
        if (source.ImageType != null) {
            this.ImageType = new String(source.ImageType);
        }
        if (source.ContainerCnt != null) {
            this.ContainerCnt = new Long(source.ContainerCnt);
        }
        if (source.HostCnt != null) {
            this.HostCnt = new Long(source.HostCnt);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageID", this.ImageID);
        this.setParamSimple(map, prefix + "ImageName", this.ImageName);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "ImageType", this.ImageType);
        this.setParamSimple(map, prefix + "ContainerCnt", this.ContainerCnt);
        this.setParamSimple(map, prefix + "HostCnt", this.HostCnt);

    }
}

