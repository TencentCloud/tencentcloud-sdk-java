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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ZoneDetailPriceResult extends AbstractModel {

    /**
    * 可用区Id
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 不同节点的价格详情
    */
    @SerializedName("NodeDetailPrice")
    @Expose
    private NodeDetailPriceResult [] NodeDetailPrice;

    /**
     * Get 可用区Id 
     * @return ZoneId 可用区Id
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 可用区Id
     * @param ZoneId 可用区Id
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 不同节点的价格详情 
     * @return NodeDetailPrice 不同节点的价格详情
     */
    public NodeDetailPriceResult [] getNodeDetailPrice() {
        return this.NodeDetailPrice;
    }

    /**
     * Set 不同节点的价格详情
     * @param NodeDetailPrice 不同节点的价格详情
     */
    public void setNodeDetailPrice(NodeDetailPriceResult [] NodeDetailPrice) {
        this.NodeDetailPrice = NodeDetailPrice;
    }

    public ZoneDetailPriceResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ZoneDetailPriceResult(ZoneDetailPriceResult source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.NodeDetailPrice != null) {
            this.NodeDetailPrice = new NodeDetailPriceResult[source.NodeDetailPrice.length];
            for (int i = 0; i < source.NodeDetailPrice.length; i++) {
                this.NodeDetailPrice[i] = new NodeDetailPriceResult(source.NodeDetailPrice[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamArrayObj(map, prefix + "NodeDetailPrice.", this.NodeDetailPrice);

    }
}

