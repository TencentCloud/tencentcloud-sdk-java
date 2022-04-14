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

public class CloudSettleInfo extends AbstractModel{

    /**
    * 是否需要支付确认。
0: 不需要支付确认
1: 需要支付确认
传1时，需要在支付完成后成功调用了《支付确认》接口，该笔订单才会被清分出去
    */
    @SerializedName("NeedToBeConfirmed")
    @Expose
    private Long NeedToBeConfirmed;

    /**
    * 是否指定分账。
0: 不指定分账
1: 指定分账
    */
    @SerializedName("ProfitSharing")
    @Expose
    private Long ProfitSharing;

    /**
     * Get 是否需要支付确认。
0: 不需要支付确认
1: 需要支付确认
传1时，需要在支付完成后成功调用了《支付确认》接口，该笔订单才会被清分出去 
     * @return NeedToBeConfirmed 是否需要支付确认。
0: 不需要支付确认
1: 需要支付确认
传1时，需要在支付完成后成功调用了《支付确认》接口，该笔订单才会被清分出去
     */
    public Long getNeedToBeConfirmed() {
        return this.NeedToBeConfirmed;
    }

    /**
     * Set 是否需要支付确认。
0: 不需要支付确认
1: 需要支付确认
传1时，需要在支付完成后成功调用了《支付确认》接口，该笔订单才会被清分出去
     * @param NeedToBeConfirmed 是否需要支付确认。
0: 不需要支付确认
1: 需要支付确认
传1时，需要在支付完成后成功调用了《支付确认》接口，该笔订单才会被清分出去
     */
    public void setNeedToBeConfirmed(Long NeedToBeConfirmed) {
        this.NeedToBeConfirmed = NeedToBeConfirmed;
    }

    /**
     * Get 是否指定分账。
0: 不指定分账
1: 指定分账 
     * @return ProfitSharing 是否指定分账。
0: 不指定分账
1: 指定分账
     */
    public Long getProfitSharing() {
        return this.ProfitSharing;
    }

    /**
     * Set 是否指定分账。
0: 不指定分账
1: 指定分账
     * @param ProfitSharing 是否指定分账。
0: 不指定分账
1: 指定分账
     */
    public void setProfitSharing(Long ProfitSharing) {
        this.ProfitSharing = ProfitSharing;
    }

    public CloudSettleInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CloudSettleInfo(CloudSettleInfo source) {
        if (source.NeedToBeConfirmed != null) {
            this.NeedToBeConfirmed = new Long(source.NeedToBeConfirmed);
        }
        if (source.ProfitSharing != null) {
            this.ProfitSharing = new Long(source.ProfitSharing);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NeedToBeConfirmed", this.NeedToBeConfirmed);
        this.setParamSimple(map, prefix + "ProfitSharing", this.ProfitSharing);

    }
}

