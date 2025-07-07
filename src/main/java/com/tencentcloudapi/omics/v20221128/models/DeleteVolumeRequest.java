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
package com.tencentcloudapi.omics.v20221128.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteVolumeRequest extends AbstractModel {

    /**
    * 缓存卷ID。
    */
    @SerializedName("VolumeId")
    @Expose
    private String VolumeId;

    /**
     * Get 缓存卷ID。 
     * @return VolumeId 缓存卷ID。
     */
    public String getVolumeId() {
        return this.VolumeId;
    }

    /**
     * Set 缓存卷ID。
     * @param VolumeId 缓存卷ID。
     */
    public void setVolumeId(String VolumeId) {
        this.VolumeId = VolumeId;
    }

    public DeleteVolumeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteVolumeRequest(DeleteVolumeRequest source) {
        if (source.VolumeId != null) {
            this.VolumeId = new String(source.VolumeId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VolumeId", this.VolumeId);

    }
}

