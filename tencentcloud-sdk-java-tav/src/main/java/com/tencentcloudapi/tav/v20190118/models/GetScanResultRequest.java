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
package com.tencentcloudapi.tav.v20190118.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetScanResultRequest extends AbstractModel{

    /**
    * 购买服务后获得的授权信息，用于保证请求有效性
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * 需要获取扫描接口的md5（只允许单个md5）
    */
    @SerializedName("Md5")
    @Expose
    private String Md5;

    /**
     * Get 购买服务后获得的授权信息，用于保证请求有效性 
     * @return Key 购买服务后获得的授权信息，用于保证请求有效性
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set 购买服务后获得的授权信息，用于保证请求有效性
     * @param Key 购买服务后获得的授权信息，用于保证请求有效性
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get 需要获取扫描接口的md5（只允许单个md5） 
     * @return Md5 需要获取扫描接口的md5（只允许单个md5）
     */
    public String getMd5() {
        return this.Md5;
    }

    /**
     * Set 需要获取扫描接口的md5（只允许单个md5）
     * @param Md5 需要获取扫描接口的md5（只允许单个md5）
     */
    public void setMd5(String Md5) {
        this.Md5 = Md5;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Md5", this.Md5);

    }
}

