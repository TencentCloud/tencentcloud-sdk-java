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
package com.tencentcloudapi.captcha.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CaptchaTicketDataRes extends AbstractModel{

    /**
    * 票据验证总量返回
    */
    @SerializedName("TicketAmountArray")
    @Expose
    private TicketAmountUnit [] TicketAmountArray;

    /**
    * 票据验证通过量返回
    */
    @SerializedName("TicketThroughArray")
    @Expose
    private TicketThroughUnit [] TicketThroughArray;

    /**
    * 票据验证拦截量返回
    */
    @SerializedName("TicketInterceptArray")
    @Expose
    private TicketInterceptUnit [] TicketInterceptArray;

    /**
     * Get 票据验证总量返回 
     * @return TicketAmountArray 票据验证总量返回
     */
    public TicketAmountUnit [] getTicketAmountArray() {
        return this.TicketAmountArray;
    }

    /**
     * Set 票据验证总量返回
     * @param TicketAmountArray 票据验证总量返回
     */
    public void setTicketAmountArray(TicketAmountUnit [] TicketAmountArray) {
        this.TicketAmountArray = TicketAmountArray;
    }

    /**
     * Get 票据验证通过量返回 
     * @return TicketThroughArray 票据验证通过量返回
     */
    public TicketThroughUnit [] getTicketThroughArray() {
        return this.TicketThroughArray;
    }

    /**
     * Set 票据验证通过量返回
     * @param TicketThroughArray 票据验证通过量返回
     */
    public void setTicketThroughArray(TicketThroughUnit [] TicketThroughArray) {
        this.TicketThroughArray = TicketThroughArray;
    }

    /**
     * Get 票据验证拦截量返回 
     * @return TicketInterceptArray 票据验证拦截量返回
     */
    public TicketInterceptUnit [] getTicketInterceptArray() {
        return this.TicketInterceptArray;
    }

    /**
     * Set 票据验证拦截量返回
     * @param TicketInterceptArray 票据验证拦截量返回
     */
    public void setTicketInterceptArray(TicketInterceptUnit [] TicketInterceptArray) {
        this.TicketInterceptArray = TicketInterceptArray;
    }

    public CaptchaTicketDataRes() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CaptchaTicketDataRes(CaptchaTicketDataRes source) {
        if (source.TicketAmountArray != null) {
            this.TicketAmountArray = new TicketAmountUnit[source.TicketAmountArray.length];
            for (int i = 0; i < source.TicketAmountArray.length; i++) {
                this.TicketAmountArray[i] = new TicketAmountUnit(source.TicketAmountArray[i]);
            }
        }
        if (source.TicketThroughArray != null) {
            this.TicketThroughArray = new TicketThroughUnit[source.TicketThroughArray.length];
            for (int i = 0; i < source.TicketThroughArray.length; i++) {
                this.TicketThroughArray[i] = new TicketThroughUnit(source.TicketThroughArray[i]);
            }
        }
        if (source.TicketInterceptArray != null) {
            this.TicketInterceptArray = new TicketInterceptUnit[source.TicketInterceptArray.length];
            for (int i = 0; i < source.TicketInterceptArray.length; i++) {
                this.TicketInterceptArray[i] = new TicketInterceptUnit(source.TicketInterceptArray[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "TicketAmountArray.", this.TicketAmountArray);
        this.setParamArrayObj(map, prefix + "TicketThroughArray.", this.TicketThroughArray);
        this.setParamArrayObj(map, prefix + "TicketInterceptArray.", this.TicketInterceptArray);

    }
}

