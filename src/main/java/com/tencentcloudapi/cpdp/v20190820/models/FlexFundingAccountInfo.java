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

public class FlexFundingAccountInfo extends AbstractModel{

    /**
    * 资金账户号
    */
    @SerializedName("FundingAccountNo")
    @Expose
    private String FundingAccountNo;

    /**
    * 资金账户类型
    */
    @SerializedName("FundingAccountType")
    @Expose
    private String FundingAccountType;

    /**
    * 资金账户绑定序列号
    */
    @SerializedName("FundingAccountBindSerialNo")
    @Expose
    private String FundingAccountBindSerialNo;

    /**
     * Get 资金账户号 
     * @return FundingAccountNo 资金账户号
     */
    public String getFundingAccountNo() {
        return this.FundingAccountNo;
    }

    /**
     * Set 资金账户号
     * @param FundingAccountNo 资金账户号
     */
    public void setFundingAccountNo(String FundingAccountNo) {
        this.FundingAccountNo = FundingAccountNo;
    }

    /**
     * Get 资金账户类型 
     * @return FundingAccountType 资金账户类型
     */
    public String getFundingAccountType() {
        return this.FundingAccountType;
    }

    /**
     * Set 资金账户类型
     * @param FundingAccountType 资金账户类型
     */
    public void setFundingAccountType(String FundingAccountType) {
        this.FundingAccountType = FundingAccountType;
    }

    /**
     * Get 资金账户绑定序列号 
     * @return FundingAccountBindSerialNo 资金账户绑定序列号
     */
    public String getFundingAccountBindSerialNo() {
        return this.FundingAccountBindSerialNo;
    }

    /**
     * Set 资金账户绑定序列号
     * @param FundingAccountBindSerialNo 资金账户绑定序列号
     */
    public void setFundingAccountBindSerialNo(String FundingAccountBindSerialNo) {
        this.FundingAccountBindSerialNo = FundingAccountBindSerialNo;
    }

    public FlexFundingAccountInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FlexFundingAccountInfo(FlexFundingAccountInfo source) {
        if (source.FundingAccountNo != null) {
            this.FundingAccountNo = new String(source.FundingAccountNo);
        }
        if (source.FundingAccountType != null) {
            this.FundingAccountType = new String(source.FundingAccountType);
        }
        if (source.FundingAccountBindSerialNo != null) {
            this.FundingAccountBindSerialNo = new String(source.FundingAccountBindSerialNo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FundingAccountNo", this.FundingAccountNo);
        this.setParamSimple(map, prefix + "FundingAccountType", this.FundingAccountType);
        this.setParamSimple(map, prefix + "FundingAccountBindSerialNo", this.FundingAccountBindSerialNo);

    }
}

