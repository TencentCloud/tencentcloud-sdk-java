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
package com.tencentcloudapi.cms.v20190321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TextModerationRequest extends AbstractModel{

    /**
    * 文本内容Base64编码。原文长度需小于15000字节，即5000个汉字以内。
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * 设备相关信息
    */
    @SerializedName("Device")
    @Expose
    private Device Device;

    /**
    * 用户相关信息
    */
    @SerializedName("User")
    @Expose
    private User User;

    /**
    * 该字段用于标识业务场景。您可以在内容安全控制台创建对应的ID，配置不同的内容审核策略，通过接口调用，默认不填为0，后端使用默认策略
    */
    @SerializedName("BizType")
    @Expose
    private Long BizType;

    /**
    * 数据ID，英文字母、下划线、-组成，不超过64个字符
    */
    @SerializedName("DataId")
    @Expose
    private String DataId;

    /**
    * 业务应用ID
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
     * Get 文本内容Base64编码。原文长度需小于15000字节，即5000个汉字以内。 
     * @return Content 文本内容Base64编码。原文长度需小于15000字节，即5000个汉字以内。
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set 文本内容Base64编码。原文长度需小于15000字节，即5000个汉字以内。
     * @param Content 文本内容Base64编码。原文长度需小于15000字节，即5000个汉字以内。
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get 设备相关信息 
     * @return Device 设备相关信息
     */
    public Device getDevice() {
        return this.Device;
    }

    /**
     * Set 设备相关信息
     * @param Device 设备相关信息
     */
    public void setDevice(Device Device) {
        this.Device = Device;
    }

    /**
     * Get 用户相关信息 
     * @return User 用户相关信息
     */
    public User getUser() {
        return this.User;
    }

    /**
     * Set 用户相关信息
     * @param User 用户相关信息
     */
    public void setUser(User User) {
        this.User = User;
    }

    /**
     * Get 该字段用于标识业务场景。您可以在内容安全控制台创建对应的ID，配置不同的内容审核策略，通过接口调用，默认不填为0，后端使用默认策略 
     * @return BizType 该字段用于标识业务场景。您可以在内容安全控制台创建对应的ID，配置不同的内容审核策略，通过接口调用，默认不填为0，后端使用默认策略
     */
    public Long getBizType() {
        return this.BizType;
    }

    /**
     * Set 该字段用于标识业务场景。您可以在内容安全控制台创建对应的ID，配置不同的内容审核策略，通过接口调用，默认不填为0，后端使用默认策略
     * @param BizType 该字段用于标识业务场景。您可以在内容安全控制台创建对应的ID，配置不同的内容审核策略，通过接口调用，默认不填为0，后端使用默认策略
     */
    public void setBizType(Long BizType) {
        this.BizType = BizType;
    }

    /**
     * Get 数据ID，英文字母、下划线、-组成，不超过64个字符 
     * @return DataId 数据ID，英文字母、下划线、-组成，不超过64个字符
     */
    public String getDataId() {
        return this.DataId;
    }

    /**
     * Set 数据ID，英文字母、下划线、-组成，不超过64个字符
     * @param DataId 数据ID，英文字母、下划线、-组成，不超过64个字符
     */
    public void setDataId(String DataId) {
        this.DataId = DataId;
    }

    /**
     * Get 业务应用ID 
     * @return SdkAppId 业务应用ID
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set 业务应用ID
     * @param SdkAppId 业务应用ID
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    public TextModerationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TextModerationRequest(TextModerationRequest source) {
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.Device != null) {
            this.Device = new Device(source.Device);
        }
        if (source.User != null) {
            this.User = new User(source.User);
        }
        if (source.BizType != null) {
            this.BizType = new Long(source.BizType);
        }
        if (source.DataId != null) {
            this.DataId = new String(source.DataId);
        }
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamObj(map, prefix + "Device.", this.Device);
        this.setParamObj(map, prefix + "User.", this.User);
        this.setParamSimple(map, prefix + "BizType", this.BizType);
        this.setParamSimple(map, prefix + "DataId", this.DataId);
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);

    }
}

