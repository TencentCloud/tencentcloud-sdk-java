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
package com.tencentcloudapi.ie.v20200304.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FaceProtect extends AbstractModel{

    /**
    * 人脸区域增强强度，可选项：0.0-1.0。小于0.0的默认为0.0，大于1.0的默认为1.0。
    */
    @SerializedName("FaceUsmRatio")
    @Expose
    private Float FaceUsmRatio;

    /**
     * Get 人脸区域增强强度，可选项：0.0-1.0。小于0.0的默认为0.0，大于1.0的默认为1.0。 
     * @return FaceUsmRatio 人脸区域增强强度，可选项：0.0-1.0。小于0.0的默认为0.0，大于1.0的默认为1.0。
     */
    public Float getFaceUsmRatio() {
        return this.FaceUsmRatio;
    }

    /**
     * Set 人脸区域增强强度，可选项：0.0-1.0。小于0.0的默认为0.0，大于1.0的默认为1.0。
     * @param FaceUsmRatio 人脸区域增强强度，可选项：0.0-1.0。小于0.0的默认为0.0，大于1.0的默认为1.0。
     */
    public void setFaceUsmRatio(Float FaceUsmRatio) {
        this.FaceUsmRatio = FaceUsmRatio;
    }

    public FaceProtect() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FaceProtect(FaceProtect source) {
        if (source.FaceUsmRatio != null) {
            this.FaceUsmRatio = new Float(source.FaceUsmRatio);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FaceUsmRatio", this.FaceUsmRatio);

    }
}

