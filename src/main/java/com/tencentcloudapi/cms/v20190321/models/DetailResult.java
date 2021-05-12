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
package com.tencentcloudapi.cms.v20190321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DetailResult extends AbstractModel{

    /**
    * 恶意标签，Normal：正常，Polity：涉政，Porn：色情，Illegal：违法，Abuse：谩骂，Terror：暴恐，Ad：广告，Custom：自定义关键词
    */
    @SerializedName("EvilLabel")
    @Expose
    private String EvilLabel;

    /**
    * 恶意类型
100：正常
20001：政治
20002：色情 
20006：涉毒违法
20007：谩骂
20105：广告引流 
24001：暴恐
    */
    @SerializedName("EvilType")
    @Expose
    private Long EvilType;

    /**
    * 该标签下命中的关键词
    */
    @SerializedName("Keywords")
    @Expose
    private String [] Keywords;

    /**
    * 该标签模型命中的分值
    */
    @SerializedName("Score")
    @Expose
    private Long Score;

    /**
     * Get 恶意标签，Normal：正常，Polity：涉政，Porn：色情，Illegal：违法，Abuse：谩骂，Terror：暴恐，Ad：广告，Custom：自定义关键词 
     * @return EvilLabel 恶意标签，Normal：正常，Polity：涉政，Porn：色情，Illegal：违法，Abuse：谩骂，Terror：暴恐，Ad：广告，Custom：自定义关键词
     */
    public String getEvilLabel() {
        return this.EvilLabel;
    }

    /**
     * Set 恶意标签，Normal：正常，Polity：涉政，Porn：色情，Illegal：违法，Abuse：谩骂，Terror：暴恐，Ad：广告，Custom：自定义关键词
     * @param EvilLabel 恶意标签，Normal：正常，Polity：涉政，Porn：色情，Illegal：违法，Abuse：谩骂，Terror：暴恐，Ad：广告，Custom：自定义关键词
     */
    public void setEvilLabel(String EvilLabel) {
        this.EvilLabel = EvilLabel;
    }

    /**
     * Get 恶意类型
100：正常
20001：政治
20002：色情 
20006：涉毒违法
20007：谩骂
20105：广告引流 
24001：暴恐 
     * @return EvilType 恶意类型
100：正常
20001：政治
20002：色情 
20006：涉毒违法
20007：谩骂
20105：广告引流 
24001：暴恐
     */
    public Long getEvilType() {
        return this.EvilType;
    }

    /**
     * Set 恶意类型
100：正常
20001：政治
20002：色情 
20006：涉毒违法
20007：谩骂
20105：广告引流 
24001：暴恐
     * @param EvilType 恶意类型
100：正常
20001：政治
20002：色情 
20006：涉毒违法
20007：谩骂
20105：广告引流 
24001：暴恐
     */
    public void setEvilType(Long EvilType) {
        this.EvilType = EvilType;
    }

    /**
     * Get 该标签下命中的关键词 
     * @return Keywords 该标签下命中的关键词
     */
    public String [] getKeywords() {
        return this.Keywords;
    }

    /**
     * Set 该标签下命中的关键词
     * @param Keywords 该标签下命中的关键词
     */
    public void setKeywords(String [] Keywords) {
        this.Keywords = Keywords;
    }

    /**
     * Get 该标签模型命中的分值 
     * @return Score 该标签模型命中的分值
     */
    public Long getScore() {
        return this.Score;
    }

    /**
     * Set 该标签模型命中的分值
     * @param Score 该标签模型命中的分值
     */
    public void setScore(Long Score) {
        this.Score = Score;
    }

    public DetailResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DetailResult(DetailResult source) {
        if (source.EvilLabel != null) {
            this.EvilLabel = new String(source.EvilLabel);
        }
        if (source.EvilType != null) {
            this.EvilType = new Long(source.EvilType);
        }
        if (source.Keywords != null) {
            this.Keywords = new String[source.Keywords.length];
            for (int i = 0; i < source.Keywords.length; i++) {
                this.Keywords[i] = new String(source.Keywords[i]);
            }
        }
        if (source.Score != null) {
            this.Score = new Long(source.Score);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EvilLabel", this.EvilLabel);
        this.setParamSimple(map, prefix + "EvilType", this.EvilType);
        this.setParamArraySimple(map, prefix + "Keywords.", this.Keywords);
        this.setParamSimple(map, prefix + "Score", this.Score);

    }
}

