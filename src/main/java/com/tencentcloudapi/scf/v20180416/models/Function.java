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

public class Function  extends AbstractModel{

    /**
    * 修改时间
    */
    @SerializedName("ModTime")
    @Expose
    private String ModTime;

    /**
    * 创建时间
    */
    @SerializedName("AddTime")
    @Expose
    private String AddTime;

    /**
    * 运行时
    */
    @SerializedName("Runtime")
    @Expose
    private String Runtime;

    /**
    * 函数名称
    */
    @SerializedName("FunctionName")
    @Expose
    private String FunctionName;

    /**
    * 函数ID
    */
    @SerializedName("FunctionId")
    @Expose
    private String FunctionId;

    /**
    * 命名空间
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
     * 获取修改时间
     * @return ModTime 修改时间
     */
    public String getModTime() {
        return this.ModTime;
    }

    /**
     * 设置修改时间
     * @param ModTime 修改时间
     */
    public void setModTime(String ModTime) {
        this.ModTime = ModTime;
    }

    /**
     * 获取创建时间
     * @return AddTime 创建时间
     */
    public String getAddTime() {
        return this.AddTime;
    }

    /**
     * 设置创建时间
     * @param AddTime 创建时间
     */
    public void setAddTime(String AddTime) {
        this.AddTime = AddTime;
    }

    /**
     * 获取运行时
     * @return Runtime 运行时
     */
    public String getRuntime() {
        return this.Runtime;
    }

    /**
     * 设置运行时
     * @param Runtime 运行时
     */
    public void setRuntime(String Runtime) {
        this.Runtime = Runtime;
    }

    /**
     * 获取函数名称
     * @return FunctionName 函数名称
     */
    public String getFunctionName() {
        return this.FunctionName;
    }

    /**
     * 设置函数名称
     * @param FunctionName 函数名称
     */
    public void setFunctionName(String FunctionName) {
        this.FunctionName = FunctionName;
    }

    /**
     * 获取函数ID
     * @return FunctionId 函数ID
     */
    public String getFunctionId() {
        return this.FunctionId;
    }

    /**
     * 设置函数ID
     * @param FunctionId 函数ID
     */
    public void setFunctionId(String FunctionId) {
        this.FunctionId = FunctionId;
    }

    /**
     * 获取命名空间
     * @return Namespace 命名空间
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * 设置命名空间
     * @param Namespace 命名空间
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ModTime", this.ModTime);
        this.setParamSimple(map, prefix + "AddTime", this.AddTime);
        this.setParamSimple(map, prefix + "Runtime", this.Runtime);
        this.setParamSimple(map, prefix + "FunctionName", this.FunctionName);
        this.setParamSimple(map, prefix + "FunctionId", this.FunctionId);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);

    }
}

