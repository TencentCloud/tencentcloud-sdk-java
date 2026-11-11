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

public class ModelChatResponseMessage extends AbstractModel {

    /**
    * <p>角色标识</p><p>枚举值：</p><ul><li>assistant： 模型消息</li><li>user： 用户消息</li><li>system： 系统消息</li></ul>
    */
    @SerializedName("Role")
    @Expose
    private String Role;

    /**
    * <p>模型生成的识别文本</p>
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
     * Get <p>角色标识</p><p>枚举值：</p><ul><li>assistant： 模型消息</li><li>user： 用户消息</li><li>system： 系统消息</li></ul> 
     * @return Role <p>角色标识</p><p>枚举值：</p><ul><li>assistant： 模型消息</li><li>user： 用户消息</li><li>system： 系统消息</li></ul>
     */
    public String getRole() {
        return this.Role;
    }

    /**
     * Set <p>角色标识</p><p>枚举值：</p><ul><li>assistant： 模型消息</li><li>user： 用户消息</li><li>system： 系统消息</li></ul>
     * @param Role <p>角色标识</p><p>枚举值：</p><ul><li>assistant： 模型消息</li><li>user： 用户消息</li><li>system： 系统消息</li></ul>
     */
    public void setRole(String Role) {
        this.Role = Role;
    }

    /**
     * Get <p>模型生成的识别文本</p> 
     * @return Content <p>模型生成的识别文本</p>
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set <p>模型生成的识别文本</p>
     * @param Content <p>模型生成的识别文本</p>
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    public ModelChatResponseMessage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModelChatResponseMessage(ModelChatResponseMessage source) {
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

