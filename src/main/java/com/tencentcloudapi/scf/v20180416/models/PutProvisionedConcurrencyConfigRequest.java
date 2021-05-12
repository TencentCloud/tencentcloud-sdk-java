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

public class PutProvisionedConcurrencyConfigRequest extends AbstractModel{

    /**
    * 需要设置预置并发的函数的名称
    */
    @SerializedName("FunctionName")
    @Expose
    private String FunctionName;

    /**
    * 函数的版本号，注：$LATEST版本不支持预置并发
    */
    @SerializedName("Qualifier")
    @Expose
    private String Qualifier;

    /**
    * 预置并发数量，注：所有版本的预置并发数总和存在上限限制，当前的上限是：函数最大并发配额 - 100
    */
    @SerializedName("VersionProvisionedConcurrencyNum")
    @Expose
    private Long VersionProvisionedConcurrencyNum;

    /**
    * 函数所属命名空间，默认为default
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
     * Get 需要设置预置并发的函数的名称 
     * @return FunctionName 需要设置预置并发的函数的名称
     */
    public String getFunctionName() {
        return this.FunctionName;
    }

    /**
     * Set 需要设置预置并发的函数的名称
     * @param FunctionName 需要设置预置并发的函数的名称
     */
    public void setFunctionName(String FunctionName) {
        this.FunctionName = FunctionName;
    }

    /**
     * Get 函数的版本号，注：$LATEST版本不支持预置并发 
     * @return Qualifier 函数的版本号，注：$LATEST版本不支持预置并发
     */
    public String getQualifier() {
        return this.Qualifier;
    }

    /**
     * Set 函数的版本号，注：$LATEST版本不支持预置并发
     * @param Qualifier 函数的版本号，注：$LATEST版本不支持预置并发
     */
    public void setQualifier(String Qualifier) {
        this.Qualifier = Qualifier;
    }

    /**
     * Get 预置并发数量，注：所有版本的预置并发数总和存在上限限制，当前的上限是：函数最大并发配额 - 100 
     * @return VersionProvisionedConcurrencyNum 预置并发数量，注：所有版本的预置并发数总和存在上限限制，当前的上限是：函数最大并发配额 - 100
     */
    public Long getVersionProvisionedConcurrencyNum() {
        return this.VersionProvisionedConcurrencyNum;
    }

    /**
     * Set 预置并发数量，注：所有版本的预置并发数总和存在上限限制，当前的上限是：函数最大并发配额 - 100
     * @param VersionProvisionedConcurrencyNum 预置并发数量，注：所有版本的预置并发数总和存在上限限制，当前的上限是：函数最大并发配额 - 100
     */
    public void setVersionProvisionedConcurrencyNum(Long VersionProvisionedConcurrencyNum) {
        this.VersionProvisionedConcurrencyNum = VersionProvisionedConcurrencyNum;
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

    public PutProvisionedConcurrencyConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PutProvisionedConcurrencyConfigRequest(PutProvisionedConcurrencyConfigRequest source) {
        if (source.FunctionName != null) {
            this.FunctionName = new String(source.FunctionName);
        }
        if (source.Qualifier != null) {
            this.Qualifier = new String(source.Qualifier);
        }
        if (source.VersionProvisionedConcurrencyNum != null) {
            this.VersionProvisionedConcurrencyNum = new Long(source.VersionProvisionedConcurrencyNum);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FunctionName", this.FunctionName);
        this.setParamSimple(map, prefix + "Qualifier", this.Qualifier);
        this.setParamSimple(map, prefix + "VersionProvisionedConcurrencyNum", this.VersionProvisionedConcurrencyNum);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);

    }
}

