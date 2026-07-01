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

public class CreateTWeSeeDirectUploadCredentialRequest extends AbstractModel {

    /**
    * <p>产品 ID</p><p>非 IoT 设备可传 <code>default</code></p>
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * <p>设备名称</p>
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
    * <p>算法类型</p><p>枚举值：</p><ul><li>VID_COMP： 视频理解（支持视频文件或多帧图片）</li><li>IMG_COMP： 图片理解（单帧图片）</li></ul>
    */
    @SerializedName("ServiceType")
    @Expose
    private String ServiceType;

    /**
    * <p>通道 ID</p><p>默认值：0</p>
    */
    @SerializedName("ChannelId")
    @Expose
    private Long ChannelId;

    /**
    * <p>回调目标 ID</p>
    */
    @SerializedName("CallbackId")
    @Expose
    private String CallbackId;

    /**
    * <p>视觉理解配置项</p>
    */
    @SerializedName("ComprehensionConfig")
    @Expose
    private SeeComprehensionConfig ComprehensionConfig;

    /**
    * <p>自定义事件 ID，会透传到任务元数据与回调中</p>
    */
    @SerializedName("CustomId")
    @Expose
    private String CustomId;

    /**
    * <p>临时密钥有效期，单位：秒。默认 300 秒，取值范围 5 到 86400。</p>
    */
    @SerializedName("DurationSeconds")
    @Expose
    private Long DurationSeconds;

    /**
    * <p>该直传凭据最多可触发的分析次数</p><p>取值范围：[1, 10000]</p><p>默认值：1</p>
    */
    @SerializedName("MaxInvokeCount")
    @Expose
    private Long MaxInvokeCount;

    /**
    * <p>上传 COS 存储桶所在地域。不填时使用默认地域。</p>
    */
    @SerializedName("StorageRegion")
    @Expose
    private String StorageRegion;

    /**
    * <p>上传方式</p><p>枚举值：</p><ul><li>single： 单文件上传</li><li>manifest： 上传源文件与 Manifest（先上传多个源文件，然后上传 Manifest JSON 触发分析）</li></ul><p>默认值：single</p>
    */
    @SerializedName("UploadMethod")
    @Expose
    private String UploadMethod;

    /**
     * Get <p>产品 ID</p><p>非 IoT 设备可传 <code>default</code></p> 
     * @return ProductId <p>产品 ID</p><p>非 IoT 设备可传 <code>default</code></p>
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * Set <p>产品 ID</p><p>非 IoT 设备可传 <code>default</code></p>
     * @param ProductId <p>产品 ID</p><p>非 IoT 设备可传 <code>default</code></p>
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get <p>设备名称</p> 
     * @return DeviceName <p>设备名称</p>
     */
    public String getDeviceName() {
        return this.DeviceName;
    }

    /**
     * Set <p>设备名称</p>
     * @param DeviceName <p>设备名称</p>
     */
    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }

    /**
     * Get <p>算法类型</p><p>枚举值：</p><ul><li>VID_COMP： 视频理解（支持视频文件或多帧图片）</li><li>IMG_COMP： 图片理解（单帧图片）</li></ul> 
     * @return ServiceType <p>算法类型</p><p>枚举值：</p><ul><li>VID_COMP： 视频理解（支持视频文件或多帧图片）</li><li>IMG_COMP： 图片理解（单帧图片）</li></ul>
     */
    public String getServiceType() {
        return this.ServiceType;
    }

    /**
     * Set <p>算法类型</p><p>枚举值：</p><ul><li>VID_COMP： 视频理解（支持视频文件或多帧图片）</li><li>IMG_COMP： 图片理解（单帧图片）</li></ul>
     * @param ServiceType <p>算法类型</p><p>枚举值：</p><ul><li>VID_COMP： 视频理解（支持视频文件或多帧图片）</li><li>IMG_COMP： 图片理解（单帧图片）</li></ul>
     */
    public void setServiceType(String ServiceType) {
        this.ServiceType = ServiceType;
    }

    /**
     * Get <p>通道 ID</p><p>默认值：0</p> 
     * @return ChannelId <p>通道 ID</p><p>默认值：0</p>
     */
    public Long getChannelId() {
        return this.ChannelId;
    }

    /**
     * Set <p>通道 ID</p><p>默认值：0</p>
     * @param ChannelId <p>通道 ID</p><p>默认值：0</p>
     */
    public void setChannelId(Long ChannelId) {
        this.ChannelId = ChannelId;
    }

    /**
     * Get <p>回调目标 ID</p> 
     * @return CallbackId <p>回调目标 ID</p>
     */
    public String getCallbackId() {
        return this.CallbackId;
    }

    /**
     * Set <p>回调目标 ID</p>
     * @param CallbackId <p>回调目标 ID</p>
     */
    public void setCallbackId(String CallbackId) {
        this.CallbackId = CallbackId;
    }

    /**
     * Get <p>视觉理解配置项</p> 
     * @return ComprehensionConfig <p>视觉理解配置项</p>
     */
    public SeeComprehensionConfig getComprehensionConfig() {
        return this.ComprehensionConfig;
    }

    /**
     * Set <p>视觉理解配置项</p>
     * @param ComprehensionConfig <p>视觉理解配置项</p>
     */
    public void setComprehensionConfig(SeeComprehensionConfig ComprehensionConfig) {
        this.ComprehensionConfig = ComprehensionConfig;
    }

    /**
     * Get <p>自定义事件 ID，会透传到任务元数据与回调中</p> 
     * @return CustomId <p>自定义事件 ID，会透传到任务元数据与回调中</p>
     */
    public String getCustomId() {
        return this.CustomId;
    }

    /**
     * Set <p>自定义事件 ID，会透传到任务元数据与回调中</p>
     * @param CustomId <p>自定义事件 ID，会透传到任务元数据与回调中</p>
     */
    public void setCustomId(String CustomId) {
        this.CustomId = CustomId;
    }

    /**
     * Get <p>临时密钥有效期，单位：秒。默认 300 秒，取值范围 5 到 86400。</p> 
     * @return DurationSeconds <p>临时密钥有效期，单位：秒。默认 300 秒，取值范围 5 到 86400。</p>
     */
    public Long getDurationSeconds() {
        return this.DurationSeconds;
    }

    /**
     * Set <p>临时密钥有效期，单位：秒。默认 300 秒，取值范围 5 到 86400。</p>
     * @param DurationSeconds <p>临时密钥有效期，单位：秒。默认 300 秒，取值范围 5 到 86400。</p>
     */
    public void setDurationSeconds(Long DurationSeconds) {
        this.DurationSeconds = DurationSeconds;
    }

    /**
     * Get <p>该直传凭据最多可触发的分析次数</p><p>取值范围：[1, 10000]</p><p>默认值：1</p> 
     * @return MaxInvokeCount <p>该直传凭据最多可触发的分析次数</p><p>取值范围：[1, 10000]</p><p>默认值：1</p>
     */
    public Long getMaxInvokeCount() {
        return this.MaxInvokeCount;
    }

    /**
     * Set <p>该直传凭据最多可触发的分析次数</p><p>取值范围：[1, 10000]</p><p>默认值：1</p>
     * @param MaxInvokeCount <p>该直传凭据最多可触发的分析次数</p><p>取值范围：[1, 10000]</p><p>默认值：1</p>
     */
    public void setMaxInvokeCount(Long MaxInvokeCount) {
        this.MaxInvokeCount = MaxInvokeCount;
    }

    /**
     * Get <p>上传 COS 存储桶所在地域。不填时使用默认地域。</p> 
     * @return StorageRegion <p>上传 COS 存储桶所在地域。不填时使用默认地域。</p>
     */
    public String getStorageRegion() {
        return this.StorageRegion;
    }

    /**
     * Set <p>上传 COS 存储桶所在地域。不填时使用默认地域。</p>
     * @param StorageRegion <p>上传 COS 存储桶所在地域。不填时使用默认地域。</p>
     */
    public void setStorageRegion(String StorageRegion) {
        this.StorageRegion = StorageRegion;
    }

    /**
     * Get <p>上传方式</p><p>枚举值：</p><ul><li>single： 单文件上传</li><li>manifest： 上传源文件与 Manifest（先上传多个源文件，然后上传 Manifest JSON 触发分析）</li></ul><p>默认值：single</p> 
     * @return UploadMethod <p>上传方式</p><p>枚举值：</p><ul><li>single： 单文件上传</li><li>manifest： 上传源文件与 Manifest（先上传多个源文件，然后上传 Manifest JSON 触发分析）</li></ul><p>默认值：single</p>
     */
    public String getUploadMethod() {
        return this.UploadMethod;
    }

    /**
     * Set <p>上传方式</p><p>枚举值：</p><ul><li>single： 单文件上传</li><li>manifest： 上传源文件与 Manifest（先上传多个源文件，然后上传 Manifest JSON 触发分析）</li></ul><p>默认值：single</p>
     * @param UploadMethod <p>上传方式</p><p>枚举值：</p><ul><li>single： 单文件上传</li><li>manifest： 上传源文件与 Manifest（先上传多个源文件，然后上传 Manifest JSON 触发分析）</li></ul><p>默认值：single</p>
     */
    public void setUploadMethod(String UploadMethod) {
        this.UploadMethod = UploadMethod;
    }

    public CreateTWeSeeDirectUploadCredentialRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateTWeSeeDirectUploadCredentialRequest(CreateTWeSeeDirectUploadCredentialRequest source) {
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
        if (source.CallbackId != null) {
            this.CallbackId = new String(source.CallbackId);
        }
        if (source.ComprehensionConfig != null) {
            this.ComprehensionConfig = new SeeComprehensionConfig(source.ComprehensionConfig);
        }
        if (source.CustomId != null) {
            this.CustomId = new String(source.CustomId);
        }
        if (source.DurationSeconds != null) {
            this.DurationSeconds = new Long(source.DurationSeconds);
        }
        if (source.MaxInvokeCount != null) {
            this.MaxInvokeCount = new Long(source.MaxInvokeCount);
        }
        if (source.StorageRegion != null) {
            this.StorageRegion = new String(source.StorageRegion);
        }
        if (source.UploadMethod != null) {
            this.UploadMethod = new String(source.UploadMethod);
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
        this.setParamSimple(map, prefix + "CallbackId", this.CallbackId);
        this.setParamObj(map, prefix + "ComprehensionConfig.", this.ComprehensionConfig);
        this.setParamSimple(map, prefix + "CustomId", this.CustomId);
        this.setParamSimple(map, prefix + "DurationSeconds", this.DurationSeconds);
        this.setParamSimple(map, prefix + "MaxInvokeCount", this.MaxInvokeCount);
        this.setParamSimple(map, prefix + "StorageRegion", this.StorageRegion);
        this.setParamSimple(map, prefix + "UploadMethod", this.UploadMethod);

    }
}

