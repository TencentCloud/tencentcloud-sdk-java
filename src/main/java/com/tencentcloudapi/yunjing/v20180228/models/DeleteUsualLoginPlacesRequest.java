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
package com.tencentcloudapi.yunjing.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteUsualLoginPlacesRequest extends AbstractModel {

    /**
    * 云镜客户端Uuid
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * 已添加常用登录地城市ID数组
    */
    @SerializedName("CityIds")
    @Expose
    private Long [] CityIds;

    /**
     * Get 云镜客户端Uuid 
     * @return Uuid 云镜客户端Uuid
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set 云镜客户端Uuid
     * @param Uuid 云镜客户端Uuid
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get 已添加常用登录地城市ID数组 
     * @return CityIds 已添加常用登录地城市ID数组
     */
    public Long [] getCityIds() {
        return this.CityIds;
    }

    /**
     * Set 已添加常用登录地城市ID数组
     * @param CityIds 已添加常用登录地城市ID数组
     */
    public void setCityIds(Long [] CityIds) {
        this.CityIds = CityIds;
    }

    public DeleteUsualLoginPlacesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteUsualLoginPlacesRequest(DeleteUsualLoginPlacesRequest source) {
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
        if (source.CityIds != null) {
            this.CityIds = new Long[source.CityIds.length];
            for (int i = 0; i < source.CityIds.length; i++) {
                this.CityIds[i] = new Long(source.CityIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamArraySimple(map, prefix + "CityIds.", this.CityIds);

    }
}

