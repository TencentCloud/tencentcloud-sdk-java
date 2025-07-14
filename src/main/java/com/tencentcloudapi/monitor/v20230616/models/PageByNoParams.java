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
package com.tencentcloudapi.monitor.v20230616.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PageByNoParams extends AbstractModel {

    /**
    * 每个分页的数量是多少
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PerPage")
    @Expose
    private Long PerPage;

    /**
    * 第几个分页，从1开始
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PageNo")
    @Expose
    private String PageNo;

    /**
     * Get 每个分页的数量是多少
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PerPage 每个分页的数量是多少
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPerPage() {
        return this.PerPage;
    }

    /**
     * Set 每个分页的数量是多少
注意：此字段可能返回 null，表示取不到有效值。
     * @param PerPage 每个分页的数量是多少
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPerPage(Long PerPage) {
        this.PerPage = PerPage;
    }

    /**
     * Get 第几个分页，从1开始
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PageNo 第几个分页，从1开始
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPageNo() {
        return this.PageNo;
    }

    /**
     * Set 第几个分页，从1开始
注意：此字段可能返回 null，表示取不到有效值。
     * @param PageNo 第几个分页，从1开始
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPageNo(String PageNo) {
        this.PageNo = PageNo;
    }

    public PageByNoParams() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PageByNoParams(PageByNoParams source) {
        if (source.PerPage != null) {
            this.PerPage = new Long(source.PerPage);
        }
        if (source.PageNo != null) {
            this.PageNo = new String(source.PageNo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PerPage", this.PerPage);
        this.setParamSimple(map, prefix + "PageNo", this.PageNo);

    }
}

