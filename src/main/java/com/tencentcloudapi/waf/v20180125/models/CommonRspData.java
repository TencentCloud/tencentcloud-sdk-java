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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CommonRspData extends AbstractModel {

    /**
    * 操作结果
    */
    @SerializedName("Code")
    @Expose
    private Long Code;

    /**
    * 输出信息
    */
    @SerializedName("Msg")
    @Expose
    private String Msg;

    /**
     * Get 操作结果 
     * @return Code 操作结果
     */
    public Long getCode() {
        return this.Code;
    }

    /**
     * Set 操作结果
     * @param Code 操作结果
     */
    public void setCode(Long Code) {
        this.Code = Code;
    }

    /**
     * Get 输出信息 
     * @return Msg 输出信息
     */
    public String getMsg() {
        return this.Msg;
    }

    /**
     * Set 输出信息
     * @param Msg 输出信息
     */
    public void setMsg(String Msg) {
        this.Msg = Msg;
    }

    public CommonRspData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CommonRspData(CommonRspData source) {
        if (source.Code != null) {
            this.Code = new Long(source.Code);
        }
        if (source.Msg != null) {
            this.Msg = new String(source.Msg);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Code", this.Code);
        this.setParamSimple(map, prefix + "Msg", this.Msg);

    }
}

