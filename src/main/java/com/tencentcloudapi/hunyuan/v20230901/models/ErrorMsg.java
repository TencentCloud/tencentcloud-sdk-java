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
package com.tencentcloudapi.hunyuan.v20230901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ErrorMsg extends AbstractModel {

    /**
    * 错误提示信息。
    */
    @SerializedName("Msg")
    @Expose
    private String Msg;

    /**
    * 错误码。
4000 服务内部异常。
4001 请求模型超时。

    */
    @SerializedName("Code")
    @Expose
    private Long Code;

    /**
     * Get 错误提示信息。 
     * @return Msg 错误提示信息。
     */
    public String getMsg() {
        return this.Msg;
    }

    /**
     * Set 错误提示信息。
     * @param Msg 错误提示信息。
     */
    public void setMsg(String Msg) {
        this.Msg = Msg;
    }

    /**
     * Get 错误码。
4000 服务内部异常。
4001 请求模型超时。
 
     * @return Code 错误码。
4000 服务内部异常。
4001 请求模型超时。

     */
    public Long getCode() {
        return this.Code;
    }

    /**
     * Set 错误码。
4000 服务内部异常。
4001 请求模型超时。

     * @param Code 错误码。
4000 服务内部异常。
4001 请求模型超时。

     */
    public void setCode(Long Code) {
        this.Code = Code;
    }

    public ErrorMsg() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ErrorMsg(ErrorMsg source) {
        if (source.Msg != null) {
            this.Msg = new String(source.Msg);
        }
        if (source.Code != null) {
            this.Code = new Long(source.Code);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Msg", this.Msg);
        this.setParamSimple(map, prefix + "Code", this.Code);

    }
}

