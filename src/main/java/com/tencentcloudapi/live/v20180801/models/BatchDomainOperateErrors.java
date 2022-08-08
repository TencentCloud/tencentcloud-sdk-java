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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BatchDomainOperateErrors extends AbstractModel{

    /**
    * 操作失败的域名。
    */
    @SerializedName("DomainName")
    @Expose
    private String DomainName;

    /**
    * API3.0错误码。
    */
    @SerializedName("Code")
    @Expose
    private String Code;

    /**
    * API3.0错误信息。
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
     * Get 操作失败的域名。 
     * @return DomainName 操作失败的域名。
     */
    public String getDomainName() {
        return this.DomainName;
    }

    /**
     * Set 操作失败的域名。
     * @param DomainName 操作失败的域名。
     */
    public void setDomainName(String DomainName) {
        this.DomainName = DomainName;
    }

    /**
     * Get API3.0错误码。 
     * @return Code API3.0错误码。
     */
    public String getCode() {
        return this.Code;
    }

    /**
     * Set API3.0错误码。
     * @param Code API3.0错误码。
     */
    public void setCode(String Code) {
        this.Code = Code;
    }

    /**
     * Get API3.0错误信息。 
     * @return Message API3.0错误信息。
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set API3.0错误信息。
     * @param Message API3.0错误信息。
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    public BatchDomainOperateErrors() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BatchDomainOperateErrors(BatchDomainOperateErrors source) {
        if (source.DomainName != null) {
            this.DomainName = new String(source.DomainName);
        }
        if (source.Code != null) {
            this.Code = new String(source.Code);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DomainName", this.DomainName);
        this.setParamSimple(map, prefix + "Code", this.Code);
        this.setParamSimple(map, prefix + "Message", this.Message);

    }
}

