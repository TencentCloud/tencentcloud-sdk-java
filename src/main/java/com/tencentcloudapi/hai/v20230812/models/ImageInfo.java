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
package com.tencentcloudapi.hai.v20230812.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImageInfo extends AbstractModel {

    /**
    * tcr仓库地址
    */
    @SerializedName("ImageRegistryUrl")
    @Expose
    private String ImageRegistryUrl;

    /**
     * Get tcr仓库地址 
     * @return ImageRegistryUrl tcr仓库地址
     */
    public String getImageRegistryUrl() {
        return this.ImageRegistryUrl;
    }

    /**
     * Set tcr仓库地址
     * @param ImageRegistryUrl tcr仓库地址
     */
    public void setImageRegistryUrl(String ImageRegistryUrl) {
        this.ImageRegistryUrl = ImageRegistryUrl;
    }

    public ImageInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageInfo(ImageInfo source) {
        if (source.ImageRegistryUrl != null) {
            this.ImageRegistryUrl = new String(source.ImageRegistryUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageRegistryUrl", this.ImageRegistryUrl);

    }
}

