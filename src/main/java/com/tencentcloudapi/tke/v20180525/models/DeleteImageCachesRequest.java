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

public class DeleteImageCachesRequest extends AbstractModel{

    /**
    * 镜像缓存Id数组
    */
    @SerializedName("ImageCacheIds")
    @Expose
    private String [] ImageCacheIds;

    /**
     * Get 镜像缓存Id数组 
     * @return ImageCacheIds 镜像缓存Id数组
     */
    public String [] getImageCacheIds() {
        return this.ImageCacheIds;
    }

    /**
     * Set 镜像缓存Id数组
     * @param ImageCacheIds 镜像缓存Id数组
     */
    public void setImageCacheIds(String [] ImageCacheIds) {
        this.ImageCacheIds = ImageCacheIds;
    }

    public DeleteImageCachesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteImageCachesRequest(DeleteImageCachesRequest source) {
        if (source.ImageCacheIds != null) {
            this.ImageCacheIds = new String[source.ImageCacheIds.length];
            for (int i = 0; i < source.ImageCacheIds.length; i++) {
                this.ImageCacheIds[i] = new String(source.ImageCacheIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ImageCacheIds.", this.ImageCacheIds);

    }
}

