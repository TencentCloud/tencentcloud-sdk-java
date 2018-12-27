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
package com.tencentcloudapi.bm.v20180423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DevicePositionInfo  extends AbstractModel{

    /**
    * 设备ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 所在可用区
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 私有网络ID
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 子网ID
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 业务IP
    */
    @SerializedName("LanIp")
    @Expose
    private String LanIp;

    /**
    * 实例别名
    */
    @SerializedName("Alias")
    @Expose
    private String Alias;

    /**
    * 机架名称
    */
    @SerializedName("RckName")
    @Expose
    private String RckName;

    /**
    * 机位
    */
    @SerializedName("PosCode")
    @Expose
    private Integer PosCode;

    /**
    * 交换机名称
    */
    @SerializedName("SwitchName")
    @Expose
    private String SwitchName;

    /**
    * 设备交付时间
    */
    @SerializedName("DeliverTime")
    @Expose
    private String DeliverTime;

    /**
    * 过期时间
    */
    @SerializedName("Deadline")
    @Expose
    private String Deadline;

    /**
     * 获取设备ID
     * @return InstanceId 设备ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * 设置设备ID
     * @param InstanceId 设备ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * 获取所在可用区
     * @return Zone 所在可用区
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * 设置所在可用区
     * @param Zone 所在可用区
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * 获取私有网络ID
     * @return VpcId 私有网络ID
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * 设置私有网络ID
     * @param VpcId 私有网络ID
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * 获取子网ID
     * @return SubnetId 子网ID
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * 设置子网ID
     * @param SubnetId 子网ID
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * 获取业务IP
     * @return LanIp 业务IP
     */
    public String getLanIp() {
        return this.LanIp;
    }

    /**
     * 设置业务IP
     * @param LanIp 业务IP
     */
    public void setLanIp(String LanIp) {
        this.LanIp = LanIp;
    }

    /**
     * 获取实例别名
     * @return Alias 实例别名
     */
    public String getAlias() {
        return this.Alias;
    }

    /**
     * 设置实例别名
     * @param Alias 实例别名
     */
    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    /**
     * 获取机架名称
     * @return RckName 机架名称
     */
    public String getRckName() {
        return this.RckName;
    }

    /**
     * 设置机架名称
     * @param RckName 机架名称
     */
    public void setRckName(String RckName) {
        this.RckName = RckName;
    }

    /**
     * 获取机位
     * @return PosCode 机位
     */
    public Integer getPosCode() {
        return this.PosCode;
    }

    /**
     * 设置机位
     * @param PosCode 机位
     */
    public void setPosCode(Integer PosCode) {
        this.PosCode = PosCode;
    }

    /**
     * 获取交换机名称
     * @return SwitchName 交换机名称
     */
    public String getSwitchName() {
        return this.SwitchName;
    }

    /**
     * 设置交换机名称
     * @param SwitchName 交换机名称
     */
    public void setSwitchName(String SwitchName) {
        this.SwitchName = SwitchName;
    }

    /**
     * 获取设备交付时间
     * @return DeliverTime 设备交付时间
     */
    public String getDeliverTime() {
        return this.DeliverTime;
    }

    /**
     * 设置设备交付时间
     * @param DeliverTime 设备交付时间
     */
    public void setDeliverTime(String DeliverTime) {
        this.DeliverTime = DeliverTime;
    }

    /**
     * 获取过期时间
     * @return Deadline 过期时间
     */
    public String getDeadline() {
        return this.Deadline;
    }

    /**
     * 设置过期时间
     * @param Deadline 过期时间
     */
    public void setDeadline(String Deadline) {
        this.Deadline = Deadline;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "LanIp", this.LanIp);
        this.setParamSimple(map, prefix + "Alias", this.Alias);
        this.setParamSimple(map, prefix + "RckName", this.RckName);
        this.setParamSimple(map, prefix + "PosCode", this.PosCode);
        this.setParamSimple(map, prefix + "SwitchName", this.SwitchName);
        this.setParamSimple(map, prefix + "DeliverTime", this.DeliverTime);
        this.setParamSimple(map, prefix + "Deadline", this.Deadline);

    }
}

