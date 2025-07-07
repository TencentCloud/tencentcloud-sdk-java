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
package com.tencentcloudapi.hunyuan.v20230901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TranslationDelta extends AbstractModel {

    /**
    * 角色名称。
    */
    @SerializedName("Role")
    @Expose
    private String Role;

    /**
    * 内容详情。
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
     * Get 角色名称。 
     * @return Role 角色名称。
     */
    public String getRole() {
        return this.Role;
    }

    /**
     * Set 角色名称。
     * @param Role 角色名称。
     */
    public void setRole(String Role) {
        this.Role = Role;
    }

    /**
     * Get 内容详情。 
     * @return Content 内容详情。
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set 内容详情。
     * @param Content 内容详情。
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    public TranslationDelta() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TranslationDelta(TranslationDelta source) {
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

