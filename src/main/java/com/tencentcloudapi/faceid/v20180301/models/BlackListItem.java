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
package com.tencentcloudapi.faceid.v20180301.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BlackListItem extends AbstractModel {

    /**
    * <p>黑名单条目 ID，客户创建条目时自定义，用于回溯是哪一条命中</p>
    */
    @SerializedName("ModelId")
    @Expose
    private String ModelId;

    /**
    * <p>条目类型。当前仅有 face（人脸）</p>
    */
    @SerializedName("ModelType")
    @Expose
    private String ModelType;

    /**
    * <p>人脸相似度，字符串形式表示，保留 4 位小数，取值 0.0000–1.0000</p>
    */
    @SerializedName("FaceScore")
    @Expose
    private String FaceScore;

    /**
    * <p>背景相似度</p>
    */
    @SerializedName("BackgroundScore")
    @Expose
    private String BackgroundScore;

    /**
     * Get <p>黑名单条目 ID，客户创建条目时自定义，用于回溯是哪一条命中</p> 
     * @return ModelId <p>黑名单条目 ID，客户创建条目时自定义，用于回溯是哪一条命中</p>
     */
    public String getModelId() {
        return this.ModelId;
    }

    /**
     * Set <p>黑名单条目 ID，客户创建条目时自定义，用于回溯是哪一条命中</p>
     * @param ModelId <p>黑名单条目 ID，客户创建条目时自定义，用于回溯是哪一条命中</p>
     */
    public void setModelId(String ModelId) {
        this.ModelId = ModelId;
    }

    /**
     * Get <p>条目类型。当前仅有 face（人脸）</p> 
     * @return ModelType <p>条目类型。当前仅有 face（人脸）</p>
     */
    public String getModelType() {
        return this.ModelType;
    }

    /**
     * Set <p>条目类型。当前仅有 face（人脸）</p>
     * @param ModelType <p>条目类型。当前仅有 face（人脸）</p>
     */
    public void setModelType(String ModelType) {
        this.ModelType = ModelType;
    }

    /**
     * Get <p>人脸相似度，字符串形式表示，保留 4 位小数，取值 0.0000–1.0000</p> 
     * @return FaceScore <p>人脸相似度，字符串形式表示，保留 4 位小数，取值 0.0000–1.0000</p>
     */
    public String getFaceScore() {
        return this.FaceScore;
    }

    /**
     * Set <p>人脸相似度，字符串形式表示，保留 4 位小数，取值 0.0000–1.0000</p>
     * @param FaceScore <p>人脸相似度，字符串形式表示，保留 4 位小数，取值 0.0000–1.0000</p>
     */
    public void setFaceScore(String FaceScore) {
        this.FaceScore = FaceScore;
    }

    /**
     * Get <p>背景相似度</p> 
     * @return BackgroundScore <p>背景相似度</p>
     */
    public String getBackgroundScore() {
        return this.BackgroundScore;
    }

    /**
     * Set <p>背景相似度</p>
     * @param BackgroundScore <p>背景相似度</p>
     */
    public void setBackgroundScore(String BackgroundScore) {
        this.BackgroundScore = BackgroundScore;
    }

    public BlackListItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BlackListItem(BlackListItem source) {
        if (source.ModelId != null) {
            this.ModelId = new String(source.ModelId);
        }
        if (source.ModelType != null) {
            this.ModelType = new String(source.ModelType);
        }
        if (source.FaceScore != null) {
            this.FaceScore = new String(source.FaceScore);
        }
        if (source.BackgroundScore != null) {
            this.BackgroundScore = new String(source.BackgroundScore);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ModelId", this.ModelId);
        this.setParamSimple(map, prefix + "ModelType", this.ModelType);
        this.setParamSimple(map, prefix + "FaceScore", this.FaceScore);
        this.setParamSimple(map, prefix + "BackgroundScore", this.BackgroundScore);

    }
}

