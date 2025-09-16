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
package com.tencentcloudapi.gs.v20191118.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DistributeAndroidInstanceImageToHostsRequest extends AbstractModel {

    /**
    * 宿主机序列号数组
    */
    @SerializedName("HostSerialNumbers")
    @Expose
    private String [] HostSerialNumbers;

    /**
    * 实例镜像 ID
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
     * Get 宿主机序列号数组 
     * @return HostSerialNumbers 宿主机序列号数组
     */
    public String [] getHostSerialNumbers() {
        return this.HostSerialNumbers;
    }

    /**
     * Set 宿主机序列号数组
     * @param HostSerialNumbers 宿主机序列号数组
     */
    public void setHostSerialNumbers(String [] HostSerialNumbers) {
        this.HostSerialNumbers = HostSerialNumbers;
    }

    /**
     * Get 实例镜像 ID 
     * @return ImageId 实例镜像 ID
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Set 实例镜像 ID
     * @param ImageId 实例镜像 ID
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    public DistributeAndroidInstanceImageToHostsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DistributeAndroidInstanceImageToHostsRequest(DistributeAndroidInstanceImageToHostsRequest source) {
        if (source.HostSerialNumbers != null) {
            this.HostSerialNumbers = new String[source.HostSerialNumbers.length];
            for (int i = 0; i < source.HostSerialNumbers.length; i++) {
                this.HostSerialNumbers[i] = new String(source.HostSerialNumbers[i]);
            }
        }
        if (source.ImageId != null) {
            this.ImageId = new String(source.ImageId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "HostSerialNumbers.", this.HostSerialNumbers);
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);

    }
}

