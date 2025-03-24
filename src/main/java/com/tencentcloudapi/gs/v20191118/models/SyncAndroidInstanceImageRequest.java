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
package com.tencentcloudapi.gs.v20191118.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SyncAndroidInstanceImageRequest extends AbstractModel {

    /**
    * 安卓实例镜像 ID
    */
    @SerializedName("AndroidInstanceImageId")
    @Expose
    private String AndroidInstanceImageId;

    /**
    * 目的同步可用区列表
    */
    @SerializedName("DestinationZones")
    @Expose
    private String [] DestinationZones;

    /**
     * Get 安卓实例镜像 ID 
     * @return AndroidInstanceImageId 安卓实例镜像 ID
     */
    public String getAndroidInstanceImageId() {
        return this.AndroidInstanceImageId;
    }

    /**
     * Set 安卓实例镜像 ID
     * @param AndroidInstanceImageId 安卓实例镜像 ID
     */
    public void setAndroidInstanceImageId(String AndroidInstanceImageId) {
        this.AndroidInstanceImageId = AndroidInstanceImageId;
    }

    /**
     * Get 目的同步可用区列表 
     * @return DestinationZones 目的同步可用区列表
     */
    public String [] getDestinationZones() {
        return this.DestinationZones;
    }

    /**
     * Set 目的同步可用区列表
     * @param DestinationZones 目的同步可用区列表
     */
    public void setDestinationZones(String [] DestinationZones) {
        this.DestinationZones = DestinationZones;
    }

    public SyncAndroidInstanceImageRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SyncAndroidInstanceImageRequest(SyncAndroidInstanceImageRequest source) {
        if (source.AndroidInstanceImageId != null) {
            this.AndroidInstanceImageId = new String(source.AndroidInstanceImageId);
        }
        if (source.DestinationZones != null) {
            this.DestinationZones = new String[source.DestinationZones.length];
            for (int i = 0; i < source.DestinationZones.length; i++) {
                this.DestinationZones[i] = new String(source.DestinationZones[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AndroidInstanceImageId", this.AndroidInstanceImageId);
        this.setParamArraySimple(map, prefix + "DestinationZones.", this.DestinationZones);

    }
}

