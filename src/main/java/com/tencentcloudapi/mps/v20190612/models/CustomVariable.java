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

public class CustomVariable extends AbstractModel {

    /**
    * <p>用户自定义变量类型。</p><p>参数格式：PascalCase格式。</p><p>不能为UserPrompt。默认平台模板未适配自定义内容，如需适配需提交工单。</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>自定义变量描述。</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get <p>用户自定义变量类型。</p><p>参数格式：PascalCase格式。</p><p>不能为UserPrompt。默认平台模板未适配自定义内容，如需适配需提交工单。</p> 
     * @return Type <p>用户自定义变量类型。</p><p>参数格式：PascalCase格式。</p><p>不能为UserPrompt。默认平台模板未适配自定义内容，如需适配需提交工单。</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>用户自定义变量类型。</p><p>参数格式：PascalCase格式。</p><p>不能为UserPrompt。默认平台模板未适配自定义内容，如需适配需提交工单。</p>
     * @param Type <p>用户自定义变量类型。</p><p>参数格式：PascalCase格式。</p><p>不能为UserPrompt。默认平台模板未适配自定义内容，如需适配需提交工单。</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>自定义变量描述。</p> 
     * @return Description <p>自定义变量描述。</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>自定义变量描述。</p>
     * @param Description <p>自定义变量描述。</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public CustomVariable() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CustomVariable(CustomVariable source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

