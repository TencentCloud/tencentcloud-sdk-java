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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DdosPacketFilter extends AbstractModel{

    /**
    * 特征过滤清空标识，off清空处理
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * 特征过滤数组
    */
    @SerializedName("PacketFilter")
    @Expose
    private DDoSFeaturesFilter [] PacketFilter;

    /**
     * Get 特征过滤清空标识，off清空处理 
     * @return Switch 特征过滤清空标识，off清空处理
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set 特征过滤清空标识，off清空处理
     * @param Switch 特征过滤清空标识，off清空处理
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get 特征过滤数组 
     * @return PacketFilter 特征过滤数组
     */
    public DDoSFeaturesFilter [] getPacketFilter() {
        return this.PacketFilter;
    }

    /**
     * Set 特征过滤数组
     * @param PacketFilter 特征过滤数组
     */
    public void setPacketFilter(DDoSFeaturesFilter [] PacketFilter) {
        this.PacketFilter = PacketFilter;
    }

    public DdosPacketFilter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DdosPacketFilter(DdosPacketFilter source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.PacketFilter != null) {
            this.PacketFilter = new DDoSFeaturesFilter[source.PacketFilter.length];
            for (int i = 0; i < source.PacketFilter.length; i++) {
                this.PacketFilter[i] = new DDoSFeaturesFilter(source.PacketFilter[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamArrayObj(map, prefix + "PacketFilter.", this.PacketFilter);

    }
}

