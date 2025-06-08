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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExecutorResourcePackageExtInfo extends AbstractModel {

    /**
    * 集成资源组：InLong集群id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InlongGroupId")
    @Expose
    private String InlongGroupId;

    /**
    * 集成资源组：oceanus集群id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OceanusClusterId")
    @Expose
    private String OceanusClusterId;

    /**
    * 计费相关：产品资源id列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProductResourceIdList")
    @Expose
    private String [] ProductResourceIdList;

    /**
    * 当前资源包对应订单是否发货成功
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BillingSuccess")
    @Expose
    private Boolean BillingSuccess;

    /**
    * apigw服务id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApigwServiceId")
    @Expose
    private String ApigwServiceId;

    /**
    * apigw服务名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApigwServiceName")
    @Expose
    private String ApigwServiceName;

    /**
    * 数据集成相关：dataProxy配置规格
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DataProxySpec")
    @Expose
    private Long DataProxySpec;

    /**
    * dataProxy数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DataProxyNum")
    @Expose
    private Long DataProxyNum;

    /**
    * dataProxy状态，同ExecutorGroupStatus
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DataProxyStatus")
    @Expose
    private Long DataProxyStatus;

    /**
    * inlongManager地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InLongManagerUrl")
    @Expose
    private String InLongManagerUrl;

    /**
    * inlong版本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InLongVersion")
    @Expose
    private String InLongVersion;

    /**
    * 私有化资源组相关: 执行及机器ip列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExecutorMachineIpList")
    @Expose
    private String ExecutorMachineIpList;

    /**
     * Get 集成资源组：InLong集群id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InlongGroupId 集成资源组：InLong集群id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInlongGroupId() {
        return this.InlongGroupId;
    }

    /**
     * Set 集成资源组：InLong集群id
注意：此字段可能返回 null，表示取不到有效值。
     * @param InlongGroupId 集成资源组：InLong集群id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInlongGroupId(String InlongGroupId) {
        this.InlongGroupId = InlongGroupId;
    }

    /**
     * Get 集成资源组：oceanus集群id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OceanusClusterId 集成资源组：oceanus集群id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOceanusClusterId() {
        return this.OceanusClusterId;
    }

    /**
     * Set 集成资源组：oceanus集群id
注意：此字段可能返回 null，表示取不到有效值。
     * @param OceanusClusterId 集成资源组：oceanus集群id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOceanusClusterId(String OceanusClusterId) {
        this.OceanusClusterId = OceanusClusterId;
    }

    /**
     * Get 计费相关：产品资源id列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProductResourceIdList 计费相关：产品资源id列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getProductResourceIdList() {
        return this.ProductResourceIdList;
    }

    /**
     * Set 计费相关：产品资源id列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProductResourceIdList 计费相关：产品资源id列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProductResourceIdList(String [] ProductResourceIdList) {
        this.ProductResourceIdList = ProductResourceIdList;
    }

    /**
     * Get 当前资源包对应订单是否发货成功
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BillingSuccess 当前资源包对应订单是否发货成功
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getBillingSuccess() {
        return this.BillingSuccess;
    }

    /**
     * Set 当前资源包对应订单是否发货成功
注意：此字段可能返回 null，表示取不到有效值。
     * @param BillingSuccess 当前资源包对应订单是否发货成功
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBillingSuccess(Boolean BillingSuccess) {
        this.BillingSuccess = BillingSuccess;
    }

    /**
     * Get apigw服务id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApigwServiceId apigw服务id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApigwServiceId() {
        return this.ApigwServiceId;
    }

    /**
     * Set apigw服务id
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApigwServiceId apigw服务id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApigwServiceId(String ApigwServiceId) {
        this.ApigwServiceId = ApigwServiceId;
    }

    /**
     * Get apigw服务名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApigwServiceName apigw服务名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApigwServiceName() {
        return this.ApigwServiceName;
    }

    /**
     * Set apigw服务名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApigwServiceName apigw服务名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApigwServiceName(String ApigwServiceName) {
        this.ApigwServiceName = ApigwServiceName;
    }

    /**
     * Get 数据集成相关：dataProxy配置规格
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DataProxySpec 数据集成相关：dataProxy配置规格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDataProxySpec() {
        return this.DataProxySpec;
    }

    /**
     * Set 数据集成相关：dataProxy配置规格
注意：此字段可能返回 null，表示取不到有效值。
     * @param DataProxySpec 数据集成相关：dataProxy配置规格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDataProxySpec(Long DataProxySpec) {
        this.DataProxySpec = DataProxySpec;
    }

    /**
     * Get dataProxy数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DataProxyNum dataProxy数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDataProxyNum() {
        return this.DataProxyNum;
    }

    /**
     * Set dataProxy数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param DataProxyNum dataProxy数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDataProxyNum(Long DataProxyNum) {
        this.DataProxyNum = DataProxyNum;
    }

    /**
     * Get dataProxy状态，同ExecutorGroupStatus
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DataProxyStatus dataProxy状态，同ExecutorGroupStatus
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDataProxyStatus() {
        return this.DataProxyStatus;
    }

    /**
     * Set dataProxy状态，同ExecutorGroupStatus
注意：此字段可能返回 null，表示取不到有效值。
     * @param DataProxyStatus dataProxy状态，同ExecutorGroupStatus
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDataProxyStatus(Long DataProxyStatus) {
        this.DataProxyStatus = DataProxyStatus;
    }

    /**
     * Get inlongManager地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InLongManagerUrl inlongManager地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInLongManagerUrl() {
        return this.InLongManagerUrl;
    }

    /**
     * Set inlongManager地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param InLongManagerUrl inlongManager地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInLongManagerUrl(String InLongManagerUrl) {
        this.InLongManagerUrl = InLongManagerUrl;
    }

    /**
     * Get inlong版本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InLongVersion inlong版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInLongVersion() {
        return this.InLongVersion;
    }

    /**
     * Set inlong版本
注意：此字段可能返回 null，表示取不到有效值。
     * @param InLongVersion inlong版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInLongVersion(String InLongVersion) {
        this.InLongVersion = InLongVersion;
    }

    /**
     * Get 私有化资源组相关: 执行及机器ip列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExecutorMachineIpList 私有化资源组相关: 执行及机器ip列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExecutorMachineIpList() {
        return this.ExecutorMachineIpList;
    }

    /**
     * Set 私有化资源组相关: 执行及机器ip列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExecutorMachineIpList 私有化资源组相关: 执行及机器ip列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExecutorMachineIpList(String ExecutorMachineIpList) {
        this.ExecutorMachineIpList = ExecutorMachineIpList;
    }

    public ExecutorResourcePackageExtInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExecutorResourcePackageExtInfo(ExecutorResourcePackageExtInfo source) {
        if (source.InlongGroupId != null) {
            this.InlongGroupId = new String(source.InlongGroupId);
        }
        if (source.OceanusClusterId != null) {
            this.OceanusClusterId = new String(source.OceanusClusterId);
        }
        if (source.ProductResourceIdList != null) {
            this.ProductResourceIdList = new String[source.ProductResourceIdList.length];
            for (int i = 0; i < source.ProductResourceIdList.length; i++) {
                this.ProductResourceIdList[i] = new String(source.ProductResourceIdList[i]);
            }
        }
        if (source.BillingSuccess != null) {
            this.BillingSuccess = new Boolean(source.BillingSuccess);
        }
        if (source.ApigwServiceId != null) {
            this.ApigwServiceId = new String(source.ApigwServiceId);
        }
        if (source.ApigwServiceName != null) {
            this.ApigwServiceName = new String(source.ApigwServiceName);
        }
        if (source.DataProxySpec != null) {
            this.DataProxySpec = new Long(source.DataProxySpec);
        }
        if (source.DataProxyNum != null) {
            this.DataProxyNum = new Long(source.DataProxyNum);
        }
        if (source.DataProxyStatus != null) {
            this.DataProxyStatus = new Long(source.DataProxyStatus);
        }
        if (source.InLongManagerUrl != null) {
            this.InLongManagerUrl = new String(source.InLongManagerUrl);
        }
        if (source.InLongVersion != null) {
            this.InLongVersion = new String(source.InLongVersion);
        }
        if (source.ExecutorMachineIpList != null) {
            this.ExecutorMachineIpList = new String(source.ExecutorMachineIpList);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InlongGroupId", this.InlongGroupId);
        this.setParamSimple(map, prefix + "OceanusClusterId", this.OceanusClusterId);
        this.setParamArraySimple(map, prefix + "ProductResourceIdList.", this.ProductResourceIdList);
        this.setParamSimple(map, prefix + "BillingSuccess", this.BillingSuccess);
        this.setParamSimple(map, prefix + "ApigwServiceId", this.ApigwServiceId);
        this.setParamSimple(map, prefix + "ApigwServiceName", this.ApigwServiceName);
        this.setParamSimple(map, prefix + "DataProxySpec", this.DataProxySpec);
        this.setParamSimple(map, prefix + "DataProxyNum", this.DataProxyNum);
        this.setParamSimple(map, prefix + "DataProxyStatus", this.DataProxyStatus);
        this.setParamSimple(map, prefix + "InLongManagerUrl", this.InLongManagerUrl);
        this.setParamSimple(map, prefix + "InLongVersion", this.InLongVersion);
        this.setParamSimple(map, prefix + "ExecutorMachineIpList", this.ExecutorMachineIpList);

    }
}

