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
package com.tencentcloudapi.gpm.v20200820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RegionLatency extends AbstractModel{

    /**
    * 地域
ap-beijing          华北地区(北京)
ap-chengdu          西南地区(成都)
ap-guangzhou          华南地区(广州)
ap-hongkong          港澳台地区(中国香港)
ap-seoul          亚太地区(首尔)
ap-shanghai          华东地区(上海)
ap-singapore          东南亚地区(新加坡)
eu-frankfurt          欧洲地区(法兰克福)
na-siliconvalley          美国西部(硅谷)
na-toronto          北美地区(多伦多)
ap-mumbai          亚太地区(孟买)
na-ashburn          美国东部(弗吉尼亚)
ap-bangkok          亚太地区(曼谷)
eu-moscow          欧洲地区(莫斯科)
ap-tokyo          亚太地区(东京)
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 毫秒延迟 0～999999
    */
    @SerializedName("Latency")
    @Expose
    private Long Latency;

    /**
     * Get 地域
ap-beijing          华北地区(北京)
ap-chengdu          西南地区(成都)
ap-guangzhou          华南地区(广州)
ap-hongkong          港澳台地区(中国香港)
ap-seoul          亚太地区(首尔)
ap-shanghai          华东地区(上海)
ap-singapore          东南亚地区(新加坡)
eu-frankfurt          欧洲地区(法兰克福)
na-siliconvalley          美国西部(硅谷)
na-toronto          北美地区(多伦多)
ap-mumbai          亚太地区(孟买)
na-ashburn          美国东部(弗吉尼亚)
ap-bangkok          亚太地区(曼谷)
eu-moscow          欧洲地区(莫斯科)
ap-tokyo          亚太地区(东京) 
     * @return Region 地域
ap-beijing          华北地区(北京)
ap-chengdu          西南地区(成都)
ap-guangzhou          华南地区(广州)
ap-hongkong          港澳台地区(中国香港)
ap-seoul          亚太地区(首尔)
ap-shanghai          华东地区(上海)
ap-singapore          东南亚地区(新加坡)
eu-frankfurt          欧洲地区(法兰克福)
na-siliconvalley          美国西部(硅谷)
na-toronto          北美地区(多伦多)
ap-mumbai          亚太地区(孟买)
na-ashburn          美国东部(弗吉尼亚)
ap-bangkok          亚太地区(曼谷)
eu-moscow          欧洲地区(莫斯科)
ap-tokyo          亚太地区(东京)
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 地域
ap-beijing          华北地区(北京)
ap-chengdu          西南地区(成都)
ap-guangzhou          华南地区(广州)
ap-hongkong          港澳台地区(中国香港)
ap-seoul          亚太地区(首尔)
ap-shanghai          华东地区(上海)
ap-singapore          东南亚地区(新加坡)
eu-frankfurt          欧洲地区(法兰克福)
na-siliconvalley          美国西部(硅谷)
na-toronto          北美地区(多伦多)
ap-mumbai          亚太地区(孟买)
na-ashburn          美国东部(弗吉尼亚)
ap-bangkok          亚太地区(曼谷)
eu-moscow          欧洲地区(莫斯科)
ap-tokyo          亚太地区(东京)
     * @param Region 地域
ap-beijing          华北地区(北京)
ap-chengdu          西南地区(成都)
ap-guangzhou          华南地区(广州)
ap-hongkong          港澳台地区(中国香港)
ap-seoul          亚太地区(首尔)
ap-shanghai          华东地区(上海)
ap-singapore          东南亚地区(新加坡)
eu-frankfurt          欧洲地区(法兰克福)
na-siliconvalley          美国西部(硅谷)
na-toronto          北美地区(多伦多)
ap-mumbai          亚太地区(孟买)
na-ashburn          美国东部(弗吉尼亚)
ap-bangkok          亚太地区(曼谷)
eu-moscow          欧洲地区(莫斯科)
ap-tokyo          亚太地区(东京)
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 毫秒延迟 0～999999 
     * @return Latency 毫秒延迟 0～999999
     */
    public Long getLatency() {
        return this.Latency;
    }

    /**
     * Set 毫秒延迟 0～999999
     * @param Latency 毫秒延迟 0～999999
     */
    public void setLatency(Long Latency) {
        this.Latency = Latency;
    }

    public RegionLatency() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RegionLatency(RegionLatency source) {
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Latency != null) {
            this.Latency = new Long(source.Latency);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Latency", this.Latency);

    }
}

