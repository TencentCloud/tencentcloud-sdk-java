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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Input extends AbstractModel {

    /**
    * <p>直播拉流地址</p><p>入参限制：字符长度小于2048</p>
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * <p>显式协议</p><p>枚举值：</p><ul><li>rtmp： rtmp协议</li></ul>
    */
    @SerializedName("Format")
    @Expose
    private String Format;

    /**
    * <p>声网拉流进房参数</p>
    */
    @SerializedName("AgoraParam")
    @Expose
    private AgoraParam AgoraParam;

    /**
     * Get <p>直播拉流地址</p><p>入参限制：字符长度小于2048</p> 
     * @return Url <p>直播拉流地址</p><p>入参限制：字符长度小于2048</p>
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set <p>直播拉流地址</p><p>入参限制：字符长度小于2048</p>
     * @param Url <p>直播拉流地址</p><p>入参限制：字符长度小于2048</p>
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get <p>显式协议</p><p>枚举值：</p><ul><li>rtmp： rtmp协议</li></ul> 
     * @return Format <p>显式协议</p><p>枚举值：</p><ul><li>rtmp： rtmp协议</li></ul>
     */
    public String getFormat() {
        return this.Format;
    }

    /**
     * Set <p>显式协议</p><p>枚举值：</p><ul><li>rtmp： rtmp协议</li></ul>
     * @param Format <p>显式协议</p><p>枚举值：</p><ul><li>rtmp： rtmp协议</li></ul>
     */
    public void setFormat(String Format) {
        this.Format = Format;
    }

    /**
     * Get <p>声网拉流进房参数</p> 
     * @return AgoraParam <p>声网拉流进房参数</p>
     */
    public AgoraParam getAgoraParam() {
        return this.AgoraParam;
    }

    /**
     * Set <p>声网拉流进房参数</p>
     * @param AgoraParam <p>声网拉流进房参数</p>
     */
    public void setAgoraParam(AgoraParam AgoraParam) {
        this.AgoraParam = AgoraParam;
    }

    public Input() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Input(Input source) {
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.Format != null) {
            this.Format = new String(source.Format);
        }
        if (source.AgoraParam != null) {
            this.AgoraParam = new AgoraParam(source.AgoraParam);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "Format", this.Format);
        this.setParamObj(map, prefix + "AgoraParam.", this.AgoraParam);

    }
}

