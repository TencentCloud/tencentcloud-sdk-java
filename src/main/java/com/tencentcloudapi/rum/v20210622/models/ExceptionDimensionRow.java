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
package com.tencentcloudapi.rum.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExceptionDimensionRow extends AbstractModel {

    /**
    * <p>由目录域、维度或TagKey及归一化值确定的稳定、不透明唯一标识。</p>
    */
    @SerializedName("RowKey")
    @Expose
    private String RowKey;

    /**
    * <p>维度显示值；标签保留原始值，普通province/platform/network_type按既有显示别名归一化。</p>
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * <p>本行全部 IncludedInTotal=true 主项的 Count 之和，安全非负整数。</p>
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * <p>完整固定分类向量，含0计数及适用包含项；不按数量裁剪。</p>
    */
    @SerializedName("Items")
    @Expose
    private ExceptionBucket [] Items;

    /**
     * Get <p>由目录域、维度或TagKey及归一化值确定的稳定、不透明唯一标识。</p> 
     * @return RowKey <p>由目录域、维度或TagKey及归一化值确定的稳定、不透明唯一标识。</p>
     */
    public String getRowKey() {
        return this.RowKey;
    }

    /**
     * Set <p>由目录域、维度或TagKey及归一化值确定的稳定、不透明唯一标识。</p>
     * @param RowKey <p>由目录域、维度或TagKey及归一化值确定的稳定、不透明唯一标识。</p>
     */
    public void setRowKey(String RowKey) {
        this.RowKey = RowKey;
    }

    /**
     * Get <p>维度显示值；标签保留原始值，普通province/platform/network_type按既有显示别名归一化。</p> 
     * @return Value <p>维度显示值；标签保留原始值，普通province/platform/network_type按既有显示别名归一化。</p>
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set <p>维度显示值；标签保留原始值，普通province/platform/network_type按既有显示别名归一化。</p>
     * @param Value <p>维度显示值；标签保留原始值，普通province/platform/network_type按既有显示别名归一化。</p>
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get <p>本行全部 IncludedInTotal=true 主项的 Count 之和，安全非负整数。</p> 
     * @return TotalCount <p>本行全部 IncludedInTotal=true 主项的 Count 之和，安全非负整数。</p>
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set <p>本行全部 IncludedInTotal=true 主项的 Count 之和，安全非负整数。</p>
     * @param TotalCount <p>本行全部 IncludedInTotal=true 主项的 Count 之和，安全非负整数。</p>
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get <p>完整固定分类向量，含0计数及适用包含项；不按数量裁剪。</p> 
     * @return Items <p>完整固定分类向量，含0计数及适用包含项；不按数量裁剪。</p>
     */
    public ExceptionBucket [] getItems() {
        return this.Items;
    }

    /**
     * Set <p>完整固定分类向量，含0计数及适用包含项；不按数量裁剪。</p>
     * @param Items <p>完整固定分类向量，含0计数及适用包含项；不按数量裁剪。</p>
     */
    public void setItems(ExceptionBucket [] Items) {
        this.Items = Items;
    }

    public ExceptionDimensionRow() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExceptionDimensionRow(ExceptionDimensionRow source) {
        if (source.RowKey != null) {
            this.RowKey = new String(source.RowKey);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.Items != null) {
            this.Items = new ExceptionBucket[source.Items.length];
            for (int i = 0; i < source.Items.length; i++) {
                this.Items[i] = new ExceptionBucket(source.Items[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RowKey", this.RowKey);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "Items.", this.Items);

    }
}

