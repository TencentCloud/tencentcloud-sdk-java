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
package com.tencentcloudapi.ame.v20190916.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeItemByIdRequest extends AbstractModel{

    /**
    * 歌曲ID，目前暂不支持批量查询
    */
    @SerializedName("ItemIDs")
    @Expose
    private String ItemIDs;

    /**
     * Get 歌曲ID，目前暂不支持批量查询 
     * @return ItemIDs 歌曲ID，目前暂不支持批量查询
     */
    public String getItemIDs() {
        return this.ItemIDs;
    }

    /**
     * Set 歌曲ID，目前暂不支持批量查询
     * @param ItemIDs 歌曲ID，目前暂不支持批量查询
     */
    public void setItemIDs(String ItemIDs) {
        this.ItemIDs = ItemIDs;
    }

    public DescribeItemByIdRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeItemByIdRequest(DescribeItemByIdRequest source) {
        if (source.ItemIDs != null) {
            this.ItemIDs = new String(source.ItemIDs);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ItemIDs", this.ItemIDs);

    }
}

