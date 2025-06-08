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

public class MQPackageVO extends AbstractModel {

    /**
    * ckafka消息队列
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 实例Id/集群Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 实例名称/集群名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 局域网Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 子网Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 资源状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 资源状态描述：保存创建失败，运行异常和更新失败的原因
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StatusDescription")
    @Expose
    private String StatusDescription;

    /**
    * DataProxy规格
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DataProxySpec")
    @Expose
    private String DataProxySpec;

    /**
    * DataProxy数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DataProxyNum")
    @Expose
    private Long DataProxyNum;

    /**
    * DataProxy状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DataProxyStatus")
    @Expose
    private Long DataProxyStatus;

    /**
    * DataProxy状态描述：保存创建失败，运行异常和更新失败的原因
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DataProxyStatusDescription")
    @Expose
    private String DataProxyStatusDescription;

    /**
    * 计费类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BillingType")
    @Expose
    private String BillingType;

    /**
    * 资源到期时间，时间戳毫秒
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExpireTime")
    @Expose
    private Long ExpireTime;

    /**
    * 资源生命周期
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LifeTime")
    @Expose
    private Long LifeTime;

    /**
     * Get ckafka消息队列
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type ckafka消息队列
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set ckafka消息队列
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type ckafka消息队列
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 实例Id/集群Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceId 实例Id/集群Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例Id/集群Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceId 实例Id/集群Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 实例名称/集群名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceName 实例名称/集群名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 实例名称/集群名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceName 实例名称/集群名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 局域网Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VpcId 局域网Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 局域网Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param VpcId 局域网Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 子网Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubnetId 子网Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 子网Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubnetId 子网Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 资源状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 资源状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 资源状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 资源状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 资源状态描述：保存创建失败，运行异常和更新失败的原因
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StatusDescription 资源状态描述：保存创建失败，运行异常和更新失败的原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatusDescription() {
        return this.StatusDescription;
    }

    /**
     * Set 资源状态描述：保存创建失败，运行异常和更新失败的原因
注意：此字段可能返回 null，表示取不到有效值。
     * @param StatusDescription 资源状态描述：保存创建失败，运行异常和更新失败的原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatusDescription(String StatusDescription) {
        this.StatusDescription = StatusDescription;
    }

    /**
     * Get DataProxy规格
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DataProxySpec DataProxy规格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDataProxySpec() {
        return this.DataProxySpec;
    }

    /**
     * Set DataProxy规格
注意：此字段可能返回 null，表示取不到有效值。
     * @param DataProxySpec DataProxy规格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDataProxySpec(String DataProxySpec) {
        this.DataProxySpec = DataProxySpec;
    }

    /**
     * Get DataProxy数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DataProxyNum DataProxy数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDataProxyNum() {
        return this.DataProxyNum;
    }

    /**
     * Set DataProxy数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param DataProxyNum DataProxy数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDataProxyNum(Long DataProxyNum) {
        this.DataProxyNum = DataProxyNum;
    }

    /**
     * Get DataProxy状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DataProxyStatus DataProxy状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDataProxyStatus() {
        return this.DataProxyStatus;
    }

    /**
     * Set DataProxy状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param DataProxyStatus DataProxy状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDataProxyStatus(Long DataProxyStatus) {
        this.DataProxyStatus = DataProxyStatus;
    }

    /**
     * Get DataProxy状态描述：保存创建失败，运行异常和更新失败的原因
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DataProxyStatusDescription DataProxy状态描述：保存创建失败，运行异常和更新失败的原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDataProxyStatusDescription() {
        return this.DataProxyStatusDescription;
    }

    /**
     * Set DataProxy状态描述：保存创建失败，运行异常和更新失败的原因
注意：此字段可能返回 null，表示取不到有效值。
     * @param DataProxyStatusDescription DataProxy状态描述：保存创建失败，运行异常和更新失败的原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDataProxyStatusDescription(String DataProxyStatusDescription) {
        this.DataProxyStatusDescription = DataProxyStatusDescription;
    }

    /**
     * Get 计费类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BillingType 计费类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBillingType() {
        return this.BillingType;
    }

    /**
     * Set 计费类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param BillingType 计费类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBillingType(String BillingType) {
        this.BillingType = BillingType;
    }

    /**
     * Get 资源到期时间，时间戳毫秒
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExpireTime 资源到期时间，时间戳毫秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 资源到期时间，时间戳毫秒
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExpireTime 资源到期时间，时间戳毫秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExpireTime(Long ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get 资源生命周期
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LifeTime 资源生命周期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLifeTime() {
        return this.LifeTime;
    }

    /**
     * Set 资源生命周期
注意：此字段可能返回 null，表示取不到有效值。
     * @param LifeTime 资源生命周期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLifeTime(Long LifeTime) {
        this.LifeTime = LifeTime;
    }

    public MQPackageVO() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MQPackageVO(MQPackageVO source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.StatusDescription != null) {
            this.StatusDescription = new String(source.StatusDescription);
        }
        if (source.DataProxySpec != null) {
            this.DataProxySpec = new String(source.DataProxySpec);
        }
        if (source.DataProxyNum != null) {
            this.DataProxyNum = new Long(source.DataProxyNum);
        }
        if (source.DataProxyStatus != null) {
            this.DataProxyStatus = new Long(source.DataProxyStatus);
        }
        if (source.DataProxyStatusDescription != null) {
            this.DataProxyStatusDescription = new String(source.DataProxyStatusDescription);
        }
        if (source.BillingType != null) {
            this.BillingType = new String(source.BillingType);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new Long(source.ExpireTime);
        }
        if (source.LifeTime != null) {
            this.LifeTime = new Long(source.LifeTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StatusDescription", this.StatusDescription);
        this.setParamSimple(map, prefix + "DataProxySpec", this.DataProxySpec);
        this.setParamSimple(map, prefix + "DataProxyNum", this.DataProxyNum);
        this.setParamSimple(map, prefix + "DataProxyStatus", this.DataProxyStatus);
        this.setParamSimple(map, prefix + "DataProxyStatusDescription", this.DataProxyStatusDescription);
        this.setParamSimple(map, prefix + "BillingType", this.BillingType);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "LifeTime", this.LifeTime);

    }
}

