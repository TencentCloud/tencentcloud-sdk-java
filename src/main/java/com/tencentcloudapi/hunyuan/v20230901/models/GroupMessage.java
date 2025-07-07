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

public class GroupMessage extends AbstractModel {

    /**
    * 角色，可选值包括 system、user、assistant、 tool。
    */
    @SerializedName("Role")
    @Expose
    private String Role;

    /**
    * 文本内容
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * 角色名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
     * Get 角色，可选值包括 system、user、assistant、 tool。 
     * @return Role 角色，可选值包括 system、user、assistant、 tool。
     */
    public String getRole() {
        return this.Role;
    }

    /**
     * Set 角色，可选值包括 system、user、assistant、 tool。
     * @param Role 角色，可选值包括 system、user、assistant、 tool。
     */
    public void setRole(String Role) {
        this.Role = Role;
    }

    /**
     * Get 文本内容 
     * @return Content 文本内容
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set 文本内容
     * @param Content 文本内容
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get 角色名称 
     * @return Name 角色名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 角色名称
     * @param Name 角色名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    public GroupMessage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GroupMessage(GroupMessage source) {
        if (source.Role != null) {
            this.Role = new String(source.Role);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Role", this.Role);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "Name", this.Name);

    }
}

