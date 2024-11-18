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

public class ThreadAdditionalMessage extends AbstractModel {

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
    * 附件
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Attachments")
    @Expose
    private ThreadMessageAttachmentObject [] Attachments;

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

    public ThreadAdditionalMessage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ThreadAdditionalMessage(ThreadAdditionalMessage source) {
        if (source.Role != null) {
            this.Role = new String(source.Role);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
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
        this.setParamSimple(map, prefix + "Role", this.Role);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamArrayObj(map, prefix + "Attachments.", this.Attachments);

    }
}

