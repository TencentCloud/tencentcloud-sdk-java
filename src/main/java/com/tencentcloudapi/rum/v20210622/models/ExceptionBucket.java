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

public class ExceptionBucket extends AbstractModel {

    /**
    * <p>固定目录分类 key，与请求平台、CategoryKeys 或 EventTypes 派生目录一致。</p>
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * <p>精确事件行数，0至9007199254740991的整数，0必须保留。</p>
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * <p>是否为计入 TotalCount 的互斥主项。包含项为false，不重复计总。</p>
    */
    @SerializedName("IncludedInTotal")
    @Expose
    private Boolean IncludedInTotal;

    /**
    * <p>包含项所属主项的 Key；主项不返回该字段。</p>
    */
    @SerializedName("ParentKey")
    @Expose
    private String ParentKey;

    /**
     * Get <p>固定目录分类 key，与请求平台、CategoryKeys 或 EventTypes 派生目录一致。</p> 
     * @return Key <p>固定目录分类 key，与请求平台、CategoryKeys 或 EventTypes 派生目录一致。</p>
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set <p>固定目录分类 key，与请求平台、CategoryKeys 或 EventTypes 派生目录一致。</p>
     * @param Key <p>固定目录分类 key，与请求平台、CategoryKeys 或 EventTypes 派生目录一致。</p>
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get <p>精确事件行数，0至9007199254740991的整数，0必须保留。</p> 
     * @return Count <p>精确事件行数，0至9007199254740991的整数，0必须保留。</p>
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set <p>精确事件行数，0至9007199254740991的整数，0必须保留。</p>
     * @param Count <p>精确事件行数，0至9007199254740991的整数，0必须保留。</p>
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get <p>是否为计入 TotalCount 的互斥主项。包含项为false，不重复计总。</p> 
     * @return IncludedInTotal <p>是否为计入 TotalCount 的互斥主项。包含项为false，不重复计总。</p>
     */
    public Boolean getIncludedInTotal() {
        return this.IncludedInTotal;
    }

    /**
     * Set <p>是否为计入 TotalCount 的互斥主项。包含项为false，不重复计总。</p>
     * @param IncludedInTotal <p>是否为计入 TotalCount 的互斥主项。包含项为false，不重复计总。</p>
     */
    public void setIncludedInTotal(Boolean IncludedInTotal) {
        this.IncludedInTotal = IncludedInTotal;
    }

    /**
     * Get <p>包含项所属主项的 Key；主项不返回该字段。</p> 
     * @return ParentKey <p>包含项所属主项的 Key；主项不返回该字段。</p>
     */
    public String getParentKey() {
        return this.ParentKey;
    }

    /**
     * Set <p>包含项所属主项的 Key；主项不返回该字段。</p>
     * @param ParentKey <p>包含项所属主项的 Key；主项不返回该字段。</p>
     */
    public void setParentKey(String ParentKey) {
        this.ParentKey = ParentKey;
    }

    public ExceptionBucket() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExceptionBucket(ExceptionBucket source) {
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.IncludedInTotal != null) {
            this.IncludedInTotal = new Boolean(source.IncludedInTotal);
        }
        if (source.ParentKey != null) {
            this.ParentKey = new String(source.ParentKey);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "IncludedInTotal", this.IncludedInTotal);
        this.setParamSimple(map, prefix + "ParentKey", this.ParentKey);

    }
}

