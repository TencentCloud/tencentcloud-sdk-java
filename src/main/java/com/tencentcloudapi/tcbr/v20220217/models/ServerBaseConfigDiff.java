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
package com.tencentcloudapi.tcbr.v20220217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ServerBaseConfigDiff extends AbstractModel {

    /**
    * 字符串参数 Key：EnvParam
    */
    @SerializedName("StrParams")
    @Expose
    private ObjectKV [] StrParams;

    /**
     * Get 字符串参数 Key：EnvParam 
     * @return StrParams 字符串参数 Key：EnvParam
     */
    public ObjectKV [] getStrParams() {
        return this.StrParams;
    }

    /**
     * Set 字符串参数 Key：EnvParam
     * @param StrParams 字符串参数 Key：EnvParam
     */
    public void setStrParams(ObjectKV [] StrParams) {
        this.StrParams = StrParams;
    }

    public ServerBaseConfigDiff() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ServerBaseConfigDiff(ServerBaseConfigDiff source) {
        if (source.StrParams != null) {
            this.StrParams = new ObjectKV[source.StrParams.length];
            for (int i = 0; i < source.StrParams.length; i++) {
                this.StrParams[i] = new ObjectKV(source.StrParams[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "StrParams.", this.StrParams);

    }
}

