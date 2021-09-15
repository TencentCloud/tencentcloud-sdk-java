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

public class CheckVerifyCodeMatchFlowIdResponse extends AbstractModel{

    /**
    * true: 验证码正确，false: 验证码错误
    */
    @SerializedName("Success")
    @Expose
    private Boolean Success;

    /**
    * 0: 验证码正确 1:验证码错误或过期 2:验证码错误 3:验证码和流程不匹配 4:验证码输入错误超过次数 5:内部错误
6:参数错误
    */
    @SerializedName("Result")
    @Expose
    private Long Result;

    /**
    * 结果描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get true: 验证码正确，false: 验证码错误 
     * @return Success true: 验证码正确，false: 验证码错误
     */
    public Boolean getSuccess() {
        return this.Success;
    }

    /**
     * Set true: 验证码正确，false: 验证码错误
     * @param Success true: 验证码正确，false: 验证码错误
     */
    public void setSuccess(Boolean Success) {
        this.Success = Success;
    }

    /**
     * Get 0: 验证码正确 1:验证码错误或过期 2:验证码错误 3:验证码和流程不匹配 4:验证码输入错误超过次数 5:内部错误
6:参数错误 
     * @return Result 0: 验证码正确 1:验证码错误或过期 2:验证码错误 3:验证码和流程不匹配 4:验证码输入错误超过次数 5:内部错误
6:参数错误
     */
    public Long getResult() {
        return this.Result;
    }

    /**
     * Set 0: 验证码正确 1:验证码错误或过期 2:验证码错误 3:验证码和流程不匹配 4:验证码输入错误超过次数 5:内部错误
6:参数错误
     * @param Result 0: 验证码正确 1:验证码错误或过期 2:验证码错误 3:验证码和流程不匹配 4:验证码输入错误超过次数 5:内部错误
6:参数错误
     */
    public void setResult(Long Result) {
        this.Result = Result;
    }

    /**
     * Get 结果描述 
     * @return Description 结果描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 结果描述
     * @param Description 结果描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
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

    public CheckVerifyCodeMatchFlowIdResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CheckVerifyCodeMatchFlowIdResponse(CheckVerifyCodeMatchFlowIdResponse source) {
        if (source.Success != null) {
            this.Success = new Boolean(source.Success);
        }
        if (source.Result != null) {
            this.Result = new Long(source.Result);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Success", this.Success);
        this.setParamSimple(map, prefix + "Result", this.Result);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

