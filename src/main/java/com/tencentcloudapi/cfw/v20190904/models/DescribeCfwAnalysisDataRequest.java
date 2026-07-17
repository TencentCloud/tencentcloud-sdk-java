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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCfwAnalysisDataRequest extends AbstractModel {

    /**
    * <p>分析场景。必填。full_traffic 表示全流量深度分析；east_west 表示东西向流量分析；alert_comprehensive 表示告警综合分析；asset_exposure 表示资产暴露面分析；access_troubleshoot 表示访问阻断排障分析。</p>
    */
    @SerializedName("Scenario")
    @Expose
    private String Scenario;

    /**
    * <p>查询开始时间。可选，格式 YYYY-MM-DD HH:MM:SS；不传时默认查询最近 7 天。</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>查询结束时间。可选，格式 YYYY-MM-DD HH:MM:SS；不传时默认当前时间。</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>分析对象类型。可选，默认 user；user 表示租户全局，asset 表示单个资产，vpc 表示 VPC，domain 表示域名。</p>
    */
    @SerializedName("ObjectType")
    @Expose
    private String ObjectType;

    /**
    * <p>分析对象标识。ObjectType 为 asset、vpc 或 domain 时按需传入，可填写 IP、实例 ID、VPC ID 或域名。</p>
    */
    @SerializedName("ObjectId")
    @Expose
    private String ObjectId;

    /**
    * <p>排障目标。可选，主要用于 access_troubleshoot 场景，可填写 IP 或域名。</p>
    */
    @SerializedName("Target")
    @Expose
    private String Target;

    /**
    * <p>需要跳过的分析段名称列表。可选；不传时执行该场景全部分析段。</p>
    */
    @SerializedName("SkipSections")
    @Expose
    private String [] SkipSections;

    /**
     * Get <p>分析场景。必填。full_traffic 表示全流量深度分析；east_west 表示东西向流量分析；alert_comprehensive 表示告警综合分析；asset_exposure 表示资产暴露面分析；access_troubleshoot 表示访问阻断排障分析。</p> 
     * @return Scenario <p>分析场景。必填。full_traffic 表示全流量深度分析；east_west 表示东西向流量分析；alert_comprehensive 表示告警综合分析；asset_exposure 表示资产暴露面分析；access_troubleshoot 表示访问阻断排障分析。</p>
     */
    public String getScenario() {
        return this.Scenario;
    }

    /**
     * Set <p>分析场景。必填。full_traffic 表示全流量深度分析；east_west 表示东西向流量分析；alert_comprehensive 表示告警综合分析；asset_exposure 表示资产暴露面分析；access_troubleshoot 表示访问阻断排障分析。</p>
     * @param Scenario <p>分析场景。必填。full_traffic 表示全流量深度分析；east_west 表示东西向流量分析；alert_comprehensive 表示告警综合分析；asset_exposure 表示资产暴露面分析；access_troubleshoot 表示访问阻断排障分析。</p>
     */
    public void setScenario(String Scenario) {
        this.Scenario = Scenario;
    }

    /**
     * Get <p>查询开始时间。可选，格式 YYYY-MM-DD HH:MM:SS；不传时默认查询最近 7 天。</p> 
     * @return StartTime <p>查询开始时间。可选，格式 YYYY-MM-DD HH:MM:SS；不传时默认查询最近 7 天。</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>查询开始时间。可选，格式 YYYY-MM-DD HH:MM:SS；不传时默认查询最近 7 天。</p>
     * @param StartTime <p>查询开始时间。可选，格式 YYYY-MM-DD HH:MM:SS；不传时默认查询最近 7 天。</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>查询结束时间。可选，格式 YYYY-MM-DD HH:MM:SS；不传时默认当前时间。</p> 
     * @return EndTime <p>查询结束时间。可选，格式 YYYY-MM-DD HH:MM:SS；不传时默认当前时间。</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>查询结束时间。可选，格式 YYYY-MM-DD HH:MM:SS；不传时默认当前时间。</p>
     * @param EndTime <p>查询结束时间。可选，格式 YYYY-MM-DD HH:MM:SS；不传时默认当前时间。</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>分析对象类型。可选，默认 user；user 表示租户全局，asset 表示单个资产，vpc 表示 VPC，domain 表示域名。</p> 
     * @return ObjectType <p>分析对象类型。可选，默认 user；user 表示租户全局，asset 表示单个资产，vpc 表示 VPC，domain 表示域名。</p>
     */
    public String getObjectType() {
        return this.ObjectType;
    }

    /**
     * Set <p>分析对象类型。可选，默认 user；user 表示租户全局，asset 表示单个资产，vpc 表示 VPC，domain 表示域名。</p>
     * @param ObjectType <p>分析对象类型。可选，默认 user；user 表示租户全局，asset 表示单个资产，vpc 表示 VPC，domain 表示域名。</p>
     */
    public void setObjectType(String ObjectType) {
        this.ObjectType = ObjectType;
    }

    /**
     * Get <p>分析对象标识。ObjectType 为 asset、vpc 或 domain 时按需传入，可填写 IP、实例 ID、VPC ID 或域名。</p> 
     * @return ObjectId <p>分析对象标识。ObjectType 为 asset、vpc 或 domain 时按需传入，可填写 IP、实例 ID、VPC ID 或域名。</p>
     */
    public String getObjectId() {
        return this.ObjectId;
    }

    /**
     * Set <p>分析对象标识。ObjectType 为 asset、vpc 或 domain 时按需传入，可填写 IP、实例 ID、VPC ID 或域名。</p>
     * @param ObjectId <p>分析对象标识。ObjectType 为 asset、vpc 或 domain 时按需传入，可填写 IP、实例 ID、VPC ID 或域名。</p>
     */
    public void setObjectId(String ObjectId) {
        this.ObjectId = ObjectId;
    }

    /**
     * Get <p>排障目标。可选，主要用于 access_troubleshoot 场景，可填写 IP 或域名。</p> 
     * @return Target <p>排障目标。可选，主要用于 access_troubleshoot 场景，可填写 IP 或域名。</p>
     */
    public String getTarget() {
        return this.Target;
    }

    /**
     * Set <p>排障目标。可选，主要用于 access_troubleshoot 场景，可填写 IP 或域名。</p>
     * @param Target <p>排障目标。可选，主要用于 access_troubleshoot 场景，可填写 IP 或域名。</p>
     */
    public void setTarget(String Target) {
        this.Target = Target;
    }

    /**
     * Get <p>需要跳过的分析段名称列表。可选；不传时执行该场景全部分析段。</p> 
     * @return SkipSections <p>需要跳过的分析段名称列表。可选；不传时执行该场景全部分析段。</p>
     */
    public String [] getSkipSections() {
        return this.SkipSections;
    }

    /**
     * Set <p>需要跳过的分析段名称列表。可选；不传时执行该场景全部分析段。</p>
     * @param SkipSections <p>需要跳过的分析段名称列表。可选；不传时执行该场景全部分析段。</p>
     */
    public void setSkipSections(String [] SkipSections) {
        this.SkipSections = SkipSections;
    }

    public DescribeCfwAnalysisDataRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCfwAnalysisDataRequest(DescribeCfwAnalysisDataRequest source) {
        if (source.Scenario != null) {
            this.Scenario = new String(source.Scenario);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.ObjectType != null) {
            this.ObjectType = new String(source.ObjectType);
        }
        if (source.ObjectId != null) {
            this.ObjectId = new String(source.ObjectId);
        }
        if (source.Target != null) {
            this.Target = new String(source.Target);
        }
        if (source.SkipSections != null) {
            this.SkipSections = new String[source.SkipSections.length];
            for (int i = 0; i < source.SkipSections.length; i++) {
                this.SkipSections[i] = new String(source.SkipSections[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Scenario", this.Scenario);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "ObjectType", this.ObjectType);
        this.setParamSimple(map, prefix + "ObjectId", this.ObjectId);
        this.setParamSimple(map, prefix + "Target", this.Target);
        this.setParamArraySimple(map, prefix + "SkipSections.", this.SkipSections);

    }
}

