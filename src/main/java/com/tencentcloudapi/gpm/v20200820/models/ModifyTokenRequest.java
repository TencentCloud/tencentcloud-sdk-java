/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.gpm.v20200820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyTokenRequest extends AbstractModel{

    /**
    * 匹配Code。
    */
    @SerializedName("MatchCode")
    @Expose
    private String MatchCode;

    /**
    * 单位秒，取值0-1800。此参数表示当前Token被替换后，GPM将持续推送原Token的时间。在CompatibleSpan时间范围内，用户将在事件消息中收到当前和原始Token。
    */
    @SerializedName("CompatibleSpan")
    @Expose
    private Long CompatibleSpan;

    /**
    * Token，[a-zA-Z0-9-_.], 长度0-64。如果为空，将由GPM随机生成。
    */
    @SerializedName("MatchToken")
    @Expose
    private String MatchToken;

    /**
     * Get 匹配Code。 
     * @return MatchCode 匹配Code。
     */
    public String getMatchCode() {
        return this.MatchCode;
    }

    /**
     * Set 匹配Code。
     * @param MatchCode 匹配Code。
     */
    public void setMatchCode(String MatchCode) {
        this.MatchCode = MatchCode;
    }

    /**
     * Get 单位秒，取值0-1800。此参数表示当前Token被替换后，GPM将持续推送原Token的时间。在CompatibleSpan时间范围内，用户将在事件消息中收到当前和原始Token。 
     * @return CompatibleSpan 单位秒，取值0-1800。此参数表示当前Token被替换后，GPM将持续推送原Token的时间。在CompatibleSpan时间范围内，用户将在事件消息中收到当前和原始Token。
     */
    public Long getCompatibleSpan() {
        return this.CompatibleSpan;
    }

    /**
     * Set 单位秒，取值0-1800。此参数表示当前Token被替换后，GPM将持续推送原Token的时间。在CompatibleSpan时间范围内，用户将在事件消息中收到当前和原始Token。
     * @param CompatibleSpan 单位秒，取值0-1800。此参数表示当前Token被替换后，GPM将持续推送原Token的时间。在CompatibleSpan时间范围内，用户将在事件消息中收到当前和原始Token。
     */
    public void setCompatibleSpan(Long CompatibleSpan) {
        this.CompatibleSpan = CompatibleSpan;
    }

    /**
     * Get Token，[a-zA-Z0-9-_.], 长度0-64。如果为空，将由GPM随机生成。 
     * @return MatchToken Token，[a-zA-Z0-9-_.], 长度0-64。如果为空，将由GPM随机生成。
     */
    public String getMatchToken() {
        return this.MatchToken;
    }

    /**
     * Set Token，[a-zA-Z0-9-_.], 长度0-64。如果为空，将由GPM随机生成。
     * @param MatchToken Token，[a-zA-Z0-9-_.], 长度0-64。如果为空，将由GPM随机生成。
     */
    public void setMatchToken(String MatchToken) {
        this.MatchToken = MatchToken;
    }

    public ModifyTokenRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyTokenRequest(ModifyTokenRequest source) {
        if (source.MatchCode != null) {
            this.MatchCode = new String(source.MatchCode);
        }
        if (source.CompatibleSpan != null) {
            this.CompatibleSpan = new Long(source.CompatibleSpan);
        }
        if (source.MatchToken != null) {
            this.MatchToken = new String(source.MatchToken);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MatchCode", this.MatchCode);
        this.setParamSimple(map, prefix + "CompatibleSpan", this.CompatibleSpan);
        this.setParamSimple(map, prefix + "MatchToken", this.MatchToken);

    }
}

