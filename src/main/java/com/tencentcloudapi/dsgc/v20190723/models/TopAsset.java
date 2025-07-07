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
package com.tencentcloudapi.dsgc.v20190723.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TopAsset extends AbstractModel {

    /**
    * 分级名称
    */
    @SerializedName("LevelName")
    @Expose
    private String LevelName;

    /**
    * top数据信息
    */
    @SerializedName("TopStat")
    @Expose
    private TopAssetStat [] TopStat;

    /**
     * Get 分级名称 
     * @return LevelName 分级名称
     */
    public String getLevelName() {
        return this.LevelName;
    }

    /**
     * Set 分级名称
     * @param LevelName 分级名称
     */
    public void setLevelName(String LevelName) {
        this.LevelName = LevelName;
    }

    /**
     * Get top数据信息 
     * @return TopStat top数据信息
     */
    public TopAssetStat [] getTopStat() {
        return this.TopStat;
    }

    /**
     * Set top数据信息
     * @param TopStat top数据信息
     */
    public void setTopStat(TopAssetStat [] TopStat) {
        this.TopStat = TopStat;
    }

    public TopAsset() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TopAsset(TopAsset source) {
        if (source.LevelName != null) {
            this.LevelName = new String(source.LevelName);
        }
        if (source.TopStat != null) {
            this.TopStat = new TopAssetStat[source.TopStat.length];
            for (int i = 0; i < source.TopStat.length; i++) {
                this.TopStat[i] = new TopAssetStat(source.TopStat[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LevelName", this.LevelName);
        this.setParamArrayObj(map, prefix + "TopStat.", this.TopStat);

    }
}

