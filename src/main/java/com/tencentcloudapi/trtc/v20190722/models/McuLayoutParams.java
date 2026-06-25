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

public class McuLayoutParams extends AbstractModel {

    /**
    * <p>布局模式：动态布局（1：悬浮布局（默认），2：屏幕分享布局，3：九宫格布局），静态布局（4：自定义布局）。最多支持混入16路音视频流，如果用户只上行音频，也会被算作一路；自定义布局中，如果子画面只设置占位图，也被算作一路。</p>
    */
    @SerializedName("MixLayoutMode")
    @Expose
    private Long MixLayoutMode;

    /**
    * <p>纯音频上行是否占布局位置，只在动态布局中有效。0表示纯音频不占布局位置，1表示纯音频占布局位置，不填默认为0。</p>
    */
    @SerializedName("PureAudioHoldPlaceMode")
    @Expose
    private Long PureAudioHoldPlaceMode;

    /**
    * <p>自定义模板中有效，指定用户视频在混合画面中的位置，最多支持设置16个输入流。</p>
    */
    @SerializedName("MixLayoutList")
    @Expose
    private McuLayout [] MixLayoutList;

    /**
    * <p>指定动态布局中悬浮布局和屏幕分享布局的大画面信息，只在悬浮布局和屏幕分享布局有效。</p>
    */
    @SerializedName("MaxVideoUser")
    @Expose
    private MaxVideoUser MaxVideoUser;

    /**
    * <p>屏幕分享模板、悬浮模板、九宫格模版有效，画面在输出时的显示模式：0为裁剪，1为缩放，2为缩放并显示黑底</p>
    */
    @SerializedName("RenderMode")
    @Expose
    private Long RenderMode;

    /**
    * <p>是否保留上行sei，1：保留 0：不保留，只对动态布局生效，自定义布局不生效</p><p>取值范围：[0, 1]</p><p>默认值：1</p>
    */
    @SerializedName("EnableStreamSEI")
    @Expose
    private Long EnableStreamSEI;

    /**
     * Get <p>布局模式：动态布局（1：悬浮布局（默认），2：屏幕分享布局，3：九宫格布局），静态布局（4：自定义布局）。最多支持混入16路音视频流，如果用户只上行音频，也会被算作一路；自定义布局中，如果子画面只设置占位图，也被算作一路。</p> 
     * @return MixLayoutMode <p>布局模式：动态布局（1：悬浮布局（默认），2：屏幕分享布局，3：九宫格布局），静态布局（4：自定义布局）。最多支持混入16路音视频流，如果用户只上行音频，也会被算作一路；自定义布局中，如果子画面只设置占位图，也被算作一路。</p>
     */
    public Long getMixLayoutMode() {
        return this.MixLayoutMode;
    }

    /**
     * Set <p>布局模式：动态布局（1：悬浮布局（默认），2：屏幕分享布局，3：九宫格布局），静态布局（4：自定义布局）。最多支持混入16路音视频流，如果用户只上行音频，也会被算作一路；自定义布局中，如果子画面只设置占位图，也被算作一路。</p>
     * @param MixLayoutMode <p>布局模式：动态布局（1：悬浮布局（默认），2：屏幕分享布局，3：九宫格布局），静态布局（4：自定义布局）。最多支持混入16路音视频流，如果用户只上行音频，也会被算作一路；自定义布局中，如果子画面只设置占位图，也被算作一路。</p>
     */
    public void setMixLayoutMode(Long MixLayoutMode) {
        this.MixLayoutMode = MixLayoutMode;
    }

    /**
     * Get <p>纯音频上行是否占布局位置，只在动态布局中有效。0表示纯音频不占布局位置，1表示纯音频占布局位置，不填默认为0。</p> 
     * @return PureAudioHoldPlaceMode <p>纯音频上行是否占布局位置，只在动态布局中有效。0表示纯音频不占布局位置，1表示纯音频占布局位置，不填默认为0。</p>
     */
    public Long getPureAudioHoldPlaceMode() {
        return this.PureAudioHoldPlaceMode;
    }

    /**
     * Set <p>纯音频上行是否占布局位置，只在动态布局中有效。0表示纯音频不占布局位置，1表示纯音频占布局位置，不填默认为0。</p>
     * @param PureAudioHoldPlaceMode <p>纯音频上行是否占布局位置，只在动态布局中有效。0表示纯音频不占布局位置，1表示纯音频占布局位置，不填默认为0。</p>
     */
    public void setPureAudioHoldPlaceMode(Long PureAudioHoldPlaceMode) {
        this.PureAudioHoldPlaceMode = PureAudioHoldPlaceMode;
    }

    /**
     * Get <p>自定义模板中有效，指定用户视频在混合画面中的位置，最多支持设置16个输入流。</p> 
     * @return MixLayoutList <p>自定义模板中有效，指定用户视频在混合画面中的位置，最多支持设置16个输入流。</p>
     */
    public McuLayout [] getMixLayoutList() {
        return this.MixLayoutList;
    }

    /**
     * Set <p>自定义模板中有效，指定用户视频在混合画面中的位置，最多支持设置16个输入流。</p>
     * @param MixLayoutList <p>自定义模板中有效，指定用户视频在混合画面中的位置，最多支持设置16个输入流。</p>
     */
    public void setMixLayoutList(McuLayout [] MixLayoutList) {
        this.MixLayoutList = MixLayoutList;
    }

    /**
     * Get <p>指定动态布局中悬浮布局和屏幕分享布局的大画面信息，只在悬浮布局和屏幕分享布局有效。</p> 
     * @return MaxVideoUser <p>指定动态布局中悬浮布局和屏幕分享布局的大画面信息，只在悬浮布局和屏幕分享布局有效。</p>
     */
    public MaxVideoUser getMaxVideoUser() {
        return this.MaxVideoUser;
    }

    /**
     * Set <p>指定动态布局中悬浮布局和屏幕分享布局的大画面信息，只在悬浮布局和屏幕分享布局有效。</p>
     * @param MaxVideoUser <p>指定动态布局中悬浮布局和屏幕分享布局的大画面信息，只在悬浮布局和屏幕分享布局有效。</p>
     */
    public void setMaxVideoUser(MaxVideoUser MaxVideoUser) {
        this.MaxVideoUser = MaxVideoUser;
    }

    /**
     * Get <p>屏幕分享模板、悬浮模板、九宫格模版有效，画面在输出时的显示模式：0为裁剪，1为缩放，2为缩放并显示黑底</p> 
     * @return RenderMode <p>屏幕分享模板、悬浮模板、九宫格模版有效，画面在输出时的显示模式：0为裁剪，1为缩放，2为缩放并显示黑底</p>
     */
    public Long getRenderMode() {
        return this.RenderMode;
    }

    /**
     * Set <p>屏幕分享模板、悬浮模板、九宫格模版有效，画面在输出时的显示模式：0为裁剪，1为缩放，2为缩放并显示黑底</p>
     * @param RenderMode <p>屏幕分享模板、悬浮模板、九宫格模版有效，画面在输出时的显示模式：0为裁剪，1为缩放，2为缩放并显示黑底</p>
     */
    public void setRenderMode(Long RenderMode) {
        this.RenderMode = RenderMode;
    }

    /**
     * Get <p>是否保留上行sei，1：保留 0：不保留，只对动态布局生效，自定义布局不生效</p><p>取值范围：[0, 1]</p><p>默认值：1</p> 
     * @return EnableStreamSEI <p>是否保留上行sei，1：保留 0：不保留，只对动态布局生效，自定义布局不生效</p><p>取值范围：[0, 1]</p><p>默认值：1</p>
     */
    public Long getEnableStreamSEI() {
        return this.EnableStreamSEI;
    }

    /**
     * Set <p>是否保留上行sei，1：保留 0：不保留，只对动态布局生效，自定义布局不生效</p><p>取值范围：[0, 1]</p><p>默认值：1</p>
     * @param EnableStreamSEI <p>是否保留上行sei，1：保留 0：不保留，只对动态布局生效，自定义布局不生效</p><p>取值范围：[0, 1]</p><p>默认值：1</p>
     */
    public void setEnableStreamSEI(Long EnableStreamSEI) {
        this.EnableStreamSEI = EnableStreamSEI;
    }

    public McuLayoutParams() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public McuLayoutParams(McuLayoutParams source) {
        if (source.MixLayoutMode != null) {
            this.MixLayoutMode = new Long(source.MixLayoutMode);
        }
        if (source.PureAudioHoldPlaceMode != null) {
            this.PureAudioHoldPlaceMode = new Long(source.PureAudioHoldPlaceMode);
        }
        if (source.MixLayoutList != null) {
            this.MixLayoutList = new McuLayout[source.MixLayoutList.length];
            for (int i = 0; i < source.MixLayoutList.length; i++) {
                this.MixLayoutList[i] = new McuLayout(source.MixLayoutList[i]);
            }
        }
        if (source.MaxVideoUser != null) {
            this.MaxVideoUser = new MaxVideoUser(source.MaxVideoUser);
        }
        if (source.RenderMode != null) {
            this.RenderMode = new Long(source.RenderMode);
        }
        if (source.EnableStreamSEI != null) {
            this.EnableStreamSEI = new Long(source.EnableStreamSEI);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MixLayoutMode", this.MixLayoutMode);
        this.setParamSimple(map, prefix + "PureAudioHoldPlaceMode", this.PureAudioHoldPlaceMode);
        this.setParamArrayObj(map, prefix + "MixLayoutList.", this.MixLayoutList);
        this.setParamObj(map, prefix + "MaxVideoUser.", this.MaxVideoUser);
        this.setParamSimple(map, prefix + "RenderMode", this.RenderMode);
        this.setParamSimple(map, prefix + "EnableStreamSEI", this.EnableStreamSEI);

    }
}

