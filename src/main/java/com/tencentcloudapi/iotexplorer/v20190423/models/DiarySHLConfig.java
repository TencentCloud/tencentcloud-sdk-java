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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DiarySHLConfig extends AbstractModel {

    /**
    * 每个视频偏移时长，单位秒
    */
    @SerializedName("StartOffset")
    @Expose
    private Long StartOffset;

    /**
    * 视频浓缩倍数，支持1,2,4之间
    */
    @SerializedName("PlaySpeed")
    @Expose
    private Long PlaySpeed;

    /**
    * 单个视频最小提取时长，单位秒
    */
    @SerializedName("MiniExtract")
    @Expose
    private Long MiniExtract;

    /**
    * 每天最终输出视频时长，单位秒
注：免费版固定10s
    */
    @SerializedName("OutDuration")
    @Expose
    private Long OutDuration;

    /**
     * Get 每个视频偏移时长，单位秒 
     * @return StartOffset 每个视频偏移时长，单位秒
     */
    public Long getStartOffset() {
        return this.StartOffset;
    }

    /**
     * Set 每个视频偏移时长，单位秒
     * @param StartOffset 每个视频偏移时长，单位秒
     */
    public void setStartOffset(Long StartOffset) {
        this.StartOffset = StartOffset;
    }

    /**
     * Get 视频浓缩倍数，支持1,2,4之间 
     * @return PlaySpeed 视频浓缩倍数，支持1,2,4之间
     */
    public Long getPlaySpeed() {
        return this.PlaySpeed;
    }

    /**
     * Set 视频浓缩倍数，支持1,2,4之间
     * @param PlaySpeed 视频浓缩倍数，支持1,2,4之间
     */
    public void setPlaySpeed(Long PlaySpeed) {
        this.PlaySpeed = PlaySpeed;
    }

    /**
     * Get 单个视频最小提取时长，单位秒 
     * @return MiniExtract 单个视频最小提取时长，单位秒
     */
    public Long getMiniExtract() {
        return this.MiniExtract;
    }

    /**
     * Set 单个视频最小提取时长，单位秒
     * @param MiniExtract 单个视频最小提取时长，单位秒
     */
    public void setMiniExtract(Long MiniExtract) {
        this.MiniExtract = MiniExtract;
    }

    /**
     * Get 每天最终输出视频时长，单位秒
注：免费版固定10s 
     * @return OutDuration 每天最终输出视频时长，单位秒
注：免费版固定10s
     */
    public Long getOutDuration() {
        return this.OutDuration;
    }

    /**
     * Set 每天最终输出视频时长，单位秒
注：免费版固定10s
     * @param OutDuration 每天最终输出视频时长，单位秒
注：免费版固定10s
     */
    public void setOutDuration(Long OutDuration) {
        this.OutDuration = OutDuration;
    }

    public DiarySHLConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DiarySHLConfig(DiarySHLConfig source) {
        if (source.StartOffset != null) {
            this.StartOffset = new Long(source.StartOffset);
        }
        if (source.PlaySpeed != null) {
            this.PlaySpeed = new Long(source.PlaySpeed);
        }
        if (source.MiniExtract != null) {
            this.MiniExtract = new Long(source.MiniExtract);
        }
        if (source.OutDuration != null) {
            this.OutDuration = new Long(source.OutDuration);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartOffset", this.StartOffset);
        this.setParamSimple(map, prefix + "PlaySpeed", this.PlaySpeed);
        this.setParamSimple(map, prefix + "MiniExtract", this.MiniExtract);
        this.setParamSimple(map, prefix + "OutDuration", this.OutDuration);

    }
}

