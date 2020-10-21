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

public class Namespace extends AbstractModel{

    /**
    * 命名空间ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NamespaceId")
    @Expose
    private String NamespaceId;

    /**
    * 命名空间编码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NamespaceCode")
    @Expose
    private String NamespaceCode;

    /**
    * 命名空间名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NamespaceName")
    @Expose
    private String NamespaceName;

    /**
    * 命名空间描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NamespaceDesc")
    @Expose
    private String NamespaceDesc;

    /**
    * 默认命名空间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsDefault")
    @Expose
    private String IsDefault;

    /**
    * 命名空间状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NamespaceStatus")
    @Expose
    private String NamespaceStatus;

    /**
    * 删除标识
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeleteFlag")
    @Expose
    private Boolean DeleteFlag;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 更新时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 集群数组，仅携带集群ID，集群名称，集群类型等基础信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterList")
    @Expose
    private Cluster [] ClusterList;

    /**
    * 集群ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 集群资源类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NamespaceResourceType")
    @Expose
    private String NamespaceResourceType;

    /**
    * 命名空间类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NamespaceType")
    @Expose
    private String NamespaceType;

    /**
    * 是否开启高可用
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsHaEnable")
    @Expose
    private String IsHaEnable;

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
     * Get 命名空间编码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NamespaceCode 命名空间编码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNamespaceCode() {
        return this.NamespaceCode;
    }

    /**
     * Set 命名空间编码
注意：此字段可能返回 null，表示取不到有效值。
     * @param NamespaceCode 命名空间编码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNamespaceCode(String NamespaceCode) {
        this.NamespaceCode = NamespaceCode;
    }

    /**
     * Get 命名空间名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NamespaceName 命名空间名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNamespaceName() {
        return this.NamespaceName;
    }

    /**
     * Set 命名空间名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param NamespaceName 命名空间名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNamespaceName(String NamespaceName) {
        this.NamespaceName = NamespaceName;
    }

    /**
     * Get 命名空间描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NamespaceDesc 命名空间描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNamespaceDesc() {
        return this.NamespaceDesc;
    }

    /**
     * Set 命名空间描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param NamespaceDesc 命名空间描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNamespaceDesc(String NamespaceDesc) {
        this.NamespaceDesc = NamespaceDesc;
    }

    /**
     * Get 默认命名空间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsDefault 默认命名空间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIsDefault() {
        return this.IsDefault;
    }

    /**
     * Set 默认命名空间
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsDefault 默认命名空间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsDefault(String IsDefault) {
        this.IsDefault = IsDefault;
    }

    /**
     * Get 命名空间状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NamespaceStatus 命名空间状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNamespaceStatus() {
        return this.NamespaceStatus;
    }

    /**
     * Set 命名空间状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param NamespaceStatus 命名空间状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNamespaceStatus(String NamespaceStatus) {
        this.NamespaceStatus = NamespaceStatus;
    }

    /**
     * Get 删除标识
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeleteFlag 删除标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getDeleteFlag() {
        return this.DeleteFlag;
    }

    /**
     * Set 删除标识
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeleteFlag 删除标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeleteFlag(Boolean DeleteFlag) {
        this.DeleteFlag = DeleteFlag;
    }

    /**
     * Get 创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 更新时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 集群数组，仅携带集群ID，集群名称，集群类型等基础信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterList 集群数组，仅携带集群ID，集群名称，集群类型等基础信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Cluster [] getClusterList() {
        return this.ClusterList;
    }

    /**
     * Set 集群数组，仅携带集群ID，集群名称，集群类型等基础信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterList 集群数组，仅携带集群ID，集群名称，集群类型等基础信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterList(Cluster [] ClusterList) {
        this.ClusterList = ClusterList;
    }

    /**
     * Get 集群ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterId 集群ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterId 集群ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 集群资源类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NamespaceResourceType 集群资源类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNamespaceResourceType() {
        return this.NamespaceResourceType;
    }

    /**
     * Set 集群资源类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param NamespaceResourceType 集群资源类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNamespaceResourceType(String NamespaceResourceType) {
        this.NamespaceResourceType = NamespaceResourceType;
    }

    /**
     * Get 命名空间类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NamespaceType 命名空间类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNamespaceType() {
        return this.NamespaceType;
    }

    /**
     * Set 命名空间类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param NamespaceType 命名空间类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNamespaceType(String NamespaceType) {
        this.NamespaceType = NamespaceType;
    }

    /**
     * Get 是否开启高可用
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsHaEnable 是否开启高可用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIsHaEnable() {
        return this.IsHaEnable;
    }

    /**
     * Set 是否开启高可用
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsHaEnable 是否开启高可用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsHaEnable(String IsHaEnable) {
        this.IsHaEnable = IsHaEnable;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NamespaceId", this.NamespaceId);
        this.setParamSimple(map, prefix + "NamespaceCode", this.NamespaceCode);
        this.setParamSimple(map, prefix + "NamespaceName", this.NamespaceName);
        this.setParamSimple(map, prefix + "NamespaceDesc", this.NamespaceDesc);
        this.setParamSimple(map, prefix + "IsDefault", this.IsDefault);
        this.setParamSimple(map, prefix + "NamespaceStatus", this.NamespaceStatus);
        this.setParamSimple(map, prefix + "DeleteFlag", this.DeleteFlag);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamArrayObj(map, prefix + "ClusterList.", this.ClusterList);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "NamespaceResourceType", this.NamespaceResourceType);
        this.setParamSimple(map, prefix + "NamespaceType", this.NamespaceType);
        this.setParamSimple(map, prefix + "IsHaEnable", this.IsHaEnable);

    }
}

