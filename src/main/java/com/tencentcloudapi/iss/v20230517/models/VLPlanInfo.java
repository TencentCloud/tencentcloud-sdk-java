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
package com.tencentcloudapi.iss.v20230517.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VLPlanInfo extends AbstractModel {

    /**
    * <p>计划ID</p>
    */
    @SerializedName("VLPlanId")
    @Expose
    private String VLPlanId;

    /**
    * <p>计划名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>计划描述</p>
    */
    @SerializedName("Describe")
    @Expose
    private String Describe;

    /**
    * <p>视觉理解模板ID</p>
    */
    @SerializedName("VLTemplateId")
    @Expose
    private String VLTemplateId;

    /**
    * <p>回调通知配置</p>
    */
    @SerializedName("Callback")
    @Expose
    private CallbackURL Callback;

    /**
    * <p>文件过期时间（秒）</p>
    */
    @SerializedName("FileExpires")
    @Expose
    private Long FileExpires;

    /**
    * <p>计划包含的通道数量</p>
    */
    @SerializedName("ChannelCount")
    @Expose
    private Long ChannelCount;

    /**
    * <p>创建时间</p>
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
    * <p>最近一次更新时间</p>
    */
    @SerializedName("UpdatedAt")
    @Expose
    private String UpdatedAt;

    /**
     * Get <p>计划ID</p> 
     * @return VLPlanId <p>计划ID</p>
     */
    public String getVLPlanId() {
        return this.VLPlanId;
    }

    /**
     * Set <p>计划ID</p>
     * @param VLPlanId <p>计划ID</p>
     */
    public void setVLPlanId(String VLPlanId) {
        this.VLPlanId = VLPlanId;
    }

    /**
     * Get <p>计划名称</p> 
     * @return Name <p>计划名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>计划名称</p>
     * @param Name <p>计划名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>计划描述</p> 
     * @return Describe <p>计划描述</p>
     */
    public String getDescribe() {
        return this.Describe;
    }

    /**
     * Set <p>计划描述</p>
     * @param Describe <p>计划描述</p>
     */
    public void setDescribe(String Describe) {
        this.Describe = Describe;
    }

    /**
     * Get <p>视觉理解模板ID</p> 
     * @return VLTemplateId <p>视觉理解模板ID</p>
     */
    public String getVLTemplateId() {
        return this.VLTemplateId;
    }

    /**
     * Set <p>视觉理解模板ID</p>
     * @param VLTemplateId <p>视觉理解模板ID</p>
     */
    public void setVLTemplateId(String VLTemplateId) {
        this.VLTemplateId = VLTemplateId;
    }

    /**
     * Get <p>回调通知配置</p> 
     * @return Callback <p>回调通知配置</p>
     */
    public CallbackURL getCallback() {
        return this.Callback;
    }

    /**
     * Set <p>回调通知配置</p>
     * @param Callback <p>回调通知配置</p>
     */
    public void setCallback(CallbackURL Callback) {
        this.Callback = Callback;
    }

    /**
     * Get <p>文件过期时间（秒）</p> 
     * @return FileExpires <p>文件过期时间（秒）</p>
     */
    public Long getFileExpires() {
        return this.FileExpires;
    }

    /**
     * Set <p>文件过期时间（秒）</p>
     * @param FileExpires <p>文件过期时间（秒）</p>
     */
    public void setFileExpires(Long FileExpires) {
        this.FileExpires = FileExpires;
    }

    /**
     * Get <p>计划包含的通道数量</p> 
     * @return ChannelCount <p>计划包含的通道数量</p>
     */
    public Long getChannelCount() {
        return this.ChannelCount;
    }

    /**
     * Set <p>计划包含的通道数量</p>
     * @param ChannelCount <p>计划包含的通道数量</p>
     */
    public void setChannelCount(Long ChannelCount) {
        this.ChannelCount = ChannelCount;
    }

    /**
     * Get <p>创建时间</p> 
     * @return CreatedAt <p>创建时间</p>
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set <p>创建时间</p>
     * @param CreatedAt <p>创建时间</p>
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get <p>最近一次更新时间</p> 
     * @return UpdatedAt <p>最近一次更新时间</p>
     */
    public String getUpdatedAt() {
        return this.UpdatedAt;
    }

    /**
     * Set <p>最近一次更新时间</p>
     * @param UpdatedAt <p>最近一次更新时间</p>
     */
    public void setUpdatedAt(String UpdatedAt) {
        this.UpdatedAt = UpdatedAt;
    }

    public VLPlanInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VLPlanInfo(VLPlanInfo source) {
        if (source.VLPlanId != null) {
            this.VLPlanId = new String(source.VLPlanId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Describe != null) {
            this.Describe = new String(source.Describe);
        }
        if (source.VLTemplateId != null) {
            this.VLTemplateId = new String(source.VLTemplateId);
        }
        if (source.Callback != null) {
            this.Callback = new CallbackURL(source.Callback);
        }
        if (source.FileExpires != null) {
            this.FileExpires = new Long(source.FileExpires);
        }
        if (source.ChannelCount != null) {
            this.ChannelCount = new Long(source.ChannelCount);
        }
        if (source.CreatedAt != null) {
            this.CreatedAt = new String(source.CreatedAt);
        }
        if (source.UpdatedAt != null) {
            this.UpdatedAt = new String(source.UpdatedAt);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VLPlanId", this.VLPlanId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Describe", this.Describe);
        this.setParamSimple(map, prefix + "VLTemplateId", this.VLTemplateId);
        this.setParamObj(map, prefix + "Callback.", this.Callback);
        this.setParamSimple(map, prefix + "FileExpires", this.FileExpires);
        this.setParamSimple(map, prefix + "ChannelCount", this.ChannelCount);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamSimple(map, prefix + "UpdatedAt", this.UpdatedAt);

    }
}

