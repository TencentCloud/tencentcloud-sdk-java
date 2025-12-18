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
package com.tencentcloudapi.antiddos.v20200309.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateBgpInstanceRequest extends AbstractModel {

    /**
    * 付费类型：付费模式：PREPAID 预付费 POSTPAID_BY_MONTH 后付费
    */
    @SerializedName("InstanceChargeType")
    @Expose
    private String InstanceChargeType;

    /**
    * 高防包类型：高防包类型，Enterprise(企业版) Standard(标准版) StandardPlus(标准版2.0)
    */
    @SerializedName("PackageType")
    @Expose
    private String PackageType;

    /**
    * 购买高防包的数量，一次购买数量不超过10
    */
    @SerializedName("InstanceCount")
    @Expose
    private Long InstanceCount;

    /**
    * { "Period": 3, "RenewFlag": "NOTIFY_AND_AUTO_RENEW" }
    */
    @SerializedName("InstanceChargePrepaid")
    @Expose
    private InstanceChargePrepaid InstanceChargePrepaid;

    /**
    * { "Region": "ap-guangzhou", "ProtectIpCount": 1, "BasicProtectBandwidth": 300, "Bandwidth": 100, "ElasticProtectLimit": 0, "ElasticBandwidthFlag": true }
    */
    @SerializedName("EnterprisePackageConfig")
    @Expose
    private EnterprisePackageConfig EnterprisePackageConfig;

    /**
    * { "Region": "ap-guangzhou", "ProtectIpCount": 1, "BasicProtectBandwidth": 300, "Bandwidth": 100, "ElasticProtectLimit": 0, "ElasticBandwidthFlag": true }
    */
    @SerializedName("StandardPackageConfig")
    @Expose
    private StandardPackageConfig StandardPackageConfig;

    /**
    * { "Region": "ap-guangzhou", "ProtectCount": "TWO_TIMES", "ProtectIpCount": 1, "Bandwidth": 100, "ElasticBandwidthFlag": true }
    */
    @SerializedName("StandardPlusPackageConfig")
    @Expose
    private StandardPlusPackageConfig StandardPlusPackageConfig;

    /**
    * [ { "TagKey": "beal-test",                 "TagValue": "beal-test"               }             ]
    */
    @SerializedName("TagInfoList")
    @Expose
    private TagInfo [] TagInfoList;

    /**
    * 默认为false,true表示只进行参数校验，不进行实际购买
    */
    @SerializedName("DryRun")
    @Expose
    private Boolean DryRun;

    /**
     * Get 付费类型：付费模式：PREPAID 预付费 POSTPAID_BY_MONTH 后付费 
     * @return InstanceChargeType 付费类型：付费模式：PREPAID 预付费 POSTPAID_BY_MONTH 后付费
     */
    public String getInstanceChargeType() {
        return this.InstanceChargeType;
    }

    /**
     * Set 付费类型：付费模式：PREPAID 预付费 POSTPAID_BY_MONTH 后付费
     * @param InstanceChargeType 付费类型：付费模式：PREPAID 预付费 POSTPAID_BY_MONTH 后付费
     */
    public void setInstanceChargeType(String InstanceChargeType) {
        this.InstanceChargeType = InstanceChargeType;
    }

    /**
     * Get 高防包类型：高防包类型，Enterprise(企业版) Standard(标准版) StandardPlus(标准版2.0) 
     * @return PackageType 高防包类型：高防包类型，Enterprise(企业版) Standard(标准版) StandardPlus(标准版2.0)
     */
    public String getPackageType() {
        return this.PackageType;
    }

    /**
     * Set 高防包类型：高防包类型，Enterprise(企业版) Standard(标准版) StandardPlus(标准版2.0)
     * @param PackageType 高防包类型：高防包类型，Enterprise(企业版) Standard(标准版) StandardPlus(标准版2.0)
     */
    public void setPackageType(String PackageType) {
        this.PackageType = PackageType;
    }

    /**
     * Get 购买高防包的数量，一次购买数量不超过10 
     * @return InstanceCount 购买高防包的数量，一次购买数量不超过10
     */
    public Long getInstanceCount() {
        return this.InstanceCount;
    }

    /**
     * Set 购买高防包的数量，一次购买数量不超过10
     * @param InstanceCount 购买高防包的数量，一次购买数量不超过10
     */
    public void setInstanceCount(Long InstanceCount) {
        this.InstanceCount = InstanceCount;
    }

    /**
     * Get { "Period": 3, "RenewFlag": "NOTIFY_AND_AUTO_RENEW" } 
     * @return InstanceChargePrepaid { "Period": 3, "RenewFlag": "NOTIFY_AND_AUTO_RENEW" }
     */
    public InstanceChargePrepaid getInstanceChargePrepaid() {
        return this.InstanceChargePrepaid;
    }

    /**
     * Set { "Period": 3, "RenewFlag": "NOTIFY_AND_AUTO_RENEW" }
     * @param InstanceChargePrepaid { "Period": 3, "RenewFlag": "NOTIFY_AND_AUTO_RENEW" }
     */
    public void setInstanceChargePrepaid(InstanceChargePrepaid InstanceChargePrepaid) {
        this.InstanceChargePrepaid = InstanceChargePrepaid;
    }

    /**
     * Get { "Region": "ap-guangzhou", "ProtectIpCount": 1, "BasicProtectBandwidth": 300, "Bandwidth": 100, "ElasticProtectLimit": 0, "ElasticBandwidthFlag": true } 
     * @return EnterprisePackageConfig { "Region": "ap-guangzhou", "ProtectIpCount": 1, "BasicProtectBandwidth": 300, "Bandwidth": 100, "ElasticProtectLimit": 0, "ElasticBandwidthFlag": true }
     */
    public EnterprisePackageConfig getEnterprisePackageConfig() {
        return this.EnterprisePackageConfig;
    }

    /**
     * Set { "Region": "ap-guangzhou", "ProtectIpCount": 1, "BasicProtectBandwidth": 300, "Bandwidth": 100, "ElasticProtectLimit": 0, "ElasticBandwidthFlag": true }
     * @param EnterprisePackageConfig { "Region": "ap-guangzhou", "ProtectIpCount": 1, "BasicProtectBandwidth": 300, "Bandwidth": 100, "ElasticProtectLimit": 0, "ElasticBandwidthFlag": true }
     */
    public void setEnterprisePackageConfig(EnterprisePackageConfig EnterprisePackageConfig) {
        this.EnterprisePackageConfig = EnterprisePackageConfig;
    }

    /**
     * Get { "Region": "ap-guangzhou", "ProtectIpCount": 1, "BasicProtectBandwidth": 300, "Bandwidth": 100, "ElasticProtectLimit": 0, "ElasticBandwidthFlag": true } 
     * @return StandardPackageConfig { "Region": "ap-guangzhou", "ProtectIpCount": 1, "BasicProtectBandwidth": 300, "Bandwidth": 100, "ElasticProtectLimit": 0, "ElasticBandwidthFlag": true }
     */
    public StandardPackageConfig getStandardPackageConfig() {
        return this.StandardPackageConfig;
    }

    /**
     * Set { "Region": "ap-guangzhou", "ProtectIpCount": 1, "BasicProtectBandwidth": 300, "Bandwidth": 100, "ElasticProtectLimit": 0, "ElasticBandwidthFlag": true }
     * @param StandardPackageConfig { "Region": "ap-guangzhou", "ProtectIpCount": 1, "BasicProtectBandwidth": 300, "Bandwidth": 100, "ElasticProtectLimit": 0, "ElasticBandwidthFlag": true }
     */
    public void setStandardPackageConfig(StandardPackageConfig StandardPackageConfig) {
        this.StandardPackageConfig = StandardPackageConfig;
    }

    /**
     * Get { "Region": "ap-guangzhou", "ProtectCount": "TWO_TIMES", "ProtectIpCount": 1, "Bandwidth": 100, "ElasticBandwidthFlag": true } 
     * @return StandardPlusPackageConfig { "Region": "ap-guangzhou", "ProtectCount": "TWO_TIMES", "ProtectIpCount": 1, "Bandwidth": 100, "ElasticBandwidthFlag": true }
     */
    public StandardPlusPackageConfig getStandardPlusPackageConfig() {
        return this.StandardPlusPackageConfig;
    }

    /**
     * Set { "Region": "ap-guangzhou", "ProtectCount": "TWO_TIMES", "ProtectIpCount": 1, "Bandwidth": 100, "ElasticBandwidthFlag": true }
     * @param StandardPlusPackageConfig { "Region": "ap-guangzhou", "ProtectCount": "TWO_TIMES", "ProtectIpCount": 1, "Bandwidth": 100, "ElasticBandwidthFlag": true }
     */
    public void setStandardPlusPackageConfig(StandardPlusPackageConfig StandardPlusPackageConfig) {
        this.StandardPlusPackageConfig = StandardPlusPackageConfig;
    }

    /**
     * Get [ { "TagKey": "beal-test",                 "TagValue": "beal-test"               }             ] 
     * @return TagInfoList [ { "TagKey": "beal-test",                 "TagValue": "beal-test"               }             ]
     */
    public TagInfo [] getTagInfoList() {
        return this.TagInfoList;
    }

    /**
     * Set [ { "TagKey": "beal-test",                 "TagValue": "beal-test"               }             ]
     * @param TagInfoList [ { "TagKey": "beal-test",                 "TagValue": "beal-test"               }             ]
     */
    public void setTagInfoList(TagInfo [] TagInfoList) {
        this.TagInfoList = TagInfoList;
    }

    /**
     * Get 默认为false,true表示只进行参数校验，不进行实际购买 
     * @return DryRun 默认为false,true表示只进行参数校验，不进行实际购买
     */
    public Boolean getDryRun() {
        return this.DryRun;
    }

    /**
     * Set 默认为false,true表示只进行参数校验，不进行实际购买
     * @param DryRun 默认为false,true表示只进行参数校验，不进行实际购买
     */
    public void setDryRun(Boolean DryRun) {
        this.DryRun = DryRun;
    }

    public CreateBgpInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateBgpInstanceRequest(CreateBgpInstanceRequest source) {
        if (source.InstanceChargeType != null) {
            this.InstanceChargeType = new String(source.InstanceChargeType);
        }
        if (source.PackageType != null) {
            this.PackageType = new String(source.PackageType);
        }
        if (source.InstanceCount != null) {
            this.InstanceCount = new Long(source.InstanceCount);
        }
        if (source.InstanceChargePrepaid != null) {
            this.InstanceChargePrepaid = new InstanceChargePrepaid(source.InstanceChargePrepaid);
        }
        if (source.EnterprisePackageConfig != null) {
            this.EnterprisePackageConfig = new EnterprisePackageConfig(source.EnterprisePackageConfig);
        }
        if (source.StandardPackageConfig != null) {
            this.StandardPackageConfig = new StandardPackageConfig(source.StandardPackageConfig);
        }
        if (source.StandardPlusPackageConfig != null) {
            this.StandardPlusPackageConfig = new StandardPlusPackageConfig(source.StandardPlusPackageConfig);
        }
        if (source.TagInfoList != null) {
            this.TagInfoList = new TagInfo[source.TagInfoList.length];
            for (int i = 0; i < source.TagInfoList.length; i++) {
                this.TagInfoList[i] = new TagInfo(source.TagInfoList[i]);
            }
        }
        if (source.DryRun != null) {
            this.DryRun = new Boolean(source.DryRun);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceChargeType", this.InstanceChargeType);
        this.setParamSimple(map, prefix + "PackageType", this.PackageType);
        this.setParamSimple(map, prefix + "InstanceCount", this.InstanceCount);
        this.setParamObj(map, prefix + "InstanceChargePrepaid.", this.InstanceChargePrepaid);
        this.setParamObj(map, prefix + "EnterprisePackageConfig.", this.EnterprisePackageConfig);
        this.setParamObj(map, prefix + "StandardPackageConfig.", this.StandardPackageConfig);
        this.setParamObj(map, prefix + "StandardPlusPackageConfig.", this.StandardPlusPackageConfig);
        this.setParamArrayObj(map, prefix + "TagInfoList.", this.TagInfoList);
        this.setParamSimple(map, prefix + "DryRun", this.DryRun);

    }
}

