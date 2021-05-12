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
package com.tencentcloudapi.lighthouse.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PolicyDetail extends AbstractModel{

    /**
    * 用户折扣。
    */
    @SerializedName("UserDiscount")
    @Expose
    private Long UserDiscount;

    /**
    * 公共折扣。
    */
    @SerializedName("CommonDiscount")
    @Expose
    private Long CommonDiscount;

    /**
    * 最终折扣。
    */
    @SerializedName("FinalDiscount")
    @Expose
    private Long FinalDiscount;

    /**
     * Get 用户折扣。 
     * @return UserDiscount 用户折扣。
     */
    public Long getUserDiscount() {
        return this.UserDiscount;
    }

    /**
     * Set 用户折扣。
     * @param UserDiscount 用户折扣。
     */
    public void setUserDiscount(Long UserDiscount) {
        this.UserDiscount = UserDiscount;
    }

    /**
     * Get 公共折扣。 
     * @return CommonDiscount 公共折扣。
     */
    public Long getCommonDiscount() {
        return this.CommonDiscount;
    }

    /**
     * Set 公共折扣。
     * @param CommonDiscount 公共折扣。
     */
    public void setCommonDiscount(Long CommonDiscount) {
        this.CommonDiscount = CommonDiscount;
    }

    /**
     * Get 最终折扣。 
     * @return FinalDiscount 最终折扣。
     */
    public Long getFinalDiscount() {
        return this.FinalDiscount;
    }

    /**
     * Set 最终折扣。
     * @param FinalDiscount 最终折扣。
     */
    public void setFinalDiscount(Long FinalDiscount) {
        this.FinalDiscount = FinalDiscount;
    }

    public PolicyDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PolicyDetail(PolicyDetail source) {
        if (source.UserDiscount != null) {
            this.UserDiscount = new Long(source.UserDiscount);
        }
        if (source.CommonDiscount != null) {
            this.CommonDiscount = new Long(source.CommonDiscount);
        }
        if (source.FinalDiscount != null) {
            this.FinalDiscount = new Long(source.FinalDiscount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserDiscount", this.UserDiscount);
        this.setParamSimple(map, prefix + "CommonDiscount", this.CommonDiscount);
        this.setParamSimple(map, prefix + "FinalDiscount", this.FinalDiscount);

    }
}

