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

public class KBModifyExtendFields extends AbstractModel {

    /**
    * <p>扩展操作：1=触发恢复超量<table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>KB_EXTENDED_ACTION_UNKNOWN</td><td>0</td><td></td></tr><tr><td>KB_EXTENDED_ACTION_RESUME_EXCEEDED</td><td>1</td><td>触发恢复超量（将知识库从超量状态恢复为正常状态）</td></tr></tbody></table></p>
    */
    @SerializedName("Action")
    @Expose
    private Long Action;

    /**
     * Get <p>扩展操作：1=触发恢复超量<table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>KB_EXTENDED_ACTION_UNKNOWN</td><td>0</td><td></td></tr><tr><td>KB_EXTENDED_ACTION_RESUME_EXCEEDED</td><td>1</td><td>触发恢复超量（将知识库从超量状态恢复为正常状态）</td></tr></tbody></table></p> 
     * @return Action <p>扩展操作：1=触发恢复超量<table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>KB_EXTENDED_ACTION_UNKNOWN</td><td>0</td><td></td></tr><tr><td>KB_EXTENDED_ACTION_RESUME_EXCEEDED</td><td>1</td><td>触发恢复超量（将知识库从超量状态恢复为正常状态）</td></tr></tbody></table></p>
     */
    public Long getAction() {
        return this.Action;
    }

    /**
     * Set <p>扩展操作：1=触发恢复超量<table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>KB_EXTENDED_ACTION_UNKNOWN</td><td>0</td><td></td></tr><tr><td>KB_EXTENDED_ACTION_RESUME_EXCEEDED</td><td>1</td><td>触发恢复超量（将知识库从超量状态恢复为正常状态）</td></tr></tbody></table></p>
     * @param Action <p>扩展操作：1=触发恢复超量<table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>KB_EXTENDED_ACTION_UNKNOWN</td><td>0</td><td></td></tr><tr><td>KB_EXTENDED_ACTION_RESUME_EXCEEDED</td><td>1</td><td>触发恢复超量（将知识库从超量状态恢复为正常状态）</td></tr></tbody></table></p>
     */
    public void setAction(Long Action) {
        this.Action = Action;
    }

    public KBModifyExtendFields() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KBModifyExtendFields(KBModifyExtendFields source) {
        if (source.Action != null) {
            this.Action = new Long(source.Action);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Action", this.Action);

    }
}

