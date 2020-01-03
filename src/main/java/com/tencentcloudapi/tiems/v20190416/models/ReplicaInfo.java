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
package com.tencentcloudapi.tiems.v20190416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReplicaInfo extends AbstractModel{

    /**
    * 实例名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 弹性网卡模式时，弹性网卡Ip
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EniIp")
    @Expose
    private String EniIp;

    /**
    * Normal: 正常运行中; Abnormal: 异常；Waiting：等待中
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 当 status为 Abnormal 的时候，一些额外的信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * 启动时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 重启次数
    */
    @SerializedName("Restarted")
    @Expose
    private Long Restarted;

    /**
     * Get 实例名称 
     * @return Name 实例名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 实例名称
     * @param Name 实例名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 弹性网卡模式时，弹性网卡Ip
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EniIp 弹性网卡模式时，弹性网卡Ip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEniIp() {
        return this.EniIp;
    }

    /**
     * Set 弹性网卡模式时，弹性网卡Ip
注意：此字段可能返回 null，表示取不到有效值。
     * @param EniIp 弹性网卡模式时，弹性网卡Ip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEniIp(String EniIp) {
        this.EniIp = EniIp;
    }

    /**
     * Get Normal: 正常运行中; Abnormal: 异常；Waiting：等待中 
     * @return Status Normal: 正常运行中; Abnormal: 异常；Waiting：等待中
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Normal: 正常运行中; Abnormal: 异常；Waiting：等待中
     * @param Status Normal: 正常运行中; Abnormal: 异常；Waiting：等待中
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 当 status为 Abnormal 的时候，一些额外的信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Message 当 status为 Abnormal 的时候，一些额外的信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set 当 status为 Abnormal 的时候，一些额外的信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Message 当 status为 Abnormal 的时候，一些额外的信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get 启动时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StartTime 启动时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 启动时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param StartTime 启动时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
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
     * Get 重启次数 
     * @return Restarted 重启次数
     */
    public Long getRestarted() {
        return this.Restarted;
    }

    /**
     * Set 重启次数
     * @param Restarted 重启次数
     */
    public void setRestarted(Long Restarted) {
        this.Restarted = Restarted;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "EniIp", this.EniIp);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Restarted", this.Restarted);

    }
}

