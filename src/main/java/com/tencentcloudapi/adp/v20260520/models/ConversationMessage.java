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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ConversationMessage extends AbstractModel {

    /**
    * <p>会话 ID</p>
    */
    @SerializedName("ConversationId")
    @Expose
    private String ConversationId;

    /**
    * <p>消息图标</p>
    */
    @SerializedName("Icon")
    @Expose
    private String Icon;

    /**
    * <p>消息 ID</p>
    */
    @SerializedName("MessageId")
    @Expose
    private String MessageId;

    /**
    * <p>消息名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>记录 ID</p>
    */
    @SerializedName("RecordId")
    @Expose
    private String RecordId;

    /**
    * <p>消息角色</p>
    */
    @SerializedName("Role")
    @Expose
    private String Role;

    /**
    * <p>消息状态，pending:待执行，processing:处理中，success:已完成，failed:处理失败，stop:已取消</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>状态描述</p>
    */
    @SerializedName("StatusDesc")
    @Expose
    private String StatusDesc;

    /**
    * <p>消息标题</p>
    */
    @SerializedName("Title")
    @Expose
    private String Title;

    /**
    * <p>消息内容列表</p>
    */
    @SerializedName("ContentList")
    @Expose
    private ConversationContent [] ContentList;

    /**
    * <p>消息内容列表</p>
    */
    @SerializedName("Contents")
    @Expose
    private ConversationContent [] Contents;

    /**
    * <p>类型</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get <p>会话 ID</p> 
     * @return ConversationId <p>会话 ID</p>
     */
    public String getConversationId() {
        return this.ConversationId;
    }

    /**
     * Set <p>会话 ID</p>
     * @param ConversationId <p>会话 ID</p>
     */
    public void setConversationId(String ConversationId) {
        this.ConversationId = ConversationId;
    }

    /**
     * Get <p>消息图标</p> 
     * @return Icon <p>消息图标</p>
     */
    public String getIcon() {
        return this.Icon;
    }

    /**
     * Set <p>消息图标</p>
     * @param Icon <p>消息图标</p>
     */
    public void setIcon(String Icon) {
        this.Icon = Icon;
    }

    /**
     * Get <p>消息 ID</p> 
     * @return MessageId <p>消息 ID</p>
     */
    public String getMessageId() {
        return this.MessageId;
    }

    /**
     * Set <p>消息 ID</p>
     * @param MessageId <p>消息 ID</p>
     */
    public void setMessageId(String MessageId) {
        this.MessageId = MessageId;
    }

    /**
     * Get <p>消息名称</p> 
     * @return Name <p>消息名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>消息名称</p>
     * @param Name <p>消息名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>记录 ID</p> 
     * @return RecordId <p>记录 ID</p>
     */
    public String getRecordId() {
        return this.RecordId;
    }

    /**
     * Set <p>记录 ID</p>
     * @param RecordId <p>记录 ID</p>
     */
    public void setRecordId(String RecordId) {
        this.RecordId = RecordId;
    }

    /**
     * Get <p>消息角色</p> 
     * @return Role <p>消息角色</p>
     */
    public String getRole() {
        return this.Role;
    }

    /**
     * Set <p>消息角色</p>
     * @param Role <p>消息角色</p>
     */
    public void setRole(String Role) {
        this.Role = Role;
    }

    /**
     * Get <p>消息状态，pending:待执行，processing:处理中，success:已完成，failed:处理失败，stop:已取消</p> 
     * @return Status <p>消息状态，pending:待执行，processing:处理中，success:已完成，failed:处理失败，stop:已取消</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>消息状态，pending:待执行，processing:处理中，success:已完成，failed:处理失败，stop:已取消</p>
     * @param Status <p>消息状态，pending:待执行，processing:处理中，success:已完成，failed:处理失败，stop:已取消</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>状态描述</p> 
     * @return StatusDesc <p>状态描述</p>
     */
    public String getStatusDesc() {
        return this.StatusDesc;
    }

    /**
     * Set <p>状态描述</p>
     * @param StatusDesc <p>状态描述</p>
     */
    public void setStatusDesc(String StatusDesc) {
        this.StatusDesc = StatusDesc;
    }

    /**
     * Get <p>消息标题</p> 
     * @return Title <p>消息标题</p>
     */
    public String getTitle() {
        return this.Title;
    }

    /**
     * Set <p>消息标题</p>
     * @param Title <p>消息标题</p>
     */
    public void setTitle(String Title) {
        this.Title = Title;
    }

    /**
     * Get <p>消息内容列表</p> 
     * @return ContentList <p>消息内容列表</p>
     */
    public ConversationContent [] getContentList() {
        return this.ContentList;
    }

    /**
     * Set <p>消息内容列表</p>
     * @param ContentList <p>消息内容列表</p>
     */
    public void setContentList(ConversationContent [] ContentList) {
        this.ContentList = ContentList;
    }

    /**
     * Get <p>消息内容列表</p> 
     * @return Contents <p>消息内容列表</p>
     */
    public ConversationContent [] getContents() {
        return this.Contents;
    }

    /**
     * Set <p>消息内容列表</p>
     * @param Contents <p>消息内容列表</p>
     */
    public void setContents(ConversationContent [] Contents) {
        this.Contents = Contents;
    }

    /**
     * Get <p>类型</p> 
     * @return Type <p>类型</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>类型</p>
     * @param Type <p>类型</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    public ConversationMessage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConversationMessage(ConversationMessage source) {
        if (source.ConversationId != null) {
            this.ConversationId = new String(source.ConversationId);
        }
        if (source.Icon != null) {
            this.Icon = new String(source.Icon);
        }
        if (source.MessageId != null) {
            this.MessageId = new String(source.MessageId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.RecordId != null) {
            this.RecordId = new String(source.RecordId);
        }
        if (source.Role != null) {
            this.Role = new String(source.Role);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.StatusDesc != null) {
            this.StatusDesc = new String(source.StatusDesc);
        }
        if (source.Title != null) {
            this.Title = new String(source.Title);
        }
        if (source.ContentList != null) {
            this.ContentList = new ConversationContent[source.ContentList.length];
            for (int i = 0; i < source.ContentList.length; i++) {
                this.ContentList[i] = new ConversationContent(source.ContentList[i]);
            }
        }
        if (source.Contents != null) {
            this.Contents = new ConversationContent[source.Contents.length];
            for (int i = 0; i < source.Contents.length; i++) {
                this.Contents[i] = new ConversationContent(source.Contents[i]);
            }
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ConversationId", this.ConversationId);
        this.setParamSimple(map, prefix + "Icon", this.Icon);
        this.setParamSimple(map, prefix + "MessageId", this.MessageId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "RecordId", this.RecordId);
        this.setParamSimple(map, prefix + "Role", this.Role);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StatusDesc", this.StatusDesc);
        this.setParamSimple(map, prefix + "Title", this.Title);
        this.setParamArrayObj(map, prefix + "ContentList.", this.ContentList);
        this.setParamArrayObj(map, prefix + "Contents.", this.Contents);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

