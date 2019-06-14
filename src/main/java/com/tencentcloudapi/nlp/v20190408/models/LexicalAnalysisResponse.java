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
package com.tencentcloudapi.nlp.v20190408.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LexicalAnalysisResponse  extends AbstractModel{

    /**
    * 命名实体识别结果
    */
    @SerializedName("NerTokens")
    @Expose
    private NerToken [] NerTokens;

    /**
    * 分词&词性标注结果
    */
    @SerializedName("PosTokens")
    @Expose
    private PosToken [] PosTokens;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取命名实体识别结果
     * @return NerTokens 命名实体识别结果
     */
    public NerToken [] getNerTokens() {
        return this.NerTokens;
    }

    /**
     * 设置命名实体识别结果
     * @param NerTokens 命名实体识别结果
     */
    public void setNerTokens(NerToken [] NerTokens) {
        this.NerTokens = NerTokens;
    }

    /**
     * 获取分词&词性标注结果
     * @return PosTokens 分词&词性标注结果
     */
    public PosToken [] getPosTokens() {
        return this.PosTokens;
    }

    /**
     * 设置分词&词性标注结果
     * @param PosTokens 分词&词性标注结果
     */
    public void setPosTokens(PosToken [] PosTokens) {
        this.PosTokens = PosTokens;
    }

    /**
     * 获取唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * 设置唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "NerTokens.", this.NerTokens);
        this.setParamArrayObj(map, prefix + "PosTokens.", this.PosTokens);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

