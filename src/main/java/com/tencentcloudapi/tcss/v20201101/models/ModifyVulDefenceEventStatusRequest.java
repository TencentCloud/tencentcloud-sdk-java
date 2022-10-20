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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyVulDefenceEventStatusRequest extends AbstractModel{

    /**
    * 事件IDs数组
    */
    @SerializedName("EventIDs")
    @Expose
    private Long [] EventIDs;

    /**
    * 操作状态：
EVENT_DEALED：已处理，EVENT_IGNORE：忽略，EVENT_ISOLATE_CONTAINER：隔离容器，EVENT_DEL：删除
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 备注
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
     * Get 事件IDs数组 
     * @return EventIDs 事件IDs数组
     */
    public Long [] getEventIDs() {
        return this.EventIDs;
    }

    /**
     * Set 事件IDs数组
     * @param EventIDs 事件IDs数组
     */
    public void setEventIDs(Long [] EventIDs) {
        this.EventIDs = EventIDs;
    }

    /**
     * Get 操作状态：
EVENT_DEALED：已处理，EVENT_IGNORE：忽略，EVENT_ISOLATE_CONTAINER：隔离容器，EVENT_DEL：删除 
     * @return Status 操作状态：
EVENT_DEALED：已处理，EVENT_IGNORE：忽略，EVENT_ISOLATE_CONTAINER：隔离容器，EVENT_DEL：删除
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 操作状态：
EVENT_DEALED：已处理，EVENT_IGNORE：忽略，EVENT_ISOLATE_CONTAINER：隔离容器，EVENT_DEL：删除
     * @param Status 操作状态：
EVENT_DEALED：已处理，EVENT_IGNORE：忽略，EVENT_ISOLATE_CONTAINER：隔离容器，EVENT_DEL：删除
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 备注 
     * @return Remark 备注
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备注
     * @param Remark 备注
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    public ModifyVulDefenceEventStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyVulDefenceEventStatusRequest(ModifyVulDefenceEventStatusRequest source) {
        if (source.EventIDs != null) {
            this.EventIDs = new Long[source.EventIDs.length];
            for (int i = 0; i < source.EventIDs.length; i++) {
                this.EventIDs[i] = new Long(source.EventIDs[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "EventIDs.", this.EventIDs);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Remark", this.Remark);

    }
}

