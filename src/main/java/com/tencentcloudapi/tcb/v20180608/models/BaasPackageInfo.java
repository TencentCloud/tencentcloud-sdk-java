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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BaasPackageInfo extends AbstractModel{

    /**
    * DAU产品套餐ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PackageName")
    @Expose
    private String PackageName;

    /**
    * DAU套餐中文名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PackageTitle")
    @Expose
    private String PackageTitle;

    /**
    * 套餐分组
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * 套餐分组中文名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GroupTitle")
    @Expose
    private String GroupTitle;

    /**
    * json格式化计费标签，例如：
{"pid":2, "cids":{"create": 2, "renew": 2, "modify": 2}, "productCode":"p_tcb_mp", "subProductCode":"sp_tcb_mp_cloudbase_dau"}
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BillTags")
    @Expose
    private String BillTags;

    /**
    * json格式化用户资源限制，例如：
{"Qps":1000,"InvokeNum":{"TimeUnit":"m", "Unit":"万次", "MaxSize": 100},"Capacity":{"TimeUnit":"m", "Unit":"GB", "MaxSize": 100}, "Cdn":{"Flux":{"TimeUnit":"m", "Unit":"GB", "MaxSize": 100}, "BackFlux":{"TimeUnit":"m", "Unit":"GB", "MaxSize": 100}},"Scf":{"Concurrency":1000,"OutFlux":{"TimeUnit":"m", "Unit":"GB", "MaxSize": 100},"MemoryUse":{"TimeUnit":"m", "Unit":"WGBS", "MaxSize": 100000}}}
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceLimit")
    @Expose
    private String ResourceLimit;

    /**
    * json格式化高级限制，例如：
{"CMSEnable":false,"ProvisionedConcurrencyMem":512000, "PictureProcessing":false, "SecurityAudit":false, "RealTimePush":false, "TemplateMessageBatchPush":false, "Payment":false}
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AdvanceLimit")
    @Expose
    private String AdvanceLimit;

    /**
    * 套餐描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PackageDescription")
    @Expose
    private String PackageDescription;

    /**
    * 是否对外展示
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsExternal")
    @Expose
    private Boolean IsExternal;

    /**
     * Get DAU产品套餐ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PackageName DAU产品套餐ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPackageName() {
        return this.PackageName;
    }

    /**
     * Set DAU产品套餐ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param PackageName DAU产品套餐ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPackageName(String PackageName) {
        this.PackageName = PackageName;
    }

    /**
     * Get DAU套餐中文名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PackageTitle DAU套餐中文名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPackageTitle() {
        return this.PackageTitle;
    }

    /**
     * Set DAU套餐中文名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param PackageTitle DAU套餐中文名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPackageTitle(String PackageTitle) {
        this.PackageTitle = PackageTitle;
    }

    /**
     * Get 套餐分组
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GroupName 套餐分组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set 套餐分组
注意：此字段可能返回 null，表示取不到有效值。
     * @param GroupName 套餐分组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get 套餐分组中文名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GroupTitle 套餐分组中文名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGroupTitle() {
        return this.GroupTitle;
    }

    /**
     * Set 套餐分组中文名
注意：此字段可能返回 null，表示取不到有效值。
     * @param GroupTitle 套餐分组中文名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGroupTitle(String GroupTitle) {
        this.GroupTitle = GroupTitle;
    }

    /**
     * Get json格式化计费标签，例如：
{"pid":2, "cids":{"create": 2, "renew": 2, "modify": 2}, "productCode":"p_tcb_mp", "subProductCode":"sp_tcb_mp_cloudbase_dau"}
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BillTags json格式化计费标签，例如：
{"pid":2, "cids":{"create": 2, "renew": 2, "modify": 2}, "productCode":"p_tcb_mp", "subProductCode":"sp_tcb_mp_cloudbase_dau"}
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBillTags() {
        return this.BillTags;
    }

    /**
     * Set json格式化计费标签，例如：
{"pid":2, "cids":{"create": 2, "renew": 2, "modify": 2}, "productCode":"p_tcb_mp", "subProductCode":"sp_tcb_mp_cloudbase_dau"}
注意：此字段可能返回 null，表示取不到有效值。
     * @param BillTags json格式化计费标签，例如：
{"pid":2, "cids":{"create": 2, "renew": 2, "modify": 2}, "productCode":"p_tcb_mp", "subProductCode":"sp_tcb_mp_cloudbase_dau"}
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBillTags(String BillTags) {
        this.BillTags = BillTags;
    }

    /**
     * Get json格式化用户资源限制，例如：
{"Qps":1000,"InvokeNum":{"TimeUnit":"m", "Unit":"万次", "MaxSize": 100},"Capacity":{"TimeUnit":"m", "Unit":"GB", "MaxSize": 100}, "Cdn":{"Flux":{"TimeUnit":"m", "Unit":"GB", "MaxSize": 100}, "BackFlux":{"TimeUnit":"m", "Unit":"GB", "MaxSize": 100}},"Scf":{"Concurrency":1000,"OutFlux":{"TimeUnit":"m", "Unit":"GB", "MaxSize": 100},"MemoryUse":{"TimeUnit":"m", "Unit":"WGBS", "MaxSize": 100000}}}
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceLimit json格式化用户资源限制，例如：
{"Qps":1000,"InvokeNum":{"TimeUnit":"m", "Unit":"万次", "MaxSize": 100},"Capacity":{"TimeUnit":"m", "Unit":"GB", "MaxSize": 100}, "Cdn":{"Flux":{"TimeUnit":"m", "Unit":"GB", "MaxSize": 100}, "BackFlux":{"TimeUnit":"m", "Unit":"GB", "MaxSize": 100}},"Scf":{"Concurrency":1000,"OutFlux":{"TimeUnit":"m", "Unit":"GB", "MaxSize": 100},"MemoryUse":{"TimeUnit":"m", "Unit":"WGBS", "MaxSize": 100000}}}
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResourceLimit() {
        return this.ResourceLimit;
    }

    /**
     * Set json格式化用户资源限制，例如：
{"Qps":1000,"InvokeNum":{"TimeUnit":"m", "Unit":"万次", "MaxSize": 100},"Capacity":{"TimeUnit":"m", "Unit":"GB", "MaxSize": 100}, "Cdn":{"Flux":{"TimeUnit":"m", "Unit":"GB", "MaxSize": 100}, "BackFlux":{"TimeUnit":"m", "Unit":"GB", "MaxSize": 100}},"Scf":{"Concurrency":1000,"OutFlux":{"TimeUnit":"m", "Unit":"GB", "MaxSize": 100},"MemoryUse":{"TimeUnit":"m", "Unit":"WGBS", "MaxSize": 100000}}}
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceLimit json格式化用户资源限制，例如：
{"Qps":1000,"InvokeNum":{"TimeUnit":"m", "Unit":"万次", "MaxSize": 100},"Capacity":{"TimeUnit":"m", "Unit":"GB", "MaxSize": 100}, "Cdn":{"Flux":{"TimeUnit":"m", "Unit":"GB", "MaxSize": 100}, "BackFlux":{"TimeUnit":"m", "Unit":"GB", "MaxSize": 100}},"Scf":{"Concurrency":1000,"OutFlux":{"TimeUnit":"m", "Unit":"GB", "MaxSize": 100},"MemoryUse":{"TimeUnit":"m", "Unit":"WGBS", "MaxSize": 100000}}}
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceLimit(String ResourceLimit) {
        this.ResourceLimit = ResourceLimit;
    }

    /**
     * Get json格式化高级限制，例如：
{"CMSEnable":false,"ProvisionedConcurrencyMem":512000, "PictureProcessing":false, "SecurityAudit":false, "RealTimePush":false, "TemplateMessageBatchPush":false, "Payment":false}
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AdvanceLimit json格式化高级限制，例如：
{"CMSEnable":false,"ProvisionedConcurrencyMem":512000, "PictureProcessing":false, "SecurityAudit":false, "RealTimePush":false, "TemplateMessageBatchPush":false, "Payment":false}
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAdvanceLimit() {
        return this.AdvanceLimit;
    }

    /**
     * Set json格式化高级限制，例如：
{"CMSEnable":false,"ProvisionedConcurrencyMem":512000, "PictureProcessing":false, "SecurityAudit":false, "RealTimePush":false, "TemplateMessageBatchPush":false, "Payment":false}
注意：此字段可能返回 null，表示取不到有效值。
     * @param AdvanceLimit json格式化高级限制，例如：
{"CMSEnable":false,"ProvisionedConcurrencyMem":512000, "PictureProcessing":false, "SecurityAudit":false, "RealTimePush":false, "TemplateMessageBatchPush":false, "Payment":false}
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAdvanceLimit(String AdvanceLimit) {
        this.AdvanceLimit = AdvanceLimit;
    }

    /**
     * Get 套餐描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PackageDescription 套餐描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPackageDescription() {
        return this.PackageDescription;
    }

    /**
     * Set 套餐描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param PackageDescription 套餐描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPackageDescription(String PackageDescription) {
        this.PackageDescription = PackageDescription;
    }

    /**
     * Get 是否对外展示
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsExternal 是否对外展示
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsExternal() {
        return this.IsExternal;
    }

    /**
     * Set 是否对外展示
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsExternal 是否对外展示
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsExternal(Boolean IsExternal) {
        this.IsExternal = IsExternal;
    }

    public BaasPackageInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BaasPackageInfo(BaasPackageInfo source) {
        if (source.PackageName != null) {
            this.PackageName = new String(source.PackageName);
        }
        if (source.PackageTitle != null) {
            this.PackageTitle = new String(source.PackageTitle);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.GroupTitle != null) {
            this.GroupTitle = new String(source.GroupTitle);
        }
        if (source.BillTags != null) {
            this.BillTags = new String(source.BillTags);
        }
        if (source.ResourceLimit != null) {
            this.ResourceLimit = new String(source.ResourceLimit);
        }
        if (source.AdvanceLimit != null) {
            this.AdvanceLimit = new String(source.AdvanceLimit);
        }
        if (source.PackageDescription != null) {
            this.PackageDescription = new String(source.PackageDescription);
        }
        if (source.IsExternal != null) {
            this.IsExternal = new Boolean(source.IsExternal);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PackageName", this.PackageName);
        this.setParamSimple(map, prefix + "PackageTitle", this.PackageTitle);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "GroupTitle", this.GroupTitle);
        this.setParamSimple(map, prefix + "BillTags", this.BillTags);
        this.setParamSimple(map, prefix + "ResourceLimit", this.ResourceLimit);
        this.setParamSimple(map, prefix + "AdvanceLimit", this.AdvanceLimit);
        this.setParamSimple(map, prefix + "PackageDescription", this.PackageDescription);
        this.setParamSimple(map, prefix + "IsExternal", this.IsExternal);

    }
}

