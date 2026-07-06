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
package com.tencentcloudapi.fwm.v20250611.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AccountProductDetailStats extends AbstractModel {

    /**
    * 产品类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
    * 产品名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProductName")
    @Expose
    private String ProductName;

    /**
    * 体检策略数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PolicyCount")
    @Expose
    private Long PolicyCount;

    /**
    * 待整改风险数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UntreatedRiskCount")
    @Expose
    private Long UntreatedRiskCount;

    /**
    * 总风险数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalRiskCount")
    @Expose
    private Long TotalRiskCount;

    /**
    * 已处置数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TreatedRiskCount")
    @Expose
    private Long TreatedRiskCount;

    /**
    * 已忽略数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IgnoredRiskCount")
    @Expose
    private Long IgnoredRiskCount;

    /**
    * 整改率，如 50%，无需整改时为 无需整改
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RectifyRate")
    @Expose
    private String RectifyRate;

    /**
    * 最近一次体检时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastCheckTime")
    @Expose
    private String LastCheckTime;

    /**
    * 子类 ID 列表
    */
    @SerializedName("SubcategoryIds")
    @Expose
    private String [] SubcategoryIds;

    /**
    * 是否超时未体检
    */
    @SerializedName("IsOverdue")
    @Expose
    private Boolean IsOverdue;

    /**
     * Get 产品类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Product 产品类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set 产品类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param Product 产品类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    /**
     * Get 产品名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProductName 产品名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProductName() {
        return this.ProductName;
    }

    /**
     * Set 产品名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProductName 产品名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    /**
     * Get 体检策略数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PolicyCount 体检策略数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPolicyCount() {
        return this.PolicyCount;
    }

    /**
     * Set 体检策略数
注意：此字段可能返回 null，表示取不到有效值。
     * @param PolicyCount 体检策略数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPolicyCount(Long PolicyCount) {
        this.PolicyCount = PolicyCount;
    }

    /**
     * Get 待整改风险数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UntreatedRiskCount 待整改风险数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getUntreatedRiskCount() {
        return this.UntreatedRiskCount;
    }

    /**
     * Set 待整改风险数
注意：此字段可能返回 null，表示取不到有效值。
     * @param UntreatedRiskCount 待整改风险数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUntreatedRiskCount(Long UntreatedRiskCount) {
        this.UntreatedRiskCount = UntreatedRiskCount;
    }

    /**
     * Get 总风险数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalRiskCount 总风险数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotalRiskCount() {
        return this.TotalRiskCount;
    }

    /**
     * Set 总风险数
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalRiskCount 总风险数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalRiskCount(Long TotalRiskCount) {
        this.TotalRiskCount = TotalRiskCount;
    }

    /**
     * Get 已处置数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TreatedRiskCount 已处置数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTreatedRiskCount() {
        return this.TreatedRiskCount;
    }

    /**
     * Set 已处置数
注意：此字段可能返回 null，表示取不到有效值。
     * @param TreatedRiskCount 已处置数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTreatedRiskCount(Long TreatedRiskCount) {
        this.TreatedRiskCount = TreatedRiskCount;
    }

    /**
     * Get 已忽略数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IgnoredRiskCount 已忽略数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIgnoredRiskCount() {
        return this.IgnoredRiskCount;
    }

    /**
     * Set 已忽略数
注意：此字段可能返回 null，表示取不到有效值。
     * @param IgnoredRiskCount 已忽略数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIgnoredRiskCount(Long IgnoredRiskCount) {
        this.IgnoredRiskCount = IgnoredRiskCount;
    }

    /**
     * Get 整改率，如 50%，无需整改时为 无需整改
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RectifyRate 整改率，如 50%，无需整改时为 无需整改
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRectifyRate() {
        return this.RectifyRate;
    }

    /**
     * Set 整改率，如 50%，无需整改时为 无需整改
注意：此字段可能返回 null，表示取不到有效值。
     * @param RectifyRate 整改率，如 50%，无需整改时为 无需整改
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRectifyRate(String RectifyRate) {
        this.RectifyRate = RectifyRate;
    }

    /**
     * Get 最近一次体检时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastCheckTime 最近一次体检时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLastCheckTime() {
        return this.LastCheckTime;
    }

    /**
     * Set 最近一次体检时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastCheckTime 最近一次体检时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastCheckTime(String LastCheckTime) {
        this.LastCheckTime = LastCheckTime;
    }

    /**
     * Get 子类 ID 列表 
     * @return SubcategoryIds 子类 ID 列表
     */
    public String [] getSubcategoryIds() {
        return this.SubcategoryIds;
    }

    /**
     * Set 子类 ID 列表
     * @param SubcategoryIds 子类 ID 列表
     */
    public void setSubcategoryIds(String [] SubcategoryIds) {
        this.SubcategoryIds = SubcategoryIds;
    }

    /**
     * Get 是否超时未体检 
     * @return IsOverdue 是否超时未体检
     */
    public Boolean getIsOverdue() {
        return this.IsOverdue;
    }

    /**
     * Set 是否超时未体检
     * @param IsOverdue 是否超时未体检
     */
    public void setIsOverdue(Boolean IsOverdue) {
        this.IsOverdue = IsOverdue;
    }

    public AccountProductDetailStats() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AccountProductDetailStats(AccountProductDetailStats source) {
        if (source.Product != null) {
            this.Product = new String(source.Product);
        }
        if (source.ProductName != null) {
            this.ProductName = new String(source.ProductName);
        }
        if (source.PolicyCount != null) {
            this.PolicyCount = new Long(source.PolicyCount);
        }
        if (source.UntreatedRiskCount != null) {
            this.UntreatedRiskCount = new Long(source.UntreatedRiskCount);
        }
        if (source.TotalRiskCount != null) {
            this.TotalRiskCount = new Long(source.TotalRiskCount);
        }
        if (source.TreatedRiskCount != null) {
            this.TreatedRiskCount = new Long(source.TreatedRiskCount);
        }
        if (source.IgnoredRiskCount != null) {
            this.IgnoredRiskCount = new Long(source.IgnoredRiskCount);
        }
        if (source.RectifyRate != null) {
            this.RectifyRate = new String(source.RectifyRate);
        }
        if (source.LastCheckTime != null) {
            this.LastCheckTime = new String(source.LastCheckTime);
        }
        if (source.SubcategoryIds != null) {
            this.SubcategoryIds = new String[source.SubcategoryIds.length];
            for (int i = 0; i < source.SubcategoryIds.length; i++) {
                this.SubcategoryIds[i] = new String(source.SubcategoryIds[i]);
            }
        }
        if (source.IsOverdue != null) {
            this.IsOverdue = new Boolean(source.IsOverdue);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Product", this.Product);
        this.setParamSimple(map, prefix + "ProductName", this.ProductName);
        this.setParamSimple(map, prefix + "PolicyCount", this.PolicyCount);
        this.setParamSimple(map, prefix + "UntreatedRiskCount", this.UntreatedRiskCount);
        this.setParamSimple(map, prefix + "TotalRiskCount", this.TotalRiskCount);
        this.setParamSimple(map, prefix + "TreatedRiskCount", this.TreatedRiskCount);
        this.setParamSimple(map, prefix + "IgnoredRiskCount", this.IgnoredRiskCount);
        this.setParamSimple(map, prefix + "RectifyRate", this.RectifyRate);
        this.setParamSimple(map, prefix + "LastCheckTime", this.LastCheckTime);
        this.setParamArraySimple(map, prefix + "SubcategoryIds.", this.SubcategoryIds);
        this.setParamSimple(map, prefix + "IsOverdue", this.IsOverdue);

    }
}

