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

public class QuerySmallAmountTransferRequest extends AbstractModel{

    /**
    * String(22)，商户号（签约客户号）
    */
    @SerializedName("MrchCode")
    @Expose
    private String MrchCode;

    /**
    * STRING(52)，原交易流水号（小额鉴权交易请求时的CnsmrSeqNo值）
    */
    @SerializedName("OldTranSeqNo")
    @Expose
    private String OldTranSeqNo;

    /**
    * STRING(8)，交易日期（格式：20190101）
    */
    @SerializedName("TranDate")
    @Expose
    private String TranDate;

    /**
    * STRING(1027)，保留域
    */
    @SerializedName("ReservedMsg")
    @Expose
    private String ReservedMsg;

    /**
    * STRING(12)，接入环境，默认接入沙箱环境。接入正式环境填"prod"
    */
    @SerializedName("Profile")
    @Expose
    private String Profile;

    /**
     * Get String(22)，商户号（签约客户号） 
     * @return MrchCode String(22)，商户号（签约客户号）
     */
    public String getMrchCode() {
        return this.MrchCode;
    }

    /**
     * Set String(22)，商户号（签约客户号）
     * @param MrchCode String(22)，商户号（签约客户号）
     */
    public void setMrchCode(String MrchCode) {
        this.MrchCode = MrchCode;
    }

    /**
     * Get STRING(52)，原交易流水号（小额鉴权交易请求时的CnsmrSeqNo值） 
     * @return OldTranSeqNo STRING(52)，原交易流水号（小额鉴权交易请求时的CnsmrSeqNo值）
     */
    public String getOldTranSeqNo() {
        return this.OldTranSeqNo;
    }

    /**
     * Set STRING(52)，原交易流水号（小额鉴权交易请求时的CnsmrSeqNo值）
     * @param OldTranSeqNo STRING(52)，原交易流水号（小额鉴权交易请求时的CnsmrSeqNo值）
     */
    public void setOldTranSeqNo(String OldTranSeqNo) {
        this.OldTranSeqNo = OldTranSeqNo;
    }

    /**
     * Get STRING(8)，交易日期（格式：20190101） 
     * @return TranDate STRING(8)，交易日期（格式：20190101）
     */
    public String getTranDate() {
        return this.TranDate;
    }

    /**
     * Set STRING(8)，交易日期（格式：20190101）
     * @param TranDate STRING(8)，交易日期（格式：20190101）
     */
    public void setTranDate(String TranDate) {
        this.TranDate = TranDate;
    }

    /**
     * Get STRING(1027)，保留域 
     * @return ReservedMsg STRING(1027)，保留域
     */
    public String getReservedMsg() {
        return this.ReservedMsg;
    }

    /**
     * Set STRING(1027)，保留域
     * @param ReservedMsg STRING(1027)，保留域
     */
    public void setReservedMsg(String ReservedMsg) {
        this.ReservedMsg = ReservedMsg;
    }

    /**
     * Get STRING(12)，接入环境，默认接入沙箱环境。接入正式环境填"prod" 
     * @return Profile STRING(12)，接入环境，默认接入沙箱环境。接入正式环境填"prod"
     */
    public String getProfile() {
        return this.Profile;
    }

    /**
     * Set STRING(12)，接入环境，默认接入沙箱环境。接入正式环境填"prod"
     * @param Profile STRING(12)，接入环境，默认接入沙箱环境。接入正式环境填"prod"
     */
    public void setProfile(String Profile) {
        this.Profile = Profile;
    }

    public QuerySmallAmountTransferRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QuerySmallAmountTransferRequest(QuerySmallAmountTransferRequest source) {
        if (source.MrchCode != null) {
            this.MrchCode = new String(source.MrchCode);
        }
        if (source.OldTranSeqNo != null) {
            this.OldTranSeqNo = new String(source.OldTranSeqNo);
        }
        if (source.TranDate != null) {
            this.TranDate = new String(source.TranDate);
        }
        if (source.ReservedMsg != null) {
            this.ReservedMsg = new String(source.ReservedMsg);
        }
        if (source.Profile != null) {
            this.Profile = new String(source.Profile);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MrchCode", this.MrchCode);
        this.setParamSimple(map, prefix + "OldTranSeqNo", this.OldTranSeqNo);
        this.setParamSimple(map, prefix + "TranDate", this.TranDate);
        this.setParamSimple(map, prefix + "ReservedMsg", this.ReservedMsg);
        this.setParamSimple(map, prefix + "Profile", this.Profile);

    }
}

