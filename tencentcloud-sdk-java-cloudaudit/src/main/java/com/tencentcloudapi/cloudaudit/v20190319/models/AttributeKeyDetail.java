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
package com.tencentcloudapi.cloudaudit.v20190319.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AttributeKeyDetail extends AbstractModel{

    /**
    * 中文标签
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
    * 输入框类型
    */
    @SerializedName("LabelType")
    @Expose
    private String LabelType;

    /**
    * 展示排序
    */
    @SerializedName("Order")
    @Expose
    private Long Order;

    /**
    * 初始化展示
    */
    @SerializedName("Starter")
    @Expose
    private String Starter;

    /**
    * AttributeKey值
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
     * Get 中文标签 
     * @return Label 中文标签
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * Set 中文标签
     * @param Label 中文标签
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }

    /**
     * Get 输入框类型 
     * @return LabelType 输入框类型
     */
    public String getLabelType() {
        return this.LabelType;
    }

    /**
     * Set 输入框类型
     * @param LabelType 输入框类型
     */
    public void setLabelType(String LabelType) {
        this.LabelType = LabelType;
    }

    /**
     * Get 展示排序 
     * @return Order 展示排序
     */
    public Long getOrder() {
        return this.Order;
    }

    /**
     * Set 展示排序
     * @param Order 展示排序
     */
    public void setOrder(Long Order) {
        this.Order = Order;
    }

    /**
     * Get 初始化展示 
     * @return Starter 初始化展示
     */
    public String getStarter() {
        return this.Starter;
    }

    /**
     * Set 初始化展示
     * @param Starter 初始化展示
     */
    public void setStarter(String Starter) {
        this.Starter = Starter;
    }

    /**
     * Get AttributeKey值 
     * @return Value AttributeKey值
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set AttributeKey值
     * @param Value AttributeKey值
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Label", this.Label);
        this.setParamSimple(map, prefix + "LabelType", this.LabelType);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "Starter", this.Starter);
        this.setParamSimple(map, prefix + "Value", this.Value);

    }
}

