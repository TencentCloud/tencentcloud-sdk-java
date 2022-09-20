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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CCInterceptEvent extends AbstractModel{

    /**
    * 客户端IP。
    */
    @SerializedName("ClientIp")
    @Expose
    private String ClientIp;

    /**
    * 拦截次数/min。
    */
    @SerializedName("InterceptNum")
    @Expose
    private Long InterceptNum;

    /**
    * 速拦截时间，分钟时间/min，单位为s。
    */
    @SerializedName("InterceptTime")
    @Expose
    private Long InterceptTime;

    /**
     * Get 客户端IP。 
     * @return ClientIp 客户端IP。
     */
    public String getClientIp() {
        return this.ClientIp;
    }

    /**
     * Set 客户端IP。
     * @param ClientIp 客户端IP。
     */
    public void setClientIp(String ClientIp) {
        this.ClientIp = ClientIp;
    }

    /**
     * Get 拦截次数/min。 
     * @return InterceptNum 拦截次数/min。
     */
    public Long getInterceptNum() {
        return this.InterceptNum;
    }

    /**
     * Set 拦截次数/min。
     * @param InterceptNum 拦截次数/min。
     */
    public void setInterceptNum(Long InterceptNum) {
        this.InterceptNum = InterceptNum;
    }

    /**
     * Get 速拦截时间，分钟时间/min，单位为s。 
     * @return InterceptTime 速拦截时间，分钟时间/min，单位为s。
     */
    public Long getInterceptTime() {
        return this.InterceptTime;
    }

    /**
     * Set 速拦截时间，分钟时间/min，单位为s。
     * @param InterceptTime 速拦截时间，分钟时间/min，单位为s。
     */
    public void setInterceptTime(Long InterceptTime) {
        this.InterceptTime = InterceptTime;
    }

    public CCInterceptEvent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CCInterceptEvent(CCInterceptEvent source) {
        if (source.ClientIp != null) {
            this.ClientIp = new String(source.ClientIp);
        }
        if (source.InterceptNum != null) {
            this.InterceptNum = new Long(source.InterceptNum);
        }
        if (source.InterceptTime != null) {
            this.InterceptTime = new Long(source.InterceptTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClientIp", this.ClientIp);
        this.setParamSimple(map, prefix + "InterceptNum", this.InterceptNum);
        this.setParamSimple(map, prefix + "InterceptTime", this.InterceptTime);

    }
}

