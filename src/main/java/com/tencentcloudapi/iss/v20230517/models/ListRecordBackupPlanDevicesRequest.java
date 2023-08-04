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
package com.tencentcloudapi.iss.v20230517.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListRecordBackupPlanDevicesRequest extends AbstractModel{

    /**
    * 录像计划ID（从查询录像上云计划列表接口ListRecordBackupPlans中获取）
    */
    @SerializedName("PlanId")
    @Expose
    private String PlanId;

    /**
    * 按照设备名称查询（为空时，不参考该参数）
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
    * 按照通道名称查询（为空时，不参考该参数）
    */
    @SerializedName("ChannelName")
    @Expose
    private String ChannelName;

    /**
    * 按照组织名称查询（为空时，不参考该参数）
    */
    @SerializedName("OrganizationName")
    @Expose
    private String OrganizationName;

    /**
    * 每页最大数量
    */
    @SerializedName("PageSize")
    @Expose
    private String PageSize;

    /**
    * 第几页
    */
    @SerializedName("PageNumber")
    @Expose
    private String PageNumber;

    /**
     * Get 录像计划ID（从查询录像上云计划列表接口ListRecordBackupPlans中获取） 
     * @return PlanId 录像计划ID（从查询录像上云计划列表接口ListRecordBackupPlans中获取）
     */
    public String getPlanId() {
        return this.PlanId;
    }

    /**
     * Set 录像计划ID（从查询录像上云计划列表接口ListRecordBackupPlans中获取）
     * @param PlanId 录像计划ID（从查询录像上云计划列表接口ListRecordBackupPlans中获取）
     */
    public void setPlanId(String PlanId) {
        this.PlanId = PlanId;
    }

    /**
     * Get 按照设备名称查询（为空时，不参考该参数） 
     * @return DeviceName 按照设备名称查询（为空时，不参考该参数）
     */
    public String getDeviceName() {
        return this.DeviceName;
    }

    /**
     * Set 按照设备名称查询（为空时，不参考该参数）
     * @param DeviceName 按照设备名称查询（为空时，不参考该参数）
     */
    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }

    /**
     * Get 按照通道名称查询（为空时，不参考该参数） 
     * @return ChannelName 按照通道名称查询（为空时，不参考该参数）
     */
    public String getChannelName() {
        return this.ChannelName;
    }

    /**
     * Set 按照通道名称查询（为空时，不参考该参数）
     * @param ChannelName 按照通道名称查询（为空时，不参考该参数）
     */
    public void setChannelName(String ChannelName) {
        this.ChannelName = ChannelName;
    }

    /**
     * Get 按照组织名称查询（为空时，不参考该参数） 
     * @return OrganizationName 按照组织名称查询（为空时，不参考该参数）
     */
    public String getOrganizationName() {
        return this.OrganizationName;
    }

    /**
     * Set 按照组织名称查询（为空时，不参考该参数）
     * @param OrganizationName 按照组织名称查询（为空时，不参考该参数）
     */
    public void setOrganizationName(String OrganizationName) {
        this.OrganizationName = OrganizationName;
    }

    /**
     * Get 每页最大数量 
     * @return PageSize 每页最大数量
     */
    public String getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 每页最大数量
     * @param PageSize 每页最大数量
     */
    public void setPageSize(String PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 第几页 
     * @return PageNumber 第几页
     */
    public String getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 第几页
     * @param PageNumber 第几页
     */
    public void setPageNumber(String PageNumber) {
        this.PageNumber = PageNumber;
    }

    public ListRecordBackupPlanDevicesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListRecordBackupPlanDevicesRequest(ListRecordBackupPlanDevicesRequest source) {
        if (source.PlanId != null) {
            this.PlanId = new String(source.PlanId);
        }
        if (source.DeviceName != null) {
            this.DeviceName = new String(source.DeviceName);
        }
        if (source.ChannelName != null) {
            this.ChannelName = new String(source.ChannelName);
        }
        if (source.OrganizationName != null) {
            this.OrganizationName = new String(source.OrganizationName);
        }
        if (source.PageSize != null) {
            this.PageSize = new String(source.PageSize);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new String(source.PageNumber);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PlanId", this.PlanId);
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamSimple(map, prefix + "ChannelName", this.ChannelName);
        this.setParamSimple(map, prefix + "OrganizationName", this.OrganizationName);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);

    }
}

