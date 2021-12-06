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
package com.tencentcloudapi.ccc.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PhoneNumBuyInfo extends AbstractModel{

    /**
    * 电话号码
    */
    @SerializedName("PhoneNum")
    @Expose
    private String PhoneNum;

    /**
    * 号码类型，0-固话|1-虚商号码|2-运营商号码|3-400号码
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 号码呼叫类型，1-呼入|2-呼出|3-呼入呼出
    */
    @SerializedName("CallType")
    @Expose
    private Long CallType;

    /**
    * 购买时间戳
    */
    @SerializedName("BuyTime")
    @Expose
    private Long BuyTime;

    /**
    * 截至时间戳
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * 号码状态，1正常|2停用
    */
    @SerializedName("State")
    @Expose
    private Long State;

    /**
     * Get 电话号码 
     * @return PhoneNum 电话号码
     */
    public String getPhoneNum() {
        return this.PhoneNum;
    }

    /**
     * Set 电话号码
     * @param PhoneNum 电话号码
     */
    public void setPhoneNum(String PhoneNum) {
        this.PhoneNum = PhoneNum;
    }

    /**
     * Get 号码类型，0-固话|1-虚商号码|2-运营商号码|3-400号码 
     * @return Type 号码类型，0-固话|1-虚商号码|2-运营商号码|3-400号码
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 号码类型，0-固话|1-虚商号码|2-运营商号码|3-400号码
     * @param Type 号码类型，0-固话|1-虚商号码|2-运营商号码|3-400号码
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 号码呼叫类型，1-呼入|2-呼出|3-呼入呼出 
     * @return CallType 号码呼叫类型，1-呼入|2-呼出|3-呼入呼出
     */
    public Long getCallType() {
        return this.CallType;
    }

    /**
     * Set 号码呼叫类型，1-呼入|2-呼出|3-呼入呼出
     * @param CallType 号码呼叫类型，1-呼入|2-呼出|3-呼入呼出
     */
    public void setCallType(Long CallType) {
        this.CallType = CallType;
    }

    /**
     * Get 购买时间戳 
     * @return BuyTime 购买时间戳
     */
    public Long getBuyTime() {
        return this.BuyTime;
    }

    /**
     * Set 购买时间戳
     * @param BuyTime 购买时间戳
     */
    public void setBuyTime(Long BuyTime) {
        this.BuyTime = BuyTime;
    }

    /**
     * Get 截至时间戳 
     * @return EndTime 截至时间戳
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 截至时间戳
     * @param EndTime 截至时间戳
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 号码状态，1正常|2停用 
     * @return State 号码状态，1正常|2停用
     */
    public Long getState() {
        return this.State;
    }

    /**
     * Set 号码状态，1正常|2停用
     * @param State 号码状态，1正常|2停用
     */
    public void setState(Long State) {
        this.State = State;
    }

    public PhoneNumBuyInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PhoneNumBuyInfo(PhoneNumBuyInfo source) {
        if (source.PhoneNum != null) {
            this.PhoneNum = new String(source.PhoneNum);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.CallType != null) {
            this.CallType = new Long(source.CallType);
        }
        if (source.BuyTime != null) {
            this.BuyTime = new Long(source.BuyTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.State != null) {
            this.State = new Long(source.State);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PhoneNum", this.PhoneNum);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "CallType", this.CallType);
        this.setParamSimple(map, prefix + "BuyTime", this.BuyTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "State", this.State);

    }
}

