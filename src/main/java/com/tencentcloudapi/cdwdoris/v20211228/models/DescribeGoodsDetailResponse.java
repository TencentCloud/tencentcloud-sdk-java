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
package com.tencentcloudapi.cdwdoris.v20211228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeGoodsDetailResponse extends AbstractModel {

    /**
    * GoodsDetail对象
    */
    @SerializedName("GoodsDetail")
    @Expose
    private String GoodsDetail;

    /**
    * GoodsCategoryId 表示操作类型
    */
    @SerializedName("GoodsCategoryId")
    @Expose
    private Long GoodsCategoryId;

    /**
    * 子商品码
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 付费模式，0后付费，1预付费
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * 地域ID
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

    /**
    * 可用区ID
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * 资源标识符
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 商品数目
    */
    @SerializedName("GoodsNum")
    @Expose
    private Long GoodsNum;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get GoodsDetail对象 
     * @return GoodsDetail GoodsDetail对象
     */
    public String getGoodsDetail() {
        return this.GoodsDetail;
    }

    /**
     * Set GoodsDetail对象
     * @param GoodsDetail GoodsDetail对象
     */
    public void setGoodsDetail(String GoodsDetail) {
        this.GoodsDetail = GoodsDetail;
    }

    /**
     * Get GoodsCategoryId 表示操作类型 
     * @return GoodsCategoryId GoodsCategoryId 表示操作类型
     */
    public Long getGoodsCategoryId() {
        return this.GoodsCategoryId;
    }

    /**
     * Set GoodsCategoryId 表示操作类型
     * @param GoodsCategoryId GoodsCategoryId 表示操作类型
     */
    public void setGoodsCategoryId(Long GoodsCategoryId) {
        this.GoodsCategoryId = GoodsCategoryId;
    }

    /**
     * Get 子商品码 
     * @return Type 子商品码
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 子商品码
     * @param Type 子商品码
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 付费模式，0后付费，1预付费 
     * @return PayMode 付费模式，0后付费，1预付费
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set 付费模式，0后付费，1预付费
     * @param PayMode 付费模式，0后付费，1预付费
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get 地域ID 
     * @return RegionId 地域ID
     */
    public Long getRegionId() {
        return this.RegionId;
    }

    /**
     * Set 地域ID
     * @param RegionId 地域ID
     */
    public void setRegionId(Long RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get 可用区ID 
     * @return ZoneId 可用区ID
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 可用区ID
     * @param ZoneId 可用区ID
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 资源标识符 
     * @return ResourceId 资源标识符
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 资源标识符
     * @param ResourceId 资源标识符
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get 商品数目 
     * @return GoodsNum 商品数目
     */
    public Long getGoodsNum() {
        return this.GoodsNum;
    }

    /**
     * Set 商品数目
     * @param GoodsNum 商品数目
     */
    public void setGoodsNum(Long GoodsNum) {
        this.GoodsNum = GoodsNum;
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

    public DescribeGoodsDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeGoodsDetailResponse(DescribeGoodsDetailResponse source) {
        if (source.GoodsDetail != null) {
            this.GoodsDetail = new String(source.GoodsDetail);
        }
        if (source.GoodsCategoryId != null) {
            this.GoodsCategoryId = new Long(source.GoodsCategoryId);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.PayMode != null) {
            this.PayMode = new Long(source.PayMode);
        }
        if (source.RegionId != null) {
            this.RegionId = new Long(source.RegionId);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new Long(source.ZoneId);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.GoodsNum != null) {
            this.GoodsNum = new Long(source.GoodsNum);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GoodsDetail", this.GoodsDetail);
        this.setParamSimple(map, prefix + "GoodsCategoryId", this.GoodsCategoryId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "GoodsNum", this.GoodsNum);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

