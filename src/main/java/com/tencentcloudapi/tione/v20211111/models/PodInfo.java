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
    * pod名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * pod的IP
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IP")
    @Expose
    private String IP;

    /**
    * pod状态。eg：SUBMITTING提交中、PENDING排队中、RUNNING运行中、SUCCEEDED已完成、FAILED异常、TERMINATING停止中、TERMINATED已停止
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * pod启动时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * pod结束时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * pod资源配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceConfigInfo")
    @Expose
    private ResourceConfigInfo ResourceConfigInfo;

    /**
    * Pod所属任务的SubUin信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubUin")
    @Expose
    private String SubUin;

    /**
     * Get pod名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name pod名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set pod名
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name pod名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get pod的IP
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IP pod的IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIP() {
        return this.IP;
    }

    /**
     * Set pod的IP
注意：此字段可能返回 null，表示取不到有效值。
     * @param IP pod的IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIP(String IP) {
        this.IP = IP;
    }

    /**
     * Get pod状态。eg：SUBMITTING提交中、PENDING排队中、RUNNING运行中、SUCCEEDED已完成、FAILED异常、TERMINATING停止中、TERMINATED已停止
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status pod状态。eg：SUBMITTING提交中、PENDING排队中、RUNNING运行中、SUCCEEDED已完成、FAILED异常、TERMINATING停止中、TERMINATED已停止
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set pod状态。eg：SUBMITTING提交中、PENDING排队中、RUNNING运行中、SUCCEEDED已完成、FAILED异常、TERMINATING停止中、TERMINATED已停止
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status pod状态。eg：SUBMITTING提交中、PENDING排队中、RUNNING运行中、SUCCEEDED已完成、FAILED异常、TERMINATING停止中、TERMINATED已停止
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get pod启动时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StartTime pod启动时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set pod启动时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param StartTime pod启动时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get pod结束时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndTime pod结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set pod结束时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndTime pod结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get pod资源配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceConfigInfo pod资源配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ResourceConfigInfo getResourceConfigInfo() {
        return this.ResourceConfigInfo;
    }

    /**
     * Set pod资源配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceConfigInfo pod资源配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceConfigInfo(ResourceConfigInfo ResourceConfigInfo) {
        this.ResourceConfigInfo = ResourceConfigInfo;
    }

    /**
     * Get Pod所属任务的SubUin信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubUin Pod所属任务的SubUin信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubUin() {
        return this.SubUin;
    }

    /**
     * Set Pod所属任务的SubUin信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubUin Pod所属任务的SubUin信息
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

