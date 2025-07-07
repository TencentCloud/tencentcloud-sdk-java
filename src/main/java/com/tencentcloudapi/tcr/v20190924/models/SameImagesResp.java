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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SameImagesResp extends AbstractModel {

    /**
    * tag列表
    */
    @SerializedName("SameImages")
    @Expose
    private String [] SameImages;

    /**
     * Get tag列表 
     * @return SameImages tag列表
     */
    public String [] getSameImages() {
        return this.SameImages;
    }

    /**
     * Set tag列表
     * @param SameImages tag列表
     */
    public void setSameImages(String [] SameImages) {
        this.SameImages = SameImages;
    }

    public SameImagesResp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SameImagesResp(SameImagesResp source) {
        if (source.SameImages != null) {
            this.SameImages = new String[source.SameImages.length];
            for (int i = 0; i < source.SameImages.length; i++) {
                this.SameImages[i] = new String(source.SameImages[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "SameImages.", this.SameImages);

    }
}

