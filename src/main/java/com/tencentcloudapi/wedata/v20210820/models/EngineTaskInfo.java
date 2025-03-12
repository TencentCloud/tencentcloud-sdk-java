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

public class EngineTaskInfo extends AbstractModel {

    /**
    * 1
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EngineSubmitTime")
    @Expose
    private String EngineSubmitTime;

    /**
    * 1
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EngineExeTime")
    @Expose
    private String EngineExeTime;

    /**
    * 1
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EngineExeTimes")
    @Expose
    private Long EngineExeTimes;

    /**
    * 1
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CuConsume")
    @Expose
    private Long CuConsume;

    /**
    * 1
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceUsage")
    @Expose
    private Long ResourceUsage;

    /**
    * 1
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EngineName")
    @Expose
    private String EngineName;

    /**
    * 1
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EngineExeStatus")
    @Expose
    private String EngineExeStatus;

    /**
    * 1
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskKind")
    @Expose
    private String TaskKind;

    /**
    * 1
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
    * 1
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskContent")
    @Expose
    private String TaskContent;

    /**
    * 1
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InputBytesSum")
    @Expose
    private Long InputBytesSum;

    /**
    * 1
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ShuffleReadBytesSum")
    @Expose
    private Long ShuffleReadBytesSum;

    /**
    * 1
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ShuffleReadRecordsSum")
    @Expose
    private Long ShuffleReadRecordsSum;

    /**
    * 1
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OutputRecordsSum")
    @Expose
    private Long OutputRecordsSum;

    /**
    * 1
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OutputBytesSum")
    @Expose
    private Long OutputBytesSum;

    /**
    * 1
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OutputFilesNum")
    @Expose
    private Long OutputFilesNum;

    /**
    * 1
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OutputSmallFilesNum")
    @Expose
    private Long OutputSmallFilesNum;

    /**
    * 1
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WaitTime")
    @Expose
    private Long WaitTime;

    /**
    * 1
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("QueryResultTime")
    @Expose
    private Long QueryResultTime;

    /**
    * 1
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CmdArgs")
    @Expose
    private String CmdArgs;

    /**
     * Get 1
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EngineSubmitTime 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEngineSubmitTime() {
        return this.EngineSubmitTime;
    }

    /**
     * Set 1
注意：此字段可能返回 null，表示取不到有效值。
     * @param EngineSubmitTime 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEngineSubmitTime(String EngineSubmitTime) {
        this.EngineSubmitTime = EngineSubmitTime;
    }

    /**
     * Get 1
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EngineExeTime 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEngineExeTime() {
        return this.EngineExeTime;
    }

    /**
     * Set 1
注意：此字段可能返回 null，表示取不到有效值。
     * @param EngineExeTime 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEngineExeTime(String EngineExeTime) {
        this.EngineExeTime = EngineExeTime;
    }

    /**
     * Get 1
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EngineExeTimes 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getEngineExeTimes() {
        return this.EngineExeTimes;
    }

    /**
     * Set 1
注意：此字段可能返回 null，表示取不到有效值。
     * @param EngineExeTimes 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEngineExeTimes(Long EngineExeTimes) {
        this.EngineExeTimes = EngineExeTimes;
    }

    /**
     * Get 1
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CuConsume 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCuConsume() {
        return this.CuConsume;
    }

    /**
     * Set 1
注意：此字段可能返回 null，表示取不到有效值。
     * @param CuConsume 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCuConsume(Long CuConsume) {
        this.CuConsume = CuConsume;
    }

    /**
     * Get 1
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceUsage 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getResourceUsage() {
        return this.ResourceUsage;
    }

    /**
     * Set 1
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceUsage 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceUsage(Long ResourceUsage) {
        this.ResourceUsage = ResourceUsage;
    }

    /**
     * Get 1
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EngineName 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEngineName() {
        return this.EngineName;
    }

    /**
     * Set 1
注意：此字段可能返回 null，表示取不到有效值。
     * @param EngineName 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEngineName(String EngineName) {
        this.EngineName = EngineName;
    }

    /**
     * Get 1
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EngineExeStatus 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEngineExeStatus() {
        return this.EngineExeStatus;
    }

    /**
     * Set 1
注意：此字段可能返回 null，表示取不到有效值。
     * @param EngineExeStatus 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEngineExeStatus(String EngineExeStatus) {
        this.EngineExeStatus = EngineExeStatus;
    }

    /**
     * Get 1
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskKind 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskKind() {
        return this.TaskKind;
    }

    /**
     * Set 1
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskKind 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskKind(String TaskKind) {
        this.TaskKind = TaskKind;
    }

    /**
     * Get 1
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskType 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskType() {
        return this.TaskType;
    }

    /**
     * Set 1
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskType 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskType(String TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get 1
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskContent 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskContent() {
        return this.TaskContent;
    }

    /**
     * Set 1
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskContent 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskContent(String TaskContent) {
        this.TaskContent = TaskContent;
    }

    /**
     * Get 1
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InputBytesSum 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getInputBytesSum() {
        return this.InputBytesSum;
    }

    /**
     * Set 1
注意：此字段可能返回 null，表示取不到有效值。
     * @param InputBytesSum 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInputBytesSum(Long InputBytesSum) {
        this.InputBytesSum = InputBytesSum;
    }

    /**
     * Get 1
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ShuffleReadBytesSum 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getShuffleReadBytesSum() {
        return this.ShuffleReadBytesSum;
    }

    /**
     * Set 1
注意：此字段可能返回 null，表示取不到有效值。
     * @param ShuffleReadBytesSum 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setShuffleReadBytesSum(Long ShuffleReadBytesSum) {
        this.ShuffleReadBytesSum = ShuffleReadBytesSum;
    }

    /**
     * Get 1
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ShuffleReadRecordsSum 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getShuffleReadRecordsSum() {
        return this.ShuffleReadRecordsSum;
    }

    /**
     * Set 1
注意：此字段可能返回 null，表示取不到有效值。
     * @param ShuffleReadRecordsSum 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setShuffleReadRecordsSum(Long ShuffleReadRecordsSum) {
        this.ShuffleReadRecordsSum = ShuffleReadRecordsSum;
    }

    /**
     * Get 1
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OutputRecordsSum 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getOutputRecordsSum() {
        return this.OutputRecordsSum;
    }

    /**
     * Set 1
注意：此字段可能返回 null，表示取不到有效值。
     * @param OutputRecordsSum 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOutputRecordsSum(Long OutputRecordsSum) {
        this.OutputRecordsSum = OutputRecordsSum;
    }

    /**
     * Get 1
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OutputBytesSum 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getOutputBytesSum() {
        return this.OutputBytesSum;
    }

    /**
     * Set 1
注意：此字段可能返回 null，表示取不到有效值。
     * @param OutputBytesSum 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOutputBytesSum(Long OutputBytesSum) {
        this.OutputBytesSum = OutputBytesSum;
    }

    /**
     * Get 1
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OutputFilesNum 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getOutputFilesNum() {
        return this.OutputFilesNum;
    }

    /**
     * Set 1
注意：此字段可能返回 null，表示取不到有效值。
     * @param OutputFilesNum 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOutputFilesNum(Long OutputFilesNum) {
        this.OutputFilesNum = OutputFilesNum;
    }

    /**
     * Get 1
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OutputSmallFilesNum 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getOutputSmallFilesNum() {
        return this.OutputSmallFilesNum;
    }

    /**
     * Set 1
注意：此字段可能返回 null，表示取不到有效值。
     * @param OutputSmallFilesNum 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOutputSmallFilesNum(Long OutputSmallFilesNum) {
        this.OutputSmallFilesNum = OutputSmallFilesNum;
    }

    /**
     * Get 1
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WaitTime 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getWaitTime() {
        return this.WaitTime;
    }

    /**
     * Set 1
注意：此字段可能返回 null，表示取不到有效值。
     * @param WaitTime 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWaitTime(Long WaitTime) {
        this.WaitTime = WaitTime;
    }

    /**
     * Get 1
注意：此字段可能返回 null，表示取不到有效值。 
     * @return QueryResultTime 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getQueryResultTime() {
        return this.QueryResultTime;
    }

    /**
     * Set 1
注意：此字段可能返回 null，表示取不到有效值。
     * @param QueryResultTime 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQueryResultTime(Long QueryResultTime) {
        this.QueryResultTime = QueryResultTime;
    }

    /**
     * Get 1
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CmdArgs 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCmdArgs() {
        return this.CmdArgs;
    }

    /**
     * Set 1
注意：此字段可能返回 null，表示取不到有效值。
     * @param CmdArgs 1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCmdArgs(String CmdArgs) {
        this.CmdArgs = CmdArgs;
    }

    public EngineTaskInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EngineTaskInfo(EngineTaskInfo source) {
        if (source.EngineSubmitTime != null) {
            this.EngineSubmitTime = new String(source.EngineSubmitTime);
        }
        if (source.EngineExeTime != null) {
            this.EngineExeTime = new String(source.EngineExeTime);
        }
        if (source.EngineExeTimes != null) {
            this.EngineExeTimes = new Long(source.EngineExeTimes);
        }
        if (source.CuConsume != null) {
            this.CuConsume = new Long(source.CuConsume);
        }
        if (source.ResourceUsage != null) {
            this.ResourceUsage = new Long(source.ResourceUsage);
        }
        if (source.EngineName != null) {
            this.EngineName = new String(source.EngineName);
        }
        if (source.EngineExeStatus != null) {
            this.EngineExeStatus = new String(source.EngineExeStatus);
        }
        if (source.TaskKind != null) {
            this.TaskKind = new String(source.TaskKind);
        }
        if (source.TaskType != null) {
            this.TaskType = new String(source.TaskType);
        }
        if (source.TaskContent != null) {
            this.TaskContent = new String(source.TaskContent);
        }
        if (source.InputBytesSum != null) {
            this.InputBytesSum = new Long(source.InputBytesSum);
        }
        if (source.ShuffleReadBytesSum != null) {
            this.ShuffleReadBytesSum = new Long(source.ShuffleReadBytesSum);
        }
        if (source.ShuffleReadRecordsSum != null) {
            this.ShuffleReadRecordsSum = new Long(source.ShuffleReadRecordsSum);
        }
        if (source.OutputRecordsSum != null) {
            this.OutputRecordsSum = new Long(source.OutputRecordsSum);
        }
        if (source.OutputBytesSum != null) {
            this.OutputBytesSum = new Long(source.OutputBytesSum);
        }
        if (source.OutputFilesNum != null) {
            this.OutputFilesNum = new Long(source.OutputFilesNum);
        }
        if (source.OutputSmallFilesNum != null) {
            this.OutputSmallFilesNum = new Long(source.OutputSmallFilesNum);
        }
        if (source.WaitTime != null) {
            this.WaitTime = new Long(source.WaitTime);
        }
        if (source.QueryResultTime != null) {
            this.QueryResultTime = new Long(source.QueryResultTime);
        }
        if (source.CmdArgs != null) {
            this.CmdArgs = new String(source.CmdArgs);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EngineSubmitTime", this.EngineSubmitTime);
        this.setParamSimple(map, prefix + "EngineExeTime", this.EngineExeTime);
        this.setParamSimple(map, prefix + "EngineExeTimes", this.EngineExeTimes);
        this.setParamSimple(map, prefix + "CuConsume", this.CuConsume);
        this.setParamSimple(map, prefix + "ResourceUsage", this.ResourceUsage);
        this.setParamSimple(map, prefix + "EngineName", this.EngineName);
        this.setParamSimple(map, prefix + "EngineExeStatus", this.EngineExeStatus);
        this.setParamSimple(map, prefix + "TaskKind", this.TaskKind);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "TaskContent", this.TaskContent);
        this.setParamSimple(map, prefix + "InputBytesSum", this.InputBytesSum);
        this.setParamSimple(map, prefix + "ShuffleReadBytesSum", this.ShuffleReadBytesSum);
        this.setParamSimple(map, prefix + "ShuffleReadRecordsSum", this.ShuffleReadRecordsSum);
        this.setParamSimple(map, prefix + "OutputRecordsSum", this.OutputRecordsSum);
        this.setParamSimple(map, prefix + "OutputBytesSum", this.OutputBytesSum);
        this.setParamSimple(map, prefix + "OutputFilesNum", this.OutputFilesNum);
        this.setParamSimple(map, prefix + "OutputSmallFilesNum", this.OutputSmallFilesNum);
        this.setParamSimple(map, prefix + "WaitTime", this.WaitTime);
        this.setParamSimple(map, prefix + "QueryResultTime", this.QueryResultTime);
        this.setParamSimple(map, prefix + "CmdArgs", this.CmdArgs);

    }
}

