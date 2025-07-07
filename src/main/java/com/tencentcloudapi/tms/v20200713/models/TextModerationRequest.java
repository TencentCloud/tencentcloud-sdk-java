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
package com.tencentcloudapi.tms.v20200713.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TextModerationRequest extends AbstractModel {

    /**
    * 文本内容Base64编码。限制原文长度不能超过10000个unicode字符
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * 该字段用于标识业务场景。您可以在内容安全控制台创建对应的ID，配置不同的内容审核策略，通过接口调用，默认不填为0，后端使用默认策略
    */
    @SerializedName("BizType")
    @Expose
    private String BizType;

    /**
    * 数据ID，英文字母、下划线、-组成，不超过64个字符
    */
    @SerializedName("DataId")
    @Expose
    private String DataId;

    /**
    * 账号相关信息字段，填入后可识别违规风险账号
    */
    @SerializedName("User")
    @Expose
    private User User;

    /**
    * 设备相关信息字段，填入后可识别违规风险设备
    */
    @SerializedName("Device")
    @Expose
    private Device Device;

    /**
     * Get 文本内容Base64编码。限制原文长度不能超过10000个unicode字符 
     * @return Content 文本内容Base64编码。限制原文长度不能超过10000个unicode字符
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set 文本内容Base64编码。限制原文长度不能超过10000个unicode字符
     * @param Content 文本内容Base64编码。限制原文长度不能超过10000个unicode字符
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get 该字段用于标识业务场景。您可以在内容安全控制台创建对应的ID，配置不同的内容审核策略，通过接口调用，默认不填为0，后端使用默认策略 
     * @return BizType 该字段用于标识业务场景。您可以在内容安全控制台创建对应的ID，配置不同的内容审核策略，通过接口调用，默认不填为0，后端使用默认策略
     */
    public String getBizType() {
        return this.BizType;
    }

    /**
     * Set 该字段用于标识业务场景。您可以在内容安全控制台创建对应的ID，配置不同的内容审核策略，通过接口调用，默认不填为0，后端使用默认策略
     * @param BizType 该字段用于标识业务场景。您可以在内容安全控制台创建对应的ID，配置不同的内容审核策略，通过接口调用，默认不填为0，后端使用默认策略
     */
    public void setBizType(String BizType) {
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
     * Get 账号相关信息字段，填入后可识别违规风险账号 
     * @return User 账号相关信息字段，填入后可识别违规风险账号
     */
    public User getUser() {
        return this.User;
    }

    /**
     * Set 账号相关信息字段，填入后可识别违规风险账号
     * @param User 账号相关信息字段，填入后可识别违规风险账号
     */
    public void setUser(User User) {
        this.User = User;
    }

    /**
     * Get 设备相关信息字段，填入后可识别违规风险设备 
     * @return Device 设备相关信息字段，填入后可识别违规风险设备
     */
    public Device getDevice() {
        return this.Device;
    }

    /**
     * Set 设备相关信息字段，填入后可识别违规风险设备
     * @param Device 设备相关信息字段，填入后可识别违规风险设备
     */
    public void setDevice(Device Device) {
        this.Device = Device;
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
        if (source.BizType != null) {
            this.BizType = new String(source.BizType);
        }
        if (source.DataId != null) {
            this.DataId = new String(source.DataId);
        }
        if (source.User != null) {
            this.User = new User(source.User);
        }
        if (source.Device != null) {
            this.Device = new Device(source.Device);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "BizType", this.BizType);
        this.setParamSimple(map, prefix + "DataId", this.DataId);
        this.setParamObj(map, prefix + "User.", this.User);
        this.setParamObj(map, prefix + "Device.", this.Device);

    }
}

