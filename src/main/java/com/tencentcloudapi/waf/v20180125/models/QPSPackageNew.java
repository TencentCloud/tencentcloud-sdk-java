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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QPSPackageNew extends AbstractModel{

    /**
    * 资源ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceIds")
    @Expose
    private String ResourceIds;

    /**
    * 过期时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ValidTime")
    @Expose
    private String ValidTime;

    /**
    * 是否自动续费，1：自动续费，0：不自动续费
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RenewFlag")
    @Expose
    private Long RenewFlag;

    /**
    * 套餐购买个数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * 套餐购买地域，clb-waf暂时没有用到
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 计费项
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BillingItem")
    @Expose
    private String BillingItem;

    /**
     * Get 资源ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceIds 资源ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResourceIds() {
        return this.ResourceIds;
    }

    /**
     * Set 资源ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceIds 资源ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceIds(String ResourceIds) {
        this.ResourceIds = ResourceIds;
    }

    /**
     * Get 过期时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ValidTime 过期时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getValidTime() {
        return this.ValidTime;
    }

    /**
     * Set 过期时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ValidTime 过期时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setValidTime(String ValidTime) {
        this.ValidTime = ValidTime;
    }

    /**
     * Get 是否自动续费，1：自动续费，0：不自动续费
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RenewFlag 是否自动续费，1：自动续费，0：不自动续费
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set 是否自动续费，1：自动续费，0：不自动续费
注意：此字段可能返回 null，表示取不到有效值。
     * @param RenewFlag 是否自动续费，1：自动续费，0：不自动续费
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRenewFlag(Long RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get 套餐购买个数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Count 套餐购买个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 套餐购买个数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Count 套餐购买个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get 套餐购买地域，clb-waf暂时没有用到
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Region 套餐购买地域，clb-waf暂时没有用到
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 套餐购买地域，clb-waf暂时没有用到
注意：此字段可能返回 null，表示取不到有效值。
     * @param Region 套餐购买地域，clb-waf暂时没有用到
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 计费项
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BillingItem 计费项
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBillingItem() {
        return this.BillingItem;
    }

    /**
     * Set 计费项
注意：此字段可能返回 null，表示取不到有效值。
     * @param BillingItem 计费项
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBillingItem(String BillingItem) {
        this.BillingItem = BillingItem;
    }

    public QPSPackageNew() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QPSPackageNew(QPSPackageNew source) {
        if (source.ResourceIds != null) {
            this.ResourceIds = new String(source.ResourceIds);
        }
        if (source.ValidTime != null) {
            this.ValidTime = new String(source.ValidTime);
        }
        if (source.RenewFlag != null) {
            this.RenewFlag = new Long(source.RenewFlag);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.BillingItem != null) {
            this.BillingItem = new String(source.BillingItem);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceIds", this.ResourceIds);
        this.setParamSimple(map, prefix + "ValidTime", this.ValidTime);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "BillingItem", this.BillingItem);

    }
}

