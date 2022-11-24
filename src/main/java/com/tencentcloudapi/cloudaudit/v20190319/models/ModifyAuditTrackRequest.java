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
package com.tencentcloudapi.cloudaudit.v20190319.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyAuditTrackRequest extends AbstractModel{

    /**
    * 跟踪集 ID
    */
    @SerializedName("TrackId")
    @Expose
    private Long TrackId;

    /**
    * 跟踪集名称，仅支持大小写字母、数字、-以及_的组合，3-48个字符
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 跟踪事件类型（读：Read；写：Write；全部：*）
    */
    @SerializedName("ActionType")
    @Expose
    private String ActionType;

    /**
    * 跟踪事件所属产品（支持全部产品或单个产品，如：cos，全部：*）
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * 跟踪集状态（未开启：0；开启：1）
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 跟踪事件接口名列表（ResourceType为 * 时，EventNames必须为全部：["*"]；指定ResourceType时，支持全部接口：["*"]；支持部分接口：["cos", "cls"]，接口列表上限10个）
    */
    @SerializedName("EventNames")
    @Expose
    private String [] EventNames;

    /**
    * 数据投递存储（目前支持 cos、cls）
    */
    @SerializedName("Storage")
    @Expose
    private Storage Storage;

    /**
    * 是否开启将集团成员操作日志投递到集团管理账号或者可信服务管理账号(0：未开启，1：开启，只能集团管理账号或者可信服务管理账号开启此项功能)
    */
    @SerializedName("TrackForAllMembers")
    @Expose
    private Long TrackForAllMembers;

    /**
     * Get 跟踪集 ID 
     * @return TrackId 跟踪集 ID
     */
    public Long getTrackId() {
        return this.TrackId;
    }

    /**
     * Set 跟踪集 ID
     * @param TrackId 跟踪集 ID
     */
    public void setTrackId(Long TrackId) {
        this.TrackId = TrackId;
    }

    /**
     * Get 跟踪集名称，仅支持大小写字母、数字、-以及_的组合，3-48个字符 
     * @return Name 跟踪集名称，仅支持大小写字母、数字、-以及_的组合，3-48个字符
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 跟踪集名称，仅支持大小写字母、数字、-以及_的组合，3-48个字符
     * @param Name 跟踪集名称，仅支持大小写字母、数字、-以及_的组合，3-48个字符
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 跟踪事件类型（读：Read；写：Write；全部：*） 
     * @return ActionType 跟踪事件类型（读：Read；写：Write；全部：*）
     */
    public String getActionType() {
        return this.ActionType;
    }

    /**
     * Set 跟踪事件类型（读：Read；写：Write；全部：*）
     * @param ActionType 跟踪事件类型（读：Read；写：Write；全部：*）
     */
    public void setActionType(String ActionType) {
        this.ActionType = ActionType;
    }

    /**
     * Get 跟踪事件所属产品（支持全部产品或单个产品，如：cos，全部：*） 
     * @return ResourceType 跟踪事件所属产品（支持全部产品或单个产品，如：cos，全部：*）
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set 跟踪事件所属产品（支持全部产品或单个产品，如：cos，全部：*）
     * @param ResourceType 跟踪事件所属产品（支持全部产品或单个产品，如：cos，全部：*）
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get 跟踪集状态（未开启：0；开启：1） 
     * @return Status 跟踪集状态（未开启：0；开启：1）
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 跟踪集状态（未开启：0；开启：1）
     * @param Status 跟踪集状态（未开启：0；开启：1）
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 跟踪事件接口名列表（ResourceType为 * 时，EventNames必须为全部：["*"]；指定ResourceType时，支持全部接口：["*"]；支持部分接口：["cos", "cls"]，接口列表上限10个） 
     * @return EventNames 跟踪事件接口名列表（ResourceType为 * 时，EventNames必须为全部：["*"]；指定ResourceType时，支持全部接口：["*"]；支持部分接口：["cos", "cls"]，接口列表上限10个）
     */
    public String [] getEventNames() {
        return this.EventNames;
    }

    /**
     * Set 跟踪事件接口名列表（ResourceType为 * 时，EventNames必须为全部：["*"]；指定ResourceType时，支持全部接口：["*"]；支持部分接口：["cos", "cls"]，接口列表上限10个）
     * @param EventNames 跟踪事件接口名列表（ResourceType为 * 时，EventNames必须为全部：["*"]；指定ResourceType时，支持全部接口：["*"]；支持部分接口：["cos", "cls"]，接口列表上限10个）
     */
    public void setEventNames(String [] EventNames) {
        this.EventNames = EventNames;
    }

    /**
     * Get 数据投递存储（目前支持 cos、cls） 
     * @return Storage 数据投递存储（目前支持 cos、cls）
     */
    public Storage getStorage() {
        return this.Storage;
    }

    /**
     * Set 数据投递存储（目前支持 cos、cls）
     * @param Storage 数据投递存储（目前支持 cos、cls）
     */
    public void setStorage(Storage Storage) {
        this.Storage = Storage;
    }

    /**
     * Get 是否开启将集团成员操作日志投递到集团管理账号或者可信服务管理账号(0：未开启，1：开启，只能集团管理账号或者可信服务管理账号开启此项功能) 
     * @return TrackForAllMembers 是否开启将集团成员操作日志投递到集团管理账号或者可信服务管理账号(0：未开启，1：开启，只能集团管理账号或者可信服务管理账号开启此项功能)
     */
    public Long getTrackForAllMembers() {
        return this.TrackForAllMembers;
    }

    /**
     * Set 是否开启将集团成员操作日志投递到集团管理账号或者可信服务管理账号(0：未开启，1：开启，只能集团管理账号或者可信服务管理账号开启此项功能)
     * @param TrackForAllMembers 是否开启将集团成员操作日志投递到集团管理账号或者可信服务管理账号(0：未开启，1：开启，只能集团管理账号或者可信服务管理账号开启此项功能)
     */
    public void setTrackForAllMembers(Long TrackForAllMembers) {
        this.TrackForAllMembers = TrackForAllMembers;
    }

    public ModifyAuditTrackRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAuditTrackRequest(ModifyAuditTrackRequest source) {
        if (source.TrackId != null) {
            this.TrackId = new Long(source.TrackId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ActionType != null) {
            this.ActionType = new String(source.ActionType);
        }
        if (source.ResourceType != null) {
            this.ResourceType = new String(source.ResourceType);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.EventNames != null) {
            this.EventNames = new String[source.EventNames.length];
            for (int i = 0; i < source.EventNames.length; i++) {
                this.EventNames[i] = new String(source.EventNames[i]);
            }
        }
        if (source.Storage != null) {
            this.Storage = new Storage(source.Storage);
        }
        if (source.TrackForAllMembers != null) {
            this.TrackForAllMembers = new Long(source.TrackForAllMembers);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TrackId", this.TrackId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ActionType", this.ActionType);
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArraySimple(map, prefix + "EventNames.", this.EventNames);
        this.setParamObj(map, prefix + "Storage.", this.Storage);
        this.setParamSimple(map, prefix + "TrackForAllMembers", this.TrackForAllMembers);

    }
}

