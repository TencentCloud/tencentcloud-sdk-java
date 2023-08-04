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

public class AddRecordBackupPlanRequest extends AbstractModel{

    /**
    * 录制模板ID（录像计划关联的模板ID，从查询录像上云模板列表接口ListRecordBackupTemplates中获取）
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
    * 录像计划名称（仅支持中文、英文、数字、_、-，长度不超过32个字符，计划名称全局唯一，不能为空，不能重复）
    */
    @SerializedName("PlanName")
    @Expose
    private String PlanName;

    /**
    * 录像计划描述（仅支持中文、英文、数字、_、-，长度不超过128个字符）
    */
    @SerializedName("Describe")
    @Expose
    private String Describe;

    /**
    * 生命周期（录像文件生命周期设置，管理文件冷、热存储的时间）
    */
    @SerializedName("LifeCycle")
    @Expose
    private LifeCycleData LifeCycle;

    /**
    * 通道及通道所属设备（添加录像的设备的通道信息，一次添加通道总数不超过5000个，包括组织目录下的通道数量）
    */
    @SerializedName("Channels")
    @Expose
    private ChannelInfo [] Channels;

    /**
    * 添加组织目录下所有设备通道（Json数组，可以为空，通道总数量不超过5000个（包括Channel字段的数量））
    */
    @SerializedName("OrganizationId")
    @Expose
    private String [] OrganizationId;

    /**
     * Get 录制模板ID（录像计划关联的模板ID，从查询录像上云模板列表接口ListRecordBackupTemplates中获取） 
     * @return TemplateId 录制模板ID（录像计划关联的模板ID，从查询录像上云模板列表接口ListRecordBackupTemplates中获取）
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set 录制模板ID（录像计划关联的模板ID，从查询录像上云模板列表接口ListRecordBackupTemplates中获取）
     * @param TemplateId 录制模板ID（录像计划关联的模板ID，从查询录像上云模板列表接口ListRecordBackupTemplates中获取）
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get 录像计划名称（仅支持中文、英文、数字、_、-，长度不超过32个字符，计划名称全局唯一，不能为空，不能重复） 
     * @return PlanName 录像计划名称（仅支持中文、英文、数字、_、-，长度不超过32个字符，计划名称全局唯一，不能为空，不能重复）
     */
    public String getPlanName() {
        return this.PlanName;
    }

    /**
     * Set 录像计划名称（仅支持中文、英文、数字、_、-，长度不超过32个字符，计划名称全局唯一，不能为空，不能重复）
     * @param PlanName 录像计划名称（仅支持中文、英文、数字、_、-，长度不超过32个字符，计划名称全局唯一，不能为空，不能重复）
     */
    public void setPlanName(String PlanName) {
        this.PlanName = PlanName;
    }

    /**
     * Get 录像计划描述（仅支持中文、英文、数字、_、-，长度不超过128个字符） 
     * @return Describe 录像计划描述（仅支持中文、英文、数字、_、-，长度不超过128个字符）
     */
    public String getDescribe() {
        return this.Describe;
    }

    /**
     * Set 录像计划描述（仅支持中文、英文、数字、_、-，长度不超过128个字符）
     * @param Describe 录像计划描述（仅支持中文、英文、数字、_、-，长度不超过128个字符）
     */
    public void setDescribe(String Describe) {
        this.Describe = Describe;
    }

    /**
     * Get 生命周期（录像文件生命周期设置，管理文件冷、热存储的时间） 
     * @return LifeCycle 生命周期（录像文件生命周期设置，管理文件冷、热存储的时间）
     */
    public LifeCycleData getLifeCycle() {
        return this.LifeCycle;
    }

    /**
     * Set 生命周期（录像文件生命周期设置，管理文件冷、热存储的时间）
     * @param LifeCycle 生命周期（录像文件生命周期设置，管理文件冷、热存储的时间）
     */
    public void setLifeCycle(LifeCycleData LifeCycle) {
        this.LifeCycle = LifeCycle;
    }

    /**
     * Get 通道及通道所属设备（添加录像的设备的通道信息，一次添加通道总数不超过5000个，包括组织目录下的通道数量） 
     * @return Channels 通道及通道所属设备（添加录像的设备的通道信息，一次添加通道总数不超过5000个，包括组织目录下的通道数量）
     */
    public ChannelInfo [] getChannels() {
        return this.Channels;
    }

    /**
     * Set 通道及通道所属设备（添加录像的设备的通道信息，一次添加通道总数不超过5000个，包括组织目录下的通道数量）
     * @param Channels 通道及通道所属设备（添加录像的设备的通道信息，一次添加通道总数不超过5000个，包括组织目录下的通道数量）
     */
    public void setChannels(ChannelInfo [] Channels) {
        this.Channels = Channels;
    }

    /**
     * Get 添加组织目录下所有设备通道（Json数组，可以为空，通道总数量不超过5000个（包括Channel字段的数量）） 
     * @return OrganizationId 添加组织目录下所有设备通道（Json数组，可以为空，通道总数量不超过5000个（包括Channel字段的数量））
     */
    public String [] getOrganizationId() {
        return this.OrganizationId;
    }

    /**
     * Set 添加组织目录下所有设备通道（Json数组，可以为空，通道总数量不超过5000个（包括Channel字段的数量））
     * @param OrganizationId 添加组织目录下所有设备通道（Json数组，可以为空，通道总数量不超过5000个（包括Channel字段的数量））
     */
    public void setOrganizationId(String [] OrganizationId) {
        this.OrganizationId = OrganizationId;
    }

    public AddRecordBackupPlanRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddRecordBackupPlanRequest(AddRecordBackupPlanRequest source) {
        if (source.TemplateId != null) {
            this.TemplateId = new String(source.TemplateId);
        }
        if (source.PlanName != null) {
            this.PlanName = new String(source.PlanName);
        }
        if (source.Describe != null) {
            this.Describe = new String(source.Describe);
        }
        if (source.LifeCycle != null) {
            this.LifeCycle = new LifeCycleData(source.LifeCycle);
        }
        if (source.Channels != null) {
            this.Channels = new ChannelInfo[source.Channels.length];
            for (int i = 0; i < source.Channels.length; i++) {
                this.Channels[i] = new ChannelInfo(source.Channels[i]);
            }
        }
        if (source.OrganizationId != null) {
            this.OrganizationId = new String[source.OrganizationId.length];
            for (int i = 0; i < source.OrganizationId.length; i++) {
                this.OrganizationId[i] = new String(source.OrganizationId[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "PlanName", this.PlanName);
        this.setParamSimple(map, prefix + "Describe", this.Describe);
        this.setParamObj(map, prefix + "LifeCycle.", this.LifeCycle);
        this.setParamArrayObj(map, prefix + "Channels.", this.Channels);
        this.setParamArraySimple(map, prefix + "OrganizationId.", this.OrganizationId);

    }
}

