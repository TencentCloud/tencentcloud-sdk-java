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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FunctionInfo extends AbstractModel{

    /**
    * 函数命名空间
    */
    @SerializedName("FunctionNamespace")
    @Expose
    private String FunctionNamespace;

    /**
    * 函数名称
    */
    @SerializedName("FunctionName")
    @Expose
    private String FunctionName;

    /**
    * 函数的版本名称或别名
    */
    @SerializedName("FunctionQualifier")
    @Expose
    private String FunctionQualifier;

    /**
    * 标识 FunctionQualifier 参数的类型，可取值： VERSION（版本）、ALIAS（别名）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FunctionQualifierType")
    @Expose
    private String FunctionQualifierType;

    /**
     * Get 函数命名空间 
     * @return FunctionNamespace 函数命名空间
     */
    public String getFunctionNamespace() {
        return this.FunctionNamespace;
    }

    /**
     * Set 函数命名空间
     * @param FunctionNamespace 函数命名空间
     */
    public void setFunctionNamespace(String FunctionNamespace) {
        this.FunctionNamespace = FunctionNamespace;
    }

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
     * Get 函数的版本名称或别名 
     * @return FunctionQualifier 函数的版本名称或别名
     */
    public String getFunctionQualifier() {
        return this.FunctionQualifier;
    }

    /**
     * Set 函数的版本名称或别名
     * @param FunctionQualifier 函数的版本名称或别名
     */
    public void setFunctionQualifier(String FunctionQualifier) {
        this.FunctionQualifier = FunctionQualifier;
    }

    /**
     * Get 标识 FunctionQualifier 参数的类型，可取值： VERSION（版本）、ALIAS（别名）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FunctionQualifierType 标识 FunctionQualifier 参数的类型，可取值： VERSION（版本）、ALIAS（别名）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFunctionQualifierType() {
        return this.FunctionQualifierType;
    }

    /**
     * Set 标识 FunctionQualifier 参数的类型，可取值： VERSION（版本）、ALIAS（别名）
注意：此字段可能返回 null，表示取不到有效值。
     * @param FunctionQualifierType 标识 FunctionQualifier 参数的类型，可取值： VERSION（版本）、ALIAS（别名）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFunctionQualifierType(String FunctionQualifierType) {
        this.FunctionQualifierType = FunctionQualifierType;
    }

    public FunctionInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FunctionInfo(FunctionInfo source) {
        if (source.FunctionNamespace != null) {
            this.FunctionNamespace = new String(source.FunctionNamespace);
        }
        if (source.FunctionName != null) {
            this.FunctionName = new String(source.FunctionName);
        }
        if (source.FunctionQualifier != null) {
            this.FunctionQualifier = new String(source.FunctionQualifier);
        }
        if (source.FunctionQualifierType != null) {
            this.FunctionQualifierType = new String(source.FunctionQualifierType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FunctionNamespace", this.FunctionNamespace);
        this.setParamSimple(map, prefix + "FunctionName", this.FunctionName);
        this.setParamSimple(map, prefix + "FunctionQualifier", this.FunctionQualifier);
        this.setParamSimple(map, prefix + "FunctionQualifierType", this.FunctionQualifierType);

    }
}

