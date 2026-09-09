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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TransparentData extends AbstractModel {

    /**
    * <p>透传给客户端的信息</p>
    */
    @SerializedName("Data")
    @Expose
    private String Data;

    /**
     * Get <p>透传给客户端的信息</p> 
     * @return Data <p>透传给客户端的信息</p>
     */
    public String getData() {
        return this.Data;
    }

    /**
     * Set <p>透传给客户端的信息</p>
     * @param Data <p>透传给客户端的信息</p>
     */
    public void setData(String Data) {
        this.Data = Data;
    }

    public TransparentData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TransparentData(TransparentData source) {
        if (source.Data != null) {
            this.Data = new String(source.Data);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Data", this.Data);

    }
}

