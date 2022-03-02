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
package com.tencentcloudapi.tdid.v20210519.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateCredentialRequest extends AbstractModel{

    /**
    * 参数集合，详见示例
    */
    @SerializedName("FunctionArg")
    @Expose
    private FunctionArg FunctionArg;

    /**
    * 参数集合，详见示例
    */
    @SerializedName("TransactionArg")
    @Expose
    private TransactionArg TransactionArg;

    /**
    * 版本
    */
    @SerializedName("VersionCredential")
    @Expose
    private String VersionCredential;

    /**
    * 是否未签名
    */
    @SerializedName("UnSigned")
    @Expose
    private Boolean UnSigned;

    /**
     * Get 参数集合，详见示例 
     * @return FunctionArg 参数集合，详见示例
     */
    public FunctionArg getFunctionArg() {
        return this.FunctionArg;
    }

    /**
     * Set 参数集合，详见示例
     * @param FunctionArg 参数集合，详见示例
     */
    public void setFunctionArg(FunctionArg FunctionArg) {
        this.FunctionArg = FunctionArg;
    }

    /**
     * Get 参数集合，详见示例 
     * @return TransactionArg 参数集合，详见示例
     */
    public TransactionArg getTransactionArg() {
        return this.TransactionArg;
    }

    /**
     * Set 参数集合，详见示例
     * @param TransactionArg 参数集合，详见示例
     */
    public void setTransactionArg(TransactionArg TransactionArg) {
        this.TransactionArg = TransactionArg;
    }

    /**
     * Get 版本 
     * @return VersionCredential 版本
     */
    public String getVersionCredential() {
        return this.VersionCredential;
    }

    /**
     * Set 版本
     * @param VersionCredential 版本
     */
    public void setVersionCredential(String VersionCredential) {
        this.VersionCredential = VersionCredential;
    }

    /**
     * Get 是否未签名 
     * @return UnSigned 是否未签名
     */
    public Boolean getUnSigned() {
        return this.UnSigned;
    }

    /**
     * Set 是否未签名
     * @param UnSigned 是否未签名
     */
    public void setUnSigned(Boolean UnSigned) {
        this.UnSigned = UnSigned;
    }

    public CreateCredentialRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCredentialRequest(CreateCredentialRequest source) {
        if (source.FunctionArg != null) {
            this.FunctionArg = new FunctionArg(source.FunctionArg);
        }
        if (source.TransactionArg != null) {
            this.TransactionArg = new TransactionArg(source.TransactionArg);
        }
        if (source.VersionCredential != null) {
            this.VersionCredential = new String(source.VersionCredential);
        }
        if (source.UnSigned != null) {
            this.UnSigned = new Boolean(source.UnSigned);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "FunctionArg.", this.FunctionArg);
        this.setParamObj(map, prefix + "TransactionArg.", this.TransactionArg);
        this.setParamSimple(map, prefix + "VersionCredential", this.VersionCredential);
        this.setParamSimple(map, prefix + "UnSigned", this.UnSigned);

    }
}

