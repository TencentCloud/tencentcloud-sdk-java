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

public class BatchModifyBaselinePolicyRequest extends AbstractModel {

    /**
    * <p>待修改的基线策略 ID 列表，不可为空且元素不可为 0。</p>
    */
    @SerializedName("PolicyIDList")
    @Expose
    private Long [] PolicyIDList;

    /**
    * <p>周期扫描配置；不修改时可省略。Enable=1 时必须同时传 IntervalType 与 IntervalValueList。</p>
    */
    @SerializedName("CycleScanConf")
    @Expose
    private CycleScanConf CycleScanConf;

    /**
    * <p>新增内置检测项自动同步开关。true 自动加入，false 不加入。</p>
    */
    @SerializedName("AutoSyncItem")
    @Expose
    private Boolean AutoSyncItem;

    /**
    * <p>分类 / 子分类 / 检测项命中配置；不修改时可省略。</p>
    */
    @SerializedName("CategoryConf")
    @Expose
    private BaselinePolicySystemCategoryConf [] CategoryConf;

    /**
    * <p>集团账号的成员id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>自定义检测项取值配置列表；不修改时可省略。每个元素 RuleID 与 CustomItemID 不能同时为 0。</p>
    */
    @SerializedName("CustomItemConf")
    @Expose
    private BaselineCustomItemConf [] CustomItemConf;

    /**
     * Get <p>待修改的基线策略 ID 列表，不可为空且元素不可为 0。</p> 
     * @return PolicyIDList <p>待修改的基线策略 ID 列表，不可为空且元素不可为 0。</p>
     */
    public Long [] getPolicyIDList() {
        return this.PolicyIDList;
    }

    /**
     * Set <p>待修改的基线策略 ID 列表，不可为空且元素不可为 0。</p>
     * @param PolicyIDList <p>待修改的基线策略 ID 列表，不可为空且元素不可为 0。</p>
     */
    public void setPolicyIDList(Long [] PolicyIDList) {
        this.PolicyIDList = PolicyIDList;
    }

    /**
     * Get <p>周期扫描配置；不修改时可省略。Enable=1 时必须同时传 IntervalType 与 IntervalValueList。</p> 
     * @return CycleScanConf <p>周期扫描配置；不修改时可省略。Enable=1 时必须同时传 IntervalType 与 IntervalValueList。</p>
     */
    public CycleScanConf getCycleScanConf() {
        return this.CycleScanConf;
    }

    /**
     * Set <p>周期扫描配置；不修改时可省略。Enable=1 时必须同时传 IntervalType 与 IntervalValueList。</p>
     * @param CycleScanConf <p>周期扫描配置；不修改时可省略。Enable=1 时必须同时传 IntervalType 与 IntervalValueList。</p>
     */
    public void setCycleScanConf(CycleScanConf CycleScanConf) {
        this.CycleScanConf = CycleScanConf;
    }

    /**
     * Get <p>新增内置检测项自动同步开关。true 自动加入，false 不加入。</p> 
     * @return AutoSyncItem <p>新增内置检测项自动同步开关。true 自动加入，false 不加入。</p>
     */
    public Boolean getAutoSyncItem() {
        return this.AutoSyncItem;
    }

    /**
     * Set <p>新增内置检测项自动同步开关。true 自动加入，false 不加入。</p>
     * @param AutoSyncItem <p>新增内置检测项自动同步开关。true 自动加入，false 不加入。</p>
     */
    public void setAutoSyncItem(Boolean AutoSyncItem) {
        this.AutoSyncItem = AutoSyncItem;
    }

    /**
     * Get <p>分类 / 子分类 / 检测项命中配置；不修改时可省略。</p> 
     * @return CategoryConf <p>分类 / 子分类 / 检测项命中配置；不修改时可省略。</p>
     */
    public BaselinePolicySystemCategoryConf [] getCategoryConf() {
        return this.CategoryConf;
    }

    /**
     * Set <p>分类 / 子分类 / 检测项命中配置；不修改时可省略。</p>
     * @param CategoryConf <p>分类 / 子分类 / 检测项命中配置；不修改时可省略。</p>
     */
    public void setCategoryConf(BaselinePolicySystemCategoryConf [] CategoryConf) {
        this.CategoryConf = CategoryConf;
    }

    /**
     * Get <p>集团账号的成员id</p> 
     * @return MemberId <p>集团账号的成员id</p>
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set <p>集团账号的成员id</p>
     * @param MemberId <p>集团账号的成员id</p>
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get <p>自定义检测项取值配置列表；不修改时可省略。每个元素 RuleID 与 CustomItemID 不能同时为 0。</p> 
     * @return CustomItemConf <p>自定义检测项取值配置列表；不修改时可省略。每个元素 RuleID 与 CustomItemID 不能同时为 0。</p>
     */
    public BaselineCustomItemConf [] getCustomItemConf() {
        return this.CustomItemConf;
    }

    /**
     * Set <p>自定义检测项取值配置列表；不修改时可省略。每个元素 RuleID 与 CustomItemID 不能同时为 0。</p>
     * @param CustomItemConf <p>自定义检测项取值配置列表；不修改时可省略。每个元素 RuleID 与 CustomItemID 不能同时为 0。</p>
     */
    public void setCustomItemConf(BaselineCustomItemConf [] CustomItemConf) {
        this.CustomItemConf = CustomItemConf;
    }

    public BatchModifyBaselinePolicyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BatchModifyBaselinePolicyRequest(BatchModifyBaselinePolicyRequest source) {
        if (source.PolicyIDList != null) {
            this.PolicyIDList = new Long[source.PolicyIDList.length];
            for (int i = 0; i < source.PolicyIDList.length; i++) {
                this.PolicyIDList[i] = new Long(source.PolicyIDList[i]);
            }
        }
        if (source.CycleScanConf != null) {
            this.CycleScanConf = new CycleScanConf(source.CycleScanConf);
        }
        if (source.AutoSyncItem != null) {
            this.AutoSyncItem = new Boolean(source.AutoSyncItem);
        }
        if (source.CategoryConf != null) {
            this.CategoryConf = new BaselinePolicySystemCategoryConf[source.CategoryConf.length];
            for (int i = 0; i < source.CategoryConf.length; i++) {
                this.CategoryConf[i] = new BaselinePolicySystemCategoryConf(source.CategoryConf[i]);
            }
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.CustomItemConf != null) {
            this.CustomItemConf = new BaselineCustomItemConf[source.CustomItemConf.length];
            for (int i = 0; i < source.CustomItemConf.length; i++) {
                this.CustomItemConf[i] = new BaselineCustomItemConf(source.CustomItemConf[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "PolicyIDList.", this.PolicyIDList);
        this.setParamObj(map, prefix + "CycleScanConf.", this.CycleScanConf);
        this.setParamSimple(map, prefix + "AutoSyncItem", this.AutoSyncItem);
        this.setParamArrayObj(map, prefix + "CategoryConf.", this.CategoryConf);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamArrayObj(map, prefix + "CustomItemConf.", this.CustomItemConf);

    }
}

