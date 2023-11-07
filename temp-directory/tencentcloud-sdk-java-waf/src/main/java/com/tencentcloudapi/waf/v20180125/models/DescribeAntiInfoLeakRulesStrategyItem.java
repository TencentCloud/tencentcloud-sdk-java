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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAntiInfoLeakRulesStrategyItem extends AbstractModel {

    /**
    * 字段
    */
    @SerializedName("Field")
    @Expose
    private String Field;

    /**
    * 条件
    */
    @SerializedName("CompareFunc")
    @Expose
    private String CompareFunc;

    /**
    * 内容
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
     * Get 字段 
     * @return Field 字段
     */
    public String getField() {
        return this.Field;
    }

    /**
     * Set 字段
     * @param Field 字段
     */
    public void setField(String Field) {
        this.Field = Field;
    }

    /**
     * Get 条件 
     * @return CompareFunc 条件
     */
    public String getCompareFunc() {
        return this.CompareFunc;
    }

    /**
     * Set 条件
     * @param CompareFunc 条件
     */
    public void setCompareFunc(String CompareFunc) {
        this.CompareFunc = CompareFunc;
    }

    /**
     * Get 内容 
     * @return Content 内容
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set 内容
     * @param Content 内容
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    public DescribeAntiInfoLeakRulesStrategyItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAntiInfoLeakRulesStrategyItem(DescribeAntiInfoLeakRulesStrategyItem source) {
        if (source.Field != null) {
            this.Field = new String(source.Field);
        }
        if (source.CompareFunc != null) {
            this.CompareFunc = new String(source.CompareFunc);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Field", this.Field);
        this.setParamSimple(map, prefix + "CompareFunc", this.CompareFunc);
        this.setParamSimple(map, prefix + "Content", this.Content);

    }
}

