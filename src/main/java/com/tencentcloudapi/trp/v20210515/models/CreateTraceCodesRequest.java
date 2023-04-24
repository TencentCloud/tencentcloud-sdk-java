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
package com.tencentcloudapi.trp.v20210515.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateTraceCodesRequest extends AbstractModel{

    /**
    * 批次ID
    */
    @SerializedName("BatchId")
    @Expose
    private String BatchId;

    /**
    * 企业ID
    */
    @SerializedName("CorpId")
    @Expose
    private Long CorpId;

    /**
    * 码
    */
    @SerializedName("Codes")
    @Expose
    private CodeItem [] Codes;

    /**
    * 码绑定激活策略，默认  0
0: 传什么码就激活什么码
1: 层级码 + 层级子码
    */
    @SerializedName("CodeType")
    @Expose
    private Long CodeType;

    /**
    * 错误检查类型，默认 0
0: 没有新导入码时正常返回
1: 没有新导入码时报错，并返回没有导入成功的原因
    */
    @SerializedName("CheckType")
    @Expose
    private Long CheckType;

    /**
     * Get 批次ID 
     * @return BatchId 批次ID
     */
    public String getBatchId() {
        return this.BatchId;
    }

    /**
     * Set 批次ID
     * @param BatchId 批次ID
     */
    public void setBatchId(String BatchId) {
        this.BatchId = BatchId;
    }

    /**
     * Get 企业ID 
     * @return CorpId 企业ID
     */
    public Long getCorpId() {
        return this.CorpId;
    }

    /**
     * Set 企业ID
     * @param CorpId 企业ID
     */
    public void setCorpId(Long CorpId) {
        this.CorpId = CorpId;
    }

    /**
     * Get 码 
     * @return Codes 码
     */
    public CodeItem [] getCodes() {
        return this.Codes;
    }

    /**
     * Set 码
     * @param Codes 码
     */
    public void setCodes(CodeItem [] Codes) {
        this.Codes = Codes;
    }

    /**
     * Get 码绑定激活策略，默认  0
0: 传什么码就激活什么码
1: 层级码 + 层级子码 
     * @return CodeType 码绑定激活策略，默认  0
0: 传什么码就激活什么码
1: 层级码 + 层级子码
     */
    public Long getCodeType() {
        return this.CodeType;
    }

    /**
     * Set 码绑定激活策略，默认  0
0: 传什么码就激活什么码
1: 层级码 + 层级子码
     * @param CodeType 码绑定激活策略，默认  0
0: 传什么码就激活什么码
1: 层级码 + 层级子码
     */
    public void setCodeType(Long CodeType) {
        this.CodeType = CodeType;
    }

    /**
     * Get 错误检查类型，默认 0
0: 没有新导入码时正常返回
1: 没有新导入码时报错，并返回没有导入成功的原因 
     * @return CheckType 错误检查类型，默认 0
0: 没有新导入码时正常返回
1: 没有新导入码时报错，并返回没有导入成功的原因
     */
    public Long getCheckType() {
        return this.CheckType;
    }

    /**
     * Set 错误检查类型，默认 0
0: 没有新导入码时正常返回
1: 没有新导入码时报错，并返回没有导入成功的原因
     * @param CheckType 错误检查类型，默认 0
0: 没有新导入码时正常返回
1: 没有新导入码时报错，并返回没有导入成功的原因
     */
    public void setCheckType(Long CheckType) {
        this.CheckType = CheckType;
    }

    public CreateTraceCodesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateTraceCodesRequest(CreateTraceCodesRequest source) {
        if (source.BatchId != null) {
            this.BatchId = new String(source.BatchId);
        }
        if (source.CorpId != null) {
            this.CorpId = new Long(source.CorpId);
        }
        if (source.Codes != null) {
            this.Codes = new CodeItem[source.Codes.length];
            for (int i = 0; i < source.Codes.length; i++) {
                this.Codes[i] = new CodeItem(source.Codes[i]);
            }
        }
        if (source.CodeType != null) {
            this.CodeType = new Long(source.CodeType);
        }
        if (source.CheckType != null) {
            this.CheckType = new Long(source.CheckType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BatchId", this.BatchId);
        this.setParamSimple(map, prefix + "CorpId", this.CorpId);
        this.setParamArrayObj(map, prefix + "Codes.", this.Codes);
        this.setParamSimple(map, prefix + "CodeType", this.CodeType);
        this.setParamSimple(map, prefix + "CheckType", this.CheckType);

    }
}

