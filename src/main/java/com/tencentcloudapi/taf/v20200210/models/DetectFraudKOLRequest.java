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
package com.tencentcloudapi.taf.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DetectFraudKOLRequest extends AbstractModel{

    /**
    * 业务数据
    */
    @SerializedName("BspData")
    @Expose
    private InputKolBspData BspData;

    /**
    * 业务加密数据
    */
    @SerializedName("BusinessEncryptData")
    @Expose
    private InputBusinessEncryptData BusinessEncryptData;

    /**
     * Get 业务数据 
     * @return BspData 业务数据
     */
    public InputKolBspData getBspData() {
        return this.BspData;
    }

    /**
     * Set 业务数据
     * @param BspData 业务数据
     */
    public void setBspData(InputKolBspData BspData) {
        this.BspData = BspData;
    }

    /**
     * Get 业务加密数据 
     * @return BusinessEncryptData 业务加密数据
     */
    public InputBusinessEncryptData getBusinessEncryptData() {
        return this.BusinessEncryptData;
    }

    /**
     * Set 业务加密数据
     * @param BusinessEncryptData 业务加密数据
     */
    public void setBusinessEncryptData(InputBusinessEncryptData BusinessEncryptData) {
        this.BusinessEncryptData = BusinessEncryptData;
    }

    public DetectFraudKOLRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DetectFraudKOLRequest(DetectFraudKOLRequest source) {
        if (source.BspData != null) {
            this.BspData = new InputKolBspData(source.BspData);
        }
        if (source.BusinessEncryptData != null) {
            this.BusinessEncryptData = new InputBusinessEncryptData(source.BusinessEncryptData);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "BspData.", this.BspData);
        this.setParamObj(map, prefix + "BusinessEncryptData.", this.BusinessEncryptData);

    }
}

