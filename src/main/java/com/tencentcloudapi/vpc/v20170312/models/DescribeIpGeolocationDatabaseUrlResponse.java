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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeIpGeolocationDatabaseUrlResponse extends AbstractModel{

    /**
    * IP地理位置库下载链接地址。
    */
    @SerializedName("DownLoadUrl")
    @Expose
    private String DownLoadUrl;

    /**
    * 链接到期时间。按照`ISO8601`标准表示，并且使用`UTC`时间。
    */
    @SerializedName("ExpiredAt")
    @Expose
    private String ExpiredAt;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get IP地理位置库下载链接地址。 
     * @return DownLoadUrl IP地理位置库下载链接地址。
     */
    public String getDownLoadUrl() {
        return this.DownLoadUrl;
    }

    /**
     * Set IP地理位置库下载链接地址。
     * @param DownLoadUrl IP地理位置库下载链接地址。
     */
    public void setDownLoadUrl(String DownLoadUrl) {
        this.DownLoadUrl = DownLoadUrl;
    }

    /**
     * Get 链接到期时间。按照`ISO8601`标准表示，并且使用`UTC`时间。 
     * @return ExpiredAt 链接到期时间。按照`ISO8601`标准表示，并且使用`UTC`时间。
     */
    public String getExpiredAt() {
        return this.ExpiredAt;
    }

    /**
     * Set 链接到期时间。按照`ISO8601`标准表示，并且使用`UTC`时间。
     * @param ExpiredAt 链接到期时间。按照`ISO8601`标准表示，并且使用`UTC`时间。
     */
    public void setExpiredAt(String ExpiredAt) {
        this.ExpiredAt = ExpiredAt;
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

    public DescribeIpGeolocationDatabaseUrlResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeIpGeolocationDatabaseUrlResponse(DescribeIpGeolocationDatabaseUrlResponse source) {
        if (source.DownLoadUrl != null) {
            this.DownLoadUrl = new String(source.DownLoadUrl);
        }
        if (source.ExpiredAt != null) {
            this.ExpiredAt = new String(source.ExpiredAt);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DownLoadUrl", this.DownLoadUrl);
        this.setParamSimple(map, prefix + "ExpiredAt", this.ExpiredAt);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

