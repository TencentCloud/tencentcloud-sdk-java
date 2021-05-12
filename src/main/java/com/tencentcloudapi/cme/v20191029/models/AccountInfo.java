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
package com.tencentcloudapi.cme.v20191029.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AccountInfo extends AbstractModel{

    /**
    * 用户 Id。
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 用户手机号码。
    */
    @SerializedName("Phone")
    @Expose
    private String Phone;

    /**
    * 用户昵称。
    */
    @SerializedName("Nick")
    @Expose
    private String Nick;

    /**
    * 账号状态，取值：
<li>Normal：有效；</li>
<li>Stopped：无效。</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get 用户 Id。 
     * @return UserId 用户 Id。
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 用户 Id。
     * @param UserId 用户 Id。
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 用户手机号码。 
     * @return Phone 用户手机号码。
     */
    public String getPhone() {
        return this.Phone;
    }

    /**
     * Set 用户手机号码。
     * @param Phone 用户手机号码。
     */
    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    /**
     * Get 用户昵称。 
     * @return Nick 用户昵称。
     */
    public String getNick() {
        return this.Nick;
    }

    /**
     * Set 用户昵称。
     * @param Nick 用户昵称。
     */
    public void setNick(String Nick) {
        this.Nick = Nick;
    }

    /**
     * Get 账号状态，取值：
<li>Normal：有效；</li>
<li>Stopped：无效。</li> 
     * @return Status 账号状态，取值：
<li>Normal：有效；</li>
<li>Stopped：无效。</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 账号状态，取值：
<li>Normal：有效；</li>
<li>Stopped：无效。</li>
     * @param Status 账号状态，取值：
<li>Normal：有效；</li>
<li>Stopped：无效。</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public AccountInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AccountInfo(AccountInfo source) {
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.Phone != null) {
            this.Phone = new String(source.Phone);
        }
        if (source.Nick != null) {
            this.Nick = new String(source.Nick);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "Phone", this.Phone);
        this.setParamSimple(map, prefix + "Nick", this.Nick);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

