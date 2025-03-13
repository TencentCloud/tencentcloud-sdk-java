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
package com.tencentcloudapi.domain.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AuctionInfo extends AbstractModel {

    /**
    * 竞拍人
    */
    @SerializedName("Bidder")
    @Expose
    private String Bidder;

    /**
    * 竞拍时间
    */
    @SerializedName("AuctionTime")
    @Expose
    private String AuctionTime;

    /**
    * 竞拍价格
    */
    @SerializedName("AuctionPrice")
    @Expose
    private Float AuctionPrice;

    /**
    * 状态 up: 领先 down: 落后
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get 竞拍人 
     * @return Bidder 竞拍人
     */
    public String getBidder() {
        return this.Bidder;
    }

    /**
     * Set 竞拍人
     * @param Bidder 竞拍人
     */
    public void setBidder(String Bidder) {
        this.Bidder = Bidder;
    }

    /**
     * Get 竞拍时间 
     * @return AuctionTime 竞拍时间
     */
    public String getAuctionTime() {
        return this.AuctionTime;
    }

    /**
     * Set 竞拍时间
     * @param AuctionTime 竞拍时间
     */
    public void setAuctionTime(String AuctionTime) {
        this.AuctionTime = AuctionTime;
    }

    /**
     * Get 竞拍价格 
     * @return AuctionPrice 竞拍价格
     */
    public Float getAuctionPrice() {
        return this.AuctionPrice;
    }

    /**
     * Set 竞拍价格
     * @param AuctionPrice 竞拍价格
     */
    public void setAuctionPrice(Float AuctionPrice) {
        this.AuctionPrice = AuctionPrice;
    }

    /**
     * Get 状态 up: 领先 down: 落后 
     * @return Status 状态 up: 领先 down: 落后
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 状态 up: 领先 down: 落后
     * @param Status 状态 up: 领先 down: 落后
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public AuctionInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AuctionInfo(AuctionInfo source) {
        if (source.Bidder != null) {
            this.Bidder = new String(source.Bidder);
        }
        if (source.AuctionTime != null) {
            this.AuctionTime = new String(source.AuctionTime);
        }
        if (source.AuctionPrice != null) {
            this.AuctionPrice = new Float(source.AuctionPrice);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Bidder", this.Bidder);
        this.setParamSimple(map, prefix + "AuctionTime", this.AuctionTime);
        this.setParamSimple(map, prefix + "AuctionPrice", this.AuctionPrice);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

