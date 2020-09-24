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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Microservice extends AbstractModel{

    /**
    * 微服务ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MicroserviceId")
    @Expose
    private String MicroserviceId;

    /**
    * 微服务名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MicroserviceName")
    @Expose
    private String MicroserviceName;

    /**
    * 微服务描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MicroserviceDesc")
    @Expose
    private String MicroserviceDesc;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * 更新时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
    * 命名空间ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NamespaceId")
    @Expose
    private String NamespaceId;

    /**
    * 微服务的运行实例数目
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RunInstanceCount")
    @Expose
    private Long RunInstanceCount;

    /**
    * 微服务的离线实例数目
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CriticalInstanceCount")
    @Expose
    private Long CriticalInstanceCount;

    /**
     * Get 微服务ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MicroserviceId 微服务ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMicroserviceId() {
        return this.MicroserviceId;
    }

    /**
     * Set 微服务ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param MicroserviceId 微服务ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMicroserviceId(String MicroserviceId) {
        this.MicroserviceId = MicroserviceId;
    }

    /**
     * Get 微服务名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MicroserviceName 微服务名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMicroserviceName() {
        return this.MicroserviceName;
    }

    /**
     * Set 微服务名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param MicroserviceName 微服务名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMicroserviceName(String MicroserviceName) {
        this.MicroserviceName = MicroserviceName;
    }

    /**
     * Get 微服务描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MicroserviceDesc 微服务描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMicroserviceDesc() {
        return this.MicroserviceDesc;
    }

    /**
     * Set 微服务描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param MicroserviceDesc 微服务描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMicroserviceDesc(String MicroserviceDesc) {
        this.MicroserviceDesc = MicroserviceDesc;
    }

    /**
     * Get 创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 更新时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 命名空间ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NamespaceId 命名空间ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNamespaceId() {
        return this.NamespaceId;
    }

    /**
     * Set 命名空间ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param NamespaceId 命名空间ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNamespaceId(String NamespaceId) {
        this.NamespaceId = NamespaceId;
    }

    /**
     * Get 微服务的运行实例数目
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RunInstanceCount 微服务的运行实例数目
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRunInstanceCount() {
        return this.RunInstanceCount;
    }

    /**
     * Set 微服务的运行实例数目
注意：此字段可能返回 null，表示取不到有效值。
     * @param RunInstanceCount 微服务的运行实例数目
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRunInstanceCount(Long RunInstanceCount) {
        this.RunInstanceCount = RunInstanceCount;
    }

    /**
     * Get 微服务的离线实例数目
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CriticalInstanceCount 微服务的离线实例数目
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCriticalInstanceCount() {
        return this.CriticalInstanceCount;
    }

    /**
     * Set 微服务的离线实例数目
注意：此字段可能返回 null，表示取不到有效值。
     * @param CriticalInstanceCount 微服务的离线实例数目
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCriticalInstanceCount(Long CriticalInstanceCount) {
        this.CriticalInstanceCount = CriticalInstanceCount;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MicroserviceId", this.MicroserviceId);
        this.setParamSimple(map, prefix + "MicroserviceName", this.MicroserviceName);
        this.setParamSimple(map, prefix + "MicroserviceDesc", this.MicroserviceDesc);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "NamespaceId", this.NamespaceId);
        this.setParamSimple(map, prefix + "RunInstanceCount", this.RunInstanceCount);
        this.setParamSimple(map, prefix + "CriticalInstanceCount", this.CriticalInstanceCount);

    }
}

