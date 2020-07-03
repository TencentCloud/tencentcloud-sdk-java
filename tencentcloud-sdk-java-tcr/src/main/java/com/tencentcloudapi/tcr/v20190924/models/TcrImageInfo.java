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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TcrImageInfo extends AbstractModel{

    /**
    * 哈希值
    */
    @SerializedName("Digest")
    @Expose
    private String Digest;

    /**
    * 镜像大小
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
    * Tag名称
    */
    @SerializedName("ImageVersion")
    @Expose
    private String ImageVersion;

    /**
    * 更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get 哈希值 
     * @return Digest 哈希值
     */
    public String getDigest() {
        return this.Digest;
    }

    /**
     * Set 哈希值
     * @param Digest 哈希值
     */
    public void setDigest(String Digest) {
        this.Digest = Digest;
    }

    /**
     * Get 镜像大小 
     * @return Size 镜像大小
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set 镜像大小
     * @param Size 镜像大小
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    /**
     * Get Tag名称 
     * @return ImageVersion Tag名称
     */
    public String getImageVersion() {
        return this.ImageVersion;
    }

    /**
     * Set Tag名称
     * @param ImageVersion Tag名称
     */
    public void setImageVersion(String ImageVersion) {
        this.ImageVersion = ImageVersion;
    }

    /**
     * Get 更新时间 
     * @return UpdateTime 更新时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间
     * @param UpdateTime 更新时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Digest", this.Digest);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "ImageVersion", this.ImageVersion);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

