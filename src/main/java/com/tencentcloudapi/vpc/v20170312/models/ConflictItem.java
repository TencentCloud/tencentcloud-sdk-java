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

public class ConflictItem extends AbstractModel{

    /**
    * 冲突资源的ID
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
     * Get 冲突资源的ID 
     * @return ConfilctId 冲突资源的ID
     */
    public String getConfilctId() {
        return this.ConfilctId;
    }

    /**
     * Set 冲突资源的ID
     * @param ConfilctId 冲突资源的ID
     */
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
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ConfilctId", this.ConfilctId);
        this.setParamSimple(map, prefix + "DestinationItem", this.DestinationItem);

    }
}

