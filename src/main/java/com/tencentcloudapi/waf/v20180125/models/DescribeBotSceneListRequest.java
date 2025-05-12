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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBotSceneListRequest extends AbstractModel {

    /**
    * 域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 每页数量
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 页码
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 场景模板类型，通过此下拉字段进行场景筛选。全部: all 登录: login  秒杀:seckill  爬内容：crawl 自定义: custom
    */
    @SerializedName("BusinessType")
    @Expose
    private String [] BusinessType;

    /**
    * 通过场景名称模糊搜索
    */
    @SerializedName("SceneName")
    @Expose
    private String SceneName;

    /**
    * 是否只显示默认场景
    */
    @SerializedName("IsDefault")
    @Expose
    private Boolean IsDefault;

    /**
    * 是否仅显示生效场景
    */
    @SerializedName("IsValid")
    @Expose
    private Boolean IsValid;

    /**
    * 要查询的场景id
    */
    @SerializedName("SceneId")
    @Expose
    private String SceneId;

    /**
     * Get 域名 
     * @return Domain 域名
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 域名
     * @param Domain 域名
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 每页数量 
     * @return Limit 每页数量
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 每页数量
     * @param Limit 每页数量
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 页码 
     * @return Offset 页码
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 页码
     * @param Offset 页码
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 场景模板类型，通过此下拉字段进行场景筛选。全部: all 登录: login  秒杀:seckill  爬内容：crawl 自定义: custom 
     * @return BusinessType 场景模板类型，通过此下拉字段进行场景筛选。全部: all 登录: login  秒杀:seckill  爬内容：crawl 自定义: custom
     */
    public String [] getBusinessType() {
        return this.BusinessType;
    }

    /**
     * Set 场景模板类型，通过此下拉字段进行场景筛选。全部: all 登录: login  秒杀:seckill  爬内容：crawl 自定义: custom
     * @param BusinessType 场景模板类型，通过此下拉字段进行场景筛选。全部: all 登录: login  秒杀:seckill  爬内容：crawl 自定义: custom
     */
    public void setBusinessType(String [] BusinessType) {
        this.BusinessType = BusinessType;
    }

    /**
     * Get 通过场景名称模糊搜索 
     * @return SceneName 通过场景名称模糊搜索
     */
    public String getSceneName() {
        return this.SceneName;
    }

    /**
     * Set 通过场景名称模糊搜索
     * @param SceneName 通过场景名称模糊搜索
     */
    public void setSceneName(String SceneName) {
        this.SceneName = SceneName;
    }

    /**
     * Get 是否只显示默认场景 
     * @return IsDefault 是否只显示默认场景
     */
    public Boolean getIsDefault() {
        return this.IsDefault;
    }

    /**
     * Set 是否只显示默认场景
     * @param IsDefault 是否只显示默认场景
     */
    public void setIsDefault(Boolean IsDefault) {
        this.IsDefault = IsDefault;
    }

    /**
     * Get 是否仅显示生效场景 
     * @return IsValid 是否仅显示生效场景
     */
    public Boolean getIsValid() {
        return this.IsValid;
    }

    /**
     * Set 是否仅显示生效场景
     * @param IsValid 是否仅显示生效场景
     */
    public void setIsValid(Boolean IsValid) {
        this.IsValid = IsValid;
    }

    /**
     * Get 要查询的场景id 
     * @return SceneId 要查询的场景id
     */
    public String getSceneId() {
        return this.SceneId;
    }

    /**
     * Set 要查询的场景id
     * @param SceneId 要查询的场景id
     */
    public void setSceneId(String SceneId) {
        this.SceneId = SceneId;
    }

    public DescribeBotSceneListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBotSceneListRequest(DescribeBotSceneListRequest source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.BusinessType != null) {
            this.BusinessType = new String[source.BusinessType.length];
            for (int i = 0; i < source.BusinessType.length; i++) {
                this.BusinessType[i] = new String(source.BusinessType[i]);
            }
        }
        if (source.SceneName != null) {
            this.SceneName = new String(source.SceneName);
        }
        if (source.IsDefault != null) {
            this.IsDefault = new Boolean(source.IsDefault);
        }
        if (source.IsValid != null) {
            this.IsValid = new Boolean(source.IsValid);
        }
        if (source.SceneId != null) {
            this.SceneId = new String(source.SceneId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamArraySimple(map, prefix + "BusinessType.", this.BusinessType);
        this.setParamSimple(map, prefix + "SceneName", this.SceneName);
        this.setParamSimple(map, prefix + "IsDefault", this.IsDefault);
        this.setParamSimple(map, prefix + "IsValid", this.IsValid);
        this.setParamSimple(map, prefix + "SceneId", this.SceneId);

    }
}

