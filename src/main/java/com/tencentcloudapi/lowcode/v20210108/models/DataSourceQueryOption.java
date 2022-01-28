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
package com.tencentcloudapi.lowcode.v20210108.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DataSourceQueryOption extends AbstractModel{

    /**
    * 数据源标识模糊匹配
    */
    @SerializedName("LikeName")
    @Expose
    private String LikeName;

    /**
    * 数据源名称模糊匹配
    */
    @SerializedName("LikeTitle")
    @Expose
    private String LikeTitle;

    /**
     * Get 数据源标识模糊匹配 
     * @return LikeName 数据源标识模糊匹配
     */
    public String getLikeName() {
        return this.LikeName;
    }

    /**
     * Set 数据源标识模糊匹配
     * @param LikeName 数据源标识模糊匹配
     */
    public void setLikeName(String LikeName) {
        this.LikeName = LikeName;
    }

    /**
     * Get 数据源名称模糊匹配 
     * @return LikeTitle 数据源名称模糊匹配
     */
    public String getLikeTitle() {
        return this.LikeTitle;
    }

    /**
     * Set 数据源名称模糊匹配
     * @param LikeTitle 数据源名称模糊匹配
     */
    public void setLikeTitle(String LikeTitle) {
        this.LikeTitle = LikeTitle;
    }

    public DataSourceQueryOption() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DataSourceQueryOption(DataSourceQueryOption source) {
        if (source.LikeName != null) {
            this.LikeName = new String(source.LikeName);
        }
        if (source.LikeTitle != null) {
            this.LikeTitle = new String(source.LikeTitle);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LikeName", this.LikeName);
        this.setParamSimple(map, prefix + "LikeTitle", this.LikeTitle);

    }
}

