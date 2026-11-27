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
package com.tencentcloudapi.antiddos.v20250903.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AbnormalConnectionLimit extends AbstractModel {

    /**
    * <p>异常连接数限制，限制同一时间单个源 IP 异常连接数量， 0为不启用, 范围: 0-4294967295。</p><p>取值范围：[0, 4294967295]</p>
    */
    @SerializedName("AbnormalConnectThreshold")
    @Expose
    private Long AbnormalConnectThreshold;

    /**
    * <p>异常连接判定条件。满足任意条件则计为一次异常统计。</p>
    */
    @SerializedName("AbnormalConnectCondition")
    @Expose
    private AbnormalConnectCondition AbnormalConnectCondition;

    /**
     * Get <p>异常连接数限制，限制同一时间单个源 IP 异常连接数量， 0为不启用, 范围: 0-4294967295。</p><p>取值范围：[0, 4294967295]</p> 
     * @return AbnormalConnectThreshold <p>异常连接数限制，限制同一时间单个源 IP 异常连接数量， 0为不启用, 范围: 0-4294967295。</p><p>取值范围：[0, 4294967295]</p>
     */
    public Long getAbnormalConnectThreshold() {
        return this.AbnormalConnectThreshold;
    }

    /**
     * Set <p>异常连接数限制，限制同一时间单个源 IP 异常连接数量， 0为不启用, 范围: 0-4294967295。</p><p>取值范围：[0, 4294967295]</p>
     * @param AbnormalConnectThreshold <p>异常连接数限制，限制同一时间单个源 IP 异常连接数量， 0为不启用, 范围: 0-4294967295。</p><p>取值范围：[0, 4294967295]</p>
     */
    public void setAbnormalConnectThreshold(Long AbnormalConnectThreshold) {
        this.AbnormalConnectThreshold = AbnormalConnectThreshold;
    }

    /**
     * Get <p>异常连接判定条件。满足任意条件则计为一次异常统计。</p> 
     * @return AbnormalConnectCondition <p>异常连接判定条件。满足任意条件则计为一次异常统计。</p>
     */
    public AbnormalConnectCondition getAbnormalConnectCondition() {
        return this.AbnormalConnectCondition;
    }

    /**
     * Set <p>异常连接判定条件。满足任意条件则计为一次异常统计。</p>
     * @param AbnormalConnectCondition <p>异常连接判定条件。满足任意条件则计为一次异常统计。</p>
     */
    public void setAbnormalConnectCondition(AbnormalConnectCondition AbnormalConnectCondition) {
        this.AbnormalConnectCondition = AbnormalConnectCondition;
    }

    public AbnormalConnectionLimit() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AbnormalConnectionLimit(AbnormalConnectionLimit source) {
        if (source.AbnormalConnectThreshold != null) {
            this.AbnormalConnectThreshold = new Long(source.AbnormalConnectThreshold);
        }
        if (source.AbnormalConnectCondition != null) {
            this.AbnormalConnectCondition = new AbnormalConnectCondition(source.AbnormalConnectCondition);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AbnormalConnectThreshold", this.AbnormalConnectThreshold);
        this.setParamObj(map, prefix + "AbnormalConnectCondition.", this.AbnormalConnectCondition);

    }
}

