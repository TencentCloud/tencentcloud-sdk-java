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
package com.tencentcloudapi.monitor.v20230616.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MessageInfo extends AbstractModel {

    /**
    * <p>实体id</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EntryId")
    @Expose
    private String EntryId;

    /**
    * <p>会话 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * <p>角色: user / assistant</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Role")
    @Expose
    private String Role;

    /**
    * <p>消息内容</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * <p>状态</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>块内容</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ContentBlocks")
    @Expose
    private ContentBlockInfo [] ContentBlocks;

    /**
     * Get <p>实体id</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EntryId <p>实体id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEntryId() {
        return this.EntryId;
    }

    /**
     * Set <p>实体id</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param EntryId <p>实体id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEntryId(String EntryId) {
        this.EntryId = EntryId;
    }

    /**
     * Get <p>会话 ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SessionId <p>会话 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set <p>会话 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SessionId <p>会话 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get <p>角色: user / assistant</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Role <p>角色: user / assistant</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRole() {
        return this.Role;
    }

    /**
     * Set <p>角色: user / assistant</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Role <p>角色: user / assistant</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRole(String Role) {
        this.Role = Role;
    }

    /**
     * Get <p>消息内容</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Content <p>消息内容</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set <p>消息内容</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Content <p>消息内容</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get <p>状态</p> 
     * @return Status <p>状态</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>状态</p>
     * @param Status <p>状态</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>块内容</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ContentBlocks <p>块内容</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ContentBlockInfo [] getContentBlocks() {
        return this.ContentBlocks;
    }

    /**
     * Set <p>块内容</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ContentBlocks <p>块内容</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContentBlocks(ContentBlockInfo [] ContentBlocks) {
        this.ContentBlocks = ContentBlocks;
    }

    public MessageInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MessageInfo(MessageInfo source) {
        if (source.EntryId != null) {
            this.EntryId = new String(source.EntryId);
        }
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.Role != null) {
            this.Role = new String(source.Role);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ContentBlocks != null) {
            this.ContentBlocks = new ContentBlockInfo[source.ContentBlocks.length];
            for (int i = 0; i < source.ContentBlocks.length; i++) {
                this.ContentBlocks[i] = new ContentBlockInfo(source.ContentBlocks[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EntryId", this.EntryId);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "Role", this.Role);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArrayObj(map, prefix + "ContentBlocks.", this.ContentBlocks);

    }
}

