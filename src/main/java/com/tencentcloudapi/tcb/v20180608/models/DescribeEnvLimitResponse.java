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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeEnvLimitResponse extends AbstractModel{

    /**
    * 环境总数上限
    */
    @SerializedName("MaxEnvNum")
    @Expose
    private Long MaxEnvNum;

    /**
    * 目前环境总数
    */
    @SerializedName("CurrentEnvNum")
    @Expose
    private Long CurrentEnvNum;

    /**
    * 免费环境数量上限
    */
    @SerializedName("MaxFreeEnvNum")
    @Expose
    private Long MaxFreeEnvNum;

    /**
    * 目前免费环境数量
    */
    @SerializedName("CurrentFreeEnvNum")
    @Expose
    private Long CurrentFreeEnvNum;

    /**
    * 总计允许销毁环境次数上限
    */
    @SerializedName("MaxDeleteTotal")
    @Expose
    private Long MaxDeleteTotal;

    /**
    * 目前已销毁环境次数
    */
    @SerializedName("CurrentDeleteTotal")
    @Expose
    private Long CurrentDeleteTotal;

    /**
    * 每月允许销毁环境次数上限
    */
    @SerializedName("MaxDeleteMonthly")
    @Expose
    private Long MaxDeleteMonthly;

    /**
    * 本月已销毁环境次数
    */
    @SerializedName("CurrentDeleteMonthly")
    @Expose
    private Long CurrentDeleteMonthly;

    /**
    * 微信网关体验版可购买月份数
    */
    @SerializedName("MaxFreeTrialNum")
    @Expose
    private Long MaxFreeTrialNum;

    /**
    * 微信网关体验版已购买月份数
    */
    @SerializedName("CurrentFreeTrialNum")
    @Expose
    private Long CurrentFreeTrialNum;

    /**
    * 转支付限额总数
    */
    @SerializedName("ChangePayTotal")
    @Expose
    private Long ChangePayTotal;

    /**
    * 当前已用转支付次数
    */
    @SerializedName("CurrentChangePayTotal")
    @Expose
    private Long CurrentChangePayTotal;

    /**
    * 转支付每月限额
    */
    @SerializedName("ChangePayMonthly")
    @Expose
    private Long ChangePayMonthly;

    /**
    * 本月已用转支付额度
    */
    @SerializedName("CurrentChangePayMonthly")
    @Expose
    private Long CurrentChangePayMonthly;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 环境总数上限 
     * @return MaxEnvNum 环境总数上限
     */
    public Long getMaxEnvNum() {
        return this.MaxEnvNum;
    }

    /**
     * Set 环境总数上限
     * @param MaxEnvNum 环境总数上限
     */
    public void setMaxEnvNum(Long MaxEnvNum) {
        this.MaxEnvNum = MaxEnvNum;
    }

    /**
     * Get 目前环境总数 
     * @return CurrentEnvNum 目前环境总数
     */
    public Long getCurrentEnvNum() {
        return this.CurrentEnvNum;
    }

    /**
     * Set 目前环境总数
     * @param CurrentEnvNum 目前环境总数
     */
    public void setCurrentEnvNum(Long CurrentEnvNum) {
        this.CurrentEnvNum = CurrentEnvNum;
    }

    /**
     * Get 免费环境数量上限 
     * @return MaxFreeEnvNum 免费环境数量上限
     */
    public Long getMaxFreeEnvNum() {
        return this.MaxFreeEnvNum;
    }

    /**
     * Set 免费环境数量上限
     * @param MaxFreeEnvNum 免费环境数量上限
     */
    public void setMaxFreeEnvNum(Long MaxFreeEnvNum) {
        this.MaxFreeEnvNum = MaxFreeEnvNum;
    }

    /**
     * Get 目前免费环境数量 
     * @return CurrentFreeEnvNum 目前免费环境数量
     */
    public Long getCurrentFreeEnvNum() {
        return this.CurrentFreeEnvNum;
    }

    /**
     * Set 目前免费环境数量
     * @param CurrentFreeEnvNum 目前免费环境数量
     */
    public void setCurrentFreeEnvNum(Long CurrentFreeEnvNum) {
        this.CurrentFreeEnvNum = CurrentFreeEnvNum;
    }

    /**
     * Get 总计允许销毁环境次数上限 
     * @return MaxDeleteTotal 总计允许销毁环境次数上限
     */
    public Long getMaxDeleteTotal() {
        return this.MaxDeleteTotal;
    }

    /**
     * Set 总计允许销毁环境次数上限
     * @param MaxDeleteTotal 总计允许销毁环境次数上限
     */
    public void setMaxDeleteTotal(Long MaxDeleteTotal) {
        this.MaxDeleteTotal = MaxDeleteTotal;
    }

    /**
     * Get 目前已销毁环境次数 
     * @return CurrentDeleteTotal 目前已销毁环境次数
     */
    public Long getCurrentDeleteTotal() {
        return this.CurrentDeleteTotal;
    }

    /**
     * Set 目前已销毁环境次数
     * @param CurrentDeleteTotal 目前已销毁环境次数
     */
    public void setCurrentDeleteTotal(Long CurrentDeleteTotal) {
        this.CurrentDeleteTotal = CurrentDeleteTotal;
    }

    /**
     * Get 每月允许销毁环境次数上限 
     * @return MaxDeleteMonthly 每月允许销毁环境次数上限
     */
    public Long getMaxDeleteMonthly() {
        return this.MaxDeleteMonthly;
    }

    /**
     * Set 每月允许销毁环境次数上限
     * @param MaxDeleteMonthly 每月允许销毁环境次数上限
     */
    public void setMaxDeleteMonthly(Long MaxDeleteMonthly) {
        this.MaxDeleteMonthly = MaxDeleteMonthly;
    }

    /**
     * Get 本月已销毁环境次数 
     * @return CurrentDeleteMonthly 本月已销毁环境次数
     */
    public Long getCurrentDeleteMonthly() {
        return this.CurrentDeleteMonthly;
    }

    /**
     * Set 本月已销毁环境次数
     * @param CurrentDeleteMonthly 本月已销毁环境次数
     */
    public void setCurrentDeleteMonthly(Long CurrentDeleteMonthly) {
        this.CurrentDeleteMonthly = CurrentDeleteMonthly;
    }

    /**
     * Get 微信网关体验版可购买月份数 
     * @return MaxFreeTrialNum 微信网关体验版可购买月份数
     */
    public Long getMaxFreeTrialNum() {
        return this.MaxFreeTrialNum;
    }

    /**
     * Set 微信网关体验版可购买月份数
     * @param MaxFreeTrialNum 微信网关体验版可购买月份数
     */
    public void setMaxFreeTrialNum(Long MaxFreeTrialNum) {
        this.MaxFreeTrialNum = MaxFreeTrialNum;
    }

    /**
     * Get 微信网关体验版已购买月份数 
     * @return CurrentFreeTrialNum 微信网关体验版已购买月份数
     */
    public Long getCurrentFreeTrialNum() {
        return this.CurrentFreeTrialNum;
    }

    /**
     * Set 微信网关体验版已购买月份数
     * @param CurrentFreeTrialNum 微信网关体验版已购买月份数
     */
    public void setCurrentFreeTrialNum(Long CurrentFreeTrialNum) {
        this.CurrentFreeTrialNum = CurrentFreeTrialNum;
    }

    /**
     * Get 转支付限额总数 
     * @return ChangePayTotal 转支付限额总数
     */
    public Long getChangePayTotal() {
        return this.ChangePayTotal;
    }

    /**
     * Set 转支付限额总数
     * @param ChangePayTotal 转支付限额总数
     */
    public void setChangePayTotal(Long ChangePayTotal) {
        this.ChangePayTotal = ChangePayTotal;
    }

    /**
     * Get 当前已用转支付次数 
     * @return CurrentChangePayTotal 当前已用转支付次数
     */
    public Long getCurrentChangePayTotal() {
        return this.CurrentChangePayTotal;
    }

    /**
     * Set 当前已用转支付次数
     * @param CurrentChangePayTotal 当前已用转支付次数
     */
    public void setCurrentChangePayTotal(Long CurrentChangePayTotal) {
        this.CurrentChangePayTotal = CurrentChangePayTotal;
    }

    /**
     * Get 转支付每月限额 
     * @return ChangePayMonthly 转支付每月限额
     */
    public Long getChangePayMonthly() {
        return this.ChangePayMonthly;
    }

    /**
     * Set 转支付每月限额
     * @param ChangePayMonthly 转支付每月限额
     */
    public void setChangePayMonthly(Long ChangePayMonthly) {
        this.ChangePayMonthly = ChangePayMonthly;
    }

    /**
     * Get 本月已用转支付额度 
     * @return CurrentChangePayMonthly 本月已用转支付额度
     */
    public Long getCurrentChangePayMonthly() {
        return this.CurrentChangePayMonthly;
    }

    /**
     * Set 本月已用转支付额度
     * @param CurrentChangePayMonthly 本月已用转支付额度
     */
    public void setCurrentChangePayMonthly(Long CurrentChangePayMonthly) {
        this.CurrentChangePayMonthly = CurrentChangePayMonthly;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeEnvLimitResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeEnvLimitResponse(DescribeEnvLimitResponse source) {
        if (source.MaxEnvNum != null) {
            this.MaxEnvNum = new Long(source.MaxEnvNum);
        }
        if (source.CurrentEnvNum != null) {
            this.CurrentEnvNum = new Long(source.CurrentEnvNum);
        }
        if (source.MaxFreeEnvNum != null) {
            this.MaxFreeEnvNum = new Long(source.MaxFreeEnvNum);
        }
        if (source.CurrentFreeEnvNum != null) {
            this.CurrentFreeEnvNum = new Long(source.CurrentFreeEnvNum);
        }
        if (source.MaxDeleteTotal != null) {
            this.MaxDeleteTotal = new Long(source.MaxDeleteTotal);
        }
        if (source.CurrentDeleteTotal != null) {
            this.CurrentDeleteTotal = new Long(source.CurrentDeleteTotal);
        }
        if (source.MaxDeleteMonthly != null) {
            this.MaxDeleteMonthly = new Long(source.MaxDeleteMonthly);
        }
        if (source.CurrentDeleteMonthly != null) {
            this.CurrentDeleteMonthly = new Long(source.CurrentDeleteMonthly);
        }
        if (source.MaxFreeTrialNum != null) {
            this.MaxFreeTrialNum = new Long(source.MaxFreeTrialNum);
        }
        if (source.CurrentFreeTrialNum != null) {
            this.CurrentFreeTrialNum = new Long(source.CurrentFreeTrialNum);
        }
        if (source.ChangePayTotal != null) {
            this.ChangePayTotal = new Long(source.ChangePayTotal);
        }
        if (source.CurrentChangePayTotal != null) {
            this.CurrentChangePayTotal = new Long(source.CurrentChangePayTotal);
        }
        if (source.ChangePayMonthly != null) {
            this.ChangePayMonthly = new Long(source.ChangePayMonthly);
        }
        if (source.CurrentChangePayMonthly != null) {
            this.CurrentChangePayMonthly = new Long(source.CurrentChangePayMonthly);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MaxEnvNum", this.MaxEnvNum);
        this.setParamSimple(map, prefix + "CurrentEnvNum", this.CurrentEnvNum);
        this.setParamSimple(map, prefix + "MaxFreeEnvNum", this.MaxFreeEnvNum);
        this.setParamSimple(map, prefix + "CurrentFreeEnvNum", this.CurrentFreeEnvNum);
        this.setParamSimple(map, prefix + "MaxDeleteTotal", this.MaxDeleteTotal);
        this.setParamSimple(map, prefix + "CurrentDeleteTotal", this.CurrentDeleteTotal);
        this.setParamSimple(map, prefix + "MaxDeleteMonthly", this.MaxDeleteMonthly);
        this.setParamSimple(map, prefix + "CurrentDeleteMonthly", this.CurrentDeleteMonthly);
        this.setParamSimple(map, prefix + "MaxFreeTrialNum", this.MaxFreeTrialNum);
        this.setParamSimple(map, prefix + "CurrentFreeTrialNum", this.CurrentFreeTrialNum);
        this.setParamSimple(map, prefix + "ChangePayTotal", this.ChangePayTotal);
        this.setParamSimple(map, prefix + "CurrentChangePayTotal", this.CurrentChangePayTotal);
        this.setParamSimple(map, prefix + "ChangePayMonthly", this.ChangePayMonthly);
        this.setParamSimple(map, prefix + "CurrentChangePayMonthly", this.CurrentChangePayMonthly);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

