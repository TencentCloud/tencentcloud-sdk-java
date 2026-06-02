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
package com.tencentcloudapi.ccc.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePredictiveDialingCampaignsRequest extends AbstractModel {

    /**
    * <p>应用 ID（必填），可以查看 https://console.cloud.tencent.com/ccc</p>
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * <p>分页尺寸，最大为 100</p>
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * <p>分页页码，从 0 开始</p>
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * <p>查询任务列表名称关键字</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>查询任务列表技能组 ID</p>
    */
    @SerializedName("SkillGroupId")
    @Expose
    private Long SkillGroupId;

    /**
    * <p>任务 ID</p>
    */
    @SerializedName("CampaignId")
    @Expose
    private Long CampaignId;

    /**
     * Get <p>应用 ID（必填），可以查看 https://console.cloud.tencent.com/ccc</p> 
     * @return SdkAppId <p>应用 ID（必填），可以查看 https://console.cloud.tencent.com/ccc</p>
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set <p>应用 ID（必填），可以查看 https://console.cloud.tencent.com/ccc</p>
     * @param SdkAppId <p>应用 ID（必填），可以查看 https://console.cloud.tencent.com/ccc</p>
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get <p>分页尺寸，最大为 100</p> 
     * @return PageSize <p>分页尺寸，最大为 100</p>
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set <p>分页尺寸，最大为 100</p>
     * @param PageSize <p>分页尺寸，最大为 100</p>
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get <p>分页页码，从 0 开始</p> 
     * @return PageNumber <p>分页页码，从 0 开始</p>
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set <p>分页页码，从 0 开始</p>
     * @param PageNumber <p>分页页码，从 0 开始</p>
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get <p>查询任务列表名称关键字</p> 
     * @return Name <p>查询任务列表名称关键字</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>查询任务列表名称关键字</p>
     * @param Name <p>查询任务列表名称关键字</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>查询任务列表技能组 ID</p> 
     * @return SkillGroupId <p>查询任务列表技能组 ID</p>
     */
    public Long getSkillGroupId() {
        return this.SkillGroupId;
    }

    /**
     * Set <p>查询任务列表技能组 ID</p>
     * @param SkillGroupId <p>查询任务列表技能组 ID</p>
     */
    public void setSkillGroupId(Long SkillGroupId) {
        this.SkillGroupId = SkillGroupId;
    }

    /**
     * Get <p>任务 ID</p> 
     * @return CampaignId <p>任务 ID</p>
     */
    public Long getCampaignId() {
        return this.CampaignId;
    }

    /**
     * Set <p>任务 ID</p>
     * @param CampaignId <p>任务 ID</p>
     */
    public void setCampaignId(Long CampaignId) {
        this.CampaignId = CampaignId;
    }

    public DescribePredictiveDialingCampaignsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePredictiveDialingCampaignsRequest(DescribePredictiveDialingCampaignsRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.SkillGroupId != null) {
            this.SkillGroupId = new Long(source.SkillGroupId);
        }
        if (source.CampaignId != null) {
            this.CampaignId = new Long(source.CampaignId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "SkillGroupId", this.SkillGroupId);
        this.setParamSimple(map, prefix + "CampaignId", this.CampaignId);

    }
}

