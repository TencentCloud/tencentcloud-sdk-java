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
package com.tencentcloudapi.hai.v20230812.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InquirePriceRunInstancesRequest extends AbstractModel {

    /**
    * 应用ID
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * 算力套餐类型
    */
    @SerializedName("BundleType")
    @Expose
    private String BundleType;

    /**
    * 实例系统盘配置信息。若不指定该参数，则按照系统默认值进行分配。
    */
    @SerializedName("SystemDisk")
    @Expose
    private SystemDisk SystemDisk;

    /**
    * 购买实例数量。
    */
    @SerializedName("InstanceCount")
    @Expose
    private Long InstanceCount;

    /**
    * 实例显示名称
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 幂等请求token
    */
    @SerializedName("ClientToken")
    @Expose
    private String ClientToken;

    /**
    * DryRun为True就是只验接口连通性，默认为False
    */
    @SerializedName("DryRun")
    @Expose
    private Boolean DryRun;

    /**
    * 付费方式，POSTPAID_BY_HOUR按量后付费，PREPAID_BY_MONTH预付费按月，PREPAID_BY_DAY预付费按天
    */
    @SerializedName("InstanceChargeType")
    @Expose
    private String InstanceChargeType;

    /**
    * 预付费参数
    */
    @SerializedName("InstanceChargePrepaid")
    @Expose
    private InstanceChargePrepaid InstanceChargePrepaid;

    /**
     * Get 应用ID 
     * @return ApplicationId 应用ID
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set 应用ID
     * @param ApplicationId 应用ID
     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * Get 算力套餐类型 
     * @return BundleType 算力套餐类型
     */
    public String getBundleType() {
        return this.BundleType;
    }

    /**
     * Set 算力套餐类型
     * @param BundleType 算力套餐类型
     */
    public void setBundleType(String BundleType) {
        this.BundleType = BundleType;
    }

    /**
     * Get 实例系统盘配置信息。若不指定该参数，则按照系统默认值进行分配。 
     * @return SystemDisk 实例系统盘配置信息。若不指定该参数，则按照系统默认值进行分配。
     */
    public SystemDisk getSystemDisk() {
        return this.SystemDisk;
    }

    /**
     * Set 实例系统盘配置信息。若不指定该参数，则按照系统默认值进行分配。
     * @param SystemDisk 实例系统盘配置信息。若不指定该参数，则按照系统默认值进行分配。
     */
    public void setSystemDisk(SystemDisk SystemDisk) {
        this.SystemDisk = SystemDisk;
    }

    /**
     * Get 购买实例数量。 
     * @return InstanceCount 购买实例数量。
     */
    public Long getInstanceCount() {
        return this.InstanceCount;
    }

    /**
     * Set 购买实例数量。
     * @param InstanceCount 购买实例数量。
     */
    public void setInstanceCount(Long InstanceCount) {
        this.InstanceCount = InstanceCount;
    }

    /**
     * Get 实例显示名称 
     * @return InstanceName 实例显示名称
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 实例显示名称
     * @param InstanceName 实例显示名称
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 幂等请求token 
     * @return ClientToken 幂等请求token
     */
    public String getClientToken() {
        return this.ClientToken;
    }

    /**
     * Set 幂等请求token
     * @param ClientToken 幂等请求token
     */
    public void setClientToken(String ClientToken) {
        this.ClientToken = ClientToken;
    }

    /**
     * Get DryRun为True就是只验接口连通性，默认为False 
     * @return DryRun DryRun为True就是只验接口连通性，默认为False
     */
    public Boolean getDryRun() {
        return this.DryRun;
    }

    /**
     * Set DryRun为True就是只验接口连通性，默认为False
     * @param DryRun DryRun为True就是只验接口连通性，默认为False
     */
    public void setDryRun(Boolean DryRun) {
        this.DryRun = DryRun;
    }

    /**
     * Get 付费方式，POSTPAID_BY_HOUR按量后付费，PREPAID_BY_MONTH预付费按月，PREPAID_BY_DAY预付费按天 
     * @return InstanceChargeType 付费方式，POSTPAID_BY_HOUR按量后付费，PREPAID_BY_MONTH预付费按月，PREPAID_BY_DAY预付费按天
     */
    public String getInstanceChargeType() {
        return this.InstanceChargeType;
    }

    /**
     * Set 付费方式，POSTPAID_BY_HOUR按量后付费，PREPAID_BY_MONTH预付费按月，PREPAID_BY_DAY预付费按天
     * @param InstanceChargeType 付费方式，POSTPAID_BY_HOUR按量后付费，PREPAID_BY_MONTH预付费按月，PREPAID_BY_DAY预付费按天
     */
    public void setInstanceChargeType(String InstanceChargeType) {
        this.InstanceChargeType = InstanceChargeType;
    }

    /**
     * Get 预付费参数 
     * @return InstanceChargePrepaid 预付费参数
     */
    public InstanceChargePrepaid getInstanceChargePrepaid() {
        return this.InstanceChargePrepaid;
    }

    /**
     * Set 预付费参数
     * @param InstanceChargePrepaid 预付费参数
     */
    public void setInstanceChargePrepaid(InstanceChargePrepaid InstanceChargePrepaid) {
        this.InstanceChargePrepaid = InstanceChargePrepaid;
    }

    public InquirePriceRunInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InquirePriceRunInstancesRequest(InquirePriceRunInstancesRequest source) {
        if (source.ApplicationId != null) {
            this.ApplicationId = new String(source.ApplicationId);
        }
        if (source.BundleType != null) {
            this.BundleType = new String(source.BundleType);
        }
        if (source.SystemDisk != null) {
            this.SystemDisk = new SystemDisk(source.SystemDisk);
        }
        if (source.InstanceCount != null) {
            this.InstanceCount = new Long(source.InstanceCount);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.ClientToken != null) {
            this.ClientToken = new String(source.ClientToken);
        }
        if (source.DryRun != null) {
            this.DryRun = new Boolean(source.DryRun);
        }
        if (source.InstanceChargeType != null) {
            this.InstanceChargeType = new String(source.InstanceChargeType);
        }
        if (source.InstanceChargePrepaid != null) {
            this.InstanceChargePrepaid = new InstanceChargePrepaid(source.InstanceChargePrepaid);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamSimple(map, prefix + "BundleType", this.BundleType);
        this.setParamObj(map, prefix + "SystemDisk.", this.SystemDisk);
        this.setParamSimple(map, prefix + "InstanceCount", this.InstanceCount);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "ClientToken", this.ClientToken);
        this.setParamSimple(map, prefix + "DryRun", this.DryRun);
        this.setParamSimple(map, prefix + "InstanceChargeType", this.InstanceChargeType);
        this.setParamObj(map, prefix + "InstanceChargePrepaid.", this.InstanceChargePrepaid);

    }
}

