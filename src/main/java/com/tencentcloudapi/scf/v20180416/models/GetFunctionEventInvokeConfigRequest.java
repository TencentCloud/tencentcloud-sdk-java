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
package com.tencentcloudapi.scf.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetFunctionEventInvokeConfigRequest extends AbstractModel{

    /**
    * 函数名称
    */
    @SerializedName("FunctionName")
    @Expose
    private String FunctionName;

    /**
    * 函数所属命名空间，默认为default
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * 函数版本，默认为$LATEST
    */
    @SerializedName("Qualifier")
    @Expose
    private String Qualifier;

    /**
     * Get 函数名称 
     * @return FunctionName 函数名称
     */
    public String getFunctionName() {
        return this.FunctionName;
    }

    /**
     * Set 函数名称
     * @param FunctionName 函数名称
     */
    public void setFunctionName(String FunctionName) {
        this.FunctionName = FunctionName;
    }

    /**
     * Get 函数所属命名空间，默认为default 
     * @return Namespace 函数所属命名空间，默认为default
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set 函数所属命名空间，默认为default
     * @param Namespace 函数所属命名空间，默认为default
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get 函数版本，默认为$LATEST 
     * @return Qualifier 函数版本，默认为$LATEST
     */
    public String getQualifier() {
        return this.Qualifier;
    }

    /**
     * Set 函数版本，默认为$LATEST
     * @param Qualifier 函数版本，默认为$LATEST
     */
    public void setQualifier(String Qualifier) {
        this.Qualifier = Qualifier;
    }

    public GetFunctionEventInvokeConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetFunctionEventInvokeConfigRequest(GetFunctionEventInvokeConfigRequest source) {
        if (source.FunctionName != null) {
            this.FunctionName = new String(source.FunctionName);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.Qualifier != null) {
            this.Qualifier = new String(source.Qualifier);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FunctionName", this.FunctionName);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "Qualifier", this.Qualifier);

    }
}

