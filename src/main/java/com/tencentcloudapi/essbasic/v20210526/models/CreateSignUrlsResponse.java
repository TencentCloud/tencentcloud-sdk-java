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
package com.tencentcloudapi.essbasic.v20210526.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateSignUrlsResponse extends AbstractModel{

    /**
    * 签署参与者签署H5链接信息数组
    */
    @SerializedName("SignUrlInfos")
    @Expose
    private SignUrlInfo [] SignUrlInfos;

    /**
    * 生成失败时的错误信息，成功返回”“，顺序和出参SignUrlInfos保持一致
    */
    @SerializedName("ErrorMessages")
    @Expose
    private String [] ErrorMessages;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 签署参与者签署H5链接信息数组 
     * @return SignUrlInfos 签署参与者签署H5链接信息数组
     */
    public SignUrlInfo [] getSignUrlInfos() {
        return this.SignUrlInfos;
    }

    /**
     * Set 签署参与者签署H5链接信息数组
     * @param SignUrlInfos 签署参与者签署H5链接信息数组
     */
    public void setSignUrlInfos(SignUrlInfo [] SignUrlInfos) {
        this.SignUrlInfos = SignUrlInfos;
    }

    /**
     * Get 生成失败时的错误信息，成功返回”“，顺序和出参SignUrlInfos保持一致 
     * @return ErrorMessages 生成失败时的错误信息，成功返回”“，顺序和出参SignUrlInfos保持一致
     */
    public String [] getErrorMessages() {
        return this.ErrorMessages;
    }

    /**
     * Set 生成失败时的错误信息，成功返回”“，顺序和出参SignUrlInfos保持一致
     * @param ErrorMessages 生成失败时的错误信息，成功返回”“，顺序和出参SignUrlInfos保持一致
     */
    public void setErrorMessages(String [] ErrorMessages) {
        this.ErrorMessages = ErrorMessages;
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

    public CreateSignUrlsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateSignUrlsResponse(CreateSignUrlsResponse source) {
        if (source.SignUrlInfos != null) {
            this.SignUrlInfos = new SignUrlInfo[source.SignUrlInfos.length];
            for (int i = 0; i < source.SignUrlInfos.length; i++) {
                this.SignUrlInfos[i] = new SignUrlInfo(source.SignUrlInfos[i]);
            }
        }
        if (source.ErrorMessages != null) {
            this.ErrorMessages = new String[source.ErrorMessages.length];
            for (int i = 0; i < source.ErrorMessages.length; i++) {
                this.ErrorMessages[i] = new String(source.ErrorMessages[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "SignUrlInfos.", this.SignUrlInfos);
        this.setParamArraySimple(map, prefix + "ErrorMessages.", this.ErrorMessages);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

