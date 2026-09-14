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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LabelTerm extends AbstractModel {

    /**
    * <p>同义词列表</p>
    */
    @SerializedName("SynonymList")
    @Expose
    private String [] SynonymList;

    /**
    * <p>标准词</p>
    */
    @SerializedName("Term")
    @Expose
    private String Term;

    /**
    * <p>标准词 ID（由后台生成，创建时不传）</p>
    */
    @SerializedName("TermId")
    @Expose
    private String TermId;

    /**
     * Get <p>同义词列表</p> 
     * @return SynonymList <p>同义词列表</p>
     */
    public String [] getSynonymList() {
        return this.SynonymList;
    }

    /**
     * Set <p>同义词列表</p>
     * @param SynonymList <p>同义词列表</p>
     */
    public void setSynonymList(String [] SynonymList) {
        this.SynonymList = SynonymList;
    }

    /**
     * Get <p>标准词</p> 
     * @return Term <p>标准词</p>
     */
    public String getTerm() {
        return this.Term;
    }

    /**
     * Set <p>标准词</p>
     * @param Term <p>标准词</p>
     */
    public void setTerm(String Term) {
        this.Term = Term;
    }

    /**
     * Get <p>标准词 ID（由后台生成，创建时不传）</p> 
     * @return TermId <p>标准词 ID（由后台生成，创建时不传）</p>
     */
    public String getTermId() {
        return this.TermId;
    }

    /**
     * Set <p>标准词 ID（由后台生成，创建时不传）</p>
     * @param TermId <p>标准词 ID（由后台生成，创建时不传）</p>
     */
    public void setTermId(String TermId) {
        this.TermId = TermId;
    }

    public LabelTerm() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LabelTerm(LabelTerm source) {
        if (source.SynonymList != null) {
            this.SynonymList = new String[source.SynonymList.length];
            for (int i = 0; i < source.SynonymList.length; i++) {
                this.SynonymList[i] = new String(source.SynonymList[i]);
            }
        }
        if (source.Term != null) {
            this.Term = new String(source.Term);
        }
        if (source.TermId != null) {
            this.TermId = new String(source.TermId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "SynonymList.", this.SynonymList);
        this.setParamSimple(map, prefix + "Term", this.Term);
        this.setParamSimple(map, prefix + "TermId", this.TermId);

    }
}

