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
package com.tencentcloudapi.rce.v20260130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Chat extends AbstractModel {

    /**
    * <p>聊天文本内容，不含HTML、不含昵称，限2000字符</p>
    */
    @SerializedName("ChatText")
    @Expose
    private String ChatText;

    /**
    * <p>频道类型，枚举值：world-世界 / guild-公会 / single-单聊 / other-其他</p>
    */
    @SerializedName("ChannelType")
    @Expose
    private String ChannelType;

    /**
    * <p>群/频道唯一ID（单聊时为空）</p>
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * <p>群/频道名称</p>
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * <p>群主/管理员ID</p>
    */
    @SerializedName("GroupAdministrator")
    @Expose
    private String GroupAdministrator;

    /**
     * Get <p>聊天文本内容，不含HTML、不含昵称，限2000字符</p> 
     * @return ChatText <p>聊天文本内容，不含HTML、不含昵称，限2000字符</p>
     */
    public String getChatText() {
        return this.ChatText;
    }

    /**
     * Set <p>聊天文本内容，不含HTML、不含昵称，限2000字符</p>
     * @param ChatText <p>聊天文本内容，不含HTML、不含昵称，限2000字符</p>
     */
    public void setChatText(String ChatText) {
        this.ChatText = ChatText;
    }

    /**
     * Get <p>频道类型，枚举值：world-世界 / guild-公会 / single-单聊 / other-其他</p> 
     * @return ChannelType <p>频道类型，枚举值：world-世界 / guild-公会 / single-单聊 / other-其他</p>
     */
    public String getChannelType() {
        return this.ChannelType;
    }

    /**
     * Set <p>频道类型，枚举值：world-世界 / guild-公会 / single-单聊 / other-其他</p>
     * @param ChannelType <p>频道类型，枚举值：world-世界 / guild-公会 / single-单聊 / other-其他</p>
     */
    public void setChannelType(String ChannelType) {
        this.ChannelType = ChannelType;
    }

    /**
     * Get <p>群/频道唯一ID（单聊时为空）</p> 
     * @return GroupId <p>群/频道唯一ID（单聊时为空）</p>
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set <p>群/频道唯一ID（单聊时为空）</p>
     * @param GroupId <p>群/频道唯一ID（单聊时为空）</p>
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get <p>群/频道名称</p> 
     * @return GroupName <p>群/频道名称</p>
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set <p>群/频道名称</p>
     * @param GroupName <p>群/频道名称</p>
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get <p>群主/管理员ID</p> 
     * @return GroupAdministrator <p>群主/管理员ID</p>
     */
    public String getGroupAdministrator() {
        return this.GroupAdministrator;
    }

    /**
     * Set <p>群主/管理员ID</p>
     * @param GroupAdministrator <p>群主/管理员ID</p>
     */
    public void setGroupAdministrator(String GroupAdministrator) {
        this.GroupAdministrator = GroupAdministrator;
    }

    public Chat() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Chat(Chat source) {
        if (source.ChatText != null) {
            this.ChatText = new String(source.ChatText);
        }
        if (source.ChannelType != null) {
            this.ChannelType = new String(source.ChannelType);
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.GroupAdministrator != null) {
            this.GroupAdministrator = new String(source.GroupAdministrator);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ChatText", this.ChatText);
        this.setParamSimple(map, prefix + "ChannelType", this.ChannelType);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "GroupAdministrator", this.GroupAdministrator);

    }
}

