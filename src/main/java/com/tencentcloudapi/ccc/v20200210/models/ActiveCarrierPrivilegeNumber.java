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
package com.tencentcloudapi.ccc.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ActiveCarrierPrivilegeNumber extends AbstractModel{

    /**
    * 实例Id
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * 主叫号码
    */
    @SerializedName("Caller")
    @Expose
    private String Caller;

    /**
    * 被叫号码
    */
    @SerializedName("Callee")
    @Expose
    private String Callee;

    /**
    * 生效unix时间戳(秒)
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
     * Get 实例Id 
     * @return SdkAppId 实例Id
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set 实例Id
     * @param SdkAppId 实例Id
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get 主叫号码 
     * @return Caller 主叫号码
     */
    public String getCaller() {
        return this.Caller;
    }

    /**
     * Set 主叫号码
     * @param Caller 主叫号码
     */
    public void setCaller(String Caller) {
        this.Caller = Caller;
    }

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
     * Get 生效unix时间戳(秒) 
     * @return CreateTime 生效unix时间戳(秒)
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 生效unix时间戳(秒)
     * @param CreateTime 生效unix时间戳(秒)
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    public ActiveCarrierPrivilegeNumber() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ActiveCarrierPrivilegeNumber(ActiveCarrierPrivilegeNumber source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.Caller != null) {
            this.Caller = new String(source.Caller);
        }
        if (source.Callee != null) {
            this.Callee = new String(source.Callee);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "Caller", this.Caller);
        this.setParamSimple(map, prefix + "Callee", this.Callee);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);

    }
}

