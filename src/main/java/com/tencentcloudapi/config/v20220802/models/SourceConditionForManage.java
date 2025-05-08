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
package com.tencentcloudapi.config.v20220802.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SourceConditionForManage extends AbstractModel {

    /**
    * 条件为空，合规：COMPLIANT，不合规：NON_COMPLIANT，无法应用：NOT_APPLICABLE
    */
    @SerializedName("EmptyAs")
    @Expose
    private String EmptyAs;

    /**
    * 配置路径
    */
    @SerializedName("SelectPath")
    @Expose
    private String SelectPath;

    /**
    * 操作运算符
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
    * 是否必须
    */
    @SerializedName("Required")
    @Expose
    private Boolean Required;

    /**
    * 期望值
    */
    @SerializedName("DesiredValue")
    @Expose
    private String DesiredValue;

    /**
     * Get 条件为空，合规：COMPLIANT，不合规：NON_COMPLIANT，无法应用：NOT_APPLICABLE 
     * @return EmptyAs 条件为空，合规：COMPLIANT，不合规：NON_COMPLIANT，无法应用：NOT_APPLICABLE
     */
    public String getEmptyAs() {
        return this.EmptyAs;
    }

    /**
     * Set 条件为空，合规：COMPLIANT，不合规：NON_COMPLIANT，无法应用：NOT_APPLICABLE
     * @param EmptyAs 条件为空，合规：COMPLIANT，不合规：NON_COMPLIANT，无法应用：NOT_APPLICABLE
     */
    public void setEmptyAs(String EmptyAs) {
        this.EmptyAs = EmptyAs;
    }

    /**
     * Get 配置路径 
     * @return SelectPath 配置路径
     */
    public String getSelectPath() {
        return this.SelectPath;
    }

    /**
     * Set 配置路径
     * @param SelectPath 配置路径
     */
    public void setSelectPath(String SelectPath) {
        this.SelectPath = SelectPath;
    }

    /**
     * Get 操作运算符 
     * @return Operator 操作运算符
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set 操作运算符
     * @param Operator 操作运算符
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    /**
     * Get 是否必须 
     * @return Required 是否必须
     */
    public Boolean getRequired() {
        return this.Required;
    }

    /**
     * Set 是否必须
     * @param Required 是否必须
     */
    public void setRequired(Boolean Required) {
        this.Required = Required;
    }

    /**
     * Get 期望值 
     * @return DesiredValue 期望值
     */
    public String getDesiredValue() {
        return this.DesiredValue;
    }

    /**
     * Set 期望值
     * @param DesiredValue 期望值
     */
    public void setDesiredValue(String DesiredValue) {
        this.DesiredValue = DesiredValue;
    }

    public SourceConditionForManage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SourceConditionForManage(SourceConditionForManage source) {
        if (source.EmptyAs != null) {
            this.EmptyAs = new String(source.EmptyAs);
        }
        if (source.SelectPath != null) {
            this.SelectPath = new String(source.SelectPath);
        }
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
        }
        if (source.Required != null) {
            this.Required = new Boolean(source.Required);
        }
        if (source.DesiredValue != null) {
            this.DesiredValue = new String(source.DesiredValue);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EmptyAs", this.EmptyAs);
        this.setParamSimple(map, prefix + "SelectPath", this.SelectPath);
        this.setParamSimple(map, prefix + "Operator", this.Operator);
        this.setParamSimple(map, prefix + "Required", this.Required);
        this.setParamSimple(map, prefix + "DesiredValue", this.DesiredValue);

    }
}

