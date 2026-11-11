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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModelChatMessageItem extends AbstractModel {

    /**
    * <p>角色</p><p>枚举值：</p><ul><li>system： 系统消息</li><li>user： 用户消息</li><li>assistant： 模型消息</li></ul>
    */
    @SerializedName("Role")
    @Expose
    private String Role;

    /**
    * <p>输入内容</p>
    */
    @SerializedName("Content")
    @Expose
    private ModelChatContentPart [] Content;

    /**
     * Get <p>角色</p><p>枚举值：</p><ul><li>system： 系统消息</li><li>user： 用户消息</li><li>assistant： 模型消息</li></ul> 
     * @return Role <p>角色</p><p>枚举值：</p><ul><li>system： 系统消息</li><li>user： 用户消息</li><li>assistant： 模型消息</li></ul>
     */
    public String getRole() {
        return this.Role;
    }

    /**
     * Set <p>角色</p><p>枚举值：</p><ul><li>system： 系统消息</li><li>user： 用户消息</li><li>assistant： 模型消息</li></ul>
     * @param Role <p>角色</p><p>枚举值：</p><ul><li>system： 系统消息</li><li>user： 用户消息</li><li>assistant： 模型消息</li></ul>
     */
    public void setRole(String Role) {
        this.Role = Role;
    }

    /**
     * Get <p>输入内容</p> 
     * @return Content <p>输入内容</p>
     */
    public ModelChatContentPart [] getContent() {
        return this.Content;
    }

    /**
     * Set <p>输入内容</p>
     * @param Content <p>输入内容</p>
     */
    public void setContent(ModelChatContentPart [] Content) {
        this.Content = Content;
    }

    public ModelChatMessageItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModelChatMessageItem(ModelChatMessageItem source) {
        if (source.Role != null) {
            this.Role = new String(source.Role);
        }
        if (source.Content != null) {
            this.Content = new ModelChatContentPart[source.Content.length];
            for (int i = 0; i < source.Content.length; i++) {
                this.Content[i] = new ModelChatContentPart(source.Content[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Role", this.Role);
        this.setParamArrayObj(map, prefix + "Content.", this.Content);

    }
}

