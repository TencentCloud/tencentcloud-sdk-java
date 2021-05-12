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

public class CreateStackRequest extends AbstractModel{

    /**
    * 资源栈名称，不得超过60个字符
    */
    @SerializedName("StackName")
    @Expose
    private String StackName;

    /**
    * 资源栈所在地域
    */
    @SerializedName("StackRegion")
    @Expose
    private String StackRegion;

    /**
    * HCL模板URL，⽬前仅限 COS URL, ⽂件为zip压缩格式
    */
    @SerializedName("TemplateUrl")
    @Expose
    private String TemplateUrl;

    /**
    * 资源栈描述，不得超过200个字符
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get 资源栈名称，不得超过60个字符 
     * @return StackName 资源栈名称，不得超过60个字符
     */
    public String getStackName() {
        return this.StackName;
    }

    /**
     * Set 资源栈名称，不得超过60个字符
     * @param StackName 资源栈名称，不得超过60个字符
     */
    public void setStackName(String StackName) {
        this.StackName = StackName;
    }

    /**
     * Get 资源栈所在地域 
     * @return StackRegion 资源栈所在地域
     */
    public String getStackRegion() {
        return this.StackRegion;
    }

    /**
     * Set 资源栈所在地域
     * @param StackRegion 资源栈所在地域
     */
    public void setStackRegion(String StackRegion) {
        this.StackRegion = StackRegion;
    }

    /**
     * Get HCL模板URL，⽬前仅限 COS URL, ⽂件为zip压缩格式 
     * @return TemplateUrl HCL模板URL，⽬前仅限 COS URL, ⽂件为zip压缩格式
     */
    public String getTemplateUrl() {
        return this.TemplateUrl;
    }

    /**
     * Set HCL模板URL，⽬前仅限 COS URL, ⽂件为zip压缩格式
     * @param TemplateUrl HCL模板URL，⽬前仅限 COS URL, ⽂件为zip压缩格式
     */
    public void setTemplateUrl(String TemplateUrl) {
        this.TemplateUrl = TemplateUrl;
    }

    /**
     * Get 资源栈描述，不得超过200个字符 
     * @return Description 资源栈描述，不得超过200个字符
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 资源栈描述，不得超过200个字符
     * @param Description 资源栈描述，不得超过200个字符
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public CreateStackRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateStackRequest(CreateStackRequest source) {
        if (source.StackName != null) {
            this.StackName = new String(source.StackName);
        }
        if (source.StackRegion != null) {
            this.StackRegion = new String(source.StackRegion);
        }
        if (source.TemplateUrl != null) {
            this.TemplateUrl = new String(source.TemplateUrl);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StackName", this.StackName);
        this.setParamSimple(map, prefix + "StackRegion", this.StackRegion);
        this.setParamSimple(map, prefix + "TemplateUrl", this.TemplateUrl);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

