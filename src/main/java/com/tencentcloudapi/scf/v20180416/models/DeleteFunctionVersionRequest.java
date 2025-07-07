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
package com.tencentcloudapi.scf.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteFunctionVersionRequest extends AbstractModel {

    /**
    * 要删除的函数名称
    */
    @SerializedName("FunctionName")
    @Expose
    private String FunctionName;

    /**
    * 填写需要删除的版本号
    */
    @SerializedName("Qualifier")
    @Expose
    private String Qualifier;

    /**
    * 函数所属命名空间
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * 强制删除标记，传true会直接删除容器，并强制关闭还在执行中的函数
    */
    @SerializedName("ForceDelete")
    @Expose
    private String ForceDelete;

    /**
     * Get 要删除的函数名称 
     * @return FunctionName 要删除的函数名称
     */
    public String getFunctionName() {
        return this.FunctionName;
    }

    /**
     * Set 要删除的函数名称
     * @param FunctionName 要删除的函数名称
     */
    public void setFunctionName(String FunctionName) {
        this.FunctionName = FunctionName;
    }

    /**
     * Get 填写需要删除的版本号 
     * @return Qualifier 填写需要删除的版本号
     */
    public String getQualifier() {
        return this.Qualifier;
    }

    /**
     * Set 填写需要删除的版本号
     * @param Qualifier 填写需要删除的版本号
     */
    public void setQualifier(String Qualifier) {
        this.Qualifier = Qualifier;
    }

    /**
     * Get 函数所属命名空间 
     * @return Namespace 函数所属命名空间
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set 函数所属命名空间
     * @param Namespace 函数所属命名空间
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get 强制删除标记，传true会直接删除容器，并强制关闭还在执行中的函数 
     * @return ForceDelete 强制删除标记，传true会直接删除容器，并强制关闭还在执行中的函数
     */
    public String getForceDelete() {
        return this.ForceDelete;
    }

    /**
     * Set 强制删除标记，传true会直接删除容器，并强制关闭还在执行中的函数
     * @param ForceDelete 强制删除标记，传true会直接删除容器，并强制关闭还在执行中的函数
     */
    public void setForceDelete(String ForceDelete) {
        this.ForceDelete = ForceDelete;
    }

    public DeleteFunctionVersionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteFunctionVersionRequest(DeleteFunctionVersionRequest source) {
        if (source.FunctionName != null) {
            this.FunctionName = new String(source.FunctionName);
        }
        if (source.Qualifier != null) {
            this.Qualifier = new String(source.Qualifier);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.ForceDelete != null) {
            this.ForceDelete = new String(source.ForceDelete);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FunctionName", this.FunctionName);
        this.setParamSimple(map, prefix + "Qualifier", this.Qualifier);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "ForceDelete", this.ForceDelete);

    }
}

