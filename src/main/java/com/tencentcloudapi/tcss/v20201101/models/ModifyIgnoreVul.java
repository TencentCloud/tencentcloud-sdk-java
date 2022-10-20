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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyIgnoreVul extends AbstractModel{

    /**
    * 漏洞PocID
    */
    @SerializedName("PocID")
    @Expose
    private String PocID;

    /**
    * 忽略的镜像ID，空表示全部
    */
    @SerializedName("ImageIDs")
    @Expose
    private String [] ImageIDs;

    /**
    * 当有镜像时
镜像类型: LOCAL 本地镜像 REGISTRY 仓库镜像
    */
    @SerializedName("ImageType")
    @Expose
    private String ImageType;

    /**
     * Get 漏洞PocID 
     * @return PocID 漏洞PocID
     */
    public String getPocID() {
        return this.PocID;
    }

    /**
     * Set 漏洞PocID
     * @param PocID 漏洞PocID
     */
    public void setPocID(String PocID) {
        this.PocID = PocID;
    }

    /**
     * Get 忽略的镜像ID，空表示全部 
     * @return ImageIDs 忽略的镜像ID，空表示全部
     */
    public String [] getImageIDs() {
        return this.ImageIDs;
    }

    /**
     * Set 忽略的镜像ID，空表示全部
     * @param ImageIDs 忽略的镜像ID，空表示全部
     */
    public void setImageIDs(String [] ImageIDs) {
        this.ImageIDs = ImageIDs;
    }

    /**
     * Get 当有镜像时
镜像类型: LOCAL 本地镜像 REGISTRY 仓库镜像 
     * @return ImageType 当有镜像时
镜像类型: LOCAL 本地镜像 REGISTRY 仓库镜像
     */
    public String getImageType() {
        return this.ImageType;
    }

    /**
     * Set 当有镜像时
镜像类型: LOCAL 本地镜像 REGISTRY 仓库镜像
     * @param ImageType 当有镜像时
镜像类型: LOCAL 本地镜像 REGISTRY 仓库镜像
     */
    public void setImageType(String ImageType) {
        this.ImageType = ImageType;
    }

    public ModifyIgnoreVul() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyIgnoreVul(ModifyIgnoreVul source) {
        if (source.PocID != null) {
            this.PocID = new String(source.PocID);
        }
        if (source.ImageIDs != null) {
            this.ImageIDs = new String[source.ImageIDs.length];
            for (int i = 0; i < source.ImageIDs.length; i++) {
                this.ImageIDs[i] = new String(source.ImageIDs[i]);
            }
        }
        if (source.ImageType != null) {
            this.ImageType = new String(source.ImageType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PocID", this.PocID);
        this.setParamArraySimple(map, prefix + "ImageIDs.", this.ImageIDs);
        this.setParamSimple(map, prefix + "ImageType", this.ImageType);

    }
}

