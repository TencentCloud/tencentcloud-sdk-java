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
package com.tencentcloudapi.faceid.v20180301.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExtraRiskResult extends AbstractModel {

    /**
    * <p>本次附加检查的完成度，回答“这次结果可否采信”。</p><p>枚举值：</p><ul><li>Completed： 本次请求所需的检查均已给出结论（命中或通过）</li><li>Partial： 至少一项检查未能给出结论：依赖不可用、数据不足、入参不完整或非法。结果仅供参考，不代表安全</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>附加风险等级，可能为空字符串</p><p>枚举值：</p><ul><li>High： 存在已生效的风险命中项（此时 RiskDetailList 非空）</li><li>Low： 检查已完成，且确认无命中</li><li>&quot;&quot;（空字符串）    ： 未识别：本次没有任何一项检查能给出结论，或检查未全部完成。既不代表有风险，也不代表安全</li></ul>
    */
    @SerializedName("RiskLevel")
    @Expose
    private String RiskLevel;

    /**
    * <p>命中的风险项列表，未命中时为空数组 []</p>
    */
    @SerializedName("BlackListResult")
    @Expose
    private BlackListItem [] BlackListResult;

    /**
    * <p>人脸黑名单命中明细，未命中时为空数组 []</p>
    */
    @SerializedName("RiskDetailList")
    @Expose
    private RiskDetailItem [] RiskDetailList;

    /**
     * Get <p>本次附加检查的完成度，回答“这次结果可否采信”。</p><p>枚举值：</p><ul><li>Completed： 本次请求所需的检查均已给出结论（命中或通过）</li><li>Partial： 至少一项检查未能给出结论：依赖不可用、数据不足、入参不完整或非法。结果仅供参考，不代表安全</li></ul> 
     * @return Status <p>本次附加检查的完成度，回答“这次结果可否采信”。</p><p>枚举值：</p><ul><li>Completed： 本次请求所需的检查均已给出结论（命中或通过）</li><li>Partial： 至少一项检查未能给出结论：依赖不可用、数据不足、入参不完整或非法。结果仅供参考，不代表安全</li></ul>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>本次附加检查的完成度，回答“这次结果可否采信”。</p><p>枚举值：</p><ul><li>Completed： 本次请求所需的检查均已给出结论（命中或通过）</li><li>Partial： 至少一项检查未能给出结论：依赖不可用、数据不足、入参不完整或非法。结果仅供参考，不代表安全</li></ul>
     * @param Status <p>本次附加检查的完成度，回答“这次结果可否采信”。</p><p>枚举值：</p><ul><li>Completed： 本次请求所需的检查均已给出结论（命中或通过）</li><li>Partial： 至少一项检查未能给出结论：依赖不可用、数据不足、入参不完整或非法。结果仅供参考，不代表安全</li></ul>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>附加风险等级，可能为空字符串</p><p>枚举值：</p><ul><li>High： 存在已生效的风险命中项（此时 RiskDetailList 非空）</li><li>Low： 检查已完成，且确认无命中</li><li>&quot;&quot;（空字符串）    ： 未识别：本次没有任何一项检查能给出结论，或检查未全部完成。既不代表有风险，也不代表安全</li></ul> 
     * @return RiskLevel <p>附加风险等级，可能为空字符串</p><p>枚举值：</p><ul><li>High： 存在已生效的风险命中项（此时 RiskDetailList 非空）</li><li>Low： 检查已完成，且确认无命中</li><li>&quot;&quot;（空字符串）    ： 未识别：本次没有任何一项检查能给出结论，或检查未全部完成。既不代表有风险，也不代表安全</li></ul>
     */
    public String getRiskLevel() {
        return this.RiskLevel;
    }

    /**
     * Set <p>附加风险等级，可能为空字符串</p><p>枚举值：</p><ul><li>High： 存在已生效的风险命中项（此时 RiskDetailList 非空）</li><li>Low： 检查已完成，且确认无命中</li><li>&quot;&quot;（空字符串）    ： 未识别：本次没有任何一项检查能给出结论，或检查未全部完成。既不代表有风险，也不代表安全</li></ul>
     * @param RiskLevel <p>附加风险等级，可能为空字符串</p><p>枚举值：</p><ul><li>High： 存在已生效的风险命中项（此时 RiskDetailList 非空）</li><li>Low： 检查已完成，且确认无命中</li><li>&quot;&quot;（空字符串）    ： 未识别：本次没有任何一项检查能给出结论，或检查未全部完成。既不代表有风险，也不代表安全</li></ul>
     */
    public void setRiskLevel(String RiskLevel) {
        this.RiskLevel = RiskLevel;
    }

    /**
     * Get <p>命中的风险项列表，未命中时为空数组 []</p> 
     * @return BlackListResult <p>命中的风险项列表，未命中时为空数组 []</p>
     */
    public BlackListItem [] getBlackListResult() {
        return this.BlackListResult;
    }

    /**
     * Set <p>命中的风险项列表，未命中时为空数组 []</p>
     * @param BlackListResult <p>命中的风险项列表，未命中时为空数组 []</p>
     */
    public void setBlackListResult(BlackListItem [] BlackListResult) {
        this.BlackListResult = BlackListResult;
    }

    /**
     * Get <p>人脸黑名单命中明细，未命中时为空数组 []</p> 
     * @return RiskDetailList <p>人脸黑名单命中明细，未命中时为空数组 []</p>
     */
    public RiskDetailItem [] getRiskDetailList() {
        return this.RiskDetailList;
    }

    /**
     * Set <p>人脸黑名单命中明细，未命中时为空数组 []</p>
     * @param RiskDetailList <p>人脸黑名单命中明细，未命中时为空数组 []</p>
     */
    public void setRiskDetailList(RiskDetailItem [] RiskDetailList) {
        this.RiskDetailList = RiskDetailList;
    }

    public ExtraRiskResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExtraRiskResult(ExtraRiskResult source) {
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.RiskLevel != null) {
            this.RiskLevel = new String(source.RiskLevel);
        }
        if (source.BlackListResult != null) {
            this.BlackListResult = new BlackListItem[source.BlackListResult.length];
            for (int i = 0; i < source.BlackListResult.length; i++) {
                this.BlackListResult[i] = new BlackListItem(source.BlackListResult[i]);
            }
        }
        if (source.RiskDetailList != null) {
            this.RiskDetailList = new RiskDetailItem[source.RiskDetailList.length];
            for (int i = 0; i < source.RiskDetailList.length; i++) {
                this.RiskDetailList[i] = new RiskDetailItem(source.RiskDetailList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "RiskLevel", this.RiskLevel);
        this.setParamArrayObj(map, prefix + "BlackListResult.", this.BlackListResult);
        this.setParamArrayObj(map, prefix + "RiskDetailList.", this.RiskDetailList);

    }
}

