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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AssetInstanceTypeMap extends AbstractModel {

    /**
    * 资产类型
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * 资产类型
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * 资产类型和实例类型映射关系
    */
    @SerializedName("InstanceTypeList")
    @Expose
    private FilterDataObject [] InstanceTypeList;

    /**
     * Get 资产类型 
     * @return Text 资产类型
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set 资产类型
     * @param Text 资产类型
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get 资产类型 
     * @return Value 资产类型
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set 资产类型
     * @param Value 资产类型
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get 资产类型和实例类型映射关系 
     * @return InstanceTypeList 资产类型和实例类型映射关系
     */
    public FilterDataObject [] getInstanceTypeList() {
        return this.InstanceTypeList;
    }

    /**
     * Set 资产类型和实例类型映射关系
     * @param InstanceTypeList 资产类型和实例类型映射关系
     */
    public void setInstanceTypeList(FilterDataObject [] InstanceTypeList) {
        this.InstanceTypeList = InstanceTypeList;
    }

    public AssetInstanceTypeMap() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssetInstanceTypeMap(AssetInstanceTypeMap source) {
        if (source.Text != null) {
            this.Text = new String(source.Text);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.InstanceTypeList != null) {
            this.InstanceTypeList = new FilterDataObject[source.InstanceTypeList.length];
            for (int i = 0; i < source.InstanceTypeList.length; i++) {
                this.InstanceTypeList[i] = new FilterDataObject(source.InstanceTypeList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Text", this.Text);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamArrayObj(map, prefix + "InstanceTypeList.", this.InstanceTypeList);

    }
}

