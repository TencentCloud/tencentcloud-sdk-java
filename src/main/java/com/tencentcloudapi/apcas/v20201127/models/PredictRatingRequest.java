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
package com.tencentcloudapi.apcas.v20201127.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PredictRatingRequest extends AbstractModel{

    /**
    * ID标志的类型，0:IMEI 7:IDFA 8:MD5(imei) 100: 手机号明文 101: 手机号md5加密
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 请求唯一标志ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
     * Get ID标志的类型，0:IMEI 7:IDFA 8:MD5(imei) 100: 手机号明文 101: 手机号md5加密 
     * @return Type ID标志的类型，0:IMEI 7:IDFA 8:MD5(imei) 100: 手机号明文 101: 手机号md5加密
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set ID标志的类型，0:IMEI 7:IDFA 8:MD5(imei) 100: 手机号明文 101: 手机号md5加密
     * @param Type ID标志的类型，0:IMEI 7:IDFA 8:MD5(imei) 100: 手机号明文 101: 手机号md5加密
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 请求唯一标志ID 
     * @return Id 请求唯一标志ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 请求唯一标志ID
     * @param Id 请求唯一标志ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    public PredictRatingRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PredictRatingRequest(PredictRatingRequest source) {
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Id", this.Id);

    }
}

