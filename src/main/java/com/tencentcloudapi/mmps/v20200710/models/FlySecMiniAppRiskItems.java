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
package com.tencentcloudapi.mmps.v20200710.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FlySecMiniAppRiskItems extends AbstractModel{

    /**
    * 代码防护(基础诊断)
    */
    @SerializedName("RiskItem1Score")
    @Expose
    private Long RiskItem1Score;

    /**
    * 开发测试信息泄露(基础诊断)
    */
    @SerializedName("RiskItem2Score")
    @Expose
    private Long RiskItem2Score;

    /**
    * 编码规范(基础诊断)
    */
    @SerializedName("RiskItem3Score")
    @Expose
    private Long RiskItem3Score;

    /**
    * 配置风险(基础诊断)
    */
    @SerializedName("RiskItem4Score")
    @Expose
    private Long RiskItem4Score;

    /**
    * 账号安全(基础诊断)
    */
    @SerializedName("RiskItem5Score")
    @Expose
    private Long RiskItem5Score;

    /**
    * 用户信息安全(基础诊断)
    */
    @SerializedName("RiskItem6Score")
    @Expose
    private Long RiskItem6Score;

    /**
    * 内部信息泄露(基础诊断)
    */
    @SerializedName("RiskItem7Score")
    @Expose
    private Long RiskItem7Score;

    /**
    * 其他安全(基础诊断)
    */
    @SerializedName("RiskItem8Score")
    @Expose
    private Long RiskItem8Score;

    /**
     * Get 代码防护(基础诊断) 
     * @return RiskItem1Score 代码防护(基础诊断)
     */
    public Long getRiskItem1Score() {
        return this.RiskItem1Score;
    }

    /**
     * Set 代码防护(基础诊断)
     * @param RiskItem1Score 代码防护(基础诊断)
     */
    public void setRiskItem1Score(Long RiskItem1Score) {
        this.RiskItem1Score = RiskItem1Score;
    }

    /**
     * Get 开发测试信息泄露(基础诊断) 
     * @return RiskItem2Score 开发测试信息泄露(基础诊断)
     */
    public Long getRiskItem2Score() {
        return this.RiskItem2Score;
    }

    /**
     * Set 开发测试信息泄露(基础诊断)
     * @param RiskItem2Score 开发测试信息泄露(基础诊断)
     */
    public void setRiskItem2Score(Long RiskItem2Score) {
        this.RiskItem2Score = RiskItem2Score;
    }

    /**
     * Get 编码规范(基础诊断) 
     * @return RiskItem3Score 编码规范(基础诊断)
     */
    public Long getRiskItem3Score() {
        return this.RiskItem3Score;
    }

    /**
     * Set 编码规范(基础诊断)
     * @param RiskItem3Score 编码规范(基础诊断)
     */
    public void setRiskItem3Score(Long RiskItem3Score) {
        this.RiskItem3Score = RiskItem3Score;
    }

    /**
     * Get 配置风险(基础诊断) 
     * @return RiskItem4Score 配置风险(基础诊断)
     */
    public Long getRiskItem4Score() {
        return this.RiskItem4Score;
    }

    /**
     * Set 配置风险(基础诊断)
     * @param RiskItem4Score 配置风险(基础诊断)
     */
    public void setRiskItem4Score(Long RiskItem4Score) {
        this.RiskItem4Score = RiskItem4Score;
    }

    /**
     * Get 账号安全(基础诊断) 
     * @return RiskItem5Score 账号安全(基础诊断)
     */
    public Long getRiskItem5Score() {
        return this.RiskItem5Score;
    }

    /**
     * Set 账号安全(基础诊断)
     * @param RiskItem5Score 账号安全(基础诊断)
     */
    public void setRiskItem5Score(Long RiskItem5Score) {
        this.RiskItem5Score = RiskItem5Score;
    }

    /**
     * Get 用户信息安全(基础诊断) 
     * @return RiskItem6Score 用户信息安全(基础诊断)
     */
    public Long getRiskItem6Score() {
        return this.RiskItem6Score;
    }

    /**
     * Set 用户信息安全(基础诊断)
     * @param RiskItem6Score 用户信息安全(基础诊断)
     */
    public void setRiskItem6Score(Long RiskItem6Score) {
        this.RiskItem6Score = RiskItem6Score;
    }

    /**
     * Get 内部信息泄露(基础诊断) 
     * @return RiskItem7Score 内部信息泄露(基础诊断)
     */
    public Long getRiskItem7Score() {
        return this.RiskItem7Score;
    }

    /**
     * Set 内部信息泄露(基础诊断)
     * @param RiskItem7Score 内部信息泄露(基础诊断)
     */
    public void setRiskItem7Score(Long RiskItem7Score) {
        this.RiskItem7Score = RiskItem7Score;
    }

    /**
     * Get 其他安全(基础诊断) 
     * @return RiskItem8Score 其他安全(基础诊断)
     */
    public Long getRiskItem8Score() {
        return this.RiskItem8Score;
    }

    /**
     * Set 其他安全(基础诊断)
     * @param RiskItem8Score 其他安全(基础诊断)
     */
    public void setRiskItem8Score(Long RiskItem8Score) {
        this.RiskItem8Score = RiskItem8Score;
    }

    public FlySecMiniAppRiskItems() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FlySecMiniAppRiskItems(FlySecMiniAppRiskItems source) {
        if (source.RiskItem1Score != null) {
            this.RiskItem1Score = new Long(source.RiskItem1Score);
        }
        if (source.RiskItem2Score != null) {
            this.RiskItem2Score = new Long(source.RiskItem2Score);
        }
        if (source.RiskItem3Score != null) {
            this.RiskItem3Score = new Long(source.RiskItem3Score);
        }
        if (source.RiskItem4Score != null) {
            this.RiskItem4Score = new Long(source.RiskItem4Score);
        }
        if (source.RiskItem5Score != null) {
            this.RiskItem5Score = new Long(source.RiskItem5Score);
        }
        if (source.RiskItem6Score != null) {
            this.RiskItem6Score = new Long(source.RiskItem6Score);
        }
        if (source.RiskItem7Score != null) {
            this.RiskItem7Score = new Long(source.RiskItem7Score);
        }
        if (source.RiskItem8Score != null) {
            this.RiskItem8Score = new Long(source.RiskItem8Score);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RiskItem1Score", this.RiskItem1Score);
        this.setParamSimple(map, prefix + "RiskItem2Score", this.RiskItem2Score);
        this.setParamSimple(map, prefix + "RiskItem3Score", this.RiskItem3Score);
        this.setParamSimple(map, prefix + "RiskItem4Score", this.RiskItem4Score);
        this.setParamSimple(map, prefix + "RiskItem5Score", this.RiskItem5Score);
        this.setParamSimple(map, prefix + "RiskItem6Score", this.RiskItem6Score);
        this.setParamSimple(map, prefix + "RiskItem7Score", this.RiskItem7Score);
        this.setParamSimple(map, prefix + "RiskItem8Score", this.RiskItem8Score);

    }
}

