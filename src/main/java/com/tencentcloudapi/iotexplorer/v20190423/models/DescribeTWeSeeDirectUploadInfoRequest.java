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

public class DescribeTWeSeeDirectUploadInfoRequest extends AbstractModel {

    /**
    * <p>产品 ID</p>
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
    * <p>服务类型。</p><p>枚举值：</p><ul><li>VID_COMP： 视频理解</li><li>IMG_COMP： 图片理解</li></ul>
    */
    @SerializedName("ServiceType")
    @Expose
    private String ServiceType;

    /**
    * <p>上传方式。</p><p>枚举值：</p><ul><li>single： 单文件上传</li><li>manifest： 上传源文件与 Manifest（先上传多个源文件，然后上传 Manifest JSON 触发分析）</li></ul><p>默认值：single</p>
    */
    @SerializedName("UploadMethod")
    @Expose
    private String UploadMethod;

    /**
    * <p>上传目标，固定取值为 <code>stream</code>，不填时默认为 <code>stream</code></p><p>枚举值：</p><ul><li>stream： 上传到指定设备（加载对应设备的 ComprehensionConfig 等配置）</li></ul><p>默认值：stream</p>
    */
    @SerializedName("UploadTarget")
    @Expose
    private String UploadTarget;

    /**
    * <p>通道 ID，非 NVR 设备不填，NVR 设备必填</p>
    */
    @SerializedName("ChannelId")
    @Expose
    private Long ChannelId;

    /**
     * Get <p>产品 ID</p> 
     * @return ProductId <p>产品 ID</p>
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * Set <p>产品 ID</p>
     * @param ProductId <p>产品 ID</p>
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
     * Get <p>服务类型。</p><p>枚举值：</p><ul><li>VID_COMP： 视频理解</li><li>IMG_COMP： 图片理解</li></ul> 
     * @return ServiceType <p>服务类型。</p><p>枚举值：</p><ul><li>VID_COMP： 视频理解</li><li>IMG_COMP： 图片理解</li></ul>
     */
    public String getServiceType() {
        return this.ServiceType;
    }

    /**
     * Set <p>服务类型。</p><p>枚举值：</p><ul><li>VID_COMP： 视频理解</li><li>IMG_COMP： 图片理解</li></ul>
     * @param ServiceType <p>服务类型。</p><p>枚举值：</p><ul><li>VID_COMP： 视频理解</li><li>IMG_COMP： 图片理解</li></ul>
     */
    public void setServiceType(String ServiceType) {
        this.ServiceType = ServiceType;
    }

    /**
     * Get <p>上传方式。</p><p>枚举值：</p><ul><li>single： 单文件上传</li><li>manifest： 上传源文件与 Manifest（先上传多个源文件，然后上传 Manifest JSON 触发分析）</li></ul><p>默认值：single</p> 
     * @return UploadMethod <p>上传方式。</p><p>枚举值：</p><ul><li>single： 单文件上传</li><li>manifest： 上传源文件与 Manifest（先上传多个源文件，然后上传 Manifest JSON 触发分析）</li></ul><p>默认值：single</p>
     */
    public String getUploadMethod() {
        return this.UploadMethod;
    }

    /**
     * Set <p>上传方式。</p><p>枚举值：</p><ul><li>single： 单文件上传</li><li>manifest： 上传源文件与 Manifest（先上传多个源文件，然后上传 Manifest JSON 触发分析）</li></ul><p>默认值：single</p>
     * @param UploadMethod <p>上传方式。</p><p>枚举值：</p><ul><li>single： 单文件上传</li><li>manifest： 上传源文件与 Manifest（先上传多个源文件，然后上传 Manifest JSON 触发分析）</li></ul><p>默认值：single</p>
     */
    public void setUploadMethod(String UploadMethod) {
        this.UploadMethod = UploadMethod;
    }

    /**
     * Get <p>上传目标，固定取值为 <code>stream</code>，不填时默认为 <code>stream</code></p><p>枚举值：</p><ul><li>stream： 上传到指定设备（加载对应设备的 ComprehensionConfig 等配置）</li></ul><p>默认值：stream</p> 
     * @return UploadTarget <p>上传目标，固定取值为 <code>stream</code>，不填时默认为 <code>stream</code></p><p>枚举值：</p><ul><li>stream： 上传到指定设备（加载对应设备的 ComprehensionConfig 等配置）</li></ul><p>默认值：stream</p>
     */
    public String getUploadTarget() {
        return this.UploadTarget;
    }

    /**
     * Set <p>上传目标，固定取值为 <code>stream</code>，不填时默认为 <code>stream</code></p><p>枚举值：</p><ul><li>stream： 上传到指定设备（加载对应设备的 ComprehensionConfig 等配置）</li></ul><p>默认值：stream</p>
     * @param UploadTarget <p>上传目标，固定取值为 <code>stream</code>，不填时默认为 <code>stream</code></p><p>枚举值：</p><ul><li>stream： 上传到指定设备（加载对应设备的 ComprehensionConfig 等配置）</li></ul><p>默认值：stream</p>
     */
    public void setUploadTarget(String UploadTarget) {
        this.UploadTarget = UploadTarget;
    }

    /**
     * Get <p>通道 ID，非 NVR 设备不填，NVR 设备必填</p> 
     * @return ChannelId <p>通道 ID，非 NVR 设备不填，NVR 设备必填</p>
     */
    public Long getChannelId() {
        return this.ChannelId;
    }

    /**
     * Set <p>通道 ID，非 NVR 设备不填，NVR 设备必填</p>
     * @param ChannelId <p>通道 ID，非 NVR 设备不填，NVR 设备必填</p>
     */
    public void setChannelId(Long ChannelId) {
        this.ChannelId = ChannelId;
    }

    public DescribeTWeSeeDirectUploadInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTWeSeeDirectUploadInfoRequest(DescribeTWeSeeDirectUploadInfoRequest source) {
        if (source.ProductId != null) {
            this.ProductId = new String(source.ProductId);
        }
        if (source.DeviceName != null) {
            this.DeviceName = new String(source.DeviceName);
        }
        if (source.ServiceType != null) {
            this.ServiceType = new String(source.ServiceType);
        }
        if (source.UploadMethod != null) {
            this.UploadMethod = new String(source.UploadMethod);
        }
        if (source.UploadTarget != null) {
            this.UploadTarget = new String(source.UploadTarget);
        }
        if (source.ChannelId != null) {
            this.ChannelId = new Long(source.ChannelId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamSimple(map, prefix + "ServiceType", this.ServiceType);
        this.setParamSimple(map, prefix + "UploadMethod", this.UploadMethod);
        this.setParamSimple(map, prefix + "UploadTarget", this.UploadTarget);
        this.setParamSimple(map, prefix + "ChannelId", this.ChannelId);

    }
}

