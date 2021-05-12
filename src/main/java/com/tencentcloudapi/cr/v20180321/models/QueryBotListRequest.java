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
package com.tencentcloudapi.cr.v20180321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QueryBotListRequest extends AbstractModel{

    /**
    * 模块名：AiApi
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
    * 操作名：QueryBotList
    */
    @SerializedName("Operation")
    @Expose
    private String Operation;

    /**
     * Get 模块名：AiApi 
     * @return Module 模块名：AiApi
     */
    public String getModule() {
        return this.Module;
    }

    /**
     * Set 模块名：AiApi
     * @param Module 模块名：AiApi
     */
    public void setModule(String Module) {
        this.Module = Module;
    }

    /**
     * Get 操作名：QueryBotList 
     * @return Operation 操作名：QueryBotList
     */
    public String getOperation() {
        return this.Operation;
    }

    /**
     * Set 操作名：QueryBotList
     * @param Operation 操作名：QueryBotList
     */
    public void setOperation(String Operation) {
        this.Operation = Operation;
    }

    public QueryBotListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryBotListRequest(QueryBotListRequest source) {
        if (source.Module != null) {
            this.Module = new String(source.Module);
        }
        if (source.Operation != null) {
            this.Operation = new String(source.Operation);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Module", this.Module);
        this.setParamSimple(map, prefix + "Operation", this.Operation);

    }
}

