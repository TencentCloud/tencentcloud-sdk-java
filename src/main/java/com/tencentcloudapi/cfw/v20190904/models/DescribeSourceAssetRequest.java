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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSourceAssetRequest extends AbstractModel{

    /**
    * 模糊查询
    */
    @SerializedName("FuzzySearch")
    @Expose
    private String FuzzySearch;

    /**
    * 资产类型 1公网 2内网
    */
    @SerializedName("InsType")
    @Expose
    private String InsType;

    /**
    * ChooseType为1，查询已经分组的资产；ChooseType不为1查询没有分组的资产
    */
    @SerializedName("ChooseType")
    @Expose
    private String ChooseType;

    /**
    * 地域
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 查询单页的最大值；eg：10；则最多返回10条结果
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 查询结果的偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get 模糊查询 
     * @return FuzzySearch 模糊查询
     */
    public String getFuzzySearch() {
        return this.FuzzySearch;
    }

    /**
     * Set 模糊查询
     * @param FuzzySearch 模糊查询
     */
    public void setFuzzySearch(String FuzzySearch) {
        this.FuzzySearch = FuzzySearch;
    }

    /**
     * Get 资产类型 1公网 2内网 
     * @return InsType 资产类型 1公网 2内网
     */
    public String getInsType() {
        return this.InsType;
    }

    /**
     * Set 资产类型 1公网 2内网
     * @param InsType 资产类型 1公网 2内网
     */
    public void setInsType(String InsType) {
        this.InsType = InsType;
    }

    /**
     * Get ChooseType为1，查询已经分组的资产；ChooseType不为1查询没有分组的资产 
     * @return ChooseType ChooseType为1，查询已经分组的资产；ChooseType不为1查询没有分组的资产
     */
    public String getChooseType() {
        return this.ChooseType;
    }

    /**
     * Set ChooseType为1，查询已经分组的资产；ChooseType不为1查询没有分组的资产
     * @param ChooseType ChooseType为1，查询已经分组的资产；ChooseType不为1查询没有分组的资产
     */
    public void setChooseType(String ChooseType) {
        this.ChooseType = ChooseType;
    }

    /**
     * Get 地域 
     * @return Zone 地域
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 地域
     * @param Zone 地域
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 查询单页的最大值；eg：10；则最多返回10条结果 
     * @return Limit 查询单页的最大值；eg：10；则最多返回10条结果
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 查询单页的最大值；eg：10；则最多返回10条结果
     * @param Limit 查询单页的最大值；eg：10；则最多返回10条结果
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 查询结果的偏移量 
     * @return Offset 查询结果的偏移量
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 查询结果的偏移量
     * @param Offset 查询结果的偏移量
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public DescribeSourceAssetRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSourceAssetRequest(DescribeSourceAssetRequest source) {
        if (source.FuzzySearch != null) {
            this.FuzzySearch = new String(source.FuzzySearch);
        }
        if (source.InsType != null) {
            this.InsType = new String(source.InsType);
        }
        if (source.ChooseType != null) {
            this.ChooseType = new String(source.ChooseType);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FuzzySearch", this.FuzzySearch);
        this.setParamSimple(map, prefix + "InsType", this.InsType);
        this.setParamSimple(map, prefix + "ChooseType", this.ChooseType);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

