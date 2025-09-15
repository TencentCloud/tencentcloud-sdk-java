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
package com.tencentcloudapi.lowcode.v20210108.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAppsRequest extends AbstractModel {

    /**
    * 分页每页个数
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 分页Offset
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 环境id
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

    /**
    * 搜索关键词
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
    * 应用id
    */
    @SerializedName("AppIds")
    @Expose
    private String [] AppIds;

    /**
    * 来源类型
    */
    @SerializedName("Channel")
    @Expose
    private String Channel;

    /**
    * 1-自定义应用；2-模型应用
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 应用是否收藏
    */
    @SerializedName("Favorite")
    @Expose
    private Boolean Favorite;

    /**
     * Get 分页每页个数 
     * @return Limit 分页每页个数
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页每页个数
     * @param Limit 分页每页个数
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 分页Offset 
     * @return Offset 分页Offset
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页Offset
     * @param Offset 分页Offset
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 环境id 
     * @return EnvId 环境id
     */
    public String getEnvId() {
        return this.EnvId;
    }

    /**
     * Set 环境id
     * @param EnvId 环境id
     */
    public void setEnvId(String EnvId) {
        this.EnvId = EnvId;
    }

    /**
     * Get 搜索关键词 
     * @return Keyword 搜索关键词
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set 搜索关键词
     * @param Keyword 搜索关键词
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    /**
     * Get 应用id 
     * @return AppIds 应用id
     */
    public String [] getAppIds() {
        return this.AppIds;
    }

    /**
     * Set 应用id
     * @param AppIds 应用id
     */
    public void setAppIds(String [] AppIds) {
        this.AppIds = AppIds;
    }

    /**
     * Get 来源类型 
     * @return Channel 来源类型
     */
    public String getChannel() {
        return this.Channel;
    }

    /**
     * Set 来源类型
     * @param Channel 来源类型
     */
    public void setChannel(String Channel) {
        this.Channel = Channel;
    }

    /**
     * Get 1-自定义应用；2-模型应用 
     * @return Type 1-自定义应用；2-模型应用
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 1-自定义应用；2-模型应用
     * @param Type 1-自定义应用；2-模型应用
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 应用是否收藏 
     * @return Favorite 应用是否收藏
     */
    public Boolean getFavorite() {
        return this.Favorite;
    }

    /**
     * Set 应用是否收藏
     * @param Favorite 应用是否收藏
     */
    public void setFavorite(Boolean Favorite) {
        this.Favorite = Favorite;
    }

    public DescribeAppsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAppsRequest(DescribeAppsRequest source) {
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.EnvId != null) {
            this.EnvId = new String(source.EnvId);
        }
        if (source.Keyword != null) {
            this.Keyword = new String(source.Keyword);
        }
        if (source.AppIds != null) {
            this.AppIds = new String[source.AppIds.length];
            for (int i = 0; i < source.AppIds.length; i++) {
                this.AppIds[i] = new String(source.AppIds[i]);
            }
        }
        if (source.Channel != null) {
            this.Channel = new String(source.Channel);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.Favorite != null) {
            this.Favorite = new Boolean(source.Favorite);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "EnvId", this.EnvId);
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);
        this.setParamArraySimple(map, prefix + "AppIds.", this.AppIds);
        this.setParamSimple(map, prefix + "Channel", this.Channel);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Favorite", this.Favorite);

    }
}

