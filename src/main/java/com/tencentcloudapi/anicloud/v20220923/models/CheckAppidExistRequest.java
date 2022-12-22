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
package com.tencentcloudapi.anicloud.v20220923.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CheckAppidExistRequest extends AbstractModel{

    /**
    * 业务的appid
    */
    @SerializedName("SDKAppid")
    @Expose
    private String SDKAppid;

    /**
    * sub product code
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get 业务的appid 
     * @return SDKAppid 业务的appid
     */
    public String getSDKAppid() {
        return this.SDKAppid;
    }

    /**
     * Set 业务的appid
     * @param SDKAppid 业务的appid
     */
    public void setSDKAppid(String SDKAppid) {
        this.SDKAppid = SDKAppid;
    }

    /**
     * Get sub product code 
     * @return Type sub product code
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set sub product code
     * @param Type sub product code
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    public CheckAppidExistRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CheckAppidExistRequest(CheckAppidExistRequest source) {
        if (source.SDKAppid != null) {
            this.SDKAppid = new String(source.SDKAppid);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SDKAppid", this.SDKAppid);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

