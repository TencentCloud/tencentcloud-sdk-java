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
package com.tencentcloudapi.youmall.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeShopHourTrafficInfoResponse extends AbstractModel {

    /**
    * 公司ID
    */
    @SerializedName("CompanyId")
    @Expose
    private String CompanyId;

    /**
    * 门店ID
    */
    @SerializedName("ShopId")
    @Expose
    private Long ShopId;

    /**
    * 查询结果总数
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 分时客流信息
    */
    @SerializedName("ShopHourTrafficInfoSet")
    @Expose
    private ShopHourTrafficInfo [] ShopHourTrafficInfoSet;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 公司ID 
     * @return CompanyId 公司ID
     */
    public String getCompanyId() {
        return this.CompanyId;
    }

    /**
     * Set 公司ID
     * @param CompanyId 公司ID
     */
    public void setCompanyId(String CompanyId) {
        this.CompanyId = CompanyId;
    }

    /**
     * Get 门店ID 
     * @return ShopId 门店ID
     */
    public Long getShopId() {
        return this.ShopId;
    }

    /**
     * Set 门店ID
     * @param ShopId 门店ID
     */
    public void setShopId(Long ShopId) {
        this.ShopId = ShopId;
    }

    /**
     * Get 查询结果总数 
     * @return TotalCount 查询结果总数
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 查询结果总数
     * @param TotalCount 查询结果总数
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 分时客流信息 
     * @return ShopHourTrafficInfoSet 分时客流信息
     */
    public ShopHourTrafficInfo [] getShopHourTrafficInfoSet() {
        return this.ShopHourTrafficInfoSet;
    }

    /**
     * Set 分时客流信息
     * @param ShopHourTrafficInfoSet 分时客流信息
     */
    public void setShopHourTrafficInfoSet(ShopHourTrafficInfo [] ShopHourTrafficInfoSet) {
        this.ShopHourTrafficInfoSet = ShopHourTrafficInfoSet;
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

    public DescribeShopHourTrafficInfoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeShopHourTrafficInfoResponse(DescribeShopHourTrafficInfoResponse source) {
        if (source.CompanyId != null) {
            this.CompanyId = new String(source.CompanyId);
        }
        if (source.ShopId != null) {
            this.ShopId = new Long(source.ShopId);
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.ShopHourTrafficInfoSet != null) {
            this.ShopHourTrafficInfoSet = new ShopHourTrafficInfo[source.ShopHourTrafficInfoSet.length];
            for (int i = 0; i < source.ShopHourTrafficInfoSet.length; i++) {
                this.ShopHourTrafficInfoSet[i] = new ShopHourTrafficInfo(source.ShopHourTrafficInfoSet[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CompanyId", this.CompanyId);
        this.setParamSimple(map, prefix + "ShopId", this.ShopId);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "ShopHourTrafficInfoSet.", this.ShopHourTrafficInfoSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

