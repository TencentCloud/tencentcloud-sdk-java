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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HostAutoScaleConfig extends AbstractModel {

    /**
    * 主机自动扩容开关
枚举值：
ON：开启
OFF：关闭
补充说明：不传则不修改；映射底层自动加购开关 auto_repurchase_switch
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * 扩容版本
枚举值：
PRO：专业版
ULTIMATE：旗舰版
补充说明：不传则不修改
    */
    @SerializedName("ProtectType")
    @Expose
    private String ProtectType;

    /**
     * Get 主机自动扩容开关
枚举值：
ON：开启
OFF：关闭
补充说明：不传则不修改；映射底层自动加购开关 auto_repurchase_switch 
     * @return Switch 主机自动扩容开关
枚举值：
ON：开启
OFF：关闭
补充说明：不传则不修改；映射底层自动加购开关 auto_repurchase_switch
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set 主机自动扩容开关
枚举值：
ON：开启
OFF：关闭
补充说明：不传则不修改；映射底层自动加购开关 auto_repurchase_switch
     * @param Switch 主机自动扩容开关
枚举值：
ON：开启
OFF：关闭
补充说明：不传则不修改；映射底层自动加购开关 auto_repurchase_switch
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get 扩容版本
枚举值：
PRO：专业版
ULTIMATE：旗舰版
补充说明：不传则不修改 
     * @return ProtectType 扩容版本
枚举值：
PRO：专业版
ULTIMATE：旗舰版
补充说明：不传则不修改
     */
    public String getProtectType() {
        return this.ProtectType;
    }

    /**
     * Set 扩容版本
枚举值：
PRO：专业版
ULTIMATE：旗舰版
补充说明：不传则不修改
     * @param ProtectType 扩容版本
枚举值：
PRO：专业版
ULTIMATE：旗舰版
补充说明：不传则不修改
     */
    public void setProtectType(String ProtectType) {
        this.ProtectType = ProtectType;
    }

    public HostAutoScaleConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HostAutoScaleConfig(HostAutoScaleConfig source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.ProtectType != null) {
            this.ProtectType = new String(source.ProtectType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "ProtectType", this.ProtectType);

    }
}

