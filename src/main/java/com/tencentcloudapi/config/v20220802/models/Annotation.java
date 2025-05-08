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

public class Annotation extends AbstractModel {

    /**
    * 资源当前实际配置。长度为0~256位字符，即资源不合规配置
    */
    @SerializedName("Configuration")
    @Expose
    private String Configuration;

    /**
    * 资源期望配置。长度为0~256位字符，即资源合规配置
    */
    @SerializedName("DesiredValue")
    @Expose
    private String DesiredValue;

    /**
    * 资源当前配置和期望配置之间的比较运算符。长度为0~16位字符，自定义规则上报评估结果此字段可能为空
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
    * 当前配置在资源属性结构体中的JSON路径。长度为0~256位字符，自定义规则上报评估结果此字段可能为空
    */
    @SerializedName("Property")
    @Expose
    private String Property;

    /**
     * Get 资源当前实际配置。长度为0~256位字符，即资源不合规配置 
     * @return Configuration 资源当前实际配置。长度为0~256位字符，即资源不合规配置
     */
    public String getConfiguration() {
        return this.Configuration;
    }

    /**
     * Set 资源当前实际配置。长度为0~256位字符，即资源不合规配置
     * @param Configuration 资源当前实际配置。长度为0~256位字符，即资源不合规配置
     */
    public void setConfiguration(String Configuration) {
        this.Configuration = Configuration;
    }

    /**
     * Get 资源期望配置。长度为0~256位字符，即资源合规配置 
     * @return DesiredValue 资源期望配置。长度为0~256位字符，即资源合规配置
     */
    public String getDesiredValue() {
        return this.DesiredValue;
    }

    /**
     * Set 资源期望配置。长度为0~256位字符，即资源合规配置
     * @param DesiredValue 资源期望配置。长度为0~256位字符，即资源合规配置
     */
    public void setDesiredValue(String DesiredValue) {
        this.DesiredValue = DesiredValue;
    }

    /**
     * Get 资源当前配置和期望配置之间的比较运算符。长度为0~16位字符，自定义规则上报评估结果此字段可能为空 
     * @return Operator 资源当前配置和期望配置之间的比较运算符。长度为0~16位字符，自定义规则上报评估结果此字段可能为空
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set 资源当前配置和期望配置之间的比较运算符。长度为0~16位字符，自定义规则上报评估结果此字段可能为空
     * @param Operator 资源当前配置和期望配置之间的比较运算符。长度为0~16位字符，自定义规则上报评估结果此字段可能为空
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    /**
     * Get 当前配置在资源属性结构体中的JSON路径。长度为0~256位字符，自定义规则上报评估结果此字段可能为空 
     * @return Property 当前配置在资源属性结构体中的JSON路径。长度为0~256位字符，自定义规则上报评估结果此字段可能为空
     */
    public String getProperty() {
        return this.Property;
    }

    /**
     * Set 当前配置在资源属性结构体中的JSON路径。长度为0~256位字符，自定义规则上报评估结果此字段可能为空
     * @param Property 当前配置在资源属性结构体中的JSON路径。长度为0~256位字符，自定义规则上报评估结果此字段可能为空
     */
    public void setProperty(String Property) {
        this.Property = Property;
    }

    public Annotation() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Annotation(Annotation source) {
        if (source.Configuration != null) {
            this.Configuration = new String(source.Configuration);
        }
        if (source.DesiredValue != null) {
            this.DesiredValue = new String(source.DesiredValue);
        }
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
        }
        if (source.Property != null) {
            this.Property = new String(source.Property);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Configuration", this.Configuration);
        this.setParamSimple(map, prefix + "DesiredValue", this.DesiredValue);
        this.setParamSimple(map, prefix + "Operator", this.Operator);
        this.setParamSimple(map, prefix + "Property", this.Property);

    }
}

