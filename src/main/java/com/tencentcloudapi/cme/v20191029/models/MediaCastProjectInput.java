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
package com.tencentcloudapi.cme.v20191029.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MediaCastProjectInput extends AbstractModel{

    /**
    * 输入源列表。输入源列表最大个数为100.
    */
    @SerializedName("SourceInfos")
    @Expose
    private MediaCastSourceInfo [] SourceInfos;

    /**
    * 输出源列表。输出源列表最大个数为10.
    */
    @SerializedName("DestinationInfos")
    @Expose
    private MediaCastDestinationInfo [] DestinationInfos;

    /**
    * 输出媒体配置。
    */
    @SerializedName("OutputMediaSetting")
    @Expose
    private MediaCastOutputMediaSetting OutputMediaSetting;

    /**
    * 播放控制参数。
    */
    @SerializedName("PlaySetting")
    @Expose
    private MediaCastPlaySetting PlaySetting;

    /**
     * Get 输入源列表。输入源列表最大个数为100. 
     * @return SourceInfos 输入源列表。输入源列表最大个数为100.
     */
    public MediaCastSourceInfo [] getSourceInfos() {
        return this.SourceInfos;
    }

    /**
     * Set 输入源列表。输入源列表最大个数为100.
     * @param SourceInfos 输入源列表。输入源列表最大个数为100.
     */
    public void setSourceInfos(MediaCastSourceInfo [] SourceInfos) {
        this.SourceInfos = SourceInfos;
    }

    /**
     * Get 输出源列表。输出源列表最大个数为10. 
     * @return DestinationInfos 输出源列表。输出源列表最大个数为10.
     */
    public MediaCastDestinationInfo [] getDestinationInfos() {
        return this.DestinationInfos;
    }

    /**
     * Set 输出源列表。输出源列表最大个数为10.
     * @param DestinationInfos 输出源列表。输出源列表最大个数为10.
     */
    public void setDestinationInfos(MediaCastDestinationInfo [] DestinationInfos) {
        this.DestinationInfos = DestinationInfos;
    }

    /**
     * Get 输出媒体配置。 
     * @return OutputMediaSetting 输出媒体配置。
     */
    public MediaCastOutputMediaSetting getOutputMediaSetting() {
        return this.OutputMediaSetting;
    }

    /**
     * Set 输出媒体配置。
     * @param OutputMediaSetting 输出媒体配置。
     */
    public void setOutputMediaSetting(MediaCastOutputMediaSetting OutputMediaSetting) {
        this.OutputMediaSetting = OutputMediaSetting;
    }

    /**
     * Get 播放控制参数。 
     * @return PlaySetting 播放控制参数。
     */
    public MediaCastPlaySetting getPlaySetting() {
        return this.PlaySetting;
    }

    /**
     * Set 播放控制参数。
     * @param PlaySetting 播放控制参数。
     */
    public void setPlaySetting(MediaCastPlaySetting PlaySetting) {
        this.PlaySetting = PlaySetting;
    }

    public MediaCastProjectInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MediaCastProjectInput(MediaCastProjectInput source) {
        if (source.SourceInfos != null) {
            this.SourceInfos = new MediaCastSourceInfo[source.SourceInfos.length];
            for (int i = 0; i < source.SourceInfos.length; i++) {
                this.SourceInfos[i] = new MediaCastSourceInfo(source.SourceInfos[i]);
            }
        }
        if (source.DestinationInfos != null) {
            this.DestinationInfos = new MediaCastDestinationInfo[source.DestinationInfos.length];
            for (int i = 0; i < source.DestinationInfos.length; i++) {
                this.DestinationInfos[i] = new MediaCastDestinationInfo(source.DestinationInfos[i]);
            }
        }
        if (source.OutputMediaSetting != null) {
            this.OutputMediaSetting = new MediaCastOutputMediaSetting(source.OutputMediaSetting);
        }
        if (source.PlaySetting != null) {
            this.PlaySetting = new MediaCastPlaySetting(source.PlaySetting);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "SourceInfos.", this.SourceInfos);
        this.setParamArrayObj(map, prefix + "DestinationInfos.", this.DestinationInfos);
        this.setParamObj(map, prefix + "OutputMediaSetting.", this.OutputMediaSetting);
        this.setParamObj(map, prefix + "PlaySetting.", this.PlaySetting);

    }
}

