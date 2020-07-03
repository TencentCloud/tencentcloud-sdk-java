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
package com.tencentcloudapi.faceid.v20180301.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PhoneVerificationResponse extends AbstractModel{

    /**
    * 认证结果码:
0: 认证通过
-1: 手机号已实名，但是身份证和姓名均与实名信息不一致 
-2: 手机号已实名，手机号和证件号一致，姓名不一致
-3: 手机号已实名，手机号和姓名一致，身份证不一致
-4: 信息不一致
-5: 手机号未实名
-6: 手机号码不合法
-7: 身份证号码有误
-8: 姓名校验不通过
-9: 没有记录
-10: 认证未通过
-11: 验证中心服务繁忙
    */
    @SerializedName("Result")
    @Expose
    private String Result;

    /**
    * 业务结果描述。
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
     * Get 认证结果码:
0: 认证通过
-1: 手机号已实名，但是身份证和姓名均与实名信息不一致 
-2: 手机号已实名，手机号和证件号一致，姓名不一致
-3: 手机号已实名，手机号和姓名一致，身份证不一致
-4: 信息不一致
-5: 手机号未实名
-6: 手机号码不合法
-7: 身份证号码有误
-8: 姓名校验不通过
-9: 没有记录
-10: 认证未通过
-11: 验证中心服务繁忙 
     * @return Result 认证结果码:
0: 认证通过
-1: 手机号已实名，但是身份证和姓名均与实名信息不一致 
-2: 手机号已实名，手机号和证件号一致，姓名不一致
-3: 手机号已实名，手机号和姓名一致，身份证不一致
-4: 信息不一致
-5: 手机号未实名
-6: 手机号码不合法
-7: 身份证号码有误
-8: 姓名校验不通过
-9: 没有记录
-10: 认证未通过
-11: 验证中心服务繁忙
     */
    public String getResult() {
        return this.Result;
    }

    /**
     * Set 认证结果码:
0: 认证通过
-1: 手机号已实名，但是身份证和姓名均与实名信息不一致 
-2: 手机号已实名，手机号和证件号一致，姓名不一致
-3: 手机号已实名，手机号和姓名一致，身份证不一致
-4: 信息不一致
-5: 手机号未实名
-6: 手机号码不合法
-7: 身份证号码有误
-8: 姓名校验不通过
-9: 没有记录
-10: 认证未通过
-11: 验证中心服务繁忙
     * @param Result 认证结果码:
0: 认证通过
-1: 手机号已实名，但是身份证和姓名均与实名信息不一致 
-2: 手机号已实名，手机号和证件号一致，姓名不一致
-3: 手机号已实名，手机号和姓名一致，身份证不一致
-4: 信息不一致
-5: 手机号未实名
-6: 手机号码不合法
-7: 身份证号码有误
-8: 姓名校验不通过
-9: 没有记录
-10: 认证未通过
-11: 验证中心服务繁忙
     */
    public void setResult(String Result) {
        this.Result = Result;
    }

    /**
     * Get 业务结果描述。 
     * @return Description 业务结果描述。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 业务结果描述。
     * @param Description 业务结果描述。
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

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Result", this.Result);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

