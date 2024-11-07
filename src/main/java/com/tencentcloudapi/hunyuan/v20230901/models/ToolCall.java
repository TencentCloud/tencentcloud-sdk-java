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
package com.tencentcloudapi.hunyuan.v20230901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ToolCall extends AbstractModel {

    /**
    * 工具调用id
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 工具调用类型，当前只支持function
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 具体的function调用
    */
    @SerializedName("Function")
    @Expose
    private ToolCallFunction Function;

    /**
    * 索引值
    */
    @SerializedName("Index")
    @Expose
    private Long Index;

    /**
     * Get 工具调用id 
     * @return Id 工具调用id
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 工具调用id
     * @param Id 工具调用id
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 工具调用类型，当前只支持function 
     * @return Type 工具调用类型，当前只支持function
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 工具调用类型，当前只支持function
     * @param Type 工具调用类型，当前只支持function
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 具体的function调用 
     * @return Function 具体的function调用
     */
    public ToolCallFunction getFunction() {
        return this.Function;
    }

    /**
     * Set 具体的function调用
     * @param Function 具体的function调用
     */
    public void setFunction(ToolCallFunction Function) {
        this.Function = Function;
    }

    /**
     * Get 索引值 
     * @return Index 索引值
     */
    public Long getIndex() {
        return this.Index;
    }

    /**
     * Set 索引值
     * @param Index 索引值
     */
    public void setIndex(Long Index) {
        this.Index = Index;
    }

    public ToolCall() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ToolCall(ToolCall source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Function != null) {
            this.Function = new ToolCallFunction(source.Function);
        }
        if (source.Index != null) {
            this.Index = new Long(source.Index);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamObj(map, prefix + "Function.", this.Function);
        this.setParamSimple(map, prefix + "Index", this.Index);

    }
}

