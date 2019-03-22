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

public class CopyFunctionRequest  extends AbstractModel{

    /**
    * 函数名
    */
    @SerializedName("FunctionName")
    @Expose
    private String FunctionName;

    /**
    * 新函数的名称
    */
    @SerializedName("NewFunctionName")
    @Expose
    private String NewFunctionName;

    /**
    * 命名空间，默认为default
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * 将函数复制到的命名空间，默认为default
    */
    @SerializedName("TargetNamespace")
    @Expose
    private String TargetNamespace;

    /**
    * 函数描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 要将函数复制到的地域，不填则默认为当前地域
    */
    @SerializedName("TargetRegion")
    @Expose
    private String TargetRegion;

    /**
     * 获取函数名
     * @return FunctionName 函数名
     */
    public String getFunctionName() {
        return this.FunctionName;
    }

    /**
     * 设置函数名
     * @param FunctionName 函数名
     */
    public void setFunctionName(String FunctionName) {
        this.FunctionName = FunctionName;
    }

    /**
     * 获取新函数的名称
     * @return NewFunctionName 新函数的名称
     */
    public String getNewFunctionName() {
        return this.NewFunctionName;
    }

    /**
     * 设置新函数的名称
     * @param NewFunctionName 新函数的名称
     */
    public void setNewFunctionName(String NewFunctionName) {
        this.NewFunctionName = NewFunctionName;
    }

    /**
     * 获取命名空间，默认为default
     * @return Namespace 命名空间，默认为default
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * 设置命名空间，默认为default
     * @param Namespace 命名空间，默认为default
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * 获取将函数复制到的命名空间，默认为default
     * @return TargetNamespace 将函数复制到的命名空间，默认为default
     */
    public String getTargetNamespace() {
        return this.TargetNamespace;
    }

    /**
     * 设置将函数复制到的命名空间，默认为default
     * @param TargetNamespace 将函数复制到的命名空间，默认为default
     */
    public void setTargetNamespace(String TargetNamespace) {
        this.TargetNamespace = TargetNamespace;
    }

    /**
     * 获取函数描述
     * @return Description 函数描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * 设置函数描述
     * @param Description 函数描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * 获取要将函数复制到的地域，不填则默认为当前地域
     * @return TargetRegion 要将函数复制到的地域，不填则默认为当前地域
     */
    public String getTargetRegion() {
        return this.TargetRegion;
    }

    /**
     * 设置要将函数复制到的地域，不填则默认为当前地域
     * @param TargetRegion 要将函数复制到的地域，不填则默认为当前地域
     */
    public void setTargetRegion(String TargetRegion) {
        this.TargetRegion = TargetRegion;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FunctionName", this.FunctionName);
        this.setParamSimple(map, prefix + "NewFunctionName", this.NewFunctionName);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "TargetNamespace", this.TargetNamespace);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "TargetRegion", this.TargetRegion);

    }
}

