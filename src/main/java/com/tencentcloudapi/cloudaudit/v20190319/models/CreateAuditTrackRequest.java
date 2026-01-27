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
package com.tencentcloudapi.cloudaudit.v20190319.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateAuditTrackRequest extends AbstractModel {

    /**
    * <p>跟踪集名称，仅支持大小写字母、数字、-以及_的组合，3-48个字符</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>跟踪集状态（未开启：0；开启：1）</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>数据投递存储（目前支持 cos、cls 、ckafka）</p>
    */
    @SerializedName("Storage")
    @Expose
    private Storage Storage;

    /**
    * <p>跟踪事件类型（读：Read；写：Write；全部：*）</p>
    */
    @SerializedName("ActionType")
    @Expose
    private String ActionType;

    /**
    * <p>跟踪事件所属产品（支持全部产品或单个产品，如：cos，全部：*）</p>
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * <p>跟踪事件接口名列表（ResourceType为 * 时，EventNames必须为全部：[&quot;*&quot;]；指定ResourceType时，支持全部接口：[&quot;*&quot;]；支持部分接口：[&quot;cos&quot;, &quot;cls&quot;]，接口列表上限10个）</p>
    */
    @SerializedName("EventNames")
    @Expose
    private String [] EventNames;

    /**
    * <p>是否开启将集团成员操作日志投递到集团管理账号或者可信服务管理账号(0：未开启，1：开启，只能集团管理账号或者可信服务管理账号开启此项功能)</p>
    */
    @SerializedName("TrackForAllMembers")
    @Expose
    private Long TrackForAllMembers;

    /**
    * <p>任务ID</p>
    */
    @SerializedName("ExportId")
    @Expose
    private String ExportId;

    /**
     * Get <p>跟踪集名称，仅支持大小写字母、数字、-以及_的组合，3-48个字符</p> 
     * @return Name <p>跟踪集名称，仅支持大小写字母、数字、-以及_的组合，3-48个字符</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>跟踪集名称，仅支持大小写字母、数字、-以及_的组合，3-48个字符</p>
     * @param Name <p>跟踪集名称，仅支持大小写字母、数字、-以及_的组合，3-48个字符</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>跟踪集状态（未开启：0；开启：1）</p> 
     * @return Status <p>跟踪集状态（未开启：0；开启：1）</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>跟踪集状态（未开启：0；开启：1）</p>
     * @param Status <p>跟踪集状态（未开启：0；开启：1）</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>数据投递存储（目前支持 cos、cls 、ckafka）</p> 
     * @return Storage <p>数据投递存储（目前支持 cos、cls 、ckafka）</p>
     */
    public Storage getStorage() {
        return this.Storage;
    }

    /**
     * Set <p>数据投递存储（目前支持 cos、cls 、ckafka）</p>
     * @param Storage <p>数据投递存储（目前支持 cos、cls 、ckafka）</p>
     */
    public void setStorage(Storage Storage) {
        this.Storage = Storage;
    }

    /**
     * Get <p>跟踪事件类型（读：Read；写：Write；全部：*）</p> 
     * @return ActionType <p>跟踪事件类型（读：Read；写：Write；全部：*）</p>
     */
    public String getActionType() {
        return this.ActionType;
    }

    /**
     * Set <p>跟踪事件类型（读：Read；写：Write；全部：*）</p>
     * @param ActionType <p>跟踪事件类型（读：Read；写：Write；全部：*）</p>
     */
    public void setActionType(String ActionType) {
        this.ActionType = ActionType;
    }

    /**
     * Get <p>跟踪事件所属产品（支持全部产品或单个产品，如：cos，全部：*）</p> 
     * @return ResourceType <p>跟踪事件所属产品（支持全部产品或单个产品，如：cos，全部：*）</p>
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set <p>跟踪事件所属产品（支持全部产品或单个产品，如：cos，全部：*）</p>
     * @param ResourceType <p>跟踪事件所属产品（支持全部产品或单个产品，如：cos，全部：*）</p>
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get <p>跟踪事件接口名列表（ResourceType为 * 时，EventNames必须为全部：[&quot;*&quot;]；指定ResourceType时，支持全部接口：[&quot;*&quot;]；支持部分接口：[&quot;cos&quot;, &quot;cls&quot;]，接口列表上限10个）</p> 
     * @return EventNames <p>跟踪事件接口名列表（ResourceType为 * 时，EventNames必须为全部：[&quot;*&quot;]；指定ResourceType时，支持全部接口：[&quot;*&quot;]；支持部分接口：[&quot;cos&quot;, &quot;cls&quot;]，接口列表上限10个）</p>
     */
    public String [] getEventNames() {
        return this.EventNames;
    }

    /**
     * Set <p>跟踪事件接口名列表（ResourceType为 * 时，EventNames必须为全部：[&quot;*&quot;]；指定ResourceType时，支持全部接口：[&quot;*&quot;]；支持部分接口：[&quot;cos&quot;, &quot;cls&quot;]，接口列表上限10个）</p>
     * @param EventNames <p>跟踪事件接口名列表（ResourceType为 * 时，EventNames必须为全部：[&quot;*&quot;]；指定ResourceType时，支持全部接口：[&quot;*&quot;]；支持部分接口：[&quot;cos&quot;, &quot;cls&quot;]，接口列表上限10个）</p>
     */
    public void setEventNames(String [] EventNames) {
        this.EventNames = EventNames;
    }

    /**
     * Get <p>是否开启将集团成员操作日志投递到集团管理账号或者可信服务管理账号(0：未开启，1：开启，只能集团管理账号或者可信服务管理账号开启此项功能)</p> 
     * @return TrackForAllMembers <p>是否开启将集团成员操作日志投递到集团管理账号或者可信服务管理账号(0：未开启，1：开启，只能集团管理账号或者可信服务管理账号开启此项功能)</p>
     */
    public Long getTrackForAllMembers() {
        return this.TrackForAllMembers;
    }

    /**
     * Set <p>是否开启将集团成员操作日志投递到集团管理账号或者可信服务管理账号(0：未开启，1：开启，只能集团管理账号或者可信服务管理账号开启此项功能)</p>
     * @param TrackForAllMembers <p>是否开启将集团成员操作日志投递到集团管理账号或者可信服务管理账号(0：未开启，1：开启，只能集团管理账号或者可信服务管理账号开启此项功能)</p>
     */
    public void setTrackForAllMembers(Long TrackForAllMembers) {
        this.TrackForAllMembers = TrackForAllMembers;
    }

    /**
     * Get <p>任务ID</p> 
     * @return ExportId <p>任务ID</p>
     */
    public String getExportId() {
        return this.ExportId;
    }

    /**
     * Set <p>任务ID</p>
     * @param ExportId <p>任务ID</p>
     */
    public void setExportId(String ExportId) {
        this.ExportId = ExportId;
    }

    public CreateAuditTrackRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAuditTrackRequest(CreateAuditTrackRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Storage != null) {
            this.Storage = new Storage(source.Storage);
        }
        if (source.ActionType != null) {
            this.ActionType = new String(source.ActionType);
        }
        if (source.ResourceType != null) {
            this.ResourceType = new String(source.ResourceType);
        }
        if (source.EventNames != null) {
            this.EventNames = new String[source.EventNames.length];
            for (int i = 0; i < source.EventNames.length; i++) {
                this.EventNames[i] = new String(source.EventNames[i]);
            }
        }
        if (source.TrackForAllMembers != null) {
            this.TrackForAllMembers = new Long(source.TrackForAllMembers);
        }
        if (source.ExportId != null) {
            this.ExportId = new String(source.ExportId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamObj(map, prefix + "Storage.", this.Storage);
        this.setParamSimple(map, prefix + "ActionType", this.ActionType);
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamArraySimple(map, prefix + "EventNames.", this.EventNames);
        this.setParamSimple(map, prefix + "TrackForAllMembers", this.TrackForAllMembers);
        this.setParamSimple(map, prefix + "ExportId", this.ExportId);

    }
}

