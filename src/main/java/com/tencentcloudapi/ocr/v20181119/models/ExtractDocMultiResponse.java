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

public class ExtractDocMultiResponse extends AbstractModel {

    /**
    * <p>图片旋转角度(角度制)，文本的水平方向为 0；顺时针为正，逆时针为负</p>
    */
    @SerializedName("Angle")
    @Expose
    private Float Angle;

    /**
    * <p>配置结构化文本信息</p>
    */
    @SerializedName("StructuralList")
    @Expose
    private GroupInfo [] StructuralList;

    /**
    * <p>还原文本信息</p>
    */
    @SerializedName("WordList")
    @Expose
    private WordItem [] WordList;

    /**
    * <p>样本识别字段数</p>
    */
    @SerializedName("TokenNum")
    @Expose
    private Long TokenNum;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>图片旋转角度(角度制)，文本的水平方向为 0；顺时针为正，逆时针为负</p> 
     * @return Angle <p>图片旋转角度(角度制)，文本的水平方向为 0；顺时针为正，逆时针为负</p>
     */
    public Float getAngle() {
        return this.Angle;
    }

    /**
     * Set <p>图片旋转角度(角度制)，文本的水平方向为 0；顺时针为正，逆时针为负</p>
     * @param Angle <p>图片旋转角度(角度制)，文本的水平方向为 0；顺时针为正，逆时针为负</p>
     */
    public void setAngle(Float Angle) {
        this.Angle = Angle;
    }

    /**
     * Get <p>配置结构化文本信息</p> 
     * @return StructuralList <p>配置结构化文本信息</p>
     */
    public GroupInfo [] getStructuralList() {
        return this.StructuralList;
    }

    /**
     * Set <p>配置结构化文本信息</p>
     * @param StructuralList <p>配置结构化文本信息</p>
     */
    public void setStructuralList(GroupInfo [] StructuralList) {
        this.StructuralList = StructuralList;
    }

    /**
     * Get <p>还原文本信息</p> 
     * @return WordList <p>还原文本信息</p>
     */
    public WordItem [] getWordList() {
        return this.WordList;
    }

    /**
     * Set <p>还原文本信息</p>
     * @param WordList <p>还原文本信息</p>
     */
    public void setWordList(WordItem [] WordList) {
        this.WordList = WordList;
    }

    /**
     * Get <p>样本识别字段数</p> 
     * @return TokenNum <p>样本识别字段数</p>
     */
    public Long getTokenNum() {
        return this.TokenNum;
    }

    /**
     * Set <p>样本识别字段数</p>
     * @param TokenNum <p>样本识别字段数</p>
     */
    public void setTokenNum(Long TokenNum) {
        this.TokenNum = TokenNum;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public ExtractDocMultiResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExtractDocMultiResponse(ExtractDocMultiResponse source) {
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
        if (source.TokenNum != null) {
            this.TokenNum = new Long(source.TokenNum);
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
        this.setParamSimple(map, prefix + "TokenNum", this.TokenNum);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

