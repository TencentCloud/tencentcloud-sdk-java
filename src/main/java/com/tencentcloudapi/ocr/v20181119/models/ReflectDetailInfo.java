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

public class ReflectDetailInfo extends AbstractModel {

    /**
    * NationalEmblem 国徽位置
Portrait 人像照片位置
RecognitionField 识别字段位置
Others 其他位置
    */
    @SerializedName("Position")
    @Expose
    private String Position;

    /**
     * Get NationalEmblem 国徽位置
Portrait 人像照片位置
RecognitionField 识别字段位置
Others 其他位置 
     * @return Position NationalEmblem 国徽位置
Portrait 人像照片位置
RecognitionField 识别字段位置
Others 其他位置
     */
    public String getPosition() {
        return this.Position;
    }

    /**
     * Set NationalEmblem 国徽位置
Portrait 人像照片位置
RecognitionField 识别字段位置
Others 其他位置
     * @param Position NationalEmblem 国徽位置
Portrait 人像照片位置
RecognitionField 识别字段位置
Others 其他位置
     */
    public void setPosition(String Position) {
        this.Position = Position;
    }

    public ReflectDetailInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReflectDetailInfo(ReflectDetailInfo source) {
        if (source.Position != null) {
            this.Position = new String(source.Position);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Position", this.Position);

    }
}

