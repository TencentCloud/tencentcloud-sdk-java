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

public class DescribeBillUsageDetailRequest extends AbstractModel {

    /**
    * <p>查询开始时间字符串，格式为yyyyMMdd，时间跨度不能大于31天。<font color="red">注意：从 2026年10月10日起，开始日期和结束日期必须在同一个自然月内，不支持跨月查询。</font></p><ul><li><p>正确示例：StartTime=20260901，EndTime=20260930。开始和结束日期都在 2026年9月，可以查询。</p></li><li><p>错误示例：StartTime=20260815，EndTime=20260915。开始日期在8月，结束日期在9月，属于跨月查询，不支持。</p></li></ul><p>参数格式：yyyyMMdd</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>查询结束时间字符串，格式为yyyyMMdd，时间跨度不能大于31天。<font color="red">注意：从 2026年10月10日起，开始日期和结束日期必须在同一个自然月内，不支持跨月查询。</font></p><ul><li><p>正确示例：StartTime=20260901，EndTime=20260930。开始和结束日期都在 2026年9月，可以查询。</p></li><li><p>错误示例：StartTime=20260815，EndTime=20260915。开始日期在8月，结束日期在9月，属于跨月查询，不支持。</p></li></ul><p>参数格式：yyyyMMdd</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>指定分页返回第几页的数据，如果不传默认返回第一页，页码从 0 开始，即首页为 0</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>指定分页每页返回的数据条数，如果不传默认为 100，单页最大支持 100。</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>查询的套餐类型 （选填 ）不传则查询所有套餐；<br>目前支持:</p><ul><li>**CloudEnterprise**: 企业版合同</li><li>**SingleSignature**: 单方签章</li><li>**CloudProve**: 签署报告</li><li>**CloudOnlineSign**: 腾讯会议在线签约</li><li>**ChannelWeCard**: 微工卡</li><li>**SignFlow**: 合同套餐</li><li>**SignFace**: 签署意愿（人脸识别）</li><li>**SignPassword**: 签署意愿（密码）</li><li>**SignSMS**: 签署意愿（短信）</li><li>**PersonalEssAuth**: 签署人实名（腾讯电子签认证）</li><li>**PersonalThirdAuth**: 签署人实名（信任第三方认证）</li><li>**OrgEssAuth**: 签署企业实名</li><li>**FlowNotify**: 短信通知</li><li>**AuthService**: 企业工商信息查询</li><li>**NoAuthSign**: 形式签</li></ul>
    */
    @SerializedName("QuotaType")
    @Expose
    private String QuotaType;

    /**
    * <p>代理企业和员工的信息。<br>在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。</p>
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
     * Get <p>查询开始时间字符串，格式为yyyyMMdd，时间跨度不能大于31天。<font color="red">注意：从 2026年10月10日起，开始日期和结束日期必须在同一个自然月内，不支持跨月查询。</font></p><ul><li><p>正确示例：StartTime=20260901，EndTime=20260930。开始和结束日期都在 2026年9月，可以查询。</p></li><li><p>错误示例：StartTime=20260815，EndTime=20260915。开始日期在8月，结束日期在9月，属于跨月查询，不支持。</p></li></ul><p>参数格式：yyyyMMdd</p> 
     * @return StartTime <p>查询开始时间字符串，格式为yyyyMMdd，时间跨度不能大于31天。<font color="red">注意：从 2026年10月10日起，开始日期和结束日期必须在同一个自然月内，不支持跨月查询。</font></p><ul><li><p>正确示例：StartTime=20260901，EndTime=20260930。开始和结束日期都在 2026年9月，可以查询。</p></li><li><p>错误示例：StartTime=20260815，EndTime=20260915。开始日期在8月，结束日期在9月，属于跨月查询，不支持。</p></li></ul><p>参数格式：yyyyMMdd</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>查询开始时间字符串，格式为yyyyMMdd，时间跨度不能大于31天。<font color="red">注意：从 2026年10月10日起，开始日期和结束日期必须在同一个自然月内，不支持跨月查询。</font></p><ul><li><p>正确示例：StartTime=20260901，EndTime=20260930。开始和结束日期都在 2026年9月，可以查询。</p></li><li><p>错误示例：StartTime=20260815，EndTime=20260915。开始日期在8月，结束日期在9月，属于跨月查询，不支持。</p></li></ul><p>参数格式：yyyyMMdd</p>
     * @param StartTime <p>查询开始时间字符串，格式为yyyyMMdd，时间跨度不能大于31天。<font color="red">注意：从 2026年10月10日起，开始日期和结束日期必须在同一个自然月内，不支持跨月查询。</font></p><ul><li><p>正确示例：StartTime=20260901，EndTime=20260930。开始和结束日期都在 2026年9月，可以查询。</p></li><li><p>错误示例：StartTime=20260815，EndTime=20260915。开始日期在8月，结束日期在9月，属于跨月查询，不支持。</p></li></ul><p>参数格式：yyyyMMdd</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>查询结束时间字符串，格式为yyyyMMdd，时间跨度不能大于31天。<font color="red">注意：从 2026年10月10日起，开始日期和结束日期必须在同一个自然月内，不支持跨月查询。</font></p><ul><li><p>正确示例：StartTime=20260901，EndTime=20260930。开始和结束日期都在 2026年9月，可以查询。</p></li><li><p>错误示例：StartTime=20260815，EndTime=20260915。开始日期在8月，结束日期在9月，属于跨月查询，不支持。</p></li></ul><p>参数格式：yyyyMMdd</p> 
     * @return EndTime <p>查询结束时间字符串，格式为yyyyMMdd，时间跨度不能大于31天。<font color="red">注意：从 2026年10月10日起，开始日期和结束日期必须在同一个自然月内，不支持跨月查询。</font></p><ul><li><p>正确示例：StartTime=20260901，EndTime=20260930。开始和结束日期都在 2026年9月，可以查询。</p></li><li><p>错误示例：StartTime=20260815，EndTime=20260915。开始日期在8月，结束日期在9月，属于跨月查询，不支持。</p></li></ul><p>参数格式：yyyyMMdd</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>查询结束时间字符串，格式为yyyyMMdd，时间跨度不能大于31天。<font color="red">注意：从 2026年10月10日起，开始日期和结束日期必须在同一个自然月内，不支持跨月查询。</font></p><ul><li><p>正确示例：StartTime=20260901，EndTime=20260930。开始和结束日期都在 2026年9月，可以查询。</p></li><li><p>错误示例：StartTime=20260815，EndTime=20260915。开始日期在8月，结束日期在9月，属于跨月查询，不支持。</p></li></ul><p>参数格式：yyyyMMdd</p>
     * @param EndTime <p>查询结束时间字符串，格式为yyyyMMdd，时间跨度不能大于31天。<font color="red">注意：从 2026年10月10日起，开始日期和结束日期必须在同一个自然月内，不支持跨月查询。</font></p><ul><li><p>正确示例：StartTime=20260901，EndTime=20260930。开始和结束日期都在 2026年9月，可以查询。</p></li><li><p>错误示例：StartTime=20260815，EndTime=20260915。开始日期在8月，结束日期在9月，属于跨月查询，不支持。</p></li></ul><p>参数格式：yyyyMMdd</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>指定分页返回第几页的数据，如果不传默认返回第一页，页码从 0 开始，即首页为 0</p> 
     * @return Offset <p>指定分页返回第几页的数据，如果不传默认返回第一页，页码从 0 开始，即首页为 0</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>指定分页返回第几页的数据，如果不传默认返回第一页，页码从 0 开始，即首页为 0</p>
     * @param Offset <p>指定分页返回第几页的数据，如果不传默认返回第一页，页码从 0 开始，即首页为 0</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>指定分页每页返回的数据条数，如果不传默认为 100，单页最大支持 100。</p> 
     * @return Limit <p>指定分页每页返回的数据条数，如果不传默认为 100，单页最大支持 100。</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>指定分页每页返回的数据条数，如果不传默认为 100，单页最大支持 100。</p>
     * @param Limit <p>指定分页每页返回的数据条数，如果不传默认为 100，单页最大支持 100。</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>查询的套餐类型 （选填 ）不传则查询所有套餐；<br>目前支持:</p><ul><li>**CloudEnterprise**: 企业版合同</li><li>**SingleSignature**: 单方签章</li><li>**CloudProve**: 签署报告</li><li>**CloudOnlineSign**: 腾讯会议在线签约</li><li>**ChannelWeCard**: 微工卡</li><li>**SignFlow**: 合同套餐</li><li>**SignFace**: 签署意愿（人脸识别）</li><li>**SignPassword**: 签署意愿（密码）</li><li>**SignSMS**: 签署意愿（短信）</li><li>**PersonalEssAuth**: 签署人实名（腾讯电子签认证）</li><li>**PersonalThirdAuth**: 签署人实名（信任第三方认证）</li><li>**OrgEssAuth**: 签署企业实名</li><li>**FlowNotify**: 短信通知</li><li>**AuthService**: 企业工商信息查询</li><li>**NoAuthSign**: 形式签</li></ul> 
     * @return QuotaType <p>查询的套餐类型 （选填 ）不传则查询所有套餐；<br>目前支持:</p><ul><li>**CloudEnterprise**: 企业版合同</li><li>**SingleSignature**: 单方签章</li><li>**CloudProve**: 签署报告</li><li>**CloudOnlineSign**: 腾讯会议在线签约</li><li>**ChannelWeCard**: 微工卡</li><li>**SignFlow**: 合同套餐</li><li>**SignFace**: 签署意愿（人脸识别）</li><li>**SignPassword**: 签署意愿（密码）</li><li>**SignSMS**: 签署意愿（短信）</li><li>**PersonalEssAuth**: 签署人实名（腾讯电子签认证）</li><li>**PersonalThirdAuth**: 签署人实名（信任第三方认证）</li><li>**OrgEssAuth**: 签署企业实名</li><li>**FlowNotify**: 短信通知</li><li>**AuthService**: 企业工商信息查询</li><li>**NoAuthSign**: 形式签</li></ul>
     */
    public String getQuotaType() {
        return this.QuotaType;
    }

    /**
     * Set <p>查询的套餐类型 （选填 ）不传则查询所有套餐；<br>目前支持:</p><ul><li>**CloudEnterprise**: 企业版合同</li><li>**SingleSignature**: 单方签章</li><li>**CloudProve**: 签署报告</li><li>**CloudOnlineSign**: 腾讯会议在线签约</li><li>**ChannelWeCard**: 微工卡</li><li>**SignFlow**: 合同套餐</li><li>**SignFace**: 签署意愿（人脸识别）</li><li>**SignPassword**: 签署意愿（密码）</li><li>**SignSMS**: 签署意愿（短信）</li><li>**PersonalEssAuth**: 签署人实名（腾讯电子签认证）</li><li>**PersonalThirdAuth**: 签署人实名（信任第三方认证）</li><li>**OrgEssAuth**: 签署企业实名</li><li>**FlowNotify**: 短信通知</li><li>**AuthService**: 企业工商信息查询</li><li>**NoAuthSign**: 形式签</li></ul>
     * @param QuotaType <p>查询的套餐类型 （选填 ）不传则查询所有套餐；<br>目前支持:</p><ul><li>**CloudEnterprise**: 企业版合同</li><li>**SingleSignature**: 单方签章</li><li>**CloudProve**: 签署报告</li><li>**CloudOnlineSign**: 腾讯会议在线签约</li><li>**ChannelWeCard**: 微工卡</li><li>**SignFlow**: 合同套餐</li><li>**SignFace**: 签署意愿（人脸识别）</li><li>**SignPassword**: 签署意愿（密码）</li><li>**SignSMS**: 签署意愿（短信）</li><li>**PersonalEssAuth**: 签署人实名（腾讯电子签认证）</li><li>**PersonalThirdAuth**: 签署人实名（信任第三方认证）</li><li>**OrgEssAuth**: 签署企业实名</li><li>**FlowNotify**: 短信通知</li><li>**AuthService**: 企业工商信息查询</li><li>**NoAuthSign**: 形式签</li></ul>
     */
    public void setQuotaType(String QuotaType) {
        this.QuotaType = QuotaType;
    }

    /**
     * Get <p>代理企业和员工的信息。<br>在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。</p> 
     * @return Agent <p>代理企业和员工的信息。<br>在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。</p>
     */
    public Agent getAgent() {
        return this.Agent;
    }

    /**
     * Set <p>代理企业和员工的信息。<br>在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。</p>
     * @param Agent <p>代理企业和员工的信息。<br>在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。</p>
     */
    public void setAgent(Agent Agent) {
        this.Agent = Agent;
    }

    public DescribeBillUsageDetailRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBillUsageDetailRequest(DescribeBillUsageDetailRequest source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.QuotaType != null) {
            this.QuotaType = new String(source.QuotaType);
        }
        if (source.Agent != null) {
            this.Agent = new Agent(source.Agent);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "QuotaType", this.QuotaType);
        this.setParamObj(map, prefix + "Agent.", this.Agent);

    }
}

