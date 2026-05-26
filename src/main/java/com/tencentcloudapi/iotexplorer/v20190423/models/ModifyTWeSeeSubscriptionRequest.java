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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyTWeSeeSubscriptionRequest extends AbstractModel {

    /**
    * 产品 ID
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * 设备名称
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
    * 算法类型。可选值：

- `VID_COMP`：视频理解
    */
    @SerializedName("ServiceType")
    @Expose
    private String ServiceType;

    /**
    * 通道 ID
    */
    @SerializedName("ChannelId")
    @Expose
    private Long ChannelId;

    /**
    * 功能开关。`true` 为开启，`false` 为关闭；不传表示不修改
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
    * 视觉理解配置（适用于视频理解、图片理解），不传则不修改
    */
    @SerializedName("ComprehensionConfig")
    @Expose
    private SeeComprehensionConfig ComprehensionConfig;

    /**
    * 视频语义浓缩配置（适用于视频语义浓缩），不传则不修改
    */
    @SerializedName("CompHighlightConfig")
    @Expose
    private SeeCompHighlightConfig CompHighlightConfig;

    /**
    * 云存事件 ID 过滤规则配置，不传则不修改
    */
    @SerializedName("EventIdFilterConfig")
    @Expose
    private SeeEventIdFilterConfig EventIdFilterConfig;

    /**
     * Get 产品 ID 
     * @return ProductId 产品 ID
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * Set 产品 ID
     * @param ProductId 产品 ID
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get 设备名称 
     * @return DeviceName 设备名称
     */
    public String getDeviceName() {
        return this.DeviceName;
    }

    /**
     * Set 设备名称
     * @param DeviceName 设备名称
     */
    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }

    /**
     * Get 算法类型。可选值：

- `VID_COMP`：视频理解 
     * @return ServiceType 算法类型。可选值：

- `VID_COMP`：视频理解
     */
    public String getServiceType() {
        return this.ServiceType;
    }

    /**
     * Set 算法类型。可选值：

- `VID_COMP`：视频理解
     * @param ServiceType 算法类型。可选值：

- `VID_COMP`：视频理解
     */
    public void setServiceType(String ServiceType) {
        this.ServiceType = ServiceType;
    }

    /**
     * Get 通道 ID 
     * @return ChannelId 通道 ID
     */
    public Long getChannelId() {
        return this.ChannelId;
    }

    /**
     * Set 通道 ID
     * @param ChannelId 通道 ID
     */
    public void setChannelId(Long ChannelId) {
        this.ChannelId = ChannelId;
    }

    /**
     * Get 功能开关。`true` 为开启，`false` 为关闭；不传表示不修改 
     * @return Enabled 功能开关。`true` 为开启，`false` 为关闭；不传表示不修改
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set 功能开关。`true` 为开启，`false` 为关闭；不传表示不修改
     * @param Enabled 功能开关。`true` 为开启，`false` 为关闭；不传表示不修改
     */
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get 视觉理解配置（适用于视频理解、图片理解），不传则不修改 
     * @return ComprehensionConfig 视觉理解配置（适用于视频理解、图片理解），不传则不修改
     */
    public SeeComprehensionConfig getComprehensionConfig() {
        return this.ComprehensionConfig;
    }

    /**
     * Set 视觉理解配置（适用于视频理解、图片理解），不传则不修改
     * @param ComprehensionConfig 视觉理解配置（适用于视频理解、图片理解），不传则不修改
     */
    public void setComprehensionConfig(SeeComprehensionConfig ComprehensionConfig) {
        this.ComprehensionConfig = ComprehensionConfig;
    }

    /**
     * Get 视频语义浓缩配置（适用于视频语义浓缩），不传则不修改 
     * @return CompHighlightConfig 视频语义浓缩配置（适用于视频语义浓缩），不传则不修改
     */
    public SeeCompHighlightConfig getCompHighlightConfig() {
        return this.CompHighlightConfig;
    }

    /**
     * Set 视频语义浓缩配置（适用于视频语义浓缩），不传则不修改
     * @param CompHighlightConfig 视频语义浓缩配置（适用于视频语义浓缩），不传则不修改
     */
    public void setCompHighlightConfig(SeeCompHighlightConfig CompHighlightConfig) {
        this.CompHighlightConfig = CompHighlightConfig;
    }

    /**
     * Get 云存事件 ID 过滤规则配置，不传则不修改 
     * @return EventIdFilterConfig 云存事件 ID 过滤规则配置，不传则不修改
     */
    public SeeEventIdFilterConfig getEventIdFilterConfig() {
        return this.EventIdFilterConfig;
    }

    /**
     * Set 云存事件 ID 过滤规则配置，不传则不修改
     * @param EventIdFilterConfig 云存事件 ID 过滤规则配置，不传则不修改
     */
    public void setEventIdFilterConfig(SeeEventIdFilterConfig EventIdFilterConfig) {
        this.EventIdFilterConfig = EventIdFilterConfig;
    }

    public ModifyTWeSeeSubscriptionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyTWeSeeSubscriptionRequest(ModifyTWeSeeSubscriptionRequest source) {
        if (source.ProductId != null) {
            this.ProductId = new String(source.ProductId);
        }
        if (source.DeviceName != null) {
            this.DeviceName = new String(source.DeviceName);
        }
        if (source.ServiceType != null) {
            this.ServiceType = new String(source.ServiceType);
        }
        if (source.ChannelId != null) {
            this.ChannelId = new Long(source.ChannelId);
        }
        if (source.Enabled != null) {
            this.Enabled = new Boolean(source.Enabled);
        }
        if (source.ComprehensionConfig != null) {
            this.ComprehensionConfig = new SeeComprehensionConfig(source.ComprehensionConfig);
        }
        if (source.CompHighlightConfig != null) {
            this.CompHighlightConfig = new SeeCompHighlightConfig(source.CompHighlightConfig);
        }
        if (source.EventIdFilterConfig != null) {
            this.EventIdFilterConfig = new SeeEventIdFilterConfig(source.EventIdFilterConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamSimple(map, prefix + "ServiceType", this.ServiceType);
        this.setParamSimple(map, prefix + "ChannelId", this.ChannelId);
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamObj(map, prefix + "ComprehensionConfig.", this.ComprehensionConfig);
        this.setParamObj(map, prefix + "CompHighlightConfig.", this.CompHighlightConfig);
        this.setParamObj(map, prefix + "EventIdFilterConfig.", this.EventIdFilterConfig);

    }
}

