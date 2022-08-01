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
package com.tencentcloudapi.bma.v20210624.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyCRBlockStatusRequest extends AbstractModel{

    /**
    * 侵权ID
    */
    @SerializedName("TortId")
    @Expose
    private Long TortId;

    /**
    * 拦截结果回调地址
    */
    @SerializedName("BlockUrl")
    @Expose
    private String BlockUrl;

    /**
     * Get 侵权ID 
     * @return TortId 侵权ID
     */
    public Long getTortId() {
        return this.TortId;
    }

    /**
     * Set 侵权ID
     * @param TortId 侵权ID
     */
    public void setTortId(Long TortId) {
        this.TortId = TortId;
    }

    /**
     * Get 拦截结果回调地址 
     * @return BlockUrl 拦截结果回调地址
     */
    public String getBlockUrl() {
        return this.BlockUrl;
    }

    /**
     * Set 拦截结果回调地址
     * @param BlockUrl 拦截结果回调地址
     */
    public void setBlockUrl(String BlockUrl) {
        this.BlockUrl = BlockUrl;
    }

    public ModifyCRBlockStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyCRBlockStatusRequest(ModifyCRBlockStatusRequest source) {
        if (source.TortId != null) {
            this.TortId = new Long(source.TortId);
        }
        if (source.BlockUrl != null) {
            this.BlockUrl = new String(source.BlockUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TortId", this.TortId);
        this.setParamSimple(map, prefix + "BlockUrl", this.BlockUrl);

    }
}

