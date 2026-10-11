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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DownloadInfo extends AbstractModel {

    /**
    * <p>下载链接地址.</p>
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * <p>文件格式（如 CSV / JSON）.</p>
    */
    @SerializedName("Format")
    @Expose
    private String Format;

    /**
    * <p>文件大小（字节）.</p>
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
    * <p>链接有效时长（秒）.</p>
    */
    @SerializedName("ExpireSeconds")
    @Expose
    private Long ExpireSeconds;

    /**
     * Get <p>下载链接地址.</p> 
     * @return Url <p>下载链接地址.</p>
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set <p>下载链接地址.</p>
     * @param Url <p>下载链接地址.</p>
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get <p>文件格式（如 CSV / JSON）.</p> 
     * @return Format <p>文件格式（如 CSV / JSON）.</p>
     */
    public String getFormat() {
        return this.Format;
    }

    /**
     * Set <p>文件格式（如 CSV / JSON）.</p>
     * @param Format <p>文件格式（如 CSV / JSON）.</p>
     */
    public void setFormat(String Format) {
        this.Format = Format;
    }

    /**
     * Get <p>文件大小（字节）.</p> 
     * @return Size <p>文件大小（字节）.</p>
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set <p>文件大小（字节）.</p>
     * @param Size <p>文件大小（字节）.</p>
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    /**
     * Get <p>链接有效时长（秒）.</p> 
     * @return ExpireSeconds <p>链接有效时长（秒）.</p>
     */
    public Long getExpireSeconds() {
        return this.ExpireSeconds;
    }

    /**
     * Set <p>链接有效时长（秒）.</p>
     * @param ExpireSeconds <p>链接有效时长（秒）.</p>
     */
    public void setExpireSeconds(Long ExpireSeconds) {
        this.ExpireSeconds = ExpireSeconds;
    }

    public DownloadInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DownloadInfo(DownloadInfo source) {
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.Format != null) {
            this.Format = new String(source.Format);
        }
        if (source.Size != null) {
            this.Size = new Long(source.Size);
        }
        if (source.ExpireSeconds != null) {
            this.ExpireSeconds = new Long(source.ExpireSeconds);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "Format", this.Format);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "ExpireSeconds", this.ExpireSeconds);

    }
}

