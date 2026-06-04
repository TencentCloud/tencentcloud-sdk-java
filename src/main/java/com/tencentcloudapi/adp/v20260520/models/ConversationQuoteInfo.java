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

public class ConversationQuoteInfo extends AbstractModel {

    /**
    * <p>参考来源的索引值</p>
    */
    @SerializedName("Index")
    @Expose
    private Long Index;

    /**
    * <p>参考来源位置</p>
    */
    @SerializedName("Position")
    @Expose
    private Long Position;

    /**
     * Get <p>参考来源的索引值</p> 
     * @return Index <p>参考来源的索引值</p>
     */
    public Long getIndex() {
        return this.Index;
    }

    /**
     * Set <p>参考来源的索引值</p>
     * @param Index <p>参考来源的索引值</p>
     */
    public void setIndex(Long Index) {
        this.Index = Index;
    }

    /**
     * Get <p>参考来源位置</p> 
     * @return Position <p>参考来源位置</p>
     */
    public Long getPosition() {
        return this.Position;
    }

    /**
     * Set <p>参考来源位置</p>
     * @param Position <p>参考来源位置</p>
     */
    public void setPosition(Long Position) {
        this.Position = Position;
    }

    public ConversationQuoteInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConversationQuoteInfo(ConversationQuoteInfo source) {
        if (source.Index != null) {
            this.Index = new Long(source.Index);
        }
        if (source.Position != null) {
            this.Position = new Long(source.Position);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Index", this.Index);
        this.setParamSimple(map, prefix + "Position", this.Position);

    }
}

