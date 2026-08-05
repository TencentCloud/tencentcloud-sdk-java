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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeThrottleRulesRequest extends AbstractModel {

    /**
    * <p>实例Id</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>关键字</p>
    */
    @SerializedName("SearchWord")
    @Expose
    private String SearchWord;

    /**
    * <p>返回数量，不填则默认为20，最大值200</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>偏移数，默认为0</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>限流维度</p><p>枚举值：</p><ul><li>1： 实例维度限流</li><li>2： topic维度限流</li></ul><p>默认值：1</p>
    */
    @SerializedName("ThrottleDimension")
    @Expose
    private Long ThrottleDimension;

    /**
     * Get <p>实例Id</p> 
     * @return InstanceId <p>实例Id</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例Id</p>
     * @param InstanceId <p>实例Id</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>关键字</p> 
     * @return SearchWord <p>关键字</p>
     */
    public String getSearchWord() {
        return this.SearchWord;
    }

    /**
     * Set <p>关键字</p>
     * @param SearchWord <p>关键字</p>
     */
    public void setSearchWord(String SearchWord) {
        this.SearchWord = SearchWord;
    }

    /**
     * Get <p>返回数量，不填则默认为20，最大值200</p> 
     * @return Limit <p>返回数量，不填则默认为20，最大值200</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>返回数量，不填则默认为20，最大值200</p>
     * @param Limit <p>返回数量，不填则默认为20，最大值200</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>偏移数，默认为0</p> 
     * @return Offset <p>偏移数，默认为0</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>偏移数，默认为0</p>
     * @param Offset <p>偏移数，默认为0</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>限流维度</p><p>枚举值：</p><ul><li>1： 实例维度限流</li><li>2： topic维度限流</li></ul><p>默认值：1</p> 
     * @return ThrottleDimension <p>限流维度</p><p>枚举值：</p><ul><li>1： 实例维度限流</li><li>2： topic维度限流</li></ul><p>默认值：1</p>
     */
    public Long getThrottleDimension() {
        return this.ThrottleDimension;
    }

    /**
     * Set <p>限流维度</p><p>枚举值：</p><ul><li>1： 实例维度限流</li><li>2： topic维度限流</li></ul><p>默认值：1</p>
     * @param ThrottleDimension <p>限流维度</p><p>枚举值：</p><ul><li>1： 实例维度限流</li><li>2： topic维度限流</li></ul><p>默认值：1</p>
     */
    public void setThrottleDimension(Long ThrottleDimension) {
        this.ThrottleDimension = ThrottleDimension;
    }

    public DescribeThrottleRulesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeThrottleRulesRequest(DescribeThrottleRulesRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.SearchWord != null) {
            this.SearchWord = new String(source.SearchWord);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.ThrottleDimension != null) {
            this.ThrottleDimension = new Long(source.ThrottleDimension);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "SearchWord", this.SearchWord);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "ThrottleDimension", this.ThrottleDimension);

    }
}

