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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PlayAuthKeyInfo  extends AbstractModel{

    /**
    * 域名。
    */
    @SerializedName("DomainName")
    @Expose
    private String DomainName;

    /**
    * 是否启用，0：关闭，1：启用。
    */
    @SerializedName("Enable")
    @Expose
    private Integer Enable;

    /**
    * 鉴权key。
    */
    @SerializedName("AuthKey")
    @Expose
    private String AuthKey;

    /**
    * 有效时间，单位：秒。
    */
    @SerializedName("AuthDelta")
    @Expose
    private Integer AuthDelta;

    /**
    * 鉴权BackKey。
    */
    @SerializedName("AuthBackKey")
    @Expose
    private String AuthBackKey;

    /**
     * 获取域名。
     * @return DomainName 域名。
     */
    public String getDomainName() {
        return this.DomainName;
    }

    /**
     * 设置域名。
     * @param DomainName 域名。
     */
    public void setDomainName(String DomainName) {
        this.DomainName = DomainName;
    }

    /**
     * 获取是否启用，0：关闭，1：启用。
     * @return Enable 是否启用，0：关闭，1：启用。
     */
    public Integer getEnable() {
        return this.Enable;
    }

    /**
     * 设置是否启用，0：关闭，1：启用。
     * @param Enable 是否启用，0：关闭，1：启用。
     */
    public void setEnable(Integer Enable) {
        this.Enable = Enable;
    }

    /**
     * 获取鉴权key。
     * @return AuthKey 鉴权key。
     */
    public String getAuthKey() {
        return this.AuthKey;
    }

    /**
     * 设置鉴权key。
     * @param AuthKey 鉴权key。
     */
    public void setAuthKey(String AuthKey) {
        this.AuthKey = AuthKey;
    }

    /**
     * 获取有效时间，单位：秒。
     * @return AuthDelta 有效时间，单位：秒。
     */
    public Integer getAuthDelta() {
        return this.AuthDelta;
    }

    /**
     * 设置有效时间，单位：秒。
     * @param AuthDelta 有效时间，单位：秒。
     */
    public void setAuthDelta(Integer AuthDelta) {
        this.AuthDelta = AuthDelta;
    }

    /**
     * 获取鉴权BackKey。
     * @return AuthBackKey 鉴权BackKey。
     */
    public String getAuthBackKey() {
        return this.AuthBackKey;
    }

    /**
     * 设置鉴权BackKey。
     * @param AuthBackKey 鉴权BackKey。
     */
    public void setAuthBackKey(String AuthBackKey) {
        this.AuthBackKey = AuthBackKey;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DomainName", this.DomainName);
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "AuthKey", this.AuthKey);
        this.setParamSimple(map, prefix + "AuthDelta", this.AuthDelta);
        this.setParamSimple(map, prefix + "AuthBackKey", this.AuthBackKey);

    }
}

