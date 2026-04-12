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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Microservice extends AbstractModel {

    /**
    * <p>微服务ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MicroserviceId")
    @Expose
    private String MicroserviceId;

    /**
    * <p>微服务名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MicroserviceName")
    @Expose
    private String MicroserviceName;

    /**
    * <p>微服务描述</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MicroserviceDesc")
    @Expose
    private String MicroserviceDesc;

    /**
    * <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * <p>更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
    * <p>命名空间ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NamespaceId")
    @Expose
    private String NamespaceId;

    /**
    * <p>微服务的运行实例数目</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RunInstanceCount")
    @Expose
    private Long RunInstanceCount;

    /**
    * <p>微服务的离线实例数目</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CriticalInstanceCount")
    @Expose
    private Long CriticalInstanceCount;

    /**
    * <p>是否禁用删除按钮，true：是；false：否。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeleteDisabled")
    @Expose
    private Boolean DeleteDisabled;

    /**
    * <p>禁用删除原因。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeleteDisabledReason")
    @Expose
    private String DeleteDisabledReason;

    /**
     * Get <p>微服务ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MicroserviceId <p>微服务ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMicroserviceId() {
        return this.MicroserviceId;
    }

    /**
     * Set <p>微服务ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param MicroserviceId <p>微服务ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMicroserviceId(String MicroserviceId) {
        this.MicroserviceId = MicroserviceId;
    }

    /**
     * Get <p>微服务名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MicroserviceName <p>微服务名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMicroserviceName() {
        return this.MicroserviceName;
    }

    /**
     * Set <p>微服务名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param MicroserviceName <p>微服务名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMicroserviceName(String MicroserviceName) {
        this.MicroserviceName = MicroserviceName;
    }

    /**
     * Get <p>微服务描述</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MicroserviceDesc <p>微服务描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMicroserviceDesc() {
        return this.MicroserviceDesc;
    }

    /**
     * Set <p>微服务描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param MicroserviceDesc <p>微服务描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMicroserviceDesc(String MicroserviceDesc) {
        this.MicroserviceDesc = MicroserviceDesc;
    }

    /**
     * Get <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime <p>更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime <p>更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>命名空间ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NamespaceId <p>命名空间ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNamespaceId() {
        return this.NamespaceId;
    }

    /**
     * Set <p>命名空间ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param NamespaceId <p>命名空间ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNamespaceId(String NamespaceId) {
        this.NamespaceId = NamespaceId;
    }

    /**
     * Get <p>微服务的运行实例数目</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RunInstanceCount <p>微服务的运行实例数目</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRunInstanceCount() {
        return this.RunInstanceCount;
    }

    /**
     * Set <p>微服务的运行实例数目</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RunInstanceCount <p>微服务的运行实例数目</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRunInstanceCount(Long RunInstanceCount) {
        this.RunInstanceCount = RunInstanceCount;
    }

    /**
     * Get <p>微服务的离线实例数目</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CriticalInstanceCount <p>微服务的离线实例数目</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCriticalInstanceCount() {
        return this.CriticalInstanceCount;
    }

    /**
     * Set <p>微服务的离线实例数目</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CriticalInstanceCount <p>微服务的离线实例数目</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCriticalInstanceCount(Long CriticalInstanceCount) {
        this.CriticalInstanceCount = CriticalInstanceCount;
    }

    /**
     * Get <p>是否禁用删除按钮，true：是；false：否。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeleteDisabled <p>是否禁用删除按钮，true：是；false：否。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getDeleteDisabled() {
        return this.DeleteDisabled;
    }

    /**
     * Set <p>是否禁用删除按钮，true：是；false：否。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeleteDisabled <p>是否禁用删除按钮，true：是；false：否。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeleteDisabled(Boolean DeleteDisabled) {
        this.DeleteDisabled = DeleteDisabled;
    }

    /**
     * Get <p>禁用删除原因。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeleteDisabledReason <p>禁用删除原因。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDeleteDisabledReason() {
        return this.DeleteDisabledReason;
    }

    /**
     * Set <p>禁用删除原因。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeleteDisabledReason <p>禁用删除原因。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeleteDisabledReason(String DeleteDisabledReason) {
        this.DeleteDisabledReason = DeleteDisabledReason;
    }

    public Microservice() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Microservice(Microservice source) {
        if (source.MicroserviceId != null) {
            this.MicroserviceId = new String(source.MicroserviceId);
        }
        if (source.MicroserviceName != null) {
            this.MicroserviceName = new String(source.MicroserviceName);
        }
        if (source.MicroserviceDesc != null) {
            this.MicroserviceDesc = new String(source.MicroserviceDesc);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
        if (source.NamespaceId != null) {
            this.NamespaceId = new String(source.NamespaceId);
        }
        if (source.RunInstanceCount != null) {
            this.RunInstanceCount = new Long(source.RunInstanceCount);
        }
        if (source.CriticalInstanceCount != null) {
            this.CriticalInstanceCount = new Long(source.CriticalInstanceCount);
        }
        if (source.DeleteDisabled != null) {
            this.DeleteDisabled = new Boolean(source.DeleteDisabled);
        }
        if (source.DeleteDisabledReason != null) {
            this.DeleteDisabledReason = new String(source.DeleteDisabledReason);
        }
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
        this.setParamSimple(map, prefix + "DeleteDisabled", this.DeleteDisabled);
        this.setParamSimple(map, prefix + "DeleteDisabledReason", this.DeleteDisabledReason);

    }
}

