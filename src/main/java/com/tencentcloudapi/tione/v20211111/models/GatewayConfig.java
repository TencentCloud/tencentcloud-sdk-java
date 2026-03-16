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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GatewayConfig extends AbstractModel {

    /**
    * 网关类型
    */
    @SerializedName("GatewayType")
    @Expose
    private String GatewayType;

    /**
    * 网关调度算法：轮询、一致性哈希等
    */
    @SerializedName("SchedulingAlgorithm")
    @Expose
    private String SchedulingAlgorithm;

    /**
    * 一致性哈希使用的Header字段名
    */
    @SerializedName("HashHeaderKey")
    @Expose
    private String HashHeaderKey;

    /**
     * Get 网关类型 
     * @return GatewayType 网关类型
     */
    public String getGatewayType() {
        return this.GatewayType;
    }

    /**
     * Set 网关类型
     * @param GatewayType 网关类型
     */
    public void setGatewayType(String GatewayType) {
        this.GatewayType = GatewayType;
    }

    /**
     * Get 网关调度算法：轮询、一致性哈希等 
     * @return SchedulingAlgorithm 网关调度算法：轮询、一致性哈希等
     */
    public String getSchedulingAlgorithm() {
        return this.SchedulingAlgorithm;
    }

    /**
     * Set 网关调度算法：轮询、一致性哈希等
     * @param SchedulingAlgorithm 网关调度算法：轮询、一致性哈希等
     */
    public void setSchedulingAlgorithm(String SchedulingAlgorithm) {
        this.SchedulingAlgorithm = SchedulingAlgorithm;
    }

    /**
     * Get 一致性哈希使用的Header字段名 
     * @return HashHeaderKey 一致性哈希使用的Header字段名
     */
    public String getHashHeaderKey() {
        return this.HashHeaderKey;
    }

    /**
     * Set 一致性哈希使用的Header字段名
     * @param HashHeaderKey 一致性哈希使用的Header字段名
     */
    public void setHashHeaderKey(String HashHeaderKey) {
        this.HashHeaderKey = HashHeaderKey;
    }

    public GatewayConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GatewayConfig(GatewayConfig source) {
        if (source.GatewayType != null) {
            this.GatewayType = new String(source.GatewayType);
        }
        if (source.SchedulingAlgorithm != null) {
            this.SchedulingAlgorithm = new String(source.SchedulingAlgorithm);
        }
        if (source.HashHeaderKey != null) {
            this.HashHeaderKey = new String(source.HashHeaderKey);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GatewayType", this.GatewayType);
        this.setParamSimple(map, prefix + "SchedulingAlgorithm", this.SchedulingAlgorithm);
        this.setParamSimple(map, prefix + "HashHeaderKey", this.HashHeaderKey);

    }
}

