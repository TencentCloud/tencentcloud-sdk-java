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

public class ModifyVirusFileStatusRequest extends AbstractModel{

    /**
    * 处理事件id
    */
    @SerializedName("EventIdSet")
    @Expose
    private String [] EventIdSet;

    /**
    * 标记事件的状态，   
    EVENT_DEALED:事件处理
    EVENT_INGNORE"：事件忽略
    EVENT_DEL:事件删除
    EVENT_ADD_WHITE:事件加白
    EVENT_PENDING: 事件待处理
	EVENT_ISOLATE_CONTAINER: 隔离容器
	EVENT_RESOTRE_CONTAINER: 恢复容器
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 事件备注
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 是否后续自动隔离相同MD5文件
    */
    @SerializedName("AutoIsolate")
    @Expose
    private Boolean AutoIsolate;

    /**
     * Get 处理事件id 
     * @return EventIdSet 处理事件id
     */
    public String [] getEventIdSet() {
        return this.EventIdSet;
    }

    /**
     * Set 处理事件id
     * @param EventIdSet 处理事件id
     */
    public void setEventIdSet(String [] EventIdSet) {
        this.EventIdSet = EventIdSet;
    }

    /**
     * Get 标记事件的状态，   
    EVENT_DEALED:事件处理
    EVENT_INGNORE"：事件忽略
    EVENT_DEL:事件删除
    EVENT_ADD_WHITE:事件加白
    EVENT_PENDING: 事件待处理
	EVENT_ISOLATE_CONTAINER: 隔离容器
	EVENT_RESOTRE_CONTAINER: 恢复容器 
     * @return Status 标记事件的状态，   
    EVENT_DEALED:事件处理
    EVENT_INGNORE"：事件忽略
    EVENT_DEL:事件删除
    EVENT_ADD_WHITE:事件加白
    EVENT_PENDING: 事件待处理
	EVENT_ISOLATE_CONTAINER: 隔离容器
	EVENT_RESOTRE_CONTAINER: 恢复容器
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 标记事件的状态，   
    EVENT_DEALED:事件处理
    EVENT_INGNORE"：事件忽略
    EVENT_DEL:事件删除
    EVENT_ADD_WHITE:事件加白
    EVENT_PENDING: 事件待处理
	EVENT_ISOLATE_CONTAINER: 隔离容器
	EVENT_RESOTRE_CONTAINER: 恢复容器
     * @param Status 标记事件的状态，   
    EVENT_DEALED:事件处理
    EVENT_INGNORE"：事件忽略
    EVENT_DEL:事件删除
    EVENT_ADD_WHITE:事件加白
    EVENT_PENDING: 事件待处理
	EVENT_ISOLATE_CONTAINER: 隔离容器
	EVENT_RESOTRE_CONTAINER: 恢复容器
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 事件备注 
     * @return Remark 事件备注
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 事件备注
     * @param Remark 事件备注
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 是否后续自动隔离相同MD5文件 
     * @return AutoIsolate 是否后续自动隔离相同MD5文件
     */
    public Boolean getAutoIsolate() {
        return this.AutoIsolate;
    }

    /**
     * Set 是否后续自动隔离相同MD5文件
     * @param AutoIsolate 是否后续自动隔离相同MD5文件
     */
    public void setAutoIsolate(Boolean AutoIsolate) {
        this.AutoIsolate = AutoIsolate;
    }

    public ModifyVirusFileStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyVirusFileStatusRequest(ModifyVirusFileStatusRequest source) {
        if (source.EventIdSet != null) {
            this.EventIdSet = new String[source.EventIdSet.length];
            for (int i = 0; i < source.EventIdSet.length; i++) {
                this.EventIdSet[i] = new String(source.EventIdSet[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.AutoIsolate != null) {
            this.AutoIsolate = new Boolean(source.AutoIsolate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "EventIdSet.", this.EventIdSet);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "AutoIsolate", this.AutoIsolate);

    }
}

