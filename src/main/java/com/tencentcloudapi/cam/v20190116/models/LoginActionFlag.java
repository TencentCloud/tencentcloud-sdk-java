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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LoginActionFlag  extends AbstractModel{

    /**
    * 手机
    */
    @SerializedName("Phone")
    @Expose
    private Long Phone;

    /**
    * 硬token
    */
    @SerializedName("Token")
    @Expose
    private Long Token;

    /**
    * 软token
    */
    @SerializedName("Stoken")
    @Expose
    private Long Stoken;

    /**
    * 微信
    */
    @SerializedName("Wechat")
    @Expose
    private Long Wechat;

    /**
    * 自定义
    */
    @SerializedName("Custom")
    @Expose
    private Long Custom;

    /**
     * 获取手机
     * @return Phone 手机
     */
    public Long getPhone() {
        return this.Phone;
    }

    /**
     * 设置手机
     * @param Phone 手机
     */
    public void setPhone(Long Phone) {
        this.Phone = Phone;
    }

    /**
     * 获取硬token
     * @return Token 硬token
     */
    public Long getToken() {
        return this.Token;
    }

    /**
     * 设置硬token
     * @param Token 硬token
     */
    public void setToken(Long Token) {
        this.Token = Token;
    }

    /**
     * 获取软token
     * @return Stoken 软token
     */
    public Long getStoken() {
        return this.Stoken;
    }

    /**
     * 设置软token
     * @param Stoken 软token
     */
    public void setStoken(Long Stoken) {
        this.Stoken = Stoken;
    }

    /**
     * 获取微信
     * @return Wechat 微信
     */
    public Long getWechat() {
        return this.Wechat;
    }

    /**
     * 设置微信
     * @param Wechat 微信
     */
    public void setWechat(Long Wechat) {
        this.Wechat = Wechat;
    }

    /**
     * 获取自定义
     * @return Custom 自定义
     */
    public Long getCustom() {
        return this.Custom;
    }

    /**
     * 设置自定义
     * @param Custom 自定义
     */
    public void setCustom(Long Custom) {
        this.Custom = Custom;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Phone", this.Phone);
        this.setParamSimple(map, prefix + "Token", this.Token);
        this.setParamSimple(map, prefix + "Stoken", this.Stoken);
        this.setParamSimple(map, prefix + "Wechat", this.Wechat);
        this.setParamSimple(map, prefix + "Custom", this.Custom);

    }
}

