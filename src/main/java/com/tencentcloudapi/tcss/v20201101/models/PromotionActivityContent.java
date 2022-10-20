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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PromotionActivityContent extends AbstractModel{

    /**
    * 月数
    */
    @SerializedName("MonthNum")
    @Expose
    private Long MonthNum;

    /**
    * 核数最低限量
    */
    @SerializedName("CoresCountLimit")
    @Expose
    private Long CoresCountLimit;

    /**
    * 专业版折扣
    */
    @SerializedName("ProfessionalDiscount")
    @Expose
    private Long ProfessionalDiscount;

    /**
    * 附赠镜像数
    */
    @SerializedName("ImageAuthorizationNum")
    @Expose
    private Long ImageAuthorizationNum;

    /**
     * Get 月数 
     * @return MonthNum 月数
     */
    public Long getMonthNum() {
        return this.MonthNum;
    }

    /**
     * Set 月数
     * @param MonthNum 月数
     */
    public void setMonthNum(Long MonthNum) {
        this.MonthNum = MonthNum;
    }

    /**
     * Get 核数最低限量 
     * @return CoresCountLimit 核数最低限量
     */
    public Long getCoresCountLimit() {
        return this.CoresCountLimit;
    }

    /**
     * Set 核数最低限量
     * @param CoresCountLimit 核数最低限量
     */
    public void setCoresCountLimit(Long CoresCountLimit) {
        this.CoresCountLimit = CoresCountLimit;
    }

    /**
     * Get 专业版折扣 
     * @return ProfessionalDiscount 专业版折扣
     */
    public Long getProfessionalDiscount() {
        return this.ProfessionalDiscount;
    }

    /**
     * Set 专业版折扣
     * @param ProfessionalDiscount 专业版折扣
     */
    public void setProfessionalDiscount(Long ProfessionalDiscount) {
        this.ProfessionalDiscount = ProfessionalDiscount;
    }

    /**
     * Get 附赠镜像数 
     * @return ImageAuthorizationNum 附赠镜像数
     */
    public Long getImageAuthorizationNum() {
        return this.ImageAuthorizationNum;
    }

    /**
     * Set 附赠镜像数
     * @param ImageAuthorizationNum 附赠镜像数
     */
    public void setImageAuthorizationNum(Long ImageAuthorizationNum) {
        this.ImageAuthorizationNum = ImageAuthorizationNum;
    }

    public PromotionActivityContent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PromotionActivityContent(PromotionActivityContent source) {
        if (source.MonthNum != null) {
            this.MonthNum = new Long(source.MonthNum);
        }
        if (source.CoresCountLimit != null) {
            this.CoresCountLimit = new Long(source.CoresCountLimit);
        }
        if (source.ProfessionalDiscount != null) {
            this.ProfessionalDiscount = new Long(source.ProfessionalDiscount);
        }
        if (source.ImageAuthorizationNum != null) {
            this.ImageAuthorizationNum = new Long(source.ImageAuthorizationNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MonthNum", this.MonthNum);
        this.setParamSimple(map, prefix + "CoresCountLimit", this.CoresCountLimit);
        this.setParamSimple(map, prefix + "ProfessionalDiscount", this.ProfessionalDiscount);
        this.setParamSimple(map, prefix + "ImageAuthorizationNum", this.ImageAuthorizationNum);

    }
}

