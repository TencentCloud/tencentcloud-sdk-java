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

public class DescribeKTVSingerCategoriesResponse extends AbstractModel{

    /**
    * 歌手性别分类列表
    */
    @SerializedName("GenderSet")
    @Expose
    private KTVSingerCategoryInfo [] GenderSet;

    /**
    * 歌手区域分类列表
    */
    @SerializedName("AreaSet")
    @Expose
    private KTVSingerCategoryInfo [] AreaSet;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 歌手性别分类列表 
     * @return GenderSet 歌手性别分类列表
     */
    public KTVSingerCategoryInfo [] getGenderSet() {
        return this.GenderSet;
    }

    /**
     * Set 歌手性别分类列表
     * @param GenderSet 歌手性别分类列表
     */
    public void setGenderSet(KTVSingerCategoryInfo [] GenderSet) {
        this.GenderSet = GenderSet;
    }

    /**
     * Get 歌手区域分类列表 
     * @return AreaSet 歌手区域分类列表
     */
    public KTVSingerCategoryInfo [] getAreaSet() {
        return this.AreaSet;
    }

    /**
     * Set 歌手区域分类列表
     * @param AreaSet 歌手区域分类列表
     */
    public void setAreaSet(KTVSingerCategoryInfo [] AreaSet) {
        this.AreaSet = AreaSet;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeKTVSingerCategoriesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeKTVSingerCategoriesResponse(DescribeKTVSingerCategoriesResponse source) {
        if (source.GenderSet != null) {
            this.GenderSet = new KTVSingerCategoryInfo[source.GenderSet.length];
            for (int i = 0; i < source.GenderSet.length; i++) {
                this.GenderSet[i] = new KTVSingerCategoryInfo(source.GenderSet[i]);
            }
        }
        if (source.AreaSet != null) {
            this.AreaSet = new KTVSingerCategoryInfo[source.AreaSet.length];
            for (int i = 0; i < source.AreaSet.length; i++) {
                this.AreaSet[i] = new KTVSingerCategoryInfo(source.AreaSet[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "GenderSet.", this.GenderSet);
        this.setParamArrayObj(map, prefix + "AreaSet.", this.AreaSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

