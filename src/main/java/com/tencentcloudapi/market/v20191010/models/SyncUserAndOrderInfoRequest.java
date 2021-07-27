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
package com.tencentcloudapi.market.v20191010.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SyncUserAndOrderInfoRequest extends AbstractModel{

    /**
    * 企业微信用户信息
    */
    @SerializedName("UserInfo")
    @Expose
    private WeChatUserInfo UserInfo;

    /**
    * 企业微信订单信息
    */
    @SerializedName("OrderInfo")
    @Expose
    private WeChatOrderInfo OrderInfo;

    /**
     * Get 企业微信用户信息 
     * @return UserInfo 企业微信用户信息
     */
    public WeChatUserInfo getUserInfo() {
        return this.UserInfo;
    }

    /**
     * Set 企业微信用户信息
     * @param UserInfo 企业微信用户信息
     */
    public void setUserInfo(WeChatUserInfo UserInfo) {
        this.UserInfo = UserInfo;
    }

    /**
     * Get 企业微信订单信息 
     * @return OrderInfo 企业微信订单信息
     */
    public WeChatOrderInfo getOrderInfo() {
        return this.OrderInfo;
    }

    /**
     * Set 企业微信订单信息
     * @param OrderInfo 企业微信订单信息
     */
    public void setOrderInfo(WeChatOrderInfo OrderInfo) {
        this.OrderInfo = OrderInfo;
    }

    public SyncUserAndOrderInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SyncUserAndOrderInfoRequest(SyncUserAndOrderInfoRequest source) {
        if (source.UserInfo != null) {
            this.UserInfo = new WeChatUserInfo(source.UserInfo);
        }
        if (source.OrderInfo != null) {
            this.OrderInfo = new WeChatOrderInfo(source.OrderInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "UserInfo.", this.UserInfo);
        this.setParamObj(map, prefix + "OrderInfo.", this.OrderInfo);

    }
}

