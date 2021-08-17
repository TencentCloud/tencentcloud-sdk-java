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
package com.tencentcloudapi.tdid.v20210519.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VerifyCredentialResponse extends AbstractModel{

    /**
    * 是否验证成功
    */
    @SerializedName("Result")
    @Expose
    private Boolean Result;

    /**
    * 验证返回码
    */
    @SerializedName("VerifyCode")
    @Expose
    private Long VerifyCode;

    /**
    * 验证消息
    */
    @SerializedName("VerifyMessage")
    @Expose
    private String VerifyMessage;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 是否验证成功 
     * @return Result 是否验证成功
     */
    public Boolean getResult() {
        return this.Result;
    }

    /**
     * Set 是否验证成功
     * @param Result 是否验证成功
     */
    public void setResult(Boolean Result) {
        this.Result = Result;
    }

    /**
     * Get 验证返回码 
     * @return VerifyCode 验证返回码
     */
    public Long getVerifyCode() {
        return this.VerifyCode;
    }

    /**
     * Set 验证返回码
     * @param VerifyCode 验证返回码
     */
    public void setVerifyCode(Long VerifyCode) {
        this.VerifyCode = VerifyCode;
    }

    /**
     * Get 验证消息 
     * @return VerifyMessage 验证消息
     */
    public String getVerifyMessage() {
        return this.VerifyMessage;
    }

    /**
     * Set 验证消息
     * @param VerifyMessage 验证消息
     */
    public void setVerifyMessage(String VerifyMessage) {
        this.VerifyMessage = VerifyMessage;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public VerifyCredentialResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VerifyCredentialResponse(VerifyCredentialResponse source) {
        if (source.Result != null) {
            this.Result = new Boolean(source.Result);
        }
        if (source.VerifyCode != null) {
            this.VerifyCode = new Long(source.VerifyCode);
        }
        if (source.VerifyMessage != null) {
            this.VerifyMessage = new String(source.VerifyMessage);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Result", this.Result);
        this.setParamSimple(map, prefix + "VerifyCode", this.VerifyCode);
        this.setParamSimple(map, prefix + "VerifyMessage", this.VerifyMessage);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

