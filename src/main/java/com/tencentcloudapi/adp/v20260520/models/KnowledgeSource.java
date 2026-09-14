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

public class KnowledgeSource extends AbstractModel {

    /**
    * <p>是否为大数据</p>
    */
    @SerializedName("IsBigData")
    @Expose
    private Boolean IsBigData;

    /**
    * <p>是否为共享知识库</p>
    */
    @SerializedName("IsShared")
    @Expose
    private Boolean IsShared;

    /**
    * <p>知识库名</p>
    */
    @SerializedName("KbName")
    @Expose
    private String KbName;

    /**
     * Get <p>是否为大数据</p> 
     * @return IsBigData <p>是否为大数据</p>
     */
    public Boolean getIsBigData() {
        return this.IsBigData;
    }

    /**
     * Set <p>是否为大数据</p>
     * @param IsBigData <p>是否为大数据</p>
     */
    public void setIsBigData(Boolean IsBigData) {
        this.IsBigData = IsBigData;
    }

    /**
     * Get <p>是否为共享知识库</p> 
     * @return IsShared <p>是否为共享知识库</p>
     */
    public Boolean getIsShared() {
        return this.IsShared;
    }

    /**
     * Set <p>是否为共享知识库</p>
     * @param IsShared <p>是否为共享知识库</p>
     */
    public void setIsShared(Boolean IsShared) {
        this.IsShared = IsShared;
    }

    /**
     * Get <p>知识库名</p> 
     * @return KbName <p>知识库名</p>
     */
    public String getKbName() {
        return this.KbName;
    }

    /**
     * Set <p>知识库名</p>
     * @param KbName <p>知识库名</p>
     */
    public void setKbName(String KbName) {
        this.KbName = KbName;
    }

    public KnowledgeSource() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KnowledgeSource(KnowledgeSource source) {
        if (source.IsBigData != null) {
            this.IsBigData = new Boolean(source.IsBigData);
        }
        if (source.IsShared != null) {
            this.IsShared = new Boolean(source.IsShared);
        }
        if (source.KbName != null) {
            this.KbName = new String(source.KbName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IsBigData", this.IsBigData);
        this.setParamSimple(map, prefix + "IsShared", this.IsShared);
        this.setParamSimple(map, prefix + "KbName", this.KbName);

    }
}

