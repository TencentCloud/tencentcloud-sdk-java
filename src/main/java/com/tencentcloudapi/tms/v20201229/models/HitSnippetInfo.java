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
package com.tencentcloudapi.tms.v20201229.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HitSnippetInfo extends AbstractModel {

    /**
    * <p>命中的文本片段（明文），已还原到预处理前的原文，注意该字段内容在原文中可能不连续，需要结合HitSnippetInfos[].Positions来还原出所在原文位置</p>
    */
    @SerializedName("Snippet")
    @Expose
    private String Snippet;

    /**
    * <p>原子能力类型，如果是业务自定义库命中，会给出词库名称</p>
    */
    @SerializedName("AtomicName")
    @Expose
    private String AtomicName;

    /**
    * <p>原子能力ID，如果是业务自定义库导致命中本次审核标签，该值是词库ID</p>
    */
    @SerializedName("AtomicId")
    @Expose
    private String AtomicId;

    /**
    * <p>该命中片段在原文中的位置列表，由于文本片段在原文中可能不连续，它可能是有多段位置信息</p>
    */
    @SerializedName("Positions")
    @Expose
    private HitPosition [] Positions;

    /**
     * Get <p>命中的文本片段（明文），已还原到预处理前的原文，注意该字段内容在原文中可能不连续，需要结合HitSnippetInfos[].Positions来还原出所在原文位置</p> 
     * @return Snippet <p>命中的文本片段（明文），已还原到预处理前的原文，注意该字段内容在原文中可能不连续，需要结合HitSnippetInfos[].Positions来还原出所在原文位置</p>
     */
    public String getSnippet() {
        return this.Snippet;
    }

    /**
     * Set <p>命中的文本片段（明文），已还原到预处理前的原文，注意该字段内容在原文中可能不连续，需要结合HitSnippetInfos[].Positions来还原出所在原文位置</p>
     * @param Snippet <p>命中的文本片段（明文），已还原到预处理前的原文，注意该字段内容在原文中可能不连续，需要结合HitSnippetInfos[].Positions来还原出所在原文位置</p>
     */
    public void setSnippet(String Snippet) {
        this.Snippet = Snippet;
    }

    /**
     * Get <p>原子能力类型，如果是业务自定义库命中，会给出词库名称</p> 
     * @return AtomicName <p>原子能力类型，如果是业务自定义库命中，会给出词库名称</p>
     */
    public String getAtomicName() {
        return this.AtomicName;
    }

    /**
     * Set <p>原子能力类型，如果是业务自定义库命中，会给出词库名称</p>
     * @param AtomicName <p>原子能力类型，如果是业务自定义库命中，会给出词库名称</p>
     */
    public void setAtomicName(String AtomicName) {
        this.AtomicName = AtomicName;
    }

    /**
     * Get <p>原子能力ID，如果是业务自定义库导致命中本次审核标签，该值是词库ID</p> 
     * @return AtomicId <p>原子能力ID，如果是业务自定义库导致命中本次审核标签，该值是词库ID</p>
     */
    public String getAtomicId() {
        return this.AtomicId;
    }

    /**
     * Set <p>原子能力ID，如果是业务自定义库导致命中本次审核标签，该值是词库ID</p>
     * @param AtomicId <p>原子能力ID，如果是业务自定义库导致命中本次审核标签，该值是词库ID</p>
     */
    public void setAtomicId(String AtomicId) {
        this.AtomicId = AtomicId;
    }

    /**
     * Get <p>该命中片段在原文中的位置列表，由于文本片段在原文中可能不连续，它可能是有多段位置信息</p> 
     * @return Positions <p>该命中片段在原文中的位置列表，由于文本片段在原文中可能不连续，它可能是有多段位置信息</p>
     */
    public HitPosition [] getPositions() {
        return this.Positions;
    }

    /**
     * Set <p>该命中片段在原文中的位置列表，由于文本片段在原文中可能不连续，它可能是有多段位置信息</p>
     * @param Positions <p>该命中片段在原文中的位置列表，由于文本片段在原文中可能不连续，它可能是有多段位置信息</p>
     */
    public void setPositions(HitPosition [] Positions) {
        this.Positions = Positions;
    }

    public HitSnippetInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HitSnippetInfo(HitSnippetInfo source) {
        if (source.Snippet != null) {
            this.Snippet = new String(source.Snippet);
        }
        if (source.AtomicName != null) {
            this.AtomicName = new String(source.AtomicName);
        }
        if (source.AtomicId != null) {
            this.AtomicId = new String(source.AtomicId);
        }
        if (source.Positions != null) {
            this.Positions = new HitPosition[source.Positions.length];
            for (int i = 0; i < source.Positions.length; i++) {
                this.Positions[i] = new HitPosition(source.Positions[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Snippet", this.Snippet);
        this.setParamSimple(map, prefix + "AtomicName", this.AtomicName);
        this.setParamSimple(map, prefix + "AtomicId", this.AtomicId);
        this.setParamArrayObj(map, prefix + "Positions.", this.Positions);

    }
}

