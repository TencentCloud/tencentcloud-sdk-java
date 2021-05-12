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
package com.tencentcloudapi.zj.v20190121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PaasStrategy extends AbstractModel{

    /**
    * 人群包id
    */
    @SerializedName("CrowdID")
    @Expose
    private Long CrowdID;

    /**
    * 待选素材数组
    */
    @SerializedName("Items")
    @Expose
    private PaasStrategyItem [] Items;

    /**
     * Get 人群包id 
     * @return CrowdID 人群包id
     */
    public Long getCrowdID() {
        return this.CrowdID;
    }

    /**
     * Set 人群包id
     * @param CrowdID 人群包id
     */
    public void setCrowdID(Long CrowdID) {
        this.CrowdID = CrowdID;
    }

    /**
     * Get 待选素材数组 
     * @return Items 待选素材数组
     */
    public PaasStrategyItem [] getItems() {
        return this.Items;
    }

    /**
     * Set 待选素材数组
     * @param Items 待选素材数组
     */
    public void setItems(PaasStrategyItem [] Items) {
        this.Items = Items;
    }

    public PaasStrategy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PaasStrategy(PaasStrategy source) {
        if (source.CrowdID != null) {
            this.CrowdID = new Long(source.CrowdID);
        }
        if (source.Items != null) {
            this.Items = new PaasStrategyItem[source.Items.length];
            for (int i = 0; i < source.Items.length; i++) {
                this.Items[i] = new PaasStrategyItem(source.Items[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CrowdID", this.CrowdID);
        this.setParamArrayObj(map, prefix + "Items.", this.Items);

    }
}

