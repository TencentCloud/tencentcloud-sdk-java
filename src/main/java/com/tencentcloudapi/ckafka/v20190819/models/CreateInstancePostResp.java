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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateInstancePostResp extends AbstractModel {

    /**
    * 返回的code，0为正常，非0为错误
    */
    @SerializedName("ReturnCode")
    @Expose
    private String ReturnCode;

    /**
    * 接口返回消息，当接口报错时提示错误信息
    */
    @SerializedName("ReturnMessage")
    @Expose
    private String ReturnMessage;

    /**
    * 返回的Data数据
    */
    @SerializedName("Data")
    @Expose
    private CreateInstancePostData Data;

    /**
     * Get 返回的code，0为正常，非0为错误 
     * @return ReturnCode 返回的code，0为正常，非0为错误
     */
    public String getReturnCode() {
        return this.ReturnCode;
    }

    /**
     * Set 返回的code，0为正常，非0为错误
     * @param ReturnCode 返回的code，0为正常，非0为错误
     */
    public void setReturnCode(String ReturnCode) {
        this.ReturnCode = ReturnCode;
    }

    /**
     * Get 接口返回消息，当接口报错时提示错误信息 
     * @return ReturnMessage 接口返回消息，当接口报错时提示错误信息
     */
    public String getReturnMessage() {
        return this.ReturnMessage;
    }

    /**
     * Set 接口返回消息，当接口报错时提示错误信息
     * @param ReturnMessage 接口返回消息，当接口报错时提示错误信息
     */
    public void setReturnMessage(String ReturnMessage) {
        this.ReturnMessage = ReturnMessage;
    }

    /**
     * Get 返回的Data数据 
     * @return Data 返回的Data数据
     */
    public CreateInstancePostData getData() {
        return this.Data;
    }

    /**
     * Set 返回的Data数据
     * @param Data 返回的Data数据
     */
    public void setData(CreateInstancePostData Data) {
        this.Data = Data;
    }

    public CreateInstancePostResp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateInstancePostResp(CreateInstancePostResp source) {
        if (source.ReturnCode != null) {
            this.ReturnCode = new String(source.ReturnCode);
        }
        if (source.ReturnMessage != null) {
            this.ReturnMessage = new String(source.ReturnMessage);
        }
        if (source.Data != null) {
            this.Data = new CreateInstancePostData(source.Data);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ReturnCode", this.ReturnCode);
        this.setParamSimple(map, prefix + "ReturnMessage", this.ReturnMessage);
        this.setParamObj(map, prefix + "Data.", this.Data);

    }
}

