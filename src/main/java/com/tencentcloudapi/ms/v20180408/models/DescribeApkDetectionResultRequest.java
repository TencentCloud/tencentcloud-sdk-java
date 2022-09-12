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
package com.tencentcloudapi.ms.v20180408.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeApkDetectionResultRequest extends AbstractModel{

    /**
    * 软件包的下载链接
    */
    @SerializedName("ApkUrl")
    @Expose
    private String ApkUrl;

    /**
    * 软件包的md5值，具有唯一性。腾讯APK云检测服务会根据md5值来判断该包是否为库中已收集的样本，已存在，则返回检测结果，反之，需要一定时间检测该样本。
    */
    @SerializedName("ApkMd5")
    @Expose
    private String ApkMd5;

    /**
     * Get 软件包的下载链接 
     * @return ApkUrl 软件包的下载链接
     */
    public String getApkUrl() {
        return this.ApkUrl;
    }

    /**
     * Set 软件包的下载链接
     * @param ApkUrl 软件包的下载链接
     */
    public void setApkUrl(String ApkUrl) {
        this.ApkUrl = ApkUrl;
    }

    /**
     * Get 软件包的md5值，具有唯一性。腾讯APK云检测服务会根据md5值来判断该包是否为库中已收集的样本，已存在，则返回检测结果，反之，需要一定时间检测该样本。 
     * @return ApkMd5 软件包的md5值，具有唯一性。腾讯APK云检测服务会根据md5值来判断该包是否为库中已收集的样本，已存在，则返回检测结果，反之，需要一定时间检测该样本。
     */
    public String getApkMd5() {
        return this.ApkMd5;
    }

    /**
     * Set 软件包的md5值，具有唯一性。腾讯APK云检测服务会根据md5值来判断该包是否为库中已收集的样本，已存在，则返回检测结果，反之，需要一定时间检测该样本。
     * @param ApkMd5 软件包的md5值，具有唯一性。腾讯APK云检测服务会根据md5值来判断该包是否为库中已收集的样本，已存在，则返回检测结果，反之，需要一定时间检测该样本。
     */
    public void setApkMd5(String ApkMd5) {
        this.ApkMd5 = ApkMd5;
    }

    public DescribeApkDetectionResultRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeApkDetectionResultRequest(DescribeApkDetectionResultRequest source) {
        if (source.ApkUrl != null) {
            this.ApkUrl = new String(source.ApkUrl);
        }
        if (source.ApkMd5 != null) {
            this.ApkMd5 = new String(source.ApkMd5);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApkUrl", this.ApkUrl);
        this.setParamSimple(map, prefix + "ApkMd5", this.ApkMd5);

    }
}

