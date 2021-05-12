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

public class AssetSupportSys extends AbstractModel{

    /**
    * 生成包操作系统的镜像Id
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * 生成包操作系统的类型
    */
    @SerializedName("OsType")
    @Expose
    private String OsType;

    /**
    * 生成包操作系统的位数
    */
    @SerializedName("OsBit")
    @Expose
    private Long OsBit;

    /**
    * 生成包操作系统的版本
    */
    @SerializedName("OsVersion")
    @Expose
    private String OsVersion;

    /**
     * Get 生成包操作系统的镜像Id 
     * @return ImageId 生成包操作系统的镜像Id
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Set 生成包操作系统的镜像Id
     * @param ImageId 生成包操作系统的镜像Id
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * Get 生成包操作系统的类型 
     * @return OsType 生成包操作系统的类型
     */
    public String getOsType() {
        return this.OsType;
    }

    /**
     * Set 生成包操作系统的类型
     * @param OsType 生成包操作系统的类型
     */
    public void setOsType(String OsType) {
        this.OsType = OsType;
    }

    /**
     * Get 生成包操作系统的位数 
     * @return OsBit 生成包操作系统的位数
     */
    public Long getOsBit() {
        return this.OsBit;
    }

    /**
     * Set 生成包操作系统的位数
     * @param OsBit 生成包操作系统的位数
     */
    public void setOsBit(Long OsBit) {
        this.OsBit = OsBit;
    }

    /**
     * Get 生成包操作系统的版本 
     * @return OsVersion 生成包操作系统的版本
     */
    public String getOsVersion() {
        return this.OsVersion;
    }

    /**
     * Set 生成包操作系统的版本
     * @param OsVersion 生成包操作系统的版本
     */
    public void setOsVersion(String OsVersion) {
        this.OsVersion = OsVersion;
    }

    public AssetSupportSys() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssetSupportSys(AssetSupportSys source) {
        if (source.ImageId != null) {
            this.ImageId = new String(source.ImageId);
        }
        if (source.OsType != null) {
            this.OsType = new String(source.OsType);
        }
        if (source.OsBit != null) {
            this.OsBit = new Long(source.OsBit);
        }
        if (source.OsVersion != null) {
            this.OsVersion = new String(source.OsVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);
        this.setParamSimple(map, prefix + "OsType", this.OsType);
        this.setParamSimple(map, prefix + "OsBit", this.OsBit);
        this.setParamSimple(map, prefix + "OsVersion", this.OsVersion);

    }
}

