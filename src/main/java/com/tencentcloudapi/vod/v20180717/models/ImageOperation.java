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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImageOperation extends AbstractModel{

    /**
    * 图片处理类型。可选类型有：
<li>Scale : 图片缩略处理。</li>
<li>CenterCut : 图片裁剪处理。</li>
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
     * Get 图片处理类型。可选类型有：
<li>Scale : 图片缩略处理。</li>
<li>CenterCut : 图片裁剪处理。</li> 
     * @return Type 图片处理类型。可选类型有：
<li>Scale : 图片缩略处理。</li>
<li>CenterCut : 图片裁剪处理。</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 图片处理类型。可选类型有：
<li>Scale : 图片缩略处理。</li>
<li>CenterCut : 图片裁剪处理。</li>
     * @param Type 图片处理类型。可选类型有：
<li>Scale : 图片缩略处理。</li>
<li>CenterCut : 图片裁剪处理。</li>
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
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamObj(map, prefix + "Scale.", this.Scale);
        this.setParamObj(map, prefix + "CenterCut.", this.CenterCut);

    }
}

