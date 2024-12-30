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
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetOCRTokenRequest extends AbstractModel {

    /**
    * 业务类型，如身份证识别为IDCardOCR
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 身份证配置信息
    */
    @SerializedName("IDCardConfig")
    @Expose
    private IDCardConfig IDCardConfig;

    /**
     * Get 业务类型，如身份证识别为IDCardOCR 
     * @return Type 业务类型，如身份证识别为IDCardOCR
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 业务类型，如身份证识别为IDCardOCR
     * @param Type 业务类型，如身份证识别为IDCardOCR
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 身份证配置信息 
     * @return IDCardConfig 身份证配置信息
     */
    public IDCardConfig getIDCardConfig() {
        return this.IDCardConfig;
    }

    /**
     * Set 身份证配置信息
     * @param IDCardConfig 身份证配置信息
     */
    public void setIDCardConfig(IDCardConfig IDCardConfig) {
        this.IDCardConfig = IDCardConfig;
    }

    public GetOCRTokenRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetOCRTokenRequest(GetOCRTokenRequest source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.IDCardConfig != null) {
            this.IDCardConfig = new IDCardConfig(source.IDCardConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamObj(map, prefix + "IDCardConfig.", this.IDCardConfig);

    }
}

