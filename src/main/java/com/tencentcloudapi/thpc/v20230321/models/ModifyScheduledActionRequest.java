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
package com.tencentcloudapi.thpc.v20230321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyScheduledActionRequest extends AbstractModel {

    /**
    * <p>定时伸缩任务 ID。</p>
    */
    @SerializedName("ScheduledActionId")
    @Expose
    private String ScheduledActionId;

    /**
    * <p>定时伸缩任务名称。</p>
    */
    @SerializedName("ScheduledActionName")
    @Expose
    private String ScheduledActionName;

    /**
    * <p>定时触发后队列期望节点数。</p>
    */
    @SerializedName("DesiredCapacity")
    @Expose
    private Long DesiredCapacity;

    /**
    * <p>任务状态。</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get <p>定时伸缩任务 ID。</p> 
     * @return ScheduledActionId <p>定时伸缩任务 ID。</p>
     */
    public String getScheduledActionId() {
        return this.ScheduledActionId;
    }

    /**
     * Set <p>定时伸缩任务 ID。</p>
     * @param ScheduledActionId <p>定时伸缩任务 ID。</p>
     */
    public void setScheduledActionId(String ScheduledActionId) {
        this.ScheduledActionId = ScheduledActionId;
    }

    /**
     * Get <p>定时伸缩任务名称。</p> 
     * @return ScheduledActionName <p>定时伸缩任务名称。</p>
     */
    public String getScheduledActionName() {
        return this.ScheduledActionName;
    }

    /**
     * Set <p>定时伸缩任务名称。</p>
     * @param ScheduledActionName <p>定时伸缩任务名称。</p>
     */
    public void setScheduledActionName(String ScheduledActionName) {
        this.ScheduledActionName = ScheduledActionName;
    }

    /**
     * Get <p>定时触发后队列期望节点数。</p> 
     * @return DesiredCapacity <p>定时触发后队列期望节点数。</p>
     */
    public Long getDesiredCapacity() {
        return this.DesiredCapacity;
    }

    /**
     * Set <p>定时触发后队列期望节点数。</p>
     * @param DesiredCapacity <p>定时触发后队列期望节点数。</p>
     */
    public void setDesiredCapacity(Long DesiredCapacity) {
        this.DesiredCapacity = DesiredCapacity;
    }

    /**
     * Get <p>任务状态。</p> 
     * @return Status <p>任务状态。</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>任务状态。</p>
     * @param Status <p>任务状态。</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public ModifyScheduledActionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyScheduledActionRequest(ModifyScheduledActionRequest source) {
        if (source.ScheduledActionId != null) {
            this.ScheduledActionId = new String(source.ScheduledActionId);
        }
        if (source.ScheduledActionName != null) {
            this.ScheduledActionName = new String(source.ScheduledActionName);
        }
        if (source.DesiredCapacity != null) {
            this.DesiredCapacity = new Long(source.DesiredCapacity);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ScheduledActionId", this.ScheduledActionId);
        this.setParamSimple(map, prefix + "ScheduledActionName", this.ScheduledActionName);
        this.setParamSimple(map, prefix + "DesiredCapacity", this.DesiredCapacity);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

