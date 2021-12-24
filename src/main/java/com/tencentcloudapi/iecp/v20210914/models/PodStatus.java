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
package com.tencentcloudapi.iecp.v20210914.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PodStatus extends AbstractModel{

    /**
    * 名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 命名空间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NameSpace")
    @Expose
    private String NameSpace;

    /**
    * 状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * IP地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IP")
    @Expose
    private String IP;

    /**
    * 启动时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 运行时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RunSec")
    @Expose
    private Long RunSec;

    /**
    * 重启次数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RestartCount")
    @Expose
    private Long RestartCount;

    /**
     * Get 名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 命名空间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NameSpace 命名空间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNameSpace() {
        return this.NameSpace;
    }

    /**
     * Set 命名空间
注意：此字段可能返回 null，表示取不到有效值。
     * @param NameSpace 命名空间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNameSpace(String NameSpace) {
        this.NameSpace = NameSpace;
    }

    /**
     * Get 状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get IP地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IP IP地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIP() {
        return this.IP;
    }

    /**
     * Set IP地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param IP IP地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIP(String IP) {
        this.IP = IP;
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
     * Get 运行时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RunSec 运行时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRunSec() {
        return this.RunSec;
    }

    /**
     * Set 运行时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param RunSec 运行时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRunSec(Long RunSec) {
        this.RunSec = RunSec;
    }

    /**
     * Get 重启次数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RestartCount 重启次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRestartCount() {
        return this.RestartCount;
    }

    /**
     * Set 重启次数
注意：此字段可能返回 null，表示取不到有效值。
     * @param RestartCount 重启次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRestartCount(Long RestartCount) {
        this.RestartCount = RestartCount;
    }

    public PodStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PodStatus(PodStatus source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.NameSpace != null) {
            this.NameSpace = new String(source.NameSpace);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.IP != null) {
            this.IP = new String(source.IP);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.RunSec != null) {
            this.RunSec = new Long(source.RunSec);
        }
        if (source.RestartCount != null) {
            this.RestartCount = new Long(source.RestartCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "NameSpace", this.NameSpace);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "IP", this.IP);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "RunSec", this.RunSec);
        this.setParamSimple(map, prefix + "RestartCount", this.RestartCount);

    }
}

