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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeVULListResponse extends AbstractModel {

    /**
    * 总数
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 漏洞列表
    */
    @SerializedName("Data")
    @Expose
    private VULBaseInfo [] Data;

    /**
    * 漏洞类型列表
    */
    @SerializedName("VULTypeLists")
    @Expose
    private FilterDataObject [] VULTypeLists;

    /**
    * 风险等级列表
    */
    @SerializedName("RiskLevels")
    @Expose
    private FilterDataObject [] RiskLevels;

    /**
    * 标签
    */
    @SerializedName("Tags")
    @Expose
    private FilterDataObject [] Tags;

    /**
    * 产品支持情况
    */
    @SerializedName("ProductSupport")
    @Expose
    private FilterDataObject [] ProductSupport;

    /**
    * 产品支持情况
    */
    @SerializedName("CheckStatus")
    @Expose
    private FilterDataObject [] CheckStatus;

    /**
    * 攻击热度枚举
    */
    @SerializedName("AttackHeat")
    @Expose
    private FilterDataObject [] AttackHeat;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 总数 
     * @return TotalCount 总数
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 总数
     * @param TotalCount 总数
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 漏洞列表 
     * @return Data 漏洞列表
     */
    public VULBaseInfo [] getData() {
        return this.Data;
    }

    /**
     * Set 漏洞列表
     * @param Data 漏洞列表
     */
    public void setData(VULBaseInfo [] Data) {
        this.Data = Data;
    }

    /**
     * Get 漏洞类型列表 
     * @return VULTypeLists 漏洞类型列表
     */
    public FilterDataObject [] getVULTypeLists() {
        return this.VULTypeLists;
    }

    /**
     * Set 漏洞类型列表
     * @param VULTypeLists 漏洞类型列表
     */
    public void setVULTypeLists(FilterDataObject [] VULTypeLists) {
        this.VULTypeLists = VULTypeLists;
    }

    /**
     * Get 风险等级列表 
     * @return RiskLevels 风险等级列表
     */
    public FilterDataObject [] getRiskLevels() {
        return this.RiskLevels;
    }

    /**
     * Set 风险等级列表
     * @param RiskLevels 风险等级列表
     */
    public void setRiskLevels(FilterDataObject [] RiskLevels) {
        this.RiskLevels = RiskLevels;
    }

    /**
     * Get 标签 
     * @return Tags 标签
     */
    public FilterDataObject [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签
     * @param Tags 标签
     */
    public void setTags(FilterDataObject [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 产品支持情况 
     * @return ProductSupport 产品支持情况
     */
    public FilterDataObject [] getProductSupport() {
        return this.ProductSupport;
    }

    /**
     * Set 产品支持情况
     * @param ProductSupport 产品支持情况
     */
    public void setProductSupport(FilterDataObject [] ProductSupport) {
        this.ProductSupport = ProductSupport;
    }

    /**
     * Get 产品支持情况 
     * @return CheckStatus 产品支持情况
     */
    public FilterDataObject [] getCheckStatus() {
        return this.CheckStatus;
    }

    /**
     * Set 产品支持情况
     * @param CheckStatus 产品支持情况
     */
    public void setCheckStatus(FilterDataObject [] CheckStatus) {
        this.CheckStatus = CheckStatus;
    }

    /**
     * Get 攻击热度枚举 
     * @return AttackHeat 攻击热度枚举
     */
    public FilterDataObject [] getAttackHeat() {
        return this.AttackHeat;
    }

    /**
     * Set 攻击热度枚举
     * @param AttackHeat 攻击热度枚举
     */
    public void setAttackHeat(FilterDataObject [] AttackHeat) {
        this.AttackHeat = AttackHeat;
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

    public DescribeVULListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVULListResponse(DescribeVULListResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.Data != null) {
            this.Data = new VULBaseInfo[source.Data.length];
            for (int i = 0; i < source.Data.length; i++) {
                this.Data[i] = new VULBaseInfo(source.Data[i]);
            }
        }
        if (source.VULTypeLists != null) {
            this.VULTypeLists = new FilterDataObject[source.VULTypeLists.length];
            for (int i = 0; i < source.VULTypeLists.length; i++) {
                this.VULTypeLists[i] = new FilterDataObject(source.VULTypeLists[i]);
            }
        }
        if (source.RiskLevels != null) {
            this.RiskLevels = new FilterDataObject[source.RiskLevels.length];
            for (int i = 0; i < source.RiskLevels.length; i++) {
                this.RiskLevels[i] = new FilterDataObject(source.RiskLevels[i]);
            }
        }
        if (source.Tags != null) {
            this.Tags = new FilterDataObject[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new FilterDataObject(source.Tags[i]);
            }
        }
        if (source.ProductSupport != null) {
            this.ProductSupport = new FilterDataObject[source.ProductSupport.length];
            for (int i = 0; i < source.ProductSupport.length; i++) {
                this.ProductSupport[i] = new FilterDataObject(source.ProductSupport[i]);
            }
        }
        if (source.CheckStatus != null) {
            this.CheckStatus = new FilterDataObject[source.CheckStatus.length];
            for (int i = 0; i < source.CheckStatus.length; i++) {
                this.CheckStatus[i] = new FilterDataObject(source.CheckStatus[i]);
            }
        }
        if (source.AttackHeat != null) {
            this.AttackHeat = new FilterDataObject[source.AttackHeat.length];
            for (int i = 0; i < source.AttackHeat.length; i++) {
                this.AttackHeat[i] = new FilterDataObject(source.AttackHeat[i]);
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
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "Data.", this.Data);
        this.setParamArrayObj(map, prefix + "VULTypeLists.", this.VULTypeLists);
        this.setParamArrayObj(map, prefix + "RiskLevels.", this.RiskLevels);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamArrayObj(map, prefix + "ProductSupport.", this.ProductSupport);
        this.setParamArrayObj(map, prefix + "CheckStatus.", this.CheckStatus);
        this.setParamArrayObj(map, prefix + "AttackHeat.", this.AttackHeat);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

