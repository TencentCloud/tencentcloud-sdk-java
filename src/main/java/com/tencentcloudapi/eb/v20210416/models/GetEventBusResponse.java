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
    * <p>更新时间</p>
    */
    @SerializedName("ModTime")
    @Expose
    private String ModTime;

    /**
    * <p>事件集描述</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>日志主题ID</p>
    */
    @SerializedName("ClsTopicId")
    @Expose
    private String ClsTopicId;

    /**
    * <p>创建时间</p>
    */
    @SerializedName("AddTime")
    @Expose
    private String AddTime;

    /**
    * <p>日志集ID</p>
    */
    @SerializedName("ClsLogsetId")
    @Expose
    private String ClsLogsetId;

    /**
    * <p>事件集名称</p>
    */
    @SerializedName("EventBusName")
    @Expose
    private String EventBusName;

    /**
    * <p>事件集ID</p>
    */
    @SerializedName("EventBusId")
    @Expose
    private String EventBusId;

    /**
    * <p>事件集类型</p><p>枚举值：</p><ul><li>Cloud： 云服务事件集</li><li>Platform： 平台事件集</li><li>Custom： 自定义事件集</li></ul>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>计费模式</p>
    */
    @SerializedName("PayMode")
    @Expose
    private String PayMode;

    /**
    * <p>EB日志存储时长</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SaveDays")
    @Expose
    private Long SaveDays;

    /**
    * <p>EB日志主题ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LogTopicId")
    @Expose
    private String LogTopicId;

    /**
    * <p>是否开启存储</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EnableStore")
    @Expose
    private Boolean EnableStore;

    /**
    * <p>消息序列，是否有序</p>
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
     * Get <p>更新时间</p> 
     * @return ModTime <p>更新时间</p>
     */
    public String getModTime() {
        return this.ModTime;
    }

    /**
     * Set <p>更新时间</p>
     * @param ModTime <p>更新时间</p>
     */
    public void setModTime(String ModTime) {
        this.ModTime = ModTime;
    }

    /**
     * Get <p>事件集描述</p> 
     * @return Description <p>事件集描述</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>事件集描述</p>
     * @param Description <p>事件集描述</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>日志主题ID</p> 
     * @return ClsTopicId <p>日志主题ID</p>
     */
    public String getClsTopicId() {
        return this.ClsTopicId;
    }

    /**
     * Set <p>日志主题ID</p>
     * @param ClsTopicId <p>日志主题ID</p>
     */
    public void setClsTopicId(String ClsTopicId) {
        this.ClsTopicId = ClsTopicId;
    }

    /**
     * Get <p>创建时间</p> 
     * @return AddTime <p>创建时间</p>
     */
    public String getAddTime() {
        return this.AddTime;
    }

    /**
     * Set <p>创建时间</p>
     * @param AddTime <p>创建时间</p>
     */
    public void setAddTime(String AddTime) {
        this.AddTime = AddTime;
    }

    /**
     * Get <p>日志集ID</p> 
     * @return ClsLogsetId <p>日志集ID</p>
     */
    public String getClsLogsetId() {
        return this.ClsLogsetId;
    }

    /**
     * Set <p>日志集ID</p>
     * @param ClsLogsetId <p>日志集ID</p>
     */
    public void setClsLogsetId(String ClsLogsetId) {
        this.ClsLogsetId = ClsLogsetId;
    }

    /**
     * Get <p>事件集名称</p> 
     * @return EventBusName <p>事件集名称</p>
     */
    public String getEventBusName() {
        return this.EventBusName;
    }

    /**
     * Set <p>事件集名称</p>
     * @param EventBusName <p>事件集名称</p>
     */
    public void setEventBusName(String EventBusName) {
        this.EventBusName = EventBusName;
    }

    /**
     * Get <p>事件集ID</p> 
     * @return EventBusId <p>事件集ID</p>
     */
    public String getEventBusId() {
        return this.EventBusId;
    }

    /**
     * Set <p>事件集ID</p>
     * @param EventBusId <p>事件集ID</p>
     */
    public void setEventBusId(String EventBusId) {
        this.EventBusId = EventBusId;
    }

    /**
     * Get <p>事件集类型</p><p>枚举值：</p><ul><li>Cloud： 云服务事件集</li><li>Platform： 平台事件集</li><li>Custom： 自定义事件集</li></ul> 
     * @return Type <p>事件集类型</p><p>枚举值：</p><ul><li>Cloud： 云服务事件集</li><li>Platform： 平台事件集</li><li>Custom： 自定义事件集</li></ul>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>事件集类型</p><p>枚举值：</p><ul><li>Cloud： 云服务事件集</li><li>Platform： 平台事件集</li><li>Custom： 自定义事件集</li></ul>
     * @param Type <p>事件集类型</p><p>枚举值：</p><ul><li>Cloud： 云服务事件集</li><li>Platform： 平台事件集</li><li>Custom： 自定义事件集</li></ul>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>计费模式</p> 
     * @return PayMode <p>计费模式</p>
     */
    public String getPayMode() {
        return this.PayMode;
    }

    /**
     * Set <p>计费模式</p>
     * @param PayMode <p>计费模式</p>
     */
    public void setPayMode(String PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get <p>EB日志存储时长</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SaveDays <p>EB日志存储时长</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSaveDays() {
        return this.SaveDays;
    }

    /**
     * Set <p>EB日志存储时长</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SaveDays <p>EB日志存储时长</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSaveDays(Long SaveDays) {
        this.SaveDays = SaveDays;
    }

    /**
     * Get <p>EB日志主题ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LogTopicId <p>EB日志主题ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLogTopicId() {
        return this.LogTopicId;
    }

    /**
     * Set <p>EB日志主题ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param LogTopicId <p>EB日志主题ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLogTopicId(String LogTopicId) {
        this.LogTopicId = LogTopicId;
    }

    /**
     * Get <p>是否开启存储</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EnableStore <p>是否开启存储</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getEnableStore() {
        return this.EnableStore;
    }

    /**
     * Set <p>是否开启存储</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param EnableStore <p>是否开启存储</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnableStore(Boolean EnableStore) {
        this.EnableStore = EnableStore;
    }

    /**
     * Get <p>消息序列，是否有序</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LinkMode <p>消息序列，是否有序</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLinkMode() {
        return this.LinkMode;
    }

    /**
     * Set <p>消息序列，是否有序</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param LinkMode <p>消息序列，是否有序</p>
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

