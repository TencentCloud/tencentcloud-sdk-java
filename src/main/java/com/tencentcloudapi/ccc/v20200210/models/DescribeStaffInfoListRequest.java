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
package com.tencentcloudapi.ccc.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeStaffInfoListRequest extends AbstractModel{

    /**
    * 应用 ID（必填），可以查看 https://console.cloud.tencent.com/ccc
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * 分页尺寸，上限 100
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 分页页码，从 0 开始
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * 坐席账号，查询单个坐席时使用
    */
    @SerializedName("StaffMail")
    @Expose
    private String StaffMail;

    /**
    * 查询修改时间大于等于ModifiedTime的坐席时使用
    */
    @SerializedName("ModifiedTime")
    @Expose
    private Long ModifiedTime;

    /**
     * Get 应用 ID（必填），可以查看 https://console.cloud.tencent.com/ccc 
     * @return SdkAppId 应用 ID（必填），可以查看 https://console.cloud.tencent.com/ccc
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set 应用 ID（必填），可以查看 https://console.cloud.tencent.com/ccc
     * @param SdkAppId 应用 ID（必填），可以查看 https://console.cloud.tencent.com/ccc
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get 分页尺寸，上限 100 
     * @return PageSize 分页尺寸，上限 100
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 分页尺寸，上限 100
     * @param PageSize 分页尺寸，上限 100
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 分页页码，从 0 开始 
     * @return PageNumber 分页页码，从 0 开始
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 分页页码，从 0 开始
     * @param PageNumber 分页页码，从 0 开始
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get 坐席账号，查询单个坐席时使用 
     * @return StaffMail 坐席账号，查询单个坐席时使用
     */
    public String getStaffMail() {
        return this.StaffMail;
    }

    /**
     * Set 坐席账号，查询单个坐席时使用
     * @param StaffMail 坐席账号，查询单个坐席时使用
     */
    public void setStaffMail(String StaffMail) {
        this.StaffMail = StaffMail;
    }

    /**
     * Get 查询修改时间大于等于ModifiedTime的坐席时使用 
     * @return ModifiedTime 查询修改时间大于等于ModifiedTime的坐席时使用
     */
    public Long getModifiedTime() {
        return this.ModifiedTime;
    }

    /**
     * Set 查询修改时间大于等于ModifiedTime的坐席时使用
     * @param ModifiedTime 查询修改时间大于等于ModifiedTime的坐席时使用
     */
    public void setModifiedTime(Long ModifiedTime) {
        this.ModifiedTime = ModifiedTime;
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

    }
}

