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

public class OpenBankProfitShareInfo extends AbstractModel{

    /**
    * 分润接收方，渠道商户号ID
    */
    @SerializedName("RecvId")
    @Expose
    private String RecvId;

    /**
    * 分润金额，单位分
    */
    @SerializedName("ProfitShareFee")
    @Expose
    private Long ProfitShareFee;

    /**
     * Get 分润接收方，渠道商户号ID 
     * @return RecvId 分润接收方，渠道商户号ID
     */
    public String getRecvId() {
        return this.RecvId;
    }

    /**
     * Set 分润接收方，渠道商户号ID
     * @param RecvId 分润接收方，渠道商户号ID
     */
    public void setRecvId(String RecvId) {
        this.RecvId = RecvId;
    }

    /**
     * Get 分润金额，单位分 
     * @return ProfitShareFee 分润金额，单位分
     */
    public Long getProfitShareFee() {
        return this.ProfitShareFee;
    }

    /**
     * Set 分润金额，单位分
     * @param ProfitShareFee 分润金额，单位分
     */
    public void setProfitShareFee(Long ProfitShareFee) {
        this.ProfitShareFee = ProfitShareFee;
    }

    public OpenBankProfitShareInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OpenBankProfitShareInfo(OpenBankProfitShareInfo source) {
        if (source.RecvId != null) {
            this.RecvId = new String(source.RecvId);
        }
        if (source.ProfitShareFee != null) {
            this.ProfitShareFee = new Long(source.ProfitShareFee);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RecvId", this.RecvId);
        this.setParamSimple(map, prefix + "ProfitShareFee", this.ProfitShareFee);

    }
}

