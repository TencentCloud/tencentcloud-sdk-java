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
package com.tencentcloudapi.bm.v20180423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateCustomImageRequest extends AbstractModel {

    /**
    * 用于制作镜像的物理机ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 镜像别名
    */
    @SerializedName("ImageName")
    @Expose
    private String ImageName;

    /**
    * 镜像描述
    */
    @SerializedName("ImageDescription")
    @Expose
    private String ImageDescription;

    /**
     * Get 用于制作镜像的物理机ID 
     * @return InstanceId 用于制作镜像的物理机ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 用于制作镜像的物理机ID
     * @param InstanceId 用于制作镜像的物理机ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 镜像别名 
     * @return ImageName 镜像别名
     */
    public String getImageName() {
        return this.ImageName;
    }

    /**
     * Set 镜像别名
     * @param ImageName 镜像别名
     */
    public void setImageName(String ImageName) {
        this.ImageName = ImageName;
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

    public CreateCustomImageRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCustomImageRequest(CreateCustomImageRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ImageName != null) {
            this.ImageName = new String(source.ImageName);
        }
        if (source.ImageDescription != null) {
            this.ImageDescription = new String(source.ImageDescription);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ImageName", this.ImageName);
        this.setParamSimple(map, prefix + "ImageDescription", this.ImageDescription);

    }
}

