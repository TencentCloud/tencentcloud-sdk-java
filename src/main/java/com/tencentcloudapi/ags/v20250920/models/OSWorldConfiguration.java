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
package com.tencentcloudapi.ags.v20250920.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OSWorldConfiguration extends AbstractModel {

    /**
    * <p>指定内置 OSWorld 版本</p><p>枚举值：</p><ul><li>osworld1： osworld v1</li><li>osworld2： osworld v2</li></ul><p>默认值：osworld1</p>
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
     * Get <p>指定内置 OSWorld 版本</p><p>枚举值：</p><ul><li>osworld1： osworld v1</li><li>osworld2： osworld v2</li></ul><p>默认值：osworld1</p> 
     * @return Version <p>指定内置 OSWorld 版本</p><p>枚举值：</p><ul><li>osworld1： osworld v1</li><li>osworld2： osworld v2</li></ul><p>默认值：osworld1</p>
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set <p>指定内置 OSWorld 版本</p><p>枚举值：</p><ul><li>osworld1： osworld v1</li><li>osworld2： osworld v2</li></ul><p>默认值：osworld1</p>
     * @param Version <p>指定内置 OSWorld 版本</p><p>枚举值：</p><ul><li>osworld1： osworld v1</li><li>osworld2： osworld v2</li></ul><p>默认值：osworld1</p>
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    public OSWorldConfiguration() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OSWorldConfiguration(OSWorldConfiguration source) {
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Version", this.Version);

    }
}

