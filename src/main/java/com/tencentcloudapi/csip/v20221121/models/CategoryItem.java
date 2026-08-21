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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CategoryItem extends AbstractModel {

    /**
    * <p>子项ID<br>枚举值：<br>vulnerability：漏洞治理<br>cloud_config：云产品配置治理<br>system_baseline：系统基线风险<br>intrusion_alert：入侵威胁告警<br>cloud_api_alert：云API告警<br>ai_agent_alert：AI Agent安全告警<br>object_storage_alert：对象存储异常告警<br>database_alert：数据库安全告警<br>protection_config：推荐防护配置未开启<br>edition_coverage：专业版/旗舰版覆盖率不足<br>product_expiry：产品7天内到期</p>
    */
    @SerializedName("CategoryId")
    @Expose
    private String CategoryId;

    /**
    * <p>子项名称</p>
    */
    @SerializedName("CategoryName")
    @Expose
    private String CategoryName;

    /**
    * <p>子类说明</p>
    */
    @SerializedName("CategoryDesc")
    @Expose
    private String CategoryDesc;

    /**
    * <p>子项扣分上限</p>
    */
    @SerializedName("MaxDeductScore")
    @Expose
    private Long MaxDeductScore;

    /**
    * <p>子项实际扣分</p>
    */
    @SerializedName("DeductScore")
    @Expose
    private Long DeductScore;

    /**
    * <p>风险总数</p>
    */
    @SerializedName("RiskCount")
    @Expose
    private Long RiskCount;

    /**
    * <p>等级明细，风险/威胁类子项有值</p>
    */
    @SerializedName("SeverityItems")
    @Expose
    private SeverityItem [] SeverityItems;

    /**
    * <p>扣分原因描述</p>
    */
    @SerializedName("DeductReason")
    @Expose
    private String DeductReason;

    /**
    * <p>处理建议文案</p>
    */
    @SerializedName("ActionText")
    @Expose
    private String ActionText;

    /**
    * <p>防护配置详情，仅防护配置维度子项返回</p>
    */
    @SerializedName("ProtectionDetail")
    @Expose
    private ProtectionDetail ProtectionDetail;

    /**
     * Get <p>子项ID<br>枚举值：<br>vulnerability：漏洞治理<br>cloud_config：云产品配置治理<br>system_baseline：系统基线风险<br>intrusion_alert：入侵威胁告警<br>cloud_api_alert：云API告警<br>ai_agent_alert：AI Agent安全告警<br>object_storage_alert：对象存储异常告警<br>database_alert：数据库安全告警<br>protection_config：推荐防护配置未开启<br>edition_coverage：专业版/旗舰版覆盖率不足<br>product_expiry：产品7天内到期</p> 
     * @return CategoryId <p>子项ID<br>枚举值：<br>vulnerability：漏洞治理<br>cloud_config：云产品配置治理<br>system_baseline：系统基线风险<br>intrusion_alert：入侵威胁告警<br>cloud_api_alert：云API告警<br>ai_agent_alert：AI Agent安全告警<br>object_storage_alert：对象存储异常告警<br>database_alert：数据库安全告警<br>protection_config：推荐防护配置未开启<br>edition_coverage：专业版/旗舰版覆盖率不足<br>product_expiry：产品7天内到期</p>
     */
    public String getCategoryId() {
        return this.CategoryId;
    }

    /**
     * Set <p>子项ID<br>枚举值：<br>vulnerability：漏洞治理<br>cloud_config：云产品配置治理<br>system_baseline：系统基线风险<br>intrusion_alert：入侵威胁告警<br>cloud_api_alert：云API告警<br>ai_agent_alert：AI Agent安全告警<br>object_storage_alert：对象存储异常告警<br>database_alert：数据库安全告警<br>protection_config：推荐防护配置未开启<br>edition_coverage：专业版/旗舰版覆盖率不足<br>product_expiry：产品7天内到期</p>
     * @param CategoryId <p>子项ID<br>枚举值：<br>vulnerability：漏洞治理<br>cloud_config：云产品配置治理<br>system_baseline：系统基线风险<br>intrusion_alert：入侵威胁告警<br>cloud_api_alert：云API告警<br>ai_agent_alert：AI Agent安全告警<br>object_storage_alert：对象存储异常告警<br>database_alert：数据库安全告警<br>protection_config：推荐防护配置未开启<br>edition_coverage：专业版/旗舰版覆盖率不足<br>product_expiry：产品7天内到期</p>
     */
    public void setCategoryId(String CategoryId) {
        this.CategoryId = CategoryId;
    }

    /**
     * Get <p>子项名称</p> 
     * @return CategoryName <p>子项名称</p>
     */
    public String getCategoryName() {
        return this.CategoryName;
    }

    /**
     * Set <p>子项名称</p>
     * @param CategoryName <p>子项名称</p>
     */
    public void setCategoryName(String CategoryName) {
        this.CategoryName = CategoryName;
    }

    /**
     * Get <p>子类说明</p> 
     * @return CategoryDesc <p>子类说明</p>
     */
    public String getCategoryDesc() {
        return this.CategoryDesc;
    }

    /**
     * Set <p>子类说明</p>
     * @param CategoryDesc <p>子类说明</p>
     */
    public void setCategoryDesc(String CategoryDesc) {
        this.CategoryDesc = CategoryDesc;
    }

    /**
     * Get <p>子项扣分上限</p> 
     * @return MaxDeductScore <p>子项扣分上限</p>
     */
    public Long getMaxDeductScore() {
        return this.MaxDeductScore;
    }

    /**
     * Set <p>子项扣分上限</p>
     * @param MaxDeductScore <p>子项扣分上限</p>
     */
    public void setMaxDeductScore(Long MaxDeductScore) {
        this.MaxDeductScore = MaxDeductScore;
    }

    /**
     * Get <p>子项实际扣分</p> 
     * @return DeductScore <p>子项实际扣分</p>
     */
    public Long getDeductScore() {
        return this.DeductScore;
    }

    /**
     * Set <p>子项实际扣分</p>
     * @param DeductScore <p>子项实际扣分</p>
     */
    public void setDeductScore(Long DeductScore) {
        this.DeductScore = DeductScore;
    }

    /**
     * Get <p>风险总数</p> 
     * @return RiskCount <p>风险总数</p>
     */
    public Long getRiskCount() {
        return this.RiskCount;
    }

    /**
     * Set <p>风险总数</p>
     * @param RiskCount <p>风险总数</p>
     */
    public void setRiskCount(Long RiskCount) {
        this.RiskCount = RiskCount;
    }

    /**
     * Get <p>等级明细，风险/威胁类子项有值</p> 
     * @return SeverityItems <p>等级明细，风险/威胁类子项有值</p>
     */
    public SeverityItem [] getSeverityItems() {
        return this.SeverityItems;
    }

    /**
     * Set <p>等级明细，风险/威胁类子项有值</p>
     * @param SeverityItems <p>等级明细，风险/威胁类子项有值</p>
     */
    public void setSeverityItems(SeverityItem [] SeverityItems) {
        this.SeverityItems = SeverityItems;
    }

    /**
     * Get <p>扣分原因描述</p> 
     * @return DeductReason <p>扣分原因描述</p>
     */
    public String getDeductReason() {
        return this.DeductReason;
    }

    /**
     * Set <p>扣分原因描述</p>
     * @param DeductReason <p>扣分原因描述</p>
     */
    public void setDeductReason(String DeductReason) {
        this.DeductReason = DeductReason;
    }

    /**
     * Get <p>处理建议文案</p> 
     * @return ActionText <p>处理建议文案</p>
     */
    public String getActionText() {
        return this.ActionText;
    }

    /**
     * Set <p>处理建议文案</p>
     * @param ActionText <p>处理建议文案</p>
     */
    public void setActionText(String ActionText) {
        this.ActionText = ActionText;
    }

    /**
     * Get <p>防护配置详情，仅防护配置维度子项返回</p> 
     * @return ProtectionDetail <p>防护配置详情，仅防护配置维度子项返回</p>
     */
    public ProtectionDetail getProtectionDetail() {
        return this.ProtectionDetail;
    }

    /**
     * Set <p>防护配置详情，仅防护配置维度子项返回</p>
     * @param ProtectionDetail <p>防护配置详情，仅防护配置维度子项返回</p>
     */
    public void setProtectionDetail(ProtectionDetail ProtectionDetail) {
        this.ProtectionDetail = ProtectionDetail;
    }

    public CategoryItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CategoryItem(CategoryItem source) {
        if (source.CategoryId != null) {
            this.CategoryId = new String(source.CategoryId);
        }
        if (source.CategoryName != null) {
            this.CategoryName = new String(source.CategoryName);
        }
        if (source.CategoryDesc != null) {
            this.CategoryDesc = new String(source.CategoryDesc);
        }
        if (source.MaxDeductScore != null) {
            this.MaxDeductScore = new Long(source.MaxDeductScore);
        }
        if (source.DeductScore != null) {
            this.DeductScore = new Long(source.DeductScore);
        }
        if (source.RiskCount != null) {
            this.RiskCount = new Long(source.RiskCount);
        }
        if (source.SeverityItems != null) {
            this.SeverityItems = new SeverityItem[source.SeverityItems.length];
            for (int i = 0; i < source.SeverityItems.length; i++) {
                this.SeverityItems[i] = new SeverityItem(source.SeverityItems[i]);
            }
        }
        if (source.DeductReason != null) {
            this.DeductReason = new String(source.DeductReason);
        }
        if (source.ActionText != null) {
            this.ActionText = new String(source.ActionText);
        }
        if (source.ProtectionDetail != null) {
            this.ProtectionDetail = new ProtectionDetail(source.ProtectionDetail);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CategoryId", this.CategoryId);
        this.setParamSimple(map, prefix + "CategoryName", this.CategoryName);
        this.setParamSimple(map, prefix + "CategoryDesc", this.CategoryDesc);
        this.setParamSimple(map, prefix + "MaxDeductScore", this.MaxDeductScore);
        this.setParamSimple(map, prefix + "DeductScore", this.DeductScore);
        this.setParamSimple(map, prefix + "RiskCount", this.RiskCount);
        this.setParamArrayObj(map, prefix + "SeverityItems.", this.SeverityItems);
        this.setParamSimple(map, prefix + "DeductReason", this.DeductReason);
        this.setParamSimple(map, prefix + "ActionText", this.ActionText);
        this.setParamObj(map, prefix + "ProtectionDetail.", this.ProtectionDetail);

    }
}

