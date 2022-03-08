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
package com.tencentcloudapi.cpdp.v20190820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QueryOpenBankDailyReceiptDownloadUrlResult extends AbstractModel{

    /**
    * 回单文件下载链接
    */
    @SerializedName("DownloadUrl")
    @Expose
    private String DownloadUrl;

    /**
    * 过期时间
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * 回单状态
PENDING: 处理中
READY: 可以下载
    */
    @SerializedName("ReceiptStatus")
    @Expose
    private String ReceiptStatus;

    /**
     * Get 回单文件下载链接 
     * @return DownloadUrl 回单文件下载链接
     */
    public String getDownloadUrl() {
        return this.DownloadUrl;
    }

    /**
     * Set 回单文件下载链接
     * @param DownloadUrl 回单文件下载链接
     */
    public void setDownloadUrl(String DownloadUrl) {
        this.DownloadUrl = DownloadUrl;
    }

    /**
     * Get 过期时间 
     * @return ExpireTime 过期时间
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 过期时间
     * @param ExpireTime 过期时间
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get 回单状态
PENDING: 处理中
READY: 可以下载 
     * @return ReceiptStatus 回单状态
PENDING: 处理中
READY: 可以下载
     */
    public String getReceiptStatus() {
        return this.ReceiptStatus;
    }

    /**
     * Set 回单状态
PENDING: 处理中
READY: 可以下载
     * @param ReceiptStatus 回单状态
PENDING: 处理中
READY: 可以下载
     */
    public void setReceiptStatus(String ReceiptStatus) {
        this.ReceiptStatus = ReceiptStatus;
    }

    public QueryOpenBankDailyReceiptDownloadUrlResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryOpenBankDailyReceiptDownloadUrlResult(QueryOpenBankDailyReceiptDownloadUrlResult source) {
        if (source.DownloadUrl != null) {
            this.DownloadUrl = new String(source.DownloadUrl);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.ReceiptStatus != null) {
            this.ReceiptStatus = new String(source.ReceiptStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DownloadUrl", this.DownloadUrl);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "ReceiptStatus", this.ReceiptStatus);

    }
}

