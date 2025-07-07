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

public class Namespace extends AbstractModel {

    /**
    * 命名空间ID
    */
    @SerializedName("NamespaceId")
    @Expose
    private String NamespaceId;

    /**
    * 命名空间编码
    */
    @SerializedName("NamespaceCode")
    @Expose
    private String NamespaceCode;

    /**
    * 命名空间名称
    */
    @SerializedName("NamespaceName")
    @Expose
    private String NamespaceName;

    /**
    * 命名空间描述
    */
    @SerializedName("NamespaceDesc")
    @Expose
    private String NamespaceDesc;

    /**
    * 默认命名空间
    */
    @SerializedName("IsDefault")
    @Expose
    private String IsDefault;

    /**
    * 命名空间状态
    */
    @SerializedName("NamespaceStatus")
    @Expose
    private String NamespaceStatus;

    /**
    * 删除标识
    */
    @SerializedName("DeleteFlag")
    @Expose
    private Boolean DeleteFlag;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 集群数组，仅携带集群ID，集群名称，集群类型等基础信息。
    */
    @SerializedName("ClusterList")
    @Expose
    private Cluster [] ClusterList;

    /**
    * 集群ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 集群资源类型
    */
    @SerializedName("NamespaceResourceType")
    @Expose
    private String NamespaceResourceType;

    /**
    * 命名空间类型
    */
    @SerializedName("NamespaceType")
    @Expose
    private String NamespaceType;

    /**
    * 是否开启高可用
    */
    @SerializedName("IsHaEnable")
    @Expose
    private String IsHaEnable;

    /**
    * KubeInjectEnable值
    */
    @SerializedName("KubeInjectEnable")
    @Expose
    private Boolean KubeInjectEnable;

    /**
     * Get 命名空间ID 
     * @return NamespaceId 命名空间ID
     */
    public String getNamespaceId() {
        return this.NamespaceId;
    }

    /**
     * Set 命名空间ID
     * @param NamespaceId 命名空间ID
     */
    public void setNamespaceId(String NamespaceId) {
        this.NamespaceId = NamespaceId;
    }

    /**
     * Get 命名空间编码 
     * @return NamespaceCode 命名空间编码
     */
    public String getNamespaceCode() {
        return this.NamespaceCode;
    }

    /**
     * Set 命名空间编码
     * @param NamespaceCode 命名空间编码
     */
    public void setNamespaceCode(String NamespaceCode) {
        this.NamespaceCode = NamespaceCode;
    }

    /**
     * Get 命名空间名称 
     * @return NamespaceName 命名空间名称
     */
    public String getNamespaceName() {
        return this.NamespaceName;
    }

    /**
     * Set 命名空间名称
     * @param NamespaceName 命名空间名称
     */
    public void setNamespaceName(String NamespaceName) {
        this.NamespaceName = NamespaceName;
    }

    /**
     * Get 命名空间描述 
     * @return NamespaceDesc 命名空间描述
     */
    public String getNamespaceDesc() {
        return this.NamespaceDesc;
    }

    /**
     * Set 命名空间描述
     * @param NamespaceDesc 命名空间描述
     */
    public void setNamespaceDesc(String NamespaceDesc) {
        this.NamespaceDesc = NamespaceDesc;
    }

    /**
     * Get 默认命名空间 
     * @return IsDefault 默认命名空间
     */
    public String getIsDefault() {
        return this.IsDefault;
    }

    /**
     * Set 默认命名空间
     * @param IsDefault 默认命名空间
     */
    public void setIsDefault(String IsDefault) {
        this.IsDefault = IsDefault;
    }

    /**
     * Get 命名空间状态 
     * @return NamespaceStatus 命名空间状态
     */
    public String getNamespaceStatus() {
        return this.NamespaceStatus;
    }

    /**
     * Set 命名空间状态
     * @param NamespaceStatus 命名空间状态
     */
    public void setNamespaceStatus(String NamespaceStatus) {
        this.NamespaceStatus = NamespaceStatus;
    }

    /**
     * Get 删除标识 
     * @return DeleteFlag 删除标识
     */
    public Boolean getDeleteFlag() {
        return this.DeleteFlag;
    }

    /**
     * Set 删除标识
     * @param DeleteFlag 删除标识
     */
    public void setDeleteFlag(Boolean DeleteFlag) {
        this.DeleteFlag = DeleteFlag;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 更新时间 
     * @return UpdateTime 更新时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间
     * @param UpdateTime 更新时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 集群数组，仅携带集群ID，集群名称，集群类型等基础信息。 
     * @return ClusterList 集群数组，仅携带集群ID，集群名称，集群类型等基础信息。
     */
    public Cluster [] getClusterList() {
        return this.ClusterList;
    }

    /**
     * Set 集群数组，仅携带集群ID，集群名称，集群类型等基础信息。
     * @param ClusterList 集群数组，仅携带集群ID，集群名称，集群类型等基础信息。
     */
    public void setClusterList(Cluster [] ClusterList) {
        this.ClusterList = ClusterList;
    }

    /**
     * Get 集群ID 
     * @return ClusterId 集群ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群ID
     * @param ClusterId 集群ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 集群资源类型 
     * @return NamespaceResourceType 集群资源类型
     */
    public String getNamespaceResourceType() {
        return this.NamespaceResourceType;
    }

    /**
     * Set 集群资源类型
     * @param NamespaceResourceType 集群资源类型
     */
    public void setNamespaceResourceType(String NamespaceResourceType) {
        this.NamespaceResourceType = NamespaceResourceType;
    }

    /**
     * Get 命名空间类型 
     * @return NamespaceType 命名空间类型
     */
    public String getNamespaceType() {
        return this.NamespaceType;
    }

    /**
     * Set 命名空间类型
     * @param NamespaceType 命名空间类型
     */
    public void setNamespaceType(String NamespaceType) {
        this.NamespaceType = NamespaceType;
    }

    /**
     * Get 是否开启高可用 
     * @return IsHaEnable 是否开启高可用
     */
    public String getIsHaEnable() {
        return this.IsHaEnable;
    }

    /**
     * Set 是否开启高可用
     * @param IsHaEnable 是否开启高可用
     */
    public void setIsHaEnable(String IsHaEnable) {
        this.IsHaEnable = IsHaEnable;
    }

    /**
     * Get KubeInjectEnable值 
     * @return KubeInjectEnable KubeInjectEnable值
     */
    public Boolean getKubeInjectEnable() {
        return this.KubeInjectEnable;
    }

    /**
     * Set KubeInjectEnable值
     * @param KubeInjectEnable KubeInjectEnable值
     */
    public void setKubeInjectEnable(Boolean KubeInjectEnable) {
        this.KubeInjectEnable = KubeInjectEnable;
    }

    public Namespace() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Namespace(Namespace source) {
        if (source.NamespaceId != null) {
            this.NamespaceId = new String(source.NamespaceId);
        }
        if (source.NamespaceCode != null) {
            this.NamespaceCode = new String(source.NamespaceCode);
        }
        if (source.NamespaceName != null) {
            this.NamespaceName = new String(source.NamespaceName);
        }
        if (source.NamespaceDesc != null) {
            this.NamespaceDesc = new String(source.NamespaceDesc);
        }
        if (source.IsDefault != null) {
            this.IsDefault = new String(source.IsDefault);
        }
        if (source.NamespaceStatus != null) {
            this.NamespaceStatus = new String(source.NamespaceStatus);
        }
        if (source.DeleteFlag != null) {
            this.DeleteFlag = new Boolean(source.DeleteFlag);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.ClusterList != null) {
            this.ClusterList = new Cluster[source.ClusterList.length];
            for (int i = 0; i < source.ClusterList.length; i++) {
                this.ClusterList[i] = new Cluster(source.ClusterList[i]);
            }
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.NamespaceResourceType != null) {
            this.NamespaceResourceType = new String(source.NamespaceResourceType);
        }
        if (source.NamespaceType != null) {
            this.NamespaceType = new String(source.NamespaceType);
        }
        if (source.IsHaEnable != null) {
            this.IsHaEnable = new String(source.IsHaEnable);
        }
        if (source.KubeInjectEnable != null) {
            this.KubeInjectEnable = new Boolean(source.KubeInjectEnable);
        }
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
        this.setParamSimple(map, prefix + "KubeInjectEnable", this.KubeInjectEnable);

    }
}

