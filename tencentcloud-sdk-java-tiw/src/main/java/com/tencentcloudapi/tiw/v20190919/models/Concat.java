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
package com.tencentcloudapi.tiw.v20190919.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Concat extends AbstractModel{

    /**
    * 是否开启拼接功能
在开启了视频拼接功能的情况下，实时录制服务会把同一个用户因为暂停导致的多段视频拼接成一个视频
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
    * 视频拼接时使用的垫片图片下载地址，不填默认用全黑的图片进行视频垫片
    */
    @SerializedName("Image")
    @Expose
    private String Image;

    /**
     * Get 是否开启拼接功能
在开启了视频拼接功能的情况下，实时录制服务会把同一个用户因为暂停导致的多段视频拼接成一个视频 
     * @return Enabled 是否开启拼接功能
在开启了视频拼接功能的情况下，实时录制服务会把同一个用户因为暂停导致的多段视频拼接成一个视频
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set 是否开启拼接功能
在开启了视频拼接功能的情况下，实时录制服务会把同一个用户因为暂停导致的多段视频拼接成一个视频
     * @param Enabled 是否开启拼接功能
在开启了视频拼接功能的情况下，实时录制服务会把同一个用户因为暂停导致的多段视频拼接成一个视频
     */
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get 视频拼接时使用的垫片图片下载地址，不填默认用全黑的图片进行视频垫片 
     * @return Image 视频拼接时使用的垫片图片下载地址，不填默认用全黑的图片进行视频垫片
     */
    public String getImage() {
        return this.Image;
    }

    /**
     * Set 视频拼接时使用的垫片图片下载地址，不填默认用全黑的图片进行视频垫片
     * @param Image 视频拼接时使用的垫片图片下载地址，不填默认用全黑的图片进行视频垫片
     */
    public void setImage(String Image) {
        this.Image = Image;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamSimple(map, prefix + "Image", this.Image);

    }
}

