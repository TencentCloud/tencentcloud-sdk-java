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
package com.tencentcloudapi.databuddy.v20260715.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateLocationRequest extends AbstractModel {

    /**
    * 存储位置名，必填
    */
    @SerializedName("LocationName")
    @Expose
    private String LocationName;

    /**
    * 更新location的操作列表，必填。通过 UpdateType 指定操作类型，支持的 UpdateType：modify_location_name（修改名称）、modify_location_comment（修改描述）、modify_location_properties（修改属性）、modify_file_event_subscription（操作COS文件事件订阅开关）
    */
    @SerializedName("Updates")
    @Expose
    private LocationUpdate [] Updates;

    /**
    * 调用时所在workspace唯一id，必填
    */
    @SerializedName("WorkspaceId")
    @Expose
    private String WorkspaceId;

    /**
    * COS 文件事件订阅配置，可选；不设置时不改动现有订阅（仅 COS 类型 Location 生效）。设置时：先按新配置重新订阅（同桶覆盖写，幂等），再修改 Location 元数据。与 Updates 中的 modify_file_event_subscription 配合表达开关操作：Updates 含该类型且本字段有值=开启/编辑订阅；Updates 含该类型且本字段未设置=关闭订阅；Updates 不含该类型时维持默认语义（不设置不动、设置覆盖）
    */
    @SerializedName("FileEventSubscription")
    @Expose
    private CosEventSubscription FileEventSubscription;

    /**
     * Get 存储位置名，必填 
     * @return LocationName 存储位置名，必填
     */
    public String getLocationName() {
        return this.LocationName;
    }

    /**
     * Set 存储位置名，必填
     * @param LocationName 存储位置名，必填
     */
    public void setLocationName(String LocationName) {
        this.LocationName = LocationName;
    }

    /**
     * Get 更新location的操作列表，必填。通过 UpdateType 指定操作类型，支持的 UpdateType：modify_location_name（修改名称）、modify_location_comment（修改描述）、modify_location_properties（修改属性）、modify_file_event_subscription（操作COS文件事件订阅开关） 
     * @return Updates 更新location的操作列表，必填。通过 UpdateType 指定操作类型，支持的 UpdateType：modify_location_name（修改名称）、modify_location_comment（修改描述）、modify_location_properties（修改属性）、modify_file_event_subscription（操作COS文件事件订阅开关）
     */
    public LocationUpdate [] getUpdates() {
        return this.Updates;
    }

    /**
     * Set 更新location的操作列表，必填。通过 UpdateType 指定操作类型，支持的 UpdateType：modify_location_name（修改名称）、modify_location_comment（修改描述）、modify_location_properties（修改属性）、modify_file_event_subscription（操作COS文件事件订阅开关）
     * @param Updates 更新location的操作列表，必填。通过 UpdateType 指定操作类型，支持的 UpdateType：modify_location_name（修改名称）、modify_location_comment（修改描述）、modify_location_properties（修改属性）、modify_file_event_subscription（操作COS文件事件订阅开关）
     */
    public void setUpdates(LocationUpdate [] Updates) {
        this.Updates = Updates;
    }

    /**
     * Get 调用时所在workspace唯一id，必填 
     * @return WorkspaceId 调用时所在workspace唯一id，必填
     */
    public String getWorkspaceId() {
        return this.WorkspaceId;
    }

    /**
     * Set 调用时所在workspace唯一id，必填
     * @param WorkspaceId 调用时所在workspace唯一id，必填
     */
    public void setWorkspaceId(String WorkspaceId) {
        this.WorkspaceId = WorkspaceId;
    }

    /**
     * Get COS 文件事件订阅配置，可选；不设置时不改动现有订阅（仅 COS 类型 Location 生效）。设置时：先按新配置重新订阅（同桶覆盖写，幂等），再修改 Location 元数据。与 Updates 中的 modify_file_event_subscription 配合表达开关操作：Updates 含该类型且本字段有值=开启/编辑订阅；Updates 含该类型且本字段未设置=关闭订阅；Updates 不含该类型时维持默认语义（不设置不动、设置覆盖） 
     * @return FileEventSubscription COS 文件事件订阅配置，可选；不设置时不改动现有订阅（仅 COS 类型 Location 生效）。设置时：先按新配置重新订阅（同桶覆盖写，幂等），再修改 Location 元数据。与 Updates 中的 modify_file_event_subscription 配合表达开关操作：Updates 含该类型且本字段有值=开启/编辑订阅；Updates 含该类型且本字段未设置=关闭订阅；Updates 不含该类型时维持默认语义（不设置不动、设置覆盖）
     */
    public CosEventSubscription getFileEventSubscription() {
        return this.FileEventSubscription;
    }

    /**
     * Set COS 文件事件订阅配置，可选；不设置时不改动现有订阅（仅 COS 类型 Location 生效）。设置时：先按新配置重新订阅（同桶覆盖写，幂等），再修改 Location 元数据。与 Updates 中的 modify_file_event_subscription 配合表达开关操作：Updates 含该类型且本字段有值=开启/编辑订阅；Updates 含该类型且本字段未设置=关闭订阅；Updates 不含该类型时维持默认语义（不设置不动、设置覆盖）
     * @param FileEventSubscription COS 文件事件订阅配置，可选；不设置时不改动现有订阅（仅 COS 类型 Location 生效）。设置时：先按新配置重新订阅（同桶覆盖写，幂等），再修改 Location 元数据。与 Updates 中的 modify_file_event_subscription 配合表达开关操作：Updates 含该类型且本字段有值=开启/编辑订阅；Updates 含该类型且本字段未设置=关闭订阅；Updates 不含该类型时维持默认语义（不设置不动、设置覆盖）
     */
    public void setFileEventSubscription(CosEventSubscription FileEventSubscription) {
        this.FileEventSubscription = FileEventSubscription;
    }

    public UpdateLocationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateLocationRequest(UpdateLocationRequest source) {
        if (source.LocationName != null) {
            this.LocationName = new String(source.LocationName);
        }
        if (source.Updates != null) {
            this.Updates = new LocationUpdate[source.Updates.length];
            for (int i = 0; i < source.Updates.length; i++) {
                this.Updates[i] = new LocationUpdate(source.Updates[i]);
            }
        }
        if (source.WorkspaceId != null) {
            this.WorkspaceId = new String(source.WorkspaceId);
        }
        if (source.FileEventSubscription != null) {
            this.FileEventSubscription = new CosEventSubscription(source.FileEventSubscription);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LocationName", this.LocationName);
        this.setParamArrayObj(map, prefix + "Updates.", this.Updates);
        this.setParamSimple(map, prefix + "WorkspaceId", this.WorkspaceId);
        this.setParamObj(map, prefix + "FileEventSubscription.", this.FileEventSubscription);

    }
}

