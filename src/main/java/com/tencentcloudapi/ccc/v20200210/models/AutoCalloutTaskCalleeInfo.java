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
package com.tencentcloudapi.ccc.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AutoCalloutTaskCalleeInfo extends AbstractModel {

    /**
    * 被叫号码
    */
    @SerializedName("Callee")
    @Expose
    private String Callee;

    /**
    * 呼叫状态 0初始 1已接听 2未接听 3呼叫中 4待重试
    */
    @SerializedName("State")
    @Expose
    private Long State;

    /**
    * 会话ID列表
    */
    @SerializedName("Sessions")
    @Expose
    private String [] Sessions;

    /**
     * Get 被叫号码 
     * @return Callee 被叫号码
     */
    public String getCallee() {
        return this.Callee;
    }

    /**
     * Set 被叫号码
     * @param Callee 被叫号码
     */
    public void setCallee(String Callee) {
        this.Callee = Callee;
    }

    /**
     * Get 呼叫状态 0初始 1已接听 2未接听 3呼叫中 4待重试 
     * @return State 呼叫状态 0初始 1已接听 2未接听 3呼叫中 4待重试
     */
    public Long getState() {
        return this.State;
    }

    /**
     * Set 呼叫状态 0初始 1已接听 2未接听 3呼叫中 4待重试
     * @param State 呼叫状态 0初始 1已接听 2未接听 3呼叫中 4待重试
     */
    public void setState(Long State) {
        this.State = State;
    }

    /**
     * Get 会话ID列表 
     * @return Sessions 会话ID列表
     */
    public String [] getSessions() {
        return this.Sessions;
    }

    /**
     * Set 会话ID列表
     * @param Sessions 会话ID列表
     */
    public void setSessions(String [] Sessions) {
        this.Sessions = Sessions;
    }

    public AutoCalloutTaskCalleeInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AutoCalloutTaskCalleeInfo(AutoCalloutTaskCalleeInfo source) {
        if (source.Callee != null) {
            this.Callee = new String(source.Callee);
        }
        if (source.State != null) {
            this.State = new Long(source.State);
        }
        if (source.Sessions != null) {
            this.Sessions = new String[source.Sessions.length];
            for (int i = 0; i < source.Sessions.length; i++) {
                this.Sessions[i] = new String(source.Sessions[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Callee", this.Callee);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamArraySimple(map, prefix + "Sessions.", this.Sessions);

    }
}

