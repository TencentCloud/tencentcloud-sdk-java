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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AiQualityControlTaskInput extends AbstractModel {

    /**
    * 媒体质检模板 ID 。
可以直接使用预设模板，也可以在控制台自定义模板。预设模板如下：
- 10：开启所有质检项；
- 20：仅开启格式诊断对应质检项；
- 30：仅开启无参考打分对应质检项；
- 40：仅开启画面质量对应质检项。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * 渠道扩展参数json序列化字符串。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ChannelExtPara")
    @Expose
    private String ChannelExtPara;

    /**
     * Get 媒体质检模板 ID 。
可以直接使用预设模板，也可以在控制台自定义模板。预设模板如下：
- 10：开启所有质检项；
- 20：仅开启格式诊断对应质检项；
- 30：仅开启无参考打分对应质检项；
- 40：仅开启画面质量对应质检项。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Definition 媒体质检模板 ID 。
可以直接使用预设模板，也可以在控制台自定义模板。预设模板如下：
- 10：开启所有质检项；
- 20：仅开启格式诊断对应质检项；
- 30：仅开启无参考打分对应质检项；
- 40：仅开启画面质量对应质检项。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set 媒体质检模板 ID 。
可以直接使用预设模板，也可以在控制台自定义模板。预设模板如下：
- 10：开启所有质检项；
- 20：仅开启格式诊断对应质检项；
- 30：仅开启无参考打分对应质检项；
- 40：仅开启画面质量对应质检项。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Definition 媒体质检模板 ID 。
可以直接使用预设模板，也可以在控制台自定义模板。预设模板如下：
- 10：开启所有质检项；
- 20：仅开启格式诊断对应质检项；
- 30：仅开启无参考打分对应质检项；
- 40：仅开启画面质量对应质检项。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get 渠道扩展参数json序列化字符串。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ChannelExtPara 渠道扩展参数json序列化字符串。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getChannelExtPara() {
        return this.ChannelExtPara;
    }

    /**
     * Set 渠道扩展参数json序列化字符串。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ChannelExtPara 渠道扩展参数json序列化字符串。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setChannelExtPara(String ChannelExtPara) {
        this.ChannelExtPara = ChannelExtPara;
    }

    public AiQualityControlTaskInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AiQualityControlTaskInput(AiQualityControlTaskInput source) {
        if (source.Definition != null) {
            this.Definition = new Long(source.Definition);
        }
        if (source.ChannelExtPara != null) {
            this.ChannelExtPara = new String(source.ChannelExtPara);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamSimple(map, prefix + "ChannelExtPara", this.ChannelExtPara);

    }
}

