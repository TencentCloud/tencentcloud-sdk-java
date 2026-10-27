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
package com.tencentcloudapi.cvd.v20201104.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InvocationOutput extends AbstractModel {

    /**
    * <p>任务的标准输出。</p>
    */
    @SerializedName("Lines")
    @Expose
    private String [] Lines;

    /**
    * <p>本次返回的输出第一行对应的索引编号。</p>
    */
    @SerializedName("LinesOffset")
    @Expose
    private Long LinesOffset;

    /**
    * <p>本次返回的输出的行数。</p>
    */
    @SerializedName("LinesNum")
    @Expose
    private Long LinesNum;

    /**
    * <p>输出的编码方式：<br>&lt;li&gt;PlainText 未经过Base64编码。</p>
    */
    @SerializedName("Encoding")
    @Expose
    private String Encoding;

    /**
    * <p>当前有效的输出起始编号，从0开始。输出过多，会冲掉旧的输出。</p>
    */
    @SerializedName("AllLinesOffset")
    @Expose
    private Long AllLinesOffset;

    /**
    * <p>当前有效的标准输出总行数。</p>
    */
    @SerializedName("AllLinesNum")
    @Expose
    private Long AllLinesNum;

    /**
     * Get <p>任务的标准输出。</p> 
     * @return Lines <p>任务的标准输出。</p>
     */
    public String [] getLines() {
        return this.Lines;
    }

    /**
     * Set <p>任务的标准输出。</p>
     * @param Lines <p>任务的标准输出。</p>
     */
    public void setLines(String [] Lines) {
        this.Lines = Lines;
    }

    /**
     * Get <p>本次返回的输出第一行对应的索引编号。</p> 
     * @return LinesOffset <p>本次返回的输出第一行对应的索引编号。</p>
     */
    public Long getLinesOffset() {
        return this.LinesOffset;
    }

    /**
     * Set <p>本次返回的输出第一行对应的索引编号。</p>
     * @param LinesOffset <p>本次返回的输出第一行对应的索引编号。</p>
     */
    public void setLinesOffset(Long LinesOffset) {
        this.LinesOffset = LinesOffset;
    }

    /**
     * Get <p>本次返回的输出的行数。</p> 
     * @return LinesNum <p>本次返回的输出的行数。</p>
     */
    public Long getLinesNum() {
        return this.LinesNum;
    }

    /**
     * Set <p>本次返回的输出的行数。</p>
     * @param LinesNum <p>本次返回的输出的行数。</p>
     */
    public void setLinesNum(Long LinesNum) {
        this.LinesNum = LinesNum;
    }

    /**
     * Get <p>输出的编码方式：<br>&lt;li&gt;PlainText 未经过Base64编码。</p> 
     * @return Encoding <p>输出的编码方式：<br>&lt;li&gt;PlainText 未经过Base64编码。</p>
     */
    public String getEncoding() {
        return this.Encoding;
    }

    /**
     * Set <p>输出的编码方式：<br>&lt;li&gt;PlainText 未经过Base64编码。</p>
     * @param Encoding <p>输出的编码方式：<br>&lt;li&gt;PlainText 未经过Base64编码。</p>
     */
    public void setEncoding(String Encoding) {
        this.Encoding = Encoding;
    }

    /**
     * Get <p>当前有效的输出起始编号，从0开始。输出过多，会冲掉旧的输出。</p> 
     * @return AllLinesOffset <p>当前有效的输出起始编号，从0开始。输出过多，会冲掉旧的输出。</p>
     */
    public Long getAllLinesOffset() {
        return this.AllLinesOffset;
    }

    /**
     * Set <p>当前有效的输出起始编号，从0开始。输出过多，会冲掉旧的输出。</p>
     * @param AllLinesOffset <p>当前有效的输出起始编号，从0开始。输出过多，会冲掉旧的输出。</p>
     */
    public void setAllLinesOffset(Long AllLinesOffset) {
        this.AllLinesOffset = AllLinesOffset;
    }

    /**
     * Get <p>当前有效的标准输出总行数。</p> 
     * @return AllLinesNum <p>当前有效的标准输出总行数。</p>
     */
    public Long getAllLinesNum() {
        return this.AllLinesNum;
    }

    /**
     * Set <p>当前有效的标准输出总行数。</p>
     * @param AllLinesNum <p>当前有效的标准输出总行数。</p>
     */
    public void setAllLinesNum(Long AllLinesNum) {
        this.AllLinesNum = AllLinesNum;
    }

    public InvocationOutput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InvocationOutput(InvocationOutput source) {
        if (source.Lines != null) {
            this.Lines = new String[source.Lines.length];
            for (int i = 0; i < source.Lines.length; i++) {
                this.Lines[i] = new String(source.Lines[i]);
            }
        }
        if (source.LinesOffset != null) {
            this.LinesOffset = new Long(source.LinesOffset);
        }
        if (source.LinesNum != null) {
            this.LinesNum = new Long(source.LinesNum);
        }
        if (source.Encoding != null) {
            this.Encoding = new String(source.Encoding);
        }
        if (source.AllLinesOffset != null) {
            this.AllLinesOffset = new Long(source.AllLinesOffset);
        }
        if (source.AllLinesNum != null) {
            this.AllLinesNum = new Long(source.AllLinesNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Lines.", this.Lines);
        this.setParamSimple(map, prefix + "LinesOffset", this.LinesOffset);
        this.setParamSimple(map, prefix + "LinesNum", this.LinesNum);
        this.setParamSimple(map, prefix + "Encoding", this.Encoding);
        this.setParamSimple(map, prefix + "AllLinesOffset", this.AllLinesOffset);
        this.setParamSimple(map, prefix + "AllLinesNum", this.AllLinesNum);

    }
}

