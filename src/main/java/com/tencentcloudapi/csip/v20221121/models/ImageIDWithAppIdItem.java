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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImageIDWithAppIdItem extends AbstractModel {

    /**
    * <p>账号ID</p>
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * <p>容器镜像ID</p>
    */
    @SerializedName("ImageID")
    @Expose
    private String ImageID;

    /**
     * Get <p>账号ID</p> 
     * @return AppId <p>账号ID</p>
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>账号ID</p>
     * @param AppId <p>账号ID</p>
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>容器镜像ID</p> 
     * @return ImageID <p>容器镜像ID</p>
     */
    public String getImageID() {
        return this.ImageID;
    }

    /**
     * Set <p>容器镜像ID</p>
     * @param ImageID <p>容器镜像ID</p>
     */
    public void setImageID(String ImageID) {
        this.ImageID = ImageID;
    }

    public ImageIDWithAppIdItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageIDWithAppIdItem(ImageIDWithAppIdItem source) {
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.ImageID != null) {
            this.ImageID = new String(source.ImageID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "ImageID", this.ImageID);

    }
}

