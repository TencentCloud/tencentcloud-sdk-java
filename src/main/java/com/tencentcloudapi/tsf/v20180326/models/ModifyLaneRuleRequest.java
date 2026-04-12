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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyLaneRuleRequest extends AbstractModel {

    /**
    * <p>灰度发布规则ID。该参数可以通过调用 <a href="https://cloud.tencent.com/document/product/649/44505">DescribeLaneRules</a> 的返回值中的 RuleId 字段来获取或通过登录<a href="https://console.cloud.tencent.com/tse/tsf-consul?tab=grayscale&amp;subTab=lanerule">控制台</a>查看；也可以调用<a href="https://cloud.tencent.com/document/product/649/44507">CreateLaneRule</a>创建新的灰度发布规则。</p>
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * <p>灰度发布规则名称，最多支持60个字符，支持中英文字符。</p>
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * <p>灰度发布规则备注，最多支持200个字符。</p>
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * <p>灰度发布规则标签列表。</p>
    */
    @SerializedName("RuleTagList")
    @Expose
    private LaneRuleTag [] RuleTagList;

    /**
    * <p>泳道配置ID。该参数可以通过调用 <a href="https://cloud.tencent.com/document/product/649/44504">DescribeLanes</a> 的返回值中的 LaneId 字段来获取或通过登录<a href="https://console.cloud.tencent.com/tse/tsf-consul?tab=grayscale&amp;subTab=lane">控制台</a>查看；也可以调用<a href="https://cloud.tencent.com/document/product/649/44508">CreateLane</a>创建新的泳道配置。</p>
    */
    @SerializedName("LaneId")
    @Expose
    private String LaneId;

    /**
    * <p>开启状态。</p><ul><li>true：开启</li><li>false：关闭</li></ul>
    */
    @SerializedName("Enable")
    @Expose
    private Boolean Enable;

    /**
    * <p>灰度发布规则标签关系。- RELEATION_AND：与- RELEATION_OR：或</p>
    */
    @SerializedName("RuleTagRelationship")
    @Expose
    private String RuleTagRelationship;

    /**
     * Get <p>灰度发布规则ID。该参数可以通过调用 <a href="https://cloud.tencent.com/document/product/649/44505">DescribeLaneRules</a> 的返回值中的 RuleId 字段来获取或通过登录<a href="https://console.cloud.tencent.com/tse/tsf-consul?tab=grayscale&amp;subTab=lanerule">控制台</a>查看；也可以调用<a href="https://cloud.tencent.com/document/product/649/44507">CreateLaneRule</a>创建新的灰度发布规则。</p> 
     * @return RuleId <p>灰度发布规则ID。该参数可以通过调用 <a href="https://cloud.tencent.com/document/product/649/44505">DescribeLaneRules</a> 的返回值中的 RuleId 字段来获取或通过登录<a href="https://console.cloud.tencent.com/tse/tsf-consul?tab=grayscale&amp;subTab=lanerule">控制台</a>查看；也可以调用<a href="https://cloud.tencent.com/document/product/649/44507">CreateLaneRule</a>创建新的灰度发布规则。</p>
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set <p>灰度发布规则ID。该参数可以通过调用 <a href="https://cloud.tencent.com/document/product/649/44505">DescribeLaneRules</a> 的返回值中的 RuleId 字段来获取或通过登录<a href="https://console.cloud.tencent.com/tse/tsf-consul?tab=grayscale&amp;subTab=lanerule">控制台</a>查看；也可以调用<a href="https://cloud.tencent.com/document/product/649/44507">CreateLaneRule</a>创建新的灰度发布规则。</p>
     * @param RuleId <p>灰度发布规则ID。该参数可以通过调用 <a href="https://cloud.tencent.com/document/product/649/44505">DescribeLaneRules</a> 的返回值中的 RuleId 字段来获取或通过登录<a href="https://console.cloud.tencent.com/tse/tsf-consul?tab=grayscale&amp;subTab=lanerule">控制台</a>查看；也可以调用<a href="https://cloud.tencent.com/document/product/649/44507">CreateLaneRule</a>创建新的灰度发布规则。</p>
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get <p>灰度发布规则名称，最多支持60个字符，支持中英文字符。</p> 
     * @return RuleName <p>灰度发布规则名称，最多支持60个字符，支持中英文字符。</p>
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set <p>灰度发布规则名称，最多支持60个字符，支持中英文字符。</p>
     * @param RuleName <p>灰度发布规则名称，最多支持60个字符，支持中英文字符。</p>
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get <p>灰度发布规则备注，最多支持200个字符。</p> 
     * @return Remark <p>灰度发布规则备注，最多支持200个字符。</p>
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set <p>灰度发布规则备注，最多支持200个字符。</p>
     * @param Remark <p>灰度发布规则备注，最多支持200个字符。</p>
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get <p>灰度发布规则标签列表。</p> 
     * @return RuleTagList <p>灰度发布规则标签列表。</p>
     */
    public LaneRuleTag [] getRuleTagList() {
        return this.RuleTagList;
    }

    /**
     * Set <p>灰度发布规则标签列表。</p>
     * @param RuleTagList <p>灰度发布规则标签列表。</p>
     */
    public void setRuleTagList(LaneRuleTag [] RuleTagList) {
        this.RuleTagList = RuleTagList;
    }

    /**
     * Get <p>泳道配置ID。该参数可以通过调用 <a href="https://cloud.tencent.com/document/product/649/44504">DescribeLanes</a> 的返回值中的 LaneId 字段来获取或通过登录<a href="https://console.cloud.tencent.com/tse/tsf-consul?tab=grayscale&amp;subTab=lane">控制台</a>查看；也可以调用<a href="https://cloud.tencent.com/document/product/649/44508">CreateLane</a>创建新的泳道配置。</p> 
     * @return LaneId <p>泳道配置ID。该参数可以通过调用 <a href="https://cloud.tencent.com/document/product/649/44504">DescribeLanes</a> 的返回值中的 LaneId 字段来获取或通过登录<a href="https://console.cloud.tencent.com/tse/tsf-consul?tab=grayscale&amp;subTab=lane">控制台</a>查看；也可以调用<a href="https://cloud.tencent.com/document/product/649/44508">CreateLane</a>创建新的泳道配置。</p>
     */
    public String getLaneId() {
        return this.LaneId;
    }

    /**
     * Set <p>泳道配置ID。该参数可以通过调用 <a href="https://cloud.tencent.com/document/product/649/44504">DescribeLanes</a> 的返回值中的 LaneId 字段来获取或通过登录<a href="https://console.cloud.tencent.com/tse/tsf-consul?tab=grayscale&amp;subTab=lane">控制台</a>查看；也可以调用<a href="https://cloud.tencent.com/document/product/649/44508">CreateLane</a>创建新的泳道配置。</p>
     * @param LaneId <p>泳道配置ID。该参数可以通过调用 <a href="https://cloud.tencent.com/document/product/649/44504">DescribeLanes</a> 的返回值中的 LaneId 字段来获取或通过登录<a href="https://console.cloud.tencent.com/tse/tsf-consul?tab=grayscale&amp;subTab=lane">控制台</a>查看；也可以调用<a href="https://cloud.tencent.com/document/product/649/44508">CreateLane</a>创建新的泳道配置。</p>
     */
    public void setLaneId(String LaneId) {
        this.LaneId = LaneId;
    }

    /**
     * Get <p>开启状态。</p><ul><li>true：开启</li><li>false：关闭</li></ul> 
     * @return Enable <p>开启状态。</p><ul><li>true：开启</li><li>false：关闭</li></ul>
     */
    public Boolean getEnable() {
        return this.Enable;
    }

    /**
     * Set <p>开启状态。</p><ul><li>true：开启</li><li>false：关闭</li></ul>
     * @param Enable <p>开启状态。</p><ul><li>true：开启</li><li>false：关闭</li></ul>
     */
    public void setEnable(Boolean Enable) {
        this.Enable = Enable;
    }

    /**
     * Get <p>灰度发布规则标签关系。- RELEATION_AND：与- RELEATION_OR：或</p> 
     * @return RuleTagRelationship <p>灰度发布规则标签关系。- RELEATION_AND：与- RELEATION_OR：或</p>
     */
    public String getRuleTagRelationship() {
        return this.RuleTagRelationship;
    }

    /**
     * Set <p>灰度发布规则标签关系。- RELEATION_AND：与- RELEATION_OR：或</p>
     * @param RuleTagRelationship <p>灰度发布规则标签关系。- RELEATION_AND：与- RELEATION_OR：或</p>
     */
    public void setRuleTagRelationship(String RuleTagRelationship) {
        this.RuleTagRelationship = RuleTagRelationship;
    }

    public ModifyLaneRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyLaneRuleRequest(ModifyLaneRuleRequest source) {
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.RuleTagList != null) {
            this.RuleTagList = new LaneRuleTag[source.RuleTagList.length];
            for (int i = 0; i < source.RuleTagList.length; i++) {
                this.RuleTagList[i] = new LaneRuleTag(source.RuleTagList[i]);
            }
        }
        if (source.LaneId != null) {
            this.LaneId = new String(source.LaneId);
        }
        if (source.Enable != null) {
            this.Enable = new Boolean(source.Enable);
        }
        if (source.RuleTagRelationship != null) {
            this.RuleTagRelationship = new String(source.RuleTagRelationship);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamArrayObj(map, prefix + "RuleTagList.", this.RuleTagList);
        this.setParamSimple(map, prefix + "LaneId", this.LaneId);
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "RuleTagRelationship", this.RuleTagRelationship);

    }
}

