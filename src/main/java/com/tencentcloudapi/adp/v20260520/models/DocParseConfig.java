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

public class DocParseConfig extends AbstractModel {

    /**
    * <p>内容过滤配置</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ContentFilter")
    @Expose
    private ContentFilter ContentFilter;

    /**
    * <p>分割规则</p>
    */
    @SerializedName("SplitRule")
    @Expose
    private String SplitRule;

    /**
     * Get <p>内容过滤配置</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ContentFilter <p>内容过滤配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ContentFilter getContentFilter() {
        return this.ContentFilter;
    }

    /**
     * Set <p>内容过滤配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ContentFilter <p>内容过滤配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContentFilter(ContentFilter ContentFilter) {
        this.ContentFilter = ContentFilter;
    }

    /**
     * Get <p>分割规则</p> 
     * @return SplitRule <p>分割规则</p>
     */
    public String getSplitRule() {
        return this.SplitRule;
    }

    /**
     * Set <p>分割规则</p>
     * @param SplitRule <p>分割规则</p>
     */
    public void setSplitRule(String SplitRule) {
        this.SplitRule = SplitRule;
    }

    public DocParseConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DocParseConfig(DocParseConfig source) {
        if (source.ContentFilter != null) {
            this.ContentFilter = new ContentFilter(source.ContentFilter);
        }
        if (source.SplitRule != null) {
            this.SplitRule = new String(source.SplitRule);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "ContentFilter.", this.ContentFilter);
        this.setParamSimple(map, prefix + "SplitRule", this.SplitRule);

    }
}

