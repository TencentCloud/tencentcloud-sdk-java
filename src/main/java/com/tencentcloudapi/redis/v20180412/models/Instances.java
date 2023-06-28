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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Instances extends AbstractModel{

    /**
    * 用户APPID。APPID是与账号ID有唯一对应关系的应用 ID，部分腾讯云产品会使用此 APPID。
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * 实例 ID。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 实例名称。
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 地域ID。<ul><li>1：广州。</li><li>4：上海。</li><li> 5：香港。</li> <li> 6：多伦多。</li> <li> 7：上海金融。</li> <li> 8：北京。</li> <li> 9：新加坡。</li> <li> 11：深圳金融。</li> <li> 15：美西（硅谷）。</li> </ul>
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

    /**
    * 区域 ID。
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * 副本数量。
    */
    @SerializedName("RedisReplicasNum")
    @Expose
    private Long RedisReplicasNum;

    /**
    * 分片数量。
    */
    @SerializedName("RedisShardNum")
    @Expose
    private Long RedisShardNum;

    /**
    * 分片内存大小。
    */
    @SerializedName("RedisShardSize")
    @Expose
    private Long RedisShardSize;

    /**
    * 实例的磁盘大小。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * 引擎：社区版Redis、腾讯云CKV。
    */
    @SerializedName("Engine")
    @Expose
    private String Engine;

    /**
    * 实例读写权限。<ul><li>rw：可读写。</li><li>r：只读。</li></ul>
    */
    @SerializedName("Role")
    @Expose
    private String Role;

    /**
    * 实例 VIP 地址。
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * 内部参数，用户可忽略。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Vip6")
    @Expose
    private String Vip6;

    /**
    * VPC 网络ID，如：75101。
    */
    @SerializedName("VpcID")
    @Expose
    private Long VpcID;

    /**
    * 实例端口。
    */
    @SerializedName("VPort")
    @Expose
    private Long VPort;

    /**
    * 实例状态。<ul><li>0：待初始化。</li><li>1：流程中。</li><li>2：运行中。</li><li>-2：已隔离。</li><li>-3：待删除。</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 仓库ID。
    */
    @SerializedName("GrocerySysId")
    @Expose
    private Long GrocerySysId;

    /**
    * 实例类型。
- 2：Redis 2.8内存版（标准架构）。
- 3：CKV 3.2内存版（标准架构）。
- 4：CKV 3.2内存版（集群架构）。
- 5：Redis 2.8内存版（单机）。
- 6：Redis 4.0内存版（标准架构）。
- 7：Redis 4.0内存版（集群架构）。
- 8：Redis 5.0内存版（标准架构）。
- 9：Redis 5.0内存版（集群架构）。
- 15：Redis 6.2内存版（标准架构）。
- 16：Redis 6.2内存版（集群架构）。
    */
    @SerializedName("ProductType")
    @Expose
    private Long ProductType;

    /**
    * 实例加入复制组的时间。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 复制组中实例更新的时间。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get 用户APPID。APPID是与账号ID有唯一对应关系的应用 ID，部分腾讯云产品会使用此 APPID。 
     * @return AppId 用户APPID。APPID是与账号ID有唯一对应关系的应用 ID，部分腾讯云产品会使用此 APPID。
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set 用户APPID。APPID是与账号ID有唯一对应关系的应用 ID，部分腾讯云产品会使用此 APPID。
     * @param AppId 用户APPID。APPID是与账号ID有唯一对应关系的应用 ID，部分腾讯云产品会使用此 APPID。
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 实例 ID。 
     * @return InstanceId 实例 ID。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例 ID。
     * @param InstanceId 实例 ID。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 实例名称。 
     * @return InstanceName 实例名称。
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 实例名称。
     * @param InstanceName 实例名称。
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 地域ID。<ul><li>1：广州。</li><li>4：上海。</li><li> 5：香港。</li> <li> 6：多伦多。</li> <li> 7：上海金融。</li> <li> 8：北京。</li> <li> 9：新加坡。</li> <li> 11：深圳金融。</li> <li> 15：美西（硅谷）。</li> </ul> 
     * @return RegionId 地域ID。<ul><li>1：广州。</li><li>4：上海。</li><li> 5：香港。</li> <li> 6：多伦多。</li> <li> 7：上海金融。</li> <li> 8：北京。</li> <li> 9：新加坡。</li> <li> 11：深圳金融。</li> <li> 15：美西（硅谷）。</li> </ul>
     */
    public Long getRegionId() {
        return this.RegionId;
    }

    /**
     * Set 地域ID。<ul><li>1：广州。</li><li>4：上海。</li><li> 5：香港。</li> <li> 6：多伦多。</li> <li> 7：上海金融。</li> <li> 8：北京。</li> <li> 9：新加坡。</li> <li> 11：深圳金融。</li> <li> 15：美西（硅谷）。</li> </ul>
     * @param RegionId 地域ID。<ul><li>1：广州。</li><li>4：上海。</li><li> 5：香港。</li> <li> 6：多伦多。</li> <li> 7：上海金融。</li> <li> 8：北京。</li> <li> 9：新加坡。</li> <li> 11：深圳金融。</li> <li> 15：美西（硅谷）。</li> </ul>
     */
    public void setRegionId(Long RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get 区域 ID。 
     * @return ZoneId 区域 ID。
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 区域 ID。
     * @param ZoneId 区域 ID。
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 副本数量。 
     * @return RedisReplicasNum 副本数量。
     */
    public Long getRedisReplicasNum() {
        return this.RedisReplicasNum;
    }

    /**
     * Set 副本数量。
     * @param RedisReplicasNum 副本数量。
     */
    public void setRedisReplicasNum(Long RedisReplicasNum) {
        this.RedisReplicasNum = RedisReplicasNum;
    }

    /**
     * Get 分片数量。 
     * @return RedisShardNum 分片数量。
     */
    public Long getRedisShardNum() {
        return this.RedisShardNum;
    }

    /**
     * Set 分片数量。
     * @param RedisShardNum 分片数量。
     */
    public void setRedisShardNum(Long RedisShardNum) {
        this.RedisShardNum = RedisShardNum;
    }

    /**
     * Get 分片内存大小。 
     * @return RedisShardSize 分片内存大小。
     */
    public Long getRedisShardSize() {
        return this.RedisShardSize;
    }

    /**
     * Set 分片内存大小。
     * @param RedisShardSize 分片内存大小。
     */
    public void setRedisShardSize(Long RedisShardSize) {
        this.RedisShardSize = RedisShardSize;
    }

    /**
     * Get 实例的磁盘大小。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DiskSize 实例的磁盘大小。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set 实例的磁盘大小。
注意：此字段可能返回 null，表示取不到有效值。
     * @param DiskSize 实例的磁盘大小。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get 引擎：社区版Redis、腾讯云CKV。 
     * @return Engine 引擎：社区版Redis、腾讯云CKV。
     */
    public String getEngine() {
        return this.Engine;
    }

    /**
     * Set 引擎：社区版Redis、腾讯云CKV。
     * @param Engine 引擎：社区版Redis、腾讯云CKV。
     */
    public void setEngine(String Engine) {
        this.Engine = Engine;
    }

    /**
     * Get 实例读写权限。<ul><li>rw：可读写。</li><li>r：只读。</li></ul> 
     * @return Role 实例读写权限。<ul><li>rw：可读写。</li><li>r：只读。</li></ul>
     */
    public String getRole() {
        return this.Role;
    }

    /**
     * Set 实例读写权限。<ul><li>rw：可读写。</li><li>r：只读。</li></ul>
     * @param Role 实例读写权限。<ul><li>rw：可读写。</li><li>r：只读。</li></ul>
     */
    public void setRole(String Role) {
        this.Role = Role;
    }

    /**
     * Get 实例 VIP 地址。 
     * @return Vip 实例 VIP 地址。
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set 实例 VIP 地址。
     * @param Vip 实例 VIP 地址。
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get 内部参数，用户可忽略。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Vip6 内部参数，用户可忽略。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVip6() {
        return this.Vip6;
    }

    /**
     * Set 内部参数，用户可忽略。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Vip6 内部参数，用户可忽略。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVip6(String Vip6) {
        this.Vip6 = Vip6;
    }

    /**
     * Get VPC 网络ID，如：75101。 
     * @return VpcID VPC 网络ID，如：75101。
     */
    public Long getVpcID() {
        return this.VpcID;
    }

    /**
     * Set VPC 网络ID，如：75101。
     * @param VpcID VPC 网络ID，如：75101。
     */
    public void setVpcID(Long VpcID) {
        this.VpcID = VpcID;
    }

    /**
     * Get 实例端口。 
     * @return VPort 实例端口。
     */
    public Long getVPort() {
        return this.VPort;
    }

    /**
     * Set 实例端口。
     * @param VPort 实例端口。
     */
    public void setVPort(Long VPort) {
        this.VPort = VPort;
    }

    /**
     * Get 实例状态。<ul><li>0：待初始化。</li><li>1：流程中。</li><li>2：运行中。</li><li>-2：已隔离。</li><li>-3：待删除。</li></ul> 
     * @return Status 实例状态。<ul><li>0：待初始化。</li><li>1：流程中。</li><li>2：运行中。</li><li>-2：已隔离。</li><li>-3：待删除。</li></ul>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 实例状态。<ul><li>0：待初始化。</li><li>1：流程中。</li><li>2：运行中。</li><li>-2：已隔离。</li><li>-3：待删除。</li></ul>
     * @param Status 实例状态。<ul><li>0：待初始化。</li><li>1：流程中。</li><li>2：运行中。</li><li>-2：已隔离。</li><li>-3：待删除。</li></ul>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 仓库ID。 
     * @return GrocerySysId 仓库ID。
     */
    public Long getGrocerySysId() {
        return this.GrocerySysId;
    }

    /**
     * Set 仓库ID。
     * @param GrocerySysId 仓库ID。
     */
    public void setGrocerySysId(Long GrocerySysId) {
        this.GrocerySysId = GrocerySysId;
    }

    /**
     * Get 实例类型。
- 2：Redis 2.8内存版（标准架构）。
- 3：CKV 3.2内存版（标准架构）。
- 4：CKV 3.2内存版（集群架构）。
- 5：Redis 2.8内存版（单机）。
- 6：Redis 4.0内存版（标准架构）。
- 7：Redis 4.0内存版（集群架构）。
- 8：Redis 5.0内存版（标准架构）。
- 9：Redis 5.0内存版（集群架构）。
- 15：Redis 6.2内存版（标准架构）。
- 16：Redis 6.2内存版（集群架构）。 
     * @return ProductType 实例类型。
- 2：Redis 2.8内存版（标准架构）。
- 3：CKV 3.2内存版（标准架构）。
- 4：CKV 3.2内存版（集群架构）。
- 5：Redis 2.8内存版（单机）。
- 6：Redis 4.0内存版（标准架构）。
- 7：Redis 4.0内存版（集群架构）。
- 8：Redis 5.0内存版（标准架构）。
- 9：Redis 5.0内存版（集群架构）。
- 15：Redis 6.2内存版（标准架构）。
- 16：Redis 6.2内存版（集群架构）。
     */
    public Long getProductType() {
        return this.ProductType;
    }

    /**
     * Set 实例类型。
- 2：Redis 2.8内存版（标准架构）。
- 3：CKV 3.2内存版（标准架构）。
- 4：CKV 3.2内存版（集群架构）。
- 5：Redis 2.8内存版（单机）。
- 6：Redis 4.0内存版（标准架构）。
- 7：Redis 4.0内存版（集群架构）。
- 8：Redis 5.0内存版（标准架构）。
- 9：Redis 5.0内存版（集群架构）。
- 15：Redis 6.2内存版（标准架构）。
- 16：Redis 6.2内存版（集群架构）。
     * @param ProductType 实例类型。
- 2：Redis 2.8内存版（标准架构）。
- 3：CKV 3.2内存版（标准架构）。
- 4：CKV 3.2内存版（集群架构）。
- 5：Redis 2.8内存版（单机）。
- 6：Redis 4.0内存版（标准架构）。
- 7：Redis 4.0内存版（集群架构）。
- 8：Redis 5.0内存版（标准架构）。
- 9：Redis 5.0内存版（集群架构）。
- 15：Redis 6.2内存版（标准架构）。
- 16：Redis 6.2内存版（集群架构）。
     */
    public void setProductType(Long ProductType) {
        this.ProductType = ProductType;
    }

    /**
     * Get 实例加入复制组的时间。 
     * @return CreateTime 实例加入复制组的时间。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 实例加入复制组的时间。
     * @param CreateTime 实例加入复制组的时间。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 复制组中实例更新的时间。 
     * @return UpdateTime 复制组中实例更新的时间。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 复制组中实例更新的时间。
     * @param UpdateTime 复制组中实例更新的时间。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public Instances() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Instances(Instances source) {
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.RegionId != null) {
            this.RegionId = new Long(source.RegionId);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new Long(source.ZoneId);
        }
        if (source.RedisReplicasNum != null) {
            this.RedisReplicasNum = new Long(source.RedisReplicasNum);
        }
        if (source.RedisShardNum != null) {
            this.RedisShardNum = new Long(source.RedisShardNum);
        }
        if (source.RedisShardSize != null) {
            this.RedisShardSize = new Long(source.RedisShardSize);
        }
        if (source.DiskSize != null) {
            this.DiskSize = new Long(source.DiskSize);
        }
        if (source.Engine != null) {
            this.Engine = new String(source.Engine);
        }
        if (source.Role != null) {
            this.Role = new String(source.Role);
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.Vip6 != null) {
            this.Vip6 = new String(source.Vip6);
        }
        if (source.VpcID != null) {
            this.VpcID = new Long(source.VpcID);
        }
        if (source.VPort != null) {
            this.VPort = new Long(source.VPort);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.GrocerySysId != null) {
            this.GrocerySysId = new Long(source.GrocerySysId);
        }
        if (source.ProductType != null) {
            this.ProductType = new Long(source.ProductType);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "RedisReplicasNum", this.RedisReplicasNum);
        this.setParamSimple(map, prefix + "RedisShardNum", this.RedisShardNum);
        this.setParamSimple(map, prefix + "RedisShardSize", this.RedisShardSize);
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);
        this.setParamSimple(map, prefix + "Engine", this.Engine);
        this.setParamSimple(map, prefix + "Role", this.Role);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "Vip6", this.Vip6);
        this.setParamSimple(map, prefix + "VpcID", this.VpcID);
        this.setParamSimple(map, prefix + "VPort", this.VPort);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "GrocerySysId", this.GrocerySysId);
        this.setParamSimple(map, prefix + "ProductType", this.ProductType);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

