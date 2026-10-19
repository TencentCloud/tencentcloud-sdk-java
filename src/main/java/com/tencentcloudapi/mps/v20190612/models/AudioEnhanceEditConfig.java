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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AudioEnhanceEditConfig extends AbstractModel {

    /**
    * <p>能力配置开关</p><p>枚举值：</p><ul><li>ON： 开启</li><li>OFF： 关闭</li></ul><p>默认值：OFF</p>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * <p>音频编辑类型</p><p>枚举值：</p><ul><li>restore： 修复</li></ul><p>开关开启时，必须显式指定枚举值</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get <p>能力配置开关</p><p>枚举值：</p><ul><li>ON： 开启</li><li>OFF： 关闭</li></ul><p>默认值：OFF</p> 
     * @return Switch <p>能力配置开关</p><p>枚举值：</p><ul><li>ON： 开启</li><li>OFF： 关闭</li></ul><p>默认值：OFF</p>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set <p>能力配置开关</p><p>枚举值：</p><ul><li>ON： 开启</li><li>OFF： 关闭</li></ul><p>默认值：OFF</p>
     * @param Switch <p>能力配置开关</p><p>枚举值：</p><ul><li>ON： 开启</li><li>OFF： 关闭</li></ul><p>默认值：OFF</p>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get <p>音频编辑类型</p><p>枚举值：</p><ul><li>restore： 修复</li></ul><p>开关开启时，必须显式指定枚举值</p> 
     * @return Type <p>音频编辑类型</p><p>枚举值：</p><ul><li>restore： 修复</li></ul><p>开关开启时，必须显式指定枚举值</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>音频编辑类型</p><p>枚举值：</p><ul><li>restore： 修复</li></ul><p>开关开启时，必须显式指定枚举值</p>
     * @param Type <p>音频编辑类型</p><p>枚举值：</p><ul><li>restore： 修复</li></ul><p>开关开启时，必须显式指定枚举值</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    public AudioEnhanceEditConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AudioEnhanceEditConfig(AudioEnhanceEditConfig source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

