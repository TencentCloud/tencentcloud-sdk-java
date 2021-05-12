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

public class ImageLimitConfig extends AbstractModel{

    /**
    * 支持的最大镜像大小，包括可导入的自定义镜像大小，中心云镜像大小，单位为GB。
    */
    @SerializedName("MaxImageSize")
    @Expose
    private Long MaxImageSize;

    /**
     * Get 支持的最大镜像大小，包括可导入的自定义镜像大小，中心云镜像大小，单位为GB。 
     * @return MaxImageSize 支持的最大镜像大小，包括可导入的自定义镜像大小，中心云镜像大小，单位为GB。
     */
    public Long getMaxImageSize() {
        return this.MaxImageSize;
    }

    /**
     * Set 支持的最大镜像大小，包括可导入的自定义镜像大小，中心云镜像大小，单位为GB。
     * @param MaxImageSize 支持的最大镜像大小，包括可导入的自定义镜像大小，中心云镜像大小，单位为GB。
     */
    public void setMaxImageSize(Long MaxImageSize) {
        this.MaxImageSize = MaxImageSize;
    }

    public ImageLimitConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageLimitConfig(ImageLimitConfig source) {
        if (source.MaxImageSize != null) {
            this.MaxImageSize = new Long(source.MaxImageSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MaxImageSize", this.MaxImageSize);

    }
}

