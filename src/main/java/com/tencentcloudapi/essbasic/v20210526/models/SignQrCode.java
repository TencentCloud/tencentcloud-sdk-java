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
package com.tencentcloudapi.essbasic.v20210526.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SignQrCode extends AbstractModel {

    /**
    * 二维码ID，为32位字符串。	

注: 需要保留此二维码ID, 用于后序通过<a href="https://qian.tencent.com/developers/partnerApis/templates/ChannelCancelMultiFlowSignQRCode" target="_blank">取消一码多扫二维码</a>关闭这个二维码的签署功能。	
    */
    @SerializedName("QrCodeId")
    @Expose
    private String QrCodeId;

    /**
    * 二维码URL，可通过转换二维码的工具或代码组件将此URL转化为二维码，以便用户扫描进行流程签署。	
    */
    @SerializedName("QrCodeUrl")
    @Expose
    private String QrCodeUrl;

    /**
    * 二维码的有截止时间，格式为Unix标准时间戳（秒），可以通过入参的QrEffectiveDay来设置有效期，默认为7天有效期。 
一旦超过二维码的有效期限，该二维码将自动失效。	
    */
    @SerializedName("ExpiredTime")
    @Expose
    private Long ExpiredTime;

    /**
     * Get 二维码ID，为32位字符串。	

注: 需要保留此二维码ID, 用于后序通过<a href="https://qian.tencent.com/developers/partnerApis/templates/ChannelCancelMultiFlowSignQRCode" target="_blank">取消一码多扫二维码</a>关闭这个二维码的签署功能。	 
     * @return QrCodeId 二维码ID，为32位字符串。	

注: 需要保留此二维码ID, 用于后序通过<a href="https://qian.tencent.com/developers/partnerApis/templates/ChannelCancelMultiFlowSignQRCode" target="_blank">取消一码多扫二维码</a>关闭这个二维码的签署功能。	
     */
    public String getQrCodeId() {
        return this.QrCodeId;
    }

    /**
     * Set 二维码ID，为32位字符串。	

注: 需要保留此二维码ID, 用于后序通过<a href="https://qian.tencent.com/developers/partnerApis/templates/ChannelCancelMultiFlowSignQRCode" target="_blank">取消一码多扫二维码</a>关闭这个二维码的签署功能。	
     * @param QrCodeId 二维码ID，为32位字符串。	

注: 需要保留此二维码ID, 用于后序通过<a href="https://qian.tencent.com/developers/partnerApis/templates/ChannelCancelMultiFlowSignQRCode" target="_blank">取消一码多扫二维码</a>关闭这个二维码的签署功能。	
     */
    public void setQrCodeId(String QrCodeId) {
        this.QrCodeId = QrCodeId;
    }

    /**
     * Get 二维码URL，可通过转换二维码的工具或代码组件将此URL转化为二维码，以便用户扫描进行流程签署。	 
     * @return QrCodeUrl 二维码URL，可通过转换二维码的工具或代码组件将此URL转化为二维码，以便用户扫描进行流程签署。	
     */
    public String getQrCodeUrl() {
        return this.QrCodeUrl;
    }

    /**
     * Set 二维码URL，可通过转换二维码的工具或代码组件将此URL转化为二维码，以便用户扫描进行流程签署。	
     * @param QrCodeUrl 二维码URL，可通过转换二维码的工具或代码组件将此URL转化为二维码，以便用户扫描进行流程签署。	
     */
    public void setQrCodeUrl(String QrCodeUrl) {
        this.QrCodeUrl = QrCodeUrl;
    }

    /**
     * Get 二维码的有截止时间，格式为Unix标准时间戳（秒），可以通过入参的QrEffectiveDay来设置有效期，默认为7天有效期。 
一旦超过二维码的有效期限，该二维码将自动失效。	 
     * @return ExpiredTime 二维码的有截止时间，格式为Unix标准时间戳（秒），可以通过入参的QrEffectiveDay来设置有效期，默认为7天有效期。 
一旦超过二维码的有效期限，该二维码将自动失效。	
     */
    public Long getExpiredTime() {
        return this.ExpiredTime;
    }

    /**
     * Set 二维码的有截止时间，格式为Unix标准时间戳（秒），可以通过入参的QrEffectiveDay来设置有效期，默认为7天有效期。 
一旦超过二维码的有效期限，该二维码将自动失效。	
     * @param ExpiredTime 二维码的有截止时间，格式为Unix标准时间戳（秒），可以通过入参的QrEffectiveDay来设置有效期，默认为7天有效期。 
一旦超过二维码的有效期限，该二维码将自动失效。	
     */
    public void setExpiredTime(Long ExpiredTime) {
        this.ExpiredTime = ExpiredTime;
    }

    public SignQrCode() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SignQrCode(SignQrCode source) {
        if (source.QrCodeId != null) {
            this.QrCodeId = new String(source.QrCodeId);
        }
        if (source.QrCodeUrl != null) {
            this.QrCodeUrl = new String(source.QrCodeUrl);
        }
        if (source.ExpiredTime != null) {
            this.ExpiredTime = new Long(source.ExpiredTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "QrCodeId", this.QrCodeId);
        this.setParamSimple(map, prefix + "QrCodeUrl", this.QrCodeUrl);
        this.setParamSimple(map, prefix + "ExpiredTime", this.ExpiredTime);

    }
}

