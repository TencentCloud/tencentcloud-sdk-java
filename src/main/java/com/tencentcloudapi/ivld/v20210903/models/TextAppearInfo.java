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
package com.tencentcloudapi.ivld.v20210903.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TextAppearInfo extends AbstractModel{

    /**
    * 文本结果数组中的下标
    */
    @SerializedName("Index")
    @Expose
    private Long Index;

    /**
    * 关键词在文本中出现的起始偏移量(包含)
    */
    @SerializedName("StartPosition")
    @Expose
    private Long StartPosition;

    /**
    * 关键词在文本中出现的结束偏移量(不包含)
    */
    @SerializedName("EndPosition")
    @Expose
    private Long EndPosition;

    /**
     * Get 文本结果数组中的下标 
     * @return Index 文本结果数组中的下标
     */
    public Long getIndex() {
        return this.Index;
    }

    /**
     * Set 文本结果数组中的下标
     * @param Index 文本结果数组中的下标
     */
    public void setIndex(Long Index) {
        this.Index = Index;
    }

    /**
     * Get 关键词在文本中出现的起始偏移量(包含) 
     * @return StartPosition 关键词在文本中出现的起始偏移量(包含)
     */
    public Long getStartPosition() {
        return this.StartPosition;
    }

    /**
     * Set 关键词在文本中出现的起始偏移量(包含)
     * @param StartPosition 关键词在文本中出现的起始偏移量(包含)
     */
    public void setStartPosition(Long StartPosition) {
        this.StartPosition = StartPosition;
    }

    /**
     * Get 关键词在文本中出现的结束偏移量(不包含) 
     * @return EndPosition 关键词在文本中出现的结束偏移量(不包含)
     */
    public Long getEndPosition() {
        return this.EndPosition;
    }

    /**
     * Set 关键词在文本中出现的结束偏移量(不包含)
     * @param EndPosition 关键词在文本中出现的结束偏移量(不包含)
     */
    public void setEndPosition(Long EndPosition) {
        this.EndPosition = EndPosition;
    }

    public TextAppearInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TextAppearInfo(TextAppearInfo source) {
        if (source.Index != null) {
            this.Index = new Long(source.Index);
        }
        if (source.StartPosition != null) {
            this.StartPosition = new Long(source.StartPosition);
        }
        if (source.EndPosition != null) {
            this.EndPosition = new Long(source.EndPosition);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Index", this.Index);
        this.setParamSimple(map, prefix + "StartPosition", this.StartPosition);
        this.setParamSimple(map, prefix + "EndPosition", this.EndPosition);

    }
}

