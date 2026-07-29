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
package com.tencentcloudapi.dbdc.v20201029.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ZoneInfo extends AbstractModel {

    /**
    * <p>支持的可用区</p>
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * <p>可用区状态</p><p>枚举值：</p><ul><li>SELL： 正常售卖</li><li>SOLD_OUT： 售罄</li></ul>
    */
    @SerializedName("ZoneState")
    @Expose
    private String ZoneState;

    /**
     * Get <p>支持的可用区</p> 
     * @return Zone <p>支持的可用区</p>
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set <p>支持的可用区</p>
     * @param Zone <p>支持的可用区</p>
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get <p>可用区状态</p><p>枚举值：</p><ul><li>SELL： 正常售卖</li><li>SOLD_OUT： 售罄</li></ul> 
     * @return ZoneState <p>可用区状态</p><p>枚举值：</p><ul><li>SELL： 正常售卖</li><li>SOLD_OUT： 售罄</li></ul>
     */
    public String getZoneState() {
        return this.ZoneState;
    }

    /**
     * Set <p>可用区状态</p><p>枚举值：</p><ul><li>SELL： 正常售卖</li><li>SOLD_OUT： 售罄</li></ul>
     * @param ZoneState <p>可用区状态</p><p>枚举值：</p><ul><li>SELL： 正常售卖</li><li>SOLD_OUT： 售罄</li></ul>
     */
    public void setZoneState(String ZoneState) {
        this.ZoneState = ZoneState;
    }

    public ZoneInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ZoneInfo(ZoneInfo source) {
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.ZoneState != null) {
            this.ZoneState = new String(source.ZoneState);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "ZoneState", this.ZoneState);

    }
}

