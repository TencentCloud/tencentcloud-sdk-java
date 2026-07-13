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
    * <p>用户回调接口地址</p>
    */
    @SerializedName("CallbackUrl")
    @Expose
    private String CallbackUrl;

    /**
    * <p>用户回调接口状态，0表示未验证，1表示已验证，2表示存在url但没有通过验证</p>
    */
    @SerializedName("ValidFlag")
    @Expose
    private Long ValidFlag;

    /**
    * <p>用户回调接口验证码</p>
    */
    @SerializedName("VerifyCode")
    @Expose
    private String VerifyCode;

    /**
     * Get <p>用户回调接口地址</p> 
     * @return CallbackUrl <p>用户回调接口地址</p>
     */
    public String getCallbackUrl() {
        return this.CallbackUrl;
    }

    /**
     * Set <p>用户回调接口地址</p>
     * @param CallbackUrl <p>用户回调接口地址</p>
     */
    public void setCallbackUrl(String CallbackUrl) {
        this.CallbackUrl = CallbackUrl;
    }

    /**
     * Get <p>用户回调接口状态，0表示未验证，1表示已验证，2表示存在url但没有通过验证</p> 
     * @return ValidFlag <p>用户回调接口状态，0表示未验证，1表示已验证，2表示存在url但没有通过验证</p>
     */
    public Long getValidFlag() {
        return this.ValidFlag;
    }

    /**
     * Set <p>用户回调接口状态，0表示未验证，1表示已验证，2表示存在url但没有通过验证</p>
     * @param ValidFlag <p>用户回调接口状态，0表示未验证，1表示已验证，2表示存在url但没有通过验证</p>
     */
    public void setValidFlag(Long ValidFlag) {
        this.ValidFlag = ValidFlag;
    }

    /**
     * Get <p>用户回调接口验证码</p> 
     * @return VerifyCode <p>用户回调接口验证码</p>
     */
    public String getVerifyCode() {
        return this.VerifyCode;
    }

    /**
     * Set <p>用户回调接口验证码</p>
     * @param VerifyCode <p>用户回调接口验证码</p>
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

