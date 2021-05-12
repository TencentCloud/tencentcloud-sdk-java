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
package com.tencentcloudapi.asw.v20200722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExecutionEvent extends AbstractModel{

    /**
    * 执行资源名
    */
    @SerializedName("ExecutionResourceName")
    @Expose
    private String ExecutionResourceName;

    /**
    * 自增序号
    */
    @SerializedName("EventId")
    @Expose
    private Long EventId;

    /**
    * 事件类型
    */
    @SerializedName("EventCategory")
    @Expose
    private String EventCategory;

    /**
    * 步骤节点名称
    */
    @SerializedName("StepName")
    @Expose
    private String StepName;

    /**
    * 该步骤引用的资源名
    */
    @SerializedName("ResourceName")
    @Expose
    private String ResourceName;

    /**
    * 该事件发生时间，毫秒
    */
    @SerializedName("Timestamp")
    @Expose
    private String Timestamp;

    /**
    * 事件内容
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * 异常信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Exception")
    @Expose
    private String Exception;

    /**
     * Get 执行资源名 
     * @return ExecutionResourceName 执行资源名
     */
    public String getExecutionResourceName() {
        return this.ExecutionResourceName;
    }

    /**
     * Set 执行资源名
     * @param ExecutionResourceName 执行资源名
     */
    public void setExecutionResourceName(String ExecutionResourceName) {
        this.ExecutionResourceName = ExecutionResourceName;
    }

    /**
     * Get 自增序号 
     * @return EventId 自增序号
     */
    public Long getEventId() {
        return this.EventId;
    }

    /**
     * Set 自增序号
     * @param EventId 自增序号
     */
    public void setEventId(Long EventId) {
        this.EventId = EventId;
    }

    /**
     * Get 事件类型 
     * @return EventCategory 事件类型
     */
    public String getEventCategory() {
        return this.EventCategory;
    }

    /**
     * Set 事件类型
     * @param EventCategory 事件类型
     */
    public void setEventCategory(String EventCategory) {
        this.EventCategory = EventCategory;
    }

    /**
     * Get 步骤节点名称 
     * @return StepName 步骤节点名称
     */
    public String getStepName() {
        return this.StepName;
    }

    /**
     * Set 步骤节点名称
     * @param StepName 步骤节点名称
     */
    public void setStepName(String StepName) {
        this.StepName = StepName;
    }

    /**
     * Get 该步骤引用的资源名 
     * @return ResourceName 该步骤引用的资源名
     */
    public String getResourceName() {
        return this.ResourceName;
    }

    /**
     * Set 该步骤引用的资源名
     * @param ResourceName 该步骤引用的资源名
     */
    public void setResourceName(String ResourceName) {
        this.ResourceName = ResourceName;
    }

    /**
     * Get 该事件发生时间，毫秒 
     * @return Timestamp 该事件发生时间，毫秒
     */
    public String getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set 该事件发生时间，毫秒
     * @param Timestamp 该事件发生时间，毫秒
     */
    public void setTimestamp(String Timestamp) {
        this.Timestamp = Timestamp;
    }

    /**
     * Get 事件内容 
     * @return Content 事件内容
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set 事件内容
     * @param Content 事件内容
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get 异常信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Exception 异常信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getException() {
        return this.Exception;
    }

    /**
     * Set 异常信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Exception 异常信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setException(String Exception) {
        this.Exception = Exception;
    }

    public ExecutionEvent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExecutionEvent(ExecutionEvent source) {
        if (source.ExecutionResourceName != null) {
            this.ExecutionResourceName = new String(source.ExecutionResourceName);
        }
        if (source.EventId != null) {
            this.EventId = new Long(source.EventId);
        }
        if (source.EventCategory != null) {
            this.EventCategory = new String(source.EventCategory);
        }
        if (source.StepName != null) {
            this.StepName = new String(source.StepName);
        }
        if (source.ResourceName != null) {
            this.ResourceName = new String(source.ResourceName);
        }
        if (source.Timestamp != null) {
            this.Timestamp = new String(source.Timestamp);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.Exception != null) {
            this.Exception = new String(source.Exception);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ExecutionResourceName", this.ExecutionResourceName);
        this.setParamSimple(map, prefix + "EventId", this.EventId);
        this.setParamSimple(map, prefix + "EventCategory", this.EventCategory);
        this.setParamSimple(map, prefix + "StepName", this.StepName);
        this.setParamSimple(map, prefix + "ResourceName", this.ResourceName);
        this.setParamSimple(map, prefix + "Timestamp", this.Timestamp);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "Exception", this.Exception);

    }
}

