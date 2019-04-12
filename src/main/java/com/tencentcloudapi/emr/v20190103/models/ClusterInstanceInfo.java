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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClusterInstanceInfo  extends AbstractModel{

    /**
    * clusterId
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 状态描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StatusDesc")
    @Expose
    private String StatusDesc;

    /**
    * 集群名字
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * 集群地域
    */
    @SerializedName("ZoneId")
    @Expose
    private Integer ZoneId;

    /**
    * 用户APPID
    */
    @SerializedName("AppId")
    @Expose
    private Integer AppId;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Addtime")
    @Expose
    private String Addtime;

    /**
    * 运行时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Runtime")
    @Expose
    private String Runtime;

    /**
    * 集群配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Config")
    @Expose
    private EMRProductConfigSettings Config;

    /**
    * 集群IP
    */
    @SerializedName("MasterIp")
    @Expose
    private String MasterIp;

    /**
    * 集群版本
    */
    @SerializedName("EmrVersion")
    @Expose
    private String EmrVersion;

    /**
    * 集群计费类型
    */
    @SerializedName("ChargeType")
    @Expose
    private Integer ChargeType;

    /**
     * 获取clusterId
     * @return ClusterId clusterId
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * 设置clusterId
     * @param ClusterId clusterId
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * 获取状态描述
注意：此字段可能返回 null，表示取不到有效值。
     * @return StatusDesc 状态描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatusDesc() {
        return this.StatusDesc;
    }

    /**
     * 设置状态描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param StatusDesc 状态描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatusDesc(String StatusDesc) {
        this.StatusDesc = StatusDesc;
    }

    /**
     * 获取集群名字
注意：此字段可能返回 null，表示取不到有效值。
     * @return ClusterName 集群名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * 设置集群名字
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterName 集群名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * 获取集群地域
     * @return ZoneId 集群地域
     */
    public Integer getZoneId() {
        return this.ZoneId;
    }

    /**
     * 设置集群地域
     * @param ZoneId 集群地域
     */
    public void setZoneId(Integer ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * 获取用户APPID
     * @return AppId 用户APPID
     */
    public Integer getAppId() {
        return this.AppId;
    }

    /**
     * 设置用户APPID
     * @param AppId 用户APPID
     */
    public void setAppId(Integer AppId) {
        this.AppId = AppId;
    }

    /**
     * 获取创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @return Addtime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAddtime() {
        return this.Addtime;
    }

    /**
     * 设置创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param Addtime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAddtime(String Addtime) {
        this.Addtime = Addtime;
    }

    /**
     * 获取运行时间
注意：此字段可能返回 null，表示取不到有效值。
     * @return Runtime 运行时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRuntime() {
        return this.Runtime;
    }

    /**
     * 设置运行时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param Runtime 运行时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuntime(String Runtime) {
        this.Runtime = Runtime;
    }

    /**
     * 获取集群配置
注意：此字段可能返回 null，表示取不到有效值。
     * @return Config 集群配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public EMRProductConfigSettings getConfig() {
        return this.Config;
    }

    /**
     * 设置集群配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param Config 集群配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConfig(EMRProductConfigSettings Config) {
        this.Config = Config;
    }

    /**
     * 获取集群IP
     * @return MasterIp 集群IP
     */
    public String getMasterIp() {
        return this.MasterIp;
    }

    /**
     * 设置集群IP
     * @param MasterIp 集群IP
     */
    public void setMasterIp(String MasterIp) {
        this.MasterIp = MasterIp;
    }

    /**
     * 获取集群版本
     * @return EmrVersion 集群版本
     */
    public String getEmrVersion() {
        return this.EmrVersion;
    }

    /**
     * 设置集群版本
     * @param EmrVersion 集群版本
     */
    public void setEmrVersion(String EmrVersion) {
        this.EmrVersion = EmrVersion;
    }

    /**
     * 获取集群计费类型
     * @return ChargeType 集群计费类型
     */
    public Integer getChargeType() {
        return this.ChargeType;
    }

    /**
     * 设置集群计费类型
     * @param ChargeType 集群计费类型
     */
    public void setChargeType(Integer ChargeType) {
        this.ChargeType = ChargeType;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "StatusDesc", this.StatusDesc);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Addtime", this.Addtime);
        this.setParamSimple(map, prefix + "Runtime", this.Runtime);
        this.setParamObj(map, prefix + "Config.", this.Config);
        this.setParamSimple(map, prefix + "MasterIp", this.MasterIp);
        this.setParamSimple(map, prefix + "EmrVersion", this.EmrVersion);
        this.setParamSimple(map, prefix + "ChargeType", this.ChargeType);

    }
}

