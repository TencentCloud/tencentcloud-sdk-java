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
package com.tencentcloudapi.cme.v20191029.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MaterialStatus extends AbstractModel{

    /**
    * 素材编辑可用状态，取值有：
<li>NORMAL：正常，可直接用于编辑；</li>
<li>ABNORMAL : 异常，不可用于编辑；</li>
<li>PROCESSING：处理中，暂不可用于编辑。</li>
    */
    @SerializedName("EditorUsableStatus")
    @Expose
    private String EditorUsableStatus;

    /**
     * Get 素材编辑可用状态，取值有：
<li>NORMAL：正常，可直接用于编辑；</li>
<li>ABNORMAL : 异常，不可用于编辑；</li>
<li>PROCESSING：处理中，暂不可用于编辑。</li> 
     * @return EditorUsableStatus 素材编辑可用状态，取值有：
<li>NORMAL：正常，可直接用于编辑；</li>
<li>ABNORMAL : 异常，不可用于编辑；</li>
<li>PROCESSING：处理中，暂不可用于编辑。</li>
     */
    public String getEditorUsableStatus() {
        return this.EditorUsableStatus;
    }

    /**
     * Set 素材编辑可用状态，取值有：
<li>NORMAL：正常，可直接用于编辑；</li>
<li>ABNORMAL : 异常，不可用于编辑；</li>
<li>PROCESSING：处理中，暂不可用于编辑。</li>
     * @param EditorUsableStatus 素材编辑可用状态，取值有：
<li>NORMAL：正常，可直接用于编辑；</li>
<li>ABNORMAL : 异常，不可用于编辑；</li>
<li>PROCESSING：处理中，暂不可用于编辑。</li>
     */
    public void setEditorUsableStatus(String EditorUsableStatus) {
        this.EditorUsableStatus = EditorUsableStatus;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EditorUsableStatus", this.EditorUsableStatus);

    }
}

