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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PodInfo extends AbstractModel {

    /**
    * <p>pod名</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>pod的IP</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IP")
    @Expose
    private String IP;

    /**
    * <p>pod状态</p><p>枚举值：</p><ul><li>PENDING： 排队中</li><li>RUNNING： 运行中</li><li>SUCCEEDED： 已完成</li><li>FAILED： 异常</li><li>TERMINATING： 停止中</li><li>TERMINATED： 已停止</li><li>UNKNOWN： 未知</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>pod启动时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>pod结束时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>pod资源配置</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceConfigInfo")
    @Expose
    private ResourceConfigInfo ResourceConfigInfo;

    /**
    * <p>Pod所属任务的SubUin信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubUin")
    @Expose
    private String SubUin;

    /**
     * Get <p>pod名</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name <p>pod名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>pod名</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name <p>pod名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>pod的IP</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IP <p>pod的IP</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIP() {
        return this.IP;
    }

    /**
     * Set <p>pod的IP</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IP <p>pod的IP</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIP(String IP) {
        this.IP = IP;
    }

    /**
     * Get <p>pod状态</p><p>枚举值：</p><ul><li>PENDING： 排队中</li><li>RUNNING： 运行中</li><li>SUCCEEDED： 已完成</li><li>FAILED： 异常</li><li>TERMINATING： 停止中</li><li>TERMINATED： 已停止</li><li>UNKNOWN： 未知</li></ul>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status <p>pod状态</p><p>枚举值：</p><ul><li>PENDING： 排队中</li><li>RUNNING： 运行中</li><li>SUCCEEDED： 已完成</li><li>FAILED： 异常</li><li>TERMINATING： 停止中</li><li>TERMINATED： 已停止</li><li>UNKNOWN： 未知</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>pod状态</p><p>枚举值：</p><ul><li>PENDING： 排队中</li><li>RUNNING： 运行中</li><li>SUCCEEDED： 已完成</li><li>FAILED： 异常</li><li>TERMINATING： 停止中</li><li>TERMINATED： 已停止</li><li>UNKNOWN： 未知</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status <p>pod状态</p><p>枚举值：</p><ul><li>PENDING： 排队中</li><li>RUNNING： 运行中</li><li>SUCCEEDED： 已完成</li><li>FAILED： 异常</li><li>TERMINATING： 停止中</li><li>TERMINATED： 已停止</li><li>UNKNOWN： 未知</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>pod启动时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StartTime <p>pod启动时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>pod启动时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param StartTime <p>pod启动时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>pod结束时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndTime <p>pod结束时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>pod结束时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndTime <p>pod结束时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>pod资源配置</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceConfigInfo <p>pod资源配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ResourceConfigInfo getResourceConfigInfo() {
        return this.ResourceConfigInfo;
    }

    /**
     * Set <p>pod资源配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceConfigInfo <p>pod资源配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceConfigInfo(ResourceConfigInfo ResourceConfigInfo) {
        this.ResourceConfigInfo = ResourceConfigInfo;
    }

    /**
     * Get <p>Pod所属任务的SubUin信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubUin <p>Pod所属任务的SubUin信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubUin() {
        return this.SubUin;
    }

    /**
     * Set <p>Pod所属任务的SubUin信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubUin <p>Pod所属任务的SubUin信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubUin(String SubUin) {
        this.SubUin = SubUin;
    }

    public PodInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PodInfo(PodInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.IP != null) {
            this.IP = new String(source.IP);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.ResourceConfigInfo != null) {
            this.ResourceConfigInfo = new ResourceConfigInfo(source.ResourceConfigInfo);
        }
        if (source.SubUin != null) {
            this.SubUin = new String(source.SubUin);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "IP", this.IP);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamObj(map, prefix + "ResourceConfigInfo.", this.ResourceConfigInfo);
        this.setParamSimple(map, prefix + "SubUin", this.SubUin);

    }
}

