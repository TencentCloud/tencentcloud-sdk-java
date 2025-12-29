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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SortOrder extends AbstractModel {

    /**
    * sort的数据表列名称
    */
    @SerializedName("Column")
    @Expose
    private String Column;

    /**
    * 按照升序或者降序进行排序
    */
    @SerializedName("SortDirection")
    @Expose
    private String SortDirection;

    /**
    * null值放在开头或者末尾
    */
    @SerializedName("NullOrder")
    @Expose
    private String NullOrder;

    /**
     * Get sort的数据表列名称 
     * @return Column sort的数据表列名称
     */
    public String getColumn() {
        return this.Column;
    }

    /**
     * Set sort的数据表列名称
     * @param Column sort的数据表列名称
     */
    public void setColumn(String Column) {
        this.Column = Column;
    }

    /**
     * Get 按照升序或者降序进行排序 
     * @return SortDirection 按照升序或者降序进行排序
     */
    public String getSortDirection() {
        return this.SortDirection;
    }

    /**
     * Set 按照升序或者降序进行排序
     * @param SortDirection 按照升序或者降序进行排序
     */
    public void setSortDirection(String SortDirection) {
        this.SortDirection = SortDirection;
    }

    /**
     * Get null值放在开头或者末尾 
     * @return NullOrder null值放在开头或者末尾
     */
    public String getNullOrder() {
        return this.NullOrder;
    }

    /**
     * Set null值放在开头或者末尾
     * @param NullOrder null值放在开头或者末尾
     */
    public void setNullOrder(String NullOrder) {
        this.NullOrder = NullOrder;
    }

    public SortOrder() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SortOrder(SortOrder source) {
        if (source.Column != null) {
            this.Column = new String(source.Column);
        }
        if (source.SortDirection != null) {
            this.SortDirection = new String(source.SortDirection);
        }
        if (source.NullOrder != null) {
            this.NullOrder = new String(source.NullOrder);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Column", this.Column);
        this.setParamSimple(map, prefix + "SortDirection", this.SortDirection);
        this.setParamSimple(map, prefix + "NullOrder", this.NullOrder);

    }
}

