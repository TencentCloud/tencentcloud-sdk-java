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

public class MinorsVerificationResponse extends AbstractModel{

    /**
    * 结果码，收费情况如下。
收费结果码：
0: 成年
-1: 未成年
-3: 姓名和身份证号不一致

不收费结果码：
-2: 未查询到手机号信息
-4: 非法身份证号（长度、校验位等不正确）
-5: 非法姓名（长度、格式等不正确）
-6: 权威数据源服务异常
-7: 未查询到身份信息
-8: 权威数据源升级中，请稍后再试
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
    * 该字段的值为年龄区间。格式为[a,b)，
[0,8)表示年龄小于8周岁区间，不包括8岁；
[8,16)表示年龄8-16周岁区间，不包括16岁；
[16,18)表示年龄16-18周岁区间，不包括18岁；
[18,+)表示年龄大于18周岁。
    */
    @SerializedName("AgeRange")
    @Expose
    private String AgeRange;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 结果码，收费情况如下。
收费结果码：
0: 成年
-1: 未成年
-3: 姓名和身份证号不一致

不收费结果码：
-2: 未查询到手机号信息
-4: 非法身份证号（长度、校验位等不正确）
-5: 非法姓名（长度、格式等不正确）
-6: 权威数据源服务异常
-7: 未查询到身份信息
-8: 权威数据源升级中，请稍后再试 
     * @return Result 结果码，收费情况如下。
收费结果码：
0: 成年
-1: 未成年
-3: 姓名和身份证号不一致

不收费结果码：
-2: 未查询到手机号信息
-4: 非法身份证号（长度、校验位等不正确）
-5: 非法姓名（长度、格式等不正确）
-6: 权威数据源服务异常
-7: 未查询到身份信息
-8: 权威数据源升级中，请稍后再试
     */
    public String getResult() {
        return this.Result;
    }

    /**
     * Set 结果码，收费情况如下。
收费结果码：
0: 成年
-1: 未成年
-3: 姓名和身份证号不一致

不收费结果码：
-2: 未查询到手机号信息
-4: 非法身份证号（长度、校验位等不正确）
-5: 非法姓名（长度、格式等不正确）
-6: 权威数据源服务异常
-7: 未查询到身份信息
-8: 权威数据源升级中，请稍后再试
     * @param Result 结果码，收费情况如下。
收费结果码：
0: 成年
-1: 未成年
-3: 姓名和身份证号不一致

不收费结果码：
-2: 未查询到手机号信息
-4: 非法身份证号（长度、校验位等不正确）
-5: 非法姓名（长度、格式等不正确）
-6: 权威数据源服务异常
-7: 未查询到身份信息
-8: 权威数据源升级中，请稍后再试
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
     * Get 该字段的值为年龄区间。格式为[a,b)，
[0,8)表示年龄小于8周岁区间，不包括8岁；
[8,16)表示年龄8-16周岁区间，不包括16岁；
[16,18)表示年龄16-18周岁区间，不包括18岁；
[18,+)表示年龄大于18周岁。 
     * @return AgeRange 该字段的值为年龄区间。格式为[a,b)，
[0,8)表示年龄小于8周岁区间，不包括8岁；
[8,16)表示年龄8-16周岁区间，不包括16岁；
[16,18)表示年龄16-18周岁区间，不包括18岁；
[18,+)表示年龄大于18周岁。
     */
    public String getAgeRange() {
        return this.AgeRange;
    }

    /**
     * Set 该字段的值为年龄区间。格式为[a,b)，
[0,8)表示年龄小于8周岁区间，不包括8岁；
[8,16)表示年龄8-16周岁区间，不包括16岁；
[16,18)表示年龄16-18周岁区间，不包括18岁；
[18,+)表示年龄大于18周岁。
     * @param AgeRange 该字段的值为年龄区间。格式为[a,b)，
[0,8)表示年龄小于8周岁区间，不包括8岁；
[8,16)表示年龄8-16周岁区间，不包括16岁；
[16,18)表示年龄16-18周岁区间，不包括18岁；
[18,+)表示年龄大于18周岁。
     */
    public void setAgeRange(String AgeRange) {
        this.AgeRange = AgeRange;
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

    public MinorsVerificationResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MinorsVerificationResponse(MinorsVerificationResponse source) {
        if (source.Result != null) {
            this.Result = new String(source.Result);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.AgeRange != null) {
            this.AgeRange = new String(source.AgeRange);
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
        this.setParamSimple(map, prefix + "AgeRange", this.AgeRange);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

