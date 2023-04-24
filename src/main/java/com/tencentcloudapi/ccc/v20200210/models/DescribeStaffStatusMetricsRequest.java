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

public class DescribeStaffStatusMetricsRequest extends AbstractModel{

    /**
    * 应用 ID（必填），可以查看 https://console.cloud.tencent.com/ccc
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * 筛选坐席列表，默认不传返回全部坐席信息
    */
    @SerializedName("StaffList")
    @Expose
    private String [] StaffList;

    /**
    * 筛选技能组ID列表
    */
    @SerializedName("GroupIdList")
    @Expose
    private Long [] GroupIdList;

    /**
    * 筛选坐席状态列表
    */
    @SerializedName("StatusList")
    @Expose
    private String [] StatusList;

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
     * Get 筛选坐席列表，默认不传返回全部坐席信息 
     * @return StaffList 筛选坐席列表，默认不传返回全部坐席信息
     */
    public String [] getStaffList() {
        return this.StaffList;
    }

    /**
     * Set 筛选坐席列表，默认不传返回全部坐席信息
     * @param StaffList 筛选坐席列表，默认不传返回全部坐席信息
     */
    public void setStaffList(String [] StaffList) {
        this.StaffList = StaffList;
    }

    /**
     * Get 筛选技能组ID列表 
     * @return GroupIdList 筛选技能组ID列表
     */
    public Long [] getGroupIdList() {
        return this.GroupIdList;
    }

    /**
     * Set 筛选技能组ID列表
     * @param GroupIdList 筛选技能组ID列表
     */
    public void setGroupIdList(Long [] GroupIdList) {
        this.GroupIdList = GroupIdList;
    }

    /**
     * Get 筛选坐席状态列表 
     * @return StatusList 筛选坐席状态列表
     */
    public String [] getStatusList() {
        return this.StatusList;
    }

    /**
     * Set 筛选坐席状态列表
     * @param StatusList 筛选坐席状态列表
     */
    public void setStatusList(String [] StatusList) {
        this.StatusList = StatusList;
    }

    public DescribeStaffStatusMetricsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeStaffStatusMetricsRequest(DescribeStaffStatusMetricsRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.StaffList != null) {
            this.StaffList = new String[source.StaffList.length];
            for (int i = 0; i < source.StaffList.length; i++) {
                this.StaffList[i] = new String(source.StaffList[i]);
            }
        }
        if (source.GroupIdList != null) {
            this.GroupIdList = new Long[source.GroupIdList.length];
            for (int i = 0; i < source.GroupIdList.length; i++) {
                this.GroupIdList[i] = new Long(source.GroupIdList[i]);
            }
        }
        if (source.StatusList != null) {
            this.StatusList = new String[source.StatusList.length];
            for (int i = 0; i < source.StatusList.length; i++) {
                this.StatusList[i] = new String(source.StatusList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamArraySimple(map, prefix + "StaffList.", this.StaffList);
        this.setParamArraySimple(map, prefix + "GroupIdList.", this.GroupIdList);
        this.setParamArraySimple(map, prefix + "StatusList.", this.StatusList);

    }
}

