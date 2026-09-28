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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AiComposeConfig extends AbstractModel {

    /**
    * <p>能力配置开关。</p><li>ON：开启（默认值）；</li><li>OFF：关闭。</li>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * <p>合成模型。可选值：compose-1.0-lite（默认值，可不传）。</p>
    */
    @SerializedName("Model")
    @Expose
    private String Model;

    /**
    * <p>画布定义。可省略：省略时取 ZIndex 最小的图层（底层图层）的自然尺寸。</p>
    */
    @SerializedName("Canvas")
    @Expose
    private ImageComposeCanvas Canvas;

    /**
    * <p>图层列表，图层的唯一来源。至少 1 层、最多 20 层。</p>
    */
    @SerializedName("Layers")
    @Expose
    private ImageComposeLayer [] Layers;

    /**
     * Get <p>能力配置开关。</p><li>ON：开启（默认值）；</li><li>OFF：关闭。</li> 
     * @return Switch <p>能力配置开关。</p><li>ON：开启（默认值）；</li><li>OFF：关闭。</li>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set <p>能力配置开关。</p><li>ON：开启（默认值）；</li><li>OFF：关闭。</li>
     * @param Switch <p>能力配置开关。</p><li>ON：开启（默认值）；</li><li>OFF：关闭。</li>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get <p>合成模型。可选值：compose-1.0-lite（默认值，可不传）。</p> 
     * @return Model <p>合成模型。可选值：compose-1.0-lite（默认值，可不传）。</p>
     */
    public String getModel() {
        return this.Model;
    }

    /**
     * Set <p>合成模型。可选值：compose-1.0-lite（默认值，可不传）。</p>
     * @param Model <p>合成模型。可选值：compose-1.0-lite（默认值，可不传）。</p>
     */
    public void setModel(String Model) {
        this.Model = Model;
    }

    /**
     * Get <p>画布定义。可省略：省略时取 ZIndex 最小的图层（底层图层）的自然尺寸。</p> 
     * @return Canvas <p>画布定义。可省略：省略时取 ZIndex 最小的图层（底层图层）的自然尺寸。</p>
     */
    public ImageComposeCanvas getCanvas() {
        return this.Canvas;
    }

    /**
     * Set <p>画布定义。可省略：省略时取 ZIndex 最小的图层（底层图层）的自然尺寸。</p>
     * @param Canvas <p>画布定义。可省略：省略时取 ZIndex 最小的图层（底层图层）的自然尺寸。</p>
     */
    public void setCanvas(ImageComposeCanvas Canvas) {
        this.Canvas = Canvas;
    }

    /**
     * Get <p>图层列表，图层的唯一来源。至少 1 层、最多 20 层。</p> 
     * @return Layers <p>图层列表，图层的唯一来源。至少 1 层、最多 20 层。</p>
     */
    public ImageComposeLayer [] getLayers() {
        return this.Layers;
    }

    /**
     * Set <p>图层列表，图层的唯一来源。至少 1 层、最多 20 层。</p>
     * @param Layers <p>图层列表，图层的唯一来源。至少 1 层、最多 20 层。</p>
     */
    public void setLayers(ImageComposeLayer [] Layers) {
        this.Layers = Layers;
    }

    public AiComposeConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AiComposeConfig(AiComposeConfig source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.Model != null) {
            this.Model = new String(source.Model);
        }
        if (source.Canvas != null) {
            this.Canvas = new ImageComposeCanvas(source.Canvas);
        }
        if (source.Layers != null) {
            this.Layers = new ImageComposeLayer[source.Layers.length];
            for (int i = 0; i < source.Layers.length; i++) {
                this.Layers[i] = new ImageComposeLayer(source.Layers[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "Model", this.Model);
        this.setParamObj(map, prefix + "Canvas.", this.Canvas);
        this.setParamArrayObj(map, prefix + "Layers.", this.Layers);

    }
}

