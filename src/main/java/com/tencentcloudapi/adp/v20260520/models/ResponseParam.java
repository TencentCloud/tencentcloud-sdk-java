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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResponseParam extends AbstractModel {

    /**
    * 变量描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 参数名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 参数类型

枚举值:
| uint | 描述 |
| --- | --- |
| 0 | 默认值是string，如果不填就按string处理 |
| 1 |  |
| 2 |  |
| 3 |  |
| 4 |  |
| 5 |  |
| 6 |  |
| 7 |  |
| 8 |  |
| 9 |  |
| 20 |  |
| 99 | 空值 |
| 100 | 未指定类型，用于类型为OneOf和AnyOf的场景 |
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 
枚举值:
| uint | 描述 |
| --- | --- |
| 0 | 覆盖（全量替换） |
| 1 | 增量追加 |
    */
    @SerializedName("RenderMode")
    @Expose
    private Long RenderMode;

    /**
    * 只对 OBJECT 或 ARRAY_OBJECT 类型有用
    */
    @SerializedName("SubParams")
    @Expose
    private ResponseParam [] SubParams;

    /**
     * Get 变量描述 
     * @return Description 变量描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 变量描述
     * @param Description 变量描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 参数名称 
     * @return Name 参数名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 参数名称
     * @param Name 参数名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 参数类型

枚举值:
| uint | 描述 |
| --- | --- |
| 0 | 默认值是string，如果不填就按string处理 |
| 1 |  |
| 2 |  |
| 3 |  |
| 4 |  |
| 5 |  |
| 6 |  |
| 7 |  |
| 8 |  |
| 9 |  |
| 20 |  |
| 99 | 空值 |
| 100 | 未指定类型，用于类型为OneOf和AnyOf的场景 | 
     * @return Type 参数类型

枚举值:
| uint | 描述 |
| --- | --- |
| 0 | 默认值是string，如果不填就按string处理 |
| 1 |  |
| 2 |  |
| 3 |  |
| 4 |  |
| 5 |  |
| 6 |  |
| 7 |  |
| 8 |  |
| 9 |  |
| 20 |  |
| 99 | 空值 |
| 100 | 未指定类型，用于类型为OneOf和AnyOf的场景 |
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 参数类型

枚举值:
| uint | 描述 |
| --- | --- |
| 0 | 默认值是string，如果不填就按string处理 |
| 1 |  |
| 2 |  |
| 3 |  |
| 4 |  |
| 5 |  |
| 6 |  |
| 7 |  |
| 8 |  |
| 9 |  |
| 20 |  |
| 99 | 空值 |
| 100 | 未指定类型，用于类型为OneOf和AnyOf的场景 |
     * @param Type 参数类型

枚举值:
| uint | 描述 |
| --- | --- |
| 0 | 默认值是string，如果不填就按string处理 |
| 1 |  |
| 2 |  |
| 3 |  |
| 4 |  |
| 5 |  |
| 6 |  |
| 7 |  |
| 8 |  |
| 9 |  |
| 20 |  |
| 99 | 空值 |
| 100 | 未指定类型，用于类型为OneOf和AnyOf的场景 |
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 
枚举值:
| uint | 描述 |
| --- | --- |
| 0 | 覆盖（全量替换） |
| 1 | 增量追加 | 
     * @return RenderMode 
枚举值:
| uint | 描述 |
| --- | --- |
| 0 | 覆盖（全量替换） |
| 1 | 增量追加 |
     */
    public Long getRenderMode() {
        return this.RenderMode;
    }

    /**
     * Set 
枚举值:
| uint | 描述 |
| --- | --- |
| 0 | 覆盖（全量替换） |
| 1 | 增量追加 |
     * @param RenderMode 
枚举值:
| uint | 描述 |
| --- | --- |
| 0 | 覆盖（全量替换） |
| 1 | 增量追加 |
     */
    public void setRenderMode(Long RenderMode) {
        this.RenderMode = RenderMode;
    }

    /**
     * Get 只对 OBJECT 或 ARRAY_OBJECT 类型有用 
     * @return SubParams 只对 OBJECT 或 ARRAY_OBJECT 类型有用
     */
    public ResponseParam [] getSubParams() {
        return this.SubParams;
    }

    /**
     * Set 只对 OBJECT 或 ARRAY_OBJECT 类型有用
     * @param SubParams 只对 OBJECT 或 ARRAY_OBJECT 类型有用
     */
    public void setSubParams(ResponseParam [] SubParams) {
        this.SubParams = SubParams;
    }

    public ResponseParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResponseParam(ResponseParam source) {
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.RenderMode != null) {
            this.RenderMode = new Long(source.RenderMode);
        }
        if (source.SubParams != null) {
            this.SubParams = new ResponseParam[source.SubParams.length];
            for (int i = 0; i < source.SubParams.length; i++) {
                this.SubParams[i] = new ResponseParam(source.SubParams[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "RenderMode", this.RenderMode);
        this.setParamArrayObj(map, prefix + "SubParams.", this.SubParams);

    }
}

