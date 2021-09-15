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
package com.tencentcloudapi.essbasic.v20201222.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyUserRequest extends AbstractModel{

    /**
    * 调用方信息
    */
    @SerializedName("Caller")
    @Expose
    private Caller Caller;

    /**
    * 第三方平台用户唯一标识; OpenId 和 UserId 二选一填写, 两个都不为空则优先使用UserId
    */
    @SerializedName("OpenId")
    @Expose
    private String OpenId;

    /**
    * 腾讯电子签平台用户唯一标识; OpenId 和 UserId 二选一填写, 两个都不为空则优先使用UserId
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 用户手机号码，不要求唯一
    */
    @SerializedName("Mobile")
    @Expose
    private String Mobile;

    /**
    * 用户邮箱，不要求唯一
    */
    @SerializedName("Email")
    @Expose
    private String Email;

    /**
    * 用户姓名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
     * Get 调用方信息 
     * @return Caller 调用方信息
     */
    public Caller getCaller() {
        return this.Caller;
    }

    /**
     * Set 调用方信息
     * @param Caller 调用方信息
     */
    public void setCaller(Caller Caller) {
        this.Caller = Caller;
    }

    /**
     * Get 第三方平台用户唯一标识; OpenId 和 UserId 二选一填写, 两个都不为空则优先使用UserId 
     * @return OpenId 第三方平台用户唯一标识; OpenId 和 UserId 二选一填写, 两个都不为空则优先使用UserId
     */
    public String getOpenId() {
        return this.OpenId;
    }

    /**
     * Set 第三方平台用户唯一标识; OpenId 和 UserId 二选一填写, 两个都不为空则优先使用UserId
     * @param OpenId 第三方平台用户唯一标识; OpenId 和 UserId 二选一填写, 两个都不为空则优先使用UserId
     */
    public void setOpenId(String OpenId) {
        this.OpenId = OpenId;
    }

    /**
     * Get 腾讯电子签平台用户唯一标识; OpenId 和 UserId 二选一填写, 两个都不为空则优先使用UserId 
     * @return UserId 腾讯电子签平台用户唯一标识; OpenId 和 UserId 二选一填写, 两个都不为空则优先使用UserId
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 腾讯电子签平台用户唯一标识; OpenId 和 UserId 二选一填写, 两个都不为空则优先使用UserId
     * @param UserId 腾讯电子签平台用户唯一标识; OpenId 和 UserId 二选一填写, 两个都不为空则优先使用UserId
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 用户手机号码，不要求唯一 
     * @return Mobile 用户手机号码，不要求唯一
     */
    public String getMobile() {
        return this.Mobile;
    }

    /**
     * Set 用户手机号码，不要求唯一
     * @param Mobile 用户手机号码，不要求唯一
     */
    public void setMobile(String Mobile) {
        this.Mobile = Mobile;
    }

    /**
     * Get 用户邮箱，不要求唯一 
     * @return Email 用户邮箱，不要求唯一
     */
    public String getEmail() {
        return this.Email;
    }

    /**
     * Set 用户邮箱，不要求唯一
     * @param Email 用户邮箱，不要求唯一
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * Get 用户姓名 
     * @return Name 用户姓名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 用户姓名
     * @param Name 用户姓名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    public ModifyUserRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyUserRequest(ModifyUserRequest source) {
        if (source.Caller != null) {
            this.Caller = new Caller(source.Caller);
        }
        if (source.OpenId != null) {
            this.OpenId = new String(source.OpenId);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.Mobile != null) {
            this.Mobile = new String(source.Mobile);
        }
        if (source.Email != null) {
            this.Email = new String(source.Email);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Caller.", this.Caller);
        this.setParamSimple(map, prefix + "OpenId", this.OpenId);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "Mobile", this.Mobile);
        this.setParamSimple(map, prefix + "Email", this.Email);
        this.setParamSimple(map, prefix + "Name", this.Name);

    }
}

