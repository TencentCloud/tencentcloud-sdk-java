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

public class PlayRecordData extends AbstractModel {

    /**
    * <p>flv录像播放地址</p>
    */
    @SerializedName("Flv")
    @Expose
    private String Flv;

    /**
    * <p>fmp4录像播放地址</p>
    */
    @SerializedName("FMp4")
    @Expose
    private String FMp4;

    /**
     * Get <p>flv录像播放地址</p> 
     * @return Flv <p>flv录像播放地址</p>
     */
    public String getFlv() {
        return this.Flv;
    }

    /**
     * Set <p>flv录像播放地址</p>
     * @param Flv <p>flv录像播放地址</p>
     */
    public void setFlv(String Flv) {
        this.Flv = Flv;
    }

    /**
     * Get <p>fmp4录像播放地址</p> 
     * @return FMp4 <p>fmp4录像播放地址</p>
     */
    public String getFMp4() {
        return this.FMp4;
    }

    /**
     * Set <p>fmp4录像播放地址</p>
     * @param FMp4 <p>fmp4录像播放地址</p>
     */
    public void setFMp4(String FMp4) {
        this.FMp4 = FMp4;
    }

    public PlayRecordData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PlayRecordData(PlayRecordData source) {
        if (source.Flv != null) {
            this.Flv = new String(source.Flv);
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
        this.setParamSimple(map, prefix + "FMp4", this.FMp4);

    }
}

