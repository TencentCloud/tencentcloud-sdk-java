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

public class InstanceLogList extends AbstractModel{

    /**
    * 任务ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 数据时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CurRunDate")
    @Expose
    private String CurRunDate;

    /**
    * 重试次数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tries")
    @Expose
    private String Tries;

    /**
    * 最后更新事件
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastUpdate")
    @Expose
    private String LastUpdate;

    /**
    * 节点ip
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BrokerIp")
    @Expose
    private String BrokerIp;

    /**
    * 文件大小
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileSize")
    @Expose
    private String FileSize;

    /**
    * 原始文件名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OriginFileName")
    @Expose
    private String OriginFileName;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 实例日志类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceLogType")
    @Expose
    private String InstanceLogType;

    /**
    * 任务名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * 耗费时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CostTime")
    @Expose
    private String CostTime;

    /**
     * Get 任务ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskId 任务ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskId 任务ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 数据时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CurRunDate 数据时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCurRunDate() {
        return this.CurRunDate;
    }

    /**
     * Set 数据时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CurRunDate 数据时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCurRunDate(String CurRunDate) {
        this.CurRunDate = CurRunDate;
    }

    /**
     * Get 重试次数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tries 重试次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTries() {
        return this.Tries;
    }

    /**
     * Set 重试次数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tries 重试次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTries(String Tries) {
        this.Tries = Tries;
    }

    /**
     * Get 最后更新事件
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastUpdate 最后更新事件
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLastUpdate() {
        return this.LastUpdate;
    }

    /**
     * Set 最后更新事件
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastUpdate 最后更新事件
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastUpdate(String LastUpdate) {
        this.LastUpdate = LastUpdate;
    }

    /**
     * Get 节点ip
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BrokerIp 节点ip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBrokerIp() {
        return this.BrokerIp;
    }

    /**
     * Set 节点ip
注意：此字段可能返回 null，表示取不到有效值。
     * @param BrokerIp 节点ip
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBrokerIp(String BrokerIp) {
        this.BrokerIp = BrokerIp;
    }

    /**
     * Get 文件大小
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FileSize 文件大小
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFileSize() {
        return this.FileSize;
    }

    /**
     * Set 文件大小
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileSize 文件大小
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileSize(String FileSize) {
        this.FileSize = FileSize;
    }

    /**
     * Get 原始文件名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OriginFileName 原始文件名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOriginFileName() {
        return this.OriginFileName;
    }

    /**
     * Set 原始文件名
注意：此字段可能返回 null，表示取不到有效值。
     * @param OriginFileName 原始文件名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOriginFileName(String OriginFileName) {
        this.OriginFileName = OriginFileName;
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
     * Get 实例日志类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceLogType 实例日志类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceLogType() {
        return this.InstanceLogType;
    }

    /**
     * Set 实例日志类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceLogType 实例日志类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceLogType(String InstanceLogType) {
        this.InstanceLogType = InstanceLogType;
    }

    /**
     * Get 任务名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskName 任务名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set 任务名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskName 任务名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get 耗费时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CostTime 耗费时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCostTime() {
        return this.CostTime;
    }

    /**
     * Set 耗费时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CostTime 耗费时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCostTime(String CostTime) {
        this.CostTime = CostTime;
    }

    public InstanceLogList() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceLogList(InstanceLogList source) {
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
        if (source.FileSize != null) {
            this.FileSize = new String(source.FileSize);
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
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.CostTime != null) {
            this.CostTime = new String(source.CostTime);
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
        this.setParamSimple(map, prefix + "FileSize", this.FileSize);
        this.setParamSimple(map, prefix + "OriginFileName", this.OriginFileName);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "InstanceLogType", this.InstanceLogType);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "CostTime", this.CostTime);

    }
}

