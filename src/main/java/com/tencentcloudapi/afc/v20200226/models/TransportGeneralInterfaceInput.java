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
package com.tencentcloudapi.afc.v20200226.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TransportGeneralInterfaceInput extends AbstractModel{

    /**
    * 公证处请求接口名
    */
    @SerializedName("InterfaceName")
    @Expose
    private String InterfaceName;

    /**
    * 公证处业务详情二层入参
    */
    @SerializedName("NotarizationInput")
    @Expose
    private String NotarizationInput;

    /**
    * 业务二层详情入参的哈希签名
    */
    @SerializedName("NotarizationSign")
    @Expose
    private String NotarizationSign;

    /**
     * Get 公证处请求接口名 
     * @return InterfaceName 公证处请求接口名
     */
    public String getInterfaceName() {
        return this.InterfaceName;
    }

    /**
     * Set 公证处请求接口名
     * @param InterfaceName 公证处请求接口名
     */
    public void setInterfaceName(String InterfaceName) {
        this.InterfaceName = InterfaceName;
    }

    /**
     * Get 公证处业务详情二层入参 
     * @return NotarizationInput 公证处业务详情二层入参
     */
    public String getNotarizationInput() {
        return this.NotarizationInput;
    }

    /**
     * Set 公证处业务详情二层入参
     * @param NotarizationInput 公证处业务详情二层入参
     */
    public void setNotarizationInput(String NotarizationInput) {
        this.NotarizationInput = NotarizationInput;
    }

    /**
     * Get 业务二层详情入参的哈希签名 
     * @return NotarizationSign 业务二层详情入参的哈希签名
     */
    public String getNotarizationSign() {
        return this.NotarizationSign;
    }

    /**
     * Set 业务二层详情入参的哈希签名
     * @param NotarizationSign 业务二层详情入参的哈希签名
     */
    public void setNotarizationSign(String NotarizationSign) {
        this.NotarizationSign = NotarizationSign;
    }

    public TransportGeneralInterfaceInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TransportGeneralInterfaceInput(TransportGeneralInterfaceInput source) {
        if (source.InterfaceName != null) {
            this.InterfaceName = new String(source.InterfaceName);
        }
        if (source.NotarizationInput != null) {
            this.NotarizationInput = new String(source.NotarizationInput);
        }
        if (source.NotarizationSign != null) {
            this.NotarizationSign = new String(source.NotarizationSign);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InterfaceName", this.InterfaceName);
        this.setParamSimple(map, prefix + "NotarizationInput", this.NotarizationInput);
        this.setParamSimple(map, prefix + "NotarizationSign", this.NotarizationSign);

    }
}

