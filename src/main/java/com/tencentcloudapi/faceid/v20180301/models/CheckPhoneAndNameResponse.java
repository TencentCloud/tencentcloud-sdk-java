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
package com.tencentcloudapi.faceid.v20180301.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CheckPhoneAndNameResponse extends AbstractModel {

    /**
    * <p>认证结果码，收费情况如下。</p><ul><li><p>收费结果码：<br>0: 验证结果一致。<br>1: 验证结果不一致。</p></li><li><p>不收费结果码：<br>-1:查无记录。<br>-2:引擎未知错误。<br>-3:引擎服务异常。<br>-4:姓名校验不通过。<br>-5:手机号码不合法。<br>-6: 认证次数超过当日限制，请次日重试。<br>-13：该号段不支持验证</p></li></ul>
    */
    @SerializedName("Result")
    @Expose
    private String Result;

    /**
    * <p>业务结果描述。</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>认证结果码，收费情况如下。</p><ul><li><p>收费结果码：<br>0: 验证结果一致。<br>1: 验证结果不一致。</p></li><li><p>不收费结果码：<br>-1:查无记录。<br>-2:引擎未知错误。<br>-3:引擎服务异常。<br>-4:姓名校验不通过。<br>-5:手机号码不合法。<br>-6: 认证次数超过当日限制，请次日重试。<br>-13：该号段不支持验证</p></li></ul> 
     * @return Result <p>认证结果码，收费情况如下。</p><ul><li><p>收费结果码：<br>0: 验证结果一致。<br>1: 验证结果不一致。</p></li><li><p>不收费结果码：<br>-1:查无记录。<br>-2:引擎未知错误。<br>-3:引擎服务异常。<br>-4:姓名校验不通过。<br>-5:手机号码不合法。<br>-6: 认证次数超过当日限制，请次日重试。<br>-13：该号段不支持验证</p></li></ul>
     */
    public String getResult() {
        return this.Result;
    }

    /**
     * Set <p>认证结果码，收费情况如下。</p><ul><li><p>收费结果码：<br>0: 验证结果一致。<br>1: 验证结果不一致。</p></li><li><p>不收费结果码：<br>-1:查无记录。<br>-2:引擎未知错误。<br>-3:引擎服务异常。<br>-4:姓名校验不通过。<br>-5:手机号码不合法。<br>-6: 认证次数超过当日限制，请次日重试。<br>-13：该号段不支持验证</p></li></ul>
     * @param Result <p>认证结果码，收费情况如下。</p><ul><li><p>收费结果码：<br>0: 验证结果一致。<br>1: 验证结果不一致。</p></li><li><p>不收费结果码：<br>-1:查无记录。<br>-2:引擎未知错误。<br>-3:引擎服务异常。<br>-4:姓名校验不通过。<br>-5:手机号码不合法。<br>-6: 认证次数超过当日限制，请次日重试。<br>-13：该号段不支持验证</p></li></ul>
     */
    public void setResult(String Result) {
        this.Result = Result;
    }

    /**
     * Get <p>业务结果描述。</p> 
     * @return Description <p>业务结果描述。</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>业务结果描述。</p>
     * @param Description <p>业务结果描述。</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public CheckPhoneAndNameResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CheckPhoneAndNameResponse(CheckPhoneAndNameResponse source) {
        if (source.Result != null) {
            this.Result = new String(source.Result);
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
        this.setParamSimple(map, prefix + "Result", this.Result);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

