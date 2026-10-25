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
package com.tencentcloudapi.databuddy.v20260715.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateVolumeRsp extends AbstractModel {

    /**
    * 数据卷信息
    */
    @SerializedName("Volume")
    @Expose
    private Volume Volume;

    /**
     * Get 数据卷信息 
     * @return Volume 数据卷信息
     */
    public Volume getVolume() {
        return this.Volume;
    }

    /**
     * Set 数据卷信息
     * @param Volume 数据卷信息
     */
    public void setVolume(Volume Volume) {
        this.Volume = Volume;
    }

    public CreateVolumeRsp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateVolumeRsp(CreateVolumeRsp source) {
        if (source.Volume != null) {
            this.Volume = new Volume(source.Volume);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Volume.", this.Volume);

    }
}

