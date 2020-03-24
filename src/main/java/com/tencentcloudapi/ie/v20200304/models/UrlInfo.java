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
    * 视频 URL。音视频支持mp4、ts等格式；直播流支持flv、rtmp格式。
注意：目前智能编辑还不支持直播流场景。
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 视频地址格式，可选值： 
0：音视频 ;
1：直播流。 
默认为0。其他非0非1值默认为0。
    */
    @SerializedName("Format")
    @Expose
    private Long Format;

    /**
    * 指定请求资源时，HTTP头部host的值。
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
     * Get 视频 URL。音视频支持mp4、ts等格式；直播流支持flv、rtmp格式。
注意：目前智能编辑还不支持直播流场景。 
     * @return Url 视频 URL。音视频支持mp4、ts等格式；直播流支持flv、rtmp格式。
注意：目前智能编辑还不支持直播流场景。
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 视频 URL。音视频支持mp4、ts等格式；直播流支持flv、rtmp格式。
注意：目前智能编辑还不支持直播流场景。
     * @param Url 视频 URL。音视频支持mp4、ts等格式；直播流支持flv、rtmp格式。
注意：目前智能编辑还不支持直播流场景。
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 视频地址格式，可选值： 
0：音视频 ;
1：直播流。 
默认为0。其他非0非1值默认为0。 
     * @return Format 视频地址格式，可选值： 
0：音视频 ;
1：直播流。 
默认为0。其他非0非1值默认为0。
     */
    public Long getFormat() {
        return this.Format;
    }

    /**
     * Set 视频地址格式，可选值： 
0：音视频 ;
1：直播流。 
默认为0。其他非0非1值默认为0。
     * @param Format 视频地址格式，可选值： 
0：音视频 ;
1：直播流。 
默认为0。其他非0非1值默认为0。
     */
    public void setFormat(Long Format) {
        this.Format = Format;
    }

    /**
     * Get 指定请求资源时，HTTP头部host的值。 
     * @return Host 指定请求资源时，HTTP头部host的值。
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set 指定请求资源时，HTTP头部host的值。
     * @param Host 指定请求资源时，HTTP头部host的值。
     */
    public void setHost(String Host) {
        this.Host = Host;
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

