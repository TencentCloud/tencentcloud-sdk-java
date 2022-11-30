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
package com.tencentcloudapi.essbasic.v20210526.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RelieveInfo extends AbstractModel{

    /**
    * 解除理由，最大支持200个字
    */
    @SerializedName("Reason")
    @Expose
    private String Reason;

    /**
    * 解除后仍然有效的条款，保留条款，最大支持200个字
    */
    @SerializedName("RemainInForceItem")
    @Expose
    private String RemainInForceItem;

    /**
    * 原合同事项处理-费用结算，最大支持200个字
    */
    @SerializedName("OriginalExpenseSettlement")
    @Expose
    private String OriginalExpenseSettlement;

    /**
    * 原合同事项处理-其他事项，最大支持200个字
    */
    @SerializedName("OriginalOtherSettlement")
    @Expose
    private String OriginalOtherSettlement;

    /**
    * 其他约定，最大支持200个字
    */
    @SerializedName("OtherDeals")
    @Expose
    private String OtherDeals;

    /**
     * Get 解除理由，最大支持200个字 
     * @return Reason 解除理由，最大支持200个字
     */
    public String getReason() {
        return this.Reason;
    }

    /**
     * Set 解除理由，最大支持200个字
     * @param Reason 解除理由，最大支持200个字
     */
    public void setReason(String Reason) {
        this.Reason = Reason;
    }

    /**
     * Get 解除后仍然有效的条款，保留条款，最大支持200个字 
     * @return RemainInForceItem 解除后仍然有效的条款，保留条款，最大支持200个字
     */
    public String getRemainInForceItem() {
        return this.RemainInForceItem;
    }

    /**
     * Set 解除后仍然有效的条款，保留条款，最大支持200个字
     * @param RemainInForceItem 解除后仍然有效的条款，保留条款，最大支持200个字
     */
    public void setRemainInForceItem(String RemainInForceItem) {
        this.RemainInForceItem = RemainInForceItem;
    }

    /**
     * Get 原合同事项处理-费用结算，最大支持200个字 
     * @return OriginalExpenseSettlement 原合同事项处理-费用结算，最大支持200个字
     */
    public String getOriginalExpenseSettlement() {
        return this.OriginalExpenseSettlement;
    }

    /**
     * Set 原合同事项处理-费用结算，最大支持200个字
     * @param OriginalExpenseSettlement 原合同事项处理-费用结算，最大支持200个字
     */
    public void setOriginalExpenseSettlement(String OriginalExpenseSettlement) {
        this.OriginalExpenseSettlement = OriginalExpenseSettlement;
    }

    /**
     * Get 原合同事项处理-其他事项，最大支持200个字 
     * @return OriginalOtherSettlement 原合同事项处理-其他事项，最大支持200个字
     */
    public String getOriginalOtherSettlement() {
        return this.OriginalOtherSettlement;
    }

    /**
     * Set 原合同事项处理-其他事项，最大支持200个字
     * @param OriginalOtherSettlement 原合同事项处理-其他事项，最大支持200个字
     */
    public void setOriginalOtherSettlement(String OriginalOtherSettlement) {
        this.OriginalOtherSettlement = OriginalOtherSettlement;
    }

    /**
     * Get 其他约定，最大支持200个字 
     * @return OtherDeals 其他约定，最大支持200个字
     */
    public String getOtherDeals() {
        return this.OtherDeals;
    }

    /**
     * Set 其他约定，最大支持200个字
     * @param OtherDeals 其他约定，最大支持200个字
     */
    public void setOtherDeals(String OtherDeals) {
        this.OtherDeals = OtherDeals;
    }

    public RelieveInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RelieveInfo(RelieveInfo source) {
        if (source.Reason != null) {
            this.Reason = new String(source.Reason);
        }
        if (source.RemainInForceItem != null) {
            this.RemainInForceItem = new String(source.RemainInForceItem);
        }
        if (source.OriginalExpenseSettlement != null) {
            this.OriginalExpenseSettlement = new String(source.OriginalExpenseSettlement);
        }
        if (source.OriginalOtherSettlement != null) {
            this.OriginalOtherSettlement = new String(source.OriginalOtherSettlement);
        }
        if (source.OtherDeals != null) {
            this.OtherDeals = new String(source.OtherDeals);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Reason", this.Reason);
        this.setParamSimple(map, prefix + "RemainInForceItem", this.RemainInForceItem);
        this.setParamSimple(map, prefix + "OriginalExpenseSettlement", this.OriginalExpenseSettlement);
        this.setParamSimple(map, prefix + "OriginalOtherSettlement", this.OriginalOtherSettlement);
        this.setParamSimple(map, prefix + "OtherDeals", this.OtherDeals);

    }
}

