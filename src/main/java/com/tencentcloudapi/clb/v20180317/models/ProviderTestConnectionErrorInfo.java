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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProviderTestConnectionErrorInfo extends AbstractModel {

    /**
    * <p>上游模型侧返回的HTTP状态码</p>
    */
    @SerializedName("HttpCode")
    @Expose
    private Long HttpCode;

    /**
    * <p>错误状态码</p>
    */
    @SerializedName("ErrorStatus")
    @Expose
    private String ErrorStatus;

    /**
    * <p>探测请求错误信息</p>
    */
    @SerializedName("OriginalMessage")
    @Expose
    private String OriginalMessage;

    /**
     * Get <p>上游模型侧返回的HTTP状态码</p> 
     * @return HttpCode <p>上游模型侧返回的HTTP状态码</p>
     */
    public Long getHttpCode() {
        return this.HttpCode;
    }

    /**
     * Set <p>上游模型侧返回的HTTP状态码</p>
     * @param HttpCode <p>上游模型侧返回的HTTP状态码</p>
     */
    public void setHttpCode(Long HttpCode) {
        this.HttpCode = HttpCode;
    }

    /**
     * Get <p>错误状态码</p> 
     * @return ErrorStatus <p>错误状态码</p>
     */
    public String getErrorStatus() {
        return this.ErrorStatus;
    }

    /**
     * Set <p>错误状态码</p>
     * @param ErrorStatus <p>错误状态码</p>
     */
    public void setErrorStatus(String ErrorStatus) {
        this.ErrorStatus = ErrorStatus;
    }

    /**
     * Get <p>探测请求错误信息</p> 
     * @return OriginalMessage <p>探测请求错误信息</p>
     */
    public String getOriginalMessage() {
        return this.OriginalMessage;
    }

    /**
     * Set <p>探测请求错误信息</p>
     * @param OriginalMessage <p>探测请求错误信息</p>
     */
    public void setOriginalMessage(String OriginalMessage) {
        this.OriginalMessage = OriginalMessage;
    }

    public ProviderTestConnectionErrorInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProviderTestConnectionErrorInfo(ProviderTestConnectionErrorInfo source) {
        if (source.HttpCode != null) {
            this.HttpCode = new Long(source.HttpCode);
        }
        if (source.ErrorStatus != null) {
            this.ErrorStatus = new String(source.ErrorStatus);
        }
        if (source.OriginalMessage != null) {
            this.OriginalMessage = new String(source.OriginalMessage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HttpCode", this.HttpCode);
        this.setParamSimple(map, prefix + "ErrorStatus", this.ErrorStatus);
        this.setParamSimple(map, prefix + "OriginalMessage", this.OriginalMessage);

    }
}

