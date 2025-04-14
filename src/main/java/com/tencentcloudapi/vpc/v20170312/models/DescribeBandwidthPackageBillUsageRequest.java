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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBandwidthPackageBillUsageRequest extends AbstractModel {

    /**
    * 后付费共享带宽包的唯一ID，可以使用[DescribeBandwidthPackages](https://cloud.tencent.com/document/api/215/19209)接口获取BandwidthPackageId。
    */
    @SerializedName("BandwidthPackageId")
    @Expose
    private String BandwidthPackageId;

    /**
     * Get 后付费共享带宽包的唯一ID，可以使用[DescribeBandwidthPackages](https://cloud.tencent.com/document/api/215/19209)接口获取BandwidthPackageId。 
     * @return BandwidthPackageId 后付费共享带宽包的唯一ID，可以使用[DescribeBandwidthPackages](https://cloud.tencent.com/document/api/215/19209)接口获取BandwidthPackageId。
     */
    public String getBandwidthPackageId() {
        return this.BandwidthPackageId;
    }

    /**
     * Set 后付费共享带宽包的唯一ID，可以使用[DescribeBandwidthPackages](https://cloud.tencent.com/document/api/215/19209)接口获取BandwidthPackageId。
     * @param BandwidthPackageId 后付费共享带宽包的唯一ID，可以使用[DescribeBandwidthPackages](https://cloud.tencent.com/document/api/215/19209)接口获取BandwidthPackageId。
     */
    public void setBandwidthPackageId(String BandwidthPackageId) {
        this.BandwidthPackageId = BandwidthPackageId;
    }

    public DescribeBandwidthPackageBillUsageRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBandwidthPackageBillUsageRequest(DescribeBandwidthPackageBillUsageRequest source) {
        if (source.BandwidthPackageId != null) {
            this.BandwidthPackageId = new String(source.BandwidthPackageId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BandwidthPackageId", this.BandwidthPackageId);

    }
}

