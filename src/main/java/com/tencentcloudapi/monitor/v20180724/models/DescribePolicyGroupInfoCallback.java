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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePolicyGroupInfoCallback extends AbstractModel {

    /**
    * 用户回调接口地址
    */
    @SerializedName("CallbackUrl")
    @Expose
    private String CallbackUrl;

    /**
    * 用户回调接口状态，0表示未验证，1表示已验证，2表示存在url但没有通过验证
    */
    @SerializedName("ValidFlag")
    @Expose
    private Long ValidFlag;

    /**
    * 用户回调接口验证码
    */
    @SerializedName("VerifyCode")
    @Expose
    private String VerifyCode;

    /**
     * Get 用户回调接口地址 
     * @return CallbackUrl 用户回调接口地址
     */
    public String getCallbackUrl() {
        return this.CallbackUrl;
    }

    /**
     * Set 用户回调接口地址
     * @param CallbackUrl 用户回调接口地址
     */
    public void setCallbackUrl(String CallbackUrl) {
        this.CallbackUrl = CallbackUrl;
    }

    /**
     * Get 用户回调接口状态，0表示未验证，1表示已验证，2表示存在url但没有通过验证 
     * @return ValidFlag 用户回调接口状态，0表示未验证，1表示已验证，2表示存在url但没有通过验证
     */
    public Long getValidFlag() {
        return this.ValidFlag;
    }

    /**
     * Set 用户回调接口状态，0表示未验证，1表示已验证，2表示存在url但没有通过验证
     * @param ValidFlag 用户回调接口状态，0表示未验证，1表示已验证，2表示存在url但没有通过验证
     */
    public void setValidFlag(Long ValidFlag) {
        this.ValidFlag = ValidFlag;
    }

    /**
     * Get 用户回调接口验证码 
     * @return VerifyCode 用户回调接口验证码
     */
    public String getVerifyCode() {
        return this.VerifyCode;
    }

    /**
     * Set 用户回调接口验证码
     * @param VerifyCode 用户回调接口验证码
     */
    public void setVerifyCode(String VerifyCode) {
        this.VerifyCode = VerifyCode;
    }

    public DescribePolicyGroupInfoCallback() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePolicyGroupInfoCallback(DescribePolicyGroupInfoCallback source) {
        if (source.CallbackUrl != null) {
            this.CallbackUrl = new String(source.CallbackUrl);
        }
        if (source.ValidFlag != null) {
            this.ValidFlag = new Long(source.ValidFlag);
        }
        if (source.VerifyCode != null) {
            this.VerifyCode = new String(source.VerifyCode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CallbackUrl", this.CallbackUrl);
        this.setParamSimple(map, prefix + "ValidFlag", this.ValidFlag);
        this.setParamSimple(map, prefix + "VerifyCode", this.VerifyCode);

    }
}

