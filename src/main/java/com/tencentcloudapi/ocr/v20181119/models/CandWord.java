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

public class CandWord extends AbstractModel{

    /**
    * 候选字符集的单词信息（包括单词Character和单词置信度confidence）
    */
    @SerializedName("CandWords")
    @Expose
    private Words [] CandWords;

    /**
     * Get 候选字符集的单词信息（包括单词Character和单词置信度confidence） 
     * @return CandWords 候选字符集的单词信息（包括单词Character和单词置信度confidence）
     */
    public Words [] getCandWords() {
        return this.CandWords;
    }

    /**
     * Set 候选字符集的单词信息（包括单词Character和单词置信度confidence）
     * @param CandWords 候选字符集的单词信息（包括单词Character和单词置信度confidence）
     */
    public void setCandWords(Words [] CandWords) {
        this.CandWords = CandWords;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "CandWords.", this.CandWords);

    }
}

