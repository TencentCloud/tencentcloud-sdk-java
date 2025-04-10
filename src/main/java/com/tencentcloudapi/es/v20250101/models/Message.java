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
package com.tencentcloudapi.es.v20250101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Message extends AbstractModel {

    /**
    * 角色, ‘system', ‘user'，'assistant'或者'tool', 在message中, 除了system，其他必须是user与assistant交替(一问一答) 
    */
    @SerializedName("Role")
    @Expose
    private String Role;

    /**
    * 具体文本内容
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
     * Get 角色, ‘system', ‘user'，'assistant'或者'tool', 在message中, 除了system，其他必须是user与assistant交替(一问一答)  
     * @return Role 角色, ‘system', ‘user'，'assistant'或者'tool', 在message中, 除了system，其他必须是user与assistant交替(一问一答) 
     */
    public String getRole() {
        return this.Role;
    }

    /**
     * Set 角色, ‘system', ‘user'，'assistant'或者'tool', 在message中, 除了system，其他必须是user与assistant交替(一问一答) 
     * @param Role 角色, ‘system', ‘user'，'assistant'或者'tool', 在message中, 除了system，其他必须是user与assistant交替(一问一答) 
     */
    public void setRole(String Role) {
        this.Role = Role;
    }

    /**
     * Get 具体文本内容 
     * @return Content 具体文本内容
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set 具体文本内容
     * @param Content 具体文本内容
     */
    public void setContent(String Content) {
        this.Content = Content;
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Role", this.Role);
        this.setParamSimple(map, prefix + "Content", this.Content);

    }
}

