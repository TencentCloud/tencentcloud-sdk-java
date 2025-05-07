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
package com.tencentcloudapi.domain.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BiddingSuccessfulResult extends AbstractModel {

    /**
    * 支付结束时间
格式:YYYY-MM-DD HH:mm:ss
    */
    @SerializedName("PayEndTime")
    @Expose
    private String PayEndTime;

    /**
     * Get 支付结束时间
格式:YYYY-MM-DD HH:mm:ss 
     * @return PayEndTime 支付结束时间
格式:YYYY-MM-DD HH:mm:ss
     */
    public String getPayEndTime() {
        return this.PayEndTime;
    }

    /**
     * Set 支付结束时间
格式:YYYY-MM-DD HH:mm:ss
     * @param PayEndTime 支付结束时间
格式:YYYY-MM-DD HH:mm:ss
     */
    public void setPayEndTime(String PayEndTime) {
        this.PayEndTime = PayEndTime;
    }

    public BiddingSuccessfulResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BiddingSuccessfulResult(BiddingSuccessfulResult source) {
        if (source.PayEndTime != null) {
            this.PayEndTime = new String(source.PayEndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PayEndTime", this.PayEndTime);

    }
}

