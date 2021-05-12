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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeUnitRulesRequest extends AbstractModel{

    /**
    * 网关实体ID
    */
    @SerializedName("GatewayInstanceId")
    @Expose
    private String GatewayInstanceId;

    /**
    * 根据规则名或备注内容模糊查询
    */
    @SerializedName("SearchWord")
    @Expose
    private String SearchWord;

    /**
    * 启用状态, disabled: 未发布， enabled: 发布
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 翻页查询偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 翻页查询每页记录数
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 网关实体ID 
     * @return GatewayInstanceId 网关实体ID
     */
    public String getGatewayInstanceId() {
        return this.GatewayInstanceId;
    }

    /**
     * Set 网关实体ID
     * @param GatewayInstanceId 网关实体ID
     */
    public void setGatewayInstanceId(String GatewayInstanceId) {
        this.GatewayInstanceId = GatewayInstanceId;
    }

    /**
     * Get 根据规则名或备注内容模糊查询 
     * @return SearchWord 根据规则名或备注内容模糊查询
     */
    public String getSearchWord() {
        return this.SearchWord;
    }

    /**
     * Set 根据规则名或备注内容模糊查询
     * @param SearchWord 根据规则名或备注内容模糊查询
     */
    public void setSearchWord(String SearchWord) {
        this.SearchWord = SearchWord;
    }

    /**
     * Get 启用状态, disabled: 未发布， enabled: 发布 
     * @return Status 启用状态, disabled: 未发布， enabled: 发布
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 启用状态, disabled: 未发布， enabled: 发布
     * @param Status 启用状态, disabled: 未发布， enabled: 发布
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 翻页查询偏移量 
     * @return Offset 翻页查询偏移量
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 翻页查询偏移量
     * @param Offset 翻页查询偏移量
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 翻页查询每页记录数 
     * @return Limit 翻页查询每页记录数
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 翻页查询每页记录数
     * @param Limit 翻页查询每页记录数
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeUnitRulesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeUnitRulesRequest(DescribeUnitRulesRequest source) {
        if (source.GatewayInstanceId != null) {
            this.GatewayInstanceId = new String(source.GatewayInstanceId);
        }
        if (source.SearchWord != null) {
            this.SearchWord = new String(source.SearchWord);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GatewayInstanceId", this.GatewayInstanceId);
        this.setParamSimple(map, prefix + "SearchWord", this.SearchWord);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

