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
package com.tencentcloudapi.lighthouse.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DockerActivity extends AbstractModel{

    /**
    * 活动ID。
    */
    @SerializedName("ActivityId")
    @Expose
    private String ActivityId;

    /**
    * 活动名称。
    */
    @SerializedName("ActivityName")
    @Expose
    private String ActivityName;

    /**
    * 活动状态。取值范围： 
<li>INIT：表示初始化，活动尚未执行</li>
<li>OPERATING：表示活动执行中</li>
<li>SUCCESS：表示活动执行成功</li>
<li>FAILED：表示活动执行失败</li>
    */
    @SerializedName("ActivityState")
    @Expose
    private String ActivityState;

    /**
    * 活动执行的命令输出，以base64编码。
    */
    @SerializedName("ActivityCommandOutput")
    @Expose
    private String ActivityCommandOutput;

    /**
    * 容器ID列表。
    */
    @SerializedName("ContainerIds")
    @Expose
    private String [] ContainerIds;

    /**
    * 创建时间。按照 ISO8601 标准表示，并且使用 UTC 时间。
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * 结束时间。按照 ISO8601 标准表示，并且使用 UTC 时间。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
     * Get 活动ID。 
     * @return ActivityId 活动ID。
     */
    public String getActivityId() {
        return this.ActivityId;
    }

    /**
     * Set 活动ID。
     * @param ActivityId 活动ID。
     */
    public void setActivityId(String ActivityId) {
        this.ActivityId = ActivityId;
    }

    /**
     * Get 活动名称。 
     * @return ActivityName 活动名称。
     */
    public String getActivityName() {
        return this.ActivityName;
    }

    /**
     * Set 活动名称。
     * @param ActivityName 活动名称。
     */
    public void setActivityName(String ActivityName) {
        this.ActivityName = ActivityName;
    }

    /**
     * Get 活动状态。取值范围： 
<li>INIT：表示初始化，活动尚未执行</li>
<li>OPERATING：表示活动执行中</li>
<li>SUCCESS：表示活动执行成功</li>
<li>FAILED：表示活动执行失败</li> 
     * @return ActivityState 活动状态。取值范围： 
<li>INIT：表示初始化，活动尚未执行</li>
<li>OPERATING：表示活动执行中</li>
<li>SUCCESS：表示活动执行成功</li>
<li>FAILED：表示活动执行失败</li>
     */
    public String getActivityState() {
        return this.ActivityState;
    }

    /**
     * Set 活动状态。取值范围： 
<li>INIT：表示初始化，活动尚未执行</li>
<li>OPERATING：表示活动执行中</li>
<li>SUCCESS：表示活动执行成功</li>
<li>FAILED：表示活动执行失败</li>
     * @param ActivityState 活动状态。取值范围： 
<li>INIT：表示初始化，活动尚未执行</li>
<li>OPERATING：表示活动执行中</li>
<li>SUCCESS：表示活动执行成功</li>
<li>FAILED：表示活动执行失败</li>
     */
    public void setActivityState(String ActivityState) {
        this.ActivityState = ActivityState;
    }

    /**
     * Get 活动执行的命令输出，以base64编码。 
     * @return ActivityCommandOutput 活动执行的命令输出，以base64编码。
     */
    public String getActivityCommandOutput() {
        return this.ActivityCommandOutput;
    }

    /**
     * Set 活动执行的命令输出，以base64编码。
     * @param ActivityCommandOutput 活动执行的命令输出，以base64编码。
     */
    public void setActivityCommandOutput(String ActivityCommandOutput) {
        this.ActivityCommandOutput = ActivityCommandOutput;
    }

    /**
     * Get 容器ID列表。 
     * @return ContainerIds 容器ID列表。
     */
    public String [] getContainerIds() {
        return this.ContainerIds;
    }

    /**
     * Set 容器ID列表。
     * @param ContainerIds 容器ID列表。
     */
    public void setContainerIds(String [] ContainerIds) {
        this.ContainerIds = ContainerIds;
    }

    /**
     * Get 创建时间。按照 ISO8601 标准表示，并且使用 UTC 时间。 
     * @return CreatedTime 创建时间。按照 ISO8601 标准表示，并且使用 UTC 时间。
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 创建时间。按照 ISO8601 标准表示，并且使用 UTC 时间。
     * @param CreatedTime 创建时间。按照 ISO8601 标准表示，并且使用 UTC 时间。
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get 结束时间。按照 ISO8601 标准表示，并且使用 UTC 时间。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndTime 结束时间。按照 ISO8601 标准表示，并且使用 UTC 时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间。按照 ISO8601 标准表示，并且使用 UTC 时间。
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndTime 结束时间。按照 ISO8601 标准表示，并且使用 UTC 时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    public DockerActivity() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DockerActivity(DockerActivity source) {
        if (source.ActivityId != null) {
            this.ActivityId = new String(source.ActivityId);
        }
        if (source.ActivityName != null) {
            this.ActivityName = new String(source.ActivityName);
        }
        if (source.ActivityState != null) {
            this.ActivityState = new String(source.ActivityState);
        }
        if (source.ActivityCommandOutput != null) {
            this.ActivityCommandOutput = new String(source.ActivityCommandOutput);
        }
        if (source.ContainerIds != null) {
            this.ContainerIds = new String[source.ContainerIds.length];
            for (int i = 0; i < source.ContainerIds.length; i++) {
                this.ContainerIds[i] = new String(source.ContainerIds[i]);
            }
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ActivityId", this.ActivityId);
        this.setParamSimple(map, prefix + "ActivityName", this.ActivityName);
        this.setParamSimple(map, prefix + "ActivityState", this.ActivityState);
        this.setParamSimple(map, prefix + "ActivityCommandOutput", this.ActivityCommandOutput);
        this.setParamArraySimple(map, prefix + "ContainerIds.", this.ContainerIds);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

