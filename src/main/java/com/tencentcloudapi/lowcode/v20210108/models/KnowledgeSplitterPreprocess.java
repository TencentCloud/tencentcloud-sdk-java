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
package com.tencentcloudapi.lowcode.v20210108.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class KnowledgeSplitterPreprocess extends AbstractModel {

    /**
    * 在对文件拆分时，配置是否将 Title 追加到切分后的段落后面一并 Embedding。取值如下所示：
false：不追加。
true：将段落 Title 追加到切分后的段落。

注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AppendTitleToChunk")
    @Expose
    private Boolean AppendTitleToChunk;

    /**
    * 在对文件拆分时，配置是否将关键字 keywords 追加到切分后的段落一并 Embedding。取值如下所示：
false：不追加。
true：将全文的 keywords 追加到切分后的段落。

注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AppendKeywordsToChunk")
    @Expose
    private Boolean AppendKeywordsToChunk;

    /**
     * Get 在对文件拆分时，配置是否将 Title 追加到切分后的段落后面一并 Embedding。取值如下所示：
false：不追加。
true：将段落 Title 追加到切分后的段落。

注意：此字段可能返回 null，表示取不到有效值。 
     * @return AppendTitleToChunk 在对文件拆分时，配置是否将 Title 追加到切分后的段落后面一并 Embedding。取值如下所示：
false：不追加。
true：将段落 Title 追加到切分后的段落。

注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getAppendTitleToChunk() {
        return this.AppendTitleToChunk;
    }

    /**
     * Set 在对文件拆分时，配置是否将 Title 追加到切分后的段落后面一并 Embedding。取值如下所示：
false：不追加。
true：将段落 Title 追加到切分后的段落。

注意：此字段可能返回 null，表示取不到有效值。
     * @param AppendTitleToChunk 在对文件拆分时，配置是否将 Title 追加到切分后的段落后面一并 Embedding。取值如下所示：
false：不追加。
true：将段落 Title 追加到切分后的段落。

注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAppendTitleToChunk(Boolean AppendTitleToChunk) {
        this.AppendTitleToChunk = AppendTitleToChunk;
    }

    /**
     * Get 在对文件拆分时，配置是否将关键字 keywords 追加到切分后的段落一并 Embedding。取值如下所示：
false：不追加。
true：将全文的 keywords 追加到切分后的段落。

注意：此字段可能返回 null，表示取不到有效值。 
     * @return AppendKeywordsToChunk 在对文件拆分时，配置是否将关键字 keywords 追加到切分后的段落一并 Embedding。取值如下所示：
false：不追加。
true：将全文的 keywords 追加到切分后的段落。

注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getAppendKeywordsToChunk() {
        return this.AppendKeywordsToChunk;
    }

    /**
     * Set 在对文件拆分时，配置是否将关键字 keywords 追加到切分后的段落一并 Embedding。取值如下所示：
false：不追加。
true：将全文的 keywords 追加到切分后的段落。

注意：此字段可能返回 null，表示取不到有效值。
     * @param AppendKeywordsToChunk 在对文件拆分时，配置是否将关键字 keywords 追加到切分后的段落一并 Embedding。取值如下所示：
false：不追加。
true：将全文的 keywords 追加到切分后的段落。

注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAppendKeywordsToChunk(Boolean AppendKeywordsToChunk) {
        this.AppendKeywordsToChunk = AppendKeywordsToChunk;
    }

    public KnowledgeSplitterPreprocess() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KnowledgeSplitterPreprocess(KnowledgeSplitterPreprocess source) {
        if (source.AppendTitleToChunk != null) {
            this.AppendTitleToChunk = new Boolean(source.AppendTitleToChunk);
        }
        if (source.AppendKeywordsToChunk != null) {
            this.AppendKeywordsToChunk = new Boolean(source.AppendKeywordsToChunk);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppendTitleToChunk", this.AppendTitleToChunk);
        this.setParamSimple(map, prefix + "AppendKeywordsToChunk", this.AppendKeywordsToChunk);

    }
}

