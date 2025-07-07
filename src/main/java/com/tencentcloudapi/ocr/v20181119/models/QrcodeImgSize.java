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
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QrcodeImgSize extends AbstractModel {

    /**
    * 宽
    */
    @SerializedName("Wide")
    @Expose
    private Long Wide;

    /**
    * 高
    */
    @SerializedName("High")
    @Expose
    private Long High;

    /**
     * Get 宽 
     * @return Wide 宽
     */
    public Long getWide() {
        return this.Wide;
    }

    /**
     * Set 宽
     * @param Wide 宽
     */
    public void setWide(Long Wide) {
        this.Wide = Wide;
    }

    /**
     * Get 高 
     * @return High 高
     */
    public Long getHigh() {
        return this.High;
    }

    /**
     * Set 高
     * @param High 高
     */
    public void setHigh(Long High) {
        this.High = High;
    }

    public QrcodeImgSize() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QrcodeImgSize(QrcodeImgSize source) {
        if (source.Wide != null) {
            this.Wide = new Long(source.Wide);
        }
        if (source.High != null) {
            this.High = new Long(source.High);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Wide", this.Wide);
        this.setParamSimple(map, prefix + "High", this.High);

    }
}

