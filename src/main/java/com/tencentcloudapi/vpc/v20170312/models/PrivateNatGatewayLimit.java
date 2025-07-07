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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PrivateNatGatewayLimit extends AbstractModel {

    /**
    * 私有网络唯一`ID`。
    */
    @SerializedName("UniqVpcId")
    @Expose
    private String UniqVpcId;

    /**
    * Vpc下总计可创建私网网关数量。
    */
    @SerializedName("TotalLimit")
    @Expose
    private Long TotalLimit;

    /**
    * 可创建私网网关数量。
    */
    @SerializedName("Available")
    @Expose
    private Long Available;

    /**
     * Get 私有网络唯一`ID`。 
     * @return UniqVpcId 私有网络唯一`ID`。
     */
    public String getUniqVpcId() {
        return this.UniqVpcId;
    }

    /**
     * Set 私有网络唯一`ID`。
     * @param UniqVpcId 私有网络唯一`ID`。
     */
    public void setUniqVpcId(String UniqVpcId) {
        this.UniqVpcId = UniqVpcId;
    }

    /**
     * Get Vpc下总计可创建私网网关数量。 
     * @return TotalLimit Vpc下总计可创建私网网关数量。
     */
    public Long getTotalLimit() {
        return this.TotalLimit;
    }

    /**
     * Set Vpc下总计可创建私网网关数量。
     * @param TotalLimit Vpc下总计可创建私网网关数量。
     */
    public void setTotalLimit(Long TotalLimit) {
        this.TotalLimit = TotalLimit;
    }

    /**
     * Get 可创建私网网关数量。 
     * @return Available 可创建私网网关数量。
     */
    public Long getAvailable() {
        return this.Available;
    }

    /**
     * Set 可创建私网网关数量。
     * @param Available 可创建私网网关数量。
     */
    public void setAvailable(Long Available) {
        this.Available = Available;
    }

    public PrivateNatGatewayLimit() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PrivateNatGatewayLimit(PrivateNatGatewayLimit source) {
        if (source.UniqVpcId != null) {
            this.UniqVpcId = new String(source.UniqVpcId);
        }
        if (source.TotalLimit != null) {
            this.TotalLimit = new Long(source.TotalLimit);
        }
        if (source.Available != null) {
            this.Available = new Long(source.Available);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UniqVpcId", this.UniqVpcId);
        this.setParamSimple(map, prefix + "TotalLimit", this.TotalLimit);
        this.setParamSimple(map, prefix + "Available", this.Available);

    }
}

