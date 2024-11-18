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
package com.tencentcloudapi.hunyuan.v20230901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ThreadMessage extends AbstractModel {

    /**
    * 消息 ID
    */
    @SerializedName("ID")
    @Expose
    private String ID;

    /**
    * 对象类型
    */
    @SerializedName("Object")
    @Expose
    private String Object;

    /**
    * 创建时间
    */
    @SerializedName("CreatedAt")
    @Expose
    private Long CreatedAt;

    /**
    * 会话 ID
    */
    @SerializedName("ThreadID")
    @Expose
    private String ThreadID;

    /**
    * 状态，处理中 in_progress，已完成 completed，未完成 incomplete。 
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 未完成原因
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InCompleteDetails")
    @Expose
    private ThreadMessageInCompleteDetailsObject InCompleteDetails;

    /**
    * 完成时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CompletedAt")
    @Expose
    private Long CompletedAt;

    /**
    * 未完成时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InCompleteAt")
    @Expose
    private Long InCompleteAt;

    /**
    * 角色
    */
    @SerializedName("Role")
    @Expose
    private String Role;

    /**
    * 内容
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * 助手 ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AssistantID")
    @Expose
    private String AssistantID;

    /**
    * 运行 ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RunID")
    @Expose
    private String RunID;

    /**
    * 附件
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Attachments")
    @Expose
    private ThreadMessageAttachmentObject [] Attachments;

    /**
     * Get 消息 ID 
     * @return ID 消息 ID
     */
    public String getID() {
        return this.ID;
    }

    /**
     * Set 消息 ID
     * @param ID 消息 ID
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     * Get 对象类型 
     * @return Object 对象类型
     */
    public String getObject() {
        return this.Object;
    }

    /**
     * Set 对象类型
     * @param Object 对象类型
     */
    public void setObject(String Object) {
        this.Object = Object;
    }

    /**
     * Get 创建时间 
     * @return CreatedAt 创建时间
     */
    public Long getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set 创建时间
     * @param CreatedAt 创建时间
     */
    public void setCreatedAt(Long CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get 会话 ID 
     * @return ThreadID 会话 ID
     */
    public String getThreadID() {
        return this.ThreadID;
    }

    /**
     * Set 会话 ID
     * @param ThreadID 会话 ID
     */
    public void setThreadID(String ThreadID) {
        this.ThreadID = ThreadID;
    }

    /**
     * Get 状态，处理中 in_progress，已完成 completed，未完成 incomplete。  
     * @return Status 状态，处理中 in_progress，已完成 completed，未完成 incomplete。 
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 状态，处理中 in_progress，已完成 completed，未完成 incomplete。 
     * @param Status 状态，处理中 in_progress，已完成 completed，未完成 incomplete。 
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 未完成原因
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InCompleteDetails 未完成原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ThreadMessageInCompleteDetailsObject getInCompleteDetails() {
        return this.InCompleteDetails;
    }

    /**
     * Set 未完成原因
注意：此字段可能返回 null，表示取不到有效值。
     * @param InCompleteDetails 未完成原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInCompleteDetails(ThreadMessageInCompleteDetailsObject InCompleteDetails) {
        this.InCompleteDetails = InCompleteDetails;
    }

    /**
     * Get 完成时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CompletedAt 完成时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCompletedAt() {
        return this.CompletedAt;
    }

    /**
     * Set 完成时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CompletedAt 完成时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCompletedAt(Long CompletedAt) {
        this.CompletedAt = CompletedAt;
    }

    /**
     * Get 未完成时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InCompleteAt 未完成时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getInCompleteAt() {
        return this.InCompleteAt;
    }

    /**
     * Set 未完成时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param InCompleteAt 未完成时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInCompleteAt(Long InCompleteAt) {
        this.InCompleteAt = InCompleteAt;
    }

    /**
     * Get 角色 
     * @return Role 角色
     */
    public String getRole() {
        return this.Role;
    }

    /**
     * Set 角色
     * @param Role 角色
     */
    public void setRole(String Role) {
        this.Role = Role;
    }

    /**
     * Get 内容 
     * @return Content 内容
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set 内容
     * @param Content 内容
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get 助手 ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AssistantID 助手 ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAssistantID() {
        return this.AssistantID;
    }

    /**
     * Set 助手 ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param AssistantID 助手 ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAssistantID(String AssistantID) {
        this.AssistantID = AssistantID;
    }

    /**
     * Get 运行 ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RunID 运行 ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRunID() {
        return this.RunID;
    }

    /**
     * Set 运行 ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param RunID 运行 ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRunID(String RunID) {
        this.RunID = RunID;
    }

    /**
     * Get 附件
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Attachments 附件
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ThreadMessageAttachmentObject [] getAttachments() {
        return this.Attachments;
    }

    /**
     * Set 附件
注意：此字段可能返回 null，表示取不到有效值。
     * @param Attachments 附件
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAttachments(ThreadMessageAttachmentObject [] Attachments) {
        this.Attachments = Attachments;
    }

    public ThreadMessage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ThreadMessage(ThreadMessage source) {
        if (source.ID != null) {
            this.ID = new String(source.ID);
        }
        if (source.Object != null) {
            this.Object = new String(source.Object);
        }
        if (source.CreatedAt != null) {
            this.CreatedAt = new Long(source.CreatedAt);
        }
        if (source.ThreadID != null) {
            this.ThreadID = new String(source.ThreadID);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.InCompleteDetails != null) {
            this.InCompleteDetails = new ThreadMessageInCompleteDetailsObject(source.InCompleteDetails);
        }
        if (source.CompletedAt != null) {
            this.CompletedAt = new Long(source.CompletedAt);
        }
        if (source.InCompleteAt != null) {
            this.InCompleteAt = new Long(source.InCompleteAt);
        }
        if (source.Role != null) {
            this.Role = new String(source.Role);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.AssistantID != null) {
            this.AssistantID = new String(source.AssistantID);
        }
        if (source.RunID != null) {
            this.RunID = new String(source.RunID);
        }
        if (source.Attachments != null) {
            this.Attachments = new ThreadMessageAttachmentObject[source.Attachments.length];
            for (int i = 0; i < source.Attachments.length; i++) {
                this.Attachments[i] = new ThreadMessageAttachmentObject(source.Attachments[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "Object", this.Object);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamSimple(map, prefix + "ThreadID", this.ThreadID);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamObj(map, prefix + "InCompleteDetails.", this.InCompleteDetails);
        this.setParamSimple(map, prefix + "CompletedAt", this.CompletedAt);
        this.setParamSimple(map, prefix + "InCompleteAt", this.InCompleteAt);
        this.setParamSimple(map, prefix + "Role", this.Role);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "AssistantID", this.AssistantID);
        this.setParamSimple(map, prefix + "RunID", this.RunID);
        this.setParamArrayObj(map, prefix + "Attachments.", this.Attachments);

    }
}

