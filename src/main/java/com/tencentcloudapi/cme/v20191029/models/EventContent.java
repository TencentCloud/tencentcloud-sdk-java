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
package com.tencentcloudapi.cme.v20191029.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EventContent extends AbstractModel{

    /**
    * 事件类型，可取值为：
<li>Storage.NewFileCreated：新文件产生；</li>
<li>Project.StreamConnect.StatusChanged：云转推项目状态变更。</li>
    */
    @SerializedName("EventType")
    @Expose
    private String EventType;

    /**
    * 新文件产生事件信息。仅当 EventType 为 Storage.NewFileCreated 时有效。
    */
    @SerializedName("StorageNewFileCreatedEvent")
    @Expose
    private StorageNewFileCreatedEvent StorageNewFileCreatedEvent;

    /**
    * 云转推项目状态变更事件信息。仅当 EventType 为 Project.StreamConnect.StatusChanged 时有效。
    */
    @SerializedName("ProjectStreamConnectStatusChangedEvent")
    @Expose
    private ProjectStreamConnectStatusChangedEvent ProjectStreamConnectStatusChangedEvent;

    /**
     * Get 事件类型，可取值为：
<li>Storage.NewFileCreated：新文件产生；</li>
<li>Project.StreamConnect.StatusChanged：云转推项目状态变更。</li> 
     * @return EventType 事件类型，可取值为：
<li>Storage.NewFileCreated：新文件产生；</li>
<li>Project.StreamConnect.StatusChanged：云转推项目状态变更。</li>
     */
    public String getEventType() {
        return this.EventType;
    }

    /**
     * Set 事件类型，可取值为：
<li>Storage.NewFileCreated：新文件产生；</li>
<li>Project.StreamConnect.StatusChanged：云转推项目状态变更。</li>
     * @param EventType 事件类型，可取值为：
<li>Storage.NewFileCreated：新文件产生；</li>
<li>Project.StreamConnect.StatusChanged：云转推项目状态变更。</li>
     */
    public void setEventType(String EventType) {
        this.EventType = EventType;
    }

    /**
     * Get 新文件产生事件信息。仅当 EventType 为 Storage.NewFileCreated 时有效。 
     * @return StorageNewFileCreatedEvent 新文件产生事件信息。仅当 EventType 为 Storage.NewFileCreated 时有效。
     */
    public StorageNewFileCreatedEvent getStorageNewFileCreatedEvent() {
        return this.StorageNewFileCreatedEvent;
    }

    /**
     * Set 新文件产生事件信息。仅当 EventType 为 Storage.NewFileCreated 时有效。
     * @param StorageNewFileCreatedEvent 新文件产生事件信息。仅当 EventType 为 Storage.NewFileCreated 时有效。
     */
    public void setStorageNewFileCreatedEvent(StorageNewFileCreatedEvent StorageNewFileCreatedEvent) {
        this.StorageNewFileCreatedEvent = StorageNewFileCreatedEvent;
    }

    /**
     * Get 云转推项目状态变更事件信息。仅当 EventType 为 Project.StreamConnect.StatusChanged 时有效。 
     * @return ProjectStreamConnectStatusChangedEvent 云转推项目状态变更事件信息。仅当 EventType 为 Project.StreamConnect.StatusChanged 时有效。
     */
    public ProjectStreamConnectStatusChangedEvent getProjectStreamConnectStatusChangedEvent() {
        return this.ProjectStreamConnectStatusChangedEvent;
    }

    /**
     * Set 云转推项目状态变更事件信息。仅当 EventType 为 Project.StreamConnect.StatusChanged 时有效。
     * @param ProjectStreamConnectStatusChangedEvent 云转推项目状态变更事件信息。仅当 EventType 为 Project.StreamConnect.StatusChanged 时有效。
     */
    public void setProjectStreamConnectStatusChangedEvent(ProjectStreamConnectStatusChangedEvent ProjectStreamConnectStatusChangedEvent) {
        this.ProjectStreamConnectStatusChangedEvent = ProjectStreamConnectStatusChangedEvent;
    }

    public EventContent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EventContent(EventContent source) {
        if (source.EventType != null) {
            this.EventType = new String(source.EventType);
        }
        if (source.StorageNewFileCreatedEvent != null) {
            this.StorageNewFileCreatedEvent = new StorageNewFileCreatedEvent(source.StorageNewFileCreatedEvent);
        }
        if (source.ProjectStreamConnectStatusChangedEvent != null) {
            this.ProjectStreamConnectStatusChangedEvent = new ProjectStreamConnectStatusChangedEvent(source.ProjectStreamConnectStatusChangedEvent);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EventType", this.EventType);
        this.setParamObj(map, prefix + "StorageNewFileCreatedEvent.", this.StorageNewFileCreatedEvent);
        this.setParamObj(map, prefix + "ProjectStreamConnectStatusChangedEvent.", this.ProjectStreamConnectStatusChangedEvent);

    }
}

