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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceLog extends AbstractModel{

    /**
    * 任务ID
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 数据时间
    */
    @SerializedName("CurRunDate")
    @Expose
    private String CurRunDate;

    /**
    * 尝试运行次数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tries")
    @Expose
    private String Tries;

    /**
    * 日志更新时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastUpdate")
    @Expose
    private String LastUpdate;

    /**
    * 日志所在节点
    */
    @SerializedName("BrokerIp")
    @Expose
    private String BrokerIp;

    /**
    * 文件名  含全路径
    */
    @SerializedName("OriginFileName")
    @Expose
    private String OriginFileName;

    /**
    * 日志创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 实例日志类型, run: 运行; kill: 终止
    */
    @SerializedName("InstanceLogType")
    @Expose
    private String InstanceLogType;

    /**
    * 运行耗时
    */
    @SerializedName("CostTime")
    @Expose
    private Float CostTime;

    /**
     * Get 任务ID 
     * @return TaskId 任务ID
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务ID
     * @param TaskId 任务ID
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 数据时间 
     * @return CurRunDate 数据时间
     */
    public String getCurRunDate() {
        return this.CurRunDate;
    }

    /**
     * Set 数据时间
     * @param CurRunDate 数据时间
     */
    public void setCurRunDate(String CurRunDate) {
        this.CurRunDate = CurRunDate;
    }

    /**
     * Get 尝试运行次数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tries 尝试运行次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTries() {
        return this.Tries;
    }

    /**
     * Set 尝试运行次数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tries 尝试运行次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTries(String Tries) {
        this.Tries = Tries;
    }

    /**
     * Get 日志更新时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastUpdate 日志更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLastUpdate() {
        return this.LastUpdate;
    }

    /**
     * Set 日志更新时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastUpdate 日志更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastUpdate(String LastUpdate) {
        this.LastUpdate = LastUpdate;
    }

    /**
     * Get 日志所在节点 
     * @return BrokerIp 日志所在节点
     */
    public String getBrokerIp() {
        return this.BrokerIp;
    }

    /**
     * Set 日志所在节点
     * @param BrokerIp 日志所在节点
     */
    public void setBrokerIp(String BrokerIp) {
        this.BrokerIp = BrokerIp;
    }

    /**
     * Get 文件名  含全路径 
     * @return OriginFileName 文件名  含全路径
     */
    public String getOriginFileName() {
        return this.OriginFileName;
    }

    /**
     * Set 文件名  含全路径
     * @param OriginFileName 文件名  含全路径
     */
    public void setOriginFileName(String OriginFileName) {
        this.OriginFileName = OriginFileName;
    }

    /**
     * Get 日志创建时间 
     * @return CreateTime 日志创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 日志创建时间
     * @param CreateTime 日志创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 实例日志类型, run: 运行; kill: 终止 
     * @return InstanceLogType 实例日志类型, run: 运行; kill: 终止
     */
    public String getInstanceLogType() {
        return this.InstanceLogType;
    }

    /**
     * Set 实例日志类型, run: 运行; kill: 终止
     * @param InstanceLogType 实例日志类型, run: 运行; kill: 终止
     */
    public void setInstanceLogType(String InstanceLogType) {
        this.InstanceLogType = InstanceLogType;
    }

    /**
     * Get 运行耗时 
     * @return CostTime 运行耗时
     */
    public Float getCostTime() {
        return this.CostTime;
    }

    /**
     * Set 运行耗时
     * @param CostTime 运行耗时
     */
    public void setCostTime(Float CostTime) {
        this.CostTime = CostTime;
    }

    public InstanceLog() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceLog(InstanceLog source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.CurRunDate != null) {
            this.CurRunDate = new String(source.CurRunDate);
        }
        if (source.Tries != null) {
            this.Tries = new String(source.Tries);
        }
        if (source.LastUpdate != null) {
            this.LastUpdate = new String(source.LastUpdate);
        }
        if (source.BrokerIp != null) {
            this.BrokerIp = new String(source.BrokerIp);
        }
        if (source.OriginFileName != null) {
            this.OriginFileName = new String(source.OriginFileName);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.InstanceLogType != null) {
            this.InstanceLogType = new String(source.InstanceLogType);
        }
        if (source.CostTime != null) {
            this.CostTime = new Float(source.CostTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "CurRunDate", this.CurRunDate);
        this.setParamSimple(map, prefix + "Tries", this.Tries);
        this.setParamSimple(map, prefix + "LastUpdate", this.LastUpdate);
        this.setParamSimple(map, prefix + "BrokerIp", this.BrokerIp);
        this.setParamSimple(map, prefix + "OriginFileName", this.OriginFileName);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "InstanceLogType", this.InstanceLogType);
        this.setParamSimple(map, prefix + "CostTime", this.CostTime);

    }
}

