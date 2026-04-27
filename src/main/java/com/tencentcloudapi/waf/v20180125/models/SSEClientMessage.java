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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SSEClientMessage extends AbstractModel {

    /**
    * <p>对话角色，填user</p>
    */
    @SerializedName("Role")
    @Expose
    private String Role;

    /**
    * <p>prompt内容</p>
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * <p>检测类型，0是文本内容代答，目前只支持0，可以不传，默认值是0</p><p>枚举值：</p><ul><li>0： 文件内容代答</li></ul>
    */
    @SerializedName("ContentType")
    @Expose
    private Long ContentType;

    /**
     * Get <p>对话角色，填user</p> 
     * @return Role <p>对话角色，填user</p>
     */
    public String getRole() {
        return this.Role;
    }

    /**
     * Set <p>对话角色，填user</p>
     * @param Role <p>对话角色，填user</p>
     */
    public void setRole(String Role) {
        this.Role = Role;
    }

    /**
     * Get <p>prompt内容</p> 
     * @return Content <p>prompt内容</p>
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set <p>prompt内容</p>
     * @param Content <p>prompt内容</p>
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get <p>检测类型，0是文本内容代答，目前只支持0，可以不传，默认值是0</p><p>枚举值：</p><ul><li>0： 文件内容代答</li></ul> 
     * @return ContentType <p>检测类型，0是文本内容代答，目前只支持0，可以不传，默认值是0</p><p>枚举值：</p><ul><li>0： 文件内容代答</li></ul>
     */
    public Long getContentType() {
        return this.ContentType;
    }

    /**
     * Set <p>检测类型，0是文本内容代答，目前只支持0，可以不传，默认值是0</p><p>枚举值：</p><ul><li>0： 文件内容代答</li></ul>
     * @param ContentType <p>检测类型，0是文本内容代答，目前只支持0，可以不传，默认值是0</p><p>枚举值：</p><ul><li>0： 文件内容代答</li></ul>
     */
    public void setContentType(Long ContentType) {
        this.ContentType = ContentType;
    }

    public SSEClientMessage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SSEClientMessage(SSEClientMessage source) {
        if (source.Role != null) {
            this.Role = new String(source.Role);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.ContentType != null) {
            this.ContentType = new Long(source.ContentType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Role", this.Role);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "ContentType", this.ContentType);

    }
}

