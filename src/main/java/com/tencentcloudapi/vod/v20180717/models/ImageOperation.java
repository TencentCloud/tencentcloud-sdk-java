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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImageOperation extends AbstractModel {

    /**
    * 图片处理类型。可选类型有：
<li>Scale : 图片缩略处理；</li>
<li>CenterCut : 图片裁剪处理；</li>
<li>Blur : 图片模糊处理。</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 图片缩略处理，仅当 Type 为 Scale 时有效。
    */
    @SerializedName("Scale")
    @Expose
    private ImageScale Scale;

    /**
    * 图片裁剪处理，仅当 Type 为 CenterCut 时有效。
    */
    @SerializedName("CenterCut")
    @Expose
    private ImageCenterCut CenterCut;

    /**
    * 图片模糊处理，仅当 Type 为 Blur 时有效。
    */
    @SerializedName("Blur")
    @Expose
    private ImageBlur Blur;

    /**
     * Get 图片处理类型。可选类型有：
<li>Scale : 图片缩略处理；</li>
<li>CenterCut : 图片裁剪处理；</li>
<li>Blur : 图片模糊处理。</li> 
     * @return Type 图片处理类型。可选类型有：
<li>Scale : 图片缩略处理；</li>
<li>CenterCut : 图片裁剪处理；</li>
<li>Blur : 图片模糊处理。</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 图片处理类型。可选类型有：
<li>Scale : 图片缩略处理；</li>
<li>CenterCut : 图片裁剪处理；</li>
<li>Blur : 图片模糊处理。</li>
     * @param Type 图片处理类型。可选类型有：
<li>Scale : 图片缩略处理；</li>
<li>CenterCut : 图片裁剪处理；</li>
<li>Blur : 图片模糊处理。</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 图片缩略处理，仅当 Type 为 Scale 时有效。 
     * @return Scale 图片缩略处理，仅当 Type 为 Scale 时有效。
     */
    public ImageScale getScale() {
        return this.Scale;
    }

    /**
     * Set 图片缩略处理，仅当 Type 为 Scale 时有效。
     * @param Scale 图片缩略处理，仅当 Type 为 Scale 时有效。
     */
    public void setScale(ImageScale Scale) {
        this.Scale = Scale;
    }

    /**
     * Get 图片裁剪处理，仅当 Type 为 CenterCut 时有效。 
     * @return CenterCut 图片裁剪处理，仅当 Type 为 CenterCut 时有效。
     */
    public ImageCenterCut getCenterCut() {
        return this.CenterCut;
    }

    /**
     * Set 图片裁剪处理，仅当 Type 为 CenterCut 时有效。
     * @param CenterCut 图片裁剪处理，仅当 Type 为 CenterCut 时有效。
     */
    public void setCenterCut(ImageCenterCut CenterCut) {
        this.CenterCut = CenterCut;
    }

    /**
     * Get 图片模糊处理，仅当 Type 为 Blur 时有效。 
     * @return Blur 图片模糊处理，仅当 Type 为 Blur 时有效。
     */
    public ImageBlur getBlur() {
        return this.Blur;
    }

    /**
     * Set 图片模糊处理，仅当 Type 为 Blur 时有效。
     * @param Blur 图片模糊处理，仅当 Type 为 Blur 时有效。
     */
    public void setBlur(ImageBlur Blur) {
        this.Blur = Blur;
    }

    public ImageOperation() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageOperation(ImageOperation source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Scale != null) {
            this.Scale = new ImageScale(source.Scale);
        }
        if (source.CenterCut != null) {
            this.CenterCut = new ImageCenterCut(source.CenterCut);
        }
        if (source.Blur != null) {
            this.Blur = new ImageBlur(source.Blur);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamObj(map, prefix + "Scale.", this.Scale);
        this.setParamObj(map, prefix + "CenterCut.", this.CenterCut);
        this.setParamObj(map, prefix + "Blur.", this.Blur);

    }
}

