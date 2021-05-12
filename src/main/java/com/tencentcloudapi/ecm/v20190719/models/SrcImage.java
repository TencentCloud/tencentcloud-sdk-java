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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SrcImage extends AbstractModel{

    /**
    * 镜像id
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * 镜像名称
    */
    @SerializedName("ImageName")
    @Expose
    private String ImageName;

    /**
    * 系统名称
    */
    @SerializedName("ImageOsName")
    @Expose
    private String ImageOsName;

    /**
    * 镜像描述
    */
    @SerializedName("ImageDescription")
    @Expose
    private String ImageDescription;

    /**
    * 区域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 区域ID
    */
    @SerializedName("RegionID")
    @Expose
    private Long RegionID;

    /**
    * 区域名称
    */
    @SerializedName("RegionName")
    @Expose
    private String RegionName;

    /**
    * 来源实例名称
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 来源实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 来源镜像类型
    */
    @SerializedName("ImageType")
    @Expose
    private String ImageType;

    /**
     * Get 镜像id 
     * @return ImageId 镜像id
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Set 镜像id
     * @param ImageId 镜像id
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
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
     * Get 系统名称 
     * @return ImageOsName 系统名称
     */
    public String getImageOsName() {
        return this.ImageOsName;
    }

    /**
     * Set 系统名称
     * @param ImageOsName 系统名称
     */
    public void setImageOsName(String ImageOsName) {
        this.ImageOsName = ImageOsName;
    }

    /**
     * Get 镜像描述 
     * @return ImageDescription 镜像描述
     */
    public String getImageDescription() {
        return this.ImageDescription;
    }

    /**
     * Set 镜像描述
     * @param ImageDescription 镜像描述
     */
    public void setImageDescription(String ImageDescription) {
        this.ImageDescription = ImageDescription;
    }

    /**
     * Get 区域 
     * @return Region 区域
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 区域
     * @param Region 区域
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 区域ID 
     * @return RegionID 区域ID
     */
    public Long getRegionID() {
        return this.RegionID;
    }

    /**
     * Set 区域ID
     * @param RegionID 区域ID
     */
    public void setRegionID(Long RegionID) {
        this.RegionID = RegionID;
    }

    /**
     * Get 区域名称 
     * @return RegionName 区域名称
     */
    public String getRegionName() {
        return this.RegionName;
    }

    /**
     * Set 区域名称
     * @param RegionName 区域名称
     */
    public void setRegionName(String RegionName) {
        this.RegionName = RegionName;
    }

    /**
     * Get 来源实例名称 
     * @return InstanceName 来源实例名称
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 来源实例名称
     * @param InstanceName 来源实例名称
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 来源实例ID 
     * @return InstanceId 来源实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 来源实例ID
     * @param InstanceId 来源实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 来源镜像类型 
     * @return ImageType 来源镜像类型
     */
    public String getImageType() {
        return this.ImageType;
    }

    /**
     * Set 来源镜像类型
     * @param ImageType 来源镜像类型
     */
    public void setImageType(String ImageType) {
        this.ImageType = ImageType;
    }

    public SrcImage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SrcImage(SrcImage source) {
        if (source.ImageId != null) {
            this.ImageId = new String(source.ImageId);
        }
        if (source.ImageName != null) {
            this.ImageName = new String(source.ImageName);
        }
        if (source.ImageOsName != null) {
            this.ImageOsName = new String(source.ImageOsName);
        }
        if (source.ImageDescription != null) {
            this.ImageDescription = new String(source.ImageDescription);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.RegionID != null) {
            this.RegionID = new Long(source.RegionID);
        }
        if (source.RegionName != null) {
            this.RegionName = new String(source.RegionName);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ImageType != null) {
            this.ImageType = new String(source.ImageType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);
        this.setParamSimple(map, prefix + "ImageName", this.ImageName);
        this.setParamSimple(map, prefix + "ImageOsName", this.ImageOsName);
        this.setParamSimple(map, prefix + "ImageDescription", this.ImageDescription);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "RegionID", this.RegionID);
        this.setParamSimple(map, prefix + "RegionName", this.RegionName);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ImageType", this.ImageType);

    }
}

