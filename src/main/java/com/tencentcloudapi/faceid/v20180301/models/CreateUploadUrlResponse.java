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
package com.tencentcloudapi.faceid.v20180301.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateUploadUrlResponse extends AbstractModel{

    /**
    * 用于上传内容的链接，使用HTTP PUT方法上传。
    */
    @SerializedName("UploadUrl")
    @Expose
    private String UploadUrl;

    /**
    * 完成上传后将该链接用于后续需要传入资源URL的地方。
    */
    @SerializedName("ResourceUrl")
    @Expose
    private String ResourceUrl;

    /**
    * 上传和下载链接过期时间点，10位unix时间戳。
    */
    @SerializedName("ExpiredTimestamp")
    @Expose
    private Long ExpiredTimestamp;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 用于上传内容的链接，使用HTTP PUT方法上传。 
     * @return UploadUrl 用于上传内容的链接，使用HTTP PUT方法上传。
     */
    public String getUploadUrl() {
        return this.UploadUrl;
    }

    /**
     * Set 用于上传内容的链接，使用HTTP PUT方法上传。
     * @param UploadUrl 用于上传内容的链接，使用HTTP PUT方法上传。
     */
    public void setUploadUrl(String UploadUrl) {
        this.UploadUrl = UploadUrl;
    }

    /**
     * Get 完成上传后将该链接用于后续需要传入资源URL的地方。 
     * @return ResourceUrl 完成上传后将该链接用于后续需要传入资源URL的地方。
     */
    public String getResourceUrl() {
        return this.ResourceUrl;
    }

    /**
     * Set 完成上传后将该链接用于后续需要传入资源URL的地方。
     * @param ResourceUrl 完成上传后将该链接用于后续需要传入资源URL的地方。
     */
    public void setResourceUrl(String ResourceUrl) {
        this.ResourceUrl = ResourceUrl;
    }

    /**
     * Get 上传和下载链接过期时间点，10位unix时间戳。 
     * @return ExpiredTimestamp 上传和下载链接过期时间点，10位unix时间戳。
     */
    public Long getExpiredTimestamp() {
        return this.ExpiredTimestamp;
    }

    /**
     * Set 上传和下载链接过期时间点，10位unix时间戳。
     * @param ExpiredTimestamp 上传和下载链接过期时间点，10位unix时间戳。
     */
    public void setExpiredTimestamp(Long ExpiredTimestamp) {
        this.ExpiredTimestamp = ExpiredTimestamp;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public CreateUploadUrlResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateUploadUrlResponse(CreateUploadUrlResponse source) {
        if (source.UploadUrl != null) {
            this.UploadUrl = new String(source.UploadUrl);
        }
        if (source.ResourceUrl != null) {
            this.ResourceUrl = new String(source.ResourceUrl);
        }
        if (source.ExpiredTimestamp != null) {
            this.ExpiredTimestamp = new Long(source.ExpiredTimestamp);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UploadUrl", this.UploadUrl);
        this.setParamSimple(map, prefix + "ResourceUrl", this.ResourceUrl);
        this.setParamSimple(map, prefix + "ExpiredTimestamp", this.ExpiredTimestamp);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

