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
package com.tencentcloudapi.lowcode.v20210108.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PutWxAppIdToWeAppRequest extends AbstractModel {

    /**
    * 应用ID
    */
    @SerializedName("WeAppId")
    @Expose
    private String WeAppId;

    /**
    * 微信AppId
    */
    @SerializedName("WxAppId")
    @Expose
    private String WxAppId;

    /**
     * Get 应用ID 
     * @return WeAppId 应用ID
     */
    public String getWeAppId() {
        return this.WeAppId;
    }

    /**
     * Set 应用ID
     * @param WeAppId 应用ID
     */
    public void setWeAppId(String WeAppId) {
        this.WeAppId = WeAppId;
    }

    /**
     * Get 微信AppId 
     * @return WxAppId 微信AppId
     */
    public String getWxAppId() {
        return this.WxAppId;
    }

    /**
     * Set 微信AppId
     * @param WxAppId 微信AppId
     */
    public void setWxAppId(String WxAppId) {
        this.WxAppId = WxAppId;
    }

    public PutWxAppIdToWeAppRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PutWxAppIdToWeAppRequest(PutWxAppIdToWeAppRequest source) {
        if (source.WeAppId != null) {
            this.WeAppId = new String(source.WeAppId);
        }
        if (source.WxAppId != null) {
            this.WxAppId = new String(source.WxAppId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WeAppId", this.WeAppId);
        this.setParamSimple(map, prefix + "WxAppId", this.WxAppId);

    }
}

