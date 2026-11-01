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

public class CloneViralReference extends AbstractModel {

    /**
    * <p>服饰套装参考图，多套按视频中的分段换装</p>
    */
    @SerializedName("Outfits")
    @Expose
    private String [] Outfits;

    /**
    * <p>背景/场景参考图</p>
    */
    @SerializedName("Backgrounds")
    @Expose
    private String [] Backgrounds;

    /**
     * Get <p>服饰套装参考图，多套按视频中的分段换装</p> 
     * @return Outfits <p>服饰套装参考图，多套按视频中的分段换装</p>
     */
    public String [] getOutfits() {
        return this.Outfits;
    }

    /**
     * Set <p>服饰套装参考图，多套按视频中的分段换装</p>
     * @param Outfits <p>服饰套装参考图，多套按视频中的分段换装</p>
     */
    public void setOutfits(String [] Outfits) {
        this.Outfits = Outfits;
    }

    /**
     * Get <p>背景/场景参考图</p> 
     * @return Backgrounds <p>背景/场景参考图</p>
     */
    public String [] getBackgrounds() {
        return this.Backgrounds;
    }

    /**
     * Set <p>背景/场景参考图</p>
     * @param Backgrounds <p>背景/场景参考图</p>
     */
    public void setBackgrounds(String [] Backgrounds) {
        this.Backgrounds = Backgrounds;
    }

    public CloneViralReference() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CloneViralReference(CloneViralReference source) {
        if (source.Outfits != null) {
            this.Outfits = new String[source.Outfits.length];
            for (int i = 0; i < source.Outfits.length; i++) {
                this.Outfits[i] = new String(source.Outfits[i]);
            }
        }
        if (source.Backgrounds != null) {
            this.Backgrounds = new String[source.Backgrounds.length];
            for (int i = 0; i < source.Backgrounds.length; i++) {
                this.Backgrounds[i] = new String(source.Backgrounds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Outfits.", this.Outfits);
        this.setParamArraySimple(map, prefix + "Backgrounds.", this.Backgrounds);

    }
}

