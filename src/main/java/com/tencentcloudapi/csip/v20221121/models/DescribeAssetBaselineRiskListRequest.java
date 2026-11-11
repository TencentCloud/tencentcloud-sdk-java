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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAssetBaselineRiskListRequest extends AbstractModel {

    /**
    * <p>资产唯一标识（UUID），与 AssetType 组合定位具体资产。</p>
    */
    @SerializedName("AssetUniqueID")
    @Expose
    private String AssetUniqueID;

    /**
    * <p>资产类型。取值：HOST（主机）、CLUSTER（集群）。</p>
    */
    @SerializedName("AssetType")
    @Expose
    private String AssetType;

    /**
    * <p>资产所属appid</p>
    */
    @SerializedName("AssetAppID")
    @Expose
    private Long AssetAppID;

    /**
    * <p>集团账号的成员id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>通用过滤条件。支持字段：ItemName（检测项名称，模糊）、PolicyName（所属基线名称，模糊）、ResultStatus（结果状态）、RiskLevel（风险等级）。不同 Name 之间为且关系，同一 Name 下多个 Values 为或关系。</p>
    */
    @SerializedName("Filters")
    @Expose
    private Filters [] Filters;

    /**
    * <p>分页查询每页数量，最大值 100；超过时服务端将自动回退为默认值 10。</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>分页查询起始偏移量，从 0 开始。</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get <p>资产唯一标识（UUID），与 AssetType 组合定位具体资产。</p> 
     * @return AssetUniqueID <p>资产唯一标识（UUID），与 AssetType 组合定位具体资产。</p>
     */
    public String getAssetUniqueID() {
        return this.AssetUniqueID;
    }

    /**
     * Set <p>资产唯一标识（UUID），与 AssetType 组合定位具体资产。</p>
     * @param AssetUniqueID <p>资产唯一标识（UUID），与 AssetType 组合定位具体资产。</p>
     */
    public void setAssetUniqueID(String AssetUniqueID) {
        this.AssetUniqueID = AssetUniqueID;
    }

    /**
     * Get <p>资产类型。取值：HOST（主机）、CLUSTER（集群）。</p> 
     * @return AssetType <p>资产类型。取值：HOST（主机）、CLUSTER（集群）。</p>
     */
    public String getAssetType() {
        return this.AssetType;
    }

    /**
     * Set <p>资产类型。取值：HOST（主机）、CLUSTER（集群）。</p>
     * @param AssetType <p>资产类型。取值：HOST（主机）、CLUSTER（集群）。</p>
     */
    public void setAssetType(String AssetType) {
        this.AssetType = AssetType;
    }

    /**
     * Get <p>资产所属appid</p> 
     * @return AssetAppID <p>资产所属appid</p>
     */
    public Long getAssetAppID() {
        return this.AssetAppID;
    }

    /**
     * Set <p>资产所属appid</p>
     * @param AssetAppID <p>资产所属appid</p>
     */
    public void setAssetAppID(Long AssetAppID) {
        this.AssetAppID = AssetAppID;
    }

    /**
     * Get <p>集团账号的成员id</p> 
     * @return MemberId <p>集团账号的成员id</p>
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set <p>集团账号的成员id</p>
     * @param MemberId <p>集团账号的成员id</p>
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get <p>通用过滤条件。支持字段：ItemName（检测项名称，模糊）、PolicyName（所属基线名称，模糊）、ResultStatus（结果状态）、RiskLevel（风险等级）。不同 Name 之间为且关系，同一 Name 下多个 Values 为或关系。</p> 
     * @return Filters <p>通用过滤条件。支持字段：ItemName（检测项名称，模糊）、PolicyName（所属基线名称，模糊）、ResultStatus（结果状态）、RiskLevel（风险等级）。不同 Name 之间为且关系，同一 Name 下多个 Values 为或关系。</p>
     */
    public Filters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>通用过滤条件。支持字段：ItemName（检测项名称，模糊）、PolicyName（所属基线名称，模糊）、ResultStatus（结果状态）、RiskLevel（风险等级）。不同 Name 之间为且关系，同一 Name 下多个 Values 为或关系。</p>
     * @param Filters <p>通用过滤条件。支持字段：ItemName（检测项名称，模糊）、PolicyName（所属基线名称，模糊）、ResultStatus（结果状态）、RiskLevel（风险等级）。不同 Name 之间为且关系，同一 Name 下多个 Values 为或关系。</p>
     */
    public void setFilters(Filters [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>分页查询每页数量，最大值 100；超过时服务端将自动回退为默认值 10。</p> 
     * @return Limit <p>分页查询每页数量，最大值 100；超过时服务端将自动回退为默认值 10。</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>分页查询每页数量，最大值 100；超过时服务端将自动回退为默认值 10。</p>
     * @param Limit <p>分页查询每页数量，最大值 100；超过时服务端将自动回退为默认值 10。</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>分页查询起始偏移量，从 0 开始。</p> 
     * @return Offset <p>分页查询起始偏移量，从 0 开始。</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>分页查询起始偏移量，从 0 开始。</p>
     * @param Offset <p>分页查询起始偏移量，从 0 开始。</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public DescribeAssetBaselineRiskListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAssetBaselineRiskListRequest(DescribeAssetBaselineRiskListRequest source) {
        if (source.AssetUniqueID != null) {
            this.AssetUniqueID = new String(source.AssetUniqueID);
        }
        if (source.AssetType != null) {
            this.AssetType = new String(source.AssetType);
        }
        if (source.AssetAppID != null) {
            this.AssetAppID = new Long(source.AssetAppID);
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.Filters != null) {
            this.Filters = new Filters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filters(source.Filters[i]);
            }
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AssetUniqueID", this.AssetUniqueID);
        this.setParamSimple(map, prefix + "AssetType", this.AssetType);
        this.setParamSimple(map, prefix + "AssetAppID", this.AssetAppID);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

