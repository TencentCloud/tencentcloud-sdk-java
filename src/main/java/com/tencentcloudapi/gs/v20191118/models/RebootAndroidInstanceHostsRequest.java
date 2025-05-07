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
package com.tencentcloudapi.gs.v20191118.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RebootAndroidInstanceHostsRequest extends AbstractModel {

    /**
    * 宿主机序列号集合
    */
    @SerializedName("HostSerialNumbers")
    @Expose
    private String [] HostSerialNumbers;

    /**
     * Get 宿主机序列号集合 
     * @return HostSerialNumbers 宿主机序列号集合
     */
    public String [] getHostSerialNumbers() {
        return this.HostSerialNumbers;
    }

    /**
     * Set 宿主机序列号集合
     * @param HostSerialNumbers 宿主机序列号集合
     */
    public void setHostSerialNumbers(String [] HostSerialNumbers) {
        this.HostSerialNumbers = HostSerialNumbers;
    }

    public RebootAndroidInstanceHostsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RebootAndroidInstanceHostsRequest(RebootAndroidInstanceHostsRequest source) {
        if (source.HostSerialNumbers != null) {
            this.HostSerialNumbers = new String[source.HostSerialNumbers.length];
            for (int i = 0; i < source.HostSerialNumbers.length; i++) {
                this.HostSerialNumbers[i] = new String(source.HostSerialNumbers[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "HostSerialNumbers.", this.HostSerialNumbers);

    }
}

