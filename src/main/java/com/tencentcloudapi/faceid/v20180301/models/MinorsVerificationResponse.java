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
-2: 手机号未实名
-3: 姓名和身份证号不一致

不收费结果码：
-4: 非法身份证号（长度、校验位等不正确）
-5: 非法姓名（长度、格式等不正确）
-6: 数据源服务异常
-7: 数据源中无此身份证记录
-8: 公安比对系统升级中，请稍后再试
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
    * 当结果码为0或者-1时，该字段的值为年龄区间。
格式为[a,b)，表示年龄在a岁以上（包括a岁），b岁以下（不包括b岁）。若b为+时表示没有上限。
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
-2: 手机号未实名
-3: 姓名和身份证号不一致

不收费结果码：
-4: 非法身份证号（长度、校验位等不正确）
-5: 非法姓名（长度、格式等不正确）
-6: 数据源服务异常
-7: 数据源中无此身份证记录
-8: 公安比对系统升级中，请稍后再试 
     * @return Result 结果码，收费情况如下。
收费结果码：
0: 成年
-1: 未成年
-2: 手机号未实名
-3: 姓名和身份证号不一致

不收费结果码：
-4: 非法身份证号（长度、校验位等不正确）
-5: 非法姓名（长度、格式等不正确）
-6: 数据源服务异常
-7: 数据源中无此身份证记录
-8: 公安比对系统升级中，请稍后再试
     */
    public String getResult() {
        return this.Result;
    }

    /**
     * Set 结果码，收费情况如下。
收费结果码：
0: 成年
-1: 未成年
-2: 手机号未实名
-3: 姓名和身份证号不一致

不收费结果码：
-4: 非法身份证号（长度、校验位等不正确）
-5: 非法姓名（长度、格式等不正确）
-6: 数据源服务异常
-7: 数据源中无此身份证记录
-8: 公安比对系统升级中，请稍后再试
     * @param Result 结果码，收费情况如下。
收费结果码：
0: 成年
-1: 未成年
-2: 手机号未实名
-3: 姓名和身份证号不一致

不收费结果码：
-4: 非法身份证号（长度、校验位等不正确）
-5: 非法姓名（长度、格式等不正确）
-6: 数据源服务异常
-7: 数据源中无此身份证记录
-8: 公安比对系统升级中，请稍后再试
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
     * Get 当结果码为0或者-1时，该字段的值为年龄区间。
格式为[a,b)，表示年龄在a岁以上（包括a岁），b岁以下（不包括b岁）。若b为+时表示没有上限。 
     * @return AgeRange 当结果码为0或者-1时，该字段的值为年龄区间。
格式为[a,b)，表示年龄在a岁以上（包括a岁），b岁以下（不包括b岁）。若b为+时表示没有上限。
     */
    public String getAgeRange() {
        return this.AgeRange;
    }

    /**
     * Set 当结果码为0或者-1时，该字段的值为年龄区间。
格式为[a,b)，表示年龄在a岁以上（包括a岁），b岁以下（不包括b岁）。若b为+时表示没有上限。
     * @param AgeRange 当结果码为0或者-1时，该字段的值为年龄区间。
格式为[a,b)，表示年龄在a岁以上（包括a岁），b岁以下（不包括b岁）。若b为+时表示没有上限。
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

