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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FwGroupSwitch extends AbstractModel {

    /**
    * 防火墙实例的开关模式 1: 单点互通 2: 多点互通 3: 全互通 4: 自定义路由
    */
    @SerializedName("SwitchMode")
    @Expose
    private Long SwitchMode;

    /**
    * 防火墙开关ID
支持三种类型
1. 边开关(单点互通)
2. 点开关(多点互通)
3. 全开关(全互通)
    */
    @SerializedName("SwitchId")
    @Expose
    private String SwitchId;

    /**
     * Get 防火墙实例的开关模式 1: 单点互通 2: 多点互通 3: 全互通 4: 自定义路由 
     * @return SwitchMode 防火墙实例的开关模式 1: 单点互通 2: 多点互通 3: 全互通 4: 自定义路由
     */
    public Long getSwitchMode() {
        return this.SwitchMode;
    }

    /**
     * Set 防火墙实例的开关模式 1: 单点互通 2: 多点互通 3: 全互通 4: 自定义路由
     * @param SwitchMode 防火墙实例的开关模式 1: 单点互通 2: 多点互通 3: 全互通 4: 自定义路由
     */
    public void setSwitchMode(Long SwitchMode) {
        this.SwitchMode = SwitchMode;
    }

    /**
     * Get 防火墙开关ID
支持三种类型
1. 边开关(单点互通)
2. 点开关(多点互通)
3. 全开关(全互通) 
     * @return SwitchId 防火墙开关ID
支持三种类型
1. 边开关(单点互通)
2. 点开关(多点互通)
3. 全开关(全互通)
     */
    public String getSwitchId() {
        return this.SwitchId;
    }

    /**
     * Set 防火墙开关ID
支持三种类型
1. 边开关(单点互通)
2. 点开关(多点互通)
3. 全开关(全互通)
     * @param SwitchId 防火墙开关ID
支持三种类型
1. 边开关(单点互通)
2. 点开关(多点互通)
3. 全开关(全互通)
     */
    public void setSwitchId(String SwitchId) {
        this.SwitchId = SwitchId;
    }

    public FwGroupSwitch() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FwGroupSwitch(FwGroupSwitch source) {
        if (source.SwitchMode != null) {
            this.SwitchMode = new Long(source.SwitchMode);
        }
        if (source.SwitchId != null) {
            this.SwitchId = new String(source.SwitchId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SwitchMode", this.SwitchMode);
        this.setParamSimple(map, prefix + "SwitchId", this.SwitchId);

    }
}

