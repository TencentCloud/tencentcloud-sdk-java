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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSCFNamespaceListRequest extends AbstractModel {

    /**
    * 云函数所在地域
参数格式：腾讯云标准 Region，如 ap-guangzhou / ap-shanghai
    */
    @SerializedName("SCFRegion")
    @Expose
    private String SCFRegion;

    /**
    * 单页条数
取值范围：[1, 100]
默认值：20
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 分页偏移量
取值范围：[0, +∞)
默认值：0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get 云函数所在地域
参数格式：腾讯云标准 Region，如 ap-guangzhou / ap-shanghai 
     * @return SCFRegion 云函数所在地域
参数格式：腾讯云标准 Region，如 ap-guangzhou / ap-shanghai
     */
    public String getSCFRegion() {
        return this.SCFRegion;
    }

    /**
     * Set 云函数所在地域
参数格式：腾讯云标准 Region，如 ap-guangzhou / ap-shanghai
     * @param SCFRegion 云函数所在地域
参数格式：腾讯云标准 Region，如 ap-guangzhou / ap-shanghai
     */
    public void setSCFRegion(String SCFRegion) {
        this.SCFRegion = SCFRegion;
    }

    /**
     * Get 单页条数
取值范围：[1, 100]
默认值：20 
     * @return Limit 单页条数
取值范围：[1, 100]
默认值：20
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 单页条数
取值范围：[1, 100]
默认值：20
     * @param Limit 单页条数
取值范围：[1, 100]
默认值：20
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 分页偏移量
取值范围：[0, +∞)
默认值：0 
     * @return Offset 分页偏移量
取值范围：[0, +∞)
默认值：0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页偏移量
取值范围：[0, +∞)
默认值：0
     * @param Offset 分页偏移量
取值范围：[0, +∞)
默认值：0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public DescribeSCFNamespaceListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSCFNamespaceListRequest(DescribeSCFNamespaceListRequest source) {
        if (source.SCFRegion != null) {
            this.SCFRegion = new String(source.SCFRegion);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SCFRegion", this.SCFRegion);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

