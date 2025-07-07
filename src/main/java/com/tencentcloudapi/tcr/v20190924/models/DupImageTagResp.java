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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DupImageTagResp extends AbstractModel {

    /**
    * 镜像Digest值
    */
    @SerializedName("Digest")
    @Expose
    private String Digest;

    /**
     * Get 镜像Digest值 
     * @return Digest 镜像Digest值
     */
    public String getDigest() {
        return this.Digest;
    }

    /**
     * Set 镜像Digest值
     * @param Digest 镜像Digest值
     */
    public void setDigest(String Digest) {
        this.Digest = Digest;
    }

    public DupImageTagResp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DupImageTagResp(DupImageTagResp source) {
        if (source.Digest != null) {
            this.Digest = new String(source.Digest);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Digest", this.Digest);

    }
}

