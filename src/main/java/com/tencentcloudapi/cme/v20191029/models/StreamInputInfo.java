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

public class StreamInputInfo extends AbstractModel{

    /**
    * 流输入类型，取值：
<li>VodPull ： 点播拉流；</li>
<li>LivePull ：直播拉流；</li>
<li>RtmpPush ： 直播推流。</li>
    */
    @SerializedName("InputType")
    @Expose
    private String InputType;

    /**
    * 点播拉流信息，当 InputType = VodPull 时必填。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VodPullInputInfo")
    @Expose
    private VodPullInputInfo VodPullInputInfo;

    /**
    * 直播拉流信息，当 InputType = LivePull  时必填。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LivePullInputInfo")
    @Expose
    private LivePullInputInfo LivePullInputInfo;

    /**
    * 直播推流信息，当 InputType = RtmpPush 时必填。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RtmpPushInputInfo")
    @Expose
    private RtmpPushInputInfo RtmpPushInputInfo;

    /**
     * Get 流输入类型，取值：
<li>VodPull ： 点播拉流；</li>
<li>LivePull ：直播拉流；</li>
<li>RtmpPush ： 直播推流。</li> 
     * @return InputType 流输入类型，取值：
<li>VodPull ： 点播拉流；</li>
<li>LivePull ：直播拉流；</li>
<li>RtmpPush ： 直播推流。</li>
     */
    public String getInputType() {
        return this.InputType;
    }

    /**
     * Set 流输入类型，取值：
<li>VodPull ： 点播拉流；</li>
<li>LivePull ：直播拉流；</li>
<li>RtmpPush ： 直播推流。</li>
     * @param InputType 流输入类型，取值：
<li>VodPull ： 点播拉流；</li>
<li>LivePull ：直播拉流；</li>
<li>RtmpPush ： 直播推流。</li>
     */
    public void setInputType(String InputType) {
        this.InputType = InputType;
    }

    /**
     * Get 点播拉流信息，当 InputType = VodPull 时必填。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VodPullInputInfo 点播拉流信息，当 InputType = VodPull 时必填。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public VodPullInputInfo getVodPullInputInfo() {
        return this.VodPullInputInfo;
    }

    /**
     * Set 点播拉流信息，当 InputType = VodPull 时必填。
注意：此字段可能返回 null，表示取不到有效值。
     * @param VodPullInputInfo 点播拉流信息，当 InputType = VodPull 时必填。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVodPullInputInfo(VodPullInputInfo VodPullInputInfo) {
        this.VodPullInputInfo = VodPullInputInfo;
    }

    /**
     * Get 直播拉流信息，当 InputType = LivePull  时必填。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LivePullInputInfo 直播拉流信息，当 InputType = LivePull  时必填。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public LivePullInputInfo getLivePullInputInfo() {
        return this.LivePullInputInfo;
    }

    /**
     * Set 直播拉流信息，当 InputType = LivePull  时必填。
注意：此字段可能返回 null，表示取不到有效值。
     * @param LivePullInputInfo 直播拉流信息，当 InputType = LivePull  时必填。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLivePullInputInfo(LivePullInputInfo LivePullInputInfo) {
        this.LivePullInputInfo = LivePullInputInfo;
    }

    /**
     * Get 直播推流信息，当 InputType = RtmpPush 时必填。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RtmpPushInputInfo 直播推流信息，当 InputType = RtmpPush 时必填。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RtmpPushInputInfo getRtmpPushInputInfo() {
        return this.RtmpPushInputInfo;
    }

    /**
     * Set 直播推流信息，当 InputType = RtmpPush 时必填。
注意：此字段可能返回 null，表示取不到有效值。
     * @param RtmpPushInputInfo 直播推流信息，当 InputType = RtmpPush 时必填。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRtmpPushInputInfo(RtmpPushInputInfo RtmpPushInputInfo) {
        this.RtmpPushInputInfo = RtmpPushInputInfo;
    }

    public StreamInputInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StreamInputInfo(StreamInputInfo source) {
        if (source.InputType != null) {
            this.InputType = new String(source.InputType);
        }
        if (source.VodPullInputInfo != null) {
            this.VodPullInputInfo = new VodPullInputInfo(source.VodPullInputInfo);
        }
        if (source.LivePullInputInfo != null) {
            this.LivePullInputInfo = new LivePullInputInfo(source.LivePullInputInfo);
        }
        if (source.RtmpPushInputInfo != null) {
            this.RtmpPushInputInfo = new RtmpPushInputInfo(source.RtmpPushInputInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InputType", this.InputType);
        this.setParamObj(map, prefix + "VodPullInputInfo.", this.VodPullInputInfo);
        this.setParamObj(map, prefix + "LivePullInputInfo.", this.LivePullInputInfo);
        this.setParamObj(map, prefix + "RtmpPushInputInfo.", this.RtmpPushInputInfo);

    }
}

