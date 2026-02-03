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
    * <p>setats serialId</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SetatsSerialId")
    @Expose
    private String SetatsSerialId;

    /**
    * <p>1  // 停止<br>2  // 运行中<br>3  // 初始化中<br>4  // 扩容中<br>5  // Warehoouse未配置<br>6  // Warehoouse配置中<br>7  // 重启中<br>-2 // 已删除(集群被销毁时更新为此状态)</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>setats warehouse</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Warehouse")
    @Expose
    private Warehouse Warehouse;

    /**
    * <p>setats master 机器规格</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MasterInfo")
    @Expose
    private SetatsCvmInfo MasterInfo;

    /**
    * <p>setats worker规格</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkerInfo")
    @Expose
    private SetatsCvmInfo WorkerInfo;

    /**
    * <p>标签</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * <p>自动续费</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
    * <p>过期时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * <p>过期时间 秒</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SecondsUntilExpiry")
    @Expose
    private String SecondsUntilExpiry;

    /**
    * <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>manager url</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ManagerUrl")
    @Expose
    private String ManagerUrl;

    /**
    * <p>隔离时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsolatedTime")
    @Expose
    private String IsolatedTime;

    /**
    * <p>Setats集群自己的id</p>
    */
    @SerializedName("OwnerClusterGroupSerialId")
    @Expose
    private String OwnerClusterGroupSerialId;

    /**
    * <p>setats 集群类型</p>
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * <p>Setats UI url</p>
    */
    @SerializedName("SetatsUiUrl")
    @Expose
    private String SetatsUiUrl;

    /**
    * <p>setats镜像版本</p>
    */
    @SerializedName("ImageVersion")
    @Expose
    private String ImageVersion;

    /**
     * Get <p>setats serialId</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SetatsSerialId <p>setats serialId</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSetatsSerialId() {
        return this.SetatsSerialId;
    }

    /**
     * Set <p>setats serialId</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SetatsSerialId <p>setats serialId</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSetatsSerialId(String SetatsSerialId) {
        this.SetatsSerialId = SetatsSerialId;
    }

    /**
     * Get <p>1  // 停止<br>2  // 运行中<br>3  // 初始化中<br>4  // 扩容中<br>5  // Warehoouse未配置<br>6  // Warehoouse配置中<br>7  // 重启中<br>-2 // 已删除(集群被销毁时更新为此状态)</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status <p>1  // 停止<br>2  // 运行中<br>3  // 初始化中<br>4  // 扩容中<br>5  // Warehoouse未配置<br>6  // Warehoouse配置中<br>7  // 重启中<br>-2 // 已删除(集群被销毁时更新为此状态)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>1  // 停止<br>2  // 运行中<br>3  // 初始化中<br>4  // 扩容中<br>5  // Warehoouse未配置<br>6  // Warehoouse配置中<br>7  // 重启中<br>-2 // 已删除(集群被销毁时更新为此状态)</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status <p>1  // 停止<br>2  // 运行中<br>3  // 初始化中<br>4  // 扩容中<br>5  // Warehoouse未配置<br>6  // Warehoouse配置中<br>7  // 重启中<br>-2 // 已删除(集群被销毁时更新为此状态)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>setats warehouse</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Warehouse <p>setats warehouse</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Warehouse getWarehouse() {
        return this.Warehouse;
    }

    /**
     * Set <p>setats warehouse</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Warehouse <p>setats warehouse</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWarehouse(Warehouse Warehouse) {
        this.Warehouse = Warehouse;
    }

    /**
     * Get <p>setats master 机器规格</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MasterInfo <p>setats master 机器规格</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SetatsCvmInfo getMasterInfo() {
        return this.MasterInfo;
    }

    /**
     * Set <p>setats master 机器规格</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param MasterInfo <p>setats master 机器规格</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMasterInfo(SetatsCvmInfo MasterInfo) {
        this.MasterInfo = MasterInfo;
    }

    /**
     * Get <p>setats worker规格</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkerInfo <p>setats worker规格</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SetatsCvmInfo getWorkerInfo() {
        return this.WorkerInfo;
    }

    /**
     * Set <p>setats worker规格</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkerInfo <p>setats worker规格</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkerInfo(SetatsCvmInfo WorkerInfo) {
        this.WorkerInfo = WorkerInfo;
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
     * Get <p>自动续费</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AutoRenewFlag <p>自动续费</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set <p>自动续费</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AutoRenewFlag <p>自动续费</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get <p>过期时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExpireTime <p>过期时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set <p>过期时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExpireTime <p>过期时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get <p>过期时间 秒</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SecondsUntilExpiry <p>过期时间 秒</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSecondsUntilExpiry() {
        return this.SecondsUntilExpiry;
    }

    /**
     * Set <p>过期时间 秒</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SecondsUntilExpiry <p>过期时间 秒</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSecondsUntilExpiry(String SecondsUntilExpiry) {
        this.SecondsUntilExpiry = SecondsUntilExpiry;
    }

    /**
     * Get <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>manager url</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ManagerUrl <p>manager url</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getManagerUrl() {
        return this.ManagerUrl;
    }

    /**
     * Set <p>manager url</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ManagerUrl <p>manager url</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setManagerUrl(String ManagerUrl) {
        this.ManagerUrl = ManagerUrl;
    }

    /**
     * Get <p>隔离时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsolatedTime <p>隔离时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIsolatedTime() {
        return this.IsolatedTime;
    }

    /**
     * Set <p>隔离时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsolatedTime <p>隔离时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsolatedTime(String IsolatedTime) {
        this.IsolatedTime = IsolatedTime;
    }

    /**
     * Get <p>Setats集群自己的id</p> 
     * @return OwnerClusterGroupSerialId <p>Setats集群自己的id</p>
     */
    public String getOwnerClusterGroupSerialId() {
        return this.OwnerClusterGroupSerialId;
    }

    /**
     * Set <p>Setats集群自己的id</p>
     * @param OwnerClusterGroupSerialId <p>Setats集群自己的id</p>
     */
    public void setOwnerClusterGroupSerialId(String OwnerClusterGroupSerialId) {
        this.OwnerClusterGroupSerialId = OwnerClusterGroupSerialId;
    }

    /**
     * Get <p>setats 集群类型</p> 
     * @return Type <p>setats 集群类型</p>
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set <p>setats 集群类型</p>
     * @param Type <p>setats 集群类型</p>
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get <p>Setats UI url</p> 
     * @return SetatsUiUrl <p>Setats UI url</p>
     */
    public String getSetatsUiUrl() {
        return this.SetatsUiUrl;
    }

    /**
     * Set <p>Setats UI url</p>
     * @param SetatsUiUrl <p>Setats UI url</p>
     */
    public void setSetatsUiUrl(String SetatsUiUrl) {
        this.SetatsUiUrl = SetatsUiUrl;
    }

    /**
     * Get <p>setats镜像版本</p> 
     * @return ImageVersion <p>setats镜像版本</p>
     */
    public String getImageVersion() {
        return this.ImageVersion;
    }

    /**
     * Set <p>setats镜像版本</p>
     * @param ImageVersion <p>setats镜像版本</p>
     */
    public void setImageVersion(String ImageVersion) {
        this.ImageVersion = ImageVersion;
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
        if (source.OwnerClusterGroupSerialId != null) {
            this.OwnerClusterGroupSerialId = new String(source.OwnerClusterGroupSerialId);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.SetatsUiUrl != null) {
            this.SetatsUiUrl = new String(source.SetatsUiUrl);
        }
        if (source.ImageVersion != null) {
            this.ImageVersion = new String(source.ImageVersion);
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
        this.setParamSimple(map, prefix + "OwnerClusterGroupSerialId", this.OwnerClusterGroupSerialId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "SetatsUiUrl", this.SetatsUiUrl);
        this.setParamSimple(map, prefix + "ImageVersion", this.ImageVersion);

    }
}

