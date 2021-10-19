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
package com.tencentcloudapi.ie.v20200304.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UrlInfo extends AbstractModel{

    /**
    * 视频 URL。
注意：编辑理解仅支持mp4、flv等格式的点播文件，不支持hls；
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 视频地址格式，可选值： 
0：音视频 ;
1：直播流。 
默认为0。其他非0非1值默认为0。画质重生任务只支持0。
    */
    @SerializedName("Format")
    @Expose
    private Long Format;

    /**
    * 【不再支持】指定请求资源时，HTTP头部host的值。
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
     * Get 视频 URL。
注意：编辑理解仅支持mp4、flv等格式的点播文件，不支持hls； 
     * @return Url 视频 URL。
注意：编辑理解仅支持mp4、flv等格式的点播文件，不支持hls；
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 视频 URL。
注意：编辑理解仅支持mp4、flv等格式的点播文件，不支持hls；
     * @param Url 视频 URL。
注意：编辑理解仅支持mp4、flv等格式的点播文件，不支持hls；
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 视频地址格式，可选值： 
0：音视频 ;
1：直播流。 
默认为0。其他非0非1值默认为0。画质重生任务只支持0。 
     * @return Format 视频地址格式，可选值： 
0：音视频 ;
1：直播流。 
默认为0。其他非0非1值默认为0。画质重生任务只支持0。
     */
    public Long getFormat() {
        return this.Format;
    }

    /**
     * Set 视频地址格式，可选值： 
0：音视频 ;
1：直播流。 
默认为0。其他非0非1值默认为0。画质重生任务只支持0。
     * @param Format 视频地址格式，可选值： 
0：音视频 ;
1：直播流。 
默认为0。其他非0非1值默认为0。画质重生任务只支持0。
     */
    public void setFormat(Long Format) {
        this.Format = Format;
    }

    /**
     * Get 【不再支持】指定请求资源时，HTTP头部host的值。 
     * @return Host 【不再支持】指定请求资源时，HTTP头部host的值。
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set 【不再支持】指定请求资源时，HTTP头部host的值。
     * @param Host 【不再支持】指定请求资源时，HTTP头部host的值。
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    public UrlInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UrlInfo(UrlInfo source) {
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.Format != null) {
            this.Format = new Long(source.Format);
        }
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "Format", this.Format);
        this.setParamSimple(map, prefix + "Host", this.Host);

    }
}

