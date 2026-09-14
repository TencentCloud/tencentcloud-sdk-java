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

public class QASegmentHighlight extends AbstractModel {

    /**
    * <p>高亮结束位置</p>
    */
    @SerializedName("EndPos")
    @Expose
    private String EndPos;

    /**
    * <p>高亮起始位置</p>
    */
    @SerializedName("StartPos")
    @Expose
    private String StartPos;

    /**
     * Get <p>高亮结束位置</p> 
     * @return EndPos <p>高亮结束位置</p>
     */
    public String getEndPos() {
        return this.EndPos;
    }

    /**
     * Set <p>高亮结束位置</p>
     * @param EndPos <p>高亮结束位置</p>
     */
    public void setEndPos(String EndPos) {
        this.EndPos = EndPos;
    }

    /**
     * Get <p>高亮起始位置</p> 
     * @return StartPos <p>高亮起始位置</p>
     */
    public String getStartPos() {
        return this.StartPos;
    }

    /**
     * Set <p>高亮起始位置</p>
     * @param StartPos <p>高亮起始位置</p>
     */
    public void setStartPos(String StartPos) {
        this.StartPos = StartPos;
    }

    public QASegmentHighlight() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QASegmentHighlight(QASegmentHighlight source) {
        if (source.EndPos != null) {
            this.EndPos = new String(source.EndPos);
        }
        if (source.StartPos != null) {
            this.StartPos = new String(source.StartPos);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EndPos", this.EndPos);
        this.setParamSimple(map, prefix + "StartPos", this.StartPos);

    }
}

