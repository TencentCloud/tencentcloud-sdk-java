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
package com.tencentcloudapi.antiddos.v20200309.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreatePacketFilterConfigRequest extends AbstractModel {

    /**
    * 资源实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 特征过滤规则
    */
    @SerializedName("PacketFilterConfig")
    @Expose
    private PacketFilterConfig PacketFilterConfig;

    /**
     * Get 资源实例ID 
     * @return InstanceId 资源实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 资源实例ID
     * @param InstanceId 资源实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 特征过滤规则 
     * @return PacketFilterConfig 特征过滤规则
     */
    public PacketFilterConfig getPacketFilterConfig() {
        return this.PacketFilterConfig;
    }

    /**
     * Set 特征过滤规则
     * @param PacketFilterConfig 特征过滤规则
     */
    public void setPacketFilterConfig(PacketFilterConfig PacketFilterConfig) {
        this.PacketFilterConfig = PacketFilterConfig;
    }

    public CreatePacketFilterConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreatePacketFilterConfigRequest(CreatePacketFilterConfigRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.PacketFilterConfig != null) {
            this.PacketFilterConfig = new PacketFilterConfig(source.PacketFilterConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamObj(map, prefix + "PacketFilterConfig.", this.PacketFilterConfig);

    }
}

