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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTablesRequest extends AbstractModel {

    /**
    * 分页条件
    */
    @SerializedName("MgoLimit")
    @Expose
    private Long MgoLimit;

    /**
    * 实例ID
    */
    @SerializedName("Tag")
    @Expose
    private String Tag;

    /**
    * 分页条件
    */
    @SerializedName("MgoOffset")
    @Expose
    private Long MgoOffset;

    /**
    * 环境id
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

    /**
    * MongoConnector
    */
    @SerializedName("MongoConnector")
    @Expose
    private MongoConnector MongoConnector;

    /**
     * Get 分页条件 
     * @return MgoLimit 分页条件
     */
    public Long getMgoLimit() {
        return this.MgoLimit;
    }

    /**
     * Set 分页条件
     * @param MgoLimit 分页条件
     */
    public void setMgoLimit(Long MgoLimit) {
        this.MgoLimit = MgoLimit;
    }

    /**
     * Get 实例ID 
     * @return Tag 实例ID
     */
    public String getTag() {
        return this.Tag;
    }

    /**
     * Set 实例ID
     * @param Tag 实例ID
     */
    public void setTag(String Tag) {
        this.Tag = Tag;
    }

    /**
     * Get 分页条件 
     * @return MgoOffset 分页条件
     */
    public Long getMgoOffset() {
        return this.MgoOffset;
    }

    /**
     * Set 分页条件
     * @param MgoOffset 分页条件
     */
    public void setMgoOffset(Long MgoOffset) {
        this.MgoOffset = MgoOffset;
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
     * Get MongoConnector 
     * @return MongoConnector MongoConnector
     */
    public MongoConnector getMongoConnector() {
        return this.MongoConnector;
    }

    /**
     * Set MongoConnector
     * @param MongoConnector MongoConnector
     */
    public void setMongoConnector(MongoConnector MongoConnector) {
        this.MongoConnector = MongoConnector;
    }

    public DescribeTablesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTablesRequest(DescribeTablesRequest source) {
        if (source.MgoLimit != null) {
            this.MgoLimit = new Long(source.MgoLimit);
        }
        if (source.Tag != null) {
            this.Tag = new String(source.Tag);
        }
        if (source.MgoOffset != null) {
            this.MgoOffset = new Long(source.MgoOffset);
        }
        if (source.EnvId != null) {
            this.EnvId = new String(source.EnvId);
        }
        if (source.MongoConnector != null) {
            this.MongoConnector = new MongoConnector(source.MongoConnector);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MgoLimit", this.MgoLimit);
        this.setParamSimple(map, prefix + "Tag", this.Tag);
        this.setParamSimple(map, prefix + "MgoOffset", this.MgoOffset);
        this.setParamSimple(map, prefix + "EnvId", this.EnvId);
        this.setParamObj(map, prefix + "MongoConnector.", this.MongoConnector);

    }
}

