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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateBillDealRequest extends AbstractModel {

    /**
    * 当前下单的操作类型，可取[purchase,renew,modify]三种值，分别代表新购，续费，变配。
    */
    @SerializedName("DealType")
    @Expose
    private String DealType;

    /**
    * 购买的产品类型，可取[tcb-baas,tcb-promotion,tcb-package], 分别代表baas套餐、大促包、资源包
    */
    @SerializedName("ProductType")
    @Expose
    private String ProductType;

    /**
    * 目标下单产品/套餐Id
    */
    @SerializedName("PackageId")
    @Expose
    private String PackageId;

    /**
    * 默认只下单不支付，为ture则下单并支付
    */
    @SerializedName("CreateAndPay")
    @Expose
    private Boolean CreateAndPay;

    /**
    * 购买时长
    */
    @SerializedName("TimeSpan")
    @Expose
    private Long TimeSpan;

    /**
    * 购买时长单位,按各产品规则可选d(天),m(月),y(年),p(一次性)
    */
    @SerializedName("TimeUnit")
    @Expose
    private String TimeUnit;

    /**
    * 资源唯一标识
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 来源可选[qcloud,miniapp]，默认qcloud
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * 资源别名
    */
    @SerializedName("Alias")
    @Expose
    private String Alias;

    /**
    * 环境id
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

    /**
    * 开启超限按量
    */
    @SerializedName("EnableExcess")
    @Expose
    private Boolean EnableExcess;

    /**
    * 变配目标产品/套餐id
    */
    @SerializedName("ModifyPackageId")
    @Expose
    private String ModifyPackageId;

    /**
    * jsonstr附加信息
    */
    @SerializedName("Extension")
    @Expose
    private String Extension;

    /**
    * 是否自动选择代金券支付
    */
    @SerializedName("AutoVoucher")
    @Expose
    private Boolean AutoVoucher;

    /**
    * 资源类型。
代表新购环境（DealType=purchase 并且 ProductType=tcb-baas ）时需要发货哪些资源。
可取值：flexdb, cos, cdn, scf

    */
    @SerializedName("ResourceTypes")
    @Expose
    private String [] ResourceTypes;

    /**
    * 环境标签。
 代表新购环境（DealType=purchase 并且 ProductType=tcb-baas ）时需要打的标签。

    */
    @SerializedName("EnvTags")
    @Expose
    private Tag [] EnvTags;

    /**
     * Get 当前下单的操作类型，可取[purchase,renew,modify]三种值，分别代表新购，续费，变配。 
     * @return DealType 当前下单的操作类型，可取[purchase,renew,modify]三种值，分别代表新购，续费，变配。
     */
    public String getDealType() {
        return this.DealType;
    }

    /**
     * Set 当前下单的操作类型，可取[purchase,renew,modify]三种值，分别代表新购，续费，变配。
     * @param DealType 当前下单的操作类型，可取[purchase,renew,modify]三种值，分别代表新购，续费，变配。
     */
    public void setDealType(String DealType) {
        this.DealType = DealType;
    }

    /**
     * Get 购买的产品类型，可取[tcb-baas,tcb-promotion,tcb-package], 分别代表baas套餐、大促包、资源包 
     * @return ProductType 购买的产品类型，可取[tcb-baas,tcb-promotion,tcb-package], 分别代表baas套餐、大促包、资源包
     */
    public String getProductType() {
        return this.ProductType;
    }

    /**
     * Set 购买的产品类型，可取[tcb-baas,tcb-promotion,tcb-package], 分别代表baas套餐、大促包、资源包
     * @param ProductType 购买的产品类型，可取[tcb-baas,tcb-promotion,tcb-package], 分别代表baas套餐、大促包、资源包
     */
    public void setProductType(String ProductType) {
        this.ProductType = ProductType;
    }

    /**
     * Get 目标下单产品/套餐Id 
     * @return PackageId 目标下单产品/套餐Id
     */
    public String getPackageId() {
        return this.PackageId;
    }

    /**
     * Set 目标下单产品/套餐Id
     * @param PackageId 目标下单产品/套餐Id
     */
    public void setPackageId(String PackageId) {
        this.PackageId = PackageId;
    }

    /**
     * Get 默认只下单不支付，为ture则下单并支付 
     * @return CreateAndPay 默认只下单不支付，为ture则下单并支付
     */
    public Boolean getCreateAndPay() {
        return this.CreateAndPay;
    }

    /**
     * Set 默认只下单不支付，为ture则下单并支付
     * @param CreateAndPay 默认只下单不支付，为ture则下单并支付
     */
    public void setCreateAndPay(Boolean CreateAndPay) {
        this.CreateAndPay = CreateAndPay;
    }

    /**
     * Get 购买时长 
     * @return TimeSpan 购买时长
     */
    public Long getTimeSpan() {
        return this.TimeSpan;
    }

    /**
     * Set 购买时长
     * @param TimeSpan 购买时长
     */
    public void setTimeSpan(Long TimeSpan) {
        this.TimeSpan = TimeSpan;
    }

    /**
     * Get 购买时长单位,按各产品规则可选d(天),m(月),y(年),p(一次性) 
     * @return TimeUnit 购买时长单位,按各产品规则可选d(天),m(月),y(年),p(一次性)
     */
    public String getTimeUnit() {
        return this.TimeUnit;
    }

    /**
     * Set 购买时长单位,按各产品规则可选d(天),m(月),y(年),p(一次性)
     * @param TimeUnit 购买时长单位,按各产品规则可选d(天),m(月),y(年),p(一次性)
     */
    public void setTimeUnit(String TimeUnit) {
        this.TimeUnit = TimeUnit;
    }

    /**
     * Get 资源唯一标识 
     * @return ResourceId 资源唯一标识
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 资源唯一标识
     * @param ResourceId 资源唯一标识
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get 来源可选[qcloud,miniapp]，默认qcloud 
     * @return Source 来源可选[qcloud,miniapp]，默认qcloud
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set 来源可选[qcloud,miniapp]，默认qcloud
     * @param Source 来源可选[qcloud,miniapp]，默认qcloud
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get 资源别名 
     * @return Alias 资源别名
     */
    public String getAlias() {
        return this.Alias;
    }

    /**
     * Set 资源别名
     * @param Alias 资源别名
     */
    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    /**
     * Get 环境id 
     * @return EnvId 环境id
     */
    public String getEnvId() {
        return this.EnvId;
    }

    /**
     * Set 环境id
     * @param EnvId 环境id
     */
    public void setEnvId(String EnvId) {
        this.EnvId = EnvId;
    }

    /**
     * Get 开启超限按量 
     * @return EnableExcess 开启超限按量
     */
    public Boolean getEnableExcess() {
        return this.EnableExcess;
    }

    /**
     * Set 开启超限按量
     * @param EnableExcess 开启超限按量
     */
    public void setEnableExcess(Boolean EnableExcess) {
        this.EnableExcess = EnableExcess;
    }

    /**
     * Get 变配目标产品/套餐id 
     * @return ModifyPackageId 变配目标产品/套餐id
     */
    public String getModifyPackageId() {
        return this.ModifyPackageId;
    }

    /**
     * Set 变配目标产品/套餐id
     * @param ModifyPackageId 变配目标产品/套餐id
     */
    public void setModifyPackageId(String ModifyPackageId) {
        this.ModifyPackageId = ModifyPackageId;
    }

    /**
     * Get jsonstr附加信息 
     * @return Extension jsonstr附加信息
     */
    public String getExtension() {
        return this.Extension;
    }

    /**
     * Set jsonstr附加信息
     * @param Extension jsonstr附加信息
     */
    public void setExtension(String Extension) {
        this.Extension = Extension;
    }

    /**
     * Get 是否自动选择代金券支付 
     * @return AutoVoucher 是否自动选择代金券支付
     */
    public Boolean getAutoVoucher() {
        return this.AutoVoucher;
    }

    /**
     * Set 是否自动选择代金券支付
     * @param AutoVoucher 是否自动选择代金券支付
     */
    public void setAutoVoucher(Boolean AutoVoucher) {
        this.AutoVoucher = AutoVoucher;
    }

    /**
     * Get 资源类型。
代表新购环境（DealType=purchase 并且 ProductType=tcb-baas ）时需要发货哪些资源。
可取值：flexdb, cos, cdn, scf
 
     * @return ResourceTypes 资源类型。
代表新购环境（DealType=purchase 并且 ProductType=tcb-baas ）时需要发货哪些资源。
可取值：flexdb, cos, cdn, scf

     */
    public String [] getResourceTypes() {
        return this.ResourceTypes;
    }

    /**
     * Set 资源类型。
代表新购环境（DealType=purchase 并且 ProductType=tcb-baas ）时需要发货哪些资源。
可取值：flexdb, cos, cdn, scf

     * @param ResourceTypes 资源类型。
代表新购环境（DealType=purchase 并且 ProductType=tcb-baas ）时需要发货哪些资源。
可取值：flexdb, cos, cdn, scf

     */
    public void setResourceTypes(String [] ResourceTypes) {
        this.ResourceTypes = ResourceTypes;
    }

    /**
     * Get 环境标签。
 代表新购环境（DealType=purchase 并且 ProductType=tcb-baas ）时需要打的标签。
 
     * @return EnvTags 环境标签。
 代表新购环境（DealType=purchase 并且 ProductType=tcb-baas ）时需要打的标签。

     */
    public Tag [] getEnvTags() {
        return this.EnvTags;
    }

    /**
     * Set 环境标签。
 代表新购环境（DealType=purchase 并且 ProductType=tcb-baas ）时需要打的标签。

     * @param EnvTags 环境标签。
 代表新购环境（DealType=purchase 并且 ProductType=tcb-baas ）时需要打的标签。

     */
    public void setEnvTags(Tag [] EnvTags) {
        this.EnvTags = EnvTags;
    }

    public CreateBillDealRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateBillDealRequest(CreateBillDealRequest source) {
        if (source.DealType != null) {
            this.DealType = new String(source.DealType);
        }
        if (source.ProductType != null) {
            this.ProductType = new String(source.ProductType);
        }
        if (source.PackageId != null) {
            this.PackageId = new String(source.PackageId);
        }
        if (source.CreateAndPay != null) {
            this.CreateAndPay = new Boolean(source.CreateAndPay);
        }
        if (source.TimeSpan != null) {
            this.TimeSpan = new Long(source.TimeSpan);
        }
        if (source.TimeUnit != null) {
            this.TimeUnit = new String(source.TimeUnit);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
        if (source.Alias != null) {
            this.Alias = new String(source.Alias);
        }
        if (source.EnvId != null) {
            this.EnvId = new String(source.EnvId);
        }
        if (source.EnableExcess != null) {
            this.EnableExcess = new Boolean(source.EnableExcess);
        }
        if (source.ModifyPackageId != null) {
            this.ModifyPackageId = new String(source.ModifyPackageId);
        }
        if (source.Extension != null) {
            this.Extension = new String(source.Extension);
        }
        if (source.AutoVoucher != null) {
            this.AutoVoucher = new Boolean(source.AutoVoucher);
        }
        if (source.ResourceTypes != null) {
            this.ResourceTypes = new String[source.ResourceTypes.length];
            for (int i = 0; i < source.ResourceTypes.length; i++) {
                this.ResourceTypes[i] = new String(source.ResourceTypes[i]);
            }
        }
        if (source.EnvTags != null) {
            this.EnvTags = new Tag[source.EnvTags.length];
            for (int i = 0; i < source.EnvTags.length; i++) {
                this.EnvTags[i] = new Tag(source.EnvTags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DealType", this.DealType);
        this.setParamSimple(map, prefix + "ProductType", this.ProductType);
        this.setParamSimple(map, prefix + "PackageId", this.PackageId);
        this.setParamSimple(map, prefix + "CreateAndPay", this.CreateAndPay);
        this.setParamSimple(map, prefix + "TimeSpan", this.TimeSpan);
        this.setParamSimple(map, prefix + "TimeUnit", this.TimeUnit);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "Alias", this.Alias);
        this.setParamSimple(map, prefix + "EnvId", this.EnvId);
        this.setParamSimple(map, prefix + "EnableExcess", this.EnableExcess);
        this.setParamSimple(map, prefix + "ModifyPackageId", this.ModifyPackageId);
        this.setParamSimple(map, prefix + "Extension", this.Extension);
        this.setParamSimple(map, prefix + "AutoVoucher", this.AutoVoucher);
        this.setParamArraySimple(map, prefix + "ResourceTypes.", this.ResourceTypes);
        this.setParamArrayObj(map, prefix + "EnvTags.", this.EnvTags);

    }
}

