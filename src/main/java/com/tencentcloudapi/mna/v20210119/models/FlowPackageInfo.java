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
package com.tencentcloudapi.mna.v20210119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FlowPackageInfo extends AbstractModel {

    /**
    * 流量包的唯一资源ID
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 流量包所属的用户AppId
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * 流量包规格类型。可取值如下：
DEVICE_1_FLOW_20G、DEVICE_2_FLOW_50G、
DEVICE_3_FLOW_100G、
DEVICE_5_FLOW_500G，分别代表20G、50G、100G、500G档位的流量包。
档位也影响流量包可绑定的设备数量上限：
20G：最多绑定1个设备
50G：最多绑定2个设备
100G：最多绑定3个设备
500G：最多绑定5个设备
    */
    @SerializedName("PackageType")
    @Expose
    private String PackageType;

    /**
    * 流量包状态，0：未生效，1：有效期内，2：已过期
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 购买时间，Unix时间戳格式，单位：秒
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * 生效时间，Unix时间戳格式，单位：秒
    */
    @SerializedName("ActiveTime")
    @Expose
    private Long ActiveTime;

    /**
    * 过期时间，Unix时间戳格式，单位：秒
    */
    @SerializedName("ExpireTime")
    @Expose
    private Long ExpireTime;

    /**
    * 流量包绑定的设备ID列表
    */
    @SerializedName("DeviceList")
    @Expose
    private String [] DeviceList;

    /**
    * 流量包总容量，单位：MB
    */
    @SerializedName("CapacitySize")
    @Expose
    private Long CapacitySize;

    /**
    * 流量包余量，单位：MB
    */
    @SerializedName("CapacityRemain")
    @Expose
    private Long CapacityRemain;

    /**
    * 自动续费标识。true代表自动续费，false代表不自动续费
    */
    @SerializedName("RenewFlag")
    @Expose
    private Boolean RenewFlag;

    /**
    * 资源包变更状态，0：未发生变配；1：变配中；2：已变配或已续费
    */
    @SerializedName("ModifyStatus")
    @Expose
    private Long ModifyStatus;

    /**
     * Get 流量包的唯一资源ID 
     * @return ResourceId 流量包的唯一资源ID
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 流量包的唯一资源ID
     * @param ResourceId 流量包的唯一资源ID
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get 流量包所属的用户AppId 
     * @return AppId 流量包所属的用户AppId
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set 流量包所属的用户AppId
     * @param AppId 流量包所属的用户AppId
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 流量包规格类型。可取值如下：
DEVICE_1_FLOW_20G、DEVICE_2_FLOW_50G、
DEVICE_3_FLOW_100G、
DEVICE_5_FLOW_500G，分别代表20G、50G、100G、500G档位的流量包。
档位也影响流量包可绑定的设备数量上限：
20G：最多绑定1个设备
50G：最多绑定2个设备
100G：最多绑定3个设备
500G：最多绑定5个设备 
     * @return PackageType 流量包规格类型。可取值如下：
DEVICE_1_FLOW_20G、DEVICE_2_FLOW_50G、
DEVICE_3_FLOW_100G、
DEVICE_5_FLOW_500G，分别代表20G、50G、100G、500G档位的流量包。
档位也影响流量包可绑定的设备数量上限：
20G：最多绑定1个设备
50G：最多绑定2个设备
100G：最多绑定3个设备
500G：最多绑定5个设备
     */
    public String getPackageType() {
        return this.PackageType;
    }

    /**
     * Set 流量包规格类型。可取值如下：
DEVICE_1_FLOW_20G、DEVICE_2_FLOW_50G、
DEVICE_3_FLOW_100G、
DEVICE_5_FLOW_500G，分别代表20G、50G、100G、500G档位的流量包。
档位也影响流量包可绑定的设备数量上限：
20G：最多绑定1个设备
50G：最多绑定2个设备
100G：最多绑定3个设备
500G：最多绑定5个设备
     * @param PackageType 流量包规格类型。可取值如下：
DEVICE_1_FLOW_20G、DEVICE_2_FLOW_50G、
DEVICE_3_FLOW_100G、
DEVICE_5_FLOW_500G，分别代表20G、50G、100G、500G档位的流量包。
档位也影响流量包可绑定的设备数量上限：
20G：最多绑定1个设备
50G：最多绑定2个设备
100G：最多绑定3个设备
500G：最多绑定5个设备
     */
    public void setPackageType(String PackageType) {
        this.PackageType = PackageType;
    }

    /**
     * Get 流量包状态，0：未生效，1：有效期内，2：已过期 
     * @return Status 流量包状态，0：未生效，1：有效期内，2：已过期
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 流量包状态，0：未生效，1：有效期内，2：已过期
     * @param Status 流量包状态，0：未生效，1：有效期内，2：已过期
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 购买时间，Unix时间戳格式，单位：秒
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 购买时间，Unix时间戳格式，单位：秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 购买时间，Unix时间戳格式，单位：秒
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 购买时间，Unix时间戳格式，单位：秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 生效时间，Unix时间戳格式，单位：秒 
     * @return ActiveTime 生效时间，Unix时间戳格式，单位：秒
     */
    public Long getActiveTime() {
        return this.ActiveTime;
    }

    /**
     * Set 生效时间，Unix时间戳格式，单位：秒
     * @param ActiveTime 生效时间，Unix时间戳格式，单位：秒
     */
    public void setActiveTime(Long ActiveTime) {
        this.ActiveTime = ActiveTime;
    }

    /**
     * Get 过期时间，Unix时间戳格式，单位：秒 
     * @return ExpireTime 过期时间，Unix时间戳格式，单位：秒
     */
    public Long getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 过期时间，Unix时间戳格式，单位：秒
     * @param ExpireTime 过期时间，Unix时间戳格式，单位：秒
     */
    public void setExpireTime(Long ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get 流量包绑定的设备ID列表 
     * @return DeviceList 流量包绑定的设备ID列表
     */
    public String [] getDeviceList() {
        return this.DeviceList;
    }

    /**
     * Set 流量包绑定的设备ID列表
     * @param DeviceList 流量包绑定的设备ID列表
     */
    public void setDeviceList(String [] DeviceList) {
        this.DeviceList = DeviceList;
    }

    /**
     * Get 流量包总容量，单位：MB 
     * @return CapacitySize 流量包总容量，单位：MB
     */
    public Long getCapacitySize() {
        return this.CapacitySize;
    }

    /**
     * Set 流量包总容量，单位：MB
     * @param CapacitySize 流量包总容量，单位：MB
     */
    public void setCapacitySize(Long CapacitySize) {
        this.CapacitySize = CapacitySize;
    }

    /**
     * Get 流量包余量，单位：MB 
     * @return CapacityRemain 流量包余量，单位：MB
     */
    public Long getCapacityRemain() {
        return this.CapacityRemain;
    }

    /**
     * Set 流量包余量，单位：MB
     * @param CapacityRemain 流量包余量，单位：MB
     */
    public void setCapacityRemain(Long CapacityRemain) {
        this.CapacityRemain = CapacityRemain;
    }

    /**
     * Get 自动续费标识。true代表自动续费，false代表不自动续费 
     * @return RenewFlag 自动续费标识。true代表自动续费，false代表不自动续费
     */
    public Boolean getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set 自动续费标识。true代表自动续费，false代表不自动续费
     * @param RenewFlag 自动续费标识。true代表自动续费，false代表不自动续费
     */
    public void setRenewFlag(Boolean RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get 资源包变更状态，0：未发生变配；1：变配中；2：已变配或已续费 
     * @return ModifyStatus 资源包变更状态，0：未发生变配；1：变配中；2：已变配或已续费
     */
    public Long getModifyStatus() {
        return this.ModifyStatus;
    }

    /**
     * Set 资源包变更状态，0：未发生变配；1：变配中；2：已变配或已续费
     * @param ModifyStatus 资源包变更状态，0：未发生变配；1：变配中；2：已变配或已续费
     */
    public void setModifyStatus(Long ModifyStatus) {
        this.ModifyStatus = ModifyStatus;
    }

    public FlowPackageInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FlowPackageInfo(FlowPackageInfo source) {
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.PackageType != null) {
            this.PackageType = new String(source.PackageType);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.ActiveTime != null) {
            this.ActiveTime = new Long(source.ActiveTime);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new Long(source.ExpireTime);
        }
        if (source.DeviceList != null) {
            this.DeviceList = new String[source.DeviceList.length];
            for (int i = 0; i < source.DeviceList.length; i++) {
                this.DeviceList[i] = new String(source.DeviceList[i]);
            }
        }
        if (source.CapacitySize != null) {
            this.CapacitySize = new Long(source.CapacitySize);
        }
        if (source.CapacityRemain != null) {
            this.CapacityRemain = new Long(source.CapacityRemain);
        }
        if (source.RenewFlag != null) {
            this.RenewFlag = new Boolean(source.RenewFlag);
        }
        if (source.ModifyStatus != null) {
            this.ModifyStatus = new Long(source.ModifyStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "PackageType", this.PackageType);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ActiveTime", this.ActiveTime);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamArraySimple(map, prefix + "DeviceList.", this.DeviceList);
        this.setParamSimple(map, prefix + "CapacitySize", this.CapacitySize);
        this.setParamSimple(map, prefix + "CapacityRemain", this.CapacityRemain);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);
        this.setParamSimple(map, prefix + "ModifyStatus", this.ModifyStatus);

    }
}

