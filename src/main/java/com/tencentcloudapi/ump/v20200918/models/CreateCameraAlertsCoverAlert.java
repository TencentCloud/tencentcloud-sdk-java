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
package com.tencentcloudapi.ump.v20200918.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateCameraAlertsCoverAlert extends AbstractModel{

    /**
    * 是否遮挡
    */
    @SerializedName("Cover")
    @Expose
    private Boolean Cover;

    /**
    * 是否移动置信度
    */
    @SerializedName("CoverConfidence")
    @Expose
    private Float CoverConfidence;

    /**
     * Get 是否遮挡 
     * @return Cover 是否遮挡
     */
    public Boolean getCover() {
        return this.Cover;
    }

    /**
     * Set 是否遮挡
     * @param Cover 是否遮挡
     */
    public void setCover(Boolean Cover) {
        this.Cover = Cover;
    }

    /**
     * Get 是否移动置信度 
     * @return CoverConfidence 是否移动置信度
     */
    public Float getCoverConfidence() {
        return this.CoverConfidence;
    }

    /**
     * Set 是否移动置信度
     * @param CoverConfidence 是否移动置信度
     */
    public void setCoverConfidence(Float CoverConfidence) {
        this.CoverConfidence = CoverConfidence;
    }

    public CreateCameraAlertsCoverAlert() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCameraAlertsCoverAlert(CreateCameraAlertsCoverAlert source) {
        if (source.Cover != null) {
            this.Cover = new Boolean(source.Cover);
        }
        if (source.CoverConfidence != null) {
            this.CoverConfidence = new Float(source.CoverConfidence);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Cover", this.Cover);
        this.setParamSimple(map, prefix + "CoverConfidence", this.CoverConfidence);

    }
}

