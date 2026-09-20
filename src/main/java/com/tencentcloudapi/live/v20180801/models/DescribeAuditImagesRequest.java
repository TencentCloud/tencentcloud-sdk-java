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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAuditImagesRequest extends AbstractModel {

    /**
    * <p>违规类型。<br>可取值：Normal: 正常 ，Polity: 政治，Porn: 色情，Sexy：性感，Ad: 广告，Illegal: 违法，Abuse: 谩骂，Terror: 暴恐，Spam: 灌水，Moan:呻吟。</p>
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
    * <p>查询页码。</p>
    */
    @SerializedName("PageIndex")
    @Expose
    private Long PageIndex;

    /**
    * <p>查询条目数。</p>
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
     * Get <p>违规类型。<br>可取值：Normal: 正常 ，Polity: 政治，Porn: 色情，Sexy：性感，Ad: 广告，Illegal: 违法，Abuse: 谩骂，Terror: 暴恐，Spam: 灌水，Moan:呻吟。</p> 
     * @return Label <p>违规类型。<br>可取值：Normal: 正常 ，Polity: 政治，Porn: 色情，Sexy：性感，Ad: 广告，Illegal: 违法，Abuse: 谩骂，Terror: 暴恐，Spam: 灌水，Moan:呻吟。</p>
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * Set <p>违规类型。<br>可取值：Normal: 正常 ，Polity: 政治，Porn: 色情，Sexy：性感，Ad: 广告，Illegal: 违法，Abuse: 谩骂，Terror: 暴恐，Spam: 灌水，Moan:呻吟。</p>
     * @param Label <p>违规类型。<br>可取值：Normal: 正常 ，Polity: 政治，Porn: 色情，Sexy：性感，Ad: 广告，Illegal: 违法，Abuse: 谩骂，Terror: 暴恐，Spam: 灌水，Moan:呻吟。</p>
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }

    /**
     * Get <p>查询页码。</p> 
     * @return PageIndex <p>查询页码。</p>
     */
    public Long getPageIndex() {
        return this.PageIndex;
    }

    /**
     * Set <p>查询页码。</p>
     * @param PageIndex <p>查询页码。</p>
     */
    public void setPageIndex(Long PageIndex) {
        this.PageIndex = PageIndex;
    }

    /**
     * Get <p>查询条目数。</p> 
     * @return PageSize <p>查询条目数。</p>
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set <p>查询条目数。</p>
     * @param PageSize <p>查询条目数。</p>
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    public DescribeAuditImagesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAuditImagesRequest(DescribeAuditImagesRequest source) {
        if (source.Label != null) {
            this.Label = new String(source.Label);
        }
        if (source.PageIndex != null) {
            this.PageIndex = new Long(source.PageIndex);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Label", this.Label);
        this.setParamSimple(map, prefix + "PageIndex", this.PageIndex);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);

    }
}

