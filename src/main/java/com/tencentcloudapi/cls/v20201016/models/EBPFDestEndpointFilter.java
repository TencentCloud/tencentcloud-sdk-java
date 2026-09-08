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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EBPFDestEndpointFilter extends AbstractModel {

    /**
    * <p>过滤模式</p><p>枚举值：</p><ul><li>0： 不过滤</li><li>1： 白名单</li><li>2： 黑名单</li></ul>
    */
    @SerializedName("Mode")
    @Expose
    private Long Mode;

    /**
    * <p>端点列表</p>
    */
    @SerializedName("Endpoints")
    @Expose
    private EBPFEndpoint [] Endpoints;

    /**
     * Get <p>过滤模式</p><p>枚举值：</p><ul><li>0： 不过滤</li><li>1： 白名单</li><li>2： 黑名单</li></ul> 
     * @return Mode <p>过滤模式</p><p>枚举值：</p><ul><li>0： 不过滤</li><li>1： 白名单</li><li>2： 黑名单</li></ul>
     */
    public Long getMode() {
        return this.Mode;
    }

    /**
     * Set <p>过滤模式</p><p>枚举值：</p><ul><li>0： 不过滤</li><li>1： 白名单</li><li>2： 黑名单</li></ul>
     * @param Mode <p>过滤模式</p><p>枚举值：</p><ul><li>0： 不过滤</li><li>1： 白名单</li><li>2： 黑名单</li></ul>
     */
    public void setMode(Long Mode) {
        this.Mode = Mode;
    }

    /**
     * Get <p>端点列表</p> 
     * @return Endpoints <p>端点列表</p>
     */
    public EBPFEndpoint [] getEndpoints() {
        return this.Endpoints;
    }

    /**
     * Set <p>端点列表</p>
     * @param Endpoints <p>端点列表</p>
     */
    public void setEndpoints(EBPFEndpoint [] Endpoints) {
        this.Endpoints = Endpoints;
    }

    public EBPFDestEndpointFilter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EBPFDestEndpointFilter(EBPFDestEndpointFilter source) {
        if (source.Mode != null) {
            this.Mode = new Long(source.Mode);
        }
        if (source.Endpoints != null) {
            this.Endpoints = new EBPFEndpoint[source.Endpoints.length];
            for (int i = 0; i < source.Endpoints.length; i++) {
                this.Endpoints[i] = new EBPFEndpoint(source.Endpoints[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamArrayObj(map, prefix + "Endpoints.", this.Endpoints);

    }
}

