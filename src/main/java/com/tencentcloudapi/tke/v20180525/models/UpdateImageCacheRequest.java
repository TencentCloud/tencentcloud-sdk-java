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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateImageCacheRequest extends AbstractModel{

    /**
    * 镜像缓存Id
    */
    @SerializedName("ImageCacheId")
    @Expose
    private String ImageCacheId;

    /**
    * 镜像缓存名称
    */
    @SerializedName("ImageCacheName")
    @Expose
    private String ImageCacheName;

    /**
     * Get 镜像缓存Id 
     * @return ImageCacheId 镜像缓存Id
     */
    public String getImageCacheId() {
        return this.ImageCacheId;
    }

    /**
     * Set 镜像缓存Id
     * @param ImageCacheId 镜像缓存Id
     */
    public void setImageCacheId(String ImageCacheId) {
        this.ImageCacheId = ImageCacheId;
    }

    /**
     * Get 镜像缓存名称 
     * @return ImageCacheName 镜像缓存名称
     */
    public String getImageCacheName() {
        return this.ImageCacheName;
    }

    /**
     * Set 镜像缓存名称
     * @param ImageCacheName 镜像缓存名称
     */
    public void setImageCacheName(String ImageCacheName) {
        this.ImageCacheName = ImageCacheName;
    }

    public UpdateImageCacheRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateImageCacheRequest(UpdateImageCacheRequest source) {
        if (source.ImageCacheId != null) {
            this.ImageCacheId = new String(source.ImageCacheId);
        }
        if (source.ImageCacheName != null) {
            this.ImageCacheName = new String(source.ImageCacheName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageCacheId", this.ImageCacheId);
        this.setParamSimple(map, prefix + "ImageCacheName", this.ImageCacheName);

    }
}

