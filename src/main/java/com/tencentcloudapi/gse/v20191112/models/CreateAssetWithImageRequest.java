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
package com.tencentcloudapi.gse.v20191112.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateAssetWithImageRequest extends AbstractModel{

    /**
    * 生成包名字，最小长度为1，最大长度为64
    */
    @SerializedName("AssetName")
    @Expose
    private String AssetName;

    /**
    * 生成包版本，最小长度为1，最大长度为64
    */
    @SerializedName("AssetVersion")
    @Expose
    private String AssetVersion;

    /**
    * 生成包所在地域，详见产品支持的 [地域列表](https://cloud.tencent.com/document/api/1165/42053#.E5.9C.B0.E5.9F.9F.E5.88.97.E8.A1.A8)
    */
    @SerializedName("AssetRegion")
    @Expose
    private String AssetRegion;

    /**
    * 生成包支持的操作系统镜像id
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * 操作系统镜像包大小，比如：40GB，支持单位 KB、MB、GB
    */
    @SerializedName("ImageSize")
    @Expose
    private String ImageSize;

    /**
    * 操作系统镜像包名称，最小长度为1，最大长度为64
    */
    @SerializedName("ImageOs")
    @Expose
    private String ImageOs;

    /**
    * 操作系统镜像包类型，CentOS 或者 Windows
    */
    @SerializedName("OsType")
    @Expose
    private String OsType;

    /**
    * 操作系统镜像包类型，当前只支持 SHARED_IMAGE
    */
    @SerializedName("ImageType")
    @Expose
    private String ImageType;

    /**
    * 操作系统镜像包位数，32 或者 64
    */
    @SerializedName("OsBit")
    @Expose
    private Long OsBit;

    /**
     * Get 生成包名字，最小长度为1，最大长度为64 
     * @return AssetName 生成包名字，最小长度为1，最大长度为64
     */
    public String getAssetName() {
        return this.AssetName;
    }

    /**
     * Set 生成包名字，最小长度为1，最大长度为64
     * @param AssetName 生成包名字，最小长度为1，最大长度为64
     */
    public void setAssetName(String AssetName) {
        this.AssetName = AssetName;
    }

    /**
     * Get 生成包版本，最小长度为1，最大长度为64 
     * @return AssetVersion 生成包版本，最小长度为1，最大长度为64
     */
    public String getAssetVersion() {
        return this.AssetVersion;
    }

    /**
     * Set 生成包版本，最小长度为1，最大长度为64
     * @param AssetVersion 生成包版本，最小长度为1，最大长度为64
     */
    public void setAssetVersion(String AssetVersion) {
        this.AssetVersion = AssetVersion;
    }

    /**
     * Get 生成包所在地域，详见产品支持的 [地域列表](https://cloud.tencent.com/document/api/1165/42053#.E5.9C.B0.E5.9F.9F.E5.88.97.E8.A1.A8) 
     * @return AssetRegion 生成包所在地域，详见产品支持的 [地域列表](https://cloud.tencent.com/document/api/1165/42053#.E5.9C.B0.E5.9F.9F.E5.88.97.E8.A1.A8)
     */
    public String getAssetRegion() {
        return this.AssetRegion;
    }

    /**
     * Set 生成包所在地域，详见产品支持的 [地域列表](https://cloud.tencent.com/document/api/1165/42053#.E5.9C.B0.E5.9F.9F.E5.88.97.E8.A1.A8)
     * @param AssetRegion 生成包所在地域，详见产品支持的 [地域列表](https://cloud.tencent.com/document/api/1165/42053#.E5.9C.B0.E5.9F.9F.E5.88.97.E8.A1.A8)
     */
    public void setAssetRegion(String AssetRegion) {
        this.AssetRegion = AssetRegion;
    }

    /**
     * Get 生成包支持的操作系统镜像id 
     * @return ImageId 生成包支持的操作系统镜像id
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Set 生成包支持的操作系统镜像id
     * @param ImageId 生成包支持的操作系统镜像id
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * Get 操作系统镜像包大小，比如：40GB，支持单位 KB、MB、GB 
     * @return ImageSize 操作系统镜像包大小，比如：40GB，支持单位 KB、MB、GB
     */
    public String getImageSize() {
        return this.ImageSize;
    }

    /**
     * Set 操作系统镜像包大小，比如：40GB，支持单位 KB、MB、GB
     * @param ImageSize 操作系统镜像包大小，比如：40GB，支持单位 KB、MB、GB
     */
    public void setImageSize(String ImageSize) {
        this.ImageSize = ImageSize;
    }

    /**
     * Get 操作系统镜像包名称，最小长度为1，最大长度为64 
     * @return ImageOs 操作系统镜像包名称，最小长度为1，最大长度为64
     */
    public String getImageOs() {
        return this.ImageOs;
    }

    /**
     * Set 操作系统镜像包名称，最小长度为1，最大长度为64
     * @param ImageOs 操作系统镜像包名称，最小长度为1，最大长度为64
     */
    public void setImageOs(String ImageOs) {
        this.ImageOs = ImageOs;
    }

    /**
     * Get 操作系统镜像包类型，CentOS 或者 Windows 
     * @return OsType 操作系统镜像包类型，CentOS 或者 Windows
     */
    public String getOsType() {
        return this.OsType;
    }

    /**
     * Set 操作系统镜像包类型，CentOS 或者 Windows
     * @param OsType 操作系统镜像包类型，CentOS 或者 Windows
     */
    public void setOsType(String OsType) {
        this.OsType = OsType;
    }

    /**
     * Get 操作系统镜像包类型，当前只支持 SHARED_IMAGE 
     * @return ImageType 操作系统镜像包类型，当前只支持 SHARED_IMAGE
     */
    public String getImageType() {
        return this.ImageType;
    }

    /**
     * Set 操作系统镜像包类型，当前只支持 SHARED_IMAGE
     * @param ImageType 操作系统镜像包类型，当前只支持 SHARED_IMAGE
     */
    public void setImageType(String ImageType) {
        this.ImageType = ImageType;
    }

    /**
     * Get 操作系统镜像包位数，32 或者 64 
     * @return OsBit 操作系统镜像包位数，32 或者 64
     */
    public Long getOsBit() {
        return this.OsBit;
    }

    /**
     * Set 操作系统镜像包位数，32 或者 64
     * @param OsBit 操作系统镜像包位数，32 或者 64
     */
    public void setOsBit(Long OsBit) {
        this.OsBit = OsBit;
    }

    public CreateAssetWithImageRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAssetWithImageRequest(CreateAssetWithImageRequest source) {
        if (source.AssetName != null) {
            this.AssetName = new String(source.AssetName);
        }
        if (source.AssetVersion != null) {
            this.AssetVersion = new String(source.AssetVersion);
        }
        if (source.AssetRegion != null) {
            this.AssetRegion = new String(source.AssetRegion);
        }
        if (source.ImageId != null) {
            this.ImageId = new String(source.ImageId);
        }
        if (source.ImageSize != null) {
            this.ImageSize = new String(source.ImageSize);
        }
        if (source.ImageOs != null) {
            this.ImageOs = new String(source.ImageOs);
        }
        if (source.OsType != null) {
            this.OsType = new String(source.OsType);
        }
        if (source.ImageType != null) {
            this.ImageType = new String(source.ImageType);
        }
        if (source.OsBit != null) {
            this.OsBit = new Long(source.OsBit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AssetName", this.AssetName);
        this.setParamSimple(map, prefix + "AssetVersion", this.AssetVersion);
        this.setParamSimple(map, prefix + "AssetRegion", this.AssetRegion);
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);
        this.setParamSimple(map, prefix + "ImageSize", this.ImageSize);
        this.setParamSimple(map, prefix + "ImageOs", this.ImageOs);
        this.setParamSimple(map, prefix + "OsType", this.OsType);
        this.setParamSimple(map, prefix + "ImageType", this.ImageType);
        this.setParamSimple(map, prefix + "OsBit", this.OsBit);

    }
}

