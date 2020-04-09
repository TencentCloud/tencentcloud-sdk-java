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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ConflictSource extends AbstractModel{

    /**
    * 冲突资源ID
    */
    @SerializedName("ConflictSourceId")
    @Expose
    private String ConflictSourceId;

    /**
    * 冲突资源
    */
    @SerializedName("SourceItem")
    @Expose
    private String SourceItem;

    /**
    * 冲突资源条目信息
    */
    @SerializedName("ConflictItemSet")
    @Expose
    private ConflictItem [] ConflictItemSet;

    /**
     * Get 冲突资源ID 
     * @return ConflictSourceId 冲突资源ID
     */
    public String getConflictSourceId() {
        return this.ConflictSourceId;
    }

    /**
     * Set 冲突资源ID
     * @param ConflictSourceId 冲突资源ID
     */
    public void setConflictSourceId(String ConflictSourceId) {
        this.ConflictSourceId = ConflictSourceId;
    }

    /**
     * Get 冲突资源 
     * @return SourceItem 冲突资源
     */
    public String getSourceItem() {
        return this.SourceItem;
    }

    /**
     * Set 冲突资源
     * @param SourceItem 冲突资源
     */
    public void setSourceItem(String SourceItem) {
        this.SourceItem = SourceItem;
    }

    /**
     * Get 冲突资源条目信息 
     * @return ConflictItemSet 冲突资源条目信息
     */
    public ConflictItem [] getConflictItemSet() {
        return this.ConflictItemSet;
    }

    /**
     * Set 冲突资源条目信息
     * @param ConflictItemSet 冲突资源条目信息
     */
    public void setConflictItemSet(ConflictItem [] ConflictItemSet) {
        this.ConflictItemSet = ConflictItemSet;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ConflictSourceId", this.ConflictSourceId);
        this.setParamSimple(map, prefix + "SourceItem", this.SourceItem);
        this.setParamArrayObj(map, prefix + "ConflictItemSet.", this.ConflictItemSet);

    }
}

