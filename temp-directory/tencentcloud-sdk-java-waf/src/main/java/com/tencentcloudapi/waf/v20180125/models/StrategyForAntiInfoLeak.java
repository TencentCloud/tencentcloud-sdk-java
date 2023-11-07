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

public class StrategyForAntiInfoLeak extends AbstractModel {

    /**
    * 匹配条件，returncode（响应码）、keywords（关键字）、information（敏感信息）
    */
    @SerializedName("Field")
    @Expose
    private String Field;

    /**
    * 逻辑符号，固定取值为contains
    */
    @SerializedName("CompareFunc")
    @Expose
    private String CompareFunc;

    /**
    * 匹配内容。
以下三个对应Field为information时可取的匹配内容：
idcard（身份证）、phone（手机号）、bankcard（银行卡）。
以下为对应Field为returncode时可取的匹配内容：
400（状态码400）、403（状态码403）、404（状态码404）、4xx（其它4xx状态码）、500（状态码500）、501（状态码501）、502（状态码502）、504（状态码504）、5xx（其它5xx状态码）。
当对应Field为keywords时由用户自己输入匹配内容。

    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
     * Get 匹配条件，returncode（响应码）、keywords（关键字）、information（敏感信息） 
     * @return Field 匹配条件，returncode（响应码）、keywords（关键字）、information（敏感信息）
     */
    public String getField() {
        return this.Field;
    }

    /**
     * Set 匹配条件，returncode（响应码）、keywords（关键字）、information（敏感信息）
     * @param Field 匹配条件，returncode（响应码）、keywords（关键字）、information（敏感信息）
     */
    public void setField(String Field) {
        this.Field = Field;
    }

    /**
     * Get 逻辑符号，固定取值为contains 
     * @return CompareFunc 逻辑符号，固定取值为contains
     */
    public String getCompareFunc() {
        return this.CompareFunc;
    }

    /**
     * Set 逻辑符号，固定取值为contains
     * @param CompareFunc 逻辑符号，固定取值为contains
     */
    public void setCompareFunc(String CompareFunc) {
        this.CompareFunc = CompareFunc;
    }

    /**
     * Get 匹配内容。
以下三个对应Field为information时可取的匹配内容：
idcard（身份证）、phone（手机号）、bankcard（银行卡）。
以下为对应Field为returncode时可取的匹配内容：
400（状态码400）、403（状态码403）、404（状态码404）、4xx（其它4xx状态码）、500（状态码500）、501（状态码501）、502（状态码502）、504（状态码504）、5xx（其它5xx状态码）。
当对应Field为keywords时由用户自己输入匹配内容。
 
     * @return Content 匹配内容。
以下三个对应Field为information时可取的匹配内容：
idcard（身份证）、phone（手机号）、bankcard（银行卡）。
以下为对应Field为returncode时可取的匹配内容：
400（状态码400）、403（状态码403）、404（状态码404）、4xx（其它4xx状态码）、500（状态码500）、501（状态码501）、502（状态码502）、504（状态码504）、5xx（其它5xx状态码）。
当对应Field为keywords时由用户自己输入匹配内容。

     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set 匹配内容。
以下三个对应Field为information时可取的匹配内容：
idcard（身份证）、phone（手机号）、bankcard（银行卡）。
以下为对应Field为returncode时可取的匹配内容：
400（状态码400）、403（状态码403）、404（状态码404）、4xx（其它4xx状态码）、500（状态码500）、501（状态码501）、502（状态码502）、504（状态码504）、5xx（其它5xx状态码）。
当对应Field为keywords时由用户自己输入匹配内容。

     * @param Content 匹配内容。
以下三个对应Field为information时可取的匹配内容：
idcard（身份证）、phone（手机号）、bankcard（银行卡）。
以下为对应Field为returncode时可取的匹配内容：
400（状态码400）、403（状态码403）、404（状态码404）、4xx（其它4xx状态码）、500（状态码500）、501（状态码501）、502（状态码502）、504（状态码504）、5xx（其它5xx状态码）。
当对应Field为keywords时由用户自己输入匹配内容。

     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    public StrategyForAntiInfoLeak() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StrategyForAntiInfoLeak(StrategyForAntiInfoLeak source) {
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

