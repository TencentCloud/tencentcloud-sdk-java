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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ManagementCommand extends AbstractModel{

    /**
    * Agent 安装命令
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Install")
    @Expose
    private String Install;

    /**
    * Agent 重启命令
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Restart")
    @Expose
    private String Restart;

    /**
    * Agent 停止命令
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Stop")
    @Expose
    private String Stop;

    /**
    * Agent 状态检测命令
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StatusCheck")
    @Expose
    private String StatusCheck;

    /**
    * Agent 日志检测命令
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LogCheck")
    @Expose
    private String LogCheck;

    /**
     * Get Agent 安装命令
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Install Agent 安装命令
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstall() {
        return this.Install;
    }

    /**
     * Set Agent 安装命令
注意：此字段可能返回 null，表示取不到有效值。
     * @param Install Agent 安装命令
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstall(String Install) {
        this.Install = Install;
    }

    /**
     * Get Agent 重启命令
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Restart Agent 重启命令
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRestart() {
        return this.Restart;
    }

    /**
     * Set Agent 重启命令
注意：此字段可能返回 null，表示取不到有效值。
     * @param Restart Agent 重启命令
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRestart(String Restart) {
        this.Restart = Restart;
    }

    /**
     * Get Agent 停止命令
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Stop Agent 停止命令
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStop() {
        return this.Stop;
    }

    /**
     * Set Agent 停止命令
注意：此字段可能返回 null，表示取不到有效值。
     * @param Stop Agent 停止命令
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStop(String Stop) {
        this.Stop = Stop;
    }

    /**
     * Get Agent 状态检测命令
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StatusCheck Agent 状态检测命令
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatusCheck() {
        return this.StatusCheck;
    }

    /**
     * Set Agent 状态检测命令
注意：此字段可能返回 null，表示取不到有效值。
     * @param StatusCheck Agent 状态检测命令
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatusCheck(String StatusCheck) {
        this.StatusCheck = StatusCheck;
    }

    /**
     * Get Agent 日志检测命令
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LogCheck Agent 日志检测命令
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLogCheck() {
        return this.LogCheck;
    }

    /**
     * Set Agent 日志检测命令
注意：此字段可能返回 null，表示取不到有效值。
     * @param LogCheck Agent 日志检测命令
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLogCheck(String LogCheck) {
        this.LogCheck = LogCheck;
    }

    public ManagementCommand() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ManagementCommand(ManagementCommand source) {
        if (source.Install != null) {
            this.Install = new String(source.Install);
        }
        if (source.Restart != null) {
            this.Restart = new String(source.Restart);
        }
        if (source.Stop != null) {
            this.Stop = new String(source.Stop);
        }
        if (source.StatusCheck != null) {
            this.StatusCheck = new String(source.StatusCheck);
        }
        if (source.LogCheck != null) {
            this.LogCheck = new String(source.LogCheck);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Install", this.Install);
        this.setParamSimple(map, prefix + "Restart", this.Restart);
        this.setParamSimple(map, prefix + "Stop", this.Stop);
        this.setParamSimple(map, prefix + "StatusCheck", this.StatusCheck);
        this.setParamSimple(map, prefix + "LogCheck", this.LogCheck);

    }
}

