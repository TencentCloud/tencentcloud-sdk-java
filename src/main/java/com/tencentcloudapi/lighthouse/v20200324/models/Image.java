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
package com.tencentcloudapi.lighthouse.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Image extends AbstractModel {

    /**
    * CVM镜像 ID ，是Image的唯一标识。
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * 镜像名称。
    */
    @SerializedName("ImageName")
    @Expose
    private String ImageName;

    /**
    * 镜像描述。
    */
    @SerializedName("ImageDescription")
    @Expose
    private String ImageDescription;

    /**
    * 镜像大小。单位GB。
    */
    @SerializedName("ImageSize")
    @Expose
    private Long ImageSize;

    /**
    * 镜像来源。
<li>CREATE_IMAGE：自定义镜像</li>
<li>EXTERNAL_IMPORT：外部导入镜像</li>
    */
    @SerializedName("ImageSource")
    @Expose
    private String ImageSource;

    /**
    * 镜像分类
<li>SystemImage：系统盘镜像</li>
<li>InstanceImage：整机镜像</li>
    */
    @SerializedName("ImageClass")
    @Expose
    private String ImageClass;

    /**
    * 镜像状态
CREATING:创建中
NORMAL:正常
CREATEFAILED:创建失败
USING:使用中
SYNCING:同步中
IMPORTING:导入中
IMPORTFAILED:导入失败
    */
    @SerializedName("ImageState")
    @Expose
    private String ImageState;

    /**
    * 镜像是否支持Cloudinit。
    */
    @SerializedName("IsSupportCloudinit")
    @Expose
    private Boolean IsSupportCloudinit;

    /**
    * 镜像架构。
    */
    @SerializedName("Architecture")
    @Expose
    private String Architecture;

    /**
    * 镜像操作系统。
    */
    @SerializedName("OsName")
    @Expose
    private String OsName;

    /**
    * 镜像来源平台。
    */
    @SerializedName("Platform")
    @Expose
    private String Platform;

    /**
    * 镜像创建时间。
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * 镜像是否可共享到轻量应用服务器。
    */
    @SerializedName("IsShareable")
    @Expose
    private Boolean IsShareable;

    /**
    * 不可共享的原因。
    */
    @SerializedName("UnshareableReason")
    @Expose
    private String UnshareableReason;

    /**
     * Get CVM镜像 ID ，是Image的唯一标识。 
     * @return ImageId CVM镜像 ID ，是Image的唯一标识。
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Set CVM镜像 ID ，是Image的唯一标识。
     * @param ImageId CVM镜像 ID ，是Image的唯一标识。
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * Get 镜像名称。 
     * @return ImageName 镜像名称。
     */
    public String getImageName() {
        return this.ImageName;
    }

    /**
     * Set 镜像名称。
     * @param ImageName 镜像名称。
     */
    public void setImageName(String ImageName) {
        this.ImageName = ImageName;
    }

    /**
     * Get 镜像描述。 
     * @return ImageDescription 镜像描述。
     */
    public String getImageDescription() {
        return this.ImageDescription;
    }

    /**
     * Set 镜像描述。
     * @param ImageDescription 镜像描述。
     */
    public void setImageDescription(String ImageDescription) {
        this.ImageDescription = ImageDescription;
    }

    /**
     * Get 镜像大小。单位GB。 
     * @return ImageSize 镜像大小。单位GB。
     */
    public Long getImageSize() {
        return this.ImageSize;
    }

    /**
     * Set 镜像大小。单位GB。
     * @param ImageSize 镜像大小。单位GB。
     */
    public void setImageSize(Long ImageSize) {
        this.ImageSize = ImageSize;
    }

    /**
     * Get 镜像来源。
<li>CREATE_IMAGE：自定义镜像</li>
<li>EXTERNAL_IMPORT：外部导入镜像</li> 
     * @return ImageSource 镜像来源。
<li>CREATE_IMAGE：自定义镜像</li>
<li>EXTERNAL_IMPORT：外部导入镜像</li>
     */
    public String getImageSource() {
        return this.ImageSource;
    }

    /**
     * Set 镜像来源。
<li>CREATE_IMAGE：自定义镜像</li>
<li>EXTERNAL_IMPORT：外部导入镜像</li>
     * @param ImageSource 镜像来源。
<li>CREATE_IMAGE：自定义镜像</li>
<li>EXTERNAL_IMPORT：外部导入镜像</li>
     */
    public void setImageSource(String ImageSource) {
        this.ImageSource = ImageSource;
    }

    /**
     * Get 镜像分类
<li>SystemImage：系统盘镜像</li>
<li>InstanceImage：整机镜像</li> 
     * @return ImageClass 镜像分类
<li>SystemImage：系统盘镜像</li>
<li>InstanceImage：整机镜像</li>
     */
    public String getImageClass() {
        return this.ImageClass;
    }

    /**
     * Set 镜像分类
<li>SystemImage：系统盘镜像</li>
<li>InstanceImage：整机镜像</li>
     * @param ImageClass 镜像分类
<li>SystemImage：系统盘镜像</li>
<li>InstanceImage：整机镜像</li>
     */
    public void setImageClass(String ImageClass) {
        this.ImageClass = ImageClass;
    }

    /**
     * Get 镜像状态
CREATING:创建中
NORMAL:正常
CREATEFAILED:创建失败
USING:使用中
SYNCING:同步中
IMPORTING:导入中
IMPORTFAILED:导入失败 
     * @return ImageState 镜像状态
CREATING:创建中
NORMAL:正常
CREATEFAILED:创建失败
USING:使用中
SYNCING:同步中
IMPORTING:导入中
IMPORTFAILED:导入失败
     */
    public String getImageState() {
        return this.ImageState;
    }

    /**
     * Set 镜像状态
CREATING:创建中
NORMAL:正常
CREATEFAILED:创建失败
USING:使用中
SYNCING:同步中
IMPORTING:导入中
IMPORTFAILED:导入失败
     * @param ImageState 镜像状态
CREATING:创建中
NORMAL:正常
CREATEFAILED:创建失败
USING:使用中
SYNCING:同步中
IMPORTING:导入中
IMPORTFAILED:导入失败
     */
    public void setImageState(String ImageState) {
        this.ImageState = ImageState;
    }

    /**
     * Get 镜像是否支持Cloudinit。 
     * @return IsSupportCloudinit 镜像是否支持Cloudinit。
     */
    public Boolean getIsSupportCloudinit() {
        return this.IsSupportCloudinit;
    }

    /**
     * Set 镜像是否支持Cloudinit。
     * @param IsSupportCloudinit 镜像是否支持Cloudinit。
     */
    public void setIsSupportCloudinit(Boolean IsSupportCloudinit) {
        this.IsSupportCloudinit = IsSupportCloudinit;
    }

    /**
     * Get 镜像架构。 
     * @return Architecture 镜像架构。
     */
    public String getArchitecture() {
        return this.Architecture;
    }

    /**
     * Set 镜像架构。
     * @param Architecture 镜像架构。
     */
    public void setArchitecture(String Architecture) {
        this.Architecture = Architecture;
    }

    /**
     * Get 镜像操作系统。 
     * @return OsName 镜像操作系统。
     */
    public String getOsName() {
        return this.OsName;
    }

    /**
     * Set 镜像操作系统。
     * @param OsName 镜像操作系统。
     */
    public void setOsName(String OsName) {
        this.OsName = OsName;
    }

    /**
     * Get 镜像来源平台。 
     * @return Platform 镜像来源平台。
     */
    public String getPlatform() {
        return this.Platform;
    }

    /**
     * Set 镜像来源平台。
     * @param Platform 镜像来源平台。
     */
    public void setPlatform(String Platform) {
        this.Platform = Platform;
    }

    /**
     * Get 镜像创建时间。 
     * @return CreatedTime 镜像创建时间。
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 镜像创建时间。
     * @param CreatedTime 镜像创建时间。
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get 镜像是否可共享到轻量应用服务器。 
     * @return IsShareable 镜像是否可共享到轻量应用服务器。
     */
    public Boolean getIsShareable() {
        return this.IsShareable;
    }

    /**
     * Set 镜像是否可共享到轻量应用服务器。
     * @param IsShareable 镜像是否可共享到轻量应用服务器。
     */
    public void setIsShareable(Boolean IsShareable) {
        this.IsShareable = IsShareable;
    }

    /**
     * Get 不可共享的原因。 
     * @return UnshareableReason 不可共享的原因。
     */
    public String getUnshareableReason() {
        return this.UnshareableReason;
    }

    /**
     * Set 不可共享的原因。
     * @param UnshareableReason 不可共享的原因。
     */
    public void setUnshareableReason(String UnshareableReason) {
        this.UnshareableReason = UnshareableReason;
    }

    public Image() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Image(Image source) {
        if (source.ImageId != null) {
            this.ImageId = new String(source.ImageId);
        }
        if (source.ImageName != null) {
            this.ImageName = new String(source.ImageName);
        }
        if (source.ImageDescription != null) {
            this.ImageDescription = new String(source.ImageDescription);
        }
        if (source.ImageSize != null) {
            this.ImageSize = new Long(source.ImageSize);
        }
        if (source.ImageSource != null) {
            this.ImageSource = new String(source.ImageSource);
        }
        if (source.ImageClass != null) {
            this.ImageClass = new String(source.ImageClass);
        }
        if (source.ImageState != null) {
            this.ImageState = new String(source.ImageState);
        }
        if (source.IsSupportCloudinit != null) {
            this.IsSupportCloudinit = new Boolean(source.IsSupportCloudinit);
        }
        if (source.Architecture != null) {
            this.Architecture = new String(source.Architecture);
        }
        if (source.OsName != null) {
            this.OsName = new String(source.OsName);
        }
        if (source.Platform != null) {
            this.Platform = new String(source.Platform);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.IsShareable != null) {
            this.IsShareable = new Boolean(source.IsShareable);
        }
        if (source.UnshareableReason != null) {
            this.UnshareableReason = new String(source.UnshareableReason);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);
        this.setParamSimple(map, prefix + "ImageName", this.ImageName);
        this.setParamSimple(map, prefix + "ImageDescription", this.ImageDescription);
        this.setParamSimple(map, prefix + "ImageSize", this.ImageSize);
        this.setParamSimple(map, prefix + "ImageSource", this.ImageSource);
        this.setParamSimple(map, prefix + "ImageClass", this.ImageClass);
        this.setParamSimple(map, prefix + "ImageState", this.ImageState);
        this.setParamSimple(map, prefix + "IsSupportCloudinit", this.IsSupportCloudinit);
        this.setParamSimple(map, prefix + "Architecture", this.Architecture);
        this.setParamSimple(map, prefix + "OsName", this.OsName);
        this.setParamSimple(map, prefix + "Platform", this.Platform);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "IsShareable", this.IsShareable);
        this.setParamSimple(map, prefix + "UnshareableReason", this.UnshareableReason);

    }
}

