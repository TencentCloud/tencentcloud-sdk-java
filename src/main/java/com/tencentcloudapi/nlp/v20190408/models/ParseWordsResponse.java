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

public class ParseWordsResponse extends AbstractModel{

    /**
    * 输入文本正则化的结果。（包括对英文文本中的开头和实体进行大写等）
    */
    @SerializedName("NormalText")
    @Expose
    private String NormalText;

    /**
    * 基础粒度分词和词性标注的结果。（请参见附录[词性表](https://cloud.tencent.com/document/product/271/36460)）
    */
    @SerializedName("BasicParticiples")
    @Expose
    private BasicParticiple [] BasicParticiples;

    /**
    * 复合粒度分词和词性标注的结果。（请参见附录[词性表](https://cloud.tencent.com/document/product/271/36460)）
    */
    @SerializedName("CompoundParticiples")
    @Expose
    private CompoundParticiple [] CompoundParticiples;

    /**
    * 实体识别结果。（请参见附录[实体类型数据](https://cloud.tencent.com/document/product/271/90592)）

    */
    @SerializedName("Entities")
    @Expose
    private Entity [] Entities;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 输入文本正则化的结果。（包括对英文文本中的开头和实体进行大写等） 
     * @return NormalText 输入文本正则化的结果。（包括对英文文本中的开头和实体进行大写等）
     */
    public String getNormalText() {
        return this.NormalText;
    }

    /**
     * Set 输入文本正则化的结果。（包括对英文文本中的开头和实体进行大写等）
     * @param NormalText 输入文本正则化的结果。（包括对英文文本中的开头和实体进行大写等）
     */
    public void setNormalText(String NormalText) {
        this.NormalText = NormalText;
    }

    /**
     * Get 基础粒度分词和词性标注的结果。（请参见附录[词性表](https://cloud.tencent.com/document/product/271/36460)） 
     * @return BasicParticiples 基础粒度分词和词性标注的结果。（请参见附录[词性表](https://cloud.tencent.com/document/product/271/36460)）
     */
    public BasicParticiple [] getBasicParticiples() {
        return this.BasicParticiples;
    }

    /**
     * Set 基础粒度分词和词性标注的结果。（请参见附录[词性表](https://cloud.tencent.com/document/product/271/36460)）
     * @param BasicParticiples 基础粒度分词和词性标注的结果。（请参见附录[词性表](https://cloud.tencent.com/document/product/271/36460)）
     */
    public void setBasicParticiples(BasicParticiple [] BasicParticiples) {
        this.BasicParticiples = BasicParticiples;
    }

    /**
     * Get 复合粒度分词和词性标注的结果。（请参见附录[词性表](https://cloud.tencent.com/document/product/271/36460)） 
     * @return CompoundParticiples 复合粒度分词和词性标注的结果。（请参见附录[词性表](https://cloud.tencent.com/document/product/271/36460)）
     */
    public CompoundParticiple [] getCompoundParticiples() {
        return this.CompoundParticiples;
    }

    /**
     * Set 复合粒度分词和词性标注的结果。（请参见附录[词性表](https://cloud.tencent.com/document/product/271/36460)）
     * @param CompoundParticiples 复合粒度分词和词性标注的结果。（请参见附录[词性表](https://cloud.tencent.com/document/product/271/36460)）
     */
    public void setCompoundParticiples(CompoundParticiple [] CompoundParticiples) {
        this.CompoundParticiples = CompoundParticiples;
    }

    /**
     * Get 实体识别结果。（请参见附录[实体类型数据](https://cloud.tencent.com/document/product/271/90592)）
 
     * @return Entities 实体识别结果。（请参见附录[实体类型数据](https://cloud.tencent.com/document/product/271/90592)）

     */
    public Entity [] getEntities() {
        return this.Entities;
    }

    /**
     * Set 实体识别结果。（请参见附录[实体类型数据](https://cloud.tencent.com/document/product/271/90592)）

     * @param Entities 实体识别结果。（请参见附录[实体类型数据](https://cloud.tencent.com/document/product/271/90592)）

     */
    public void setEntities(Entity [] Entities) {
        this.Entities = Entities;
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

    public ParseWordsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ParseWordsResponse(ParseWordsResponse source) {
        if (source.NormalText != null) {
            this.NormalText = new String(source.NormalText);
        }
        if (source.BasicParticiples != null) {
            this.BasicParticiples = new BasicParticiple[source.BasicParticiples.length];
            for (int i = 0; i < source.BasicParticiples.length; i++) {
                this.BasicParticiples[i] = new BasicParticiple(source.BasicParticiples[i]);
            }
        }
        if (source.CompoundParticiples != null) {
            this.CompoundParticiples = new CompoundParticiple[source.CompoundParticiples.length];
            for (int i = 0; i < source.CompoundParticiples.length; i++) {
                this.CompoundParticiples[i] = new CompoundParticiple(source.CompoundParticiples[i]);
            }
        }
        if (source.Entities != null) {
            this.Entities = new Entity[source.Entities.length];
            for (int i = 0; i < source.Entities.length; i++) {
                this.Entities[i] = new Entity(source.Entities[i]);
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
        this.setParamSimple(map, prefix + "NormalText", this.NormalText);
        this.setParamArrayObj(map, prefix + "BasicParticiples.", this.BasicParticiples);
        this.setParamArrayObj(map, prefix + "CompoundParticiples.", this.CompoundParticiples);
        this.setParamArrayObj(map, prefix + "Entities.", this.Entities);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

