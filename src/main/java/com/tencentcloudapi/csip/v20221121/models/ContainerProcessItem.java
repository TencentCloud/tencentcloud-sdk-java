/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ContainerProcessItem extends AbstractModel {

    /**
    * 进程名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProcessName")
    @Expose
    private String ProcessName;

    /**
    * 宿主机进程ID
    */
    @SerializedName("PID")
    @Expose
    private Long PID;

    /**
    * 容器内进程ID
    */
    @SerializedName("ContainerPID")
    @Expose
    private Long ContainerPID;

    /**
    * 进程可执行文件路径
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProcessPath")
    @Expose
    private String ProcessPath;

    /**
    * 进程运行用户
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RunAs")
    @Expose
    private String RunAs;

    /**
    * 进程启动时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
     * Get 进程名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProcessName 进程名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProcessName() {
        return this.ProcessName;
    }

    /**
     * Set 进程名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProcessName 进程名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProcessName(String ProcessName) {
        this.ProcessName = ProcessName;
    }

    /**
     * Get 宿主机进程ID 
     * @return PID 宿主机进程ID
     */
    public Long getPID() {
        return this.PID;
    }

    /**
     * Set 宿主机进程ID
     * @param PID 宿主机进程ID
     */
    public void setPID(Long PID) {
        this.PID = PID;
    }

    /**
     * Get 容器内进程ID 
     * @return ContainerPID 容器内进程ID
     */
    public Long getContainerPID() {
        return this.ContainerPID;
    }

    /**
     * Set 容器内进程ID
     * @param ContainerPID 容器内进程ID
     */
    public void setContainerPID(Long ContainerPID) {
        this.ContainerPID = ContainerPID;
    }

    /**
     * Get 进程可执行文件路径
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProcessPath 进程可执行文件路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProcessPath() {
        return this.ProcessPath;
    }

    /**
     * Set 进程可执行文件路径
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProcessPath 进程可执行文件路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProcessPath(String ProcessPath) {
        this.ProcessPath = ProcessPath;
    }

    /**
     * Get 进程运行用户
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RunAs 进程运行用户
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRunAs() {
        return this.RunAs;
    }

    /**
     * Set 进程运行用户
注意：此字段可能返回 null，表示取不到有效值。
     * @param RunAs 进程运行用户
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRunAs(String RunAs) {
        this.RunAs = RunAs;
    }

    /**
     * Get 进程启动时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StartTime 进程启动时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 进程启动时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param StartTime 进程启动时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    public ContainerProcessItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ContainerProcessItem(ContainerProcessItem source) {
        if (source.ProcessName != null) {
            this.ProcessName = new String(source.ProcessName);
        }
        if (source.PID != null) {
            this.PID = new Long(source.PID);
        }
        if (source.ContainerPID != null) {
            this.ContainerPID = new Long(source.ContainerPID);
        }
        if (source.ProcessPath != null) {
            this.ProcessPath = new String(source.ProcessPath);
        }
        if (source.RunAs != null) {
            this.RunAs = new String(source.RunAs);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProcessName", this.ProcessName);
        this.setParamSimple(map, prefix + "PID", this.PID);
        this.setParamSimple(map, prefix + "ContainerPID", this.ContainerPID);
        this.setParamSimple(map, prefix + "ProcessPath", this.ProcessPath);
        this.setParamSimple(map, prefix + "RunAs", this.RunAs);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);

    }
}

