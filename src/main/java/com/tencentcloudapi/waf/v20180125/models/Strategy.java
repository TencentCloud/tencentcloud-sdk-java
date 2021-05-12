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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Strategy extends AbstractModel{

    /**
    * 匹配字段
    */
    @SerializedName("Field")
    @Expose
    private String Field;

    /**
    * 逻辑符号
    */
    @SerializedName("CompareFunc")
    @Expose
    private String CompareFunc;

    /**
    * 匹配内容
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * 匹配参数
    */
    @SerializedName("Arg")
    @Expose
    private String Arg;

    /**
     * Get 匹配字段 
     * @return Field 匹配字段
     */
    public String getField() {
        return this.Field;
    }

    /**
     * Set 匹配字段
     * @param Field 匹配字段
     */
    public void setField(String Field) {
        this.Field = Field;
    }

    /**
     * Get 逻辑符号 
     * @return CompareFunc 逻辑符号
     */
    public String getCompareFunc() {
        return this.CompareFunc;
    }

    /**
     * Set 逻辑符号
     * @param CompareFunc 逻辑符号
     */
    public void setCompareFunc(String CompareFunc) {
        this.CompareFunc = CompareFunc;
    }

    /**
     * Get 匹配内容 
     * @return Content 匹配内容
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set 匹配内容
     * @param Content 匹配内容
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get 匹配参数 
     * @return Arg 匹配参数
     */
    public String getArg() {
        return this.Arg;
    }

    /**
     * Set 匹配参数
     * @param Arg 匹配参数
     */
    public void setArg(String Arg) {
        this.Arg = Arg;
    }

    public Strategy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Strategy(Strategy source) {
        if (source.Field != null) {
            this.Field = new String(source.Field);
        }
        if (source.CompareFunc != null) {
            this.CompareFunc = new String(source.CompareFunc);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.Arg != null) {
            this.Arg = new String(source.Arg);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Field", this.Field);
        this.setParamSimple(map, prefix + "CompareFunc", this.CompareFunc);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "Arg", this.Arg);

    }
}

