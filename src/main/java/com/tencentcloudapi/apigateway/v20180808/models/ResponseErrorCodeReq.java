/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.apigateway.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResponseErrorCodeReq extends AbstractModel {

    /**
    * 自定义响应配置错误码。
    */
    @SerializedName("Code")
    @Expose
    private Long Code;

    /**
    * 自定义响应配置错误信息。
    */
    @SerializedName("Msg")
    @Expose
    private String Msg;

    /**
    * 自定义响应配置错误码备注。
    */
    @SerializedName("Desc")
    @Expose
    private String Desc;

    /**
    * 自定义错误码转换。
    */
    @SerializedName("ConvertedCode")
    @Expose
    private Long ConvertedCode;

    /**
    * 是否需要开启错误码转换。
    */
    @SerializedName("NeedConvert")
    @Expose
    private Boolean NeedConvert;

    /**
     * Get 自定义响应配置错误码。 
     * @return Code 自定义响应配置错误码。
     */
    public Long getCode() {
        return this.Code;
    }

    /**
     * Set 自定义响应配置错误码。
     * @param Code 自定义响应配置错误码。
     */
    public void setCode(Long Code) {
        this.Code = Code;
    }

    /**
     * Get 自定义响应配置错误信息。 
     * @return Msg 自定义响应配置错误信息。
     */
    public String getMsg() {
        return this.Msg;
    }

    /**
     * Set 自定义响应配置错误信息。
     * @param Msg 自定义响应配置错误信息。
     */
    public void setMsg(String Msg) {
        this.Msg = Msg;
    }

    /**
     * Get 自定义响应配置错误码备注。 
     * @return Desc 自定义响应配置错误码备注。
     */
    public String getDesc() {
        return this.Desc;
    }

    /**
     * Set 自定义响应配置错误码备注。
     * @param Desc 自定义响应配置错误码备注。
     */
    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    /**
     * Get 自定义错误码转换。 
     * @return ConvertedCode 自定义错误码转换。
     */
    public Long getConvertedCode() {
        return this.ConvertedCode;
    }

    /**
     * Set 自定义错误码转换。
     * @param ConvertedCode 自定义错误码转换。
     */
    public void setConvertedCode(Long ConvertedCode) {
        this.ConvertedCode = ConvertedCode;
    }

    /**
     * Get 是否需要开启错误码转换。 
     * @return NeedConvert 是否需要开启错误码转换。
     */
    public Boolean getNeedConvert() {
        return this.NeedConvert;
    }

    /**
     * Set 是否需要开启错误码转换。
     * @param NeedConvert 是否需要开启错误码转换。
     */
    public void setNeedConvert(Boolean NeedConvert) {
        this.NeedConvert = NeedConvert;
    }

    public ResponseErrorCodeReq() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResponseErrorCodeReq(ResponseErrorCodeReq source) {
        if (source.Code != null) {
            this.Code = new Long(source.Code);
        }
        if (source.Msg != null) {
            this.Msg = new String(source.Msg);
        }
        if (source.Desc != null) {
            this.Desc = new String(source.Desc);
        }
        if (source.ConvertedCode != null) {
            this.ConvertedCode = new Long(source.ConvertedCode);
        }
        if (source.NeedConvert != null) {
            this.NeedConvert = new Boolean(source.NeedConvert);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Code", this.Code);
        this.setParamSimple(map, prefix + "Msg", this.Msg);
        this.setParamSimple(map, prefix + "Desc", this.Desc);
        this.setParamSimple(map, prefix + "ConvertedCode", this.ConvertedCode);
        this.setParamSimple(map, prefix + "NeedConvert", this.NeedConvert);

    }
}

