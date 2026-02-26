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
    * 目标下单产品/套餐Id。
对于云开发环境套餐，可通过 DescribeBaasPackageList 接口获取，对应其出参的PackageName
    */
    @SerializedName("PackageId")
    @Expose
    private String PackageId;

    /**
    * 默认只下单不支付，为ture则下单并支付。
如果需要下单并支付，请确保账户下有足够的余额，否则会导致下单失败。
    */
    @SerializedName("CreateAndPay")
    @Expose
    private Boolean CreateAndPay;

    /**
    * 购买时长，与TimeUnit字段搭配使用。
    */
    @SerializedName("TimeSpan")
    @Expose
    private Long TimeSpan;

    /**
    * 购买时长单位,按各产品规则可选d(天),m(月),y(年),p(一次性)。
对于 云开发环境的 新购和续费，目前仅支持 按月购买（即 TimeUnit=m）。
    */
    @SerializedName("TimeUnit")
    @Expose
    private String TimeUnit;

    /**
    * 资源唯一标识。
在云开发环境 续费和变配 场景下必传，取值为环境ID。
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 来源可选[qcloud,miniapp]，默认qcloud。
miniapp表示微信云开发，主要适用于[小程序云开发](https://developers.weixin.qq.com/miniprogram/dev/wxcloudservice/wxcloud/billing/price.html)。

    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * 环境别名，用于新购云开发环境时，给云开发环境起别名。
仅当 新购云开发环境（DealType=purchase 并且 ProductType=tcb-baas ）时有效。

### 格式要求
- 可选字符： 小写字母(a~z)、数字、减号(-)
- 不能以 减号(-) 开头或结尾
- 不能有连个连续的 减号(-)
- 长度不超过20位
    */
    @SerializedName("Alias")
    @Expose
    private String Alias;

    /**
    * 环境id，当购买资源包和大促包时（ProductType取值为tcb-promotion 或 tcb-package）必传，表示资源包在哪个环境下生效。
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

    /**
    * 开启超限按量。
开启后，当 套餐内的资源点 和 资源包 都用尽后，会自动按量计费。
详见 [计费说明](https://cloud.tencent.com/document/product/876/127357)。
    */
    @SerializedName("EnableExcess")
    @Expose
    private Boolean EnableExcess;

    /**
    * 变配目标套餐id，对于云开发环境变配场景下必传。
对于云开发环境套餐，可通过 DescribeBaasPackageList 接口获取，对应其出参的PackageName
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
    * 是否自动选择代金券支付。
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
     * Get 目标下单产品/套餐Id。
对于云开发环境套餐，可通过 DescribeBaasPackageList 接口获取，对应其出参的PackageName 
     * @return PackageId 目标下单产品/套餐Id。
对于云开发环境套餐，可通过 DescribeBaasPackageList 接口获取，对应其出参的PackageName
     */
    public String getPackageId() {
        return this.PackageId;
    }

    /**
     * Set 目标下单产品/套餐Id。
对于云开发环境套餐，可通过 DescribeBaasPackageList 接口获取，对应其出参的PackageName
     * @param PackageId 目标下单产品/套餐Id。
对于云开发环境套餐，可通过 DescribeBaasPackageList 接口获取，对应其出参的PackageName
     */
    public void setPackageId(String PackageId) {
        this.PackageId = PackageId;
    }

    /**
     * Get 默认只下单不支付，为ture则下单并支付。
如果需要下单并支付，请确保账户下有足够的余额，否则会导致下单失败。 
     * @return CreateAndPay 默认只下单不支付，为ture则下单并支付。
如果需要下单并支付，请确保账户下有足够的余额，否则会导致下单失败。
     */
    public Boolean getCreateAndPay() {
        return this.CreateAndPay;
    }

    /**
     * Set 默认只下单不支付，为ture则下单并支付。
如果需要下单并支付，请确保账户下有足够的余额，否则会导致下单失败。
     * @param CreateAndPay 默认只下单不支付，为ture则下单并支付。
如果需要下单并支付，请确保账户下有足够的余额，否则会导致下单失败。
     */
    public void setCreateAndPay(Boolean CreateAndPay) {
        this.CreateAndPay = CreateAndPay;
    }

    /**
     * Get 购买时长，与TimeUnit字段搭配使用。 
     * @return TimeSpan 购买时长，与TimeUnit字段搭配使用。
     */
    public Long getTimeSpan() {
        return this.TimeSpan;
    }

    /**
     * Set 购买时长，与TimeUnit字段搭配使用。
     * @param TimeSpan 购买时长，与TimeUnit字段搭配使用。
     */
    public void setTimeSpan(Long TimeSpan) {
        this.TimeSpan = TimeSpan;
    }

    /**
     * Get 购买时长单位,按各产品规则可选d(天),m(月),y(年),p(一次性)。
对于 云开发环境的 新购和续费，目前仅支持 按月购买（即 TimeUnit=m）。 
     * @return TimeUnit 购买时长单位,按各产品规则可选d(天),m(月),y(年),p(一次性)。
对于 云开发环境的 新购和续费，目前仅支持 按月购买（即 TimeUnit=m）。
     */
    public String getTimeUnit() {
        return this.TimeUnit;
    }

    /**
     * Set 购买时长单位,按各产品规则可选d(天),m(月),y(年),p(一次性)。
对于 云开发环境的 新购和续费，目前仅支持 按月购买（即 TimeUnit=m）。
     * @param TimeUnit 购买时长单位,按各产品规则可选d(天),m(月),y(年),p(一次性)。
对于 云开发环境的 新购和续费，目前仅支持 按月购买（即 TimeUnit=m）。
     */
    public void setTimeUnit(String TimeUnit) {
        this.TimeUnit = TimeUnit;
    }

    /**
     * Get 资源唯一标识。
在云开发环境 续费和变配 场景下必传，取值为环境ID。 
     * @return ResourceId 资源唯一标识。
在云开发环境 续费和变配 场景下必传，取值为环境ID。
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 资源唯一标识。
在云开发环境 续费和变配 场景下必传，取值为环境ID。
     * @param ResourceId 资源唯一标识。
在云开发环境 续费和变配 场景下必传，取值为环境ID。
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get 来源可选[qcloud,miniapp]，默认qcloud。
miniapp表示微信云开发，主要适用于[小程序云开发](https://developers.weixin.qq.com/miniprogram/dev/wxcloudservice/wxcloud/billing/price.html)。
 
     * @return Source 来源可选[qcloud,miniapp]，默认qcloud。
miniapp表示微信云开发，主要适用于[小程序云开发](https://developers.weixin.qq.com/miniprogram/dev/wxcloudservice/wxcloud/billing/price.html)。

     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set 来源可选[qcloud,miniapp]，默认qcloud。
miniapp表示微信云开发，主要适用于[小程序云开发](https://developers.weixin.qq.com/miniprogram/dev/wxcloudservice/wxcloud/billing/price.html)。

     * @param Source 来源可选[qcloud,miniapp]，默认qcloud。
miniapp表示微信云开发，主要适用于[小程序云开发](https://developers.weixin.qq.com/miniprogram/dev/wxcloudservice/wxcloud/billing/price.html)。

     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get 环境别名，用于新购云开发环境时，给云开发环境起别名。
仅当 新购云开发环境（DealType=purchase 并且 ProductType=tcb-baas ）时有效。

### 格式要求
- 可选字符： 小写字母(a~z)、数字、减号(-)
- 不能以 减号(-) 开头或结尾
- 不能有连个连续的 减号(-)
- 长度不超过20位 
     * @return Alias 环境别名，用于新购云开发环境时，给云开发环境起别名。
仅当 新购云开发环境（DealType=purchase 并且 ProductType=tcb-baas ）时有效。

### 格式要求
- 可选字符： 小写字母(a~z)、数字、减号(-)
- 不能以 减号(-) 开头或结尾
- 不能有连个连续的 减号(-)
- 长度不超过20位
     */
    public String getAlias() {
        return this.Alias;
    }

    /**
     * Set 环境别名，用于新购云开发环境时，给云开发环境起别名。
仅当 新购云开发环境（DealType=purchase 并且 ProductType=tcb-baas ）时有效。

### 格式要求
- 可选字符： 小写字母(a~z)、数字、减号(-)
- 不能以 减号(-) 开头或结尾
- 不能有连个连续的 减号(-)
- 长度不超过20位
     * @param Alias 环境别名，用于新购云开发环境时，给云开发环境起别名。
仅当 新购云开发环境（DealType=purchase 并且 ProductType=tcb-baas ）时有效。

### 格式要求
- 可选字符： 小写字母(a~z)、数字、减号(-)
- 不能以 减号(-) 开头或结尾
- 不能有连个连续的 减号(-)
- 长度不超过20位
     */
    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    /**
     * Get 环境id，当购买资源包和大促包时（ProductType取值为tcb-promotion 或 tcb-package）必传，表示资源包在哪个环境下生效。 
     * @return EnvId 环境id，当购买资源包和大促包时（ProductType取值为tcb-promotion 或 tcb-package）必传，表示资源包在哪个环境下生效。
     */
    public String getEnvId() {
        return this.EnvId;
    }

    /**
     * Set 环境id，当购买资源包和大促包时（ProductType取值为tcb-promotion 或 tcb-package）必传，表示资源包在哪个环境下生效。
     * @param EnvId 环境id，当购买资源包和大促包时（ProductType取值为tcb-promotion 或 tcb-package）必传，表示资源包在哪个环境下生效。
     */
    public void setEnvId(String EnvId) {
        this.EnvId = EnvId;
    }

    /**
     * Get 开启超限按量。
开启后，当 套餐内的资源点 和 资源包 都用尽后，会自动按量计费。
详见 [计费说明](https://cloud.tencent.com/document/product/876/127357)。 
     * @return EnableExcess 开启超限按量。
开启后，当 套餐内的资源点 和 资源包 都用尽后，会自动按量计费。
详见 [计费说明](https://cloud.tencent.com/document/product/876/127357)。
     */
    public Boolean getEnableExcess() {
        return this.EnableExcess;
    }

    /**
     * Set 开启超限按量。
开启后，当 套餐内的资源点 和 资源包 都用尽后，会自动按量计费。
详见 [计费说明](https://cloud.tencent.com/document/product/876/127357)。
     * @param EnableExcess 开启超限按量。
开启后，当 套餐内的资源点 和 资源包 都用尽后，会自动按量计费。
详见 [计费说明](https://cloud.tencent.com/document/product/876/127357)。
     */
    public void setEnableExcess(Boolean EnableExcess) {
        this.EnableExcess = EnableExcess;
    }

    /**
     * Get 变配目标套餐id，对于云开发环境变配场景下必传。
对于云开发环境套餐，可通过 DescribeBaasPackageList 接口获取，对应其出参的PackageName 
     * @return ModifyPackageId 变配目标套餐id，对于云开发环境变配场景下必传。
对于云开发环境套餐，可通过 DescribeBaasPackageList 接口获取，对应其出参的PackageName
     */
    public String getModifyPackageId() {
        return this.ModifyPackageId;
    }

    /**
     * Set 变配目标套餐id，对于云开发环境变配场景下必传。
对于云开发环境套餐，可通过 DescribeBaasPackageList 接口获取，对应其出参的PackageName
     * @param ModifyPackageId 变配目标套餐id，对于云开发环境变配场景下必传。
对于云开发环境套餐，可通过 DescribeBaasPackageList 接口获取，对应其出参的PackageName
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
     * Get 是否自动选择代金券支付。 
     * @return AutoVoucher 是否自动选择代金券支付。
     */
    public Boolean getAutoVoucher() {
        return this.AutoVoucher;
    }

    /**
     * Set 是否自动选择代金券支付。
     * @param AutoVoucher 是否自动选择代金券支付。
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

