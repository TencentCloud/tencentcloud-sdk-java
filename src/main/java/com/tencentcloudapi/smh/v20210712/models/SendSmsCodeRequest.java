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
package com.tencentcloudapi.smh.v20210712.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SendSmsCodeRequest extends AbstractModel{

    /**
    * 验证码目的，当前仅支持换绑超级管理员账号，固定填写 BindSuperAdmin。
    */
    @SerializedName("Purpose")
    @Expose
    private String Purpose;

    /**
    * 官方云盘实例 ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 将作为超级管理员账号的手机号码，仅限中国境内手机号，无需国家代码“+86”。
    */
    @SerializedName("PhoneNumber")
    @Expose
    private String PhoneNumber;

    /**
     * Get 验证码目的，当前仅支持换绑超级管理员账号，固定填写 BindSuperAdmin。 
     * @return Purpose 验证码目的，当前仅支持换绑超级管理员账号，固定填写 BindSuperAdmin。
     */
    public String getPurpose() {
        return this.Purpose;
    }

    /**
     * Set 验证码目的，当前仅支持换绑超级管理员账号，固定填写 BindSuperAdmin。
     * @param Purpose 验证码目的，当前仅支持换绑超级管理员账号，固定填写 BindSuperAdmin。
     */
    public void setPurpose(String Purpose) {
        this.Purpose = Purpose;
    }

    /**
     * Get 官方云盘实例 ID 
     * @return InstanceId 官方云盘实例 ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 官方云盘实例 ID
     * @param InstanceId 官方云盘实例 ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 将作为超级管理员账号的手机号码，仅限中国境内手机号，无需国家代码“+86”。 
     * @return PhoneNumber 将作为超级管理员账号的手机号码，仅限中国境内手机号，无需国家代码“+86”。
     */
    public String getPhoneNumber() {
        return this.PhoneNumber;
    }

    /**
     * Set 将作为超级管理员账号的手机号码，仅限中国境内手机号，无需国家代码“+86”。
     * @param PhoneNumber 将作为超级管理员账号的手机号码，仅限中国境内手机号，无需国家代码“+86”。
     */
    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    public SendSmsCodeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SendSmsCodeRequest(SendSmsCodeRequest source) {
        if (source.Purpose != null) {
            this.Purpose = new String(source.Purpose);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.PhoneNumber != null) {
            this.PhoneNumber = new String(source.PhoneNumber);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Purpose", this.Purpose);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "PhoneNumber", this.PhoneNumber);

    }
}

