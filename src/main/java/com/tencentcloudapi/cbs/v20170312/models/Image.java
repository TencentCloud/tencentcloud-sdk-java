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
package com.tencentcloudapi.cbs.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Image extends AbstractModel {

    /**
    * 镜像名称。
    */
    @SerializedName("ImageName")
    @Expose
    private String ImageName;

    /**
    * 镜像实例ID。
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

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
     * Get 镜像实例ID。 
     * @return ImageId 镜像实例ID。
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Set 镜像实例ID。
     * @param ImageId 镜像实例ID。
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    public Image() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Image(Image source) {
        if (source.ImageName != null) {
            this.ImageName = new String(source.ImageName);
        }
        if (source.ImageId != null) {
            this.ImageId = new String(source.ImageId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageName", this.ImageName);
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);

    }
}

