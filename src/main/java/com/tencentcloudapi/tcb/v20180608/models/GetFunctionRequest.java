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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetFunctionRequest extends AbstractModel {

    /**
    * <p>环境Id</p>
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

    /**
    * <p>函数名</p>
    */
    @SerializedName("FunctionName")
    @Expose
    private String FunctionName;

    /**
    * <p>函数的版本</p>
    */
    @SerializedName("Qualifier")
    @Expose
    private String Qualifier;

    /**
    * <p>环境</p>
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * <p>是否返回代码</p>
    */
    @SerializedName("ShowCode")
    @Expose
    private String ShowCode;

    /**
     * Get <p>环境Id</p> 
     * @return EnvId <p>环境Id</p>
     */
    public String getEnvId() {
        return this.EnvId;
    }

    /**
     * Set <p>环境Id</p>
     * @param EnvId <p>环境Id</p>
     */
    public void setEnvId(String EnvId) {
        this.EnvId = EnvId;
    }

    /**
     * Get <p>函数名</p> 
     * @return FunctionName <p>函数名</p>
     */
    public String getFunctionName() {
        return this.FunctionName;
    }

    /**
     * Set <p>函数名</p>
     * @param FunctionName <p>函数名</p>
     */
    public void setFunctionName(String FunctionName) {
        this.FunctionName = FunctionName;
    }

    /**
     * Get <p>函数的版本</p> 
     * @return Qualifier <p>函数的版本</p>
     */
    public String getQualifier() {
        return this.Qualifier;
    }

    /**
     * Set <p>函数的版本</p>
     * @param Qualifier <p>函数的版本</p>
     */
    public void setQualifier(String Qualifier) {
        this.Qualifier = Qualifier;
    }

    /**
     * Get <p>环境</p> 
     * @return Namespace <p>环境</p>
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set <p>环境</p>
     * @param Namespace <p>环境</p>
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get <p>是否返回代码</p> 
     * @return ShowCode <p>是否返回代码</p>
     */
    public String getShowCode() {
        return this.ShowCode;
    }

    /**
     * Set <p>是否返回代码</p>
     * @param ShowCode <p>是否返回代码</p>
     */
    public void setShowCode(String ShowCode) {
        this.ShowCode = ShowCode;
    }

    public GetFunctionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetFunctionRequest(GetFunctionRequest source) {
        if (source.EnvId != null) {
            this.EnvId = new String(source.EnvId);
        }
        if (source.FunctionName != null) {
            this.FunctionName = new String(source.FunctionName);
        }
        if (source.Qualifier != null) {
            this.Qualifier = new String(source.Qualifier);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.ShowCode != null) {
            this.ShowCode = new String(source.ShowCode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvId", this.EnvId);
        this.setParamSimple(map, prefix + "FunctionName", this.FunctionName);
        this.setParamSimple(map, prefix + "Qualifier", this.Qualifier);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "ShowCode", this.ShowCode);

    }
}

