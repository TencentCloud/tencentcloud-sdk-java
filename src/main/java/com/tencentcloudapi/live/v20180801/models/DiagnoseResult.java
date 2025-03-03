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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DiagnoseResult extends AbstractModel {

    /**
    * 断流信息
    */
    @SerializedName("StreamBrokenResults")
    @Expose
    private String [] StreamBrokenResults;

    /**
    * 低帧率信息
    */
    @SerializedName("LowFrameRateResults")
    @Expose
    private String [] LowFrameRateResults;

    /**
    * 流格式诊断信息
    */
    @SerializedName("StreamFormatResults")
    @Expose
    private String [] StreamFormatResults;

    /**
     * Get 断流信息 
     * @return StreamBrokenResults 断流信息
     */
    public String [] getStreamBrokenResults() {
        return this.StreamBrokenResults;
    }

    /**
     * Set 断流信息
     * @param StreamBrokenResults 断流信息
     */
    public void setStreamBrokenResults(String [] StreamBrokenResults) {
        this.StreamBrokenResults = StreamBrokenResults;
    }

    /**
     * Get 低帧率信息 
     * @return LowFrameRateResults 低帧率信息
     */
    public String [] getLowFrameRateResults() {
        return this.LowFrameRateResults;
    }

    /**
     * Set 低帧率信息
     * @param LowFrameRateResults 低帧率信息
     */
    public void setLowFrameRateResults(String [] LowFrameRateResults) {
        this.LowFrameRateResults = LowFrameRateResults;
    }

    /**
     * Get 流格式诊断信息 
     * @return StreamFormatResults 流格式诊断信息
     */
    public String [] getStreamFormatResults() {
        return this.StreamFormatResults;
    }

    /**
     * Set 流格式诊断信息
     * @param StreamFormatResults 流格式诊断信息
     */
    public void setStreamFormatResults(String [] StreamFormatResults) {
        this.StreamFormatResults = StreamFormatResults;
    }

    public DiagnoseResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DiagnoseResult(DiagnoseResult source) {
        if (source.StreamBrokenResults != null) {
            this.StreamBrokenResults = new String[source.StreamBrokenResults.length];
            for (int i = 0; i < source.StreamBrokenResults.length; i++) {
                this.StreamBrokenResults[i] = new String(source.StreamBrokenResults[i]);
            }
        }
        if (source.LowFrameRateResults != null) {
            this.LowFrameRateResults = new String[source.LowFrameRateResults.length];
            for (int i = 0; i < source.LowFrameRateResults.length; i++) {
                this.LowFrameRateResults[i] = new String(source.LowFrameRateResults[i]);
            }
        }
        if (source.StreamFormatResults != null) {
            this.StreamFormatResults = new String[source.StreamFormatResults.length];
            for (int i = 0; i < source.StreamFormatResults.length; i++) {
                this.StreamFormatResults[i] = new String(source.StreamFormatResults[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "StreamBrokenResults.", this.StreamBrokenResults);
        this.setParamArraySimple(map, prefix + "LowFrameRateResults.", this.LowFrameRateResults);
        this.setParamArraySimple(map, prefix + "StreamFormatResults.", this.StreamFormatResults);

    }
}

