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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDomainVerifyResultResponse extends AbstractModel {

    /**
    * 结果描述；如果可以添加返回空字符串
    */
    @SerializedName("Msg")
    @Expose
    private String Msg;

    /**
    * 检验状态：0表示可以添加，大于0为不能添加
    */
    @SerializedName("VerifyCode")
    @Expose
    private Long VerifyCode;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 结果描述；如果可以添加返回空字符串 
     * @return Msg 结果描述；如果可以添加返回空字符串
     */
    public String getMsg() {
        return this.Msg;
    }

    /**
     * Set 结果描述；如果可以添加返回空字符串
     * @param Msg 结果描述；如果可以添加返回空字符串
     */
    public void setMsg(String Msg) {
        this.Msg = Msg;
    }

    /**
     * Get 检验状态：0表示可以添加，大于0为不能添加 
     * @return VerifyCode 检验状态：0表示可以添加，大于0为不能添加
     */
    public Long getVerifyCode() {
        return this.VerifyCode;
    }

    /**
     * Set 检验状态：0表示可以添加，大于0为不能添加
     * @param VerifyCode 检验状态：0表示可以添加，大于0为不能添加
     */
    public void setVerifyCode(Long VerifyCode) {
        this.VerifyCode = VerifyCode;
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

    public DescribeDomainVerifyResultResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDomainVerifyResultResponse(DescribeDomainVerifyResultResponse source) {
        if (source.Msg != null) {
            this.Msg = new String(source.Msg);
        }
        if (source.VerifyCode != null) {
            this.VerifyCode = new Long(source.VerifyCode);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Msg", this.Msg);
        this.setParamSimple(map, prefix + "VerifyCode", this.VerifyCode);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

