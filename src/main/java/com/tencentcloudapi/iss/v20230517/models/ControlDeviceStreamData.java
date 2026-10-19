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
package com.tencentcloudapi.iss.v20230517.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ControlDeviceStreamData extends AbstractModel {

    /**
    * <p>flv 流地址</p>
    */
    @SerializedName("Flv")
    @Expose
    private String Flv;

    /**
    * <p>hls 流地址</p>
    */
    @SerializedName("Hls")
    @Expose
    private String Hls;

    /**
    * <p>rtmp 流地址</p>
    */
    @SerializedName("Rtmp")
    @Expose
    private String Rtmp;

    /**
    * <p>fmp4地址</p>
    */
    @SerializedName("FMp4")
    @Expose
    private String FMp4;

    /**
     * Get <p>flv 流地址</p> 
     * @return Flv <p>flv 流地址</p>
     */
    public String getFlv() {
        return this.Flv;
    }

    /**
     * Set <p>flv 流地址</p>
     * @param Flv <p>flv 流地址</p>
     */
    public void setFlv(String Flv) {
        this.Flv = Flv;
    }

    /**
     * Get <p>hls 流地址</p> 
     * @return Hls <p>hls 流地址</p>
     */
    public String getHls() {
        return this.Hls;
    }

    /**
     * Set <p>hls 流地址</p>
     * @param Hls <p>hls 流地址</p>
     */
    public void setHls(String Hls) {
        this.Hls = Hls;
    }

    /**
     * Get <p>rtmp 流地址</p> 
     * @return Rtmp <p>rtmp 流地址</p>
     */
    public String getRtmp() {
        return this.Rtmp;
    }

    /**
     * Set <p>rtmp 流地址</p>
     * @param Rtmp <p>rtmp 流地址</p>
     */
    public void setRtmp(String Rtmp) {
        this.Rtmp = Rtmp;
    }

    /**
     * Get <p>fmp4地址</p> 
     * @return FMp4 <p>fmp4地址</p>
     */
    public String getFMp4() {
        return this.FMp4;
    }

    /**
     * Set <p>fmp4地址</p>
     * @param FMp4 <p>fmp4地址</p>
     */
    public void setFMp4(String FMp4) {
        this.FMp4 = FMp4;
    }

    public ControlDeviceStreamData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ControlDeviceStreamData(ControlDeviceStreamData source) {
        if (source.Flv != null) {
            this.Flv = new String(source.Flv);
        }
        if (source.Hls != null) {
            this.Hls = new String(source.Hls);
        }
        if (source.Rtmp != null) {
            this.Rtmp = new String(source.Rtmp);
        }
        if (source.FMp4 != null) {
            this.FMp4 = new String(source.FMp4);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Flv", this.Flv);
        this.setParamSimple(map, prefix + "Hls", this.Hls);
        this.setParamSimple(map, prefix + "Rtmp", this.Rtmp);
        this.setParamSimple(map, prefix + "FMp4", this.FMp4);

    }
}

