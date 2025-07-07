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
package com.tencentcloudapi.oceanus.v20190422.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Setats extends AbstractModel {

    /**
    * setats serialId
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SetatsSerialId")
    @Expose
    private String SetatsSerialId;

    /**
    * 1  // 停止
2  // 运行中
3  // 初始化中
4  // 扩容中
5  // Warehoouse未配置
6  // Warehoouse配置中
7  // 重启中
-2 // 已删除(集群被销毁时更新为此状态)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * setats warehouse
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Warehouse")
    @Expose
    private Warehouse Warehouse;

    /**
    * setats master 机器规格
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MasterInfo")
    @Expose
    private SetatsCvmInfo MasterInfo;

    /**
    * setats worker规格
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkerInfo")
    @Expose
    private SetatsCvmInfo WorkerInfo;

    /**
    * 标签
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * 自动续费
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
    * 过期时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * 过期时间 秒
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SecondsUntilExpiry")
    @Expose
    private String SecondsUntilExpiry;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * manager url
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ManagerUrl")
    @Expose
    private String ManagerUrl;

    /**
    * 隔离时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsolatedTime")
    @Expose
    private String IsolatedTime;

    /**
     * Get setats serialId
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SetatsSerialId setats serialId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSetatsSerialId() {
        return this.SetatsSerialId;
    }

    /**
     * Set setats serialId
注意：此字段可能返回 null，表示取不到有效值。
     * @param SetatsSerialId setats serialId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSetatsSerialId(String SetatsSerialId) {
        this.SetatsSerialId = SetatsSerialId;
    }

    /**
     * Get 1  // 停止
2  // 运行中
3  // 初始化中
4  // 扩容中
5  // Warehoouse未配置
6  // Warehoouse配置中
7  // 重启中
-2 // 已删除(集群被销毁时更新为此状态)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 1  // 停止
2  // 运行中
3  // 初始化中
4  // 扩容中
5  // Warehoouse未配置
6  // Warehoouse配置中
7  // 重启中
-2 // 已删除(集群被销毁时更新为此状态)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 1  // 停止
2  // 运行中
3  // 初始化中
4  // 扩容中
5  // Warehoouse未配置
6  // Warehoouse配置中
7  // 重启中
-2 // 已删除(集群被销毁时更新为此状态)
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 1  // 停止
2  // 运行中
3  // 初始化中
4  // 扩容中
5  // Warehoouse未配置
6  // Warehoouse配置中
7  // 重启中
-2 // 已删除(集群被销毁时更新为此状态)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get setats warehouse
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Warehouse setats warehouse
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Warehouse getWarehouse() {
        return this.Warehouse;
    }

    /**
     * Set setats warehouse
注意：此字段可能返回 null，表示取不到有效值。
     * @param Warehouse setats warehouse
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWarehouse(Warehouse Warehouse) {
        this.Warehouse = Warehouse;
    }

    /**
     * Get setats master 机器规格
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MasterInfo setats master 机器规格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SetatsCvmInfo getMasterInfo() {
        return this.MasterInfo;
    }

    /**
     * Set setats master 机器规格
注意：此字段可能返回 null，表示取不到有效值。
     * @param MasterInfo setats master 机器规格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMasterInfo(SetatsCvmInfo MasterInfo) {
        this.MasterInfo = MasterInfo;
    }

    /**
     * Get setats worker规格
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkerInfo setats worker规格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SetatsCvmInfo getWorkerInfo() {
        return this.WorkerInfo;
    }

    /**
     * Set setats worker规格
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkerInfo setats worker规格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkerInfo(SetatsCvmInfo WorkerInfo) {
        this.WorkerInfo = WorkerInfo;
    }

    /**
     * Get 标签
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tags 标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tags 标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 自动续费
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AutoRenewFlag 自动续费
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set 自动续费
注意：此字段可能返回 null，表示取不到有效值。
     * @param AutoRenewFlag 自动续费
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get 过期时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExpireTime 过期时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 过期时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExpireTime 过期时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get 过期时间 秒
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SecondsUntilExpiry 过期时间 秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSecondsUntilExpiry() {
        return this.SecondsUntilExpiry;
    }

    /**
     * Set 过期时间 秒
注意：此字段可能返回 null，表示取不到有效值。
     * @param SecondsUntilExpiry 过期时间 秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSecondsUntilExpiry(String SecondsUntilExpiry) {
        this.SecondsUntilExpiry = SecondsUntilExpiry;
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
     * Get manager url
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ManagerUrl manager url
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getManagerUrl() {
        return this.ManagerUrl;
    }

    /**
     * Set manager url
注意：此字段可能返回 null，表示取不到有效值。
     * @param ManagerUrl manager url
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setManagerUrl(String ManagerUrl) {
        this.ManagerUrl = ManagerUrl;
    }

    /**
     * Get 隔离时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsolatedTime 隔离时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIsolatedTime() {
        return this.IsolatedTime;
    }

    /**
     * Set 隔离时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsolatedTime 隔离时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsolatedTime(String IsolatedTime) {
        this.IsolatedTime = IsolatedTime;
    }

    public Setats() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Setats(Setats source) {
        if (source.SetatsSerialId != null) {
            this.SetatsSerialId = new String(source.SetatsSerialId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Warehouse != null) {
            this.Warehouse = new Warehouse(source.Warehouse);
        }
        if (source.MasterInfo != null) {
            this.MasterInfo = new SetatsCvmInfo(source.MasterInfo);
        }
        if (source.WorkerInfo != null) {
            this.WorkerInfo = new SetatsCvmInfo(source.WorkerInfo);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.AutoRenewFlag != null) {
            this.AutoRenewFlag = new Long(source.AutoRenewFlag);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.SecondsUntilExpiry != null) {
            this.SecondsUntilExpiry = new String(source.SecondsUntilExpiry);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ManagerUrl != null) {
            this.ManagerUrl = new String(source.ManagerUrl);
        }
        if (source.IsolatedTime != null) {
            this.IsolatedTime = new String(source.IsolatedTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SetatsSerialId", this.SetatsSerialId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamObj(map, prefix + "Warehouse.", this.Warehouse);
        this.setParamObj(map, prefix + "MasterInfo.", this.MasterInfo);
        this.setParamObj(map, prefix + "WorkerInfo.", this.WorkerInfo);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "SecondsUntilExpiry", this.SecondsUntilExpiry);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ManagerUrl", this.ManagerUrl);
        this.setParamSimple(map, prefix + "IsolatedTime", this.IsolatedTime);

    }
}

