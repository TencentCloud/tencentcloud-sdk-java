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
package com.tencentcloudapi.essbasic.v20210526.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTemplatesRequest extends AbstractModel{

    /**
    * 渠道应用相关信息
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
    * 操作者的信息
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
    * 模板唯一标识
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
    * 查询内容：0-模版列表及详情（默认），1-仅模版列表
    */
    @SerializedName("ContentType")
    @Expose
    private Long ContentType;

    /**
    * 查询个数，默认20，最大100
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 查询偏移位置，默认0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get 渠道应用相关信息 
     * @return Agent 渠道应用相关信息
     */
    public Agent getAgent() {
        return this.Agent;
    }

    /**
     * Set 渠道应用相关信息
     * @param Agent 渠道应用相关信息
     */
    public void setAgent(Agent Agent) {
        this.Agent = Agent;
    }

    /**
     * Get 操作者的信息 
     * @return Operator 操作者的信息
     */
    public UserInfo getOperator() {
        return this.Operator;
    }

    /**
     * Set 操作者的信息
     * @param Operator 操作者的信息
     */
    public void setOperator(UserInfo Operator) {
        this.Operator = Operator;
    }

    /**
     * Get 模板唯一标识 
     * @return TemplateId 模板唯一标识
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set 模板唯一标识
     * @param TemplateId 模板唯一标识
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get 查询内容：0-模版列表及详情（默认），1-仅模版列表 
     * @return ContentType 查询内容：0-模版列表及详情（默认），1-仅模版列表
     */
    public Long getContentType() {
        return this.ContentType;
    }

    /**
     * Set 查询内容：0-模版列表及详情（默认），1-仅模版列表
     * @param ContentType 查询内容：0-模版列表及详情（默认），1-仅模版列表
     */
    public void setContentType(Long ContentType) {
        this.ContentType = ContentType;
    }

    /**
     * Get 查询个数，默认20，最大100 
     * @return Limit 查询个数，默认20，最大100
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 查询个数，默认20，最大100
     * @param Limit 查询个数，默认20，最大100
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 查询偏移位置，默认0 
     * @return Offset 查询偏移位置，默认0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 查询偏移位置，默认0
     * @param Offset 查询偏移位置，默认0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public DescribeTemplatesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTemplatesRequest(DescribeTemplatesRequest source) {
        if (source.Agent != null) {
            this.Agent = new Agent(source.Agent);
        }
        if (source.Operator != null) {
            this.Operator = new UserInfo(source.Operator);
        }
        if (source.TemplateId != null) {
            this.TemplateId = new String(source.TemplateId);
        }
        if (source.ContentType != null) {
            this.ContentType = new Long(source.ContentType);
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
        this.setParamObj(map, prefix + "Agent.", this.Agent);
        this.setParamObj(map, prefix + "Operator.", this.Operator);
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "ContentType", this.ContentType);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

