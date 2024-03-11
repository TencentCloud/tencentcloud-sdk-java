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
package com.tencentcloudapi.cam.v20190116.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LoginActionMfaFlag extends AbstractModel {

    /**
    * 是否设置手机号为登陆和敏感操作安全校验方式， 1: 设置，0: 不设置
    */
    @SerializedName("Phone")
    @Expose
    private Long Phone;

    /**
    * 是否设置软token为登陆和敏感操作安全校验方式， 1: 设置，0: 不设置
    */
    @SerializedName("Stoken")
    @Expose
    private Long Stoken;

    /**
    * 是否设置微信为登陆和敏感操作安全校验方式， 1: 设置，0: 不设置
    */
    @SerializedName("Wechat")
    @Expose
    private Long Wechat;

    /**
     * Get 是否设置手机号为登陆和敏感操作安全校验方式， 1: 设置，0: 不设置 
     * @return Phone 是否设置手机号为登陆和敏感操作安全校验方式， 1: 设置，0: 不设置
     */
    public Long getPhone() {
        return this.Phone;
    }

    /**
     * Set 是否设置手机号为登陆和敏感操作安全校验方式， 1: 设置，0: 不设置
     * @param Phone 是否设置手机号为登陆和敏感操作安全校验方式， 1: 设置，0: 不设置
     */
    public void setPhone(Long Phone) {
        this.Phone = Phone;
    }

    /**
     * Get 是否设置软token为登陆和敏感操作安全校验方式， 1: 设置，0: 不设置 
     * @return Stoken 是否设置软token为登陆和敏感操作安全校验方式， 1: 设置，0: 不设置
     */
    public Long getStoken() {
        return this.Stoken;
    }

    /**
     * Set 是否设置软token为登陆和敏感操作安全校验方式， 1: 设置，0: 不设置
     * @param Stoken 是否设置软token为登陆和敏感操作安全校验方式， 1: 设置，0: 不设置
     */
    public void setStoken(Long Stoken) {
        this.Stoken = Stoken;
    }

    /**
     * Get 是否设置微信为登陆和敏感操作安全校验方式， 1: 设置，0: 不设置 
     * @return Wechat 是否设置微信为登陆和敏感操作安全校验方式， 1: 设置，0: 不设置
     */
    public Long getWechat() {
        return this.Wechat;
    }

    /**
     * Set 是否设置微信为登陆和敏感操作安全校验方式， 1: 设置，0: 不设置
     * @param Wechat 是否设置微信为登陆和敏感操作安全校验方式， 1: 设置，0: 不设置
     */
    public void setWechat(Long Wechat) {
        this.Wechat = Wechat;
    }

    public LoginActionMfaFlag() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LoginActionMfaFlag(LoginActionMfaFlag source) {
        if (source.Phone != null) {
            this.Phone = new Long(source.Phone);
        }
        if (source.Stoken != null) {
            this.Stoken = new Long(source.Stoken);
        }
        if (source.Wechat != null) {
            this.Wechat = new Long(source.Wechat);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Phone", this.Phone);
        this.setParamSimple(map, prefix + "Stoken", this.Stoken);
        this.setParamSimple(map, prefix + "Wechat", this.Wechat);

    }
}

