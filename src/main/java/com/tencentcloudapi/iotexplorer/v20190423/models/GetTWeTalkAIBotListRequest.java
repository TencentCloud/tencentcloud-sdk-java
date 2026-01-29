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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetTWeTalkAIBotListRequest extends AbstractModel {

    /**
    * 智能体ID
    */
    @SerializedName("BotId")
    @Expose
    private String BotId;

    /**
    * 智能体名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 产品ID
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 是否脱敏
    */
    @SerializedName("IncludeCredentials")
    @Expose
    private Boolean IncludeCredentials;

    /**
    * 1
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 10
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 智能体ID 
     * @return BotId 智能体ID
     */
    public String getBotId() {
        return this.BotId;
    }

    /**
     * Set 智能体ID
     * @param BotId 智能体ID
     */
    public void setBotId(String BotId) {
        this.BotId = BotId;
    }

    /**
     * Get 智能体名称 
     * @return Name 智能体名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 智能体名称
     * @param Name 智能体名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 产品ID 
     * @return ProductId 产品ID
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * Set 产品ID
     * @param ProductId 产品ID
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get 实例ID 
     * @return InstanceId 实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID
     * @param InstanceId 实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 是否脱敏 
     * @return IncludeCredentials 是否脱敏
     */
    public Boolean getIncludeCredentials() {
        return this.IncludeCredentials;
    }

    /**
     * Set 是否脱敏
     * @param IncludeCredentials 是否脱敏
     */
    public void setIncludeCredentials(Boolean IncludeCredentials) {
        this.IncludeCredentials = IncludeCredentials;
    }

    /**
     * Get 1 
     * @return Offset 1
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 1
     * @param Offset 1
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 10 
     * @return Limit 10
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 10
     * @param Limit 10
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public GetTWeTalkAIBotListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetTWeTalkAIBotListRequest(GetTWeTalkAIBotListRequest source) {
        if (source.BotId != null) {
            this.BotId = new String(source.BotId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ProductId != null) {
            this.ProductId = new String(source.ProductId);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.IncludeCredentials != null) {
            this.IncludeCredentials = new Boolean(source.IncludeCredentials);
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
        this.setParamSimple(map, prefix + "BotId", this.BotId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "IncludeCredentials", this.IncludeCredentials);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

