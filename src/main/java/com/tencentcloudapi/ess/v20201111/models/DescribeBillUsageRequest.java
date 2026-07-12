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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBillUsageRequest extends AbstractModel {

    /**
    * <p>查询开始时间字符串，格式为yyyymmdd,时间跨度不能大于90天</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>查询结束时间字符串，格式为yyyymmdd,时间跨度不能大于90天</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>查询的套餐类型 （选填 ）不传则查询所有套餐；目前支持:<ul><li><strong>CloudEnterprise</strong>: 企业版合同</li><li><strong>SingleSignature</strong>: 单方签章</li><li><strong>CloudProve</strong>: 签署报告</li><li><strong>CloudOnlineSign</strong>: 腾讯会议在线签约</li><li><strong>ChannelWeCard</strong>: 微工卡</li><li><strong>SignFlow</strong>: 合同套餐</li><li><strong>SignFace</strong>: 签署意愿（人脸识别）</li><li><strong>SignPassword</strong>: 签署意愿（密码）</li><li><strong>SignSMS</strong>: 签署意愿（短信）</li><li><strong>PersonalEssAuth</strong>: 签署人实名（腾讯电子签认证）</li><li><strong>PersonalThirdAuth</strong>: 签署人实名（信任第三方认证）</li><li><strong>OrgEssAuth</strong>: 签署企业实名</li><li><strong>FlowNotify</strong>: 短信通知</li><li><strong>AuthService</strong>: 企业工商信息查询</li></ul></p>
    */
    @SerializedName("QuotaType")
    @Expose
    private String QuotaType;

    /**
    * <p>是否展示集团子企业的明细，默认否</p>
    */
    @SerializedName("DisplaySubEnterprise")
    @Expose
    private Boolean DisplaySubEnterprise;

    /**
     * Get <p>查询开始时间字符串，格式为yyyymmdd,时间跨度不能大于90天</p> 
     * @return StartTime <p>查询开始时间字符串，格式为yyyymmdd,时间跨度不能大于90天</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>查询开始时间字符串，格式为yyyymmdd,时间跨度不能大于90天</p>
     * @param StartTime <p>查询开始时间字符串，格式为yyyymmdd,时间跨度不能大于90天</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>查询结束时间字符串，格式为yyyymmdd,时间跨度不能大于90天</p> 
     * @return EndTime <p>查询结束时间字符串，格式为yyyymmdd,时间跨度不能大于90天</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>查询结束时间字符串，格式为yyyymmdd,时间跨度不能大于90天</p>
     * @param EndTime <p>查询结束时间字符串，格式为yyyymmdd,时间跨度不能大于90天</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>查询的套餐类型 （选填 ）不传则查询所有套餐；目前支持:<ul><li><strong>CloudEnterprise</strong>: 企业版合同</li><li><strong>SingleSignature</strong>: 单方签章</li><li><strong>CloudProve</strong>: 签署报告</li><li><strong>CloudOnlineSign</strong>: 腾讯会议在线签约</li><li><strong>ChannelWeCard</strong>: 微工卡</li><li><strong>SignFlow</strong>: 合同套餐</li><li><strong>SignFace</strong>: 签署意愿（人脸识别）</li><li><strong>SignPassword</strong>: 签署意愿（密码）</li><li><strong>SignSMS</strong>: 签署意愿（短信）</li><li><strong>PersonalEssAuth</strong>: 签署人实名（腾讯电子签认证）</li><li><strong>PersonalThirdAuth</strong>: 签署人实名（信任第三方认证）</li><li><strong>OrgEssAuth</strong>: 签署企业实名</li><li><strong>FlowNotify</strong>: 短信通知</li><li><strong>AuthService</strong>: 企业工商信息查询</li></ul></p> 
     * @return QuotaType <p>查询的套餐类型 （选填 ）不传则查询所有套餐；目前支持:<ul><li><strong>CloudEnterprise</strong>: 企业版合同</li><li><strong>SingleSignature</strong>: 单方签章</li><li><strong>CloudProve</strong>: 签署报告</li><li><strong>CloudOnlineSign</strong>: 腾讯会议在线签约</li><li><strong>ChannelWeCard</strong>: 微工卡</li><li><strong>SignFlow</strong>: 合同套餐</li><li><strong>SignFace</strong>: 签署意愿（人脸识别）</li><li><strong>SignPassword</strong>: 签署意愿（密码）</li><li><strong>SignSMS</strong>: 签署意愿（短信）</li><li><strong>PersonalEssAuth</strong>: 签署人实名（腾讯电子签认证）</li><li><strong>PersonalThirdAuth</strong>: 签署人实名（信任第三方认证）</li><li><strong>OrgEssAuth</strong>: 签署企业实名</li><li><strong>FlowNotify</strong>: 短信通知</li><li><strong>AuthService</strong>: 企业工商信息查询</li></ul></p>
     */
    public String getQuotaType() {
        return this.QuotaType;
    }

    /**
     * Set <p>查询的套餐类型 （选填 ）不传则查询所有套餐；目前支持:<ul><li><strong>CloudEnterprise</strong>: 企业版合同</li><li><strong>SingleSignature</strong>: 单方签章</li><li><strong>CloudProve</strong>: 签署报告</li><li><strong>CloudOnlineSign</strong>: 腾讯会议在线签约</li><li><strong>ChannelWeCard</strong>: 微工卡</li><li><strong>SignFlow</strong>: 合同套餐</li><li><strong>SignFace</strong>: 签署意愿（人脸识别）</li><li><strong>SignPassword</strong>: 签署意愿（密码）</li><li><strong>SignSMS</strong>: 签署意愿（短信）</li><li><strong>PersonalEssAuth</strong>: 签署人实名（腾讯电子签认证）</li><li><strong>PersonalThirdAuth</strong>: 签署人实名（信任第三方认证）</li><li><strong>OrgEssAuth</strong>: 签署企业实名</li><li><strong>FlowNotify</strong>: 短信通知</li><li><strong>AuthService</strong>: 企业工商信息查询</li></ul></p>
     * @param QuotaType <p>查询的套餐类型 （选填 ）不传则查询所有套餐；目前支持:<ul><li><strong>CloudEnterprise</strong>: 企业版合同</li><li><strong>SingleSignature</strong>: 单方签章</li><li><strong>CloudProve</strong>: 签署报告</li><li><strong>CloudOnlineSign</strong>: 腾讯会议在线签约</li><li><strong>ChannelWeCard</strong>: 微工卡</li><li><strong>SignFlow</strong>: 合同套餐</li><li><strong>SignFace</strong>: 签署意愿（人脸识别）</li><li><strong>SignPassword</strong>: 签署意愿（密码）</li><li><strong>SignSMS</strong>: 签署意愿（短信）</li><li><strong>PersonalEssAuth</strong>: 签署人实名（腾讯电子签认证）</li><li><strong>PersonalThirdAuth</strong>: 签署人实名（信任第三方认证）</li><li><strong>OrgEssAuth</strong>: 签署企业实名</li><li><strong>FlowNotify</strong>: 短信通知</li><li><strong>AuthService</strong>: 企业工商信息查询</li></ul></p>
     */
    public void setQuotaType(String QuotaType) {
        this.QuotaType = QuotaType;
    }

    /**
     * Get <p>是否展示集团子企业的明细，默认否</p> 
     * @return DisplaySubEnterprise <p>是否展示集团子企业的明细，默认否</p>
     */
    public Boolean getDisplaySubEnterprise() {
        return this.DisplaySubEnterprise;
    }

    /**
     * Set <p>是否展示集团子企业的明细，默认否</p>
     * @param DisplaySubEnterprise <p>是否展示集团子企业的明细，默认否</p>
     */
    public void setDisplaySubEnterprise(Boolean DisplaySubEnterprise) {
        this.DisplaySubEnterprise = DisplaySubEnterprise;
    }

    public DescribeBillUsageRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBillUsageRequest(DescribeBillUsageRequest source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.QuotaType != null) {
            this.QuotaType = new String(source.QuotaType);
        }
        if (source.DisplaySubEnterprise != null) {
            this.DisplaySubEnterprise = new Boolean(source.DisplaySubEnterprise);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "QuotaType", this.QuotaType);
        this.setParamSimple(map, prefix + "DisplaySubEnterprise", this.DisplaySubEnterprise);

    }
}

