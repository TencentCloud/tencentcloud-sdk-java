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
package com.tencentcloudapi.cpdp.v20190820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FeeRangInfo extends AbstractModel{

    /**
    * 卡类型，银联产品使用 
DEBIT：借记卡 
CREDIT：贷记卡
    */
    @SerializedName("CardType")
    @Expose
    private String CardType;

    /**
    * 区间起始金额，单位（分）
    */
    @SerializedName("RangeStartValue")
    @Expose
    private Long RangeStartValue;

    /**
    * 区间结束金额，单位（分）
    */
    @SerializedName("RangeEndValue")
    @Expose
    private Long RangeEndValue;

    /**
    * 分段计费模式 
SINGLE：按金额计费 
RATIO：按费率计费
    */
    @SerializedName("RangeFeeMode")
    @Expose
    private String RangeFeeMode;

    /**
    * 费用值，单位（0.01%或分）
    */
    @SerializedName("FeeValue")
    @Expose
    private Long FeeValue;

    /**
    * 最低收费金额，单位（分）
    */
    @SerializedName("MinFee")
    @Expose
    private Long MinFee;

    /**
    * 最高收费金额，单位（分）
    */
    @SerializedName("MaxFee")
    @Expose
    private Long MaxFee;

    /**
     * Get 卡类型，银联产品使用 
DEBIT：借记卡 
CREDIT：贷记卡 
     * @return CardType 卡类型，银联产品使用 
DEBIT：借记卡 
CREDIT：贷记卡
     */
    public String getCardType() {
        return this.CardType;
    }

    /**
     * Set 卡类型，银联产品使用 
DEBIT：借记卡 
CREDIT：贷记卡
     * @param CardType 卡类型，银联产品使用 
DEBIT：借记卡 
CREDIT：贷记卡
     */
    public void setCardType(String CardType) {
        this.CardType = CardType;
    }

    /**
     * Get 区间起始金额，单位（分） 
     * @return RangeStartValue 区间起始金额，单位（分）
     */
    public Long getRangeStartValue() {
        return this.RangeStartValue;
    }

    /**
     * Set 区间起始金额，单位（分）
     * @param RangeStartValue 区间起始金额，单位（分）
     */
    public void setRangeStartValue(Long RangeStartValue) {
        this.RangeStartValue = RangeStartValue;
    }

    /**
     * Get 区间结束金额，单位（分） 
     * @return RangeEndValue 区间结束金额，单位（分）
     */
    public Long getRangeEndValue() {
        return this.RangeEndValue;
    }

    /**
     * Set 区间结束金额，单位（分）
     * @param RangeEndValue 区间结束金额，单位（分）
     */
    public void setRangeEndValue(Long RangeEndValue) {
        this.RangeEndValue = RangeEndValue;
    }

    /**
     * Get 分段计费模式 
SINGLE：按金额计费 
RATIO：按费率计费 
     * @return RangeFeeMode 分段计费模式 
SINGLE：按金额计费 
RATIO：按费率计费
     */
    public String getRangeFeeMode() {
        return this.RangeFeeMode;
    }

    /**
     * Set 分段计费模式 
SINGLE：按金额计费 
RATIO：按费率计费
     * @param RangeFeeMode 分段计费模式 
SINGLE：按金额计费 
RATIO：按费率计费
     */
    public void setRangeFeeMode(String RangeFeeMode) {
        this.RangeFeeMode = RangeFeeMode;
    }

    /**
     * Get 费用值，单位（0.01%或分） 
     * @return FeeValue 费用值，单位（0.01%或分）
     */
    public Long getFeeValue() {
        return this.FeeValue;
    }

    /**
     * Set 费用值，单位（0.01%或分）
     * @param FeeValue 费用值，单位（0.01%或分）
     */
    public void setFeeValue(Long FeeValue) {
        this.FeeValue = FeeValue;
    }

    /**
     * Get 最低收费金额，单位（分） 
     * @return MinFee 最低收费金额，单位（分）
     */
    public Long getMinFee() {
        return this.MinFee;
    }

    /**
     * Set 最低收费金额，单位（分）
     * @param MinFee 最低收费金额，单位（分）
     */
    public void setMinFee(Long MinFee) {
        this.MinFee = MinFee;
    }

    /**
     * Get 最高收费金额，单位（分） 
     * @return MaxFee 最高收费金额，单位（分）
     */
    public Long getMaxFee() {
        return this.MaxFee;
    }

    /**
     * Set 最高收费金额，单位（分）
     * @param MaxFee 最高收费金额，单位（分）
     */
    public void setMaxFee(Long MaxFee) {
        this.MaxFee = MaxFee;
    }

    public FeeRangInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FeeRangInfo(FeeRangInfo source) {
        if (source.CardType != null) {
            this.CardType = new String(source.CardType);
        }
        if (source.RangeStartValue != null) {
            this.RangeStartValue = new Long(source.RangeStartValue);
        }
        if (source.RangeEndValue != null) {
            this.RangeEndValue = new Long(source.RangeEndValue);
        }
        if (source.RangeFeeMode != null) {
            this.RangeFeeMode = new String(source.RangeFeeMode);
        }
        if (source.FeeValue != null) {
            this.FeeValue = new Long(source.FeeValue);
        }
        if (source.MinFee != null) {
            this.MinFee = new Long(source.MinFee);
        }
        if (source.MaxFee != null) {
            this.MaxFee = new Long(source.MaxFee);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CardType", this.CardType);
        this.setParamSimple(map, prefix + "RangeStartValue", this.RangeStartValue);
        this.setParamSimple(map, prefix + "RangeEndValue", this.RangeEndValue);
        this.setParamSimple(map, prefix + "RangeFeeMode", this.RangeFeeMode);
        this.setParamSimple(map, prefix + "FeeValue", this.FeeValue);
        this.setParamSimple(map, prefix + "MinFee", this.MinFee);
        this.setParamSimple(map, prefix + "MaxFee", this.MaxFee);

    }
}

