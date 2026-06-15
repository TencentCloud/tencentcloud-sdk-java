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
    * <p>总条数</p>
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * <p>业务日志列表</p>
    */
    @SerializedName("Content")
    @Expose
    private BusinessLogV2 [] Content;

    /**
    * <p>游标ID</p>
    */
    @SerializedName("ScrollId")
    @Expose
    private String ScrollId;

    /**
    * <p>查询状态，SUCCESS：查询成功完成，ERROR_RANGE_EXCEED：查询范围过大异常，ERROR_COMPLEX_CONDITION：查询条件复杂异常，ERROR_OTHER_CAUSE：其他异常</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>查询es时，使用searchAfter返回的游标</p>
    */
    @SerializedName("SearchAfter")
    @Expose
    private String [] SearchAfter;

    /**
    * <p>是否压缩</p>
    */
    @SerializedName("Compressed")
    @Expose
    private Boolean Compressed;

    /**
     * Get <p>总条数</p> 
     * @return TotalCount <p>总条数</p>
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set <p>总条数</p>
     * @param TotalCount <p>总条数</p>
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get <p>业务日志列表</p> 
     * @return Content <p>业务日志列表</p>
     */
    public BusinessLogV2 [] getContent() {
        return this.Content;
    }

    /**
     * Set <p>业务日志列表</p>
     * @param Content <p>业务日志列表</p>
     */
    public void setContent(BusinessLogV2 [] Content) {
        this.Content = Content;
    }

    /**
     * Get <p>游标ID</p> 
     * @return ScrollId <p>游标ID</p>
     */
    public String getScrollId() {
        return this.ScrollId;
    }

    /**
     * Set <p>游标ID</p>
     * @param ScrollId <p>游标ID</p>
     */
    public void setScrollId(String ScrollId) {
        this.ScrollId = ScrollId;
    }

    /**
     * Get <p>查询状态，SUCCESS：查询成功完成，ERROR_RANGE_EXCEED：查询范围过大异常，ERROR_COMPLEX_CONDITION：查询条件复杂异常，ERROR_OTHER_CAUSE：其他异常</p> 
     * @return Status <p>查询状态，SUCCESS：查询成功完成，ERROR_RANGE_EXCEED：查询范围过大异常，ERROR_COMPLEX_CONDITION：查询条件复杂异常，ERROR_OTHER_CAUSE：其他异常</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>查询状态，SUCCESS：查询成功完成，ERROR_RANGE_EXCEED：查询范围过大异常，ERROR_COMPLEX_CONDITION：查询条件复杂异常，ERROR_OTHER_CAUSE：其他异常</p>
     * @param Status <p>查询状态，SUCCESS：查询成功完成，ERROR_RANGE_EXCEED：查询范围过大异常，ERROR_COMPLEX_CONDITION：查询条件复杂异常，ERROR_OTHER_CAUSE：其他异常</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>查询es时，使用searchAfter返回的游标</p> 
     * @return SearchAfter <p>查询es时，使用searchAfter返回的游标</p>
     */
    public String [] getSearchAfter() {
        return this.SearchAfter;
    }

    /**
     * Set <p>查询es时，使用searchAfter返回的游标</p>
     * @param SearchAfter <p>查询es时，使用searchAfter返回的游标</p>
     */
    public void setSearchAfter(String [] SearchAfter) {
        this.SearchAfter = SearchAfter;
    }

    /**
     * Get <p>是否压缩</p> 
     * @return Compressed <p>是否压缩</p>
     */
    public Boolean getCompressed() {
        return this.Compressed;
    }

    /**
     * Set <p>是否压缩</p>
     * @param Compressed <p>是否压缩</p>
     */
    public void setCompressed(Boolean Compressed) {
        this.Compressed = Compressed;
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
        if (source.Compressed != null) {
            this.Compressed = new Boolean(source.Compressed);
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
        this.setParamSimple(map, prefix + "Compressed", this.Compressed);

    }
}

