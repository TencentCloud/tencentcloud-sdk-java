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
package com.tencentcloudapi.tcbr.v20220217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PublicNetConf extends AbstractModel {

    /**
    * <p>是否开启公网访问</p><p>枚举值：</p><ul><li>ENABLE： 开启公网访问</li><li>DISABLE： 关闭公网访问</li></ul>
    */
    @SerializedName("PublicNetStatus")
    @Expose
    private String PublicNetStatus;

    /**
     * Get <p>是否开启公网访问</p><p>枚举值：</p><ul><li>ENABLE： 开启公网访问</li><li>DISABLE： 关闭公网访问</li></ul> 
     * @return PublicNetStatus <p>是否开启公网访问</p><p>枚举值：</p><ul><li>ENABLE： 开启公网访问</li><li>DISABLE： 关闭公网访问</li></ul>
     */
    public String getPublicNetStatus() {
        return this.PublicNetStatus;
    }

    /**
     * Set <p>是否开启公网访问</p><p>枚举值：</p><ul><li>ENABLE： 开启公网访问</li><li>DISABLE： 关闭公网访问</li></ul>
     * @param PublicNetStatus <p>是否开启公网访问</p><p>枚举值：</p><ul><li>ENABLE： 开启公网访问</li><li>DISABLE： 关闭公网访问</li></ul>
     */
    public void setPublicNetStatus(String PublicNetStatus) {
        this.PublicNetStatus = PublicNetStatus;
    }

    public PublicNetConf() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PublicNetConf(PublicNetConf source) {
        if (source.PublicNetStatus != null) {
            this.PublicNetStatus = new String(source.PublicNetStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PublicNetStatus", this.PublicNetStatus);

    }
}

