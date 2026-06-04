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

public class CreateVariableRequest extends AbstractModel {

    /**
    * app_id
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * 变量信息
    */
    @SerializedName("Variable")
    @Expose
    private Variable Variable;

    /**
     * Get app_id 
     * @return AppId app_id
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set app_id
     * @param AppId app_id
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 变量信息 
     * @return Variable 变量信息
     */
    public Variable getVariable() {
        return this.Variable;
    }

    /**
     * Set 变量信息
     * @param Variable 变量信息
     */
    public void setVariable(Variable Variable) {
        this.Variable = Variable;
    }

    public CreateVariableRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateVariableRequest(CreateVariableRequest source) {
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.Variable != null) {
            this.Variable = new Variable(source.Variable);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamObj(map, prefix + "Variable.", this.Variable);

    }
}

