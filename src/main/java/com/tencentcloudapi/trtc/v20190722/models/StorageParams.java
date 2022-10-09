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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StorageParams extends AbstractModel{

    /**
    * 第三方云存储的账号信息（CloudStorage参数暂不可用，请使用CloudVod参数存储至云点播）。
    */
    @SerializedName("CloudStorage")
    @Expose
    private CloudStorage CloudStorage;

    /**
    * 【必填】腾讯云云点播的账号信息，目前仅支持存储至腾讯云点播VOD。
    */
    @SerializedName("CloudVod")
    @Expose
    private CloudVod CloudVod;

    /**
     * Get 第三方云存储的账号信息（CloudStorage参数暂不可用，请使用CloudVod参数存储至云点播）。 
     * @return CloudStorage 第三方云存储的账号信息（CloudStorage参数暂不可用，请使用CloudVod参数存储至云点播）。
     */
    public CloudStorage getCloudStorage() {
        return this.CloudStorage;
    }

    /**
     * Set 第三方云存储的账号信息（CloudStorage参数暂不可用，请使用CloudVod参数存储至云点播）。
     * @param CloudStorage 第三方云存储的账号信息（CloudStorage参数暂不可用，请使用CloudVod参数存储至云点播）。
     */
    public void setCloudStorage(CloudStorage CloudStorage) {
        this.CloudStorage = CloudStorage;
    }

    /**
     * Get 【必填】腾讯云云点播的账号信息，目前仅支持存储至腾讯云点播VOD。 
     * @return CloudVod 【必填】腾讯云云点播的账号信息，目前仅支持存储至腾讯云点播VOD。
     */
    public CloudVod getCloudVod() {
        return this.CloudVod;
    }

    /**
     * Set 【必填】腾讯云云点播的账号信息，目前仅支持存储至腾讯云点播VOD。
     * @param CloudVod 【必填】腾讯云云点播的账号信息，目前仅支持存储至腾讯云点播VOD。
     */
    public void setCloudVod(CloudVod CloudVod) {
        this.CloudVod = CloudVod;
    }

    public StorageParams() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StorageParams(StorageParams source) {
        if (source.CloudStorage != null) {
            this.CloudStorage = new CloudStorage(source.CloudStorage);
        }
        if (source.CloudVod != null) {
            this.CloudVod = new CloudVod(source.CloudVod);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "CloudStorage.", this.CloudStorage);
        this.setParamObj(map, prefix + "CloudVod.", this.CloudVod);

    }
}

