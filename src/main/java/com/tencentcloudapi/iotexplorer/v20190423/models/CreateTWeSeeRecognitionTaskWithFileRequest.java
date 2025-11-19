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

public class CreateTWeSeeRecognitionTaskWithFileRequest extends AbstractModel {

    /**
    * 产品ID
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
    * 视频 / 图片文件的 Base64 编码字符串
    */
    @SerializedName("InputBase64")
    @Expose
    private String InputBase64;

    /**
    * 通道 ID
    */
    @SerializedName("ChannelId")
    @Expose
    private Long ChannelId;

    /**
    * 自定义事件 ID
    */
    @SerializedName("CustomId")
    @Expose
    private String CustomId;

    /**
    * 是否保存该事件使其可被搜索
    */
    @SerializedName("EnableSearch")
    @Expose
    private Boolean EnableSearch;

    /**
    * 事件起始时间事件起始时间（毫秒级 UNIX 时间戳，若不传则默认为接口调用时间）
    */
    @SerializedName("StartTimeMs")
    @Expose
    private Long StartTimeMs;

    /**
    * 事件结束时间事件起始时间（毫秒级 UNIX 时间戳，若不传则默认为接口调用时间）
    */
    @SerializedName("EndTimeMs")
    @Expose
    private Long EndTimeMs;

    /**
    * 算法配置
    */
    @SerializedName("Config")
    @Expose
    private String Config;

    /**
    * 是否自定义设备，为 true 时不检查设备存在性，默认为 false
    */
    @SerializedName("IsCustomDevice")
    @Expose
    private Boolean IsCustomDevice;

    /**
    * 输入类型。可选值：

- `video`：视频（默认值）
- `image`：图片
    */
    @SerializedName("InputType")
    @Expose
    private String InputType;

    /**
    * 摘要服务质量。可选值：

- `minutely`：分钟级（默认值）
- `immediate`：立即
    */
    @SerializedName("SummaryQOS")
    @Expose
    private String SummaryQOS;

    /**
    * 摘要输出配置
    */
    @SerializedName("SummaryConfig")
    @Expose
    private VisionSummaryConfig SummaryConfig;

    /**
    * 算法类型，可能取值：
- `Summary`：视频/图片摘要
- `ObjectDetect`：目标检测
    */
    @SerializedName("ServiceType")
    @Expose
    private String ServiceType;

    /**
    * 目标检测配置
    */
    @SerializedName("ObjectDetectConfig")
    @Expose
    private VisionObjectDetectConfig ObjectDetectConfig;

    /**
     * Get 产品ID 
     * @return ProductId 产品ID
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * Set 产品ID
     * @param ProductId 产品ID
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
     * Get 视频 / 图片文件的 Base64 编码字符串 
     * @return InputBase64 视频 / 图片文件的 Base64 编码字符串
     */
    public String getInputBase64() {
        return this.InputBase64;
    }

    /**
     * Set 视频 / 图片文件的 Base64 编码字符串
     * @param InputBase64 视频 / 图片文件的 Base64 编码字符串
     */
    public void setInputBase64(String InputBase64) {
        this.InputBase64 = InputBase64;
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
     * Get 自定义事件 ID 
     * @return CustomId 自定义事件 ID
     */
    public String getCustomId() {
        return this.CustomId;
    }

    /**
     * Set 自定义事件 ID
     * @param CustomId 自定义事件 ID
     */
    public void setCustomId(String CustomId) {
        this.CustomId = CustomId;
    }

    /**
     * Get 是否保存该事件使其可被搜索 
     * @return EnableSearch 是否保存该事件使其可被搜索
     */
    public Boolean getEnableSearch() {
        return this.EnableSearch;
    }

    /**
     * Set 是否保存该事件使其可被搜索
     * @param EnableSearch 是否保存该事件使其可被搜索
     */
    public void setEnableSearch(Boolean EnableSearch) {
        this.EnableSearch = EnableSearch;
    }

    /**
     * Get 事件起始时间事件起始时间（毫秒级 UNIX 时间戳，若不传则默认为接口调用时间） 
     * @return StartTimeMs 事件起始时间事件起始时间（毫秒级 UNIX 时间戳，若不传则默认为接口调用时间）
     */
    public Long getStartTimeMs() {
        return this.StartTimeMs;
    }

    /**
     * Set 事件起始时间事件起始时间（毫秒级 UNIX 时间戳，若不传则默认为接口调用时间）
     * @param StartTimeMs 事件起始时间事件起始时间（毫秒级 UNIX 时间戳，若不传则默认为接口调用时间）
     */
    public void setStartTimeMs(Long StartTimeMs) {
        this.StartTimeMs = StartTimeMs;
    }

    /**
     * Get 事件结束时间事件起始时间（毫秒级 UNIX 时间戳，若不传则默认为接口调用时间） 
     * @return EndTimeMs 事件结束时间事件起始时间（毫秒级 UNIX 时间戳，若不传则默认为接口调用时间）
     */
    public Long getEndTimeMs() {
        return this.EndTimeMs;
    }

    /**
     * Set 事件结束时间事件起始时间（毫秒级 UNIX 时间戳，若不传则默认为接口调用时间）
     * @param EndTimeMs 事件结束时间事件起始时间（毫秒级 UNIX 时间戳，若不传则默认为接口调用时间）
     */
    public void setEndTimeMs(Long EndTimeMs) {
        this.EndTimeMs = EndTimeMs;
    }

    /**
     * Get 算法配置 
     * @return Config 算法配置
     */
    public String getConfig() {
        return this.Config;
    }

    /**
     * Set 算法配置
     * @param Config 算法配置
     */
    public void setConfig(String Config) {
        this.Config = Config;
    }

    /**
     * Get 是否自定义设备，为 true 时不检查设备存在性，默认为 false 
     * @return IsCustomDevice 是否自定义设备，为 true 时不检查设备存在性，默认为 false
     */
    public Boolean getIsCustomDevice() {
        return this.IsCustomDevice;
    }

    /**
     * Set 是否自定义设备，为 true 时不检查设备存在性，默认为 false
     * @param IsCustomDevice 是否自定义设备，为 true 时不检查设备存在性，默认为 false
     */
    public void setIsCustomDevice(Boolean IsCustomDevice) {
        this.IsCustomDevice = IsCustomDevice;
    }

    /**
     * Get 输入类型。可选值：

- `video`：视频（默认值）
- `image`：图片 
     * @return InputType 输入类型。可选值：

- `video`：视频（默认值）
- `image`：图片
     */
    public String getInputType() {
        return this.InputType;
    }

    /**
     * Set 输入类型。可选值：

- `video`：视频（默认值）
- `image`：图片
     * @param InputType 输入类型。可选值：

- `video`：视频（默认值）
- `image`：图片
     */
    public void setInputType(String InputType) {
        this.InputType = InputType;
    }

    /**
     * Get 摘要服务质量。可选值：

- `minutely`：分钟级（默认值）
- `immediate`：立即 
     * @return SummaryQOS 摘要服务质量。可选值：

- `minutely`：分钟级（默认值）
- `immediate`：立即
     */
    public String getSummaryQOS() {
        return this.SummaryQOS;
    }

    /**
     * Set 摘要服务质量。可选值：

- `minutely`：分钟级（默认值）
- `immediate`：立即
     * @param SummaryQOS 摘要服务质量。可选值：

- `minutely`：分钟级（默认值）
- `immediate`：立即
     */
    public void setSummaryQOS(String SummaryQOS) {
        this.SummaryQOS = SummaryQOS;
    }

    /**
     * Get 摘要输出配置 
     * @return SummaryConfig 摘要输出配置
     */
    public VisionSummaryConfig getSummaryConfig() {
        return this.SummaryConfig;
    }

    /**
     * Set 摘要输出配置
     * @param SummaryConfig 摘要输出配置
     */
    public void setSummaryConfig(VisionSummaryConfig SummaryConfig) {
        this.SummaryConfig = SummaryConfig;
    }

    /**
     * Get 算法类型，可能取值：
- `Summary`：视频/图片摘要
- `ObjectDetect`：目标检测 
     * @return ServiceType 算法类型，可能取值：
- `Summary`：视频/图片摘要
- `ObjectDetect`：目标检测
     */
    public String getServiceType() {
        return this.ServiceType;
    }

    /**
     * Set 算法类型，可能取值：
- `Summary`：视频/图片摘要
- `ObjectDetect`：目标检测
     * @param ServiceType 算法类型，可能取值：
- `Summary`：视频/图片摘要
- `ObjectDetect`：目标检测
     */
    public void setServiceType(String ServiceType) {
        this.ServiceType = ServiceType;
    }

    /**
     * Get 目标检测配置 
     * @return ObjectDetectConfig 目标检测配置
     */
    public VisionObjectDetectConfig getObjectDetectConfig() {
        return this.ObjectDetectConfig;
    }

    /**
     * Set 目标检测配置
     * @param ObjectDetectConfig 目标检测配置
     */
    public void setObjectDetectConfig(VisionObjectDetectConfig ObjectDetectConfig) {
        this.ObjectDetectConfig = ObjectDetectConfig;
    }

    public CreateTWeSeeRecognitionTaskWithFileRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateTWeSeeRecognitionTaskWithFileRequest(CreateTWeSeeRecognitionTaskWithFileRequest source) {
        if (source.ProductId != null) {
            this.ProductId = new String(source.ProductId);
        }
        if (source.DeviceName != null) {
            this.DeviceName = new String(source.DeviceName);
        }
        if (source.InputBase64 != null) {
            this.InputBase64 = new String(source.InputBase64);
        }
        if (source.ChannelId != null) {
            this.ChannelId = new Long(source.ChannelId);
        }
        if (source.CustomId != null) {
            this.CustomId = new String(source.CustomId);
        }
        if (source.EnableSearch != null) {
            this.EnableSearch = new Boolean(source.EnableSearch);
        }
        if (source.StartTimeMs != null) {
            this.StartTimeMs = new Long(source.StartTimeMs);
        }
        if (source.EndTimeMs != null) {
            this.EndTimeMs = new Long(source.EndTimeMs);
        }
        if (source.Config != null) {
            this.Config = new String(source.Config);
        }
        if (source.IsCustomDevice != null) {
            this.IsCustomDevice = new Boolean(source.IsCustomDevice);
        }
        if (source.InputType != null) {
            this.InputType = new String(source.InputType);
        }
        if (source.SummaryQOS != null) {
            this.SummaryQOS = new String(source.SummaryQOS);
        }
        if (source.SummaryConfig != null) {
            this.SummaryConfig = new VisionSummaryConfig(source.SummaryConfig);
        }
        if (source.ServiceType != null) {
            this.ServiceType = new String(source.ServiceType);
        }
        if (source.ObjectDetectConfig != null) {
            this.ObjectDetectConfig = new VisionObjectDetectConfig(source.ObjectDetectConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamSimple(map, prefix + "InputBase64", this.InputBase64);
        this.setParamSimple(map, prefix + "ChannelId", this.ChannelId);
        this.setParamSimple(map, prefix + "CustomId", this.CustomId);
        this.setParamSimple(map, prefix + "EnableSearch", this.EnableSearch);
        this.setParamSimple(map, prefix + "StartTimeMs", this.StartTimeMs);
        this.setParamSimple(map, prefix + "EndTimeMs", this.EndTimeMs);
        this.setParamSimple(map, prefix + "Config", this.Config);
        this.setParamSimple(map, prefix + "IsCustomDevice", this.IsCustomDevice);
        this.setParamSimple(map, prefix + "InputType", this.InputType);
        this.setParamSimple(map, prefix + "SummaryQOS", this.SummaryQOS);
        this.setParamObj(map, prefix + "SummaryConfig.", this.SummaryConfig);
        this.setParamSimple(map, prefix + "ServiceType", this.ServiceType);
        this.setParamObj(map, prefix + "ObjectDetectConfig.", this.ObjectDetectConfig);

    }
}

