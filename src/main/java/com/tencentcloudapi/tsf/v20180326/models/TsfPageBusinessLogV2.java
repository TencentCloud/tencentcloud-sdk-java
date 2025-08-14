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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TsfPageBusinessLogV2 extends AbstractModel {

    /**
    * 总条数
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 业务日志列表
    */
    @SerializedName("Content")
    @Expose
    private BusinessLogV2 [] Content;

    /**
    * 游标ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScrollId")
    @Expose
    private String ScrollId;

    /**
    * 查询状态，SUCCESS：查询成功完成，ERROR_RANGE_EXCEED：查询范围过大异常，ERROR_COMPLEX_CONDITION：查询条件复杂异常，ERROR_OTHER_CAUSE：其他异常
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 查询es时，使用searchAfter返回的游标
    */
    @SerializedName("SearchAfter")
    @Expose
    private String [] SearchAfter;

    /**
     * Get 总条数 
     * @return TotalCount 总条数
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 总条数
     * @param TotalCount 总条数
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 业务日志列表 
     * @return Content 业务日志列表
     */
    public BusinessLogV2 [] getContent() {
        return this.Content;
    }

    /**
     * Set 业务日志列表
     * @param Content 业务日志列表
     */
    public void setContent(BusinessLogV2 [] Content) {
        this.Content = Content;
    }

    /**
     * Get 游标ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScrollId 游标ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getScrollId() {
        return this.ScrollId;
    }

    /**
     * Set 游标ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScrollId 游标ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScrollId(String ScrollId) {
        this.ScrollId = ScrollId;
    }

    /**
     * Get 查询状态，SUCCESS：查询成功完成，ERROR_RANGE_EXCEED：查询范围过大异常，ERROR_COMPLEX_CONDITION：查询条件复杂异常，ERROR_OTHER_CAUSE：其他异常
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 查询状态，SUCCESS：查询成功完成，ERROR_RANGE_EXCEED：查询范围过大异常，ERROR_COMPLEX_CONDITION：查询条件复杂异常，ERROR_OTHER_CAUSE：其他异常
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 查询状态，SUCCESS：查询成功完成，ERROR_RANGE_EXCEED：查询范围过大异常，ERROR_COMPLEX_CONDITION：查询条件复杂异常，ERROR_OTHER_CAUSE：其他异常
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 查询状态，SUCCESS：查询成功完成，ERROR_RANGE_EXCEED：查询范围过大异常，ERROR_COMPLEX_CONDITION：查询条件复杂异常，ERROR_OTHER_CAUSE：其他异常
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 查询es时，使用searchAfter返回的游标 
     * @return SearchAfter 查询es时，使用searchAfter返回的游标
     */
    public String [] getSearchAfter() {
        return this.SearchAfter;
    }

    /**
     * Set 查询es时，使用searchAfter返回的游标
     * @param SearchAfter 查询es时，使用searchAfter返回的游标
     */
    public void setSearchAfter(String [] SearchAfter) {
        this.SearchAfter = SearchAfter;
    }

    public TsfPageBusinessLogV2() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TsfPageBusinessLogV2(TsfPageBusinessLogV2 source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.Content != null) {
            this.Content = new BusinessLogV2[source.Content.length];
            for (int i = 0; i < source.Content.length; i++) {
                this.Content[i] = new BusinessLogV2(source.Content[i]);
            }
        }
        if (source.ScrollId != null) {
            this.ScrollId = new String(source.ScrollId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.SearchAfter != null) {
            this.SearchAfter = new String[source.SearchAfter.length];
            for (int i = 0; i < source.SearchAfter.length; i++) {
                this.SearchAfter[i] = new String(source.SearchAfter[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "Content.", this.Content);
        this.setParamSimple(map, prefix + "ScrollId", this.ScrollId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArraySimple(map, prefix + "SearchAfter.", this.SearchAfter);

    }
}

