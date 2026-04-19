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
package com.tencentcloudapi.cme.v20191029.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AccountInfo extends AbstractModel {

    /**
    * <p>用户 Id。</p>
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * <p>用户手机号码。</p>
    */
    @SerializedName("Phone")
    @Expose
    private String Phone;

    /**
    * <p>用户昵称。</p>
    */
    @SerializedName("Nick")
    @Expose
    private String Nick;

    /**
    * <p>账号状态，取值：</p><li>Normal：有效；</li><li>Stopped：无效。</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>账户的创建时间。</p><p>参数格式：使用 ISO 日期格式。</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
     * Get <p>用户 Id。</p> 
     * @return UserId <p>用户 Id。</p>
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set <p>用户 Id。</p>
     * @param UserId <p>用户 Id。</p>
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get <p>用户手机号码。</p> 
     * @return Phone <p>用户手机号码。</p>
     */
    public String getPhone() {
        return this.Phone;
    }

    /**
     * Set <p>用户手机号码。</p>
     * @param Phone <p>用户手机号码。</p>
     */
    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    /**
     * Get <p>用户昵称。</p> 
     * @return Nick <p>用户昵称。</p>
     */
    public String getNick() {
        return this.Nick;
    }

    /**
     * Set <p>用户昵称。</p>
     * @param Nick <p>用户昵称。</p>
     */
    public void setNick(String Nick) {
        this.Nick = Nick;
    }

    /**
     * Get <p>账号状态，取值：</p><li>Normal：有效；</li><li>Stopped：无效。</li> 
     * @return Status <p>账号状态，取值：</p><li>Normal：有效；</li><li>Stopped：无效。</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>账号状态，取值：</p><li>Normal：有效；</li><li>Stopped：无效。</li>
     * @param Status <p>账号状态，取值：</p><li>Normal：有效；</li><li>Stopped：无效。</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>账户的创建时间。</p><p>参数格式：使用 ISO 日期格式。</p> 
     * @return CreateTime <p>账户的创建时间。</p><p>参数格式：使用 ISO 日期格式。</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>账户的创建时间。</p><p>参数格式：使用 ISO 日期格式。</p>
     * @param CreateTime <p>账户的创建时间。</p><p>参数格式：使用 ISO 日期格式。</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
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
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
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
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);

    }
}

