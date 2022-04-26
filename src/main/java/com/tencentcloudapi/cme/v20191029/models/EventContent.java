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
    * 事件类型，可取值有：
<li>Storage.NewFileCreated：新文件产生事件；</li>
<li>Project.StreamConnect.StatusChanged：云转推项目状态变更事件；</li>
<li>Project.Switcher.StatusChanged：导播台项目状态变更事件；</li>
<li>Material.Imported：媒体导入事件；</li>
<li>Material.Added：媒体添加事件；</li>
<li>Material.Moved：媒体移动事件；</li>
<li>Material.Modified：媒体变更事件；</li>
<li>Material.Deleted：媒体删除事件；</li>
<li>Class.Created：分类新增事件；</li>
<li>Class.Moved：分类移动事件；</li>
<li>Class.Deleted：分类删除事件；</li>
<li>Task.VideoExportCompleted：视频导出完成事件。 </li>
    */
    @SerializedName("EventType")
    @Expose
    private String EventType;

    /**
    * 操作者，表示触发事件的操作者。如果是 `cmeid_system` 表示平台管理员操作。
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
    * 新文件产生事件。仅当 EventType 为 Storage.NewFileCreated 时有效。
    */
    @SerializedName("StorageNewFileCreatedEvent")
    @Expose
    private StorageNewFileCreatedEvent StorageNewFileCreatedEvent;

    /**
    * 云转推项目状态变更事件。仅当 EventType 为 Project.StreamConnect.StatusChanged 时有效。
    */
    @SerializedName("ProjectStreamConnectStatusChangedEvent")
    @Expose
    private ProjectStreamConnectStatusChangedEvent ProjectStreamConnectStatusChangedEvent;

    /**
    * 导播台项目状态变更事件。仅当 EventType 为 Project.Switcher.StatusChanged 时有效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectSwitcherStatusChangedEvent")
    @Expose
    private ProjectSwitcherStatusChangedEvent ProjectSwitcherStatusChangedEvent;

    /**
    * 媒体导入事件。仅当 EventType 为 Material.Imported 时有效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaterialImportedEvent")
    @Expose
    private MaterialImportedEvent MaterialImportedEvent;

    /**
    * 媒体添加事件。仅当 EventType 为 Material.Added 时有效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaterialAddedEvent")
    @Expose
    private MaterialAddedEvent MaterialAddedEvent;

    /**
    * 媒体移动事件。仅当 EventType 为 Material.Moved 时有效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaterialMovedEvent")
    @Expose
    private MaterialMovedEvent MaterialMovedEvent;

    /**
    * 媒体更新事件。仅当 EventType 为 Material.Modified 时有效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaterialModifiedEvent")
    @Expose
    private MaterialModifiedEvent MaterialModifiedEvent;

    /**
    * 媒体删除事件。仅当 EventType 为 Material.Deleted 时有效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaterialDeletedEvent")
    @Expose
    private MaterialDeletedEvent MaterialDeletedEvent;

    /**
    * 分类创建事件。仅当 EventType 为 Class.Created 时有效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClassCreatedEvent")
    @Expose
    private ClassCreatedEvent ClassCreatedEvent;

    /**
    * 分类移动事件。仅当 EventType 为 Class.Moved 时有效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClassMovedEvent")
    @Expose
    private ClassMovedEvent ClassMovedEvent;

    /**
    * 分类删除事件。仅当 EventType 为 Class.Deleted 时有效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClassDeletedEvent")
    @Expose
    private ClassDeletedEvent ClassDeletedEvent;

    /**
    * 视频导出完成事件。仅当 EventType 为 Task.VideoExportCompleted 时有效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VideoExportCompletedEvent")
    @Expose
    private VideoExportCompletedEvent VideoExportCompletedEvent;

    /**
     * Get 事件类型，可取值有：
<li>Storage.NewFileCreated：新文件产生事件；</li>
<li>Project.StreamConnect.StatusChanged：云转推项目状态变更事件；</li>
<li>Project.Switcher.StatusChanged：导播台项目状态变更事件；</li>
<li>Material.Imported：媒体导入事件；</li>
<li>Material.Added：媒体添加事件；</li>
<li>Material.Moved：媒体移动事件；</li>
<li>Material.Modified：媒体变更事件；</li>
<li>Material.Deleted：媒体删除事件；</li>
<li>Class.Created：分类新增事件；</li>
<li>Class.Moved：分类移动事件；</li>
<li>Class.Deleted：分类删除事件；</li>
<li>Task.VideoExportCompleted：视频导出完成事件。 </li> 
     * @return EventType 事件类型，可取值有：
<li>Storage.NewFileCreated：新文件产生事件；</li>
<li>Project.StreamConnect.StatusChanged：云转推项目状态变更事件；</li>
<li>Project.Switcher.StatusChanged：导播台项目状态变更事件；</li>
<li>Material.Imported：媒体导入事件；</li>
<li>Material.Added：媒体添加事件；</li>
<li>Material.Moved：媒体移动事件；</li>
<li>Material.Modified：媒体变更事件；</li>
<li>Material.Deleted：媒体删除事件；</li>
<li>Class.Created：分类新增事件；</li>
<li>Class.Moved：分类移动事件；</li>
<li>Class.Deleted：分类删除事件；</li>
<li>Task.VideoExportCompleted：视频导出完成事件。 </li>
     */
    public String getEventType() {
        return this.EventType;
    }

    /**
     * Set 事件类型，可取值有：
<li>Storage.NewFileCreated：新文件产生事件；</li>
<li>Project.StreamConnect.StatusChanged：云转推项目状态变更事件；</li>
<li>Project.Switcher.StatusChanged：导播台项目状态变更事件；</li>
<li>Material.Imported：媒体导入事件；</li>
<li>Material.Added：媒体添加事件；</li>
<li>Material.Moved：媒体移动事件；</li>
<li>Material.Modified：媒体变更事件；</li>
<li>Material.Deleted：媒体删除事件；</li>
<li>Class.Created：分类新增事件；</li>
<li>Class.Moved：分类移动事件；</li>
<li>Class.Deleted：分类删除事件；</li>
<li>Task.VideoExportCompleted：视频导出完成事件。 </li>
     * @param EventType 事件类型，可取值有：
<li>Storage.NewFileCreated：新文件产生事件；</li>
<li>Project.StreamConnect.StatusChanged：云转推项目状态变更事件；</li>
<li>Project.Switcher.StatusChanged：导播台项目状态变更事件；</li>
<li>Material.Imported：媒体导入事件；</li>
<li>Material.Added：媒体添加事件；</li>
<li>Material.Moved：媒体移动事件；</li>
<li>Material.Modified：媒体变更事件；</li>
<li>Material.Deleted：媒体删除事件；</li>
<li>Class.Created：分类新增事件；</li>
<li>Class.Moved：分类移动事件；</li>
<li>Class.Deleted：分类删除事件；</li>
<li>Task.VideoExportCompleted：视频导出完成事件。 </li>
     */
    public void setEventType(String EventType) {
        this.EventType = EventType;
    }

    /**
     * Get 操作者，表示触发事件的操作者。如果是 `cmeid_system` 表示平台管理员操作。 
     * @return Operator 操作者，表示触发事件的操作者。如果是 `cmeid_system` 表示平台管理员操作。
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set 操作者，表示触发事件的操作者。如果是 `cmeid_system` 表示平台管理员操作。
     * @param Operator 操作者，表示触发事件的操作者。如果是 `cmeid_system` 表示平台管理员操作。
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    /**
     * Get 新文件产生事件。仅当 EventType 为 Storage.NewFileCreated 时有效。 
     * @return StorageNewFileCreatedEvent 新文件产生事件。仅当 EventType 为 Storage.NewFileCreated 时有效。
     */
    public StorageNewFileCreatedEvent getStorageNewFileCreatedEvent() {
        return this.StorageNewFileCreatedEvent;
    }

    /**
     * Set 新文件产生事件。仅当 EventType 为 Storage.NewFileCreated 时有效。
     * @param StorageNewFileCreatedEvent 新文件产生事件。仅当 EventType 为 Storage.NewFileCreated 时有效。
     */
    public void setStorageNewFileCreatedEvent(StorageNewFileCreatedEvent StorageNewFileCreatedEvent) {
        this.StorageNewFileCreatedEvent = StorageNewFileCreatedEvent;
    }

    /**
     * Get 云转推项目状态变更事件。仅当 EventType 为 Project.StreamConnect.StatusChanged 时有效。 
     * @return ProjectStreamConnectStatusChangedEvent 云转推项目状态变更事件。仅当 EventType 为 Project.StreamConnect.StatusChanged 时有效。
     */
    public ProjectStreamConnectStatusChangedEvent getProjectStreamConnectStatusChangedEvent() {
        return this.ProjectStreamConnectStatusChangedEvent;
    }

    /**
     * Set 云转推项目状态变更事件。仅当 EventType 为 Project.StreamConnect.StatusChanged 时有效。
     * @param ProjectStreamConnectStatusChangedEvent 云转推项目状态变更事件。仅当 EventType 为 Project.StreamConnect.StatusChanged 时有效。
     */
    public void setProjectStreamConnectStatusChangedEvent(ProjectStreamConnectStatusChangedEvent ProjectStreamConnectStatusChangedEvent) {
        this.ProjectStreamConnectStatusChangedEvent = ProjectStreamConnectStatusChangedEvent;
    }

    /**
     * Get 导播台项目状态变更事件。仅当 EventType 为 Project.Switcher.StatusChanged 时有效。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProjectSwitcherStatusChangedEvent 导播台项目状态变更事件。仅当 EventType 为 Project.Switcher.StatusChanged 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ProjectSwitcherStatusChangedEvent getProjectSwitcherStatusChangedEvent() {
        return this.ProjectSwitcherStatusChangedEvent;
    }

    /**
     * Set 导播台项目状态变更事件。仅当 EventType 为 Project.Switcher.StatusChanged 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectSwitcherStatusChangedEvent 导播台项目状态变更事件。仅当 EventType 为 Project.Switcher.StatusChanged 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProjectSwitcherStatusChangedEvent(ProjectSwitcherStatusChangedEvent ProjectSwitcherStatusChangedEvent) {
        this.ProjectSwitcherStatusChangedEvent = ProjectSwitcherStatusChangedEvent;
    }

    /**
     * Get 媒体导入事件。仅当 EventType 为 Material.Imported 时有效。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaterialImportedEvent 媒体导入事件。仅当 EventType 为 Material.Imported 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MaterialImportedEvent getMaterialImportedEvent() {
        return this.MaterialImportedEvent;
    }

    /**
     * Set 媒体导入事件。仅当 EventType 为 Material.Imported 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaterialImportedEvent 媒体导入事件。仅当 EventType 为 Material.Imported 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaterialImportedEvent(MaterialImportedEvent MaterialImportedEvent) {
        this.MaterialImportedEvent = MaterialImportedEvent;
    }

    /**
     * Get 媒体添加事件。仅当 EventType 为 Material.Added 时有效。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaterialAddedEvent 媒体添加事件。仅当 EventType 为 Material.Added 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MaterialAddedEvent getMaterialAddedEvent() {
        return this.MaterialAddedEvent;
    }

    /**
     * Set 媒体添加事件。仅当 EventType 为 Material.Added 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaterialAddedEvent 媒体添加事件。仅当 EventType 为 Material.Added 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaterialAddedEvent(MaterialAddedEvent MaterialAddedEvent) {
        this.MaterialAddedEvent = MaterialAddedEvent;
    }

    /**
     * Get 媒体移动事件。仅当 EventType 为 Material.Moved 时有效。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaterialMovedEvent 媒体移动事件。仅当 EventType 为 Material.Moved 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MaterialMovedEvent getMaterialMovedEvent() {
        return this.MaterialMovedEvent;
    }

    /**
     * Set 媒体移动事件。仅当 EventType 为 Material.Moved 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaterialMovedEvent 媒体移动事件。仅当 EventType 为 Material.Moved 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaterialMovedEvent(MaterialMovedEvent MaterialMovedEvent) {
        this.MaterialMovedEvent = MaterialMovedEvent;
    }

    /**
     * Get 媒体更新事件。仅当 EventType 为 Material.Modified 时有效。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaterialModifiedEvent 媒体更新事件。仅当 EventType 为 Material.Modified 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MaterialModifiedEvent getMaterialModifiedEvent() {
        return this.MaterialModifiedEvent;
    }

    /**
     * Set 媒体更新事件。仅当 EventType 为 Material.Modified 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaterialModifiedEvent 媒体更新事件。仅当 EventType 为 Material.Modified 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaterialModifiedEvent(MaterialModifiedEvent MaterialModifiedEvent) {
        this.MaterialModifiedEvent = MaterialModifiedEvent;
    }

    /**
     * Get 媒体删除事件。仅当 EventType 为 Material.Deleted 时有效。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaterialDeletedEvent 媒体删除事件。仅当 EventType 为 Material.Deleted 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MaterialDeletedEvent getMaterialDeletedEvent() {
        return this.MaterialDeletedEvent;
    }

    /**
     * Set 媒体删除事件。仅当 EventType 为 Material.Deleted 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaterialDeletedEvent 媒体删除事件。仅当 EventType 为 Material.Deleted 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaterialDeletedEvent(MaterialDeletedEvent MaterialDeletedEvent) {
        this.MaterialDeletedEvent = MaterialDeletedEvent;
    }

    /**
     * Get 分类创建事件。仅当 EventType 为 Class.Created 时有效。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClassCreatedEvent 分类创建事件。仅当 EventType 为 Class.Created 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ClassCreatedEvent getClassCreatedEvent() {
        return this.ClassCreatedEvent;
    }

    /**
     * Set 分类创建事件。仅当 EventType 为 Class.Created 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClassCreatedEvent 分类创建事件。仅当 EventType 为 Class.Created 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClassCreatedEvent(ClassCreatedEvent ClassCreatedEvent) {
        this.ClassCreatedEvent = ClassCreatedEvent;
    }

    /**
     * Get 分类移动事件。仅当 EventType 为 Class.Moved 时有效。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClassMovedEvent 分类移动事件。仅当 EventType 为 Class.Moved 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ClassMovedEvent getClassMovedEvent() {
        return this.ClassMovedEvent;
    }

    /**
     * Set 分类移动事件。仅当 EventType 为 Class.Moved 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClassMovedEvent 分类移动事件。仅当 EventType 为 Class.Moved 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClassMovedEvent(ClassMovedEvent ClassMovedEvent) {
        this.ClassMovedEvent = ClassMovedEvent;
    }

    /**
     * Get 分类删除事件。仅当 EventType 为 Class.Deleted 时有效。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClassDeletedEvent 分类删除事件。仅当 EventType 为 Class.Deleted 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ClassDeletedEvent getClassDeletedEvent() {
        return this.ClassDeletedEvent;
    }

    /**
     * Set 分类删除事件。仅当 EventType 为 Class.Deleted 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClassDeletedEvent 分类删除事件。仅当 EventType 为 Class.Deleted 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClassDeletedEvent(ClassDeletedEvent ClassDeletedEvent) {
        this.ClassDeletedEvent = ClassDeletedEvent;
    }

    /**
     * Get 视频导出完成事件。仅当 EventType 为 Task.VideoExportCompleted 时有效。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VideoExportCompletedEvent 视频导出完成事件。仅当 EventType 为 Task.VideoExportCompleted 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public VideoExportCompletedEvent getVideoExportCompletedEvent() {
        return this.VideoExportCompletedEvent;
    }

    /**
     * Set 视频导出完成事件。仅当 EventType 为 Task.VideoExportCompleted 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     * @param VideoExportCompletedEvent 视频导出完成事件。仅当 EventType 为 Task.VideoExportCompleted 时有效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVideoExportCompletedEvent(VideoExportCompletedEvent VideoExportCompletedEvent) {
        this.VideoExportCompletedEvent = VideoExportCompletedEvent;
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
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
        }
        if (source.StorageNewFileCreatedEvent != null) {
            this.StorageNewFileCreatedEvent = new StorageNewFileCreatedEvent(source.StorageNewFileCreatedEvent);
        }
        if (source.ProjectStreamConnectStatusChangedEvent != null) {
            this.ProjectStreamConnectStatusChangedEvent = new ProjectStreamConnectStatusChangedEvent(source.ProjectStreamConnectStatusChangedEvent);
        }
        if (source.ProjectSwitcherStatusChangedEvent != null) {
            this.ProjectSwitcherStatusChangedEvent = new ProjectSwitcherStatusChangedEvent(source.ProjectSwitcherStatusChangedEvent);
        }
        if (source.MaterialImportedEvent != null) {
            this.MaterialImportedEvent = new MaterialImportedEvent(source.MaterialImportedEvent);
        }
        if (source.MaterialAddedEvent != null) {
            this.MaterialAddedEvent = new MaterialAddedEvent(source.MaterialAddedEvent);
        }
        if (source.MaterialMovedEvent != null) {
            this.MaterialMovedEvent = new MaterialMovedEvent(source.MaterialMovedEvent);
        }
        if (source.MaterialModifiedEvent != null) {
            this.MaterialModifiedEvent = new MaterialModifiedEvent(source.MaterialModifiedEvent);
        }
        if (source.MaterialDeletedEvent != null) {
            this.MaterialDeletedEvent = new MaterialDeletedEvent(source.MaterialDeletedEvent);
        }
        if (source.ClassCreatedEvent != null) {
            this.ClassCreatedEvent = new ClassCreatedEvent(source.ClassCreatedEvent);
        }
        if (source.ClassMovedEvent != null) {
            this.ClassMovedEvent = new ClassMovedEvent(source.ClassMovedEvent);
        }
        if (source.ClassDeletedEvent != null) {
            this.ClassDeletedEvent = new ClassDeletedEvent(source.ClassDeletedEvent);
        }
        if (source.VideoExportCompletedEvent != null) {
            this.VideoExportCompletedEvent = new VideoExportCompletedEvent(source.VideoExportCompletedEvent);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EventType", this.EventType);
        this.setParamSimple(map, prefix + "Operator", this.Operator);
        this.setParamObj(map, prefix + "StorageNewFileCreatedEvent.", this.StorageNewFileCreatedEvent);
        this.setParamObj(map, prefix + "ProjectStreamConnectStatusChangedEvent.", this.ProjectStreamConnectStatusChangedEvent);
        this.setParamObj(map, prefix + "ProjectSwitcherStatusChangedEvent.", this.ProjectSwitcherStatusChangedEvent);
        this.setParamObj(map, prefix + "MaterialImportedEvent.", this.MaterialImportedEvent);
        this.setParamObj(map, prefix + "MaterialAddedEvent.", this.MaterialAddedEvent);
        this.setParamObj(map, prefix + "MaterialMovedEvent.", this.MaterialMovedEvent);
        this.setParamObj(map, prefix + "MaterialModifiedEvent.", this.MaterialModifiedEvent);
        this.setParamObj(map, prefix + "MaterialDeletedEvent.", this.MaterialDeletedEvent);
        this.setParamObj(map, prefix + "ClassCreatedEvent.", this.ClassCreatedEvent);
        this.setParamObj(map, prefix + "ClassMovedEvent.", this.ClassMovedEvent);
        this.setParamObj(map, prefix + "ClassDeletedEvent.", this.ClassDeletedEvent);
        this.setParamObj(map, prefix + "VideoExportCompletedEvent.", this.VideoExportCompletedEvent);

    }
}

