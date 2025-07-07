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
package com.tencentcloudapi.eb.v20210416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetEventBusResponse extends AbstractModel {

    /**
    * 更新时间
    */
    @SerializedName("ModTime")
    @Expose
    private String ModTime;

    /**
    * 事件集描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 日志主题ID
    */
    @SerializedName("ClsTopicId")
    @Expose
    private String ClsTopicId;

    /**
    * 创建时间
    */
    @SerializedName("AddTime")
    @Expose
    private String AddTime;

    /**
    * 日志集ID
    */
    @SerializedName("ClsLogsetId")
    @Expose
    private String ClsLogsetId;

    /**
    * 事件集名称
    */
    @SerializedName("EventBusName")
    @Expose
    private String EventBusName;

    /**
    * 事件集ID
    */
    @SerializedName("EventBusId")
    @Expose
    private String EventBusId;

    /**
    * （已废弃）事件集类型
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 计费模式
    */
    @SerializedName("PayMode")
    @Expose
    private String PayMode;

    /**
    * EB日志存储时长
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SaveDays")
    @Expose
    private Long SaveDays;

    /**
    * EB日志主题ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LogTopicId")
    @Expose
    private String LogTopicId;

    /**
    * 是否开启存储
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EnableStore")
    @Expose
    private Boolean EnableStore;

    /**
    * 消息序列，是否有序
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LinkMode")
    @Expose
    private String LinkMode;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 更新时间 
     * @return ModTime 更新时间
     */
    public String getModTime() {
        return this.ModTime;
    }

    /**
     * Set 更新时间
     * @param ModTime 更新时间
     */
    public void setModTime(String ModTime) {
        this.ModTime = ModTime;
    }

    /**
     * Get 事件集描述 
     * @return Description 事件集描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 事件集描述
     * @param Description 事件集描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 日志主题ID 
     * @return ClsTopicId 日志主题ID
     */
    public String getClsTopicId() {
        return this.ClsTopicId;
    }

    /**
     * Set 日志主题ID
     * @param ClsTopicId 日志主题ID
     */
    public void setClsTopicId(String ClsTopicId) {
        this.ClsTopicId = ClsTopicId;
    }

    /**
     * Get 创建时间 
     * @return AddTime 创建时间
     */
    public String getAddTime() {
        return this.AddTime;
    }

    /**
     * Set 创建时间
     * @param AddTime 创建时间
     */
    public void setAddTime(String AddTime) {
        this.AddTime = AddTime;
    }

    /**
     * Get 日志集ID 
     * @return ClsLogsetId 日志集ID
     */
    public String getClsLogsetId() {
        return this.ClsLogsetId;
    }

    /**
     * Set 日志集ID
     * @param ClsLogsetId 日志集ID
     */
    public void setClsLogsetId(String ClsLogsetId) {
        this.ClsLogsetId = ClsLogsetId;
    }

    /**
     * Get 事件集名称 
     * @return EventBusName 事件集名称
     */
    public String getEventBusName() {
        return this.EventBusName;
    }

    /**
     * Set 事件集名称
     * @param EventBusName 事件集名称
     */
    public void setEventBusName(String EventBusName) {
        this.EventBusName = EventBusName;
    }

    /**
     * Get 事件集ID 
     * @return EventBusId 事件集ID
     */
    public String getEventBusId() {
        return this.EventBusId;
    }

    /**
     * Set 事件集ID
     * @param EventBusId 事件集ID
     */
    public void setEventBusId(String EventBusId) {
        this.EventBusId = EventBusId;
    }

    /**
     * Get （已废弃）事件集类型 
     * @return Type （已废弃）事件集类型
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set （已废弃）事件集类型
     * @param Type （已废弃）事件集类型
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 计费模式 
     * @return PayMode 计费模式
     */
    public String getPayMode() {
        return this.PayMode;
    }

    /**
     * Set 计费模式
     * @param PayMode 计费模式
     */
    public void setPayMode(String PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get EB日志存储时长
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SaveDays EB日志存储时长
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSaveDays() {
        return this.SaveDays;
    }

    /**
     * Set EB日志存储时长
注意：此字段可能返回 null，表示取不到有效值。
     * @param SaveDays EB日志存储时长
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSaveDays(Long SaveDays) {
        this.SaveDays = SaveDays;
    }

    /**
     * Get EB日志主题ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LogTopicId EB日志主题ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLogTopicId() {
        return this.LogTopicId;
    }

    /**
     * Set EB日志主题ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param LogTopicId EB日志主题ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLogTopicId(String LogTopicId) {
        this.LogTopicId = LogTopicId;
    }

    /**
     * Get 是否开启存储
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EnableStore 是否开启存储
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getEnableStore() {
        return this.EnableStore;
    }

    /**
     * Set 是否开启存储
注意：此字段可能返回 null，表示取不到有效值。
     * @param EnableStore 是否开启存储
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnableStore(Boolean EnableStore) {
        this.EnableStore = EnableStore;
    }

    /**
     * Get 消息序列，是否有序
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LinkMode 消息序列，是否有序
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLinkMode() {
        return this.LinkMode;
    }

    /**
     * Set 消息序列，是否有序
注意：此字段可能返回 null，表示取不到有效值。
     * @param LinkMode 消息序列，是否有序
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLinkMode(String LinkMode) {
        this.LinkMode = LinkMode;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public GetEventBusResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetEventBusResponse(GetEventBusResponse source) {
        if (source.ModTime != null) {
            this.ModTime = new String(source.ModTime);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.ClsTopicId != null) {
            this.ClsTopicId = new String(source.ClsTopicId);
        }
        if (source.AddTime != null) {
            this.AddTime = new String(source.AddTime);
        }
        if (source.ClsLogsetId != null) {
            this.ClsLogsetId = new String(source.ClsLogsetId);
        }
        if (source.EventBusName != null) {
            this.EventBusName = new String(source.EventBusName);
        }
        if (source.EventBusId != null) {
            this.EventBusId = new String(source.EventBusId);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.PayMode != null) {
            this.PayMode = new String(source.PayMode);
        }
        if (source.SaveDays != null) {
            this.SaveDays = new Long(source.SaveDays);
        }
        if (source.LogTopicId != null) {
            this.LogTopicId = new String(source.LogTopicId);
        }
        if (source.EnableStore != null) {
            this.EnableStore = new Boolean(source.EnableStore);
        }
        if (source.LinkMode != null) {
            this.LinkMode = new String(source.LinkMode);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ModTime", this.ModTime);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "ClsTopicId", this.ClsTopicId);
        this.setParamSimple(map, prefix + "AddTime", this.AddTime);
        this.setParamSimple(map, prefix + "ClsLogsetId", this.ClsLogsetId);
        this.setParamSimple(map, prefix + "EventBusName", this.EventBusName);
        this.setParamSimple(map, prefix + "EventBusId", this.EventBusId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "SaveDays", this.SaveDays);
        this.setParamSimple(map, prefix + "LogTopicId", this.LogTopicId);
        this.setParamSimple(map, prefix + "EnableStore", this.EnableStore);
        this.setParamSimple(map, prefix + "LinkMode", this.LinkMode);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

