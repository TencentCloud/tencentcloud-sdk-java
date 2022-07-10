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
package com.tencentcloudapi.cpdp.v20190820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VerifyOpenBankAccountResult extends AbstractModel{

    /**
    * 打款验证状态。
 INIT("打款中"),
PENDING("打款成功待验证"),
VERIFIED("验证成功"),
FAILED("打款失败"),
VERIFY_FAILED("验证失败")
    */
    @SerializedName("VerifyState")
    @Expose
    private String VerifyState;

    /**
    * 重定向参数，用于客户端跳转，收款商户未完成打款验证时返回该参数
    */
    @SerializedName("RedirectInfo")
    @Expose
    private OpenBankRedirectInfo RedirectInfo;

    /**
     * Get 打款验证状态。
 INIT("打款中"),
PENDING("打款成功待验证"),
VERIFIED("验证成功"),
FAILED("打款失败"),
VERIFY_FAILED("验证失败") 
     * @return VerifyState 打款验证状态。
 INIT("打款中"),
PENDING("打款成功待验证"),
VERIFIED("验证成功"),
FAILED("打款失败"),
VERIFY_FAILED("验证失败")
     */
    public String getVerifyState() {
        return this.VerifyState;
    }

    /**
     * Set 打款验证状态。
 INIT("打款中"),
PENDING("打款成功待验证"),
VERIFIED("验证成功"),
FAILED("打款失败"),
VERIFY_FAILED("验证失败")
     * @param VerifyState 打款验证状态。
 INIT("打款中"),
PENDING("打款成功待验证"),
VERIFIED("验证成功"),
FAILED("打款失败"),
VERIFY_FAILED("验证失败")
     */
    public void setVerifyState(String VerifyState) {
        this.VerifyState = VerifyState;
    }

    /**
     * Get 重定向参数，用于客户端跳转，收款商户未完成打款验证时返回该参数 
     * @return RedirectInfo 重定向参数，用于客户端跳转，收款商户未完成打款验证时返回该参数
     */
    public OpenBankRedirectInfo getRedirectInfo() {
        return this.RedirectInfo;
    }

    /**
     * Set 重定向参数，用于客户端跳转，收款商户未完成打款验证时返回该参数
     * @param RedirectInfo 重定向参数，用于客户端跳转，收款商户未完成打款验证时返回该参数
     */
    public void setRedirectInfo(OpenBankRedirectInfo RedirectInfo) {
        this.RedirectInfo = RedirectInfo;
    }

    public VerifyOpenBankAccountResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VerifyOpenBankAccountResult(VerifyOpenBankAccountResult source) {
        if (source.VerifyState != null) {
            this.VerifyState = new String(source.VerifyState);
        }
        if (source.RedirectInfo != null) {
            this.RedirectInfo = new OpenBankRedirectInfo(source.RedirectInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VerifyState", this.VerifyState);
        this.setParamObj(map, prefix + "RedirectInfo.", this.RedirectInfo);

    }
}

