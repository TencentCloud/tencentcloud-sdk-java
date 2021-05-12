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
package com.tencentcloudapi.tic.v20201117.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateStackVersionRequest extends AbstractModel{

    /**
    * 待增加版本的资源栈ID
    */
    @SerializedName("StackId")
    @Expose
    private String StackId;

    /**
    * 模板 URL，⽬前仅限 COS URL, ⽂件为zip压缩格式
    */
    @SerializedName("TemplateUrl")
    @Expose
    private String TemplateUrl;

    /**
    * 版本名称，不得超过60个字符
    */
    @SerializedName("VersionName")
    @Expose
    private String VersionName;

    /**
    * 版本描述，不得超过200个字符
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get 待增加版本的资源栈ID 
     * @return StackId 待增加版本的资源栈ID
     */
    public String getStackId() {
        return this.StackId;
    }

    /**
     * Set 待增加版本的资源栈ID
     * @param StackId 待增加版本的资源栈ID
     */
    public void setStackId(String StackId) {
        this.StackId = StackId;
    }

    /**
     * Get 模板 URL，⽬前仅限 COS URL, ⽂件为zip压缩格式 
     * @return TemplateUrl 模板 URL，⽬前仅限 COS URL, ⽂件为zip压缩格式
     */
    public String getTemplateUrl() {
        return this.TemplateUrl;
    }

    /**
     * Set 模板 URL，⽬前仅限 COS URL, ⽂件为zip压缩格式
     * @param TemplateUrl 模板 URL，⽬前仅限 COS URL, ⽂件为zip压缩格式
     */
    public void setTemplateUrl(String TemplateUrl) {
        this.TemplateUrl = TemplateUrl;
    }

    /**
     * Get 版本名称，不得超过60个字符 
     * @return VersionName 版本名称，不得超过60个字符
     */
    public String getVersionName() {
        return this.VersionName;
    }

    /**
     * Set 版本名称，不得超过60个字符
     * @param VersionName 版本名称，不得超过60个字符
     */
    public void setVersionName(String VersionName) {
        this.VersionName = VersionName;
    }

    /**
     * Get 版本描述，不得超过200个字符 
     * @return Description 版本描述，不得超过200个字符
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 版本描述，不得超过200个字符
     * @param Description 版本描述，不得超过200个字符
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public CreateStackVersionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateStackVersionRequest(CreateStackVersionRequest source) {
        if (source.StackId != null) {
            this.StackId = new String(source.StackId);
        }
        if (source.TemplateUrl != null) {
            this.TemplateUrl = new String(source.TemplateUrl);
        }
        if (source.VersionName != null) {
            this.VersionName = new String(source.VersionName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StackId", this.StackId);
        this.setParamSimple(map, prefix + "TemplateUrl", this.TemplateUrl);
        this.setParamSimple(map, prefix + "VersionName", this.VersionName);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

