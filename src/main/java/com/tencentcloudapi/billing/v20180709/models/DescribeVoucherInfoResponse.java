/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.billing.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeVoucherInfoResponse extends AbstractModel {

    /**
    * <p>券总数</p>
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * <p>总余额（微分）</p>
    */
    @SerializedName("TotalBalance")
    @Expose
    private Long TotalBalance;

    /**
    * <p>代金券相关信息</p>
    */
    @SerializedName("VoucherInfos")
    @Expose
    private VoucherInfos [] VoucherInfos;

    /**
    * <p>接口返回的金额字段单位</p><p>默认值：micro</p><p>金额单位：micro（微分）<br>代金券发放和使用按8位高精度处理，所以金额单位默认为micro（微分），如需CNY或USD请按以下公式换算<br>CNY：1 micro = 10⁻⁸ 元<br>USD：1 micro = 10⁻⁸ 美元</p>
    */
    @SerializedName("Unit")
    @Expose
    private String Unit;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>券总数</p> 
     * @return TotalCount <p>券总数</p>
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set <p>券总数</p>
     * @param TotalCount <p>券总数</p>
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get <p>总余额（微分）</p> 
     * @return TotalBalance <p>总余额（微分）</p>
     */
    public Long getTotalBalance() {
        return this.TotalBalance;
    }

    /**
     * Set <p>总余额（微分）</p>
     * @param TotalBalance <p>总余额（微分）</p>
     */
    public void setTotalBalance(Long TotalBalance) {
        this.TotalBalance = TotalBalance;
    }

    /**
     * Get <p>代金券相关信息</p> 
     * @return VoucherInfos <p>代金券相关信息</p>
     */
    public VoucherInfos [] getVoucherInfos() {
        return this.VoucherInfos;
    }

    /**
     * Set <p>代金券相关信息</p>
     * @param VoucherInfos <p>代金券相关信息</p>
     */
    public void setVoucherInfos(VoucherInfos [] VoucherInfos) {
        this.VoucherInfos = VoucherInfos;
    }

    /**
     * Get <p>接口返回的金额字段单位</p><p>默认值：micro</p><p>金额单位：micro（微分）<br>代金券发放和使用按8位高精度处理，所以金额单位默认为micro（微分），如需CNY或USD请按以下公式换算<br>CNY：1 micro = 10⁻⁸ 元<br>USD：1 micro = 10⁻⁸ 美元</p> 
     * @return Unit <p>接口返回的金额字段单位</p><p>默认值：micro</p><p>金额单位：micro（微分）<br>代金券发放和使用按8位高精度处理，所以金额单位默认为micro（微分），如需CNY或USD请按以下公式换算<br>CNY：1 micro = 10⁻⁸ 元<br>USD：1 micro = 10⁻⁸ 美元</p>
     */
    public String getUnit() {
        return this.Unit;
    }

    /**
     * Set <p>接口返回的金额字段单位</p><p>默认值：micro</p><p>金额单位：micro（微分）<br>代金券发放和使用按8位高精度处理，所以金额单位默认为micro（微分），如需CNY或USD请按以下公式换算<br>CNY：1 micro = 10⁻⁸ 元<br>USD：1 micro = 10⁻⁸ 美元</p>
     * @param Unit <p>接口返回的金额字段单位</p><p>默认值：micro</p><p>金额单位：micro（微分）<br>代金券发放和使用按8位高精度处理，所以金额单位默认为micro（微分），如需CNY或USD请按以下公式换算<br>CNY：1 micro = 10⁻⁸ 元<br>USD：1 micro = 10⁻⁸ 美元</p>
     */
    public void setUnit(String Unit) {
        this.Unit = Unit;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeVoucherInfoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVoucherInfoResponse(DescribeVoucherInfoResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.TotalBalance != null) {
            this.TotalBalance = new Long(source.TotalBalance);
        }
        if (source.VoucherInfos != null) {
            this.VoucherInfos = new VoucherInfos[source.VoucherInfos.length];
            for (int i = 0; i < source.VoucherInfos.length; i++) {
                this.VoucherInfos[i] = new VoucherInfos(source.VoucherInfos[i]);
            }
        }
        if (source.Unit != null) {
            this.Unit = new String(source.Unit);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "TotalBalance", this.TotalBalance);
        this.setParamArrayObj(map, prefix + "VoucherInfos.", this.VoucherInfos);
        this.setParamSimple(map, prefix + "Unit", this.Unit);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

