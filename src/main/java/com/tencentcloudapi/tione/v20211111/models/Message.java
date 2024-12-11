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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Message extends AbstractModel {

    /**
    * 角色名。支持三个角色：system、user、assistant，其中system仅开头可出现一次，也可忽略。
    */
    @SerializedName("Role")
    @Expose
    private String Role;

    /**
    * 对话输入内容。
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * 多模态对话输入内容，Content与MultiModalContents两者只需要填写其中一个即可，当对话中包含多模态对话信息时，则填写本参数
    */
    @SerializedName("MultiModalContents")
    @Expose
    private MultiModalContent [] MultiModalContents;

    /**
     * Get 角色名。支持三个角色：system、user、assistant，其中system仅开头可出现一次，也可忽略。 
     * @return Role 角色名。支持三个角色：system、user、assistant，其中system仅开头可出现一次，也可忽略。
     */
    public String getRole() {
        return this.Role;
    }

    /**
     * Set 角色名。支持三个角色：system、user、assistant，其中system仅开头可出现一次，也可忽略。
     * @param Role 角色名。支持三个角色：system、user、assistant，其中system仅开头可出现一次，也可忽略。
     */
    public void setRole(String Role) {
        this.Role = Role;
    }

    /**
     * Get 对话输入内容。 
     * @return Content 对话输入内容。
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set 对话输入内容。
     * @param Content 对话输入内容。
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get 多模态对话输入内容，Content与MultiModalContents两者只需要填写其中一个即可，当对话中包含多模态对话信息时，则填写本参数 
     * @return MultiModalContents 多模态对话输入内容，Content与MultiModalContents两者只需要填写其中一个即可，当对话中包含多模态对话信息时，则填写本参数
     */
    public MultiModalContent [] getMultiModalContents() {
        return this.MultiModalContents;
    }

    /**
     * Set 多模态对话输入内容，Content与MultiModalContents两者只需要填写其中一个即可，当对话中包含多模态对话信息时，则填写本参数
     * @param MultiModalContents 多模态对话输入内容，Content与MultiModalContents两者只需要填写其中一个即可，当对话中包含多模态对话信息时，则填写本参数
     */
    public void setMultiModalContents(MultiModalContent [] MultiModalContents) {
        this.MultiModalContents = MultiModalContents;
    }

    public Message() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Message(Message source) {
        if (source.Role != null) {
            this.Role = new String(source.Role);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.MultiModalContents != null) {
            this.MultiModalContents = new MultiModalContent[source.MultiModalContents.length];
            for (int i = 0; i < source.MultiModalContents.length; i++) {
                this.MultiModalContents[i] = new MultiModalContent(source.MultiModalContents[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Role", this.Role);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamArrayObj(map, prefix + "MultiModalContents.", this.MultiModalContents);

    }
}

