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
package com.tencentcloudapi.ses.v20201002.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateAddressUnsubscribeConfigRequest extends AbstractModel {

    /**
    * 发信地址
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
    * 退订链接选项 0: 不加入退订链接 1: 简体中文 2: 英文 3: 繁体中文 4: 西班牙语 5: 法语 6: 德语 7: 日语 8: 韩语 9: 阿拉伯语 10: 泰语
    */
    @SerializedName("UnsubscribeConfig")
    @Expose
    private String UnsubscribeConfig;

    /**
    * 0:关闭，1:打开
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get 发信地址 
     * @return Address 发信地址
     */
    public String getAddress() {
        return this.Address;
    }

    /**
     * Set 发信地址
     * @param Address 发信地址
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * Get 退订链接选项 0: 不加入退订链接 1: 简体中文 2: 英文 3: 繁体中文 4: 西班牙语 5: 法语 6: 德语 7: 日语 8: 韩语 9: 阿拉伯语 10: 泰语 
     * @return UnsubscribeConfig 退订链接选项 0: 不加入退订链接 1: 简体中文 2: 英文 3: 繁体中文 4: 西班牙语 5: 法语 6: 德语 7: 日语 8: 韩语 9: 阿拉伯语 10: 泰语
     */
    public String getUnsubscribeConfig() {
        return this.UnsubscribeConfig;
    }

    /**
     * Set 退订链接选项 0: 不加入退订链接 1: 简体中文 2: 英文 3: 繁体中文 4: 西班牙语 5: 法语 6: 德语 7: 日语 8: 韩语 9: 阿拉伯语 10: 泰语
     * @param UnsubscribeConfig 退订链接选项 0: 不加入退订链接 1: 简体中文 2: 英文 3: 繁体中文 4: 西班牙语 5: 法语 6: 德语 7: 日语 8: 韩语 9: 阿拉伯语 10: 泰语
     */
    public void setUnsubscribeConfig(String UnsubscribeConfig) {
        this.UnsubscribeConfig = UnsubscribeConfig;
    }

    /**
     * Get 0:关闭，1:打开 
     * @return Status 0:关闭，1:打开
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 0:关闭，1:打开
     * @param Status 0:关闭，1:打开
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public CreateAddressUnsubscribeConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAddressUnsubscribeConfigRequest(CreateAddressUnsubscribeConfigRequest source) {
        if (source.Address != null) {
            this.Address = new String(source.Address);
        }
        if (source.UnsubscribeConfig != null) {
            this.UnsubscribeConfig = new String(source.UnsubscribeConfig);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Address", this.Address);
        this.setParamSimple(map, prefix + "UnsubscribeConfig", this.UnsubscribeConfig);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

