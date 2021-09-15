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

public class CheckBankCard2EVerificationResponse extends AbstractModel{

    /**
    * 检测结果
计费结果码：
  0:  认证通过
  1:  认证未通过
  2:  持卡人信息有误
  3:  未开通无卡支付
  4:  此卡被没收
  5:  无效卡号
  6:  此卡无对应发卡行
  7:  该卡未初始化或睡眠卡
  8:  作弊卡、吞卡
  9:  此卡已挂失
  10: 该卡已过期
  11: 受限制的卡
  12: 密码错误次数超限
  13: 发卡行不支持此交易
不收费结果码:
  101: 姓名校验不通过
  102: 银行卡号码有误
  103: 验证中心服务繁忙
  104: 身份证号码有误
  105: 手机号码不合法
    */
    @SerializedName("Result")
    @Expose
    private Long Result;

    /**
    * 结果描述; 未通过时必选
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
     * Get 检测结果
计费结果码：
  0:  认证通过
  1:  认证未通过
  2:  持卡人信息有误
  3:  未开通无卡支付
  4:  此卡被没收
  5:  无效卡号
  6:  此卡无对应发卡行
  7:  该卡未初始化或睡眠卡
  8:  作弊卡、吞卡
  9:  此卡已挂失
  10: 该卡已过期
  11: 受限制的卡
  12: 密码错误次数超限
  13: 发卡行不支持此交易
不收费结果码:
  101: 姓名校验不通过
  102: 银行卡号码有误
  103: 验证中心服务繁忙
  104: 身份证号码有误
  105: 手机号码不合法 
     * @return Result 检测结果
计费结果码：
  0:  认证通过
  1:  认证未通过
  2:  持卡人信息有误
  3:  未开通无卡支付
  4:  此卡被没收
  5:  无效卡号
  6:  此卡无对应发卡行
  7:  该卡未初始化或睡眠卡
  8:  作弊卡、吞卡
  9:  此卡已挂失
  10: 该卡已过期
  11: 受限制的卡
  12: 密码错误次数超限
  13: 发卡行不支持此交易
不收费结果码:
  101: 姓名校验不通过
  102: 银行卡号码有误
  103: 验证中心服务繁忙
  104: 身份证号码有误
  105: 手机号码不合法
     */
    public Long getResult() {
        return this.Result;
    }

    /**
     * Set 检测结果
计费结果码：
  0:  认证通过
  1:  认证未通过
  2:  持卡人信息有误
  3:  未开通无卡支付
  4:  此卡被没收
  5:  无效卡号
  6:  此卡无对应发卡行
  7:  该卡未初始化或睡眠卡
  8:  作弊卡、吞卡
  9:  此卡已挂失
  10: 该卡已过期
  11: 受限制的卡
  12: 密码错误次数超限
  13: 发卡行不支持此交易
不收费结果码:
  101: 姓名校验不通过
  102: 银行卡号码有误
  103: 验证中心服务繁忙
  104: 身份证号码有误
  105: 手机号码不合法
     * @param Result 检测结果
计费结果码：
  0:  认证通过
  1:  认证未通过
  2:  持卡人信息有误
  3:  未开通无卡支付
  4:  此卡被没收
  5:  无效卡号
  6:  此卡无对应发卡行
  7:  该卡未初始化或睡眠卡
  8:  作弊卡、吞卡
  9:  此卡已挂失
  10: 该卡已过期
  11: 受限制的卡
  12: 密码错误次数超限
  13: 发卡行不支持此交易
不收费结果码:
  101: 姓名校验不通过
  102: 银行卡号码有误
  103: 验证中心服务繁忙
  104: 身份证号码有误
  105: 手机号码不合法
     */
    public void setResult(Long Result) {
        this.Result = Result;
    }

    /**
     * Get 结果描述; 未通过时必选 
     * @return Description 结果描述; 未通过时必选
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 结果描述; 未通过时必选
     * @param Description 结果描述; 未通过时必选
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

    public CheckBankCard2EVerificationResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CheckBankCard2EVerificationResponse(CheckBankCard2EVerificationResponse source) {
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
        this.setParamSimple(map, prefix + "Result", this.Result);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

