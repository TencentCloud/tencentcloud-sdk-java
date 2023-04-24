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
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SmartStructuralOCRV2Response extends AbstractModel{

    /**
    * 图片旋转角度(角度制)，文本的水平方向
为 0；顺时针为正，逆时针为负
    */
    @SerializedName("Angle")
    @Expose
    private Float Angle;

    /**
    * 配置结构化文本信息
    */
    @SerializedName("StructuralList")
    @Expose
    private GroupInfo [] StructuralList;

    /**
    * 还原文本信息
    */
    @SerializedName("WordList")
    @Expose
    private WordItem [] WordList;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 图片旋转角度(角度制)，文本的水平方向
为 0；顺时针为正，逆时针为负 
     * @return Angle 图片旋转角度(角度制)，文本的水平方向
为 0；顺时针为正，逆时针为负
     */
    public Float getAngle() {
        return this.Angle;
    }

    /**
     * Set 图片旋转角度(角度制)，文本的水平方向
为 0；顺时针为正，逆时针为负
     * @param Angle 图片旋转角度(角度制)，文本的水平方向
为 0；顺时针为正，逆时针为负
     */
    public void setAngle(Float Angle) {
        this.Angle = Angle;
    }

    /**
     * Get 配置结构化文本信息 
     * @return StructuralList 配置结构化文本信息
     */
    public GroupInfo [] getStructuralList() {
        return this.StructuralList;
    }

    /**
     * Set 配置结构化文本信息
     * @param StructuralList 配置结构化文本信息
     */
    public void setStructuralList(GroupInfo [] StructuralList) {
        this.StructuralList = StructuralList;
    }

    /**
     * Get 还原文本信息 
     * @return WordList 还原文本信息
     */
    public WordItem [] getWordList() {
        return this.WordList;
    }

    /**
     * Set 还原文本信息
     * @param WordList 还原文本信息
     */
    public void setWordList(WordItem [] WordList) {
        this.WordList = WordList;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public SmartStructuralOCRV2Response() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SmartStructuralOCRV2Response(SmartStructuralOCRV2Response source) {
        if (source.Angle != null) {
            this.Angle = new Float(source.Angle);
        }
        if (source.StructuralList != null) {
            this.StructuralList = new GroupInfo[source.StructuralList.length];
            for (int i = 0; i < source.StructuralList.length; i++) {
                this.StructuralList[i] = new GroupInfo(source.StructuralList[i]);
            }
        }
        if (source.WordList != null) {
            this.WordList = new WordItem[source.WordList.length];
            for (int i = 0; i < source.WordList.length; i++) {
                this.WordList[i] = new WordItem(source.WordList[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Angle", this.Angle);
        this.setParamArrayObj(map, prefix + "StructuralList.", this.StructuralList);
        this.setParamArrayObj(map, prefix + "WordList.", this.WordList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

