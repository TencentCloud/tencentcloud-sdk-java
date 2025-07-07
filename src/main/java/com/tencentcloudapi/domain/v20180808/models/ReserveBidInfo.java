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
package com.tencentcloudapi.domain.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReserveBidInfo extends AbstractModel {

    /**
    * 用户
    */
    @SerializedName("User")
    @Expose
    private String User;

    /**
    * 出价
    */
    @SerializedName("Price")
    @Expose
    private Long Price;

    /**
    * 出价时间
    */
    @SerializedName("BidTime")
    @Expose
    private String BidTime;

    /**
    * 当前状态
    */
    @SerializedName("BidStatus")
    @Expose
    private String BidStatus;

    /**
     * Get 用户 
     * @return User 用户
     */
    public String getUser() {
        return this.User;
    }

    /**
     * Set 用户
     * @param User 用户
     */
    public void setUser(String User) {
        this.User = User;
    }

    /**
     * Get 出价 
     * @return Price 出价
     */
    public Long getPrice() {
        return this.Price;
    }

    /**
     * Set 出价
     * @param Price 出价
     */
    public void setPrice(Long Price) {
        this.Price = Price;
    }

    /**
     * Get 出价时间 
     * @return BidTime 出价时间
     */
    public String getBidTime() {
        return this.BidTime;
    }

    /**
     * Set 出价时间
     * @param BidTime 出价时间
     */
    public void setBidTime(String BidTime) {
        this.BidTime = BidTime;
    }

    /**
     * Get 当前状态 
     * @return BidStatus 当前状态
     */
    public String getBidStatus() {
        return this.BidStatus;
    }

    /**
     * Set 当前状态
     * @param BidStatus 当前状态
     */
    public void setBidStatus(String BidStatus) {
        this.BidStatus = BidStatus;
    }

    public ReserveBidInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReserveBidInfo(ReserveBidInfo source) {
        if (source.User != null) {
            this.User = new String(source.User);
        }
        if (source.Price != null) {
            this.Price = new Long(source.Price);
        }
        if (source.BidTime != null) {
            this.BidTime = new String(source.BidTime);
        }
        if (source.BidStatus != null) {
            this.BidStatus = new String(source.BidStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "User", this.User);
        this.setParamSimple(map, prefix + "Price", this.Price);
        this.setParamSimple(map, prefix + "BidTime", this.BidTime);
        this.setParamSimple(map, prefix + "BidStatus", this.BidStatus);

    }
}

