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

public class BiddingPreReleaseRequest extends AbstractModel {

    /**
    * 业务ID(竞价域名的预约ID) 
可通过[DescribeBiddingList](https://cloud.tencent.com/document/api/242/106598)接口获取
    */
    @SerializedName("BusinessId")
    @Expose
    private String BusinessId;

    /**
    * 价格 单位元
    */
    @SerializedName("Price")
    @Expose
    private Float Price;

    /**
     * Get 业务ID(竞价域名的预约ID) 
可通过[DescribeBiddingList](https://cloud.tencent.com/document/api/242/106598)接口获取 
     * @return BusinessId 业务ID(竞价域名的预约ID) 
可通过[DescribeBiddingList](https://cloud.tencent.com/document/api/242/106598)接口获取
     */
    public String getBusinessId() {
        return this.BusinessId;
    }

    /**
     * Set 业务ID(竞价域名的预约ID) 
可通过[DescribeBiddingList](https://cloud.tencent.com/document/api/242/106598)接口获取
     * @param BusinessId 业务ID(竞价域名的预约ID) 
可通过[DescribeBiddingList](https://cloud.tencent.com/document/api/242/106598)接口获取
     */
    public void setBusinessId(String BusinessId) {
        this.BusinessId = BusinessId;
    }

    /**
     * Get 价格 单位元 
     * @return Price 价格 单位元
     */
    public Float getPrice() {
        return this.Price;
    }

    /**
     * Set 价格 单位元
     * @param Price 价格 单位元
     */
    public void setPrice(Float Price) {
        this.Price = Price;
    }

    public BiddingPreReleaseRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BiddingPreReleaseRequest(BiddingPreReleaseRequest source) {
        if (source.BusinessId != null) {
            this.BusinessId = new String(source.BusinessId);
        }
        if (source.Price != null) {
            this.Price = new Float(source.Price);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BusinessId", this.BusinessId);
        this.setParamSimple(map, prefix + "Price", this.Price);

    }
}

