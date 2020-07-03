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

public class CopyFunctionRequest extends AbstractModel{

    /**
    * 要复制的函数的名称
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
    * 要复制的函数所在的命名空间，默认为default
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
    * 新函数的描述
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
    * 如果目标Namespace下已有同名函数，是否覆盖，默认为否
（注意：如果选择覆盖，会导致同名函数被删除，请慎重操作）
TRUE：覆盖同名函数
FALSE：不覆盖同名函数
    */
    @SerializedName("Override")
    @Expose
    private Boolean Override;

    /**
    * 是否复制函数的属性，包括环境变量、内存、超时、函数描述、标签、VPC等，默认为是。
TRUE：复制函数配置
FALSE：不复制函数配置
    */
    @SerializedName("CopyConfiguration")
    @Expose
    private Boolean CopyConfiguration;

    /**
     * Get 要复制的函数的名称 
     * @return FunctionName 要复制的函数的名称
     */
    public String getFunctionName() {
        return this.FunctionName;
    }

    /**
     * Set 要复制的函数的名称
     * @param FunctionName 要复制的函数的名称
     */
    public void setFunctionName(String FunctionName) {
        this.FunctionName = FunctionName;
    }

    /**
     * Get 新函数的名称 
     * @return NewFunctionName 新函数的名称
     */
    public String getNewFunctionName() {
        return this.NewFunctionName;
    }

    /**
     * Set 新函数的名称
     * @param NewFunctionName 新函数的名称
     */
    public void setNewFunctionName(String NewFunctionName) {
        this.NewFunctionName = NewFunctionName;
    }

    /**
     * Get 要复制的函数所在的命名空间，默认为default 
     * @return Namespace 要复制的函数所在的命名空间，默认为default
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set 要复制的函数所在的命名空间，默认为default
     * @param Namespace 要复制的函数所在的命名空间，默认为default
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get 将函数复制到的命名空间，默认为default 
     * @return TargetNamespace 将函数复制到的命名空间，默认为default
     */
    public String getTargetNamespace() {
        return this.TargetNamespace;
    }

    /**
     * Set 将函数复制到的命名空间，默认为default
     * @param TargetNamespace 将函数复制到的命名空间，默认为default
     */
    public void setTargetNamespace(String TargetNamespace) {
        this.TargetNamespace = TargetNamespace;
    }

    /**
     * Get 新函数的描述 
     * @return Description 新函数的描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 新函数的描述
     * @param Description 新函数的描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 要将函数复制到的地域，不填则默认为当前地域 
     * @return TargetRegion 要将函数复制到的地域，不填则默认为当前地域
     */
    public String getTargetRegion() {
        return this.TargetRegion;
    }

    /**
     * Set 要将函数复制到的地域，不填则默认为当前地域
     * @param TargetRegion 要将函数复制到的地域，不填则默认为当前地域
     */
    public void setTargetRegion(String TargetRegion) {
        this.TargetRegion = TargetRegion;
    }

    /**
     * Get 如果目标Namespace下已有同名函数，是否覆盖，默认为否
（注意：如果选择覆盖，会导致同名函数被删除，请慎重操作）
TRUE：覆盖同名函数
FALSE：不覆盖同名函数 
     * @return Override 如果目标Namespace下已有同名函数，是否覆盖，默认为否
（注意：如果选择覆盖，会导致同名函数被删除，请慎重操作）
TRUE：覆盖同名函数
FALSE：不覆盖同名函数
     */
    public Boolean getOverride() {
        return this.Override;
    }

    /**
     * Set 如果目标Namespace下已有同名函数，是否覆盖，默认为否
（注意：如果选择覆盖，会导致同名函数被删除，请慎重操作）
TRUE：覆盖同名函数
FALSE：不覆盖同名函数
     * @param Override 如果目标Namespace下已有同名函数，是否覆盖，默认为否
（注意：如果选择覆盖，会导致同名函数被删除，请慎重操作）
TRUE：覆盖同名函数
FALSE：不覆盖同名函数
     */
    public void setOverride(Boolean Override) {
        this.Override = Override;
    }

    /**
     * Get 是否复制函数的属性，包括环境变量、内存、超时、函数描述、标签、VPC等，默认为是。
TRUE：复制函数配置
FALSE：不复制函数配置 
     * @return CopyConfiguration 是否复制函数的属性，包括环境变量、内存、超时、函数描述、标签、VPC等，默认为是。
TRUE：复制函数配置
FALSE：不复制函数配置
     */
    public Boolean getCopyConfiguration() {
        return this.CopyConfiguration;
    }

    /**
     * Set 是否复制函数的属性，包括环境变量、内存、超时、函数描述、标签、VPC等，默认为是。
TRUE：复制函数配置
FALSE：不复制函数配置
     * @param CopyConfiguration 是否复制函数的属性，包括环境变量、内存、超时、函数描述、标签、VPC等，默认为是。
TRUE：复制函数配置
FALSE：不复制函数配置
     */
    public void setCopyConfiguration(Boolean CopyConfiguration) {
        this.CopyConfiguration = CopyConfiguration;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FunctionName", this.FunctionName);
        this.setParamSimple(map, prefix + "NewFunctionName", this.NewFunctionName);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "TargetNamespace", this.TargetNamespace);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "TargetRegion", this.TargetRegion);
        this.setParamSimple(map, prefix + "Override", this.Override);
        this.setParamSimple(map, prefix + "CopyConfiguration", this.CopyConfiguration);

    }
}

