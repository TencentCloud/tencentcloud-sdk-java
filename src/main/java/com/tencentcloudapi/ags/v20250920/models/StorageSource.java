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
package com.tencentcloudapi.ags.v20250920.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StorageSource extends AbstractModel {

    /**
    * <p>对象存储桶配置</p>
    */
    @SerializedName("Cos")
    @Expose
    private CosStorageSource Cos;

    /**
    * <p>镜像卷配置</p>
    */
    @SerializedName("Image")
    @Expose
    private ImageStorageSource Image;

    /**
    * <p>文件存储配置</p>
    */
    @SerializedName("Cfs")
    @Expose
    private CfsStorageSource Cfs;

    /**
     * Get <p>对象存储桶配置</p> 
     * @return Cos <p>对象存储桶配置</p>
     */
    public CosStorageSource getCos() {
        return this.Cos;
    }

    /**
     * Set <p>对象存储桶配置</p>
     * @param Cos <p>对象存储桶配置</p>
     */
    public void setCos(CosStorageSource Cos) {
        this.Cos = Cos;
    }

    /**
     * Get <p>镜像卷配置</p> 
     * @return Image <p>镜像卷配置</p>
     */
    public ImageStorageSource getImage() {
        return this.Image;
    }

    /**
     * Set <p>镜像卷配置</p>
     * @param Image <p>镜像卷配置</p>
     */
    public void setImage(ImageStorageSource Image) {
        this.Image = Image;
    }

    /**
     * Get <p>文件存储配置</p> 
     * @return Cfs <p>文件存储配置</p>
     */
    public CfsStorageSource getCfs() {
        return this.Cfs;
    }

    /**
     * Set <p>文件存储配置</p>
     * @param Cfs <p>文件存储配置</p>
     */
    public void setCfs(CfsStorageSource Cfs) {
        this.Cfs = Cfs;
    }

    public StorageSource() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StorageSource(StorageSource source) {
        if (source.Cos != null) {
            this.Cos = new CosStorageSource(source.Cos);
        }
        if (source.Image != null) {
            this.Image = new ImageStorageSource(source.Image);
        }
        if (source.Cfs != null) {
            this.Cfs = new CfsStorageSource(source.Cfs);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Cos.", this.Cos);
        this.setParamObj(map, prefix + "Image.", this.Image);
        this.setParamObj(map, prefix + "Cfs.", this.Cfs);

    }
}

