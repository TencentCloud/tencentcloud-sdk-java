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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteScriptRequest extends AbstractModel{

    /**
    * 脚本id，其可以通过DescribeScripts接口提取
    */
    @SerializedName("ScriptIds")
    @Expose
    private String [] ScriptIds;

    /**
     * Get 脚本id，其可以通过DescribeScripts接口提取 
     * @return ScriptIds 脚本id，其可以通过DescribeScripts接口提取
     */
    public String [] getScriptIds() {
        return this.ScriptIds;
    }

    /**
     * Set 脚本id，其可以通过DescribeScripts接口提取
     * @param ScriptIds 脚本id，其可以通过DescribeScripts接口提取
     */
    public void setScriptIds(String [] ScriptIds) {
        this.ScriptIds = ScriptIds;
    }

    public DeleteScriptRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteScriptRequest(DeleteScriptRequest source) {
        if (source.ScriptIds != null) {
            this.ScriptIds = new String[source.ScriptIds.length];
            for (int i = 0; i < source.ScriptIds.length; i++) {
                this.ScriptIds[i] = new String(source.ScriptIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ScriptIds.", this.ScriptIds);

    }
}

