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
package com.tencentcloudapi.gs.v20191118.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WorkerDetail extends AbstractModel{

    /**
    * 客户appid
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * 资源池编号
    */
    @SerializedName("SetNo")
    @Expose
    private Long SetNo;

    /**
    * 机器所属区域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 机器ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 机器类型：
LARGE-大型
MEDIUM-中型
SMALL-小型
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * 机器IP
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * 服务状态：
IDLE-空闲
LOCK-锁定
ESTABLISHED-游戏中
RECONNECT-等待重连
RECOVERY-清理恢复
FORBID-禁用
UNAVAILABLE-不可用
    */
    @SerializedName("ServiceState")
    @Expose
    private String ServiceState;

    /**
    * 用户ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 游戏ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GameId")
    @Expose
    private String GameId;

    /**
     * Get 客户appid 
     * @return AppId 客户appid
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set 客户appid
     * @param AppId 客户appid
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 资源池编号 
     * @return SetNo 资源池编号
     */
    public Long getSetNo() {
        return this.SetNo;
    }

    /**
     * Set 资源池编号
     * @param SetNo 资源池编号
     */
    public void setSetNo(Long SetNo) {
        this.SetNo = SetNo;
    }

    /**
     * Get 机器所属区域 
     * @return Region 机器所属区域
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 机器所属区域
     * @param Region 机器所属区域
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 机器ID 
     * @return InstanceId 机器ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 机器ID
     * @param InstanceId 机器ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 机器类型：
LARGE-大型
MEDIUM-中型
SMALL-小型 
     * @return InstanceType 机器类型：
LARGE-大型
MEDIUM-中型
SMALL-小型
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 机器类型：
LARGE-大型
MEDIUM-中型
SMALL-小型
     * @param InstanceType 机器类型：
LARGE-大型
MEDIUM-中型
SMALL-小型
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get 机器IP 
     * @return Ip 机器IP
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set 机器IP
     * @param Ip 机器IP
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get 服务状态：
IDLE-空闲
LOCK-锁定
ESTABLISHED-游戏中
RECONNECT-等待重连
RECOVERY-清理恢复
FORBID-禁用
UNAVAILABLE-不可用 
     * @return ServiceState 服务状态：
IDLE-空闲
LOCK-锁定
ESTABLISHED-游戏中
RECONNECT-等待重连
RECOVERY-清理恢复
FORBID-禁用
UNAVAILABLE-不可用
     */
    public String getServiceState() {
        return this.ServiceState;
    }

    /**
     * Set 服务状态：
IDLE-空闲
LOCK-锁定
ESTABLISHED-游戏中
RECONNECT-等待重连
RECOVERY-清理恢复
FORBID-禁用
UNAVAILABLE-不可用
     * @param ServiceState 服务状态：
IDLE-空闲
LOCK-锁定
ESTABLISHED-游戏中
RECONNECT-等待重连
RECOVERY-清理恢复
FORBID-禁用
UNAVAILABLE-不可用
     */
    public void setServiceState(String ServiceState) {
        this.ServiceState = ServiceState;
    }

    /**
     * Get 用户ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserId 用户ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 用户ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserId 用户ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 游戏ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GameId 游戏ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGameId() {
        return this.GameId;
    }

    /**
     * Set 游戏ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param GameId 游戏ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGameId(String GameId) {
        this.GameId = GameId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "SetNo", this.SetNo);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "ServiceState", this.ServiceState);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "GameId", this.GameId);

    }
}

