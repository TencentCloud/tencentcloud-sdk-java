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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ToolCall extends AbstractModel {

    /**
    * <p>工具调用id</p>
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * <p>工具调用类型，当前只支持function</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>具体的function调用</p>
    */
    @SerializedName("Function")
    @Expose
    private ToolCallFunction Function;

    /**
    * <p>索引值</p>
    */
    @SerializedName("Index")
    @Expose
    private Long Index;

    /**
     * Get <p>工具调用id</p> 
     * @return Id <p>工具调用id</p>
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set <p>工具调用id</p>
     * @param Id <p>工具调用id</p>
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get <p>工具调用类型，当前只支持function</p> 
     * @return Type <p>工具调用类型，当前只支持function</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>工具调用类型，当前只支持function</p>
     * @param Type <p>工具调用类型，当前只支持function</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>具体的function调用</p> 
     * @return Function <p>具体的function调用</p>
     */
    public ToolCallFunction getFunction() {
        return this.Function;
    }

    /**
     * Set <p>具体的function调用</p>
     * @param Function <p>具体的function调用</p>
     */
    public void setFunction(ToolCallFunction Function) {
        this.Function = Function;
    }

    /**
     * Get <p>索引值</p> 
     * @return Index <p>索引值</p>
     */
    public Long getIndex() {
        return this.Index;
    }

    /**
     * Set <p>索引值</p>
     * @param Index <p>索引值</p>
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

