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
package com.tencentcloudapi.iss.v20230517.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListVLTemplatesRequest extends AbstractModel {

    /**
    * <p>模板名称，精确匹配</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>分析模式过滤，image / video</p>
    */
    @SerializedName("AnalysisMode")
    @Expose
    private String AnalysisMode;

    /**
    * <p>截图类型过滤（仅 AnalysisMode=image 时生效）：realtime / low</p>
    */
    @SerializedName("CaptureType")
    @Expose
    private String CaptureType;

    /**
    * <p>页码，默认 1</p>
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * <p>每页数量，默认 20，最大 200</p>
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
     * Get <p>模板名称，精确匹配</p> 
     * @return Name <p>模板名称，精确匹配</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>模板名称，精确匹配</p>
     * @param Name <p>模板名称，精确匹配</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>分析模式过滤，image / video</p> 
     * @return AnalysisMode <p>分析模式过滤，image / video</p>
     */
    public String getAnalysisMode() {
        return this.AnalysisMode;
    }

    /**
     * Set <p>分析模式过滤，image / video</p>
     * @param AnalysisMode <p>分析模式过滤，image / video</p>
     */
    public void setAnalysisMode(String AnalysisMode) {
        this.AnalysisMode = AnalysisMode;
    }

    /**
     * Get <p>截图类型过滤（仅 AnalysisMode=image 时生效）：realtime / low</p> 
     * @return CaptureType <p>截图类型过滤（仅 AnalysisMode=image 时生效）：realtime / low</p>
     */
    public String getCaptureType() {
        return this.CaptureType;
    }

    /**
     * Set <p>截图类型过滤（仅 AnalysisMode=image 时生效）：realtime / low</p>
     * @param CaptureType <p>截图类型过滤（仅 AnalysisMode=image 时生效）：realtime / low</p>
     */
    public void setCaptureType(String CaptureType) {
        this.CaptureType = CaptureType;
    }

    /**
     * Get <p>页码，默认 1</p> 
     * @return PageNumber <p>页码，默认 1</p>
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set <p>页码，默认 1</p>
     * @param PageNumber <p>页码，默认 1</p>
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get <p>每页数量，默认 20，最大 200</p> 
     * @return PageSize <p>每页数量，默认 20，最大 200</p>
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set <p>每页数量，默认 20，最大 200</p>
     * @param PageSize <p>每页数量，默认 20，最大 200</p>
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    public ListVLTemplatesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListVLTemplatesRequest(ListVLTemplatesRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.AnalysisMode != null) {
            this.AnalysisMode = new String(source.AnalysisMode);
        }
        if (source.CaptureType != null) {
            this.CaptureType = new String(source.CaptureType);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "AnalysisMode", this.AnalysisMode);
        this.setParamSimple(map, prefix + "CaptureType", this.CaptureType);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);

    }
}

