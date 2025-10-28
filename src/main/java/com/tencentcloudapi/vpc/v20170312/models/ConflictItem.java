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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ConflictItem extends AbstractModel {

    /**
    * 冲突资源的ID。已废弃
    */
    @SerializedName("ConfilctId")
    @Expose
    private String ConfilctId;

    /**
    * 冲突目的资源
    */
    @SerializedName("DestinationItem")
    @Expose
    private String DestinationItem;

    /**
    * 冲突资源的ID
    */
    @SerializedName("ConflictId")
    @Expose
    private String ConflictId;

    /**
     * Get 冲突资源的ID。已废弃 
     * @return ConfilctId 冲突资源的ID。已废弃
     * @deprecated
     */
    @Deprecated
    public String getConfilctId() {
        return this.ConfilctId;
    }

    /**
     * Set 冲突资源的ID。已废弃
     * @param ConfilctId 冲突资源的ID。已废弃
     * @deprecated
     */
    @Deprecated
    public void setConfilctId(String ConfilctId) {
        this.ConfilctId = ConfilctId;
    }

    /**
     * Get 冲突目的资源 
     * @return DestinationItem 冲突目的资源
     */
    public String getDestinationItem() {
        return this.DestinationItem;
    }

    /**
     * Set 冲突目的资源
     * @param DestinationItem 冲突目的资源
     */
    public void setDestinationItem(String DestinationItem) {
        this.DestinationItem = DestinationItem;
    }

    /**
     * Get 冲突资源的ID 
     * @return ConflictId 冲突资源的ID
     */
    public String getConflictId() {
        return this.ConflictId;
    }

    /**
     * Set 冲突资源的ID
     * @param ConflictId 冲突资源的ID
     */
    public void setConflictId(String ConflictId) {
        this.ConflictId = ConflictId;
    }

    public ConflictItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConflictItem(ConflictItem source) {
        if (source.ConfilctId != null) {
            this.ConfilctId = new String(source.ConfilctId);
        }
        if (source.DestinationItem != null) {
            this.DestinationItem = new String(source.DestinationItem);
        }
        if (source.ConflictId != null) {
            this.ConflictId = new String(source.ConflictId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ConfilctId", this.ConfilctId);
        this.setParamSimple(map, prefix + "DestinationItem", this.DestinationItem);
        this.setParamSimple(map, prefix + "ConflictId", this.ConflictId);

    }
}

