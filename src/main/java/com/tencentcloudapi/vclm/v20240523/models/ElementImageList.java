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
package com.tencentcloudapi.vclm.v20240523.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ElementImageList extends AbstractModel {

    /**
    * <p>主体参考图</p>
    */
    @SerializedName("ReferImages")
    @Expose
    private ReferImageItem [] ReferImages;

    /**
    * <p>主体主图</p>
    */
    @SerializedName("FrontalImage")
    @Expose
    private String FrontalImage;

    /**
     * Get <p>主体参考图</p> 
     * @return ReferImages <p>主体参考图</p>
     */
    public ReferImageItem [] getReferImages() {
        return this.ReferImages;
    }

    /**
     * Set <p>主体参考图</p>
     * @param ReferImages <p>主体参考图</p>
     */
    public void setReferImages(ReferImageItem [] ReferImages) {
        this.ReferImages = ReferImages;
    }

    /**
     * Get <p>主体主图</p> 
     * @return FrontalImage <p>主体主图</p>
     */
    public String getFrontalImage() {
        return this.FrontalImage;
    }

    /**
     * Set <p>主体主图</p>
     * @param FrontalImage <p>主体主图</p>
     */
    public void setFrontalImage(String FrontalImage) {
        this.FrontalImage = FrontalImage;
    }

    public ElementImageList() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ElementImageList(ElementImageList source) {
        if (source.ReferImages != null) {
            this.ReferImages = new ReferImageItem[source.ReferImages.length];
            for (int i = 0; i < source.ReferImages.length; i++) {
                this.ReferImages[i] = new ReferImageItem(source.ReferImages[i]);
            }
        }
        if (source.FrontalImage != null) {
            this.FrontalImage = new String(source.FrontalImage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "ReferImages.", this.ReferImages);
        this.setParamSimple(map, prefix + "FrontalImage", this.FrontalImage);

    }
}

