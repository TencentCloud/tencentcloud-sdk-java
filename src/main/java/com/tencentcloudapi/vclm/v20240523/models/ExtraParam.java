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
package com.tencentcloudapi.vclm.v20240523.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExtraParam extends AbstractModel {

    /**
    * 预签名的上传url，支持把视频直接传到客户指定的地址。
    */
    @SerializedName("UserDesignatedUrl")
    @Expose
    private String UserDesignatedUrl;

    /**
     * Get 预签名的上传url，支持把视频直接传到客户指定的地址。 
     * @return UserDesignatedUrl 预签名的上传url，支持把视频直接传到客户指定的地址。
     */
    public String getUserDesignatedUrl() {
        return this.UserDesignatedUrl;
    }

    /**
     * Set 预签名的上传url，支持把视频直接传到客户指定的地址。
     * @param UserDesignatedUrl 预签名的上传url，支持把视频直接传到客户指定的地址。
     */
    public void setUserDesignatedUrl(String UserDesignatedUrl) {
        this.UserDesignatedUrl = UserDesignatedUrl;
    }

    public ExtraParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExtraParam(ExtraParam source) {
        if (source.UserDesignatedUrl != null) {
            this.UserDesignatedUrl = new String(source.UserDesignatedUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserDesignatedUrl", this.UserDesignatedUrl);

    }
}

