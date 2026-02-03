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
package com.tencentcloudapi.ctsdb.v20230202.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClusterDetail extends AbstractModel {

    /**
    * <p>用户APPID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AppID")
    @Expose
    private Long AppID;

    /**
    * <p>实例id</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterID")
    @Expose
    private String ClusterID;

    /**
    * <p>账号id</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AccountID")
    @Expose
    private String AccountID;

    /**
    * <p>自定义实例名</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>地域</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * <p>网络信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Networks")
    @Expose
    private Network [] Networks;

    /**
    * <p>实例状态</p>枚举值：<ul><li> 0： 运行中</li><li> 1： 创建中</li><li> 16： 变配中</li><li> 17： 隔离中</li><li> 18： 已隔离</li><li> 19： 恢复中</li><li> 20： 已关机</li><li> 21： 销毁中</li><li> 22： 已销毁</li><li> 30： 扩展节点添加中</li><li> 31： 扩展节点变配中</li><li> 32： 扩展节点删除中</li><li> 33： 扩展节点禁用中</li><li> 34： 扩展节点启用中</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
    * <p>最后修改时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdatedAt")
    @Expose
    private String UpdatedAt;

    /**
    * <p>标签</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * <p>安全组信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Security")
    @Expose
    private String [] Security;

    /**
    * <p>组件信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Components")
    @Expose
    private Component [] Components;

    /**
    * <p>过期时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExpiredAt")
    @Expose
    private String ExpiredAt;

    /**
    * <p>续费标识</p>枚举值：<ul><li> 0： 默认</li><li> 1： 自动续费</li><li> 2： 不自动续费</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RenewFlag")
    @Expose
    private Long RenewFlag;

    /**
    * <p>关机时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ShutdownAt")
    @Expose
    private String ShutdownAt;

    /**
    * <p>隔离时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsolatedAt")
    @Expose
    private String IsolatedAt;

    /**
    * <p>实例类型</p>枚举值：<ul><li> 0： 共享型</li><li> 1： 独享型</li><li> 2： 标准型</li></ul>
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
     * Get <p>用户APPID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AppID <p>用户APPID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAppID() {
        return this.AppID;
    }

    /**
     * Set <p>用户APPID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AppID <p>用户APPID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAppID(Long AppID) {
        this.AppID = AppID;
    }

    /**
     * Get <p>实例id</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterID <p>实例id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClusterID() {
        return this.ClusterID;
    }

    /**
     * Set <p>实例id</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterID <p>实例id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterID(String ClusterID) {
        this.ClusterID = ClusterID;
    }

    /**
     * Get <p>账号id</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AccountID <p>账号id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAccountID() {
        return this.AccountID;
    }

    /**
     * Set <p>账号id</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AccountID <p>账号id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAccountID(String AccountID) {
        this.AccountID = AccountID;
    }

    /**
     * Get <p>自定义实例名</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name <p>自定义实例名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>自定义实例名</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name <p>自定义实例名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>地域</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Region <p>地域</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set <p>地域</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Region <p>地域</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get <p>网络信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Networks <p>网络信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Network [] getNetworks() {
        return this.Networks;
    }

    /**
     * Set <p>网络信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Networks <p>网络信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNetworks(Network [] Networks) {
        this.Networks = Networks;
    }

    /**
     * Get <p>实例状态</p>枚举值：<ul><li> 0： 运行中</li><li> 1： 创建中</li><li> 16： 变配中</li><li> 17： 隔离中</li><li> 18： 已隔离</li><li> 19： 恢复中</li><li> 20： 已关机</li><li> 21： 销毁中</li><li> 22： 已销毁</li><li> 30： 扩展节点添加中</li><li> 31： 扩展节点变配中</li><li> 32： 扩展节点删除中</li><li> 33： 扩展节点禁用中</li><li> 34： 扩展节点启用中</li></ul>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status <p>实例状态</p>枚举值：<ul><li> 0： 运行中</li><li> 1： 创建中</li><li> 16： 变配中</li><li> 17： 隔离中</li><li> 18： 已隔离</li><li> 19： 恢复中</li><li> 20： 已关机</li><li> 21： 销毁中</li><li> 22： 已销毁</li><li> 30： 扩展节点添加中</li><li> 31： 扩展节点变配中</li><li> 32： 扩展节点删除中</li><li> 33： 扩展节点禁用中</li><li> 34： 扩展节点启用中</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>实例状态</p>枚举值：<ul><li> 0： 运行中</li><li> 1： 创建中</li><li> 16： 变配中</li><li> 17： 隔离中</li><li> 18： 已隔离</li><li> 19： 恢复中</li><li> 20： 已关机</li><li> 21： 销毁中</li><li> 22： 已销毁</li><li> 30： 扩展节点添加中</li><li> 31： 扩展节点变配中</li><li> 32： 扩展节点删除中</li><li> 33： 扩展节点禁用中</li><li> 34： 扩展节点启用中</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status <p>实例状态</p>枚举值：<ul><li> 0： 运行中</li><li> 1： 创建中</li><li> 16： 变配中</li><li> 17： 隔离中</li><li> 18： 已隔离</li><li> 19： 恢复中</li><li> 20： 已关机</li><li> 21： 销毁中</li><li> 22： 已销毁</li><li> 30： 扩展节点添加中</li><li> 31： 扩展节点变配中</li><li> 32： 扩展节点删除中</li><li> 33： 扩展节点禁用中</li><li> 34： 扩展节点启用中</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreatedAt <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreatedAt <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get <p>最后修改时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdatedAt <p>最后修改时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdatedAt() {
        return this.UpdatedAt;
    }

    /**
     * Set <p>最后修改时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdatedAt <p>最后修改时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdatedAt(String UpdatedAt) {
        this.UpdatedAt = UpdatedAt;
    }

    /**
     * Get <p>标签</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tags <p>标签</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>标签</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tags <p>标签</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>安全组信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Security <p>安全组信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getSecurity() {
        return this.Security;
    }

    /**
     * Set <p>安全组信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Security <p>安全组信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSecurity(String [] Security) {
        this.Security = Security;
    }

    /**
     * Get <p>组件信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Components <p>组件信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Component [] getComponents() {
        return this.Components;
    }

    /**
     * Set <p>组件信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Components <p>组件信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setComponents(Component [] Components) {
        this.Components = Components;
    }

    /**
     * Get <p>过期时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExpiredAt <p>过期时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExpiredAt() {
        return this.ExpiredAt;
    }

    /**
     * Set <p>过期时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExpiredAt <p>过期时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExpiredAt(String ExpiredAt) {
        this.ExpiredAt = ExpiredAt;
    }

    /**
     * Get <p>续费标识</p>枚举值：<ul><li> 0： 默认</li><li> 1： 自动续费</li><li> 2： 不自动续费</li></ul>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RenewFlag <p>续费标识</p>枚举值：<ul><li> 0： 默认</li><li> 1： 自动续费</li><li> 2： 不自动续费</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set <p>续费标识</p>枚举值：<ul><li> 0： 默认</li><li> 1： 自动续费</li><li> 2： 不自动续费</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RenewFlag <p>续费标识</p>枚举值：<ul><li> 0： 默认</li><li> 1： 自动续费</li><li> 2： 不自动续费</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRenewFlag(Long RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get <p>关机时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ShutdownAt <p>关机时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getShutdownAt() {
        return this.ShutdownAt;
    }

    /**
     * Set <p>关机时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ShutdownAt <p>关机时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setShutdownAt(String ShutdownAt) {
        this.ShutdownAt = ShutdownAt;
    }

    /**
     * Get <p>隔离时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsolatedAt <p>隔离时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIsolatedAt() {
        return this.IsolatedAt;
    }

    /**
     * Set <p>隔离时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsolatedAt <p>隔离时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsolatedAt(String IsolatedAt) {
        this.IsolatedAt = IsolatedAt;
    }

    /**
     * Get <p>实例类型</p>枚举值：<ul><li> 0： 共享型</li><li> 1： 独享型</li><li> 2： 标准型</li></ul> 
     * @return Type <p>实例类型</p>枚举值：<ul><li> 0： 共享型</li><li> 1： 独享型</li><li> 2： 标准型</li></ul>
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set <p>实例类型</p>枚举值：<ul><li> 0： 共享型</li><li> 1： 独享型</li><li> 2： 标准型</li></ul>
     * @param Type <p>实例类型</p>枚举值：<ul><li> 0： 共享型</li><li> 1： 独享型</li><li> 2： 标准型</li></ul>
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    public ClusterDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClusterDetail(ClusterDetail source) {
        if (source.AppID != null) {
            this.AppID = new Long(source.AppID);
        }
        if (source.ClusterID != null) {
            this.ClusterID = new String(source.ClusterID);
        }
        if (source.AccountID != null) {
            this.AccountID = new String(source.AccountID);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Networks != null) {
            this.Networks = new Network[source.Networks.length];
            for (int i = 0; i < source.Networks.length; i++) {
                this.Networks[i] = new Network(source.Networks[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.CreatedAt != null) {
            this.CreatedAt = new String(source.CreatedAt);
        }
        if (source.UpdatedAt != null) {
            this.UpdatedAt = new String(source.UpdatedAt);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.Security != null) {
            this.Security = new String[source.Security.length];
            for (int i = 0; i < source.Security.length; i++) {
                this.Security[i] = new String(source.Security[i]);
            }
        }
        if (source.Components != null) {
            this.Components = new Component[source.Components.length];
            for (int i = 0; i < source.Components.length; i++) {
                this.Components[i] = new Component(source.Components[i]);
            }
        }
        if (source.ExpiredAt != null) {
            this.ExpiredAt = new String(source.ExpiredAt);
        }
        if (source.RenewFlag != null) {
            this.RenewFlag = new Long(source.RenewFlag);
        }
        if (source.ShutdownAt != null) {
            this.ShutdownAt = new String(source.ShutdownAt);
        }
        if (source.IsolatedAt != null) {
            this.IsolatedAt = new String(source.IsolatedAt);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppID", this.AppID);
        this.setParamSimple(map, prefix + "ClusterID", this.ClusterID);
        this.setParamSimple(map, prefix + "AccountID", this.AccountID);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamArrayObj(map, prefix + "Networks.", this.Networks);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamSimple(map, prefix + "UpdatedAt", this.UpdatedAt);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamArraySimple(map, prefix + "Security.", this.Security);
        this.setParamArrayObj(map, prefix + "Components.", this.Components);
        this.setParamSimple(map, prefix + "ExpiredAt", this.ExpiredAt);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);
        this.setParamSimple(map, prefix + "ShutdownAt", this.ShutdownAt);
        this.setParamSimple(map, prefix + "IsolatedAt", this.IsolatedAt);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

