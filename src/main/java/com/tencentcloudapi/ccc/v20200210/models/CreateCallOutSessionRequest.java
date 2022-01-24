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

public class CreateCallOutSessionRequest extends AbstractModel{

    /**
    * 应用 ID
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * 客服用户 ID，一般为客服邮箱
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 被叫号码，须带 0086 前缀
    */
    @SerializedName("Callee")
    @Expose
    private String Callee;

    /**
    * 主叫号码，须带 0086 前缀
    */
    @SerializedName("Caller")
    @Expose
    private String Caller;

    /**
    * 是否强制使用手机外呼，当前只支持 true，若为 true 请确保已配置白名单
    */
    @SerializedName("IsForceUseMobile")
    @Expose
    private Boolean IsForceUseMobile;

    /**
    * 自定义数据，长度限制 1024 字节
    */
    @SerializedName("Uui")
    @Expose
    private String Uui;

    /**
     * Get 应用 ID 
     * @return SdkAppId 应用 ID
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set 应用 ID
     * @param SdkAppId 应用 ID
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get 客服用户 ID，一般为客服邮箱 
     * @return UserId 客服用户 ID，一般为客服邮箱
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 客服用户 ID，一般为客服邮箱
     * @param UserId 客服用户 ID，一般为客服邮箱
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 被叫号码，须带 0086 前缀 
     * @return Callee 被叫号码，须带 0086 前缀
     */
    public String getCallee() {
        return this.Callee;
    }

    /**
     * Set 被叫号码，须带 0086 前缀
     * @param Callee 被叫号码，须带 0086 前缀
     */
    public void setCallee(String Callee) {
        this.Callee = Callee;
    }

    /**
     * Get 主叫号码，须带 0086 前缀 
     * @return Caller 主叫号码，须带 0086 前缀
     */
    public String getCaller() {
        return this.Caller;
    }

    /**
     * Set 主叫号码，须带 0086 前缀
     * @param Caller 主叫号码，须带 0086 前缀
     */
    public void setCaller(String Caller) {
        this.Caller = Caller;
    }

    /**
     * Get 是否强制使用手机外呼，当前只支持 true，若为 true 请确保已配置白名单 
     * @return IsForceUseMobile 是否强制使用手机外呼，当前只支持 true，若为 true 请确保已配置白名单
     */
    public Boolean getIsForceUseMobile() {
        return this.IsForceUseMobile;
    }

    /**
     * Set 是否强制使用手机外呼，当前只支持 true，若为 true 请确保已配置白名单
     * @param IsForceUseMobile 是否强制使用手机外呼，当前只支持 true，若为 true 请确保已配置白名单
     */
    public void setIsForceUseMobile(Boolean IsForceUseMobile) {
        this.IsForceUseMobile = IsForceUseMobile;
    }

    /**
     * Get 自定义数据，长度限制 1024 字节 
     * @return Uui 自定义数据，长度限制 1024 字节
     */
    public String getUui() {
        return this.Uui;
    }

    /**
     * Set 自定义数据，长度限制 1024 字节
     * @param Uui 自定义数据，长度限制 1024 字节
     */
    public void setUui(String Uui) {
        this.Uui = Uui;
    }

    public CreateCallOutSessionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCallOutSessionRequest(CreateCallOutSessionRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.Callee != null) {
            this.Callee = new String(source.Callee);
        }
        if (source.Caller != null) {
            this.Caller = new String(source.Caller);
        }
        if (source.IsForceUseMobile != null) {
            this.IsForceUseMobile = new Boolean(source.IsForceUseMobile);
        }
        if (source.Uui != null) {
            this.Uui = new String(source.Uui);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "Callee", this.Callee);
        this.setParamSimple(map, prefix + "Caller", this.Caller);
        this.setParamSimple(map, prefix + "IsForceUseMobile", this.IsForceUseMobile);
        this.setParamSimple(map, prefix + "Uui", this.Uui);

    }
}

