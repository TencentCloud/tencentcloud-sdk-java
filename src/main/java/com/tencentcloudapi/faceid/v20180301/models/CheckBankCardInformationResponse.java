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

public class CheckBankCardInformationResponse extends AbstractModel{

    /**
    * 认证结果码，收费情况如下。
收费结果码：
0: 查询成功
-1: 未查到信息
不收费结果码
-2：验证中心服务繁忙
-3：银行卡不存在
    */
    @SerializedName("Result")
    @Expose
    private String Result;

    /**
    * 业务结果描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 开户行
    */
    @SerializedName("AccountBank")
    @Expose
    private String AccountBank;

    /**
    * 卡性质：1. 借记卡；2. 贷记卡；3. 预付费卡；4. 准贷记卡
    */
    @SerializedName("AccountType")
    @Expose
    private Long AccountType;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 认证结果码，收费情况如下。
收费结果码：
0: 查询成功
-1: 未查到信息
不收费结果码
-2：验证中心服务繁忙
-3：银行卡不存在 
     * @return Result 认证结果码，收费情况如下。
收费结果码：
0: 查询成功
-1: 未查到信息
不收费结果码
-2：验证中心服务繁忙
-3：银行卡不存在
     */
    public String getResult() {
        return this.Result;
    }

    /**
     * Set 认证结果码，收费情况如下。
收费结果码：
0: 查询成功
-1: 未查到信息
不收费结果码
-2：验证中心服务繁忙
-3：银行卡不存在
     * @param Result 认证结果码，收费情况如下。
收费结果码：
0: 查询成功
-1: 未查到信息
不收费结果码
-2：验证中心服务繁忙
-3：银行卡不存在
     */
    public void setResult(String Result) {
        this.Result = Result;
    }

    /**
     * Get 业务结果描述 
     * @return Description 业务结果描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 业务结果描述
     * @param Description 业务结果描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 开户行 
     * @return AccountBank 开户行
     */
    public String getAccountBank() {
        return this.AccountBank;
    }

    /**
     * Set 开户行
     * @param AccountBank 开户行
     */
    public void setAccountBank(String AccountBank) {
        this.AccountBank = AccountBank;
    }

    /**
     * Get 卡性质：1. 借记卡；2. 贷记卡；3. 预付费卡；4. 准贷记卡 
     * @return AccountType 卡性质：1. 借记卡；2. 贷记卡；3. 预付费卡；4. 准贷记卡
     */
    public Long getAccountType() {
        return this.AccountType;
    }

    /**
     * Set 卡性质：1. 借记卡；2. 贷记卡；3. 预付费卡；4. 准贷记卡
     * @param AccountType 卡性质：1. 借记卡；2. 贷记卡；3. 预付费卡；4. 准贷记卡
     */
    public void setAccountType(Long AccountType) {
        this.AccountType = AccountType;
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

    public CheckBankCardInformationResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CheckBankCardInformationResponse(CheckBankCardInformationResponse source) {
        if (source.Result != null) {
            this.Result = new String(source.Result);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.AccountBank != null) {
            this.AccountBank = new String(source.AccountBank);
        }
        if (source.AccountType != null) {
            this.AccountType = new Long(source.AccountType);
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
        this.setParamSimple(map, prefix + "AccountBank", this.AccountBank);
        this.setParamSimple(map, prefix + "AccountType", this.AccountType);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

