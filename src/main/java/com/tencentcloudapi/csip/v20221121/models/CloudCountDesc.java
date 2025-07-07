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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CloudCountDesc extends AbstractModel {

    /**
    * 0表示腾讯云
1表示AWS
    */
    @SerializedName("CloudType")
    @Expose
    private Long CloudType;

    /**
    * 账户数量
    */
    @SerializedName("CloudCount")
    @Expose
    private Long CloudCount;

    /**
    * 该云账号类型描述
    */
    @SerializedName("CloudDesc")
    @Expose
    private String CloudDesc;

    /**
     * Get 0表示腾讯云
1表示AWS 
     * @return CloudType 0表示腾讯云
1表示AWS
     */
    public Long getCloudType() {
        return this.CloudType;
    }

    /**
     * Set 0表示腾讯云
1表示AWS
     * @param CloudType 0表示腾讯云
1表示AWS
     */
    public void setCloudType(Long CloudType) {
        this.CloudType = CloudType;
    }

    /**
     * Get 账户数量 
     * @return CloudCount 账户数量
     */
    public Long getCloudCount() {
        return this.CloudCount;
    }

    /**
     * Set 账户数量
     * @param CloudCount 账户数量
     */
    public void setCloudCount(Long CloudCount) {
        this.CloudCount = CloudCount;
    }

    /**
     * Get 该云账号类型描述 
     * @return CloudDesc 该云账号类型描述
     */
    public String getCloudDesc() {
        return this.CloudDesc;
    }

    /**
     * Set 该云账号类型描述
     * @param CloudDesc 该云账号类型描述
     */
    public void setCloudDesc(String CloudDesc) {
        this.CloudDesc = CloudDesc;
    }

    public CloudCountDesc() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CloudCountDesc(CloudCountDesc source) {
        if (source.CloudType != null) {
            this.CloudType = new Long(source.CloudType);
        }
        if (source.CloudCount != null) {
            this.CloudCount = new Long(source.CloudCount);
        }
        if (source.CloudDesc != null) {
            this.CloudDesc = new String(source.CloudDesc);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CloudType", this.CloudType);
        this.setParamSimple(map, prefix + "CloudCount", this.CloudCount);
        this.setParamSimple(map, prefix + "CloudDesc", this.CloudDesc);

    }
}

