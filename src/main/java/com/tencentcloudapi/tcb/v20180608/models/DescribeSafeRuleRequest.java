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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSafeRuleRequest extends AbstractModel {

    /**
    * 环境ID
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

    /**
    * 集合名称
    */
    @SerializedName("CollectionName")
    @Expose
    private String CollectionName;

    /**
    * 微信AppId，微信必传
    */
    @SerializedName("WxAppId")
    @Expose
    private String WxAppId;

    /**
     * Get 环境ID 
     * @return EnvId 环境ID
     */
    public String getEnvId() {
        return this.EnvId;
    }

    /**
     * Set 环境ID
     * @param EnvId 环境ID
     */
    public void setEnvId(String EnvId) {
        this.EnvId = EnvId;
    }

    /**
     * Get 集合名称 
     * @return CollectionName 集合名称
     */
    public String getCollectionName() {
        return this.CollectionName;
    }

    /**
     * Set 集合名称
     * @param CollectionName 集合名称
     */
    public void setCollectionName(String CollectionName) {
        this.CollectionName = CollectionName;
    }

    /**
     * Get 微信AppId，微信必传 
     * @return WxAppId 微信AppId，微信必传
     */
    public String getWxAppId() {
        return this.WxAppId;
    }

    /**
     * Set 微信AppId，微信必传
     * @param WxAppId 微信AppId，微信必传
     */
    public void setWxAppId(String WxAppId) {
        this.WxAppId = WxAppId;
    }

    public DescribeSafeRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSafeRuleRequest(DescribeSafeRuleRequest source) {
        if (source.EnvId != null) {
            this.EnvId = new String(source.EnvId);
        }
        if (source.CollectionName != null) {
            this.CollectionName = new String(source.CollectionName);
        }
        if (source.WxAppId != null) {
            this.WxAppId = new String(source.WxAppId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvId", this.EnvId);
        this.setParamSimple(map, prefix + "CollectionName", this.CollectionName);
        this.setParamSimple(map, prefix + "WxAppId", this.WxAppId);

    }
}

