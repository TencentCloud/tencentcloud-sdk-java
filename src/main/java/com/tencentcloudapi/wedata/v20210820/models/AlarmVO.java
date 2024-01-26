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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AlarmVO extends AbstractModel {

    /**
    * 告警策略id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AlarmId")
    @Expose
    private String AlarmId;

    /**
    * 任务id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 告警是否生效
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 告警类别，目前支持失败告警，超时告警
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AlarmType")
    @Expose
    private String AlarmType;

    /**
    * 告警方式 ，目前支持email提醒，短信提醒
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AlarmWay")
    @Expose
    private String AlarmWay;

    /**
    * 告警创建人
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Creator")
    @Expose
    private String Creator;

    /**
    * 告警接收人
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AlarmRecipient")
    @Expose
    private String AlarmRecipient;

    /**
    * 告警接收人ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AlarmRecipientId")
    @Expose
    private String AlarmRecipientId;

    /**
    * 告警修改时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * 最近失败告警实例数据时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastFailTime")
    @Expose
    private String LastFailTime;

    /**
    * 最近超时告警实例数据时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastOverTime")
    @Expose
    private String LastOverTime;

    /**
    * 最新告警时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastAlarmTime")
    @Expose
    private String LastAlarmTime;

    /**
    * AlarmExt信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AlarmExt")
    @Expose
    private AlarmExtVO [] AlarmExt;

    /**
    * 告警创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
     * Get 告警策略id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AlarmId 告警策略id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAlarmId() {
        return this.AlarmId;
    }

    /**
     * Set 告警策略id
注意：此字段可能返回 null，表示取不到有效值。
     * @param AlarmId 告警策略id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAlarmId(String AlarmId) {
        this.AlarmId = AlarmId;
    }

    /**
     * Get 任务id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskId 任务id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务id
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskId 任务id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 告警是否生效
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 告警是否生效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 告警是否生效
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 告警是否生效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 告警类别，目前支持失败告警，超时告警
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AlarmType 告警类别，目前支持失败告警，超时告警
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAlarmType() {
        return this.AlarmType;
    }

    /**
     * Set 告警类别，目前支持失败告警，超时告警
注意：此字段可能返回 null，表示取不到有效值。
     * @param AlarmType 告警类别，目前支持失败告警，超时告警
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAlarmType(String AlarmType) {
        this.AlarmType = AlarmType;
    }

    /**
     * Get 告警方式 ，目前支持email提醒，短信提醒
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AlarmWay 告警方式 ，目前支持email提醒，短信提醒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAlarmWay() {
        return this.AlarmWay;
    }

    /**
     * Set 告警方式 ，目前支持email提醒，短信提醒
注意：此字段可能返回 null，表示取不到有效值。
     * @param AlarmWay 告警方式 ，目前支持email提醒，短信提醒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAlarmWay(String AlarmWay) {
        this.AlarmWay = AlarmWay;
    }

    /**
     * Get 告警创建人
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Creator 告警创建人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreator() {
        return this.Creator;
    }

    /**
     * Set 告警创建人
注意：此字段可能返回 null，表示取不到有效值。
     * @param Creator 告警创建人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreator(String Creator) {
        this.Creator = Creator;
    }

    /**
     * Get 告警接收人
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AlarmRecipient 告警接收人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAlarmRecipient() {
        return this.AlarmRecipient;
    }

    /**
     * Set 告警接收人
注意：此字段可能返回 null，表示取不到有效值。
     * @param AlarmRecipient 告警接收人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAlarmRecipient(String AlarmRecipient) {
        this.AlarmRecipient = AlarmRecipient;
    }

    /**
     * Get 告警接收人ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AlarmRecipientId 告警接收人ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAlarmRecipientId() {
        return this.AlarmRecipientId;
    }

    /**
     * Set 告警接收人ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param AlarmRecipientId 告警接收人ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAlarmRecipientId(String AlarmRecipientId) {
        this.AlarmRecipientId = AlarmRecipientId;
    }

    /**
     * Get 告警修改时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModifyTime 告警修改时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set 告警修改时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModifyTime 告警修改时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get 最近失败告警实例数据时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastFailTime 最近失败告警实例数据时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLastFailTime() {
        return this.LastFailTime;
    }

    /**
     * Set 最近失败告警实例数据时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastFailTime 最近失败告警实例数据时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastFailTime(String LastFailTime) {
        this.LastFailTime = LastFailTime;
    }

    /**
     * Get 最近超时告警实例数据时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastOverTime 最近超时告警实例数据时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLastOverTime() {
        return this.LastOverTime;
    }

    /**
     * Set 最近超时告警实例数据时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastOverTime 最近超时告警实例数据时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastOverTime(String LastOverTime) {
        this.LastOverTime = LastOverTime;
    }

    /**
     * Get 最新告警时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastAlarmTime 最新告警时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLastAlarmTime() {
        return this.LastAlarmTime;
    }

    /**
     * Set 最新告警时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastAlarmTime 最新告警时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastAlarmTime(String LastAlarmTime) {
        this.LastAlarmTime = LastAlarmTime;
    }

    /**
     * Get AlarmExt信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AlarmExt AlarmExt信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AlarmExtVO [] getAlarmExt() {
        return this.AlarmExt;
    }

    /**
     * Set AlarmExt信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param AlarmExt AlarmExt信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAlarmExt(AlarmExtVO [] AlarmExt) {
        this.AlarmExt = AlarmExt;
    }

    /**
     * Get 告警创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 告警创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 告警创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 告警创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    public AlarmVO() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AlarmVO(AlarmVO source) {
        if (source.AlarmId != null) {
            this.AlarmId = new String(source.AlarmId);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.AlarmType != null) {
            this.AlarmType = new String(source.AlarmType);
        }
        if (source.AlarmWay != null) {
            this.AlarmWay = new String(source.AlarmWay);
        }
        if (source.Creator != null) {
            this.Creator = new String(source.Creator);
        }
        if (source.AlarmRecipient != null) {
            this.AlarmRecipient = new String(source.AlarmRecipient);
        }
        if (source.AlarmRecipientId != null) {
            this.AlarmRecipientId = new String(source.AlarmRecipientId);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
        if (source.LastFailTime != null) {
            this.LastFailTime = new String(source.LastFailTime);
        }
        if (source.LastOverTime != null) {
            this.LastOverTime = new String(source.LastOverTime);
        }
        if (source.LastAlarmTime != null) {
            this.LastAlarmTime = new String(source.LastAlarmTime);
        }
        if (source.AlarmExt != null) {
            this.AlarmExt = new AlarmExtVO[source.AlarmExt.length];
            for (int i = 0; i < source.AlarmExt.length; i++) {
                this.AlarmExt[i] = new AlarmExtVO(source.AlarmExt[i]);
            }
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AlarmId", this.AlarmId);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "AlarmType", this.AlarmType);
        this.setParamSimple(map, prefix + "AlarmWay", this.AlarmWay);
        this.setParamSimple(map, prefix + "Creator", this.Creator);
        this.setParamSimple(map, prefix + "AlarmRecipient", this.AlarmRecipient);
        this.setParamSimple(map, prefix + "AlarmRecipientId", this.AlarmRecipientId);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "LastFailTime", this.LastFailTime);
        this.setParamSimple(map, prefix + "LastOverTime", this.LastOverTime);
        this.setParamSimple(map, prefix + "LastAlarmTime", this.LastAlarmTime);
        this.setParamArrayObj(map, prefix + "AlarmExt.", this.AlarmExt);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);

    }
}

