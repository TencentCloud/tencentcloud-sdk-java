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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetLoRaGatewayListRequest extends AbstractModel{

    /**
    * 是否是社区网关
    */
    @SerializedName("IsCommunity")
    @Expose
    private Boolean IsCommunity;

    /**
    * 偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 限制个数
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 是否是社区网关 
     * @return IsCommunity 是否是社区网关
     */
    public Boolean getIsCommunity() {
        return this.IsCommunity;
    }

    /**
     * Set 是否是社区网关
     * @param IsCommunity 是否是社区网关
     */
    public void setIsCommunity(Boolean IsCommunity) {
        this.IsCommunity = IsCommunity;
    }

    /**
     * Get 偏移量 
     * @return Offset 偏移量
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量
     * @param Offset 偏移量
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 限制个数 
     * @return Limit 限制个数
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 限制个数
     * @param Limit 限制个数
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public GetLoRaGatewayListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetLoRaGatewayListRequest(GetLoRaGatewayListRequest source) {
        if (source.IsCommunity != null) {
            this.IsCommunity = new Boolean(source.IsCommunity);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IsCommunity", this.IsCommunity);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

