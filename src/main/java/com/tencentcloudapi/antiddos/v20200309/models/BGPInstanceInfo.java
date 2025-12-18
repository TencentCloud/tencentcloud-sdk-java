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

public class BGPInstanceInfo extends AbstractModel {

    /**
    * 实例Id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 续费周期相关
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceChargePrepaid")
    @Expose
    private InstanceChargePrepaid InstanceChargePrepaid;

    /**
    * 企业版高防包配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EnterprisePackageConfig")
    @Expose
    private EnterprisePackageConfig EnterprisePackageConfig;

    /**
    * 标准版高防包配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StandardPackageConfig")
    @Expose
    private StandardPackageConfig StandardPackageConfig;

    /**
    * 标准版2.0高防包配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StandardPlusPackageConfig")
    @Expose
    private StandardPlusPackageConfig StandardPlusPackageConfig;

    /**
    * tag信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TagInfoList")
    @Expose
    private TagInfo [] TagInfoList;

    /**
    * 高防包类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PackageType")
    @Expose
    private String PackageType;

    /**
    * 数量1
    */
    @SerializedName("InstanceCount")
    @Expose
    private Long InstanceCount;

    /**
    * 付费方式
    */
    @SerializedName("InstanceChargeType")
    @Expose
    private String InstanceChargeType;

    /**
    * 无实际意义，创建时如果为true，只进行参数校验，默认为false
    */
    @SerializedName("DryRun")
    @Expose
    private Boolean DryRun;

    /**
     * Get 实例Id 
     * @return InstanceId 实例Id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例Id
     * @param InstanceId 实例Id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 续费周期相关
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceChargePrepaid 续费周期相关
注意：此字段可能返回 null，表示取不到有效值。
     */
    public InstanceChargePrepaid getInstanceChargePrepaid() {
        return this.InstanceChargePrepaid;
    }

    /**
     * Set 续费周期相关
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceChargePrepaid 续费周期相关
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceChargePrepaid(InstanceChargePrepaid InstanceChargePrepaid) {
        this.InstanceChargePrepaid = InstanceChargePrepaid;
    }

    /**
     * Get 企业版高防包配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EnterprisePackageConfig 企业版高防包配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public EnterprisePackageConfig getEnterprisePackageConfig() {
        return this.EnterprisePackageConfig;
    }

    /**
     * Set 企业版高防包配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param EnterprisePackageConfig 企业版高防包配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnterprisePackageConfig(EnterprisePackageConfig EnterprisePackageConfig) {
        this.EnterprisePackageConfig = EnterprisePackageConfig;
    }

    /**
     * Get 标准版高防包配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StandardPackageConfig 标准版高防包配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public StandardPackageConfig getStandardPackageConfig() {
        return this.StandardPackageConfig;
    }

    /**
     * Set 标准版高防包配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param StandardPackageConfig 标准版高防包配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStandardPackageConfig(StandardPackageConfig StandardPackageConfig) {
        this.StandardPackageConfig = StandardPackageConfig;
    }

    /**
     * Get 标准版2.0高防包配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StandardPlusPackageConfig 标准版2.0高防包配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public StandardPlusPackageConfig getStandardPlusPackageConfig() {
        return this.StandardPlusPackageConfig;
    }

    /**
     * Set 标准版2.0高防包配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param StandardPlusPackageConfig 标准版2.0高防包配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStandardPlusPackageConfig(StandardPlusPackageConfig StandardPlusPackageConfig) {
        this.StandardPlusPackageConfig = StandardPlusPackageConfig;
    }

    /**
     * Get tag信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TagInfoList tag信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TagInfo [] getTagInfoList() {
        return this.TagInfoList;
    }

    /**
     * Set tag信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param TagInfoList tag信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTagInfoList(TagInfo [] TagInfoList) {
        this.TagInfoList = TagInfoList;
    }

    /**
     * Get 高防包类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PackageType 高防包类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPackageType() {
        return this.PackageType;
    }

    /**
     * Set 高防包类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param PackageType 高防包类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPackageType(String PackageType) {
        this.PackageType = PackageType;
    }

    /**
     * Get 数量1 
     * @return InstanceCount 数量1
     */
    public Long getInstanceCount() {
        return this.InstanceCount;
    }

    /**
     * Set 数量1
     * @param InstanceCount 数量1
     */
    public void setInstanceCount(Long InstanceCount) {
        this.InstanceCount = InstanceCount;
    }

    /**
     * Get 付费方式 
     * @return InstanceChargeType 付费方式
     */
    public String getInstanceChargeType() {
        return this.InstanceChargeType;
    }

    /**
     * Set 付费方式
     * @param InstanceChargeType 付费方式
     */
    public void setInstanceChargeType(String InstanceChargeType) {
        this.InstanceChargeType = InstanceChargeType;
    }

    /**
     * Get 无实际意义，创建时如果为true，只进行参数校验，默认为false 
     * @return DryRun 无实际意义，创建时如果为true，只进行参数校验，默认为false
     */
    public Boolean getDryRun() {
        return this.DryRun;
    }

    /**
     * Set 无实际意义，创建时如果为true，只进行参数校验，默认为false
     * @param DryRun 无实际意义，创建时如果为true，只进行参数校验，默认为false
     */
    public void setDryRun(Boolean DryRun) {
        this.DryRun = DryRun;
    }

    public BGPInstanceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BGPInstanceInfo(BGPInstanceInfo source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
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
        if (source.PackageType != null) {
            this.PackageType = new String(source.PackageType);
        }
        if (source.InstanceCount != null) {
            this.InstanceCount = new Long(source.InstanceCount);
        }
        if (source.InstanceChargeType != null) {
            this.InstanceChargeType = new String(source.InstanceChargeType);
        }
        if (source.DryRun != null) {
            this.DryRun = new Boolean(source.DryRun);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamObj(map, prefix + "InstanceChargePrepaid.", this.InstanceChargePrepaid);
        this.setParamObj(map, prefix + "EnterprisePackageConfig.", this.EnterprisePackageConfig);
        this.setParamObj(map, prefix + "StandardPackageConfig.", this.StandardPackageConfig);
        this.setParamObj(map, prefix + "StandardPlusPackageConfig.", this.StandardPlusPackageConfig);
        this.setParamArrayObj(map, prefix + "TagInfoList.", this.TagInfoList);
        this.setParamSimple(map, prefix + "PackageType", this.PackageType);
        this.setParamSimple(map, prefix + "InstanceCount", this.InstanceCount);
        this.setParamSimple(map, prefix + "InstanceChargeType", this.InstanceChargeType);
        this.setParamSimple(map, prefix + "DryRun", this.DryRun);

    }
}

