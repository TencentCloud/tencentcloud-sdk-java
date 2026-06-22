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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AdvancedOriginRoutingParameters extends AbstractModel {

    /**
    * <p>回源优化方向，取值有：</p><li>MainlandChinaAndGlobalAdaptive：自适应。域名需同时开启「智能加速」后生效，EdgeOne将根据客户端与源站的实际地理位置，自动匹配最优回源优化方向，无需手动指定。例如 www.example.com 开启「高级回源优化」，但「智能加速」关闭或仅部分匹配条件开启时，「高级回源优化」将不生效。</li>
    */
    @SerializedName("Direction")
    @Expose
    private String Direction;

    /**
     * Get <p>回源优化方向，取值有：</p><li>MainlandChinaAndGlobalAdaptive：自适应。域名需同时开启「智能加速」后生效，EdgeOne将根据客户端与源站的实际地理位置，自动匹配最优回源优化方向，无需手动指定。例如 www.example.com 开启「高级回源优化」，但「智能加速」关闭或仅部分匹配条件开启时，「高级回源优化」将不生效。</li> 
     * @return Direction <p>回源优化方向，取值有：</p><li>MainlandChinaAndGlobalAdaptive：自适应。域名需同时开启「智能加速」后生效，EdgeOne将根据客户端与源站的实际地理位置，自动匹配最优回源优化方向，无需手动指定。例如 www.example.com 开启「高级回源优化」，但「智能加速」关闭或仅部分匹配条件开启时，「高级回源优化」将不生效。</li>
     */
    public String getDirection() {
        return this.Direction;
    }

    /**
     * Set <p>回源优化方向，取值有：</p><li>MainlandChinaAndGlobalAdaptive：自适应。域名需同时开启「智能加速」后生效，EdgeOne将根据客户端与源站的实际地理位置，自动匹配最优回源优化方向，无需手动指定。例如 www.example.com 开启「高级回源优化」，但「智能加速」关闭或仅部分匹配条件开启时，「高级回源优化」将不生效。</li>
     * @param Direction <p>回源优化方向，取值有：</p><li>MainlandChinaAndGlobalAdaptive：自适应。域名需同时开启「智能加速」后生效，EdgeOne将根据客户端与源站的实际地理位置，自动匹配最优回源优化方向，无需手动指定。例如 www.example.com 开启「高级回源优化」，但「智能加速」关闭或仅部分匹配条件开启时，「高级回源优化」将不生效。</li>
     */
    public void setDirection(String Direction) {
        this.Direction = Direction;
    }

    public AdvancedOriginRoutingParameters() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AdvancedOriginRoutingParameters(AdvancedOriginRoutingParameters source) {
        if (source.Direction != null) {
            this.Direction = new String(source.Direction);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Direction", this.Direction);

    }
}

