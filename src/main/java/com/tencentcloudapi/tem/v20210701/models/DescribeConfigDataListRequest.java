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
package com.tencentcloudapi.tem.v20210701.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeConfigDataListRequest extends AbstractModel{

    /**
    * 环境 ID
    */
    @SerializedName("EnvironmentId")
    @Expose
    private String EnvironmentId;

    /**
    * 来源渠道
    */
    @SerializedName("SourceChannel")
    @Expose
    private Long SourceChannel;

    /**
    * 查询游标
    */
    @SerializedName("ContinueToken")
    @Expose
    private String ContinueToken;

    /**
    * 分页 limit
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 环境 ID 
     * @return EnvironmentId 环境 ID
     */
    public String getEnvironmentId() {
        return this.EnvironmentId;
    }

    /**
     * Set 环境 ID
     * @param EnvironmentId 环境 ID
     */
    public void setEnvironmentId(String EnvironmentId) {
        this.EnvironmentId = EnvironmentId;
    }

    /**
     * Get 来源渠道 
     * @return SourceChannel 来源渠道
     */
    public Long getSourceChannel() {
        return this.SourceChannel;
    }

    /**
     * Set 来源渠道
     * @param SourceChannel 来源渠道
     */
    public void setSourceChannel(Long SourceChannel) {
        this.SourceChannel = SourceChannel;
    }

    /**
     * Get 查询游标 
     * @return ContinueToken 查询游标
     */
    public String getContinueToken() {
        return this.ContinueToken;
    }

    /**
     * Set 查询游标
     * @param ContinueToken 查询游标
     */
    public void setContinueToken(String ContinueToken) {
        this.ContinueToken = ContinueToken;
    }

    /**
     * Get 分页 limit 
     * @return Limit 分页 limit
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页 limit
     * @param Limit 分页 limit
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeConfigDataListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeConfigDataListRequest(DescribeConfigDataListRequest source) {
        if (source.EnvironmentId != null) {
            this.EnvironmentId = new String(source.EnvironmentId);
        }
        if (source.SourceChannel != null) {
            this.SourceChannel = new Long(source.SourceChannel);
        }
        if (source.ContinueToken != null) {
            this.ContinueToken = new String(source.ContinueToken);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvironmentId", this.EnvironmentId);
        this.setParamSimple(map, prefix + "SourceChannel", this.SourceChannel);
        this.setParamSimple(map, prefix + "ContinueToken", this.ContinueToken);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

