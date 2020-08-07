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
package com.tencentcloudapi.rkp.v20191209.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetOpenIdRequest extends AbstractModel{

    /**
    * dev临时token，通过sdk接口获取
    */
    @SerializedName("DeviceToken")
    @Expose
    private String DeviceToken;

    /**
    * 业务ID
    */
    @SerializedName("BusinessId")
    @Expose
    private Long BusinessId;

    /**
    * 业务侧账号体系下的用户ID
    */
    @SerializedName("BusinessUserId")
    @Expose
    private String BusinessUserId;

    /**
    * 平台：0-Android， 1-iOS， 2-web
    */
    @SerializedName("Platform")
    @Expose
    private Long Platform;

    /**
    * 选项
    */
    @SerializedName("Option")
    @Expose
    private String Option;

    /**
     * Get dev临时token，通过sdk接口获取 
     * @return DeviceToken dev临时token，通过sdk接口获取
     */
    public String getDeviceToken() {
        return this.DeviceToken;
    }

    /**
     * Set dev临时token，通过sdk接口获取
     * @param DeviceToken dev临时token，通过sdk接口获取
     */
    public void setDeviceToken(String DeviceToken) {
        this.DeviceToken = DeviceToken;
    }

    /**
     * Get 业务ID 
     * @return BusinessId 业务ID
     */
    public Long getBusinessId() {
        return this.BusinessId;
    }

    /**
     * Set 业务ID
     * @param BusinessId 业务ID
     */
    public void setBusinessId(Long BusinessId) {
        this.BusinessId = BusinessId;
    }

    /**
     * Get 业务侧账号体系下的用户ID 
     * @return BusinessUserId 业务侧账号体系下的用户ID
     */
    public String getBusinessUserId() {
        return this.BusinessUserId;
    }

    /**
     * Set 业务侧账号体系下的用户ID
     * @param BusinessUserId 业务侧账号体系下的用户ID
     */
    public void setBusinessUserId(String BusinessUserId) {
        this.BusinessUserId = BusinessUserId;
    }

    /**
     * Get 平台：0-Android， 1-iOS， 2-web 
     * @return Platform 平台：0-Android， 1-iOS， 2-web
     */
    public Long getPlatform() {
        return this.Platform;
    }

    /**
     * Set 平台：0-Android， 1-iOS， 2-web
     * @param Platform 平台：0-Android， 1-iOS， 2-web
     */
    public void setPlatform(Long Platform) {
        this.Platform = Platform;
    }

    /**
     * Get 选项 
     * @return Option 选项
     */
    public String getOption() {
        return this.Option;
    }

    /**
     * Set 选项
     * @param Option 选项
     */
    public void setOption(String Option) {
        this.Option = Option;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeviceToken", this.DeviceToken);
        this.setParamSimple(map, prefix + "BusinessId", this.BusinessId);
        this.setParamSimple(map, prefix + "BusinessUserId", this.BusinessUserId);
        this.setParamSimple(map, prefix + "Platform", this.Platform);
        this.setParamSimple(map, prefix + "Option", this.Option);

    }
}

