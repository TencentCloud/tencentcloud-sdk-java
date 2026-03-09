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

public class DescribeStaffInfoListRequest extends AbstractModel {

    /**
    * <p>应用 ID（必填），可以查看 https://console.cloud.tencent.com/ccc</p>
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * <p>分页尺寸，上限 9999</p>
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
    * <p>坐席账号，查询单个坐席时使用</p>
    */
    @SerializedName("StaffMail")
    @Expose
    private String StaffMail;

    /**
    * <p>查询修改时间大于等于ModifiedTime的坐席时使用</p>
    */
    @SerializedName("ModifiedTime")
    @Expose
    private Long ModifiedTime;

    /**
    * <p>技能组ID</p>
    */
    @SerializedName("SkillGroupId")
    @Expose
    private Long SkillGroupId;

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
     * Get <p>分页尺寸，上限 9999</p> 
     * @return PageSize <p>分页尺寸，上限 9999</p>
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set <p>分页尺寸，上限 9999</p>
     * @param PageSize <p>分页尺寸，上限 9999</p>
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
     * Get <p>坐席账号，查询单个坐席时使用</p> 
     * @return StaffMail <p>坐席账号，查询单个坐席时使用</p>
     */
    public String getStaffMail() {
        return this.StaffMail;
    }

    /**
     * Set <p>坐席账号，查询单个坐席时使用</p>
     * @param StaffMail <p>坐席账号，查询单个坐席时使用</p>
     */
    public void setStaffMail(String StaffMail) {
        this.StaffMail = StaffMail;
    }

    /**
     * Get <p>查询修改时间大于等于ModifiedTime的坐席时使用</p> 
     * @return ModifiedTime <p>查询修改时间大于等于ModifiedTime的坐席时使用</p>
     */
    public Long getModifiedTime() {
        return this.ModifiedTime;
    }

    /**
     * Set <p>查询修改时间大于等于ModifiedTime的坐席时使用</p>
     * @param ModifiedTime <p>查询修改时间大于等于ModifiedTime的坐席时使用</p>
     */
    public void setModifiedTime(Long ModifiedTime) {
        this.ModifiedTime = ModifiedTime;
    }

    /**
     * Get <p>技能组ID</p> 
     * @return SkillGroupId <p>技能组ID</p>
     */
    public Long getSkillGroupId() {
        return this.SkillGroupId;
    }

    /**
     * Set <p>技能组ID</p>
     * @param SkillGroupId <p>技能组ID</p>
     */
    public void setSkillGroupId(Long SkillGroupId) {
        this.SkillGroupId = SkillGroupId;
    }

    public DescribeStaffInfoListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeStaffInfoListRequest(DescribeStaffInfoListRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.StaffMail != null) {
            this.StaffMail = new String(source.StaffMail);
        }
        if (source.ModifiedTime != null) {
            this.ModifiedTime = new Long(source.ModifiedTime);
        }
        if (source.SkillGroupId != null) {
            this.SkillGroupId = new Long(source.SkillGroupId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "StaffMail", this.StaffMail);
        this.setParamSimple(map, prefix + "ModifiedTime", this.ModifiedTime);
        this.setParamSimple(map, prefix + "SkillGroupId", this.SkillGroupId);

    }
}

