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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteDomainAndIpRequest extends AbstractModel {

    /**
    * -
    */
    @SerializedName("Content")
    @Expose
    private PublicIpDomainListKey [] Content;

    /**
    * 是否保留路径配置，1：保留，其他：不保留，默认不传为不保留
    */
    @SerializedName("RetainPath")
    @Expose
    private Long RetainPath;

    /**
    * 以后是否忽略该资产，，1：忽略，其他：不忽略，默认不传为忽略
    */
    @SerializedName("IgnoreAsset")
    @Expose
    private Long IgnoreAsset;

    /**
     * Get - 
     * @return Content -
     */
    public PublicIpDomainListKey [] getContent() {
        return this.Content;
    }

    /**
     * Set -
     * @param Content -
     */
    public void setContent(PublicIpDomainListKey [] Content) {
        this.Content = Content;
    }

    /**
     * Get 是否保留路径配置，1：保留，其他：不保留，默认不传为不保留 
     * @return RetainPath 是否保留路径配置，1：保留，其他：不保留，默认不传为不保留
     */
    public Long getRetainPath() {
        return this.RetainPath;
    }

    /**
     * Set 是否保留路径配置，1：保留，其他：不保留，默认不传为不保留
     * @param RetainPath 是否保留路径配置，1：保留，其他：不保留，默认不传为不保留
     */
    public void setRetainPath(Long RetainPath) {
        this.RetainPath = RetainPath;
    }

    /**
     * Get 以后是否忽略该资产，，1：忽略，其他：不忽略，默认不传为忽略 
     * @return IgnoreAsset 以后是否忽略该资产，，1：忽略，其他：不忽略，默认不传为忽略
     */
    public Long getIgnoreAsset() {
        return this.IgnoreAsset;
    }

    /**
     * Set 以后是否忽略该资产，，1：忽略，其他：不忽略，默认不传为忽略
     * @param IgnoreAsset 以后是否忽略该资产，，1：忽略，其他：不忽略，默认不传为忽略
     */
    public void setIgnoreAsset(Long IgnoreAsset) {
        this.IgnoreAsset = IgnoreAsset;
    }

    public DeleteDomainAndIpRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteDomainAndIpRequest(DeleteDomainAndIpRequest source) {
        if (source.Content != null) {
            this.Content = new PublicIpDomainListKey[source.Content.length];
            for (int i = 0; i < source.Content.length; i++) {
                this.Content[i] = new PublicIpDomainListKey(source.Content[i]);
            }
        }
        if (source.RetainPath != null) {
            this.RetainPath = new Long(source.RetainPath);
        }
        if (source.IgnoreAsset != null) {
            this.IgnoreAsset = new Long(source.IgnoreAsset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Content.", this.Content);
        this.setParamSimple(map, prefix + "RetainPath", this.RetainPath);
        this.setParamSimple(map, prefix + "IgnoreAsset", this.IgnoreAsset);

    }
}

