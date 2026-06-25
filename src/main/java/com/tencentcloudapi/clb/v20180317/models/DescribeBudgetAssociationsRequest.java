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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBudgetAssociationsRequest extends AbstractModel {

    /**
    * <p>Budget ID。</p><p>一次只允许查询一个Budget。</p>
    */
    @SerializedName("BudgetId")
    @Expose
    private String BudgetId;

    /**
    * <p>资源类型。</p><p>枚举值：</p><ul><li>ModelRouter：模型路由实例</li><li>Key：模型路由Key</li></ul><p>不传时返回全部资源类型。</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>本次查询偏移量</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>本次查询限制的数量</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get <p>Budget ID。</p><p>一次只允许查询一个Budget。</p> 
     * @return BudgetId <p>Budget ID。</p><p>一次只允许查询一个Budget。</p>
     */
    public String getBudgetId() {
        return this.BudgetId;
    }

    /**
     * Set <p>Budget ID。</p><p>一次只允许查询一个Budget。</p>
     * @param BudgetId <p>Budget ID。</p><p>一次只允许查询一个Budget。</p>
     */
    public void setBudgetId(String BudgetId) {
        this.BudgetId = BudgetId;
    }

    /**
     * Get <p>资源类型。</p><p>枚举值：</p><ul><li>ModelRouter：模型路由实例</li><li>Key：模型路由Key</li></ul><p>不传时返回全部资源类型。</p> 
     * @return Type <p>资源类型。</p><p>枚举值：</p><ul><li>ModelRouter：模型路由实例</li><li>Key：模型路由Key</li></ul><p>不传时返回全部资源类型。</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>资源类型。</p><p>枚举值：</p><ul><li>ModelRouter：模型路由实例</li><li>Key：模型路由Key</li></ul><p>不传时返回全部资源类型。</p>
     * @param Type <p>资源类型。</p><p>枚举值：</p><ul><li>ModelRouter：模型路由实例</li><li>Key：模型路由Key</li></ul><p>不传时返回全部资源类型。</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>本次查询偏移量</p> 
     * @return Offset <p>本次查询偏移量</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>本次查询偏移量</p>
     * @param Offset <p>本次查询偏移量</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>本次查询限制的数量</p> 
     * @return Limit <p>本次查询限制的数量</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>本次查询限制的数量</p>
     * @param Limit <p>本次查询限制的数量</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeBudgetAssociationsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBudgetAssociationsRequest(DescribeBudgetAssociationsRequest source) {
        if (source.BudgetId != null) {
            this.BudgetId = new String(source.BudgetId);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
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
        this.setParamSimple(map, prefix + "BudgetId", this.BudgetId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

