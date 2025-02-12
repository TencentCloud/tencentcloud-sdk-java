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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ContentInfo extends AbstractModel {

    /**
    * 字段内容
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * 结果置信度
    */
    @SerializedName("Confidence")
    @Expose
    private Long Confidence;

    /**
    * 字段是否不完整（value内容）
0 字段正常
1 字段不完整
    */
    @SerializedName("IsInComplete")
    @Expose
    private Long IsInComplete;

    /**
    * 字段反光（value内容）
0 字段正常
1 字段有反光
    */
    @SerializedName("IsReflect")
    @Expose
    private Long IsReflect;

    /**
    * 字段是否不完整（key内容）
0 字段正常
1 字段不完整
    */
    @SerializedName("IsKeyInComplete")
    @Expose
    private Long IsKeyInComplete;

    /**
    * 字段反光（key内容）
0 字段正常
1 字段有反光
    */
    @SerializedName("IsKeyReflect")
    @Expose
    private Long IsKeyReflect;

    /**
     * Get 字段内容 
     * @return Content 字段内容
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set 字段内容
     * @param Content 字段内容
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get 结果置信度 
     * @return Confidence 结果置信度
     */
    public Long getConfidence() {
        return this.Confidence;
    }

    /**
     * Set 结果置信度
     * @param Confidence 结果置信度
     */
    public void setConfidence(Long Confidence) {
        this.Confidence = Confidence;
    }

    /**
     * Get 字段是否不完整（value内容）
0 字段正常
1 字段不完整 
     * @return IsInComplete 字段是否不完整（value内容）
0 字段正常
1 字段不完整
     */
    public Long getIsInComplete() {
        return this.IsInComplete;
    }

    /**
     * Set 字段是否不完整（value内容）
0 字段正常
1 字段不完整
     * @param IsInComplete 字段是否不完整（value内容）
0 字段正常
1 字段不完整
     */
    public void setIsInComplete(Long IsInComplete) {
        this.IsInComplete = IsInComplete;
    }

    /**
     * Get 字段反光（value内容）
0 字段正常
1 字段有反光 
     * @return IsReflect 字段反光（value内容）
0 字段正常
1 字段有反光
     */
    public Long getIsReflect() {
        return this.IsReflect;
    }

    /**
     * Set 字段反光（value内容）
0 字段正常
1 字段有反光
     * @param IsReflect 字段反光（value内容）
0 字段正常
1 字段有反光
     */
    public void setIsReflect(Long IsReflect) {
        this.IsReflect = IsReflect;
    }

    /**
     * Get 字段是否不完整（key内容）
0 字段正常
1 字段不完整 
     * @return IsKeyInComplete 字段是否不完整（key内容）
0 字段正常
1 字段不完整
     */
    public Long getIsKeyInComplete() {
        return this.IsKeyInComplete;
    }

    /**
     * Set 字段是否不完整（key内容）
0 字段正常
1 字段不完整
     * @param IsKeyInComplete 字段是否不完整（key内容）
0 字段正常
1 字段不完整
     */
    public void setIsKeyInComplete(Long IsKeyInComplete) {
        this.IsKeyInComplete = IsKeyInComplete;
    }

    /**
     * Get 字段反光（key内容）
0 字段正常
1 字段有反光 
     * @return IsKeyReflect 字段反光（key内容）
0 字段正常
1 字段有反光
     */
    public Long getIsKeyReflect() {
        return this.IsKeyReflect;
    }

    /**
     * Set 字段反光（key内容）
0 字段正常
1 字段有反光
     * @param IsKeyReflect 字段反光（key内容）
0 字段正常
1 字段有反光
     */
    public void setIsKeyReflect(Long IsKeyReflect) {
        this.IsKeyReflect = IsKeyReflect;
    }

    public ContentInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ContentInfo(ContentInfo source) {
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.Confidence != null) {
            this.Confidence = new Long(source.Confidence);
        }
        if (source.IsInComplete != null) {
            this.IsInComplete = new Long(source.IsInComplete);
        }
        if (source.IsReflect != null) {
            this.IsReflect = new Long(source.IsReflect);
        }
        if (source.IsKeyInComplete != null) {
            this.IsKeyInComplete = new Long(source.IsKeyInComplete);
        }
        if (source.IsKeyReflect != null) {
            this.IsKeyReflect = new Long(source.IsKeyReflect);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "Confidence", this.Confidence);
        this.setParamSimple(map, prefix + "IsInComplete", this.IsInComplete);
        this.setParamSimple(map, prefix + "IsReflect", this.IsReflect);
        this.setParamSimple(map, prefix + "IsKeyInComplete", this.IsKeyInComplete);
        this.setParamSimple(map, prefix + "IsKeyReflect", this.IsKeyReflect);

    }
}

