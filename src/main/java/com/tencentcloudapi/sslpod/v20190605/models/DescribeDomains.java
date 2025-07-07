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
package com.tencentcloudapi.sslpod.v20190605.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDomains extends AbstractModel {

    /**
    * 列表数据
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Result")
    @Expose
    private DomainSiteInfo [] Result;

    /**
    * 搜索出来的数量
    */
    @SerializedName("SearchTotal")
    @Expose
    private Long SearchTotal;

    /**
    * 总数
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 允许的监控数量
    */
    @SerializedName("AllowMonitoringCount")
    @Expose
    private Long AllowMonitoringCount;

    /**
    * 当前监控的数量
    */
    @SerializedName("CurrentMonitoringCount")
    @Expose
    private Long CurrentMonitoringCount;

    /**
    * 允许添加域名总数
    */
    @SerializedName("AllowMaxAddDomain")
    @Expose
    private Long AllowMaxAddDomain;

    /**
     * Get 列表数据
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Result 列表数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DomainSiteInfo [] getResult() {
        return this.Result;
    }

    /**
     * Set 列表数据
注意：此字段可能返回 null，表示取不到有效值。
     * @param Result 列表数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResult(DomainSiteInfo [] Result) {
        this.Result = Result;
    }

    /**
     * Get 搜索出来的数量 
     * @return SearchTotal 搜索出来的数量
     */
    public Long getSearchTotal() {
        return this.SearchTotal;
    }

    /**
     * Set 搜索出来的数量
     * @param SearchTotal 搜索出来的数量
     */
    public void setSearchTotal(Long SearchTotal) {
        this.SearchTotal = SearchTotal;
    }

    /**
     * Get 总数 
     * @return Total 总数
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 总数
     * @param Total 总数
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get 允许的监控数量 
     * @return AllowMonitoringCount 允许的监控数量
     */
    public Long getAllowMonitoringCount() {
        return this.AllowMonitoringCount;
    }

    /**
     * Set 允许的监控数量
     * @param AllowMonitoringCount 允许的监控数量
     */
    public void setAllowMonitoringCount(Long AllowMonitoringCount) {
        this.AllowMonitoringCount = AllowMonitoringCount;
    }

    /**
     * Get 当前监控的数量 
     * @return CurrentMonitoringCount 当前监控的数量
     */
    public Long getCurrentMonitoringCount() {
        return this.CurrentMonitoringCount;
    }

    /**
     * Set 当前监控的数量
     * @param CurrentMonitoringCount 当前监控的数量
     */
    public void setCurrentMonitoringCount(Long CurrentMonitoringCount) {
        this.CurrentMonitoringCount = CurrentMonitoringCount;
    }

    /**
     * Get 允许添加域名总数 
     * @return AllowMaxAddDomain 允许添加域名总数
     */
    public Long getAllowMaxAddDomain() {
        return this.AllowMaxAddDomain;
    }

    /**
     * Set 允许添加域名总数
     * @param AllowMaxAddDomain 允许添加域名总数
     */
    public void setAllowMaxAddDomain(Long AllowMaxAddDomain) {
        this.AllowMaxAddDomain = AllowMaxAddDomain;
    }

    public DescribeDomains() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDomains(DescribeDomains source) {
        if (source.Result != null) {
            this.Result = new DomainSiteInfo[source.Result.length];
            for (int i = 0; i < source.Result.length; i++) {
                this.Result[i] = new DomainSiteInfo(source.Result[i]);
            }
        }
        if (source.SearchTotal != null) {
            this.SearchTotal = new Long(source.SearchTotal);
        }
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.AllowMonitoringCount != null) {
            this.AllowMonitoringCount = new Long(source.AllowMonitoringCount);
        }
        if (source.CurrentMonitoringCount != null) {
            this.CurrentMonitoringCount = new Long(source.CurrentMonitoringCount);
        }
        if (source.AllowMaxAddDomain != null) {
            this.AllowMaxAddDomain = new Long(source.AllowMaxAddDomain);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Result.", this.Result);
        this.setParamSimple(map, prefix + "SearchTotal", this.SearchTotal);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "AllowMonitoringCount", this.AllowMonitoringCount);
        this.setParamSimple(map, prefix + "CurrentMonitoringCount", this.CurrentMonitoringCount);
        this.setParamSimple(map, prefix + "AllowMaxAddDomain", this.AllowMaxAddDomain);

    }
}

